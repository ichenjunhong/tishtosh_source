package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@C16299uq
public final class acb {

    /* renamed from: a */
    public static final age f40240a;

    /* renamed from: b */
    public static final age f40241b;

    /* renamed from: c */
    public static final ScheduledExecutorService f40242c = new ScheduledThreadPoolExecutor(3, m32568a("Schedule"));

    /* renamed from: a */
    public static <T> aga<T> m32567a(Callable<T> callable) {
        return f40240a.mo28781a(callable);
    }

    /* renamed from: a */
    private static ThreadFactory m32568a(String str) {
        return new acc(str);
    }

    /* renamed from: a */
    public static aga<?> m32566a(Runnable runnable) {
        return f40240a.mo28780a(runnable);
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), m32568a("Default"));
        f40240a = agf.m32839a(threadPoolExecutor);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), m32568a("Loader"));
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        f40241b = agf.m32839a(threadPoolExecutor2);
    }
}
