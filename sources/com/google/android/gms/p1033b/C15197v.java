package com.google.android.gms.p1033b;

/* renamed from: com.google.android.gms.b.v */
final class C15197v implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15179g f39234a;

    /* renamed from: b */
    private final /* synthetic */ C15196u f39235b;

    C15197v(C15196u uVar, C15179g gVar) {
        this.f39235b = uVar;
        this.f39234a = gVar;
    }

    public final void run() {
        synchronized (this.f39235b.f39231a) {
            if (this.f39235b.f39233c != null) {
                this.f39235b.f39233c.mo27989a(this.f39234a.mo28002d());
            }
        }
    }
}
