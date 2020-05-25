package com.p683ss.android.ugc.aweme.notification.followrequest.api;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.p683ss.android.ugc.aweme.notification.followrequest.model.ApproveResponse;
import com.p683ss.android.ugc.aweme.notification.followrequest.model.FollowRequestResponse;
import com.p683ss.android.ugc.aweme.notification.followrequest.model.RejectResponse;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.ExecutionException;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.notification.followrequest.api.FollowRequestApiManager */
public final class FollowRequestApiManager {

    /* renamed from: a */
    static FollowRequestApi f97267a = ((FollowRequestApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(TutorialVideoApiManager.f96873a).create(FollowRequestApi.class));

    /* renamed from: com.ss.android.ugc.aweme.notification.followrequest.api.FollowRequestApiManager$FollowRequestApi */
    interface FollowRequestApi {
        @C53084o(mo110612a = "/aweme/v1/commit/follow/request/approve/")
        @C53074e
        C17832m<ApproveResponse> approveRequest(@C53072c(mo110600a = "from_user_id") String str);

        @C53075f(mo110603a = "/aweme/v1/user/following/request/list/")
        C17832m<FollowRequestResponse> fetchFollowRequestList(@C53089t(mo110619a = "max_time") long j, @C53089t(mo110619a = "min_time") long j2, @C53089t(mo110619a = "count") int i);

        @C53084o(mo110612a = "/aweme/v1/commit/follow/request/reject/")
        @C53074e
        C17832m<RejectResponse> rejectRequest(@C53072c(mo110600a = "from_user_id") String str);
    }

    /* renamed from: a */
    public static FollowRequestResponse m85373a(long j, long j2, int i) throws Exception {
        try {
            return (FollowRequestResponse) f97267a.fetchFollowRequestList(j, j2, i).get();
        } catch (ExecutionException e) {
            throw RetrofitService.createIRetrofitServicebyMonsterPlugin().propagateCompatibleException(e);
        }
    }
}
