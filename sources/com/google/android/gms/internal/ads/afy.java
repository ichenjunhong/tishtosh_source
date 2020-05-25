package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@C16299uq
final class afy<T> implements aga<T> {

    /* renamed from: a */
    private final Throwable f40420a;

    /* renamed from: b */
    private final agb f40421b = new agb();

    afy(Throwable th) {
        this.f40420a = th;
        this.f40421b.mo28809a();
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public final T get() throws ExecutionException {
        throw new ExecutionException(this.f40420a);
    }

    public final T get(long j, TimeUnit timeUnit) throws ExecutionException {
        throw new ExecutionException(this.f40420a);
    }

    /* renamed from: a */
    public final void mo28797a(Runnable runnable, Executor executor) {
        this.f40421b.mo28810a(runnable, executor);
    }
}
