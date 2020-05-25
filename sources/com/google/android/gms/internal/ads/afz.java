package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@C16299uq
final class afz<T> implements aga<T> {

    /* renamed from: a */
    private final T f40422a;

    /* renamed from: b */
    private final agb f40423b = new agb();

    afz(T t) {
        this.f40422a = t;
        this.f40423b.mo28809a();
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

    public final T get() {
        return this.f40422a;
    }

    public final T get(long j, TimeUnit timeUnit) {
        return this.f40422a;
    }

    /* renamed from: a */
    public final void mo28797a(Runnable runnable, Executor executor) {
        this.f40423b.mo28810a(runnable, executor);
    }
}
