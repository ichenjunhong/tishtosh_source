package com.p683ss.android.ugc.aweme.poi.api;

import com.p683ss.android.ugc.aweme.poi.model.C39105ak;
import com.p683ss.android.ugc.aweme.poi.model.C39126j;
import com.p683ss.android.ugc.aweme.poi.model.C39135s;
import com.p683ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p683ss.android.ugc.aweme.poi.rate.api.C39223a;
import p001a.C0013i;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.poi.api.PoiFeedApi */
public interface PoiFeedApi {
    @C53075f(mo110603a = "/aweme/v1/poi/aweme/")
    C0013i<C39126j> getAwemeList(@C53089t(mo110619a = "poi_id") String str, @C53089t(mo110619a = "aweme_type") int i, @C53089t(mo110619a = "count") int i2, @C53089t(mo110619a = "cursor") long j, @C53089t(mo110619a = "poi_class_code") long j2, @C53089t(mo110619a = "latitude") String str2, @C53089t(mo110619a = "longitude") String str3, @C53089t(mo110619a = "display_style") long j3, @C53089t(mo110619a = "aweme_id") String str4);

    @C53075f(mo110603a = "/aweme/v1/poi/aweme/")
    C0013i<C39126j> getAwemeList(@C53089t(mo110619a = "poi_id") String str, @C53089t(mo110619a = "aweme_type") int i, @C53089t(mo110619a = "count") int i2, @C53089t(mo110619a = "cursor") long j, @C53089t(mo110619a = "aweme_id") String str2, @C53089t(mo110619a = "aweme_tab_id") long j2);

    @C53075f(mo110603a = "/aweme/v1/poi/common/banner/")
    C0013i<C39135s> getPoiCommonBanner(@C53089t(mo110619a = "city_code") long j, @C53089t(mo110619a = "tab_type") int i, @C53089t(mo110619a = "poi_id") String str);

    @C53075f(mo110603a = "/aweme/v1/poi/detail/")
    C0013i<PoiDetail> getPoiDetail(@C53089t(mo110619a = "poi_id") String str, @C53089t(mo110619a = "longitude") String str2, @C53089t(mo110619a = "latitude") String str3, @C53089t(mo110619a = "extensions") String str4, @C53089t(mo110619a = "display_style") int i, @C53089t(mo110619a = "is_preview") int i2, @C53089t(mo110619a = "from_ads") int i3, @C53089t(mo110619a = "item_id") String str5, @C53089t(mo110619a = "scene_type") int i4);

    @C53075f(mo110603a = "/aweme/v1/poi/activity/scan/detail/")
    C0013i<C39105ak> getQRDetail(@C53089t(mo110619a = "poi_id") String str, @C53089t(mo110619a = "has_coupon_activity") boolean z, @C53089t(mo110619a = "challenge_id") String str2);

    @C53075f(mo110603a = "/aweme/v1/poi/rate/aweme/")
    C0013i<C39223a> getRateAwemeList(@C53089t(mo110619a = "poi_id") String str, @C53089t(mo110619a = "count") int i, @C53089t(mo110619a = "cursor") long j, @C53089t(mo110619a = "item_has_more") int i2);

    @C53075f(mo110603a = "/aweme/v1/poi/feedback/")
    C0013i<C39135s> poiFeedback(@C53089t(mo110619a = "poi_id") String str, @C53089t(mo110619a = "type") int i);
}
