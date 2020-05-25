package com.p683ss.android.ugc.aweme.policy;

import com.bytedance.retrofit2.p831b.C12704f;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12718t;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.Map;
import p064c.p065a.C2201v;

/* renamed from: com.ss.android.ugc.aweme.policy.PolicyApi */
public final class PolicyApi {

    /* renamed from: a */
    static final PolicyService f101040a = ((PolicyService) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(PolicyService.class));

    /* renamed from: com.ss.android.ugc.aweme.policy.PolicyApi$PolicyService */
    public interface PolicyService {
        @C12718t(mo23886a = "/aweme/v1/accept-private-policy/")
        C2201v<BaseResponse> acceptPrivacyPolicy();

        @C12706h(mo23876a = "/aweme/v1/policy/")
        C17832m<Policy> checkPolicyVersion();

        @C12718t(mo23886a = "/aweme/v1/policy/")
        @C12705g
        C17832m<Policy> checkPolicyVersion(@C12704f Map<String, String> map);
    }
}
