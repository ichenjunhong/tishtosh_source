package com.facebook.common.p918b;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.common.b.e */
public class C13666e extends AbstractExecutorService implements C13665d {

    /* renamed from: a */
    final Handler f35652a;

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    public C13666e(Handler handler) {
        this.f35652a = handler;
    }

    public void execute(Runnable runnable) {
        this.f35652a.post(runnable);
    }

    public /* synthetic */ Future submit(Runnable runnable) {
        return submit(runnable, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public <T> C13667f<T> newTaskFor(Callable<T> callable) {
        return new C13667f<>(this.f35652a, callable);
    }

    public /* synthetic */ Future submit(Callable callable) {
        if (callable != null) {
            C13667f a = newTaskFor(callable);
            execute(a);
            return a;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public <T> C13667f<T> newTaskFor(Runnable runnable, T t) {
        return new C13667f<>(this.f35652a, runnable, t);
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public <T> ScheduledFuture<T> submit(Runnable runnable, T t) {
        if (runnable != null) {
            C13667f a = newTaskFor(runnable, t);
            execute(a);
            return a;
        }
        throw new NullPointerException();
    }

    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        C13667f a = newTaskFor(runnable, null);
        this.f35652a.postDelayed(a, timeUnit.toMillis(j));
        return a;
    }

    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        C13667f a = newTaskFor(callable);
        this.f35652a.postDelayed(a, timeUnit.toMillis(j));
        return a;
    }

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }
}
