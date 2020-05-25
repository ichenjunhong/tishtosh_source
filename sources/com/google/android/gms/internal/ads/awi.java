package com.google.android.gms.internal.ads;

final class awi {

    /* renamed from: a */
    static final Class<?> f41459a = m34266a("libcore.io.Memory");

    /* renamed from: b */
    private static final boolean f41460b = (m34266a("org.robolectric.Robolectric") != null);

    /* renamed from: a */
    static boolean m34267a() {
        return f41459a != null && !f41460b;
    }

    /* renamed from: a */
    private static <T> Class<T> m34266a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
