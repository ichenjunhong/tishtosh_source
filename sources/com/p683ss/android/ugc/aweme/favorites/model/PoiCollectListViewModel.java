package com.p683ss.android.ugc.aweme.favorites.model;

import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.ext.list.C11862k;
import com.bytedance.jedi.arch.ext.list.C11865l;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p683ss.android.ugc.aweme.base.arch.JediBaseViewModel;
import com.p683ss.android.ugc.aweme.favorites.adapter.C29677g;
import com.p683ss.android.ugc.aweme.favorites.p1701a.C29659b;
import com.p683ss.android.ugc.aweme.favorites.p1701a.C29660c;
import com.p683ss.android.ugc.aweme.favorites.p1704d.C29692a;
import com.p683ss.android.ugc.aweme.favorites.repository.C29715c;
import com.p683ss.android.ugc.aweme.favorites.viewholder.PoiCollectListBottomViewHolder.C29757a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p064c.p065a.C1680ad;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1711f;
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

/* renamed from: com.ss.android.ugc.aweme.favorites.model.PoiCollectListViewModel */
public final class PoiCollectListViewModel extends JediBaseViewModel<PoiCollectListState> {

    /* renamed from: g */
    public static final C29700c f77603g = new C29700c(null);

    /* renamed from: d */
    public final C29715c f77604d = new C29715c();

    /* renamed from: e */
    public final ListMiddleware<PoiCollectListState, C29677g, C11865l> f77605e;

    /* renamed from: f */
    final C52670a<C52860x> f77606f;

    /* renamed from: com.ss.android.ugc.aweme.favorites.model.PoiCollectListViewModel$a */
    public static final class C29697a extends C52712l implements C52671b<PoiCollectListState, C2201v<C52847n<? extends List<? extends C29677g>, ? extends C11865l>>> {

        /* renamed from: a */
        final /* synthetic */ PoiCollectListViewModel f77607a;

        /* renamed from: com.ss.android.ugc.aweme.favorites.model.PoiCollectListViewModel$a$a */
        static final class C29698a<T, R> implements C1711f<T, R> {

            /* renamed from: a */
            final /* synthetic */ C29697a f77608a;

            C29698a(C29697a aVar) {
                this.f77608a = aVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list;
                C29659b bVar = (C29659b) obj;
                C52711k.m112240b(bVar, "collectionList");
                PoiCollectListViewModel poiCollectListViewModel = this.f77608a.f77607a;
                List<C29660c> list2 = bVar.f77530a;
                List<C29660c> list3 = bVar.f77531b;
                if (list3 == null || list3.isEmpty()) {
                    Iterable<C29660c> iterable = list2;
                    Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                    for (C29660c gVar : iterable) {
                        arrayList.add(new C29677g(1, gVar));
                    }
                    list = (List) arrayList;
                } else {
                    C29692a.m69733a(list3.size());
                    ArrayList arrayList2 = new ArrayList();
                    poiCollectListViewModel.f77604d.f77630a.addAll(list3);
                    arrayList2.add(new C29677g(2, Integer.valueOf(0)));
                    arrayList2.addAll(poiCollectListViewModel.f77604d.mo59979a(2));
                    if (list3.size() > 2) {
                        arrayList2.add(new C29677g(3, new C29757a(poiCollectListViewModel.f77604d.mo59980b(), poiCollectListViewModel.f77606f)));
                    }
                    arrayList2.add(new C29677g(2, Integer.valueOf(1)));
                    Iterable<C29660c> iterable2 = list2;
                    Collection arrayList3 = new ArrayList(C52575l.m112104a(iterable2, 10));
                    for (C29660c gVar2 : iterable2) {
                        arrayList3.add(new C29677g(1, gVar2));
                    }
                    arrayList2.addAll((List) arrayList3);
                    list = arrayList2;
                }
                return C52856t.m112465a(list, new C11865l(bVar.f77533d, bVar.f77532c));
            }
        }

        public C29697a(PoiCollectListViewModel poiCollectListViewModel) {
            this.f77607a = poiCollectListViewModel;
            super(1);
        }

