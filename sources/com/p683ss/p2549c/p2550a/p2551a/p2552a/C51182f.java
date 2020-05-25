package com.p683ss.p2549c.p2550a.p2551a.p2552a;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.c.a.a.a.f */
public final class C51182f {

    /* renamed from: a */
    private final ThreadPoolExecutor f127837a;

    /* renamed from: com.ss.c.a.a.a.f$a */
    static class C51184a implements ThreadFactory {

        /* renamed from: a */
        private final ThreadGroup f127838a;

        /* renamed from: b */
        private final AtomicInteger f127839b;

        /* renamed from: c */
        private final String f127840c;

        private C51184a() {
            ThreadGroup threadGroup;
            this.f127839b = new AtomicInteger(1);
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.f127838a = threadGroup;
            this.f127840c = "live-sdk-";
        }

        public final Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.f127838a;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f127840c);
            sb.append(this.f127839b.getAndIncrement());
            Thread thread = new Thread(threadGroup, runnable, sb.toString(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    C51182f() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 5, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C51184a());
        this.f127837a = threadPoolExecutor;
    }

    /* renamed from: a */
    public final void mo101713a(Runnable runnable) {
        this.f127837a.execute(runnable);
    }
}
