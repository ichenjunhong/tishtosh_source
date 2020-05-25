package com.p683ss.android.ugc.aweme.discover.p1665v4.p1667ui;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.content.C0726c;
import android.support.p030v4.widget.SwipeRefreshLayout;
import android.support.p030v4.widget.SwipeRefreshLayout.C1091b;
import android.support.p043v7.app.AppCompatActivity;
import android.support.p043v7.view.C1221d;
import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.bytedance.ies.uikit.rtl.AutoRTLImageView;
import com.bytedance.jedi.arch.C11797e;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.ext.list.C11854c;
import com.bytedance.jedi.arch.ext.list.C11865l;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.base.arch.JediBaseActivity;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverV4NewTrendingStruct;
import com.p683ss.android.ugc.aweme.discover.p1665v4.p1666a.C28783b;
import com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel.DiscoverV4NewTrendingViewModle;
import com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel.DiscoverV4TrendingState;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p2628d.C52860x;
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

/* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4TrendingActivity */
public final class DiscoverV4TrendingActivity extends JediBaseActivity {

    /* renamed from: b */
    static final /* synthetic */ C52767h[] f75485b = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DiscoverV4TrendingActivity.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/discover/v4/viewmodel/DiscoverV4NewTrendingViewModle;"))};

    /* renamed from: c */
    public C28783b f75486c;

    /* renamed from: d */
    private final lifecycleAwareLazy f75487d;

    /* renamed from: e */
    private HashMap f75488e;

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4TrendingActivity$a */
    public static final class C28796a extends C52712l implements C52682m<DiscoverV4TrendingState, Bundle, DiscoverV4TrendingState> {
        public static final C28796a INSTANCE = new C28796a();

        public C28796a() {
            super(2);
        }

