package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

public final class avr {

    /* renamed from: a */
    private static final ThreadLocal<SecureRandom> f41444a = new avs();

    /* renamed from: a */
    public static byte[] m34234a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) f41444a.get()).nextBytes(bArr);
        return bArr;
    }
}
