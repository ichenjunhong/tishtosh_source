package com.google.android.gms.common.util;

import android.util.Base64;

/* renamed from: com.google.android.gms.common.util.c */
public final class C15512c {
    /* renamed from: a */
    public static String m32268a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    /* renamed from: b */
    public static String m32269b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }
}
