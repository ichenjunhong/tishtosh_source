package com.p683ss.android.ugc.aweme.profile;

/* renamed from: com.ss.android.ugc.aweme.profile.ac */
public final class C39717ac {

    /* renamed from: a */
    public final boolean f101355a;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39717ac) {
                if (this.f101355a == ((C39717ac) obj).f101355a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f101355a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SafeInfoNoticeEvent(hasPrior=");
        sb.append(this.f101355a);
        sb.append(")");
        return sb.toString();
    }

    public C39717ac(boolean z) {
        this.f101355a = z;
    }
}
