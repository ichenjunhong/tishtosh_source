package com.p683ss.avframework.livestreamv2.core.interact;

import android.opengl.EGLContext;
import android.os.Handler;
import android.text.TextUtils;
import com.p683ss.avframework.livestreamv2.IInputAudioStream;
import com.p683ss.avframework.livestreamv2.IInputVideoStream;
import com.p683ss.avframework.livestreamv2.ILiveStream.IAudioFrameAvailableListener;
import com.p683ss.avframework.livestreamv2.ILiveStream.ITextureFrameAvailableListener;
import com.p683ss.avframework.livestreamv2.core.Client;
import com.p683ss.avframework.livestreamv2.core.InteractEngine;
import com.p683ss.avframework.livestreamv2.core.InteractEngine.SEIListener;
import com.p683ss.avframework.livestreamv2.core.LiveCore;
import com.p683ss.avframework.livestreamv2.core.LiveCore.Builder;
import com.p683ss.avframework.livestreamv2.core.LiveCore.ILiveCoreTextureFrameAvailableListener;
import com.p683ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.p683ss.avframework.livestreamv2.utils.UrlUtils;
import com.p683ss.avframework.mixer.AudioMixer.AudioMixerDescription;
import com.p683ss.avframework.mixer.VideoMixer.VideoMixerDescription;
import com.p683ss.avframework.opengl.GLThreadManager;
import com.p683ss.avframework.utils.AVLog;
import com.p683ss.video.rtc.interact.model.Config.AudioProfile;
import com.p683ss.video.rtc.interact.model.Config.MixStreamConfig;
import com.p683ss.video.rtc.interact.model.Config.VideoCodec;
import com.p683ss.video.rtc.interact.model.Config.VideoProfile;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.InteractEngineImpl */
class InteractEngineImpl extends ClientFactory implements InteractEngine, SEIListener {
    private static AtomicInteger mAtomicInteger = new AtomicInteger(0);
    protected InteractAudioClientFactory mAudioClientFactory;
    private List<IAudioFrameAvailableListener> mAudioFrameListeners = new ArrayList();
    private final Object mAudioFrameListenersFence = new Object();
    protected InteractAudioSinkFactory mAudioSinkFactory;
    public boolean mEnableGameMode;
    private InteractEngineBuilder mEngineBuilder;
    private IInputAudioStream mGameInputAudioStream;
    private IInputVideoStream mGameInputVideoStream;
    public boolean mGamePublishLeftRightWindow;
    private boolean mIsInteracting;
    private VideoMixerDescription mOriginVideoDescription;
    private Map<String, Integer> mRtcMaps;
    private SEIListener mSEIProcessor;
    private List<ITextureFrameAvailableListener> mTextureFrameListeners = new ArrayList();
    private final Object mTextureFrameListenersFence = new Object();
    protected InteractVideoClientFactory mVideoClientFactory;
    protected InteractVideoSinkFactory mVideoSinkFactory;
    private Handler mWorkThreadHandler;

    public InteractEngineBuilder getBuilder() {
        return this.mEngineBuilder;
    }

    public boolean isInteracting() {
        return this.mIsInteracting;
    }

    public void pause() {
        super.pause();
    }

    public void resume() {
        super.resume();
    }

    private boolean isAudioCaptureStarted() {
        return this.mEngineBuilder.isStatusLiveStreamIsAudioCaptured();
    }

    private boolean isPushStreamStarted() {
        return this.mEngineBuilder.isStatusLiveStreamIsPushed();
    }

