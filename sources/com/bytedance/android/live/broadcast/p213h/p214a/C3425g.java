package com.bytedance.android.live.broadcast.p213h.p214a;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLSurfaceView.EGLContextFactory;
import android.opengl.GLSurfaceView.Renderer;
import android.view.Surface;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.ugc.aweme.feed.experiment.VideoPreloadSizeExperiment;
import com.p683ss.avframework.livestreamv2.effectcamera.utils.OpenGLUtils;
import com.p683ss.avframework.livestreamv2.effectcamera.utils.TextureRotationUtil;
import com.p683ss.avframework.opengl.GLThread;
import com.p683ss.avframework.utils.ThreadUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.bytedance.android.live.broadcast.h.a.g */
public final class C3425g implements OnFrameAvailableListener, Renderer {

    /* renamed from: a */
    public GLSurfaceView f9736a;

    /* renamed from: b */
    public C3427a f9737b;

    /* renamed from: c */
    public EGLContext f9738c;

    /* renamed from: d */
    public GLThread f9739d;

    /* renamed from: e */
    private int f9740e;

    /* renamed from: f */
    private int f9741f;

    /* renamed from: g */
    private int f9742g;

    /* renamed from: h */
    private int f9743h;

    /* renamed from: i */
    private int f9744i;

    /* renamed from: j */
    private int f9745j;

    /* renamed from: k */
    private int f9746k;

    /* renamed from: l */
    private FloatBuffer f9747l;

    /* renamed from: m */
    private FloatBuffer f9748m;

    /* renamed from: n */
    private FloatBuffer f9749n;

    /* renamed from: o */
    private SurfaceTexture f9750o;

    /* renamed from: p */
    private List<C3424f> f9751p;

    /* renamed from: q */
    private int f9752q = 36197;

    /* renamed from: com.bytedance.android.live.broadcast.h.a.g$a */
    public interface C3427a {
        /* renamed from: a */
        void mo8809a(Surface surface);
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        if (this.f9739d != null) {
            this.f9739d.quit();
            this.f9739d = null;
        }
        super.finalize();
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f9736a.requestRender();
    }

    /* renamed from: a */
    public final void mo8800a(int i) {
        if (i == 36197 || i == 3553) {
            this.f9752q = i;
            return;
        }
        throw new RuntimeException("format is not support");
    }

    /* renamed from: a */
    public final synchronized void mo8801a(C3424f fVar) {
        if (this.f9751p == null) {
            this.f9751p = new ArrayList();
        }
        this.f9751p.add(fVar);
    }

