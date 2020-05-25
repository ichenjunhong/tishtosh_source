package com.bytedance.geckox.utils;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.geckox.utils.f */
public class C10157f implements Executor {

    /* renamed from: a */
    private static volatile C10157f f27492a;

    /* renamed from: b */
    private ThreadPoolExecutor f27493b;

    /* renamed from: a */
    public static C10157f m20483a() {
        if (f27492a == null) {
            synchronized (C10157f.class) {
                if (f27492a == null) {
                    f27492a = new C10157f();
                }
            }
        }
        return f27492a;
    }

    private C10157f() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() {
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setName("gecko-io-thread");
                thread.setPriority(3);
                return thread;
            }
        });
        this.f27493b = threadPoolExecutor;
        this.f27493b.allowCoreThreadTimeOut(true);
    }

    public void execute(Runnable runnable) {
        this.f27493b.execute(runnable);
    }
}
