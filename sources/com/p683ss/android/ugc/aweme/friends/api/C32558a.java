package com.p683ss.android.ugc.aweme.friends.api;

import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.services.RetrofitService;

/* renamed from: com.ss.android.ugc.aweme.friends.api.a */
public abstract /* synthetic */ class C32558a {
    /* renamed from: a */
    public static FriendApi m75336a() {
        return (FriendApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(FriendApi.class);
    }
}
