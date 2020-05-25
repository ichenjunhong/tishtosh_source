package com.bytedance.sdk.account.p849b.p853d;

import java.security.MessageDigest;

/* renamed from: com.bytedance.sdk.account.b.d.a */
public final class C13032a {

    /* renamed from: a */
    private static final char[] f34055a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m26205a(String str) {
        try {
            return m26206a(str.getBytes());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m26206a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            byte[] digest = instance.digest();
            char[] cArr = new char[32];
            int i = 0;
            for (int i2 = 0; i2 < 16; i2++) {
                byte b = digest[i2];
                int i3 = i + 1;
                cArr[i] = f34055a[(b >>> 4) & 15];
                i = i3 + 1;
                cArr[i3] = f34055a[b & 15];
            }
            return new String(cArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
