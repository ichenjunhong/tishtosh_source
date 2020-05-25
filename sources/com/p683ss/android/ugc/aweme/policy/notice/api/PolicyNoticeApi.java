package com.p683ss.android.ugc.aweme.policy.notice.api;

import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12724z;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.policy.notice.api.PolicyNoticeApi */
public final class PolicyNoticeApi {

    /* renamed from: a */
    public static final API f101056a;

    /* renamed from: b */
    public static final C39505a f101057b = new C39505a(null);

    /* renamed from: com.ss.android.ugc.aweme.policy.notice.api.PolicyNoticeApi$API */
    public interface API {
        @C12706h(mo23876a = "/aweme/v1/policy/notice/")
        C0013i<C39508c> getPolicyNotice();

        @C12718t(mo23886a = "/aweme/v1/policy/notice/approve/")
        C0013i<BaseResponse> policyNoticeApprove(@C12724z(mo23894a = "business") String str, @C12724z(mo23894a = "policy_version") String str2, @C12724z(mo23894a = "style") String str3, @C12724z(mo23894a = "extra") String str4, @C12724z(mo23894a = "operation") Integer num);
    }

    /* renamed from: com.ss.android.ugc.aweme.policy.notice.api.PolicyNoticeApi$a */
    public static final class C39505a {
        private C39505a() {
        }

        public /* synthetic */ C39505a(C52707g gVar) {
            this();
        }
    }

    static {
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(API.class);
        C52711k.m112236a(create, "ServiceManager.get().get…ate<API>(API::class.java)");
        f101056a = (API) create;
    }
}
