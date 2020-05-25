package com.bytedance.geckox.utils;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.geckox.utils.l */
public class C10164l implements Executor {

    /* renamed from: a */
    private static volatile C10164l f27497a;

    /* renamed from: b */
    private ThreadPoolExecutor f27498b;

    /* renamed from: a */
    public static C10164l m20491a() {
        if (f27497a == null) {
            synchronized (C10164l.class) {
                if (f27497a == null) {
                    f27497a = new C10164l();
                }
            }
        }
        return f27497a;
    }

    private C10164l() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() {
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setName("gecko-piecemeal-thread");
                return thread;
            }
        });
        this.f27498b = threadPoolExecutor;
        this.f27498b.allowCoreThreadTimeOut(true);
    }

    public void execute(Runnable runnable) {
        this.f27498b.execute(runnable);
    }
}
