package com.p683ss.android.deviceregister.p1158c;

/* renamed from: com.ss.android.deviceregister.c.a */
public final class C19030a {
    /* renamed from: a */
    public static boolean m46306a(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length < 13 || length > 160) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'f') && ((charAt < 'A' || charAt > 'F') && charAt != '-'))) {
                return false;
            }
        }
        return true;
    }
}
