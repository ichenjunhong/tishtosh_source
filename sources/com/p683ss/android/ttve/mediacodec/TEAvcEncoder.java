package com.p683ss.android.ttve.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.EncoderCapabilities;
import android.media.MediaFormat;
import android.os.Build.VERSION;
import android.support.p030v4.p033b.C0703a;
import android.view.Surface;
import com.C2240a;
import com.p683ss.android.ttve.common.C20073c;
import com.p683ss.android.ttve.common.C20078g;
import com.p683ss.android.ttve.common.C20082j;
import com.p683ss.android.vesdk.C50792y;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: com.ss.android.ttve.mediacodec.TEAvcEncoder */
public class TEAvcEncoder {
    private static boolean DEBUG = false;
    public static boolean FORCE_FAILED = false;
    private static final int MASK_BIT_RATE = 1;
    private static final int MASK_FORCE_RESTART = 4;
    private static final int MASK_FRAME_RATE = 2;
    private static int MAX_FRAME_RATE = 2000;
    private static long MAX_PRODUCT_OF_SIZE_AND_FPS = -1;
    private static int MIN_FRAME_RATE = 7;
    private static final String TAG = "TEAvcEncoder";
    private static final int TIMEOUT_USEC = 0;
    private static final int TIMEOUT_USEC_EOS = 10000;
    private static final String VIDEO_MIME_TYPE = "video/avc";
    private static int avcqueuesize = 25;
    public ArrayBlockingQueue<C20086a> AVCQueue = new ArrayBlockingQueue<>(avcqueuesize);
    public byte[] configByte = null;
    private int mBufferIndex = -1;
    private boolean mEndOfStream = false;
    private boolean mFirstFrame = true;
    private Queue<Long> m_PTSQueue = new LinkedList();
    private boolean m_bNeedSingalEnd = false;
    private boolean m_bSignalEndOfStream = false;
    private boolean m_bSuccessInit = false;
    private int m_bitRate = 0;
    private MediaFormat m_codecFormat = null;
    private int m_colorFormat = 0;
    private int m_configStatus = 0;
    private double m_dHpBitrateRatio = 0.75d;
    private C20073c m_eglStateSaver;
    private long m_encodeStartTime = -1;
    private int m_frameRate = 0;
    private long m_getnerateIndex = 0;
    private int m_height = 0;
    private int m_height_align = 0;
    private int m_iFrameInternal = 0;
    private boolean m_isNeedReconfigure = false;
    private C20086a m_lastCodecData = null;
    private int m_level = 0;
    private int m_maxBitRate = 0;
    private MediaCodec m_mediaCodec = null;
    private int m_profile = 0;
    private C20078g m_sharedContext;
    private Surface m_surface = null;
    private C20082j m_textureDrawer;
    private boolean m_useInputSurface = true;
    private int m_width = 0;
    private int m_width_align = 0;
    private byte[] pps;
    private byte[] sps;

    /* renamed from: com.ss.android.ttve.mediacodec.TEAvcEncoder$a */
    public static class C20086a {

        /* renamed from: a */
        public byte[] f55218a;

        /* renamed from: b */
        public long f55219b;

        /* renamed from: c */
        public long f55220c;

        /* renamed from: d */
        public int f55221d;
    }

    /* renamed from: com.ss.android.ttve.mediacodec.TEAvcEncoder$b */
    public static class C20087b {

        /* renamed from: a */
        public long f55222a;
    }

    public Surface getInputSurface() {
        return this.m_surface;
    }

    public static TEAvcEncoder createEncoderObject() {
        return new TEAvcEncoder();
    }

    public byte[] getExtraData() {
        if (this.configByte != null) {
            return this.configByte;
        }
        return new byte[0];
    }

    public void releaseTextureDrawer() {
        if (this.m_textureDrawer != null) {
            this.m_textureDrawer.mo42184b();
            this.m_textureDrawer = null;
        }
    }

    public int restartEncoder() {
        C50792y.m109909a(TAG, "restartEncoder...");
        this.m_bNeedSingalEnd = false;
        stopEncoder();
        int configEncode = configEncode();
        if (configEncode < 0) {
            return configEncode;
        }
        return startEncoder();
    }

    public void setSharedEGLContext() {
        if (this.m_eglStateSaver == null) {
            this.m_eglStateSaver = new C20073c();
            this.m_eglStateSaver.mo42169a();
        }
    }

    public void stopEncoder() {
        try {
            if (this.m_sharedContext != null) {
                this.m_sharedContext.mo42176b();
            }
            if (this.m_textureDrawer != null) {
                this.m_textureDrawer.mo42184b();
                this.m_textureDrawer = null;
            }
            if (this.m_mediaCodec != null) {
                this.m_mediaCodec.stop();
            }
        } catch (Exception unused) {
        }
    }

    public boolean initTextureDrawer() {
        if (this.m_textureDrawer != null) {
            this.m_textureDrawer.mo42184b();
            this.m_textureDrawer = null;
        }
        this.m_textureDrawer = C20082j.m49593a();
        if (this.m_textureDrawer == null) {
            return false;
        }
        this.m_textureDrawer.mo42181a(0.0f);
        this.m_textureDrawer.mo42182a(1.0f, -1.0f);
        return true;
    }

    public void releaseEncoder() {
        stopEncoder();
        C50792y.m109911b(TAG, "releaseEncoder");
        if (this.m_surface != null) {
            C50792y.m109911b(TAG, "release surface");
            this.m_surface.release();
            this.m_surface = null;
        }
        if (this.m_mediaCodec != null) {
            C50792y.m109911b(TAG, "release mediaCodec");
            this.m_mediaCodec.release();
            this.m_mediaCodec = null;
        }
        if (this.m_sharedContext != null) {
            this.m_sharedContext.mo42174a();
            this.m_sharedContext = null;
        }
    }

