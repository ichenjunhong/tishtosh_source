package com.p683ss.android.ugc.aweme.p2033o.p2034a;

/* renamed from: com.ss.android.ugc.aweme.o.a.a */
public final class C38464a {

    /* renamed from: a */
    public final boolean f97872a;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38464a) {
                if (this.f97872a == ((C38464a) obj).f97872a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f97872a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EarPluginEvent(isPlugged=");
        sb.append(this.f97872a);
        sb.append(")");
        return sb.toString();
    }

    public C38464a(boolean z) {
        this.f97872a = z;
    }
}
