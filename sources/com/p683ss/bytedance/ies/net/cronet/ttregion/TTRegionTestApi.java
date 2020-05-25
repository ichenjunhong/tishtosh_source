package com.p683ss.bytedance.ies.net.cronet.ttregion;

import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p001a.C0013i;
import p2666g.p2672c.C53075f;

/* renamed from: com.ss.bytedance.ies.net.cronet.ttregion.TTRegionTestApi */
public final class TTRegionTestApi {

    /* renamed from: a */
    public static final RetrofitApi f127801a = ((RetrofitApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(RetrofitApi.class));

    /* renamed from: com.ss.bytedance.ies.net.cronet.ttregion.TTRegionTestApi$RetrofitApi */
    public interface RetrofitApi {
        @C53075f(mo110603a = "/aweme/v1/ttregion/test/")
        C0013i<BaseResponse> ttRegionTest();
    }
}
