package com.p683ss.android.ugc.aweme.shortvideo.duet;

import com.google.gson.p1076a.C17952c;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.e */
public final class C43245e {
    @C17952c(mo34828a = "name")

    /* renamed from: a */
    public final String f109355a;
    @C17952c(mo34828a = "change_direction_mode")

    /* renamed from: b */
    public final int f109356b;
    @C17952c(mo34828a = "direction_status")

    /* renamed from: c */
    public final List<String> f109357c;
    @C17952c(mo34828a = "safety_status")

    /* renamed from: d */
    public final List<String> f109358d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C43245e) {
                C43245e eVar = (C43245e) obj;
                if (C52711k.m112239a((Object) this.f109355a, (Object) eVar.f109355a)) {
                    if (!(this.f109356b == eVar.f109356b) || !C52711k.m112239a((Object) this.f109357c, (Object) eVar.f109357c) || !C52711k.m112239a((Object) this.f109358d, (Object) eVar.f109358d)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f109355a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f109356b) * 31;
        List<String> list = this.f109357c;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.f109358d;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DuetLayoutBean(name=");
        sb.append(this.f109355a);
        sb.append(", changeDirection=");
        sb.append(this.f109356b);
        sb.append(", directionStatus=");
        sb.append(this.f109357c);
        sb.append(", safetyStatus=");
        sb.append(this.f109358d);
        sb.append(")");
        return sb.toString();
    }
}
