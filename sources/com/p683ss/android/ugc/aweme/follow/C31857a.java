package com.p683ss.android.ugc.aweme.follow;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.follow.a */
public final class C31857a {
    @C17952c(mo34828a = "index")

    /* renamed from: a */
    public final int f83232a;
    @C17952c(mo34828a = "msg")

    /* renamed from: b */
    public final String f83233b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C31857a) {
                C31857a aVar = (C31857a) obj;
                if (!(this.f83232a == aVar.f83232a) || !C52711k.m112239a((Object) this.f83233b, (Object) aVar.f83233b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f83232a * 31;
        String str = this.f83233b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LastViewData(index=");
        sb.append(this.f83232a);
        sb.append(", lastViewHint=");
        sb.append(this.f83233b);
        sb.append(")");
        return sb.toString();
    }
}
