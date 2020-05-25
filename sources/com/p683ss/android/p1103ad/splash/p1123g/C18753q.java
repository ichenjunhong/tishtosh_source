package com.p683ss.android.p1103ad.splash.p1123g;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: com.ss.android.ad.splash.g.q */
public final class C18753q {
    /* renamed from: c */
    private static boolean m45760c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("sslocal://");
    }

    /* renamed from: a */
    public static boolean m45758a(String str) {
        if (TextUtils.isEmpty(str) || (!str.startsWith("http://") && !str.startsWith("https://"))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m45759b(String str) {
        if (!m45760c(str)) {
            return false;
        }
        String host = Uri.parse(str).getHost();
        if ("microapp".equals(host) || "microgame".equals(host)) {
            return true;
        }
        return false;
    }
}
