package com.bytedance.p785o.p797b;

import com.bytedance.p785o.p797b.p798a.C12432c;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.o.b.e */
public final class C12440e extends ThreadPoolExecutor {
    public final void execute(Runnable runnable) {
        if (C12432c.f32696c) {
            super.execute(new C12437c(runnable, this));
        } else {
            super.execute(runnable);
        }
    }

    public C12440e(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, 30, timeUnit, blockingQueue, threadFactory);
    }

    public C12440e(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
    }
}
