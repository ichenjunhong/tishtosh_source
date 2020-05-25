package com.p683ss.android.ttve.common;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* renamed from: com.ss.android.ttve.common.c */
public final class C20073c {

    /* renamed from: a */
    public EGLContext f55171a = EGL14.EGL_NO_CONTEXT;

    /* renamed from: b */
    public EGLSurface f55172b = EGL14.EGL_NO_SURFACE;

    /* renamed from: c */
    public EGLSurface f55173c = EGL14.EGL_NO_SURFACE;

    /* renamed from: d */
    public EGLDisplay f55174d = EGL14.EGL_NO_DISPLAY;

    /* renamed from: a */
    public final void mo42169a() {
        this.f55171a = EGL14.eglGetCurrentContext();
        this.f55171a.equals(EGL14.EGL_NO_CONTEXT);
        this.f55172b = EGL14.eglGetCurrentSurface(12378);
        this.f55172b.equals(EGL14.EGL_NO_SURFACE);
        this.f55173c = EGL14.eglGetCurrentSurface(12377);
        this.f55173c.equals(EGL14.EGL_NO_SURFACE);
        this.f55174d = EGL14.eglGetCurrentDisplay();
        this.f55174d.equals(EGL14.EGL_NO_DISPLAY);
    }
}
