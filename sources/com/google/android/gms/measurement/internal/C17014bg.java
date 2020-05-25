package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.bg */
final class C17014bg implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzo f48008a;

    /* renamed from: b */
    private final /* synthetic */ C17008ba f48009b;

    C17014bg(C17008ba baVar, zzo zzo) {
        this.f48009b = baVar;
        this.f48008a = zzo;
    }

    public final void run() {
        this.f48009b.f47992a.mo33116o();
        C17092ed a = this.f48009b.f47992a;
        zzo zzo = this.f48008a;
        zzk a2 = a.mo33091a(zzo.f48505a);
        if (a2 != null) {
            a.mo33098a(zzo, a2);
        }
    }
}
