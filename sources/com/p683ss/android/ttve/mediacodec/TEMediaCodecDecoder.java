package com.p683ss.android.ttve.mediacodec;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.p683ss.android.ttve.common.C20071a;
import com.p683ss.android.ttve.common.C20073c;
import com.p683ss.android.ttve.common.C20078g;
import com.p683ss.android.ugc.aweme.feed.experiment.VideoPreloadSizeExperiment;
import com.p683ss.android.vesdk.C50792y;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: com.ss.android.ttve.mediacodec.TEMediaCodecDecoder */
public class TEMediaCodecDecoder implements OnFrameAvailableListener {
    private static final int ERROR_EOF = -1;
    private static final int ERROR_FAIL = -2;
    private static final int ERROR_OK = 0;
    private static final int ERROR_UNUSUAL = -3;
    private static final int MSG_RECEIVE_OUTPUTBUFFER = 0;
    private static final String TAG = "TEMediaCodecDecoder";
    private static final String VIDEO_MIME_TYPE = "video/avc";
    private static String mPlatform = null;
    private static String mVersion = null;
    private static final boolean m_verbose = false;
    private static int sDequeueOutputTimeoutUs = 30000;
    private static int sPendingInputBufferThreshold = 2;
    private final int MAX_DELAY_COUNT = 10;
    private final long MAX_SLEEP_MS = 0;
    private HandlerThread m_DecodeThread = new HandlerThread("mediacodec_decode");
    public Handler m_Decodehandler;
    private Handler m_MediaCodechandler;
    private boolean m_bIsNeedReconfigure;
    private BufferInfo m_bufferInfo = new BufferInfo();
    private MediaCodec m_decoder = null;
    private volatile boolean m_decoderStarted = false;
    private C20073c m_eglStateSaver = null;
    private ByteBuffer m_extraDataBuf;
    public volatile boolean m_firstInputBufferQueued = false;
    public final Object m_flushSyncbject = new Object();
    private MediaFormat m_format;
    private boolean m_frameAvailable = false;
    private volatile boolean m_frameFlushing = false;
    private boolean m_frameReleaseAvailable = true;
    private final Object m_frameReleaseObject = new Object();
    private final Object m_frameSyncObject = new Object();
    private HandlerThread m_handleThread = new HandlerThread("mediacodec_callback");
    private int m_iCurCount = 0;
    private int m_iHeight;
    private int m_iOutputHeight;
    private int m_iOutputWidth;
    private int m_iWidth;
    private volatile boolean m_inputBufferQueued = false;
    private volatile int m_pendingInputFrameCount = 0;
    private ByteBuffer m_ppsBuf;
    private volatile boolean m_sawInputEOS = false;
    private volatile boolean m_sawOutputEOS = false;
    private C20078g m_sharedContext = null;
    private ByteBuffer m_spsBuf;
    private Surface m_surface;
    private int[] m_surfaceTexID = new int[1];
    private SurfaceTexture m_surfaceTexture;
    private C20090b m_textureRender = null;
    private volatile long m_timestampOfCurTexFrame = Long.MIN_VALUE;
    private volatile long m_timestampOfLastDecodedFrame = Long.MIN_VALUE;
    private volatile int retCodeInput = -2;
    public volatile int retCodeOutput = -2;

    /* renamed from: com.ss.android.ttve.mediacodec.TEMediaCodecDecoder$a */
    public static class C20089a {

        /* renamed from: a */
        public int f55224a;

        /* renamed from: b */
        public int f55225b;
    }

    /* renamed from: com.ss.android.ttve.mediacodec.TEMediaCodecDecoder$b */
    static class C20090b {

        /* renamed from: a */
        int f55226a;

        /* renamed from: b */
        int f55227b;

        /* renamed from: c */
        int f55228c;

        /* renamed from: d */
        int f55229d;

        /* renamed from: e */
        int f55230e;

        /* renamed from: f */
        int[] f55231f = new int[1];

        /* renamed from: g */
        private final float[] f55232g = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

