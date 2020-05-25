package com.p683ss.android.p1103ad.p1104a.p1108c;

import android.text.TextUtils;
import com.C2240a;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.ss.android.ad.a.c.b */
public final class C18536b {
    /* renamed from: a */
    public static String m44852a(String str) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String a = C2240a.m6772a("auth-v1/%s/%d/%d", new Object[]{"4b84eca04238efc6c4ffb4b797ad1494", Long.valueOf(System.currentTimeMillis() / 1000), Integer.valueOf(1800)});
        return C2240a.m6772a("%s/%s", new Object[]{a, m44853a(m44853a("d1b0973d6fec41e693c00611e45c19a9", a.getBytes()), str.getBytes())});
    }

    /* renamed from: a */
    private static String m44853a(String str, byte[] bArr) throws Exception {
        Mac instance = Mac.getInstance("HmacSHA256");
        instance.init(new SecretKeySpec(str.getBytes(), "HmacSHA256"));
        byte[] doFinal = instance.doFinal(bArr);
        byte[] bArr2 = new byte[(doFinal.length * 2)];
        for (int i = 0; i < doFinal.length; i++) {
            byte[] bytes = C2240a.m6772a("%02x", new Object[]{Integer.valueOf(doFinal[i] & 255)}).getBytes();
            int i2 = i * 2;
            bArr2[i2] = bytes[0];
            bArr2[i2 + 1] = bytes[1];
        }
        return new String(bArr2);
    }
}
