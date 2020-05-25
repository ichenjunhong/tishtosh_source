package com.p683ss.android.ugc.aweme.poi.api;

import p001a.C0013i;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.poi.api.PoiRankApi */
public final class PoiRankApi {

    /* renamed from: com.ss.android.ugc.aweme.poi.api.PoiRankApi$PoiRankRetrofitApi */
    public interface PoiRankRetrofitApi {
        @C53075f(mo110603a = "/aweme/v1/poi/rank/filter/")
        C0013i<Object> getPoiRankFilter(@C53089t(mo110619a = "count") int i, @C53089t(mo110619a = "cursor") long j, @C53089t(mo110619a = "longitude") String str, @C53089t(mo110619a = "latitude") String str2, @C53089t(mo110619a = "business_area_option_type") String str3, @C53089t(mo110619a = "class_option_type") String str4, @C53089t(mo110619a = "city_code") String str5, @C53089t(mo110619a = "poi_class_code") int i2, @C53089t(mo110619a = "district_code") String str6, @C53089t(mo110619a = "backend_type_code") String str7);

        @C53075f(mo110603a = "/aweme/v1/poi/rank/aweme/")
        C0013i<Object> getPoiRankList(@C53089t(mo110619a = "longitude") String str, @C53089t(mo110619a = "latitude") String str2, @C53089t(mo110619a = "city_code") String str3, @C53089t(mo110619a = "backend_type_codes") String str4);
    }
}
