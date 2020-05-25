package com.p683ss.android.ugc.aweme.push.downgrade;

import com.bytedance.ies.ugc.p694a.C11016e;

/* renamed from: com.ss.android.ugc.aweme.push.downgrade.b */
public class C40893b {

    /* renamed from: a */
    static volatile boolean f104072a = true;

    /* renamed from: b */
    private static volatile boolean f104073b;

    /* renamed from: a */
    public static void m90462a() {
        f104072a = false;
        m90463b();
    }

    /* renamed from: b */
    private static void m90463b() {
        if (!f104073b) {
            synchronized (C40893b.class) {
                if (!f104073b) {
                    f104073b = true;
                    C11016e.m22309d().mo6545f(C40894c.f104074a);
                }
            }
        }
    }
}
