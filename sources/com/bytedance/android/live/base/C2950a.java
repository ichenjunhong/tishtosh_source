package com.bytedance.android.live.base;

import com.bytedance.android.live.base.p185b.C2955b;

/* renamed from: com.bytedance.android.live.base.a */
public final class C2950a {

    /* renamed from: a */
    private static C2955b f8655a;

    /* renamed from: a */
    public static <T> T m8371a(Class<T> cls) {
        return f8655a.mo7596a(cls);
    }

    /* renamed from: a */
    public static synchronized void m8372a(C2955b bVar) {
        synchronized (C2950a.class) {
            f8655a = bVar;
        }
    }
}
