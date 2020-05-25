package com.bytedance.crash.p540b;

import android.content.Context;

/* renamed from: com.bytedance.crash.b.e */
public class C9559e {

    /* renamed from: b */
    private static volatile C9559e f26060b;

    /* renamed from: a */
    public final C9553a f26061a;

    private C9559e(Context context) {
        this.f26061a = new C9553a(context);
    }

    /* renamed from: a */
    public static C9559e m18967a(Context context) {
        if (f26060b == null) {
            synchronized (C9559e.class) {
                if (f26060b == null) {
                    f26060b = new C9559e(context);
                }
            }
        }
        return f26060b;
    }
}
