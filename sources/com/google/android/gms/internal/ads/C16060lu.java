package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lu */
final class C16060lu implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f45180a;

    /* renamed from: b */
    private final /* synthetic */ C16055lp f45181b;

    C16060lu(C16055lp lpVar, String str) {
        this.f45181b = lpVar;
        this.f45180a = str;
    }

    public final void run() {
        this.f45181b.f45172a.loadData(this.f45180a, "text/html", "UTF-8");
    }
}