        public final C2201v<C52847n<List<C29677g>, C11865l>> invoke(PoiCollectListState poiCollectListState) {
            C52711k.m112240b(poiCollectListState, "it");
            C1680ad b = this.f77607a.f77604d.mo59978a(12, 0).mo6157b((C1711f<? super T, ? extends R>) new C29698a<Object,Object>(this));
            C52711k.m112236a((Object) b, "repo.getPoiCollectionLis…                        }");
            C2201v<C52847n<List<C29677g>, C11865l>> c = b.mo6161c();
            C52711k.m112236a((Object) c, "actualRefresh(it).toObservable()");
            return c;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.model.PoiCollectListViewModel$b */
    public static final class C29699b extends C52712l implements C52671b<PoiCollectListState, C2201v<C52847n<? extends List<? extends C29677g>, ? extends C11865l>>> {

        /* renamed from: a */
        final /* synthetic */ C52671b f77609a;

        public C29699b(C52671b bVar) {
            this.f77609a = bVar;
            super(1);
        }

        public final C2201v<C52847n<List<C29677g>, C11865l>> invoke(PoiCollectListState poiCollectListState) {
            C52711k.m112240b(poiCollectListState, "state");
            return ((C1680ad) this.f77609a.invoke(poiCollectListState)).mo6161c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.model.PoiCollectListViewModel$c */
    public static final class C29700c {
        private C29700c() {
        }

        public /* synthetic */ C29700c(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.model.PoiCollectListViewModel$d */
    static final class C29701d extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ PoiCollectListViewModel f77610a;

        C29701d(PoiCollectListViewModel poiCollectListViewModel) {
            this.f77610a = poiCollectListViewModel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C29692a.m69732a();
            this.f77610a.f77605e.mo22561a(this.f77610a.f77604d.f77631b + 1, new C29677g(3, new C29757a(1, null, 2, null)));
            int i = this.f77610a.f77604d.f77631b;
            this.f77610a.f77605e.mo22563a(i + 1, this.f77610a.f77604d.mo59979a(10));
            ListMiddleware<PoiCollectListState, C29677g, C11865l> listMiddleware = this.f77610a.f77605e;
            int i2 = this.f77610a.f77604d.f77631b + 1;
            PoiCollectListViewModel poiCollectListViewModel = this.f77610a;
            listMiddleware.mo22561a(i2, new C29677g(3, new C29757a(poiCollectListViewModel.f77604d.mo59980b(), poiCollectListViewModel.f77606f)));
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.model.PoiCollectListViewModel$e */
    static final class C29702e extends C52712l implements C52682m<PoiCollectListState, ListState<C29677g, C11865l>, PoiCollectListState> {

        /* renamed from: a */
        public static final C29702e f77611a = new C29702e();

        C29702e() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            PoiCollectListState poiCollectListState = (PoiCollectListState) obj;
            ListState listState = (ListState) obj2;
            C52711k.m112240b(poiCollectListState, "$receiver");
            C52711k.m112240b(listState, "it");
            return poiCollectListState.copy(listState);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.model.PoiCollectListViewModel$f */
    static final class C29703f extends C52712l implements C52671b<PoiCollectListState, C1680ad<C52847n<? extends List<? extends C29677g>, ? extends C11865l>>> {

        /* renamed from: a */
        final /* synthetic */ PoiCollectListViewModel f77612a;

        C29703f(PoiCollectListViewModel poiCollectListViewModel) {
            this.f77612a = poiCollectListViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            PoiCollectListState poiCollectListState = (PoiCollectListState) obj;
            C52711k.m112240b(poiCollectListState, "state");
            C1680ad b = this.f77612a.f77604d.mo59978a(12, poiCollectListState.getListState().getPayload().f31450b).mo6157b((C1711f<? super T, ? extends R>) C297041.f77613a);
            C52711k.m112236a((Object) b, "repo.getPoiCollectionLis…                        }");
            return b;
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        return new PoiCollectListState(null, 1, null);
    }

    /* renamed from: d */
    public final void mo22532d() {
        super.mo22532d();
        this.f77605e.mo22635a(C29708c.f77620a, (C52682m<? super S, ? super PROP, ? extends S>) C29702e.f77611a);
        mo22525a(this.f77605e);
    }

    public PoiCollectListViewModel() {
        C52671b fVar = new C29703f(this);
        this.f77605e = new ListMiddleware<>(new C29697a(this), new C29699b(fVar), C11862k.m24215a(), C11862k.m24216b());
        this.f77606f = new C29701d(this);
    }
}
