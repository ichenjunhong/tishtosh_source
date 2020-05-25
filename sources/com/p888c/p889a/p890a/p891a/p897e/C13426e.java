package com.p888c.p889a.p890a.p891a.p897e;

import android.text.TextUtils;
import com.p888c.p889a.p890a.p891a.p893b.C13404l;

/* renamed from: com.c.a.a.a.e.e */
public final class C13426e {
    /* renamed from: a */
    public static void m27070a(C13404l lVar) {
        if (lVar.f34939d) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* renamed from: a */
    public static void m27071a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m27072a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: b */
    public static void m27073b(C13404l lVar) {
        m27075d(lVar);
        m27070a(lVar);
    }

    /* renamed from: c */
    public static void m27074c(C13404l lVar) {
        if (!lVar.mo25104g()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    /* renamed from: d */
    private static void m27075d(C13404l lVar) {
        if (!lVar.f34938c) {
            throw new IllegalStateException("AdSession is not started");
        }
    }
}
