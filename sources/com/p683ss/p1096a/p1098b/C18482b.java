package com.p683ss.p1096a.p1098b;

import java.security.MessageDigest;

/* renamed from: com.ss.a.b.b */
public final class C18482b {

    /* renamed from: a */
    static final char[] f50910a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    private static String m44729a(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        } else if (i2 + 0 <= bArr.length) {
            int i3 = i2 * 2;
            char[] cArr = new char[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                byte b = bArr[i5 + 0] & 255;
                int i6 = i4 + 1;
                cArr[i4] = f50910a[b >> 4];
                i4 = i6 + 1;
                cArr[i6] = f50910a[b & 15];
            }
            return new String(cArr, 0, i3);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: a */
    public static String m44728a(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(str.getBytes("UTF-8"));
                    byte[] digest = instance.digest();
                    if (digest != null) {
                        return m44729a(digest, 0, digest.length);
                    }
                    throw new NullPointerException("bytes is null");
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }
}
