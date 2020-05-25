package com.p683ss.avframework.livestreamv2.core;

import android.view.View;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.p683ss.avframework.utils.AVLog;
import com.p683ss.avframework.utils.AVLog.ILogFilter;
import com.p683ss.video.rtc.interact.audio.AudioClientFactory;
import com.p683ss.video.rtc.interact.audio.AudioSinkFactory;
import com.p683ss.video.rtc.interact.callback.QualityCallback;
import com.p683ss.video.rtc.interact.callback.StateCallback;
import com.p683ss.video.rtc.interact.callback.StreamCallback;
import com.p683ss.video.rtc.interact.callback.UserCallback;
import com.p683ss.video.rtc.interact.engine.Engine;
import com.p683ss.video.rtc.interact.model.Config.Vendor;
import com.p683ss.video.rtc.interact.utils.loader.LibraryLoaderHelper;
import com.p683ss.video.rtc.interact.utils.loader.LibraryLoaderHelper.LibraryLoader;
import com.p683ss.video.rtc.interact.utils.log.IInteractLogger;
import com.p683ss.video.rtc.interact.utils.log.IInteractLogger.LogLevel;
import com.p683ss.video.rtc.interact.utils.log.LogUtil;
import com.p683ss.video.rtc.interact.video.VideoClientFactory;
import com.p683ss.video.rtc.interact.video.VideoSinkFactory;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.core.Client */
public abstract class Client implements QualityCallback, StateCallback, StreamCallback, UserCallback {
    public static String TAG = "com.ss.avframework.livestreamv2.core.Client";
    private static EngineDestroyer sEngineDestroyer = new EngineDestroyer();
    protected AudioClientFactory mAudioClientFactory;
    protected AudioSinkFactory mAudioSinkFactory;
    public InteractConfig mConfig;
    private Listener mDummyListener;
    private final InteractEngine mEngine;
    private InteractEventListener mEventListener;
    protected Listener mListener;
    protected VideoClientFactory mVideoClientFactory;
    protected VideoSinkFactory mVideoSinkFactory;

