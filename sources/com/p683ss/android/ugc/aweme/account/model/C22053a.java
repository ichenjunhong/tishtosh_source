package com.p683ss.android.ugc.aweme.account.model;

/* renamed from: com.ss.android.ugc.aweme.account.model.a */
public final class C22053a {

    /* renamed from: a */
    public final boolean f59553a = false;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22053a) {
                if (this.f59553a == ((C22053a) obj).f59553a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f59553a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountBackOpe(isFinish=");
        sb.append(this.f59553a);
        sb.append(")");
        return sb.toString();
    }

    public C22053a(boolean z) {
    }
}
