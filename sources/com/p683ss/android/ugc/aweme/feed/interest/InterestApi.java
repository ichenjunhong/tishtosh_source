package com.p683ss.android.ugc.aweme.feed.interest;

import com.bytedance.retrofit2.p831b.C12703e;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12718t;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.feed.interest.p1726b.C30411a;
import com.p683ss.android.ugc.aweme.feed.interest.p1726b.C30412b;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p064c.p065a.C2201v;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.interest.InterestApi */
public interface InterestApi {

    /* renamed from: a */
    public static final C30407a f79477a = C30407a.f79478a;

    /* renamed from: com.ss.android.ugc.aweme.feed.interest.InterestApi$a */
    public static final class C30407a {

        /* renamed from: a */
        static final /* synthetic */ C30407a f79478a = new C30407a();

        private C30407a() {
        }

        /* renamed from: a */
        public static InterestApi m71331a() {
            Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(InterestApi.class);
            C52711k.m112236a(create, "ServiceManager.get().get…(InterestApi::class.java)");
            return (InterestApi) create;
        }
    }

    @C12706h(mo23876a = "/aweme/v1/user/interest/list/")
    C2201v<C30412b> getInterestList();

    @C12718t(mo23886a = "/aweme/v1/user/commit/interest/")
    @C12705g
    C2201v<C30411a> submitInterestList(@C12703e(mo23873a = "interest_list") String str);
}
