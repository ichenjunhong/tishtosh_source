package com.p683ss.android.download.p1161b;

/* renamed from: com.ss.android.download.b.a */
public final class C19094a {

    /* renamed from: a */
    private static Object[] f52578a = new Object[0];

    /* renamed from: b */
    private static Object[] f52579b = new Object[73];

    /* renamed from: a */
    public static int m46511a(int i) {
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        return i2 / 8;
    }
}
