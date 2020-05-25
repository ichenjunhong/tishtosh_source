package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.wv */
final class C16358wv implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Future f45841a;

    C16358wv(C16354wr wrVar, Future future) {
        this.f45841a = future;
    }

    public final void run() {
        if (!this.f45841a.isDone()) {
            this.f45841a.cancel(true);
        }
    }
}
