package com.p683ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.github.p994a.p995a.C14721a;

/* renamed from: com.ss.android.ugc.aweme.utils.a */
public final class C47655a {
    /* renamed from: b */
    public static boolean m103155b(char c) {
        return c >= 19968 && c <= 40869;
    }

    /* renamed from: a */
    public static boolean m103153a(char c) {
        if (Character.isUpperCase(c) || Character.isLowerCase(c)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m103152a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(C14721a.m30100a(str.charAt(i)).charAt(0));
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m103154b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String trim = str.trim();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < trim.length(); i++) {
            sb.append(C14721a.m30100a(trim.charAt(i)));
        }
        return sb.toString();
    }
}
