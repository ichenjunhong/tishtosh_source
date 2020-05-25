package com.p683ss.android.ugc.aweme.p1254a;

/* renamed from: com.ss.android.ugc.aweme.a.a */
public final class C20843a {

    /* renamed from: a */
    public final boolean f56794a;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20843a) {
                if (this.f56794a == ((C20843a) obj).f56794a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f56794a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SkyLightShownEvent(shown=");
        sb.append(this.f56794a);
        sb.append(")");
        return sb.toString();
    }

    public C20843a(boolean z) {
        this.f56794a = z;
    }
}
