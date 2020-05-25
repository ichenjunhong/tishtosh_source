package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class bez implements ThreadFactory {

    /* renamed from: a */
    private final ThreadFactory f42235a = Executors.defaultThreadFactory();

    /* renamed from: b */
    private final AtomicInteger f42236b = new AtomicInteger(1);

    bez() {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f42235a.newThread(runnable);
        int andIncrement = this.f42236b.getAndIncrement();
        StringBuilder sb = new StringBuilder(16);
        sb.append("gads-");
        sb.append(andIncrement);
        newThread.setName(sb.toString());
        return newThread;
    }
}
