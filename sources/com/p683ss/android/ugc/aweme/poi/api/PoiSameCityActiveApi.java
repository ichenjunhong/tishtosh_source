package com.p683ss.android.ugc.aweme.poi.api;

import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.poi.p2058a.C38967k;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p001a.C0013i;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.poi.api.PoiSameCityActiveApi */
public final class PoiSameCityActiveApi {

    /* renamed from: a */
    private static final PoiSameCityActiveRetrofitApi f99533a = ((PoiSameCityActiveRetrofitApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(PoiSameCityActiveRetrofitApi.class));

    /* renamed from: com.ss.android.ugc.aweme.poi.api.PoiSameCityActiveApi$PoiSameCityActiveRetrofitApi */
    public interface PoiSameCityActiveRetrofitApi {
        @C53075f(mo110603a = "/aweme/v1/poi/samecity/active/")
        C0013i<C38967k> getPoiSameCiteActive(@C53089t(mo110619a = "longitude") String str, @C53089t(mo110619a = "latitude") String str2, @C53089t(mo110619a = "location_permission") int i);
    }
}
