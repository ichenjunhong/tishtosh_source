package com.p683ss.android.ugc.aweme.discover.hitrank;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.discover.hitrank.RankApi */
public interface RankApi {
    @C53075f(mo110603a = "aweme/v1/spotpoint/set/hitrank/")
    C17832m<BaseResponse> finishHitRankTask(@C53089t(mo110619a = "to_userid") String str, @C53089t(mo110619a = "rank_type") int i, @C53089t(mo110619a = "action_type") int i2, @C53089t(mo110619a = "hashtag_names") List<String> list, @C53089t(mo110619a = "sec_to_userid") String str2);

    @C53075f(mo110603a = "aweme/v1/spotpoint/hit/notice/star/list/")
    C17832m<HitNotice> getActivityInfo(@C53089t(mo110619a = "user_id") String str, @C53089t(mo110619a = "sec_user_id") String str2);
}
