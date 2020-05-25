package com.p683ss.android.ugc.aweme.poi.rate.api;

import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p064c.p065a.C2201v;
import p2628d.p2639f.p2641b.C52711k;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.poi.rate.api.PoiSpuRateAwemeApi */
public interface PoiSpuRateAwemeApi {

    /* renamed from: a */
    public static final C39222a f100152a = C39222a.f100153a;

    /* renamed from: com.ss.android.ugc.aweme.poi.rate.api.PoiSpuRateAwemeApi$a */
    public static final class C39222a {

        /* renamed from: a */
        static final /* synthetic */ C39222a f100153a = new C39222a();

        private C39222a() {
        }

        /* renamed from: a */
        public static PoiSpuRateAwemeApi m87162a() {
            Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(PoiSpuRateAwemeApi.class);
            C52711k.m112236a(create, "ServiceManager.get().get…RateAwemeApi::class.java)");
            return (PoiSpuRateAwemeApi) create;
        }
    }

    @C53075f(mo110603a = "/aweme/v1/poi/rate/aweme/")
    C2201v<C39223a> requestPoiSpuRateAweme(@C53089t(mo110619a = "spu_id") String str, @C53089t(mo110619a = "cursor") long j, @C53089t(mo110619a = "count") int i, @C53089t(mo110619a = "poi_id") String str2, @C53089t(mo110619a = "item_has_more") int i2, @C53089t(mo110619a = "rate_aweme_type") int i3);
}
