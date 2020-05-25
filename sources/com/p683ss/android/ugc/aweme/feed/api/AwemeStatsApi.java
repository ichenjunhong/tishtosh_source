package com.p683ss.android.ugc.aweme.feed.api;

import com.bytedance.retrofit2.p831b.C12703e;
import com.bytedance.retrofit2.p831b.C12704f;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12718t;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.feed.api.AwemeStatsApi */
public final class AwemeStatsApi {

    /* renamed from: a */
    public static final AwemeStatsService f78666a = ((AwemeStatsService) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(AwemeStatsService.class));

    /* renamed from: com.ss.android.ugc.aweme.feed.api.AwemeStatsApi$AwemeStatsService */
    public interface AwemeStatsService {
        @C12718t(mo23886a = "/aweme/v1/familiar/video/stats/")
        @C12705g
        C17832m<BaseResponse> awemeFamiliarStatsReport(@C12703e(mo23873a = "item_id") String str, @C12703e(mo23873a = "author_id") String str2, @C12703e(mo23873a = "follow_status") int i, @C12703e(mo23873a = "follower_status") int i2);

        @C12718t(mo23886a = "/aweme/v1/fast/stats/")
        @C12705g
        C17832m<BaseResponse> awemeFastStatsReport(@C12703e(mo23873a = "item_id") String str, @C12703e(mo23873a = "tab_type") int i, @C12703e(mo23873a = "aweme_type") int i2, @C12703e(mo23873a = "origin_item_id") String str2);

        @C12718t(mo23886a = "/aweme/v1/aweme/stats/")
        @C12705g
        C17832m<BaseResponse> awemeStatsReport(@C12704f Map<String, String> map);
    }
}
