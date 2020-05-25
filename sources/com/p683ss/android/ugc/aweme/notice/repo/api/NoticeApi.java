package com.p683ss.android.ugc.aweme.notice.repo.api;

import com.p683ss.android.ugc.aweme.notice.repo.bean.FollowRequestResponse;
import p064c.p065a.C2201v;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.api.NoticeApi */
public interface NoticeApi {

    /* renamed from: a */
    public static final C38082a f96876a = C38082a.f96877a;

    /* renamed from: com.ss.android.ugc.aweme.notice.repo.api.NoticeApi$a */
    public static final class C38082a {

        /* renamed from: a */
        static final /* synthetic */ C38082a f96877a = new C38082a();

        private C38082a() {
        }
    }

    @C53075f(mo110603a = "/aweme/v1/user/following/request/list/")
    C2201v<FollowRequestResponse> fetchFollowRequestList(@C53089t(mo110619a = "max_time") long j, @C53089t(mo110619a = "min_time") long j2, @C53089t(mo110619a = "count") int i);
}
