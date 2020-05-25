package com.p683ss.android.ugc.aweme.base.utils;

/* renamed from: com.ss.android.ugc.aweme.base.utils.l */
public final class C23725l {
    /* renamed from: a */
    public static boolean m58233a(String str) {
        if (str != null) {
            int length = str.length();
            if (length != 0) {
                for (int i = 0; i < length; i++) {
                    if (!Character.isWhitespace(str.charAt(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return true;
    }
}
