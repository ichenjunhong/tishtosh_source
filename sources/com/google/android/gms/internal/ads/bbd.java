package com.google.android.gms.internal.ads;

final class bbd {
    /* renamed from: a */
    static /* synthetic */ boolean m35243a(byte b) {
        return b >= 0;
    }

    /* renamed from: b */
    static /* synthetic */ boolean m35244b(byte b) {
        return b < -32;
    }

    /* renamed from: c */
    static /* synthetic */ boolean m35245c(byte b) {
        return b < -16;
    }

    /* renamed from: d */
    private static boolean m35246d(byte b) {
        return b > -65;
    }

    /* renamed from: a */
    static /* synthetic */ void m35242a(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* renamed from: a */
    static /* synthetic */ void m35241a(byte b, byte b2, char[] cArr, int i) throws ayi {
        if (b < -62 || m35246d(b2)) {
            throw ayi.m34785h();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* renamed from: a */
    static /* synthetic */ void m35240a(byte b, byte b2, byte b3, char[] cArr, int i) throws ayi {
        if (m35246d(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m35246d(b3)))) {
            throw ayi.m34785h();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* renamed from: a */
    static /* synthetic */ void m35239a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws ayi {
        if (m35246d(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m35246d(b3) || m35246d(b4)) {
            throw ayi.m34785h();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }
}
