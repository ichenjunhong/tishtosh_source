package com.p683ss.android.sdk.app;

import java.util.HashMap;

/* renamed from: com.ss.android.sdk.app.c */
public final class C19730c {

    /* renamed from: a */
    public static HashMap<Integer, Integer> f54360a;

    /* renamed from: a */
    public static int m48228a(int i, boolean z) {
        if (z && f54360a != null && !f54360a.isEmpty()) {
            Integer num = (Integer) f54360a.get(Integer.valueOf(i));
            if (num != null) {
                return num.intValue();
            }
        }
        return i;
    }
}
