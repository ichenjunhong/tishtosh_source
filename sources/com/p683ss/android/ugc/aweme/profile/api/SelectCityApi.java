package com.p683ss.android.ugc.aweme.profile.api;

import com.p683ss.android.ugc.aweme.profile.model.CityListBean;
import p001a.C0013i;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.profile.api.SelectCityApi */
public interface SelectCityApi {
    @C53075f(mo110603a = "/aweme/v1/hide/location/")
    C0013i<String> hideLocation(@C53089t(mo110619a = "hide_location") int i);

    @C53075f(mo110603a = "/api/2/article/city/")
    C0013i<CityListBean> queryCityList();
}
