package com.p683ss.android.ugc.aweme.following.repository;

import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.following.p1768a.C31992a;
import com.p683ss.android.ugc.aweme.following.p1768a.C31995c;
import com.p683ss.android.ugc.aweme.following.p1768a.C31998e;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p064c.p065a.C2201v;
import p2628d.p2639f.p2641b.C52711k;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.following.repository.FollowRelationApi */
public interface FollowRelationApi {

    /* renamed from: a */
    public static final C32008a f83577a = C32008a.f83578a;

    /* renamed from: com.ss.android.ugc.aweme.following.repository.FollowRelationApi$a */
    public static final class C32008a {

        /* renamed from: a */
        static final /* synthetic */ C32008a f83578a = new C32008a();

        private C32008a() {
        }

        /* renamed from: a */
        public static FollowRelationApi m74395a() {
            Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(FollowRelationApi.class);
            C52711k.m112236a(create, "ServiceManager.get().get…wRelationApi::class.java)");
            return (FollowRelationApi) create;
        }
    }

    @C53075f(mo110603a = "aweme/v1/connected/relation/list")
    C2201v<C31992a> queryConnectedList(@C53089t(mo110619a = "user_id") String str, @C53089t(mo110619a = "sec_user_id") String str2, @C53089t(mo110619a = "cursor") Integer num, @C53089t(mo110619a = "count") Integer num2);

    @C53075f(mo110603a = "/aweme/v1/user/follower/list/")
    C2201v<C31995c> queryFollowerList(@C53089t(mo110619a = "user_id") String str, @C53089t(mo110619a = "sec_user_id") String str2, @C53089t(mo110619a = "max_time") long j, @C53089t(mo110619a = "count") int i, @C53089t(mo110619a = "offset") int i2, @C53089t(mo110619a = "source_type") int i3, @C53089t(mo110619a = "address_book_access") int i4, @C53089t(mo110619a = "gps_access") int i5, @C53089t(mo110619a = "vcd_count") int i6);

    @C53075f(mo110603a = "/aweme/v1/user/following/list/")
    C2201v<C31998e> queryFollowingList(@C53089t(mo110619a = "user_id") String str, @C53089t(mo110619a = "sec_user_id") String str2, @C53089t(mo110619a = "max_time") long j, @C53089t(mo110619a = "count") int i, @C53089t(mo110619a = "offset") int i2, @C53089t(mo110619a = "source_type") int i3, @C53089t(mo110619a = "address_book_access") int i4, @C53089t(mo110619a = "gps_access") int i5, @C53089t(mo110619a = "vcd_count") int i6, @C53089t(mo110619a = "vcd_auth_first_time") int i7);
}
