package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.dw */
final class C17084dw implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ long f48219a;

    /* renamed from: b */
    private final /* synthetic */ C17080ds f48220b;

    C17084dw(C17080ds dsVar, long j) {
        this.f48220b = dsVar;
        this.f48219a = j;
    }

    public final void run() {
        C17080ds dsVar = this.f48220b;
        long j = this.f48219a;
        dsVar.mo32840c();
        dsVar.mo33078v();
        dsVar.mo32854q().f48453j.mo33377a("Activity resumed, time", Long.valueOf(j));
        dsVar.f48210a = j;
        dsVar.f48211b = dsVar.f48210a;
        if (dsVar.mo32856s().mo33290j(dsVar.mo32843f().mo33353v())) {
            dsVar.mo33074a(dsVar.mo32849l().mo28523a());
            return;
        }
        dsVar.f48212c.mo33346c();
        dsVar.f48213d.mo33346c();
        if (dsVar.mo32856s().mo33287h(dsVar.mo32843f().mo33353v()) || dsVar.mo32856s().mo33288i(dsVar.mo32843f().mo33353v())) {
            dsVar.f48214e.mo33346c();
        }
        if (dsVar.mo32855r().mo32865a(dsVar.mo32849l().mo28523a())) {
            dsVar.mo32855r().f47885n.mo32880a(true);
            dsVar.mo32855r().f47887p.mo32883a(0);
        }
        if (dsVar.mo32855r().f47885n.mo32881a()) {
            dsVar.f48212c.mo33344a(Math.max(0, dsVar.mo32855r().f47883l.mo32882a() - dsVar.mo32855r().f47887p.mo32882a()));
        } else {
            dsVar.f48213d.mo33344a(Math.max(0, 3600000 - dsVar.mo32855r().f47887p.mo32882a()));
        }
    }
}
