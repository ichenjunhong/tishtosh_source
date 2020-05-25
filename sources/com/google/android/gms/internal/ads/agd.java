package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

@C16299uq
final class agd<V> extends FutureTask<V> implements aga<V> {

    /* renamed from: a */
    private final agb f40429a = new agb();

    agd(Callable<V> callable) {
        super(callable);
    }

    agd(Runnable runnable, V v) {
        super(runnable, v);
    }

    /* renamed from: a */
    public final void mo28797a(Runnable runnable, Executor executor) {
        this.f40429a.mo28810a(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public final void done() {
        this.f40429a.mo28809a();
    }
}
