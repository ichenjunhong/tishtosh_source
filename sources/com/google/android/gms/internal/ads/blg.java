package com.google.android.gms.internal.ads;

public final class blg {
    /* renamed from: a */
    public static void m35999a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static void m36000a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static void m36001b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public static <T> T m35998a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }
}
