package com.p683ss.android.vesdk;

import android.content.Context;
import android.content.res.AssetManager;
import android.opengl.GLES20;
import android.text.TextUtils;
import com.C2240a;
import com.p683ss.android.ttve.nativePort.C20129b;
import com.p683ss.android.ttve.nativePort.C20129b.C20135f;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.ss.android.vesdk.VEBenchmark */
public class VEBenchmark {

    /* renamed from: d */
    private static volatile VEBenchmark f126668d;

    /* renamed from: a */
    public boolean f126669a = false;

    /* renamed from: b */
    public long f126670b;

    /* renamed from: c */
    public C50592ab f126671c = new C50592ab("VEBenchmark");

    /* renamed from: e */
    private HashMap<String, String[]> f126672e = new HashMap<>();

    /* renamed from: f */
    private HashMap<String, String> f126673f = new HashMap<>();

    /* renamed from: com.ss.android.vesdk.VEBenchmark$a */
    public static class C50524a {

        /* renamed from: a */
        public boolean f126674a;

        /* renamed from: b */
        public int f126675b;

        /* renamed from: c */
        public int f126676c;

        /* renamed from: d */
        public boolean f126677d;

        /* renamed from: e */
        public String f126678e;

        public C50524a(boolean z) {
            this.f126674a = z;
        }
    }

    static {
        C20129b.m49685b();
    }

    private native long nativeCreateHandler();

    private native int nativeDecodePNG(long j);

    private native int nativeDecodeVideo(long j, String str, String str2);

    private native int nativeDestroy(long j);

    private native int nativeEGLGetConfigAttrib(long j, int i);

    private native String nativeEGLQueryString(long j, int i);

    private native String nativeGLQueryString(long j, int i);

    private native String nativeGetCLInfo(long j, int i, int i2, String str);

    private native int nativeInit(long j, AssetManager assetManager, String str);

    public native int embossProcessGPU(long j);

    public native int faceBeauty(long j);

    public native int faceDetection(long j);

    public native int gaussianBlurCPU(long j);

    public native int gaussianBlurGPU(long j);

    public native int histogramEqualization(long j);

    public native int memCopy(long j);

    public native int nativeClearCLInfo(long j);

    public native int nativeGLReadPixels(long j);

    public native Map<String, String> nativeGetALlCLInfo(long j);

    public native int nativeInitOpenCL(long j);

    private VEBenchmark() {
    }

    /* renamed from: a */
    public static VEBenchmark m108870a() {
        if (f126668d == null) {
            synchronized (VEBenchmark.class) {
                if (f126668d == null) {
                    f126668d = new VEBenchmark();
                }
            }
        }
        return f126668d;
    }

    /* renamed from: b */
    public final synchronized int mo98475b() {
        this.f126671c.mo98738a();
        if (!this.f126669a && this.f126670b == 0) {
            return 0;
        }
        this.f126669a = false;
        int nativeDestroy = nativeDestroy(this.f126670b);
        this.f126671c.mo98737a("destroy");
        return nativeDestroy;
    }

