package com.google.android.gms.common.p1034a;

/* renamed from: com.google.android.gms.common.a.a */
public abstract class C15204a<T> {

    /* renamed from: c */
    private static final Object f39257c = new Object();

    /* renamed from: d */
    private static C15205a f39258d = null;

    /* renamed from: e */
    private static int f39259e = 0;

    /* renamed from: a */
    protected final String f39260a;

    /* renamed from: b */
    protected final T f39261b;

    /* renamed from: com.google.android.gms.common.a.a$a */
    interface C15205a {
    }

    protected C15204a(String str, T t) {
        this.f39260a = str;
        this.f39261b = t;
    }

    /* renamed from: a */
    public static C15204a<Boolean> m31450a(String str, boolean z) {
        return new C15206b(str, Boolean.valueOf(z));
    }

    /* renamed from: a */
    public static C15204a<Long> m31448a(String str, Long l) {
        return new C15207c(str, l);
    }

    /* renamed from: a */
    public static C15204a<Integer> m31447a(String str, Integer num) {
        return new C15208d(str, num);
    }

    /* renamed from: a */
    public static C15204a<String> m31449a(String str, String str2) {
        return new C15210f(str, str2);
    }
}