    private int configEncode() {
        try {
            if (this.m_surface != null) {
                this.m_surface.release();
                this.m_surface = null;
            }
            if (this.m_mediaCodec != null) {
                this.m_mediaCodec.release();
            }
            this.m_mediaCodec = MediaCodec.createEncoderByType(VIDEO_MIME_TYPE);
            MediaCodecInfo codecInfo = this.m_mediaCodec.getCodecInfo();
            if (codecInfo.getName().startsWith("OMX.google.")) {
                C50792y.m109914d(TAG, "mediaCodecInfo Name() startsWith OMX.google.");
                return -2;
            } else if (reconfigureMediaFormat(codecInfo) != 0) {
                C50792y.m109914d(TAG, "reconfigureMediaFormat failed");
                return -3;
            } else {
                this.m_mediaCodec.configure(this.m_codecFormat, null, null, 1);
                if (this.m_useInputSurface) {
                    C50792y.m109914d(TAG, "m_mediaCodec.createInputSurface()");
                    this.m_surface = this.m_mediaCodec.createInputSurface();
                }
                return 0;
            }
        } catch (Exception unused) {
            C50792y.m109914d(TAG, "configEncode Exception");
            return -4;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x013a A[Catch:{ Exception -> 0x0193 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0144 A[Catch:{ Exception -> 0x0193 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int startEncoder() {
        /*
            r20 = this;
            r0 = r20
            java.lang.String r1 = TAG
            java.lang.String r2 = "startEncoder..."
            com.p683ss.android.vesdk.C50792y.m109911b(r1, r2)
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0193 }
            r2 = 18
            r3 = 0
            if (r1 < r2) goto L_0x0183
            boolean r1 = r0.m_useInputSurface     // Catch:{ Exception -> 0x0193 }
            if (r1 == 0) goto L_0x0183
            com.ss.android.ttve.common.g r1 = r0.m_sharedContext     // Catch:{ Exception -> 0x0193 }
            r4 = 5
            r5 = 12344(0x3038, float:1.7298E-41)
            r6 = 2
            if (r1 != 0) goto L_0x0146
            com.ss.android.ttve.common.c r1 = r0.m_eglStateSaver     // Catch:{ Exception -> 0x0193 }
            android.opengl.EGLContext r1 = r1.f55171a     // Catch:{ Exception -> 0x0193 }
            android.view.Surface r7 = r0.m_surface     // Catch:{ Exception -> 0x0193 }
            com.ss.android.ttve.common.g r8 = new com.ss.android.ttve.common.g     // Catch:{ Exception -> 0x0193 }
            r8.<init>()     // Catch:{ Exception -> 0x0193 }
            if (r1 != 0) goto L_0x002b
            android.opengl.EGLContext r1 = android.opengl.EGL14.EGL_NO_CONTEXT     // Catch:{ Exception -> 0x0193 }
        L_0x002b:
            r9 = 3
            int[] r10 = new int[r9]     // Catch:{ Exception -> 0x0193 }
            r10 = {12440, 2, 12344} // fill-array     // Catch:{ Exception -> 0x0193 }
            r11 = 13
            int[] r13 = new int[r11]     // Catch:{ Exception -> 0x0193 }
            r11 = 12352(0x3040, float:1.7309E-41)
            r13[r3] = r11     // Catch:{ Exception -> 0x0193 }
            r11 = 4
            r15 = 1
            r13[r15] = r11     // Catch:{ Exception -> 0x0193 }
            r12 = 12324(0x3024, float:1.727E-41)
            r13[r6] = r12     // Catch:{ Exception -> 0x0193 }
            int r12 = com.p683ss.android.ttve.common.C20078g.f55191a     // Catch:{ Exception -> 0x0193 }
            r13[r9] = r12     // Catch:{ Exception -> 0x0193 }
            r9 = 12323(0x3023, float:1.7268E-41)
            r13[r11] = r9     // Catch:{ Exception -> 0x0193 }
            int r9 = com.p683ss.android.ttve.common.C20078g.f55192b     // Catch:{ Exception -> 0x0193 }
            r13[r4] = r9     // Catch:{ Exception -> 0x0193 }
            r9 = 6
            r11 = 12322(0x3022, float:1.7267E-41)
            r13[r9] = r11     // Catch:{ Exception -> 0x0193 }
            r9 = 7
            int r11 = com.p683ss.android.ttve.common.C20078g.f55193c     // Catch:{ Exception -> 0x0193 }
            r13[r9] = r11     // Catch:{ Exception -> 0x0193 }
            r9 = 8
            r11 = 12321(0x3021, float:1.7265E-41)
            r13[r9] = r11     // Catch:{ Exception -> 0x0193 }
            r9 = 9
            int r11 = com.p683ss.android.ttve.common.C20078g.f55194d     // Catch:{ Exception -> 0x0193 }
            r13[r9] = r11     // Catch:{ Exception -> 0x0193 }
            r9 = 12339(0x3033, float:1.729E-41)
            r11 = 10
            r13[r11] = r9     // Catch:{ Exception -> 0x0193 }
            r9 = 11
            r12 = 12610(0x3142, float:1.767E-41)
            r13[r9] = r12     // Catch:{ Exception -> 0x0193 }
            r14 = 12
            r13[r14] = r5     // Catch:{ Exception -> 0x0193 }
            r13[r11] = r12     // Catch:{ Exception -> 0x0193 }
            r13[r9] = r15     // Catch:{ Exception -> 0x0193 }
            android.opengl.EGLConfig[] r9 = new android.opengl.EGLConfig[r15]     // Catch:{ Exception -> 0x0193 }
            int[] r11 = new int[r15]     // Catch:{ Exception -> 0x0193 }
            int[] r12 = new int[r6]     // Catch:{ Exception -> 0x0193 }
            r12 = {0, 1} // fill-array     // Catch:{ Exception -> 0x0193 }
            int[] r4 = new int[r4]     // Catch:{ Exception -> 0x0193 }
            r4 = {12375, 64, 12374, 64, 12344} // fill-array     // Catch:{ Exception -> 0x0193 }
            android.opengl.EGLDisplay r14 = android.opengl.EGL14.eglGetDisplay(r3)     // Catch:{ Exception -> 0x0193 }
            r8.f55198g = r14     // Catch:{ Exception -> 0x0193 }
            android.opengl.EGLDisplay r2 = android.opengl.EGL14.EGL_NO_DISPLAY     // Catch:{ Exception -> 0x0193 }
            if (r14 != r2) goto L_0x0097
            java.lang.String r1 = "eglGetDisplay"
            com.p683ss.android.ttve.common.C20078g.m49587a(r1)     // Catch:{ Exception -> 0x0193 }
        L_0x0094:
            r2 = 0
            goto L_0x0138
        L_0x0097:
            int[] r2 = new int[r6]     // Catch:{ Exception -> 0x0193 }
            android.opengl.EGLContext r14 = android.opengl.EGL14.EGL_NO_CONTEXT     // Catch:{ Exception -> 0x0193 }
            boolean r14 = r1.equals(r14)     // Catch:{ Exception -> 0x0193 }
            r5 = 12440(0x3098, float:1.7432E-41)
            if (r14 != 0) goto L_0x00af
            android.opengl.EGLDisplay r14 = r8.f55198g     // Catch:{ Exception -> 0x0193 }
            boolean r14 = android.opengl.EGL14.eglQueryContext(r14, r1, r5, r2, r3)     // Catch:{ Exception -> 0x0193 }
            if (r14 == 0) goto L_0x00af
            r2 = r2[r3]     // Catch:{ Exception -> 0x0193 }
            r10[r15] = r2     // Catch:{ Exception -> 0x0193 }
        L_0x00af:
            android.opengl.EGLDisplay r2 = r8.f55198g     // Catch:{ Exception -> 0x0193 }
            boolean r2 = android.opengl.EGL14.eglInitialize(r2, r12, r3, r12, r15)     // Catch:{ Exception -> 0x0193 }
            if (r2 != 0) goto L_0x00bd
            java.lang.String r1 = "eglInitialize"
            com.p683ss.android.ttve.common.C20078g.m49587a(r1)     // Catch:{ Exception -> 0x0193 }
            goto L_0x0094
        L_0x00bd:
            android.opengl.EGLDisplay r12 = r8.f55198g     // Catch:{ Exception -> 0x0193 }
            r14 = 0
            r16 = 0
            r17 = 1
            r19 = 0
            r2 = 1
            r15 = r9
            r18 = r11
            boolean r12 = android.opengl.EGL14.eglChooseConfig(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0193 }
            if (r12 != 0) goto L_0x00d6
            java.lang.String r1 = "eglChooseConfig"
            com.p683ss.android.ttve.common.C20078g.m49587a(r1)     // Catch:{ Exception -> 0x0193 }
            goto L_0x0094
        L_0x00d6:
            java.lang.String r12 = "Config num: %d, has sharedContext: %s"
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0193 }
            r11 = r11[r3]     // Catch:{ Exception -> 0x0193 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0193 }
            r13[r3] = r11     // Catch:{ Exception -> 0x0193 }
            android.opengl.EGLContext r11 = android.opengl.EGL14.EGL_NO_CONTEXT     // Catch:{ Exception -> 0x0193 }
            if (r1 != r11) goto L_0x00e9
            java.lang.String r11 = "NO"
            goto L_0x00eb
        L_0x00e9:
            java.lang.String r11 = "YES"
        L_0x00eb:
            r13[r2] = r11     // Catch:{ Exception -> 0x0193 }
            com.C2240a.m6772a(r12, r13)     // Catch:{ Exception -> 0x0193 }
            r9 = r9[r3]     // Catch:{ Exception -> 0x0193 }
            r8.f55197f = r9     // Catch:{ Exception -> 0x0193 }
            android.opengl.EGLDisplay r9 = r8.f55198g     // Catch:{ Exception -> 0x0193 }
            android.opengl.EGLConfig r11 = r8.f55197f     // Catch:{ Exception -> 0x0193 }
            android.opengl.EGLContext r1 = android.opengl.EGL14.eglCreateContext(r9, r11, r1, r10, r3)     // Catch:{ Exception -> 0x0193 }
            r8.f55196e = r1     // Catch:{ Exception -> 0x0193 }
            android.opengl.EGLContext r1 = r8.f55196e     // Catch:{ Exception -> 0x0193 }
            android.opengl.EGLContext r9 = android.opengl.EGL14.EGL_NO_CONTEXT     // Catch:{ Exception -> 0x0193 }
            if (r1 != r9) goto L_0x010a
            java.lang.String r1 = "eglCreateContext"
            com.p683ss.android.ttve.common.C20078g.m49587a(r1)     // Catch:{ Exception -> 0x0193 }
            goto L_0x0094
        L_0x010a:
            r1 = 12344(0x3038, float:1.7298E-41)
            r4[r3] = r1     // Catch:{ Exception -> 0x0193 }
            r4[r6] = r1     // Catch:{ Exception -> 0x0193 }
            android.opengl.EGLDisplay r1 = r8.f55198g     // Catch:{ Exception -> 0x0193 }
            android.opengl.EGLConfig r6 = r8.f55197f     // Catch:{ Exception -> 0x0193 }
            android.opengl.EGLSurface r1 = android.opengl.EGL14.eglCreateWindowSurface(r1, r6, r7, r4, r3)     // Catch:{ Exception -> 0x0193 }
            r8.f55199h = r1     // Catch:{ Exception -> 0x0193 }
            android.opengl.EGLSurface r1 = r8.f55199h     // Catch:{ Exception -> 0x0193 }
            android.opengl.EGLSurface r4 = android.opengl.EGL14.EGL_NO_SURFACE     // Catch:{ Exception -> 0x0193 }
            if (r1 != r4) goto L_0x0127
            java.lang.String r1 = "eglCreateSurface"
            com.p683ss.android.ttve.common.C20078g.m49587a(r1)     // Catch:{ Exception -> 0x0193 }
            goto L_0x0094
        L_0x0127:
            boolean r1 = r8.mo42176b()     // Catch:{ Exception -> 0x0193 }
            if (r1 != 0) goto L_0x012f
            goto L_0x0094
        L_0x012f:
            int[] r1 = new int[r2]     // Catch:{ Exception -> 0x0193 }
            android.opengl.EGLDisplay r4 = r8.f55198g     // Catch:{ Exception -> 0x0193 }
            android.opengl.EGLContext r6 = r8.f55196e     // Catch:{ Exception -> 0x0193 }
            android.opengl.EGL14.eglQueryContext(r4, r6, r5, r1, r3)     // Catch:{ Exception -> 0x0193 }
        L_0x0138:
            if (r2 != 0) goto L_0x013e
            r8.mo42174a()     // Catch:{ Exception -> 0x0193 }
            r8 = 0
        L_0x013e:
            r0.m_sharedContext = r8     // Catch:{ Exception -> 0x0193 }
            com.ss.android.ttve.common.g r1 = r0.m_sharedContext     // Catch:{ Exception -> 0x0193 }
            if (r1 != 0) goto L_0x017b
            r1 = -2
            return r1
        L_0x0146:
            com.ss.android.ttve.common.g r1 = r0.m_sharedContext     // Catch:{ Exception -> 0x0193 }
            android.view.Surface r2 = r0.m_surface     // Catch:{ Exception -> 0x0193 }
            android.opengl.EGLDisplay r5 = r1.f55198g     // Catch:{ Exception -> 0x0193 }
            android.opengl.EGLSurface r7 = r1.f55199h     // Catch:{ Exception -> 0x0193 }
            android.opengl.EGL14.eglDestroySurface(r5, r7)     // Catch:{ Exception -> 0x0193 }
            int[] r4 = new int[r4]     // Catch:{ Exception -> 0x0193 }
            r4 = {12375, 0, 12374, 0, 12344} // fill-array     // Catch:{ Exception -> 0x0193 }
            r5 = 12344(0x3038, float:1.7298E-41)
            r4[r3] = r5     // Catch:{ Exception -> 0x0193 }
            r4[r6] = r5     // Catch:{ Exception -> 0x0193 }
            android.opengl.EGLDisplay r5 = r1.f55198g     // Catch:{ Exception -> 0x0193 }
            android.opengl.EGLConfig r6 = r1.f55197f     // Catch:{ Exception -> 0x0193 }
            android.opengl.EGLSurface r2 = android.opengl.EGL14.eglCreateWindowSurface(r5, r6, r2, r4, r3)     // Catch:{ Exception -> 0x0193 }
            r1.f55199h = r2     // Catch:{ Exception -> 0x0193 }
            android.opengl.EGLSurface r2 = r1.f55199h     // Catch:{ Exception -> 0x0193 }
            android.opengl.EGLSurface r4 = android.opengl.EGL14.EGL_NO_SURFACE     // Catch:{ Exception -> 0x0193 }
            if (r2 != r4) goto L_0x0173
            java.lang.String r1 = "eglCreateSurface"
            com.p683ss.android.ttve.common.C20078g.m49587a(r1)     // Catch:{ Exception -> 0x0193 }
            r1 = 0
            goto L_0x0177
        L_0x0173:
            boolean r1 = r1.mo42176b()     // Catch:{ Exception -> 0x0193 }
        L_0x0177:
            if (r1 != 0) goto L_0x017b
            r1 = -2
            return r1
        L_0x017b:
            boolean r1 = r20.initTextureDrawer()     // Catch:{ Exception -> 0x0193 }
            if (r1 != 0) goto L_0x0183
            r1 = -3
            return r1
        L_0x0183:
            android.media.MediaCodec r1 = r0.m_mediaCodec     // Catch:{ Exception -> 0x0193 }
            r1.start()     // Catch:{ Exception -> 0x0193 }
            long r1 = java.lang.System.nanoTime()     // Catch:{ Exception -> 0x0193 }
            r0.m_encodeStartTime = r1     // Catch:{ Exception -> 0x0193 }
            r0.m_isNeedReconfigure = r3     // Catch:{ Exception -> 0x0193 }
            r0.mEndOfStream = r3     // Catch:{ Exception -> 0x0193 }
            return r3
        L_0x0193:
            r1 = -1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ttve.mediacodec.TEAvcEncoder.startEncoder():int");
    }

    public byte[] getCodecData(int i) {
        if (this.m_lastCodecData != null) {
            return this.m_lastCodecData.f55218a;
        }
        return null;
    }

    private ByteBuffer getOutputBufferByIdx(int i) {
        if (VERSION.SDK_INT >= 21) {
            return this.m_mediaCodec.getOutputBuffer(i);
        }
        return this.m_mediaCodec.getOutputBuffers()[i];
    }

    public static void setEncodeParams(C20087b bVar) {
        String str = TAG;
        StringBuilder sb = new StringBuilder("setEncodeParams ");
        sb.append(bVar.f55222a);
        C50792y.m109909a(str, sb.toString());
        MAX_PRODUCT_OF_SIZE_AND_FPS = bVar.f55222a;
    }

    private int reconfigureMediaFormat(MediaCodecInfo mediaCodecInfo) {
        String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
        C50792y.m109911b(TAG, "CodecNames:");
        for (String str : supportedTypes) {
            String str2 = TAG;
            StringBuilder sb = new StringBuilder("Codec: ");
            sb.append(str);
            C50792y.m109911b(str2, sb.toString());
        }
        this.m_codecFormat = MediaFormat.createVideoFormat(VIDEO_MIME_TYPE, this.m_width_align, this.m_height_align);
        this.m_codecFormat.setInteger("color-format", this.m_colorFormat);
        this.m_codecFormat.setInteger("bitrate", this.m_bitRate);
        int i = this.m_frameRate;
        if (MAX_PRODUCT_OF_SIZE_AND_FPS > 0) {
            long j = MAX_PRODUCT_OF_SIZE_AND_FPS / ((long) (this.m_width_align * this.m_height_align));
            if (((long) i) > j) {
                i = (int) j;
            }
        }
        this.m_codecFormat.setInteger("frame-rate", i);
        this.m_codecFormat.setInteger("i-frame-interval", this.m_iFrameInternal);
        setProfile(mediaCodecInfo.getCapabilitiesForType(VIDEO_MIME_TYPE));
        return 0;
    }

    private void setBitRateMode(CodecCapabilities codecCapabilities) {
        if (VERSION.SDK_INT >= 21) {
            String[] strArr = {"BITRATE_MODE_CQ", "BITRATE_MODE_VBR", "BITRATE_MODE_CBR"};
            EncoderCapabilities encoderCapabilities = codecCapabilities.getEncoderCapabilities();
            for (int i = 0; i < 3; i++) {
                String str = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append(strArr[i]);
                sb.append(": ");
                sb.append(encoderCapabilities.isBitrateModeSupported(i));
                C50792y.m109911b(str, sb.toString());
            }
            this.m_codecFormat.setInteger("bitrate-mode", 1);
        }
    }

    private int drainOutputBuffer(long j) {
        byte[] bArr;
        BufferInfo bufferInfo = new BufferInfo();
        this.mBufferIndex = -1;
        try {
            this.mBufferIndex = this.m_mediaCodec.dequeueOutputBuffer(bufferInfo, j);
            while (true) {
                if (this.mBufferIndex < 0) {
                    break;
                }
                ByteBuffer outputBufferByIdx = getOutputBufferByIdx(this.mBufferIndex);
                byte[] bArr2 = new byte[bufferInfo.size];
                outputBufferByIdx.position(bufferInfo.offset);
                outputBufferByIdx.limit(bufferInfo.offset + bufferInfo.size);
                outputBufferByIdx.get(bArr2);
                if (bufferInfo.flags == 2) {
                    this.configByte = bArr2;
                } else if (bufferInfo.flags == 1) {
                    if (this.configByte != null && bArr2[4] == this.configByte[4] && (bArr2[this.configByte.length + 4] & 31) == 5) {
                        bArr = new byte[(bArr2.length - this.configByte.length)];
                        System.arraycopy(bArr2, this.configByte.length, bArr, 0, bArr.length);
                    } else {
                        bArr = bArr2;
                    }
                    addOutputData(bArr, bufferInfo);
                } else if (bufferInfo.flags == 4) {
                    this.mEndOfStream = true;
                    break;
                } else {
                    addOutputData(bArr2, bufferInfo);
                }
                try {
                    this.m_mediaCodec.releaseOutputBuffer(this.mBufferIndex, false);
                    this.mBufferIndex = this.m_mediaCodec.dequeueOutputBuffer(bufferInfo, j);
                } catch (Exception unused) {
                    return -214;
                }
            }
            if (this.mBufferIndex == -2) {
                MediaFormat outputFormat = this.m_mediaCodec.getOutputFormat();
                ByteBuffer byteBuffer = outputFormat.getByteBuffer("csd-0");
                ByteBuffer byteBuffer2 = outputFormat.getByteBuffer("csd-1");
                if (!(byteBuffer == null || byteBuffer2 == null)) {
                    this.sps = (byte[]) byteBuffer.array().clone();
                    this.pps = (byte[]) byteBuffer2.array().clone();
                    this.configByte = new byte[(this.sps.length + this.pps.length)];
                    System.arraycopy(this.sps, 0, this.configByte, 0, this.sps.length);
                    System.arraycopy(this.pps, 0, this.configByte, this.sps.length, this.pps.length);
                }
            }
            return 0;
        } catch (Exception unused2) {
            return -214;
        }
    }

    private void setProfile(CodecCapabilities codecCapabilities) {
        if (VERSION.SDK_INT >= 24) {
            int i = this.m_profile;
            CodecProfileLevel codecProfileLevel = null;
            CodecProfileLevel[] codecProfileLevelArr = codecCapabilities.profileLevels;
            int length = codecProfileLevelArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                CodecProfileLevel codecProfileLevel2 = codecProfileLevelArr[i2];
                if (codecProfileLevel2.profile == i) {
                    codecProfileLevel = codecProfileLevel2;
                    break;
                }
                if (codecProfileLevel == null || codecProfileLevel.profile < codecProfileLevel2.profile) {
                    codecProfileLevel = codecProfileLevel2;
                }
                i2++;
            }
            if (codecProfileLevel != null) {
                String str = TAG;
                StringBuilder sb = new StringBuilder("Set Profile: ");
                sb.append(codecProfileLevel.profile);
                sb.append(", Level = ");
                sb.append(codecProfileLevel.level);
                C50792y.m109911b(str, sb.toString());
                this.m_codecFormat.setInteger("profile", codecProfileLevel.profile);
                this.m_codecFormat.setInteger("level", codecProfileLevel.level);
                int i3 = codecProfileLevel.profile;
                if (i3 == 2) {
                    C50792y.m109911b(TAG, "Set Main Profile");
                    double d = (double) this.m_maxBitRate;
                    double d2 = this.m_dHpBitrateRatio;
                    Double.isNaN(d);
                    this.m_bitRate = (int) (d * d2);
                } else if (i3 == 8) {
                    C50792y.m109911b(TAG, "Set High Profile");
                    double d3 = (double) this.m_maxBitRate;
                    double d4 = this.m_dHpBitrateRatio;
                    Double.isNaN(d3);
                    this.m_bitRate = (int) (d3 * d4);
                }
                this.m_codecFormat.setInteger("bitrate", this.m_bitRate);
            }
        }
    }

    public int getInfoByFlag(int[] iArr, int i) {
        if (i != 1) {
            return -1;
        }
        iArr[0] = (int) (this.m_lastCodecData.f55219b & -1);
        iArr[1] = (int) ((this.m_lastCodecData.f55219b >> 32) & -1);
        iArr[2] = (int) (this.m_lastCodecData.f55220c & -1);
        iArr[3] = (int) ((this.m_lastCodecData.f55220c >> 32) & -1);
        return 4;
    }

    private void addOutputData(byte[] bArr, BufferInfo bufferInfo) {
        long j;
        String str = TAG;
        StringBuilder sb = new StringBuilder("encode: pts queue size = ");
        sb.append(this.m_PTSQueue.size());
        C50792y.m109911b(str, sb.toString());
        if (this.m_PTSQueue.size() <= 0 && this.m_profile >= 8) {
            String str2 = TAG;
            StringBuilder sb2 = new StringBuilder("encode: no available pts!!! profile ");
            sb2.append(this.m_profile);
            C50792y.m109913c(str2, sb2.toString());
        } else if (this.m_PTSQueue.size() <= 0) {
            C50792y.m109913c(TAG, "encode: no available pts!!!");
        } else {
            long longValue = ((Long) this.m_PTSQueue.poll()).longValue();
            long j2 = 0;
            if (bufferInfo.presentationTimeUs > 0) {
                j2 = bufferInfo.presentationTimeUs;
            }
            if (this.m_profile >= 8) {
                j = longValue - 200000;
            } else {
                j = j2;
            }
            String str3 = TAG;
            StringBuilder sb3 = new StringBuilder("dts = ");
            sb3.append(j);
            sb3.append(", pts = ");
            sb3.append(j2);
            C50792y.m109911b(str3, sb3.toString());
            C20086a aVar = new C20086a();
            aVar.f55218a = bArr;
            aVar.f55219b = j2;
            aVar.f55220c = j;
            aVar.f55221d = bufferInfo.flags;
            try {
                this.AVCQueue.add(aVar);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:82:0x0188 A[SYNTHETIC, Splitter:B:82:0x0188] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x018e A[SYNTHETIC, Splitter:B:88:0x018e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int encodeVideoFromTexture(int r19, long r20, boolean r22) {
        /*
            r18 = this;
            r1 = r18
            r2 = r20
            boolean r0 = r1.m_bSuccessInit
            r4 = 0
            if (r0 != 0) goto L_0x000a
            return r4
        L_0x000a:
            java.lang.String r0 = TAG
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "encodeVideoFromTexture:: pts = "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.p683ss.android.vesdk.C50792y.m109911b(r0, r5)
            java.util.Queue<java.lang.Long> r0 = r1.m_PTSQueue
            java.lang.Long r5 = java.lang.Long.valueOf(r20)
            r0.offer(r5)
            com.ss.android.ttve.common.c r0 = r1.m_eglStateSaver
            if (r0 != 0) goto L_0x0036
            com.ss.android.ttve.common.c r0 = new com.ss.android.ttve.common.c
            r0.<init>()
            r1.m_eglStateSaver = r0
            com.ss.android.ttve.common.c r0 = r1.m_eglStateSaver
            r0.mo42169a()
        L_0x0036:
            boolean r0 = r1.m_isNeedReconfigure
            r5 = 1
            if (r0 != 0) goto L_0x0041
            int r0 = r1.m_configStatus
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0068
        L_0x0041:
            android.media.MediaCodec r0 = r1.m_mediaCodec
            if (r0 == 0) goto L_0x0063
            int r0 = r1.m_configStatus
            if (r0 != r5) goto L_0x0063
            int r0 = android.os.Build.VERSION.SDK_INT
            r6 = 19
            if (r0 < r6) goto L_0x0063
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r6 = "video-bitrate"
            int r7 = r1.m_bitRate
            r0.putInt(r6, r7)
            android.media.MediaCodec r6 = r1.m_mediaCodec
            r6.setParameters(r0)
            r1.m_configStatus = r4
            goto L_0x0066
        L_0x0063:
            r18.restartEncoder()
        L_0x0066:
            r1.m_isNeedReconfigure = r4
        L_0x0068:
            long r6 = r1.m_encodeStartTime
            r8 = -1
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0076
            long r6 = java.lang.System.nanoTime()
            r1.m_encodeStartTime = r6
        L_0x0076:
            r6 = 0
            int r0 = r1.drainOutputBuffer(r6)
            if (r0 == 0) goto L_0x007f
            return r0
        L_0x007f:
            r0 = r19 & -1
            r8 = 30
            if (r0 == 0) goto L_0x0194
            r9 = 0
            com.ss.android.ttve.common.j r10 = r1.m_textureDrawer     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            if (r10 == 0) goto L_0x0178
            boolean r10 = com.p683ss.android.vesdk.C50629aj.m109153a()     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            if (r10 == 0) goto L_0x009e
            android.opengl.EGLContext r10 = android.opengl.EGL14.eglGetCurrentContext()     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            com.ss.android.ttve.common.g r11 = r1.m_sharedContext     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            android.opengl.EGLContext r11 = r11.f55196e     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            if (r10 != 0) goto L_0x00a3
        L_0x009e:
            com.ss.android.ttve.common.g r10 = r1.m_sharedContext     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r10.mo42176b()     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
        L_0x00a3:
            int r10 = r1.m_width     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            int r11 = r1.m_height     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            android.opengl.GLES20.glViewport(r4, r4, r10, r11)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            com.ss.android.ttve.common.j r10 = r1.m_textureDrawer     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r10.mo42183a(r0)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            boolean r10 = r1.mFirstFrame     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            if (r10 == 0) goto L_0x00f0
            boolean r10 = DEBUG     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            if (r10 == 0) goto L_0x00ee
            r10 = 3686400(0x384000, float:5.165747E-39)
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.allocateDirect(r10)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            java.nio.ByteOrder r11 = java.nio.ByteOrder.nativeOrder()     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r10.order(r11)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r10.position(r4)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r11 = 0
            r12 = 0
            r13 = 1280(0x500, float:1.794E-42)
            r14 = 720(0x2d0, float:1.009E-42)
            r15 = 6408(0x1908, float:8.98E-42)
            r16 = 5121(0x1401, float:7.176E-42)
            r17 = r10
            android.opengl.GLES20.glReadPixels(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            java.lang.String r12 = "/mnt/sdcard/ttt.rgba"
            r11.<init>(r12)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            byte[] r9 = r10.array()     // Catch:{ Exception -> 0x00eb, all -> 0x00e7 }
            r11.write(r9)     // Catch:{ Exception -> 0x00eb, all -> 0x00e7 }
            r9 = r11
            goto L_0x00ee
        L_0x00e7:
            r0 = move-exception
            r9 = r11
            goto L_0x0186
        L_0x00eb:
            r9 = r11
            goto L_0x018c
        L_0x00ee:
            r1.mFirstFrame = r4     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
        L_0x00f0:
            com.ss.android.ttve.common.g r10 = r1.m_sharedContext     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r11 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r11
            r10.mo42175a(r2)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            com.ss.android.ttve.common.g r10 = r1.m_sharedContext     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r10.mo42177c()     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r1.m_bNeedSingalEnd = r5     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            int r5 = r1.drainOutputBuffer(r6)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            if (r5 == 0) goto L_0x010c
            if (r9 == 0) goto L_0x010b
            r9.close()     // Catch:{ IOException -> 0x010b }
        L_0x010b:
            return r5
        L_0x010c:
            byte[] r5 = r1.configByte     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            if (r5 != 0) goto L_0x0178
            r5 = 0
        L_0x0111:
            java.lang.String r10 = TAG     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            java.lang.String r12 = "Encoder first frame, count = "
            r11.<init>(r12)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r11.append(r5)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            com.p683ss.android.vesdk.C50792y.m109911b(r10, r11)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            int r10 = r1.m_width     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            int r11 = r1.m_height     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            android.opengl.GLES20.glViewport(r4, r4, r10, r11)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            com.ss.android.ttve.common.j r10 = r1.m_textureDrawer     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r10.mo42183a(r0)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            com.ss.android.ttve.common.g r10 = r1.m_sharedContext     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r10.mo42175a(r2)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            com.ss.android.ttve.common.g r10 = r1.m_sharedContext     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r10.mo42177c()     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            int r10 = r1.drainOutputBuffer(r6)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            if (r10 == 0) goto L_0x0146
            if (r9 == 0) goto L_0x0145
            r9.close()     // Catch:{ IOException -> 0x0145 }
        L_0x0145:
            return r10
        L_0x0146:
            int r5 = r5 + 1
            if (r5 > r8) goto L_0x0153
            r10 = 10
            java.lang.Thread.sleep(r10, r4)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            byte[] r10 = r1.configByte     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            if (r10 == 0) goto L_0x0111
        L_0x0153:
            java.util.concurrent.ArrayBlockingQueue<com.ss.android.ttve.mediacodec.TEAvcEncoder$a> r5 = r1.AVCQueue     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r5.clear()     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r18.restartEncoder()     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r1.m_getnerateIndex = r6     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            com.ss.android.ttve.common.g r5 = r1.m_sharedContext     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r5.mo42176b()     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            int r5 = r1.m_width     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            int r10 = r1.m_height     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            android.opengl.GLES20.glViewport(r4, r4, r5, r10)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            com.ss.android.ttve.common.j r5 = r1.m_textureDrawer     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r5.mo42183a(r0)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            com.ss.android.ttve.common.g r0 = r1.m_sharedContext     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r0.mo42175a(r2)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            com.ss.android.ttve.common.g r0 = r1.m_sharedContext     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r0.mo42177c()     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
        L_0x0178:
            if (r9 == 0) goto L_0x017d
            r9.close()     // Catch:{ IOException -> 0x017d }
        L_0x017d:
            long r2 = r1.m_getnerateIndex
            r9 = 1
            long r2 = r2 + r9
            r1.m_getnerateIndex = r2
            goto L_0x01ad
        L_0x0185:
            r0 = move-exception
        L_0x0186:
            if (r9 == 0) goto L_0x018b
            r9.close()     // Catch:{ IOException -> 0x018b }
        L_0x018b:
            throw r0
        L_0x018c:
            if (r9 == 0) goto L_0x0191
            r9.close()     // Catch:{ IOException -> 0x0191 }
        L_0x0191:
            r0 = -211(0xffffffffffffff2d, float:NaN)
            return r0
        L_0x0194:
            android.media.MediaCodec r0 = r1.m_mediaCodec
            if (r0 == 0) goto L_0x01ad
            boolean r0 = r1.m_bSignalEndOfStream
            if (r0 != 0) goto L_0x01ad
            boolean r0 = r1.m_bNeedSingalEnd
            if (r0 == 0) goto L_0x01ad
            r1.m_bSignalEndOfStream = r5     // Catch:{ Exception -> 0x01aa }
            r1.mEndOfStream = r4     // Catch:{ Exception -> 0x01aa }
            android.media.MediaCodec r0 = r1.m_mediaCodec     // Catch:{ Exception -> 0x01aa }
            r0.signalEndOfInputStream()     // Catch:{ Exception -> 0x01aa }
            goto L_0x01ad
        L_0x01aa:
            r0 = -213(0xffffffffffffff2b, float:NaN)
            return r0
        L_0x01ad:
            boolean r0 = com.p683ss.android.vesdk.C50629aj.m109153a()
            if (r0 != 0) goto L_0x01c0
            com.ss.android.ttve.common.c r0 = r1.m_eglStateSaver
            android.opengl.EGLDisplay r2 = r0.f55174d
            android.opengl.EGLSurface r3 = r0.f55172b
            android.opengl.EGLSurface r5 = r0.f55173c
            android.opengl.EGLContext r0 = r0.f55171a
            android.opengl.EGL14.eglMakeCurrent(r2, r3, r5, r0)
        L_0x01c0:
            boolean r0 = r1.m_bSignalEndOfStream
            if (r0 == 0) goto L_0x01da
        L_0x01c4:
            boolean r0 = r1.mEndOfStream
            if (r0 != 0) goto L_0x01e1
            r2 = 10000(0x2710, double:4.9407E-320)
            int r0 = r1.drainOutputBuffer(r2)
            if (r0 == 0) goto L_0x01d1
            return r0
        L_0x01d1:
            int r0 = r1.mBufferIndex
            if (r0 >= 0) goto L_0x01e1
            int r8 = r8 + -1
            if (r8 > 0) goto L_0x01c4
            goto L_0x01e1
        L_0x01da:
            int r0 = r1.drainOutputBuffer(r6)
            if (r0 == 0) goto L_0x01e1
            return r0
        L_0x01e1:
            java.util.concurrent.ArrayBlockingQueue<com.ss.android.ttve.mediacodec.TEAvcEncoder$a> r0 = r1.AVCQueue
            java.lang.Object r0 = r0.poll()
            com.ss.android.ttve.mediacodec.TEAvcEncoder$a r0 = (com.p683ss.android.ttve.mediacodec.TEAvcEncoder.C20086a) r0
            r1.m_lastCodecData = r0
            com.ss.android.ttve.mediacodec.TEAvcEncoder$a r0 = r1.m_lastCodecData
            if (r0 == 0) goto L_0x01f4
            com.ss.android.ttve.mediacodec.TEAvcEncoder$a r0 = r1.m_lastCodecData
            byte[] r0 = r0.f55218a
            int r4 = r0.length
        L_0x01f4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ttve.mediacodec.TEAvcEncoder.encodeVideoFromTexture(int, long, boolean):int");
    }

    private void setEncoder(int i, int i2, int i3, int i4, int i5, int i6, int i7, double d) {
        this.m_configStatus = 0;
        if (i > 0) {
            this.m_width = i;
            this.m_width_align = i;
        }
        if (i2 > 0) {
            this.m_height = i2;
            this.m_height_align = i2;
        }
        if (Math.min(this.m_width_align, this.m_height_align) >= 1080) {
            if (this.m_width_align % 16 != 0) {
                this.m_width_align = ((this.m_width_align / 16) + 1) * 16;
            }
            if (this.m_height_align % 16 != 0) {
                this.m_height_align = ((this.m_height_align / 16) + 1) * 16;
            }
        }
        if (i3 > 0) {
            if (i3 < MIN_FRAME_RATE) {
                C50792y.m109913c(TAG, C2240a.m6773a(Locale.getDefault(), "_frameRate:[%d] is too small, change to %d", new Object[]{Integer.valueOf(i3), Integer.valueOf(MIN_FRAME_RATE)}));
                i3 = MIN_FRAME_RATE;
            } else if (i3 > MAX_FRAME_RATE) {
                C50792y.m109913c(TAG, C2240a.m6773a(Locale.getDefault(), "_frameRate:[%d] is too large, change to %d", new Object[]{Integer.valueOf(i3), Integer.valueOf(MAX_FRAME_RATE)}));
                i3 = MAX_FRAME_RATE;
            }
            if (this.m_frameRate != i3) {
                this.m_frameRate = i3;
                if (i3 < this.m_iFrameInternal) {
                    this.m_iFrameInternal = i3;
                }
                this.m_isNeedReconfigure = true;
                this.m_configStatus |= 2;
            }
        }
        if (i4 > 0) {
            this.m_maxBitRate = i4;
            if (this.m_bitRate != i4) {
                this.m_bitRate = i4;
                this.m_isNeedReconfigure = true;
                this.m_configStatus |= 1;
            }
        }
        if (i5 >= 0) {
            this.m_iFrameInternal = i5;
        }
        if (i6 > 0) {
            this.m_colorFormat = i6;
        }
        this.m_profile = C0703a.m2034a(i7, 1, 64);
        this.m_dHpBitrateRatio = d;
    }

    public int initEncoder(int i, int i2, int i3, int i4, int i5, int i6, int i7, double d, boolean z) {
        boolean z2 = z;
        C50792y.m109914d(TAG, "m_mediaCodec initEncoder == enter");
        if (!z2 || VERSION.SDK_INT >= 18) {
            this.m_useInputSurface = z2;
            if (this.m_useInputSurface) {
                this.m_colorFormat = 2130708361;
            } else {
                this.m_colorFormat = i4;
            }
            setEncoder(i, i2, i3, i6, i5, this.m_colorFormat, i7, d);
            this.m_isNeedReconfigure = true;
            this.m_bSuccessInit = true;
            this.m_bSignalEndOfStream = false;
            C50792y.m109914d(TAG, "m_mediaCodec initEncoder == exit");
            return configEncode();
        }
        C50792y.m109914d(TAG, "m_mediaCodec initEncoder == useInputSurface and SDK version is invalid");
        return -1;
    }
}
