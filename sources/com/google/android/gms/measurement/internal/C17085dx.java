package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.dx */
final class C17085dx implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ long f48221a;

    /* renamed from: b */
    private final /* synthetic */ C17080ds f48222b;

    C17085dx(C17080ds dsVar, long j) {
        this.f48222b = dsVar;
        this.f48221a = j;
    }

    public final void run() {
        C17080ds dsVar = this.f48222b;
        long j = this.f48221a;
        dsVar.mo32840c();
        dsVar.mo33078v();
        dsVar.f48212c.mo33346c();
        dsVar.f48213d.mo33346c();
        if (dsVar.mo32856s().mo33287h(dsVar.mo32843f().mo33353v()) || dsVar.mo32856s().mo33288i(dsVar.mo32843f().mo33353v())) {
            dsVar.f48214e.mo33346c();
            dsVar.f48214e.mo33344a(dsVar.mo32855r().f47884m.mo32882a());
        }
        dsVar.mo32854q().f48453j.mo33377a("Activity paused, time", Long.valueOf(j));
        if (dsVar.f48210a != 0) {
            dsVar.mo32855r().f47887p.mo32883a(dsVar.mo32855r().f47887p.mo32882a() + (j - dsVar.f48210a));
        }
    }
}
