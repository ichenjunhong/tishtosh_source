package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.dj */
final class C17071dj implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C17124i f48195a;

    /* renamed from: b */
    private final /* synthetic */ C17068dg f48196b;

    C17071dj(C17068dg dgVar, C17124i iVar) {
        this.f48196b = dgVar;
        this.f48195a = iVar;
    }

    public final void run() {
        synchronized (this.f48196b) {
            this.f48196b.f48188a = false;
            if (!this.f48196b.f48190c.mo33035v()) {
                this.f48196b.f48190c.mo32854q().f48452i.mo33376a("Connected to remote service");
                this.f48196b.f48190c.mo33027a(this.f48195a);
            }
        }
    }
}
