package com.bytedance.scene.p841c;

import android.os.Looper;

/* renamed from: com.bytedance.scene.c.k */
public final class C12879k {
    /* renamed from: a */
    public static void m25799a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("This method must call on main thread");
        }
    }
}
