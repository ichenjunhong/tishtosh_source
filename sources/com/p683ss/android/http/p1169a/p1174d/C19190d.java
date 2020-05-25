package com.p683ss.android.http.p1169a.p1174d;

/* renamed from: com.ss.android.http.a.d.d */
public final class C19190d {
    /* renamed from: a */
    public static int m46778a(int i, int i2) {
        return (i * 37) + i2;
    }

    /* renamed from: a */
    public static int m46779a(int i, Object obj) {
        int i2;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        return m46778a(i, i2);
    }

    /* renamed from: a */
    public static boolean m46780a(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }
}
