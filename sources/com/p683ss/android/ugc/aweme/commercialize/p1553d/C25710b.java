package com.p683ss.android.ugc.aweme.commercialize.p1553d;

import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.commercialize.d.b */
public final class C25710b {

    /* renamed from: b */
    public static final C25711a f68019b = new C25711a(null);

    /* renamed from: a */
    public final int f68020a;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.d.b$a */
    public static final class C25711a {
        private C25711a() {
        }

        public /* synthetic */ C25711a(C52707g gVar) {
            this();
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25710b) {
                if (this.f68020a == ((C25710b) obj).f68020a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f68020a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdCommentListEvent(type=");
        sb.append(this.f68020a);
        sb.append(")");
        return sb.toString();
    }

    public C25710b(int i) {
        this.f68020a = i;
    }
}
