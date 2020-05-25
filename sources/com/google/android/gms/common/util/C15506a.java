package com.google.android.gms.common.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.common.util.a */
public final class C15506a {

    /* renamed from: a */
    private static volatile int f39973a = -1;

    /* renamed from: a */
    public static MessageDigest m32257a(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
