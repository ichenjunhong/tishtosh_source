package com.p683ss.avframework.livestreamv2.filter;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.view.OrientationEventListener;
import com.bytedance.android.p161c.C2835a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p723j.C11511a;
import com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a;
import com.p683ss.android.ugc.aweme.p2391v.C47964c;
import com.p683ss.avframework.buffer.TextureBufferImpl;
import com.p683ss.avframework.buffer.TextureBufferImpl.ToI420Interface;
import com.p683ss.avframework.buffer.VideoFrame;
import com.p683ss.avframework.buffer.VideoFrame.Buffer;
import com.p683ss.avframework.buffer.VideoFrame.I420Buffer;
import com.p683ss.avframework.buffer.VideoFrame.IExtraData;
import com.p683ss.avframework.buffer.VideoFrame.TextureBuffer;
import com.p683ss.avframework.buffer.VideoFrame.TextureBuffer.Type;
import com.p683ss.avframework.buffer.VideoFrame.stRoiInfo;
import com.p683ss.avframework.capture.audio.AudioCapturer;
import com.p683ss.avframework.effect.EffectWrapper;
import com.p683ss.avframework.effect.EffectWrapper.AlgorithmResult;
import com.p683ss.avframework.effect.IVideoEffectProcessor;
import com.p683ss.avframework.effect.IVideoEffectProcessor.EffectMsgListener;
import com.p683ss.avframework.effect.IVideoEffectProcessor.IEffectInfoChangeListener;
import com.p683ss.avframework.engine.AudioTrack;
import com.p683ss.avframework.engine.MediaEngineFactory;
import com.p683ss.avframework.engine.VideoProcessor;
import com.p683ss.avframework.livestreamv2.IInputAudioStream;
import com.p683ss.avframework.livestreamv2.ILiveStream.CatchVideoCallback;
import com.p683ss.avframework.livestreamv2.ILiveStream.IAudioFrameAvailableListener;
import com.p683ss.avframework.livestreamv2.filter.FilterVideoBufferPool.Recycle;
import com.p683ss.avframework.livestreamv2.filter.IFilterManager.ErrorListener;
import com.p683ss.avframework.livestreamv2.filter.IFilterManager.FaceDetectListener;
import com.p683ss.avframework.livestreamv2.filter.IFilterManager.MicrophoneDetectListener;
import com.p683ss.avframework.mixer.AudioMixer.AudioMixerDescription;
import com.p683ss.avframework.opengl.GLThread;
import com.p683ss.avframework.opengl.GlRenderDrawer;
import com.p683ss.avframework.opengl.GlUtil;
import com.p683ss.avframework.opengl.YuvConverter;
import com.p683ss.avframework.utils.AVLog;
import com.p683ss.avframework.utils.ThreadUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.filter.FilterManager */
public class FilterManager extends VideoProcessor implements ToI420Interface, IAudioFrameAvailableListener, IFilterManager {
    private boolean mAudioRecognizing;
    private EffectInputAudioStream mAudioStream;
    private InputAudioStreamObserver mAudioStreamObserver;
    public FilterVideoBufferPool mBufferPool;
    private int mBufferPoolMaxSize = 4;
    public CatchVideoCallback mCatchVideoCallback;
    public int mCatchVideoFrameCount;
    public int mCatchVideoFrameInterval;
    public IVideoEffectProcessor mEffect;
    private long mEffectAudioTimestampMs;
    public VideoCatcher mEffectFrameCatcher;
    private boolean mEnabled;
    public ErrorListener mErrorListener;
    private long mExtrDataFlags;
    private int mExtraDataGop;
    private boolean mForceOutput2DTex;
    public boolean mForceSticker;
    public GLThread mGLThread;
    public Handler mHandler;
    private long mLastCatchTimestamp;
    public EffectMsgListener mMsgListener;
    private int mNoExtraSendFrameCounts;
    public GlRenderDrawer mOffscreenDraw;
    public int mOrientation;
    private AlbumOrientationEventListener mOrientationListener;
    public VideoCatcher mOriginFrameCatcher;
    public Recycle mOut2DTexRecycle;
    private boolean mReleased;
    private boolean mRoiEnabled;
    private boolean mShouldCatch;
    public Recycle mTextureFrameBufferRecycle;
    public YuvConverter mYuvConverter;

    /* renamed from: com.ss.avframework.livestreamv2.filter.FilterManager$AlbumOrientationEventListener */
    class AlbumOrientationEventListener extends OrientationEventListener {
        public void onOrientationChanged(int i) {
            if (i != -1) {
                int i2 = (((i + 45) / 90) * 90) % 360;
                if (i2 != FilterManager.this.mOrientation) {
                    FilterManager.this.mOrientation = i2;
                }
            }
        }

        public AlbumOrientationEventListener(Context context) {
            super(context);
            if (canDetectOrientation()) {
                enable();
            } else {
                AVLog.m110008e("FilterManager", "Can't Detect Orientation");
            }
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.filter.FilterManager$EffectInputAudioStream */
    public class EffectInputAudioStream implements IInputAudioStream {
        private AudioCapturer mAudioCapturer;
        private AudioMixerDescription mAudioMixerDescription;
        private AudioTrack mAudioTrack;
        private int mChannel;
        private InputAudioStreamObserver mObserver;
        private int mSample;

        public AudioTrack getAudioTrack() {
            return this.mAudioTrack;
        }

        public int getChannel() {
            return this.mChannel;
        }

        public AudioMixerDescription getMixerDescription() {
            return this.mAudioMixerDescription;
        }

        public int getSample() {
            return this.mSample;
        }

        public int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
            return 0;
        }

        public String name() {
            if (this.mAudioTrack != null) {
                return this.mAudioTrack.mo99896id();
            }
            return "";
        }

        public int start() {
            if (this.mAudioCapturer != null) {
                this.mAudioCapturer.start();
                this.mAudioCapturer.resume();
            }
            return 0;
        }

        public int stop() {
            if (this.mAudioCapturer != null) {
                this.mAudioCapturer.stop();
            }
            return 0;
        }

        public void release() {
            stop();
            if (this.mObserver != null) {
                this.mObserver.onInputAudioStreamRelease(this);
            }
            this.mAudioCapturer = null;
            if (this.mAudioTrack != null) {
                this.mAudioTrack.release();
                this.mAudioTrack = null;
            }
        }

        public void setMixerDescription(AudioMixerDescription audioMixerDescription) {
            this.mAudioMixerDescription = audioMixerDescription;
        }

        public void mute(boolean z) {
            if (this.mAudioCapturer != null) {
                this.mAudioCapturer.mute(z);
            }
        }

        public EffectInputAudioStream(AudioCapturer audioCapturer, InputAudioStreamObserver inputAudioStreamObserver) {
            if (audioCapturer != null) {
                this.mAudioCapturer = audioCapturer;
                this.mObserver = inputAudioStreamObserver;
                this.mAudioMixerDescription = new AudioMixerDescription();
                if (this.mObserver != null) {
                    this.mObserver.onInputAudioStreamCreated(this);
                }
            }
        }

        public void setupAudioTrack(MediaEngineFactory mediaEngineFactory, int i, int i2) {
            if (this.mAudioCapturer != null) {
                this.mAudioTrack = mediaEngineFactory.createAudioTrack(this.mAudioCapturer);
                this.mSample = i;
                this.mChannel = i2;
                this.mAudioCapturer.setOutputFormat(i, i2, 16);
            }
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.filter.FilterManager$InputAudioStreamObserver */
    public interface InputAudioStreamObserver {
        void onInputAudioStreamCreated(EffectInputAudioStream effectInputAudioStream);

        void onInputAudioStreamRelease(EffectInputAudioStream effectInputAudioStream);
    }

    /* renamed from: com.ss.avframework.livestreamv2.filter.FilterManager$_lancet */
    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                if (C18973a.m46144a(str)) {
                    C2835a.m8098a(C11010c.m22280a(), String.valueOf(C11010c.m22286g()));
                    StringBuilder sb = new StringBuilder();
                    C47964c.m103778e();
                    sb.append(C47964c.m103775a());
                    sb.append("/lib");
                    sb.append(str);
                    sb.append(".so");
                    String sb2 = sb.toString();
                    if (new File(sb2).exists()) {
                        C18973a.m46142a(str, 2);
                        System.load(sb2);
                        C18973a.m46141a(uptimeMillis, str);
                        return;
                    }
                    C18973a.m46142a(str, 3);
                }
            } catch (Throwable unused) {
            }
            C11511a.m23578a(str);
            C18973a.m46141a(uptimeMillis, str);
        }
    }

    public boolean isEnable() {
        return this.mEnabled;
    }

    static {
        try {
            _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("effect");
        } catch (Throwable unused) {
        }
    }

