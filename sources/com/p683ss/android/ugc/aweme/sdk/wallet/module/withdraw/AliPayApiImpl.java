package com.p683ss.android.ugc.aweme.sdk.wallet.module.withdraw;

import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.services.RetrofitService;

/* renamed from: com.ss.android.ugc.aweme.sdk.wallet.module.withdraw.AliPayApiImpl */
class AliPayApiImpl {
    private static AliPayApi aliPayApi;

    AliPayApiImpl() {
    }

    static {
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin();
        if (createIRetrofitServicebyMonsterPlugin != null) {
            aliPayApi = (AliPayApi) createIRetrofitServicebyMonsterPlugin.createNewRetrofit("https://aweme.snssdk.com/aweme/v1/").create(AliPayApi.class);
        }
    }

    static BaseResponse checkBindResult(int i, int i2, String str) throws Exception {
        return (BaseResponse) aliPayApi.checkBindResult(i, i2, str).get();
    }
}
