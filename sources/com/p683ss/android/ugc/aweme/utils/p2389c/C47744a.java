package com.p683ss.android.ugc.aweme.utils.p2389c;

import com.p683ss.android.ugc.aweme.utils.C47731bq;

/* renamed from: com.ss.android.ugc.aweme.utils.c.a */
public final class C47744a {

    /* renamed from: a */
    private static boolean f120257a;

    /* renamed from: b */
    private static boolean f120258b;

    /* renamed from: a */
    public static synchronized boolean m103372a() {
        boolean z;
        synchronized (C47744a.class) {
            if (!f120258b) {
                f120258b = true;
                f120257a = C47731bq.m103352f();
            }
            z = f120257a;
        }
        return z;
    }
}
