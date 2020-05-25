package com.p683ss.android.medialib.image;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView.Renderer;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.Build;
import android.text.TextUtils;
import com.bef.effectsdk.OpenGLUtils;
import com.p683ss.android.medialib.NativePort.NativeRenderWrapper;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.feed.experiment.VideoPreloadSizeExperiment;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.ss.android.medialib.image.b */
public final class C19340b implements Renderer {

    /* renamed from: a */
    public NativeRenderWrapper f53447a = new NativeRenderWrapper();

    /* renamed from: b */
    public boolean f53448b;

    /* renamed from: c */
    public C19342a f53449c;

    /* renamed from: d */
    public C19343b f53450d;

    /* renamed from: e */
    public C19344c f53451e = new C19344c();

    /* renamed from: f */
    private Bitmap f53452f;

    /* renamed from: g */
    private int f53453g;

    /* renamed from: h */
    private int f53454h;

    /* renamed from: i */
    private boolean f53455i;

    /* renamed from: j */
    private int f53456j;

    /* renamed from: k */
    private int f53457k;

    /* renamed from: l */
    private int f53458l;

    /* renamed from: m */
    private C19339a f53459m = new C19339a();

    /* renamed from: n */
    private float[] f53460n = new float[16];

    /* renamed from: o */
    private int f53461o;

    /* renamed from: p */
    private int f53462p;

    /* renamed from: com.ss.android.medialib.image.b$a */
    public interface C19342a {
        /* renamed from: a */
        void mo39871a(int i, int i2, ByteBuffer byteBuffer);
    }

    /* renamed from: com.ss.android.medialib.image.b$b */
    public interface C19343b {
        /* renamed from: a */
        void mo39879a();
    }

    /* renamed from: com.ss.android.medialib.image.b$c */
    public static class C19344c {

        /* renamed from: a */
        public String f53463a;

        /* renamed from: b */
        public float f53464b;

        /* renamed from: c */
        public float f53465c;

        /* renamed from: d */
        public String f53466d;

        /* renamed from: e */
        public float f53467e;

        /* renamed from: f */
        public boolean f53468f;

        private C19344c() {
            this.f53463a = "";
            this.f53464b = -1.0f;
            this.f53465c = -1.0f;
            this.f53466d = "";
        }
    }

    /* renamed from: a */
    public final void mo39874a() {
        NativeRenderWrapper nativeRenderWrapper = this.f53447a;
        if (nativeRenderWrapper.f52969a != 0) {
            nativeRenderWrapper.nativeDestroy(nativeRenderWrapper.f52969a);
            nativeRenderWrapper.f52969a = 0;
        }
        this.f53457k = 0;
        this.f53456j = 0;
        this.f53455i = true;
    }

    /* renamed from: b */
    private void m47235b() {
        float f = ((float) this.f53453g) / ((float) this.f53454h);
        float f2 = ((float) this.f53461o) / ((float) this.f53462p);
        float[] fArr = new float[16];
        float[] fArr2 = new float[16];
        if (this.f53461o > this.f53462p) {
            if (f > f2) {
                Matrix.orthoM(fArr, 0, -1.0f, 1.0f, (-f2) * f, f2 * f, 3.0f, 5.0f);
            } else {
                Matrix.orthoM(fArr, 0, (-f2) / f, f2 / f, -1.0f, 1.0f, 3.0f, 5.0f);
            }
        } else if (f > f2) {
            Matrix.orthoM(fArr, 0, -1.0f, 1.0f, (-1.0f / f2) * f, (1.0f / f2) * f, 3.0f, 5.0f);
        } else {
            Matrix.orthoM(fArr, 0, (-f2) / f, f2 / f, -1.0f, 1.0f, 3.0f, 5.0f);
        }
        Matrix.setLookAtM(fArr2, 0, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f53460n, 0, fArr, 0, fArr2, 0);
        this.f53459m.f53444f = this.f53460n;
    }

    /* renamed from: a */
    public final float mo39873a(String str) {
        if (!this.f53447a.mo39577a()) {
            return -1.0f;
        }
        NativeRenderWrapper nativeRenderWrapper = this.f53447a;
        if (nativeRenderWrapper.f52969a == 0) {
            return -1.0f;
        }
        return nativeRenderWrapper.nativeGetFilterIntensity(nativeRenderWrapper.f52969a, str);
    }

    /* renamed from: a */
    public final void mo39875a(Bitmap bitmap) {
        this.f53452f = bitmap;
        this.f53453g = this.f53452f.getWidth();
        this.f53454h = this.f53452f.getHeight();
        if (this.f53461o > 0 && this.f53462p > 0) {
            m47235b();
        }
        this.f53455i = true;
    }

