package com.p683ss.android.ugc.aweme.setting.serverpush.p2145a;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.a.b */
public final class C41685b {
    @C17952c(mo34828a = "is_show")

    /* renamed from: a */
    public final boolean f105456a;
    @C17952c(mo34828a = "h5_url")

    /* renamed from: b */
    public final String f105457b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C41685b) {
                C41685b bVar = (C41685b) obj;
                if (!(this.f105456a == bVar.f105456a) || !C52711k.m112239a((Object) this.f105457b, (Object) bVar.f105457b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f105456a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.f105457b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JoinBetaEntrance(show=");
        sb.append(this.f105456a);
        sb.append(", url=");
        sb.append(this.f105457b);
        sb.append(")");
        return sb.toString();
    }
}
