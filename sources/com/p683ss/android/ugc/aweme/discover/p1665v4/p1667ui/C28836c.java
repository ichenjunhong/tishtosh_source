package com.p683ss.android.ugc.aweme.discover.p1665v4.p1667ui;

import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.content.C0726c;
import android.support.p030v4.widget.SwipeRefreshLayout;
import android.support.p030v4.widget.SwipeRefreshLayout.C1091b;
import android.support.p043v7.view.C1221d;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.jedi.arch.C11797e;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.ext.list.C11854c;
import com.bytedance.jedi.arch.ext.list.C11865l;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.p683ss.android.ugc.aweme.base.arch.C23462b;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverPlaylistUpdateParam;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverV4NewTrendingStruct;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter;
import com.p683ss.android.ugc.aweme.discover.p1665v4.p1666a.C28783b;
import com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel.DiscoverV4NewTrendingViewModle;
import com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel.DiscoverV4TrendingState;
import com.p683ss.android.ugc.aweme.playlist.p2057a.C38923d;
import com.p683ss.android.ugc.aweme.views.FpsRecyclerView;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
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

/* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.c */
public final class C28836c extends C23462b implements C28872e {

    /* renamed from: b */
    static final /* synthetic */ C52767h[] f75558b = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28836c.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/discover/v4/viewmodel/DiscoverV4NewTrendingViewModle;"))};

    /* renamed from: c */
    public C28783b f75559c;

    /* renamed from: d */
    private final lifecycleAwareLazy f75560d;

    /* renamed from: e */
    private final String f75561e = DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST();

    /* renamed from: j */
    private HashMap f75562j;

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.c$a */
    public static final class C28837a extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C52760c f75563a;

        public C28837a(C52760c cVar) {
            this.f75563a = cVar;
            super(0);
        }

