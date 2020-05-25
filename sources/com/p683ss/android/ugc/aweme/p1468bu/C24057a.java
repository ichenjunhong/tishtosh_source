package com.p683ss.android.ugc.aweme.p1468bu;

import android.os.Build.VERSION;
import android.os.Looper;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.bu.a */
class C24057a extends ThreadPoolExecutor {

    /* renamed from: b */
    private static volatile Field f63851b;

    /* renamed from: a */
    public C24093p f63852a;

    public void shutdown() {
        if (!C24076h.m58900a((ExecutorService) this)) {
            super.shutdown();
        }
    }

    public List<Runnable> shutdownNow() {
        if (C24076h.m58900a((ExecutorService) this)) {
            return Collections.emptyList();
        }
        return super.shutdownNow();
    }

    /* renamed from: a */
    private static void m58879a() {
        try {
            if (f63851b == null) {
                synchronized (C24057a.class) {
                    if (f63851b == null) {
                        if (VERSION.SDK_INT >= 24) {
                            f63851b = Thread.class.getDeclaredField("threadLocals");
                        } else {
                            f63851b = Thread.class.getDeclaredField("localValues");
                        }
                        f63851b.setAccessible(true);
                    }
                }
            }
            f63851b.set(Thread.currentThread(), null);
        } catch (Exception unused) {
        }
    }

    public void execute(Runnable runnable) {
        if (C24076h.m58897a().f63919b.contains(this.f63852a)) {
            super.execute(new C24061c(runnable, this));
        } else {
            super.execute(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        try {
            if (Looper.myLooper() != null) {
                m58879a();
            }
        } catch (Exception unused) {
        }
    }

    C24057a(C24093p pVar, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory);
        this.f63852a = pVar;
    }

    C24057a(C24093p pVar, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.f63852a = pVar;
    }
}
