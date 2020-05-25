package com.p683ss.android.ugc.aweme.poi.api;

import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.poi.model.C39141y;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p001a.C0013i;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.poi.api.PoiCouponApi */
public final class PoiCouponApi {

    /* renamed from: a */
    public static final RealApi f99532a = ((RealApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(RealApi.class));

    /* renamed from: com.ss.android.ugc.aweme.poi.api.PoiCouponApi$RealApi */
    public interface RealApi {
        @C53075f(mo110603a = "/aweme/v2/coupon/join/activity")
        C0013i<C39141y> getJoinPoiActivity(@C53089t(mo110619a = "poi_id") String str, @C53089t(mo110619a = "activity_id") int i);
    }
}
