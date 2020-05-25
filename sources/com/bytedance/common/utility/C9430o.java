package com.bytedance.common.utility;

import com.C2240a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.bytedance.common.utility.o */
public final class C9430o {
    /* renamed from: a */
    private static String m18660a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            for (byte valueOf : bArr) {
                sb.append(C2240a.m6772a("%02x", new Object[]{Byte.valueOf(valueOf)}));
            }
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m18659a(String str, String str2) {
        byte[] bytes = str.getBytes();
        try {
            if (C9431p.m18664a(str2)) {
                str2 = "SHA-256";
            }
            MessageDigest instance = MessageDigest.getInstance(str2);
            instance.update(bytes);
            return m18660a(instance.digest());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        } catch (Exception unused2) {
            return null;
        }
    }
}
