package com.p683ss.android.ugc.aweme.discover.p1665v4.p1667ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.widget.SwipeRefreshLayout;
import android.support.p030v4.widget.SwipeRefreshLayout.C1091b;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.abmock.C10181b;
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
import com.p683ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27721d;
import com.p683ss.android.ugc.aweme.discover.p1665v4.p1666a.C28777a;
import com.p683ss.android.ugc.aweme.discover.p1665v4.viewholder.DiscoverV4BannerViewHolder;
import com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel.DiscoverV4ListState;
import com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel.DiscoverV4ListViewModel;
import com.p683ss.android.ugc.aweme.experiment.NewDiscoverV4Experiment;
import com.p683ss.android.ugc.aweme.main.experiment.ReleaseWindowBackgroundExperiment;
import com.p683ss.android.ugc.aweme.views.C48190g;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
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

/* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.a */
public final class C28812a extends C23462b implements C27721d {

    /* renamed from: b */
    static final /* synthetic */ C52767h[] f75516b = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28812a.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/discover/v4/viewmodel/DiscoverV4ListViewModel;"))};

    /* renamed from: c */
    public final boolean f75517c = NewDiscoverV4Experiment.m69617a();

    /* renamed from: d */
    public C28777a f75518d;

    /* renamed from: e */
    private final lifecycleAwareLazy f75519e;

    /* renamed from: j */
    private HashMap f75520j;

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.a$a */
    public static final class C28813a extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C52760c f75521a;

        public C28813a(C52760c cVar) {
            this.f75521a = cVar;
            super(0);
        }

