package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.LivePushResponse;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.ad */
public final class C35188ad {

    /* renamed from: a */
    private static LiveApi f90473a;

    static {
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin();
        if (createIRetrofitServicebyMonsterPlugin != null) {
            f90473a = (LiveApi) createIRetrofitServicebyMonsterPlugin.createNewRetrofit(C35268h.f90602c).create(LiveApi.class);
        }
    }

    /* renamed from: a */
    public static void m79439a(int i, C0011g<LivePushResponse, Void> gVar) {
        f90473a.fetchRecommendAnchor(i).mo20a(gVar, C0013i.f25b);
    }
}
