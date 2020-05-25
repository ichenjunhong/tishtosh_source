package com.p683ss.android.ugc.aweme.base.p1417h;

import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.base.h.a */
public final class C23536a {

    /* renamed from: a */
    public static final HashMap<String, Boolean> f62659a = new HashMap<>();

    /* renamed from: b */
    public static final HashMap<String, Integer> f62660b = new HashMap<>();

    /* renamed from: c */
    private static final HashMap<String, Long> f62661c = new HashMap<>();

    /* renamed from: d */
    private static final HashMap<String, String> f62662d = new HashMap<>();

    /* renamed from: a */
    public static String m57710a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: b */
    public static boolean m57712b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m57711a(String str, String str2, boolean z) {
        if (m57712b(str, str2)) {
            return z;
        }
        String a = m57710a(str, str2);
        if (f62659a.containsKey(a)) {
            return ((Boolean) f62659a.get(a)).booleanValue();
        }
        return C35807d.m80935a(C11010c.m22280a(), str, 0).getBoolean(str2, z);
    }
}
