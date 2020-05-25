package com.p683ss.android.ugc.aweme.discover.p1665v4.p1667ui;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.content.C0726c;
import android.support.p030v4.widget.SwipeRefreshLayout;
import android.support.p030v4.widget.SwipeRefreshLayout.C1091b;
import android.support.p043v7.view.C1221d;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.GridLayoutManager.C1302b;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
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
import com.bytedance.jedi.arch.ext.list.p744a.C11848e.C11850b;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.p683ss.android.ugc.aweme.base.arch.C23462b;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter;
import com.p683ss.android.ugc.aweme.discover.p1665v4.p1666a.C28786c;
import com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel.DiscoverStateV4;
import com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel.DiscoverV4PlayListViewModel;
import com.p683ss.android.ugc.aweme.playlist.p2057a.C38923d;
import com.p683ss.android.ugc.aweme.views.FpsRecyclerView;
import com.p683ss.android.ugc.aweme.views.WrapGridLayoutManager;
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

/* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.d */
public final class C28853d extends C23462b implements C28872e {

    /* renamed from: b */
    static final /* synthetic */ C52767h[] f75590b = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28853d.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/discover/v4/viewmodel/DiscoverV4PlayListViewModel;"))};

    /* renamed from: c */
    public C28786c f75591c;

    /* renamed from: d */
    private final lifecycleAwareLazy f75592d;

    /* renamed from: e */
    private String f75593e;

    /* renamed from: j */
    private String f75594j;

    /* renamed from: k */
    private HashMap f75595k;

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.d$a */
    public static final class C28854a extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C52760c f75596a;

        public C28854a(C52760c cVar) {
            this.f75596a = cVar;
            super(0);
        }

