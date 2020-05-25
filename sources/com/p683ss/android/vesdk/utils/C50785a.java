package com.p683ss.android.vesdk.utils;

import java.security.MessageDigest;

/* renamed from: com.ss.android.vesdk.utils.a */
public final class C50785a {

    /* renamed from: a */
    static final char[] f127599a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m109897a(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(str.getBytes("UTF-8"));
                    byte[] digest = instance.digest();
                    if (digest != null) {
                        return m109898a(digest, 0, digest.length);
                    }
                    throw new NullPointerException("bytes is null");
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m109899b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        String a = m109897a(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a.substring(0, 12));
        sb2.append(str);
        String a2 = m109897a(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(a.substring(0, 12));
        sb3.append(a2.substring(12, 32));
        return sb3.toString();
    }

    /* renamed from: a */
    private static String m109898a(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        } else if (i2 + 0 <= bArr.length) {
            int i3 = i2 * 2;
            char[] cArr = new char[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                byte b = bArr[i5 + 0] & 255;
                int i6 = i4 + 1;
                cArr[i4] = f127599a[b >> 4];
                i4 = i6 + 1;
                cArr[i6] = f127599a[b & 15];
            }
            return new String(cArr, 0, i3);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