    public void dispose() {
        super.dispose();
        if (this.mAudioClientFactory != null) {
            this.mAudioClientFactory = null;
        }
        if (this.mVideoClientFactory != null) {
            this.mVideoClientFactory = null;
        }
        if (this.mAudioSinkFactory != null) {
            this.mAudioSinkFactory.release();
            this.mAudioSinkFactory = null;
        }
        if (this.mVideoSinkFactory != null) {
            this.mVideoSinkFactory = null;
        }
        enableGameMode(false, false);
        if (this.mGameInputVideoStream != null) {
            this.mGameInputVideoStream.release();
            this.mGameInputVideoStream = null;
        }
        if (this.mGameInputAudioStream != null) {
            this.mGameInputAudioStream.release();
            this.mGameInputAudioStream = null;
        }
        this.mSEIProcessor = null;
    }

    public void setSEIProcessor(SEIListener sEIListener) {
        this.mSEIProcessor = sEIListener;
    }

    public void addAudioFrameAvailableListener(IAudioFrameAvailableListener iAudioFrameAvailableListener) {
        synchronized (this.mAudioFrameListenersFence) {
            if (iAudioFrameAvailableListener != null) {
                try {
                    if (!this.mAudioFrameListeners.contains(iAudioFrameAvailableListener)) {
                        this.mAudioFrameListeners.add(iAudioFrameAvailableListener);
                    }
                } finally {
                }
            }
        }
    }

    public void addTextureFrameAvailableListener(ILiveCoreTextureFrameAvailableListener iLiveCoreTextureFrameAvailableListener) {
        synchronized (this.mTextureFrameListenersFence) {
            if (iLiveCoreTextureFrameAvailableListener != null) {
                try {
                    if (!this.mTextureFrameListeners.contains(iLiveCoreTextureFrameAvailableListener)) {
                        this.mTextureFrameListeners.add(iLiveCoreTextureFrameAvailableListener);
                    }
                } finally {
                }
            }
        }
    }

