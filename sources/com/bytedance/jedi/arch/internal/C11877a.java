package com.bytedance.jedi.arch.internal;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.arch.internal.a */
public final class C11877a implements ThreadFactory {

    /* renamed from: a */
    public static final C11878a f31473a = new C11878a(null);

    /* renamed from: e */
    private static final AtomicInteger f31474e = new AtomicInteger(1);

    /* renamed from: b */
    private final ThreadGroup f31475b;

    /* renamed from: c */
    private final AtomicInteger f31476c = new AtomicInteger(1);

    /* renamed from: d */
    private final String f31477d;

    /* renamed from: com.bytedance.jedi.arch.internal.a$a */
    public static final class C11878a {
        private C11878a() {
        }

        public /* synthetic */ C11878a(C52707g gVar) {
            this();
        }
    }

    public C11877a() {
        ThreadGroup threadGroup;
        String str;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            threadGroup = securityManager.getThreadGroup();
            str = "s.threadGroup";
        } else {
            Thread currentThread = Thread.currentThread();
            C52711k.m112236a((Object) currentThread, "Thread.currentThread()");
            threadGroup = currentThread.getThreadGroup();
            str = "Thread.currentThread().threadGroup";
        }
        C52711k.m112236a((Object) threadGroup, str);
        this.f31475b = threadGroup;
        StringBuilder sb = new StringBuilder("pool-jedi-core-");
        sb.append(f31474e.getAndIncrement());
        sb.append("-thread-");
        this.f31477d = sb.toString();
    }

    public final Thread newThread(Runnable runnable) {
        C52711k.m112240b(runnable, "r");
        ThreadGroup threadGroup = this.f31475b;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f31477d);
        sb.append(this.f31476c.getAndIncrement());
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
