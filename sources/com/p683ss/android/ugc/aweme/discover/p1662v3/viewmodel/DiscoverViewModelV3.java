package com.p683ss.android.ugc.aweme.discover.p1662v3.viewmodel;

import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.jedi.arch.C11911k;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.C11865l;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.discover.api.DiscoverApi;
import com.p683ss.android.ugc.aweme.discover.api.DiscoverApi.DiscoverService;
import com.p683ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3;
import com.p683ss.android.ugc.aweme.discover.model.DiscoveryV3CellListResponse;
import com.p683ss.android.ugc.aweme.discover.p1662v3.p1663a.C28721a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.ImageInfo;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.setting.C41589c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p064c.p065a.C1680ad;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
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

/* renamed from: com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverViewModelV3 */
public final class DiscoverViewModelV3 extends JediViewModel<DiscoverStateV3> {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f75434d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DiscoverViewModelV3.class), "halfScreenWidth", "getHalfScreenWidth()I")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DiscoverViewModelV3.class), "maxCellHeight", "getMaxCellHeight()I")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DiscoverViewModelV3.class), "minCellHeight", "getMinCellHeight()I"))};

    /* renamed from: j */
    public static final C28763c f75435j = new C28763c(null);

    /* renamed from: e */
    public final List<Integer> f75436e;

    /* renamed from: f */
    public final List<DiscoveryCellStructV3> f75437f;

    /* renamed from: g */
    public final List<DiscoveryCellStructV3> f75438g;

    /* renamed from: h */
    public final List<DiscoveryCellStructV3> f75439h;

    /* renamed from: i */
    public final ListMiddleware<DiscoverStateV3, DiscoveryCellStructV3, C11865l> f75440i;

    /* renamed from: k */
    private final C52668f f75441k;

    /* renamed from: l */
    private final C52668f f75442l;

    /* renamed from: m */
    private final C52668f f75443m;

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverViewModelV3$a */
    public static final class C28761a extends C52712l implements C52671b<DiscoverStateV3, C2201v<C52847n<? extends List<? extends DiscoveryCellStructV3>, ? extends C11865l>>> {
        public C28761a() {
            super(1);
        }

        public final C2201v<C52847n<List<DiscoveryCellStructV3>, C11865l>> invoke(DiscoverStateV3 discoverStateV3) {
            C52711k.m112240b(discoverStateV3, "it");
            DiscoverService a = DiscoverApi.m66818a();
            C52711k.m112236a((Object) C41589c.m91432a(), "AbTestManager.getInstance()");
            C1680ad a2 = C1680ad.m5960a((C2206z<? extends T>) a.cellListV3(0, 8, C41589c.m91440l()).mo6529b(C2168a.m6521b()).mo6541d((C1711f<? super T, ? extends R>) C28764d.f75445a));
            C52711k.m112236a((Object) a2, "Single.fromObservable(\n …r)\n                    })");
            C2201v<C52847n<List<DiscoveryCellStructV3>, C11865l>> c = a2.mo6161c();
            C52711k.m112236a((Object) c, "actualRefresh(it).toObservable()");
            return c;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverViewModelV3$b */
    public static final class C28762b extends C52712l implements C52671b<DiscoverStateV3, C2201v<C52847n<? extends List<? extends DiscoveryCellStructV3>, ? extends C11865l>>> {

        /* renamed from: a */
        final /* synthetic */ C52671b f75444a;

        public C28762b(C52671b bVar) {
            this.f75444a = bVar;
            super(1);
        }

        public final C2201v<C52847n<List<DiscoveryCellStructV3>, C11865l>> invoke(DiscoverStateV3 discoverStateV3) {
            C52711k.m112240b(discoverStateV3, "state");
            return ((C1680ad) this.f75444a.invoke(discoverStateV3)).mo6161c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverViewModelV3$c */
    public static final class C28763c {
        private C28763c() {
        }

        public /* synthetic */ C28763c(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverViewModelV3$d */
    static final class C28764d<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        public static final C28764d f75445a = new C28764d();

        C28764d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            DiscoveryV3CellListResponse discoveryV3CellListResponse = (DiscoveryV3CellListResponse) obj;
            C52711k.m112240b(discoveryV3CellListResponse, "resp");
            List<DiscoveryCellStructV3> list = discoveryV3CellListResponse.cells;
            if (list == null) {
                list = C52575l.m112097a();
            }
            for (DiscoveryCellStructV3 discoveryCellStructV3 : list) {
                discoveryCellStructV3.logPb = discoveryV3CellListResponse.logPb;
                List<Aweme> list2 = discoveryCellStructV3.awemes;
                if (list2 != null) {
                    for (Aweme aweme : list2) {
                        aweme.setRequestId(discoveryV3CellListResponse.logPb.getImprId());
                        C23324d.m57378a().updateAweme(aweme);
                    }
                }
            }
            boolean z = true;
            if (discoveryV3CellListResponse.hasMore != 1) {
                z = false;
            }
            return C52856t.m112465a(list, new C11865l(z, discoveryV3CellListResponse.nextCursor));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverViewModelV3$e */
    static final class C28765e extends C52712l implements C52671b<DiscoverStateV3, C1680ad<C52847n<? extends List<? extends DiscoveryCellStructV3>, ? extends C11865l>>> {

        /* renamed from: a */
        public static final C28765e f75446a = new C28765e();

        C28765e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DiscoverStateV3 discoverStateV3 = (DiscoverStateV3) obj;
            C52711k.m112240b(discoverStateV3, "state");
            DiscoverService a = DiscoverApi.m66818a();
            int i = discoverStateV3.getCells().getPayload().f31450b;
            C52711k.m112236a((Object) C41589c.m91432a(), "AbTestManager.getInstance()");
            C1680ad a2 = C1680ad.m5960a((C2206z<? extends T>) a.cellListV3(i, 8, C41589c.m91440l()).mo6529b(C2168a.m6521b()).mo6541d((C1711f<? super T, ? extends R>) C287661.f75447a));
            C52711k.m112236a((Object) a2, "Single.fromObservable(\n …      }\n                )");
            return a2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverViewModelV3$f */
    static final class C28767f extends C52712l implements C52682m<List<? extends DiscoveryCellStructV3>, List<? extends DiscoveryCellStructV3>, List<? extends DiscoveryCellStructV3>> {

        /* renamed from: a */
        final /* synthetic */ DiscoverViewModelV3 f75448a;

        C28767f(DiscoverViewModelV3 discoverViewModelV3) {
            this.f75448a = discoverViewModelV3;
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
            this.f75448a.f75438g.clear();
            Collections.fill(this.f75448a.f75436e, Integer.valueOf(0));
            Collections.fill(this.f75448a.f75437f, null);
            this.f75448a.f75438g.addAll(list2);
            return this.f75448a.mo58390a(new ArrayList(), this.f75448a.f75438g, this.f75448a.f75436e, this.f75448a.f75437f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverViewModelV3$g */
    static final class C28768g extends C52712l implements C52682m<List<? extends DiscoveryCellStructV3>, List<? extends DiscoveryCellStructV3>, List<? extends DiscoveryCellStructV3>> {

        /* renamed from: a */
        final /* synthetic */ DiscoverViewModelV3 f75449a;

        C28768g(DiscoverViewModelV3 discoverViewModelV3) {
            this.f75449a = discoverViewModelV3;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            C52711k.m112240b(list, "list");
            C52711k.m112240b(list2, "loadMore");
            this.f75449a.f75438g.addAll(list2);
            return this.f75449a.mo58390a(C52575l.m112139e((Collection<? extends T>) this.f75449a.mo58389a(list)), this.f75449a.f75438g, this.f75449a.f75436e, this.f75449a.f75437f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverViewModelV3$h */
    static final class C28769h extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        public static final C28769h f75450a = new C28769h();

        C28769h() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(C9432q.m18670a(C11010c.m22280a()) / 2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverViewModelV3$i */
    static final class C28770i extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        final /* synthetic */ DiscoverViewModelV3 f75451a;

        C28770i(DiscoverViewModelV3 discoverViewModelV3) {
            this.f75451a = discoverViewModelV3;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf((this.f75451a.mo58391e() * 16) / 9);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverViewModelV3$j */
    static final class C28771j extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        final /* synthetic */ DiscoverViewModelV3 f75452a;

        C28771j(DiscoverViewModelV3 discoverViewModelV3) {
            this.f75452a = discoverViewModelV3;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf((this.f75452a.mo58391e() * 7) / 9);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverViewModelV3$k */
    static final class C28772k extends C52712l implements C52682m<DiscoverStateV3, ListState<DiscoveryCellStructV3, C11865l>, DiscoverStateV3> {

        /* renamed from: a */
        public static final C28772k f75453a = new C28772k();

        C28772k() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            DiscoverStateV3 discoverStateV3 = (DiscoverStateV3) obj;
            ListState listState = (ListState) obj2;
            C52711k.m112240b(discoverStateV3, "$receiver");
            C52711k.m112240b(listState, "it");
            return discoverStateV3.copy(listState);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverViewModelV3$l */
    public static final class C28773l extends C52712l implements C52671b<DiscoverStateV3, C52860x> {

        /* renamed from: a */
        final /* synthetic */ DiscoverViewModelV3 f75454a;

        /* renamed from: b */
        final /* synthetic */ DiscoveryCellStructV3 f75455b;

        /* renamed from: c */
        final /* synthetic */ C28721a f75456c;

        public C28773l(DiscoverViewModelV3 discoverViewModelV3, DiscoveryCellStructV3 discoveryCellStructV3, C28721a aVar) {
            this.f75454a = discoverViewModelV3;
            this.f75455b = discoveryCellStructV3;
            this.f75456c = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final DiscoverStateV3 discoverStateV3 = (DiscoverStateV3) obj;
            C52711k.m112240b(discoverStateV3, "state");
            this.f75454a.f75439h.add(this.f75455b);
            if (!(discoverStateV3.getCells().getRefresh() instanceof C11911k)) {
                this.f75454a.mo22530c(new C52671b<DiscoverStateV3, DiscoverStateV3>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C28773l f75457a;

                    {
                        this.f75457a = r1;
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        DiscoverStateV3 discoverStateV3 = (DiscoverStateV3) obj;
                        C52711k.m112240b(discoverStateV3, "$receiver");
                        return discoverStateV3.copy(ListState.copy$default(discoverStateV3.getCells(), null, this.f75457a.f75454a.mo58389a(discoverStateV3.getCells().getList()), null, null, null, 29, null));
                    }
                });
                this.f75454a.mo22527b(new C52671b<DiscoverStateV3, C52860x>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C28773l f75459a;

                    {
                        this.f75459a = r1;
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        DiscoverStateV3 discoverStateV3 = (DiscoverStateV3) obj;
                        C52711k.m112240b(discoverStateV3, "it");
                        this.f75459a.f75456c.mo48634a(discoverStateV3.getCells().getList());
                        return C52860x.f131107a;
                    }
                });
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: f */
    private final int m68056f() {
        return ((Number) this.f75442l.getValue()).intValue();
    }

    /* renamed from: g */
    private final int m68057g() {
        return ((Number) this.f75443m.getValue()).intValue();
    }

    /* renamed from: e */
    public final int mo58391e() {
        return ((Number) this.f75441k.getValue()).intValue();
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        return new DiscoverStateV3(null, 1, null);
    }

    /* renamed from: d */
    public final void mo22532d() {
        super.mo22532d();
        this.f75440i.mo22635a(C28776a.f75460a, (C52682m<? super S, ? super PROP, ? extends S>) C28772k.f75453a);
        mo22525a(this.f75440i);
        this.f75440i.mo22565b();
    }

    public DiscoverViewModelV3() {
        C52671b bVar;
        ArrayList arrayList = new ArrayList(2);
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            arrayList.add(Integer.valueOf(0));
        }
        this.f75436e = arrayList;
        ArrayList arrayList2 = new ArrayList(2);
        while (true) {
            bVar = null;
            if (i >= 2) {
                break;
            }
            arrayList2.add(null);
            i++;
        }
        this.f75437f = arrayList2;
        this.f75438g = new ArrayList();
        this.f75439h = new ArrayList();
        this.f75441k = C52732g.m112285a(C28769h.f75450a);
        this.f75442l = C52732g.m112285a(new C28770i(this));
        this.f75443m = C52732g.m112285a(new C28771j(this));
        C52671b bVar2 = C28765e.f75446a;
        C52682m fVar = new C28767f(this);
        C52682m gVar = new C28768g(this);
        C52671b aVar = new C28761a();
        if (bVar2 != null) {
            bVar = new C28762b(bVar2);
        }
        this.f75440i = new ListMiddleware<>(aVar, bVar, fVar, gVar);
    }

    /* renamed from: a */
    private final void m68055a(DiscoveryCellStructV3 discoveryCellStructV3) {
        boolean z;
        int i;
        discoveryCellStructV3.displayWidth = mo58391e();
        C41589c.m91432a();
        if (C41589c.m91440l() == 2) {
            discoveryCellStructV3.displayHeight = m68056f();
            return;
        }
        Collection collection = discoveryCellStructV3.awemes;
        boolean z2 = false;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Aweme aweme = (Aweme) C52575l.m112137e(discoveryCellStructV3.awemes);
            if (aweme.getVideo() != null) {
                Video video = aweme.getVideo();
                C52711k.m112236a((Object) video, "aweme.video");
                int height = video.getHeight() * mo58391e();
                Video video2 = aweme.getVideo();
                C52711k.m112236a((Object) video2, "aweme.video");
                i = height / video2.getWidth();
            } else {
                Collection imageInfos = aweme.getImageInfos();
                if (imageInfos == null || imageInfos.isEmpty()) {
                    z2 = true;
                }
                if (!z2) {
                    List imageInfos2 = aweme.getImageInfos();
                    C52711k.m112236a((Object) imageInfos2, "aweme.imageInfos");
                    Object e = C52575l.m112137e(imageInfos2);
                    C52711k.m112236a(e, "aweme.imageInfos.first()");
                    int height2 = ((ImageInfo) e).getHeight() * mo58391e();
                    List imageInfos3 = aweme.getImageInfos();
                    C52711k.m112236a((Object) imageInfos3, "aweme.imageInfos");
                    Object e2 = C52575l.m112137e(imageInfos3);
                    C52711k.m112236a(e2, "aweme.imageInfos.first()");
                    i = height2 / ((ImageInfo) e2).getWidth();
                }
            }
            discoveryCellStructV3.displayHeight = m68053a(i, m68057g(), m68056f());
        }
        i = mo58391e();
        discoveryCellStructV3.displayHeight = m68053a(i, m68057g(), m68056f());
    }

    /* renamed from: a */
    public final List<DiscoveryCellStructV3> mo58389a(List<DiscoveryCellStructV3> list) {
        int i;
        List<DiscoveryCellStructV3> list2 = list;
        for (DiscoveryCellStructV3 discoveryCellStructV3 : this.f75439h) {
            int size = list2.size();
            int i2 = discoveryCellStructV3.idx;
            if (i2 >= 0 && size > i2) {
                DiscoveryCellStructV3 discoveryCellStructV32 = (DiscoveryCellStructV3) list2.get(discoveryCellStructV3.idx);
                if (!(!C52711k.m112239a((Object) discoveryCellStructV32.cellID, (Object) discoveryCellStructV3.cellID))) {
                    m68055a(discoveryCellStructV3);
                    DiscoveryCellStructV3 copy$default = DiscoveryCellStructV3.copy$default(discoveryCellStructV32, null, null, 0, discoveryCellStructV3.awemes, null, discoveryCellStructV3.displayWidth, discoveryCellStructV3.displayHeight, 0, 0, null, 919, null);
                    if (discoveryCellStructV32.displayHeight == copy$default.displayHeight) {
                        this.f75440i.mo22561a(discoveryCellStructV3.idx, copy$default);
                    } else {
                        Collections.fill(this.f75436e, Integer.valueOf(0));
                        Collections.fill(this.f75437f, null);
                        List<DiscoveryCellStructV3> subList = list2.subList(0, discoveryCellStructV3.idx);
                        for (DiscoveryCellStructV3 discoveryCellStructV33 : subList) {
                            if (((Number) this.f75436e.get(0)).intValue() > ((Number) this.f75436e.get(1)).intValue()) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                            this.f75437f.set(i, discoveryCellStructV33);
                            List<Integer> list3 = this.f75436e;
                            list3.set(i, Integer.valueOf(((Number) list3.get(i)).intValue() + discoveryCellStructV33.displayHeight));
                        }
                        this.f75438g.add(copy$default);
                        this.f75438g.addAll(list2.subList(discoveryCellStructV3.idx + 1, list2.size()));
                        list2 = mo58390a(C52575l.m112139e((Collection<? extends T>) subList), this.f75438g, this.f75436e, this.f75437f);
                    }
                }
            }
        }
        this.f75439h.clear();
        return list2;
    }

    /* renamed from: a */
    private static int m68053a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: a */
    private static DiscoveryCellStructV3 m68054a(List<DiscoveryCellStructV3> list, List<Integer> list2, List<DiscoveryCellStructV3> list3) {
        for (DiscoveryCellStructV3 discoveryCellStructV3 : list) {
            int i = 0;
            if (((Number) list2.get(0)).intValue() > ((Number) list2.get(1)).intValue()) {
                i = 1;
            }
            C52711k.m112236a((Object) C41589c.m91432a(), "AbTestManager.getInstance()");
            if (C41589c.m91440l() != 2) {
                DiscoveryCellStructV3 discoveryCellStructV32 = (DiscoveryCellStructV3) list3.get(i);
                if (discoveryCellStructV32 == null || discoveryCellStructV32.type == 3) {
                    return discoveryCellStructV3;
                }
                if (discoveryCellStructV3.type == 3) {
                    return discoveryCellStructV3;
                }
            } else if (((DiscoveryCellStructV3) list3.get(i)) != null) {
                return discoveryCellStructV3;
            } else {
                return discoveryCellStructV3;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final List<DiscoveryCellStructV3> mo58390a(List<DiscoveryCellStructV3> list, List<DiscoveryCellStructV3> list2, List<Integer> list3, List<DiscoveryCellStructV3> list4) {
        DiscoveryCellStructV3 a = m68054a(list2, list3, list4);
        while (a != null) {
            if (((Number) list3.get(0)).intValue() > ((Number) list3.get(1)).intValue()) {
                list3.set(1, Integer.valueOf(((Number) list3.get(1)).intValue() + a.displayHeight));
                list4.set(1, a);
            } else {
                list3.set(0, Integer.valueOf(((Number) list3.get(0)).intValue() + a.displayHeight));
                list4.set(0, a);
            }
            m68055a(a);
            list2.remove(a);
            list.add(a);
            a = m68054a(list2, list3, list4);
        }
        return list;
    }
}
