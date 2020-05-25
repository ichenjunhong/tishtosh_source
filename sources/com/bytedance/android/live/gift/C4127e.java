package com.bytedance.android.live.gift;

import com.bytedance.android.live.gift.p246a.p247a.C4118a;

/* renamed from: com.bytedance.android.live.gift.e */
public class C4127e {

    /* renamed from: b */
    private static volatile C4127e f11316b;

    /* renamed from: a */
    public C4118a f11317a;

    private C4127e() {
    }

    /* renamed from: a */
    public static C4127e m10264a() {
        if (f11316b == null) {
            synchronized (C4127e.class) {
                if (f11316b == null) {
                    f11316b = new C4127e();
                }
            }
        }
        return f11316b;
    }
}
