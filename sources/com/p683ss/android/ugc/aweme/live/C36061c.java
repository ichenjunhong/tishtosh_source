package com.p683ss.android.ugc.aweme.live;

import com.google.gson.C17971f;

/* renamed from: com.ss.android.ugc.aweme.live.c */
public class C36061c {

    /* renamed from: a */
    private static volatile C17971f f92415a;

    private C36061c() {
    }

    /* renamed from: a */
    public static C17971f m81417a() {
        if (f92415a == null) {
            synchronized (C36061c.class) {
                if (f92415a == null) {
                    f92415a = new C17971f();
                }
            }
        }
        return f92415a;
    }
}
