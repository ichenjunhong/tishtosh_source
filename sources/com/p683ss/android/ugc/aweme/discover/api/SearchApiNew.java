package com.p683ss.android.ugc.aweme.discover.api;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12723y;
import com.bytedance.retrofit2.p831b.C12724z;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.api.C23453a;
import com.p683ss.android.ugc.aweme.discover.jedi.viewmodel.C28295g;
import com.p683ss.android.ugc.aweme.discover.mixfeed.C28334m;
import com.p683ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.p683ss.android.ugc.aweme.discover.model.SearchChallengeList;
import com.p683ss.android.ugc.aweme.discover.model.SearchCommodityList;
import com.p683ss.android.ugc.aweme.discover.model.SearchEpisodeDataList;
import com.p683ss.android.ugc.aweme.discover.model.SearchMix;
import com.p683ss.android.ugc.aweme.discover.model.SearchMusicList;
import com.p683ss.android.ugc.aweme.discover.model.SearchPoiList;
import com.p683ss.android.ugc.aweme.discover.model.SearchUserList;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27735i;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27737j;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27737j.C27738a;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p683ss.android.ugc.aweme.search.performance.C41450g;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.ExecutionException;
import p001a.C0013i;
import p064c.p065a.C2201v;
import p064c.p065a.C2205y;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53084o;

/* renamed from: com.ss.android.ugc.aweme.discover.api.SearchApiNew */
public final class SearchApiNew {

    /* renamed from: a */
    public static final int f73702a = 1;

    /* renamed from: b */
    public static final SearchApiNew f73703b = new SearchApiNew();

    /* renamed from: c */
    private static final String f73704c = Api.f61282b;

    /* renamed from: d */
    private static final IRetrofit f73705d = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(f73704c);

