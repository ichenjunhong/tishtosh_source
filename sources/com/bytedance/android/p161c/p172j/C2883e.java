package com.bytedance.android.p161c.p172j;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bytedance.android.c.j.e */
public final class C2883e {

    /* renamed from: a */
    private static final byte[] f8548a = {-3, 55, 122, 88, 90, 0};

    /* renamed from: b */
    private static final byte[] f8549b = {40, -75, 47, -3};

    /* renamed from: c */
    private static final byte[] f8550c = {Byte.MAX_VALUE, 69, 76, 70};

    /* renamed from: a */
    public static String m8184a(InputStream inputStream) {
        byte[] bArr = new byte[6];
        try {
            inputStream.read(bArr);
            if (m8185a(f8548a, bArr, 0, 0, 6)) {
                return "xz";
            }
            if (m8185a(f8549b, bArr, 0, 0, 4)) {
                return "zstd";
            }
            if (m8185a(f8550c, bArr, 0, 0, 4)) {
                return "elf";
            }
            return String.valueOf(bArr);
        } catch (IOException unused) {
        }
    }

    /* renamed from: a */
    private static boolean m8185a(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        if (bArr == null) {
            return false;
        }
        int i4 = i3 + 0;
        if (i4 > bArr.length || i4 > 6) {
            throw new IndexOutOfBoundsException("it seems compare will reach bounds of the array!");
        }
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = i5 + 0;
            if (bArr[i6] != bArr2[i6]) {
                return false;
            }
        }
        return true;
    }
}
