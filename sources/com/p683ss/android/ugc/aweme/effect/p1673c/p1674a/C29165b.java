package com.p683ss.android.ugc.aweme.effect.p1673c.p1674a;

import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.effect.c.a.b */
public final class C29165b {

    /* renamed from: c */
    public static final C29166a f76428c = new C29166a(null);

    /* renamed from: a */
    public final int f76429a;

    /* renamed from: b */
    public final float f76430b;

    /* renamed from: com.ss.android.ugc.aweme.effect.c.a.b$a */
    public static final class C29166a {
        private C29166a() {
        }

        public /* synthetic */ C29166a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C29165b m68677a(float f) {
            return new C29165b(1, f, null);
        }

        /* renamed from: b */
        public static C29165b m68678b(float f) {
            return new C29165b(0, f, null);
        }
    }

    /* renamed from: a */
    public static final C29165b m68675a(float f) {
        return C29166a.m68677a(f);
    }

    /* renamed from: b */
    public static final C29165b m68676b(float f) {
        return C29166a.m68678b(f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("op = ");
        sb.append(this.f76429a);
        sb.append(", duration = ");
        sb.append(this.f76430b);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C29165b)) {
            return false;
        }
        C29165b bVar = (C29165b) obj;
        if (this.f76429a == bVar.f76429a && this.f76430b == bVar.f76430b) {
            return true;
        }
        return false;
    }

    private C29165b(int i, float f) {
        this.f76429a = i;
        this.f76430b = f;
    }

    public /* synthetic */ C29165b(int i, float f, C52707g gVar) {
        this(i, f);
    }
}
