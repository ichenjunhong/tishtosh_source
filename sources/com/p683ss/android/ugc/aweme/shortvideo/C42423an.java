package com.p683ss.android.ugc.aweme.shortvideo;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.an */
public final class C42423an {

    /* renamed from: a */
    private static String f107315a;

    /* renamed from: b */
    private static String f107316b;

    /* renamed from: b */
    public static String m93187b() {
        return f107316b;
    }

    /* renamed from: a */
    public static String m93185a() {
        if (m93189c(f107315a)) {
            return f107315a;
        }
        return "";
    }

    /* renamed from: a */
    public static void m93186a(String str) {
        f107315a = str;
    }

    /* renamed from: b */
    public static void m93188b(String str) {
        f107316b = str;
    }

    /* renamed from: c */
    private static boolean m93189c(String str) {
        if (str == null) {
            return false;
        }
        for (char isDigit : str.toCharArray()) {
            if (!Character.isDigit(isDigit)) {
                return false;
            }
        }
        return true;
    }
}
