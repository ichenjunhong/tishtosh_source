package com.p683ss.android.ugc.aweme.shortvideo.p2241t;

import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.t.f */
public final class C44883f {

    /* renamed from: b */
    public static final int f113581b = 1;

    /* renamed from: c */
    public static final int f113582c = 2;

    /* renamed from: d */
    public static final int f113583d = 3;

    /* renamed from: e */
    public static final C44884a f113584e = new C44884a(null);

    /* renamed from: a */
    public boolean f113585a;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.t.f$a */
    public static final class C44884a {
        private C44884a() {
        }

        public /* synthetic */ C44884a(C52707g gVar) {
            this();
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C44883f) {
                if (this.f113585a == ((C44883f) obj).f113585a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f113585a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecorderConfigData(isBoy=");
        sb.append(this.f113585a);
        sb.append(")");
        return sb.toString();
    }
}
