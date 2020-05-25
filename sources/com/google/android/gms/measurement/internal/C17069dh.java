package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.dh */
final class C17069dh implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C17124i f48191a;

    /* renamed from: b */
    private final /* synthetic */ C17068dg f48192b;

    C17069dh(C17068dg dgVar, C17124i iVar) {
        this.f48192b = dgVar;
        this.f48191a = iVar;
    }

    public final void run() {
        synchronized (this.f48192b) {
            this.f48192b.f48188a = false;
            if (!this.f48192b.f48190c.mo33035v()) {
                this.f48192b.f48190c.mo32854q().f48453j.mo33376a("Connected to service");
                this.f48192b.f48190c.mo33027a(this.f48191a);
            }
        }
    }
}
