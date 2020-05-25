package com.p683ss.android.ugc.aweme.commercialize.star;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.commercialize.star.StarAtlasOrderApi */
public class StarAtlasOrderApi {

    /* renamed from: a */
    private static IStarAtlasOrderApi f69322a;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.star.StarAtlasOrderApi$IStarAtlasOrderApi */
    public interface IStarAtlasOrderApi {
        @C53075f(mo110603a = "/aweme/v1/commerce/star/atlas/orders/")
        C17832m<C26259c> checkStarAtlasOrder(@C53089t(mo110619a = "page") int i, @C53089t(mo110619a = "limit") int i2);
    }

    /* renamed from: a */
    public static IStarAtlasOrderApi m63623a() {
        if (f69322a == null) {
            synchronized (StarAtlasOrderApi.class) {
                if (f69322a == null) {
                    f69322a = (IStarAtlasOrderApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(IStarAtlasOrderApi.class);
                }
            }
        }
        return f69322a;
    }
}