    public final void onDrawFrame(GL10 gl10) {
        if (this.f53452f != null && !this.f53452f.isRecycled()) {
            if (this.f53455i) {
                C19339a aVar = this.f53459m;
                aVar.f53439a = OpenGLUtils.loadProgram("attribute vec4 vPosition;\nattribute vec2 vCoordinate;\nuniform mat4 vMatrix;\nvarying vec2 aCoordinate;\n\nvoid main(){\n    gl_Position=vMatrix*vPosition;\n    aCoordinate=vCoordinate;\n}", "precision mediump float;\nvarying vec2 aCoordinate;\nuniform sampler2D s_texture;\nvoid main() {\n    gl_FragColor = texture2D(s_texture, aCoordinate);\n}");
                aVar.f53440b = GLES20.glGetAttribLocation(aVar.f53439a, "vPosition");
                aVar.f53441c = GLES20.glGetAttribLocation(aVar.f53439a, "vCoordinate");
                aVar.f53442d = GLES20.glGetUniformLocation(aVar.f53439a, "s_texture");
                aVar.f53443e = GLES20.glGetUniformLocation(aVar.f53439a, "vMatrix");
                int[] iArr = new int[1];
                if (this.f53456j == 0) {
                    int[] iArr2 = new int[1];
                    GLES20.glGenFramebuffers(1, iArr2, 0);
                    this.f53456j = iArr2[0];
                }
                this.f53458l = OpenGLUtils.initEffectTexture(this.f53453g, this.f53454h, iArr, 3553);
                GLES20.glBindFramebuffer(36160, this.f53456j);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f53458l, 0);
                GLES20.glBindFramebuffer(36160, 0);
                int[] iArr3 = new int[1];
                GLES20.glGenTextures(1, iArr3, 0);
                GLES20.glBindTexture(3553, iArr3[0]);
                GLES20.glTexParameterf(3553, 10241, 9728.0f);
                GLES20.glTexParameterf(3553, VideoPreloadSizeExperiment.DEFAULT, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
                int[] iArr4 = new int[1];
                GLES20.glGetIntegerv(3317, iArr4, 0);
                if (this.f53453g % iArr4[0] != 0) {
                    GLES20.glPixelStorei(3317, 1);
                }
                GLUtils.texImage2D(3553, 0, this.f53452f, 0);
                if (this.f53453g % iArr4[0] != 0) {
                    GLES20.glPixelStorei(3317, iArr4[0]);
                }
                this.f53457k = iArr3[0];
                NativeRenderWrapper nativeRenderWrapper = this.f53447a;
                int i = this.f53453g;
                int i2 = this.f53454h;
                String str = Build.DEVICE;
                if (nativeRenderWrapper.f52969a == 0) {
                    nativeRenderWrapper.f52969a = nativeRenderWrapper.nativeCreate();
                    nativeRenderWrapper.nativeInit(nativeRenderWrapper.f52969a, i, i2, str);
                }
                this.f53455i = false;
                if (this.f53451e.f53468f) {
                    if (TextUtils.isEmpty(this.f53451e.f53466d)) {
                        this.f53447a.mo39574a(this.f53451e.f53463a, this.f53451e.f53464b);
                    } else {
                        this.f53447a.mo39576a(this.f53451e.f53463a, this.f53451e.f53466d, this.f53451e.f53467e, this.f53451e.f53464b, this.f53451e.f53465c);
                    }
                } else if (TextUtils.isEmpty(this.f53451e.f53466d)) {
                    this.f53447a.mo39575a(this.f53451e.f53463a, this.f53451e.f53463a, this.f53451e.f53467e, this.f53451e.f53464b);
                } else {
                    this.f53447a.mo39575a(this.f53451e.f53463a, this.f53451e.f53466d, this.f53451e.f53467e, this.f53451e.f53464b);
                }
            }
            if (this.f53457k > 0) {
                GLES20.glViewport(0, 0, this.f53453g, this.f53454h);
                NativeRenderWrapper nativeRenderWrapper2 = this.f53447a;
                int i3 = this.f53457k;
                int i4 = this.f53458l;
                if (nativeRenderWrapper2.f52969a != 0) {
                    nativeRenderWrapper2.nativeProcessTexture(nativeRenderWrapper2.f52969a, i3, i4, ProfileUiInitOptimizeEnterThreshold.DEFAULT);
                }
                GLES20.glBindFramebuffer(36160, this.f53456j);
                if (this.f53448b) {
                    ByteBuffer allocate = ByteBuffer.allocate(this.f53453g * this.f53454h * 4);
                    allocate.order(ByteOrder.LITTLE_ENDIAN);
                    allocate.rewind();
                    GLES20.glReadPixels(0, 0, this.f53453g, this.f53454h, 6408, 5121, allocate);
                    this.f53449c.mo39871a(this.f53453g, this.f53454h, allocate);
                    this.f53448b = false;
                }
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glViewport(0, 0, this.f53461o, this.f53462p);
                C19339a aVar2 = this.f53459m;
                int i5 = this.f53458l;
                GLES20.glClear(16640);
                GLES20.glUseProgram(aVar2.f53439a);
                GLES20.glUniformMatrix4fv(aVar2.f53443e, 1, false, aVar2.f53444f, 0);
                GLES20.glEnableVertexAttribArray(aVar2.f53440b);
                GLES20.glEnableVertexAttribArray(aVar2.f53441c);
                GLES20.glVertexAttribPointer(aVar2.f53440b, 2, 5126, false, 0, aVar2.f53445g);
                GLES20.glVertexAttribPointer(aVar2.f53441c, 2, 5126, false, 0, aVar2.f53446h);
                GLES20.glUniform1i(aVar2.f53442d, 0);
                GLES20.glBindTexture(i5, 0);
                GLES20.glDrawArrays(5, 0, 4);
                if (this.f53450d != null) {
                    this.f53450d.mo39879a();
                }
            }
        }
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glEnable(3553);
        GLES20.glDisable(2929);
        this.f53455i = true;
    }

    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.f53461o = i;
        this.f53462p = i2;
        m47235b();
    }
}
