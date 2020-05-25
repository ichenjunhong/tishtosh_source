package com.google.android.gms.p1033b;

/* renamed from: com.google.android.gms.b.t */
final class C15195t implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15179g f39229a;

    /* renamed from: b */
    private final /* synthetic */ C15194s f39230b;

    C15195t(C15194s sVar, C15179g gVar) {
        this.f39230b = sVar;
        this.f39229a = gVar;
    }

    public final void run() {
        synchronized (this.f39230b.f39226a) {
            if (this.f39230b.f39228c != null) {
                this.f39230b.f39228c.mo27988a(this.f39229a.mo28003e());
            }
        }
    }
}
