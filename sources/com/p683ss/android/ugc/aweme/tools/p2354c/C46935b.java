package com.p683ss.android.ugc.aweme.tools.p2354c;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.c.b */
public final class C46935b extends ThreadPoolExecutor {
    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        Callable<T> callable2;
        C52711k.m112240b(callable, "callable");
        if (!(callable instanceof Comparable)) {
            callable2 = null;
        } else {
            callable2 = callable;
        }
        return new C46934a<>(callable, (Comparable) callable2);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        Runnable runnable2;
        C52711k.m112240b(runnable, "runnable");
        if (!(runnable instanceof Comparable)) {
            runnable2 = null;
        } else {
            runnable2 = runnable;
        }
        return new C46934a<>(runnable, t, (Comparable) runnable2);
    }

    public C46935b(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue) {
        C52711k.m112240b(timeUnit, "unit");
        C52711k.m112240b(blockingQueue, "workQueue");
        super(0, i2, 8000, timeUnit, blockingQueue);
    }
}
