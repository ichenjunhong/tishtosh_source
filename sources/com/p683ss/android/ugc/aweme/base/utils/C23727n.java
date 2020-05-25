package com.p683ss.android.ugc.aweme.base.utils;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.SoftReference;

/* renamed from: com.ss.android.ugc.aweme.base.utils.n */
public final class C23727n {

    /* renamed from: a */
    private static SoftReference<Handler> f63259a;

    /* renamed from: a */
    public static Handler m58237a() {
        if (f63259a != null) {
            Handler handler = (Handler) f63259a.get();
            if (handler != null) {
                return handler;
            }
        }
        Handler handler2 = new Handler(Looper.getMainLooper());
        f63259a = new SoftReference<>(handler2);
        return handler2;
    }

    /* renamed from: b */
    public static void m58240b(Runnable runnable) {
        m58238a(runnable);
    }

    /* renamed from: a */
    public static void m58238a(Runnable runnable) {
        m58237a().post(runnable);
    }

    /* renamed from: a */
    public static void m58239a(Runnable runnable, long j) {
        m58237a().postDelayed(runnable, j);
    }
}
