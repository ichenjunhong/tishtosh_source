package com.p683ss.android.ugc.aweme.captcha.p1491c;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.ss.android.ugc.aweme.captcha.c.a */
public final class C24500a {
    /* renamed from: a */
    public static String m59892a() {
        return "eagleye_9fd&fwfl";
    }

    /* renamed from: a */
    private static String m59894a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        char[] charArray = "0123456789abcdef".toCharArray();
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            cArr[i2] = charArray[b >>> 4];
            cArr[i2 + 1] = charArray[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public static String m59893a(String str) {
        try {
            byte[] bytes = str.getBytes();
            SecretKeySpec secretKeySpec = new SecretKeySpec(m59892a().getBytes(), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15});
            Cipher instance = Cipher.getInstance("AES/CFB/NoPadding ");
            instance.init(1, secretKeySpec, ivParameterSpec);
            return m59894a(instance.doFinal(bytes));
        } catch (Exception unused) {
            return "";
        }
    }
}
