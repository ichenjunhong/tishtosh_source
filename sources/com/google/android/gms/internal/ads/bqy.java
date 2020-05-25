package com.google.android.gms.internal.ads;

import java.io.IOException;

final class bqy implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ IOException f43632a;

    /* renamed from: b */
    private final /* synthetic */ bqt f43633b;

    bqy(bqt bqt, IOException iOException) {
        this.f43633b = bqt;
        this.f43632a = iOException;
    }

    public final void run() {
        this.f43633b.f43602a.mo29053a(this.f43632a);
    }
}
