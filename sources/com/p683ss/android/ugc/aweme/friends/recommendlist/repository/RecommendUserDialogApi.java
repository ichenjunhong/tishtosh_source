package com.p683ss.android.ugc.aweme.friends.recommendlist.repository;

import com.p683ss.android.ugc.aweme.friends.model.RecommendUserDialogList;
import p064c.p065a.C2201v;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.RecommendUserDialogApi */
public interface RecommendUserDialogApi {

    /* renamed from: a */
    public static final C32589a f84824a = C32589a.f84825a;

    /* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.RecommendUserDialogApi$a */
    public static final class C32589a {

        /* renamed from: a */
        static final /* synthetic */ C32589a f84825a = new C32589a();

        private C32589a() {
        }
    }

    @C53075f(mo110603a = "/tiktok/v1/fyp/user/recommendations/")
    C2201v<RecommendUserDialogList> fetchRecommendUserDialogList(@C53089t(mo110619a = "count") Integer num, @C53089t(mo110619a = "cursor") Integer num2, @C53089t(mo110619a = "rec_impr_users") String str);
}
