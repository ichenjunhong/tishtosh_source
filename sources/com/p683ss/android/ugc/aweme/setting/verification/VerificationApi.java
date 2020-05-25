package com.p683ss.android.ugc.aweme.setting.verification;

import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p064c.p065a.C2201v;
import p2628d.p2639f.p2641b.C52711k;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.setting.verification.VerificationApi */
public interface VerificationApi {

    /* renamed from: a */
    public static final C41902a f106053a = C41902a.f106054a;

    /* renamed from: com.ss.android.ugc.aweme.setting.verification.VerificationApi$a */
    public static final class C41902a {

        /* renamed from: a */
        static final /* synthetic */ C41902a f106054a = new C41902a();

        /* renamed from: b */
        private static final IRetrofitService f106055b = RetrofitService.createIRetrofitServicebyMonsterPlugin();

        private C41902a() {
        }

        /* renamed from: a */
        public static VerificationApi m91843a() {
            Object create = f106055b.createNewRetrofit(C41903a.f106056a).create(VerificationApi.class);
            C52711k.m112236a(create, "retrofitService.createNe…ificationApi::class.java)");
            return (VerificationApi) create;
        }
    }

    @C53075f(mo110603a = "/aweme/v1/mtcert/status/")
    C2201v<VerificationResponse> requestVerification(@C53089t(mo110619a = "sec_uid") String str);
}
