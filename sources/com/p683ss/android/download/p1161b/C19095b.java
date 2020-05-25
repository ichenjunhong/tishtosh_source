package com.p683ss.android.download.p1161b;

/* renamed from: com.ss.android.download.b.b */
public final class C19095b {

    /* renamed from: a */
    static final boolean[] f52580a = new boolean[0];

    /* renamed from: b */
    static final int[] f52581b = new int[0];

    /* renamed from: c */
    static final long[] f52582c = new long[0];

    /* renamed from: d */
    static final Object[] f52583d = new Object[0];

    /* renamed from: a */
    public static int m46512a(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else if (j2 <= j) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return i3 ^ -1;
    }
}
