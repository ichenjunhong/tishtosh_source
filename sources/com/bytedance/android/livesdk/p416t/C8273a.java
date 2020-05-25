package com.bytedance.android.livesdk.p416t;

/* renamed from: com.bytedance.android.livesdk.t.a */
final class C8273a {
    /* renamed from: a */
    public static <T> int m16389a(T... tArr) {
        int i;
        if (tArr == null) {
            return 0;
        }
        int i2 = 1;
        for (T t : tArr) {
            if (t == null) {
                i = 0;
            } else {
                i = t.hashCode();
            }
            i2 = ((i2 << 5) - i2) ^ i;
        }
        return i2;
    }
}
