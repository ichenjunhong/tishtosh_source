package com.p683ss.android.ugc.aweme.discover.api;

import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.discover.model.suggest.SuggestChallengeResponse;
import com.p683ss.android.ugc.aweme.discover.model.suggest.SuggestMusicResponse;
import com.p683ss.android.ugc.aweme.discover.model.suggest.SuggestUserResponse;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p001a.C0013i;
import p2666g.p2672c.C53075f;

/* renamed from: com.ss.android.ugc.aweme.discover.api.SuggestApi */
public final class SuggestApi {

    /* renamed from: a */
    public static final SuggestApi f73727a = new SuggestApi();

    /* renamed from: b */
    private static final String f73728b = Api.f61282b;

    /* renamed from: c */
    private static final IRetrofit f73729c = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(f73728b);

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SuggestApi$RealApi */
    public interface RealApi {
        @C53075f(mo110603a = "/aweme/v1/challenge/suggested/")
        C0013i<SuggestChallengeResponse> getSuggestChallenges();

        @C53075f(mo110603a = "/aweme/v1/music/suggested/")
        C0013i<SuggestMusicResponse> getSuggestMusics();

        @C53075f(mo110603a = "/aweme/v1/user/suggested/")
        C0013i<SuggestUserResponse> getSuggestUsers();
    }

    private SuggestApi() {
    }
}
