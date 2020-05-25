package com.snapchat.kit.sdk;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.SecureRandom;

/* renamed from: com.snapchat.kit.sdk.a */
final class C18243a {

    /* renamed from: a */
    static int f50374a = 32;

    /* renamed from: b */
    static int f50375b = 32;

    /* renamed from: c */
    private static String f50376c = "AuthRequestFactory";

    /* renamed from: a */
    static String m44461a(int i) {
        byte[] bArr = new byte[i];
        new SecureRandom().nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: a */
    static String m44462a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes("US-ASCII"));
            return Base64.encodeToString(instance.digest(), 11);
        } catch (Exception unused) {
            return str;
        }
    }
}
