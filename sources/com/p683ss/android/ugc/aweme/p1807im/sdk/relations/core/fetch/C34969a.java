package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch;

import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35263c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35268h;
import com.p683ss.android.ugc.aweme.services.RetrofitService;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.fetch.a */
public final class C34969a {

    /* renamed from: a */
    private static FamiliarApi f89982a;

    /* renamed from: a */
    public static FamiliarApi m79101a() {
        return f89982a;
    }

    static {
        C35263c.m79721a(C35268h.f90601b);
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin();
        if (createIRetrofitServicebyMonsterPlugin != null) {
            f89982a = (FamiliarApi) createIRetrofitServicebyMonsterPlugin.createNewRetrofit(C35268h.f90601b).create(FamiliarApi.class);
        }
    }
}
