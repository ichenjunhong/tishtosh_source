package com.p683ss.android.ugc.aweme.profile.jedi.aweme;

import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p683ss.android.ugc.aweme.profile.model.MediaMixList;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p064c.p065a.C2201v;
import p2628d.p2639f.p2641b.C52711k;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.AwemeListApi */
public interface AwemeListApi {

    /* renamed from: a */
    public static final C39889a f101735a = C39889a.f101736a;

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.AwemeListApi$a */
    public static final class C39889a {

        /* renamed from: a */
        static final /* synthetic */ C39889a f101736a = new C39889a();

        private C39889a() {
        }

        /* renamed from: a */
        public static AwemeListApi m88658a() {
            Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(AwemeListApi.class);
            C52711k.m112236a(create, "ServiceManager.get().get…AwemeListApi::class.java)");
            return (AwemeListApi) create;
        }
    }

    @C53075f(mo110603a = "/aweme/v1/aweme/listcollection/")
    C2201v<FeedItemList> getCollectAweme(@C53089t(mo110619a = "count") int i, @C53089t(mo110619a = "cursor") long j);

    @C53075f(mo110603a = "/aweme/v1/aweme/favorite/")
    C2201v<FeedItemList> getFavoriteAweme(@C53089t(mo110619a = "count") int i, @C53089t(mo110619a = "user_id") String str, @C53089t(mo110619a = "sec_user_id") String str2, @C53089t(mo110619a = "max_cursor") long j);

    @C53075f(mo110603a = "/aweme/v1/mix/list/")
    C2201v<MediaMixList> getMediaMixList(@C53089t(mo110619a = "user_id") String str, @C53089t(mo110619a = "sec_user_id") String str2, @C53089t(mo110619a = "count") int i, @C53089t(mo110619a = "cursor") long j);

    @C53075f(mo110603a = "/aweme/v1/aweme/post/")
    C2201v<FeedItemList> getPublishAweme(@C53089t(mo110619a = "count") int i, @C53089t(mo110619a = "user_id") String str, @C53089t(mo110619a = "sec_user_id") String str2, @C53089t(mo110619a = "max_cursor") long j);
}