        public final String invoke() {
            String name = C52669a.m112219a(this.f75596a).getName();
            C52711k.m112236a((Object) name, "viewModelClass.java.name");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.d$b */
    public static final class C28855b extends C52712l implements C52682m<DiscoverStateV4, Bundle, DiscoverStateV4> {
        public static final C28855b INSTANCE = new C28855b();

        public C28855b() {
            super(2);
        }

        public final DiscoverStateV4 invoke(DiscoverStateV4 discoverStateV4, Bundle bundle) {
            C52711k.m112240b(discoverStateV4, "$receiver");
            return discoverStateV4;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.d$c */
    public static final class C28856c extends C52712l implements C52670a<DiscoverV4PlayListViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f75597a;

        /* renamed from: b */
        final /* synthetic */ C52670a f75598b;

        /* renamed from: c */
        final /* synthetic */ C52760c f75599c;

        /* renamed from: d */
        final /* synthetic */ C52682m f75600d;

        public C28856c(Fragment fragment, C52670a aVar, C52760c cVar, C52682m mVar) {
            this.f75597a = fragment;
            this.f75598b = aVar;
            this.f75599c = cVar;
            this.f75600d = mVar;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3, types: [com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel, java.lang.Object]
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
        public final com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel.DiscoverV4PlayListViewModel invoke() {
            /*
                r3 = this;
                android.support.v4.app.Fragment r0 = r3.f75597a
                android.support.v4.app.Fragment r1 = r3.f75597a
                com.bytedance.jedi.arch.ad r1 = (com.bytedance.jedi.arch.C11791ad) r1
                android.arch.lifecycle.y$b r1 = r1.mo22542a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r0, r1)
                d.f.a.a r1 = r3.f75598b
                java.lang.Object r1 = r1.invoke()
                java.lang.String r1 = (java.lang.String) r1
                d.k.c r2 = r3.f75599c
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                com.bytedance.jedi.arch.n r1 = r0.f31279c
                java.lang.Class<com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel> r2 = com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel.DiscoverV4PlayListViewModel.class
                com.bytedance.jedi.arch.m r1 = r1.mo22643a(r2)
                if (r1 == 0) goto L_0x0034
                java.lang.String r2 = "this"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                r1.binding(r0)
            L_0x0034:
                com.ss.android.ugc.aweme.discover.v4.ui.d$c$1 r1 = new com.ss.android.ugc.aweme.discover.v4.ui.d$c$1
                r1.<init>(r3)
                d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
                r0.mo22526a(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1665v4.p1667ui.C28853d.C28856c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.d$d */
    public static final class C28858d implements C11854c<Object, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f75602a;

        /* renamed from: b */
        final /* synthetic */ C52682m f75603b;

        /* renamed from: c */
        final /* synthetic */ C52682m f75604c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f75605d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f75606e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends Object>, C52860x> f75607f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f75605d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f75606e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends Object>, C52860x> mo22603c() {
            return this.f75607f;
        }

        public C28858d(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f75602a = bVar;
            this.f75603b = mVar;
            this.f75604c = mVar2;
            this.f75605d = bVar;
            this.f75606e = mVar;
            this.f75607f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.d$e */
    public static final class C28859e extends C52712l implements C52682m<C11866f, List<? extends Object>, C52860x> {
        public static final C28859e INSTANCE = new C28859e();

        public C28859e() {
            super(2);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((C11866f) obj, (List) obj2);
            return C52860x.f131107a;
        }

        public final void invoke(C11866f fVar, List<? extends Object> list) {
            C52711k.m112240b(list, "it");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.d$f */
    public static final class C28860f implements C11854c<Object, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f75608a;

        /* renamed from: b */
        final /* synthetic */ C52682m f75609b;

        /* renamed from: c */
        final /* synthetic */ C52682m f75610c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f75611d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f75612e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends Object>, C52860x> f75613f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f75611d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f75612e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends Object>, C52860x> mo22603c() {
            return this.f75613f;
        }

        public C28860f(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f75608a = bVar;
            this.f75609b = mVar;
            this.f75610c = mVar2;
            this.f75611d = bVar;
            this.f75612e = mVar;
            this.f75613f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.d$g */
    static final class C28861g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C28853d f75614a;

        C28861g(C28853d dVar) {
            this.f75614a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f75614a.mo58434j();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.d$h */
    static final class C28862h implements C1091b {

        /* renamed from: a */
        final /* synthetic */ C28853d f75615a;

        C28862h(C28853d dVar) {
            this.f75615a = dVar;
        }

        public final void onRefresh() {
            this.f75615a.mo58442g().mo58485e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.d$i */
    static final class C28863i implements C26846a {

        /* renamed from: a */
        final /* synthetic */ C28853d f75616a;

        C28863i(C28853d dVar) {
            this.f75616a = dVar;
        }

        public final void ar_() {
            this.f75616a.mo58442g().f75703i.mo22567c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.d$j */
    static final class C28864j extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28853d f75617a;

        C28864j(C28853d dVar) {
            this.f75617a = dVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            C28853d.m68130a(this.f75617a).mo54798c(true);
            DmtStatusView dmtStatusView = (DmtStatusView) this.f75617a.mo48632a((int) R.id.csl);
            if (dmtStatusView != null && dmtStatusView.mo19217k()) {
                DmtStatusView dmtStatusView2 = (DmtStatusView) this.f75617a.mo48632a((int) R.id.csl);
                if (dmtStatusView2 != null) {
                    dmtStatusView2.mo19212f();
                }
            }
            if (C28853d.m68130a(this.f75617a).getItemCount() <= 0) {
                DmtStatusView dmtStatusView3 = (DmtStatusView) this.f75617a.mo48632a((int) R.id.csl);
                if (dmtStatusView3 != null) {
                    dmtStatusView3.mo19212f();
                }
            } else {
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f75617a.mo48632a((int) R.id.cvt);
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setRefreshing(true);
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.d$k */
    static final class C28865k extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28853d f75618a;

        C28865k(C28853d dVar) {
            this.f75618a = dVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "it");
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f75618a.mo48632a((int) R.id.cvt);
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(false);
            }
            DmtStatusView dmtStatusView = (DmtStatusView) this.f75618a.mo48632a((int) R.id.csl);
            if (dmtStatusView != null) {
                dmtStatusView.mo19214h();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.d$l */
    static final class C28866l extends C52712l implements C52682m<C11866f, List<? extends Object>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28853d f75619a;

        C28866l(C28853d dVar) {
            this.f75619a = dVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            List list = (List) obj2;
            C52711k.m112240b(fVar, "$receiver");
            C52711k.m112240b(list, "it");
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f75619a.mo48632a((int) R.id.cvt);
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(false);
            }
            DmtStatusView dmtStatusView = (DmtStatusView) this.f75619a.mo48632a((int) R.id.csl);
            if (dmtStatusView != null) {
                dmtStatusView.mo19208c(true);
            }
            DiscoverV4PlayListViewModel g = this.f75619a.mo58442g();
            if (g == null) {
                C52711k.m112234a();
            }
            fVar.mo22552a(g, new C52671b<DiscoverStateV4, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C28866l f75620a;

                {
                    this.f75620a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    DiscoverStateV4 discoverStateV4 = (DiscoverStateV4) obj;
                    C52711k.m112240b(discoverStateV4, "it");
                    if (!discoverStateV4.getCells().getPayload().f31449a.f31440a && discoverStateV4.getCells().getList().isEmpty()) {
                        DmtStatusView dmtStatusView = (DmtStatusView) this.f75620a.f75619a.mo48632a((int) R.id.csl);
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

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.d$m */
    static final class C28868m extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28853d f75621a;

        C28868m(C28853d dVar) {
            this.f75621a = dVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            C28853d.m68130a(this.f75621a).am_();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.d$n */
    static final class C28869n extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28853d f75622a;

        C28869n(C28853d dVar) {
            this.f75622a = dVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "it");
            C28853d.m68130a(this.f75622a).co_();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.d$o */
    static final class C28870o extends C52712l implements C52682m<C11866f, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28853d f75623a;

        C28870o(C28853d dVar) {
            this.f75623a = dVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(fVar, "$receiver");
            if (booleanValue) {
                C28853d.m68130a(this.f75623a).ao_();
            } else {
                C28853d.m68130a(this.f75623a).mo54798c(false);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.d$p */
    public static final class C28871p extends C1302b {

        /* renamed from: c */
        final /* synthetic */ C28853d f75624c;

        C28871p(C28853d dVar) {
            this.f75624c = dVar;
        }

        /* renamed from: a */
        public final int mo4690a(int i) {
            if (i < C28853d.m68130a(this.f75624c).mo48637d().size()) {
                return ((DiscoverPlayListStructV4) C28853d.m68130a(this.f75624c).mo48637d().get(i)).spanSize;
            }
            return 2;
        }
    }

    /* renamed from: a */
    public final View mo48632a(int i) {
        if (this.f75595k == null) {
            this.f75595k = new HashMap();
        }
        View view = (View) this.f75595k.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f75595k.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public final void mo48633e() {
        if (this.f75595k != null) {
            this.f75595k.clear();
        }
    }

    /* renamed from: g */
    public final DiscoverV4PlayListViewModel mo58442g() {
        return (DiscoverV4PlayListViewModel) this.f75592d.getValue();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo48633e();
    }

    public C28853d() {
        C52760c a = C52728w.m112245a(DiscoverV4PlayListViewModel.class);
        C52670a aVar = new C28854a(a);
        this.f75592d = new lifecycleAwareLazy(this, aVar, new C28856c(this, aVar, a, C28855b.INSTANCE));
    }

    /* renamed from: j */
    public final void mo58434j() {
        if (((FpsRecyclerView) mo48632a((int) R.id.ca3)) != null) {
            FpsRecyclerView fpsRecyclerView = (FpsRecyclerView) mo48632a((int) R.id.ca3);
            if (fpsRecyclerView == null || !fpsRecyclerView.canScrollVertically(-1)) {
                mo58442g().mo58485e();
                return;
            }
            FpsRecyclerView fpsRecyclerView2 = (FpsRecyclerView) mo48632a((int) R.id.ca3);
            if (fpsRecyclerView2 != null) {
                fpsRecyclerView2.mo4814b(0);
            }
        }
    }

    /* renamed from: l */
    public final void mo58436l() {
        DiscoverV4PlayListDataCenter instance = DiscoverV4PlayListDataCenter.Companion.getINSTANCE();
        String str = this.f75593e;
        if (str == null) {
            C52711k.m112237a("tabName");
        }
        if (instance.getData(str) == null) {
            DmtStatusView dmtStatusView = (DmtStatusView) mo48632a((int) R.id.csl);
            if (dmtStatusView == null || !dmtStatusView.mo19215i()) {
                mo58442g().mo58485e();
            }
        }
    }

    /* renamed from: m */
    public final void mo58437m() {
        DiscoverV4PlayListDataCenter instance = DiscoverV4PlayListDataCenter.Companion.getINSTANCE();
        String str = this.f75593e;
        if (str == null) {
            C52711k.m112237a("tabName");
        }
        if (instance.getData(str) == null) {
            DmtStatusView dmtStatusView = (DmtStatusView) mo48632a((int) R.id.csl);
            if (dmtStatusView == null || !dmtStatusView.mo19215i()) {
                mo58442g().mo58485e();
            }
        }
    }

    /* renamed from: n */
    private final float m68132n() {
        float f;
        try {
            FpsRecyclerView fpsRecyclerView = (FpsRecyclerView) mo48632a((int) R.id.ca3);
            C52711k.m112236a((Object) fpsRecyclerView, "recyclerView");
            C1332i layoutManager = fpsRecyclerView.getLayoutManager();
            if (layoutManager != null) {
                int j = ((GridLayoutManager) layoutManager).mo4749j();
                FpsRecyclerView fpsRecyclerView2 = (FpsRecyclerView) mo48632a((int) R.id.ca3);
                C52711k.m112236a((Object) fpsRecyclerView2, "recyclerView");
                C1332i layoutManager2 = fpsRecyclerView2.getLayoutManager();
                if (layoutManager2 != null) {
                    View c = ((GridLayoutManager) layoutManager2).mo4736c(j);
                    if (j >= 0) {
                        if (c != null) {
                            String str = this.f75593e;
                            if (str == null) {
                                C52711k.m112237a("tabName");
                            }
                            if (!TextUtils.equals(str, DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST())) {
                                float f2 = (float) (j / 2);
                                C28786c cVar = this.f75591c;
                                if (cVar == null) {
                                    C52711k.m112237a("adapter");
                                }
                                f = (f2 * cVar.mo78990m()) + 0.0f;
                            } else if (j > 0) {
                                float f3 = (float) ((j - 1) / 2);
                                C28786c cVar2 = this.f75591c;
                                if (cVar2 == null) {
                                    C52711k.m112237a("adapter");
                                }
                                float m = (f3 * cVar2.mo78990m()) + 0.0f;
                                C28786c cVar3 = this.f75591c;
                                if (cVar3 == null) {
                                    C52711k.m112237a("adapter");
                                }
                                f = m + cVar3.mo58394f();
                            } else {
                                f = 0.0f;
                            }
                            return f - c.getY();
                        }
                    }
                    return 0.0f;
                }
                throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    /* renamed from: k */
    public final void mo58435k() {
        DiscoverV4PlayListDataCenter instance = DiscoverV4PlayListDataCenter.Companion.getINSTANCE();
        String str = this.f75593e;
        if (str == null) {
            C52711k.m112237a("tabName");
        }
        instance.setPageState(str, false);
        if (((FpsRecyclerView) mo48632a((int) R.id.ca3)) != null) {
            FpsRecyclerView fpsRecyclerView = (FpsRecyclerView) mo48632a((int) R.id.ca3);
            C52711k.m112236a((Object) fpsRecyclerView, "recyclerView");
            if (fpsRecyclerView.getLayoutManager() != null) {
                FpsRecyclerView fpsRecyclerView2 = (FpsRecyclerView) mo48632a((int) R.id.ca3);
                C52711k.m112236a((Object) fpsRecyclerView2, "recyclerView");
                C1332i layoutManager = fpsRecyclerView2.getLayoutManager();
                if (layoutManager != null) {
                    int j = ((GridLayoutManager) layoutManager).mo4749j();
                    FpsRecyclerView fpsRecyclerView3 = (FpsRecyclerView) mo48632a((int) R.id.ca3);
                    C52711k.m112236a((Object) fpsRecyclerView3, "recyclerView");
                    C1332i layoutManager2 = fpsRecyclerView3.getLayoutManager();
                    if (layoutManager2 != null) {
                        int l = ((GridLayoutManager) layoutManager2).mo4751l();
                        if (j <= l) {
                            while (true) {
                                C1352v e = ((FpsRecyclerView) mo48632a((int) R.id.ca3)).mo4844e(j);
                                if (e instanceof C38923d) {
                                    ((C38923d) e).mo58451p();
                                }
                                if (j != l) {
                                    j++;
                                } else {
                                    return;
                                }
                            }
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
                }
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C28786c m68130a(C28853d dVar) {
        C28786c cVar = dVar.f75591c;
        if (cVar == null) {
            C52711k.m112237a("adapter");
        }
        return cVar;
    }

    /* renamed from: a */
    public final void mo58431a(boolean z) {
        DiscoverV4PlayListDataCenter instance = DiscoverV4PlayListDataCenter.Companion.getINSTANCE();
        String str = this.f75593e;
        if (str == null) {
            C52711k.m112237a("tabName");
        }
        instance.setPageState(str, !z);
        m68131c(z);
    }

    /* renamed from: b */
    public final void mo58432b(boolean z) {
        DiscoverV4PlayListDataCenter instance = DiscoverV4PlayListDataCenter.Companion.getINSTANCE();
        String str = this.f75593e;
        if (str == null) {
            C52711k.m112237a("tabName");
        }
        instance.setPageState(str, !z);
        StringBuilder sb = new StringBuilder();
        String str2 = this.f75593e;
        if (str2 == null) {
            C52711k.m112237a("tabName");
        }
        sb.append(str2);
        sb.append(",");
        sb.append(z);
        m68131c(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r4 == null) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r4 == null) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onCreate(r4)
            android.os.Bundle r4 = r3.getArguments()
            if (r4 == 0) goto L_0x0011
            java.lang.String r0 = "tabName"
            java.lang.String r4 = r4.getString(r0)
            if (r4 != 0) goto L_0x0013
        L_0x0011:
            java.lang.String r4 = ""
        L_0x0013:
            r3.f75593e = r4
            android.os.Bundle r4 = r3.getArguments()
            if (r4 == 0) goto L_0x0023
            java.lang.String r0 = "tabText"
            java.lang.String r4 = r4.getString(r0)
            if (r4 != 0) goto L_0x0025
        L_0x0023:
            java.lang.String r4 = ""
        L_0x0025:
            r3.f75594j = r4
            com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel r4 = r3.mo58442g()
            java.lang.String r0 = r3.f75593e
            if (r0 != 0) goto L_0x0034
            java.lang.String r1 = "tabName"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0034:
            java.lang.String r1 = "tabName"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)
            r4.f75700f = r0
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter$Companion r2 = com.p683ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter.Companion
            java.lang.String r2 = r2.getTRENDING_PLAYLIST()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x0058
            com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter$Companion r1 = com.p683ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter.Companion
            com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter r1 = r1.getINSTANCE()
            r2 = r4
            com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter$DiscoverV4DataObserver r2 = (com.p683ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter.DiscoverV4DataObserver) r2
            r1.register(r2)
        L_0x0058:
            com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter$Companion r1 = com.p683ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter.Companion
            com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter r1 = r1.getINSTANCE()
            com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse r0 = r1.getData(r0)
            if (r0 == 0) goto L_0x0069
            com.bytedance.jedi.arch.ext.list.ListMiddleware<com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverStateV4, java.lang.Object, com.bytedance.jedi.arch.ext.list.l> r4 = r4.f75703i
            r4.mo22565b()
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1665v4.p1667ui.C28853d.onCreate(android.os.Bundle):void");
    }

    /* renamed from: c */
    private final void m68131c(boolean z) {
        if (((FpsRecyclerView) mo48632a((int) R.id.ca3)) != null) {
            FpsRecyclerView fpsRecyclerView = (FpsRecyclerView) mo48632a((int) R.id.ca3);
            C52711k.m112236a((Object) fpsRecyclerView, "recyclerView");
            if (fpsRecyclerView.getLayoutManager() != null) {
                FpsRecyclerView fpsRecyclerView2 = (FpsRecyclerView) mo48632a((int) R.id.ca3);
                C52711k.m112236a((Object) fpsRecyclerView2, "recyclerView");
                C1332i layoutManager = fpsRecyclerView2.getLayoutManager();
                if (layoutManager != null) {
                    int j = ((GridLayoutManager) layoutManager).mo4749j();
                    FpsRecyclerView fpsRecyclerView3 = (FpsRecyclerView) mo48632a((int) R.id.ca3);
                    C52711k.m112236a((Object) fpsRecyclerView3, "recyclerView");
                    C1332i layoutManager2 = fpsRecyclerView3.getLayoutManager();
                    if (layoutManager2 != null) {
                        int l = ((GridLayoutManager) layoutManager2).mo4751l();
                        float n = m68132n();
                        C28786c cVar = this.f75591c;
                        if (cVar == null) {
                            C52711k.m112237a("adapter");
                        }
                        float m = n % cVar.mo78990m();
                        FpsRecyclerView fpsRecyclerView4 = (FpsRecyclerView) mo48632a((int) R.id.ca3);
                        C52711k.m112236a((Object) fpsRecyclerView4, "recyclerView");
                        C1332i layoutManager3 = fpsRecyclerView4.getLayoutManager();
                        if (layoutManager3 != null) {
                            int j2 = ((GridLayoutManager) layoutManager3).mo4749j();
                            if (j <= l) {
                                while (true) {
                                    C1352v e = ((FpsRecyclerView) mo48632a((int) R.id.ca3)).mo4844e(j);
                                    if (e instanceof C38923d) {
                                        C28786c cVar2 = this.f75591c;
                                        if (cVar2 == null) {
                                            C52711k.m112237a("adapter");
                                        }
                                        boolean z2 = true;
                                        if (m >= cVar2.mo78990m() / 2.0f) {
                                            String str = this.f75593e;
                                            if (str == null) {
                                                C52711k.m112237a("tabName");
                                            }
                                            if (!C52711k.m112239a((Object) str, (Object) DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST())) {
                                                C38923d dVar = (C38923d) e;
                                                if (j == j2 || j == j2 + 1) {
                                                    z2 = false;
                                                }
                                                dVar.mo58449a(z, z2);
                                            } else if (j2 != 0) {
                                                C38923d dVar2 = (C38923d) e;
                                                if (j == j2 || j == j2 + 1) {
                                                    z2 = false;
                                                }
                                                dVar2.mo58449a(z, z2);
                                            }
                                        }
                                        ((C38923d) e).mo58449a(z, true);
                                    }
                                    if (j == l) {
                                        break;
                                    }
                                    j++;
                                }
                            }
                            return;
                        }
                        throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
                    }
                    throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
                }
                throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0092 A[LOOP:0: B:15:0x005a->B:27:0x0092, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0088 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58430a(com.p683ss.android.ugc.aweme.discover.model.DiscoverPlaylistUpdateParam r6) {
        /*
            r5 = this;
            java.lang.String r0 = "param"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            boolean r0 = r5.f29771h
            if (r0 != 0) goto L_0x00f3
            java.lang.String r0 = r6.tabName
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = r5.f75593e
            if (r1 != 0) goto L_0x0016
            java.lang.String r2 = "tabName"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0016:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L_0x0020
            goto L_0x00f3
        L_0x0020:
            r0 = 2132022162(0x7f141392, float:1.9682736E38)
            android.view.View r1 = r5.mo48632a(r0)
            com.ss.android.ugc.aweme.views.FpsRecyclerView r1 = (com.p683ss.android.ugc.aweme.views.FpsRecyclerView) r1
            java.lang.String r2 = "recyclerView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            android.support.v7.widget.RecyclerView$a r1 = r1.getAdapter()
            if (r1 == 0) goto L_0x00eb
            com.ss.android.ugc.aweme.discover.v4.a.c r1 = (com.p683ss.android.ugc.aweme.discover.p1665v4.p1666a.C28786c) r1
            java.util.List r1 = r1.mo48637d()
            java.lang.String r2 = r5.f75593e
            if (r2 != 0) goto L_0x0043
            java.lang.String r3 = "tabName"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0043:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter$Companion r3 = com.p683ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter.Companion
            java.lang.String r3 = r3.getTRENDING_PLAYLIST()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 != 0) goto L_0x0095
            r2 = 0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x005a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00e9
            java.lang.Object r3 = r1.next()
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r3 = (com.p683ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4) r3
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = r3.awemes
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = p2628d.p2629a.C52575l.m112137e(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r3
            if (r3 == 0) goto L_0x0077
            java.lang.String r3 = r3.getAid()
            goto L_0x0078
        L_0x0077:
            r3 = 0
        L_0x0078:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r6.aweme
            java.lang.String r4 = r4.getAid()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 == 0) goto L_0x0092
            android.view.View r6 = r5.mo48632a(r0)
            com.ss.android.ugc.aweme.views.FpsRecyclerView r6 = (com.p683ss.android.ugc.aweme.views.FpsRecyclerView) r6
            r6.mo4814b(r2)
            return
        L_0x0092:
            int r2 = r2 + 1
            goto L_0x005a
        L_0x0095:
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            int r3 = r6.index
            if (r3 < 0) goto L_0x00ea
            if (r2 > r3) goto L_0x00a3
            return
        L_0x00a3:
            int r2 = r6.index
            java.lang.Object r1 = r1.get(r2)
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r1 = (com.p683ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4) r1
            java.lang.String r1 = r1.cellID
            java.lang.String r2 = r6.cellID
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r2)
            if (r1 == 0) goto L_0x00e9
            com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel r1 = r5.mo58442g()
            android.view.View r0 = r5.mo48632a(r0)
            com.ss.android.ugc.aweme.views.FpsRecyclerView r0 = (com.p683ss.android.ugc.aweme.views.FpsRecyclerView) r0
            java.lang.String r2 = "recyclerView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            android.support.v7.widget.RecyclerView$a r0 = r0.getAdapter()
            if (r0 == 0) goto L_0x00e1
            com.ss.android.ugc.aweme.discover.v4.a.c r0 = (com.p683ss.android.ugc.aweme.discover.p1665v4.p1666a.C28786c) r0
            java.lang.String r2 = "param"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r2)
            java.lang.String r2 = "adapter"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r2)
            com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel$i r2 = new com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel$i
            r2.<init>(r1, r6, r0)
            d.f.a.b r2 = (p2628d.p2639f.p2640a.C52671b) r2
            r1.mo22527b(r2)
            goto L_0x00e9
        L_0x00e1:
            d.u r6 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.v4.adapter.DiscoverV4PlayListAdapter"
            r6.<init>(r0)
            throw r6
        L_0x00e9:
            return
        L_0x00ea:
            return
        L_0x00eb:
            d.u r6 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.v4.adapter.DiscoverV4PlayListAdapter"
            r6.<init>(r0)
            throw r6
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1665v4.p1667ui.C28853d.mo58430a(com.ss.android.ugc.aweme.discover.model.DiscoverPlaylistUpdateParam):void");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        StringBuilder sb = new StringBuilder("Fragment onViewCreated ");
        String str = this.f75593e;
        if (str == null) {
            C52711k.m112237a("tabName");
        }
        sb.append(str);
        int c = C0726c.m2098c(view.getContext(), R.color.a80);
        DmtTextView dmtTextView = new DmtTextView(new C1221d(view.getContext(), R.style.tf));
        dmtTextView.setTextColor(c);
        dmtTextView.setText(R.string.c0c);
        dmtTextView.setOnClickListener(new C28861g(this));
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
        C0184k kVar = this;
        C11850b bVar = mo58442g().f75703i;
        String str2 = this.f75593e;
        if (str2 == null) {
            C52711k.m112237a("tabName");
        }
        String str3 = this.f75594j;
        if (str3 == null) {
            C52711k.m112237a("tabText");
        }
        this.f75591c = new C28786c(kVar, bVar, str2, str3);
        C28786c cVar = this.f75591c;
        if (cVar == null) {
            C52711k.m112237a("adapter");
        }
        cVar.mo54788a((C26846a) new C28863i(this));
        ListMiddleware<DiscoverStateV4, Object, C11865l> listMiddleware = mo58442g().f75703i;
        C11797e eVar = this;
        C28786c cVar2 = this.f75591c;
        if (cVar2 == null) {
            C52711k.m112237a("adapter");
        }
        ListMiddleware.m24163a(listMiddleware, eVar, cVar2, false, false, new C28858d(new C28864j(this), new C28865k(this), new C28866l(this)), new C28860f(new C28868m(this), new C28869n(this), C28859e.INSTANCE), new C28870o(this), null, null, null, 908, null);
        FpsRecyclerView fpsRecyclerView = (FpsRecyclerView) mo48632a((int) R.id.ca3);
        if (fpsRecyclerView != null) {
            C28786c cVar3 = this.f75591c;
            if (cVar3 == null) {
                C52711k.m112237a("adapter");
            }
            fpsRecyclerView.setAdapter(cVar3);
        }
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(getContext(), 2);
        wrapGridLayoutManager.f4526g = new C28871p(this);
        FpsRecyclerView fpsRecyclerView2 = (FpsRecyclerView) mo48632a((int) R.id.ca3);
        if (fpsRecyclerView2 != null) {
            fpsRecyclerView2.setLayoutManager(wrapGridLayoutManager);
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo48632a((int) R.id.cvt);
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(new C28862h(this));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.bal, viewGroup, false);
    }
}