    public C3425g(GLSurfaceView gLSurfaceView) {
        this.f9736a = gLSurfaceView;
        this.f9736a.setEGLContextClientVersion(2);
        this.f9736a.setPreserveEGLContextOnPause(true);
        this.f9736a.setEGLContextFactory(new EGLContextFactory() {
            public final void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
                if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                    StringBuilder sb = new StringBuilder("eglDestroyContext");
                    sb.append(egl10.eglGetError());
                    throw new RuntimeException(sb.toString());
                } else if (C3425g.this.f9739d != null) {
                    C3425g.this.f9739d.quit();
                    C3425g.this.f9739d = null;
                }
            }

            public final EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
                int[] iArr = {12440, 2, 12344};
                EGLContext[] eGLContextArr = {null};
                if (C3425g.this.f9739d == null) {
                    C3425g.this.f9739d = new GLThread("ImageCaptureThread");
                    C3425g.this.f9739d.start();
                }
                ThreadUtils.invokeAtFrontUninterruptibly(C3425g.this.f9739d.getHandler(), (Runnable) new C3429i(eGLContextArr));
                if (eGLContextArr[0] == null) {
                    eGLContextArr[0] = EGL10.EGL_NO_CONTEXT;
                }
                C3425g.this.f9738c = egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContextArr[0], iArr);
                return C3425g.this.f9738c;
            }
        });
        this.f9736a.setRenderer(this);
        this.f9736a.setRenderMode(0);
        this.f9747l = ByteBuffer.allocateDirect(TextureRotationUtil.CUBE.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f9747l.put(TextureRotationUtil.CUBE).position(0);
        this.f9748m = ByteBuffer.allocateDirect(TextureRotationUtil.TEXTURE_NO_ROTATION.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f9748m.put(TextureRotationUtil.TEXTURE_NO_ROTATION).position(0);
        float[] rotation = TextureRotationUtil.getRotation(NormalGiftView.ALPHA_180, true, false);
        this.f9749n = ByteBuffer.allocateDirect(rotation.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f9749n.put(rotation).position(0);
    }

    public final void onDrawFrame(GL10 gl10) {
        this.f9750o.updateTexImage();
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.f9740e);
        this.f9747l.position(0);
        GLES20.glVertexAttribPointer(this.f9741f, 2, 5126, false, 0, this.f9747l);
        GLES20.glEnableVertexAttribArray(this.f9741f);
        this.f9748m.position(0);
        GLES20.glVertexAttribPointer(this.f9743h, 2, 5126, false, 0, this.f9748m);
        GLES20.glEnableVertexAttribArray(this.f9743h);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f9744i);
        GLES20.glUniform1i(this.f9742g, 0);
        GLES20.glDrawArrays(5, 0, 4);
        OpenGLUtils.checkGlError("ImageCapture");
        int i = this.f9744i;
        if (3553 == this.f9752q) {
            GLES20.glBindFramebuffer(36160, this.f9745j);
            this.f9749n.position(0);
            GLES20.glVertexAttribPointer(this.f9743h, 2, 5126, false, 0, this.f9749n);
            GLES20.glEnableVertexAttribArray(this.f9743h);
            GLES20.glDrawArrays(5, 0, 4);
            OpenGLUtils.checkGlError("ImageCapture");
            GLES20.glBindFramebuffer(36160, 0);
            i = this.f9746k;
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, 0);
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            if (this.f9751p != null) {
                for (C3424f onFrameAvailable : this.f9751p) {
                    onFrameAvailable.onFrameAvailable(this.f9738c, i, this.f9752q, this.f9736a.getWidth(), this.f9736a.getHeight(), currentTimeMillis);
                }
            }
        }
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.f9740e = OpenGLUtils.loadProgram("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n\nvarying vec2 textureCoordinate;\n\nvoid main()\n{\n   textureCoordinate = inputTextureCoordinate.xy;\n   gl_Position = position;\n}", "#extension GL_OES_EGL_image_external : require\n\nprecision mediump float;\nvarying vec2 textureCoordinate;\nuniform samplerExternalOES inputImageTexture;\n\nvoid main()\n{\n gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
        new StringBuilder("onSurfaceCreated: OES programId=").append(this.f9740e);
        this.f9741f = GLES20.glGetAttribLocation(this.f9740e, "position");
        this.f9742g = GLES20.glGetUniformLocation(this.f9740e, "inputImageTexture");
        this.f9743h = GLES20.glGetAttribLocation(this.f9740e, "inputTextureCoordinate");
        this.f9744i = OpenGLUtils.getExternalOESTextureID();
        new StringBuilder("onSurfaceCreated: OES textureId=").append(this.f9744i);
        OpenGLUtils.checkGlError("ImageCapture");
        if (3553 == this.f9752q) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.f9745j = iArr[0];
            new StringBuilder("onSurfaceCreated: frameBuffer=").append(this.f9745j);
            int[] iArr2 = new int[1];
            GLES20.glGenTextures(1, iArr2, 0);
            this.f9746k = iArr2[0];
            new StringBuilder("onSurfaceCreated: frameBufferTextureId=").append(this.f9746k);
            int i = this.f9746k;
            int i2 = this.f9745j;
            int width = this.f9736a.getWidth();
            int height = this.f9736a.getHeight();
            GLES20.glBindTexture(3553, i);
            GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, null);
            GLES20.glTexParameterf(3553, VideoPreloadSizeExperiment.DEFAULT, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLES20.glBindFramebuffer(36160, i2);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
            GLES20.glBindTexture(3553, 0);
            GLES20.glBindFramebuffer(36160, 0);
        }
        this.f9750o = new SurfaceTexture(this.f9744i);
        this.f9750o.setDefaultBufferSize(this.f9736a.getWidth(), this.f9736a.getHeight());
        this.f9750o.setOnFrameAvailableListener(this);
        this.f9736a.post(new C3428h(this, new Surface(this.f9750o)));
    }

    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }
}
