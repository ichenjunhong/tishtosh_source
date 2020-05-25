package com.p683ss.android.ugc.aweme.commercialize.p1553d;

/* renamed from: com.ss.android.ugc.aweme.commercialize.d.m */
public final class C25724m {

    /* renamed from: a */
    public final boolean f68037a;

    /* renamed from: b */
    public final long f68038b;

    /* renamed from: c */
    public final long f68039c;

    public final int hashCode() {
        boolean z = this.f68037a;
        if (z) {
            z = true;
        }
        return ((((z ? 1 : 0) * true) + Long.hashCode(this.f68038b)) * 31) + Long.hashCode(this.f68039c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoPlayLoopData(enable=");
        sb.append(this.f68037a);
        sb.append(", startMilliSeconds=");
        sb.append(this.f68038b);
        sb.append(", endMilliSeconds=");
        sb.append(this.f68039c);
        sb.append(")");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C25724m)) {
            return false;
        }
        C25724m mVar = (C25724m) obj;
        if (mVar.f68037a == this.f68037a && mVar.f68038b == this.f68038b && mVar.f68039c == this.f68039c) {
            return true;
        }
        return false;
    }
}
