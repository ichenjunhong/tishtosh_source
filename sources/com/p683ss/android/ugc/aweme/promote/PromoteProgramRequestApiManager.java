package com.p683ss.android.ugc.aweme.promote;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager */
public final class PromoteProgramRequestApiManager {

    /* renamed from: a */
    static final String f103787a = Api.f61282b;

    /* renamed from: b */
    static PromoteProgramRequestApi f103788b = ((PromoteProgramRequestApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(f103787a).create(PromoteProgramRequestApi.class));

    /* renamed from: com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager$PromoteProgramRequestApi */
    interface PromoteProgramRequestApi {
        @C53075f(mo110603a = "/aweme/v1/creatorlicense/cancel/")
        C17832m<BaseResponse> cancelPromoteProgram();

        @C53075f(mo110603a = "/aweme/v1/creatorlicense/confirm/")
        C17832m<PromoteProgramResponse> confirmPromoteProgram(@C53089t(mo110619a = "license_version") String str);
    }
}
