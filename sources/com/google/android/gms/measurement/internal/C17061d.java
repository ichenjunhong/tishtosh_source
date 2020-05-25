package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C15464q;

/* renamed from: com.google.android.gms.measurement.internal.d */
final class C17061d {

    /* renamed from: a */
    final String f48147a;

    /* renamed from: b */
    final String f48148b;

    /* renamed from: c */
    final long f48149c;

    /* renamed from: d */
    final long f48150d;

    /* renamed from: e */
    final long f48151e;

    /* renamed from: f */
    final long f48152f;

    /* renamed from: g */
    final Long f48153g;

    /* renamed from: h */
    final Long f48154h;

    /* renamed from: i */
    final Long f48155i;

    /* renamed from: j */
    final Boolean f48156j;

    C17061d(String str, String str2, long j, long j2, long j3, long j4, Long l, Long l2, Long l3, Boolean bool) {
        long j5 = j;
        long j6 = j2;
        long j7 = j4;
        C15464q.m32125a(str);
        C15464q.m32125a(str2);
        boolean z = false;
        C15464q.m32133b(j5 >= 0);
        C15464q.m32133b(j6 >= 0);
        if (j7 >= 0) {
            z = true;
        }
        C15464q.m32133b(z);
        this.f48147a = str;
        this.f48148b = str2;
        this.f48149c = j5;
        this.f48150d = j6;
        this.f48151e = j3;
        this.f48152f = j7;
        this.f48153g = l;
        this.f48154h = l2;
        this.f48155i = l3;
        this.f48156j = bool;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C17061d mo33044a(long j) {
        C17061d dVar = new C17061d(this.f48147a, this.f48148b, this.f48149c, this.f48150d, j, this.f48152f, this.f48153g, this.f48154h, this.f48155i, this.f48156j);
        return dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C17061d mo33045a(long j, long j2) {
        C17061d dVar = new C17061d(this.f48147a, this.f48148b, this.f48149c, this.f48150d, this.f48151e, j, Long.valueOf(j2), this.f48154h, this.f48155i, this.f48156j);
        return dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C17061d mo33046a(Long l, Long l2, Boolean bool) {
        C17061d dVar = new C17061d(this.f48147a, this.f48148b, this.f48149c, this.f48150d, this.f48151e, this.f48152f, this.f48153g, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
        return dVar;
    }
}
