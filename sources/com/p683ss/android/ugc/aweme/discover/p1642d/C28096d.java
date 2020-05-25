package com.p683ss.android.ugc.aweme.discover.p1642d;

/* renamed from: com.ss.android.ugc.aweme.discover.d.d */
public final class C28096d {

    /* renamed from: a */
    public final boolean f73786a;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28096d) {
                if (this.f73786a == ((C28096d) obj).f73786a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f73786a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoverSearchEvent(enter=");
        sb.append(this.f73786a);
        sb.append(")");
        return sb.toString();
    }

    public C28096d(boolean z) {
        this.f73786a = z;
    }
}
