package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.kd */
final class C16826kd {
    /* renamed from: a */
    static /* synthetic */ boolean m40771a(byte b) {
        return b >= 0;
    }

    /* renamed from: b */
    static /* synthetic */ boolean m40772b(byte b) {
        return b < -32;
    }

    /* renamed from: c */
    static /* synthetic */ boolean m40773c(byte b) {
        return b < -16;
    }

    /* renamed from: d */
    private static boolean m40774d(byte b) {
        return b > -65;
    }

    /* renamed from: a */
    static /* synthetic */ void m40770a(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* renamed from: a */
    static /* synthetic */ void m40769a(byte b, byte b2, char[] cArr, int i) throws C16748hk {
        if (b < -62 || m40774d(b2)) {
            throw C16748hk.m40329h();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* renamed from: a */
    static /* synthetic */ void m40768a(byte b, byte b2, byte b3, char[] cArr, int i) throws C16748hk {
        if (m40774d(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m40774d(b3)))) {
            throw C16748hk.m40329h();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* renamed from: a */
    static /* synthetic */ void m40767a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws C16748hk {
        if (m40774d(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m40774d(b3) || m40774d(b4)) {
            throw C16748hk.m40329h();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }
}
