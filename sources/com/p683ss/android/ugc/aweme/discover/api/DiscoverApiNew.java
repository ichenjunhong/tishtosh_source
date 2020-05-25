package com.p683ss.android.ugc.aweme.discover.api;

import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.discover.model.BannerList;
import com.p683ss.android.ugc.aweme.discover.model.CategoryList;
import com.p683ss.android.ugc.aweme.discover.model.RankingListCover;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p064c.p065a.C2201v;
import p2628d.p2639f.p2641b.C52711k;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.discover.api.DiscoverApiNew */
public interface DiscoverApiNew {

    /* renamed from: a */
    public static final C28049a f73691a = C28049a.f73692a;

    /* renamed from: com.ss.android.ugc.aweme.discover.api.DiscoverApiNew$a */
    public static final class C28049a {

        /* renamed from: a */
        static final /* synthetic */ C28049a f73692a = new C28049a();

        /* renamed from: b */
        private static final DiscoverApiNew f73693b;

        private C28049a() {
        }

        /* renamed from: a */
        public static DiscoverApiNew m66819a() {
            return f73693b;
        }

        static {
            Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(DiscoverApiNew.class);
            C52711k.m112236a(create, "ServiceManager.get().get…scoverApiNew::class.java)");
            f73693b = (DiscoverApiNew) create;
        }
    }

    @C53075f(mo110603a = "/aweme/v1/find/")
    C2201v<BannerList> getBannerList(@C53089t(mo110619a = "banner_tab_type") Integer num, @C53089t(mo110619a = "ad_personality_mode") Integer num2, @C53089t(mo110619a = "mac_address") String str, @C53089t(mo110619a = "cmpl_enc") String str2);

    @C53075f(mo110603a = "/aweme/v1/category/list/")
    C2201v<CategoryList> getCategoryList(@C53089t(mo110619a = "cursor") int i, @C53089t(mo110619a = "count") int i2, @C53089t(mo110619a = "ad_personality_mode") Integer num, @C53089t(mo110619a = "cmpl_enc") String str);

    @C53075f(mo110603a = "/aweme/v2/category/list/")
    C2201v<CategoryList> getCategoryV2List(@C53089t(mo110619a = "cursor") int i, @C53089t(mo110619a = "count") int i2, @C53089t(mo110619a = "is_complete") Integer num, @C53089t(mo110619a = "ad_personality_mode") Integer num2, @C53089t(mo110619a = "cmpl_enc") String str);

    @C53075f(mo110603a = "/aweme/v1/category/fascinating/list/")
    C2201v<CategoryList> getFindFascinatingList(@C53089t(mo110619a = "cursor") int i, @C53089t(mo110619a = "count") int i2, @C53089t(mo110619a = "ad_personality_mode") Integer num, @C53089t(mo110619a = "mac_address") String str, @C53089t(mo110619a = "cmpl_enc") String str2);

    @C53075f(mo110603a = "/aweme/v1/branch/billboard/entrance/")
    C2201v<RankingListCover> getRankingListCover();
}
