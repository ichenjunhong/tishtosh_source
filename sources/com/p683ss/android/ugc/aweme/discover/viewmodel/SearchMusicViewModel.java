package com.p683ss.android.ugc.aweme.discover.viewmodel;

import android.text.TextUtils;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.p683ss.android.ugc.aweme.discover.api.SearchApiNew;
import com.p683ss.android.ugc.aweme.discover.jedi.viewmodel.C28294f;
import com.p683ss.android.ugc.aweme.discover.jedi.viewmodel.C28295g;
import com.p683ss.android.ugc.aweme.discover.jedi.viewmodel.SearchMusicViewModel_MiddlewareBinding;
import com.p683ss.android.ugc.aweme.discover.model.SearchMusic;
import com.p683ss.android.ugc.aweme.discover.model.SearchMusicList;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;
import p2628d.C52847n;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel */
public final class SearchMusicViewModel extends JediViewModel<SearchMusicListState> {

    /* renamed from: e */
    public static final C28951a f75786e = new C28951a(null);

    /* renamed from: d */
    public final ListMiddleware<SearchMusicListState, SearchMusic, C28294f> f75787d;

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel$a */
    public static final class C28951a {
        private C28951a() {
        }

        public /* synthetic */ C28951a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel$b */
    static final class C28952b extends C52712l implements C52671b<SearchMusicListState, C2201v<C52847n<? extends List<? extends SearchMusic>, ? extends C28294f>>> {

        /* renamed from: a */
        final /* synthetic */ SearchMusicViewModel f75788a;