    public void removeAudioFrameAvailableListener(IAudioFrameAvailableListener iAudioFrameAvailableListener) {
        synchronized (this.mAudioFrameListenersFence) {
            if (iAudioFrameAvailableListener != null) {
                try {
                    this.mAudioFrameListeners.remove(iAudioFrameAvailableListener);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void removeTextureFrameAvailableListener(ILiveCoreTextureFrameAvailableListener iLiveCoreTextureFrameAvailableListener) {
        synchronized (this.mTextureFrameListenersFence) {
            if (iLiveCoreTextureFrameAvailableListener != null) {
                try {
                    this.mTextureFrameListeners.remove(iLiveCoreTextureFrameAvailableListener);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public InteractEngineImpl(InteractEngineBuilder interactEngineBuilder) {
        super(interactEngineBuilder);
        this.mEngineBuilder = interactEngineBuilder;
        this.mVideoClientFactory = new InteractVideoClientFactory(this);
        this.mAudioClientFactory = new InteractAudioClientFactory(this);
        this.mVideoSinkFactory = new InteractVideoSinkFactory(this, this);
        this.mAudioSinkFactory = new InteractAudioSinkFactory(interactEngineBuilder, this);
        this.mWorkThreadHandler = interactEngineBuilder.getWorkThreadHandler();
        this.mRtcMaps = new HashMap();
        interactEngineBuilder.getLiveCore().addTextureFrameAvailableListener(this);
        interactEngineBuilder.getLiveCore().addAudioFrameAvailableListener(this);
    }

    public int queryRtcId(String str) {
        synchronized (this.mRtcMaps) {
            for (Entry entry : this.mRtcMaps.entrySet()) {
                if (((String) entry.getKey()).equals(str)) {
                    int intValue = ((Integer) entry.getValue()).intValue();
                    return intValue;
                }
            }
            int incrementAndGet = mAtomicInteger.incrementAndGet();
            this.mRtcMaps.put(str, Integer.valueOf(incrementAndGet));
            return incrementAndGet;
        }
    }

    /* access modifiers changed from: protected */
    public void start(Client client) {
        super.start(client);
        this.mIsInteracting = true;
        this.mWorkThreadHandler.post(new Runnable() {
            public void run() {
                if (InteractEngineImpl.this.mEnableGameMode) {
                    InteractEngineImpl.this.enableGameModeOnWorkThread(true, InteractEngineImpl.this.mGamePublishLeftRightWindow);
                }
            }
        });
        LiveCore liveCore = this.mEngineBuilder.getLiveCore();
        if (this.mEngineBuilder.isClientMixer() || liveCore == null) {
            if (this.mEngineBuilder.isClientMixer() && liveCore != null) {
                StringBuilder sb = new StringBuilder("client interact start using mode 7 switch audio capture to ");
                sb.append(liveCore.getBuilder().getAudioCaptureDevice());
                AVLog.iod("InteractEngineImpl", sb.toString());
                liveCore.switchAudioMode(7);
            }
            return;
        }
        if (!this.mEngineBuilder.isUsingLiveCoreCapture()) {
            liveCore.stopInternalAudioCapture();
        } else {
            StringBuilder sb2 = new StringBuilder("Server interact start with using external audio capture using mode 7 switch audio capture to ");
            sb2.append(liveCore.getBuilder().getAudioCaptureDevice());
            AVLog.iod("InteractEngineImpl", sb2.toString());
            liveCore.switchAudioMode(7);
        }
        liveCore.stopInternal();
    }

    /* access modifiers changed from: protected */
    public void stop(Client client) {
        super.stop(client);
        this.mIsInteracting = false;
        this.mWorkThreadHandler.post(new Runnable() {
            public void run() {
                if (InteractEngineImpl.this.mEnableGameMode) {
                    InteractEngineImpl.this.enableGameModeOnWorkThread(true, InteractEngineImpl.this.mGamePublishLeftRightWindow);
                }
            }
        });
        LiveCore liveCore = this.mEngineBuilder.getLiveCore();
        if (!this.mEngineBuilder.isClientMixer() && liveCore != null) {
            if (isAudioCaptureStarted()) {
                if (!this.mEngineBuilder.isUsingLiveCoreCapture()) {
                    liveCore.startInternalAudioCapture();
                } else {
                    StringBuilder sb = new StringBuilder("server interact stop with external audio capture using mode 1 switch audio capture to ");
                    sb.append(this.mEngineBuilder.getLiveCoreBuilder().getAudioCaptureDevice());
                    AVLog.iod("InteractEngineImpl", sb.toString());
                    liveCore.switchAudioMode(1);
                }
            }
            if (!client.isGuest() && isPushStreamStarted()) {
                List urls = liveCore.getUrls();
                if (urls != null && !urls.isEmpty()) {
                    liveCore.startInternal(liveCore.getUrls());
                }
            }
        } else if (this.mEngineBuilder.isClientMixer() && liveCore != null) {
            StringBuilder sb2 = new StringBuilder("client interact stop using mode 1 switch audio capture to ");
            sb2.append(this.mEngineBuilder.getLiveCoreBuilder().getAudioCaptureDevice());
            AVLog.iod("InteractEngineImpl", sb2.toString());
            liveCore.switchAudioMode(1);
        }
    }

    public void needSaveSei(String str, Object obj) {
        InteractVideoClientFactory interactVideoClientFactory = this.mVideoClientFactory;
        if (interactVideoClientFactory != null) {
            interactVideoClientFactory.needSaveSei(str, obj);
        }
    }

    public void enableGameMode(final boolean z, final boolean z2) {
        this.mWorkThreadHandler.post(new Runnable() {
            public void run() {
                InteractEngineImpl.this.enableGameModeOnWorkThread(z, z2);
            }
        });
    }

    private VideoProfile getVideoProfile(int i, int i2) {
        if (i == 2) {
            return VideoProfile.MAIN;
        }
        switch (i2) {
            case 2:
                return VideoProfile.MAIN;
            case 3:
                return VideoProfile.HIGH;
            default:
                return VideoProfile.BASELINE;
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkMixerConfig(InteractConfig interactConfig, boolean z) {
        if (interactConfig.getStreamMixer() != null || interactConfig.isClientMixStream()) {
            return true;
        }
        AVLog.m110008e("InteractEngineImpl", "mixer parameter is null");
        return false;
    }

    public Client create(InteractConfig interactConfig, boolean z) {
        if (!checkInteractCfg(interactConfig, z)) {
            AVLog.m110008e("InteractEngineImpl", "Parameter invalid.");
            return null;
        }
        Client create = super.create(interactConfig, z);
        this.mEngineBuilder.setUsingTextureView(this.mIsTextureViewOnInteract);
        return create;
    }

    public void enableGameModeOnWorkThread(boolean z, boolean z2) {
        LiveCore liveCore = this.mEngineBuilder.getLiveCore();
        if (liveCore != null) {
            if (z) {
                liveCore.removeTextureFrameAvailableListener(this);
                enableGamePublish(liveCore, z2);
            } else {
                liveCore.addTextureFrameAvailableListener(this);
                disableGamePublish(liveCore, z2);
            }
            this.mEnableGameMode = z;
            this.mGamePublishLeftRightWindow = z2;
        }
    }

    private void disableGamePublish(LiveCore liveCore, boolean z) {
        if (this.mGameInputVideoStream != null) {
            this.mGameInputVideoStream.setMixerDescription(this.mGameInputVideoStream.getMixerDescription().setVisibility(false));
            this.mGameInputVideoStream.stop();
            IInputVideoStream originInputVideoStream = liveCore.getOriginInputVideoStream();
            VideoMixerDescription videoMixerDescription = new VideoMixerDescription();
            videoMixerDescription.copy(this.mOriginVideoDescription);
            videoMixerDescription.setVisibility(true);
            originInputVideoStream.setMixerDescription(videoMixerDescription);
        }
    }

    /* JADX WARNING: type inference failed for: r12v1, types: [java.lang.Object, com.ss.avframework.livestreamv2.core.Client] */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.ss.avframework.livestreamv2.core.interact.AnchorInternal] */
    /* JADX WARNING: type inference failed for: r2v1, types: [com.ss.avframework.livestreamv2.core.interact.GuestInternal] */
    /* JADX WARNING: type inference failed for: r2v2, types: [com.ss.avframework.livestreamv2.core.interact.AnchorInternal] */
    /* JADX WARNING: type inference failed for: r2v3, types: [com.ss.avframework.livestreamv2.core.interact.GuestInternal] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v2, types: [com.ss.avframework.livestreamv2.core.interact.AnchorInternal]
      assigns: [com.ss.avframework.livestreamv2.core.interact.AnchorInternal, com.ss.avframework.livestreamv2.core.interact.GuestInternal]
      uses: [com.ss.avframework.livestreamv2.core.interact.AnchorInternal, java.lang.Object, com.ss.avframework.livestreamv2.core.Client, com.ss.avframework.livestreamv2.core.interact.GuestInternal]
      mth insns count: 49
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p683ss.avframework.livestreamv2.core.Client createClient(com.p683ss.avframework.livestreamv2.core.LiveCore.InteractConfig r11, boolean r12) {
        /*
            r10 = this;
            com.ss.avframework.livestreamv2.core.interact.InteractEngineBuilder r0 = r10.mEngineBuilder
            boolean r0 = r0.isUsingLiveCoreCapture()
            r1 = 0
            if (r0 == 0) goto L_0x0010
            com.ss.avframework.livestreamv2.core.interact.InteractAudioClientFactory r1 = r10.mAudioClientFactory
            com.ss.avframework.livestreamv2.core.interact.InteractAudioSinkFactory r0 = r10.mAudioSinkFactory
            r7 = r0
            r5 = r1
            goto L_0x0023
        L_0x0010:
            if (r12 != 0) goto L_0x0021
            com.ss.avframework.livestreamv2.core.interact.InteractEngineBuilder r0 = r10.mEngineBuilder
            boolean r0 = r0.isClientMixer()
            if (r0 == 0) goto L_0x0021
            com.ss.avframework.livestreamv2.core.interact.InteractAudioSinkFactory r1 = r10.mAudioSinkFactory
            com.ss.avframework.livestreamv2.core.interact.InteractAudioClientFactory r0 = r10.mAudioClientFactory
            r5 = r0
            r7 = r1
            goto L_0x0023
        L_0x0021:
            r5 = r1
            r7 = r5
        L_0x0023:
            if (r12 == 0) goto L_0x0033
            com.ss.avframework.livestreamv2.core.interact.GuestInternal r12 = new com.ss.avframework.livestreamv2.core.interact.GuestInternal
            com.ss.avframework.livestreamv2.core.interact.InteractVideoClientFactory r4 = r10.mVideoClientFactory
            com.ss.avframework.livestreamv2.core.interact.InteractVideoSinkFactory r6 = r10.mVideoSinkFactory
            r2 = r12
            r3 = r11
            r8 = r10
            r9 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0040
        L_0x0033:
            com.ss.avframework.livestreamv2.core.interact.AnchorInternal r12 = new com.ss.avframework.livestreamv2.core.interact.AnchorInternal
            com.ss.avframework.livestreamv2.core.interact.InteractVideoClientFactory r4 = r10.mVideoClientFactory
            com.ss.avframework.livestreamv2.core.interact.InteractVideoSinkFactory r6 = r10.mVideoSinkFactory
            r2 = r12
            r3 = r11
            r8 = r10
            r9 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
        L_0x0040:
            java.lang.String r11 = "InteractEngineImpl"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Create Interact Client "
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r1 = " with clientMix "
            r0.append(r1)
            com.ss.avframework.livestreamv2.core.interact.InteractEngineBuilder r1 = r10.mEngineBuilder
            boolean r1 = r1.isClientMixer()
            r0.append(r1)
            java.lang.String r1 = " and usingLiveCoreAudioCapture "
            r0.append(r1)
            com.ss.avframework.livestreamv2.core.interact.InteractEngineBuilder r1 = r10.mEngineBuilder
            boolean r1 = r1.isUsingLiveCoreCapture()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.p683ss.avframework.utils.AVLog.iod(r11, r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.avframework.livestreamv2.core.interact.InteractEngineImpl.createClient(com.ss.avframework.livestreamv2.core.LiveCore$InteractConfig, boolean):com.ss.avframework.livestreamv2.core.Client");
    }

    /* access modifiers changed from: protected */
    public void onUserJoin(Client client, String str) {
        super.onUserJoin(client, str);
        if (!this.mEnableMixer || !this.mEngineBuilder.isClientMixer()) {
            if (this.mEngineBuilder.isUsingLiveCoreCapture() && this.mEngineBuilder.getLiveCore().getADM() != null) {
                this.mEngineBuilder.getLiveCore().getADM().enableBuiltInAEC(true);
            }
            return;
        }
        this.mEngineBuilder.getLiveCore();
        if (this.mEngineBuilder.getLiveCore().getADM() != null) {
            this.mEngineBuilder.getLiveCore().getADM().enableBuiltInAEC(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onUserLeaved(Client client, String str) {
        super.onUserLeaved(client, str);
        if (!this.mInteractsId.isEmpty() || !this.mEngineBuilder.isClientMixer()) {
            if (this.mEngineBuilder.isUsingLiveCoreCapture() && this.mEngineBuilder.getLiveCore().getADM() != null) {
                this.mEngineBuilder.getLiveCore().getADM().enableBuiltInAEC(false);
            }
        } else if (this.mEngineBuilder.getLiveCore().getADM() != null) {
            this.mEngineBuilder.getLiveCore().getADM().enableBuiltInAEC(false);
        }
    }

    private void enableGamePublish(LiveCore liveCore, boolean z) {
        if (this.mGameInputVideoStream == null) {
            this.mGameInputVideoStream = liveCore.createInputVideoStream();
            this.mOriginVideoDescription = liveCore.getOriginInputVideoStream().getMixerDescription();
        }
        if (this.mGameInputAudioStream == null) {
            this.mGameInputAudioStream = liveCore.createInputAudioStream();
            AudioMixerDescription mixerDescription = this.mGameInputAudioStream.getMixerDescription();
            mixerDescription.volumeCoeff = 0.2f;
            this.mGameInputAudioStream.setMixerDescription(mixerDescription);
            this.mGameInputAudioStream.start();
        }
        IInputVideoStream originInputVideoStream = liveCore.getOriginInputVideoStream();
        VideoMixerDescription videoMixerDescription = new VideoMixerDescription();
        videoMixerDescription.copy(this.mOriginVideoDescription);
        if (!isInteracting()) {
            VideoMixerDescription FILL = VideoMixerDescription.FILL();
            videoMixerDescription.setzOrder(Integer.MAX_VALUE).setVisibility(true).setMode(2);
            this.mGameInputVideoStream.setMixerDescription(FILL);
            videoMixerDescription.setVisibility(false).setzOrder(1);
            originInputVideoStream.setMixerDescription(videoMixerDescription);
        } else if (this.mEngineBuilder.isClientMixer()) {
            if (z) {
                VideoMixerDescription videoMixerDescription2 = new VideoMixerDescription();
                videoMixerDescription2.copy(videoMixerDescription);
                videoMixerDescription2.setVisibility(true);
                videoMixerDescription2.setzOrder(Integer.MAX_VALUE);
                this.mGameInputVideoStream.setMixerDescription(videoMixerDescription2);
                videoMixerDescription2.setVisibility(false);
                originInputVideoStream.setMixerDescription(videoMixerDescription2);
            } else {
                VideoMixerDescription FILL2 = VideoMixerDescription.FILL();
                FILL2.setVisibility(true);
                FILL2.setzOrder(Integer.MAX_VALUE);
                this.mGameInputVideoStream.setMixerDescription(FILL2);
                videoMixerDescription.setVisibility(false);
                originInputVideoStream.setMixerDescription(videoMixerDescription);
            }
        }
        this.mGameInputVideoStream.start();
    }

    /* access modifiers changed from: protected */
    public boolean checkInteractCfg(InteractConfig interactConfig, boolean z) {
        VideoCodec videoCodec;
        AudioProfile audioProfile;
        MixStreamConfig mixStreamConfig;
        if (!z) {
            if (!checkMixerConfig(interactConfig, z)) {
                return false;
            }
            Builder liveCoreBuilder = this.mEngineBuilder.getLiveCoreBuilder();
            try {
                JSONObject jSONObject = liveCoreBuilder.getSdkParams().getJSONObject("PushBase");
                if (jSONObject.has("mixOnClient")) {
                    interactConfig.setClientMixStream(jSONObject.getBoolean("mixOnClient"));
                }
            } catch (Exception unused) {
            }
            MixStreamConfig videoBitrate = new MixStreamConfig().setVideoSize(liveCoreBuilder.getVideoWidth(), liveCoreBuilder.getVideoHeight()).setBackgroundColor(interactConfig.getBackgroundColor()).setVideoFrameRate(liveCoreBuilder.getVideoFps()).setVideoBitrate(liveCoreBuilder.getVideoBitrate() / 1000);
            if (liveCoreBuilder.getVideoEncoder() == 2) {
                videoCodec = VideoCodec.H265;
            } else {
                videoCodec = VideoCodec.H264;
            }
            MixStreamConfig audioChannels = videoBitrate.setVideoCodec(videoCodec).setVideoProfile(getVideoProfile(liveCoreBuilder.getVideoEncoder(), liveCoreBuilder.getVideoProfile())).setVideoGop(liveCoreBuilder.getVideoGopSec()).setAudioSampleRate(liveCoreBuilder.getAudioSampleHZ()).setAudioChannels(liveCoreBuilder.getAudioChannel());
            if (liveCoreBuilder.getAudioProfile() == 2) {
                audioProfile = AudioProfile.HE;
            } else {
                audioProfile = AudioProfile.LC;
            }
            MixStreamConfig audioBitrate = audioChannels.setAudioProfile(audioProfile).setAudioBitrate(liveCoreBuilder.getAudioBitrate() / 1000);
            if (!interactConfig.isClientMixStream()) {
                String originUrl = this.mEngineBuilder.getOriginUrl();
                if (!TextUtils.isEmpty(interactConfig.getMixStreamRtmpUrl())) {
                    originUrl = interactConfig.getMixStreamRtmpUrl();
                }
                String DecodeUrl = UrlUtils.DecodeUrl(originUrl);
                if (!TextUtils.isEmpty(DecodeUrl)) {
                    audioBitrate.setStreamUrl(DecodeUrl);
                    audioBitrate.setStreamUniqueIdentifier(this.mEngineBuilder.getUUID(), this.mEngineBuilder.getPushAtomic());
                } else {
                    AVLog.ioe("InteractEngineImpl", "Live stream url is null....");
                }
            } else {
                audioBitrate.setStreamUrl(this.mEngineBuilder.getStreamUrl());
            }
            interactConfig.setMixStreamConfig(audioBitrate);
            this.mEngineBuilder.setMixBackgroundColor(audioBitrate.getBackgroundColor());
            if (interactConfig.getRtcExtInfo() == null) {
                AVLog.iow("InteractEngineImpl", "Not found rtc external info");
            }
            if (interactConfig.getRtcExtInfo() != null) {
                MixStreamConfig mixStreamConfig2 = interactConfig.getMixStreamConfig();
                if (!(mixStreamConfig2 != null && mixStreamConfig2.getVideoHeight() == liveCoreBuilder.getVideoHeight() && mixStreamConfig2.getVideoWidth() == liveCoreBuilder.getVideoWidth())) {
                    mixStreamConfig2 = new MixStreamConfig();
                    mixStreamConfig2.setVideoSize(liveCoreBuilder.getVideoWidth(), liveCoreBuilder.getVideoHeight());
                    mixStreamConfig2.setBackgroundColor(interactConfig.getBackgroundColor());
                    interactConfig.setMixStreamConfig(mixStreamConfig2);
                }
                int videoBitrate2 = liveCoreBuilder.getVideoBitrate() / 1000;
                try {
                    JSONObject jSONObject2 = interactConfig.getRtcExtInfo().getJSONObject("rtc_mix_base");
                    mixStreamConfig = interactConfig.getMixStreamConfig();
                    if (jSONObject2 != null) {
                        try {
                            if (jSONObject2.has("bitrate")) {
                                videoBitrate2 = jSONObject2.getInt("bitrate") / 1000;
                            }
                        } catch (JSONException unused2) {
                        }
                    }
                } catch (JSONException unused3) {
                    mixStreamConfig = mixStreamConfig2;
                }
                mixStreamConfig.setVideoBitrate(videoBitrate2);
                interactConfig.setMixStreamConfig(mixStreamConfig);
                StringBuilder sb = new StringBuilder("Find rtc external info(");
                sb.append(interactConfig.getRtcExtInfo());
                sb.append(")");
                AVLog.ioi("InteractEngineImpl", sb.toString());
            }
        }
        if (interactConfig.isClientMixStream() && interactConfig.getEGLNativeAddr() == 0) {
            long nativeEGLContext = GLThreadManager.getNativeEGLContext();
            interactConfig.setEGLNativeAddr(nativeEGLContext);
            if (nativeEGLContext == 0) {
                throw new RuntimeException("Not found avalable shard egl context.");
            }
        }
        interactConfig.setSharedEGLContext14(GLThreadManager.getEGLContext());
        if (interactConfig.getHandler() == null) {
            interactConfig.setHandler(this.mWorkThreadHandler);
        }
        this.mEngineBuilder.setClientMixer(interactConfig.isClientMixStream());
        return true;
    }

    public void onAudioFrameAvailable(Buffer buffer, int i, int i2, int i3, long j) {
        ArrayList<IAudioFrameAvailableListener> arrayList;
        synchronized (this.mAudioFrameListenersFence) {
            arrayList = new ArrayList<>(this.mAudioFrameListeners);
        }
        for (IAudioFrameAvailableListener onAudioFrameAvailable : arrayList) {
            onAudioFrameAvailable.onAudioFrameAvailable(buffer, i, i2, i3, j);
        }
    }

    public void onBGMAudioFrameAvailable(Buffer buffer, int i, int i2, int i3, long j) {
        if (this.mEnableGameMode) {
            IInputAudioStream iInputAudioStream = this.mGameInputAudioStream;
            if ((!isInteracting() || this.mEngineBuilder.isClientMixer()) && iInputAudioStream != null) {
                iInputAudioStream.pushAudioFrame((ByteBuffer) buffer, i2, i3, 16, i * i3, j / 1000);
            }
        }
    }

    public void onTextureFrameAvailable(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr, ByteBuffer byteBuffer) {
        ArrayList<ITextureFrameAvailableListener> arrayList;
        synchronized (this.mTextureFrameListenersFence) {
            arrayList = new ArrayList<>(this.mTextureFrameListeners);
        }
        if (this.mEnableGameMode && (!isInteracting() || this.mEngineBuilder.isClientMixer())) {
            IInputVideoStream iInputVideoStream = this.mGameInputVideoStream;
            if (iInputVideoStream != null) {
                iInputVideoStream.pushVideoFrame(i, z, i2, i3, 0, fArr, j / 1000);
            }
        }
        for (ITextureFrameAvailableListener iTextureFrameAvailableListener : arrayList) {
            if (iTextureFrameAvailableListener instanceof ILiveCoreTextureFrameAvailableListener) {
                ((ILiveCoreTextureFrameAvailableListener) iTextureFrameAvailableListener).onTextureFrameAvailable(GLThreadManager.getEGLContext(), i, z, i2, i3, j, fArr, byteBuffer);
            }
        }
    }

    public void onTextureFrameAvailable(javax.microedition.khronos.egl.EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr, ByteBuffer byteBuffer) {
        ArrayList<ITextureFrameAvailableListener> arrayList;
        synchronized (this.mTextureFrameListenersFence) {
            arrayList = new ArrayList<>(this.mTextureFrameListeners);
        }
        if (this.mEnableGameMode && (!isInteracting() || this.mEngineBuilder.isClientMixer())) {
            IInputVideoStream iInputVideoStream = this.mGameInputVideoStream;
            if (iInputVideoStream != null) {
                iInputVideoStream.pushVideoFrame(i, z, i2, i3, 0, fArr, j / 1000);
            }
        }
        for (ITextureFrameAvailableListener iTextureFrameAvailableListener : arrayList) {
            if (iTextureFrameAvailableListener instanceof ILiveCoreTextureFrameAvailableListener) {
                ((ILiveCoreTextureFrameAvailableListener) iTextureFrameAvailableListener).onTextureFrameAvailable(GLThreadManager.getEGLContext(), i, z, i2, i3, j, fArr, byteBuffer);
            } else {
                iTextureFrameAvailableListener.onTextureFrameAvailable(eGLContext, i, z, i2, i3, j, fArr, byteBuffer);
            }
        }
    }

    public void onReceiveSEI(int i, String str, int i2, int i3, int i4, float[] fArr, int i5, long j, ByteBuffer byteBuffer) {
        SEIListener sEIListener = this.mSEIProcessor;
        if (sEIListener != null) {
            sEIListener.onReceiveSEI(i, str, i2, i3, i4, fArr, i5, j, byteBuffer);
        }
    }
}
