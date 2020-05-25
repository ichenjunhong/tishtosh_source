package android.support.p030v4.p038f;

/* renamed from: android.support.v4.f.m */
public final class C0799m {
    /* renamed from: a */
    public static int m2266a(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public static <T> T m2267a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static <T> T m2268a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
}
