package com.p683ss.android.ugc.aweme.poi.model.p2062a;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.model.a.c */
public final class C39089c {
    @C17952c(mo34828a = "tag_name")

    /* renamed from: a */
    public final String f99689a;
    @C17952c(mo34828a = "tag_code")

    /* renamed from: b */
    public final long f99690b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39089c) {
                C39089c cVar = (C39089c) obj;
                if (C52711k.m112239a((Object) this.f99689a, (Object) cVar.f99689a)) {
                    if (this.f99690b == cVar.f99690b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f99689a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        long j = this.f99690b;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiBannerTagStruct(tagName=");
        sb.append(this.f99689a);
        sb.append(", tagCode=");
        sb.append(this.f99690b);
        sb.append(")");
        return sb.toString();
    }
}
