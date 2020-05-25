package com.p683ss.android.ugc.aweme.journey;

import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.services.RetrofitService;

/* renamed from: com.ss.android.ugc.aweme.journey.j */
public final class C35764j {

    /* renamed from: a */
    public static final C35764j f91855a = new C35764j();

    /* renamed from: b */
    private static final JourneyApi f91856b = ((JourneyApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(JourneyApi.class));

    private C35764j() {
    }

    /* renamed from: a */
    public static JourneyApi m80900a() {
        return f91856b;
    }
}