    /* renamed from: e */
    private static final RealApi f73706e = ((RealApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder("https://search.amemv.com").mo19925a().mo19930a(RealApi.class));

    /* renamed from: f */
    private static final int f73707f = 1;

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchApiNew$RealApi */
    public interface RealApi {

        /* renamed from: a */
        public static final C28052a f73708a = C28052a.f73709a;

        /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchApiNew$RealApi$a */
        public static final class C28052a {

            /* renamed from: a */
            static final /* synthetic */ C28052a f73709a = new C28052a();

            /* renamed from: b */
            private static final RealApi f73710b;

            private C28052a() {
            }

            /* renamed from: a */
            public static RealApi m66836a() {
                return f73710b;
            }

            static {
                Object create = SearchApiNew.m66834a().create(RealApi.class);
                C52711k.m112236a(create, "sRetrofit.create(RealApi::class.java)");
                f73710b = (RealApi) create;
            }
        }

        @C53084o(mo110612a = "/aweme/v1/music/rank/")
        @C53074e
        C17832m<SearchMusicList> rankMusicList(@C53072c(mo110600a = "cursor") long j, @C53072c(mo110600a = "count") int i);

        @C53084o(mo110612a = "/aweme/v1/recommend/challenge/")
        @C53074e
        C17832m<SearchChallengeList> recommendChallengeList(@C53072c(mo110600a = "max_cursor") long j, @C53072c(mo110600a = "count") int i);

        @C53084o(mo110612a = "/aweme/v1/challenge/search/")
        @C53074e
        C17832m<SearchChallengeList> searchChallengeList(@C53072c(mo110600a = "cursor") long j, @C53072c(mo110600a = "keyword") String str, @C53072c(mo110600a = "count") int i, @C53072c(mo110600a = "hot_search") int i2, @C53072c(mo110600a = "is_pull_refresh") int i3, @C53072c(mo110600a = "search_source") String str2, @C53072c(mo110600a = "search_id") String str3, @C53072c(mo110600a = "query_correct_type") int i4);

        @C53084o(mo110612a = "/aweme/v2/shop/search/vertical/")
        @C53074e
        C0013i<SearchCommodityList> searchCommodityList(@C53072c(mo110600a = "query") String str, @C53072c(mo110600a = "type") int i, @C53072c(mo110600a = "sort") int i2, @C53072c(mo110600a = "cursor") int i3, @C53072c(mo110600a = "count") int i4, @C53072c(mo110600a = "is_pull_refresh") int i5, @C53072c(mo110600a = "hot_search") int i6, @C53072c(mo110600a = "search_id") String str2, @C53072c(mo110600a = "query_correct_type") int i7);

        @C53084o(mo110612a = "/aweme/v1/search/item/")
        @C53074e
        C17832m<SearchMix> searchFeedList(@C53072c(mo110600a = "keyword") String str, @C53072c(mo110600a = "offset") long j, @C53072c(mo110600a = "count") int i, @C53072c(mo110600a = "source") String str2, @C53072c(mo110600a = "search_source") String str3, @C53072c(mo110600a = "is_pull_refresh") int i2, @C53072c(mo110600a = "hot_search") int i3, @C53072c(mo110600a = "search_id") String str4, @C53072c(mo110600a = "query_correct_type") int i4, @C53072c(mo110600a = "is_filter_search") int i5, @C53072c(mo110600a = "sort_type") int i6, @C53072c(mo110600a = "publish_time") int i7);

        @C53074e
        @C12723y(mo23893a = 3)
        @C53084o(mo110612a = "/aweme/v1/general/search/single/")
        C0013i<C28334m> searchMTMixFeedList(@C53072c(mo110600a = "keyword") String str, @C53072c(mo110600a = "offset") int i, @C53072c(mo110600a = "count") int i2, @C53072c(mo110600a = "is_pull_refresh") int i3, @C53072c(mo110600a = "search_source") String str2, @C53072c(mo110600a = "hot_search") int i4, @C53072c(mo110600a = "latitude") double d, @C53072c(mo110600a = "longitude") double d2, @C53072c(mo110600a = "search_id") String str3, @C53072c(mo110600a = "query_correct_type") int i5);

        @C53074e
        @C12723y(mo23893a = 3)
        @C53084o(mo110612a = "/aweme/v1/general/search/single/")
        C0013i<C28334m> searchMixFeedList(@C53072c(mo110600a = "keyword") String str, @C53072c(mo110600a = "offset") int i, @C53072c(mo110600a = "count") int i2, @C53072c(mo110600a = "is_pull_refresh") int i3, @C53072c(mo110600a = "search_source") String str2, @C53072c(mo110600a = "hot_search") int i4, @C53072c(mo110600a = "latitude") double d, @C53072c(mo110600a = "longitude") double d2, @C53072c(mo110600a = "search_id") String str3, @C53072c(mo110600a = "query_correct_type") int i5, @C53072c(mo110600a = "mac_address") String str4, @C53072c(mo110600a = "is_filter_search") int i6, @C53072c(mo110600a = "sort_type") int i7, @C53072c(mo110600a = "publish_time") int i8, @C53072c(mo110600a = "disable_synthesis") int i9, @C53072c(mo110600a = "multi_mod") int i10, @C53072c(mo110600a = "single_filter_aladdin") int i11, @C53072c(mo110600a = "client_width") int i12, @C53072c(mo110600a = "dynamic_type") int i13, @C53072c(mo110600a = "epidemic_card_type") int i14, @C53072c(mo110600a = "city") String str5, @C53072c(mo110600a = "city_code") String str6, @C53072c(mo110600a = "search_channel") String str7);

        @C53084o(mo110612a = "/aweme/v1/general/search/")
        @C53074e
        C17832m<SearchMix> searchMixList(@C53072c(mo110600a = "keyword") String str, @C53072c(mo110600a = "offset") long j, @C53072c(mo110600a = "count") int i, @C53072c(mo110600a = "is_pull_refresh") int i2, @C53072c(mo110600a = "hot_search") int i3, @C53072c(mo110600a = "latitude") double d, @C53072c(mo110600a = "longitude") double d2, @C53072c(mo110600a = "search_id") String str2, @C53072c(mo110600a = "query_correct_type") int i4);

        @C12706h(mo23876a = "/aweme/v1/loadmore/lvideo/episodes")
        C17832m<SearchEpisodeDataList> searchMovieEpisodeList(@C12724z(mo23894a = "album_id") String str, @C12724z(mo23894a = "offset") long j, @C12724z(mo23894a = "count") int i, @C12724z(mo23894a = "mp_id") int i2, @C12724z(mo23894a = "sort_type") int i3);

        @C53084o(mo110612a = "/aweme/v1/music/search/")
        @C53074e
        C2201v<SearchMusicList> searchMusicList(@C53072c(mo110600a = "cursor") long j, @C53072c(mo110600a = "keyword") String str, @C53072c(mo110600a = "count") int i, @C53072c(mo110600a = "is_pull_refresh") int i2, @C53072c(mo110600a = "hot_search") int i3, @C53072c(mo110600a = "search_id") String str2, @C53072c(mo110600a = "query_correct_type") int i4, @C53072c(mo110600a = "is_author_search") int i5);

        @C53084o(mo110612a = "/aweme/v1/general/poi/search/")
        @C53074e
        C17832m<SearchPoiList> searchPoiList(@C53072c(mo110600a = "cursor") long j, @C53072c(mo110600a = "keyword") String str, @C53072c(mo110600a = "count") int i, @C53072c(mo110600a = "search_source") String str2, @C53072c(mo110600a = "hot_search") int i2, @C53072c(mo110600a = "latitude") double d, @C53072c(mo110600a = "longitude") double d2, @C53072c(mo110600a = "search_id") String str3, @C53072c(mo110600a = "query_correct_type") int i3);

        @C53084o(mo110612a = "/aweme/v1/discover/search/")
        @C53074e
        C17832m<SearchUserList> searchUserList(@C53072c(mo110600a = "cursor") long j, @C53072c(mo110600a = "keyword") String str, @C53072c(mo110600a = "count") int i, @C53072c(mo110600a = "type") int i2, @C53072c(mo110600a = "is_pull_refresh") int i3, @C53072c(mo110600a = "hot_search") int i4, @C53072c(mo110600a = "search_source") String str2, @C53072c(mo110600a = "search_id") String str3, @C53072c(mo110600a = "query_correct_type") int i5);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchApiNew$a */
    static final class C28053a<T> implements C2205y<T> {

        /* renamed from: a */
        final /* synthetic */ int f73711a;

        /* renamed from: b */
        final /* synthetic */ C0013i f73712b;

        /* renamed from: c */
        final /* synthetic */ C28295g f73713c;

        /* renamed from: d */
        final /* synthetic */ int f73714d;

        C28053a(int i, C0013i iVar, C28295g gVar, int i2) {
            this.f73711a = i;
            this.f73712b = iVar;
            this.f73713c = gVar;
            this.f73714d = i2;
        }

        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x00fa  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x00fe  */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void subscribe(p064c.p065a.C2204x<com.p683ss.android.ugc.aweme.discover.mixfeed.C28334m> r5) {
            /*
                r4 = this;
                java.lang.String r0 = "it"
                p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
                r0 = 0
                int r1 = r4.f73711a     // Catch:{ Throwable -> 0x00f3 }
                if (r1 == 0) goto L_0x0021
                a.i r1 = r4.f73712b     // Catch:{ Throwable -> 0x00f3 }
                if (r1 == 0) goto L_0x0021
                a.i r1 = r4.f73712b     // Catch:{ Throwable -> 0x00f3 }
                r1.mo36g()     // Catch:{ Throwable -> 0x00f3 }
                a.i r1 = r4.f73712b     // Catch:{ Throwable -> 0x00f3 }
                java.lang.Object r1 = r1.mo34e()     // Catch:{ Throwable -> 0x00f3 }
                com.ss.android.ugc.aweme.discover.mixfeed.m r1 = (com.p683ss.android.ugc.aweme.discover.mixfeed.C28334m) r1     // Catch:{ Throwable -> 0x00f3 }
                if (r1 == 0) goto L_0x0021
                r5.mo6282a(r1)     // Catch:{ Throwable -> 0x00f3 }
                return
            L_0x0021:
                com.ss.android.ugc.aweme.discover.mixfeed.q$a r1 = new com.ss.android.ugc.aweme.discover.mixfeed.q$a     // Catch:{ Throwable -> 0x00f3 }
                r1.<init>()     // Catch:{ Throwable -> 0x00f3 }
                com.ss.android.ugc.aweme.discover.jedi.viewmodel.g r2 = r4.f73713c     // Catch:{ Throwable -> 0x00f3 }
                com.ss.android.ugc.aweme.search.model.e r2 = r2.f74211g     // Catch:{ Throwable -> 0x00f3 }
                com.ss.android.ugc.aweme.discover.mixfeed.q$a r1 = r1.mo56749a(r2)     // Catch:{ Throwable -> 0x00f3 }
                com.ss.android.ugc.aweme.discover.jedi.viewmodel.g r2 = r4.f73713c     // Catch:{ Throwable -> 0x00f3 }
                java.lang.String r2 = r2.f74205a     // Catch:{ Throwable -> 0x00f3 }
                com.ss.android.ugc.aweme.discover.mixfeed.q$a r1 = r1.mo56750a(r2)     // Catch:{ Throwable -> 0x00f3 }
                int r2 = r4.f73711a     // Catch:{ Throwable -> 0x00f3 }
                com.ss.android.ugc.aweme.discover.mixfeed.q$a r1 = r1.mo56747a(r2)     // Catch:{ Throwable -> 0x00f3 }
                int r2 = r4.f73714d     // Catch:{ Throwable -> 0x00f3 }
                com.ss.android.ugc.aweme.discover.mixfeed.q$a r1 = r1.mo56753b(r2)     // Catch:{ Throwable -> 0x00f3 }
                com.ss.android.ugc.aweme.discover.jedi.viewmodel.g r2 = r4.f73713c     // Catch:{ Throwable -> 0x00f3 }
                int r2 = r2.f74206b     // Catch:{ Throwable -> 0x00f3 }
                com.ss.android.ugc.aweme.discover.mixfeed.q$a r1 = r1.mo56756c(r2)     // Catch:{ Throwable -> 0x00f3 }
                com.ss.android.ugc.aweme.discover.jedi.viewmodel.g r2 = r4.f73713c     // Catch:{ Throwable -> 0x00f3 }
                java.lang.String r2 = r2.f74207c     // Catch:{ Throwable -> 0x00f3 }
                if (r2 != 0) goto L_0x0052
                java.lang.String r2 = ""
            L_0x0052:
                com.ss.android.ugc.aweme.discover.mixfeed.q$a r1 = r1.mo56757c(r2)     // Catch:{ Throwable -> 0x00f3 }
                com.ss.android.ugc.aweme.discover.jedi.viewmodel.g r2 = r4.f73713c     // Catch:{ Throwable -> 0x00f3 }
                java.lang.String r2 = r2.f74210f     // Catch:{ Throwable -> 0x00f3 }
                if (r2 != 0) goto L_0x005e
                java.lang.String r2 = ""
            L_0x005e:
                com.ss.android.ugc.aweme.discover.mixfeed.q$a r1 = r1.mo56754b(r2)     // Catch:{ Throwable -> 0x00f3 }
                com.ss.android.ugc.aweme.discover.jedi.viewmodel.g r2 = r4.f73713c     // Catch:{ Throwable -> 0x00f3 }
                int r2 = r2.f74209e     // Catch:{ Throwable -> 0x00f3 }
                com.ss.android.ugc.aweme.discover.mixfeed.q$a r1 = r1.mo56758d(r2)     // Catch:{ Throwable -> 0x00f3 }
                com.ss.android.ugc.aweme.discover.jedi.viewmodel.g r2 = r4.f73713c     // Catch:{ Throwable -> 0x00f3 }
                int r2 = r2.f74208d     // Catch:{ Throwable -> 0x00f3 }
                com.ss.android.ugc.aweme.discover.mixfeed.q$a r1 = r1.mo56759e(r2)     // Catch:{ Throwable -> 0x00f3 }
                com.ss.android.ugc.aweme.discover.mixfeed.q r1 = r1.mo56755b()     // Catch:{ Throwable -> 0x00f3 }
                int r2 = r4.f73711a     // Catch:{ Throwable -> 0x00ee }
                if (r2 != 0) goto L_0x0095
                boolean r2 = com.p683ss.android.ugc.aweme.discover.p1645g.C28136n.m66997a()     // Catch:{ Throwable -> 0x00ee }
                if (r2 == 0) goto L_0x0095
                com.ss.android.ugc.aweme.discover.g.n r2 = com.p683ss.android.ugc.aweme.discover.p1645g.C28136n.f73888f     // Catch:{ Throwable -> 0x00ee }
                d.n r2 = r2.mo56561a(r1)     // Catch:{ Throwable -> 0x00ee }
                if (r2 == 0) goto L_0x0095
                java.lang.Object r0 = r2.getSecond()     // Catch:{ Throwable -> 0x00ee }
                a.i r0 = (p001a.C0013i) r0     // Catch:{ Throwable -> 0x00ee }
                java.lang.Object r2 = r2.getFirst()     // Catch:{ Throwable -> 0x00ee }
                com.ss.android.ugc.aweme.discover.mixfeed.q r2 = (com.p683ss.android.ugc.aweme.discover.mixfeed.C28338q) r2     // Catch:{ Throwable -> 0x00ee }
                r1 = r2
            L_0x0095:
                if (r0 != 0) goto L_0x00a0
                if (r1 != 0) goto L_0x009c
                p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Throwable -> 0x00ee }
            L_0x009c:
                a.i r0 = r1.mo56742b()     // Catch:{ Throwable -> 0x00ee }
            L_0x00a0:
                if (r0 != 0) goto L_0x00a5
                p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Throwable -> 0x00ee }
            L_0x00a5:
                r0.mo36g()     // Catch:{ Throwable -> 0x00ee }
                if (r0 != 0) goto L_0x00ad
                p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Throwable -> 0x00ee }
            L_0x00ad:
                boolean r2 = r0.mo33d()     // Catch:{ Throwable -> 0x00ee }
                if (r2 == 0) goto L_0x00c2
                if (r0 != 0) goto L_0x00b8
                p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Throwable -> 0x00ee }
            L_0x00b8:
                java.lang.Exception r0 = r0.mo35f()     // Catch:{ Throwable -> 0x00ee }
                java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ Throwable -> 0x00ee }
                r5.mo6274a(r0)     // Catch:{ Throwable -> 0x00ee }
                goto L_0x00e4
            L_0x00c2:
                if (r0 != 0) goto L_0x00c7
                p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Throwable -> 0x00ee }
            L_0x00c7:
                boolean r2 = r0.mo31c()     // Catch:{ Throwable -> 0x00ee }
                if (r2 == 0) goto L_0x00d6
                if (r1 != 0) goto L_0x00d2
                p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Throwable -> 0x00ee }
            L_0x00d2:
                r1.mo56524a()     // Catch:{ Throwable -> 0x00ee }
                goto L_0x00e4
            L_0x00d6:
                if (r0 != 0) goto L_0x00db
                p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Throwable -> 0x00ee }
            L_0x00db:
                java.lang.Object r0 = r0.mo34e()     // Catch:{ Throwable -> 0x00ee }
                com.ss.android.ugc.aweme.discover.mixfeed.m r0 = (com.p683ss.android.ugc.aweme.discover.mixfeed.C28334m) r0     // Catch:{ Throwable -> 0x00ee }
                r5.mo6282a(r0)     // Catch:{ Throwable -> 0x00ee }
            L_0x00e4:
                boolean r0 = r5.isDisposed()     // Catch:{ Throwable -> 0x00ee }
                if (r0 != 0) goto L_0x0104
                r5.mo6273a()     // Catch:{ Throwable -> 0x00ee }
                return
            L_0x00ee:
                r0 = move-exception
                r3 = r1
                r1 = r0
                r0 = r3
                goto L_0x00f4
            L_0x00f3:
                r1 = move-exception
            L_0x00f4:
                boolean r2 = r5.isDisposed()
                if (r2 != 0) goto L_0x00fe
                r5.mo6274a(r1)
                return
            L_0x00fe:
                if (r0 == 0) goto L_0x0104
                r0.mo56524a()
                return
            L_0x0104:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.api.SearchApiNew.C28053a.subscribe(c.a.x):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchApiNew$b */
    static final class C28054b<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        public static final C28054b f73715a = new C28054b();

        /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchApiNew$b$a */
        public static final class C28055a implements C27737j {
            C28055a() {
            }

            public final int aK_() {
                return 3;
            }
        }

        C28054b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            C28334m mVar = (C28334m) obj;
            C52711k.m112240b(mVar, "it");
            C28055a aVar = new C28055a();
            SearchApiResult searchApiResult = mVar;
            C52711k.m112240b(searchApiResult, "data");
            SearchApiResult a = C27738a.m66406a(aVar, searchApiResult);
            if (a != null) {
                return (C28334m) a;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.mixfeed.SearchMixFeedList");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchApiNew$c */
    static final class C28056c<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        public static final C28056c f73716a = new C28056c();

        C28056c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            C28334m mVar = (C28334m) obj;
            C52711k.m112240b(mVar, "it");
            C27735i.f72792a.mo56165a(mVar);
            return mVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchApiNew$d */
    static final class C28057d<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        public static final C28057d f73717a = new C28057d();

        C28057d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            C28334m mVar = (C28334m) obj;
            C52711k.m112240b(mVar, "it");
            C41450g.f105073c.mo84191a(mVar);
            return mVar;
        }
    }

    private SearchApiNew() {
    }

    /* renamed from: a */
    public static IRetrofit m66834a() {
        return f73705d;
    }

    /* renamed from: b */
    public static final RealApi m66835b() {
        return C28052a.m66836a();
    }

    /* renamed from: a */
    public static C2201v<C28334m> m66832a(C28295g gVar, int i, int i2, C28334m mVar) {
        C0013i iVar;
        C52711k.m112240b(gVar, "param");
        if (mVar != null) {
            iVar = mVar.f74379g;
        } else {
            iVar = null;
        }
        if (mVar != null) {
            mVar.f74379g = null;
        }
        C2201v<C28334m> b = C2201v.m6601a((C2205y<T>) new C28053a<T>(i, iVar, gVar, i2)).mo6541d((C1711f<? super T, ? extends R>) C28054b.f73715a).mo6541d((C1711f<? super T, ? extends R>) C28056c.f73716a).mo6541d((C1711f<? super T, ? extends R>) C28057d.f73717a).mo6529b(C2168a.m6521b());
        C52711k.m112236a((Object) b, "Observable.create<Search…scribeOn(Schedulers.io())");
        return b;
    }

    /* renamed from: a */
    public static C2201v<SearchMusicList> m66833a(String str, long j, int i, int i2, int i3, String str2, int i4, int i5) throws Exception {
        String str3 = str;
        C52711k.m112240b(str, "keyword");
        C52711k.m112240b(str2, "searchId");
        try {
            return m66835b().searchMusicList(j, str, 20, i2, i3, str2, i4, i5);
        } catch (ExecutionException e) {
            RuntimeException compatibleException = C23453a.getCompatibleException(e);
            C52711k.m112236a((Object) compatibleException, "getCompatibleException(e)");
            throw compatibleException;
        }
    }
}
