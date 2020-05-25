package com.p683ss.android.ugc.aweme.p1254a.p1255a;

/* renamed from: com.ss.android.ugc.aweme.a.a.a */
public final class C20844a {

    /* renamed from: a */
    public final boolean f56795a;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20844a) {
                if (this.f56795a == ((C20844a) obj).f56795a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f56795a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HighPriorityDialogEvent(showing=");
        sb.append(this.f56795a);
        sb.append(")");
        return sb.toString();
    }

    public C20844a(boolean z) {
        this.f56795a = z;
    }
}
