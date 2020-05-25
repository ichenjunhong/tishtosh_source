package com.p683ss.android.ugc.aweme.main.story;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.main.story.live.C36744d;
import com.p683ss.android.ugc.aweme.story.model.StoryResponse;
import p001a.C0013i;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.main.story.HorizontalFeedApi */
public interface HorizontalFeedApi {
    @C53075f(mo110603a = "/aweme/v1/room/recommended/avatars/")
    C17832m<C36744d> fetchRecommendAvatars(@C53089t(mo110619a = "page_id") int i, @C53089t(mo110619a = "is_cold_start") String str, @C53089t(mo110619a = "is_hot_start") String str2);

    @C53075f(mo110603a = "/aweme/v1/story/")
    C17832m<StoryResponse> getStory(@C53089t(mo110619a = "cursor") long j, @C53089t(mo110619a = "count") int i, @C53089t(mo110619a = "page_id") int i2, @C53089t(mo110619a = "is_cold_start") String str, @C53089t(mo110619a = "is_hot_start") String str2);

    @C53075f(mo110603a = "/aweme/v1/skylight/open/report/")
    C0013i<BaseResponse> sendSkylightState(@C53089t(mo110619a = "status") int i);
}
