package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.dv */
final class C17083dv extends C17119fc {

    /* renamed from: b */
    private final /* synthetic */ C17080ds f48218b;

    C17083dv(C17080ds dsVar, C17030bw bwVar) {
        this.f48218b = dsVar;
        super(bwVar);
    }

    /* renamed from: a */
    public final void mo33040a() {
        C17080ds dsVar = this.f48218b;
        dsVar.mo32840c();
        dsVar.mo32854q().f48453j.mo33376a("Current session is expired, remove the session number and Id");
        if (dsVar.mo32856s().mo33287h(dsVar.mo32843f().mo33353v())) {
            dsVar.mo32842e().mo32993a("auto", "_sid", (Object) null, dsVar.mo32849l().mo28523a());
        }
        if (dsVar.mo32856s().mo33288i(dsVar.mo32843f().mo33353v())) {
            dsVar.mo32842e().mo32993a("auto", "_sno", (Object) null, dsVar.mo32849l().mo28523a());
        }
    }
}
