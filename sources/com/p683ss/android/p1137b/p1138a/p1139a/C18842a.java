package com.p683ss.android.p1137b.p1138a.p1139a;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.b.a.a.a */
public final class C18842a {

    /* renamed from: a */
    public static ExecutorService f52024a;

    /* renamed from: b */
    private static Handler f52025b;

    /* renamed from: a */
    private static void m45931a() {
        if (f52024a == null || f52024a.isTerminated()) {
            f52024a = (ExecutorService) AsyncTask.THREAD_POOL_EXECUTOR;
            f52025b = new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: a */
    public static void m45932a(Runnable runnable) {
        m45931a();
        try {
            f52024a.execute(runnable);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static void m45934b(Runnable runnable) {
        m45931a();
        if (f52025b != null) {
            f52025b.post(runnable);
        }
    }

    /* renamed from: c */
    public static void m45935c(Runnable runnable) {
        m45931a();
        f52025b.removeCallbacks(runnable);
    }

    /* renamed from: a */
    public static void m45933a(Runnable runnable, int i) {
        m45931a();
        f52025b.postDelayed(runnable, (long) i);
    }
}
