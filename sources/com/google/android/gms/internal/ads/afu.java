package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

final /* synthetic */ class afu implements Runnable {

    /* renamed from: a */
    private final Future f40410a;

    afu(Future future) {
        this.f40410a = future;
    }

    public final void run() {
        Future future = this.f40410a;
        if (!future.isDone()) {
            future.cancel(true);
        }
    }
}
