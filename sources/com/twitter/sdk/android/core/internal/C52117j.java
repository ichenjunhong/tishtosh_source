package com.twitter.sdk.android.core.internal;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.twitter.sdk.android.core.internal.j */
final /* synthetic */ class C52117j implements ThreadFactory {

    /* renamed from: a */
    private final String f129724a;

    /* renamed from: b */
    private final AtomicLong f129725b;

    C52117j(String str, AtomicLong atomicLong) {
        this.f129724a = str;
        this.f129725b = atomicLong;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f129724a;
        AtomicLong atomicLong = this.f129725b;
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(atomicLong.getAndIncrement());
        newThread.setName(sb.toString());
        return newThread;
    }
}
