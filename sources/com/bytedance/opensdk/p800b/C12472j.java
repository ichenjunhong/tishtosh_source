package com.bytedance.opensdk.p800b;

import java.security.MessageDigest;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.opensdk.b.j */
public final class C12472j {

    /* renamed from: a */
    public static final C12472j f32776a = new C12472j();

    /* renamed from: b */
    private static final char[] f32777b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private C12472j() {
    }

    /* renamed from: a */
    public static String m25067a(byte[] bArr) {
        C52711k.m112240b(bArr, "bytes");
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            byte[] digest = instance.digest();
            char[] cArr = new char[32];
            int i = 0;
            for (int i2 = 0; i2 <= 15; i2++) {
                byte b = digest[i2];
                int i3 = i + 1;
                cArr[i] = f32777b[15 & (b >>> 4)];
                i = i3 + 1;
                cArr[i3] = f32777b[b & 15];
            }
            return new String(cArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
