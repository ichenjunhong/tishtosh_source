package com.p683ss.android.ugc.aweme.app.services;

import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12704f;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12718t;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.main.service.C36682d;
import com.p683ss.android.ugc.aweme.profile.UserResponse;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.app.services.ApiNetworkServiceForAccount */
public final class ApiNetworkServiceForAccount implements C36682d {

    /* renamed from: a */
    private AccountApi f61570a = ((AccountApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(AccountApi.class));

    /* renamed from: com.ss.android.ugc.aweme.app.services.ApiNetworkServiceForAccount$AccountApi */
    public interface AccountApi {
        @C12706h
        C12690b<String> doGet(@C12699af String str);

        @C12718t
        @C12705g
        C12690b<String> doPost(@C12699af String str, @C12704f Map<String, String> map);

        @C12718t
        @C12705g
        C17832m<UserResponse> postUserResponse(@C12699af String str, @C12704f Map<String, String> map);
    }
}
