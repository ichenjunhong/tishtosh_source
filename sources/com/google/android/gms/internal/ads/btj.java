package com.google.android.gms.internal.ads;

public final class btj {

    /* renamed from: a */
    static final int[] f43843a = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: b */
    private static final byte[] f43844b = {0, 0, 0, 1};

    /* renamed from: c */
    private static final int[] f43845c = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: a */
    public static byte[] m36704a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[(f43844b.length + i2)];
        System.arraycopy(f43844b, 0, bArr2, 0, f43844b.length);
        System.arraycopy(bArr, i, bArr2, f43844b.length, i2);
        return bArr2;
    }

    /* renamed from: a */
    static int m36703a(btq btq) {
        int a = btq.mo30689a(5);
        return a == 31 ? btq.mo30689a(6) + 32 : a;
    }

    /* renamed from: b */
    static int m36705b(btq btq) {
        int a = btq.mo30689a(4);
        if (a == 15) {
            return btq.mo30689a(24);
        }
        bti.m36699a(a < 13);
        return f43845c[a];
    }
}
