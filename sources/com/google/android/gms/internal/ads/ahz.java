package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

@C16299uq
public final class ahz extends Thread implements OnFrameAvailableListener, ahy {

    /* renamed from: a */
    private static final float[] f40524a = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};

    /* renamed from: A */
    private volatile boolean f40525A;

    /* renamed from: B */
    private volatile boolean f40526B;

    /* renamed from: b */
    private final ahw f40527b;

    /* renamed from: c */
    private final float[] f40528c;

    /* renamed from: d */
    private final float[] f40529d;

    /* renamed from: e */
    private final float[] f40530e;

    /* renamed from: f */
    private final float[] f40531f;

    /* renamed from: g */
    private final float[] f40532g;

    /* renamed from: h */
    private final float[] f40533h;

    /* renamed from: i */
    private final float[] f40534i;

    /* renamed from: j */
    private float f40535j;

    /* renamed from: k */
    private float f40536k;

    /* renamed from: l */
    private float f40537l;

    /* renamed from: m */
    private int f40538m;

    /* renamed from: n */
    private int f40539n;

    /* renamed from: o */
    private SurfaceTexture f40540o;

    /* renamed from: p */
    private SurfaceTexture f40541p;

    /* renamed from: q */
    private int f40542q;

    /* renamed from: r */
    private int f40543r;

    /* renamed from: s */
    private int f40544s;

    /* renamed from: t */
    private FloatBuffer f40545t = ByteBuffer.allocateDirect(f40524a.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();

    /* renamed from: u */
    private final CountDownLatch f40546u;

    /* renamed from: v */
    private final Object f40547v;

    /* renamed from: w */
    private EGL10 f40548w;

    /* renamed from: x */
    private EGLDisplay f40549x;

    /* renamed from: y */
    private EGLContext f40550y;

    /* renamed from: z */
    private EGLSurface f40551z;

    public ahz(Context context) {
        super("SphericalVideoProcessor");
        this.f40545t.put(f40524a).position(0);
        this.f40528c = new float[9];
        this.f40529d = new float[9];
        this.f40530e = new float[9];
        this.f40531f = new float[9];
        this.f40532g = new float[9];
        this.f40533h = new float[9];
        this.f40534i = new float[9];
        this.f40535j = Float.NaN;
        this.f40527b = new ahw(context);
        this.f40527b.f40518c = this;
        this.f40546u = new CountDownLatch(1);
        this.f40547v = new Object();
    }

    /* renamed from: a */
    public final void mo28925a(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f40539n = i;
        this.f40538m = i2;
        this.f40541p = surfaceTexture;
    }

    /* renamed from: a */
    public final void mo28924a(int i, int i2) {
        synchronized (this.f40547v) {
            this.f40539n = i;
            this.f40538m = i2;
            this.f40525A = true;
            this.f40547v.notifyAll();
        }
    }

    /* renamed from: b */
    public final void mo28926b() {
        synchronized (this.f40547v) {
            this.f40526B = true;
            this.f40541p = null;
            this.f40547v.notifyAll();
        }
    }

    /* renamed from: c */
    public final SurfaceTexture mo28927c() {
        if (this.f40541p == null) {
            return null;
        }
        try {
            this.f40546u.await();
        } catch (InterruptedException unused) {
        }
        return this.f40540o;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f40544s++;
        synchronized (this.f40547v) {
            this.f40547v.notifyAll();
        }
    }

    /* renamed from: a */
    public final void mo28922a() {
        synchronized (this.f40547v) {
            this.f40547v.notifyAll();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x03db  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01d0 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            android.graphics.SurfaceTexture r0 = r15.f40541p
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "SphericalVideoProcessor started with no output texture."
            com.google.android.gms.internal.ads.abv.m32794c(r0)
            java.util.concurrent.CountDownLatch r0 = r15.f40546u
            r0.countDown()
            return
        L_0x000f:
            javax.microedition.khronos.egl.EGL r0 = javax.microedition.khronos.egl.EGLContext.getEGL()
            javax.microedition.khronos.egl.EGL10 r0 = (javax.microedition.khronos.egl.EGL10) r0
            r15.f40548w = r0
            javax.microedition.khronos.egl.EGL10 r0 = r15.f40548w
            java.lang.Object r1 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY
            javax.microedition.khronos.egl.EGLDisplay r0 = r0.eglGetDisplay(r1)
            r15.f40549x = r0
            javax.microedition.khronos.egl.EGLDisplay r0 = r15.f40549x
            javax.microedition.khronos.egl.EGLDisplay r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY
            r2 = 11
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = 0
            if (r0 != r1) goto L_0x0031
        L_0x002e:
            r0 = 0
            goto L_0x00a4
        L_0x0031:
            int[] r0 = new int[r4]
            javax.microedition.khronos.egl.EGL10 r1 = r15.f40548w
            javax.microedition.khronos.egl.EGLDisplay r8 = r15.f40549x
            boolean r0 = r1.eglInitialize(r8, r0)
            if (r0 != 0) goto L_0x003e
            goto L_0x002e
        L_0x003e:
            int[] r0 = new int[r6]
            javax.microedition.khronos.egl.EGLConfig[] r1 = new javax.microedition.khronos.egl.EGLConfig[r6]
            int[] r10 = new int[r2]
            r10 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344} // fill-array
            javax.microedition.khronos.egl.EGL10 r8 = r15.f40548w
            javax.microedition.khronos.egl.EGLDisplay r9 = r15.f40549x
            r12 = 1
            r11 = r1
            r13 = r0
            boolean r8 = r8.eglChooseConfig(r9, r10, r11, r12, r13)
            if (r8 == 0) goto L_0x005b
            r0 = r0[r7]
            if (r0 <= 0) goto L_0x005b
            r0 = r1[r7]
            goto L_0x005c
        L_0x005b:
            r0 = r5
        L_0x005c:
            if (r0 != 0) goto L_0x005f
            goto L_0x002e
        L_0x005f:
            int[] r1 = new int[r3]
            r1 = {12440, 2, 12344} // fill-array
            javax.microedition.khronos.egl.EGL10 r8 = r15.f40548w
            javax.microedition.khronos.egl.EGLDisplay r9 = r15.f40549x
            javax.microedition.khronos.egl.EGLContext r10 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            javax.microedition.khronos.egl.EGLContext r1 = r8.eglCreateContext(r9, r0, r10, r1)
            r15.f40550y = r1
            javax.microedition.khronos.egl.EGLContext r1 = r15.f40550y
            if (r1 == 0) goto L_0x002e
            javax.microedition.khronos.egl.EGLContext r1 = r15.f40550y
            javax.microedition.khronos.egl.EGLContext r8 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            if (r1 != r8) goto L_0x007b
            goto L_0x002e
        L_0x007b:
            javax.microedition.khronos.egl.EGL10 r1 = r15.f40548w
            javax.microedition.khronos.egl.EGLDisplay r8 = r15.f40549x
            android.graphics.SurfaceTexture r9 = r15.f40541p
            javax.microedition.khronos.egl.EGLSurface r0 = r1.eglCreateWindowSurface(r8, r0, r9, r5)
            r15.f40551z = r0
            javax.microedition.khronos.egl.EGLSurface r0 = r15.f40551z
            if (r0 == 0) goto L_0x002e
            javax.microedition.khronos.egl.EGLSurface r0 = r15.f40551z
            javax.microedition.khronos.egl.EGLSurface r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
            if (r0 != r1) goto L_0x0092
            goto L_0x002e
        L_0x0092:
            javax.microedition.khronos.egl.EGL10 r0 = r15.f40548w
            javax.microedition.khronos.egl.EGLDisplay r1 = r15.f40549x
            javax.microedition.khronos.egl.EGLSurface r8 = r15.f40551z
            javax.microedition.khronos.egl.EGLSurface r9 = r15.f40551z
            javax.microedition.khronos.egl.EGLContext r10 = r15.f40550y
            boolean r0 = r0.eglMakeCurrent(r1, r8, r9, r10)
            if (r0 != 0) goto L_0x00a3
            goto L_0x002e
        L_0x00a3:
            r0 = 1
        L_0x00a4:
            r1 = 35633(0x8b31, float:4.9932E-41)
            com.google.android.gms.internal.ads.bl<java.lang.String> r8 = com.google.android.gms.internal.ads.C15740bx.f44295bc
            com.google.android.gms.internal.ads.bu r9 = com.google.android.gms.internal.ads.caf.m37099d()
            java.lang.Object r9 = r9.mo30717a(r8)
            java.lang.String r9 = (java.lang.String) r9
            T r10 = r8.f42834c
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x00c6
            com.google.android.gms.internal.ads.bu r9 = com.google.android.gms.internal.ads.caf.m37099d()
            java.lang.Object r8 = r9.mo30717a(r8)
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x00c8
        L_0x00c6:
            java.lang.String r8 = "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}"
        L_0x00c8:
            int r1 = m32947a(r1, r8)
            if (r1 != 0) goto L_0x00d0
        L_0x00ce:
            r9 = 0
            goto L_0x0140
        L_0x00d0:
            r8 = 35632(0x8b30, float:4.9931E-41)
            com.google.android.gms.internal.ads.bl<java.lang.String> r9 = com.google.android.gms.internal.ads.C15740bx.f44296bd
            com.google.android.gms.internal.ads.bu r10 = com.google.android.gms.internal.ads.caf.m37099d()
            java.lang.Object r10 = r10.mo30717a(r9)
            java.lang.String r10 = (java.lang.String) r10
            T r11 = r9.f42834c
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x00f2
            com.google.android.gms.internal.ads.bu r10 = com.google.android.gms.internal.ads.caf.m37099d()
            java.lang.Object r9 = r10.mo30717a(r9)
            java.lang.String r9 = (java.lang.String) r9
            goto L_0x00f4
        L_0x00f2:
            java.lang.String r9 = "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}"
        L_0x00f4:
            int r8 = m32947a(r8, r9)
            if (r8 != 0) goto L_0x00fb
            goto L_0x00ce
        L_0x00fb:
            int r9 = android.opengl.GLES20.glCreateProgram()
            java.lang.String r10 = "createProgram"
            m32948a(r10)
            if (r9 == 0) goto L_0x0140
            android.opengl.GLES20.glAttachShader(r9, r1)
            java.lang.String r1 = "attachShader"
            m32948a(r1)
            android.opengl.GLES20.glAttachShader(r9, r8)
            java.lang.String r1 = "attachShader"
            m32948a(r1)
            android.opengl.GLES20.glLinkProgram(r9)
            java.lang.String r1 = "linkProgram"
            m32948a(r1)
            int[] r1 = new int[r6]
            r8 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r9, r8, r1, r7)
            java.lang.String r8 = "getProgramiv"
            m32948a(r8)
            r1 = r1[r7]
            if (r1 == r6) goto L_0x0138
            android.opengl.GLES20.glDeleteProgram(r9)
            java.lang.String r1 = "deleteProgram"
            m32948a(r1)
            goto L_0x00ce
        L_0x0138:
            android.opengl.GLES20.glValidateProgram(r9)
            java.lang.String r1 = "validateProgram"
            m32948a(r1)
        L_0x0140:
            r15.f40542q = r9
            int r1 = r15.f40542q
            android.opengl.GLES20.glUseProgram(r1)
            java.lang.String r1 = "useProgram"
            m32948a(r1)
            int r1 = r15.f40542q
            java.lang.String r8 = "aPosition"
            int r1 = android.opengl.GLES20.glGetAttribLocation(r1, r8)
            r10 = 3
            r11 = 5126(0x1406, float:7.183E-42)
            r12 = 0
            r13 = 12
            java.nio.FloatBuffer r14 = r15.f40545t
            r9 = r1
            android.opengl.GLES20.glVertexAttribPointer(r9, r10, r11, r12, r13, r14)
            java.lang.String r8 = "vertexAttribPointer"
            m32948a(r8)
            android.opengl.GLES20.glEnableVertexAttribArray(r1)
            java.lang.String r1 = "enableVertexAttribArray"
            m32948a(r1)
            int[] r1 = new int[r6]
            android.opengl.GLES20.glGenTextures(r6, r1, r7)
            java.lang.String r8 = "genTextures"
            m32948a(r8)
            r1 = r1[r7]
            r8 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r8, r1)
            java.lang.String r9 = "bindTextures"
            m32948a(r9)
            r9 = 10240(0x2800, float:1.4349E-41)
            r10 = 9729(0x2601, float:1.3633E-41)
            android.opengl.GLES20.glTexParameteri(r8, r9, r10)
            java.lang.String r9 = "texParameteri"
            m32948a(r9)
            r9 = 10241(0x2801, float:1.435E-41)
            android.opengl.GLES20.glTexParameteri(r8, r9, r10)
            java.lang.String r9 = "texParameteri"
            m32948a(r9)
            r9 = 10242(0x2802, float:1.4352E-41)
            r10 = 33071(0x812f, float:4.6342E-41)
            android.opengl.GLES20.glTexParameteri(r8, r9, r10)
            java.lang.String r9 = "texParameteri"
            m32948a(r9)
            r9 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r8, r9, r10)
            java.lang.String r8 = "texParameteri"
            m32948a(r8)
            int r8 = r15.f40542q
            java.lang.String r9 = "uVMat"
            int r8 = android.opengl.GLES20.glGetUniformLocation(r8, r9)
            r15.f40543r = r8
            r8 = 9
            float[] r8 = new float[r8]
            r8 = {1065353216, 0, 0, 0, 1065353216, 0, 0, 0, 1065353216} // fill-array
            int r9 = r15.f40543r
            android.opengl.GLES20.glUniformMatrix3fv(r9, r6, r7, r8, r7)
            int r8 = r15.f40542q
            if (r8 == 0) goto L_0x01cd
            r8 = 1
            goto L_0x01ce
        L_0x01cd:
            r8 = 0
        L_0x01ce:
            if (r0 == 0) goto L_0x03c0
            if (r8 != 0) goto L_0x01d4
            goto L_0x03c0
        L_0x01d4:
            android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture
            r0.<init>(r1)
            r15.f40540o = r0
            android.graphics.SurfaceTexture r0 = r15.f40540o
            r0.setOnFrameAvailableListener(r15)
            java.util.concurrent.CountDownLatch r0 = r15.f40546u
            r0.countDown()
            com.google.android.gms.internal.ads.ahw r0 = r15.f40527b
            android.os.Handler r1 = r0.f40517b
            if (r1 != 0) goto L_0x0220
            android.hardware.SensorManager r1 = r0.f40516a
            android.hardware.Sensor r1 = r1.getDefaultSensor(r2)
            if (r1 != 0) goto L_0x01f9
            java.lang.String r0 = "No Sensor of TYPE_ROTATION_VECTOR"
            com.google.android.gms.internal.ads.abv.m32794c(r0)
            goto L_0x0220
        L_0x01f9:
            android.os.HandlerThread r2 = new android.os.HandlerThread
            java.lang.String r8 = "OrientationMonitor"
            r2.<init>(r8)
            r2.start()
            com.google.android.gms.internal.ads.apf r8 = new com.google.android.gms.internal.ads.apf
            android.os.Looper r2 = r2.getLooper()
            r8.<init>(r2)
            r0.f40517b = r8
            android.hardware.SensorManager r2 = r0.f40516a
            android.os.Handler r8 = r0.f40517b
            boolean r1 = r2.registerListener(r0, r1, r7, r8)
            if (r1 != 0) goto L_0x0220
            java.lang.String r1 = "SensorManager.registerListener failed."
            com.google.android.gms.internal.ads.abv.m32794c(r1)
            r0.mo28917a()
        L_0x0220:
            r15.f40525A = r6     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
        L_0x0222:
            boolean r0 = r15.f40526B     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            if (r0 != 0) goto L_0x036a
        L_0x0226:
            int r0 = r15.f40544s     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            if (r0 <= 0) goto L_0x0235
            android.graphics.SurfaceTexture r0 = r15.f40540o     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            r0.updateTexImage()     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            int r0 = r15.f40544s     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            int r0 = r0 - r6
            r15.f40544s = r0     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            goto L_0x0226
        L_0x0235:
            com.google.android.gms.internal.ads.ahw r0 = r15.f40527b     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float[] r1 = r15.f40528c     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            boolean r0 = r0.mo28918a(r1)     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            r1 = 5
            r2 = 4
            r8 = 1070141403(0x3fc90fdb, float:1.5707964)
            if (r0 == 0) goto L_0x02b5
            float r0 = r15.f40535j     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            boolean r0 = java.lang.Float.isNaN(r0)     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            if (r0 == 0) goto L_0x02aa
            float[] r0 = r15.f40528c     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float[] r9 = new float[r3]     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            r9 = {0, 1065353216, 0} // fill-array     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float[] r10 = new float[r3]     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            r11 = r0[r7]     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            r12 = r9[r7]     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float r11 = r11 * r12
            r12 = r0[r6]     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            r13 = r9[r6]     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r12 = r0[r4]     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            r13 = r9[r4]     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r10[r7] = r11     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            r11 = r0[r3]     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            r12 = r9[r7]     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float r11 = r11 * r12
            r12 = r0[r2]     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            r13 = r9[r6]     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r12 = r0[r1]     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            r13 = r9[r4]     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r10[r6] = r11     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            r11 = 6
            r11 = r0[r11]     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            r12 = r9[r7]     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float r11 = r11 * r12
            r12 = 7
            r12 = r0[r12]     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            r13 = r9[r6]     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r12 = 8
            r0 = r0[r12]     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            r9 = r9[r4]     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float r0 = r0 * r9
            float r11 = r11 + r0
            r10[r4] = r11     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            r0 = r10[r6]     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            double r11 = (double) r0     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            r0 = r10[r7]     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            double r9 = (double) r0     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            double r9 = java.lang.Math.atan2(r11, r9)     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float r0 = (float) r9     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float r0 = r0 - r8
            float r0 = -r0
            r15.f40535j = r0     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
        L_0x02aa:
            float[] r0 = r15.f40533h     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float r9 = r15.f40535j     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float r10 = r15.f40536k     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float r9 = r9 + r10
            m32951b(r0, r9)     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            goto L_0x02c4
        L_0x02b5:
            float[] r0 = r15.f40528c     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            r9 = -1077342245(0xffffffffbfc90fdb, float:-1.5707964)
            m32949a(r0, r9)     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float[] r0 = r15.f40533h     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float r9 = r15.f40536k     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            m32951b(r0, r9)     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
        L_0x02c4:
            float[] r0 = r15.f40529d     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            m32949a(r0, r8)     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float[] r0 = r15.f40530e     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float[] r8 = r15.f40533h     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float[] r9 = r15.f40529d     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            m32950a(r0, r8, r9)     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float[] r0 = r15.f40531f     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float[] r8 = r15.f40528c     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float[] r9 = r15.f40530e     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            m32950a(r0, r8, r9)     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float[] r0 = r15.f40532g     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float r8 = r15.f40537l     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            m32949a(r0, r8)     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float[] r0 = r15.f40534i     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float[] r8 = r15.f40532g     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float[] r9 = r15.f40531f     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            m32950a(r0, r8, r9)     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            int r0 = r15.f40543r     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float[] r8 = r15.f40534i     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            android.opengl.GLES20.glUniformMatrix3fv(r0, r6, r7, r8, r7)     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            android.opengl.GLES20.glDrawArrays(r1, r7, r2)     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            java.lang.String r0 = "drawArrays"
            m32948a(r0)     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            android.opengl.GLES20.glFinish()     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            javax.microedition.khronos.egl.EGL10 r0 = r15.f40548w     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            javax.microedition.khronos.egl.EGLDisplay r1 = r15.f40549x     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            javax.microedition.khronos.egl.EGLSurface r2 = r15.f40551z     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            r0.eglSwapBuffers(r1, r2)     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            boolean r0 = r15.f40525A     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            if (r0 == 0) goto L_0x0350
            int r0 = r15.f40539n     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            int r1 = r15.f40538m     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            android.opengl.GLES20.glViewport(r7, r7, r0, r1)     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            java.lang.String r0 = "viewport"
            m32948a(r0)     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            int r0 = r15.f40542q     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            java.lang.String r1 = "uFOVx"
            int r0 = android.opengl.GLES20.glGetUniformLocation(r0, r1)     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            int r1 = r15.f40542q     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            java.lang.String r2 = "uFOVy"
            int r1 = android.opengl.GLES20.glGetUniformLocation(r1, r2)     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            int r2 = r15.f40539n     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            int r8 = r15.f40538m     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            r9 = 1063216883(0x3f5f66f3, float:0.87266463)
            if (r2 <= r8) goto L_0x033f
            android.opengl.GLES20.glUniform1f(r0, r9)     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            int r0 = r15.f40538m     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float r0 = (float) r0     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float r0 = r0 * r9
            int r2 = r15.f40539n     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float r2 = (float) r2     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float r0 = r0 / r2
            android.opengl.GLES20.glUniform1f(r1, r0)     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            goto L_0x034e
        L_0x033f:
            int r2 = r15.f40539n     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float r2 = (float) r2     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float r2 = r2 * r9
            int r8 = r15.f40538m     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float r8 = (float) r8     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            float r2 = r2 / r8
            android.opengl.GLES20.glUniform1f(r0, r2)     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
            android.opengl.GLES20.glUniform1f(r1, r9)     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
        L_0x034e:
            r15.f40525A = r7     // Catch:{ IllegalStateException -> 0x039b, Throwable -> 0x037c }
        L_0x0350:
            java.lang.Object r0 = r15.f40547v     // Catch:{ InterruptedException -> 0x0222 }
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0222 }
            boolean r1 = r15.f40526B     // Catch:{ all -> 0x0367 }
            if (r1 != 0) goto L_0x0364
            boolean r1 = r15.f40525A     // Catch:{ all -> 0x0367 }
            if (r1 != 0) goto L_0x0364
            int r1 = r15.f40544s     // Catch:{ all -> 0x0367 }
            if (r1 != 0) goto L_0x0364
            java.lang.Object r1 = r15.f40547v     // Catch:{ all -> 0x0367 }
            r1.wait()     // Catch:{ all -> 0x0367 }
        L_0x0364:
            monitor-exit(r0)     // Catch:{ all -> 0x0367 }
            goto L_0x0222
        L_0x0367:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0367 }
            throw r1     // Catch:{ InterruptedException -> 0x0222 }
        L_0x036a:
            com.google.android.gms.internal.ads.ahw r0 = r15.f40527b
            r0.mo28917a()
            android.graphics.SurfaceTexture r0 = r15.f40540o
            r0.setOnFrameAvailableListener(r5)
            r15.f40540o = r5
            r15.m32952d()
            return
        L_0x037a:
            r0 = move-exception
            goto L_0x03b0
        L_0x037c:
            r0 = move-exception
            java.lang.String r1 = "SphericalVideoProcessor died."
            com.google.android.gms.internal.ads.abv.m32793b(r1, r0)     // Catch:{ all -> 0x037a }
            com.google.android.gms.internal.ads.abh r1 = com.google.android.gms.ads.internal.C14963ax.m30834d()     // Catch:{ all -> 0x037a }
            java.lang.String r2 = "SphericalVideoProcessor.run.2"
            r1.mo28588a(r0, r2)     // Catch:{ all -> 0x037a }
            com.google.android.gms.internal.ads.ahw r0 = r15.f40527b
            r0.mo28917a()
            android.graphics.SurfaceTexture r0 = r15.f40540o
            r0.setOnFrameAvailableListener(r5)
            r15.f40540o = r5
            r15.m32952d()
            return
        L_0x039b:
            java.lang.String r0 = "SphericalVideoProcessor halted unexpectedly."
            com.google.android.gms.internal.ads.abv.m32798e(r0)     // Catch:{ all -> 0x037a }
            com.google.android.gms.internal.ads.ahw r0 = r15.f40527b
            r0.mo28917a()
            android.graphics.SurfaceTexture r0 = r15.f40540o
            r0.setOnFrameAvailableListener(r5)
            r15.f40540o = r5
            r15.m32952d()
            return
        L_0x03b0:
            com.google.android.gms.internal.ads.ahw r1 = r15.f40527b
            r1.mo28917a()
            android.graphics.SurfaceTexture r1 = r15.f40540o
            r1.setOnFrameAvailableListener(r5)
            r15.f40540o = r5
            r15.m32952d()
            throw r0
        L_0x03c0:
            javax.microedition.khronos.egl.EGL10 r0 = r15.f40548w
            int r0 = r0.eglGetError()
            java.lang.String r0 = android.opengl.GLUtils.getEGLErrorString(r0)
            java.lang.String r1 = "EGL initialization failed: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x03db
            java.lang.String r0 = r1.concat(r0)
            goto L_0x03e0
        L_0x03db:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x03e0:
            com.google.android.gms.internal.ads.abv.m32794c(r0)
            com.google.android.gms.internal.ads.abh r1 = com.google.android.gms.ads.internal.C14963ax.m30834d()
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>(r0)
            java.lang.String r0 = "SphericalVideoProcessor.run.1"
            r1.mo28588a(r2, r0)
            r15.m32952d()
            java.util.concurrent.CountDownLatch r0 = r15.f40546u
            r0.countDown()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ahz.run():void");
    }

    /* renamed from: a */
    public final void mo28923a(float f, float f2) {
        float f3;
        float f4;
        if (this.f40539n > this.f40538m) {
            f4 = (f * 1.7453293f) / ((float) this.f40539n);
            f3 = (f2 * 1.7453293f) / ((float) this.f40539n);
        } else {
            f4 = (f * 1.7453293f) / ((float) this.f40538m);
            f3 = (f2 * 1.7453293f) / ((float) this.f40538m);
        }
        this.f40536k -= f4;
        this.f40537l -= f3;
        if (this.f40537l < -1.5707964f) {
            this.f40537l = -1.5707964f;
        }
        if (this.f40537l > 1.5707964f) {
            this.f40537l = 1.5707964f;
        }
    }

    /* renamed from: a */
    private static void m32950a(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = (fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3]) + (fArr2[2] * fArr3[6]);
        fArr[1] = (fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4]) + (fArr2[2] * fArr3[7]);
        fArr[2] = (fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5]) + (fArr2[2] * fArr3[8]);
        fArr[3] = (fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3]) + (fArr2[5] * fArr3[6]);
        fArr[4] = (fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4]) + (fArr2[5] * fArr3[7]);
        fArr[5] = (fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5]) + (fArr2[5] * fArr3[8]);
        fArr[6] = (fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3]) + (fArr2[8] * fArr3[6]);
        fArr[7] = (fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4]) + (fArr2[8] * fArr3[7]);
        fArr[8] = (fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5]) + (fArr2[8] * fArr3[8]);
    }

    /* renamed from: a */
    private static void m32949a(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = (double) f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    /* renamed from: b */
    private static void m32951b(float[] fArr, float f) {
        double d = (double) f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    /* renamed from: a */
    private static int m32947a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        m32948a("createShader");
        if (glCreateShader == 0) {
            return glCreateShader;
        }
        GLES20.glShaderSource(glCreateShader, str);
        m32948a("shaderSource");
        GLES20.glCompileShader(glCreateShader);
        m32948a("compileShader");
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        m32948a("getShaderiv");
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        GLES20.glDeleteShader(glCreateShader);
        m32948a("deleteShader");
        return 0;
    }

    /* renamed from: d */
    private final boolean m32952d() {
        boolean z = false;
        if (!(this.f40551z == null || this.f40551z == EGL10.EGL_NO_SURFACE)) {
            EGL10 egl10 = this.f40548w;
            EGLDisplay eGLDisplay = this.f40549x;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            z = this.f40548w.eglDestroySurface(this.f40549x, this.f40551z) | egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT) | false;
            this.f40551z = null;
        }
        if (this.f40550y != null) {
            z |= this.f40548w.eglDestroyContext(this.f40549x, this.f40550y);
            this.f40550y = null;
        }
        if (this.f40549x == null) {
            return z;
        }
        boolean eglTerminate = z | this.f40548w.eglTerminate(this.f40549x);
        this.f40549x = null;
        return eglTerminate;
    }

    /* renamed from: a */
    private static void m32948a(String str) {
        GLES20.glGetError();
    }
}
