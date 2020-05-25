package com.facebook.common.p918b;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.facebook.common.b.f */
public final class C13667f<V> implements RunnableFuture<V>, ScheduledFuture<V> {

    /* renamed from: a */
    private final Handler f35653a;

    /* renamed from: b */
    private final FutureTask<V> f35654b;

    public final V get() throws InterruptedException, ExecutionException {
        return this.f35654b.get();
    }

    public final boolean isCancelled() {
        return this.f35654b.isCancelled();
    }

    public final boolean isDone() {
        return this.f35654b.isDone();
    }

    public final void run() {
        this.f35654b.run();
    }

    public final boolean cancel(boolean z) {
        return this.f35654b.cancel(z);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        Delayed delayed = (Delayed) obj;
        throw new UnsupportedOperationException();
    }

    public final long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f35654b.get(j, timeUnit);
    }

    public C13667f(Handler handler, Callable<V> callable) {
        this.f35653a = handler;
        this.f35654b = new FutureTask<>(callable);
    }

    public C13667f(Handler handler, Runnable runnable, V v) {
        this.f35653a = handler;
        this.f35654b = new FutureTask<>(runnable, v);
    }
}
