package com.google.android.gms.internal.ads;

final /* synthetic */ class aho implements Runnable {

    /* renamed from: a */
    private final ahm f40502a;

    /* renamed from: b */
    private final boolean f40503b;

    aho(ahm ahm, boolean z) {
        this.f40502a = ahm;
        this.f40503b = z;
    }

    public final void run() {
        this.f40502a.mo28896a("windowFocusChanged", "hasWindowFocus", String.valueOf(this.f40503b));
    }
}
