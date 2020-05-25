package com.toutiao.proxyserver.p2614f;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.toutiao.proxyserver.f.a */
public class C51835a {

    /* renamed from: a */
    private static final MessageDigest f129325a = m111162a();

    /* renamed from: b */
    private static final char[] f129326b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private C51835a() {
    }

    /* renamed from: a */
    private static MessageDigest m111162a() {
        try {
            return MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m111161a(String str) {
        byte[] digest;
        MessageDigest messageDigest = f129325a;
        if (messageDigest == null) {
            return "";
        }
        byte[] bytes = str.getBytes(C51838d.f129327a);
        synchronized (C51835a.class) {
            digest = messageDigest.digest(bytes);
        }
        if (digest == null || digest.length == 0) {
            return null;
        }
        char[] cArr = new char[(digest.length << 1)];
        int i = 0;
        for (byte b : digest) {
            int i2 = i + 1;
            cArr[i] = f129326b[(b & 240) >> 4];
            i = i2 + 1;
            cArr[i2] = f129326b[b & 15];
        }
        return new String(cArr);
    }
}
