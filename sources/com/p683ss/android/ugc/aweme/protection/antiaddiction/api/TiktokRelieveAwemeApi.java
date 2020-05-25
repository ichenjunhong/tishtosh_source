package com.p683ss.android.ugc.aweme.protection.antiaddiction.api;

import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p064c.p065a.C2201v;
import p2628d.p2639f.p2641b.C52711k;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.protection.antiaddiction.api.TiktokRelieveAwemeApi */
public final class TiktokRelieveAwemeApi {

    /* renamed from: a */
    public static final RealApi f103992a;

    /* renamed from: b */
    public static final TiktokRelieveAwemeApi f103993b = new TiktokRelieveAwemeApi();

    /* renamed from: com.ss.android.ugc.aweme.protection.antiaddiction.api.TiktokRelieveAwemeApi$RealApi */
    public interface RealApi {
        @C53075f(mo110603a = "/aweme/v1/addiction/aweme/")
        C2201v<TiktokRelieveAweme> getTiktokRelieveAweme(@C53089t(mo110619a = "type") int i);
    }

    private TiktokRelieveAwemeApi() {
    }

    static {
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(RealApi.class);
        C52711k.m112236a(create, "ServiceManager.get()\n   …eate(RealApi::class.java)");
        f103992a = (RealApi) create;
    }
}
