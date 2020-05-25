package com.google.android.gms.internal.ads;

final class bib implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ int f42468a;

    /* renamed from: b */
    private final /* synthetic */ long f42469b;

    /* renamed from: c */
    private final /* synthetic */ bhy f42470c;

    bib(bhy bhy, int i, long j) {
        this.f42470c = bhy;
        this.f42468a = i;
        this.f42469b = j;
    }

    public final void run() {
        this.f42470c.f42446f.mo28980a(this.f42468a, this.f42469b);
    }
}
