package com.p683ss.android.ugc.aweme.feed.api;

import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatisticsResponse;
import com.p683ss.android.ugc.aweme.services.RetrofitService;

/* renamed from: com.ss.android.ugc.aweme.feed.api.BackUpApi */
public final class BackUpApi {

    /* renamed from: a */
    public static final IBackUpApi f78667a = ((IBackUpApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(IBackUpApi.class));

    /* renamed from: com.ss.android.ugc.aweme.feed.api.BackUpApi$IBackUpApi */
    public interface IBackUpApi {
        @C12706h(mo23876a = "aweme/v1/aweme/statistics/")
        C17832m<AwemeStatisticsResponse> queryAwemeStatistics(@C12724z(mo23894a = "aweme_ids") String str, @C12724z(mo23894a = "type") int i);
    }
}
