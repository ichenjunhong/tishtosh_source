package com.p683ss.android.ugc.aweme.favorites.p1701a;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.favorites.a.c */
public final class C29660c {

    /* renamed from: d */
    public static final C29661a f77534d = new C29661a(null);
    @C17952c(mo34828a = "collect_type")

    /* renamed from: a */
    public final int f77535a;
    @C17952c(mo34828a = "poi_simple_info")

    /* renamed from: b */
    public final SimplePoiInfoStruct f77536b;
    @C17952c(mo34828a = "poi_spu_info")

    /* renamed from: c */
    public final C29663e f77537c;

    /* renamed from: com.ss.android.ugc.aweme.favorites.a.c$a */
    public static final class C29661a {
        private C29661a() {
        }

        public /* synthetic */ C29661a(C52707g gVar) {
            this();
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29660c) {
                C29660c cVar = (C29660c) obj;
                if (!(this.f77535a == cVar.f77535a) || !C52711k.m112239a((Object) this.f77536b, (Object) cVar.f77536b) || !C52711k.m112239a((Object) this.f77537c, (Object) cVar.f77537c)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f77535a * 31;
        SimplePoiInfoStruct simplePoiInfoStruct = this.f77536b;
        int i2 = 0;
        int hashCode = (i + (simplePoiInfoStruct != null ? simplePoiInfoStruct.hashCode() : 0)) * 31;
        C29663e eVar = this.f77537c;
        if (eVar != null) {
            i2 = eVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiCollectionStruct(collectType=");
        sb.append(this.f77535a);
        sb.append(", poiInfo=");
        sb.append(this.f77536b);
        sb.append(", spuInfoStruct=");
        sb.append(this.f77537c);
        sb.append(")");
        return sb.toString();
    }
}
