package com.p683ss.android.ugc.effectmanager.common;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.effectmanager.common.f */
public final class C48643f implements ThreadFactory {

    /* renamed from: a */
    private String f122271a;

    /* renamed from: b */
    private AtomicInteger f122272b = new AtomicInteger();

    /* renamed from: c */
    private boolean f122273c;

    public final Thread newThread(Runnable runnable) {
        int incrementAndGet = this.f122272b.incrementAndGet();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f122271a);
        sb.append("-");
        sb.append(incrementAndGet);
        Thread thread = new Thread(runnable, sb.toString());
        if (!this.f122273c) {
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
        }
        return thread;
    }

    public C48643f(String str, boolean z) {
        this.f122271a = str;
        this.f122273c = true;
    }
}
