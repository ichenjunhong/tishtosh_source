package com.p683ss.android.ugc.aweme.feed.api;

import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p064c.p065a.C2201v;
import p2628d.p2639f.p2641b.C52711k;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.feed.api.FollowFeedApi */
public interface FollowFeedApi {

    /* renamed from: a */
    public static final C30141a f78682a = C30141a.f78683a;

    /* renamed from: com.ss.android.ugc.aweme.feed.api.FollowFeedApi$a */
    public static final class C30141a {

        /* renamed from: a */
        static final /* synthetic */ C30141a f78683a = new C30141a();

        private C30141a() {
        }

        /* renamed from: a */
        public static FollowFeedApi m70743a() {
            Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(FollowFeedApi.class);
            C52711k.m112236a(create, "ServiceManager.get().get…ollowFeedApi::class.java)");
            return (FollowFeedApi) create;
        }
    }

    @C53075f(mo110603a = "/aweme/v1/following/interest/feed/")
    C2201v<C30150h> getFollowingInterestFeed(@C53089t(mo110619a = "cursor") int i, @C53089t(mo110619a = "count") int i2, @C53089t(mo110619a = "following_uid") String str, @C53089t(mo110619a = "refresh_type") int i3, @C53089t(mo110619a = "sky_light_type") int i4, @C53089t(mo110619a = "is_blue_user") boolean z);

    @C53075f(mo110603a = "/aweme/v1/following/interest/users/")
    C2201v<C30152j> getInterestUsers(@C53089t(mo110619a = "following_list_type") int i, @C53089t(mo110619a = "last_display_time") long j, @C53089t(mo110619a = "sky_light_type") int i2);
}
