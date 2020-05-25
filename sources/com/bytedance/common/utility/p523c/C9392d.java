package com.bytedance.common.utility.p523c;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.common.utility.c.d */
public final class C9392d extends ThreadPoolExecutor {

    /* renamed from: a */
    private static final RejectedExecutionHandler f25640a = new AbortPolicy();

    public final void shutdown() {
    }

    public final List<Runnable> shutdownNow() {
        return new ArrayList();
    }

    public C9392d(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, 30, timeUnit, blockingQueue, Executors.defaultThreadFactory(), rejectedExecutionHandler);
    }
}
