package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ab */
final class C16531ab implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C16565bi f46450a;

    /* renamed from: b */
    private final /* synthetic */ C16530aa f46451b;

    C16531ab(C16530aa aaVar, C16565bi biVar) {
        this.f46451b = aaVar;
        this.f46450a = biVar;
    }

    public final void run() {
        if (!this.f46451b.f46447a.mo32527b()) {
            this.f46451b.f46447a.mo32497c("Connected to service after a timeout");
            C16867y.m40973a(this.f46451b.f46447a, this.f46450a);
        }
    }
}
