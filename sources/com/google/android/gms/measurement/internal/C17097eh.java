package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.eh */
final class C17097eh implements Callable<String> {

    /* renamed from: a */
    private final /* synthetic */ zzk f48269a;

    /* renamed from: b */
    private final /* synthetic */ C17092ed f48270b;

    C17097eh(C17092ed edVar, zzk zzk) {
        this.f48270b = edVar;
        this.f48269a = zzk;
    }

    public final /* synthetic */ Object call() throws Exception {
        C17104eo eoVar;
        if (this.f48270b.mo33100b().mo33282e(this.f48269a.f48487a)) {
            eoVar = this.f48270b.mo33104c(this.f48269a);
        } else {
            eoVar = this.f48270b.mo33106d().mo33317b(this.f48269a.f48487a);
        }
        if (eoVar != null) {
            return eoVar.mo33169b();
        }
        this.f48270b.mo32854q().f48448e.mo33376a("App info was null when attempting to get app instance id");
        return null;
    }
}
