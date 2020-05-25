package com.google.android.gms.common.p1036c;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.common.c.a */
public final class C15370a {

    /* renamed from: a */
    private static C15371a f39654a;

    /* renamed from: com.google.android.gms.common.c.a$a */
    public interface C15371a {
        /* renamed from: a */
        ScheduledExecutorService mo28315a();
    }

    /* renamed from: a */
    public static synchronized C15371a m31939a() {
        C15371a aVar;
        synchronized (C15370a.class) {
            if (f39654a == null) {
                f39654a = new C15372b();
            }
            aVar = f39654a;
        }
        return aVar;
    }
}
