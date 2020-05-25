package com.p683ss.android.ugc.aweme.discover.jedi;

import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.C0643c;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.C10722c;
import com.bytedance.jedi.arch.C11797e;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.C11837a;
import com.bytedance.jedi.arch.ext.list.C11853b;
import com.bytedance.jedi.arch.ext.list.C11854c;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.challenge.p1494a.C24529c;
import com.p683ss.android.ugc.aweme.commercialize.model.C26112af;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.discover.helper.MusicPlayHelper;
import com.p683ss.android.ugc.aweme.discover.jedi.p1653a.C28243b;
import com.p683ss.android.ugc.aweme.discover.jedi.p1653a.C28244c;
import com.p683ss.android.ugc.aweme.discover.jedi.viewmodel.C28291c;
import com.p683ss.android.ugc.aweme.discover.jedi.viewmodel.C28294f;
import com.p683ss.android.ugc.aweme.discover.jedi.viewmodel.C28295g;
import com.p683ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel;
import com.p683ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState;
import com.p683ss.android.ugc.aweme.discover.mixfeed.C28333l;
import com.p683ss.android.ugc.aweme.discover.mixfeed.C28334m;
import com.p683ss.android.ugc.aweme.discover.mixfeed.p1654a.C28301a;
import com.p683ss.android.ugc.aweme.discover.mob.C28393ak;
import com.p683ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.p683ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.p683ss.android.ugc.aweme.discover.model.SearchStateViewModel$SearchStateListener$$CC;
import com.p683ss.android.ugc.aweme.discover.model.SearchStateViewModel.SearchObserver;
import com.p683ss.android.ugc.aweme.discover.model.SearchStateViewModel.SearchStateListener;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27735i;
import com.p683ss.android.ugc.aweme.discover.p1659ui.p1661b.C28534c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1718d.C30179b;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.utils.C31213v;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.p683ss.android.ugc.aweme.search.p2122b.C41406a;
import com.p683ss.android.ugc.aweme.search.p2122b.C41407b;
import com.p683ss.android.ugc.aweme.search.p2124d.C41412a;
import com.p683ss.android.ugc.aweme.search.performance.C41454h;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import org.greenrobot.eventbus.C53771m;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.C52669a;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.discover.jedi.b */
public final class C28249b extends C28241a<C28333l> implements C41406a {

