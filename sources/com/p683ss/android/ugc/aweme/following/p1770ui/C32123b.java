package com.p683ss.android.ugc.aweme.following.p1770ui;

import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.jedi.arch.C11797e;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.ext.list.C11837a;
import com.bytedance.jedi.arch.ext.list.C11854c;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.following.p1770ui.adapter.C32105a;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.C32346c;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.ConnectedRelationListViewModel;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.ConnectedRelationState;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowRelationTabViewModel;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowRelationTabViewModel.C32309a;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32760i;
import com.p683ss.android.ugc.aweme.unread.C47496d;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import p2628d.C52668f;
import p2628d.C52732g;
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

/* renamed from: com.ss.android.ugc.aweme.following.ui.b */
public final class C32123b extends C32052a {

    /* renamed from: k */
    static final /* synthetic */ C52767h[] f83813k = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C32123b.class), "mConnectedRelationViewModel", "getMConnectedRelationViewModel()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/ConnectedRelationListViewModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C32123b.class), "mFollowRelationModel", "getMFollowRelationModel()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowRelationTabViewModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C32123b.class), "mConnectedRelationAdapter", "getMConnectedRelationAdapter()Lcom/ss/android/ugc/aweme/following/ui/adapter/ConnectedRelationAdapter;"))};

    /* renamed from: l */
    final C52668f f83814l;

    /* renamed from: m */
    private FragmentActivity f83815m;

    /* renamed from: n */
    private final lifecycleAwareLazy f83816n;

    /* renamed from: o */
    private final C52668f f83817o = C52732g.m112285a(new C32138m(this));

    /* renamed from: p */
    private HashMap f83818p;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.b$a */
    public static final class C32124a extends C52712l implements C52670a<FollowRelationTabViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f83819a;

        /* renamed from: b */
        final /* synthetic */ C52760c f83820b;

        /* renamed from: c */
        final /* synthetic */ C52760c f83821c;

        public C32124a(Fragment fragment, C52760c cVar, C52760c cVar2) {
            this.f83819a = fragment;
            this.f83820b = cVar;
            this.f83821c = cVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v4, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel, com.bytedance.jedi.arch.JediViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel]
          mth insns count: 14
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
        public final com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowRelationTabViewModel invoke() {
            /*
                r3 = this;
                android.support.v4.app.Fragment r0 = r3.f83819a
                android.support.v4.app.FragmentActivity r0 = r0.requireActivity()
                android.arch.lifecycle.y$b r1 = com.bytedance.jedi.arch.C11793b.m24134a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m441a(r0, r1)
                d.k.c r1 = r3.f83821c
                java.lang.Class r1 = p2628d.p2639f.C52669a.m112219a(r1)
                java.lang.String r1 = r1.getName()
                java.lang.String r2 = "viewModelClass.java.name"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                d.k.c r2 = r3.f83820b
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.p1770ui.C32123b.C32124a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.b$b */
    public static final class C32125b extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C52760c f83822a;

        public C32125b(C52760c cVar) {
            this.f83822a = cVar;
            super(0);
        }

        public final String invoke() {
            String name = C52669a.m112219a(this.f83822a).getName();
            C52711k.m112236a((Object) name, "viewModelClass.java.name");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.b$c */
    public static final class C32126c extends C52712l implements C52670a<ConnectedRelationListViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f83823a;

        /* renamed from: b */
        final /* synthetic */ C52670a f83824b;

        /* renamed from: c */
        final /* synthetic */ C52760c f83825c;

        /* renamed from: d */
        final /* synthetic */ C52682m f83826d;

        public C32126c(Fragment fragment, C52670a aVar, C52760c cVar, C52682m mVar) {
            this.f83823a = fragment;
            this.f83824b = aVar;
            this.f83825c = cVar;
            this.f83826d = mVar;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel, java.lang.Object]
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
        public final com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.ConnectedRelationListViewModel invoke() {
            /*
                r3 = this;
                android.support.v4.app.Fragment r0 = r3.f83823a
                android.support.v4.app.Fragment r1 = r3.f83823a
                com.bytedance.jedi.arch.ad r1 = (com.bytedance.jedi.arch.C11791ad) r1
                android.arch.lifecycle.y$b r1 = r1.mo22542a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r0, r1)
                d.f.a.a r1 = r3.f83824b
                java.lang.Object r1 = r1.invoke()
                java.lang.String r1 = (java.lang.String) r1
                d.k.c r2 = r3.f83825c
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                com.bytedance.jedi.arch.n r1 = r0.f31279c
                java.lang.Class<com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel> r2 = com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.ConnectedRelationListViewModel.class
                com.bytedance.jedi.arch.m r1 = r1.mo22643a(r2)
                if (r1 == 0) goto L_0x0034
                java.lang.String r2 = "this"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                r1.binding(r0)
            L_0x0034:
                com.ss.android.ugc.aweme.following.ui.b$c$1 r1 = new com.ss.android.ugc.aweme.following.ui.b$c$1
                r1.<init>(r3)
                d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
                r0.mo22526a(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.p1770ui.C32123b.C32126c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.b$d */
    public static final class C32128d implements C11854c<Object, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f83828a;

        /* renamed from: b */
        final /* synthetic */ C52682m f83829b;

        /* renamed from: c */
        final /* synthetic */ C52682m f83830c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f83831d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f83832e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends Object>, C52860x> f83833f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f83831d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f83832e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends Object>, C52860x> mo22603c() {
            return this.f83833f;
        }

        public C32128d(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f83828a = bVar;
            this.f83829b = mVar;
            this.f83830c = mVar2;
            this.f83831d = bVar;
            this.f83832e = mVar;
            this.f83833f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.b$e */
    public static final class C32129e extends C52712l implements C52682m<C11866f, List<? extends Object>, C52860x> {
        public static final C32129e INSTANCE = new C32129e();

        public C32129e() {
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

    /* renamed from: com.ss.android.ugc.aweme.following.ui.b$f */
    public static final class C32130f implements C11854c<Object, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f83834a;

        /* renamed from: b */
        final /* synthetic */ C52682m f83835b;

        /* renamed from: c */
        final /* synthetic */ C52682m f83836c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f83837d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f83838e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends Object>, C52860x> f83839f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f83837d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f83838e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends Object>, C52860x> mo22603c() {
            return this.f83839f;
        }

        public C32130f(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f83834a = bVar;
            this.f83835b = mVar;
            this.f83836c = mVar2;
            this.f83837d = bVar;
            this.f83838e = mVar;
            this.f83839f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.b$g */
    static final class C32131g extends C52712l implements C52682m<C11866f, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32123b f83840a;

        C32131g(C32123b bVar) {
            this.f83840a = bVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(fVar, "$receiver");
            if (booleanValue) {
                this.f83840a.mo65304w().ao_();
            } else {
                this.f83840a.mo65304w().an_();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.b$h */
    static final class C32132h extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32123b f83841a;

        C32132h(C32123b bVar) {
            this.f83841a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            ((DmtStatusView) this.f83841a.mo48632a(R.id.csv)).mo19212f();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.b$i */
    static final class C32133i extends C52712l implements C52682m<C11866f, List<? extends Object>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32123b f83842a;

        C32133i(C32123b bVar) {
            this.f83842a = bVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            List list = (List) obj2;
            C52711k.m112240b(fVar, "$receiver");
            C52711k.m112240b(list, "data");
            if (list.isEmpty()) {
                ((DmtStatusView) this.f83842a.mo48632a(R.id.csv)).mo19213g();
            } else {
                ((DmtStatusView) this.f83842a.mo48632a(R.id.csv)).mo19209d();
            }
            fVar.mo22552a(this.f83842a.mo65303v(), new C52671b<ConnectedRelationState, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C32133i f83843a;

                {
                    this.f83843a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    ConnectedRelationState connectedRelationState = (ConnectedRelationState) obj;
                    C52711k.m112240b(connectedRelationState, "it");
                    ((FollowRelationTabViewModel) this.f83843a.f83842a.f83814l.getValue()).mo22530c(new C32309a(((C32346c) connectedRelationState.getListState().getPayload()).f84210d));
                    return C52860x.f131107a;
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.b$j */
    static final class C32135j extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32123b f83844a;

        C32135j(C32123b bVar) {
            this.f83844a = bVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "throwable");
            C32123b bVar = this.f83844a;
            DmtStatusView dmtStatusView = (DmtStatusView) this.f83844a.mo48632a(R.id.csv);
            C52711k.m112236a((Object) dmtStatusView, "status_view");
            bVar.mo65253a(dmtStatusView, (Exception) th);
            ((DmtStatusView) this.f83844a.mo48632a(R.id.csv)).mo19214h();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.b$k */
    static final class C32136k extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32123b f83845a;

        C32136k(C32123b bVar) {
            this.f83845a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            this.f83845a.mo65304w().am_();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.b$l */
    static final class C32137l extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32123b f83846a;

        C32137l(C32123b bVar) {
            this.f83846a = bVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "it");
            this.f83846a.mo65304w().mo54793i();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.b$m */
    static final class C32138m extends C52712l implements C52670a<C32105a> {

        /* renamed from: a */
        final /* synthetic */ C32123b f83847a;

        /* renamed from: com.ss.android.ugc.aweme.following.ui.b$m$a */
        static final class C32139a implements C26846a {

            /* renamed from: a */
            final /* synthetic */ C32138m f83848a;

            C32139a(C32138m mVar) {
                this.f83848a = mVar;
            }

            public final void ar_() {
                this.f83848a.f83847a.mo65303v().f84126f.mo22567c();
            }
        }

        C32138m(C32123b bVar) {
            this.f83847a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C32105a aVar = new C32105a(this.f83847a, null, 2, null);
            aVar.mo54788a((C26846a) new C32139a(this));
            aVar.mo54792d(R.string.an1);
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.b$n */
    static final class C32140n extends C52712l implements C52682m<ConnectedRelationState, Bundle, ConnectedRelationState> {

        /* renamed from: a */
        public static final C32140n f83849a = new C32140n();

        C32140n() {
            super(2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
            if (r10 == null) goto L_0x0017;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
            if (r10 == null) goto L_0x0027;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r10, java.lang.Object r11) {
            /*
                r9 = this;
                r0 = r10
                com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState r0 = (com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.ConnectedRelationState) r0
                android.os.Bundle r11 = (android.os.Bundle) r11
                java.lang.String r10 = "$receiver"
                p2628d.p2639f.p2641b.C52711k.m112240b(r0, r10)
                if (r11 == 0) goto L_0x0017
                java.lang.String r10 = "uid"
                java.lang.String r10 = r11.getString(r10)
                if (r10 != 0) goto L_0x0015
                goto L_0x0017
            L_0x0015:
                r1 = r10
                goto L_0x001a
            L_0x0017:
                java.lang.String r10 = ""
                goto L_0x0015
            L_0x001a:
                if (r11 == 0) goto L_0x0027
                java.lang.String r10 = "sec_uid"
                java.lang.String r10 = r11.getString(r10)
                if (r10 != 0) goto L_0x0025
                goto L_0x0027
            L_0x0025:
                r2 = r10
                goto L_0x002a
            L_0x0027:
                java.lang.String r10 = ""
                goto L_0x0025
            L_0x002a:
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 60
                r8 = 0
                com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState r10 = com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.ConnectedRelationState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.p1770ui.C32123b.C32140n.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* renamed from: a */
    public final View mo48632a(int i) {
        if (this.f83818p == null) {
            this.f83818p = new HashMap();
        }
        View view = (View) this.f83818p.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f83818p.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public final void mo48633e() {
        if (this.f83818p != null) {
            this.f83818p.clear();
        }
    }

    /* renamed from: j */
    public final int mo65257j() {
        return R.layout.my;
    }

    /* renamed from: l */
    public final int mo65259l() {
        return R.string.czs;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo48633e();
    }

    @C53771m
    public final void onEvent(C47496d dVar) {
    }

    /* renamed from: s */
    public final int mo65266s() {
        return R.drawable.alw;
    }

    /* renamed from: t */
    public final int mo65267t() {
        return R.string.ahq;
    }

    /* renamed from: u */
    public final int mo65268u() {
        return R.string.ahr;
    }

    /* renamed from: v */
    public final ConnectedRelationListViewModel mo65303v() {
        return (ConnectedRelationListViewModel) this.f83816n.getValue();
    }

    /* renamed from: w */
    public final C32105a mo65304w() {
        return (C32105a) this.f83817o.getValue();
    }

    /* renamed from: r */
    public final void mo65265r() {
        mo65303v().mo65396e();
    }

    public C32123b() {
        C52682m mVar = C32140n.f83849a;
        C52760c a = C52728w.m112245a(ConnectedRelationListViewModel.class);
        C52670a bVar = new C32125b(a);
        this.f83816n = new lifecycleAwareLazy(this, bVar, new C32126c(this, bVar, a, mVar));
        C52760c a2 = C52728w.m112245a(FollowRelationTabViewModel.class);
        this.f83814l = C52732g.m112285a(new C32124a(this, a2, a2));
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context != null) {
            this.f83815m = (FragmentActivity) context;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        DmtStatusView dmtStatusView = (DmtStatusView) mo48632a(R.id.csv);
        C52711k.m112236a((Object) dmtStatusView, "status_view");
        mo65252a(dmtStatusView);
        RecyclerView recyclerView = (RecyclerView) mo48632a(R.id.caf);
        recyclerView.setLayoutManager(new WrapLinearLayoutManager(recyclerView.getContext()));
        recyclerView.setItemAnimator(new C32760i());
        recyclerView.setAdapter(mo65304w());
        recyclerView.bringToFront();
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo48632a(R.id.caw);
        C52711k.m112236a((Object) swipeRefreshLayout, "refresh_layout");
        swipeRefreshLayout.setEnabled(false);
        ConnectedRelationListViewModel v = mo65303v();
        C11797e eVar = this;
        C11837a w = mo65304w();
        C52682m gVar = new C32131g(this);
        C11854c dVar = new C32128d(new C32132h(this), new C32135j(this), new C32133i(this));
        C11854c fVar = new C32130f(new C32136k(this), new C32137l(this), C32129e.INSTANCE);
        C52711k.m112240b(eVar, "subscriber");
        C52711k.m112240b(w, "adapter");
        ListMiddleware.m24163a(v.f84126f, eVar, w, false, eVar.mo22555f(), dVar, fVar, gVar, null, null, null, 896, null);
        if (!this.f83665d) {
            mo65303v().mo65396e();
        }
    }
}
