package com.p683ss.android.ugc.aweme.shortvideo.edit;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.w */
public final class C43769w<F, S, T> {

    /* renamed from: a */
    public final F f110833a;

    /* renamed from: b */
    public final S f110834b;

    /* renamed from: c */
    public final T f110835c;

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (this.f110833a == null) {
            i = 0;
        } else {
            i = this.f110833a.hashCode();
        }
        if (this.f110834b == null) {
            i2 = 0;
        } else {
            i2 = this.f110834b.hashCode();
        }
        int i4 = i ^ i2;
        if (this.f110835c != null) {
            i3 = this.f110835c.hashCode();
        }
        return i4 ^ i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C43769w)) {
            return false;
        }
        C43769w wVar = (C43769w) obj;
        if (!m96208a(wVar.f110833a, this.f110833a) || !m96208a(wVar.f110834b, this.f110834b) || !m96208a(wVar.f110835c, this.f110835c)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m96208a(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static <A, B, C> C43769w<A, B, C> m96207a(A a, B b, C c) {
        return new C43769w<>(a, b, c);
    }

    private C43769w(F f, S s, T t) {
        this.f110833a = f;
        this.f110834b = s;
        this.f110835c = t;
    }
}
