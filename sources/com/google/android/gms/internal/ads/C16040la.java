package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.la */
final /* synthetic */ class C16040la implements Runnable {

    /* renamed from: a */
    private final C16038kz f45150a;

    /* renamed from: b */
    private final String f45151b;

    C16040la(C16038kz kzVar, String str) {
        this.f45150a = kzVar;
        this.f45151b = str;
    }

    public final void run() {
        C16038kz kzVar = this.f45150a;
        kzVar.f45148a.loadData(this.f45151b, "text/html", "UTF-8");
    }
}
