package com.p683ss.android.ugc.aweme.livewallpaper.egl;

import android.view.Surface;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.MusMediaSurface */
public class MusMediaSurface extends Surface {

    /* renamed from: a */
    private C36225k f92696a;

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        m81750a();
        super.finalize();
    }

    public void release() {
        super.release();
        m81750a();
    }

    /* renamed from: a */
    private synchronized void m81750a() {
        if (this.f92696a != null) {
            this.f92696a.mo75006a();
            this.f92696a = null;
        }
    }
}
