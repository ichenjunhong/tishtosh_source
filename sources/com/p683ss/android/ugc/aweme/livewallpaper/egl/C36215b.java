package com.p683ss.android.ugc.aweme.livewallpaper.egl;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.os.Build.VERSION;
import android.view.Surface;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.b */
public final class C36215b implements C36216c {

    /* renamed from: a */
    private EGLDisplay f92701a = EGL14.EGL_NO_DISPLAY;

    /* renamed from: b */
    private EGLContext f92702b = EGL14.EGL_NO_CONTEXT;

    /* renamed from: c */
    private EGLConfig f92703c;

    public final void finalize() {
        if (this.f92701a != EGL14.EGL_NO_DISPLAY) {
            mo74969a();
        }
    }

    /* renamed from: a */
    public final void mo74969a() {
        if (this.f92701a != EGL14.EGL_NO_DISPLAY) {
            EGLDisplay eGLDisplay = this.f92701a;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f92701a, this.f92702b);
            if (VERSION.SDK_INT >= 19) {
                EGL14.eglReleaseThread();
            }
            EGL14.eglTerminate(this.f92701a);
        }
        this.f92701a = EGL14.EGL_NO_DISPLAY;
        this.f92702b = EGL14.EGL_NO_CONTEXT;
        this.f92703c = null;
    }

    /* renamed from: a */
    public final void mo74970a(Object obj) {
        EGL14.eglDestroySurface(this.f92701a, (EGLSurface) obj);
    }

    /* renamed from: d */
    public final boolean mo74974d(Object obj) {
        return EGL14.eglSwapBuffers(this.f92701a, (EGLSurface) obj);
    }

    /* renamed from: c */
    public final void mo74973c(Object obj) {
        EGLSurface eGLSurface = (EGLSurface) obj;
        if (!EGL14.eglMakeCurrent(this.f92701a, eGLSurface, eGLSurface, this.f92702b)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    /* renamed from: a */
    private static void m81760a(String str) {
        int eglGetError = EGL14.eglGetError();
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
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f92701a, this.f92703c, obj, new int[]{12344}, 0);
            m81760a("eglCreateWindowSurface");
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
        EGL14.eglQuerySurface(this.f92701a, (EGLSurface) obj, i, iArr, 0);
        return iArr[0];
    }

    /* renamed from: a */
    public final void mo74971a(Object obj, long j) {
        if (VERSION.SDK_INT >= 18) {
            try {
                EGLExt.eglPresentationTimeANDROID(this.f92701a, (EGLSurface) obj, j);
            } catch (NoClassDefFoundError unused) {
            }
        }
    }

    /* renamed from: a */
    public final Object mo74968a(int i, int i2) {
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f92701a, this.f92703c, new int[]{12375, i, 12374, i2, 12344}, 0);
        m81760a("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            return eglCreatePbufferSurface;
        }
        throw new RuntimeException("surface was null");
    }

    public C36215b(Object obj, int i) {
        if (this.f92701a == EGL14.EGL_NO_DISPLAY) {
            if (obj == null) {
                obj = EGL14.EGL_NO_CONTEXT;
            }
            this.f92701a = EGL14.eglGetDisplay(0);
            if (this.f92701a != EGL14.EGL_NO_DISPLAY) {
                int[] iArr = {0, 1};
                EGLConfig eGLConfig = null;
                if (!EGL14.eglInitialize(this.f92701a, iArr, 0, iArr, 1)) {
                    this.f92701a = null;
                    throw new RuntimeException("unable to initialize EGL14");
                } else if (this.f92702b == EGL14.EGL_NO_CONTEXT) {
                    int[] iArr2 = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344, 0, 12344};
                    if ((i & 1) != 0) {
                        iArr2[10] = 12610;
                        iArr2[11] = 1;
                    }
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (EGL14.eglChooseConfig(this.f92701a, iArr2, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                        eGLConfig = eGLConfigArr[0];
                    }
                    if (eGLConfig != null) {
                        EGLContext eglCreateContext = EGL14.eglCreateContext(this.f92701a, eGLConfig, (EGLContext) obj, new int[]{12440, 2, 12344}, 0);
                        m81760a("eglCreateContext");
                        this.f92703c = eGLConfig;
                        this.f92702b = eglCreateContext;
                        return;
                    }
                    throw new RuntimeException("Unable to find a suitable EGLConfig");
                }
            } else {
                throw new RuntimeException("unable to get EGL14 display");
            }
        } else {
            throw new RuntimeException("EGL already set up");
        }
    }
}
