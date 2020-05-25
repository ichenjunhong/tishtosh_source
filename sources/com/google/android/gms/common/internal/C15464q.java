package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.C2240a;
import com.google.android.gms.common.util.C15533x;

/* renamed from: com.google.android.gms.common.internal.q */
public final class C15464q {
    /* renamed from: a */
    public static <T> T m32123a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: a */
    public static String m32125a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    /* renamed from: a */
    public static String m32126a(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static <T> T m32124a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static int m32122a(int i) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    /* renamed from: a */
    public static void m32129a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public static void m32130a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m32131a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(C2240a.m6772a(str, objArr));
        }
    }

    /* renamed from: b */
    public static void m32134b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static void m32135b(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(C2240a.m6772a(str, objArr));
        }
    }

    /* renamed from: b */
    public static void m32133b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m32132b(String str) {
        if (!C15533x.m32327a()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: a */
    public static void m32127a() {
        m32136c("Must not be called on the main application thread");
    }

    /* renamed from: c */
    public static void m32136c(String str) {
        if (C15533x.m32327a()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: a */
    public static void m32128a(Handler handler) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException("Must be called on the handler thread");
        }
    }
}
