package com.p683ss.android.ugc.aweme.mix;

import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p064c.p065a.C2201v;
import p2628d.p2639f.p2641b.C52711k;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.mix.MixDetailApi */
public interface MixDetailApi {

    /* renamed from: a */
    public static final C36989a f94483a = C36989a.f94484a;

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailApi$a */
    public static final class C36989a {

        /* renamed from: a */
        static final /* synthetic */ C36989a f94484a = new C36989a();

        private C36989a() {
        }

        /* renamed from: a */
        public static MixDetailApi m83212a() {
            Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(MixDetailApi.class);
            C52711k.m112236a(create, "ServiceManager.get().get…MixDetailApi::class.java)");
            return (MixDetailApi) create;
        }
    }

    @C53075f(mo110603a = "/aweme/v1/mix/detail/")
    C2201v<MixInfo> getMixInfo(@C53089t(mo110619a = "mix_id") String str);

    @C53075f(mo110603a = "/aweme/v1/mix/aweme/")
    C2201v<MixList> getMixListAweme(@C53089t(mo110619a = "mix_id") String str, @C53089t(mo110619a = "cursor") long j, @C53089t(mo110619a = "count") int i, @C53089t(mo110619a = "pull_type") int i2);
}
