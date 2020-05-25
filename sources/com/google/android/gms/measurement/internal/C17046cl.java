package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.cl */
final class C17046cl implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f48112a;

    /* renamed from: b */
    private final /* synthetic */ C17038cd f48113b;

    C17046cl(C17038cd cdVar, boolean z) {
        this.f48113b = cdVar;
        this.f48112a = z;
    }

    public final void run() {
        boolean s = this.f48113b.f48052r.mo32936s();
        boolean r = this.f48113b.f48052r.mo32935r();
        this.f48113b.f48052r.mo32922a(this.f48112a);
        if (r == this.f48112a) {
            this.f48113b.f48052r.mo32854q().f48453j.mo33377a("Default data collection state already set to", Boolean.valueOf(this.f48112a));
        }
        if (this.f48113b.f48052r.mo32936s() == s || this.f48113b.f48052r.mo32936s() != this.f48113b.f48052r.mo32935r()) {
            this.f48113b.f48052r.mo32854q().f48450g.mo33378a("Default data collection is different than actual status", Boolean.valueOf(this.f48112a), Boolean.valueOf(s));
        }
        C17038cd.m41345a(this.f48113b);
    }
}
