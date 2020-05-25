package com.p683ss.android.deviceregister.p1155b.p1156a.p1157a;

import android.text.TextUtils;
import android.util.Base64;
import java.security.Key;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

/* renamed from: com.ss.android.deviceregister.b.a.a.c */
public final class C19021c {

    /* renamed from: a */
    private static String f52353a;

    /* renamed from: a */
    public static String m46255a() {
        if (TextUtils.isEmpty(f52353a)) {
            f52353a = m46256a("Ynl0ZWRhbmNl");
        }
        return f52353a;
    }

    /* renamed from: a */
    static Key m46257a(byte[] bArr) throws Exception {
        return SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(bArr));
    }

    /* renamed from: a */
    public static String m46256a(String str) {
        try {
            return new String(Base64.decode(str.getBytes("UTF-8"), 2));
        } catch (Exception unused) {
            return "";
        }
    }
}
