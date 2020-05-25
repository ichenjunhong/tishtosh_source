package com.p683ss.android.message;

/* renamed from: com.ss.android.message.l */
public final class C19488l {
    /* renamed from: a */
    public static byte[] m47715a(int i) {
        byte[] bArr = new byte[4];
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i2] = new Integer(i).byteValue();
            i >>= 8;
        }
        return bArr;
    }
}
