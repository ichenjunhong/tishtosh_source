package com.p683ss.android.ugc.aweme.live.alphaplayer;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import com.p683ss.android.ugc.aweme.live.alphaplayer.C36029c.C36030a;
import com.p683ss.android.ugc.aweme.live.alphaplayer.C36038g.C36039a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.i */
final class C36041i implements C36038g {

    /* renamed from: a */
    private static String f92376a = "VideoRender";

    /* renamed from: r */
    private static int f92377r = 36197;

    /* renamed from: b */
    private float[] f92378b = {-1.0f, -1.0f, 0.0f, 0.5f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.5f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: c */
    private FloatBuffer f92379c;

    /* renamed from: d */
    private final String f92380d = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";

    /* renamed from: e */
    private final String f92381e = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  vec4 color = texture2D(sTexture, vTextureCoord);\n  vec4 color2Map = vec4(1.0, 1.0, 1.0, 1.0);\n  if (vTextureCoord.x >= 0.5) {\n     color2Map = texture2D(sTexture, vec2(vTextureCoord.x - 0.5, vTextureCoord.y));\n     gl_FragColor = vec4(color.r, color.g, color.b, color2Map.g);\n  } else {\n     gl_FragColor = vec4(color.r, color.g, color.b, color.a);\n  }\n}\n";

