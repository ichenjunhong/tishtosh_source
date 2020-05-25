package com.bytedance.sdk.account.p878m;

import android.text.TextUtils;
import android.webkit.CookieManager;

/* renamed from: com.bytedance.sdk.account.m.i */
public final class C13217i {
    /* renamed from: a */
    public static String m26602a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append("/");
        return sb.toString();
    }

    /* renamed from: b */
    public static String m26603b(String str, String str2) {
        String[] split;
        String str3 = "";
        try {
            String cookie = CookieManager.getInstance().getCookie(str);
            if (!TextUtils.isEmpty(cookie)) {
                for (String str4 : cookie.split(";")) {
                    if (!TextUtils.isEmpty(str4)) {
                        String[] split2 = str4.split("=");
                        if (split2.length >= 2 && split2[0] != null && split2[0].trim().equalsIgnoreCase(str2)) {
                            return split2[1];
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return str3;
    }
}
