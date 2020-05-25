package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0210y.C0212b;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.MtEmptyView;
import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11788aa;
import com.bytedance.jedi.arch.C11791ad;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.C11797e;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.C11872h;
import com.bytedance.jedi.arch.C11872h.C11873a;
import com.bytedance.jedi.arch.C11910j;
import com.bytedance.jedi.arch.C11931r;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.C11934u;
import com.bytedance.jedi.arch.C11937x;
import com.bytedance.jedi.arch.C11938y;
import com.bytedance.jedi.arch.C11939z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.C11837a;
import com.bytedance.jedi.arch.ext.list.C11854c;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.base.arch.C23473i;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout.C23596b;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.widget.NestedScrollingRecyclerView;
import com.p683ss.android.ugc.aweme.discover.adapter.C27797ad;
import com.p683ss.android.ugc.aweme.discover.adapter.C27826at;
import com.p683ss.android.ugc.aweme.discover.helper.MusicPlayHelper;
import com.p683ss.android.ugc.aweme.discover.jedi.viewmodel.C28293e;
import com.p683ss.android.ugc.aweme.discover.jedi.viewmodel.C28294f;
import com.p683ss.android.ugc.aweme.discover.jedi.viewmodel.C28295g;
import com.p683ss.android.ugc.aweme.discover.model.SearchMusic;
import com.p683ss.android.ugc.aweme.discover.viewmodel.SearchMusicListState;
import com.p683ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p064c.p065a.p069b.C1690c;
import p2628d.C52860x;
import p2628d.p2639f.C52669a;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52767h;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.aq */
public final class C28488aq extends C23526a implements C11791ad<C23473i>, C11872h {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f74896a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28488aq.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/discover/viewmodel/SearchMusicViewModel;"))};

    /* renamed from: d */
    public static final C28493d f74897d = new C28493d(null);

    /* renamed from: b */
    C27826at f74898b;

    /* renamed from: c */
    public final C23473i f74899c = new C23473i();

    /* renamed from: e */
    private String f74900e;

    /* renamed from: j */
    private int f74901j;

    /* renamed from: k */
    private MusicPlayHelper f74902k;

    /* renamed from: l */
    private final lifecycleAwareLazy f74903l;

    /* renamed from: m */
    private HashMap f74904m;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.aq$a */
    public static final class C28489a extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C52760c f74905a;

        public C28489a(C52760c cVar) {
            this.f74905a = cVar;
            super(0);
        }

