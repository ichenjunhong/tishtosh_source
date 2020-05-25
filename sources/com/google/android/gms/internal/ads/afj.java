package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableFuture;

@C16299uq
public abstract class afj extends AbstractExecutorService implements age {
    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new agd(runnable, t);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new agd(callable);
    }

    /* renamed from: a */
    public final aga<?> submit(Runnable runnable) throws RejectedExecutionException {
        return (aga) super.submit(runnable);
    }

    /* renamed from: a */
    public final <T> aga<T> submit(Callable<T> callable) throws RejectedExecutionException {
        return (aga) super.submit(callable);
    }

    public /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (aga) super.submit(runnable, obj);
    }
}
