package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.fp */
final class C16688fp {

    /* renamed from: a */
    static final Class<?> f46930a = m39857a("libcore.io.Memory");

    /* renamed from: b */
    private static final boolean f46931b = (m39857a("org.robolectric.Robolectric") != null);

    /* renamed from: a */
    static boolean m39858a() {
        return f46930a != null && !f46931b;
    }

    /* renamed from: a */
    private static <T> Class<T> m39857a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