        /* renamed from: h */
        private FloatBuffer f55233h = ByteBuffer.allocateDirect(this.f55232g.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();

        /* renamed from: i */
        private float[] f55234i = new float[16];

        /* renamed from: j */
        private float[] f55235j = new float[16];

        /* renamed from: a */
        public static void m49603a(String str) {
            do {
            } while (GLES20.glGetError() != 0);
        }

        public C20090b(SurfaceTexture surfaceTexture) {
            this.f55233h.put(this.f55232g).position(0);
            if (surfaceTexture != null) {
                surfaceTexture.getTransformMatrix(this.f55235j);
            } else {
                Matrix.setIdentityM(this.f55235j, 0);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo42213a(int i, String str) {
            int glCreateShader = GLES20.glCreateShader(i);
            StringBuilder sb = new StringBuilder("glCreateShader type=");
            sb.append(i);
            m49603a(sb.toString());
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] != 0) {
                return glCreateShader;
            }
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }

        /* renamed from: a */
        public final void mo42214a(int i, int i2, int i3, int i4) throws IOException {
            GLES20.glViewport(0, 0, i, i2);
            GLES20.glBindTexture(3553, i4);
            m49603a("glBindTexture");
            GLES20.glBindFramebuffer(36160, this.f55231f[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, i4, 0);
            m49603a("glFramebufferTexture2D");
            m49603a("onDrawFrame start");
            GLES20.glClearColor(0.0f, 1.0f, 0.0f, 1.0f);
            GLES20.glClear(16640);
            GLES20.glUseProgram(this.f55226a);
            m49603a("glUseProgram");
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i3);
            m49603a("glBindTexture");
            this.f55233h.position(0);
            GLES20.glVertexAttribPointer(this.f55229d, 3, 5126, false, 20, this.f55233h);
            m49603a("glVertexAttribPointer maPosition");
            GLES20.glEnableVertexAttribArray(this.f55229d);
            m49603a("glEnableVertexAttribArray maPositionHandle");
            this.f55233h.position(3);
            GLES20.glVertexAttribPointer(this.f55230e, 2, 5126, false, 20, this.f55233h);
            m49603a("glVertexAttribPointer maTextureHandle");
            GLES20.glEnableVertexAttribArray(this.f55230e);
            m49603a("glEnableVertexAttribArray maTextureHandle");
            Matrix.setIdentityM(this.f55234i, 0);
            GLES20.glUniformMatrix4fv(this.f55227b, 1, false, this.f55234i, 0);
            GLES20.glUniformMatrix4fv(this.f55228c, 1, false, this.f55235j, 0);
            GLES20.glDrawArrays(5, 0, 4);
            m49603a("glDrawArrays");
            GLES20.glDisableVertexAttribArray(this.f55229d);
            GLES20.glDisableVertexAttribArray(this.f55230e);
            GLES20.glBindTexture(36197, 0);
            GLES20.glBindTexture(3553, 0);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glFinish();
        }

        /* renamed from: a */
        public final void mo42215a(int i, int i2, int i3, int i4, int i5, int i6) {
            if (i > 0 && i2 > 0 && i4 >= i3 && i6 >= i5 && i6 <= i && i4 <= i2) {
                float f = (float) i;
                float f2 = (((float) i5) * 1.0f) / f;
                this.f55232g[3] = f2;
                float f3 = (float) i2;
                float f4 = (((float) i3) * 1.0f) / f3;
                this.f55232g[4] = f4;
                float f5 = (((float) i6) * 1.0f) / f;
                this.f55232g[8] = f5;
                this.f55232g[9] = f4;
                this.f55232g[13] = f2;
                float f6 = (((float) i4) * 1.0f) / f3;
                this.f55232g[14] = f6;
                this.f55232g[18] = f5;
                this.f55232g[19] = f6;
                this.f55233h.clear();
                this.f55233h.put(this.f55232g).position(0);
            }
        }
    }

    private boolean IsValid() {
        if (this.m_decoder != null) {
            return true;
        }
        return false;
    }

    private int restartDecoder() {
        stopDecoder();
        return startDecoder();
    }

    public int closeEncoder() {
        stopDecoder();
        deleteTexture();
        return 0;
    }

    private void deleteTexture() {
        if (this.m_surfaceTexID[0] != 0) {
            GLES20.glDeleteTextures(1, this.m_surfaceTexID, 0);
            this.m_surfaceTexID[0] = 0;
        }
    }

    public int asynsFlushDecoder() {
        this.m_frameFlushing = true;
        synchronized (this.m_frameReleaseObject) {
            this.m_frameReleaseObject.notifyAll();
        }
        synchronized (this.m_flushSyncbject) {
            flushDecoder();
        }
        this.m_frameFlushing = false;
        return 0;
    }

    private boolean AwaitFrameRelease() {
        if (this.m_frameFlushing) {
            return false;
        }
        synchronized (this.m_frameReleaseObject) {
            do {
                if (!this.m_frameReleaseAvailable) {
                    try {
                        this.m_frameReleaseObject.wait();
                    } catch (InterruptedException unused) {
                        return false;
                    }
                } else {
                    this.m_frameReleaseAvailable = false;
                    return true;
                }
            } while (this.m_frameReleaseAvailable);
            return false;
        }
    }

