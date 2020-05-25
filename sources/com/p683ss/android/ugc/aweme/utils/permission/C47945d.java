package com.p683ss.android.ugc.aweme.utils.permission;

import android.support.p030v4.content.C0726c;
import com.bytedance.ies.ugc.p694a.C11010c;

/* renamed from: com.ss.android.ugc.aweme.utils.permission.d */
public final class C47945d {
    /* renamed from: a */
    public static int m103731a() {
        if (m103732a("android.permission.READ_CONTACTS")) {
            return 1;
        }
        return 2;
    }

    /* renamed from: b */
    public static int m103733b() {
        if (m103732a("android.permission.ACCESS_FINE_LOCATION") || m103732a("android.permission.ACCESS_COARSE_LOCATION")) {
            return 1;
        }
        return 2;
    }

    /* renamed from: a */
    private static boolean m103732a(String str) {
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
