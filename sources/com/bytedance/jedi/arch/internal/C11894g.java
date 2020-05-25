package com.bytedance.jedi.arch.internal;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.bytedance.jedi.arch.internal.g */
public final class C11894g {

    /* renamed from: a */
    static final Handler f31507a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private static final C11891f f31508b = new C11891f(f31507a, false);

    /* renamed from: a */
    public static final C11891f m24247a() {
        return f31508b;
    }

    /* renamed from: b */
    public static final boolean m24248b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }
}