    /* renamed from: f */
    private String f92382f = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  vec4 color = texture2D(sTexture, vTextureCoord);\n  vec4 color2Map = vec4(1.0, 1.0, 1.0, 1.0);\n  if (vTextureCoord.x >= 0.5) {\n     color2Map = texture2D(sTexture, vec2(vTextureCoord.x - 0.5, vTextureCoord.y));\n     gl_FragColor = vec4(color.r, color.g, color.b, color2Map.g);\n  } else {\n     gl_FragColor = vec4(color.r, color.g, color.b, color.a);\n  }\n}\n";

    /* renamed from: g */
    private float[] f92383g = new float[16];

    /* renamed from: h */
    private float[] f92384h = new float[16];

    /* renamed from: i */
    private int f92385i;

    /* renamed from: j */
    private int f92386j;

    /* renamed from: k */
    private int f92387k;

    /* renamed from: l */
    private int f92388l;

    /* renamed from: m */
    private int f92389m;

    /* renamed from: n */
    private int f92390n;

    /* renamed from: o */
    private SurfaceTexture f92391o;

    /* renamed from: p */
    private AtomicBoolean f92392p = new AtomicBoolean(false);

    /* renamed from: q */
    private AtomicBoolean f92393q = new AtomicBoolean(false);

    /* renamed from: s */
    private C36039a f92394s;

    /* renamed from: t */
    private GLSurfaceView f92395t;

    /* renamed from: u */
    private C36030a f92396u = C36030a.ScaleAspectFill;

    /* renamed from: a */
    public final void mo74788a() {
        this.f92393q.compareAndSet(false, true);
        this.f92395t.requestRender();
    }

    /* renamed from: b */
    public final void mo74793b() {
        this.f92393q.compareAndSet(true, false);
        this.f92395t.requestRender();
    }

    /* renamed from: b */
    private static void m81304b(String str) {
        GLES20.glGetError();
    }

    /* renamed from: a */
    public final void mo74790a(C36030a aVar) {
        this.f92396u = aVar;
    }

    /* renamed from: a */
    public final void mo74791a(C36039a aVar) {
        this.f92394s = aVar;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f92392p.compareAndSet(false, true);
        this.f92395t.requestRender();
    }

    /* renamed from: a */
    public final void mo74792a(String str) {
        this.f92382f = str;
    }

    C36041i(GLSurfaceView gLSurfaceView) {
        this.f92395t = gLSurfaceView;
        this.f92379c = ByteBuffer.allocateDirect(this.f92378b.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f92379c.put(this.f92378b).position(0);
        Matrix.setIdentityM(this.f92384h, 0);
    }

    public final void onDrawFrame(GL10 gl10) {
        if (this.f92392p.compareAndSet(true, false)) {
            this.f92391o.updateTexImage();
            this.f92391o.getTransformMatrix(this.f92384h);
        }
        GLES20.glClear(16640);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        if (!this.f92393q.get()) {
            GLES20.glFinish();
            return;
        }
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        GLES20.glUseProgram(this.f92385i);
        m81304b("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(f92377r, this.f92386j);
        this.f92379c.position(0);
        GLES20.glVertexAttribPointer(this.f92389m, 3, 5126, false, 20, this.f92379c);
        m81304b("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.f92389m);
        m81304b("glEnableVertexAttribArray aPositionHandle");
        this.f92379c.position(3);
        GLES20.glVertexAttribPointer(this.f92390n, 3, 5126, false, 20, this.f92379c);
        m81304b("glVertexAttribPointer aTextureHandle");
        GLES20.glEnableVertexAttribArray(this.f92390n);
        m81304b("glEnableVertexAttribArray aTextureHandle");
        Matrix.setIdentityM(this.f92383g, 0);
        GLES20.glUniformMatrix4fv(this.f92387k, 1, false, this.f92383g, 0);
        GLES20.glUniformMatrix4fv(this.f92388l, 1, false, this.f92384h, 0);
        GLES20.glDrawArrays(5, 0, 4);
        m81304b("glDrawArrays");
        GLES20.glFinish();
    }

    /* renamed from: a */
    private static int m81303a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader == 0) {
            return glCreateShader;
        }
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

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 r4, javax.microedition.khronos.egl.EGLConfig r5) {
        /*
            r3 = this;
            java.lang.String r4 = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n"
            java.lang.String r5 = r3.f92382f
            r0 = 35633(0x8b31, float:4.9932E-41)
            int r4 = m81303a(r0, r4)
            r0 = 1
            r1 = 0
            if (r4 != 0) goto L_0x0011
        L_0x000f:
            r2 = 0
            goto L_0x0044
        L_0x0011:
            r2 = 35632(0x8b30, float:4.9931E-41)
            int r5 = m81303a(r2, r5)
            if (r5 != 0) goto L_0x001b
            goto L_0x000f
        L_0x001b:
            int r2 = android.opengl.GLES20.glCreateProgram()
            if (r2 == 0) goto L_0x0044
            android.opengl.GLES20.glAttachShader(r2, r4)
            java.lang.String r4 = "glAttachShader"
            m81304b(r4)
            android.opengl.GLES20.glAttachShader(r2, r5)
            java.lang.String r4 = "glAttachShader"
            m81304b(r4)
            android.opengl.GLES20.glLinkProgram(r2)
            int[] r4 = new int[r0]
            r5 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r2, r5, r4, r1)
            r4 = r4[r1]
            if (r4 == r0) goto L_0x0044
            android.opengl.GLES20.glDeleteProgram(r2)
            goto L_0x000f
        L_0x0044:
            r3.f92385i = r2
            int r4 = r3.f92385i
            if (r4 != 0) goto L_0x004b
            return
        L_0x004b:
            int r4 = r3.f92385i
            java.lang.String r5 = "aPosition"
            int r4 = android.opengl.GLES20.glGetAttribLocation(r4, r5)
            r3.f92389m = r4
            java.lang.String r4 = "glGetAttribLocation aPosition"
            m81304b(r4)
            int r4 = r3.f92389m
            r5 = -1
            if (r4 == r5) goto L_0x0113
            int r4 = r3.f92385i
            java.lang.String r2 = "aTextureCoord"
            int r4 = android.opengl.GLES20.glGetAttribLocation(r4, r2)
            r3.f92390n = r4
            java.lang.String r4 = "glGetAttribLocation aTextureCoord"
            m81304b(r4)
            int r4 = r3.f92390n
            if (r4 == r5) goto L_0x010b
            int r4 = r3.f92385i
            java.lang.String r2 = "uMVPMatrix"
            int r4 = android.opengl.GLES20.glGetUniformLocation(r4, r2)
            r3.f92387k = r4
            java.lang.String r4 = "glGetUniformLocation uMVPMatrix"
            m81304b(r4)
            int r4 = r3.f92387k
            if (r4 == r5) goto L_0x0103
            int r4 = r3.f92385i
            java.lang.String r2 = "uSTMatrix"
            int r4 = android.opengl.GLES20.glGetUniformLocation(r4, r2)
            r3.f92388l = r4
            java.lang.String r4 = "glGetUniformLocation uSTMatrix"
            m81304b(r4)
            int r4 = r3.f92388l
            if (r4 == r5) goto L_0x00fb
            int[] r4 = new int[r0]
            android.opengl.GLES20.glGenTextures(r0, r4, r1)
            r4 = r4[r1]
            r3.f92386j = r4
            int r4 = f92377r
            int r5 = r3.f92386j
            android.opengl.GLES20.glBindTexture(r4, r5)
            java.lang.String r4 = "glBindTexture textureID"
            m81304b(r4)
            int r4 = f92377r
            r5 = 10241(0x2801, float:1.435E-41)
            r2 = 1175977984(0x46180000, float:9728.0)
            android.opengl.GLES20.glTexParameterf(r4, r5, r2)
            int r4 = f92377r
            r5 = 10240(0x2800, float:1.4349E-41)
            r2 = 1175979008(0x46180400, float:9729.0)
            android.opengl.GLES20.glTexParameterf(r4, r5, r2)
            android.graphics.SurfaceTexture r4 = new android.graphics.SurfaceTexture
            int r5 = r3.f92386j
            r4.<init>(r5)
            r3.f92391o = r4
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 15
            if (r4 < r5) goto L_0x00e0
            android.graphics.SurfaceTexture r4 = r3.f92391o
            android.opengl.GLSurfaceView r5 = r3.f92395t
            int r5 = r5.getMeasuredWidth()
            android.opengl.GLSurfaceView r2 = r3.f92395t
            int r2 = r2.getMeasuredHeight()
            r4.setDefaultBufferSize(r5, r2)
        L_0x00e0:
            android.graphics.SurfaceTexture r4 = r3.f92391o
            r4.setOnFrameAvailableListener(r3)
            android.view.Surface r4 = new android.view.Surface
            android.graphics.SurfaceTexture r5 = r3.f92391o
            r4.<init>(r5)
            com.ss.android.ugc.aweme.live.alphaplayer.g$a r5 = r3.f92394s
            if (r5 == 0) goto L_0x00f5
            com.ss.android.ugc.aweme.live.alphaplayer.g$a r5 = r3.f92394s
            r5.mo74756a(r4)
        L_0x00f5:
            java.util.concurrent.atomic.AtomicBoolean r4 = r3.f92392p
            r4.compareAndSet(r0, r1)
            return
        L_0x00fb:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r5 = "Could not get attrib location for uSTMatrix"
            r4.<init>(r5)
            throw r4
        L_0x0103:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r5 = "Could not get attrib location for uMVPMatrix"
            r4.<init>(r5)
            throw r4
        L_0x010b:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r5 = "Could not get attrib location for aTextureCoord"
            r4.<init>(r5)
            throw r4
        L_0x0113:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r5 = "Could not get attrib location for aPosition"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.live.alphaplayer.C36041i.onSurfaceCreated(javax.microedition.khronos.opengles.GL10, javax.microedition.khronos.egl.EGLConfig):void");
    }

    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    /* renamed from: b */
    private static float[] m81305b(float f, float f2, float f3, float f4) {
        float f5 = (f * 2.0f) - 4.0f;
        float f6 = (f4 * 2.0f) - 4.0f;
        float f7 = 1.0f - (f3 * 2.0f);
        float f8 = 1.0f - (f2 * 2.0f);
        return new float[]{f5, f6, 0.0f, 0.5f, 0.0f, f7, f6, 0.0f, 1.0f, 0.0f, f5, f8, 0.0f, 0.5f, 1.0f, f7, f8, 0.0f, 1.0f, 1.0f};
    }

    /* renamed from: c */
    private static float[] m81306c(float f, float f2, float f3, float f4) {
        float f5 = (f / 2.0f) + 0.5f;
        float f6 = f4 + 0.0f;
        float f7 = 1.0f - (f3 / 2.0f);
        float f8 = 1.0f - f2;
        return new float[]{-1.0f, -1.0f, 0.0f, f5, f6, 1.0f, -1.0f, 0.0f, f7, f6, -1.0f, 1.0f, 0.0f, f5, f8, 1.0f, 1.0f, 0.0f, f7, f8};
    }

    /* renamed from: a */
    public final void mo74789a(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        float f8 = 0.0f;
        if (f > 0.0f && f2 > 0.0f && f3 > 0.0f && f4 > 0.0f) {
            float f9 = f / f2;
            float f10 = f3 / f4;
            if (f9 > f10) {
                f5 = (1.0f - (f2 / (f / f10))) / 2.0f;
                f6 = 0.0f;
            } else {
                f6 = (1.0f - (f / (f2 * f10))) / 2.0f;
                f5 = 0.0f;
            }
            switch (this.f92396u) {
                case ScaleToFill:
                    this.f92378b = m81306c(0.0f, 0.0f, 0.0f, 0.0f);
                    break;
                case ScaleAspectFitCenter:
                    if (f9 > f10) {
                        f7 = (1.0f - ((f2 * f10) / f)) / 2.0f;
                    } else {
                        f8 = (1.0f - ((f / f10) / f2)) / 2.0f;
                        f7 = 0.0f;
                    }
                    this.f92378b = m81305b(f7, f8, f7, f8);
                    break;
                case ScaleAspectFill:
                    this.f92378b = m81306c(f6, f5, f6, f5);
                    break;
                case TopFill:
                    this.f92378b = m81306c(f6, 0.0f, f6, f5 * 2.0f);
                    break;
                case BottomFill:
                    this.f92378b = m81306c(f6, f5 * 2.0f, f6, 0.0f);
                    break;
                case LeftFill:
                    this.f92378b = m81306c(0.0f, f5, f6 * 2.0f, f5);
                    break;
                case RightFill:
                    this.f92378b = m81306c(f6 * 2.0f, f5, 0.0f, f5);
                    break;
                case TopFit:
                    this.f92378b = m81305b(0.0f, 0.0f, 0.0f, ((1.0f - ((f / f10) / f2)) / 2.0f) * 2.0f);
                    break;
                case BottomFit:
                    this.f92378b = m81305b(0.0f, ((1.0f - ((f / f10) / f2)) / 2.0f) * 2.0f, 0.0f, 0.0f);
                    break;
                case LeftFit:
                    this.f92378b = m81305b(0.0f, 0.0f, ((1.0f - ((f2 * f10) / f)) / 2.0f) * 2.0f, 0.0f);
                    break;
                case RightFit:
                    this.f92378b = m81305b(((1.0f - ((f2 * f10) / f)) / 2.0f) * 2.0f, 0.0f, 0.0f, 0.0f);
                    break;
            }
            this.f92379c = ByteBuffer.allocateDirect(this.f92378b.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f92379c.put(this.f92378b).position(0);
        }
    }
}
