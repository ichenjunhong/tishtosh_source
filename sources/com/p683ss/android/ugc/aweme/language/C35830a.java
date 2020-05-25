package com.p683ss.android.ugc.aweme.language;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.language.a */
public final class C35830a {
    @C17952c(mo34828a = "name")

    /* renamed from: a */
    public final String f92005a;
    @C17952c(mo34828a = "geoname_id")

    /* renamed from: b */
    public final int f92006b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C35830a) {
                C35830a aVar = (C35830a) obj;
                if (C52711k.m112239a((Object) this.f92005a, (Object) aVar.f92005a)) {
                    if (this.f92006b == aVar.f92006b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f92005a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f92006b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CityData(name=");
        sb.append(this.f92005a);
        sb.append(", id=");
        sb.append(this.f92006b);
        sb.append(")");
        return sb.toString();
    }
}