    public static boolean IsInAndriodHardwareBlacklist() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str.compareTo("Meizu") == 0 && str2.compareTo("m2") == 0) {
            return true;
        }
        if (str.compareTo("Xiaomi") == 0 && str2.compareTo("MI 4W") == 0) {
            return true;
        }
        return false;
    }

    public static boolean IsInAndriodHardwareWhitelist() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str.compareTo("samsung") == 0 && str2.compareTo("GT-I9152") == 0) {
            return true;
        }
        if (str.compareTo("HUAWEI") == 0 && str2.compareTo("HUAWEI P6-C00") == 0) {
            return true;
        }
        return false;
    }

    private int createTexture() {
        GLES20.glGenTextures(1, this.m_surfaceTexID, 0);
        if (this.m_surfaceTexID[0] <= 0) {
            return 0;
        }
        GLES20.glBindTexture(36197, this.m_surfaceTexID[0]);
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, VideoPreloadSizeExperiment.DEFAULT, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        return this.m_surfaceTexID[0];
    }

    public static int getMaxMediaCodecVideoDecoderCount() {
        MediaCodecInfo mediaCodecInfo21 = getMediaCodecInfo21(VIDEO_MIME_TYPE);
        if (mediaCodecInfo21 == null) {
            C50792y.m109914d(TAG, "MediaCodecInfo is null!");
            return -2;
        }
        int maxSupportedInstances = mediaCodecInfo21.getCapabilitiesForType(VIDEO_MIME_TYPE).getMaxSupportedInstances();
        String str = TAG;
        StringBuilder sb = new StringBuilder("getMaxMediaCodecVideoDecoderCount ");
        sb.append(maxSupportedInstances);
        C50792y.m109909a(str, sb.toString());
        return maxSupportedInstances;
    }

    public void CleanupDecoder() {
        if (this.m_decoder != null) {
            if (this.m_decoderStarted) {
                try {
                    if (this.m_inputBufferQueued) {
                        this.m_decoder.flush();
                        this.m_inputBufferQueued = false;
                    }
                    this.m_decoder.stop();
                } catch (Exception unused) {
                }
                this.m_decoderStarted = false;
            }
            this.m_decoder.release();
            this.m_decoder = null;
        }
        this.m_timestampOfLastDecodedFrame = Long.MIN_VALUE;
        this.m_timestampOfCurTexFrame = Long.MIN_VALUE;
        this.m_pendingInputFrameCount = 0;
        this.m_sawInputEOS = false;
        this.m_sawOutputEOS = false;
    }

    public int flushDecoder() {
        if (this.m_decoder != null) {
            try {
                if (!this.m_sawInputEOS) {
                    if (!this.m_sawOutputEOS) {
                        if (this.m_inputBufferQueued) {
                            this.m_decoder.flush();
                            this.m_inputBufferQueued = false;
                            this.m_pendingInputFrameCount = 0;
                            return 0;
                        }
                    }
                }
                CleanupDecoder();
                if (!SetupDecoder(VIDEO_MIME_TYPE)) {
                    return -2;
                }
                return 0;
            } catch (Exception unused) {
            }
        }
        return -3;
    }

    private int stopDecoder() {
        this.m_DecodeThread.quit();
        if (this.m_Decodehandler != null) {
            this.m_Decodehandler.removeCallbacksAndMessages(null);
            this.m_firstInputBufferQueued = false;
        }
        CleanupDecoder();
        this.m_handleThread.quit();
        if (this.m_textureRender != null) {
            C20090b bVar = this.m_textureRender;
            if (bVar.f55226a != 0) {
                GLES20.glDeleteProgram(bVar.f55226a);
                bVar.f55226a = 0;
            }
            if (bVar.f55231f[0] != 0) {
                GLES20.glDeleteFramebuffers(1, bVar.f55231f, 0);
            }
            this.m_textureRender = null;
        }
        if (this.m_surface != null) {
            this.m_surface.release();
            this.m_surface = null;
        }
        if (this.m_surfaceTexture != null) {
            this.m_surfaceTexture.setOnFrameAvailableListener(null);
            this.m_surfaceTexture.release();
            this.m_surfaceTexture = null;
        }
        return 0;
    }

    private void tryGetPlatformAndVersion() {
        if (mPlatform == null || mVersion == null) {
            String lowerCase = C20071a.m49580a().toLowerCase();
            if (lowerCase.contains("qualcomm")) {
                mPlatform = "qualcomm";
                if (lowerCase.contains("sdm660")) {
                    mVersion = "sdm660";
                } else if (lowerCase.contains("msm8994")) {
                    mVersion = "msm8994";
                } else if (lowerCase.contains("sdm845")) {
                    mVersion = "sdm845";
                } else if (lowerCase.contains("sm8150")) {
                    mVersion = "sm8150";
                } else {
                    mVersion = "";
                }
            }
        }
    }

    private int reconfigureMediaFormat() {
        MediaCodecInfo mediaCodecInfo;
        int i = 0;
        try {
            if (VERSION.SDK_INT >= 21) {
                mediaCodecInfo = getMediaCodecInfo21(VIDEO_MIME_TYPE);
            } else {
                mediaCodecInfo = getMediaCodecInfo(VIDEO_MIME_TYPE);
            }
            if (mediaCodecInfo == null) {
                C50792y.m109914d(TAG, "MediaCodecInfo is null!");
                return -2;
            } else if (!mediaCodecInfo.getCapabilitiesForType(VIDEO_MIME_TYPE).getVideoCapabilities().isSizeSupported(this.m_iWidth, this.m_iHeight)) {
                String str = TAG;
                StringBuilder sb = new StringBuilder("is not size support! width: ");
                sb.append(this.m_iWidth);
                sb.append(" height: ");
                sb.append(this.m_iHeight);
                C50792y.m109914d(str, sb.toString());
                return -3;
            } else {
                this.m_format = MediaFormat.createVideoFormat(VIDEO_MIME_TYPE, this.m_iWidth, this.m_iHeight);
                if (this.m_spsBuf != null) {
                    this.m_format.setByteBuffer("csd-0", this.m_spsBuf);
                }
                if (this.m_ppsBuf != null) {
                    this.m_format.setByteBuffer("csd-1", this.m_ppsBuf);
                }
                if (VERSION.SDK_INT == 16) {
                    this.m_format.setInteger("max-input-size", 0);
                }
                return i;
            }
        } catch (Exception unused) {
            i = -1;
        }
    }

    public int receiveBufferFromDecoder() throws IOException {
        int i;
        int dequeueOutputBuffer;
        if (this.m_decoder == null || !this.m_firstInputBufferQueued) {
            this.retCodeOutput = -2;
            this.m_Decodehandler.sendEmptyMessage(0);
            return -2;
        }
        int i2 = sPendingInputBufferThreshold;
        int i3 = sDequeueOutputTimeoutUs;
        if (this.m_sawOutputEOS) {
            i = i3 * 20;
        } else if (this.m_pendingInputFrameCount > i2) {
            i = i3;
        } else {
            i = 0;
        }
        while (true) {
            dequeueOutputBuffer = this.m_decoder.dequeueOutputBuffer(this.m_bufferInfo, (long) i);
            if (dequeueOutputBuffer != -3) {
                if (dequeueOutputBuffer != -2) {
                    break;
                }
                MediaFormat outputFormat = this.m_decoder.getOutputFormat();
                int integer = outputFormat.getInteger("width");
                int integer2 = outputFormat.getInteger("height");
                int integer3 = outputFormat.getInteger("crop-left");
                int integer4 = outputFormat.getInteger("crop-right");
                this.m_textureRender.mo42215a(integer, integer2, outputFormat.getInteger("crop-top"), outputFormat.getInteger("crop-bottom"), integer3, integer4);
            }
        }
        if (dequeueOutputBuffer == -1) {
            this.m_Decodehandler.sendEmptyMessage(0);
        } else if (dequeueOutputBuffer < 0) {
            this.m_Decodehandler.sendEmptyMessage(0);
            this.retCodeOutput = -2;
            return -2;
        } else {
            boolean z = true;
            if ((this.m_bufferInfo.flags & 4) != 0) {
                this.m_sawOutputEOS = true;
            }
            if (AwaitFrameRelease()) {
                if (!this.m_sawOutputEOS) {
                    this.m_timestampOfLastDecodedFrame = this.m_bufferInfo.presentationTimeUs;
                    this.m_pendingInputFrameCount--;
                } else {
                    z = false;
                }
                this.m_decoder.releaseOutputBuffer(dequeueOutputBuffer, z);
                if (z) {
                    this.m_Decodehandler.sendEmptyMessage(0);
                    this.retCodeOutput = 0;
                    return 0;
                }
                this.m_Decodehandler.removeCallbacksAndMessages(null);
                this.m_firstInputBufferQueued = false;
                this.retCodeOutput = -1;
                return -1;
            }
            this.m_Decodehandler.removeMessages(0);
            this.m_firstInputBufferQueued = false;
        }
        this.retCodeOutput = -2;
        return -2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0136  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int startDecoder() {
        /*
            r8 = this;
            boolean r0 = r8.IsValid()
            r1 = -1
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = com.p683ss.android.vesdk.C50629aj.f126911c
            if (r0 == 0) goto L_0x000f
            r8.tryGetPlatformAndVersion()
        L_0x000f:
            int[] r0 = r8.m_surfaceTexID
            r2 = 0
            r0 = r0[r2]
            if (r0 != 0) goto L_0x001a
            int r0 = r8.createTexture()
        L_0x001a:
            if (r0 != 0) goto L_0x001d
            return r1
        L_0x001d:
            android.graphics.SurfaceTexture r3 = new android.graphics.SurfaceTexture     // Catch:{ Exception -> 0x013e }
            r3.<init>(r0)     // Catch:{ Exception -> 0x013e }
            r8.m_surfaceTexture = r3     // Catch:{ Exception -> 0x013e }
            android.os.HandlerThread r0 = r8.m_handleThread     // Catch:{ Exception -> 0x013e }
            r0.start()     // Catch:{ Exception -> 0x013e }
            android.os.Handler r0 = new android.os.Handler     // Catch:{ Exception -> 0x013e }
            android.os.HandlerThread r3 = r8.m_handleThread     // Catch:{ Exception -> 0x013e }
            android.os.Looper r3 = r3.getLooper()     // Catch:{ Exception -> 0x013e }
            r0.<init>(r3)     // Catch:{ Exception -> 0x013e }
            r8.m_MediaCodechandler = r0     // Catch:{ Exception -> 0x013e }
            boolean r0 = com.p683ss.android.vesdk.C50629aj.f126913e     // Catch:{ Exception -> 0x013e }
            if (r0 == 0) goto L_0x004c
            android.os.HandlerThread r0 = r8.m_DecodeThread     // Catch:{ Exception -> 0x013e }
            r0.start()     // Catch:{ Exception -> 0x013e }
            com.ss.android.ttve.mediacodec.TEMediaCodecDecoder$1 r0 = new com.ss.android.ttve.mediacodec.TEMediaCodecDecoder$1     // Catch:{ Exception -> 0x013e }
            android.os.HandlerThread r3 = r8.m_DecodeThread     // Catch:{ Exception -> 0x013e }
            android.os.Looper r3 = r3.getLooper()     // Catch:{ Exception -> 0x013e }
            r0.<init>(r3)     // Catch:{ Exception -> 0x013e }
            r8.m_Decodehandler = r0     // Catch:{ Exception -> 0x013e }
        L_0x004c:
            android.graphics.SurfaceTexture r0 = r8.m_surfaceTexture     // Catch:{ Exception -> 0x013e }
            android.os.Handler r3 = r8.m_MediaCodechandler     // Catch:{ Exception -> 0x013e }
            r0.setOnFrameAvailableListener(r8, r3)     // Catch:{ Exception -> 0x013e }
            android.view.Surface r0 = new android.view.Surface     // Catch:{ Exception -> 0x013e }
            android.graphics.SurfaceTexture r3 = r8.m_surfaceTexture     // Catch:{ Exception -> 0x013e }
            r0.<init>(r3)     // Catch:{ Exception -> 0x013e }
            r8.m_surface = r0     // Catch:{ Exception -> 0x013e }
            com.ss.android.ttve.mediacodec.TEMediaCodecDecoder$b r0 = new com.ss.android.ttve.mediacodec.TEMediaCodecDecoder$b
            android.graphics.SurfaceTexture r3 = r8.m_surfaceTexture
            r0.<init>(r3)
            r8.m_textureRender = r0
            com.ss.android.ttve.mediacodec.TEMediaCodecDecoder$b r0 = r8.m_textureRender
            java.lang.String r3 = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n"
            java.lang.String r4 = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n"
            r5 = 35633(0x8b31, float:4.9932E-41)
            int r3 = r0.mo42213a(r5, r3)
            r5 = 1
            if (r3 != 0) goto L_0x0077
        L_0x0075:
            r6 = 0
            goto L_0x00ad
        L_0x0077:
            r6 = 35632(0x8b30, float:4.9931E-41)
            int r4 = r0.mo42213a(r6, r4)
            if (r4 != 0) goto L_0x0081
            goto L_0x0075
        L_0x0081:
            int r6 = android.opengl.GLES20.glCreateProgram()
            java.lang.String r7 = "glCreateProgram"
            com.p683ss.android.ttve.mediacodec.TEMediaCodecDecoder.C20090b.m49603a(r7)
            android.opengl.GLES20.glAttachShader(r6, r3)
            java.lang.String r3 = "glAttachShader"
            com.p683ss.android.ttve.mediacodec.TEMediaCodecDecoder.C20090b.m49603a(r3)
            android.opengl.GLES20.glAttachShader(r6, r4)
            java.lang.String r3 = "glAttachShader"
            com.p683ss.android.ttve.mediacodec.TEMediaCodecDecoder.C20090b.m49603a(r3)
            android.opengl.GLES20.glLinkProgram(r6)
            int[] r3 = new int[r5]
            r4 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r6, r4, r3, r2)
            r3 = r3[r2]
            if (r3 == r5) goto L_0x00ad
            android.opengl.GLES20.glDeleteProgram(r6)
            goto L_0x0075
        L_0x00ad:
            r0.f55226a = r6
            int r3 = r0.f55226a
            if (r3 == 0) goto L_0x0136
            int r3 = r0.f55226a
            java.lang.String r4 = "aPosition"
            int r3 = android.opengl.GLES20.glGetAttribLocation(r3, r4)
            r0.f55229d = r3
            java.lang.String r3 = "glGetAttribLocation aPosition"
            com.p683ss.android.ttve.mediacodec.TEMediaCodecDecoder.C20090b.m49603a(r3)
            int r3 = r0.f55229d
            if (r3 == r1) goto L_0x012e
            int r3 = r0.f55226a
            java.lang.String r4 = "aTextureCoord"
            int r3 = android.opengl.GLES20.glGetAttribLocation(r3, r4)
            r0.f55230e = r3
            java.lang.String r3 = "glGetAttribLocation aTextureCoord"
            com.p683ss.android.ttve.mediacodec.TEMediaCodecDecoder.C20090b.m49603a(r3)
            int r3 = r0.f55230e
            if (r3 == r1) goto L_0x0126
            int r3 = r0.f55226a
            java.lang.String r4 = "uMVPMatrix"
            int r3 = android.opengl.GLES20.glGetUniformLocation(r3, r4)
            r0.f55227b = r3
            java.lang.String r3 = "glGetUniformLocation uMVPMatrix"
            com.p683ss.android.ttve.mediacodec.TEMediaCodecDecoder.C20090b.m49603a(r3)
            int r3 = r0.f55227b
            if (r3 == r1) goto L_0x011e
            int r3 = r0.f55226a
            java.lang.String r4 = "uSTMatrix"
            int r3 = android.opengl.GLES20.glGetUniformLocation(r3, r4)
            r0.f55228c = r3
            java.lang.String r3 = "glGetUniformLocation uSTMatrix"
            com.p683ss.android.ttve.mediacodec.TEMediaCodecDecoder.C20090b.m49603a(r3)
            int r3 = r0.f55228c
            if (r3 == r1) goto L_0x0116
            int[] r0 = r0.f55231f
            android.opengl.GLES20.glGenFramebuffers(r5, r0, r2)
            java.lang.String r0 = "glGenFramebuffers"
            com.p683ss.android.ttve.mediacodec.TEMediaCodecDecoder.C20090b.m49603a(r0)
            java.lang.String r0 = "video/avc"
            boolean r0 = r8.SetupDecoder(r0)
            if (r0 != 0) goto L_0x0115
            r8.stopDecoder()
            return r1
        L_0x0115:
            return r2
        L_0x0116:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Could not get attrib location for uSTMatrix"
            r0.<init>(r1)
            throw r0
        L_0x011e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Could not get attrib location for uMVPMatrix"
            r0.<init>(r1)
            throw r0
        L_0x0126:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Could not get attrib location for aTextureCoord"
            r0.<init>(r1)
            throw r0
        L_0x012e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Could not get attrib location for aPosition"
            r0.<init>(r1)
            throw r0
        L_0x0136:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "failed creating program"
            r0.<init>(r1)
            throw r0
        L_0x013e:
            r8.stopDecoder()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ttve.mediacodec.TEMediaCodecDecoder.startDecoder():int");
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.m_frameSyncObject) {
            this.m_frameAvailable = true;
            this.m_frameSyncObject.notifyAll();
        }
    }

    private boolean AwaitNewImage(int i) {
        synchronized (this.m_frameSyncObject) {
            do {
                if (!this.m_frameAvailable) {
                    try {
                        this.m_frameSyncObject.wait((long) i);
                    } catch (InterruptedException unused) {
                        return false;
                    }
                } else {
                    this.m_frameAvailable = false;
                    return true;
                }
            } while (this.m_frameAvailable);
            return false;
        }
    }

    private boolean SetupDecoder(String str) {
        try {
            this.m_decoder = MediaCodec.createDecoderByType(str);
            this.m_decoder.configure(this.m_format, this.m_surface, null, 0);
            this.m_decoder.start();
            this.m_decoderStarted = true;
            this.m_iCurCount = 0;
            return true;
        } catch (Exception unused) {
            CleanupDecoder();
            return false;
        }
    }

    private ByteBuffer getInputBufferByIdx(int i) {
        if (VERSION.SDK_INT >= 21) {
            return this.m_decoder.getInputBuffer(i);
        }
        return this.m_decoder.getInputBuffers()[i];
    }

    public static void setDecodeParams(C20089a aVar) {
        String str = TAG;
        StringBuilder sb = new StringBuilder("setDecodeParams ");
        sb.append(aVar.f55225b);
        sb.append(", ");
        sb.append(aVar.f55224a);
        C50792y.m109909a(str, sb.toString());
        sPendingInputBufferThreshold = aVar.f55225b;
        sDequeueOutputTimeoutUs = aVar.f55224a;
    }

    private static MediaCodecInfo getMediaCodecInfo(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (!codecInfoAt.isEncoder()) {
                String name = codecInfoAt.getName();
                if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                    String[] supportedTypes = codecInfoAt.getSupportedTypes();
                    for (String equalsIgnoreCase : supportedTypes) {
                        if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                            return codecInfoAt;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    private static MediaCodecInfo getMediaCodecInfo21(String str) {
        MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
        if (codecInfos == null || codecInfos.length == 0) {
            return null;
        }
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (mediaCodecInfo != null && !mediaCodecInfo.isEncoder()) {
                String name = mediaCodecInfo.getName();
                if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    for (String equalsIgnoreCase : supportedTypes) {
                        if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                            return mediaCodecInfo;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    public int getInfoByFlag(int[] iArr, int i) {
        if (i == 1) {
            iArr[0] = (int) (this.m_timestampOfLastDecodedFrame & -1);
            iArr[1] = (int) (-1 & (this.m_timestampOfLastDecodedFrame >> 32));
            return 2;
        } else if (i != 2) {
            return 0;
        } else {
            iArr[0] = (int) (this.m_timestampOfCurTexFrame & -1);
            iArr[1] = (int) (-1 & (this.m_timestampOfCurTexFrame >> 32));
            return 2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int sendBufferToDecoder(byte[] r18, int r19, long r20) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r4 = r19
            int r1 = sDequeueOutputTimeoutUs
            boolean r2 = r0.m_sawInputEOS
            r8 = 1
            r9 = 0
            if (r2 != 0) goto L_0x0058
            android.media.MediaCodec r2 = r0.m_decoder
            long r5 = (long) r1
            int r1 = r2.dequeueInputBuffer(r5)
            r2 = 0
        L_0x0014:
            if (r1 >= 0) goto L_0x0026
            r10 = 5
            java.lang.Thread.sleep(r10, r9)     // Catch:{ InterruptedException -> 0x001b }
        L_0x001b:
            android.media.MediaCodec r1 = r0.m_decoder
            int r1 = r1.dequeueInputBuffer(r5)
            int r2 = r2 + r8
            r3 = 20
            if (r2 < r3) goto L_0x0014
        L_0x0026:
            r11 = r1
            if (r11 < 0) goto L_0x0059
            java.nio.ByteBuffer r1 = r0.getInputBufferByIdx(r11)
            if (r4 != 0) goto L_0x003d
            android.media.MediaCodec r10 = r0.m_decoder
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 4
            r10.queueInputBuffer(r11, r12, r13, r14, r16)
            r0.m_sawInputEOS = r8
            goto L_0x0058
        L_0x003d:
            r1.clear()
            r2 = r18
            r1.put(r2, r9, r4)
            android.media.MediaCodec r1 = r0.m_decoder
            r3 = 0
            r7 = 0
            r2 = r11
            r4 = r19
            r5 = r20
            r1.queueInputBuffer(r2, r3, r4, r5, r7)
            r0.m_inputBufferQueued = r8
            int r1 = r0.m_pendingInputFrameCount
            int r1 = r1 + r8
            r0.m_pendingInputFrameCount = r1
        L_0x0058:
            r8 = 0
        L_0x0059:
            if (r8 == 0) goto L_0x005f
            r1 = -3
            r0.retCodeInput = r1
            return r1
        L_0x005f:
            r0.retCodeInput = r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ttve.mediacodec.TEMediaCodecDecoder.sendBufferToDecoder(byte[], int, long):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x006b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int DecodeFrame2Surface(byte[] r20, int r21, long r22) throws java.io.IOException {
        /*
            r19 = this;
            r0 = r19
            r4 = r21
            int r8 = sPendingInputBufferThreshold
            int r9 = sDequeueOutputTimeoutUs
            boolean r1 = r0.m_sawInputEOS
            r10 = 0
            r11 = 1
            if (r1 != 0) goto L_0x005d
            android.media.MediaCodec r1 = r0.m_decoder
            long r2 = (long) r9
            int r1 = r1.dequeueInputBuffer(r2)
            r5 = 0
        L_0x0016:
            if (r1 >= 0) goto L_0x0028
            r6 = 5
            java.lang.Thread.sleep(r6, r10)     // Catch:{ InterruptedException -> 0x001d }
        L_0x001d:
            android.media.MediaCodec r1 = r0.m_decoder
            int r1 = r1.dequeueInputBuffer(r2)
            int r5 = r5 + r11
            r6 = 20
            if (r5 < r6) goto L_0x0016
        L_0x0028:
            r13 = r1
            if (r13 < 0) goto L_0x005b
            java.nio.ByteBuffer r1 = r0.getInputBufferByIdx(r13)
            if (r4 != 0) goto L_0x003f
            android.media.MediaCodec r12 = r0.m_decoder
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 4
            r12.queueInputBuffer(r13, r14, r15, r16, r18)
            r0.m_sawInputEOS = r11
            goto L_0x005d
        L_0x003f:
            r1.clear()
            r2 = r20
            r1.put(r2, r10, r4)
            android.media.MediaCodec r1 = r0.m_decoder
            r3 = 0
            r7 = 0
            r2 = r13
            r4 = r21
            r5 = r22
            r1.queueInputBuffer(r2, r3, r4, r5, r7)
            r0.m_inputBufferQueued = r11
            int r1 = r0.m_pendingInputFrameCount
            int r1 = r1 + r11
            r0.m_pendingInputFrameCount = r1
            goto L_0x005d
        L_0x005b:
            r1 = 1
            goto L_0x005e
        L_0x005d:
            r1 = 0
        L_0x005e:
            boolean r2 = r0.m_sawOutputEOS
            if (r2 == 0) goto L_0x0065
            int r9 = r9 * 20
            goto L_0x006b
        L_0x0065:
            int r2 = r0.m_pendingInputFrameCount
            if (r2 <= r8) goto L_0x006a
            goto L_0x006b
        L_0x006a:
            r9 = 0
        L_0x006b:
            android.media.MediaCodec r2 = r0.m_decoder
            android.media.MediaCodec$BufferInfo r3 = r0.m_bufferInfo
            long r4 = (long) r9
            int r2 = r2.dequeueOutputBuffer(r3, r4)
            r3 = -3
            if (r2 == r3) goto L_0x006b
            r4 = -2
            if (r2 != r4) goto L_0x00aa
            android.media.MediaCodec r2 = r0.m_decoder
            android.media.MediaFormat r2 = r2.getOutputFormat()
            java.lang.String r3 = "width"
            int r13 = r2.getInteger(r3)
            java.lang.String r3 = "height"
            int r14 = r2.getInteger(r3)
            java.lang.String r3 = "crop-left"
            int r17 = r2.getInteger(r3)
            java.lang.String r3 = "crop-right"
            int r18 = r2.getInteger(r3)
            java.lang.String r3 = "crop-top"
            int r15 = r2.getInteger(r3)
            java.lang.String r3 = "crop-bottom"
            int r16 = r2.getInteger(r3)
            com.ss.android.ttve.mediacodec.TEMediaCodecDecoder$b r12 = r0.m_textureRender
            r12.mo42215a(r13, r14, r15, r16, r17, r18)
            goto L_0x006b
        L_0x00aa:
            r5 = -1
            if (r2 == r5) goto L_0x00e9
            if (r2 >= 0) goto L_0x00b0
            return r4
        L_0x00b0:
            android.media.MediaCodec$BufferInfo r1 = r0.m_bufferInfo
            int r1 = r1.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x00ba
            r0.m_sawOutputEOS = r11
        L_0x00ba:
            boolean r1 = r0.m_sawOutputEOS
            if (r1 != 0) goto L_0x00ca
            android.media.MediaCodec$BufferInfo r1 = r0.m_bufferInfo
            long r6 = r1.presentationTimeUs
            r0.m_timestampOfLastDecodedFrame = r6
            int r1 = r0.m_pendingInputFrameCount
            int r1 = r1 - r11
            r0.m_pendingInputFrameCount = r1
            goto L_0x00cb
        L_0x00ca:
            r11 = 0
        L_0x00cb:
            android.media.MediaCodec r1 = r0.m_decoder
            r1.releaseOutputBuffer(r2, r11)
            if (r11 == 0) goto L_0x00e8
            r1 = 500(0x1f4, float:7.0E-43)
            boolean r1 = r0.AwaitNewImage(r1)
            if (r1 == 0) goto L_0x00e7
            android.media.MediaCodec$BufferInfo r1 = r0.m_bufferInfo
            long r1 = r1.presentationTimeUs
            r0.m_timestampOfCurTexFrame = r1
        L_0x00e0:
            int r1 = android.opengl.GLES20.glGetError()
            if (r1 != 0) goto L_0x00e0
            return r10
        L_0x00e7:
            return r4
        L_0x00e8:
            return r5
        L_0x00e9:
            if (r1 == 0) goto L_0x00ec
            return r3
        L_0x00ec:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ttve.mediacodec.TEMediaCodecDecoder.DecodeFrame2Surface(byte[], int, long):int");
    }

    public int decodeFrame(byte[] bArr, int i, long j, int i2, int i3, int i4) throws IOException {
        int i5;
        this.m_iOutputWidth = i3;
        this.m_iOutputHeight = i4;
        if (this.m_eglStateSaver == null) {
            this.m_eglStateSaver = new C20073c();
            this.m_eglStateSaver.mo42169a();
        }
        if (!EGL14.eglGetCurrentContext().equals(this.m_eglStateSaver.f55171a)) {
            this.m_bIsNeedReconfigure = true;
        }
        if (this.m_bIsNeedReconfigure) {
            restartDecoder();
            this.m_bIsNeedReconfigure = false;
            this.m_eglStateSaver.mo42169a();
        }
        if (this.m_decoder == null) {
            return -2;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            i5 = DecodeFrame2Surface(bArr, i, j);
        } catch (IllegalStateException unused) {
            i5 = -2;
        }
        long currentTimeMillis2 = 0 - (System.currentTimeMillis() - currentTimeMillis);
        if (this.m_iCurCount < 10 && currentTimeMillis2 > 0) {
            try {
                Thread.sleep(currentTimeMillis2, 0);
            } catch (InterruptedException unused2) {
            }
            this.m_iCurCount++;
        }
        if (i5 == 0) {
            this.m_surfaceTexture.updateTexImage();
            if (this.m_textureRender != null && i2 > 0) {
                this.m_textureRender.mo42214a(this.m_iOutputWidth, this.m_iOutputHeight, this.m_surfaceTexID[0], i2);
            }
        }
        return i5;
    }

    public int decodeFrameV2(byte[] bArr, int i, long j, int i2, int i3, int i4) throws IOException {
        this.m_iOutputWidth = i3;
        this.m_iOutputHeight = i4;
        if (this.m_eglStateSaver == null) {
            this.m_eglStateSaver = new C20073c();
            this.m_eglStateSaver.mo42169a();
        }
        if (!EGL14.eglGetCurrentContext().equals(this.m_eglStateSaver.f55171a)) {
            this.m_bIsNeedReconfigure = true;
        }
        if (this.m_bIsNeedReconfigure) {
            restartDecoder();
            this.m_bIsNeedReconfigure = false;
            this.m_eglStateSaver.mo42169a();
        }
        int i5 = -2;
        if (this.m_decoder == null) {
            return -2;
        }
        try {
            int sendBufferToDecoder = sendBufferToDecoder(bArr, i, j);
            if (!this.m_firstInputBufferQueued && sendBufferToDecoder == 0) {
                this.m_Decodehandler.sendEmptyMessage(0);
                this.m_firstInputBufferQueued = true;
            }
        } catch (IllegalStateException unused) {
        }
        if (AwaitNewImage(5)) {
            this.m_timestampOfCurTexFrame = this.m_bufferInfo.presentationTimeUs;
            i5 = this.retCodeOutput;
            this.m_surfaceTexture.updateTexImage();
            if (this.m_textureRender != null && i2 > 0) {
                this.m_textureRender.mo42214a(this.m_iOutputWidth, this.m_iOutputHeight, this.m_surfaceTexID[0], i2);
            }
            synchronized (this.m_frameReleaseObject) {
                this.m_frameReleaseAvailable = true;
                this.m_frameReleaseObject.notifyAll();
            }
        }
        return i5;
    }

    public int initDecoder(int i, int i2, byte[] bArr, int i3, byte[] bArr2, int i4, int i5, int i6) {
        int encoder = setEncoder(i, i2, bArr, i3, bArr2, i4, i5, i6);
        if (this.m_bIsNeedReconfigure) {
            encoder = reconfigureMediaFormat();
        }
        if (encoder != 0) {
            return encoder;
        }
        if (this.m_eglStateSaver == null) {
            this.m_eglStateSaver = new C20073c();
            this.m_eglStateSaver.mo42169a();
        }
        if (this.m_bIsNeedReconfigure) {
            restartDecoder();
            this.m_bIsNeedReconfigure = false;
        }
        return encoder;
    }

    public int setEncoder(int i, int i2, byte[] bArr, int i3, byte[] bArr2, int i4, int i5, int i6) {
        this.m_iWidth = i;
        this.m_iHeight = i2;
        this.m_iOutputWidth = i5;
        this.m_iOutputHeight = i6;
        this.m_spsBuf = null;
        this.m_ppsBuf = null;
        if (i3 > 0) {
            this.m_spsBuf = ByteBuffer.wrap(bArr, 0, i3);
        }
        if (i4 > 0) {
            this.m_ppsBuf = ByteBuffer.wrap(bArr2, 0, i4);
        }
        this.m_bIsNeedReconfigure = true;
        return 0;
    }
}
