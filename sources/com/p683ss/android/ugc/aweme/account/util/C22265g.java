package com.p683ss.android.ugc.aweme.account.util;

import android.text.TextUtils;
import android.webkit.CookieManager;
import com.p683ss.android.common.util.NetworkUtils;

/* renamed from: com.ss.android.ugc.aweme.account.util.g */
public final class C22265g {
    /* renamed from: a */
    public static CookieManager m55112a() {
        try {
            return CookieManager.getInstance();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m55113b() {
        return CookieManager.getInstance().getCookie(NetworkUtils.getShareCookieHost());
    }

    /* renamed from: c */
    public static String m55114c() {
        String b = m55113b();
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        String str = "";
        if (!TextUtils.isEmpty(b)) {
            String[] split = b.split(";");
            int length = split.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String str2 = split[i];
                if (!TextUtils.isEmpty(str2)) {
                    String[] split2 = str2.split("=");
                    if (split2.length >= 2 && split2[0].trim().equals("sessionid")) {
                        str = split2[1];
                        break;
                    }
                }
                i++;
            }
        }
        return str;
    }
}
