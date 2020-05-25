package com.p683ss.android.ugc.aweme.update.api;

import com.bytedance.retrofit2.C12690b;
import com.google.gson.C18085o;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p2666g.p2672c.C53075f;

/* renamed from: com.ss.android.ugc.aweme.update.api.CheckUpdateApi */
public interface CheckUpdateApi {

    /* renamed from: a */
    public static final CheckUpdateApi f119890a = ((CheckUpdateApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(CheckUpdateApi.class));

    @C53075f(mo110603a = "/appbeta/check_version/check_beta")
    C12690b<C18085o> getI18nVersionUpdateInfo();

    @C53075f(mo110603a = "/check_version/v6/")
    C12690b<C18085o> getVersionUpdateInfo();
}
