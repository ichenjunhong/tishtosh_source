package com.p683ss.android.ugc.aweme.friends.recommendlist.repository;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.friends.model.RecommendList;
import p064c.p065a.C2201v;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.RecommendApi */
public interface RecommendApi {

    /* renamed from: a */
    public static final C32588a f84822a = C32588a.f84823a;

    /* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.RecommendApi$a */
    public static final class C32588a {

        /* renamed from: a */
        static final /* synthetic */ C32588a f84823a = new C32588a();

        private C32588a() {
        }

        /* renamed from: a */
        public static RecommendApi m75381a() {
            Object a = RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(C18845b.f52040e).mo19925a().mo19930a(RecommendApi.class);
            C52711k.m112236a(a, "ServiceManager.get().get…RecommendApi::class.java)");
            return (RecommendApi) a;
        }
    }

    @C53075f(mo110603a = "/aweme/v1/recommend/user/dislike/")
    C2201v<C52860x> dislikeRecommend(@C53089t(mo110619a = "user_id") String str, @C53089t(mo110619a = "sec_user_id") String str2);

    @C53075f(mo110603a = "/aweme/v2/user/recommend/")
    C2201v<RecommendList> recommendList(@C53089t(mo110619a = "count") Integer num, @C53089t(mo110619a = "cursor") Integer num2, @C53089t(mo110619a = "target_user_id") String str, @C53089t(mo110619a = "recommend_type") int i, @C53089t(mo110619a = "yellow_point_count") Integer num3, @C53089t(mo110619a = "address_book_access") Integer num4, @C53089t(mo110619a = "rec_impr_users") String str2, @C53089t(mo110619a = "push_user_id") String str3, @C53089t(mo110619a = "gps_access") Integer num5, @C53089t(mo110619a = "sec_target_user_id") String str4);

    @C53075f(mo110603a = "/aweme/v1/profile/user/recommend/")
    C2201v<RecommendList> recommendListMT(@C53089t(mo110619a = "count") Integer num, @C53089t(mo110619a = "cursor") Integer num2, @C53089t(mo110619a = "rec_impr_users") String str, @C53089t(mo110619a = "sec_target_user_id") String str2, @C53089t(mo110619a = "scenario") Integer num3);
}