    /* renamed from: b */
    static final /* synthetic */ C52767h[] f74134b = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28249b.class), "searchViewModel", "getSearchViewModel()Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchJediViewModel;"))};

    /* renamed from: O */
    private final lifecycleAwareLazy f74135O;

    /* renamed from: P */
    private SearchStateViewModel f74136P;

    /* renamed from: Q */
    private final C0199s<Integer> f74137Q;

    /* renamed from: R */
    private HashMap f74138R;

    /* renamed from: c */
    public MusicPlayHelper f74139c;

    /* renamed from: d */
    public C30332aw f74140d;

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$a */
    public static final class C28250a extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C52760c f74141a;

        public C28250a(C52760c cVar) {
            this.f74141a = cVar;
            super(0);
        }

        public final String invoke() {
            String name = C52669a.m112219a(this.f74141a).getName();
            C52711k.m112236a((Object) name, "viewModelClass.java.name");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$b */
    public static final class C28251b extends C52712l implements C52682m<SearchState, Bundle, SearchState> {
        public static final C28251b INSTANCE = new C28251b();

        public C28251b() {
            super(2);
        }

        public final SearchState invoke(SearchState searchState, Bundle bundle) {
            C52711k.m112240b(searchState, "$receiver");
            return searchState;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$c */
    public static final class C28252c extends C52712l implements C52670a<SearchJediViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f74142a;

        /* renamed from: b */
        final /* synthetic */ C52670a f74143b;

        /* renamed from: c */
        final /* synthetic */ C52760c f74144c;

        /* renamed from: d */
        final /* synthetic */ C52682m f74145d;

        public C28252c(Fragment fragment, C52670a aVar, C52760c cVar, C52682m mVar) {
            this.f74142a = fragment;
            this.f74143b = aVar;
            this.f74144c = cVar;
            this.f74145d = mVar;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3, types: [com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel, java.lang.Object]
          mth insns count: 23
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p683ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel invoke() {
            /*
                r3 = this;
                android.support.v4.app.Fragment r0 = r3.f74142a
                android.support.v4.app.Fragment r1 = r3.f74142a
                com.bytedance.jedi.arch.ad r1 = (com.bytedance.jedi.arch.C11791ad) r1
                android.arch.lifecycle.y$b r1 = r1.mo22542a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r0, r1)
                d.f.a.a r1 = r3.f74143b
                java.lang.Object r1 = r1.invoke()
                java.lang.String r1 = (java.lang.String) r1
                d.k.c r2 = r3.f74144c
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                com.bytedance.jedi.arch.n r1 = r0.f31279c
                java.lang.Class<com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel> r2 = com.p683ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel.class
                com.bytedance.jedi.arch.m r1 = r1.mo22643a(r2)
                if (r1 == 0) goto L_0x0034
                java.lang.String r2 = "this"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                r1.binding(r0)
            L_0x0034:
                com.ss.android.ugc.aweme.discover.jedi.b$c$1 r1 = new com.ss.android.ugc.aweme.discover.jedi.b$c$1
                r1.<init>(r3)
                d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
                r0.mo22526a(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.jedi.C28249b.C28252c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$d */
    public static final class C28254d implements C24579d {

        /* renamed from: a */
        final /* synthetic */ C28249b f74147a;

        C28254d(C28249b bVar) {
            this.f74147a = bVar;
        }

        /* renamed from: a */
        public final void mo50347a(View view, Aweme aweme, String str) {
            if (!(C32800a.m75679a(view) || aweme == null || this.f74147a.getActivity() == null)) {
                C31213v.m72895a((JediViewModel) this.f74147a.mo56557k());
                C0643c cVar = null;
                if (view != null) {
                    cVar = C0643c.m1728a(view, view.getWidth() / 2, view.getHeight() / 2, 0, 0);
                }
                SmartRoute withParam = SmartRouter.buildRoute((Context) this.f74147a.getActivity(), "//aweme/detail").withParam("id", aweme.getAid()).withParam("refer", this.f74147a.mo56549l()).withParam("video_from", "from_search_jedi").withParam("profile_enterprise_type", aweme.getEnterpriseType()).withParam("page_type", 9).withParam("search_keyword", this.f74147a.f74960l);
                if (cVar != null) {
                    withParam.withBundleAnimation(cVar.mo2171a());
                }
                withParam.open();
                C30179b.m70792a(aweme);
                C28393ak.m67388a(view, this.f74147a.mo56549l(), aweme, this.f74147a.f74960l);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$e */
    public static final class C28255e implements C11854c<C28333l, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f74148a;

        /* renamed from: b */
        final /* synthetic */ C52682m f74149b;

        /* renamed from: c */
        final /* synthetic */ C52682m f74150c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f74151d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f74152e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends C28333l>, C52860x> f74153f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f74151d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f74152e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends C28333l>, C52860x> mo22603c() {
            return this.f74153f;
        }

        public C28255e(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f74148a = bVar;
            this.f74149b = mVar;
            this.f74150c = mVar2;
            this.f74151d = bVar;
            this.f74152e = mVar;
            this.f74153f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$f */
    public static final class C28256f implements C11854c<C28333l, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f74154a;

        /* renamed from: b */
        final /* synthetic */ C52682m f74155b;

        /* renamed from: c */
        final /* synthetic */ C52682m f74156c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f74157d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f74158e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends C28333l>, C52860x> f74159f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f74157d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f74158e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends C28333l>, C52860x> mo22603c() {
            return this.f74159f;
        }

        public C28256f(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f74154a = bVar;
            this.f74155b = mVar;
            this.f74156c = mVar2;
            this.f74157d = bVar;
            this.f74158e = mVar;
            this.f74159f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$g */
    static final class C28257g extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28249b f74160a;

        C28257g(C28249b bVar) {
            this.f74160a = bVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "throwable");
            if (!(th instanceof CancellationException)) {
                if (th instanceof Exception) {
                    this.f74160a.mo47025b((Exception) th);
                } else {
                    this.f74160a.mo47025b(new Exception(th));
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$h */
    static final class C28258h extends C52712l implements C52682m<C11866f, List<? extends C28333l>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28249b f74161a;

        /* renamed from: b */
        final /* synthetic */ View f74162b;

        C28258h(C28249b bVar, View view) {
            this.f74161a = bVar;
            this.f74162b = view;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            final List list = (List) obj2;
            C52711k.m112240b(fVar, "$receiver");
            C52711k.m112240b(list, "list");
            fVar.mo22552a(this.f74161a.mo56557k(), new C52671b<SearchState, Boolean>(this) {

                /* renamed from: a */
                final /* synthetic */ C28258h f74163a;

                /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$h$1$a */
                static final class C28260a implements Runnable {

                    /* renamed from: a */
                    final /* synthetic */ SearchApiResult f74165a;

                    /* renamed from: b */
                    final /* synthetic */ C282591 f74166b;

                    C28260a(SearchApiResult searchApiResult, C282591 r2) {
                        this.f74165a = searchApiResult;
                        this.f74166b = r2;
                    }

                    public final void run() {
                        SearchApiResult searchApiResult = this.f74165a;
                        if (searchApiResult != null) {
                            C0013i<C28334m> iVar = ((C28334m) searchApiResult).f74379g;
                            if (iVar != null) {
                                iVar.mo20a((C0011g<TResult, TContinuationResult>) new C0011g<C28334m, C52860x>(this) {

                                    /* renamed from: a */
                                    final /* synthetic */ C28260a f74167a;

                                    {
                                        this.f74167a = r1;
                                    }

                                    public final /* synthetic */ Object then(C0013i iVar) {
                                        this.f74167a.f74166b.f74163a.f74161a.mo56568m();
                                        return C52860x.f131107a;
                                    }
                                }, C0013i.f25b);
                                return;
                            }
                            return;
                        }
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.mixfeed.SearchMixFeedList");
                    }
                }

                {
                    this.f74163a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    SearchState searchState = (SearchState) obj;
                    C52711k.m112240b(searchState, "it");
                    C11853b bVar = ((C28294f) searchState.getListState().getPayload()).f31449a;
                    List b = C27735i.m66404b(C27735i.m66402a(searchState.getListState().getList()));
                    if (searchState.getListState().getList().isEmpty() || list.isEmpty()) {
                        this.f74163a.f74161a.aJ_();
                    } else {
                        C26840g x = this.f74163a.f74161a.mo58250x();
                        if (x != null) {
                            ((C28244c) x).mo56662e(b);
                            this.f74163a.f74161a.mo47018a(b, bVar.f31440a);
                        } else {
                            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
                        }
                    }
                    SearchApiResult searchApiResult = ((C28294f) searchState.getListState().getPayload()).f74204d;
                    if (searchApiResult == null) {
                        return null;
                    }
                    this.f74163a.f74161a.mo58147a(searchApiResult.suicidePrevent);
                    this.f74163a.f74161a.mo58145a(searchApiResult.queryCorrectInfo);
                    this.f74163a.f74161a.mo58144a(searchApiResult.adInfo);
                    this.f74163a.f74161a.mo58146a(searchApiResult);
                    return Boolean.valueOf(this.f74163a.f74162b.post(new C28260a(searchApiResult, this)));
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$i */
    static final class C28262i extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28249b f74168a;

        C28262i(C28249b bVar) {
            this.f74168a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            this.f74168a.mo47017R_();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$j */
    static final class C28263j extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28249b f74169a;

        C28263j(C28249b bVar) {
            this.f74169a = bVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "throwable");
            if (!(th instanceof CancellationException)) {
                this.f74169a.mo47028c(new Exception(th));
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$k */
    static final class C28264k extends C52712l implements C52682m<C11866f, List<? extends C28333l>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28249b f74170a;

        C28264k(C28249b bVar) {
            this.f74170a = bVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            List list = (List) obj2;
            C52711k.m112240b(fVar, "$receiver");
            C52711k.m112240b(list, "list");
            fVar.mo22552a(this.f74170a.mo56557k(), new C52671b<SearchState, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C28264k f74171a;

                {
                    this.f74171a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    SearchState searchState = (SearchState) obj;
                    C52711k.m112240b(searchState, "it");
                    C11853b bVar = ((C28294f) searchState.getListState().getPayload()).f31449a;
                    List b = C27735i.m66404b(C27735i.m66402a(searchState.getListState().getList()));
                    C26840g x = this.f74171a.f74170a.mo58250x();
                    if (x != null) {
                        ((C28244c) x).mo56662e(b);
                        this.f74171a.f74170a.mo47026b(b, bVar.f31440a);
                        if (bVar.f31440a) {
                            C26840g x2 = this.f74171a.f74170a.mo58250x();
                            if (x2 != null) {
                                C28244c cVar = (C28244c) x2;
                                C41407b bVar2 = cVar.f74121b;
                                if (bVar2.mo84082b(bVar2.f104969b, cVar.mo48636c())) {
                                    bVar2.f104968a.ar_();
                                }
                            } else {
                                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
                            }
                        }
                        if (this.f74171a.f74170a.f74140d != null) {
                            C28249b bVar3 = this.f74171a.f74170a;
                            C30332aw awVar = this.f74171a.f74170a.f74140d;
                            if (awVar == null) {
                                C52711k.m112234a();
                            }
                            bVar3.onVideoEvent(awVar);
                            this.f74171a.f74170a.f74140d = null;
                        }
                        return C52860x.f131107a;
                    }
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$l */
    static final class C28266l extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28249b f74172a;

        C28266l(C28249b bVar) {
            this.f74172a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            this.f74172a.mo47031e();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$m */
    static final class C28267m extends C52712l implements C52682m<C11866f, Boolean, C52860x> {

        /* renamed from: a */
        public static final C28267m f74173a = new C28267m();

        C28267m() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            ((Boolean) obj2).booleanValue();
            C52711k.m112240b(fVar, "$receiver");
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$n */
    static final class C28268n implements SearchStateListener {

        /* renamed from: a */
        final /* synthetic */ C28249b f74174a;

        C28268n(C28249b bVar) {
            this.f74174a = bVar;
        }

        public final void onPageHidden() {
            SearchStateViewModel$SearchStateListener$$CC.onPageHidden(this);
        }

        public final void onPageResume() {
            SearchStateViewModel$SearchStateListener$$CC.onPageResume(this);
        }

        public final void onContentVisible(boolean z) {
            if (!z) {
                MusicPlayHelper musicPlayHelper = this.f74174a.f74139c;
                if (musicPlayHelper != null) {
                    musicPlayHelper.mo56585a();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$o */
    static final class C28269o extends C52712l implements C52671b<SearchState, C0013i<C52860x>> {

        /* renamed from: a */
        final /* synthetic */ C28249b f74175a;

        /* renamed from: b */
        final /* synthetic */ boolean f74176b;

        C28269o(C28249b bVar, boolean z) {
            this.f74175a = bVar;
            this.f74176b = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final SearchState searchState = (SearchState) obj;
            C52711k.m112240b(searchState, "it");
            return C0013i.m16a((Callable<TResult>) new Callable<TResult>(this) {

                /* renamed from: a */
                final /* synthetic */ C28269o f74177a;

                {
                    this.f74177a = r1;
                }

                public final /* synthetic */ Object call() {
                    C26112af afVar;
                    C28249b bVar = this.f74177a.f74175a;
                    String l = this.f74177a.f74175a.mo56549l();
                    String str = ((C28294f) searchState.getListState().getPayload()).f74203c;
                    String str2 = this.f74177a.f74175a.f74960l;
                    boolean z = this.f74177a.f74176b;
                    SearchApiResult searchApiResult = ((C28294f) searchState.getListState().getPayload()).f74204d;
                    if (searchApiResult != null) {
                        afVar = searchApiResult.adInfo;
                    } else {
                        afVar = null;
                    }
                    bVar.mo58242a(l, str, str2, z, afVar);
                    return C52860x.f131107a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.b$p */
    static final class C28271p extends C52712l implements C52671b<SearchState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28249b f74179a;

        C28271p(C28249b bVar) {
            this.f74179a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SearchState searchState = (SearchState) obj;
            C52711k.m112240b(searchState, "it");
            C10722c a = C28534c.m67702a(this.f74179a.mo58252z(), ((C28294f) searchState.getListState().getPayload()).f74204d, null, 2, null);
            if (a != null) {
                this.f74179a.mo58238a(a);
            } else {
                this.f74179a.mo58233F();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final View mo56545a(int i) {
        if (this.f74138R == null) {
            this.f74138R = new HashMap();
        }
        View view = (View) this.f74138R.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f74138R.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: b_ */
    public final boolean mo56547b_(boolean z) {
        return true;
    }

    /* renamed from: j */
    public final void mo56548j() {
        if (this.f74138R != null) {
            this.f74138R.clear();
        }
    }

    /* renamed from: k */
    public final SearchJediViewModel mo56557k() {
        return (SearchJediViewModel) this.f74135O.getValue();
    }

    /* renamed from: l */
    public final String mo56549l() {
        return "general_search";
    }

    /* renamed from: n */
    public final void mo56550n() {
    }

    /* renamed from: p */
    public final boolean mo56558p() {
        return false;
    }

    public final void onResume() {
        super.onResume();
        if (getUserVisibleHint()) {
            m67170J();
        }
    }

    public final void onStop() {
        super.onStop();
        if (getUserVisibleHint()) {
            m67171K();
        }
    }

    public final void aJ_() {
        mo22552a(mo56557k(), new C28271p(this));
        mo58236I();
    }

    public final void onDestroyView() {
        super.onDestroyView();
        SearchStateViewModel searchStateViewModel = this.f74136P;
        if (searchStateViewModel != null) {
            searchStateViewModel.searchState.removeObservers(this);
        }
        mo56548j();
    }

    public C28249b() {
        C52760c a = C52728w.m112245a(SearchJediViewModel.class);
        C52670a aVar = new C28250a(a);
        this.f74135O = new lifecycleAwareLazy(this, aVar, new C28252c(this, aVar, a, C28251b.INSTANCE));
        SearchObserver listener = new SearchObserver().setListener(new C28268n(this));
        C52711k.m112236a((Object) listener, "SearchStateViewModel.Sea…          }\n            }");
        this.f74137Q = listener;
    }

    /* renamed from: J */
    private final void m67170J() {
        if (isViewValid()) {
            C26840g x = mo58250x();
            if (x == null) {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
            } else if (((C28244c) x).mo56663g()) {
                C26840g x2 = mo58250x();
                if (x2 != null) {
                    C28301a aVar = ((C28244c) x2).f74122c;
                    if (aVar != null) {
                        aVar.mo56704h();
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
                }
            }
        }
    }

    /* renamed from: K */
    private final void m67171K() {
        if (isViewValid()) {
            C26840g x = mo58250x();
            if (x == null) {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
            } else if (((C28244c) x).mo56663g()) {
                C26840g x2 = mo58250x();
                if (x2 != null) {
                    C28301a aVar = ((C28244c) x2).f74122c;
                    if (aVar != null) {
                        aVar.mo56703g();
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo56568m() {
        SearchJediViewModel k = mo56557k();
        C28295g gVar = new C28295g(mo58234G(), 1, this.f74964p, mo58251y(), this.f74967s, null, null, 96, null);
        k.mo56672a(gVar);
        mo56557k().mo56674f();
    }

    /* renamed from: o */
    public final void mo56551o() {
        mo58239a((C26840g<D>) new C28244c<D>(mo58245s(), this.f74957e, new C28254d(this), this));
        mo58245s().setLayoutManager(new SearchJediMixFeedFragment$initAdapter$layoutManager$1(this, getContext(), 2));
        mo58245s().mo4798a((C1331h) new C28243b(2, (int) C9432q.m18687b(getContext(), 1.0f), false));
    }

    /* renamed from: b */
    public final void mo56664b(boolean z) {
        mo22552a(mo56557k(), new C28269o(this, z));
    }

    @C53771m
    public final void onDynamicEvent(C24529c cVar) {
        C52711k.m112240b(cVar, "event");
        if (cVar.f64950a == 0) {
            m67170J();
        } else {
            m67171K();
        }
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        MusicPlayHelper musicPlayHelper = this.f74139c;
        if (musicPlayHelper != null) {
            musicPlayHelper.mo56585a();
        }
        if (!z) {
            m67171K();
        } else {
            m67170J();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0089 A[LOOP:0: B:19:0x0054->B:32:0x0089, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x008d A[EDGE_INSN: B:54:0x008d->B:34:0x008d ?: BREAK  , SYNTHETIC] */
    @org.greenrobot.eventbus.C53771m
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onVideoEvent(com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw r8) {
        /*
            r7 = this;
            java.lang.String r0 = "event"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            boolean r0 = r7.isViewValid()
            if (r0 != 0) goto L_0x000c
            return
        L_0x000c:
            int r0 = r8.f79228a
            r1 = 13
            r2 = 0
            if (r0 == r1) goto L_0x00bb
            r1 = 21
            if (r0 == r1) goto L_0x0019
            goto L_0x00e1
        L_0x0019:
            java.lang.Object r0 = r8.f79229b
            if (r0 == 0) goto L_0x00b3
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r0
            if (r0 != 0) goto L_0x0022
            return
        L_0x0022:
            int r1 = r8.f79235h
            r3 = 65458(0xffb2, float:9.1726E-41)
            if (r1 == r3) goto L_0x00b2
            int r1 = r8.f79235h
            r3 = 65456(0xffb0, float:9.1723E-41)
            if (r1 != r3) goto L_0x0032
            goto L_0x00b2
        L_0x0032:
            com.ss.android.ugc.aweme.common.a.g r1 = r7.mo58250x()
            if (r1 == 0) goto L_0x00aa
            com.ss.android.ugc.aweme.discover.jedi.a.c r1 = (com.p683ss.android.ugc.aweme.discover.jedi.p1653a.C28244c) r1
            java.lang.String r0 = r0.getAid()
            java.lang.String r3 = "awemeScrollTo.aid"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
            java.lang.String r3 = "awemeId"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r3)
            java.util.List r1 = r1.f70670n
            java.lang.String r3 = "mItems"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            java.util.Iterator r1 = r1.iterator()
            r3 = 0
        L_0x0054:
            boolean r4 = r1.hasNext()
            r5 = -1
            if (r4 == 0) goto L_0x008c
            java.lang.Object r4 = r1.next()
            com.ss.android.ugc.aweme.discover.mixfeed.l r4 = (com.p683ss.android.ugc.aweme.discover.mixfeed.C28333l) r4
            java.lang.String r6 = "it"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r6)
            boolean r6 = r4.mo56735a()
            if (r6 == 0) goto L_0x0085
            r6 = r0
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r4.getAweme()
            if (r4 == 0) goto L_0x007a
            java.lang.String r4 = r4.getAid()
            goto L_0x007b
        L_0x007a:
            r4 = 0
        L_0x007b:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.equals(r6, r4)
            if (r4 == 0) goto L_0x0085
            r4 = 1
            goto L_0x0086
        L_0x0085:
            r4 = 0
        L_0x0086:
            if (r4 == 0) goto L_0x0089
            goto L_0x008d
        L_0x0089:
            int r3 = r3 + 1
            goto L_0x0054
        L_0x008c:
            r3 = -1
        L_0x008d:
            if (r3 == r5) goto L_0x00a7
            android.support.v7.widget.RecyclerView r8 = r7.mo58245s()
            android.support.v7.widget.RecyclerView$i r8 = r8.getLayoutManager()
            if (r8 == 0) goto L_0x009f
            android.support.v7.widget.GridLayoutManager r8 = (android.support.p043v7.widget.GridLayoutManager) r8
            r8.mo4721a(r3, r2)
            return
        L_0x009f:
            d.u r8 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager"
            r8.<init>(r0)
            throw r8
        L_0x00a7:
            r7.f74140d = r8
            goto L_0x00e1
        L_0x00aa:
            d.u r8 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter"
            r8.<init>(r0)
            throw r8
        L_0x00b2:
            return
        L_0x00b3:
            d.u r8 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme"
            r8.<init>(r0)
            throw r8
        L_0x00bb:
            android.support.v7.widget.RecyclerView r8 = r7.mo58245s()
            int r8 = r8.getChildCount()
        L_0x00c3:
            if (r2 >= r8) goto L_0x00e1
            android.support.v7.widget.RecyclerView r0 = r7.mo58245s()
            android.view.View r0 = r0.getChildAt(r2)
            android.support.v7.widget.RecyclerView r1 = r7.mo58245s()
            android.support.v7.widget.RecyclerView$v r0 = r1.mo4812b(r0)
            boolean r1 = r0 instanceof com.p683ss.android.ugc.aweme.feed.adapter.C30009a
            if (r1 == 0) goto L_0x00de
            com.ss.android.ugc.aweme.feed.adapter.a r0 = (com.p683ss.android.ugc.aweme.feed.adapter.C30009a) r0
            r0.mo58503n()
        L_0x00de:
            int r2 = r2 + 1
            goto L_0x00c3
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.jedi.C28249b.onVideoEvent(com.ss.android.ugc.aweme.feed.h.aw):void");
    }

    /* renamed from: a */
    public final void mo56546a(String str) {
        C52711k.m112240b(str, "keyword");
        C26840g x = mo58250x();
        if (x != null) {
            C28244c cVar = (C28244c) x;
            C41440e eVar = this.f74957e;
            if (eVar == null) {
                C52711k.m112234a();
            }
            C52711k.m112240b(eVar, "param");
            cVar.f74124e = eVar;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
    }

    /* renamed from: a */
    public final void mo47018a(List<? extends C28333l> list, boolean z) {
        C52711k.m112240b(list, "list");
        super.mo47018a(list, z);
        m67170J();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C52711k.m112234a();
        }
        this.f74136P = (SearchStateViewModel) C0214z.m440a(activity).mo359a(SearchStateViewModel.class);
        SearchStateViewModel searchStateViewModel = this.f74136P;
        if (searchStateViewModel == null) {
            C52711k.m112234a();
        }
        searchStateViewModel.searchState.observe(this, this.f74137Q);
    }

    /* renamed from: a */
    public final void mo56552a(int i, C41412a aVar) {
        super.mo56552a(i, aVar);
        if (C28272c.m67193a(getActivity())) {
            SearchJediViewModel k = mo56557k();
            C28295g gVar = new C28295g(this.f74960l, i, this.f74964p, mo58251y(), this.f74967s, null, this.f74957e, 32, null);
            k.mo56672a(gVar);
            mo56557k().mo56673e();
            C26840g x = mo58250x();
            if (x != null) {
                C41454h hVar = ((C28244c) x).f74120a;
                if (hVar.f105086f <= 0) {
                    hVar.f105085d.post(new Runnable(1) {

                        /* renamed from: a */
                        final /* synthetic */ int f105087a;

                        public final void run() {
                            try {
                                if (C41454h.f105081e.compareAndSet(0, 1)) {
                                    int i = this.f105087a - C41454h.this.f105086f;
                                    for (int i2 = 0; i2 < i && C41454h.f105081e.get() != 2; i2++) {
                                        if (C41454h.f105081e.get() == 1) {
                                            C41454h.this.f105084c.offer(C41454h.this.f105083b.mo56661b(C41454h.this.f105082a));
                                            C41454h.this.f105086f++;
                                        }
                                    }
                                    C41454h.f105081e.compareAndSet(1, 0);
                                }
                            } finally {
                                C41454h.f105081e.compareAndSet(1, 0);
                            }
                        }

                        {
                            this.f105087a = r2;
                        }
                    });
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
            }
        } else {
            mo58232E();
        }
    }

    /* renamed from: a */
    public final void mo56553a(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.mo56553a(view, bundle);
        SearchJediViewModel k = mo56557k();
        C11797e eVar = this;
        C26840g x = mo58250x();
        if (x != null) {
            C28291c.m67205a(k, eVar, (C11837a) x, new C28255e(new C28262i(this), new C28257g(this), new C28258h(this, view)), new C28256f(new C28266l(this), new C28263j(this), new C28264k(this)), C28267m.f74173a);
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            this.f74139c = (MusicPlayHelper) C0214z.m440a(activity).mo359a(MusicPlayHelper.class);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.bytedance.jedi.arch.ext.list.DiffableAdapter<com.ss.android.ugc.aweme.discover.mixfeed.SearchMixFeed>");
    }
}
