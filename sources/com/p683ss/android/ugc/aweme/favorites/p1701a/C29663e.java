package com.p683ss.android.ugc.aweme.favorites.p1701a;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.p683ss.android.ugc.aweme.poi.model.C39110ap;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.favorites.a.e */
public final class C29663e {

    /* renamed from: l */
    public static final C29664a f77538l = new C29664a(null);
    @C17952c(mo34828a = "status")

    /* renamed from: a */
    public final int f77539a;
    @C17952c(mo34828a = "url")

    /* renamed from: b */
    public final String f77540b;
    @C17952c(mo34828a = "spu_id")

    /* renamed from: c */
    public final String f77541c;
    @C17952c(mo34828a = "supplier_id")

    /* renamed from: d */
    public final String f77542d;
    @C17952c(mo34828a = "name")

    /* renamed from: e */
    public final String f77543e;
    @C17952c(mo34828a = "status_description")

    /* renamed from: f */
    public final String f77544f;
    @C17952c(mo34828a = "poi_id")

    /* renamed from: g */
    public final String f77545g;
    @C17952c(mo34828a = "poi_name")

    /* renamed from: h */
    public final String f77546h;
    @C17952c(mo34828a = "poi_simple_info")

    /* renamed from: i */
    public final SimplePoiInfoStruct f77547i;
    @C17952c(mo34828a = "image_urls")

    /* renamed from: j */
    public final List<UrlModel> f77548j;
    @C17952c(mo34828a = "icon_service_type_list")

    /* renamed from: k */
    public final List<C39110ap> f77549k;

    /* renamed from: com.ss.android.ugc.aweme.favorites.a.e$a */
    public static final class C29664a {
        private C29664a() {
        }

        public /* synthetic */ C29664a(C52707g gVar) {
            this();
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29663e) {
                C29663e eVar = (C29663e) obj;
                if (!(this.f77539a == eVar.f77539a) || !C52711k.m112239a((Object) this.f77540b, (Object) eVar.f77540b) || !C52711k.m112239a((Object) this.f77541c, (Object) eVar.f77541c) || !C52711k.m112239a((Object) this.f77542d, (Object) eVar.f77542d) || !C52711k.m112239a((Object) this.f77543e, (Object) eVar.f77543e) || !C52711k.m112239a((Object) this.f77544f, (Object) eVar.f77544f) || !C52711k.m112239a((Object) this.f77545g, (Object) eVar.f77545g) || !C52711k.m112239a((Object) this.f77546h, (Object) eVar.f77546h) || !C52711k.m112239a((Object) this.f77547i, (Object) eVar.f77547i) || !C52711k.m112239a((Object) this.f77548j, (Object) eVar.f77548j) || !C52711k.m112239a((Object) this.f77549k, (Object) eVar.f77549k)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f77539a * 31;
        String str = this.f77540b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f77541c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f77542d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f77543e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f77544f;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f77545g;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f77546h;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        SimplePoiInfoStruct simplePoiInfoStruct = this.f77547i;
        int hashCode8 = (hashCode7 + (simplePoiInfoStruct != null ? simplePoiInfoStruct.hashCode() : 0)) * 31;
        List<UrlModel> list = this.f77548j;
        int hashCode9 = (hashCode8 + (list != null ? list.hashCode() : 0)) * 31;
        List<C39110ap> list2 = this.f77549k;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode9 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiSpuSimpleStruct(status=");
        sb.append(this.f77539a);
        sb.append(", url=");
        sb.append(this.f77540b);
        sb.append(", spuId=");
        sb.append(this.f77541c);
        sb.append(", supplierId=");
        sb.append(this.f77542d);
        sb.append(", name=");
        sb.append(this.f77543e);
        sb.append(", statusDesc=");
        sb.append(this.f77544f);
        sb.append(", poiId=");
        sb.append(this.f77545g);
        sb.append(", poiName=");
        sb.append(this.f77546h);
        sb.append(", poiSimpleInfo=");
        sb.append(this.f77547i);
        sb.append(", imageUrls=");
        sb.append(this.f77548j);
        sb.append(", poiServiceFlags=");
        sb.append(this.f77549k);
        sb.append(")");
        return sb.toString();
    }
}
