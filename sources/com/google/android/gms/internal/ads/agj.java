package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

final class agj extends afj {

    /* renamed from: a */
    private final Executor f40436a;

    private agj(Executor executor) {
        this.f40436a = executor;
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final void execute(Runnable runnable) {
        this.f40436a.execute(runnable);
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ agj(Executor executor, agg agg) {
        this(executor);
    }
}
