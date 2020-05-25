package com.p683ss.android.ugc.aweme.profile.api;

import android.arch.lifecycle.C0198r;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.p1488ca.C24481a;
import com.p683ss.android.ugc.aweme.profile.model.NewUserCount;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p001a.C0011g;
import p001a.C0013i;
import p2666g.p2672c.C53075f;

/* renamed from: com.ss.android.ugc.aweme.profile.api.NewUserApiManager */
public final class NewUserApiManager {

    /* renamed from: a */
    private static NewUserApi f101557a = ((NewUserApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(NewUserApi.class));

    /* renamed from: com.ss.android.ugc.aweme.profile.api.NewUserApiManager$NewUserApi */
    interface NewUserApi {
        @C53075f(mo110603a = "/aweme/v2/new/recommend/user/count/")
        C0013i<NewUserCount> getNewUserCount();
    }

    /* renamed from: a */
    public static void m88500a(C0198r<C24481a<NewUserCount>> rVar) {
        f101557a.getNewUserCount().mo20a((C0011g<TResult, TContinuationResult>) new C39790c<TResult,TContinuationResult>(rVar), C0013i.f25b);
    }
}
