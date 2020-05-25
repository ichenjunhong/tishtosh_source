package com.p683ss.android.ugc.aweme.notice.repo.p2010a;

import android.support.p030v4.content.C0726c;
import com.bytedance.ies.ugc.p694a.C11010c;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.a.a */
public final class C38081a {
    /* renamed from: a */
    public static int m85158a() {
        if (m85159a("android.permission.READ_CONTACTS")) {
            return 1;
        }
        return 2;
    }

    /* renamed from: b */
    public static int m85160b() {
        if (m85159a("android.permission.ACCESS_FINE_LOCATION") || m85159a("android.permission.ACCESS_COARSE_LOCATION")) {
            return 1;
        }
        return 2;
    }

    /* renamed from: a */
    private static boolean m85159a(String str) {
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
