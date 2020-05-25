package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sj */
final class C16238sj implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C16237si f45531a;

    C16238sj(C16237si siVar) {
        this.f45531a = siVar;
    }

    public final void run() {
        if (this.f45531a.f45526d.get()) {
            abv.m32794c("Timed out waiting for WebView to finish loading.");
            this.f45531a.mo28617b();
        }
    }
}
