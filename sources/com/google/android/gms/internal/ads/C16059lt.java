package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lt */
final class C16059lt implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f45178a;

    /* renamed from: b */
    private final /* synthetic */ C16055lp f45179b;

    C16059lt(C16055lp lpVar, String str) {
        this.f45179b = lpVar;
        this.f45178a = str;
    }

    public final void run() {
        this.f45179b.f45172a.loadData(this.f45178a, "text/html", "UTF-8");
    }
}
