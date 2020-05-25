package com.p683ss.android.ugc.aweme.flow.manager.impl;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.flow.manager.impl.UpdateMobilePassCodeApiManager */
public final class UpdateMobilePassCodeApiManager {

    /* renamed from: a */
    public static final String f82892a = Api.f61282b;

    /* renamed from: b */
    public static UpdateMobilePassCodeApi f82893b = ((UpdateMobilePassCodeApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(f82892a).create(UpdateMobilePassCodeApi.class));

    /* renamed from: com.ss.android.ugc.aweme.flow.manager.impl.UpdateMobilePassCodeApiManager$UpdateMobilePassCodeApi */
    interface UpdateMobilePassCodeApi {
        @C53075f(mo110603a = "aweme/v1/carrier_flow/mobile/pcid/upload/")
        C17832m<BaseResponse> upload(@C53089t(mo110619a = "mobile_pcid") String str);
    }
}
