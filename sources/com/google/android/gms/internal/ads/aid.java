package com.google.android.gms.internal.ads;

@C16299uq
final class aid implements Runnable {

    /* renamed from: a */
    private ahm f40579a;

    /* renamed from: b */
    private boolean f40580b;

    aid(ahm ahm) {
        this.f40579a = ahm;
    }

    public final void run() {
        if (!this.f40580b) {
            this.f40579a.mo28903m();
            m32987c();
        }
    }

    /* renamed from: a */
    public final void mo28955a() {
        this.f40580b = true;
        this.f40579a.mo28903m();
    }

    /* renamed from: b */
    public final void mo28956b() {
        this.f40580b = false;
        m32987c();
    }

    /* renamed from: c */
    private final void m32987c() {
        acd.f40245a.removeCallbacks(this);
        acd.f40245a.postDelayed(this, 250);
    }
}
