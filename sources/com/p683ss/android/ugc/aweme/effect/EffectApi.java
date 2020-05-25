package com.p683ss.android.ugc.aweme.effect;

import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.feed.model.NewStickerItemList;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p001a.C0013i;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.effect.EffectApi */
public final class EffectApi {

    /* renamed from: a */
    private static API f76220a = ((API) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(API.class));

    /* renamed from: com.ss.android.ugc.aweme.effect.EffectApi$API */
    public interface API {
        @C53075f(mo110603a = "/aweme/v1/original/effect/list/")
        C0013i<NewStickerItemList> getEffectList(@C53089t(mo110619a = "user_id") String str, @C53089t(mo110619a = "sec_user_id") String str2, @C53089t(mo110619a = "cursor") long j, @C53089t(mo110619a = "count") int i);
    }
}
