package com.google.android.gms.internal.ads;

import android.view.Surface;

final class bia implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Surface f42466a;

    /* renamed from: b */
    private final /* synthetic */ bhy f42467b;

    bia(bhy bhy, Surface surface) {
        this.f42467b = bhy;
        this.f42466a = surface;
    }

    public final void run() {
        this.f42467b.f42446f.mo28981a(this.f42466a);
    }
}