    /* renamed from: c */
    public final HashMap<String, String> mo98477c() {
        this.f126671c.mo98738a();
        if (!this.f126669a) {
            return null;
        }
        if (this.f126673f.size() <= 0) {
            this.f126673f.put("GL_VENDOR", GLES20.glGetString(7936));
            this.f126673f.put("GL_VERSION", GLES20.glGetString(7938));
            this.f126673f.put("GL_RENDERER", GLES20.glGetString(7937));
            this.f126673f.put("GL_EXTENSIONS", GLES20.glGetString(7939));
            this.f126673f.put("EGL_VENDOR", nativeEGLQueryString(this.f126670b, 12371));
            String nativeEGLQueryString = nativeEGLQueryString(this.f126670b, 12372);
            this.f126673f.put("EGL_VERSION", nativeEGLQueryString);
            if (nativeEGLQueryString != null && nativeEGLQueryString.length() > 0 && nativeEGLQueryString.startsWith("EGL_VERSION : 1.4")) {
                this.f126673f.put("EGL_CLIENT", nativeEGLQueryString(this.f126670b, 12429));
            }
            this.f126673f.put("EGL_EXTENSIONS", nativeEGLQueryString(this.f126670b, 12373));
            this.f126673f.put("EGL_ALPHA_SIZE", String.valueOf(nativeEGLGetConfigAttrib(this.f126670b, 12321)));
            this.f126673f.put("EGL_ALPHA_MASK_SIZE", String.valueOf(nativeEGLGetConfigAttrib(this.f126670b, 12350)));
            this.f126673f.put("EGL_BUFFER_SIZE", String.valueOf(nativeEGLGetConfigAttrib(this.f126670b, 12320)));
            this.f126673f.put("EGL_COLOR_BUFFER_TYPE", String.valueOf(nativeEGLGetConfigAttrib(this.f126670b, 12351)));
            this.f126673f.put("EGL_DEPTH_SIZE", String.valueOf(nativeEGLGetConfigAttrib(this.f126670b, 12325)));
            this.f126673f.put("EGL_HEIGHT", String.valueOf(nativeEGLGetConfigAttrib(this.f126670b, 12374)));
            this.f126673f.put("EGL_WIDTH", String.valueOf(nativeEGLGetConfigAttrib(this.f126670b, 12375)));
            this.f126673f.put("EGL_HORIZONTAL_RESOLUTION", String.valueOf(nativeEGLGetConfigAttrib(this.f126670b, 12432)));
            this.f126673f.put("EGL_VERTICAL_RESOLUTION", String.valueOf(nativeEGLGetConfigAttrib(this.f126670b, 12433)));
            this.f126673f.put("EGL_LARGEST_PBUFFER", String.valueOf(nativeEGLGetConfigAttrib(this.f126670b, 12376)));
            this.f126673f.put("EGL_LEVEL", String.valueOf(nativeEGLGetConfigAttrib(this.f126670b, 12329)));
            this.f126673f.put("EGL_LUMINANCE_BUFFER", String.valueOf(nativeEGLGetConfigAttrib(this.f126670b, 12431)));
            this.f126673f.put("EGL_LUMINANCE_SIZE", String.valueOf(nativeEGLGetConfigAttrib(this.f126670b, 12349)));
            this.f126673f.put("EGL_MAX_PBUFFER_HEIGHT", String.valueOf(nativeEGLGetConfigAttrib(this.f126670b, 12330)));
            this.f126673f.put("EGL_MAX_PBUFFER_WIDTH", String.valueOf(nativeEGLGetConfigAttrib(this.f126670b, 12332)));
            this.f126673f.put("EGL_MAX_PBUFFER_PIXELS", String.valueOf(nativeEGLGetConfigAttrib(this.f126670b, 12331)));
            this.f126673f.put("EGL_NATIVE_RENDERABLE", String.valueOf(nativeEGLGetConfigAttrib(this.f126670b, 12333)));
            this.f126673f.put("EGL_PBUFFER_BIT", String.valueOf(nativeEGLGetConfigAttrib(this.f126670b, 1)));
            this.f126673f.put("EGL_PIXEL_ASPECT_RATIO", String.valueOf(nativeEGLGetConfigAttrib(this.f126670b, 12434)));
            this.f126673f.put("EGL_PIXMAP_BIT", String.valueOf(nativeEGLGetConfigAttrib(this.f126670b, 2)));
            this.f126673f.put("EGL_RED_SIZE", String.valueOf(nativeEGLGetConfigAttrib(this.f126670b, 12324)));
            this.f126673f.put("EGL_GREEN_SIZE", String.valueOf(nativeEGLGetConfigAttrib(this.f126670b, 12323)));
            this.f126673f.put("EGL_BLUE_SIZE", String.valueOf(nativeEGLGetConfigAttrib(this.f126670b, 12322)));
            this.f126673f.put("EGL_RENDERABLE_TYPE", String.valueOf(nativeEGLGetConfigAttrib(this.f126670b, 12352)));
            this.f126673f.put("EGL_RENDER_BUFFER", String.valueOf(nativeEGLGetConfigAttrib(this.f126670b, 12422)));
            this.f126673f.put("EGL_RGB_BUFFER", String.valueOf(nativeEGLGetConfigAttrib(this.f126670b, 12430)));
            this.f126673f.put("EGL_SAMPLES", String.valueOf(nativeEGLGetConfigAttrib(this.f126670b, 12337)));
            this.f126673f.put("EGL_SAMPLE_BUFFERS", String.valueOf(nativeEGLGetConfigAttrib(this.f126670b, 12338)));
            this.f126673f.put("EGL_STENCIL_SIZE", String.valueOf(nativeEGLGetConfigAttrib(this.f126670b, 12326)));
            this.f126673f.put("EGL_SURFACE_TYPE", String.valueOf(nativeEGLGetConfigAttrib(this.f126670b, 12339)));
            this.f126673f.put("EGL_TRANSPARENT_TYPE", String.valueOf(nativeEGLGetConfigAttrib(this.f126670b, 12340)));
        }
        this.f126671c.mo98737a("getGPUInfo");
        return this.f126673f;
    }

