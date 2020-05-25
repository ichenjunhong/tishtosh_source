package com.google.android.gms.internal.ads;

public final class blh {

    /* renamed from: a */
    static final int[] f42844a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b */
    private static final byte[] f42845b = {0, 0, 0, 1};

    /* renamed from: c */
    private static final int[] f42846c = {0, 1, 2, 3, 4, 5, 6, 8};

    /* renamed from: a */
    public static byte[] m36002a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[(f42845b.length + i2)];
        System.arraycopy(f42845b, 0, bArr2, 0, f42845b.length);
        System.arraycopy(bArr, i, bArr2, f42845b.length, i2);
        return bArr2;
    }
}
