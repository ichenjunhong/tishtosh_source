package com.p683ss.android.ugc.aweme.discover.alading;

import com.google.gson.p1076a.C17952c;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.alading.m */
public final class C28048m {
    @C17952c(mo34828a = "sentence")

    /* renamed from: a */
    public final String f73679a;
    @C17952c(mo34828a = "hot_value")

    /* renamed from: b */
    public final long f73680b;
    @C17952c(mo34828a = "rank")

    /* renamed from: c */
    public final int f73681c;
    @C17952c(mo34828a = "type")

    /* renamed from: d */
    public final int f73682d;
    @C17952c(mo34828a = "doc_id")

    /* renamed from: e */
    public final String f73683e;
    @C17952c(mo34828a = "is_commerce")

    /* renamed from: f */
    public final boolean f73684f;

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchSpotInfo(sentence=");
        sb.append(this.f73679a);
        sb.append(", hotValue=");
        sb.append(this.f73680b);
        sb.append(", rank=");
        sb.append(this.f73681c);
        sb.append(", type=");
        sb.append(this.f73682d);
        sb.append(", docId=");
        sb.append(this.f73683e);
        sb.append(", isAd=");
        sb.append(this.f73684f);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.f73679a.hashCode() * 31) + String.valueOf(this.f73680b).hashCode()) * 31) + this.f73681c) * 31) + Boolean.valueOf(this.f73684f).hashCode();
    }

    public final boolean equals(Object obj) {
        Class cls;
        if (this == obj) {
            return true;
        }
        Class cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C52711k.m112239a((Object) cls2, (Object) cls)) {
            return false;
        }
        if (obj != null) {
            C28048m mVar = (C28048m) obj;
            if (!(!C52711k.m112239a((Object) this.f73679a, (Object) mVar.f73679a)) && this.f73680b == mVar.f73680b && this.f73681c == mVar.f73681c && this.f73684f == mVar.f73684f) {
                return true;
            }
            return false;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.alading.SearchSpotInfo");
    }
}
