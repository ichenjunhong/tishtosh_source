package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.ap */
final class C16996ap implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C17005ay f47919a;

    /* renamed from: b */
    private final /* synthetic */ C17133r f47920b;

    C16996ap(C16995ao aoVar, C17005ay ayVar, C17133r rVar) {
        this.f47919a = ayVar;
        this.f47920b = rVar;
    }

    public final void run() {
        if (this.f47919a.f47970i == null) {
            this.f47920b.f48445b.mo33376a("Install Referrer Reporter is null");
            return;
        }
        C16992al alVar = this.f47919a.f47970i;
        alVar.mo32888a(alVar.f47912a.mo32850m().getPackageName());
    }
}
