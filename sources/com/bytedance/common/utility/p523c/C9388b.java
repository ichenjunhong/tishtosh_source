package com.bytedance.common.utility.p523c;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.common.utility.c.b */
public final class C9388b implements ThreadFactory {

    /* renamed from: a */
    private String f25615a;

    /* renamed from: b */
    private AtomicInteger f25616b;

    /* renamed from: c */
    private boolean f25617c;

    public C9388b(String str) {
        this(str, false);
    }

    public final Thread newThread(Runnable runnable) {
        int incrementAndGet = this.f25616b.incrementAndGet();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f25615a);
        sb.append("-");
        sb.append(incrementAndGet);
        Thread thread = new Thread(runnable, sb.toString());
        if (!this.f25617c) {
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
        }
        return thread;
    }

    public C9388b(String str, boolean z) {
        this.f25616b = new AtomicInteger();
        this.f25615a = str;
        this.f25617c = z;
    }
}
