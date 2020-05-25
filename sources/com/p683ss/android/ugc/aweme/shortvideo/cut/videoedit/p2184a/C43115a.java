package com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.p2184a;

import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a.a */
public final class C43115a<T> {

    /* renamed from: b */
    public static final C43116a f108949b = new C43116a(null);

    /* renamed from: a */
    public final T f108950a;

    /* renamed from: c */
    private final int f108951c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a.a$a */
    public static final class C43116a {
        private C43116a() {
        }

        public /* synthetic */ C43116a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static <T> C43115a<T> m94587a(T t) {
            return new C43115a<>(1, t, null);
        }

        /* renamed from: b */
        public static <T> C43115a<T> m94588b(T t) {
            return new C43115a<>(2, t, null);
        }
    }

    /* renamed from: a */
    public final boolean mo87651a() {
        if (this.f108951c == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo87653c() {
        if (this.f108951c == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo87652b() {
        if (this.f108951c == 2) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InterceptResult(type=");
        sb.append(this.f108951c);
        sb.append(", result=");
        sb.append(this.f108950a);
        sb.append(')');
        return sb.toString();
    }

    private C43115a(int i, T t) {
        this.f108951c = i;
        this.f108950a = t;
    }

    public /* synthetic */ C43115a(int i, Object obj, C52707g gVar) {
        this(i, obj);
    }
}
