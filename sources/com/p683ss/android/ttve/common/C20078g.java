package com.p683ss.android.ttve.common;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;

/* renamed from: com.ss.android.ttve.common.g */
public class C20078g {

    /* renamed from: a */
    public static int f55191a = 8;

    /* renamed from: b */
    public static int f55192b = 8;

    /* renamed from: c */
    public static int f55193c = 8;

    /* renamed from: d */
    public static int f55194d = 8;

    /* renamed from: i */
    private static final String f55195i = "g";

    /* renamed from: e */
    public EGLContext f55196e;

    /* renamed from: f */
    public EGLConfig f55197f;

    /* renamed from: g */
    public EGLDisplay f55198g;

    /* renamed from: h */
    public EGLSurface f55199h;

    /* renamed from: c */
    public final boolean mo42177c() {
        return EGL14.eglSwapBuffers(this.f55198g, this.f55199h);
    }

    /* renamed from: b */
    public final boolean mo42176b() {
        if (EGL14.eglMakeCurrent(this.f55198g, this.f55199h, this.f55199h, this.f55196e)) {
            return true;
        }
        m49587a("eglMakeCurrent");
        return false;
    }

    /* renamed from: a */
    public final void mo42174a() {
        if (this.f55198g != EGL14.EGL_NO_DISPLAY) {
            EGLDisplay eGLDisplay = this.f55198g;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f55198g, this.f55196e);
            EGL14.eglDestroySurface(this.f55198g, this.f55199h);
            EGL14.eglTerminate(this.f55198g);
        }
        this.f55198g = EGL14.EGL_NO_DISPLAY;
        this.f55199h = EGL14.EGL_NO_SURFACE;
        this.f55196e = EGL14.EGL_NO_CONTEXT;
    }

    /* renamed from: a */
    public static void m49587a(String str) {
        EGL14.eglGetError();
    }

    /* renamed from: a */
    public final void mo42175a(long j) {
        EGLExt.eglPresentationTimeANDROID(this.f55198g, this.f55199h, j);
        m49587a("eglPresentationTimeANDROID");
    }
}
