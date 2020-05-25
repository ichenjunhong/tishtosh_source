package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.abs */
final class C15564abs implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15563abr f40211a;

    C15564abs(C15563abr abr) {
        this.f40211a = abr;
    }

    public final void run() {
        this.f40211a.f40210g = Thread.currentThread();
        this.f40211a.mo27696a();
    }
}
