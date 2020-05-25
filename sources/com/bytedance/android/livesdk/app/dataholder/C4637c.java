package com.bytedance.android.livesdk.app.dataholder;

/* renamed from: com.bytedance.android.livesdk.app.dataholder.c */
public final class C4637c {

    /* renamed from: a */
    static final boolean[] f12655a = new boolean[0];

    /* renamed from: b */
    static final int[] f12656b = new int[0];

    /* renamed from: c */
    static final long[] f12657c = new long[0];

    /* renamed from: d */
    static final Object[] f12658d = new Object[0];

    /* renamed from: a */
    public static int m11113a(long[] jArr, int i, long j) {
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
