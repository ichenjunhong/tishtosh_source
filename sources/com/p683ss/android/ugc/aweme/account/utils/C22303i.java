package com.p683ss.android.ugc.aweme.account.utils;

import android.text.TextUtils;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.utils.i */
public final class C22303i {
    /* renamed from: a */
    public static final int m55193a(String str, int i) {
        int i2;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (str == null) {
            try {
                C52711k.m112234a();
            } catch (NumberFormatException unused) {
                i2 = 0;
            }
        }
        i2 = Integer.parseInt(str);
        return i2;
    }
}
