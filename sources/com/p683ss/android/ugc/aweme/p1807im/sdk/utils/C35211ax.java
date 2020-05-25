package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.ax */
public final class C35211ax {
    /* renamed from: a */
    public static String m79597a(String str) {
        int length = str.length();
        char[] charArray = str.toCharArray();
        int i = 0;
        while (i < length) {
            char c = charArray[i];
            if (c > ' ' && c != 160 && c != 12288) {
                break;
            }
            i++;
        }
        while (i < length) {
            char c2 = charArray[length - 1];
            if (c2 > ' ' && c2 != 160 && c2 != 12288) {
                break;
            }
            length--;
        }
        if (i > 0 || length < str.length()) {
            return str.substring(i, length);
        }
        return str;
    }
}
