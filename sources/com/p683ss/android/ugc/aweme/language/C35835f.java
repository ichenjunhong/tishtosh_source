package com.p683ss.android.ugc.aweme.language;

import com.google.gson.p1076a.C17952c;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.language.f */
public final class C35835f {
    @C17952c(mo34828a = "sub_region")

    /* renamed from: a */
    public final List<C35830a> f92008a;
    @C17952c(mo34828a = "name")

    /* renamed from: b */
    public final String f92009b;
    @C17952c(mo34828a = "geoname_id")

    /* renamed from: c */
    public final int f92010c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C35835f) {
                C35835f fVar = (C35835f) obj;
                if (C52711k.m112239a((Object) this.f92008a, (Object) fVar.f92008a) && C52711k.m112239a((Object) this.f92009b, (Object) fVar.f92009b)) {
                    if (this.f92010c == fVar.f92010c) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List<C35830a> list = this.f92008a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f92009b;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode + i) * 31) + this.f92010c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProvinceData(cityData=");
        sb.append(this.f92008a);
        sb.append(", name=");
        sb.append(this.f92009b);
        sb.append(", id=");
        sb.append(this.f92010c);
        sb.append(")");
        return sb.toString();
    }
}