    /* renamed from: com.ss.avframework.livestreamv2.core.Client$4 */
    static /* synthetic */ class C509814 {

        /* renamed from: $SwitchMap$com$ss$video$rtc$interact$utils$log$IInteractLogger$LogLevel */
        static final /* synthetic */ int[] f127771xf3cf42c9 = new int[LogLevel.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.ss.video.rtc.interact.utils.log.IInteractLogger$LogLevel[] r0 = com.p683ss.video.rtc.interact.utils.log.IInteractLogger.LogLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f127771xf3cf42c9 = r0
                int[] r0 = f127771xf3cf42c9     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.ss.video.rtc.interact.utils.log.IInteractLogger$LogLevel r1 = com.p683ss.video.rtc.interact.utils.log.IInteractLogger.LogLevel.debug     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f127771xf3cf42c9     // Catch:{ NoSuchFieldError -> 0x001f }
                com.ss.video.rtc.interact.utils.log.IInteractLogger$LogLevel r1 = com.p683ss.video.rtc.interact.utils.log.IInteractLogger.LogLevel.info     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f127771xf3cf42c9     // Catch:{ NoSuchFieldError -> 0x002a }
                com.ss.video.rtc.interact.utils.log.IInteractLogger$LogLevel r1 = com.p683ss.video.rtc.interact.utils.log.IInteractLogger.LogLevel.warning     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f127771xf3cf42c9     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.ss.video.rtc.interact.utils.log.IInteractLogger$LogLevel r1 = com.p683ss.video.rtc.interact.utils.log.IInteractLogger.LogLevel.error     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f127771xf3cf42c9     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.ss.video.rtc.interact.utils.log.IInteractLogger$LogLevel r1 = com.p683ss.video.rtc.interact.utils.log.IInteractLogger.LogLevel.verbose     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.avframework.livestreamv2.core.Client.C509814.<clinit>():void");
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.Client$EngineDestroyer */
    public static class EngineDestroyer implements IEngineDestroyer {
        private Map<Vendor, Set<Client>> mEngineRefCount = new HashMap();
        private boolean mManuallyDestroy = false;
        private boolean mNeedAutoDestroy = true;

        public synchronized boolean isManuallyDestroy() {
            return this.mManuallyDestroy;
        }

        public synchronized void finalize() {
            this.mNeedAutoDestroy = true;
            destroyAuto();
        }

        private void doDestroyRtcEngine() {
            Iterator it = this.mEngineRefCount.keySet().iterator();
            while (it.hasNext()) {
                Vendor vendor = (Vendor) it.next();
                if (((Set) this.mEngineRefCount.get(vendor)).isEmpty()) {
                    if (vendor == Vendor.BYTE) {
                        Engine.releaseRtcEngineResource(vendor);
                    }
                    it.remove();
                }
            }
        }

        public synchronized void destroyManually() {
            String str = Client.TAG;
            StringBuilder sb = new StringBuilder("destroy RtcEngine manually: mManuallyDestroy ");
            sb.append(this.mManuallyDestroy);
            AVLog.ioi(str, sb.toString());
            if (this.mManuallyDestroy) {
                doDestroyRtcEngine();
                this.mNeedAutoDestroy = !this.mEngineRefCount.isEmpty();
            }
        }

        public synchronized void destroyAuto() {
            String str = Client.TAG;
            StringBuilder sb = new StringBuilder("destroy RtcEngine automatically: mManuallyDestroy ");
            sb.append(this.mManuallyDestroy);
            sb.append(", mNeedAutoDestroy ");
            sb.append(this.mNeedAutoDestroy);
            AVLog.ioi(str, sb.toString());
            for (Vendor vendor : this.mEngineRefCount.keySet()) {
                Set set = (Set) this.mEngineRefCount.get(vendor);
                set.isEmpty();
                set.clear();
            }
            if (!this.mManuallyDestroy || this.mNeedAutoDestroy) {
                doDestroyRtcEngine();
                if (this.mManuallyDestroy) {
                    this.mNeedAutoDestroy = false;
                }
            }
        }

        public synchronized void setManuallyDestroy(boolean z) {
            this.mManuallyDestroy = z;
        }

        /* access modifiers changed from: 0000 */
        public synchronized void decreaseEngineRef(Vendor vendor, Client client) {
            String str = Client.TAG;
            StringBuilder sb = new StringBuilder("decrease engine ref: ");
            sb.append(vendor.name());
            AVLog.ioi(str, sb.toString());
            if (this.mEngineRefCount.containsKey(vendor)) {
                ((Set) this.mEngineRefCount.get(vendor)).remove(client);
            }
        }

        /* access modifiers changed from: 0000 */
        public synchronized void increaseEngineRef(Vendor vendor, Client client) {
            String str = Client.TAG;
            StringBuilder sb = new StringBuilder("increase engine ref: ");
            sb.append(vendor.name());
            AVLog.ioi(str, sb.toString());
            if (this.mEngineRefCount.containsKey(vendor)) {
                ((Set) this.mEngineRefCount.get(vendor)).add(client);
                return;
            }
            HashSet hashSet = new HashSet();
            hashSet.add(client);
            this.mEngineRefCount.put(vendor, hashSet);
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.Client$IEngineDestroyer */
    public interface IEngineDestroyer {
        void destroyManually();

        boolean isManuallyDestroy();

        void setManuallyDestroy(boolean z);
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.Client$InteractEventListener */
    protected interface InteractEventListener {
        void onIneractInfoReport(Client client, int i, long j, Object... objArr);

        void onInteractStart(Client client);

        void onInteractStop(Client client);
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.Client$Listener */
    public interface Listener {
        void onError(Client client, int i, long j, Exception exc);

        void onInfo(Client client, int i, long j, Object... objArr);
    }

    public static IEngineDestroyer getEngineDestroyer() {
        return sEngineDestroyer;
    }

    public void adjustPlaybackSignalVolume(int i) {
    }

    public void adjustRecordingSignalVolume(int i) {
    }

    public void enableAudioVolumeIndication(int i) {
    }

    public void enableLocalAudio(boolean z) {
    }

    public final InteractConfig getConfig() {
        return this.mConfig;
    }

    public Listener getListener() {
        return this.mListener;
    }

    public abstract boolean isGuest();

    public void muteAllRemoteAudioStreams(boolean z) {
    }

    public void muteRemoteAudioStream(String str, boolean z) {
    }

    public void pause() {
    }

    public void resume() {
    }

    public void switchAudio(boolean z) {
    }

    public void onConnectionInterrupted() {
        this.mListener.onInfo(this, 12, 0, new Object[0]);
    }

    public void onConnectionLost() {
        this.mListener.onInfo(this, 13, 0, new Object[0]);
    }

    public void onEndSuccess() {
        this.mListener.onInfo(this, 5, 0, new Object[0]);
    }

    public void onStreamPublishSucceed() {
        this.mListener.onInfo(this, 23, 0, new Object[0]);
    }

    public void start() {
        String str = TAG;
        StringBuilder sb = new StringBuilder("start ");
        sb.append(this);
        AVLog.ioi(str, sb.toString());
        InteractEventListener interactEventListener = this.mEventListener;
        if (interactEventListener != null) {
            interactEventListener.onInteractStart(this);
        }
    }

    public synchronized void stop() {
        String str = TAG;
        StringBuilder sb = new StringBuilder("stop ");
        sb.append(this);
        AVLog.ioi(str, sb.toString());
        InteractEventListener interactEventListener = this.mEventListener;
        if (interactEventListener != null) {
            interactEventListener.onInteractStop(this);
        }
    }

    public synchronized void dispose() {
        String str = TAG;
        StringBuilder sb = new StringBuilder("dispose ");
        sb.append(this);
        AVLog.ioi(str, sb.toString());
        String str2 = TAG;
        StringBuilder sb2 = new StringBuilder("~Dtor interact client ");
        sb2.append(this);
        AVLog.m110007d(str2, sb2.toString());
        this.mEventListener = null;
        sEngineDestroyer.decreaseEngineRef(this.mConfig.getVendor(), this);
    }

    private void setLogger(IInteractLogger iInteractLogger) {
        LogUtil.setLogger(iInteractLogger);
    }

    /* access modifiers changed from: protected */
    public void setInteractEventListener(InteractEventListener interactEventListener) {
        this.mEventListener = interactEventListener;
    }

    public void setLibraryLoader(LibraryLoader libraryLoader) {
        LibraryLoaderHelper.setLibraryLoader(libraryLoader);
    }

    public void onStreamDelay(int i) {
        this.mListener.onInfo(this, 1, (long) i, new Object[0]);
    }

    public void setListener(Listener listener) {
        if (listener != null) {
            this.mListener = listener;
        } else {
            this.mListener = this.mDummyListener;
        }
    }

    public void onFirstLocalAudioFrame(int i) {
        this.mListener.onInfo(this, 22, 0, Integer.valueOf(i));
    }

    public void onPublishStreamRetrySuccess(String str) {
        this.mListener.onInfo(this, BaseNotice.HASHTAG, 0, str);
    }

    public void onPublishStreamTempDisconnect(String str) {
        this.mListener.onInfo(this, 103, 0, str);
    }

    public void onPullStreamRetrySuccess(String str) {
        this.mListener.onInfo(this, 102, 0, str);
    }

    public void onPullStreamTempDisconnect(String str) {
        this.mListener.onInfo(this, 104, 0, str);
    }

    public void onReconnected(int i) {
        this.mListener.onInfo(this, 14, 0, Integer.valueOf(i));
    }

    public void onStartSuccess(int i) {
        this.mListener.onInfo(this, 4, 0, Integer.valueOf(i));
    }

    public void onError(String str) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder("onError ");
        sb.append(str);
        AVLog.ioe(str2, sb.toString());
        this.mListener.onError(this, -3, 0, new Exception(str));
    }

    public void onWarn(String str) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder("onWarn ");
        sb.append(str);
        AVLog.iow(str2, sb.toString());
        this.mListener.onInfo(this, 6, 0, str);
    }

    public void onLogMonitor(String str, JSONObject jSONObject) {
        this.mListener.onInfo(this, 3, 0, str, jSONObject);
    }

    public void onPushStreamQuality(long j, long j2) {
        this.mListener.onInfo(this, 2, j, Long.valueOf(j2));
    }

    public void onTalkStateUpdated(String[] strArr, boolean[] zArr) {
        this.mListener.onInfo(this, 9, 0, strArr, zArr);
    }

    public void onUserEnableAudio(String str, boolean z) {
        this.mListener.onInfo(this, 18, 0, str, Boolean.valueOf(z));
    }

    public void onUserEnableLocalAudio(String str, boolean z) {
        this.mListener.onInfo(this, 19, 0, str, Boolean.valueOf(z));
    }

    public void onUserEnableLocalVideo(String str, boolean z) {
        this.mListener.onInfo(this, 17, 0, str, Boolean.valueOf(z));
    }

    public void onUserEnableVideo(String str, boolean z) {
        this.mListener.onInfo(this, 16, 0, str, Boolean.valueOf(z));
    }

    public void onUserMuteAudio(String str, boolean z) {
        this.mListener.onInfo(this, 20, 0, str, Boolean.valueOf(z));
    }

    public void onEndFailed(int i, String str) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder("onEndFailed code ");
        sb.append(i);
        sb.append(" msg: ");
        sb.append(str);
        AVLog.ioe(str2, sb.toString());
        this.mListener.onError(this, -2, (long) i, new Exception(str));
    }

    public void onFirstRemoteAudioFrame(String str, int i) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder("onFirstRemoteAudioFrame ");
        sb.append(str);
        AVLog.ioi(str2, sb.toString());
        this.mListener.onInfo(this, 10, 0, str, InteractEngine.AUDIO_LAYER_NAME, Integer.valueOf(i));
    }

    public void onStartFailed(int i, String str) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder("onStartFailed code ");
        sb.append(i);
        sb.append(" msg: ");
        sb.append(str);
        AVLog.ioe(str2, sb.toString());
        this.mListener.onError(this, -1, (long) i, new Exception(str));
    }

    public void onUserJoined(String str, int i) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder("onUserJoined ");
        sb.append(str);
        AVLog.ioi(str2, sb.toString());
        this.mListener.onInfo(this, 7, 0, str, Integer.valueOf(i));
    }

