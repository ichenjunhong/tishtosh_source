package com.bytedance.android.live.broadcast.p213h.p214a;

import android.view.Surface;

/* renamed from: com.bytedance.android.live.broadcast.h.a.h */
final /* synthetic */ class C3428h implements Runnable {

    /* renamed from: a */
    private final C3425g f9754a;

    /* renamed from: b */
    private final Surface f9755b;

    C3428h(C3425g gVar, Surface surface) {
        this.f9754a = gVar;
        this.f9755b = surface;
    }

    public final void run() {
        C3425g gVar = this.f9754a;
        Surface surface = this.f9755b;
        if (gVar.f9737b != null) {
            gVar.f9737b.mo8809a(surface);
        }
    }
}
