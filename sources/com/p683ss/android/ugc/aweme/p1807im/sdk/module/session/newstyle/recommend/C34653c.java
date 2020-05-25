package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.recommend;

import android.support.p030v4.content.C0726c;
import com.bytedance.ies.ugc.p694a.C11010c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.c */
public final class C34653c {
    /* renamed from: a */
    public static int m78626a() {
        if (m78627a("android.permission.READ_CONTACTS")) {
            return 1;
        }
        return 2;
    }

    /* renamed from: b */
    public static int m78628b() {
        if (m78627a("android.permission.ACCESS_FINE_LOCATION") || m78627a("android.permission.ACCESS_COARSE_LOCATION")) {
            return 1;
        }
        return 2;
    }

    /* renamed from: a */
    private static boolean m78627a(String str) {
        try {
            if (C0726c.m2090a(C11010c.m22280a(), str) == 0) {
                return true;
            }
            return false;
        } catch (RuntimeException unused) {
            return false;
        }
    }
}
