package com.p683ss.android.ugc.aweme.friends.api;

import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.services.RetrofitService;

/* renamed from: com.ss.android.ugc.aweme.friends.api.b */
public abstract /* synthetic */ class C32559b {
    /* renamed from: a */
    public static RecommendApi m75337a() {
        return (RecommendApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(RecommendApi.class);
    }
}
