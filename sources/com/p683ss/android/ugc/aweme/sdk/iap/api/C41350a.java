package com.p683ss.android.ugc.aweme.sdk.iap.api;

import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.sdk.C41332b;
import com.p683ss.android.ugc.aweme.sdk.DefaultWalletMainProxy;
import com.p683ss.android.ugc.aweme.sdk.iap.model.request.IapPayBody;
import com.p683ss.android.ugc.aweme.sdk.iap.model.response.PayOrderResultResponse;
import com.p683ss.android.ugc.aweme.services.RetrofitService;

/* renamed from: com.ss.android.ugc.aweme.sdk.iap.api.a */
public final class C41350a {

    /* renamed from: a */
    private static IapApi f104849a;

    /* renamed from: a */
    public static IapApi m91125a() {
        if (f104849a != null) {
            return f104849a;
        }
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin();
        if (createIRetrofitServicebyMonsterPlugin != null) {
            f104849a = (IapApi) createIRetrofitServicebyMonsterPlugin.createNewRetrofit(C41332b.m91102a(DefaultWalletMainProxy.provideWalletProxy_Monster().getHost())).create(IapApi.class);
        }
        return f104849a;
    }

    /* renamed from: a */
    public static PayOrderResultResponse m91126a(String str) throws Exception {
        return (PayOrderResultResponse) m91125a().checkOrderResult(str).get();
    }

    /* renamed from: a */
    public static BaseResponse m91124a(String str, IapPayBody iapPayBody) throws Exception {
        return (BaseResponse) m91125a().verifyOrder(str, new C17971f().mo34889b(iapPayBody)).get();
    }
}
