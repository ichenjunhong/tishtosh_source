package com.p683ss.android.socialbase.downloader.p1214d;

import android.text.TextUtils;

/* renamed from: com.ss.android.socialbase.downloader.d.a */
public final class C19819a {

    /* renamed from: a */
    public static C19820a f54556a = null;

    /* renamed from: b */
    private static int f54557b = 4;

    /* renamed from: com.ss.android.socialbase.downloader.d.a$a */
    public static abstract class C19820a {
    }

    /* renamed from: a */
    public static boolean m48485a() {
        if (f54557b <= 3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m48483a(int i) {
        f54557b = i;
    }

    /* renamed from: a */
    public static String m48482a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "DownloaderLogger";
        }
        StringBuilder sb = new StringBuilder("Downloader-");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static void m48484a(String str, String str2) {
        if (!(str2 == null || f54556a == null)) {
            m48482a(str);
        }
    }

    /* renamed from: b */
    public static void m48486b(String str, String str2) {
        if (!(str2 == null || f54556a == null)) {
            m48482a(str);
        }
    }

    /* renamed from: c */
    public static void m48487c(String str, String str2) {
        if (!(str2 == null || f54556a == null)) {
            m48482a(str);
        }
    }
}
