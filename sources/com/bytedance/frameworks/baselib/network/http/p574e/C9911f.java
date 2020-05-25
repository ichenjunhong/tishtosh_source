package com.bytedance.frameworks.baselib.network.http.p574e;

/* renamed from: com.bytedance.frameworks.baselib.network.http.e.f */
public final class C9911f {
    /* renamed from: a */
    public static int m19861a(int i, int i2) {
        return (i * 37) + i2;
    }

    /* renamed from: a */
    public static int m19862a(int i, Object obj) {
        int i2;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        return m19861a(i, i2);
    }
}
