package com.bytedance.android.live.broadcast.p213h.p214a;

import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.bytedance.android.live.broadcast.h.a.i */
final /* synthetic */ class C3429i implements Runnable {

    /* renamed from: a */
    private final EGLContext[] f9756a;

    C3429i(EGLContext[] eGLContextArr) {
        this.f9756a = eGLContextArr;
    }

    public final void run() {
        EGLContext[] eGLContextArr = this.f9756a;
        EGL egl = EGLContext.getEGL();
        if (egl instanceof EGL10) {
            eGLContextArr[0] = ((EGL10) egl).eglGetCurrentContext();
        }
    }
}