        public final DiscoverV4TrendingState invoke(DiscoverV4TrendingState discoverV4TrendingState, Bundle bundle) {
            C52711k.m112240b(discoverV4TrendingState, "$receiver");
            return discoverV4TrendingState;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4TrendingActivity$b */
    public static final class C28797b extends C52712l implements C52670a<DiscoverV4NewTrendingViewModle> {

        /* renamed from: a */
        final /* synthetic */ AppCompatActivity f75489a;

        /* renamed from: b */
        final /* synthetic */ C52760c f75490b;

        /* renamed from: c */
        final /* synthetic */ C52682m f75491c;

        /* renamed from: d */
        final /* synthetic */ C52760c f75492d;

        public C28797b(AppCompatActivity appCompatActivity, C52760c cVar, C52682m mVar, C52760c cVar2) {
            this.f75489a = appCompatActivity;
            this.f75490b = cVar;
            this.f75491c = mVar;
            this.f75492d = cVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4NewTrendingViewModle] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v4, types: [java.lang.Object, com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4NewTrendingViewModle]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4NewTrendingViewModle, java.lang.Object]
          mth insns count: 26
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
        public final com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel.DiscoverV4NewTrendingViewModle invoke() {
            /*
                r3 = this;
                android.support.v7.app.AppCompatActivity r0 = r3.f75489a
                android.support.v4.app.FragmentActivity r0 = (android.support.p030v4.app.FragmentActivity) r0
                android.support.v7.app.AppCompatActivity r1 = r3.f75489a
                com.bytedance.jedi.arch.ad r1 = (com.bytedance.jedi.arch.C11791ad) r1
                android.arch.lifecycle.y$b r1 = r1.mo22542a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m441a(r0, r1)
                d.k.c r1 = r3.f75492d
                java.lang.Class r1 = p2628d.p2639f.C52669a.m112219a(r1)
                java.lang.String r1 = r1.getName()
                java.lang.String r2 = "viewModelClass.java.name"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                d.k.c r2 = r3.f75490b
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                com.bytedance.jedi.arch.n r1 = r0.f31279c
                java.lang.Class<com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4NewTrendingViewModle> r2 = com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel.DiscoverV4NewTrendingViewModle.class
                com.bytedance.jedi.arch.m r1 = r1.mo22643a(r2)
                if (r1 == 0) goto L_0x003d
                java.lang.String r2 = "this"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                r1.binding(r0)
            L_0x003d:
                com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4TrendingActivity$b$1 r1 = new com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4TrendingActivity$b$1
                r1.<init>(r3)
                d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
                r0.mo22526a(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1665v4.p1667ui.DiscoverV4TrendingActivity.C28797b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4TrendingActivity$c */
    static final class C28799c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4TrendingActivity f75494a;

        C28799c(DiscoverV4TrendingActivity discoverV4TrendingActivity) {
            this.f75494a = discoverV4TrendingActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f75494a.mo58409e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4TrendingActivity$d */
    public static final class C28800d implements C11854c<DiscoverV4NewTrendingStruct, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f75495a;

        /* renamed from: b */
        final /* synthetic */ C52682m f75496b;

        /* renamed from: c */
        final /* synthetic */ C52682m f75497c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f75498d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f75499e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends DiscoverV4NewTrendingStruct>, C52860x> f75500f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f75498d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f75499e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends DiscoverV4NewTrendingStruct>, C52860x> mo22603c() {
            return this.f75500f;
        }

        public C28800d(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f75495a = bVar;
            this.f75496b = mVar;
            this.f75497c = mVar2;
            this.f75498d = bVar;
            this.f75499e = mVar;
            this.f75500f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4TrendingActivity$e */
    public static final class C28801e extends C52712l implements C52682m<C11866f, List<? extends DiscoverV4NewTrendingStruct>, C52860x> {
        public static final C28801e INSTANCE = new C28801e();

        public C28801e() {
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

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4TrendingActivity$f */
    public static final class C28802f implements C11854c<DiscoverV4NewTrendingStruct, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f75501a;

        /* renamed from: b */
        final /* synthetic */ C52682m f75502b;

        /* renamed from: c */
        final /* synthetic */ C52682m f75503c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f75504d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f75505e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends DiscoverV4NewTrendingStruct>, C52860x> f75506f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f75504d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f75505e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends DiscoverV4NewTrendingStruct>, C52860x> mo22603c() {
            return this.f75506f;
        }

        public C28802f(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f75501a = bVar;
            this.f75502b = mVar;
            this.f75503c = mVar2;
            this.f75504d = bVar;
            this.f75505e = mVar;
            this.f75506f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4TrendingActivity$g */
    static final class C28803g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4TrendingActivity f75507a;

        C28803g(DiscoverV4TrendingActivity discoverV4TrendingActivity) {
            this.f75507a = discoverV4TrendingActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f75507a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4TrendingActivity$h */
    static final class C28804h extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4TrendingActivity f75508a;

        C28804h(DiscoverV4TrendingActivity discoverV4TrendingActivity) {
            this.f75508a = discoverV4TrendingActivity;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            DiscoverV4TrendingActivity.m68079a(this.f75508a).mo54798c(true);
            DmtStatusView dmtStatusView = (DmtStatusView) this.f75508a.mo48631a((int) R.id.csl);
            if (dmtStatusView != null && dmtStatusView.mo19217k()) {
                DmtStatusView dmtStatusView2 = (DmtStatusView) this.f75508a.mo48631a((int) R.id.csl);
                if (dmtStatusView2 != null) {
                    dmtStatusView2.mo19212f();
                }
            }
            if (DiscoverV4TrendingActivity.m68079a(this.f75508a).getItemCount() <= 0) {
                DmtStatusView dmtStatusView3 = (DmtStatusView) this.f75508a.mo48631a((int) R.id.csl);
                if (dmtStatusView3 != null) {
                    dmtStatusView3.mo19212f();
                }
            } else {
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f75508a.mo48631a((int) R.id.cvt);
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setRefreshing(true);
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4TrendingActivity$i */
    static final class C28805i extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4TrendingActivity f75509a;

        C28805i(DiscoverV4TrendingActivity discoverV4TrendingActivity) {
            this.f75509a = discoverV4TrendingActivity;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "it");
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f75509a.mo48631a((int) R.id.cvt);
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(false);
            }
            DmtStatusView dmtStatusView = (DmtStatusView) this.f75509a.mo48631a((int) R.id.csl);
            if (dmtStatusView != null) {
                dmtStatusView.mo19214h();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4TrendingActivity$j */
    static final class C28806j extends C52712l implements C52682m<C11866f, List<? extends DiscoverV4NewTrendingStruct>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4TrendingActivity f75510a;

        C28806j(DiscoverV4TrendingActivity discoverV4TrendingActivity) {
            this.f75510a = discoverV4TrendingActivity;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            List list = (List) obj2;
            C52711k.m112240b(fVar, "$receiver");
            C52711k.m112240b(list, "it");
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f75510a.mo48631a((int) R.id.cvt);
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(false);
            }
            DmtStatusView dmtStatusView = (DmtStatusView) this.f75510a.mo48631a((int) R.id.csl);
            if (dmtStatusView != null) {
                dmtStatusView.mo19208c(true);
            }
            fVar.mo22552a(this.f75510a.mo58408b(), new C52671b<DiscoverV4TrendingState, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C28806j f75511a;

                {
                    this.f75511a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    DiscoverV4TrendingState discoverV4TrendingState = (DiscoverV4TrendingState) obj;
                    C52711k.m112240b(discoverV4TrendingState, "it");
                    if (!discoverV4TrendingState.getCells().getPayload().f31449a.f31440a && discoverV4TrendingState.getCells().getList().isEmpty()) {
                        DmtStatusView dmtStatusView = (DmtStatusView) this.f75511a.f75510a.mo48631a((int) R.id.csl);
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

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4TrendingActivity$k */
    static final class C28808k extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4TrendingActivity f75512a;

        C28808k(DiscoverV4TrendingActivity discoverV4TrendingActivity) {
            this.f75512a = discoverV4TrendingActivity;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            DiscoverV4TrendingActivity.m68079a(this.f75512a).am_();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4TrendingActivity$l */
    static final class C28809l extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4TrendingActivity f75513a;

        C28809l(DiscoverV4TrendingActivity discoverV4TrendingActivity) {
            this.f75513a = discoverV4TrendingActivity;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "it");
            DiscoverV4TrendingActivity.m68079a(this.f75513a).co_();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4TrendingActivity$m */
    static final class C28810m extends C52712l implements C52682m<C11866f, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4TrendingActivity f75514a;

        C28810m(DiscoverV4TrendingActivity discoverV4TrendingActivity) {
            this.f75514a = discoverV4TrendingActivity;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(fVar, "$receiver");
            if (booleanValue) {
                DiscoverV4TrendingActivity.m68079a(this.f75514a).ao_();
            } else {
                DiscoverV4TrendingActivity.m68079a(this.f75514a).mo54798c(false);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4TrendingActivity$n */
    static final class C28811n implements C1091b {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4TrendingActivity f75515a;

        C28811n(DiscoverV4TrendingActivity discoverV4TrendingActivity) {
            this.f75515a = discoverV4TrendingActivity;
        }

        public final void onRefresh() {
            this.f75515a.mo58408b().mo58481f();
        }
    }

    /* renamed from: a */
    public final View mo48631a(int i) {
        if (this.f75488e == null) {
            this.f75488e = new HashMap();
        }
        View view = (View) this.f75488e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f75488e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: b */
    public final DiscoverV4NewTrendingViewModle mo58408b() {
        return (DiscoverV4NewTrendingViewModle) this.f75487d.getValue();
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4TrendingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4TrendingActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4TrendingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: e */
    public final void mo58409e() {
        mo58408b().f75682f.mo22565b();
    }

    public final void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public DiscoverV4TrendingActivity() {
        C52760c a = C52728w.m112245a(DiscoverV4NewTrendingViewModle.class);
        this.f75487d = new lifecycleAwareLazy(this, new C28797b(this, a, C28796a.INSTANCE, a));
    }

    public final void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.a0_).init();
    }

    /* renamed from: a */
    public static final /* synthetic */ C28783b m68079a(DiscoverV4TrendingActivity discoverV4TrendingActivity) {
        C28783b bVar = discoverV4TrendingActivity.f75486c;
        if (bVar == null) {
            C52711k.m112237a("adapter");
        }
        return bVar;
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4TrendingActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ax9);
        Context context = this;
        int c = C0726c.m2098c(context, R.color.a80);
        DmtTextView dmtTextView = new DmtTextView(new C1221d(context, R.style.tf));
        dmtTextView.setTextColor(c);
        dmtTextView.setText(R.string.c0c);
        dmtTextView.setOnClickListener(new C28799c(this));
        DmtTextView dmtTextView2 = new DmtTextView(new C1221d(context, R.style.tf));
        dmtTextView2.setTextColor(c);
        dmtTextView2.setText(R.string.gvp);
        DmtStatusView dmtStatusView = (DmtStatusView) mo48631a((int) R.id.csl);
        if (dmtStatusView != null) {
            dmtStatusView.setBuilder(C10719a.m21676a(context).mo19231b((View) dmtTextView2).mo19234c((View) dmtTextView));
        }
        DmtStatusView dmtStatusView2 = (DmtStatusView) mo48631a((int) R.id.csl);
        if (dmtStatusView2 != null) {
            dmtStatusView2.setUseScreenHeight(getResources().getDimensionPixelSize(R.dimen.mh));
        }
        ((AutoRTLImageView) mo48631a((int) R.id.ik)).setOnClickListener(new C28803g(this));
        this.f75486c = new C28783b(this, mo58408b().f75682f);
        RecyclerView recyclerView = (RecyclerView) mo48631a((int) R.id.ca3);
        C52711k.m112236a((Object) recyclerView, "recyclerView");
        recyclerView.setLayoutManager(new WrapLinearLayoutManager(context));
        RecyclerView recyclerView2 = (RecyclerView) mo48631a((int) R.id.ca3);
        C52711k.m112236a((Object) recyclerView2, "recyclerView");
        C28783b bVar = this.f75486c;
        if (bVar == null) {
            C52711k.m112237a("adapter");
        }
        recyclerView2.setAdapter(bVar);
        ListMiddleware<DiscoverV4TrendingState, DiscoverV4NewTrendingStruct, C11865l> listMiddleware = mo58408b().f75682f;
        C11797e eVar = this;
        C28783b bVar2 = this.f75486c;
        if (bVar2 == null) {
            C52711k.m112237a("adapter");
        }
        ListMiddleware.m24163a(listMiddleware, eVar, bVar2, false, false, new C28800d(new C28804h(this), new C28805i(this), new C28806j(this)), new C28802f(new C28808k(this), new C28809l(this), C28801e.INSTANCE), new C28810m(this), null, null, null, 908, null);
        mo58409e();
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo48631a((int) R.id.cvt);
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(new C28811n(this));
        }
        if (VERSION.SDK_INT >= 19) {
            int a = C11065a.m22390a(context);
            View a2 = mo48631a((int) R.id.csm);
            if (a2 != null) {
                LayoutParams layoutParams = a2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = a;
                }
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4TrendingActivity", "onCreate", false);
    }
}
