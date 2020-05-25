package com.bytedance.apm.p501q;

import android.os.Looper;

/* renamed from: com.bytedance.apm.q.o */
public final class C9198o {
    /* renamed from: a */
    public static boolean m18275a() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }
}
