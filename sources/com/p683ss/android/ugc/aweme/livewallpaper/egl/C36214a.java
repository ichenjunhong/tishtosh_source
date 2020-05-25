package com.p683ss.android.ugc.aweme.livewallpaper.egl;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.a */
public final class C36214a implements C36216c {

    /* renamed from: a */
    private EGLDisplay f92697a = EGL10.EGL_NO_DISPLAY;

    /* renamed from: b */
    private EGLContext f92698b = EGL10.EGL_NO_CONTEXT;

    /* renamed from: c */
    private EGLConfig f92699c;

    /* renamed from: d */
    private EGL10 f92700d = ((EGL10) EGLContext.getEGL());

    /* renamed from: a */
    public final void mo74971a(Object obj, long j) {
    }

    public final void finalize() {
        if (this.f92697a != EGL10.EGL_NO_DISPLAY) {
            mo74969a();
        }
    }

    /* renamed from: a */
    public final void mo74969a() {
        if (this.f92697a != EGL10.EGL_NO_DISPLAY) {
            EGL10 egl10 = this.f92700d;
            EGLDisplay eGLDisplay = this.f92697a;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f92700d.eglDestroyContext(this.f92697a, this.f92698b);
            this.f92700d.eglTerminate(this.f92697a);
        }
        this.f92697a = EGL10.EGL_NO_DISPLAY;
        this.f92698b = EGL10.EGL_NO_CONTEXT;
        this.f92699c = null;
    }

    /* renamed from: d */
    public final boolean mo74974d(Object obj) {
        return this.f92700d.eglSwapBuffers(this.f92697a, (EGLSurface) obj);
    }

    /* renamed from: a */
    public final void mo74970a(Object obj) {
        this.f92700d.eglDestroySurface(this.f92697a, (EGLSurface) obj);
    }

    /* renamed from: c */
    public final void mo74973c(Object obj) {
        EGLSurface eGLSurface = (EGLSurface) obj;
        if (!this.f92700d.eglMakeCurrent(this.f92697a, eGLSurface, eGLSurface, this.f92698b)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    /* renamed from: a */
    private void m81751a(String str) {
        int eglGetError = this.f92700d.eglGetError();
        if (eglGetError != 12288) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(": EGL error: 0x");
            sb.append(Integer.toHexString(eglGetError));
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: b */
    public final Object mo74972b(Object obj) {
        if ((obj instanceof Surface) || (obj instanceof SurfaceTexture)) {
            EGLSurface eglCreateWindowSurface = this.f92700d.eglCreateWindowSurface(this.f92697a, this.f92699c, obj, new int[]{12344});
            m81751a("eglCreateWindowSurface");
            if (eglCreateWindowSurface != null) {
                return eglCreateWindowSurface;
            }
            throw new RuntimeException("surface was null");
        }
        StringBuilder sb = new StringBuilder("invalid surface: ");
        sb.append(obj);
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: a */
    public final int mo74967a(Object obj, int i) {
        int[] iArr = new int[1];
        this.f92700d.eglQuerySurface(this.f92697a, (EGLSurface) obj, i, iArr);
        return iArr[0];
    }

    /* renamed from: a */
    public final Object mo74968a(int i, int i2) {
        EGLSurface eglCreatePbufferSurface = this.f92700d.eglCreatePbufferSurface(this.f92697a, this.f92699c, new int[]{12375, i, 12374, i2, 12344});
        m81751a("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            return eglCreatePbufferSurface;
        }
        throw new RuntimeException("surface was null");
    }

    public C36214a(Object obj, int i) {
        if (this.f92697a == EGL10.EGL_NO_DISPLAY) {
            if (obj == null) {
                obj = EGL10.EGL_NO_CONTEXT;
            }
            this.f92697a = this.f92700d.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            if (this.f92697a != EGL10.EGL_NO_DISPLAY) {
                EGLConfig eGLConfig = null;
                if (!this.f92700d.eglInitialize(this.f92697a, new int[2])) {
                    this.f92697a = null;
                    throw new RuntimeException("unable to initialize EGL10");
                } else if (this.f92698b == EGL10.EGL_NO_CONTEXT) {
                    int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12344, 0, 12344};
                    if ((i & 1) != 0) {
                        iArr[8] = 12610;
                        iArr[9] = 1;
                    }
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (this.f92700d.eglChooseConfig(this.f92697a, iArr, eGLConfigArr, 1, new int[1])) {
                        eGLConfig = eGLConfigArr[0];
                    }
                    if (eGLConfig != null) {
                        EGLContext eglCreateContext = this.f92700d.eglCreateContext(this.f92697a, eGLConfig, (EGLContext) obj, new int[]{12440, 2, 12344});
                        m81751a("eglCreateContext");
                        this.f92699c = eGLConfig;
                        this.f92698b = eglCreateContext;
                        return;
                    }
                    throw new RuntimeException("Unable to find a suitable EGLConfig");
                }
            } else {
                throw new RuntimeException("unable to get EGL10 display");
            }
        } else {
            throw new RuntimeException("EGL already set up");
        }
    }
}
