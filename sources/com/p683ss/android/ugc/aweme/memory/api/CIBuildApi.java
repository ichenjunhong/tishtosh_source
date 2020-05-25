package com.p683ss.android.ugc.aweme.memory.api;

import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12722x;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.services.RetrofitService;

/* renamed from: com.ss.android.ugc.aweme.memory.api.CIBuildApi */
public final class CIBuildApi {

    /* renamed from: a */
    public static final Api f93969a = ((Api) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit("https://voffline.byted.org").create(Api.class));

    /* renamed from: b */
    public static final CIBuildApi f93970b = new CIBuildApi();

    /* renamed from: com.ss.android.ugc.aweme.memory.api.CIBuildApi$Api */
    public interface Api {
        @C12706h(mo23876a = "download/tos/schedule/iOSPackageBackUp/job/{jobIndex}/jenkins_build_result.json")
        C17832m<CIBuildResponse> doGet(@C12722x(mo23891a = "jobIndex") String str);
    }

    private CIBuildApi() {
    }
}