    public static IFilterManager createDummy() {
        return new IFilterManager() {
            public final int composerAppendNodes(String[] strArr, int i) {
                return 0;
            }

            public final int composerAppendNodesWithTags(String[] strArr, int i, String[] strArr2) {
                return 0;
            }

            public final int composerReloadNodes(String[] strArr, int i) {
                return 0;
            }

            public final int composerReloadNodesWithTags(String[] strArr, int i, String[] strArr2) {
                return 0;
            }

            public final int composerRemoveNodes(String[] strArr, int i) {
                return 0;
            }

            public final int composerReplaceNodesWithTags(String[] strArr, int i, String[] strArr2, int i2, String[] strArr3) {
                return 0;
            }

            public final int composerSetMode(int i, int i2) {
                return 0;
            }

            public final int composerSetNodes(String[] strArr, int i) {
                return 0;
            }

            public final int composerSetNodesWithTags(String[] strArr, int i, String[] strArr2) {
                return 0;
            }

            public final int composerUpdateNode(String str, String str2, float f) {
                return 0;
            }

            public final boolean detectFaceFromBitMap(Bitmap bitmap) {
                return false;
            }

            public final void enable(boolean z) {
            }

            public final int enableMockFace(boolean z) {
                return 0;
            }

            public final void forceOutput2DTex(boolean z) {
            }

            public final String getABDefaultInfoFromEffect(String str) {
                return null;
            }

            public final String getEffectVersion() {
                return null;
            }

            public final String getVersion() {
                return "";
            }

            public final boolean isEnable() {
                return true;
            }

            public final boolean isValid() {
                return false;
            }

            public final String name() {
                return "DummyFilter";
            }

            public final int pauseEffect() {
                return 0;
            }

            public final void processDoubleClickEvent(float f, float f2) {
            }

            public final void processLongPressEvent(float f, float f2) {
            }

            public final void processPanEvent(float f, float f2, float f3, float f4, float f5) {
            }

            public final void processRotationEvent(float f, float f2) {
            }

            public final void processScaleEvent(float f, float f2) {
            }

            public final void processTouchDownEvent(float f, float f2, int i) {
            }

            public final void processTouchEvent(float f, float f2) {
            }

            public final void processTouchUpEvent(float f, float f2, int i) {
            }

            public final void releaseContetDetector() {
            }

            public final int resumeEffect() {
                return 0;
            }

            public final int sendEffectMsg(int i, int i2, int i3, String str) {
                return 0;
            }

            public final void setABInfoToEffect(JSONObject jSONObject) {
            }

            public final int setAudioRecognizeDict(Map<String, String[]> map) {
                return 0;
            }

            public final int setBeautify(String str, float f, float f2) {
                return 0;
            }

            public final int setBeautify(String str, float f, float f2, float f3) {
                return 0;
            }

            public final int setCustomEffect(String str, String str2) {
                return 0;
            }

            public final int setCustomEffectOrientation(String str, int i) {
                return 0;
            }

            public final int setEffect(String str) {
                return 0;
            }

            public final int setEffect(String str, boolean z) {
                return 0;
            }

            public final void setEffectInfoChangeListener(IEffectInfoChangeListener iEffectInfoChangeListener) {
            }

            public final void setEffectMsgListener(IFilterManager.EffectMsgListener effectMsgListener) {
            }

            public final void setErrorListener(ErrorListener errorListener) {
            }

            public final int setFaceAttribute(boolean z) {
                return 0;
            }

            public final void setFaceDetectListener(FaceDetectListener faceDetectListener) {
            }

            public final int setFilter(String str, float f) {
                return 0;
            }

            public final int setFilter(String str, String str2, float f) {
                return 0;
            }

            public final void setLicenseToEffect(String str) {
            }

            public final void setMicrophoneDetectListener(MicrophoneDetectListener microphoneDetectListener) {
            }

            public final void setMusicNodeFilePath(String str) {
            }

            public final int setReshape(String str, float f, float f2) {
                return 0;
            }

            public final int startAudioRecognize() {
                return 0;
            }

            public final int startEffectAudio() {
                return 0;
            }

            public final int stopAudioRecognize() {
                return 0;
            }

            public final int stopEffectAudio() {
                return 0;
            }

            public final void updateEffAudioTimestampMs(long j) {
            }
        };
    }

