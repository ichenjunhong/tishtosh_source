package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C14963ax;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@C16299uq
public class agl<T> implements aga<T> {

    /* renamed from: a */
    private final Object f40438a = new Object();

    /* renamed from: b */
    private T f40439b;

    /* renamed from: c */
    private Throwable f40440c;

    /* renamed from: d */
    private boolean f40441d;

    /* renamed from: e */
    private boolean f40442e;

    /* renamed from: f */
    private final agb f40443f = new agb();

    /* renamed from: a */
    public final void mo28797a(Runnable runnable, Executor executor) {
        this.f40443f.mo28810a(runnable, executor);
    }

    /* renamed from: b */
    public final void mo28823b(T t) {
        synchronized (this.f40438a) {
            if (!this.f40442e) {
                if (mo28821a()) {
                    C14963ax.m30834d().mo28591b(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.set");
                    return;
                }
                this.f40441d = true;
                this.f40439b = t;
                this.f40438a.notifyAll();
                this.f40443f.mo28809a();
            }
        }
    }

    /* renamed from: a */
    public final void mo28822a(Throwable th) {
        synchronized (this.f40438a) {
            if (!this.f40442e) {
                if (mo28821a()) {
                    C14963ax.m30834d().mo28591b(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.setException");
                    return;
                }
                this.f40440c = th;
                this.f40438a.notifyAll();
                this.f40443f.mo28809a();
            }
        }
    }

    public T get() throws CancellationException, ExecutionException, InterruptedException {
        T t;
        synchronized (this.f40438a) {
            while (!mo28821a()) {
                this.f40438a.wait();
            }
            if (this.f40440c != null) {
                throw new ExecutionException(this.f40440c);
            } else if (!this.f40442e) {
                t = this.f40439b;
            } else {
                throw new CancellationException("SettableFuture was cancelled.");
            }
        }
        return t;
    }

    public T get(long j, TimeUnit timeUnit) throws CancellationException, ExecutionException, InterruptedException, TimeoutException {
        T t;
        synchronized (this.f40438a) {
            long millis = timeUnit.toMillis(j);
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = millis + currentTimeMillis;
            while (!mo28821a() && currentTimeMillis < j2) {
                this.f40438a.wait(j2 - currentTimeMillis);
                currentTimeMillis = System.currentTimeMillis();
            }
            if (this.f40442e) {
                throw new CancellationException("SettableFuture was cancelled.");
            } else if (this.f40440c != null) {
                throw new ExecutionException(this.f40440c);
            } else if (this.f40441d) {
                t = this.f40439b;
            } else {
                throw new TimeoutException("SettableFuture timed out.");
            }
        }
        return t;
    }

    public boolean cancel(boolean z) {
        if (!z) {
            return false;
        }
        synchronized (this.f40438a) {
            if (mo28821a()) {
                return false;
            }
            this.f40442e = true;
            this.f40441d = true;
            this.f40438a.notifyAll();
            this.f40443f.mo28809a();
            return true;
        }
    }

    public boolean isCancelled() {
        boolean z;
        synchronized (this.f40438a) {
            z = this.f40442e;
        }
        return z;
    }

    public boolean isDone() {
        boolean a;
        synchronized (this.f40438a) {
            a = mo28821a();
        }
        return a;
    }

    /* renamed from: a */
    private final boolean mo28821a() {
        return this.f40440c != null || this.f40441d;
    }
}
