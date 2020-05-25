package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lb */
final /* synthetic */ class C16041lb implements Runnable {

    /* renamed from: a */
    private final C16038kz f45152a;

    /* renamed from: b */
    private final String f45153b;

    C16041lb(C16038kz kzVar, String str) {
        this.f45152a = kzVar;
        this.f45153b = str;
    }

    public final void run() {
        C16038kz kzVar = this.f45152a;
        kzVar.f45148a.loadUrl(this.f45153b);
    }
}
