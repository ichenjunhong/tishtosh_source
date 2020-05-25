package com.p683ss.android.ugc.aweme.follow.api;

import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.follow.presenter.C31885g;

/* renamed from: com.ss.android.ugc.aweme.follow.api.FollowingAwemeCountApi */
public interface FollowingAwemeCountApi {
    @C12706h(mo23876a = "/aweme/v1/rec/new/")
    C17832m<C31885g> getFollowingsLatestAwemePublishCount(@C12724z(mo23894a = "need_avatar") int i);
}
