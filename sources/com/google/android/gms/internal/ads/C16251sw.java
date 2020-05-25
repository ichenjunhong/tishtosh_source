package com.google.android.gms.internal.ads;

import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.internal.ads.sw */
final /* synthetic */ class C16251sw implements Runnable {

    /* renamed from: a */
    private final C16250sv f45557a;

    /* renamed from: b */
    private final CountDownLatch f45558b;

    C16251sw(C16250sv svVar, CountDownLatch countDownLatch) {
        this.f45557a = svVar;
        this.f45558b = countDownLatch;
    }

    public final void run() {
        this.f45557a.mo31388a(this.f45558b);
    }
}
