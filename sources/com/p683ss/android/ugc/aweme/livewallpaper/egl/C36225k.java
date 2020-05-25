package com.p683ss.android.ugc.aweme.livewallpaper.egl;

import android.graphics.SurfaceTexture;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.k */
public final class C36225k extends SurfaceTexture {

    /* renamed from: a */
    public C36221h f92735a;

    /* renamed from: b */
    public boolean f92736b = true;

    /* renamed from: c */
    public boolean f92737c = false;

    public final void releaseTexImage() {
        super.releaseTexImage();
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        mo75006a();
        super.finalize();
    }

    public final void release() {
        mo75006a();
        super.release();
    }

    /* renamed from: a */
    public final void mo75006a() {
        if (!this.f92737c) {
            this.f92735a.mo74990b();
            this.f92737c = true;
        }
    }

    public C36225k(C36221h hVar) {
        super(hVar.mo74991c());
        hVar.mo74989a();
        this.f92735a = hVar;
        this.f92735a.mo74992d();
    }
}
