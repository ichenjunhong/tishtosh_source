package net.openid.appauth;

import android.text.TextUtils;

/* renamed from: net.openid.appauth.p */
public final class C53487p {
    /* renamed from: a */
    public static <T> T m113584a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: b */
    public static String m113588b(String str, Object obj) {
        if (str != null) {
            m113586a(str, obj);
        }
        return str;
    }

    /* renamed from: a */
    public static <T> T m113585a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static String m113586a(String str, Object obj) {
        m113585a((T) str, obj);
        m113587a(!TextUtils.isEmpty(str), obj);
        return str;
    }

    /* renamed from: a */
    public static void m113587a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }
}
