package com.p683ss.android.ugc.aweme.follow.recommend.follow.repo;

import com.p683ss.android.ugc.aweme.friends.model.RecommendList;
import p064c.p065a.C2201v;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.repo.RecommendFollowApi */
public interface RecommendFollowApi {

    /* renamed from: a */
    public static final C31888a f83328a = C31888a.f83329a;

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.repo.RecommendFollowApi$a */
    public static final class C31888a {

        /* renamed from: a */
        static final /* synthetic */ C31888a f83329a = new C31888a();

        private C31888a() {
        }
    }

    @C53075f(mo110603a = "/aweme/v2/user/recommend/")
    C2201v<RecommendList> recommendList(@C53089t(mo110619a = "count") int i, @C53089t(mo110619a = "cursor") int i2, @C53089t(mo110619a = "target_user_id") String str, @C53089t(mo110619a = "recommend_type") int i3, @C53089t(mo110619a = "yellow_point_count") int i4, @C53089t(mo110619a = "address_book_access") int i5, @C53089t(mo110619a = "rec_impr_users") String str2, @C53089t(mo110619a = "gps_access") int i6, @C53089t(mo110619a = "sec_target_user_id") String str3);
}
