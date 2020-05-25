package com.bytedance.android.livesdk.app.dataholder;

/* renamed from: com.bytedance.android.livesdk.app.dataholder.b */
public final class C4636b {

    /* renamed from: a */
    private static Object[] f12653a = new Object[0];

    /* renamed from: b */
    private static Object[] f12654b = new Object[73];

    /* renamed from: a */
    public static int m11112a(int i) {
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
