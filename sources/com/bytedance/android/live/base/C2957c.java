package com.bytedance.android.live.base;

/* renamed from: com.bytedance.android.live.base.c */
public final class C2957c {
    /* renamed from: a */
    public static int m8381a(int i, Object obj) {
        int i2;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        return (i * 37) + i2;
    }
}
