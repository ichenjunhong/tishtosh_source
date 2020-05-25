package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.bf */
final class C17013bf implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzo f48006a;

    /* renamed from: b */
    private final /* synthetic */ C17008ba f48007b;

    C17013bf(C17008ba baVar, zzo zzo) {
        this.f48007b = baVar;
        this.f48006a = zzo;
    }

    public final void run() {
        this.f48007b.f47992a.mo33116o();
        C17092ed a = this.f48007b.f47992a;
        zzo zzo = this.f48006a;
        zzk a2 = a.mo33091a(zzo.f48505a);
        if (a2 != null) {
            a.mo33103b(zzo, a2);
        }
    }
}
