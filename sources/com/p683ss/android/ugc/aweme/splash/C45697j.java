package com.p683ss.android.ugc.aweme.splash;

import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.splash.j */
public final class C45697j {

    /* renamed from: b */
    public static final C45698a f115539b = new C45698a(null);

    /* renamed from: a */
    public final int f115540a = 0;

    /* renamed from: com.ss.android.ugc.aweme.splash.j$a */
    public static final class C45698a {
        private C45698a() {
        }

        public /* synthetic */ C45698a(C52707g gVar) {
            this();
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45697j) {
                if (this.f115540a == ((C45697j) obj).f115540a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f115540a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SplashAdEvent(status=");
        sb.append(this.f115540a);
        sb.append(")");
        return sb.toString();
    }

    public C45697j(int i) {
    }
}
