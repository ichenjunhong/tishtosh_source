package com.p683ss.android.ugc.aweme.feed.api;

import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.feed.model.PrivateUrlModel;

/* renamed from: com.ss.android.ugc.aweme.feed.api.FeedStatsApi */
public interface FeedStatsApi {
    @C12706h(mo23876a = "/aweme/v1/aweme/modify/visibility/")
    C17832m<PrivateUrlModel> feedStats(@C12724z(mo23894a = "aweme_id") String str, @C12724z(mo23894a = "type") int i);
}
