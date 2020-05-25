package com.p683ss.android.ugc.aweme.livewallpaper.egl;

import android.opengl.EGL14;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.d */
public final class C36217d {

    /* renamed from: a */
    C36216c f92704a;

    /* renamed from: a */
    public final void mo74977a() {
        this.f92704a.mo74969a();
    }

    /* renamed from: b */
    public static Object m81777b() {
        if (C36222i.m81796a()) {
            return EGL14.eglGetCurrentContext();
        }
        return ((EGL10) EGLContext.getEGL()).eglGetCurrentContext();
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            if (this.f92704a != null) {
                this.f92704a.finalize();
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: a */
    public final int mo74976a(Object obj, int i) {
        return this.f92704a.mo74967a(obj, i);
    }

    public C36217d(Object obj, int i) {
        if (C36222i.m81796a()) {
            this.f92704a = new C36215b(obj, 0);
        } else {
            this.f92704a = new C36214a(obj, 0);
        }
    }
}
