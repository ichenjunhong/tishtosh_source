package com.google.android.gms.internal.ads;

final class ahr implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f40506a;

    /* renamed from: b */
    private final /* synthetic */ ahm f40507b;

    ahr(ahm ahm, boolean z) {
        this.f40507b = ahm;
        this.f40506a = z;
    }

    public final void run() {
        this.f40507b.mo28896a("windowVisibilityChanged", "isVisible", String.valueOf(this.f40506a));
    }
}
