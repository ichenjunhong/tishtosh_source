package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

final /* synthetic */ class bxy implements Runnable {

    /* renamed from: a */
    private final agl f44536a;

    /* renamed from: b */
    private final Future f44537b;

    bxy(agl agl, Future future) {
        this.f44536a = agl;
        this.f44537b = future;
    }

    public final void run() {
        agl agl = this.f44536a;
        Future future = this.f44537b;
        if (agl.isCancelled()) {
            future.cancel(true);
        }
    }
}
