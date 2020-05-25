package com.p683ss.android.ugc.aweme.discover.p1646h.p1648b;

import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.discover.h.b.c */
public final class C28179c implements Serializable {
    public static final C28180a Companion = new C28180a(null);

    /* renamed from: a */
    private int f73981a;

    /* renamed from: com.ss.android.ugc.aweme.discover.h.b.c$a */
    public static final class C28180a implements Serializable {
        private C28180a() {
        }

        public /* synthetic */ C28180a(C52707g gVar) {
            this();
        }
    }

    public static /* synthetic */ C28179c copy$default(C28179c cVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cVar.f73981a;
        }
        return cVar.copy(i);
    }

    public final int component1() {
        return this.f73981a;
    }

    public final C28179c copy(int i) {
        return new C28179c(i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28179c) {
                if (this.f73981a == ((C28179c) obj).f73981a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int getCursor() {
        return this.f73981a;
    }

    public final int hashCode() {
        return this.f73981a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoverRequestParam(cursor=");
        sb.append(this.f73981a);
        sb.append(")");
        return sb.toString();
    }

    public final void setCursor(int i) {
        this.f73981a = i;
    }

    public C28179c(int i) {
        this.f73981a = i;
    }
}
