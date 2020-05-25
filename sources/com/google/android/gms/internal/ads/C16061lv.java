package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lv */
final class C16061lv implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f45182a;

    /* renamed from: b */
    private final /* synthetic */ C16055lp f45183b;

    C16061lv(C16055lp lpVar, String str) {
        this.f45183b = lpVar;
        this.f45182a = str;
    }

    public final void run() {
        this.f45183b.f45172a.loadUrl(this.f45182a);
    }
}
