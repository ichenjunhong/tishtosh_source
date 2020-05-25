package com.google.android.gms.p1033b;

/* renamed from: com.google.android.gms.b.r */
final class C15193r implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15179g f39224a;

    /* renamed from: b */
    private final /* synthetic */ C15192q f39225b;

    C15193r(C15192q qVar, C15179g gVar) {
        this.f39225b = qVar;
        this.f39224a = gVar;
    }

    public final void run() {
        synchronized (this.f39225b.f39221a) {
            if (this.f39225b.f39223c != null) {
                this.f39225b.f39223c.mo26975a(this.f39224a);
            }
        }
    }
}
