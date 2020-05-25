package com.bytedance.android.p140a.p141a.p150i;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.android.a.a.i.c */
public final class C2801c {

    /* renamed from: a */
    private static Pattern f8389a;

    /* renamed from: c */
    public static boolean m7964c(String str) {
        if (!m7962a(str)) {
            return false;
        }
        return str.contains("%%");
    }

    /* renamed from: d */
    public static boolean m7965d(String str) {
        if (!m7962a(str)) {
            return false;
        }
        return str.contains(" ");
    }

    /* renamed from: e */
    public static boolean m7966e(String str) {
        if (!m7962a(str)) {
            return false;
        }
        return str.contains("×");
    }

    /* renamed from: a */
    public static boolean m7962a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m7963b(String str) {
        if (!m7962a(str)) {
            return false;
        }
        if (f8389a == null) {
            f8389a = Pattern.compile("%(?![A-Ea-e\\d]{2})");
        }
        return f8389a.matcher(str).find();
    }
}
