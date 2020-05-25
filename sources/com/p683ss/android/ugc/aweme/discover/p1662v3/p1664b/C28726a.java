package com.p683ss.android.ugc.aweme.discover.p1662v3.p1664b;

import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.widget.SwipeRefreshLayout;
import android.support.p030v4.widget.SwipeRefreshLayout.C1091b;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.MtEmptyView;
import com.bytedance.jedi.arch.C11797e;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.ext.list.C11854c;
import com.bytedance.jedi.arch.ext.list.C11865l;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.p683ss.android.ugc.aweme.base.arch.C23462b;
import com.p683ss.android.ugc.aweme.commercialize.loft.AbsLoftNestedRefreshLayout;
import com.p683ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27721d;
import com.p683ss.android.ugc.aweme.discover.p1662v3.p1663a.C28721a;
import com.p683ss.android.ugc.aweme.discover.p1662v3.viewmodel.DiscoverStateV3;
import com.p683ss.android.ugc.aweme.discover.p1662v3.viewmodel.DiscoverViewModelV3;
import com.p683ss.android.ugc.aweme.discover.p1662v3.viewmodel.DiscoverViewModelV3.C28773l;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.profile.p2090ui.WrapStaggeredGridLayoutManager;
import com.p683ss.android.ugc.aweme.views.C48190g;
import com.p683ss.android.ugc.aweme.views.FpsRecyclerView;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52568f;
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

/* renamed from: com.ss.android.ugc.aweme.discover.v3.b.a */
public final class C28726a extends C23462b implements C27721d {

    /* renamed from: b */
    static final /* synthetic */ C52767h[] f75364b = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28726a.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/discover/v3/viewmodel/DiscoverViewModelV3;"))};

    /* renamed from: c */
    public C28721a f75365c;

    /* renamed from: d */
    private final lifecycleAwareLazy f75366d;

    /* renamed from: e */
    private HashMap f75367e;

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.b.a$a */
    public static final class C28727a extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C52760c f75368a;

        public C28727a(C52760c cVar) {
            this.f75368a = cVar;
            super(0);
        }

