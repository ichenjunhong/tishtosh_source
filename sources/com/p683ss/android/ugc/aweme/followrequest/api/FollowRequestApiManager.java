package com.p683ss.android.ugc.aweme.followrequest.api;

import com.bytedance.retrofit2.p831b.C12703e;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12724z;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.followrequest.model.ApproveResponse;
import com.p683ss.android.ugc.aweme.followrequest.model.FollowRequestResponse;
import com.p683ss.android.ugc.aweme.followrequest.model.RejectResponse;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.ugc.aweme.followrequest.api.FollowRequestApiManager */
public final class FollowRequestApiManager {

    /* renamed from: a */
    static final String f84252a = Api.f61282b;

    /* renamed from: b */
    static FollowRequestApi f84253b = ((FollowRequestApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(f84252a).create(FollowRequestApi.class));

    /* renamed from: com.ss.android.ugc.aweme.followrequest.api.FollowRequestApiManager$FollowRequestApi */
    interface FollowRequestApi {
        @C12718t(mo23886a = "/aweme/v1/commit/follow/request/approve/")
        @C12705g
        C17832m<ApproveResponse> approveRequest(@C12703e(mo23873a = "from_user_id") String str);

        @C12706h(mo23876a = "/aweme/v1/user/following/request/list/")
        C17832m<FollowRequestResponse> fetchFollowRequestList(@C12724z(mo23894a = "max_time") long j, @C12724z(mo23894a = "min_time") long j2, @C12724z(mo23894a = "count") int i);

        @C12718t(mo23886a = "/aweme/v1/commit/follow/request/reject/")
        @C12705g
        C17832m<RejectResponse> rejectRequest(@C12703e(mo23873a = "from_user_id") String str);
    }

    /* renamed from: a */
    public static FollowRequestResponse m74704a(long j, long j2, int i) throws Exception {
        try {
            return (FollowRequestResponse) f84253b.fetchFollowRequestList(j, j2, i).get();
        } catch (ExecutionException e) {
            throw RetrofitService.createIRetrofitServicebyMonsterPlugin().propagateCompatibleException(e);
        }
    }
}
