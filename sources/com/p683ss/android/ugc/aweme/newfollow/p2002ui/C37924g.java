package com.p683ss.android.ugc.aweme.newfollow.p2002ui;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.g */
public final class C37924g {

    /* renamed from: a */
    public final boolean f96574a;

    /* renamed from: b */
    public final int f96575b;

    /* renamed from: c */
    public final int f96576c;

    /* renamed from: d */
    public final boolean f96577d;

    /* renamed from: e */
    public final boolean f96578e;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37924g) {
                C37924g gVar = (C37924g) obj;
                if (this.f96574a == gVar.f96574a) {
                    if (this.f96575b == gVar.f96575b) {
                        if (this.f96576c == gVar.f96576c) {
                            if (this.f96577d == gVar.f96577d) {
                                if (this.f96578e == gVar.f96578e) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f96574a;
        int i = 1;
        if (z) {
            z = true;
        }
        int hashCode = (((((z ? 1 : 0) * true) + Integer.hashCode(this.f96575b)) * 31) + Integer.hashCode(this.f96576c)) * 31;
        boolean z2 = this.f96577d;
        if (z2) {
            z2 = true;
        }
        int i2 = (hashCode + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.f96578e;
        if (!z3) {
            i = z3;
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollData(show=");
        sb.append(this.f96574a);
        sb.append(", dy=");
        sb.append(this.f96575b);
        sb.append(", offset=");
        sb.append(this.f96576c);
        sb.append(", inProgress=");
        sb.append(this.f96577d);
        sb.append(", isDragging=");
        sb.append(this.f96578e);
        sb.append(")");
        return sb.toString();
    }

    public C37924g(boolean z, int i, int i2, boolean z2, boolean z3) {
        this.f96574a = z;
        this.f96575b = i;
        this.f96576c = i2;
        this.f96577d = z2;
        this.f96578e = z3;
    }
}
