package com.p683ss.android.ugc.aweme.favorites.p1705ui;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0210y.C0212b;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
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
import com.bytedance.jedi.arch.ext.list.C11854c;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.arch.C23470g;
import com.p683ss.android.ugc.aweme.base.arch.C23473i;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.favorites.adapter.C29676f;
import com.p683ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel;
import com.p683ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel.C29782h;
import com.p683ss.android.ugc.aweme.favorites.viewmodel.MediaMixState;
import com.p683ss.android.ugc.aweme.feed.model.MixStruct;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p064c.p065a.p069b.C1690c;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.C52669a;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52767h;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.f */
public final class C29723f extends C29716a implements C11791ad<C23473i>, C11872h {

    /* renamed from: l */
    static final /* synthetic */ C52767h[] f77644l = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C29723f.class), "mViewModel", "getMViewModel()Lcom/ss/android/ugc/aweme/favorites/viewmodel/MediaMixListViewModel;"))};

    /* renamed from: m */
    public C23473i f77645m = new C23473i();

    /* renamed from: n */
    public C29676f f77646n;

    /* renamed from: o */
    private final lifecycleAwareLazy f77647o;

    /* renamed from: p */
    private HashMap f77648p;

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.f$a */
    public static final class C29724a extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C52760c f77649a;

        public C29724a(C52760c cVar) {
            this.f77649a = cVar;
            super(0);
        }

        public final String invoke() {
            String name = C52669a.m112219a(this.f77649a).getName();
            C52711k.m112236a((Object) name, "viewModelClass.java.name");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.f$b */
    public static final class C29725b extends C52712l implements C52670a<MediaMixListViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f77650a;

        /* renamed from: b */
        final /* synthetic */ C52670a f77651b;

        /* renamed from: c */
        final /* synthetic */ C52760c f77652c;

        /* renamed from: d */
        final /* synthetic */ C52682m f77653d;

        public C29725b(Fragment fragment, C52670a aVar, C52760c cVar, C52682m mVar) {
            this.f77650a = fragment;
            this.f77651b = aVar;
            this.f77652c = cVar;
            this.f77653d = mVar;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3, types: [com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel, java.lang.Object]
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
        public final com.p683ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel invoke() {
            /*
                r3 = this;
                android.support.v4.app.Fragment r0 = r3.f77650a
                android.support.v4.app.Fragment r1 = r3.f77650a
                com.bytedance.jedi.arch.ad r1 = (com.bytedance.jedi.arch.C11791ad) r1
                android.arch.lifecycle.y$b r1 = r1.mo22542a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r0, r1)
                d.f.a.a r1 = r3.f77651b
                java.lang.Object r1 = r1.invoke()
                java.lang.String r1 = (java.lang.String) r1
                d.k.c r2 = r3.f77652c
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                com.bytedance.jedi.arch.n r1 = r0.f31279c
                java.lang.Class<com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel> r2 = com.p683ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel.class
                com.bytedance.jedi.arch.m r1 = r1.mo22643a(r2)
                if (r1 == 0) goto L_0x0034
                java.lang.String r2 = "this"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                r1.binding(r0)
            L_0x0034:
                com.ss.android.ugc.aweme.favorites.ui.f$b$1 r1 = new com.ss.android.ugc.aweme.favorites.ui.f$b$1
                r1.<init>(r3)
                d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
                r0.mo22526a(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.favorites.p1705ui.C29723f.C29725b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.f$c */
    static final class C29727c extends C52712l implements C52682m<MediaMixState, Bundle, MediaMixState> {

        /* renamed from: a */
        final /* synthetic */ C29723f f77655a;

        C29727c(C29723f fVar) {
            this.f77655a = fVar;
            super(2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
            if (r8 == null) goto L_0x0049;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
            if (r8 == null) goto L_0x001d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
            if (r8 == null) goto L_0x0033;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9) {
            /*
                r7 = this;
                r0 = r8
                com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixState r0 = (com.p683ss.android.ugc.aweme.favorites.viewmodel.MediaMixState) r0
                android.os.Bundle r9 = (android.os.Bundle) r9
                java.lang.String r8 = "$receiver"
                p2628d.p2639f.p2641b.C52711k.m112240b(r0, r8)
                com.ss.android.ugc.aweme.favorites.ui.f r8 = r7.f77655a
                android.os.Bundle r8 = r8.getArguments()
                if (r8 == 0) goto L_0x001d
                java.lang.String r9 = "enter_from"
                java.lang.String r8 = r8.getString(r9)
                if (r8 != 0) goto L_0x001b
                goto L_0x001d
            L_0x001b:
                r1 = r8
                goto L_0x0020
            L_0x001d:
                java.lang.String r8 = ""
                goto L_0x001b
            L_0x0020:
                com.ss.android.ugc.aweme.favorites.ui.f r8 = r7.f77655a
                android.os.Bundle r8 = r8.getArguments()
                if (r8 == 0) goto L_0x0033
                java.lang.String r9 = "enter_method"
                java.lang.String r8 = r8.getString(r9)
                if (r8 != 0) goto L_0x0031
                goto L_0x0033
            L_0x0031:
                r2 = r8
                goto L_0x0036
            L_0x0033:
                java.lang.String r8 = ""
                goto L_0x0031
            L_0x0036:
                com.ss.android.ugc.aweme.favorites.ui.f r8 = r7.f77655a
                android.os.Bundle r8 = r8.getArguments()
                if (r8 == 0) goto L_0x0049
                java.lang.String r9 = "search_keyword"
                java.lang.String r8 = r8.getString(r9)
                if (r8 != 0) goto L_0x0047
                goto L_0x0049
            L_0x0047:
                r3 = r8
                goto L_0x004c
            L_0x0049:
                java.lang.String r8 = ""
                goto L_0x0047
            L_0x004c:
                r4 = 0
                r5 = 8
                r6 = 0
                com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixState r8 = com.p683ss.android.ugc.aweme.favorites.viewmodel.MediaMixState.copy$default(r0, r1, r2, r3, r4, r5, r6)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.favorites.p1705ui.C29723f.C29727c.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.f$d */
    public static final class C29728d extends C52712l implements C52682m<C11866f, List<? extends MixStruct>, C52860x> {
        public static final C29728d INSTANCE = new C29728d();

        public C29728d() {
            super(2);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((C11866f) obj, (List) obj2);
            return C52860x.f131107a;
        }

        public final void invoke(C11866f fVar, List<? extends MixStruct> list) {
            C52711k.m112240b(list, "it");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.f$e */
    public static final class C29729e implements C11854c<MixStruct, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f77656a;

        /* renamed from: b */
        final /* synthetic */ C52682m f77657b;

        /* renamed from: c */
        final /* synthetic */ C52682m f77658c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f77659d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f77660e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends MixStruct>, C52860x> f77661f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f77659d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f77660e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends MixStruct>, C52860x> mo22603c() {
            return this.f77661f;
        }

        public C29729e(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f77656a = bVar;
            this.f77657b = mVar;
            this.f77658c = mVar2;
            this.f77659d = bVar;
            this.f77660e = mVar;
            this.f77661f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.f$f */
    public static final class C29730f extends C52712l implements C52682m<C11866f, List<? extends MixStruct>, C52860x> {
        public static final C29730f INSTANCE = new C29730f();

        public C29730f() {
            super(2);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((C11866f) obj, (List) obj2);
            return C52860x.f131107a;
        }

        public final void invoke(C11866f fVar, List<? extends MixStruct> list) {
            C52711k.m112240b(list, "it");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.f$g */
    public static final class C29731g implements C11854c<MixStruct, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f77662a;

        /* renamed from: b */
        final /* synthetic */ C52682m f77663b;

        /* renamed from: c */
        final /* synthetic */ C52682m f77664c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f77665d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f77666e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends MixStruct>, C52860x> f77667f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f77665d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f77666e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends MixStruct>, C52860x> mo22603c() {
            return this.f77667f;
        }

        public C29731g(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f77662a = bVar;
            this.f77663b = mVar;
            this.f77664c = mVar2;
            this.f77665d = bVar;
            this.f77666e = mVar;
            this.f77667f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.f$h */
    static final class C29732h extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C29723f f77668a;

        C29732h(C29723f fVar) {
            this.f77668a = fVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            this.f77668a.f77634b.mo19212f();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.f$i */
    static final class C29733i extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C29723f f77669a;

        C29733i(C29723f fVar) {
            this.f77669a = fVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "it");
            this.f77669a.f77634b.mo19214h();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.f$j */
    static final class C29734j extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C29723f f77670a;

        C29734j(C29723f fVar) {
            this.f77670a = fVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            C29723f.m69790a(this.f77670a).am_();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.f$k */
    static final class C29735k extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C29723f f77671a;

        C29735k(C29723f fVar) {
            this.f77671a = fVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "it");
            C29723f.m69790a(this.f77671a).mo54793i();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.f$l */
    static final class C29736l extends C52712l implements C52682m<C11866f, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C29723f f77672a;

        C29736l(C29723f fVar) {
            this.f77672a = fVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(fVar, "$receiver");
            if (booleanValue) {
                C29723f.m69790a(this.f77672a).ao_();
            } else {
                C29723f.m69790a(this.f77672a).an_();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.f$m */
    static final class C29737m extends C52712l implements C52682m<C11866f, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C29723f f77673a;

        C29737m(C29723f fVar) {
            this.f77673a = fVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(fVar, "$receiver");
            if (booleanValue) {
                this.f77673a.f77634b.mo19213g();
            } else {
                this.f77673a.f77634b.mo19209d();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: j */
    private final MediaMixListViewModel m69791j() {
        return (MediaMixListViewModel) this.f77647o.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo59985n() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final C26840g<?> mo59986o() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo59988q() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo59990s() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0212b mo22542a() {
        return this.f77645m;
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

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo59983k() {
        m69791j().f77775l.mo22565b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo59984m() {
        m69791j().f77775l.mo22567c();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f77648p != null) {
            this.f77648p.clear();
        }
    }

    public C29723f() {
        C52682m cVar = new C29727c(this);
        C52760c a = C52728w.m112245a(MediaMixListViewModel.class);
        C52670a aVar = new C29724a(a);
        this.f77647o = new lifecycleAwareLazy(this, aVar, new C29725b(this, aVar, a, cVar));
    }

    public final void onResume() {
        super.onResume();
        MediaMixListViewModel j = m69791j();
        if (!(j.f77769f == 1 || j.f77769f == 2 || j.f77774k.size() == 0)) {
            j.mo22527b(new C29782h(j));
        }
    }

    /* renamed from: p */
    public final boolean mo59987p() {
        if (!isViewValid()) {
            return false;
        }
        if (!C29738g.m69818a(getActivity())) {
            if (!this.f77637e) {
                C10691a.m21542b((Context) getActivity(), (int) R.string.cg1).mo19066a();
            }
            this.f77637e = true;
            return false;
        }
        this.f77637e = false;
        if (TextUtils.isEmpty(this.f77636d)) {
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            this.f77636d = g.getCurUserId();
        }
        m69791j().f77775l.mo22565b();
        return true;
    }

    /* renamed from: a */
    public static final /* synthetic */ C29676f m69790a(C29723f fVar) {
        C29676f fVar2 = fVar.f77646n;
        if (fVar2 == null) {
            C52711k.m112237a("mMixAdapter");
        }
        return fVar2;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("mix_ids");
            if (serializable != null) {
                MediaMixListViewModel j = m69791j();
                if (serializable != null) {
                    ArrayList<Long> arrayList = (ArrayList) serializable;
                    C52711k.m112240b(arrayList, "mixIds");
                    j.f77769f = 1;
                    j.f77767d = arrayList;
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.util.ArrayList<kotlin.Long>");
                }
            }
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            Serializable serializable2 = arguments2.getSerializable("mix_push_ids");
            if (serializable2 != null) {
                MediaMixListViewModel j2 = m69791j();
                if (serializable2 != null) {
                    ArrayList<String> arrayList2 = (ArrayList) serializable2;
                    C52711k.m112240b(arrayList2, "pushMixIds");
                    j2.f77768e = arrayList2;
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                }
            }
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null && arguments3.getBoolean("is_from_profile_video_mix_list")) {
            m69791j().f77769f = 2;
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                String string = arguments4.getString("user_id");
                if (string != null) {
                    MediaMixListViewModel j3 = m69791j();
                    C52711k.m112240b(string, "uid");
                    j3.f77770g = string;
                }
            }
            Bundle arguments5 = getArguments();
            if (arguments5 != null) {
                String string2 = arguments5.getString("sec_user_id");
                if (string2 != null) {
                    MediaMixListViewModel j4 = m69791j();
                    C52711k.m112240b(string2, "secUid");
                    j4.f77771h = string2;
                }
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        this.f77646n = new C29676f(this);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("is_from_profile_video_mix_list")) {
            C29676f fVar = this.f77646n;
            if (fVar == null) {
                C52711k.m112237a("mMixAdapter");
            }
            fVar.f77569c = 2;
        }
        RecyclerView recyclerView = this.f77633a;
        C52711k.m112236a((Object) recyclerView, "mListView");
        C29676f fVar2 = this.f77646n;
        if (fVar2 == null) {
            C52711k.m112237a("mMixAdapter");
        }
        recyclerView.setAdapter(fVar2);
        ListMiddleware<MediaMixState, MixStruct, C23470g> listMiddleware = m69791j().f77775l;
        C11797e eVar = this;
        RecyclerView recyclerView2 = this.f77633a;
        C52711k.m112236a((Object) recyclerView2, "mListView");
        C1322a adapter = recyclerView2.getAdapter();
        if (adapter != null) {
            ListMiddleware.m24163a(listMiddleware, eVar, (C29676f) adapter, false, false, new C29729e(new C29732h(this), new C29733i(this), C29728d.INSTANCE), new C29731g(new C29734j(this), new C29735k(this), C29730f.INSTANCE), new C29736l(this), new C29737m(this), null, null, 780, null);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.favorites.adapter.MediaMixListAdapter");
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C11873a.m24227a(this, vm1, bVar);
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
