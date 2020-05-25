package com.p683ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.bytedance.jedi.arch.C11926m;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p683ss.android.ugc.aweme.discover.mixfeed.C28333l;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModelMiddlewareBinding */
public final class SearchJediViewModelMiddlewareBinding implements C11926m<SearchState, SearchJediViewModel> {

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModelMiddlewareBinding$a */
    static final class C28287a extends C52712l implements C52682m<SearchState, ListState<C28333l, C28294f>, SearchState> {

        /* renamed from: a */
        public static final C28287a f74198a = new C28287a();

        C28287a() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            SearchState searchState = (SearchState) obj;
            ListState listState = (ListState) obj2;
            C52711k.m112240b(searchState, "$receiver");
            C52711k.m112240b(listState, "it");
            return SearchState.copy$default(searchState, listState, null, 2, null);
        }
    }

    public final void binding(SearchJediViewModel searchJediViewModel) {
        C52711k.m112240b(searchJediViewModel, "target");
        bind0(searchJediViewModel);
    }

    private final void bind0(SearchJediViewModel searchJediViewModel) {
        ListMiddleware<SearchState, C28333l, C28294f> listMiddleware = searchJediViewModel.f74182f;
        listMiddleware.mo22635a(C28290b.f74201a, (C52682m<? super S, ? super PROP, ? extends S>) C28287a.f74198a);
        searchJediViewModel.mo22525a(listMiddleware);
    }
}
