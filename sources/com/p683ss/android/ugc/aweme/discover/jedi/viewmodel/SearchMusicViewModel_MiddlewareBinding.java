package com.p683ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.bytedance.jedi.arch.C11926m;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p683ss.android.ugc.aweme.discover.model.SearchMusic;
import com.p683ss.android.ugc.aweme.discover.viewmodel.SearchMusicListState;
import com.p683ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchMusicViewModel_MiddlewareBinding */
public final class SearchMusicViewModel_MiddlewareBinding implements C11926m<SearchMusicListState, SearchMusicViewModel> {

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchMusicViewModel_MiddlewareBinding$a */
    static final class C28288a extends C52712l implements C52682m<SearchMusicListState, ListState<SearchMusic, C28294f>, SearchMusicListState> {

        /* renamed from: a */
        public static final C28288a f74199a = new C28288a();

        C28288a() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            SearchMusicListState searchMusicListState = (SearchMusicListState) obj;
            ListState listState = (ListState) obj2;
            C52711k.m112240b(searchMusicListState, "$receiver");
            C52711k.m112240b(listState, "it");
            return SearchMusicListState.copy$default(searchMusicListState, listState, null, 2, null);
        }
    }

    public final void binding(SearchMusicViewModel searchMusicViewModel) {
        C52711k.m112240b(searchMusicViewModel, "target");
        bind_0(searchMusicViewModel);
    }

    private final void bind_0(SearchMusicViewModel searchMusicViewModel) {
        ListMiddleware<SearchMusicListState, SearchMusic, C28294f> listMiddleware = searchMusicViewModel.f75787d;
        listMiddleware.mo22635a(C28292d.f74202a, (C52682m<? super S, ? super PROP, ? extends S>) C28288a.f74199a);
        searchMusicViewModel.mo22525a(listMiddleware);
    }
}