        public final String invoke() {
            String name = C52669a.m112219a(this.f75563a).getName();
            C52711k.m112236a((Object) name, "viewModelClass.java.name");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.c$b */
    public static final class C28838b extends C52712l implements C52682m<DiscoverV4TrendingState, Bundle, DiscoverV4TrendingState> {
        public static final C28838b INSTANCE = new C28838b();

        public C28838b() {
            super(2);
        }

        public final DiscoverV4TrendingState invoke(DiscoverV4TrendingState discoverV4TrendingState, Bundle bundle) {
            C52711k.m112240b(discoverV4TrendingState, "$receiver");
            return discoverV4TrendingState;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.c$c */
    public static final class C28839c extends C52712l implements C52670a<DiscoverV4NewTrendingViewModle> {

        /* renamed from: a */
        final /* synthetic */ Fragment f75564a;

        /* renamed from: b */
        final /* synthetic */ C52670a f75565b;

        /* renamed from: c */
        final /* synthetic */ C52760c f75566c;

        /* renamed from: d */
        final /* synthetic */ C52682m f75567d;

        public C28839c(Fragment fragment, C52670a aVar, C52760c cVar, C52682m mVar) {
            this.f75564a = fragment;
            this.f75565b = aVar;
            this.f75566c = cVar;
            this.f75567d = mVar;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4NewTrendingViewModle] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3, types: [java.lang.Object, com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4NewTrendingViewModle]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4NewTrendingViewModle, java.lang.Object]
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
        public final com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel.DiscoverV4NewTrendingViewModle invoke() {
            /*
                r3 = this;
                android.support.v4.app.Fragment r0 = r3.f75564a
                android.support.v4.app.Fragment r1 = r3.f75564a
                com.bytedance.jedi.arch.ad r1 = (com.bytedance.jedi.arch.C11791ad) r1
                android.arch.lifecycle.y$b r1 = r1.mo22542a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r0, r1)
                d.f.a.a r1 = r3.f75565b
                java.lang.Object r1 = r1.invoke()
                java.lang.String r1 = (java.lang.String) r1
                d.k.c r2 = r3.f75566c
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                com.bytedance.jedi.arch.n r1 = r0.f31279c
                java.lang.Class<com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4NewTrendingViewModle> r2 = com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel.DiscoverV4NewTrendingViewModle.class
                com.bytedance.jedi.arch.m r1 = r1.mo22643a(r2)
                if (r1 == 0) goto L_0x0034
                java.lang.String r2 = "this"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                r1.binding(r0)
            L_0x0034:
                com.ss.android.ugc.aweme.discover.v4.ui.c$c$1 r1 = new com.ss.android.ugc.aweme.discover.v4.ui.c$c$1
                r1.<init>(r3)
                d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
                r0.mo22526a(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1665v4.p1667ui.C28836c.C28839c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.c$d */
    public static final class C28841d implements C11854c<DiscoverV4NewTrendingStruct, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f75569a;

        /* renamed from: b */
        final /* synthetic */ C52682m f75570b;

        /* renamed from: c */
        final /* synthetic */ C52682m f75571c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f75572d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f75573e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends DiscoverV4NewTrendingStruct>, C52860x> f75574f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f75572d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f75573e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends DiscoverV4NewTrendingStruct>, C52860x> mo22603c() {
            return this.f75574f;
        }

        public C28841d(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f75569a = bVar;
            this.f75570b = mVar;
            this.f75571c = mVar2;
            this.f75572d = bVar;
            this.f75573e = mVar;
            this.f75574f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.c$e */
    public static final class C28842e extends C52712l implements C52682m<C11866f, List<? extends DiscoverV4NewTrendingStruct>, C52860x> {
        public static final C28842e INSTANCE = new C28842e();

        public C28842e() {
            super(2);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((C11866f) obj, (List) obj2);
            return C52860x.f131107a;
        }

        public final void invoke(C11866f fVar, List<? extends DiscoverV4NewTrendingStruct> list) {
            C52711k.m112240b(list, "it");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.c$f */
    public static final class C28843f implements C11854c<DiscoverV4NewTrendingStruct, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f75575a;

        /* renamed from: b */
        final /* synthetic */ C52682m f75576b;

        /* renamed from: c */
        final /* synthetic */ C52682m f75577c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f75578d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f75579e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends DiscoverV4NewTrendingStruct>, C52860x> f75580f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f75578d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f75579e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends DiscoverV4NewTrendingStruct>, C52860x> mo22603c() {
            return this.f75580f;
        }

        public C28843f(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f75575a = bVar;
            this.f75576b = mVar;
            this.f75577c = mVar2;
            this.f75578d = bVar;
            this.f75579e = mVar;
            this.f75580f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.c$g */
    static final class C28844g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C28836c f75581a;

        C28844g(C28836c cVar) {
            this.f75581a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f75581a.mo58434j();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.c$h */
    static final class C28845h implements C1091b {

        /* renamed from: a */
        final /* synthetic */ C28836c f75582a;

        C28845h(C28836c cVar) {
            this.f75582a = cVar;
        }

        public final void onRefresh() {
            this.f75582a.mo58433g().mo58481f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.c$i */
    static final class C28846i extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28836c f75583a;

        C28846i(C28836c cVar) {
            this.f75583a = cVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            C28836c.m68112a(this.f75583a).mo54798c(true);
            DmtStatusView dmtStatusView = (DmtStatusView) this.f75583a.mo48632a((int) R.id.csl);
            if (dmtStatusView != null && dmtStatusView.mo19217k()) {
                DmtStatusView dmtStatusView2 = (DmtStatusView) this.f75583a.mo48632a((int) R.id.csl);
                if (dmtStatusView2 != null) {
                    dmtStatusView2.mo19212f();
                }
            }
            if (C28836c.m68112a(this.f75583a).getItemCount() <= 0) {
                DmtStatusView dmtStatusView3 = (DmtStatusView) this.f75583a.mo48632a((int) R.id.csl);
                if (dmtStatusView3 != null) {
                    dmtStatusView3.mo19212f();
                }
            } else {
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f75583a.mo48632a((int) R.id.cvt);
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setRefreshing(true);
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.c$j */
    static final class C28847j extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28836c f75584a;

        C28847j(C28836c cVar) {
            this.f75584a = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "it");
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f75584a.mo48632a((int) R.id.cvt);
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(false);
            }
            DmtStatusView dmtStatusView = (DmtStatusView) this.f75584a.mo48632a((int) R.id.csl);
            if (dmtStatusView != null) {
                dmtStatusView.mo19214h();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.c$k */
    static final class C28848k extends C52712l implements C52682m<C11866f, List<? extends DiscoverV4NewTrendingStruct>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28836c f75585a;

        C28848k(C28836c cVar) {
            this.f75585a = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            List list = (List) obj2;
            C52711k.m112240b(fVar, "$receiver");
            C52711k.m112240b(list, "it");
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f75585a.mo48632a((int) R.id.cvt);
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(false);
            }
            DmtStatusView dmtStatusView = (DmtStatusView) this.f75585a.mo48632a((int) R.id.csl);
            if (dmtStatusView != null) {
                dmtStatusView.mo19208c(true);
            }
            fVar.mo22552a(this.f75585a.mo58433g(), new C52671b<DiscoverV4TrendingState, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C28848k f75586a;

                {
                    this.f75586a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    DiscoverV4TrendingState discoverV4TrendingState = (DiscoverV4TrendingState) obj;
                    C52711k.m112240b(discoverV4TrendingState, "it");
                    if (!discoverV4TrendingState.getCells().getPayload().f31449a.f31440a && discoverV4TrendingState.getCells().getList().isEmpty()) {
                        DmtStatusView dmtStatusView = (DmtStatusView) this.f75586a.f75585a.mo48632a((int) R.id.csl);
                        if (dmtStatusView != null) {
                            dmtStatusView.mo19213g();
                        }
                    }
                    return C52860x.f131107a;
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.c$l */
    static final class C28850l extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28836c f75587a;

        C28850l(C28836c cVar) {
            this.f75587a = cVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            C28836c.m68112a(this.f75587a).am_();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.c$m */
    static final class C28851m extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28836c f75588a;

        C28851m(C28836c cVar) {
            this.f75588a = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "it");
            C28836c.m68112a(this.f75588a).co_();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.c$n */
    static final class C28852n extends C52712l implements C52682m<C11866f, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28836c f75589a;

        C28852n(C28836c cVar) {
            this.f75589a = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(fVar, "$receiver");
            if (booleanValue) {
                C28836c.m68112a(this.f75589a).ao_();
            } else {
                C28836c.m68112a(this.f75589a).mo54798c(false);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final View mo48632a(int i) {
        if (this.f75562j == null) {
            this.f75562j = new HashMap();
        }
        View view = (View) this.f75562j.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f75562j.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public final void mo58430a(DiscoverPlaylistUpdateParam discoverPlaylistUpdateParam) {
        C52711k.m112240b(discoverPlaylistUpdateParam, "param");
    }

    /* renamed from: e */
    public final void mo48633e() {
        if (this.f75562j != null) {
            this.f75562j.clear();
        }
    }

    /* renamed from: g */
    public final DiscoverV4NewTrendingViewModle mo58433g() {
        return (DiscoverV4NewTrendingViewModle) this.f75560d.getValue();
    }

    /* renamed from: k */
    public final void mo58435k() {
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo48633e();
    }

    public C28836c() {
        C52760c a = C52728w.m112245a(DiscoverV4NewTrendingViewModle.class);
        C52670a aVar = new C28837a(a);
        this.f75560d = new lifecycleAwareLazy(this, aVar, new C28839c(this, aVar, a, C28838b.INSTANCE));
    }

    /* renamed from: j */
    public final void mo58434j() {
        FpsRecyclerView fpsRecyclerView = (FpsRecyclerView) mo48632a((int) R.id.ca3);
        if (fpsRecyclerView == null || !fpsRecyclerView.canScrollVertically(-1)) {
            mo58433g().mo58481f();
            return;
        }
        FpsRecyclerView fpsRecyclerView2 = (FpsRecyclerView) mo48632a((int) R.id.ca3);
        if (fpsRecyclerView2 != null) {
            fpsRecyclerView2.mo4814b(0);
        }
    }

    /* renamed from: l */
    public final void mo58436l() {
        if (DiscoverV4PlayListDataCenter.Companion.getINSTANCE().getNewTrendingData() == null) {
            DmtStatusView dmtStatusView = (DmtStatusView) mo48632a((int) R.id.csl);
            if (dmtStatusView == null || !dmtStatusView.mo19215i()) {
                mo58433g().mo58481f();
            }
        }
    }

    /* renamed from: m */
    public final void mo58437m() {
        if (DiscoverV4PlayListDataCenter.Companion.getINSTANCE().getNewTrendingData() == null) {
            DmtStatusView dmtStatusView = (DmtStatusView) mo48632a((int) R.id.csl);
            if (dmtStatusView == null || !dmtStatusView.mo19215i()) {
                mo58433g().mo58481f();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C28783b m68112a(C28836c cVar) {
        C28783b bVar = cVar.f75559c;
        if (bVar == null) {
            C52711k.m112237a("adapter");
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo58431a(boolean z) {
        DiscoverV4PlayListDataCenter.Companion.getINSTANCE().setPageState(this.f75561e, !z);
        m68113c(z);
    }

    /* renamed from: b */
    public final void mo58432b(boolean z) {
        DiscoverV4PlayListDataCenter.Companion.getINSTANCE().setPageState(this.f75561e, !z);
        m68113c(z);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DiscoverV4NewTrendingViewModle g = mo58433g();
        if (DiscoverV4PlayListDataCenter.Companion.getINSTANCE().getNewTrendingData() != null) {
            g.f75682f.mo22565b();
        }
    }

    /* renamed from: c */
    private final void m68113c(boolean z) {
        if (((FpsRecyclerView) mo48632a((int) R.id.ca3)) != null) {
            FpsRecyclerView fpsRecyclerView = (FpsRecyclerView) mo48632a((int) R.id.ca3);
            C52711k.m112236a((Object) fpsRecyclerView, "recyclerView");
            if (fpsRecyclerView.getLayoutManager() != null) {
                FpsRecyclerView fpsRecyclerView2 = (FpsRecyclerView) mo48632a((int) R.id.ca3);
                C52711k.m112236a((Object) fpsRecyclerView2, "recyclerView");
                C1332i layoutManager = fpsRecyclerView2.getLayoutManager();
                if (layoutManager != null) {
                    int j = ((LinearLayoutManager) layoutManager).mo4749j();
                    FpsRecyclerView fpsRecyclerView3 = (FpsRecyclerView) mo48632a((int) R.id.ca3);
                    C52711k.m112236a((Object) fpsRecyclerView3, "recyclerView");
                    C1332i layoutManager2 = fpsRecyclerView3.getLayoutManager();
                    if (layoutManager2 != null) {
                        int l = ((LinearLayoutManager) layoutManager2).mo4751l();
                        if (j >= 0 && l >= 0 && j <= l) {
                            while (true) {
                                C1352v e = ((FpsRecyclerView) mo48632a((int) R.id.ca3)).mo4844e(j);
                                if (e instanceof C38923d) {
                                    ((C38923d) e).mo58449a(z, false);
                                }
                                if (j == l) {
                                    break;
                                }
                                j++;
                            }
                        }
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
                }
                throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        int c = C0726c.m2098c(view.getContext(), R.color.a80);
        DmtTextView dmtTextView = new DmtTextView(new C1221d(view.getContext(), R.style.tf));
        dmtTextView.setTextColor(c);
        dmtTextView.setText(R.string.c0c);
        dmtTextView.setOnClickListener(new C28844g(this));
        DmtTextView dmtTextView2 = new DmtTextView(new C1221d(view.getContext(), R.style.tf));
        dmtTextView2.setTextColor(c);
        dmtTextView2.setText(R.string.gvp);
        DmtStatusView dmtStatusView = (DmtStatusView) mo48632a((int) R.id.csl);
        if (dmtStatusView != null) {
            dmtStatusView.setBuilder(C10719a.m21676a((Context) getActivity()).mo19231b((View) dmtTextView2).mo19234c((View) dmtTextView));
        }
        DmtStatusView dmtStatusView2 = (DmtStatusView) mo48632a((int) R.id.csl);
        if (dmtStatusView2 != null) {
            Context context = getContext();
            if (context == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) context, "context!!");
            dmtStatusView2.setUseScreenHeight(context.getResources().getDimensionPixelSize(R.dimen.mh));
        }
        this.f75559c = new C28783b(this, mo58433g().f75682f);
        FpsRecyclerView fpsRecyclerView = (FpsRecyclerView) mo48632a((int) R.id.ca3);
        if (fpsRecyclerView != null) {
            fpsRecyclerView.setLayoutManager(new WrapLinearLayoutManager(getActivity()));
        }
        FpsRecyclerView fpsRecyclerView2 = (FpsRecyclerView) mo48632a((int) R.id.ca3);
        if (fpsRecyclerView2 != null) {
            C28783b bVar = this.f75559c;
            if (bVar == null) {
                C52711k.m112237a("adapter");
            }
            fpsRecyclerView2.setAdapter(bVar);
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo48632a((int) R.id.cvt);
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(new C28845h(this));
        }
        ListMiddleware<DiscoverV4TrendingState, DiscoverV4NewTrendingStruct, C11865l> listMiddleware = mo58433g().f75682f;
        C11797e eVar = this;
        C28783b bVar2 = this.f75559c;
        if (bVar2 == null) {
            C52711k.m112237a("adapter");
        }
        ListMiddleware.m24163a(listMiddleware, eVar, bVar2, false, false, new C28841d(new C28846i(this), new C28847j(this), new C28848k(this)), new C28843f(new C28850l(this), new C28851m(this), C28842e.INSTANCE), new C28852n(this), null, null, null, 908, null);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.bal, viewGroup, false);
    }
}
