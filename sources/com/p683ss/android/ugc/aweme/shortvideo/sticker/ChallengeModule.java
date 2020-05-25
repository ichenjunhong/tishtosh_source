package com.p683ss.android.ugc.aweme.shortvideo.sticker;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ChallengeModule */
public final class ChallengeModule {

    /* renamed from: a */
    public final ChallengeDetailApi f112640a = ((ChallengeDetailApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(ChallengeDetailApi.class));

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ChallengeModule$ChallengeDetailApi */
    public interface ChallengeDetailApi {
        @C53075f(mo110603a = "/aweme/v1/challenge/detail/")
        C17832m<ChallengeDetail> fetchChallengeDetail(@C53089t(mo110619a = "ch_id") String str, @C53089t(mo110619a = "hashtag_name") String str2, @C53089t(mo110619a = "query_type") int i, @C53089t(mo110619a = "click_reason") int i2);

        @C53075f(mo110603a = "/aweme/v1/commerce/challenge/detail/")
        C17832m<ChallengeDetail> fetchCommerceChallengeDetail(@C53089t(mo110619a = "ch_id") String str, @C53089t(mo110619a = "hashtag_name") String str2, @C53089t(mo110619a = "query_type") int i, @C53089t(mo110619a = "click_reason") int i2);
    }
}
