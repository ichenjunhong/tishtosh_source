package com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel;

import android.text.TextUtils;
import com.bytedance.jedi.arch.C11911k;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.C11865l;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.discover.api.DiscoverApi;
import com.p683ss.android.ugc.aweme.discover.api.DiscoverApiNew.C28049a;
import com.p683ss.android.ugc.aweme.discover.model.Banner;
import com.p683ss.android.ugc.aweme.discover.model.BannerList;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverPlaylistUpdateParam;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter.DiscoverV4DataObserver;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse;
import com.p683ss.android.ugc.aweme.discover.p1665v4.p1666a.C28786c;
import com.p683ss.android.ugc.aweme.experiment.NewDiscoverV4Experiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p064c.p065a.C1680ad;
import p064c.p065a.C2201v;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p064c.p065a.C2206z;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1707b;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.C52860x;
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

/* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel */
public final class DiscoverV4PlayListViewModel extends JediViewModel<DiscoverStateV4> implements DiscoverV4DataObserver {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f75697d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DiscoverV4PlayListViewModel.class), "adMode", "getAdMode()I"))};

    /* renamed from: j */
    public static final C28919c f75698j = new C28919c(null);

    /* renamed from: e */
    public final DiscoverV4PlayListDataCenter f75699e = DiscoverV4PlayListDataCenter.Companion.getINSTANCE();

    /* renamed from: f */
    public String f75700f = "";

    /* renamed from: g */
    public final List<DiscoverPlaylistUpdateParam> f75701g = new ArrayList();

    /* renamed from: h */
    public final int f75702h = 1;

    /* renamed from: i */
    public final ListMiddleware<DiscoverStateV4, Object, C11865l> f75703i;

    /* renamed from: k */
    private final C52668f f75704k = C52732g.m112285a(C28920d.f75712a);

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel$a */
    public static final class C28912a extends C52712l implements C52671b<DiscoverStateV4, C2201v<C52847n<? extends List<? extends Object>, ? extends C11865l>>> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4PlayListViewModel f75705a;

        /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel$a$a */
        static final class C28913a<T> implements C2205y<T> {

            /* renamed from: a */
            final /* synthetic */ C28912a f75706a;

            C28913a(C28912a aVar) {
                this.f75706a = aVar;
            }

            public final void subscribe(C2204x<DiscoverV4PlayListResponse> xVar) {
                C52711k.m112240b(xVar, "it");
                DiscoverV4PlayListResponse data = this.f75706a.f75705a.f75699e.getData(this.f75706a.f75705a.f75700f);
                if (data == null) {
                    C52711k.m112234a();
                }
                xVar.mo6282a(data);
                xVar.mo6273a();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel$a$b */
        static final class C28914b<T, R> implements C1711f<T, R> {

            /* renamed from: a */
            final /* synthetic */ C28912a f75707a;

            C28914b(C28912a aVar) {
                this.f75707a = aVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                DiscoverV4PlayListResponse discoverV4PlayListResponse = (DiscoverV4PlayListResponse) obj;
                C52711k.m112240b(discoverV4PlayListResponse, "resp");
                List<DiscoverPlayListStructV4> list = discoverV4PlayListResponse.cells;
                if (list == null) {
                    list = C52575l.m112097a();
                }
                List e = C52575l.m112139e((Collection<? extends T>) list);
                boolean z = false;
                if (TextUtils.equals(this.f75707a.f75705a.f75700f, DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST()) && discoverV4PlayListResponse.bannerList != null) {
                    DiscoverPlayListStructV4 discoverPlayListStructV4 = new DiscoverPlayListStructV4(null, null, 0, null, null, null, null, null, null, discoverV4PlayListResponse.bannerList, null, 2, 1535, null);
                    e.add(0, discoverPlayListStructV4);
                }
                if (discoverV4PlayListResponse.hasMore == 1) {
                    z = true;
                }
                return C52856t.m112465a(e, new C11865l(z, discoverV4PlayListResponse.nextCursor));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel$a$c */
        static final class C28915c<T1, T2, R> implements C1707b<BannerList, DiscoverV4PlayListResponse, DiscoverV4PlayListResponse> {

            /* renamed from: a */
            final /* synthetic */ C28912a f75708a;

            C28915c(C28912a aVar) {
                this.f75708a = aVar;
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo6200a(Object obj, Object obj2) {
                BannerList bannerList = (BannerList) obj;
                DiscoverV4PlayListResponse discoverV4PlayListResponse = (DiscoverV4PlayListResponse) obj2;
                C52711k.m112240b(bannerList, "bannerList");
                C52711k.m112240b(discoverV4PlayListResponse, "cells");
                List<Banner> list = bannerList.items;
                if (list != null) {
                    for (Banner banner : list) {
                        C52711k.m112236a((Object) banner, "it");
                        banner.setRequestId(bannerList.getRequestId());
                    }
                }
                C52711k.m112240b(discoverV4PlayListResponse, "cells");
                C52711k.m112240b(bannerList, "bannerList");
                discoverV4PlayListResponse.bannerList = bannerList;
                return discoverV4PlayListResponse;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel$a$d */
        static final class C28916d<T, R> implements C1711f<T, R> {

            /* renamed from: a */
            final /* synthetic */ C28912a f75709a;

            C28916d(C28912a aVar) {
                this.f75709a = aVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                DiscoverV4PlayListResponse discoverV4PlayListResponse = (DiscoverV4PlayListResponse) obj;
                C52711k.m112240b(discoverV4PlayListResponse, "resp");
                List<DiscoverPlayListStructV4> list = discoverV4PlayListResponse.cells;
                if (list == null) {
                    list = C52575l.m112097a();
                }
                List<DiscoverPlayListStructV4> e = C52575l.m112139e((Collection<? extends T>) list);
                DiscoverPlayListStructV4 discoverPlayListStructV4 = r2;
                DiscoverPlayListStructV4 discoverPlayListStructV42 = new DiscoverPlayListStructV4(null, null, 0, null, null, null, null, null, null, discoverV4PlayListResponse.bannerList, null, 2, 1535, null);
                boolean z = false;
                e.add(0, discoverPlayListStructV4);
                for (DiscoverPlayListStructV4 discoverPlayListStructV43 : e) {
                    discoverPlayListStructV43.logPb = discoverV4PlayListResponse.logPb;
                    List<Aweme> list2 = discoverPlayListStructV43.awemes;
                    if (list2 != null) {
                        for (Aweme aweme : list2) {
                            Video video = aweme.getVideo();
                            if (video != null) {
                                video.setSourceId(aweme.getAid());
                            }
                            aweme.setRequestId(discoverV4PlayListResponse.logPb.getImprId());
                            C23324d.m57378a().updateAweme(aweme);
                        }
                    }
                }
                DiscoverV4PlayListDataCenter.Companion.getINSTANCE().refreshData(this.f75709a.f75705a.f75700f, discoverV4PlayListResponse);
                if (discoverV4PlayListResponse.hasMore == 1) {
                    z = true;
                }
                return C52856t.m112465a(e, new C11865l(z, discoverV4PlayListResponse.nextCursor));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel$a$e */
        static final class C28917e<T, R> implements C1711f<T, R> {

            /* renamed from: a */
            final /* synthetic */ C28912a f75710a;

            C28917e(C28912a aVar) {
                this.f75710a = aVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                DiscoverV4PlayListResponse discoverV4PlayListResponse = (DiscoverV4PlayListResponse) obj;
                C52711k.m112240b(discoverV4PlayListResponse, "resp");
                List<DiscoverPlayListStructV4> list = discoverV4PlayListResponse.cells;
                if (list == null) {
                    list = C52575l.m112097a();
                }
                for (DiscoverPlayListStructV4 discoverPlayListStructV4 : list) {
                    discoverPlayListStructV4.logPb = discoverV4PlayListResponse.logPb;
                    List<Aweme> list2 = discoverPlayListStructV4.awemes;
                    if (list2 != null) {
                        for (Aweme aweme : list2) {
                            Video video = aweme.getVideo();
                            if (video != null) {
                                video.setSourceId(aweme.getAid());
                            }
                            aweme.setRequestId(discoverV4PlayListResponse.logPb.getImprId());
                            C23324d.m57378a().updateAweme(aweme);
                        }
                    }
                }
                DiscoverV4PlayListDataCenter.Companion.getINSTANCE().refreshData(this.f75710a.f75705a.f75700f, discoverV4PlayListResponse);
                boolean z = true;
                if (discoverV4PlayListResponse.hasMore != 1) {
                    z = false;
                }
                return C52856t.m112465a(list, new C11865l(z, discoverV4PlayListResponse.nextCursor));
            }
        }

        public C28912a(DiscoverV4PlayListViewModel discoverV4PlayListViewModel) {
            this.f75705a = discoverV4PlayListViewModel;
            super(1);
        }

        public final C2201v<C52847n<List<Object>, C11865l>> invoke(DiscoverStateV4 discoverStateV4) {
            C1680ad adVar;
            C52711k.m112240b(discoverStateV4, "it");
            if (this.f75705a.f75699e.getData(this.f75705a.f75700f) != null) {
                adVar = C1680ad.m5960a((C2206z<? extends T>) C2201v.m6601a((C2205y<T>) new C28913a<T>(this)).mo6529b(C2168a.m6521b()).mo6541d((C1711f<? super T, ? extends R>) new C28914b<Object,Object>(this)));
                C52711k.m112236a((Object) adVar, "Single.fromObservable(\n …                        )");
            } else if (C52711k.m112239a((Object) this.f75705a.f75700f, (Object) DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST())) {
                adVar = C1680ad.m5960a((C2206z<? extends T>) C2201v.m6603a((C2206z<? extends T1>) this.f75705a.mo58486f(), (C2206z<? extends T2>) this.f75705a.mo58487g(), (C1707b<? super T1, ? super T2, ? extends R>) new C28915c<Object,Object,Object>(this)).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6541d((C1711f<? super T, ? extends R>) new C28916d<Object,Object>(this)));
                C52711k.m112236a((Object) adVar, "Single.fromObservable(\n …                        )");
            } else {
                adVar = C1680ad.m5960a((C2206z<? extends T>) DiscoverApi.m66818a().cellListV4(0, 8, this.f75705a.f75700f, 0, NewDiscoverV4Experiment.m69622f()).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6541d((C1711f<? super T, ? extends R>) new C28917e<Object,Object>(this)));
                C52711k.m112236a((Object) adVar, "Single.fromObservable(\n …                       })");
            }
            C2201v<C52847n<List<Object>, C11865l>> c = adVar.mo6161c();
            C52711k.m112236a((Object) c, "actualRefresh(it).toObservable()");
            return c;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel$b */
    public static final class C28918b extends C52712l implements C52671b<DiscoverStateV4, C2201v<C52847n<? extends List<? extends Object>, ? extends C11865l>>> {

        /* renamed from: a */
        final /* synthetic */ C52671b f75711a;

        public C28918b(C52671b bVar) {
            this.f75711a = bVar;
            super(1);
        }

        public final C2201v<C52847n<List<Object>, C11865l>> invoke(DiscoverStateV4 discoverStateV4) {
            C52711k.m112240b(discoverStateV4, "state");
            return ((C1680ad) this.f75711a.invoke(discoverStateV4)).mo6161c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel$c */
    public static final class C28919c {
        private C28919c() {
        }

        public /* synthetic */ C28919c(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel$d */
    static final class C28920d extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        public static final C28920d f75712a = new C28920d();

        C28920d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(C23794bh.m58381G().mo47256q());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel$e */
    static final class C28921e extends C52712l implements C52671b<DiscoverStateV4, C1680ad<C52847n<? extends List<? extends Object>, ? extends C11865l>>> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4PlayListViewModel f75713a;

        C28921e(DiscoverV4PlayListViewModel discoverV4PlayListViewModel) {
            this.f75713a = discoverV4PlayListViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DiscoverStateV4 discoverStateV4 = (DiscoverStateV4) obj;
            C52711k.m112240b(discoverStateV4, "state");
            C1680ad a = C1680ad.m5960a((C2206z<? extends T>) DiscoverApi.m66818a().cellListV4(discoverStateV4.getCells().getPayload().f31450b, 8, this.f75713a.f75700f, 0, NewDiscoverV4Experiment.m69622f()).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6541d((C1711f<? super T, ? extends R>) new C1711f<T, R>(this) {

                /* renamed from: a */
                final /* synthetic */ C28921e f75714a;

                {
                    this.f75714a = r1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    DiscoverV4PlayListResponse discoverV4PlayListResponse = (DiscoverV4PlayListResponse) obj;
                    C52711k.m112240b(discoverV4PlayListResponse, "resp");
                    List<DiscoverPlayListStructV4> list = discoverV4PlayListResponse.cells;
                    if (list == null) {
                        list = C52575l.m112097a();
                    }
                    for (DiscoverPlayListStructV4 discoverPlayListStructV4 : list) {
                        discoverPlayListStructV4.logPb = discoverV4PlayListResponse.logPb;
                        List<Aweme> list2 = discoverPlayListStructV4.awemes;
                        if (list2 != null) {
                            for (Aweme aweme : list2) {
                                Video video = aweme.getVideo();
                                if (video != null) {
                                    video.setSourceId(aweme.getAid());
                                }
                                aweme.setRequestId(discoverV4PlayListResponse.logPb.getImprId());
                                C23324d.m57378a().updateAweme(aweme);
                            }
                        }
                    }
                    DiscoverV4PlayListDataCenter.Companion.getINSTANCE().loadData(this.f75714a.f75713a.f75700f, discoverV4PlayListResponse);
                    boolean z = true;
                    if (discoverV4PlayListResponse.hasMore != 1) {
                        z = false;
                    }
                    return C52856t.m112465a(list, new C11865l(z, discoverV4PlayListResponse.nextCursor));
                }
            }));
            C52711k.m112236a((Object) a, "Single.fromObservable(\n …                       })");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel$f */
    static final class C28923f extends C52712l implements C52682m<List<? extends Object>, List<? extends Object>, List<? extends Object>> {

        /* renamed from: a */
        public static final C28923f f75715a = new C28923f();

        C28923f() {
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

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel$g */
    static final class C28924g extends C52712l implements C52682m<List<? extends Object>, List<? extends Object>, List<? extends DiscoverPlayListStructV4>> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4PlayListViewModel f75716a;

        C28924g(DiscoverV4PlayListViewModel discoverV4PlayListViewModel) {
            this.f75716a = discoverV4PlayListViewModel;
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
                if (next instanceof DiscoverPlayListStructV4) {
                    arrayList.add(next);
                }
            }
            return (List) arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel$h */
    static final class C28925h extends C52712l implements C52682m<DiscoverStateV4, ListState<Object, C11865l>, DiscoverStateV4> {

        /* renamed from: a */
        public static final C28925h f75717a = new C28925h();

        C28925h() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            DiscoverStateV4 discoverStateV4 = (DiscoverStateV4) obj;
            ListState listState = (ListState) obj2;
            C52711k.m112240b(discoverStateV4, "$receiver");
            C52711k.m112240b(listState, "it");
            return discoverStateV4.copy(listState);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel$i */
    public static final class C28926i extends C52712l implements C52671b<DiscoverStateV4, C52860x> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4PlayListViewModel f75718a;

        /* renamed from: b */
        final /* synthetic */ DiscoverPlaylistUpdateParam f75719b;

        /* renamed from: c */
        final /* synthetic */ C28786c f75720c;

        public C28926i(DiscoverV4PlayListViewModel discoverV4PlayListViewModel, DiscoverPlaylistUpdateParam discoverPlaylistUpdateParam, C28786c cVar) {
            this.f75718a = discoverV4PlayListViewModel;
            this.f75719b = discoverPlaylistUpdateParam;
            this.f75720c = cVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final DiscoverStateV4 discoverStateV4 = (DiscoverStateV4) obj;
            C52711k.m112240b(discoverStateV4, "state");
            this.f75718a.f75701g.add(this.f75719b);
            if (!(discoverStateV4.getCells().getRefresh() instanceof C11911k)) {
                this.f75718a.mo22530c(new C52671b<DiscoverStateV4, DiscoverStateV4>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C28926i f75721a;

                    {
                        this.f75721a = r1;
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        DiscoverStateV4 discoverStateV4 = (DiscoverStateV4) obj;
                        C52711k.m112240b(discoverStateV4, "$receiver");
                        ListState cells = discoverStateV4.getCells();
                        DiscoverV4PlayListViewModel discoverV4PlayListViewModel = this.f75721a.f75718a;
                        Iterable list = discoverStateV4.getCells().getList();
                        Collection arrayList = new ArrayList();
                        for (Object next : list) {
                            if (next instanceof DiscoverPlayListStructV4) {
                                arrayList.add(next);
                            }
                        }
                        return discoverStateV4.copy(ListState.copy$default(cells, null, discoverV4PlayListViewModel.mo58484a((List) arrayList), null, null, null, 29, null));
                    }
                });
                this.f75718a.mo22527b(new C52671b<DiscoverStateV4, C52860x>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C28926i f75723a;

                    {
                        this.f75723a = r1;
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        DiscoverStateV4 discoverStateV4 = (DiscoverStateV4) obj;
                        C52711k.m112240b(discoverStateV4, "it");
                        this.f75723a.f75720c.mo48634a(discoverStateV4.getCells().getList());
                        return C52860x.f131107a;
                    }
                });
            }
            return C52860x.f131107a;
        }
    }

    public final void onDataChanged(String str) {
        C52711k.m112240b(str, "tabName");
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        return new DiscoverStateV4(null, 1, null);
    }

    /* renamed from: d */
    public final void mo22532d() {
        super.mo22532d();
        this.f75703i.mo22635a(C28931c.f75726a, (C52682m<? super S, ? super PROP, ? extends S>) C28925h.f75717a);
        mo22525a(this.f75703i);
    }

    /* renamed from: e */
    public final void mo58485e() {
        DiscoverV4PlayListDataCenter.Companion.getINSTANCE().removeData(this.f75700f);
        this.f75703i.mo22565b();
    }

    /* renamed from: g */
    public final C2201v<DiscoverV4PlayListResponse> mo58487g() {
        C2201v<DiscoverV4PlayListResponse> cellListV4 = DiscoverApi.m66818a().cellListV4(0, 8, this.f75700f, 0, NewDiscoverV4Experiment.m69622f());
        C52711k.m112236a((Object) cellListV4, "DiscoverApi.getInstance(…eriment.API_OPTION_VALUE)");
        return cellListV4;
    }

    /* renamed from: f */
    public final C2201v<BannerList> mo58486f() {
        return C28049a.m66819a().getBannerList(Integer.valueOf(this.f75702h), Integer.valueOf(((Number) this.f75704k.getValue()).intValue()), null, C23794bh.m58381G().mo47257r());
    }

    public DiscoverV4PlayListViewModel() {
        C52671b eVar = new C28921e(this);
        this.f75703i = new ListMiddleware<>(new C28912a(this), new C28918b(eVar), C28923f.f75715a, new C28924g(this));
    }

    public final void onNeedUpdateData(String str) {
        C52711k.m112240b(str, "tabName");
        this.f75703i.mo22567c();
    }

    /* renamed from: a */
    public final List<DiscoverPlayListStructV4> mo58484a(List<DiscoverPlayListStructV4> list) {
        String str;
        List<DiscoverPlayListStructV4> list2 = list;
        for (DiscoverPlaylistUpdateParam discoverPlaylistUpdateParam : this.f75701g) {
            int size = list2.size();
            int i = discoverPlaylistUpdateParam.index;
            if (i >= 0 && size > i) {
                DiscoverPlayListStructV4 discoverPlayListStructV4 = (DiscoverPlayListStructV4) list2.get(discoverPlaylistUpdateParam.index);
                if (!(!C52711k.m112239a((Object) discoverPlayListStructV4.cellID, (Object) discoverPlaylistUpdateParam.cellID))) {
                    List c = C52575l.m112101c(discoverPlaylistUpdateParam.aweme);
                    if (discoverPlayListStructV4.type == 2) {
                        str = discoverPlaylistUpdateParam.aweme.getDesc();
                    } else {
                        str = discoverPlayListStructV4.title;
                    }
                    String str2 = str;
                    DiscoverPlayListStructV4 copy$default = DiscoverPlayListStructV4.copy$default(discoverPlayListStructV4, null, str2, discoverPlayListStructV4.type, c, null, discoverPlayListStructV4.reason, discoverPlayListStructV4.creator, discoverPlayListStructV4.effect, discoverPlayListStructV4.music, null, null, 0, 3601, null);
                    this.f75703i.mo22561a(discoverPlaylistUpdateParam.index, copy$default);
                    this.f75699e.updateData(discoverPlaylistUpdateParam.tabName, discoverPlaylistUpdateParam.index, copy$default);
                }
            }
        }
        this.f75701g.clear();
        return list2;
    }
}
