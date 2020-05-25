package com.p683ss.android.ugc.aweme.login;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.aweme.login.a */
public final class C27952a {

    /* renamed from: a */
    public static final Executor f73378a;

    /* renamed from: b */
    public static AtomicBoolean f73379b = new AtomicBoolean();

    /* renamed from: c */
    private static final int f73380c = Runtime.getRuntime().availableProcessors();

    /* renamed from: d */
    private static final int f73381d;

    /* renamed from: e */
    private static final int f73382e;

    /* renamed from: f */
    private static final ThreadFactory f73383f = new ThreadFactory() {

        /* renamed from: a */
        private final AtomicInteger f73385a = new AtomicInteger(1);

        /* renamed from: b */
        private UncaughtExceptionHandler f73386b = C27958b.f73388a;

        public final Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder("Facebook-SDK #");
            sb.append(this.f73385a.getAndIncrement());
            Thread thread = new Thread(runnable, sb.toString());
            thread.setUncaughtExceptionHandler(this.f73386b);
            return thread;
        }
    };

    /* renamed from: g */
    private static final BlockingQueue<Runnable> f73384g = new LinkedBlockingQueue(128);

    static {
        int max = Math.max(2, Math.min(f73380c - 1, 4));
        f73381d = max;
        f73382e = (max * 2) + 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f73381d, f73382e, 10, TimeUnit.SECONDS, f73384g, f73383f);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f73378a = threadPoolExecutor;
    }
}
