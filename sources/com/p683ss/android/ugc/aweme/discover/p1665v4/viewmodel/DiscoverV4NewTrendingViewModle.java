package com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel;

import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.C11865l;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.discover.api.DiscoverApi;
import com.p683ss.android.ugc.aweme.discover.api.DiscoverApiNew.C28049a;
import com.p683ss.android.ugc.aweme.discover.model.Banner;
import com.p683ss.android.ugc.aweme.discover.model.BannerList;
import com.p683ss.android.ugc.aweme.discover.model.Category;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverV4NewTrendingReponse;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverV4NewTrendingStruct;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter;
import com.p683ss.android.ugc.aweme.experiment.NewDiscoverV4Experiment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p064c.p065a.C1680ad;
import p064c.p065a.C2201v;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
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

/* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4NewTrendingViewModle */
public final class DiscoverV4NewTrendingViewModle extends JediViewModel<DiscoverV4TrendingState> {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f75679d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DiscoverV4NewTrendingViewModle.class), "adMode", "getAdMode()I"))};

    /* renamed from: g */
    public static final C28901c f75680g = new C28901c(null);

    /* renamed from: e */
    public final int f75681e = 1;

    /* renamed from: f */
    public final ListMiddleware<DiscoverV4TrendingState, DiscoverV4NewTrendingStruct, C11865l> f75682f;

    /* renamed from: h */
    private final C52668f f75683h = C52732g.m112285a(C28902d.f75687a);

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4NewTrendingViewModle$a */
    public static final class C28898a extends C52712l implements C52671b<DiscoverV4TrendingState, C2201v<C52847n<? extends List<? extends DiscoverV4NewTrendingStruct>, ? extends C11865l>>> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4NewTrendingViewModle f75684a;

        /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4NewTrendingViewModle$a$a */
        static final class C28899a<T1, T2, R> implements C1707b<BannerList, DiscoverV4NewTrendingReponse, DiscoverV4NewTrendingReponse> {

            /* renamed from: a */
            final /* synthetic */ C28898a f75685a;

            C28899a(C28898a aVar) {
                this.f75685a = aVar;
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo6200a(Object obj, Object obj2) {
                BannerList bannerList = (BannerList) obj;
                DiscoverV4NewTrendingReponse discoverV4NewTrendingReponse = (DiscoverV4NewTrendingReponse) obj2;
                C52711k.m112240b(bannerList, "bannerList");
                C52711k.m112240b(discoverV4NewTrendingReponse, "categoryList");
                List<Banner> list = bannerList.items;
                if (list != null) {
                    for (Banner banner : list) {
                        C52711k.m112236a((Object) banner, "it");
                        banner.setRequestId(bannerList.getRequestId());
                    }
                }
                C52711k.m112240b(discoverV4NewTrendingReponse, "categoryResponse");
                C52711k.m112240b(bannerList, "bannerList");
                discoverV4NewTrendingReponse.bannerList = bannerList;
                return discoverV4NewTrendingReponse;
            }
        }

        public C28898a(DiscoverV4NewTrendingViewModle discoverV4NewTrendingViewModle) {
            this.f75684a = discoverV4NewTrendingViewModle;
            super(1);
        }

        public final C2201v<C52847n<List<DiscoverV4NewTrendingStruct>, C11865l>> invoke(DiscoverV4TrendingState discoverV4TrendingState) {
            C2201v vVar;
            C52711k.m112240b(discoverV4TrendingState, "it");
            if (!NewDiscoverV4Experiment.m69618b()) {
                vVar = DiscoverApi.m66818a().newTrendingListV4(1, 0, 8).mo6529b(C2168a.m6521b()).mo6541d((C1711f<? super T, ? extends R>) C28906h.f75691a);
            } else if (DiscoverV4PlayListDataCenter.Companion.getINSTANCE().getNewTrendingData() != null) {
                vVar = C2201v.m6601a((C2205y<T>) C28903e.f75688a).mo6529b(C2168a.m6521b()).mo6541d((C1711f<? super T, ? extends R>) C28904f.f75689a);
            } else {
                vVar = C2201v.m6603a((C2206z<? extends T1>) C28049a.m66819a().getBannerList(Integer.valueOf(this.f75684a.f75681e), Integer.valueOf(this.f75684a.mo58480e()), null, C23794bh.m58381G().mo47257r()), (C2206z<? extends T2>) DiscoverApi.m66818a().newTrendingListV4(NewDiscoverV4Experiment.m69622f(), 0, 8), (C1707b<? super T1, ? super T2, ? extends R>) new C28899a<Object,Object,Object>(this)).mo6529b(C2168a.m6521b()).mo6541d((C1711f<? super T, ? extends R>) C28905g.f75690a);
            }
            C1680ad a = C1680ad.m5960a((C2206z<? extends T>) vVar);
            C52711k.m112236a((Object) a, "Single.fromObservable(\n …      }\n                )");
            C2201v<C52847n<List<DiscoverV4NewTrendingStruct>, C11865l>> c = a.mo6161c();
            C52711k.m112236a((Object) c, "actualRefresh(it).toObservable()");
            return c;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4NewTrendingViewModle$b */
    public static final class C28900b extends C52712l implements C52671b<DiscoverV4TrendingState, C2201v<C52847n<? extends List<? extends DiscoverV4NewTrendingStruct>, ? extends C11865l>>> {

        /* renamed from: a */
        final /* synthetic */ C52671b f75686a;

        public C28900b(C52671b bVar) {
            this.f75686a = bVar;
            super(1);
        }

        public final C2201v<C52847n<List<DiscoverV4NewTrendingStruct>, C11865l>> invoke(DiscoverV4TrendingState discoverV4TrendingState) {
            C52711k.m112240b(discoverV4TrendingState, "state");
            return ((C1680ad) this.f75686a.invoke(discoverV4TrendingState)).mo6161c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4NewTrendingViewModle$c */
    public static final class C28901c {
        private C28901c() {
        }

        public /* synthetic */ C28901c(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4NewTrendingViewModle$d */
    static final class C28902d extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        public static final C28902d f75687a = new C28902d();

        C28902d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(C23794bh.m58381G().mo47256q());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4NewTrendingViewModle$e */
    static final class C28903e<T> implements C2205y<T> {

        /* renamed from: a */
        public static final C28903e f75688a = new C28903e();

        C28903e() {
        }

        public final void subscribe(C2204x<DiscoverV4NewTrendingReponse> xVar) {
            C52711k.m112240b(xVar, "it");
            DiscoverV4NewTrendingReponse newTrendingData = DiscoverV4PlayListDataCenter.Companion.getINSTANCE().getNewTrendingData();
            if (newTrendingData == null) {
                C52711k.m112234a();
            }
            xVar.mo6282a(newTrendingData);
            xVar.mo6273a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4NewTrendingViewModle$f */
    static final class C28904f<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        public static final C28904f f75689a = new C28904f();

        C28904f() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            DiscoverV4NewTrendingReponse discoverV4NewTrendingReponse = (DiscoverV4NewTrendingReponse) obj;
            C52711k.m112240b(discoverV4NewTrendingReponse, "resp");
            List<Category> list = discoverV4NewTrendingReponse.categoryList;
            if (list == null) {
                list = C52575l.m112097a();
            }
            List<Category> e = C52575l.m112139e((Collection<? extends T>) list);
            List arrayList = new ArrayList();
            arrayList.add(new DiscoverV4NewTrendingStruct(null, discoverV4NewTrendingReponse.bannerList, null));
            for (Category discoverV4NewTrendingStruct : e) {
                arrayList.add(new DiscoverV4NewTrendingStruct(discoverV4NewTrendingStruct, null, null));
            }
            boolean z = true;
            if (discoverV4NewTrendingReponse.hasMore != 1) {
                z = false;
            }
            return C52856t.m112465a(arrayList, new C11865l(z, discoverV4NewTrendingReponse.nextCursor));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4NewTrendingViewModle$g */
    static final class C28905g<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        public static final C28905g f75690a = new C28905g();

        C28905g() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            DiscoverV4NewTrendingReponse discoverV4NewTrendingReponse = (DiscoverV4NewTrendingReponse) obj;
            C52711k.m112240b(discoverV4NewTrendingReponse, "resp");
            List<Category> list = discoverV4NewTrendingReponse.categoryList;
            if (list == null) {
                list = C52575l.m112097a();
            }
            List<Category> e = C52575l.m112139e((Collection<? extends T>) list);
            List arrayList = new ArrayList();
            arrayList.add(new DiscoverV4NewTrendingStruct(null, discoverV4NewTrendingReponse.bannerList, null));
            for (Category discoverV4NewTrendingStruct : e) {
                arrayList.add(new DiscoverV4NewTrendingStruct(discoverV4NewTrendingStruct, null, null));
            }
            DiscoverV4PlayListDataCenter.Companion.getINSTANCE().refreshNewTrendingData(discoverV4NewTrendingReponse);
            boolean z = true;
            if (discoverV4NewTrendingReponse.hasMore != 1) {
                z = false;
            }
            return C52856t.m112465a(arrayList, new C11865l(z, discoverV4NewTrendingReponse.nextCursor));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4NewTrendingViewModle$h */
    static final class C28906h<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        public static final C28906h f75691a = new C28906h();

        C28906h() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            DiscoverV4NewTrendingReponse discoverV4NewTrendingReponse = (DiscoverV4NewTrendingReponse) obj;
            C52711k.m112240b(discoverV4NewTrendingReponse, "resp");
            List arrayList = new ArrayList();
            List<Category> list = discoverV4NewTrendingReponse.categoryList;
            if (list != null) {
                for (Category discoverV4NewTrendingStruct : list) {
                    arrayList.add(new DiscoverV4NewTrendingStruct(discoverV4NewTrendingStruct, null, null));
                }
            }
            boolean z = true;
            if (discoverV4NewTrendingReponse.hasMore != 1) {
                z = false;
            }
            return C52856t.m112465a(arrayList, new C11865l(z, discoverV4NewTrendingReponse.nextCursor));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4NewTrendingViewModle$i */
    static final class C28907i extends C52712l implements C52671b<DiscoverV4TrendingState, C1680ad<C52847n<? extends List<? extends DiscoverV4NewTrendingStruct>, ? extends C11865l>>> {

        /* renamed from: a */
        public static final C28907i f75692a = new C28907i();

        C28907i() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DiscoverV4TrendingState discoverV4TrendingState = (DiscoverV4TrendingState) obj;
            C52711k.m112240b(discoverV4TrendingState, "state");
            C1680ad a = C1680ad.m5960a((C2206z<? extends T>) DiscoverApi.m66818a().newTrendingListV4(NewDiscoverV4Experiment.m69622f(), discoverV4TrendingState.getCells().getPayload().f31450b, 8).mo6529b(C2168a.m6521b()).mo6541d((C1711f<? super T, ? extends R>) C289081.f75693a));
            C52711k.m112236a((Object) a, "Single.fromObservable(\n …      }\n                )");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4NewTrendingViewModle$j */
    static final class C28909j extends C52712l implements C52682m<List<? extends DiscoverV4NewTrendingStruct>, List<? extends DiscoverV4NewTrendingStruct>, List<? extends DiscoverV4NewTrendingStruct>> {

        /* renamed from: a */
        public static final C28909j f75694a = new C28909j();

        C28909j() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            C52711k.m112240b(list, "list");
            C52711k.m112240b(list2, "refresh");
            if (list2.isEmpty()) {
                return list;
            }
            return list2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4NewTrendingViewModle$k */
    static final class C28910k extends C52712l implements C52682m<List<? extends DiscoverV4NewTrendingStruct>, List<? extends DiscoverV4NewTrendingStruct>, List<? extends DiscoverV4NewTrendingStruct>> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4NewTrendingViewModle f75695a;

        C28910k(DiscoverV4NewTrendingViewModle discoverV4NewTrendingViewModle) {
            this.f75695a = discoverV4NewTrendingViewModle;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            C52711k.m112240b(list, "list");
            C52711k.m112240b(list2, "loadMore");
            List e = C52575l.m112139e((Collection<? extends T>) list);
            e.addAll(list2);
            Iterable iterable = e;
            Collection arrayList = new ArrayList();
            for (Object next : iterable) {
                if (next instanceof DiscoverV4NewTrendingStruct) {
                    arrayList.add(next);
                }
            }
            return (List) arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4NewTrendingViewModle$l */
    static final class C28911l extends C52712l implements C52682m<DiscoverV4TrendingState, ListState<DiscoverV4NewTrendingStruct, C11865l>, DiscoverV4TrendingState> {

        /* renamed from: a */
        public static final C28911l f75696a = new C28911l();

        C28911l() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            DiscoverV4TrendingState discoverV4TrendingState = (DiscoverV4TrendingState) obj;
            ListState listState = (ListState) obj2;
            C52711k.m112240b(discoverV4TrendingState, "$receiver");
            C52711k.m112240b(listState, "it");
            return discoverV4TrendingState.copy(listState);
        }
    }

    /* renamed from: e */
    public final int mo58480e() {
        return ((Number) this.f75683h.getValue()).intValue();
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        return new DiscoverV4TrendingState(null, 1, null);
    }

    /* renamed from: d */
    public final void mo22532d() {
        super.mo22532d();
        this.f75682f.mo22635a(C28930b.f75725a, (C52682m<? super S, ? super PROP, ? extends S>) C28911l.f75696a);
        mo22525a(this.f75682f);
    }

    /* renamed from: f */
    public final void mo58481f() {
        DiscoverV4PlayListDataCenter.Companion.getINSTANCE().removeData(DiscoverV4PlayListDataCenter.Companion.getNEW_TRENDING_PLAYLIST());
        this.f75682f.mo22565b();
    }

    public DiscoverV4NewTrendingViewModle() {
        C52671b bVar;
        C52671b bVar2 = C28907i.f75692a;
        C52682m mVar = C28909j.f75694a;
        C52682m kVar = new C28910k(this);
        C52671b aVar = new C28898a(this);
        if (bVar2 != null) {
            bVar = new C28900b(bVar2);
        } else {
            bVar = null;
        }
        this.f75682f = new ListMiddleware<>(aVar, bVar, mVar, kVar);
    }
}
