package com.p683ss.android.ugc.aweme.p2377ug.referral;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53084o;

/* renamed from: com.ss.android.ugc.aweme.ug.referral.ReferCommitApi */
public final class ReferCommitApi {

    /* renamed from: a */
    static IRetrofit f119763a = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b);

    /* renamed from: b */
    static IRetrofitService f119764b = RetrofitService.createIRetrofitServicebyMonsterPlugin();

    /* renamed from: com.ss.android.ugc.aweme.ug.referral.ReferCommitApi$RealApi */
    interface RealApi {
        @C53084o(mo110612a = "/aweme/v1/ug/user/referral/commit/")
        @C53074e
        C17832m<Object> referralCommit(@C53072c(mo110600a = "referral_code") String str);
    }
}
