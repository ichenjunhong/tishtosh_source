package com.p683ss.p1096a.p1098b;

/* renamed from: com.ss.a.b.a */
public final class C18481a {
    /* renamed from: a */
    public static String m44725a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        char[] charArray = "0123456789abcdef".toCharArray();
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            cArr[i2] = charArray[b >>> 4];
            cArr[i2 + 1] = charArray[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public static byte[] m44726a(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    /* renamed from: a */
    public static byte[] m44727a(byte[]... bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            i += bArr[i2].length;
        }
        byte[] bArr2 = new byte[i];
        int i3 = 0;
        for (int i4 = 0; i4 < 2; i4++) {
            byte[] bArr3 = bArr[i4];
            System.arraycopy(bArr3, 0, bArr2, i3 + 0, bArr3.length);
            i3 += bArr3.length;
        }
        return bArr2;
    }
}
