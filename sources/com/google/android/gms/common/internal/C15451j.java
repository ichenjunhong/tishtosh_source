package com.google.android.gms.common.internal;

/* renamed from: com.google.android.gms.common.internal.j */
public final class C15451j {

    /* renamed from: a */
    private static final int f39864a = 15;

    /* renamed from: b */
    private final String f39865b;

    /* renamed from: c */
    private final String f39866c;

    private C15451j(String str, String str2) {
        C15464q.m32124a(str, (Object) "log tag cannot be null");
        C15464q.m32135b(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, Integer.valueOf(23));
        this.f39865b = str;
        this.f39866c = null;
    }

    public C15451j(String str) {
        this(str, null);
    }
}