        public final String invoke() {
            String name = C52669a.m112219a(this.f75521a).getName();
            C52711k.m112236a((Object) name, "viewModelClass.java.name");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.a$b */
    public static final class C28814b extends C52712l implements C52682m<DiscoverV4ListState, Bundle, DiscoverV4ListState> {
        public static final C28814b INSTANCE = new C28814b();

        public C28814b() {
            super(2);
        }

        public final DiscoverV4ListState invoke(DiscoverV4ListState discoverV4ListState, Bundle bundle) {
            C52711k.m112240b(discoverV4ListState, "$receiver");
            return discoverV4ListState;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.a$c */
    public static final class C28815c extends C52712l implements C52670a<DiscoverV4ListViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f75522a;

        /* renamed from: b */
        final /* synthetic */ C52670a f75523b;

        /* renamed from: c */
        final /* synthetic */ C52760c f75524c;

        /* renamed from: d */
        final /* synthetic */ C52682m f75525d;

        public C28815c(Fragment fragment, C52670a aVar, C52760c cVar, C52682m mVar) {
            this.f75522a = fragment;
            this.f75523b = aVar;
            this.f75524c = cVar;
            this.f75525d = mVar;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4ListViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3, types: [com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4ListViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4ListViewModel, java.lang.Object]
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
        public final com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel.DiscoverV4ListViewModel invoke() {
            /*
                r3 = this;
                android.support.v4.app.Fragment r0 = r3.f75522a
                android.support.v4.app.Fragment r1 = r3.f75522a
                com.bytedance.jedi.arch.ad r1 = (com.bytedance.jedi.arch.C11791ad) r1
                android.arch.lifecycle.y$b r1 = r1.mo22542a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r0, r1)
                d.f.a.a r1 = r3.f75523b
                java.lang.Object r1 = r1.invoke()
                java.lang.String r1 = (java.lang.String) r1
                d.k.c r2 = r3.f75524c
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                com.bytedance.jedi.arch.n r1 = r0.f31279c
                java.lang.Class<com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4ListViewModel> r2 = com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel.DiscoverV4ListViewModel.class
                com.bytedance.jedi.arch.m r1 = r1.mo22643a(r2)
                if (r1 == 0) goto L_0x0034
                java.lang.String r2 = "this"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                r1.binding(r0)
            L_0x0034:
                com.ss.android.ugc.aweme.discover.v4.ui.a$c$1 r1 = new com.ss.android.ugc.aweme.discover.v4.ui.a$c$1
                r1.<init>(r3)
                d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
                r0.mo22526a(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1665v4.p1667ui.C28812a.C28815c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.a$d */
    public static final class C28817d implements C11854c<DiscoverCategoryStructV4, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f75527a;

        /* renamed from: b */
        final /* synthetic */ C52682m f75528b;

        /* renamed from: c */
        final /* synthetic */ C52682m f75529c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f75530d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f75531e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends DiscoverCategoryStructV4>, C52860x> f75532f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f75530d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f75531e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends DiscoverCategoryStructV4>, C52860x> mo22603c() {
            return this.f75532f;
        }

        public C28817d(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f75527a = bVar;
            this.f75528b = mVar;
            this.f75529c = mVar2;
            this.f75530d = bVar;
            this.f75531e = mVar;
            this.f75532f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.a$e */
    static final class C28818e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C28812a f75533a;

        C28818e(C28812a aVar) {
            this.f75533a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f75533a.mo58416g().f75671f.mo22565b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.a$f */
    static final class C28819f extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28812a f75534a;

        C28819f(C28812a aVar) {
            this.f75534a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            if (this.f75534a.f75517c) {
                DmtStatusView dmtStatusView = (DmtStatusView) this.f75534a.mo48632a((int) R.id.csl);
                if (dmtStatusView != null && dmtStatusView.mo19217k()) {
                    DmtStatusView dmtStatusView2 = (DmtStatusView) this.f75534a.mo48632a((int) R.id.csl);
                    if (dmtStatusView2 != null) {
                        dmtStatusView2.mo19212f();
                    }
                }
                C28777a aVar = this.f75534a.f75518d;
                if (aVar == null) {
                    C52711k.m112237a("adapter");
                }
                if (aVar.getItemCount() <= 0) {
                    DmtStatusView dmtStatusView3 = (DmtStatusView) this.f75534a.mo48632a((int) R.id.csl);
                    if (dmtStatusView3 != null) {
                        dmtStatusView3.mo19212f();
                    }
                } else {
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f75534a.mo48632a((int) R.id.ez0);
                    if (swipeRefreshLayout != null) {
                        swipeRefreshLayout.setRefreshing(true);
                    }
                }
            } else {
                DmtStatusView dmtStatusView4 = (DmtStatusView) this.f75534a.mo48632a((int) R.id.csl);
                if (dmtStatusView4 != null) {
                    dmtStatusView4.mo19212f();
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.a$g */
    static final class C28820g extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28812a f75535a;

        C28820g(C28812a aVar) {
            this.f75535a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "it");
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f75535a.mo48632a((int) R.id.ez0);
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(false);
            }
            ((DmtStatusView) this.f75535a.mo48632a((int) R.id.csl)).mo19214h();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.a$h */
    static final class C28821h extends C52712l implements C52682m<C11866f, List<? extends DiscoverCategoryStructV4>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28812a f75536a;

        C28821h(C28812a aVar) {
            this.f75536a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            List list = (List) obj2;
            C52711k.m112240b(fVar, "$receiver");
            C52711k.m112240b(list, "it");
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f75536a.mo48632a((int) R.id.ez0);
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(false);
            }
            ((DmtStatusView) this.f75536a.mo48632a((int) R.id.csl)).mo19208c(true);
            DiscoverV4ListViewModel g = this.f75536a.mo58416g();
            if (g == null) {
                C52711k.m112234a();
            }
            fVar.mo22552a(g, new C52671b<DiscoverV4ListState, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C28821h f75537a;

                {
                    this.f75537a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    DiscoverV4ListState discoverV4ListState = (DiscoverV4ListState) obj;
                    C52711k.m112240b(discoverV4ListState, "it");
                    if (!discoverV4ListState.getCells().getPayload().f31449a.f31440a && discoverV4ListState.getCells().getList().isEmpty()) {
                        ((DmtStatusView) this.f75537a.f75536a.mo48632a((int) R.id.csl)).mo19213g();
                    }
                    return C52860x.f131107a;
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.a$i */
    static final class C28823i implements C1091b {

        /* renamed from: a */
        final /* synthetic */ C28812a f75538a;

        C28823i(C28812a aVar) {
            this.f75538a = aVar;
        }

        public final void onRefresh() {
            this.f75538a.mo58416g().f75671f.mo22565b();
        }
    }

    /* renamed from: a */
    public final View mo48632a(int i) {
        if (this.f75520j == null) {
            this.f75520j = new HashMap();
        }
        View view = (View) this.f75520j.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f75520j.put(Integer.valueOf(i), view);
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
        if (this.f75520j != null) {
            this.f75520j.clear();
        }
    }

    /* renamed from: g */
    public final DiscoverV4ListViewModel mo58416g() {
        return (DiscoverV4ListViewModel) this.f75519e.getValue();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo48633e();
    }

    public C28812a() {
        C52760c a = C52728w.m112245a(DiscoverV4ListViewModel.class);
        C52670a aVar = new C28813a(a);
        this.f75519e = new lifecycleAwareLazy(this, aVar, new C28815c(this, aVar, a, C28814b.INSTANCE));
    }

    public final void aL_() {
        if (((RecyclerView) mo48632a((int) R.id.cg7)) != null) {
            RecyclerView recyclerView = (RecyclerView) mo48632a((int) R.id.cg7);
            if (recyclerView == null || !recyclerView.canScrollVertically(-1)) {
                mo58416g().f75671f.mo22565b();
                return;
            }
            RecyclerView recyclerView2 = (RecyclerView) mo48632a((int) R.id.cg7);
            if (recyclerView2 != null) {
                recyclerView2.mo4814b(0);
            }
        }
    }

    /* renamed from: a */
    public final void mo56148a(boolean z) {
        C1352v vVar;
        if (this.f75517c) {
            RecyclerView recyclerView = (RecyclerView) mo48632a((int) R.id.cg7);
            if (recyclerView != null) {
                vVar = recyclerView.mo4847f(0);
            } else {
                vVar = null;
            }
            DiscoverV4BannerViewHolder discoverV4BannerViewHolder = (DiscoverV4BannerViewHolder) vVar;
            if (discoverV4BannerViewHolder != null) {
                discoverV4BannerViewHolder.mo58448a(!z);
            }
            if (discoverV4BannerViewHolder != null) {
                discoverV4BannerViewHolder.mo58450b(!z);
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        DmtDefaultView dmtDefaultView = new DmtDefaultView(getContext());
        dmtDefaultView.setSupportDelayVisible(true);
        dmtDefaultView.setStatus(C48190g.m104428a(getActivity(), new C28818e(this)));
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
        this.f75518d = new C28777a(this, mo58416g().f75671f);
        ListMiddleware<DiscoverV4ListState, DiscoverCategoryStructV4, C11865l> listMiddleware = mo58416g().f75671f;
        C11797e eVar = this;
        C28777a aVar = this.f75518d;
        if (aVar == null) {
            C52711k.m112237a("adapter");
        }
        ListMiddleware.m24163a(listMiddleware, eVar, aVar, false, false, new C28817d(new C28819f(this), new C28820g(this), new C28821h(this)), null, null, null, null, null, 1004, null);
        if (!this.f75517c) {
            C28777a aVar2 = this.f75518d;
            if (aVar2 == null) {
                C52711k.m112237a("adapter");
            }
            aVar2.mo48634a(C52575l.m112092a(new DiscoverCategoryStructV4("", "")));
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo48632a((int) R.id.ez0);
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setEnabled(false);
            }
        } else {
            SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) mo48632a((int) R.id.ez0);
            if (swipeRefreshLayout2 != null) {
                swipeRefreshLayout2.setOnRefreshListener(new C28823i(this));
            }
        }
        RecyclerView recyclerView = (RecyclerView) mo48632a((int) R.id.cg7);
        C52711k.m112236a((Object) recyclerView, "rv_list");
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.mo4731b(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = (RecyclerView) mo48632a((int) R.id.cg7);
        C52711k.m112236a((Object) recyclerView2, "rv_list");
        C28777a aVar3 = this.f75518d;
        if (aVar3 == null) {
            C52711k.m112237a("adapter");
        }
        recyclerView2.setAdapter(aVar3);
        if (C10181b.m20511a().mo18172a(ReleaseWindowBackgroundExperiment.class, true, "is_release_window_background", 31744, true)) {
            RelativeLayout relativeLayout = (RelativeLayout) mo48632a((int) R.id.etk);
            Context context2 = getContext();
            if (context2 != null) {
                Resources resources = context2.getResources();
                if (resources != null) {
                    i = resources.getColor(R.color.a3i);
                    relativeLayout.setBackgroundColor(i);
                }
            }
            i = -1;
            relativeLayout.setBackgroundColor(i);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.baj, viewGroup, false);
    }
}