    public String getEffectVersion() {
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor == null) {
            return "";
        }
        return iVideoEffectProcessor.getEffectVersion();
    }

    public String getVersion() {
        if (isValid()) {
            return this.mEffect.getEffectVersion();
        }
        return "";
    }

    public boolean isValid() {
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor == null || !iVideoEffectProcessor.valid()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$releaseContetDetector$1$FilterManager() {
        if (isValid()) {
            this.mEffect.releaseContetDetector();
        }
    }

    public String name() {
        if (isValid()) {
            return this.mEffect.name();
        }
        return "";
    }

    public void releaseContetDetector() {
        this.mHandler.post(new FilterManager$$Lambda$1(this));
    }

    public int pauseEffect() {
        final String callInfo = getCallInfo(new Object[0]);
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int pauseEffect = FilterManager.this.mEffect.pauseEffect();
                    if (pauseEffect != 0) {
                        FilterManager.this.mErrorListener.onError(pauseEffect, callInfo);
                    }
                }
            }
        });
        return 0;
    }

    public int resumeEffect() {
        final String callInfo = getCallInfo(new Object[0]);
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int resumeEffect = FilterManager.this.mEffect.resumeEffect();
                    if (resumeEffect != 0) {
                        FilterManager.this.mErrorListener.onError(resumeEffect, callInfo);
                    }
                }
            }
        });
        return 0;
    }

    public int startAudioRecognize() {
        if (this.mAudioRecognizing) {
            return -1;
        }
        if (this.mMsgListener != null) {
            this.mMsgListener.onMessageReceived(20, 2139095043, 0, "");
        }
        this.mAudioRecognizing = true;
        return 0;
    }

    public int startEffectAudio() {
        stopEffectAudio();
        if (isValid()) {
            this.mAudioStream = new EffectInputAudioStream(this.mEffect.getEffectAudioSource(), this.mAudioStreamObserver);
            this.mAudioStream.start();
        }
        return 0;
    }

    public int stopAudioRecognize() {
        if (!this.mAudioRecognizing) {
            return -1;
        }
        if (this.mMsgListener != null) {
            this.mMsgListener.onMessageReceived(20, 2139095044, 0, "");
        }
        this.mAudioRecognizing = false;
        return 0;
    }

    public int stopEffectAudio() {
        if (this.mAudioStream != null) {
            this.mAudioStream.stop();
            this.mAudioStream.release();
            this.mAudioStream = null;
        }
        return 0;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:14|15|16|(2:17|18)) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r5.mGLThread.getHandler().post(new com.p683ss.avframework.livestreamv2.filter.FilterManager.C511065(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r5.mGLThread.join(3000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        r2 = "FilterManager";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r3 = new java.lang.StringBuilder("FilerManager thread exit exception at ");
        r3.append(3000);
        r3.append(" ms.");
        com.p683ss.avframework.utils.AVLog.m110008e(r2, r3.toString());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void release() {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.mReleased     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r5)
            return
        L_0x0007:
            java.lang.String r0 = "FilterManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0086 }
            java.lang.String r2 = "Release filterManager "
            r1.<init>(r2)     // Catch:{ all -> 0x0086 }
            r1.append(r5)     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0086 }
            com.p683ss.avframework.utils.AVLog.ioi(r0, r1)     // Catch:{ all -> 0x0086 }
            r0 = 1
            r5.mReleased = r0     // Catch:{ all -> 0x0086 }
            r5.stopEffectAudio()     // Catch:{ all -> 0x0086 }
            android.os.Handler r0 = r5.mHandler     // Catch:{ all -> 0x0086 }
            com.ss.avframework.livestreamv2.filter.FilterManager$4 r1 = new com.ss.avframework.livestreamv2.filter.FilterManager$4     // Catch:{ all -> 0x0086 }
            r1.<init>()     // Catch:{ all -> 0x0086 }
            r0.post(r1)     // Catch:{ all -> 0x0086 }
            com.ss.avframework.opengl.GLThread r0 = r5.mGLThread     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x0069
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x003a }
            r1 = 18
            if (r0 < r1) goto L_0x0073
            com.ss.avframework.opengl.GLThread r0 = r5.mGLThread     // Catch:{ Throwable -> 0x003a }
            r0.quitSafely()     // Catch:{ Throwable -> 0x003a }
            goto L_0x0073
        L_0x003a:
            com.ss.avframework.opengl.GLThread r0 = r5.mGLThread     // Catch:{ all -> 0x0086 }
            android.os.Handler r0 = r0.getHandler()     // Catch:{ all -> 0x0086 }
            com.ss.avframework.livestreamv2.filter.FilterManager$5 r1 = new com.ss.avframework.livestreamv2.filter.FilterManager$5     // Catch:{ all -> 0x0086 }
            r1.<init>()     // Catch:{ all -> 0x0086 }
            r0.post(r1)     // Catch:{ all -> 0x0086 }
            r0 = 3000(0xbb8, double:1.482E-320)
            com.ss.avframework.opengl.GLThread r2 = r5.mGLThread     // Catch:{ InterruptedException -> 0x0050 }
            r2.join(r0)     // Catch:{ InterruptedException -> 0x0050 }
            goto L_0x0073
        L_0x0050:
            java.lang.String r2 = "FilterManager"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0086 }
            java.lang.String r4 = "FilerManager thread exit exception at "
            r3.<init>(r4)     // Catch:{ all -> 0x0086 }
            r3.append(r0)     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = " ms."
            r3.append(r0)     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0086 }
            com.p683ss.avframework.utils.AVLog.m110008e(r2, r0)     // Catch:{ all -> 0x0086 }
            goto L_0x0073
        L_0x0069:
            android.os.Handler r0 = r5.mHandler     // Catch:{ all -> 0x0086 }
            com.ss.avframework.livestreamv2.filter.FilterManager$6 r1 = new com.ss.avframework.livestreamv2.filter.FilterManager$6     // Catch:{ all -> 0x0086 }
            r1.<init>()     // Catch:{ all -> 0x0086 }
            com.p683ss.avframework.utils.ThreadUtils.invokeAtFrontUninterruptibly(r0, r1)     // Catch:{ all -> 0x0086 }
        L_0x0073:
            com.ss.avframework.livestreamv2.filter.FilterManager$AlbumOrientationEventListener r0 = r5.mOrientationListener     // Catch:{ all -> 0x0086 }
            r1 = 0
            if (r0 == 0) goto L_0x007f
            com.ss.avframework.livestreamv2.filter.FilterManager$AlbumOrientationEventListener r0 = r5.mOrientationListener     // Catch:{ all -> 0x0086 }
            r0.disable()     // Catch:{ all -> 0x0086 }
            r5.mOrientationListener = r1     // Catch:{ all -> 0x0086 }
        L_0x007f:
            r5.mAudioStreamObserver = r1     // Catch:{ all -> 0x0086 }
            super.release()     // Catch:{ all -> 0x0086 }
            monitor-exit(r5)
            return
        L_0x0086:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.avframework.livestreamv2.filter.FilterManager.release():void");
    }

    public int enableMockFace(boolean z) {
        this.mForceSticker = z;
        return 0;
    }

    public void enableRoi(boolean z) {
        this.mRoiEnabled = z;
    }

    public void forceOutput2DTex(boolean z) {
        this.mForceOutput2DTex = z;
    }

    public void setErrorListener(ErrorListener errorListener) {
        this.mErrorListener = errorListener;
    }

    public void updateEffAudioTimestampMs(long j) {
        this.mEffectAudioTimestampMs = j;
    }

    public boolean detectFaceFromBitMap(Bitmap bitmap) {
        return this.mEffect.detectFaceFromBitMap(bitmap);
    }

    public void setEffectAlgorithmAB(final boolean z) {
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.setAlgorithmAB(z);
                }
            }
        });
    }

    public void setEffectInfoChangeListener(IEffectInfoChangeListener iEffectInfoChangeListener) {
        this.mHandler.post(new FilterManager$$Lambda$2(this, iEffectInfoChangeListener));
    }

    public void setEffectMsgListener(final IFilterManager.EffectMsgListener effectMsgListener) {
        this.mMsgListener = effectMsgListener;
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.mEffect != null) {
                    FilterManager.this.mEffect.setEffectMsgListener(effectMsgListener);
                }
            }
        });
    }

    public void setFaceDetectListener(final FaceDetectListener faceDetectListener) {
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.mEffect != null) {
                    FilterManager.this.mEffect.setFaceDetectListener(faceDetectListener);
                }
            }
        });
    }

    public void setMicrophoneDetectListener(final MicrophoneDetectListener microphoneDetectListener) {
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.mEffect != null) {
                    FilterManager.this.mEffect.setMicrophoneDetectListener(microphoneDetectListener);
                }
            }
        });
    }

    public void setMusicNodeFilePath(final String str) {
        if (str == null) {
            str = "";
        }
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.mEffect != null) {
                    FilterManager.this.mEffect.setMusicNodeFilePath(str);
                }
            }
        });
    }

    public String getABDefaultInfoFromEffect(String str) {
        if (this.mEffect == null || !(this.mEffect instanceof EffectWrapper)) {
            return null;
        }
        return ((EffectWrapper) this.mEffect).getEffectABInfo(str);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$setEffectInfoChangeListener$2$FilterManager(IEffectInfoChangeListener iEffectInfoChangeListener) {
        if (this.mEffect != null && (this.mEffect instanceof EffectWrapper)) {
            ((EffectWrapper) this.mEffect).setEffectInfoChangeListener(iEffectInfoChangeListener);
        }
    }

    public void setABInfoToEffect(final JSONObject jSONObject) {
        final String callInfo = getCallInfo(jSONObject.toString());
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int effectABInfo = FilterManager.this.mEffect.setEffectABInfo(jSONObject);
                    if (effectABInfo != 0) {
                        FilterManager.this.mErrorListener.onError(effectABInfo, callInfo);
                    }
                }
            }
        });
    }

    public int setAudioRecognizeDict(final Map<String, String[]> map) {
        final String callInfo = getCallInfo(map);
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int audioRecognizeDict = FilterManager.this.mEffect.setAudioRecognizeDict(map);
                    if (audioRecognizeDict != 0) {
                        FilterManager.this.mErrorListener.onError(audioRecognizeDict, callInfo);
                    }
                }
            }
        });
        return 0;
    }

    public int setEffect(final String str) {
        final String callInfo = getCallInfo(str);
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int effect = FilterManager.this.mEffect.setEffect(str);
                    if (effect != 0) {
                        FilterManager.this.mErrorListener.onError(effect, callInfo);
                    }
                }
            }
        });
        return 0;
    }

    public int setFaceAttribute(final boolean z) {
        final String callInfo = getCallInfo(Boolean.valueOf(z));
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int faceAttribute = FilterManager.this.mEffect.setFaceAttribute(z);
                    if (faceAttribute != 0) {
                        FilterManager.this.mErrorListener.onError(faceAttribute, callInfo);
                    }
                }
            }
        });
        return 0;
    }

    public void setLicenseToEffect(final String str) {
        final String callInfo = getCallInfo(str);
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int effectLicense = FilterManager.this.mEffect.setEffectLicense(str);
                    if (effectLicense != 0) {
                        FilterManager.this.mErrorListener.onError(effectLicense, callInfo);
                    }
                }
            }
        });
    }

    public I420Buffer toI420(final TextureBuffer textureBuffer) {
        final I420Buffer[] i420BufferArr = new I420Buffer[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
            public void run() {
                if (FilterManager.this.mEffect != null && FilterManager.this.mYuvConverter == null) {
                    FilterManager.this.mYuvConverter = new YuvConverter();
                }
                if (FilterManager.this.mYuvConverter != null) {
                    i420BufferArr[0] = FilterManager.this.mYuvConverter.convert(textureBuffer);
                }
            }
        });
        if (i420BufferArr[0] != null) {
            return i420BufferArr[0];
        }
        throw new AndroidRuntimeException("BUG, Please fixed me");
    }

    public void enable(boolean z) {
        StringBuilder sb = new StringBuilder("enable ");
        sb.append(this.mEnabled);
        sb.append(" -> ");
        sb.append(z);
        AVLog.iod("FilterManager", sb.toString());
        this.mEnabled = z;
        if (this.mAudioStream != null) {
            this.mAudioStream.mute(!z);
        }
    }

    private String getCallInfo(Object... objArr) {
        String str;
        String str2 = "(";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(Thread.currentThread().getStackTrace()[3].getMethodName());
            sb.append(str2);
            str2 = sb.toString();
        } catch (Exception unused) {
        }
        int i = 0;
        while (objArr != null && i < objArr.length) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(objArr[i]);
            if (i == objArr.length - 1) {
                str = "";
            } else {
                str = ", ";
            }
            sb2.append(str);
            str2 = sb2.toString();
            i++;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str2);
        sb3.append(")");
        return sb3.toString();
    }

    public VideoFrame process(final VideoFrame videoFrame) {
        boolean z;
        videoFrame.retain();
        this.mShouldCatch = false;
        long currentTimeMillis = System.currentTimeMillis();
        if (this.mCatchVideoFrameCount > 0 && (!(this.mOriginFrameCatcher == null && this.mEffectFrameCatcher == null) && currentTimeMillis - this.mLastCatchTimestamp > ((long) this.mCatchVideoFrameInterval))) {
            this.mShouldCatch = true;
            this.mLastCatchTimestamp = currentTimeMillis;
        }
        Buffer buffer = videoFrame.getBuffer();
        if (!this.mEnabled || !isValid()) {
            z = true;
        } else {
            z = false;
        }
        if (z && (buffer instanceof TextureBuffer) && !this.mShouldCatch) {
            Type type = ((TextureBuffer) buffer).getType();
            if (type == Type.RGB || (!this.mForceOutput2DTex && type == Type.OES)) {
                return videoFrame;
            }
        }
        final VideoFrame[] videoFrameArr = new VideoFrame[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
            public void run() {
                try {
                    int rotatedWidth = videoFrame.getRotatedWidth();
                    int rotatedHeight = videoFrame.getRotatedHeight();
                    FilterManager.this.mTextureFrameBufferRecycle = FilterManager.this.mBufferPool.getBuffer(rotatedWidth, rotatedHeight);
                    if (FilterManager.this.mTextureFrameBufferRecycle == null) {
                        StringBuilder sb = new StringBuilder("No enough in buffer space and drop frame at ");
                        sb.append(videoFrame.getTimestampNs());
                        AVLog.ioe("FilterManager", sb.toString());
                        videoFrameArr[0] = videoFrame;
                        return;
                    }
                    FilterManager.this.mOut2DTexRecycle = FilterManager.this.mBufferPool.getBuffer(rotatedWidth, rotatedHeight);
                    if (FilterManager.this.mOut2DTexRecycle == null) {
                        StringBuilder sb2 = new StringBuilder("No enough out buffer space and drop frame at ");
                        sb2.append(videoFrame.getTimestampNs());
                        AVLog.ioe("FilterManager", sb2.toString());
                    }
                    videoFrameArr[0] = FilterManager.this.onProcess(videoFrame);
                    if (FilterManager.this.mTextureFrameBufferRecycle != null) {
                        FilterManager.this.mTextureFrameBufferRecycle.decRef();
                        FilterManager.this.mTextureFrameBufferRecycle = null;
                    }
                    if (FilterManager.this.mOut2DTexRecycle != null) {
                        FilterManager.this.mOut2DTexRecycle.decRef();
                        FilterManager.this.mOut2DTexRecycle = null;
                    }
                } catch (Throwable th) {
                    StringBuilder sb3 = new StringBuilder("FilterManager process error ");
                    sb3.append(Log.getStackTraceString(th));
                    AVLog.ioe("FilterManager", sb3.toString());
                }
            }
        });
        if (this.mShouldCatch && this.mCatchVideoFrameCount > 0) {
            this.mCatchVideoFrameCount--;
            if (this.mCatchVideoFrameCount <= 0) {
                this.mHandler.postDelayed(new Runnable() {
                    public void run() {
                        FilterManager.this.stopCatchTask(0, null);
                    }
                }, 1000);
            }
        }
        if (videoFrameArr[0] != videoFrame) {
            videoFrame.release();
        }
        return videoFrameArr[0];
    }

    /* JADX WARNING: Removed duplicated region for block: B:93:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0269  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p683ss.avframework.buffer.VideoFrame onProcess(com.p683ss.avframework.buffer.VideoFrame r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            com.ss.avframework.buffer.VideoFrame$Buffer r2 = r27.getBuffer()
            int r3 = r27.getRotatedWidth()
            int r4 = r27.getRotatedHeight()
            com.ss.avframework.livestreamv2.filter.FilterVideoBufferPool$Recycle r5 = r0.mTextureFrameBufferRecycle
            r5.setSize(r3, r4)
            boolean r3 = r2 instanceof com.p683ss.avframework.buffer.VideoFrame.TextureBuffer
            r4 = -1
            r5 = 1
            r6 = 36160(0x8d40, float:5.0671E-41)
            r7 = 0
            if (r3 == 0) goto L_0x00f4
            r3 = r2
            com.ss.avframework.buffer.VideoFrame$TextureBuffer r3 = (com.p683ss.avframework.buffer.VideoFrame.TextureBuffer) r3
            com.ss.avframework.livestreamv2.filter.FilterVideoBufferPool$Recycle r8 = r0.mTextureFrameBufferRecycle
            com.ss.avframework.buffer.GlTextureFrameBuffer r8 = r8.getBuffer()
            int r8 = r8.getFrameBufferId()
            android.opengl.GLES20.glBindFramebuffer(r6, r8)
            android.graphics.Matrix r8 = r3.getTransformMatrix()
            int r9 = r27.getRotation()
            r10 = -1090519040(0xffffffffbf000000, float:-0.5)
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r9 == 0) goto L_0x004b
            r8.preTranslate(r11, r11)
            int r9 = r27.getRotation()
            float r9 = (float) r9
            r8.preRotate(r9)
            r8.preTranslate(r10, r10)
        L_0x004b:
            r8.preTranslate(r11, r11)
            r9 = 1065353216(0x3f800000, float:1.0)
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8.preScale(r9, r11)
            r8.preTranslate(r10, r10)
            float[] r15 = com.p683ss.avframework.opengl.RendererCommon.convertMatrixFromAndroidGraphicsMatrix(r8)
            com.ss.avframework.buffer.VideoFrame$TextureBuffer$Type r8 = r3.getType()
            com.ss.avframework.buffer.VideoFrame$TextureBuffer$Type r9 = com.p683ss.avframework.buffer.VideoFrame.TextureBuffer.Type.OES
            if (r8 != r9) goto L_0x007b
            com.ss.avframework.opengl.GlRenderDrawer r12 = r0.mOffscreenDraw
            int r13 = r3.getTextureId()
            r14 = 0
            r16 = 0
            r17 = 0
            int r18 = r3.getWidth()
            int r19 = r3.getHeight()
            r12.drawOes(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0091
        L_0x007b:
            com.ss.avframework.opengl.GlRenderDrawer r12 = r0.mOffscreenDraw
            int r13 = r3.getTextureId()
            r14 = 0
            r16 = 0
            r17 = 0
            int r18 = r3.getWidth()
            int r19 = r3.getHeight()
            r12.drawRgb(r13, r14, r15, r16, r17, r18, r19)
        L_0x0091:
            boolean r3 = com.p683ss.avframework.opengl.GLThreadManager.isNeedFinish()
            if (r3 == 0) goto L_0x009b
            android.opengl.GLES20.glFinish()
            goto L_0x009e
        L_0x009b:
            android.opengl.GLES20.glFlush()
        L_0x009e:
            android.opengl.GLES20.glBindFramebuffer(r6, r7)
            com.ss.avframework.livestreamv2.filter.FilterVideoBufferPool$Recycle r3 = r0.mTextureFrameBufferRecycle
            com.ss.avframework.buffer.GlTextureFrameBuffer r3 = r3.getBuffer()
            int r3 = r3.getTextureId()
            boolean r8 = r0.mEnabled
            if (r8 == 0) goto L_0x00b8
            boolean r8 = r26.isValid()
            if (r8 != 0) goto L_0x00b6
            goto L_0x00b8
        L_0x00b6:
            r8 = 0
            goto L_0x00b9
        L_0x00b8:
            r8 = 1
        L_0x00b9:
            com.ss.avframework.livestreamv2.filter.FilterVideoBufferPool$Recycle r9 = r0.mOut2DTexRecycle
            if (r9 != 0) goto L_0x00be
            r8 = 1
        L_0x00be:
            if (r8 != 0) goto L_0x011f
            com.ss.avframework.livestreamv2.filter.FilterVideoBufferPool$Recycle r4 = r0.mOut2DTexRecycle
            if (r4 != 0) goto L_0x00dc
            java.lang.String r2 = "FilterManager"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "No enough buffer space and drop frame at "
            r3.<init>(r4)
            long r4 = r27.getTimestampNs()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.p683ss.avframework.utils.AVLog.m110008e(r2, r3)
            return r1
        L_0x00dc:
            com.ss.avframework.livestreamv2.filter.FilterVideoBufferPool$Recycle r4 = r0.mOut2DTexRecycle
            int r8 = r27.getRotatedWidth()
            int r9 = r27.getRotatedHeight()
            r4.setSize(r8, r9)
            com.ss.avframework.livestreamv2.filter.FilterVideoBufferPool$Recycle r4 = r0.mOut2DTexRecycle
            com.ss.avframework.buffer.GlTextureFrameBuffer r4 = r4.getBuffer()
            int r4 = r4.getTextureId()
            goto L_0x011f
        L_0x00f4:
            com.ss.avframework.livestreamv2.filter.FilterVideoBufferPool$Recycle r3 = r0.mTextureFrameBufferRecycle
            if (r3 == 0) goto L_0x0103
            com.ss.avframework.livestreamv2.filter.FilterVideoBufferPool$Recycle r3 = r0.mTextureFrameBufferRecycle
            com.ss.avframework.buffer.GlTextureFrameBuffer r3 = r3.getBuffer()
            int r3 = r3.getTextureId()
            goto L_0x0104
        L_0x0103:
            r3 = -1
        L_0x0104:
            com.ss.avframework.livestreamv2.filter.FilterVideoBufferPool$Recycle r8 = r0.mOut2DTexRecycle
            if (r8 == 0) goto L_0x0112
            com.ss.avframework.livestreamv2.filter.FilterVideoBufferPool$Recycle r4 = r0.mOut2DTexRecycle
            com.ss.avframework.buffer.GlTextureFrameBuffer r4 = r4.getBuffer()
            int r4 = r4.getTextureId()
        L_0x0112:
            r8 = 5
            java.lang.String r9 = "FilterManager"
            java.lang.String r10 = "Non-texture frame is not supported yet. Outputs may be black frames"
            r11 = 0
            java.lang.String r12 = "FilterManager.java:onProcess:3"
            r13 = 30000(0x7530, float:4.2039E-41)
            com.p683ss.avframework.utils.AVLog.logToIODevice2(r8, r9, r10, r11, r12, r13)
        L_0x011f:
            com.ss.avframework.livestreamv2.filter.VideoCatcher r8 = r0.mOriginFrameCatcher
            r9 = 0
            if (r8 == 0) goto L_0x0176
            boolean r8 = r0.mShouldCatch
            if (r8 == 0) goto L_0x0176
            com.ss.avframework.livestreamv2.filter.VideoCatcher r8 = r0.mOriginFrameCatcher
            int r8 = r8.getMode()
            if (r8 != 0) goto L_0x013d
            com.ss.avframework.buffer.VideoFrame r8 = r0.wrapperFrame(r3, r1, r9, r9)
            com.ss.avframework.livestreamv2.filter.VideoCatcher r10 = r0.mOriginFrameCatcher
            r10.onFrame(r8)
            r8.release()
            goto L_0x0176
        L_0x013d:
            com.ss.avframework.livestreamv2.filter.VideoCatcher r8 = r0.mOriginFrameCatcher
            int r8 = r8.getMode()
            if (r8 != r5) goto L_0x0176
            com.ss.avframework.livestreamv2.filter.FilterVideoBufferPool$Recycle r8 = r0.mTextureFrameBufferRecycle
            com.ss.avframework.buffer.GlTextureFrameBuffer r8 = r8.getBuffer()
            int r8 = r8.getTextureId()
            if (r3 != r8) goto L_0x016f
            com.ss.avframework.livestreamv2.filter.FilterVideoBufferPool$Recycle r8 = r0.mTextureFrameBufferRecycle
            com.ss.avframework.buffer.GlTextureFrameBuffer r8 = r8.getBuffer()
            int r8 = r8.getFrameBufferId()
            android.opengl.GLES20.glBindFramebuffer(r6, r8)
            com.ss.avframework.livestreamv2.filter.VideoCatcher r8 = r0.mOriginFrameCatcher
            int r10 = r2.getWidth()
            int r11 = r2.getHeight()
            r8.readPixels(r10, r11)
            android.opengl.GLES20.glBindFramebuffer(r6, r7)
            goto L_0x0176
        L_0x016f:
            java.lang.String r8 = "FilterManager"
            java.lang.String r10 = "can't read in2dTex pixel buffer"
            com.p683ss.avframework.utils.AVLog.ioe(r8, r10)
        L_0x0176:
            if (r3 <= 0) goto L_0x024d
            if (r4 <= 0) goto L_0x024d
            if (r3 == r4) goto L_0x024d
            boolean r8 = r0.mRoiEnabled
            if (r8 == 0) goto L_0x0186
            com.ss.avframework.buffer.VideoFrame$stRoiInfo r8 = new com.ss.avframework.buffer.VideoFrame$stRoiInfo
            r8.<init>()
            goto L_0x0187
        L_0x0186:
            r8 = r9
        L_0x0187:
            com.p683ss.avframework.opengl.GLThreadManager.lockSharedGLContext()
            com.ss.avframework.effect.IVideoEffectProcessor r14 = r0.mEffect
            int r16 = r27.getRotatedWidth()
            int r17 = r27.getRotatedHeight()
            int r10 = r0.mOrientation
            int r19 = r10 / 90
            long r21 = r27.getTimestampNs()
            boolean r10 = r0.mForceSticker
            long r11 = r0.mEffectAudioTimestampMs
            r15 = r3
            r18 = r4
            r20 = r8
            r23 = r10
            r24 = r11
            int r10 = r14.process(r15, r16, r17, r18, r19, r20, r21, r23, r24)
            com.p683ss.avframework.opengl.GLThreadManager.unlockSharedGLContext()
            if (r10 == 0) goto L_0x01c1
            r11 = 6
            java.lang.String r12 = "FilterManager"
            java.lang.String r13 = "effect process failed"
            r14 = 0
            java.lang.String r15 = "FilterManager.java:onProcess:1"
            r16 = 30000(0x7530, float:4.2039E-41)
            com.p683ss.avframework.utils.AVLog.logToIODevice2(r11, r12, r13, r14, r15, r16)
            goto L_0x024d
        L_0x01c1:
            boolean r3 = com.p683ss.avframework.opengl.GLThreadManager.isNeedFinish()
            if (r3 == 0) goto L_0x01cb
            android.opengl.GLES20.glFinish()
            goto L_0x01ce
        L_0x01cb:
            android.opengl.GLES20.glFlush()
        L_0x01ce:
            r10 = 3
            java.lang.String r11 = "FilterManager"
            java.lang.String r12 = "effect process success"
            r13 = 0
            java.lang.String r14 = "FilterManager.java:onProcess:2"
            r15 = 30000(0x7530, float:4.2039E-41)
            com.p683ss.avframework.utils.AVLog.logToIODevice2(r10, r11, r12, r13, r14, r15)
            int r3 = r0.mNoExtraSendFrameCounts
            int r10 = r0.mExtraDataGop
            if (r3 < r10) goto L_0x01e3
            r3 = 1
            goto L_0x01e4
        L_0x01e3:
            r3 = 0
        L_0x01e4:
            if (r3 == 0) goto L_0x01e9
            r0.mNoExtraSendFrameCounts = r7
            goto L_0x01ee
        L_0x01e9:
            int r10 = r0.mNoExtraSendFrameCounts
            int r10 = r10 + r5
            r0.mNoExtraSendFrameCounts = r10
        L_0x01ee:
            long r10 = r0.mExtrDataFlags
            r12 = 0
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x024f
            if (r3 == 0) goto L_0x024f
            com.ss.avframework.effect.IVideoEffectProcessor r3 = r0.mEffect
            boolean r3 = r3 instanceof com.p683ss.avframework.effect.EffectWrapper
            if (r3 == 0) goto L_0x024f
            com.ss.avframework.livestreamv2.filter.FilterVideoBufferPool$Recycle r3 = r0.mTextureFrameBufferRecycle
            com.ss.avframework.buffer.GlTextureFrameBuffer r3 = r3.getBuffer()
            int r3 = r3.getTextureId()
            r9 = 5
            if (r4 != r3) goto L_0x022d
            com.ss.avframework.livestreamv2.filter.FilterVideoBufferPool$Recycle r3 = r0.mTextureFrameBufferRecycle
            com.ss.avframework.buffer.VideoFrame$IExtraData r3 = r3.getExtraData()
            com.ss.avframework.effect.EffectWrapper$AlgorithmResult r3 = (com.p683ss.avframework.effect.EffectWrapper.AlgorithmResult) r3
            if (r3 != 0) goto L_0x0224
            com.ss.avframework.effect.IVideoEffectProcessor r3 = r0.mEffect
            com.ss.avframework.effect.EffectWrapper r3 = (com.p683ss.avframework.effect.EffectWrapper) r3
            com.ss.avframework.effect.EffectWrapper$AlgorithmResult r9 = r3.getAlgorithmResult(r9)
            com.ss.avframework.livestreamv2.filter.FilterVideoBufferPool$Recycle r3 = r0.mTextureFrameBufferRecycle
            r3.setExtrData(r9)
            goto L_0x024f
        L_0x0224:
            com.ss.avframework.effect.IVideoEffectProcessor r11 = r0.mEffect
            com.ss.avframework.effect.EffectWrapper r11 = (com.p683ss.avframework.effect.EffectWrapper) r11
            r11.getAlgorithmResult(r3, r9)
        L_0x022b:
            r9 = r3
            goto L_0x024f
        L_0x022d:
            com.ss.avframework.livestreamv2.filter.FilterVideoBufferPool$Recycle r3 = r0.mOut2DTexRecycle
            com.ss.avframework.buffer.VideoFrame$IExtraData r3 = r3.getExtraData()
            com.ss.avframework.effect.EffectWrapper$AlgorithmResult r3 = (com.p683ss.avframework.effect.EffectWrapper.AlgorithmResult) r3
            if (r3 != 0) goto L_0x0245
            com.ss.avframework.effect.IVideoEffectProcessor r3 = r0.mEffect
            com.ss.avframework.effect.EffectWrapper r3 = (com.p683ss.avframework.effect.EffectWrapper) r3
            com.ss.avframework.effect.EffectWrapper$AlgorithmResult r9 = r3.getAlgorithmResult(r9)
            com.ss.avframework.livestreamv2.filter.FilterVideoBufferPool$Recycle r3 = r0.mOut2DTexRecycle
            r3.setExtrData(r9)
            goto L_0x024f
        L_0x0245:
            com.ss.avframework.effect.IVideoEffectProcessor r11 = r0.mEffect
            com.ss.avframework.effect.EffectWrapper r11 = (com.p683ss.avframework.effect.EffectWrapper) r11
            r11.getAlgorithmResult(r3, r9)
            goto L_0x022b
        L_0x024d:
            r4 = r3
            r8 = r9
        L_0x024f:
            com.ss.avframework.buffer.VideoFrame r1 = r0.wrapperFrame(r4, r1, r8, r9)
            com.ss.avframework.livestreamv2.filter.VideoCatcher r3 = r0.mEffectFrameCatcher
            if (r3 == 0) goto L_0x02c1
            boolean r3 = r0.mShouldCatch
            if (r3 == 0) goto L_0x02c1
            com.ss.avframework.livestreamv2.filter.VideoCatcher r3 = r0.mEffectFrameCatcher
            int r3 = r3.getMode()
            if (r3 != 0) goto L_0x0269
            com.ss.avframework.livestreamv2.filter.VideoCatcher r2 = r0.mEffectFrameCatcher
            r2.onFrame(r1)
            goto L_0x02c1
        L_0x0269:
            com.ss.avframework.livestreamv2.filter.VideoCatcher r3 = r0.mEffectFrameCatcher
            int r3 = r3.getMode()
            if (r3 != r5) goto L_0x02c1
            com.ss.avframework.livestreamv2.filter.FilterVideoBufferPool$Recycle r3 = r0.mOut2DTexRecycle
            if (r3 == 0) goto L_0x028c
            com.ss.avframework.livestreamv2.filter.FilterVideoBufferPool$Recycle r3 = r0.mOut2DTexRecycle
            com.ss.avframework.buffer.GlTextureFrameBuffer r3 = r3.getBuffer()
            int r3 = r3.getTextureId()
            if (r4 != r3) goto L_0x028c
            com.ss.avframework.livestreamv2.filter.FilterVideoBufferPool$Recycle r3 = r0.mOut2DTexRecycle
            com.ss.avframework.buffer.GlTextureFrameBuffer r3 = r3.getBuffer()
            int r3 = r3.getFrameBufferId()
            goto L_0x02a4
        L_0x028c:
            com.ss.avframework.livestreamv2.filter.FilterVideoBufferPool$Recycle r3 = r0.mTextureFrameBufferRecycle
            com.ss.avframework.buffer.GlTextureFrameBuffer r3 = r3.getBuffer()
            int r3 = r3.getTextureId()
            if (r4 != r3) goto L_0x02a3
            com.ss.avframework.livestreamv2.filter.FilterVideoBufferPool$Recycle r3 = r0.mTextureFrameBufferRecycle
            com.ss.avframework.buffer.GlTextureFrameBuffer r3 = r3.getBuffer()
            int r3 = r3.getFrameBufferId()
            goto L_0x02a4
        L_0x02a3:
            r3 = 0
        L_0x02a4:
            if (r3 <= 0) goto L_0x02ba
            android.opengl.GLES20.glBindFramebuffer(r6, r3)
            com.ss.avframework.livestreamv2.filter.VideoCatcher r3 = r0.mEffectFrameCatcher
            int r4 = r2.getWidth()
            int r2 = r2.getHeight()
            r3.readPixels(r4, r2)
            android.opengl.GLES20.glBindFramebuffer(r6, r7)
            goto L_0x02c1
        L_0x02ba:
            java.lang.String r2 = "FilterManager"
            java.lang.String r3 = "can't read out2dTex pixel buffer"
            com.p683ss.avframework.utils.AVLog.ioe(r2, r3)
        L_0x02c1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.avframework.livestreamv2.filter.FilterManager.onProcess(com.ss.avframework.buffer.VideoFrame):com.ss.avframework.buffer.VideoFrame");
    }

    public void onCatchError(int i, String str) {
        stopCatchTask(i, str);
    }

    public void processDoubleClickEvent(final float f, final float f2) {
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processDoubleClickEvent(f, f2);
                }
            }
        });
    }

    public void processLongPressEvent(final float f, final float f2) {
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processLongPressEvent(f, f2);
                }
            }
        });
    }

    public void processRotationEvent(final float f, final float f2) {
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processRotationEvent(f, f2);
                }
            }
        });
    }

    public void processScaleEvent(final float f, final float f2) {
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processScaleEvent(f, f2);
                }
            }
        });
    }

    public void processTouchEvent(final float f, final float f2) {
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processTouchEvent(f, f2);
                }
            }
        });
    }

    static final /* synthetic */ void lambda$new$0$FilterManager(int i, String str) {
        StringBuilder sb = new StringBuilder("Effect api return error: ");
        sb.append(i);
        sb.append(". Calling info: ");
        sb.append(str);
        AVLog.ioe("FilterManager", sb.toString());
    }

    public int composerAppendNodes(final String[] strArr, final int i) {
        final String callInfo = getCallInfo(strArr, Integer.valueOf(i));
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int composerAppendNodes = FilterManager.this.mEffect.composerAppendNodes(strArr, i);
                    if (composerAppendNodes != 0) {
                        FilterManager.this.mErrorListener.onError(composerAppendNodes, callInfo);
                    }
                }
            }
        });
        return 0;
    }

    public int composerReloadNodes(final String[] strArr, final int i) {
        final String callInfo = getCallInfo(strArr, Integer.valueOf(i));
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int composerReloadNodes = FilterManager.this.mEffect.composerReloadNodes(strArr, i);
                    if (composerReloadNodes != 0) {
                        FilterManager.this.mErrorListener.onError(composerReloadNodes, callInfo);
                    }
                }
            }
        });
        return 0;
    }

    public int composerRemoveNodes(final String[] strArr, final int i) {
        final String callInfo = getCallInfo(strArr, Integer.valueOf(i));
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int composerRemoveNodes = FilterManager.this.mEffect.composerRemoveNodes(strArr, i);
                    if (composerRemoveNodes != 0) {
                        FilterManager.this.mErrorListener.onError(composerRemoveNodes, callInfo);
                    }
                }
            }
        });
        return 0;
    }

    public int composerSetMode(final int i, final int i2) {
        final String callInfo = getCallInfo(Integer.valueOf(i), Integer.valueOf(i2));
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int composerSetMode = FilterManager.this.mEffect.composerSetMode(i, i2);
                    if (composerSetMode != 0) {
                        FilterManager.this.mErrorListener.onError(composerSetMode, callInfo);
                    }
                }
            }
        });
        return 0;
    }

    public int composerSetNodes(final String[] strArr, final int i) {
        final String callInfo = getCallInfo(strArr, Integer.valueOf(i));
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int composerSetNodes = FilterManager.this.mEffect.composerSetNodes(strArr, i);
                    if (composerSetNodes != 0) {
                        FilterManager.this.mErrorListener.onError(composerSetNodes, callInfo);
                    }
                }
            }
        });
        return 0;
    }

    public void enableExtData(long j, int i) {
        this.mExtrDataFlags = j;
        this.mExtraDataGop = i;
        StringBuilder sb = new StringBuilder("enableExtData ");
        sb.append(j);
        sb.append(" gop ");
        sb.append(i);
        AVLog.iod("FilterManager", sb.toString());
    }

    public int setCustomEffect(final String str, final String str2) {
        final String callInfo = getCallInfo(str, str2);
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int customEffect = FilterManager.this.mEffect.setCustomEffect(str, str2);
                    if (customEffect != 0) {
                        FilterManager.this.mErrorListener.onError(customEffect, callInfo);
                    }
                }
            }
        });
        return 0;
    }

    public int setCustomEffectOrientation(final String str, final int i) {
        final String callInfo = getCallInfo(str, Integer.valueOf(i));
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int customEffectOrientation = FilterManager.this.mEffect.setCustomEffectOrientation(str, i);
                    if (customEffectOrientation != 0) {
                        FilterManager.this.mErrorListener.onError(customEffectOrientation, callInfo);
                    }
                }
            }
        });
        return 0;
    }

    public int setFilter(final String str, final float f) {
        final String callInfo = getCallInfo(str, Float.valueOf(f));
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int filter = FilterManager.this.mEffect.setFilter(str, f);
                    if (filter != 0) {
                        FilterManager.this.mErrorListener.onError(filter, callInfo);
                    }
                }
            }
        });
        return 0;
    }

    public int setEffect(final String str, final boolean z) {
        final String callInfo = getCallInfo(str, Boolean.valueOf(z));
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mForceSticker = z;
                    int effect = FilterManager.this.mEffect.setEffect(str);
                    if (effect != 0) {
                        FilterManager.this.mErrorListener.onError(effect, callInfo);
                    }
                }
            }
        });
        return 0;
    }

    public void stopCatchTask(final int i, final String str) {
        if (Thread.currentThread() != this.mHandler.getLooper().getThread()) {
            this.mHandler.post(new Runnable() {
                public void run() {
                    FilterManager.this.stopCatchTask(i, str);
                }
            });
            return;
        }
        if (this.mOriginFrameCatcher != null) {
            this.mOriginFrameCatcher.stop(i);
            this.mOriginFrameCatcher.release();
            this.mOriginFrameCatcher = null;
        }
        if (this.mEffectFrameCatcher != null) {
            this.mEffectFrameCatcher.stop(i);
            this.mEffectFrameCatcher.release();
            this.mEffectFrameCatcher = null;
        }
        if (this.mCatchVideoCallback != null) {
            if (i == 0) {
                this.mCatchVideoCallback.onComplete();
            } else {
                this.mCatchVideoCallback.onError(i, str);
            }
            this.mCatchVideoCallback = null;
        }
        this.mCatchVideoFrameCount = 0;
    }

    public void catchVideo(MediaEngineFactory mediaEngineFactory, final Bundle bundle, final CatchVideoCallback catchVideoCallback) {
        final WeakReference weakReference = new WeakReference(mediaEngineFactory);
        this.mHandler.post(new Runnable() {
            public void run() {
                C511041 r19;
                if (FilterManager.this.mOriginFrameCatcher == null && FilterManager.this.mEffectFrameCatcher == null) {
                    MediaEngineFactory mediaEngineFactory = (MediaEngineFactory) weakReference.get();
                    int i = bundle.getInt("mode", -1);
                    int i2 = bundle.getInt("width");
                    int i3 = bundle.getInt("height");
                    int i4 = bundle.getInt("fps");
                    boolean z = bundle.getBoolean("hardwareEncode", true);
                    String string = bundle.getString("outputPathOrigin");
                    String string2 = bundle.getString("outputPathWithEffect");
                    FilterManager.this.mCatchVideoFrameCount = bundle.getInt("frameCount");
                    if (i == 0 && bundle.containsKey("duration")) {
                        FilterManager.this.mCatchVideoFrameCount = (int) (bundle.getFloat("duration") * ((float) i4));
                    }
                    FilterManager.this.mCatchVideoFrameInterval = (int) (bundle.getFloat("interval") * 1000.0f);
                    FilterManager.this.mCatchVideoCallback = catchVideoCallback;
                    C511041 r11 = new CatchVideoCallback() {
                        public void onComplete() {
                        }

                        public void onError(int i, String str) {
                            FilterManager.this.onCatchError(i, str);
                        }
                    };
                    if (!TextUtils.isEmpty(string)) {
                        FilterManager.this.mOriginFrameCatcher = new VideoCatcher();
                        r19 = r11;
                        FilterManager.this.mOriginFrameCatcher.start(i, i2, i3, i4, z, string, r11, mediaEngineFactory, FilterManager.this.mHandler);
                    } else {
                        r19 = r11;
                    }
                    if (!TextUtils.isEmpty(string2)) {
                        FilterManager.this.mEffectFrameCatcher = new VideoCatcher();
                        FilterManager.this.mEffectFrameCatcher.start(i, i2, i3, i4, z, string2, r19, mediaEngineFactory, FilterManager.this.mHandler);
                    }
                    return;
                }
                if (catchVideoCallback != null) {
                    catchVideoCallback.onError(-2, "Already started a catching task");
                }
            }
        });
    }

    public void processTouchDownEvent(final float f, final float f2, final int i) {
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processTouchDownEvent(f, f2, i);
                }
            }
        });
    }

    public void processTouchUpEvent(final float f, final float f2, final int i) {
        this.mHandler.post(new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processTouchUpEvent(f, f2, i);
                }
            }
        });
    }

    public int composerAppendNodesWithTags(String[] strArr, int i, String[] strArr2) {
        final String callInfo = getCallInfo(strArr, strArr2);
        Handler handler = this.mHandler;
        final String[] strArr3 = strArr;
        final int i2 = i;
        final String[] strArr4 = strArr2;
        C5108229 r3 = new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int composerAppendNodesWithTags = FilterManager.this.mEffect.composerAppendNodesWithTags(strArr3, i2, strArr4);
                    if (composerAppendNodesWithTags != 0) {
                        FilterManager.this.mErrorListener.onError(composerAppendNodesWithTags, callInfo);
                    }
                }
            }
        };
        handler.post(r3);
        return 0;
    }

    public int composerReloadNodesWithTags(String[] strArr, int i, String[] strArr2) {
        final String callInfo = getCallInfo(strArr, Integer.valueOf(i), strArr2);
        Handler handler = this.mHandler;
        final String[] strArr3 = strArr;
        final int i2 = i;
        final String[] strArr4 = strArr2;
        C5108128 r3 = new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int composerReloadNodesWithTags = FilterManager.this.mEffect.composerReloadNodesWithTags(strArr3, i2, strArr4);
                    if (composerReloadNodesWithTags != 0) {
                        FilterManager.this.mErrorListener.onError(composerReloadNodesWithTags, callInfo);
                    }
                }
            }
        };
        handler.post(r3);
        return 0;
    }

    public int composerSetNodesWithTags(String[] strArr, int i, String[] strArr2) {
        final String callInfo = getCallInfo(strArr, Integer.valueOf(i), strArr2);
        Handler handler = this.mHandler;
        final String[] strArr3 = strArr;
        final int i2 = i;
        final String[] strArr4 = strArr2;
        C5108027 r3 = new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int composerSetNodesWithTags = FilterManager.this.mEffect.composerSetNodesWithTags(strArr3, i2, strArr4);
                    if (composerSetNodesWithTags != 0) {
                        FilterManager.this.mErrorListener.onError(composerSetNodesWithTags, callInfo);
                    }
                }
            }
        };
        handler.post(r3);
        return 0;
    }

    public int composerUpdateNode(String str, String str2, float f) {
        final String callInfo = getCallInfo(str, str2, Float.valueOf(f));
        Handler handler = this.mHandler;
        final String str3 = str;
        final String str4 = str2;
        final float f2 = f;
        C5107623 r4 = new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int composerUpdateNode = FilterManager.this.mEffect.composerUpdateNode(str3, str4, f2);
                    if (composerUpdateNode != 0) {
                        FilterManager.this.mErrorListener.onError(composerUpdateNode, callInfo);
                    }
                }
            }
        };
        handler.post(r4);
        return 0;
    }

    public int setBeautify(String str, float f, float f2) {
        final String callInfo = getCallInfo(str, Float.valueOf(f), Float.valueOf(f2));
        Handler handler = this.mHandler;
        final String str2 = str;
        final float f3 = f;
        final float f4 = f2;
        C511139 r4 = new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int beautify = FilterManager.this.mEffect.setBeautify(str2, f3, f4);
                    if (beautify != 0) {
                        FilterManager.this.mErrorListener.onError(beautify, callInfo);
                    }
                }
            }
        };
        handler.post(r4);
        return 0;
    }

    public int setFilter(String str, String str2, float f) {
        final String callInfo = getCallInfo(str, str2, Float.valueOf(f));
        Handler handler = this.mHandler;
        final String str3 = str;
        final String str4 = str2;
        final float f2 = f;
        C5107018 r4 = new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int filter = FilterManager.this.mEffect.setFilter(str3, str4, f2);
                    if (filter != 0) {
                        FilterManager.this.mErrorListener.onError(filter, callInfo);
                    }
                }
            }
        };
        handler.post(r4);
        return 0;
    }

    public int setReshape(String str, float f, float f2) {
        final String callInfo = getCallInfo(str, Float.valueOf(f), Float.valueOf(f2));
        Handler handler = this.mHandler;
        final String str2 = str;
        final float f3 = f;
        final float f4 = f2;
        C5106311 r4 = new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int reshape = FilterManager.this.mEffect.setReshape(str2, f3, f4);
                    if (reshape != 0) {
                        FilterManager.this.mErrorListener.onError(reshape, callInfo);
                    }
                }
            }
        };
        handler.post(r4);
        return 0;
    }

    public void setConfig(String[] strArr, boolean[] zArr, JSONObject jSONObject) {
        if (this.mEffect != null && (this.mEffect instanceof EffectWrapper) && strArr != null && zArr != null) {
            long algorithmRequirment = ((EffectWrapper) this.mEffect).getAlgorithmRequirment();
            StringBuilder sb = new StringBuilder("Current requirment ");
            sb.append(Long.toHexString(algorithmRequirment));
            AVLog.iod("FilterManager", sb.toString());
            int length = strArr.length;
            long j = algorithmRequirment;
            int i = 0;
            while (i < length) {
                String str = strArr[i];
                long j2 = j;
                for (boolean z : zArr) {
                    StringBuilder sb2 = new StringBuilder("Requirment name ");
                    sb2.append(str);
                    sb2.append(" enable ");
                    sb2.append(z);
                    AVLog.ioi("FilterManager", sb2.toString());
                    if (str.equalsIgnoreCase("animoji")) {
                        if (z) {
                            j2 |= 17592186044416L;
                        } else {
                            j2 &= -17592186044417L;
                        }
                    } else if (str.equalsIgnoreCase("faceinfo")) {
                        if (z) {
                            j2 |= 1;
                        } else {
                            j2 &= -2;
                        }
                    }
                }
                i++;
                j = j2;
            }
            StringBuilder sb3 = new StringBuilder("update requirment ");
            sb3.append(Long.toHexString(j));
            AVLog.iod("FilterManager", sb3.toString());
            ((EffectWrapper) this.mEffect).setAlgorithmRequirment(j);
            StringBuilder sb4 = new StringBuilder("after requirment ");
            sb4.append(Long.toHexString(((EffectWrapper) this.mEffect).getAlgorithmRequirment()));
            AVLog.iod("FilterManager", sb4.toString());
        }
    }

    public static IFilterManager create(InputAudioStreamObserver inputAudioStreamObserver, Context context, Handler handler, IVideoEffectProcessor iVideoEffectProcessor) {
        return new FilterManager(inputAudioStreamObserver, context, handler, iVideoEffectProcessor);
    }

    public int sendEffectMsg(int i, int i2, int i3, String str) {
        final String callInfo = getCallInfo(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        Handler handler = this.mHandler;
        final int i4 = i;
        final int i5 = i2;
        final int i6 = i3;
        final String str2 = str;
        C5109641 r3 = new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int sendEffectMsg = FilterManager.this.mEffect.sendEffectMsg(i4, i5, i6, str2);
                    if (sendEffectMsg != 0) {
                        FilterManager.this.mErrorListener.onError(sendEffectMsg, callInfo);
                    }
                }
            }
        };
        handler.post(r3);
        return 0;
    }

    public FilterManager(InputAudioStreamObserver inputAudioStreamObserver, Context context, Handler handler, final IVideoEffectProcessor iVideoEffectProcessor) {
        this.mHandler = handler;
        if (this.mHandler != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
                public void run() {
                    if (!GlUtil.nativeIsOpenGlThread()) {
                        FilterManager.this.mHandler = null;
                    }
                }
            });
        }
        if (this.mHandler == null) {
            this.mGLThread = new GLThread("LiveFilterThread");
            this.mGLThread.start();
            this.mHandler = this.mGLThread.getHandler();
        }
        this.mAudioStreamObserver = inputAudioStreamObserver;
        this.mOrientationListener = new AlbumOrientationEventListener(context);
        this.mErrorListener = FilterManager$$Lambda$0.$instance;
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
            public void run() {
                if (iVideoEffectProcessor != null) {
                    FilterManager.this.mEffect = iVideoEffectProcessor;
                } else {
                    FilterManager.this.mEffect = new EffectWrapper();
                }
                if (!FilterManager.this.mEffect.valid()) {
                    FilterManager.this.mEffect.release();
                    FilterManager.this.mEffect = null;
                    return;
                }
                StringBuilder sb = new StringBuilder("Using Effect info ");
                sb.append(FilterManager.this.mEffect.name());
                sb.append(" ");
                sb.append(FilterManager.this.mEffect.getEffectVersion());
                AVLog.iow("FilterManager", sb.toString());
                FilterManager.this.mOffscreenDraw = new GlRenderDrawer();
            }
        });
        this.mBufferPool = new FilterVideoBufferPool(this.mBufferPoolMaxSize);
    }

    private VideoFrame wrapperFrame(int i, VideoFrame videoFrame, stRoiInfo stroiinfo, AlgorithmResult algorithmResult) {
        Recycle recycle;
        Matrix matrix = new Matrix();
        matrix.reset();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preScale(1.0f, -1.0f);
        matrix.preTranslate(-0.5f, -0.5f);
        if (this.mOut2DTexRecycle == null || i != this.mOut2DTexRecycle.getBuffer().getTextureId()) {
            recycle = this.mTextureFrameBufferRecycle;
        } else {
            recycle = this.mOut2DTexRecycle;
        }
        Recycle recycle2 = recycle;
        recycle2.addRef();
        TextureBufferImpl textureBufferImpl = new TextureBufferImpl(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), Type.RGB, i, matrix, (ToI420Interface) this, (Runnable) recycle2, (IExtraData) algorithmResult);
        textureBufferImpl.setROIInfo(stroiinfo);
        return new VideoFrame(textureBufferImpl, 0, videoFrame.getTimestampNs());
    }

    public int setBeautify(String str, float f, float f2, float f3) {
        final String callInfo = getCallInfo(str, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3));
        Handler handler = this.mHandler;
        final String str2 = str;
        final float f4 = f;
        final float f5 = f2;
        final float f6 = f3;
        C5106210 r4 = new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int beautify = FilterManager.this.mEffect.setBeautify(str2, f4, f5, f6);
                    if (beautify != 0) {
                        FilterManager.this.mErrorListener.onError(beautify, callInfo);
                    }
                }
            }
        };
        handler.post(r4);
        return 0;
    }

    public void processPanEvent(float f, float f2, float f3, float f4, float f5) {
        Handler handler = this.mHandler;
        final float f6 = f;
        final float f7 = f2;
        final float f8 = f3;
        final float f9 = f4;
        final float f10 = f5;
        C5108632 r1 = new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processPanEvent(f6, f7, f8, f9, f10);
                }
            }
        };
        handler.post(r1);
    }

    public int composerReplaceNodesWithTags(String[] strArr, int i, String[] strArr2, int i2, String[] strArr3) {
        final String callInfo = getCallInfo(strArr, Integer.valueOf(i), strArr2, Integer.valueOf(i2), strArr3);
        Handler handler = this.mHandler;
        final String[] strArr4 = strArr;
        final int i3 = i;
        final String[] strArr5 = strArr2;
        final int i4 = i2;
        final String[] strArr6 = strArr3;
        C5108430 r0 = new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    int composerReplaceNodesWithTags = FilterManager.this.mEffect.composerReplaceNodesWithTags(strArr4, i3, strArr5, i4, strArr6);
                    if (composerReplaceNodesWithTags != 0) {
                        FilterManager.this.mErrorListener.onError(composerReplaceNodesWithTags, callInfo);
                    }
                }
            }
        };
        handler.post(r0);
        return 0;
    }

    public void onAudioFrameAvailable(java.nio.Buffer buffer, int i, int i2, int i3, long j) {
        if (!(buffer instanceof ByteBuffer) || !buffer.isDirect()) {
            throw new AndroidRuntimeException("Audio buffer should be a direct byte buffer!");
        } else if (i * 100 != i2) {
            throw new AndroidRuntimeException("Audio data should be 10ms per frame!");
        } else if (this.mAudioRecognizing) {
            Handler handler = this.mHandler;
            final java.nio.Buffer buffer2 = buffer;
            final int i4 = i;
            final int i5 = i2;
            final int i6 = i3;
            C5107320 r0 = new Runnable() {
                public void run() {
                    if (FilterManager.this.isValid()) {
                        int startAudioRecognize = FilterManager.this.mEffect.startAudioRecognize((ByteBuffer) buffer2, i4, i5, i6);
                        if (startAudioRecognize != 0) {
                            ErrorListener errorListener = FilterManager.this.mErrorListener;
                            StringBuilder sb = new StringBuilder("startAudioRecognize(ByteBuffer, ");
                            sb.append(i4);
                            sb.append(", ");
                            sb.append(i5);
                            sb.append(", ");
                            sb.append(i6);
                            sb.append(")");
                            errorListener.onError(startAudioRecognize, sb.toString());
                        }
                    }
                }
            };
            handler.post(r0);
        }
    }

    public void configEffect(int i, int i2, String str, String str2, boolean z, boolean z2, String str3, AssetManager assetManager, Object obj) {
        Handler handler = this.mHandler;
        final Object obj2 = obj;
        final AssetManager assetManager2 = assetManager;
        final int i3 = i;
        final int i4 = i2;
        final String str4 = str;
        final String str5 = str2;
        final boolean z3 = z;
        final boolean z4 = z2;
        final String str6 = str3;
        C511117 r0 = new Runnable() {
            public void run() {
                if (FilterManager.this.isValid()) {
                    if (obj2 != null) {
                        FilterManager.this.mEffect.setResourceFinder(obj2);
                    }
                    if (assetManager2 != null) {
                        FilterManager.this.mEffect.setAssetManager(assetManager2);
                    }
                    FilterManager.this.mEffect.configEffect(i3, i4, str4, str5, z3, z4, str6);
                    if (FilterManager.this.mMsgListener != null) {
                        FilterManager.this.mMsgListener.onMessageReceived(2139095041, 0, 0, null);
                    }
                }
            }
        };
        handler.post(r0);
    }
}
