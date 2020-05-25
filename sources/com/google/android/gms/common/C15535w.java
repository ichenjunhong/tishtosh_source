package com.google.android.gms.common;

/* renamed from: com.google.android.gms.common.w */
class C15535w {

    /* renamed from: a */
    static final C15535w f40012a = new C15535w(true, null, null);

    /* renamed from: b */
    final boolean f40013b;

    /* renamed from: c */
    final Throwable f40014c;

    /* renamed from: d */
    private final String f40015d;

    C15535w(boolean z, String str, Throwable th) {
        this.f40013b = z;
        this.f40015d = str;
        this.f40014c = th;
    }

    /* renamed from: a */
    static C15535w m32328a(String str) {
        return new C15535w(false, str, null);
    }

    /* renamed from: a */
    static C15535w m32329a(String str, Throwable th) {
        return new C15535w(false, str, th);
    }
}