    public void onUserLeaved(String str, int i) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder("onUserLeaved ");
        sb.append(str);
        AVLog.ioi(str2, sb.toString());
        this.mListener.onInfo(this, 8, 0, str, Integer.valueOf(i));
    }

    public void onAudioVolumeIndication(String[] strArr, int[] iArr, int i) {
        if (strArr != null && iArr != null) {
            this.mListener.onInfo(this, 21, 0, strArr, iArr, Integer.valueOf(i));
        }
    }

    public void onNetworkQuality(String str, int i, int i2) {
        InteractEventListener interactEventListener = this.mEventListener;
        if (interactEventListener != null) {
            interactEventListener.onIneractInfoReport(this, 15, 0, str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        this.mListener.onInfo(this, 15, 0, str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public void onFirstRemoteVideoFrame(String str, View view, int i) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder("onFirstRemoteVideoFrame ");
        sb.append(str);
        AVLog.ioi(str2, sb.toString());
        if (this.mEngine.getBuilder().isSingleViewMode() && view != null) {
            AVLog.iow(TAG, "XS mode only support Single View mode.");
            view = null;
        }
        this.mListener.onInfo(this, 11, 0, str, view, str, Integer.valueOf(this.mEngine.queryRtcId(str)), Integer.valueOf(i));
    }

    public Client(InteractConfig interactConfig, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, VideoSinkFactory videoSinkFactory, AudioSinkFactory audioSinkFactory, InteractEngine interactEngine) {
        String str = TAG;
        StringBuilder sb = new StringBuilder("Ctor interact client ");
        sb.append(this);
        AVLog.m110007d(str, sb.toString());
        this.mEngine = interactEngine;
        this.mConfig = interactConfig;
        sEngineDestroyer.increaseEngineRef(interactConfig.getVendor(), this);
        this.mVideoClientFactory = videoClientFactory;
        this.mAudioClientFactory = audioClientFactory;
        this.mVideoSinkFactory = videoSinkFactory;
        this.mAudioSinkFactory = audioSinkFactory;
        C509781 r4 = new Listener() {
            public void onError(Client client, int i, long j, Exception exc) {
            }

            public void onInfo(Client client, int i, long j, Object... objArr) {
            }
        };
        this.mDummyListener = r4;
        this.mListener = r4;
        LibraryLoaderHelper.setLibraryLoader(new LibraryLoader() {
            public void loadLibrary(String str) throws Exception {
                com.p683ss.avframework.utils.LibraryLoader.loadLibrary(str);
            }

            public void loadLibraryFromPath(String str) throws Exception {
                com.p683ss.avframework.utils.LibraryLoader.loadLibraryFromPath(str);
            }
        });
        LogUtil.setLogger(new IInteractLogger() {
            public void onLogMessage(LogLevel logLevel, String str, String str2) {
                switch (C509814.f127771xf3cf42c9[logLevel.ordinal()]) {
                    case 1:
                        AVLog.m110007d(str, str2);
                        return;
                    case 2:
                        AVLog.m110009i(str, str2);
                        return;
                    case 3:
                        AVLog.m110011w(str, str2);
                        return;
                    case 4:
                        AVLog.m110008e(str, str2);
                        return;
                    default:
                        AVLog.m110009i(str, str2);
                        return;
                }
            }

            public void onLocalLogMessage(LogLevel logLevel, String str, String str2, Throwable th) {
                ILogFilter logIODevice = AVLog.getLogIODevice();
                if (logIODevice != null) {
                    switch (C509814.f127771xf3cf42c9[logLevel.ordinal()]) {
                        case 1:
                            logIODevice.print(3, str, str2, th);
                            return;
                        case 2:
                            logIODevice.print(4, str, str2, th);
                            return;
                        case 3:
                            logIODevice.print(5, str, str2, th);
                            return;
                        case 4:
                            logIODevice.print(6, str, str2, th);
                            break;
                        case 5:
                            logIODevice.print(2, str, str2, th);
                            return;
                    }
                }
            }
        });
    }
}
