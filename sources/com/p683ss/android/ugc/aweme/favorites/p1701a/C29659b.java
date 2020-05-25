package com.p683ss.android.ugc.aweme.favorites.p1701a;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.favorites.a.b */
public final class C29659b extends BaseResponse {
    @C17952c(mo34828a = "poi_collect_list")

    /* renamed from: a */
    public List<C29660c> f77530a;
    @C17952c(mo34828a = "nearby_poi_collect_list")

    /* renamed from: b */
    public List<C29660c> f77531b;
    @C17952c(mo34828a = "cursor")

    /* renamed from: c */
    public int f77532c;
    @C17952c(mo34828a = "has_more")

    /* renamed from: d */
    public boolean f77533d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29659b) {
                C29659b bVar = (C29659b) obj;
                if (C52711k.m112239a((Object) this.f77530a, (Object) bVar.f77530a) && C52711k.m112239a((Object) this.f77531b, (Object) bVar.f77531b)) {
                    if (this.f77532c == bVar.f77532c) {
                        if (this.f77533d == bVar.f77533d) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List<C29660c> list = this.f77530a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<C29660c> list2 = this.f77531b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        int i2 = (((hashCode + i) * 31) + this.f77532c) * 31;
        boolean z = this.f77533d;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiCollectionList(items=");
        sb.append(this.f77530a);
        sb.append(", nearItems=");
        sb.append(this.f77531b);
        sb.append(", cursor=");
        sb.append(this.f77532c);
        sb.append(", hasMore=");
        sb.append(this.f77533d);
        sb.append(")");
        return sb.toString();
    }
}
