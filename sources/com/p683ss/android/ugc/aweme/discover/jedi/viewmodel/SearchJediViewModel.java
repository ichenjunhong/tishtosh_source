package com.p683ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.jedi.arch.C11795c;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p683ss.android.ugc.aweme.discover.abtest.GeneralRelatedSearchCardStyle;
import com.p683ss.android.ugc.aweme.discover.api.SearchApiNew;
import com.p683ss.android.ugc.aweme.discover.mixfeed.C28333l;
import com.p683ss.android.ugc.aweme.discover.mixfeed.C28334m;
import com.p683ss.android.ugc.aweme.discover.model.SearchApiResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import p064c.p065a.C2201v;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel */
public final class SearchJediViewModel extends JediViewModel<SearchState> {

    /* renamed from: d */
    public C1690c f74180d;

    /* renamed from: e */
    public C1690c f74181e;

    /* renamed from: f */
    public final ListMiddleware<SearchState, C28333l, C28294f> f74182f;

    /* renamed from: g */
    public List<C28333l> f74183g;

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel$a */
    static final class C28273a extends C52712l implements C52671b<SearchState, SearchState> {

        /* renamed from: a */
        public static final C28273a f74184a = new C28273a();

        C28273a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SearchState searchState = (SearchState) obj;
            C52711k.m112240b(searchState, "$receiver");
            return SearchState.copy$default(searchState, ListState.copy$default(searchState.getListState(), null, null, null, new C11795c(new CancellationException()), null, 23, null), null, 2, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel$b */
    static final class C28274b extends C52712l implements C52671b<SearchState, SearchState> {

        /* renamed from: a */
        public static final C28274b f74185a = new C28274b();

        C28274b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SearchState searchState = (SearchState) obj;
            C52711k.m112240b(searchState, "$receiver");
            return SearchState.copy$default(searchState, ListState.copy$default(searchState.getListState(), null, null, new C11795c(new CancellationException()), null, null, 27, null), null, 2, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel$c */
    static final class C28275c extends C52712l implements C52671b<SearchState, C2201v<C52847n<? extends List<? extends C28333l>, ? extends C28294f>>> {

        /* renamed from: a */
        final /* synthetic */ SearchJediViewModel f74186a;

        C28275c(SearchJediViewModel searchJediViewModel) {
            this.f74186a = searchJediViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SearchState searchState = (SearchState) obj;
            C52711k.m112240b(searchState, "state");
            final C28295g searchParam = searchState.getSearchParam();
            searchParam.f74210f = ((C28294f) searchState.getListState().getPayload()).f74203c;
            int i = ((C28294f) searchState.getListState().getPayload()).f31450b;
            SearchApiResult searchApiResult = ((C28294f) searchState.getListState().getPayload()).f74204d;
            if (searchApiResult != null) {
                C2201v d = SearchApiNew.m66832a(searchParam, i, 10, (C28334m) searchApiResult).mo6543e((C1710e<? super C1690c>) new C1710e<C1690c>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C28275c f74187a;

                    {
                        this.f74187a = r1;
                    }

                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        this.f74187a.f74186a.f74181e = (C1690c) obj;
                    }
                }).mo6516a((C1706a) new C1706a(this) {

                    /* renamed from: a */
                    final /* synthetic */ C28275c f74188a;

                    {
                        this.f74188a = r1;
                    }

                    /* renamed from: a */
                    public final void mo6199a() {
                        this.f74188a.f74186a.f74181e = null;
                    }
                }).mo6541d((C1711f<? super T, ? extends R>) new C1711f<T, R>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C28275c f74189a;

                    {
                        this.f74189a = r1;
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        C28334m mVar = (C28334m) obj;
                        C52711k.m112240b(mVar, "it");
                        SearchJediViewModel searchJediViewModel = this.f74189a.f74186a;
                        List<C28333l> list = mVar.f74376d;
                        if (searchJediViewModel.f74183g != null) {
                            List<C28333l> list2 = searchJediViewModel.f74183g;
                            if (list2 == null || list2.size() != 0) {
                                if (list != null) {
                                    Iterator it = list.iterator();
                                    int i = 0;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            i = -1;
                                            break;
                                        } else if (SearchJediViewModel.m67194a((C28333l) it.next())) {
                                            break;
                                        } else {
                                            i++;
                                        }
                                    }
                                    if (i >= 0 && i < list.size()) {
                                        list.add(0, (C28333l) list.remove(i));
                                        List<C28333l> list3 = searchJediViewModel.f74183g;
                                        if (list3 == null) {
                                            C52711k.m112234a();
                                        }
                                        list.addAll(1, list3);
                                    }
                                }
                                searchJediViewModel.f74183g = null;
                            }
                        }
                        return mVar;
                    }
                }).mo6541d((C1711f<? super T, ? extends R>) new C1711f<T, R>() {
                    public final /* synthetic */ Object apply(Object obj) {
                        C28334m mVar = (C28334m) obj;
                        C52711k.m112240b(mVar, "it");
                        List<C28333l> list = mVar.f74376d;
                        String str = searchParam.f74210f;
                        if (str == null) {
                            str = "";
                        }
                        return C52856t.m112465a(list, new C28294f(str, mVar.f74375c, mVar.f74374b, mVar));
                    }
                });
                C52711k.m112236a((Object) d, "SearchApiNew.searchMTMix…                        }");
                return d;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.mixfeed.SearchMixFeedList");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel$d */
    static final class C28280d extends C52712l implements C52671b<SearchState, C2201v<C52847n<? extends List<? extends C28333l>, ? extends C28294f>>> {

        /* renamed from: a */
        final /* synthetic */ SearchJediViewModel f74191a;

        C28280d(SearchJediViewModel searchJediViewModel) {
            this.f74191a = searchJediViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SearchState searchState = (SearchState) obj;
            C52711k.m112240b(searchState, "state");
            C2201v d = SearchApiNew.m66832a(searchState.getSearchParam(), 0, C28289a.f74200a, null).mo6543e((C1710e<? super C1690c>) new C1710e<C1690c>(this) {

                /* renamed from: a */
                final /* synthetic */ C28280d f74192a;

                {
                    this.f74192a = r1;
                }

                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    this.f74192a.f74191a.f74180d = (C1690c) obj;
                }
            }).mo6516a((C1706a) new C1706a(this) {

                /* renamed from: a */
                final /* synthetic */ C28280d f74193a;

                {
                    this.f74193a = r1;
                }

                /* renamed from: a */
                public final void mo6199a() {
                    this.f74193a.f74191a.f74180d = null;
                }
            }).mo6541d((C1711f<? super T, ? extends R>) new C1711f<T, R>(this) {

                /* renamed from: a */
                final /* synthetic */ C28280d f74194a;

                {
                    this.f74194a = r1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    C28334m mVar = (C28334m) obj;
                    C52711k.m112240b(mVar, "it");
                    SearchJediViewModel searchJediViewModel = this.f74194a.f74191a;
                    List<C28333l> list = mVar.f74376d;
                    if (list != null && (!list.isEmpty())) {
                        int a = C10181b.m20511a().mo18168a(GeneralRelatedSearchCardStyle.class, true, "general_related_search_style", 31744, 0);
                        Iterator it = list.iterator();
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i2 = -1;
                                break;
                            }
                            C28333l lVar = (C28333l) it.next();
                            if (lVar.mo56735a()) {
                                i++;
                            } else if (lVar.getFeedType() == 65459) {
                                break;
                            } else {
                                i = 0;
                            }
                            i2++;
                        }
                        if (i2 > 0 && i2 < list.size()) {
                            if (a == 0) {
                                list.remove(i2);
                            } else if (a == 2 && i % 2 != 0 && i2 < list.size() - 1) {
                                int i3 = i2 + 1;
                                int size = list.size();
                                while (true) {
                                    if (i3 >= size) {
                                        i3 = -1;
                                        break;
                                    } else if (SearchJediViewModel.m67194a((C28333l) list.get(i3))) {
                                        break;
                                    } else {
                                        i3++;
                                    }
                                }
                                if (i3 <= i2 || i3 >= list.size()) {
                                    list.remove(i2);
                                } else {
                                    Collections.swap(list, i2, i3);
                                }
                            }
                        }
                    }
                    SearchJediViewModel searchJediViewModel2 = this.f74194a.f74191a;
                    List<C28333l> list2 = mVar.f74376d;
                    if (list2 != null && (!list2.isEmpty())) {
                        searchJediViewModel2.f74183g = new ArrayList();
                        List<C28333l> e = C52575l.m112139e((Collection<? extends T>) C52575l.m112132c((Iterable<? extends T>) list2));
                        for (C28333l lVar2 : e) {
                            if (SearchJediViewModel.m67194a(lVar2)) {
                                break;
                            }
                            List<C28333l> list3 = searchJediViewModel2.f74183g;
                            if (list3 != null) {
                                list3.add(lVar2);
                            }
                        }
                        if (searchJediViewModel2.f74183g != null) {
                            List<C28333l> list4 = searchJediViewModel2.f74183g;
                            if (list4 == null || list4.size() != 0) {
                                List<C28333l> list5 = searchJediViewModel2.f74183g;
                                if (list5 == null) {
                                    C52711k.m112234a();
                                }
                                e.removeAll(list5);
                                if (searchJediViewModel2.mo56671a(e) % 2 == 0) {
                                    List<C28333l> list6 = searchJediViewModel2.f74183g;
                                    if (list6 != null) {
                                        list6.clear();
                                    }
                                    searchJediViewModel2.f74183g = null;
                                } else {
                                    List<C28333l> list7 = searchJediViewModel2.f74183g;
                                    if (list7 == null) {
                                        C52711k.m112234a();
                                    }
                                    list2.removeAll(list7);
                                    List<C28333l> list8 = searchJediViewModel2.f74183g;
                                    if (list8 != null) {
                                        C52575l.m112113d(list8);
                                    }
                                }
                            }
                        }
                    }
                    return mVar;
                }
            }).mo6541d((C1711f<? super T, ? extends R>) C282844.f74195a);
            C52711k.m112236a((Object) d, "SearchApiNew.searchMTMix…                        }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel$e */
    static final class C28285e extends C52712l implements C52682m<List<? extends C28333l>, List<? extends C28333l>, List<? extends C28333l>> {

        /* renamed from: a */
        public static final C28285e f74196a = new C28285e();

        C28285e() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            C52711k.m112240b(list, "list");
            C52711k.m112240b(list2, "loadMore");
            return C52575l.m112143g((Iterable<? extends T>) C52575l.m112133c(list, list2));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel$f */
    static final class C28286f extends C52712l implements C52671b<SearchState, SearchState> {

        /* renamed from: a */
        final /* synthetic */ C28295g f74197a;

        C28286f(C28295g gVar) {
            this.f74197a = gVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SearchState searchState = (SearchState) obj;
            C52711k.m112240b(searchState, "$receiver");
            return SearchState.copy$default(searchState, null, this.f74197a, 1, null);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        return new SearchState(null, null, 3, null);
    }

    /* renamed from: d */
    public final void mo22532d() {
        super.mo22532d();
        new SearchJediViewModelMiddlewareBinding().binding(this);
    }

    /* renamed from: e */
    public final void mo56673e() {
        m67195g();
        this.f74182f.mo22565b();
    }

    /* renamed from: f */
    public final void mo56674f() {
        m67196h();
        this.f74182f.mo22567c();
    }

    /* renamed from: g */
    private final void m67195g() {
        if (this.f74180d != null) {
            C1690c cVar = this.f74180d;
            if (cVar != null) {
                cVar.dispose();
            }
            mo22530c(C28274b.f74185a);
        }
    }

    /* renamed from: h */
    private final void m67196h() {
        if (this.f74181e != null) {
            C1690c cVar = this.f74181e;
            if (cVar != null) {
                cVar.dispose();
            }
            mo22530c(C28273a.f74184a);
        }
    }

    public SearchJediViewModel() {
        ListMiddleware listMiddleware = new ListMiddleware(new C28280d(this), new C28275c(this), null, C28285e.f74196a, 4, null);
        this.f74182f = listMiddleware;
    }

    /* renamed from: a */
    public final void mo56672a(C28295g gVar) {
        C52711k.m112240b(gVar, "param");
        mo22530c(new C28286f(gVar));
    }

    /* renamed from: a */
    static boolean m67194a(C28333l lVar) {
        if (lVar == null) {
            return false;
        }
        int feedType = lVar.getFeedType();
        if (feedType == 65280) {
            return true;
        }
        int a = C10181b.m20511a().mo18168a(GeneralRelatedSearchCardStyle.class, true, "general_related_search_style", 31744, 0);
        if (feedType == 65459 && a == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo56671a(List<C28333l> list) {
        if (list == null) {
            return 0;
        }
        Iterable iterable = list;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (m67194a((C28333l) next)) {
                arrayList.add(next);
            }
        }
        return ((List) arrayList).size();
    }
}