        public final String invoke() {
            String name = C52669a.m112219a(this.f74905a).getName();
            C52711k.m112236a((Object) name, "viewModelClass.java.name");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.aq$b */
    public static final class C28490b extends C52712l implements C52682m<SearchMusicListState, Bundle, SearchMusicListState> {
        public static final C28490b INSTANCE = new C28490b();

        public C28490b() {
            super(2);
        }

        public final SearchMusicListState invoke(SearchMusicListState searchMusicListState, Bundle bundle) {
            C52711k.m112240b(searchMusicListState, "$receiver");
            return searchMusicListState;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.aq$c */
    public static final class C28491c extends C52712l implements C52670a<SearchMusicViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f74906a;

        /* renamed from: b */
        final /* synthetic */ C52670a f74907b;

        /* renamed from: c */
        final /* synthetic */ C52760c f74908c;

        /* renamed from: d */
        final /* synthetic */ C52682m f74909d;

        public C28491c(Fragment fragment, C52670a aVar, C52760c cVar, C52682m mVar) {
            this.f74906a = fragment;
            this.f74907b = aVar;
            this.f74908c = cVar;
            this.f74909d = mVar;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3, types: [com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel, java.lang.Object]
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
        public final com.p683ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel invoke() {
            /*
                r3 = this;
                android.support.v4.app.Fragment r0 = r3.f74906a
                android.support.v4.app.Fragment r1 = r3.f74906a
                com.bytedance.jedi.arch.ad r1 = (com.bytedance.jedi.arch.C11791ad) r1
                android.arch.lifecycle.y$b r1 = r1.mo22542a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r0, r1)
                d.f.a.a r1 = r3.f74907b
                java.lang.Object r1 = r1.invoke()
                java.lang.String r1 = (java.lang.String) r1
                d.k.c r2 = r3.f74908c
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                com.bytedance.jedi.arch.n r1 = r0.f31279c
                java.lang.Class<com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel> r2 = com.p683ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel.class
                com.bytedance.jedi.arch.m r1 = r1.mo22643a(r2)
                if (r1 == 0) goto L_0x0034
                java.lang.String r2 = "this"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                r1.binding(r0)
            L_0x0034:
                com.ss.android.ugc.aweme.discover.ui.aq$c$1 r1 = new com.ss.android.ugc.aweme.discover.ui.aq$c$1
                r1.<init>(r3)
                d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
                r0.mo22526a(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1659ui.C28488aq.C28491c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.aq$d */
    public static final class C28493d {
        private C28493d() {
        }

        public /* synthetic */ C28493d(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.aq$e */
    static final class C28494e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C28488aq f74911a;

        C28494e(C28488aq aqVar) {
            this.f74911a = aqVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f74911a.mo58162g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.aq$f */
    static final class C28495f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C28488aq f74912a;

        C28495f(C28488aq aqVar) {
            this.f74912a = aqVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f74912a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.aq$g */
    static final class C28496g implements C26846a {

        /* renamed from: a */
        final /* synthetic */ C28488aq f74913a;

        C28496g(C28488aq aqVar) {
            this.f74913a = aqVar;
        }

        public final void ar_() {
            SearchMusicViewModel e = this.f74913a.mo58161e();
            C52711k.m112240b(e, "$this$listLoadMore");
            e.f75787d.mo22567c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.aq$h */
    static final class C28497h implements C23596b {

        /* renamed from: a */
        final /* synthetic */ C28488aq f74914a;

        C28497h(C28488aq aqVar) {
            this.f74914a = aqVar;
        }

        /* renamed from: a */
        public final void mo47048a() {
            this.f74914a.mo58162g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.aq$i */
    public static final class C28498i implements C11854c<SearchMusic, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f74915a;

        /* renamed from: b */
        final /* synthetic */ C52682m f74916b;

        /* renamed from: c */
        final /* synthetic */ C52682m f74917c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f74918d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f74919e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends SearchMusic>, C52860x> f74920f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f74918d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f74919e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends SearchMusic>, C52860x> mo22603c() {
            return this.f74920f;
        }

        public C28498i(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f74915a = bVar;
            this.f74916b = mVar;
            this.f74917c = mVar2;
            this.f74918d = bVar;
            this.f74919e = mVar;
            this.f74920f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.aq$j */
    public static final class C28499j implements C11854c<SearchMusic, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f74921a;

        /* renamed from: b */
        final /* synthetic */ C52682m f74922b;

        /* renamed from: c */
        final /* synthetic */ C52682m f74923c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f74924d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f74925e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends SearchMusic>, C52860x> f74926f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f74924d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f74925e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends SearchMusic>, C52860x> mo22603c() {
            return this.f74926f;
        }

        public C28499j(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f74921a = bVar;
            this.f74922b = mVar;
            this.f74923c = mVar2;
            this.f74924d = bVar;
            this.f74925e = mVar;
            this.f74926f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.aq$k */
    static final class C28500k extends C52712l implements C52682m<C11866f, List<? extends SearchMusic>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28488aq f74927a;

        C28500k(C28488aq aqVar) {
            this.f74927a = aqVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            List list = (List) obj2;
            C52711k.m112240b(fVar, "$receiver");
            C52711k.m112240b(list, "it");
            fVar.mo22552a(this.f74927a.mo58161e(), new C52671b<SearchMusicListState, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C28500k f74928a;

                {
                    this.f74928a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    boolean z;
                    SearchMusicListState searchMusicListState = (SearchMusicListState) obj;
                    C52711k.m112240b(searchMusicListState, "it");
                    C28488aq aqVar = this.f74928a.f74927a;
                    List list = searchMusicListState.getListState().getList();
                    boolean z2 = ((C28294f) searchMusicListState.getListState().getPayload()).f31449a.f31440a;
                    if (aqVar.isViewValid()) {
                        Collection collection = list;
                        if (collection == null || collection.isEmpty()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            aqVar.mo58164k();
                        } else {
                            aqVar.mo58163j();
                            C27826at atVar = aqVar.f74898b;
                            if (atVar == null) {
                                C52711k.m112237a("adapter");
                            }
                            atVar.mo54798c(true);
                            if (z2) {
                                atVar.ao_();
                            } else {
                                atVar.an_();
                            }
                            ((DmtStatusView) aqVar.mo58160a(R.id.csl)).mo19209d();
                            C27826at atVar2 = aqVar.f74898b;
                            if (atVar2 == null) {
                                C52711k.m112237a("adapter");
                            }
                            List arrayList = new ArrayList();
                            arrayList.addAll(collection);
                            atVar2.mo50303a(arrayList);
                        }
                    }
                    return C52860x.f131107a;
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.aq$l */
    static final class C28502l extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28488aq f74929a;

        C28502l(C28488aq aqVar) {
            this.f74929a = aqVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            C28488aq aqVar = this.f74929a;
            NestedScrollingRecyclerView nestedScrollingRecyclerView = (NestedScrollingRecyclerView) aqVar.mo58160a(R.id.ca3);
            C52711k.m112236a((Object) nestedScrollingRecyclerView, "recyclerView");
            if (nestedScrollingRecyclerView.getChildCount() > 0) {
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) aqVar.mo58160a(R.id.cau);
                C52711k.m112236a((Object) swipeRefreshLayout, "refreshLayout");
                swipeRefreshLayout.setRefreshing(true);
            } else {
                ((DmtStatusView) aqVar.mo58160a(R.id.csl)).mo19212f();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.aq$m */
    static final class C28503m extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28488aq f74930a;

        C28503m(C28488aq aqVar) {
            this.f74930a = aqVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "it");
            this.f74930a.mo58164k();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.aq$n */
    static final class C28504n extends C52712l implements C52682m<C11866f, List<? extends SearchMusic>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28488aq f74931a;

        C28504n(C28488aq aqVar) {
            this.f74931a = aqVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            List list = (List) obj2;
            C52711k.m112240b(fVar, "$receiver");
            C52711k.m112240b(list, "it");
            fVar.mo22552a(this.f74931a.mo58161e(), new C52671b<SearchMusicListState, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C28504n f74932a;

                {
                    this.f74932a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    SearchMusicListState searchMusicListState = (SearchMusicListState) obj;
                    C52711k.m112240b(searchMusicListState, "it");
                    C28488aq aqVar = this.f74932a.f74931a;
                    List list = searchMusicListState.getListState().getList();
                    boolean z = ((C28294f) searchMusicListState.getListState().getPayload()).f31449a.f31440a;
                    if (aqVar.isViewValid()) {
                        aqVar.mo58163j();
                        C27826at atVar = aqVar.f74898b;
                        if (atVar == null) {
                            C52711k.m112237a("adapter");
                        }
                        if (z) {
                            atVar.ao_();
                        } else {
                            atVar.an_();
                        }
                        atVar.mo50304b(list);
                    }
                    return C52860x.f131107a;
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.aq$o */
    static final class C28506o extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28488aq f74933a;

        C28506o(C28488aq aqVar) {
            this.f74933a = aqVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            C27826at atVar = this.f74933a.f74898b;
            if (atVar == null) {
                C52711k.m112237a("adapter");
            }
            atVar.am_();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.aq$p */
    static final class C28507p extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28488aq f74934a;

        C28507p(C28488aq aqVar) {
            this.f74934a = aqVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "it");
            C28488aq aqVar = this.f74934a;
            if (aqVar.isViewValid()) {
                aqVar.mo58163j();
                C27826at atVar = aqVar.f74898b;
                if (atVar == null) {
                    C52711k.m112237a("adapter");
                }
                atVar.co_();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.aq$q */
    static final /* synthetic */ class C28508q extends C52710j implements C52670a<C52860x> {
        C28508q(C28488aq aqVar) {
            super(0, aqVar);
        }

        public final String getName() {
            return "showNetworkError";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(C28488aq.class);
        }

        public final String getSignature() {
            return "showNetworkError()V";
        }

        public final /* synthetic */ Object invoke() {
            ((C28488aq) this.receiver).mo58165l();
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final View mo58160a(int i) {
        if (this.f74904m == null) {
            this.f74904m = new HashMap();
        }
        View view = (View) this.f74904m.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f74904m.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public final SearchMusicViewModel mo58161e() {
        return (SearchMusicViewModel) this.f74903l.getValue();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0212b mo22542a() {
        return this.f74899c;
    }

    /* renamed from: c */
    public final C11910j mo22553c() {
        return C11873a.m24226a(this);
    }

    /* renamed from: d */
    public final C11931r<C11866f> mo22554d() {
        return C11873a.m24228b(this);
    }

    /* renamed from: f */
    public final boolean mo22555f() {
        return C11873a.m24231e(this);
    }

    /* renamed from: h */
    public final C0184k mo22626h() {
        return C11873a.m24229c(this);
    }

    /* renamed from: i */
    public final /* synthetic */ C11796d mo22645i() {
        return C11873a.m24230d(this);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f74904m != null) {
            this.f74904m.clear();
        }
    }

    public final void onPause() {
        super.onPause();
        MusicPlayHelper musicPlayHelper = this.f74902k;
        if (musicPlayHelper != null) {
            musicPlayHelper.mo56585a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final void mo58163j() {
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo58160a(R.id.cau);
        if (!isViewValid()) {
            swipeRefreshLayout = null;
        }
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
    }

    public C28488aq() {
        C52760c a = C52728w.m112245a(SearchMusicViewModel.class);
        C52670a aVar = new C28489a(a);
        this.f74903l = new lifecycleAwareLazy(this, aVar, new C28491c(this, aVar, a, C28490b.INSTANCE));
    }

    /* renamed from: k */
    public final void mo58164k() {
        if (isViewValid()) {
            mo58163j();
            C27826at atVar = this.f74898b;
            if (atVar == null) {
                C52711k.m112237a("adapter");
            }
            atVar.mo54798c(false);
            C27826at atVar2 = this.f74898b;
            if (atVar2 == null) {
                C52711k.m112237a("adapter");
            }
            atVar2.mo50303a(null);
            ((DmtStatusView) mo58160a(R.id.csl)).mo19213g();
        }
    }

    /* renamed from: l */
    public final void mo58165l() {
        if (isViewValid()) {
            mo58163j();
            C27826at atVar = this.f74898b;
            if (atVar == null) {
                C52711k.m112237a("adapter");
            }
            atVar.mo54798c(false);
            C27826at atVar2 = this.f74898b;
            if (atVar2 == null) {
                C52711k.m112237a("adapter");
            }
            atVar2.mo50303a(null);
            ((DmtStatusView) mo58160a(R.id.csl)).mo19214h();
            C10691a.m21542b(getContext(), (int) R.string.cg1).mo19066a();
        }
    }

    /* renamed from: g */
    public final void mo58162g() {
        if (!C28509ar.m67638a(getContext())) {
            C18842a.m45933a(new C28510as(new C28508q(this)), 100);
            return;
        }
        SearchMusicViewModel e = mo58161e();
        String str = this.f74900e;
        if (str == null) {
            C52711k.m112237a("musicAuthor");
        }
        C28295g gVar = new C28295g(str, 1, null, 0, 0, null, null, 108, null);
        e.mo58521a(gVar);
        C28293e.m67206a(mo58161e());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r3 == null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r3) {
        /*
            r2 = this;
            super.onCreate(r3)
            android.os.Bundle r3 = r2.getArguments()
            if (r3 == 0) goto L_0x0011
            java.lang.String r0 = "param_music_author"
            java.lang.String r3 = r3.getString(r0)
            if (r3 != 0) goto L_0x0013
        L_0x0011:
            java.lang.String r3 = ""
        L_0x0013:
            r2.f74900e = r3
            android.os.Bundle r3 = r2.getArguments()
            r0 = 0
            if (r3 == 0) goto L_0x0022
            java.lang.String r1 = "param_holder_postion"
            int r0 = r3.getInt(r1, r0)
        L_0x0022:
            r2.f74901j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1659ui.C28488aq.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C11873a.m24227a(this, vm1, bVar);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        NormalTitleBar normalTitleBar = (NormalTitleBar) mo58160a(R.id.d0s);
        C52711k.m112236a((Object) normalTitleBar, "titleBar");
        DmtTextView titleView = normalTitleBar.getTitleView();
        C52711k.m112236a((Object) titleView, "titleBar.titleView");
        Context context = getContext();
        if (context == null) {
            C52711k.m112234a();
        }
        Object[] objArr = new Object[1];
        String str = this.f74900e;
        if (str == null) {
            C52711k.m112237a("musicAuthor");
        }
        objArr[0] = str;
        String string = context.getString(R.string.ce3, objArr);
        C52711k.m112236a((Object) string, "context!!.getString(R.st….music_from, musicAuthor)");
        String a = C2240a.m6772a(string, Arrays.copyOf(new Object[0], 0));
        C52711k.m112236a((Object) a, "java.lang.String.format(format, *args)");
        titleView.setText(a);
        NormalTitleBar normalTitleBar2 = (NormalTitleBar) mo58160a(R.id.d0s);
        C52711k.m112236a((Object) normalTitleBar2, "titleBar");
        normalTitleBar2.getStartBtn().setOnClickListener(new C28495f(this));
        ((NormalTitleBar) mo58160a(R.id.d0s)).mo19128a(true);
        C27797ad adVar = new C27797ad(false);
        adVar.f73043f = "artist_card_detail";
        adVar.f73042e = this.f74901j;
        String str2 = this.f74900e;
        if (str2 == null) {
            C52711k.m112237a("musicAuthor");
        }
        C27826at atVar = new C27826at(null, adVar, str2, null, 8, null);
        this.f74898b = atVar;
        C27826at atVar2 = this.f74898b;
        if (atVar2 == null) {
            C52711k.m112237a("adapter");
        }
        atVar2.f70682s = getResources().getColor(R.color.a0_);
        C27826at atVar3 = this.f74898b;
        if (atVar3 == null) {
            C52711k.m112237a("adapter");
        }
        atVar3.mo54788a((C26846a) new C28496g(this));
        ((SwipeRefreshLayout) mo58160a(R.id.cau)).setOnRefreshListener(new C28497h(this));
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo58160a(R.id.cau);
        C52711k.m112236a((Object) swipeRefreshLayout, "refreshLayout");
        swipeRefreshLayout.setEnabled(false);
        NestedScrollingRecyclerView nestedScrollingRecyclerView = (NestedScrollingRecyclerView) mo58160a(R.id.ca3);
        C52711k.m112236a((Object) nestedScrollingRecyclerView, "recyclerView");
        nestedScrollingRecyclerView.setLayoutManager(new WrapLinearLayoutManager(getContext(), 1, false));
        NestedScrollingRecyclerView nestedScrollingRecyclerView2 = (NestedScrollingRecyclerView) mo58160a(R.id.ca3);
        C52711k.m112236a((Object) nestedScrollingRecyclerView2, "recyclerView");
        C27826at atVar4 = this.f74898b;
        if (atVar4 == null) {
            C52711k.m112237a("adapter");
        }
        nestedScrollingRecyclerView2.setAdapter(atVar4);
        MtEmptyView a2 = MtEmptyView.m21697a(getContext());
        a2.setStatus(new C10723a(a2.getContext()).mo19277a((int) R.drawable.ar0).mo19280b((int) R.string.f5w).mo19282c(R.string.f5x).f28711a);
        ((DmtStatusView) mo58160a(R.id.csl)).setBuilder(C10719a.m21676a(getContext()).mo19227a(R.string.f5o, R.string.f5k, R.string.f5u, new C28494e(this)).mo19231b((View) a2));
        SearchMusicViewModel e = mo58161e();
        C11797e eVar = this;
        C27826at atVar5 = this.f74898b;
        if (atVar5 == null) {
            C52711k.m112237a("adapter");
        }
        C11837a aVar = atVar5;
        C11854c iVar = new C28498i(new C28502l(this), new C28503m(this), new C28500k(this));
        C11854c jVar = new C28499j(new C28506o(this), new C28507p(this), new C28504n(this));
        C52711k.m112240b(e, "$this$listSubscribe");
        C52711k.m112240b(eVar, "subscriber");
        C52711k.m112240b(aVar, "adapter");
        ListMiddleware.m24163a(e.f75787d, eVar, aVar, false, eVar.mo22555f(), iVar, jVar, null, null, null, null, 896, null);
        mo58162g();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.f74902k = (MusicPlayHelper) C0214z.m440a(activity).mo359a(MusicPlayHelper.class);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.bru, viewGroup, false);
    }

    /* renamed from: a */
    public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C11873a.m24220a(this, jediViewModel, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A> C1690c mo22547a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C11866f, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C11873a.m24221a(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B> C1690c mo22549a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C11934u<C11938y<A, B>> uVar, C52686q<? super C11866f, ? super A, ? super B, C52860x> qVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(qVar, "subscriber");
        return C11873a.m24223a(this, jediViewModel, jVar, jVar2, uVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, T> C1690c mo22548a(JediViewModel<S> jediViewModel, C52771j<S, ? extends C11787a<? extends T>> jVar, C11934u<C11937x<C11787a<T>>> uVar, C52682m<? super C11866f, ? super Throwable, C52860x> mVar, C52671b<? super C11866f, C52860x> bVar, C52682m<? super C11866f, ? super T, C52860x> mVar2) {
        C52711k.m112240b(jediViewModel, "$this$asyncSubscribe");
        C52711k.m112240b(jVar, "prop");
        C52711k.m112240b(uVar, "config");
        return C11873a.m24222a((C11872h) this, jediViewModel, jVar, uVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C> C1690c mo22550a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C11934u<C11939z<A, B, C>> uVar, C52687r<? super C11866f, ? super A, ? super B, ? super C, C52860x> rVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(rVar, "subscriber");
        return C11873a.m24224a((C11872h) this, jediViewModel, jVar, jVar2, jVar3, uVar, rVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C, D> C1690c mo22551a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C52771j<S, ? extends D> jVar4, C11934u<C11788aa<A, B, C, D>> uVar, C52688s<? super C11866f, ? super A, ? super B, ? super C, ? super D, C52860x> sVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(jVar4, "prop4");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(sVar, "subscriber");
        return C11873a.m24225a(this, jediViewModel, jVar, jVar2, jVar3, jVar4, uVar, sVar);
    }
}
