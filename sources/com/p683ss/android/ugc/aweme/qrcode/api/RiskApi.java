package com.p683ss.android.ugc.aweme.qrcode.api;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.qrcode.p2104b.C40942c;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.ExecutionException;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.qrcode.api.RiskApi */
public final class RiskApi {

    /* renamed from: a */
    static final IRetrofit f104161a = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b);

    /* renamed from: b */
    private static IRetrofitService f104162b = RetrofitService.createIRetrofitServicebyMonsterPlugin();

    /* renamed from: com.ss.android.ugc.aweme.qrcode.api.RiskApi$RealApi */
    interface RealApi {
        @C53075f(mo110603a = "/aweme/v2/risk/url/")
        C17832m<C40942c> getRiskUrlModel(@C53089t(mo110619a = "request_url") String str);
    }

    /* renamed from: a */
    public static C40942c m90527a(String str) throws Exception {
        try {
            return (C40942c) ((RealApi) f104161a.create(RealApi.class)).getRiskUrlModel(str).get();
        } catch (ExecutionException e) {
            throw f104162b.propagateCompatibleException(e);
        }
    }
}
