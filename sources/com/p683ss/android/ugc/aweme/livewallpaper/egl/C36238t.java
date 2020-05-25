package com.p683ss.android.ugc.aweme.livewallpaper.egl;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.t */
public final class C36238t extends C36218e {

    /* renamed from: b */
    private Surface f92775b;

    /* renamed from: c */
    private boolean f92776c;

    public C36238t(C36217d dVar, SurfaceTexture surfaceTexture) {
        super(dVar);
        mo74982a((Object) surfaceTexture);
    }

    public C36238t(C36217d dVar, Surface surface, boolean z) {
        super(dVar);
        mo74982a((Object) surface);
        this.f92775b = surface;
        this.f92776c = true;
    }
}
