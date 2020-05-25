package com.p683ss.android.ugc.aweme.follow.recommend.follow.view;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.jedi.arch.C11797e;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.ext.list.C11837a;
import com.bytedance.jedi.arch.ext.list.C11854c;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.internal.C11896i;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.p683ss.android.ugc.aweme.app.C22835a;
import com.p683ss.android.ugc.aweme.base.arch.C23462b;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.follow.recommend.follow.repo.C31907e;
import com.p683ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowState;
import com.p683ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.views.AutoRTLImageView;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
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
import p2628d.p2639f.p2641b.C52722v.C52725c;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.c */
public final class C31923c extends C23462b {

    /* renamed from: b */
    static final /* synthetic */ C52767h[] f83394b = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C31923c.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/follow/recommend/follow/viewModel/RecommendFollowViewModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C31923c.class), "recommendFollowAdapter", "getRecommendFollowAdapter()Lcom/ss/android/ugc/aweme/follow/recommend/follow/view/RecommendFollowAdapter;"))};

    /* renamed from: c */
    public String f83395c;

    /* renamed from: d */
    public String f83396d;

    /* renamed from: e */
    public RelationDynamicLabel f83397e;

    /* renamed from: j */
    public String f83398j = "homepage_hot";

    /* renamed from: k */
    private final lifecycleAwareLazy f83399k;

    /* renamed from: l */
    private final C52668f f83400l;

    /* renamed from: m */
    private HashMap f83401m;

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.c$a */
    public static final class C31924a extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C52760c f83402a;

        public C31924a(C52760c cVar) {
            this.f83402a = cVar;
            super(0);
        }

        public final String invoke() {
            String name = C52669a.m112219a(this.f83402a).getName();
            C52711k.m112236a((Object) name, "viewModelClass.java.name");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.c$b */
    public static final class C31925b extends C52712l implements C52670a<RecommendFollowViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f83403a;

        /* renamed from: b */
        final /* synthetic */ C52670a f83404b;

        /* renamed from: c */
        final /* synthetic */ C52760c f83405c;

        /* renamed from: d */
        final /* synthetic */ C52682m f83406d;

        public C31925b(Fragment fragment, C52670a aVar, C52760c cVar, C52682m mVar) {
            this.f83403a = fragment;
            this.f83404b = aVar;
            this.f83405c = cVar;
            this.f83406d = mVar;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel, com.bytedance.jedi.arch.JediViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel, java.lang.Object]
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
        public final com.p683ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel invoke() {
            /*
                r3 = this;
                android.support.v4.app.Fragment r0 = r3.f83403a
                android.support.v4.app.Fragment r1 = r3.f83403a
                com.bytedance.jedi.arch.ad r1 = (com.bytedance.jedi.arch.C11791ad) r1
                android.arch.lifecycle.y$b r1 = r1.mo22542a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r0, r1)
                d.f.a.a r1 = r3.f83404b
                java.lang.Object r1 = r1.invoke()
                java.lang.String r1 = (java.lang.String) r1
                d.k.c r2 = r3.f83405c
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                com.bytedance.jedi.arch.n r1 = r0.f31279c
                java.lang.Class<com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel> r2 = com.p683ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel.class
                com.bytedance.jedi.arch.m r1 = r1.mo22643a(r2)
                if (r1 == 0) goto L_0x0034
                java.lang.String r2 = "this"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                r1.binding(r0)
            L_0x0034:
                com.ss.android.ugc.aweme.follow.recommend.follow.view.c$b$1 r1 = new com.ss.android.ugc.aweme.follow.recommend.follow.view.c$b$1
                r1.<init>(r3)
                d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
                r0.mo22526a(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.follow.recommend.follow.view.C31923c.C31925b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.c$c */
    static final class C31927c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31923c f83408a;

        C31927c(C31923c cVar) {
            this.f83408a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            ((DmtStatusView) this.f83408a.mo48632a(R.id.csv)).mo19212f();
            this.f83408a.mo65125g().mo65157e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.c$d */
    static final class C31928d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31923c f83409a;

        C31928d(C31923c cVar) {
            this.f83409a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f83409a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.c$e */
    public static final class C31929e implements C11854c<C31907e, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f83410a;

        /* renamed from: b */
        final /* synthetic */ C52682m f83411b;

        /* renamed from: c */
        final /* synthetic */ C52682m f83412c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f83413d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f83414e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends C31907e>, C52860x> f83415f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f83413d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f83414e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends C31907e>, C52860x> mo22603c() {
            return this.f83415f;
        }

        public C31929e(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f83410a = bVar;
            this.f83411b = mVar;
            this.f83412c = mVar2;
            this.f83413d = bVar;
            this.f83414e = mVar;
            this.f83415f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.c$f */
    public static final class C31930f extends C52712l implements C52682m<C11866f, List<? extends C31907e>, C52860x> {
        public static final C31930f INSTANCE = new C31930f();

        public C31930f() {
            super(2);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((C11866f) obj, (List) obj2);
            return C52860x.f131107a;
        }

        public final void invoke(C11866f fVar, List<? extends C31907e> list) {
            C52711k.m112240b(list, "it");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.c$g */
    public static final class C31931g implements C11854c<C31907e, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f83416a;

        /* renamed from: b */
        final /* synthetic */ C52682m f83417b;

        /* renamed from: c */
        final /* synthetic */ C52682m f83418c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f83419d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f83420e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends C31907e>, C52860x> f83421f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f83419d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f83420e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends C31907e>, C52860x> mo22603c() {
            return this.f83421f;
        }

        public C31931g(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f83416a = bVar;
            this.f83417b = mVar;
            this.f83418c = mVar2;
            this.f83419d = bVar;
            this.f83420e = mVar;
            this.f83421f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.c$h */
    static final class C31932h extends C52712l implements C52682m<C11866f, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C31923c f83422a;

        C31932h(C31923c cVar) {
            this.f83422a = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(fVar, "$receiver");
            if (booleanValue) {
                this.f83422a.mo65126j().ao_();
            } else {
                this.f83422a.mo65126j().an_();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.c$i */
    static final class C31933i extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C31923c f83423a;

        C31933i(C31923c cVar) {
            this.f83423a = cVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            ((DmtStatusView) this.f83423a.mo48632a(R.id.csv)).mo19212f();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.c$j */
    static final class C31934j extends C52712l implements C52682m<C11866f, List<? extends C31907e>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C31923c f83424a;

        C31934j(C31923c cVar) {
            this.f83424a = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List list = (List) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(list, "data");
            if (list.isEmpty()) {
                ((DmtStatusView) this.f83424a.mo48632a(R.id.csv)).mo19213g();
            } else {
                ((DmtStatusView) this.f83424a.mo48632a(R.id.csv)).mo19209d();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.c$k */
    static final class C31935k extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C31923c f83425a;

        C31935k(C31923c cVar) {
            this.f83425a = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "it");
            ((DmtStatusView) this.f83425a.mo48632a(R.id.csv)).mo19214h();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.c$l */
    static final class C31936l extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C31923c f83426a;

        C31936l(C31923c cVar) {
            this.f83426a = cVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            this.f83426a.mo65126j().am_();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.c$m */
    static final class C31937m extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C31923c f83427a;

        C31937m(C31923c cVar) {
            this.f83427a = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "it");
            this.f83427a.mo65126j().mo54793i();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.c$n */
    static final class C31938n extends C52712l implements C52682m<C11866f, C52847n<? extends String, ? extends Boolean>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C31923c f83428a;

        C31938n(C31923c cVar) {
            this.f83428a = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52847n nVar = (C52847n) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(nVar, "dislikeSuccess");
            if (!TextUtils.isEmpty((CharSequence) nVar.getFirst()) && ((Boolean) nVar.getSecond()).booleanValue()) {
                C10691a.m21548c(this.f83428a.getContext(), (int) R.string.ti).mo19066a();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.c$o */
    static final class C31939o extends C52712l implements C52670a<C31921a> {

        /* renamed from: a */
        final /* synthetic */ C31923c f83429a;

        /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.c$o$a */
        static final class C31940a implements C26846a {

            /* renamed from: a */
            final /* synthetic */ C31939o f83430a;

            C31940a(C31939o oVar) {
                this.f83430a = oVar;
            }

            public final void ar_() {
                this.f83430a.f83429a.mo65125g().f83442e.mo22567c();
            }
        }

        C31939o(C31923c cVar) {
            this.f83429a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C31921a aVar = new C31921a(this.f83429a, null, 2, null);
            aVar.mo54788a((C26846a) new C31940a(this));
            aVar.mo54792d(R.string.an1);
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.c$p */
    static final class C31941p extends C52712l implements C52671b<RecommendFollowState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C31923c f83431a;

        /* renamed from: b */
        final /* synthetic */ Aweme f83432b;

        /* renamed from: c */
        final /* synthetic */ C52725c f83433c;

        /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.c$p$a */
        static final class C31942a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ RecyclerView f83434a;

            /* renamed from: b */
            final /* synthetic */ C31941p f83435b;

            C31942a(RecyclerView recyclerView, C31941p pVar) {
                this.f83434a = recyclerView;
                this.f83435b = pVar;
            }

            public final void run() {
                C1332i layoutManager = this.f83434a.getLayoutManager();
                if (layoutManager != null) {
                    ((LinearLayoutManager) layoutManager).mo4721a(this.f83435b.f83433c.element, 0);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
            }
        }

        C31941p(C31923c cVar, Aweme aweme, C52725c cVar2) {
            this.f83431a = cVar;
            this.f83432b = aweme;
            this.f83433c = cVar2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str;
            RecommendFollowState recommendFollowState = (RecommendFollowState) obj;
            C52711k.m112240b(recommendFollowState, "it");
            Iterator it = recommendFollowState.getListState().getList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C31907e eVar = (C31907e) it.next();
                Aweme aweme = this.f83432b;
                if (aweme != null) {
                    str = aweme.getAuthorUid();
                } else {
                    str = null;
                }
                if (TextUtils.equals(str, eVar.f83352a)) {
                    this.f83433c.element = recommendFollowState.getListState().getList().indexOf(eVar);
                    break;
                }
            }
            if (this.f83433c.element >= 0) {
                RecyclerView recyclerView = (RecyclerView) this.f83431a.mo48632a(R.id.cdq);
                recyclerView.postDelayed(new C31942a(recyclerView, this), 500);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.c$q */
    static final class C31943q extends C52712l implements C52682m<RecommendFollowState, Bundle, RecommendFollowState> {

        /* renamed from: a */
        final /* synthetic */ C31923c f83436a;

        C31943q(C31923c cVar) {
            this.f83436a = cVar;
            super(2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
            if (r11 == null) goto L_0x0042;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r11, java.lang.Object r12) {
            /*
                r10 = this;
                r0 = r11
                com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowState r0 = (com.p683ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowState) r0
                android.os.Bundle r12 = (android.os.Bundle) r12
                java.lang.String r11 = "$receiver"
                p2628d.p2639f.p2641b.C52711k.m112240b(r0, r11)
                com.ss.android.ugc.aweme.follow.recommend.follow.view.c r11 = r10.f83436a
                java.lang.String r11 = r11.f83395c
                if (r11 != 0) goto L_0x0012
                java.lang.String r11 = ""
            L_0x0012:
                r1 = r11
                java.lang.String r11 = r0.getSecUid()
                if (r11 != 0) goto L_0x001b
                java.lang.String r11 = ""
            L_0x001b:
                r2 = r11
                java.lang.String r11 = r0.getPreviousPage()
                if (r11 != 0) goto L_0x0024
                java.lang.String r11 = "homepage_hot"
            L_0x0024:
                r5 = r11
                com.ss.android.ugc.aweme.follow.recommend.follow.view.c r11 = r10.f83436a
                com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel r11 = r11.f83397e
                if (r11 == 0) goto L_0x0031
                int r11 = r11.getType()
                r3 = r11
                goto L_0x0033
            L_0x0031:
                r11 = 5
                r3 = 5
            L_0x0033:
                com.ss.android.ugc.aweme.follow.recommend.follow.view.c r11 = r10.f83436a
                com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel r11 = r11.f83397e
                if (r11 == 0) goto L_0x0042
                java.lang.String r11 = r11.getLabelInfo()
                if (r11 != 0) goto L_0x0040
                goto L_0x0042
            L_0x0040:
                r4 = r11
                goto L_0x0045
            L_0x0042:
                java.lang.String r11 = ""
                goto L_0x0040
            L_0x0045:
                r6 = 0
                r7 = 0
                r8 = 96
                r9 = 0
                com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowState r11 = com.p683ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.follow.recommend.follow.view.C31923c.C31943q.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public final View mo48632a(int i) {
        if (this.f83401m == null) {
            this.f83401m = new HashMap();
        }
        View view = (View) this.f83401m.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f83401m.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public final void mo48633e() {
        if (this.f83401m != null) {
            this.f83401m.clear();
        }
    }

    /* renamed from: g */
    public final RecommendFollowViewModel mo65125g() {
        return (RecommendFollowViewModel) this.f83399k.getValue();
    }

    /* renamed from: j */
    public final C31921a mo65126j() {
        return (C31921a) this.f83400l.getValue();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo48633e();
    }

    public final void onDestroy() {
        super.onDestroy();
        C47718bf.m103291d(this);
    }

    public C31923c() {
        C52682m qVar = new C31943q(this);
        C52760c a = C52728w.m112245a(RecommendFollowViewModel.class);
        C52670a aVar = new C31924a(a);
        this.f83399k = new lifecycleAwareLazy(this, aVar, new C31925b(this, aVar, a, qVar));
        this.f83400l = C52732g.m112285a(new C31939o(this));
    }

    @C53771m
    public final void onAnchorEvent(C30332aw awVar) {
        C52711k.m112240b(awVar, "event");
        if (awVar.f79228a == 21) {
            Aweme aweme = (Aweme) awVar.f79229b;
            C52725c cVar = new C52725c();
            cVar.element = -1;
            mo22552a(mo65125g(), new C31941p(this, aweme, cVar));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f83395c = arguments.getString("uid");
            this.f83396d = arguments.getString(C22835a.f61196a);
            this.f83397e = (RelationDynamicLabel) arguments.getSerializable("relation_label");
            String string = arguments.getString("previous_page");
            C52711k.m112236a((Object) string, "getString(RecommendFollowActivity.PREVIOUS_PAGE)");
            this.f83398j = string;
        }
        C47718bf.m103290c(this);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        View a = mo48632a(R.id.dru);
        C52711k.m112236a((Object) a, "view_status");
        a.getLayoutParams().height = C9432q.m18695e(getContext());
        ((DmtStatusView) mo48632a(R.id.csv)).setBuilder(C10719a.m21676a(getContext()).mo19223a().mo19229a(new C10723a(getActivity()).mo19277a((int) R.drawable.alw).mo19280b((int) R.string.ahr).mo19282c(R.string.ahq).f28711a).mo19227a(R.string.f5o, R.string.f5k, R.string.f5u, new C31927c(this)));
        ((AutoRTLImageView) mo48632a(R.id.ik)).setOnClickListener(new C31928d(this));
        RecyclerView recyclerView = (RecyclerView) mo48632a(R.id.cdq);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new WrapLinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(mo65126j());
        }
        RecommendFollowViewModel g = mo65125g();
        C11797e eVar = this;
        C11837a j = mo65126j();
        C52682m hVar = new C31932h(this);
        C11854c eVar2 = new C31929e(new C31933i(this), new C31935k(this), new C31934j(this));
        C11854c gVar = new C31931g(new C31936l(this), new C31937m(this), C31930f.INSTANCE);
        C52711k.m112240b(eVar, "subscriber");
        C52711k.m112240b(j, "adapter");
        ListMiddleware.m24163a(g.f83442e, eVar, j, false, eVar.mo22555f(), eVar2, gVar, hVar, null, null, null, 896, null);
        mo22547a(mo65125g(), C31944d.f83437a, C11896i.m24255a(), new C31938n(this));
        mo65125g().mo65157e();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(R.layout.pl, viewGroup, false);
    }
}
