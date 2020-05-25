package com.github.p994a.p995a;

/* renamed from: com.github.a.a.a */
public final class C14721a {
    /* renamed from: a */
    public static String m30100a(char c) {
        boolean z;
        if ((19968 > c || c > 40869 || m30102b(c) <= 0) && 12295 != c) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return String.valueOf(c);
        }
        if (c == 12295) {
            return "LING";
        }
        return C14725e.f38143b[m30102b(c)];
    }

    /* renamed from: b */
    private static int m30102b(char c) {
        int i = c - 19968;
        if (i >= 0 && i < 7000) {
            return m30101a(C14722b.f38136a, C14722b.f38137b, i);
        }
        if (7000 > i || i >= 14000) {
            return m30101a(C14724d.f38140a, C14724d.f38141b, i - 14000);
        }
        return m30101a(C14723c.f38138a, C14723c.f38139b, i - 7000);
    }

    /* renamed from: a */
    private static short m30101a(byte[] bArr, byte[] bArr2, int i) {
        short s = (short) (bArr2[i] & 255);
        if ((bArr[i / 8] & C14725e.f38142a[i % 8]) != 0) {
            return (short) (s | 256);
        }
        return s;
    }
}
