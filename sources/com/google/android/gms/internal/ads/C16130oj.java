package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.oj */
final class C16130oj implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ aga f45365a;

    /* renamed from: b */
    private final /* synthetic */ C16128oh f45366b;

    C16130oj(C16128oh ohVar, aga aga) {
        this.f45366b = ohVar;
        this.f45365a = aga;
    }

    public final void run() {
        for (aga aga : this.f45366b.f45358k.keySet()) {
            if (aga != this.f45365a) {
                ((C16122ob) this.f45366b.f45358k.get(aga)).mo31223a();
            }
        }
    }
}
