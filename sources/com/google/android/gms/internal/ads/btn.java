package com.google.android.gms.internal.ads;

public final class btn {
    /* renamed from: a */
    public static boolean m36714a(String str) {
        return "audio".equals(m36716c(str));
    }

    /* renamed from: b */
    public static boolean m36715b(String str) {
        return "video".equals(m36716c(str));
    }

    /* renamed from: c */
    private static String m36716c(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        String str2 = "Invalid mime type: ";
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }
}