    /* renamed from: a */
    public final synchronized int mo98471a(int i) {
        int i2;
        this.f126671c.mo98738a();
        if (i < 0) {
            i = 1;
        }
        StringBuilder sb = new StringBuilder("runDecodePNG: times = ");
        sb.append(i);
        C50792y.m109911b("VEBenchmark", sb.toString());
        i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = nativeDecodePNG(this.f126670b);
            if (i2 != 0) {
                break;
            }
        }
        this.f126671c.mo98737a("runDecodePNG");
        return i2;
    }

    /* renamed from: a */
    public final synchronized int mo98472a(Context context, String str) {
        char c;
        this.f126671c.mo98738a();
        if (!this.f126669a) {
            if (!TextUtils.isEmpty(str)) {
                if (context != null) {
                    if (C20129b.f55374a != C20135f.LOADED) {
                        c = 65535;
                    } else if (C20129b.f55377d) {
                        c = 1;
                    } else {
                        c = 0;
                    }
                    if (c < 0) {
                        C20129b.m49685b();
                    }
                    this.f126670b = nativeCreateHandler();
                    if (this.f126670b == 0) {
                        return -112;
                    }
                    int nativeInit = nativeInit(this.f126670b, context.getAssets(), str);
                    if (nativeInit != 0) {
                        return nativeInit;
                    }
                    this.f126669a = true;
                }
            }
            return -100;
        }
        this.f126671c.mo98737a("init");
        return 0;
    }

    /* renamed from: b */
    public final synchronized int mo98476b(String str, String str2) {
        this.f126671c.mo98738a();
        if (!this.f126669a) {
            return -105;
        }
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        if (!new File(str).exists()) {
            return -100;
        }
        int execFFmpegCommand = VEUtils.execFFmpegCommand(C2240a.m6773a(Locale.US, "ffmpeg -s 720X1280 -pix_fmt yuv420p -i %s -vcodec h264 %s", new Object[]{str, str2}), null);
        this.f126671c.mo98737a("runEncodeVideo");
        return execFFmpegCommand;
    }

    /* renamed from: a */
    public final synchronized int mo98474a(String str, String str2) {
        this.f126671c.mo98738a();
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        if (!new File(str).exists()) {
            return -100;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        int nativeDecodeVideo = nativeDecodeVideo(this.f126670b, str, str2);
        this.f126671c.mo98737a("runDecodeVideo");
        return nativeDecodeVideo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0220, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0222, code lost:
        r27 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x022a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x022b, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        r7.flush();
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0233, code lost:
        r27 = r0;
        r26 = r7;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:113:0x0232 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:118:0x023a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:121:0x0244 */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0220 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:91:0x01fb] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x022a A[ExcHandler: all (th java.lang.Throwable), Splitter:B:83:0x01db] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0248 A[Catch:{ IOException -> 0x02cc }, LOOP:2: B:62:0x0173->B:124:0x0248, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0253 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo98473a(java.lang.String r30, com.p683ss.android.vesdk.VEBenchmark.C50524a r31) {
        /*
            r29 = this;
            r1 = r29
            r0 = r30
            r2 = r31
            monitor-enter(r29)
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x02e9 }
            r4 = 18
            if (r3 >= r4) goto L_0x0018
            java.lang.String r0 = "VEBenchmark"
            java.lang.String r2 = "Android SDK Version < 18, is not support MediaCodec Decoder!"
            com.p683ss.android.vesdk.C50792y.m109914d(r0, r2)     // Catch:{ all -> 0x02e9 }
            r0 = -200(0xffffffffffffff38, float:NaN)
            monitor-exit(r29)
            return r0
        L_0x0018:
            com.ss.android.vesdk.ab r3 = r1.f126671c     // Catch:{ all -> 0x02e9 }
            r3.mo98738a()     // Catch:{ all -> 0x02e9 }
            boolean r3 = r1.f126669a     // Catch:{ all -> 0x02e9 }
            r4 = -105(0xffffffffffffff97, float:NaN)
            if (r3 != 0) goto L_0x002c
            java.lang.String r0 = "VEBenchmark"
            java.lang.String r2 = "VEBenchMark is not inited!"
            com.p683ss.android.vesdk.C50792y.m109914d(r0, r2)     // Catch:{ all -> 0x02e9 }
            monitor-exit(r29)
            return r4
        L_0x002c:
            boolean r3 = android.text.TextUtils.isEmpty(r30)     // Catch:{ all -> 0x02e9 }
            if (r3 == 0) goto L_0x003d
            java.lang.String r0 = "VEBenchmark"
            java.lang.String r2 = "strVideoPath is Empty!"
            com.p683ss.android.vesdk.C50792y.m109914d(r0, r2)     // Catch:{ all -> 0x02e9 }
            r0 = -100
            monitor-exit(r29)
            return r0
        L_0x003d:
            android.media.MediaExtractor r3 = new android.media.MediaExtractor     // Catch:{ all -> 0x02e9 }
            r3.<init>()     // Catch:{ all -> 0x02e9 }
            r3.setDataSource(r0)     // Catch:{ IOException -> 0x02cc }
            int r5 = r3.getTrackCount()     // Catch:{ all -> 0x02e9 }
            r6 = 0
            r7 = 0
        L_0x004b:
            if (r7 >= r5) goto L_0x0053
            r3.unselectTrack(r7)     // Catch:{ all -> 0x02e9 }
            int r7 = r7 + 1
            goto L_0x004b
        L_0x0053:
            r7 = 0
        L_0x0054:
            if (r7 >= r5) goto L_0x0076
            android.media.MediaFormat r9 = r3.getTrackFormat(r7)     // Catch:{ all -> 0x02e9 }
            java.lang.String r10 = "mime"
            java.lang.String r10 = r9.getString(r10)     // Catch:{ all -> 0x02e9 }
            java.lang.String r11 = "video/avc"
            boolean r10 = r10.contains(r11)     // Catch:{ all -> 0x02e9 }
            if (r10 == 0) goto L_0x0073
            r3.selectTrack(r7)     // Catch:{ all -> 0x02e9 }
            java.lang.String r5 = "VEBenchmark"
            java.lang.String r7 = "select h264 track success!"
            com.p683ss.android.vesdk.C50792y.m109909a(r5, r7)     // Catch:{ all -> 0x02e9 }
            goto L_0x0077
        L_0x0073:
            int r7 = r7 + 1
            goto L_0x0054
        L_0x0076:
            r9 = 0
        L_0x0077:
            if (r9 != 0) goto L_0x0091
            java.lang.String r2 = "VEBenchmark"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02e9 }
            r3.<init>()     // Catch:{ all -> 0x02e9 }
            r3.append(r0)     // Catch:{ all -> 0x02e9 }
            java.lang.String r0 = " don't contain any h264 track!"
            r3.append(r0)     // Catch:{ all -> 0x02e9 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x02e9 }
            com.p683ss.android.vesdk.C50792y.m109914d(r2, r0)     // Catch:{ all -> 0x02e9 }
            monitor-exit(r29)
            return r4
        L_0x0091:
            java.lang.String r5 = "width"
            int r15 = r9.getInteger(r5)     // Catch:{ all -> 0x02e9 }
            java.lang.String r5 = "height"
            int r5 = r9.getInteger(r5)     // Catch:{ all -> 0x02e9 }
            java.lang.String r7 = "csd-0"
            java.nio.ByteBuffer r7 = r9.getByteBuffer(r7)     // Catch:{ all -> 0x02e9 }
            byte[] r11 = r7.array()     // Catch:{ all -> 0x02e9 }
            java.lang.String r7 = "csd-1"
            java.nio.ByteBuffer r7 = r9.getByteBuffer(r7)     // Catch:{ all -> 0x02e9 }
            byte[] r13 = r7.array()     // Catch:{ all -> 0x02e9 }
            int r7 = r2.f126675b     // Catch:{ all -> 0x02e9 }
            if (r7 > 0) goto L_0x00b7
            r7 = r15
            goto L_0x00b9
        L_0x00b7:
            int r7 = r2.f126675b     // Catch:{ all -> 0x02e9 }
        L_0x00b9:
            int r9 = r2.f126676c     // Catch:{ all -> 0x02e9 }
            if (r9 > 0) goto L_0x00bf
            r9 = r5
            goto L_0x00c1
        L_0x00bf:
            int r9 = r2.f126676c     // Catch:{ all -> 0x02e9 }
        L_0x00c1:
            java.lang.String r10 = "VEBenchmark"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x02e9 }
            r12.<init>()     // Catch:{ all -> 0x02e9 }
            r12.append(r0)     // Catch:{ all -> 0x02e9 }
            java.lang.String r0 = " width: "
            r12.append(r0)     // Catch:{ all -> 0x02e9 }
            r12.append(r15)     // Catch:{ all -> 0x02e9 }
            java.lang.String r0 = " height: "
            r12.append(r0)     // Catch:{ all -> 0x02e9 }
            r12.append(r5)     // Catch:{ all -> 0x02e9 }
            java.lang.String r0 = ", dstWidth: "
            r12.append(r0)     // Catch:{ all -> 0x02e9 }
            r12.append(r7)     // Catch:{ all -> 0x02e9 }
            java.lang.String r0 = ", dstHeight: "
            r12.append(r0)     // Catch:{ all -> 0x02e9 }
            r12.append(r9)     // Catch:{ all -> 0x02e9 }
            java.lang.String r0 = r12.toString()     // Catch:{ all -> 0x02e9 }
            com.p683ss.android.vesdk.C50792y.m109909a(r10, r0)     // Catch:{ all -> 0x02e9 }
            int r0 = r7 * r9
            int r0 = r0 * 3
            int r0 = r0 / 2
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x02e9 }
            int r10 = r15 * r5
            r14 = 4
            int r10 = r10 * 4
            java.nio.ByteBuffer r12 = java.nio.ByteBuffer.allocate(r10)     // Catch:{ all -> 0x02e9 }
            boolean r10 = r2.f126674a     // Catch:{ all -> 0x02e9 }
            r8 = 1
            if (r10 == 0) goto L_0x0146
            int[] r10 = new int[r8]     // Catch:{ all -> 0x02e9 }
            android.opengl.GLES20.glGenTextures(r8, r10, r6)     // Catch:{ all -> 0x02e9 }
            r14 = r10[r6]     // Catch:{ all -> 0x02e9 }
            r8 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r8, r14)     // Catch:{ all -> 0x02e9 }
            r16 = 3553(0xde1, float:4.979E-42)
            r17 = 0
            r18 = 6408(0x1908, float:8.98E-42)
            r21 = 0
            r22 = 6408(0x1908, float:8.98E-42)
            r23 = 5121(0x1401, float:7.176E-42)
            r24 = 0
            r19 = r7
            r20 = r9
            android.opengl.GLES20.glTexImage2D(r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x02e9 }
            r14 = 9729(0x2601, float:1.3633E-41)
            r4 = 33071(0x812f, float:4.6342E-41)
            r6 = 10241(0x2801, float:1.435E-41)
            android.opengl.GLES20.glTexParameteri(r8, r6, r14)     // Catch:{ all -> 0x02e9 }
            r6 = 10240(0x2800, float:1.4349E-41)
            android.opengl.GLES20.glTexParameteri(r8, r6, r14)     // Catch:{ all -> 0x02e9 }
            r6 = 10242(0x2802, float:1.4352E-41)
            android.opengl.GLES20.glTexParameteri(r8, r6, r4)     // Catch:{ all -> 0x02e9 }
            r6 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r8, r6, r4)     // Catch:{ all -> 0x02e9 }
            r4 = 0
            r6 = r10[r4]     // Catch:{ all -> 0x02e9 }
            goto L_0x0147
        L_0x0146:
            r6 = 0
        L_0x0147:
            com.ss.android.h.b r4 = new com.ss.android.h.b     // Catch:{ all -> 0x02e9 }
            boolean r8 = r2.f126677d     // Catch:{ all -> 0x02e9 }
            java.lang.String r10 = r2.f126678e     // Catch:{ all -> 0x02e9 }
            r4.<init>(r8, r10)     // Catch:{ all -> 0x02e9 }
            int r8 = r11.length     // Catch:{ all -> 0x02e9 }
            int r14 = r13.length     // Catch:{ all -> 0x02e9 }
            boolean r10 = r2.f126674a     // Catch:{ all -> 0x02e9 }
            r17 = r10
            r10 = r4
            r25 = r12
            r12 = r8
            r8 = 4
            r16 = r5
            int r5 = r10.mo39112a(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x02e9 }
            int r10 = com.p683ss.android.p1168h.C19166a.f52819a     // Catch:{ all -> 0x02e9 }
            if (r5 == r10) goto L_0x0170
            java.lang.String r0 = "VEBenchmark"
            java.lang.String r2 = "startDecoder failed!"
            com.p683ss.android.vesdk.C50792y.m109914d(r0, r2)     // Catch:{ all -> 0x02e9 }
            monitor-exit(r29)
            r2 = -105(0xffffffffffffff97, float:NaN)
            return r2
        L_0x0170:
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x0173:
            if (r10 != 0) goto L_0x0197
            r25.clear()     // Catch:{ all -> 0x02e9 }
            r13 = r25
            r11 = 0
            r13.position(r11)     // Catch:{ all -> 0x02e9 }
            int r14 = r3.getSampleFlags()     // Catch:{ all -> 0x02e9 }
            r14 = r14 & r8
            if (r14 != r8) goto L_0x0187
            r14 = 1
            goto L_0x0188
        L_0x0187:
            r14 = 0
        L_0x0188:
            int r15 = r3.readSampleData(r13, r11)     // Catch:{ all -> 0x02e9 }
            if (r14 != 0) goto L_0x0190
            if (r15 > 0) goto L_0x0192
        L_0x0190:
            r10 = 1
            r15 = 0
        L_0x0192:
            r3.advance()     // Catch:{ all -> 0x02e9 }
            r11 = r15
            goto L_0x0199
        L_0x0197:
            r13 = r25
        L_0x0199:
            byte[] r17 = r13.array()     // Catch:{ all -> 0x02e9 }
            long r19 = r3.getSampleTime()     // Catch:{ all -> 0x02e9 }
            r16 = r4
            r18 = r11
            r21 = r0
            r22 = r6
            r23 = r7
            r24 = r9
            int r14 = r16.mo39111a(r17, r18, r19, r21, r22, r23, r24)     // Catch:{ all -> 0x02e9 }
            boolean r15 = r2.f126677d     // Catch:{ all -> 0x02e9 }
            if (r15 == 0) goto L_0x023e
            int r15 = com.p683ss.android.p1168h.C19166a.f52821c     // Catch:{ all -> 0x02e9 }
            if (r14 != r15) goto L_0x023e
            boolean r15 = r2.f126674a     // Catch:{ all -> 0x02e9 }
            if (r15 != 0) goto L_0x023e
            java.lang.String r15 = r2.f126678e     // Catch:{ all -> 0x02e9 }
            boolean r15 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x02e9 }
            if (r15 != 0) goto L_0x023e
            int r12 = r12 + 1
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x02e9 }
            java.lang.String r8 = r2.f126678e     // Catch:{ all -> 0x02e9 }
            r15.<init>(r8)     // Catch:{ all -> 0x02e9 }
            java.lang.String r8 = "decode"
            r15.append(r8)     // Catch:{ all -> 0x02e9 }
            r15.append(r12)     // Catch:{ all -> 0x02e9 }
            java.lang.String r8 = ".yuv"
            r15.append(r8)     // Catch:{ all -> 0x02e9 }
            java.io.File r8 = new java.io.File     // Catch:{ IOException -> 0x0233, all -> 0x022a }
            r26 = r7
            java.lang.String r7 = r15.toString()     // Catch:{ IOException -> 0x0227, all -> 0x022a }
            r8.<init>(r7)     // Catch:{ IOException -> 0x0227, all -> 0x022a }
            boolean r7 = r8.exists()     // Catch:{ IOException -> 0x0227, all -> 0x022a }
            if (r7 != 0) goto L_0x01f6
            java.io.File r7 = r8.getParentFile()     // Catch:{ IOException -> 0x0227, all -> 0x022a }
            r7.mkdirs()     // Catch:{ IOException -> 0x0227, all -> 0x022a }
            r8.createNewFile()     // Catch:{ IOException -> 0x0227, all -> 0x022a }
        L_0x01f6:
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0227, all -> 0x022a }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0227, all -> 0x022a }
            r7.write(r0)     // Catch:{ IOException -> 0x0222, all -> 0x0220 }
            java.lang.String r8 = "VEBenchmark"
            r27 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0224, all -> 0x0220 }
            r28 = r9
            java.lang.String r9 = "saveFile: "
            r0.<init>(r9)     // Catch:{ IOException -> 0x023a, all -> 0x0220 }
            java.lang.String r9 = r15.toString()     // Catch:{ IOException -> 0x023a, all -> 0x0220 }
            r0.append(r9)     // Catch:{ IOException -> 0x023a, all -> 0x0220 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x023a, all -> 0x0220 }
            com.p683ss.android.vesdk.C50792y.m109909a(r8, r0)     // Catch:{ IOException -> 0x023a, all -> 0x0220 }
            r7.flush()     // Catch:{ IOException -> 0x0244 }
        L_0x021c:
            r7.close()     // Catch:{ IOException -> 0x0244 }
            goto L_0x0244
        L_0x0220:
            r0 = move-exception
            goto L_0x022c
        L_0x0222:
            r27 = r0
        L_0x0224:
            r28 = r9
            goto L_0x023a
        L_0x0227:
            r27 = r0
            goto L_0x0237
        L_0x022a:
            r0 = move-exception
            r7 = 0
        L_0x022c:
            r7.flush()     // Catch:{ IOException -> 0x0232 }
            r7.close()     // Catch:{ IOException -> 0x0232 }
        L_0x0232:
            throw r0     // Catch:{ all -> 0x02e9 }
        L_0x0233:
            r27 = r0
            r26 = r7
        L_0x0237:
            r28 = r9
            r7 = 0
        L_0x023a:
            r7.flush()     // Catch:{ IOException -> 0x0244 }
            goto L_0x021c
        L_0x023e:
            r27 = r0
            r26 = r7
            r28 = r9
        L_0x0244:
            int r0 = com.p683ss.android.p1168h.C19166a.f52820b     // Catch:{ all -> 0x02e9 }
            if (r14 == r0) goto L_0x0253
            r25 = r13
            r7 = r26
            r0 = r27
            r9 = r28
            r8 = 4
            goto L_0x0173
        L_0x0253:
            r3.release()     // Catch:{ all -> 0x02e9 }
            android.media.MediaCodec r0 = r4.f52840i     // Catch:{ all -> 0x02e9 }
            r0.stop()     // Catch:{ all -> 0x02e9 }
            android.media.MediaCodec r0 = r4.f52840i     // Catch:{ all -> 0x02e9 }
            r0.release()     // Catch:{ all -> 0x02e9 }
            android.os.HandlerThread r0 = r4.f52841j     // Catch:{ all -> 0x02e9 }
            r0.quit()     // Catch:{ all -> 0x02e9 }
            boolean r0 = r4.f52835d     // Catch:{ all -> 0x02e9 }
            if (r0 == 0) goto L_0x029f
            com.ss.android.h.b$a r0 = r4.f52839h     // Catch:{ all -> 0x02e9 }
            int r3 = r0.f52859d     // Catch:{ all -> 0x02e9 }
            if (r3 == 0) goto L_0x0277
            int r3 = r0.f52859d     // Catch:{ all -> 0x02e9 }
            android.opengl.GLES20.glDeleteProgram(r3)     // Catch:{ all -> 0x02e9 }
            r3 = 0
            r0.f52859d = r3     // Catch:{ all -> 0x02e9 }
        L_0x0277:
            int[] r3 = r0.f52864i     // Catch:{ all -> 0x02e9 }
            r7 = 0
            r3 = r3[r7]     // Catch:{ all -> 0x02e9 }
            if (r3 == 0) goto L_0x0284
            int[] r0 = r0.f52864i     // Catch:{ all -> 0x02e9 }
            r3 = 1
            android.opengl.GLES20.glDeleteFramebuffers(r3, r0, r7)     // Catch:{ all -> 0x02e9 }
        L_0x0284:
            android.view.Surface r0 = r4.f52838g     // Catch:{ all -> 0x02e9 }
            r0.release()     // Catch:{ all -> 0x02e9 }
            android.graphics.SurfaceTexture r0 = r4.f52837f     // Catch:{ all -> 0x02e9 }
            r0.release()     // Catch:{ all -> 0x02e9 }
            int[] r0 = r4.f52836e     // Catch:{ all -> 0x02e9 }
            r3 = 0
            r0 = r0[r3]     // Catch:{ all -> 0x02e9 }
            if (r0 == 0) goto L_0x029f
            int[] r0 = r4.f52836e     // Catch:{ all -> 0x02e9 }
            r7 = 1
            android.opengl.GLES20.glDeleteTextures(r7, r0, r3)     // Catch:{ all -> 0x02e9 }
            int[] r0 = r4.f52836e     // Catch:{ all -> 0x02e9 }
            r0[r3] = r3     // Catch:{ all -> 0x02e9 }
        L_0x029f:
            java.lang.String r0 = com.p683ss.android.p1168h.C19167b.f52831a     // Catch:{ all -> 0x02e9 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02e9 }
            java.lang.String r7 = "stopDecoder frameCount: "
            r3.<init>(r7)     // Catch:{ all -> 0x02e9 }
            int r4 = r4.f52844m     // Catch:{ all -> 0x02e9 }
            r3.append(r4)     // Catch:{ all -> 0x02e9 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x02e9 }
            com.p683ss.android.vesdk.C50792y.m109909a(r0, r3)     // Catch:{ all -> 0x02e9 }
            int r0 = com.p683ss.android.p1168h.C19166a.f52819a     // Catch:{ all -> 0x02e9 }
            boolean r0 = r2.f126674a     // Catch:{ all -> 0x02e9 }
            if (r0 == 0) goto L_0x02c3
            r0 = 1
            int[] r2 = new int[r0]     // Catch:{ all -> 0x02e9 }
            r3 = 0
            r2[r3] = r6     // Catch:{ all -> 0x02e9 }
            android.opengl.GLES20.glDeleteTextures(r0, r2, r3)     // Catch:{ all -> 0x02e9 }
        L_0x02c3:
            com.ss.android.vesdk.ab r0 = r1.f126671c     // Catch:{ all -> 0x02e9 }
            java.lang.String r2 = "runHWDecodeVideo"
            r0.mo98737a(r2)     // Catch:{ all -> 0x02e9 }
            monitor-exit(r29)
            return r5
        L_0x02cc:
            r0 = move-exception
            r2 = r0
            java.lang.String r0 = "VEBenchmark"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02e9 }
            java.lang.String r4 = "MediaExtractor setDataSource failed: "
            r3.<init>(r4)     // Catch:{ all -> 0x02e9 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x02e9 }
            r3.append(r2)     // Catch:{ all -> 0x02e9 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x02e9 }
            com.p683ss.android.vesdk.C50792y.m109914d(r0, r2)     // Catch:{ all -> 0x02e9 }
            monitor-exit(r29)
            r2 = -105(0xffffffffffffff97, float:NaN)
            return r2
        L_0x02e9:
            r0 = move-exception
            monitor-exit(r29)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.vesdk.VEBenchmark.mo98473a(java.lang.String, com.ss.android.vesdk.VEBenchmark$a):int");
    }
}
