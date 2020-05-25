package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

final /* synthetic */ class agc implements Runnable {

    /* renamed from: a */
    private final Executor f40427a;

    /* renamed from: b */
    private final Runnable f40428b;

    agc(Executor executor, Runnable runnable) {
        this.f40427a = executor;
        this.f40428b = runnable;
    }

    public final void run() {
        this.f40427a.execute(this.f40428b);
    }
}
