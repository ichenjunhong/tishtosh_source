package com.p683ss.android.ugc.aweme.share;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p683ss.android.ugc.aweme.share.model.ShortenModel;
import p064c.p065a.C2193n;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.share.ShortenUrlApi */
public final class ShortenUrlApi {

    /* renamed from: a */
    private static final RetrofitApi f106108a = ((RetrofitApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().create("https://api.tiktokv.com/").mo19930a(RetrofitApi.class));

    /* renamed from: com.ss.android.ugc.aweme.share.ShortenUrlApi$RetrofitApi */
    interface RetrofitApi {
        @C53075f(mo110603a = "/shorten/")
        C2193n<ShortenModel> fetchShortenUrl(@C53089t(mo110619a = "target") String str, @C53089t(mo110619a = "belong") String str2, @C53089t(mo110619a = "persist") String str3);
    }

    /* renamed from: a */
    public static C2193n<ShortenModel> m91873a(String str, String str2) {
        return f106108a.fetchShortenUrl(str, str2, "1");
    }
}
