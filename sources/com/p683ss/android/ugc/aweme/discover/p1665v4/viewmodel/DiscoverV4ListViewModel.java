package com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel;

import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.C11862k;
import com.bytedance.jedi.arch.ext.list.C11865l;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.discover.api.DiscoverApi;
import com.p683ss.android.ugc.aweme.discover.api.DiscoverApiNew.C28049a;
import com.p683ss.android.ugc.aweme.discover.model.Banner;
import com.p683ss.android.ugc.aweme.discover.model.BannerList;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverV4TrendingCategoryStructV4;
import com.p683ss.android.ugc.aweme.experiment.NewDiscoverV4Experiment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p064c.p065a.C1680ad;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p071d.C1707b;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4ListViewModel */
public final class DiscoverV4ListViewModel extends JediViewModel<DiscoverV4ListState> {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f75668d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DiscoverV4ListViewModel.class), "adMode", "getAdMode()I"))};

    /* renamed from: g */
    public static final C28893b f75669g = new C28893b(null);

    /* renamed from: e */
    public final int f75670e = 1;

    /* renamed from: f */
    public final ListMiddleware<DiscoverV4ListState, DiscoverCategoryStructV4, C11865l> f75671f = new ListMiddleware<>(new C28891a(this), null, C11862k.m24215a(), C11862k.m24216b());

    /* renamed from: h */
    private final C52668f f75672h = C52732g.m112285a(C28894c.f75675a);

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4ListViewModel$a */
    public static final class C28891a extends C52712l implements C52671b<DiscoverV4ListState, C2201v<C52847n<? extends List<? extends DiscoverCategoryStructV4>, ? extends C11865l>>> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4ListViewModel f75673a;

        /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4ListViewModel$a$a */
        static final class C28892a<T1, T2, R> implements C1707b<BannerList, DiscoverV4CategoryResponse, DiscoverV4CategoryResponse> {

            /* renamed from: a */
            final /* synthetic */ C28891a f75674a;

            C28892a(C28891a aVar) {
                this.f75674a = aVar;
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo6200a(Object obj, Object obj2) {
                BannerList bannerList = (BannerList) obj;
                DiscoverV4CategoryResponse discoverV4CategoryResponse = (DiscoverV4CategoryResponse) obj2;
                C52711k.m112240b(bannerList, "bannerList");
                C52711k.m112240b(discoverV4CategoryResponse, "categoryList");
                List<Banner> list = bannerList.items;
                if (list != null) {
                    for (Banner banner : list) {
                        C52711k.m112236a((Object) banner, "it");
                        banner.setRequestId(bannerList.getRequestId());
                    }
                }
                C52711k.m112240b(discoverV4CategoryResponse, "categoryResponse");
                C52711k.m112240b(bannerList, "bannerList");
                discoverV4CategoryResponse.bannerList = bannerList;
                return discoverV4CategoryResponse;
            }
        }

        public C28891a(DiscoverV4ListViewModel discoverV4ListViewModel) {
            this.f75673a = discoverV4ListViewModel;
            super(1);
        }

        public final C2201v<C52847n<List<DiscoverCategoryStructV4>, C11865l>> invoke(DiscoverV4ListState discoverV4ListState) {
            C2201v vVar;
            C52711k.m112240b(discoverV4ListState, "it");
            if (NewDiscoverV4Experiment.m69617a()) {
                vVar = C2201v.m6603a((C2206z<? extends T1>) C28049a.m66819a().getBannerList(Integer.valueOf(this.f75673a.f75670e), Integer.valueOf(this.f75673a.mo58472e()), null, C23794bh.m58381G().mo47257r()), (C2206z<? extends T2>) DiscoverApi.m66818a().categoryListV4(0, 1), (C1707b<? super T1, ? super T2, ? extends R>) new C28892a<Object,Object,Object>(this)).mo6529b(C2168a.m6521b()).mo6541d((C1711f<? super T, ? extends R>) C28895d.f75676a);
            } else {
                vVar = DiscoverApi.m66818a().categoryListV4(0, 0).mo6529b(C2168a.m6521b()).mo6541d((C1711f<? super T, ? extends R>) C28896e.f75677a);
            }
            C1680ad a = C1680ad.m5960a((C2206z<? extends T>) vVar);
            C52711k.m112236a((Object) a, "Single.fromObservable(\n …                       })");
            C2201v<C52847n<List<DiscoverCategoryStructV4>, C11865l>> c = a.mo6161c();
            C52711k.m112236a((Object) c, "actualRefresh(it).toObservable()");
            return c;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4ListViewModel$b */
    public static final class C28893b {
        private C28893b() {
        }

        public /* synthetic */ C28893b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4ListViewModel$c */
    static final class C28894c extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        public static final C28894c f75675a = new C28894c();

        C28894c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(C23794bh.m58381G().mo47256q());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4ListViewModel$d */
    static final class C28895d<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        public static final C28895d f75676a = new C28895d();

        C28895d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            DiscoverV4CategoryResponse discoverV4CategoryResponse = (DiscoverV4CategoryResponse) obj;
            C52711k.m112240b(discoverV4CategoryResponse, "resp");
            List<DiscoverCategoryStructV4> list = discoverV4CategoryResponse.categoryList;
            if (list == null) {
                list = C52575l.m112097a();
            }
            List<DiscoverCategoryStructV4> e = C52575l.m112139e((Collection<? extends T>) list);
            if (!e.isEmpty()) {
                ((DiscoverCategoryStructV4) e.get(0)).isFirst = true;
            }
            List arrayList = new ArrayList();
            List<DiscoverV4TrendingCategoryStructV4> list2 = discoverV4CategoryResponse.trendingList;
            if (list2 != null) {
                int i = 0;
                for (DiscoverV4TrendingCategoryStructV4 discoverV4TrendingCategoryStructV4 : list2) {
                    int i2 = i + 1;
                    DiscoverCategoryStructV4 discoverCategoryStructV4 = r6;
                    DiscoverCategoryStructV4 discoverCategoryStructV42 = new DiscoverCategoryStructV4(discoverV4TrendingCategoryStructV4.hastagName, discoverV4TrendingCategoryStructV4.hashtagText, discoverV4TrendingCategoryStructV4.coverUrl, discoverV4CategoryResponse.logPb, null, 2, false, i, 80, null);
                    arrayList.add(discoverCategoryStructV4);
                    i = i2;
                }
            }
            if (!arrayList.isEmpty()) {
                ((DiscoverCategoryStructV4) arrayList.get(0)).isFirst = true;
            }
            int i3 = 0;
            for (DiscoverCategoryStructV4 discoverCategoryStructV43 : e) {
                discoverCategoryStructV43.type = 4;
                discoverCategoryStructV43.logPb = discoverV4CategoryResponse.logPb;
                int i4 = i3 + 1;
                discoverCategoryStructV43.order = i3;
                i3 = i4;
            }
            arrayList.add(0, new DiscoverCategoryStructV4("", "", 1));
            e.add(0, new DiscoverCategoryStructV4("", "", 3));
            arrayList.addAll(e);
            arrayList.add(0, new DiscoverCategoryStructV4("", "", discoverV4CategoryResponse.bannerList));
            return C52856t.m112465a(arrayList, new C11865l(false, arrayList.size()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4ListViewModel$e */
    static final class C28896e<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        public static final C28896e f75677a = new C28896e();

        C28896e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            DiscoverV4CategoryResponse discoverV4CategoryResponse = (DiscoverV4CategoryResponse) obj;
            C52711k.m112240b(discoverV4CategoryResponse, "resp");
            List<DiscoverCategoryStructV4> list = discoverV4CategoryResponse.categoryList;
            if (list == null) {
                list = C52575l.m112097a();
            }
            List<DiscoverCategoryStructV4> e = C52575l.m112139e((Collection<? extends T>) list);
            if (!e.isEmpty()) {
                ((DiscoverCategoryStructV4) e.get(0)).isFirst = true;
            }
            for (DiscoverCategoryStructV4 discoverCategoryStructV4 : e) {
                discoverCategoryStructV4.type = 4;
                discoverCategoryStructV4.logPb = discoverV4CategoryResponse.logPb;
            }
            e.add(0, new DiscoverCategoryStructV4("", "", 3));
            return C52856t.m112465a(e, new C11865l(false, e.size()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4ListViewModel$f */
    static final class C28897f extends C52712l implements C52682m<DiscoverV4ListState, ListState<DiscoverCategoryStructV4, C11865l>, DiscoverV4ListState> {

        /* renamed from: a */
        public static final C28897f f75678a = new C28897f();

        C28897f() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            DiscoverV4ListState discoverV4ListState = (DiscoverV4ListState) obj;
            ListState listState = (ListState) obj2;
            C52711k.m112240b(discoverV4ListState, "$receiver");
            C52711k.m112240b(listState, "it");
            return discoverV4ListState.copy(listState);
        }
    }

    /* renamed from: e */
    public final int mo58472e() {
        return ((Number) this.f75672h.getValue()).intValue();
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        return new DiscoverV4ListState(null, 1, null);
    }

    /* renamed from: d */
    public final void mo22532d() {
        super.mo22532d();
        this.f75671f.mo22635a(C28929a.f75724a, (C52682m<? super S, ? super PROP, ? extends S>) C28897f.f75678a);
        mo22525a(this.f75671f);
        this.f75671f.mo22565b();
    }
}
