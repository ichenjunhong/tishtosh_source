package com.p683ss.android.ugc.aweme.zhima;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.setting.model.CommonResponse;
import java.util.concurrent.ExecutionException;
import p2666g.p2672c.C53084o;

/* renamed from: com.ss.android.ugc.aweme.zhima.VerifyApi */
public final class VerifyApi {

    /* renamed from: a */
    static final IRetrofit f121785a = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b);

    /* renamed from: b */
    private static IRetrofitService f121786b = RetrofitService.createIRetrofitServicebyMonsterPlugin();

    /* renamed from: com.ss.android.ugc.aweme.zhima.VerifyApi$RealApi */
    interface RealApi {
        @C53084o(mo110612a = "/aweme/v1/user/verify/manual/?reset=1")
        C17832m<CommonResponse> clearVerifyUser();
    }

    /* renamed from: a */
    public static CommonResponse m104777a() throws Exception {
        try {
            return (CommonResponse) ((RealApi) f121785a.create(RealApi.class)).clearVerifyUser().get();
        } catch (ExecutionException e) {
            throw f121786b.propagateCompatibleException(e);
        }
    }
}
