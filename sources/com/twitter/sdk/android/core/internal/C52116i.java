package com.twitter.sdk.android.core.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.twitter.sdk.android.core.internal.i */
public final class C52116i {

    /* renamed from: a */
    public static final int f129721a;

    /* renamed from: b */
    public static final int f129722b = ((f129723c * 2) + 1);

    /* renamed from: c */
    private static final int f129723c;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f129723c = availableProcessors;
        f129721a = availableProcessors + 1;
    }

    /* renamed from: a */
    public static ThreadFactory m111474a(String str) {
        return new C52117j(str, new AtomicLong(1));
    }

    /* renamed from: a */
    public static void m111475a(String str, ExecutorService executorService) {
        m111476a(str, executorService, 1, TimeUnit.SECONDS);
    }

    /* renamed from: a */
    private static void m111476a(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        C52118k kVar = new C52118k(executorService, 1, timeUnit, str);
        StringBuilder sb = new StringBuilder("Twitter Shutdown Hook for ");
        sb.append(str);
        runtime.addShutdownHook(new Thread(kVar, sb.toString()));
    }
}