        C28952b(SearchMusicViewModel searchMusicViewModel) {
            this.f75788a = searchMusicViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SearchMusicListState searchMusicListState = (SearchMusicListState) obj;
            C52711k.m112240b(searchMusicListState, "state");
            C2201v d = SearchMusicViewModel.m68270a(searchMusicListState.getSearchParam(), ((C28294f) searchMusicListState.getListState().getPayload()).f74203c, 0).mo6541d((C1711f<? super T, ? extends R>) new C1711f<T, R>(this) {

                /* renamed from: a */
                final /* synthetic */ C28952b f75789a;

                {
                    this.f75789a = r1;
                }

                /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
                    if (r2 == null) goto L_0x0018;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final /* synthetic */ java.lang.Object apply(java.lang.Object r6) {
                    /*
                        r5 = this;
                        com.ss.android.ugc.aweme.discover.model.SearchMusicList r6 = (com.p683ss.android.ugc.aweme.discover.model.SearchMusicList) r6
                        java.lang.String r0 = "data"
                        p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
                        com.p683ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel.m68271a(r6)
                        java.util.List<com.ss.android.ugc.aweme.discover.model.SearchMusic> r0 = r6.searchMusicList
                        com.ss.android.ugc.aweme.discover.jedi.viewmodel.f r1 = new com.ss.android.ugc.aweme.discover.jedi.viewmodel.f
                        com.ss.android.ugc.aweme.feed.model.LogPbBean r2 = r6.logPb
                        if (r2 == 0) goto L_0x0018
                        java.lang.String r2 = r2.getImprId()
                        if (r2 != 0) goto L_0x001a
                    L_0x0018:
                        java.lang.String r2 = ""
                    L_0x001a:
                        boolean r3 = r6.hasMore
                        int r4 = r6.cursor
                        com.ss.android.ugc.aweme.discover.model.SearchApiResult r6 = (com.p683ss.android.ugc.aweme.discover.model.SearchApiResult) r6
                        r1.<init>(r2, r3, r4, r6)
                        d.n r6 = p2628d.C52856t.m112465a(r0, r1)
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel.C28952b.C289531.apply(java.lang.Object):java.lang.Object");
                }
            });
            C52711k.m112236a((Object) d, "searchMusic(state.search…                        }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel$c */
    static final class C28954c extends C52712l implements C52671b<SearchMusicListState, C2201v<C52847n<? extends List<? extends SearchMusic>, ? extends C28294f>>> {

        /* renamed from: a */
        final /* synthetic */ SearchMusicViewModel f75790a;

        C28954c(SearchMusicViewModel searchMusicViewModel) {
            this.f75790a = searchMusicViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SearchMusicListState searchMusicListState = (SearchMusicListState) obj;
            C52711k.m112240b(searchMusicListState, "state");
            C2201v d = SearchMusicViewModel.m68270a(searchMusicListState.getSearchParam(), ((C28294f) searchMusicListState.getListState().getPayload()).f74203c, ((C28294f) searchMusicListState.getListState().getPayload()).f31450b).mo6541d((C1711f<? super T, ? extends R>) new C1711f<T, R>(this) {

                /* renamed from: a */
                final /* synthetic */ C28954c f75791a;

                {
                    this.f75791a = r1;
                }

                /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
                    if (r2 == null) goto L_0x0018;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final /* synthetic */ java.lang.Object apply(java.lang.Object r6) {
                    /*
                        r5 = this;
                        com.ss.android.ugc.aweme.discover.model.SearchMusicList r6 = (com.p683ss.android.ugc.aweme.discover.model.SearchMusicList) r6
                        java.lang.String r0 = "data"
                        p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
                        com.p683ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel.m68271a(r6)
                        java.util.List<com.ss.android.ugc.aweme.discover.model.SearchMusic> r0 = r6.searchMusicList
                        com.ss.android.ugc.aweme.discover.jedi.viewmodel.f r1 = new com.ss.android.ugc.aweme.discover.jedi.viewmodel.f
                        com.ss.android.ugc.aweme.feed.model.LogPbBean r2 = r6.logPb
                        if (r2 == 0) goto L_0x0018
                        java.lang.String r2 = r2.getImprId()
                        if (r2 != 0) goto L_0x001a
                    L_0x0018:
                        java.lang.String r2 = ""
                    L_0x001a:
                        boolean r3 = r6.hasMore
                        int r4 = r6.cursor
                        com.ss.android.ugc.aweme.discover.model.SearchApiResult r6 = (com.p683ss.android.ugc.aweme.discover.model.SearchApiResult) r6
                        r1.<init>(r2, r3, r4, r6)
                        d.n r6 = p2628d.C52856t.m112465a(r0, r1)
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel.C28954c.C289551.apply(java.lang.Object):java.lang.Object");
                }
            });
            C52711k.m112236a((Object) d, "searchMusic(state.search…                        }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel$d */
    static final class C28956d extends C52712l implements C52671b<SearchMusicListState, SearchMusicListState> {

        /* renamed from: a */
        final /* synthetic */ C28295g f75792a;

        C28956d(C28295g gVar) {
            this.f75792a = gVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SearchMusicListState searchMusicListState = (SearchMusicListState) obj;
            C52711k.m112240b(searchMusicListState, "$receiver");
            return SearchMusicListState.copy$default(searchMusicListState, null, this.f75792a, 1, null);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        return new SearchMusicListState(null, null, 3, null);
    }

    /* renamed from: d */
    public final void mo22532d() {
        super.mo22532d();
        new SearchMusicViewModel_MiddlewareBinding().binding(this);
    }

    public SearchMusicViewModel() {
        ListMiddleware listMiddleware = new ListMiddleware(new C28952b(this), new C28954c(this), null, null, 12, null);
        this.f75787d = listMiddleware;
    }

    /* renamed from: a */
    public final void mo58521a(C28295g gVar) {
        C52711k.m112240b(gVar, "param");
        mo22530c(new C28956d(gVar));
    }

    /* renamed from: a */
    public static void m68271a(SearchMusicList searchMusicList) {
        String str;
        if (searchMusicList != null) {
            List<SearchMusic> list = searchMusicList.searchMusicList;
            if (list != null) {
                for (SearchMusic searchMusic : list) {
                    if (!TextUtils.isEmpty(searchMusicList.getRequestId())) {
                        str = searchMusicList.getRequestId();
                    } else {
                        LogPbBean logPbBean = searchMusicList.logPb;
                        if (logPbBean != null) {
                            str = logPbBean.getImprId();
                            if (str != null) {
                            }
                        }
                        str = "";
                    }
                    searchMusic.setRequestId(str);
                }
            }
        }
    }

    /* renamed from: a */
    public static C2201v<SearchMusicList> m68270a(C28295g gVar, String str, int i) {
        C2201v<SearchMusicList> b = SearchApiNew.m66833a(gVar.f74205a, (long) i, 20, gVar.f74206b, gVar.f74208d, str, gVar.f74209e, SearchApiNew.f73702a).mo6529b(C2168a.m6521b());
        C52711k.m112236a((Object) b, "SearchApiNew.searchMusic…scribeOn(Schedulers.io())");
        return b;
    }
}
