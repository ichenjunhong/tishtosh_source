package com.p683ss.android.ugc.rhea;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.rhea.a */
public final class C50164a {

    /* renamed from: a */
    private static final int f125681a = Runtime.getRuntime().availableProcessors();

    /* renamed from: b */
    private static final Executor f125682b;

    /* renamed from: c */
    private static Context f125683c;

    /* renamed from: a */
    public static Context m108276a() {
        return f125683c;
    }

    /* renamed from: b */
    public static Executor m108277b() {
        return f125682b;
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor((f125681a * 2) + 1, (f125681a * 2) + 1, 1, TimeUnit.SECONDS, new LinkedBlockingDeque());
        f125682b = threadPoolExecutor;
    }
}
