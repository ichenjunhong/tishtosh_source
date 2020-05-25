package com.facebook.imagepipeline.p956a.p960d;

/* renamed from: com.facebook.imagepipeline.a.d.a */
public final class C13934a {
    /* renamed from: b */
    public static int m28395b(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }

    /* renamed from: a */
    public static void m28394a(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] < 11) {
                iArr[i] = 100;
            }
        }
    }

    /* renamed from: c */
    public static int[] m28396c(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = i;
            i += iArr[i2];
        }
        return iArr2;
    }
}
