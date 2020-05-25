package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.recommend;

import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import p001a.C0013i;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.RecommendApi */
public interface RecommendApi {
    @C53084o(mo110612a = "/aweme/v2/recommend/dislike/")
    @C53074e
    C0013i<BaseResponse> dislikeRecommend(@C53072c(mo110600a = "dislike_type") int i, @C53072c(mo110600a = "object_id") String str);

    @C53075f(mo110603a = "/aweme/v1/recommend/user/dislike/")
    C0013i<BaseResponse> dislikeRecommend(@C53089t(mo110619a = "user_id") String str, @C53089t(mo110619a = "sec_user_id") String str2);

    @C53084o(mo110612a = "/aweme/v1/multi/commit/follow/user/")
    @C53074e
    C0013i followUsers(@C53072c(mo110600a = "user_ids") String str, @C53072c(mo110600a = "sec_user_ids") String str2, @C53072c(mo110600a = "type") int i);

    @C53084o(mo110612a = "/aweme/v1/commit/user/extra/")
    @C53074e
    C0013i modifyUser(@C53072c(mo110600a = "need_recommend") int i);

    @C53075f(mo110603a = "/aweme/v2/user/recommend/")
    C0013i<C34654d> recommendList(@C53089t(mo110619a = "count") Integer num, @C53089t(mo110619a = "cursor") Integer num2, @C53089t(mo110619a = "target_user_id") String str, @C53089t(mo110619a = "recommend_type") Integer num3, @C53089t(mo110619a = "yellow_point_count") Integer num4, @C53089t(mo110619a = "address_book_access") Integer num5, @C53089t(mo110619a = "rec_impr_users") String str2, @C53089t(mo110619a = "gps_access") Integer num6, @C53089t(mo110619a = "sec_target_user_id") String str3);

    @C53075f(mo110603a = "/aweme/v2/user/recommend/")
    C0013i<C34654d> recommendList(@C53089t(mo110619a = "count") Integer num, @C53089t(mo110619a = "cursor") Integer num2, @C53089t(mo110619a = "target_user_id") String str, @C53089t(mo110619a = "recommend_type") Integer num3, @C53089t(mo110619a = "yellow_point_count") Integer num4, @C53089t(mo110619a = "address_book_access") Integer num5, @C53089t(mo110619a = "rec_impr_users") String str2, @C53089t(mo110619a = "push_user_id") String str3, @C53089t(mo110619a = "gps_access") Integer num6, @C53089t(mo110619a = "sec_target_user_id") String str4, @C53089t(mo110619a = "sec_push_user_id") String str5);
}