        public final String invoke() {
            String name = C52669a.m112219a(this.f75368a).getName();
            C52711k.m112236a((Object) name, "viewModelClass.java.name");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.b.a$b */
    public static final class C28728b extends C52712l implements C52682m<DiscoverStateV3, Bundle, DiscoverStateV3> {
        public static final C28728b INSTANCE = new C28728b();

        public C28728b() {
            super(2);
        }

        public final DiscoverStateV3 invoke(DiscoverStateV3 discoverStateV3, Bundle bundle) {
            C52711k.m112240b(discoverStateV3, "$receiver");
            return discoverStateV3;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.b.a$c */
    public static final class C28729c extends C52712l implements C52670a<DiscoverViewModelV3> {

        /* renamed from: a */
        final /* synthetic */ Fragment f75369a;

        /* renamed from: b */
        final /* synthetic */ C52670a f75370b;

        /* renamed from: c */
        final /* synthetic */ C52760c f75371c;

        /* renamed from: d */
        final /* synthetic */ C52682m f75372d;

        public C28729c(Fragment fragment, C52670a aVar, C52760c cVar, C52682m mVar) {
            this.f75369a = fragment;
            this.f75370b = aVar;
            this.f75371c = cVar;
            this.f75372d = mVar;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverViewModelV3, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3, types: [com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverViewModelV3, java.lang.Object, com.bytedance.jedi.arch.JediViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverViewModelV3, java.lang.Object]
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
        public final com.p683ss.android.ugc.aweme.discover.p1662v3.viewmodel.DiscoverViewModelV3 invoke() {
            /*
                r3 = this;
                android.support.v4.app.Fragment r0 = r3.f75369a
                android.support.v4.app.Fragment r1 = r3.f75369a
                com.bytedance.jedi.arch.ad r1 = (com.bytedance.jedi.arch.C11791ad) r1
                android.arch.lifecycle.y$b r1 = r1.mo22542a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r0, r1)
                d.f.a.a r1 = r3.f75370b
                java.lang.Object r1 = r1.invoke()
                java.lang.String r1 = (java.lang.String) r1
                d.k.c r2 = r3.f75371c
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                com.bytedance.jedi.arch.n r1 = r0.f31279c
                java.lang.Class<com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverViewModelV3> r2 = com.p683ss.android.ugc.aweme.discover.p1662v3.viewmodel.DiscoverViewModelV3.class
                com.bytedance.jedi.arch.m r1 = r1.mo22643a(r2)
                if (r1 == 0) goto L_0x0034
                java.lang.String r2 = "this"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                r1.binding(r0)
            L_0x0034:
                com.ss.android.ugc.aweme.discover.v3.b.a$c$1 r1 = new com.ss.android.ugc.aweme.discover.v3.b.a$c$1
                r1.<init>(r3)
                d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
                r0.mo22526a(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1662v3.p1664b.C28726a.C28729c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.b.a$d */
    public static final class C28731d implements C11854c<DiscoveryCellStructV3, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f75374a;

        /* renamed from: b */
        final /* synthetic */ C52682m f75375b;

        /* renamed from: c */
        final /* synthetic */ C52682m f75376c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f75377d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f75378e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends DiscoveryCellStructV3>, C52860x> f75379f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f75377d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f75378e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends DiscoveryCellStructV3>, C52860x> mo22603c() {
            return this.f75379f;
        }

        public C28731d(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f75374a = bVar;
            this.f75375b = mVar;
            this.f75376c = mVar2;
            this.f75377d = bVar;
            this.f75378e = mVar;
            this.f75379f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.b.a$e */
    public static final class C28732e extends C52712l implements C52682m<C11866f, List<? extends DiscoveryCellStructV3>, C52860x> {
        public static final C28732e INSTANCE = new C28732e();

        public C28732e() {
            super(2);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((C11866f) obj, (List) obj2);
            return C52860x.f131107a;
        }

        public final void invoke(C11866f fVar, List<? extends DiscoveryCellStructV3> list) {
            C52711k.m112240b(list, "it");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.b.a$f */
    public static final class C28733f implements C11854c<DiscoveryCellStructV3, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f75380a;

        /* renamed from: b */
        final /* synthetic */ C52682m f75381b;

        /* renamed from: c */
        final /* synthetic */ C52682m f75382c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f75383d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f75384e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends DiscoveryCellStructV3>, C52860x> f75385f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f75383d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f75384e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends DiscoveryCellStructV3>, C52860x> mo22603c() {
            return this.f75385f;
        }

        public C28733f(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f75380a = bVar;
            this.f75381b = mVar;
            this.f75382c = mVar2;
            this.f75383d = bVar;
            this.f75384e = mVar;
            this.f75385f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.b.a$g */
    static final class C28734g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C28726a f75386a;

        C28734g(C28726a aVar) {
            this.f75386a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f75386a.aL_();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.b.a$h */
    static final class C28735h extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28726a f75387a;

        C28735h(C28726a aVar) {
            this.f75387a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            if (C28726a.m68001a(this.f75387a).getItemCount() <= 0) {
                ((DmtStatusView) this.f75387a.mo48632a((int) R.id.csl)).mo19212f();
            } else {
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f75387a.mo48632a((int) R.id.cvt);
                C52711k.m112236a((Object) swipeRefreshLayout, "swipeRefresh");
                swipeRefreshLayout.setRefreshing(true);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.b.a$i */
    static final class C28736i extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28726a f75388a;

        C28736i(C28726a aVar) {
            this.f75388a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "it");
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f75388a.mo48632a((int) R.id.cvt);
            C52711k.m112236a((Object) swipeRefreshLayout, "swipeRefresh");
            swipeRefreshLayout.setRefreshing(true);
            ((DmtStatusView) this.f75388a.mo48632a((int) R.id.csl)).mo19214h();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.b.a$j */
    static final class C28737j extends C52712l implements C52682m<C11866f, List<? extends DiscoveryCellStructV3>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28726a f75389a;

        C28737j(C28726a aVar) {
            this.f75389a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            List list = (List) obj2;
            C52711k.m112240b(fVar, "$receiver");
            C52711k.m112240b(list, "it");
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f75389a.mo48632a((int) R.id.cvt);
            C52711k.m112236a((Object) swipeRefreshLayout, "swipeRefresh");
            swipeRefreshLayout.setRefreshing(false);
            ((DmtStatusView) this.f75389a.mo48632a((int) R.id.csl)).mo19208c(true);
            DiscoverViewModelV3 g = this.f75389a.mo58367g();
            if (g == null) {
                C52711k.m112234a();
            }
            fVar.mo22552a(g, new C52671b<DiscoverStateV3, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C28737j f75390a;

                {
                    this.f75390a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    DiscoverStateV3 discoverStateV3 = (DiscoverStateV3) obj;
                    C52711k.m112240b(discoverStateV3, "it");
                    if (!discoverStateV3.getCells().getPayload().f31449a.f31440a && discoverStateV3.getCells().getList().isEmpty()) {
                        ((DmtStatusView) this.f75390a.f75389a.mo48632a((int) R.id.csl)).mo19213g();
                    }
                    return C52860x.f131107a;
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.b.a$k */
    static final class C28739k extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28726a f75391a;

        C28739k(C28726a aVar) {
            this.f75391a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            C28721a a = C28726a.m68001a(this.f75391a);
            if (a != null) {
                a.am_();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.b.a$l */
    static final class C28740l extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28726a f75392a;

        C28740l(C28726a aVar) {
            this.f75392a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "it");
            C28721a a = C28726a.m68001a(this.f75392a);
            if (a != null) {
                a.co_();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.b.a$m */
    static final class C28741m extends C52712l implements C52682m<C11866f, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28726a f75393a;

        C28741m(C28726a aVar) {
            this.f75393a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(fVar, "$receiver");
            if (booleanValue) {
                C28721a a = C28726a.m68001a(this.f75393a);
                if (a != null) {
                    a.ao_();
                }
            } else {
                C28721a a2 = C28726a.m68001a(this.f75393a);
                if (a2 != null) {
                    a2.an_();
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.b.a$n */
    static final class C28742n implements C1091b {

        /* renamed from: a */
        final /* synthetic */ C28726a f75394a;

        C28742n(C28726a aVar) {
            this.f75394a = aVar;
        }

        public final void onRefresh() {
            this.f75394a.mo58367g().f75440i.mo22565b();
        }
    }

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* renamed from: a */
    public final View mo48632a(int i) {
        if (this.f75367e == null) {
            this.f75367e = new HashMap();
        }
        View view = (View) this.f75367e.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f75367e.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public final void mo53409a(AbsLoftNestedRefreshLayout absLoftNestedRefreshLayout) {
        C52711k.m112240b(absLoftNestedRefreshLayout, "loftNestedRefreshLayout");
    }

    /* renamed from: b */
    public final void mo56150b(int i) {
    }

    /* renamed from: e */
    public final void mo48633e() {
        if (this.f75367e != null) {
            this.f75367e.clear();
        }
    }

    /* renamed from: g */
    public final DiscoverViewModelV3 mo58367g() {
        return (DiscoverViewModelV3) this.f75366d.getValue();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo48633e();
    }

    public C28726a() {
        C52760c a = C52728w.m112245a(DiscoverViewModelV3.class);
        C52670a aVar = new C28727a(a);
        this.f75366d = new lifecycleAwareLazy(this, aVar, new C28729c(this, aVar, a, C28728b.INSTANCE));
    }

    public final void aL_() {
        if (((FpsRecyclerView) mo48632a((int) R.id.ca3)) != null) {
            if (!((FpsRecyclerView) mo48632a((int) R.id.ca3)).canScrollVertically(-1)) {
                mo58367g().f75440i.mo22565b();
            } else {
                ((FpsRecyclerView) mo48632a((int) R.id.ca3)).mo4814b(0);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C28721a m68001a(C28726a aVar) {
        C28721a aVar2 = aVar.f75365c;
        if (aVar2 == null) {
            C52711k.m112237a("adapter");
        }
        return aVar2;
    }

    /* renamed from: a */
    public final void mo56148a(boolean z) {
        boolean z2;
        Integer num;
        boolean z3;
        if (((FpsRecyclerView) mo48632a((int) R.id.ca3)) != null) {
            FpsRecyclerView fpsRecyclerView = (FpsRecyclerView) mo48632a((int) R.id.ca3);
            C52711k.m112236a((Object) fpsRecyclerView, "recyclerView");
            if (fpsRecyclerView.getLayoutManager() != null) {
                FpsRecyclerView fpsRecyclerView2 = (FpsRecyclerView) mo48632a((int) R.id.ca3);
                C52711k.m112236a((Object) fpsRecyclerView2, "recyclerView");
                C1332i layoutManager = fpsRecyclerView2.getLayoutManager();
                if (layoutManager != null) {
                    Integer num2 = null;
                    int[] a = ((WrapStaggeredGridLayoutManager) layoutManager).mo5240a((int[]) null);
                    C52711k.m112236a((Object) a, "(recyclerView.layoutMana…isibleItemPositions(null)");
                    C52711k.m112240b(a, "$this$min");
                    int i = 1;
                    if (a.length == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        num = null;
                    } else {
                        int i2 = a[0];
                        int a2 = C52568f.m112072a(a);
                        if (a2 > 0) {
                            int i3 = i2;
                            int i4 = 1;
                            while (true) {
                                int i5 = a[i4];
                                if (i3 > i5) {
                                    i3 = i5;
                                }
                                if (i4 == a2) {
                                    break;
                                }
                                i4++;
                            }
                            i2 = i3;
                        }
                        num = Integer.valueOf(i2);
                    }
                    FpsRecyclerView fpsRecyclerView3 = (FpsRecyclerView) mo48632a((int) R.id.ca3);
                    C52711k.m112236a((Object) fpsRecyclerView3, "recyclerView");
                    C1332i layoutManager2 = fpsRecyclerView3.getLayoutManager();
                    if (layoutManager2 != null) {
                        int[] c = ((WrapStaggeredGridLayoutManager) layoutManager2).mo5242c((int[]) null);
                        C52711k.m112236a((Object) c, "(recyclerView.layoutMana…isibleItemPositions(null)");
                        C52711k.m112240b(c, "$this$max");
                        if (c.length == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            int i6 = c[0];
                            int a3 = C52568f.m112072a(c);
                            if (a3 > 0) {
                                while (true) {
                                    int i7 = c[i];
                                    if (i6 < i7) {
                                        i6 = i7;
                                    }
                                    if (i == a3) {
                                        break;
                                    }
                                    i++;
                                }
                            }
                            num2 = Integer.valueOf(i6);
                        }
                        if (num != null && num2 != null) {
                            int intValue = num.intValue();
                            int intValue2 = num2.intValue();
                            if (intValue <= intValue2) {
                                while (true) {
                                    C1352v e = ((FpsRecyclerView) mo48632a((int) R.id.ca3)).mo4844e(intValue);
                                    if (e instanceof C28744c) {
                                        ((C28744c) e).mo58373a(z);
                                    }
                                    if (intValue != intValue2) {
                                        intValue++;
                                    } else {
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.WrapStaggeredGridLayoutManager");
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.WrapStaggeredGridLayoutManager");
                }
            }
        }
    }

    @C53771m
    public final void onVideoEvent(C30332aw awVar) {
        C52711k.m112240b(awVar, "event");
        if (awVar.f79228a == 21) {
            Object obj = awVar.f79229b;
            if (obj != null) {
                DiscoveryCellStructV3 discoveryCellStructV3 = (DiscoveryCellStructV3) obj;
                FpsRecyclerView fpsRecyclerView = (FpsRecyclerView) mo48632a((int) R.id.ca3);
                C52711k.m112236a((Object) fpsRecyclerView, "recyclerView");
                C1322a adapter = fpsRecyclerView.getAdapter();
                if (adapter != null) {
                    List d = ((C28721a) adapter).mo48637d();
                    int size = d.size();
                    int i = discoveryCellStructV3.idx;
                    if (i >= 0 && size > i) {
                        DiscoveryCellStructV3 discoveryCellStructV32 = (DiscoveryCellStructV3) d.get(discoveryCellStructV3.idx);
                        if (C52711k.m112239a((Object) discoveryCellStructV32.cellID, (Object) discoveryCellStructV3.cellID) && discoveryCellStructV32.type != 3) {
                            DiscoverViewModelV3 g = mo58367g();
                            FpsRecyclerView fpsRecyclerView2 = (FpsRecyclerView) mo48632a((int) R.id.ca3);
                            C52711k.m112236a((Object) fpsRecyclerView2, "recyclerView");
                            C1322a adapter2 = fpsRecyclerView2.getAdapter();
                            if (adapter2 != null) {
                                C28721a aVar = (C28721a) adapter2;
                                C52711k.m112240b(discoveryCellStructV3, "cell");
                                C52711k.m112240b(aVar, "adapter");
                                g.mo22527b(new C28773l(g, discoveryCellStructV3, aVar));
                                if (discoveryCellStructV3.idx == 0) {
                                    C28721a aVar2 = this.f75365c;
                                    if (aVar2 == null) {
                                        C52711k.m112237a("adapter");
                                    }
                                    aVar2.notifyDataSetChanged();
                                }
                            } else {
                                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.v3.adapter.DiscoverAdapterV3");
                            }
                        }
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.v3.adapter.DiscoverAdapterV3");
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3");
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        DmtDefaultView dmtDefaultView = new DmtDefaultView(getContext());
        dmtDefaultView.setSupportDelayVisible(true);
        dmtDefaultView.setStatus(C48190g.m104428a(getActivity(), new C28734g(this)));
        MtEmptyView a = MtEmptyView.m21697a((Context) getActivity());
        a.setStatus(new C10723a(getActivity()).mo19280b((int) R.string.bx4).f28711a);
        ((DmtStatusView) mo48632a((int) R.id.csl)).setBuilder(C10719a.m21676a((Context) getActivity()).mo19231b((View) a).mo19234c((View) dmtDefaultView));
        DmtStatusView dmtStatusView = (DmtStatusView) mo48632a((int) R.id.csl);
        Context context = getContext();
        if (context == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) context, "context!!");
        dmtStatusView.setUseScreenHeight(context.getResources().getDimensionPixelSize(R.dimen.mh));
        this.f75365c = new C28721a(this, mo58367g().f75440i);
        ListMiddleware<DiscoverStateV3, DiscoveryCellStructV3, C11865l> listMiddleware = mo58367g().f75440i;
        C11797e eVar = this;
        C28721a aVar = this.f75365c;
        if (aVar == null) {
            C52711k.m112237a("adapter");
        }
        ListMiddleware.m24163a(listMiddleware, eVar, aVar, false, false, new C28731d(new C28735h(this), new C28736i(this), new C28737j(this)), new C28733f(new C28739k(this), new C28740l(this), C28732e.INSTANCE), new C28741m(this), null, null, null, 908, null);
        FpsRecyclerView fpsRecyclerView = (FpsRecyclerView) mo48632a((int) R.id.ca3);
        C52711k.m112236a((Object) fpsRecyclerView, "recyclerView");
        C28721a aVar2 = this.f75365c;
        if (aVar2 == null) {
            C52711k.m112237a("adapter");
        }
        fpsRecyclerView.setAdapter(aVar2);
        FpsRecyclerView fpsRecyclerView2 = (FpsRecyclerView) mo48632a((int) R.id.ca3);
        C52711k.m112236a((Object) fpsRecyclerView2, "recyclerView");
        WrapStaggeredGridLayoutManager wrapStaggeredGridLayoutManager = new WrapStaggeredGridLayoutManager(2, 1);
        wrapStaggeredGridLayoutManager.mo4731b(0);
        fpsRecyclerView2.setLayoutManager(wrapStaggeredGridLayoutManager);
        ((FpsRecyclerView) mo48632a((int) R.id.ca3)).mo4798a((C1331h) new C28743b());
        ((SwipeRefreshLayout) mo48632a((int) R.id.cvt)).setOnRefreshListener(new C28742n(this));
        FpsRecyclerView fpsRecyclerView3 = (FpsRecyclerView) mo48632a((int) R.id.ca3);
        C52711k.m112236a((Object) fpsRecyclerView3, "recyclerView");
        C28721a aVar3 = this.f75365c;
        if (aVar3 == null) {
            C52711k.m112237a("adapter");
        }
        fpsRecyclerView3.setAdapter(aVar3);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.nd, viewGroup, false);
    }
}
