package com.p683ss.android.ugc.aweme.discover.api;

import com.p683ss.android.ugc.aweme.discover.api.p1638a.C28065b;
import com.p683ss.android.ugc.aweme.discover.model.HotSearchListResponse;
import com.p683ss.android.ugc.aweme.discover.model.HotVideoListResponse;
import com.p683ss.android.ugc.aweme.discover.model.RankingListCover;
import p064c.p065a.C2201v;
import p2628d.p2639f.p2641b.C52711k;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.discover.api.HotSearchApi */
public interface HotSearchApi {

    /* renamed from: a */
    public static final C28050a f73694a = C28050a.f73695a;

    /* renamed from: com.ss.android.ugc.aweme.discover.api.HotSearchApi$a */
    public static final class C28050a {

        /* renamed from: a */
        static final /* synthetic */ C28050a f73695a = new C28050a();

        /* renamed from: b */
        private static final HotSearchApi f73696b;

        private C28050a() {
        }

        /* renamed from: a */
        public static HotSearchApi m66820a() {
            return f73696b;
        }

        static {
            Object create = C28065b.f73738a.create(HotSearchApi.class);
            C52711k.m112236a(create, "RetrofitProvider.COMMON_…HotSearchApi::class.java)");
            f73696b = (HotSearchApi) create;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.api.HotSearchApi$b */
    public static final class C28051b {
    }

    @C53075f(mo110603a = "/aweme/v1/hot/search/list/")
    C2201v<HotSearchListResponse> getHotSearchList(@C53089t(mo110619a = "detail_list") Integer num, @C53089t(mo110619a = "mac_address") String str, @C53089t(mo110619a = "source") Integer num2, @C53089t(mo110619a = "current_word") String str2, @C53089t(mo110619a = "words_in_panel") String str3, @C53089t(mo110619a = "trend_entry_word") String str4);

    @C53075f(mo110603a = "/aweme/v1/hotsearch/aweme/billboard/")
    C2201v<HotVideoListResponse> getHotVideoList();

    @C53075f(mo110603a = "/aweme/v1/branch/billboard/entrance/")
    C2201v<RankingListCover> getRankingListCover();
}
