package com.p683ss.android.ugc.aweme.utils;

import java.security.MessageDigest;

/* renamed from: com.ss.android.ugc.aweme.utils.da */
public final class C47803da {

    /* renamed from: a */
    private static final char[] f120355a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m103437a(String str) {
        try {
            return m103438a(str.getBytes());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m103438a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            byte[] digest = instance.digest();
            char[] cArr = new char[32];
            int i = 0;
            for (int i2 = 0; i2 < 16; i2++) {
                byte b = digest[i2];
                int i3 = i + 1;
                cArr[i] = f120355a[(b >>> 4) & 15];
                i = i3 + 1;
                cArr[i3] = f120355a[b & 15];
            }
            return new String(cArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
