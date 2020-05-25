package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vb */
final /* synthetic */ class C16311vb implements Runnable {

    /* renamed from: a */
    private final C16302ut f45712a;

    C16311vb(C16302ut utVar) {
        this.f45712a = utVar;
    }

    public final void run() {
        C16302ut utVar = this.f45712a;
        synchronized (utVar.f45694b) {
            utVar.f45697e = true;
            if (utVar.f45698f != null) {
                utVar.mo27697x_();
            }
            utVar.mo31427a(2, "Timed out waiting for ad response.");
        }
    }
}
