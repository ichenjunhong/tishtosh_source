package com.google.android.gms.internal.ads;

public final class blk {
    /* renamed from: a */
    public static String m36006a(String str) {
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        String str2 = "Invalid mime type: ";
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    /* renamed from: b */
    public static boolean m36007b(String str) {
        return m36006a(str).equals("audio");
    }

    /* renamed from: c */
    public static boolean m36008c(String str) {
        return "audio/ac3".equals(str) || "audio/eac3".equals(str);
    }
}
