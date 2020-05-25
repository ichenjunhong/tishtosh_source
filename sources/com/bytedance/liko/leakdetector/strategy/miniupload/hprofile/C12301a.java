package com.bytedance.liko.leakdetector.strategy.miniupload.hprofile;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.liko.leakdetector.strategy.miniupload.hprofile.a */
public final class C12301a {
    @C17952c(mo34828a = "event_type")

    /* renamed from: a */
    public final String f32427a;
    @C17952c(mo34828a = "timestamp")

    /* renamed from: b */
    public final long f32428b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C12301a) {
                C12301a aVar = (C12301a) obj;
                if (C52711k.m112239a((Object) this.f32427a, (Object) aVar.f32427a)) {
                    if (this.f32428b == aVar.f32428b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f32427a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        long j = this.f32428b;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataBean(eventType=");
        sb.append(this.f32427a);
        sb.append(", timestamp=");
        sb.append(this.f32428b);
        sb.append(")");
        return sb.toString();
    }

    public C12301a(String str, long j) {
        C52711k.m112240b(str, "eventType");
        this.f32427a = str;
        this.f32428b = j;
    }
}
