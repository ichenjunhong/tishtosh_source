package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

final /* synthetic */ class afx implements Runnable {

    /* renamed from: a */
    private final aga f40418a;

    /* renamed from: b */
    private final Future f40419b;

    afx(aga aga, Future future) {
        this.f40418a = aga;
        this.f40419b = future;
    }

    public final void run() {
        aga aga = this.f40418a;
        Future future = this.f40419b;
        if (aga.isCancelled()) {
            future.cancel(true);
        }
    }
}
