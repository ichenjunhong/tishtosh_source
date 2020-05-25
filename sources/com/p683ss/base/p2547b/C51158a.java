package com.p683ss.base.p2547b;

import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.ss.base.b.a */
public final class C51158a {
    /* renamed from: a */
    public static String m110040a(String str, String str2) {
        if (str2.length() != 16) {
            return null;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes("UTF-8"), "AES");
        Cipher instance = Cipher.getInstance("AES/ECB/PKCS5Padding");
        instance.init(1, secretKeySpec);
        return Base64.encodeToString(instance.doFinal(str.getBytes()), 2);
    }

    /* renamed from: b */
    public static String m110041b(String str, String str2) {
        try {
            if (str2.length() != 16) {
                return null;
            }
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes("UTF-8"), "AES");
            Cipher instance = Cipher.getInstance("AES/ECB/PKCS5Padding");
            instance.init(2, secretKeySpec);
            try {
                return new String(instance.doFinal(Base64.decode(str, 2)), "UTF-8");
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return null;
        }
    }
}
