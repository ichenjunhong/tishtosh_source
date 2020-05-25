package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.fd */
final class C17120fd implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C17030bw f48335a;

    /* renamed from: b */
    private final /* synthetic */ C17119fc f48336b;

    C17120fd(C17119fc fcVar, C17030bw bwVar) {
        this.f48336b = fcVar;
        this.f48335a = bwVar;
    }

    public final void run() {
        if (C17108es.m41769a()) {
            this.f48335a.mo32853p().mo32912a((Runnable) this);
            return;
        }
        boolean b = this.f48336b.mo33345b();
        this.f48336b.f48332a = 0;
        if (b) {
            this.f48336b.mo33040a();
        }
    }
}
