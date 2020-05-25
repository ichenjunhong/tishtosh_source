package com.p683ss.android.ugc.aweme.p2042p;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.p.a */
public final class C38563a {

    /* renamed from: a */
    public static final C38563a f98070a = new C38563a();

    /* renamed from: b */
    private static ExecutorService f98071b;

    /* renamed from: c */
    private static final ExecutorService f98072c;

    private C38563a() {
    }

    /* renamed from: a */
    public static ExecutorService m85889a() {
        return f98071b;
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
        f98071b = threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 90, TimeUnit.SECONDS, new LinkedBlockingQueue());
        f98072c = threadPoolExecutor2;
    }
}
