package com.p683ss.android.ugc.aweme.following.p1770ui;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.jedi.arch.C11797e.C11798a;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.ext.list.C11853b;
import com.bytedance.jedi.arch.internal.C11896i;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.following.p1768a.C32004k;
import com.p683ss.android.ugc.aweme.following.p1770ui.adapter.FollowListAdapter;
import com.p683ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32760i;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.recommend.RecommendListViewModel;
import com.p683ss.android.ugc.aweme.recommend.RecommendUserListState;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.C52669a;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.following.ui.aa */
public final class C32055aa extends C32052a {

    /* renamed from: k */
    static final /* synthetic */ C52767h[] f83669k = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C32055aa.class), "mRecommendUserLisViewModel", "getMRecommendUserLisViewModel()Lcom/ss/android/ugc/aweme/recommend/RecommendListViewModel;"))};

    /* renamed from: l */
    public FollowListAdapter f83670l;

    /* renamed from: m */
    private final lifecycleAwareLazy f83671m;

    /* renamed from: n */
    private HashMap f83672n;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.aa$a */
    public static final class C32056a extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C52760c f83673a;

        public C32056a(C52760c cVar) {
            this.f83673a = cVar;
            super(0);
        }

        public final String invoke() {
            String name = C52669a.m112219a(this.f83673a).getName();
            C52711k.m112236a((Object) name, "viewModelClass.java.name");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.aa$b */
    public static final class C32057b extends C52712l implements C52670a<RecommendListViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f83674a;

        /* renamed from: b */
        final /* synthetic */ C52670a f83675b;

        /* renamed from: c */
        final /* synthetic */ C52760c f83676c;

        /* renamed from: d */
        final /* synthetic */ C52682m f83677d;

        public C32057b(Fragment fragment, C52670a aVar, C52760c cVar, C52682m mVar) {
            this.f83674a = fragment;
            this.f83675b = aVar;
            this.f83676c = cVar;
            this.f83677d = mVar;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.recommend.RecommendListViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3, types: [com.ss.android.ugc.aweme.recommend.RecommendListViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.recommend.RecommendListViewModel, java.lang.Object]
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
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p683ss.android.ugc.aweme.recommend.RecommendListViewModel invoke() {
            /*
                r3 = this;
                android.support.v4.app.Fragment r0 = r3.f83674a
                android.support.v4.app.Fragment r1 = r3.f83674a
                com.bytedance.jedi.arch.ad r1 = (com.bytedance.jedi.arch.C11791ad) r1
                android.arch.lifecycle.y$b r1 = r1.mo22542a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r0, r1)
                d.f.a.a r1 = r3.f83675b
                java.lang.Object r1 = r1.invoke()
                java.lang.String r1 = (java.lang.String) r1
                d.k.c r2 = r3.f83676c
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                com.bytedance.jedi.arch.n r1 = r0.f31279c
                java.lang.Class<com.ss.android.ugc.aweme.recommend.RecommendListViewModel> r2 = com.p683ss.android.ugc.aweme.recommend.RecommendListViewModel.class
                com.bytedance.jedi.arch.m r1 = r1.mo22643a(r2)
                if (r1 == 0) goto L_0x0034
                java.lang.String r2 = "this"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                r1.binding(r0)
            L_0x0034:
                com.ss.android.ugc.aweme.following.ui.aa$b$1 r1 = new com.ss.android.ugc.aweme.following.ui.aa$b$1
                r1.<init>(r3)
                d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
                r0.mo22526a(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.p1770ui.C32055aa.C32057b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.aa$c */
    static final class C32059c implements C26846a {

        /* renamed from: a */
        final /* synthetic */ C32055aa f83679a;

        C32059c(C32055aa aaVar) {
            this.f83679a = aaVar;
        }

        public final void ar_() {
            this.f83679a.mo22552a(this.f83679a.mo65270v(), new C52671b<RecommendUserListState, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C32059c f83680a;

                {
                    this.f83680a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    C52711k.m112240b((RecommendUserListState) obj, "it");
                    C32055aa aaVar = this.f83680a.f83679a;
                    FollowListAdapter followListAdapter = aaVar.f83670l;
                    if (followListAdapter == null) {
                        C52711k.m112237a("mSuggestListAdapter");
                    }
                    followListAdapter.am_();
                    aaVar.mo65270v().mo22588k();
                    return C52860x.f131107a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.aa$d */
    static final class C32061d extends C52712l implements C52686q<C11866f, List<? extends User>, C11853b, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32055aa f83681a;

        C32061d(C32055aa aaVar) {
            this.f83681a = aaVar;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            List list = (List) obj2;
            C11853b bVar = (C11853b) obj3;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(list, "list");
            C52711k.m112240b(bVar, "hasMore");
            if (bVar.f31440a) {
                C32055aa.m74457a(this.f83681a).ao_();
            } else if (!list.isEmpty()) {
                C32055aa.m74457a(this.f83681a).an_();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.aa$e */
    static final class C32062e extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32055aa f83682a;

        C32062e(C32055aa aaVar) {
            this.f83682a = aaVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            ((DmtStatusView) this.f83682a.mo48632a((int) R.id.csv)).mo19212f();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.aa$f */
    static final class C32063f extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32055aa f83683a;

        C32063f(C32055aa aaVar) {
            this.f83683a = aaVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "error");
            ((DmtStatusView) this.f83683a.mo48632a((int) R.id.csv)).mo19214h();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.aa$g */
    static final class C32064g extends C52712l implements C52682m<C11866f, List<? extends User>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32055aa f83684a;

        C32064g(C32055aa aaVar) {
            this.f83684a = aaVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List list = (List) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(list, "data");
            if (list.isEmpty()) {
                ((DmtStatusView) this.f83684a.mo48632a((int) R.id.csv)).mo19213g();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.aa$h */
    static final class C32065h extends C52712l implements C52682m<C11866f, List<? extends User>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32055aa f83685a;

        C32065h(C32055aa aaVar) {
            this.f83685a = aaVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List list = (List) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(list, "list");
            DmtStatusView dmtStatusView = (DmtStatusView) this.f83685a.mo48632a((int) R.id.csv);
            C52711k.m112236a((Object) dmtStatusView, "status_view");
            dmtStatusView.setVisibility(8);
            List arrayList = new ArrayList();
            int i = 0;
            int i2 = 0;
            for (Object next : list) {
                int i3 = i + 1;
                if (i < 0) {
                    C52575l.m112100b();
                }
                User user = (User) next;
                if (user instanceof RecommendContact) {
                    arrayList.add(user);
                } else {
                    String requestId = user.getRequestId();
                    C52711k.m112236a((Object) requestId, "user.requestId");
                    arrayList.add(new C32004k(13, user, i2, requestId));
                    i2++;
                }
                i = i3;
            }
            C32055aa.m74457a(this.f83685a).mo48634a(arrayList);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.aa$i */
    static final class C32066i extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32055aa f83686a;

        C32066i(C32055aa aaVar) {
            this.f83686a = aaVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            C32055aa.m74457a(this.f83686a).am_();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.aa$j */
    static final class C32067j extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32055aa f83687a;

        C32067j(C32055aa aaVar) {
            this.f83687a = aaVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "it");
            C32055aa.m74457a(this.f83687a).mo54793i();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.aa$k */
    static final class C32068k extends C52712l implements C52682m<RecommendUserListState, Bundle, RecommendUserListState> {

        /* renamed from: a */
        final /* synthetic */ C32055aa f83688a;

        C32068k(C32055aa aaVar) {
            this.f83688a = aaVar;
            super(2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
            if (r11 == null) goto L_0x0022;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r11, java.lang.Object r12) {
            /*
                r10 = this;
                r0 = r11
                com.ss.android.ugc.aweme.recommend.RecommendUserListState r0 = (com.p683ss.android.ugc.aweme.recommend.RecommendUserListState) r0
                android.os.Bundle r12 = (android.os.Bundle) r12
                java.lang.String r11 = "$receiver"
                p2628d.p2639f.p2641b.C52711k.m112240b(r0, r11)
                com.ss.android.ugc.aweme.following.ui.aa r11 = r10.f83688a
                java.lang.String r11 = r11.f83663b
                if (r11 != 0) goto L_0x0012
                java.lang.String r11 = ""
            L_0x0012:
                r1 = r11
                com.ss.android.ugc.aweme.following.ui.aa r11 = r10.f83688a
                com.ss.android.ugc.aweme.profile.model.User r11 = r11.f83664c
                if (r11 == 0) goto L_0x0022
                java.lang.String r11 = r11.getSecUid()
                if (r11 != 0) goto L_0x0020
                goto L_0x0022
            L_0x0020:
                r2 = r11
                goto L_0x0025
            L_0x0022:
                java.lang.String r11 = ""
                goto L_0x0020
            L_0x0025:
                com.ss.android.ugc.aweme.following.ui.aa r11 = r10.f83688a
                boolean r3 = r11.mo65258k()
                r4 = 21
                r5 = 0
                com.ss.android.ugc.aweme.recommend.h r6 = new com.ss.android.ugc.aweme.recommend.h
                com.ss.android.ugc.aweme.following.ui.aa r11 = r10.f83688a
                java.lang.String r11 = r11.mo65260m()
                com.ss.android.ugc.aweme.following.ui.aa r12 = r10.f83688a
                java.lang.String r12 = r12.mo65261n()
                java.lang.String r7 = "empty"
                r6.<init>(r11, r12, r7)
                r7 = 0
                r8 = 80
                r9 = 0
                com.ss.android.ugc.aweme.recommend.RecommendUserListState r11 = com.p683ss.android.ugc.aweme.recommend.RecommendUserListState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.p1770ui.C32055aa.C32068k.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public final View mo48632a(int i) {
        if (this.f83672n == null) {
            this.f83672n = new HashMap();
        }
        View view = (View) this.f83672n.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f83672n.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public final void mo48633e() {
        if (this.f83672n != null) {
            this.f83672n.clear();
        }
    }

    /* renamed from: j */
    public final int mo65257j() {
        return R.layout.bay;
    }

    /* renamed from: m */
    public final String mo65260m() {
        return "suggested_list";
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo48633e();
    }

    /* renamed from: s */
    public final int mo65266s() {
        return R.drawable.aqy;
    }

    /* renamed from: t */
    public final int mo65267t() {
        return R.string.czn;
    }

    /* renamed from: u */
    public final int mo65268u() {
        return R.string.hl4;
    }

    /* renamed from: v */
    public final RecommendListViewModel mo65270v() {
        return (RecommendListViewModel) this.f83671m.getValue();
    }

    /* renamed from: r */
    public final void mo65265r() {
        ((DmtStatusView) mo48632a((int) R.id.csv)).mo19212f();
        mo65270v().mo22587j();
    }

    public C32055aa() {
        C52682m kVar = new C32068k(this);
        C52760c a = C52728w.m112245a(RecommendListViewModel.class);
        C52670a aVar = new C32056a(a);
        this.f83671m = new lifecycleAwareLazy(this, aVar, new C32057b(this, aVar, a, kVar));
    }

    /* renamed from: a */
    public static final /* synthetic */ FollowListAdapter m74457a(C32055aa aaVar) {
        FollowListAdapter followListAdapter = aaVar.f83670l;
        if (followListAdapter == null) {
            C52711k.m112237a("mSuggestListAdapter");
        }
        return followListAdapter;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo48632a((int) R.id.cra);
        C52711k.m112236a((Object) swipeRefreshLayout, "srl_refresh");
        swipeRefreshLayout.setEnabled(false);
        DmtStatusView dmtStatusView = (DmtStatusView) mo48632a((int) R.id.csv);
        C52711k.m112236a((Object) dmtStatusView, "status_view");
        mo65252a(dmtStatusView);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.mo4731b(1);
        RecyclerView recyclerView = (RecyclerView) mo48632a((int) R.id.cg7);
        C52711k.m112236a((Object) recyclerView, "rv_list");
        recyclerView.setLayoutManager(wrapLinearLayoutManager);
        RecyclerView recyclerView2 = (RecyclerView) mo48632a((int) R.id.cg7);
        C52711k.m112236a((Object) recyclerView2, "rv_list");
        recyclerView2.setItemAnimator(new C32760i());
        this.f83670l = new FollowListAdapter(this, "suggest_user", mo65258k());
        FollowListAdapter followListAdapter = this.f83670l;
        if (followListAdapter == null) {
            C52711k.m112237a("mSuggestListAdapter");
        }
        followListAdapter.f70682s = getResources().getColor(R.color.a0_);
        RecyclerView recyclerView3 = (RecyclerView) mo48632a((int) R.id.cg7);
        C52711k.m112236a((Object) recyclerView3, "rv_list");
        FollowListAdapter followListAdapter2 = this.f83670l;
        if (followListAdapter2 == null) {
            C52711k.m112237a("mSuggestListAdapter");
        }
        recyclerView3.setAdapter(followListAdapter2);
        FollowListAdapter followListAdapter3 = this.f83670l;
        if (followListAdapter3 == null) {
            C52711k.m112237a("mSuggestListAdapter");
        }
        followListAdapter3.mo54788a((C26846a) new C32059c(this));
        C11798a.m24151a(this, mo65270v(), C32069ab.f83689a, null, new C32063f(this), new C32062e(this), new C32064g(this), 2, null);
        mo22547a(mo65270v(), C32121ae.f83811a, C11896i.m24255a(), new C32065h(this));
        C11798a.m24151a(this, mo65270v(), C32122af.f83812a, null, new C32067j(this), new C32066i(this), null, 18, null);
        mo22549a(mo65270v(), C32070ac.f83690a, C32071ad.f83691a, C11896i.m24255a(), new C32061d(this));
        if (!this.f83665d) {
            mo65270v().mo22587j();
        }
    }
}
