package com.bytedance.jirafast.p751d;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.jirafast.d.p */
public final class C12049p {

    /* renamed from: a */
    public static ExecutorService f31846a;

    /* renamed from: b */
    private static Handler f31847b;

    /* renamed from: a */
    private static void m24507a() {
        if (f31846a == null || f31846a.isTerminated()) {
            f31846a = (ExecutorService) AsyncTask.THREAD_POOL_EXECUTOR;
            f31847b = new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: a */
    public static void m24508a(Runnable runnable) {
        m24507a();
        try {
            f31846a.execute(runnable);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static void m24509b(Runnable runnable) {
        m24507a();
        if (f31847b != null) {
            f31847b.post(runnable);
        }
    }
}
