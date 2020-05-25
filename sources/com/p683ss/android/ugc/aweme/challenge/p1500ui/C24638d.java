package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.widget.GridLayoutManager.C1302b;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1339l;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.jedi.arch.C11797e;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.C11854c;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.arch.C23462b;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.challenge.adapter.C24535b;
import com.p683ss.android.ugc.aweme.challenge.adapter.C24542f;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.DetailAwemeListFragment.C24622b;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.DetailAwemeListFragment.C24623c;
import com.p683ss.android.ugc.aweme.challenge.viewmodel.BiColAwemeListState;
import com.p683ss.android.ugc.aweme.challenge.viewmodel.BiColAwemeListViewModel;
import com.p683ss.android.ugc.aweme.challenge.viewmodel.C24786a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.detail.C27336g;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1718d.C30179b;
import com.p683ss.android.ugc.aweme.feed.utils.C31213v;
import com.p683ss.android.ugc.aweme.movie.view.C37195c;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.playlist.p2057a.C38922c;
import com.p683ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.C52669a;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.d */
public final class C24638d extends C23462b implements C24579d, C27336g {

    /* renamed from: b */
    static final /* synthetic */ C52767h[] f65204b = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24638d.class), "mViewModel", "getMViewModel()Lcom/ss/android/ugc/aweme/challenge/viewmodel/BiColAwemeListViewModel;"))};

    /* renamed from: p */
    public static final int f65205p = 10;

    /* renamed from: q */
    public static final C24642c f65206q = new C24642c(null);

    /* renamed from: c */
    public C24622b f65207c;

    /* renamed from: d */
    public String f65208d = "";

    /* renamed from: e */
    String f65209e = "";

    /* renamed from: j */
    String f65210j = "";

    /* renamed from: k */
    public String f65211k = "";

    /* renamed from: l */
    String f65212l = "";

    /* renamed from: m */
    public boolean f65213m;

    /* renamed from: n */
    public C24535b f65214n;

    /* renamed from: o */
    public float f65215o;

    /* renamed from: r */
    private final lifecycleAwareLazy f65216r;

    /* renamed from: s */
    private HashMap f65217s;

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.d$a */
    public static final class C24639a extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C52760c f65218a;

        public C24639a(C52760c cVar) {
            this.f65218a = cVar;
            super(0);
        }

        public final String invoke() {
            String name = C52669a.m112219a(this.f65218a).getName();
            C52711k.m112236a((Object) name, "viewModelClass.java.name");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.d$b */
    public static final class C24640b extends C52712l implements C52670a<BiColAwemeListViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f65219a;

        /* renamed from: b */
        final /* synthetic */ C52670a f65220b;

        /* renamed from: c */
        final /* synthetic */ C52760c f65221c;

        /* renamed from: d */
        final /* synthetic */ C52682m f65222d;

        public C24640b(Fragment fragment, C52670a aVar, C52760c cVar, C52682m mVar) {
            this.f65219a = fragment;
            this.f65220b = aVar;
            this.f65221c = cVar;
            this.f65222d = mVar;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.challenge.viewmodel.BiColAwemeListViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3, types: [com.ss.android.ugc.aweme.challenge.viewmodel.BiColAwemeListViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.challenge.viewmodel.BiColAwemeListViewModel, java.lang.Object]
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
        public final com.p683ss.android.ugc.aweme.challenge.viewmodel.BiColAwemeListViewModel invoke() {
            /*
                r3 = this;
                android.support.v4.app.Fragment r0 = r3.f65219a
                android.support.v4.app.Fragment r1 = r3.f65219a
                com.bytedance.jedi.arch.ad r1 = (com.bytedance.jedi.arch.C11791ad) r1
                android.arch.lifecycle.y$b r1 = r1.mo22542a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r0, r1)
                d.f.a.a r1 = r3.f65220b
                java.lang.Object r1 = r1.invoke()
                java.lang.String r1 = (java.lang.String) r1
                d.k.c r2 = r3.f65221c
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                com.bytedance.jedi.arch.n r1 = r0.f31279c
                java.lang.Class<com.ss.android.ugc.aweme.challenge.viewmodel.BiColAwemeListViewModel> r2 = com.p683ss.android.ugc.aweme.challenge.viewmodel.BiColAwemeListViewModel.class
                com.bytedance.jedi.arch.m r1 = r1.mo22643a(r2)
                if (r1 == 0) goto L_0x0034
                java.lang.String r2 = "this"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                r1.binding(r0)
            L_0x0034:
                com.ss.android.ugc.aweme.challenge.ui.d$b$1 r1 = new com.ss.android.ugc.aweme.challenge.ui.d$b$1
                r1.<init>(r3)
                d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
                r0.mo22526a(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.challenge.p1500ui.C24638d.C24640b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.d$c */
    public static final class C24642c {
        private C24642c() {
        }

        /* renamed from: a */
        public static int m60153a() {
            return C24638d.f65205p;
        }

        public /* synthetic */ C24642c(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.d$d */
    static final class C24643d implements C26846a {

        /* renamed from: a */
        final /* synthetic */ C24638d f65224a;

        C24643d(C24638d dVar) {
            this.f65224a = dVar;
        }

        public final void ar_() {
            this.f65224a.mo50500g().f65589f.mo22567c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.d$e */
    public static final class C24644e extends C1302b {

        /* renamed from: c */
        final /* synthetic */ C24638d f65225c;

        C24644e(C24638d dVar) {
            this.f65225c = dVar;
        }

        /* renamed from: a */
        public final int mo4690a(int i) {
            if (i >= C24638d.m60140a(this.f65225c).getItemCount() - 1) {
                return 2;
            }
            return 1;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.d$f */
    public static final class C24645f implements C1339l {

        /* renamed from: a */
        final /* synthetic */ C24638d f65226a;

        /* renamed from: a */
        public final void mo5079a(boolean z) {
        }

        /* renamed from: b */
        public final void mo5081b(RecyclerView recyclerView, MotionEvent motionEvent) {
            C52711k.m112240b(recyclerView, "recyclerView");
            C52711k.m112240b(motionEvent, "motionEvent");
        }

        C24645f(C24638d dVar) {
            this.f65226a = dVar;
        }

        /* renamed from: a */
        public final boolean mo5080a(RecyclerView recyclerView, MotionEvent motionEvent) {
            C52711k.m112240b(recyclerView, "recyclerView");
            C52711k.m112240b(motionEvent, "event");
            switch (motionEvent.getAction()) {
                case 0:
                    this.f65226a.f65215o = motionEvent.getY();
                    break;
                case 1:
                    this.f65226a.f65215o = motionEvent.getY() - this.f65226a.f65215o;
                    if (this.f65226a.f65215o <= ((float) C24642c.m60153a())) {
                        if (this.f65226a.f65215o < ((float) (-C24642c.m60153a()))) {
                            C26890h.m65011a("tag_detail_slide_up", C23089d.m56640a().mo47829a("process_id", this.f65226a.f65211k).mo47829a("tag_id", this.f65226a.f65208d).f61491a);
                            break;
                        }
                    } else {
                        C26890h.m65011a("tag_detail_slide_down", C23089d.m56640a().mo47829a("process_id", this.f65226a.f65211k).mo47829a("tag_id", this.f65226a.f65208d).f61491a);
                        break;
                    }
                    break;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.d$g */
    public static final class C24646g implements C11854c<Object, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f65227a;

        /* renamed from: b */
        final /* synthetic */ C52682m f65228b;

        /* renamed from: c */
        final /* synthetic */ C52682m f65229c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f65230d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f65231e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends Object>, C52860x> f65232f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f65230d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f65231e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends Object>, C52860x> mo22603c() {
            return this.f65232f;
        }

        public C24646g(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f65227a = bVar;
            this.f65228b = mVar;
            this.f65229c = mVar2;
            this.f65230d = bVar;
            this.f65231e = mVar;
            this.f65232f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.d$h */
    public static final class C24647h implements C11854c<Object, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f65233a;

        /* renamed from: b */
        final /* synthetic */ C52682m f65234b;

        /* renamed from: c */
        final /* synthetic */ C52682m f65235c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f65236d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f65237e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends Object>, C52860x> f65238f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f65236d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f65237e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends Object>, C52860x> mo22603c() {
            return this.f65238f;
        }

        public C24647h(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f65233a = bVar;
            this.f65234b = mVar;
            this.f65235c = mVar2;
            this.f65236d = bVar;
            this.f65237e = mVar;
            this.f65238f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.d$i */
    static final class C24648i extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        public static final C24648i f65239a = new C24648i();

        C24648i() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.d$j */
    static final class C24649j extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C24638d f65240a;

        C24649j(C24638d dVar) {
            this.f65240a = dVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "it");
            RecyclerView recyclerView = (RecyclerView) this.f65240a.mo48632a((int) R.id.eoz);
            C52711k.m112236a((Object) recyclerView, "placeholder_list");
            recyclerView.setVisibility(8);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.d$k */
    static final class C24650k extends C52712l implements C52682m<C11866f, List<? extends Object>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C24638d f65241a;

        C24650k(C24638d dVar) {
            this.f65241a = dVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            List list = (List) obj2;
            C52711k.m112240b(fVar, "$receiver");
            C52711k.m112240b(list, "data");
            RecyclerView recyclerView = (RecyclerView) this.f65241a.mo48632a((int) R.id.eoz);
            C52711k.m112236a((Object) recyclerView, "placeholder_list");
            recyclerView.setVisibility(8);
            fVar.mo22552a(this.f65241a.mo50500g(), C246511.f65242a);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.d$l */
    static final class C24652l extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C24638d f65243a;

        C24652l(C24638d dVar) {
            this.f65243a = dVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            C24638d.m60140a(this.f65243a).am_();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.d$m */
    static final class C24653m extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C24638d f65244a;

        C24653m(C24638d dVar) {
            this.f65244a = dVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "it");
            C24638d.m60140a(this.f65244a).mo54793i();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.d$n */
    static final class C24654n extends C52712l implements C52682m<C11866f, List<? extends Object>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C24638d f65245a;

        C24654n(C24638d dVar) {
            this.f65245a = dVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            List list = (List) obj2;
            C52711k.m112240b(fVar, "$receiver");
            C52711k.m112240b(list, "it");
            fVar.mo22552a(this.f65245a.mo50500g(), C246551.f65246a);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.d$o */
    static final class C24656o extends C52712l implements C52682m<C11866f, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C24638d f65247a;

        C24656o(C24638d dVar) {
            this.f65247a = dVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(fVar, "$receiver");
            if (booleanValue) {
                C24638d.m60140a(this.f65247a).ao_();
            } else {
                C24638d.m60140a(this.f65247a).an_();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.d$p */
    static final class C24657p extends C52712l implements C52682m<C11866f, Boolean, C52860x> {

        /* renamed from: a */
        public static final C24657p f65248a = new C24657p();

        C24657p() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            ((Boolean) obj2).booleanValue();
            C52711k.m112240b(fVar, "$receiver");
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.d$q */
    static final class C24658q extends C52712l implements C52682m<BiColAwemeListState, Bundle, BiColAwemeListState> {

        /* renamed from: a */
        final /* synthetic */ C24638d f65249a;

        C24658q(C24638d dVar) {
            this.f65249a = dVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            BiColAwemeListState biColAwemeListState = (BiColAwemeListState) obj;
            Bundle bundle = (Bundle) obj2;
            C52711k.m112240b(biColAwemeListState, "$receiver");
            C24638d dVar = this.f65249a;
            Bundle arguments = this.f65249a.getArguments();
            if (arguments != null) {
                String string = arguments.getString(C37195c.f94957y, "");
                C52711k.m112236a((Object) string, "arguments.getString(EVENT_LABEL, \"\")");
                dVar.f65209e = string;
                String string2 = arguments.getString(C37195c.f94958z, "");
                C52711k.m112236a((Object) string2, "arguments.getString(DETAIL_ID, \"\")");
                dVar.f65208d = string2;
                String string3 = arguments.getString(C37195c.f94954A, "");
                C52711k.m112236a((Object) string3, "arguments.getString(DETAIL_AWEME_FROM, \"\")");
                dVar.f65210j = string3;
                String string4 = arguments.getString("process_id", "");
                C52711k.m112236a((Object) string4, "arguments.getString(Inte…ant.EXTRA_PROCESS_ID, \"\")");
                dVar.f65211k = string4;
                dVar.f65213m = arguments.getBoolean("extra_challenge_is_hashtag", false);
                String string5 = arguments.getString("extra_challenge_hashtag_name", "");
                C52711k.m112236a((Object) string5, "arguments.getString(Inte…ALLENGE_HASHTAG_NAME, \"\")");
                dVar.f65212l = string5;
            }
            return BiColAwemeListState.copy$default(biColAwemeListState, this.f65249a.f65208d, this.f65249a.f65213m, null, 4, null);
        }
    }

    /* renamed from: a */
    public final View mo48632a(int i) {
        if (this.f65217s == null) {
            this.f65217s = new HashMap();
        }
        View view = (View) this.f65217s.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f65217s.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a_ */
    public final void mo50464a_(boolean z) {
    }

    /* renamed from: e */
    public final void mo48633e() {
        if (this.f65217s != null) {
            this.f65217s.clear();
        }
    }

    /* renamed from: g */
    public final BiColAwemeListViewModel mo50500g() {
        return (BiColAwemeListViewModel) this.f65216r.getValue();
    }

    /* renamed from: k */
    public final void mo50470k() {
    }

    /* renamed from: m */
    public final void mo50472m() {
    }

    /* renamed from: n */
    public final void mo50473n() {
    }

    /* renamed from: o */
    public final boolean mo50474o() {
        return true;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo48633e();
    }

    /* renamed from: j */
    public final List<Aweme> mo50501j() {
        C24535b bVar = this.f65214n;
        if (bVar == null) {
            C52711k.m112237a("mAdapter");
        }
        return bVar.mo48637d();
    }

    /* renamed from: l */
    public final View mo50471l() {
        return (RecyclerView) mo48632a((int) R.id.aeg);
    }

    public C24638d() {
        C52682m qVar = new C24658q(this);
        C52760c a = C52728w.m112245a(BiColAwemeListViewModel.class);
        C52670a aVar = new C24639a(a);
        this.f65216r = new lifecycleAwareLazy(this, aVar, new C24640b(this, aVar, a, qVar));
    }

    /* renamed from: a */
    public final void mo50460a(String str) {
        if (str == null) {
            str = "";
        }
        this.f65208d = str;
    }

    /* renamed from: a */
    public static final /* synthetic */ C24535b m60140a(C24638d dVar) {
        C24535b bVar = dVar.f65214n;
        if (bVar == null) {
            C52711k.m112237a("mAdapter");
        }
        return bVar;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        this.f65214n = new C24535b(this, this, this.f65208d, this.f65211k);
        C24535b bVar = this.f65214n;
        if (bVar == null) {
            C52711k.m112237a("mAdapter");
        }
        bVar.mo54788a((C26846a) new C24643d(this));
        RecyclerView recyclerView = (RecyclerView) mo48632a((int) R.id.aeg);
        C52711k.m112236a((Object) recyclerView, "feed_list");
        C24535b bVar2 = this.f65214n;
        if (bVar2 == null) {
            C52711k.m112237a("mAdapter");
        }
        recyclerView.setAdapter(bVar2);
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(getActivity(), 2);
        wrapGridLayoutManager.f4526g = new C24644e(this);
        RecyclerView recyclerView2 = (RecyclerView) mo48632a((int) R.id.aeg);
        C52711k.m112236a((Object) recyclerView2, "feed_list");
        recyclerView2.setLayoutManager(wrapGridLayoutManager);
        ((RecyclerView) mo48632a((int) R.id.aeg)).mo4800a((C1339l) new C24645f(this));
        RecyclerView recyclerView3 = (RecyclerView) mo48632a((int) R.id.eoz);
        C52711k.m112236a((Object) recyclerView3, "placeholder_list");
        recyclerView3.setAdapter(new C24542f());
        ((RecyclerView) mo48632a((int) R.id.eoz)).mo4798a((C1331h) new C38922c());
        RecyclerView recyclerView4 = (RecyclerView) mo48632a((int) R.id.eoz);
        C52711k.m112236a((Object) recyclerView4, "placeholder_list");
        recyclerView4.setLayoutManager(new BiColAwemePlaylistFragment$initPlaceHolderView$1(this, getActivity(), 2));
        ListMiddleware<BiColAwemeListState, Object, C24786a> listMiddleware = mo50500g().f65589f;
        C11797e eVar = this;
        C24535b bVar3 = this.f65214n;
        if (bVar3 == null) {
            C52711k.m112237a("mAdapter");
        }
        ListMiddleware.m24163a(listMiddleware, eVar, bVar3, false, false, new C24646g(C24648i.f65239a, new C24649j(this), new C24650k(this)), new C24647h(new C24652l(this), new C24653m(this), new C24654n(this)), new C24656o(this), C24657p.f65248a, null, null, 780, null);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.b55, viewGroup, false);
    }

    /* renamed from: a */
    public final void mo50347a(View view, Aweme aweme, String str) {
        Integer num;
        C24623c cVar;
        if (!(C32800a.m75679a(view) || aweme == null || getActivity() == null)) {
            C24623c cVar2 = new C24623c();
            cVar2.f65170e = this.f65211k;
            cVar2.f65169d = this.f65208d;
            List j = mo50501j();
            String str2 = null;
            if (j != null) {
                num = Integer.valueOf(j.indexOf(aweme));
            } else {
                num = null;
            }
            cVar2.f65171f = num.intValue();
            C24622b bVar = this.f65207c;
            if (bVar != null) {
                cVar = bVar.getJumpToVideoParam(cVar2, aweme);
            } else {
                cVar = null;
            }
            C31213v.m72895a((JediViewModel) mo50500g());
            SmartRoute withParam = SmartRouter.buildRoute((Context) getActivity(), "aweme://aweme/detail/").withParam("id", aweme.getAid()).withParam("refer", "challenge").withParam("previous_page", this.f65210j).withParam("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "challenge").withParam("extra_detail_title_text", this.f65212l).withParam("video_from", "from_challenge_double_detail").withParam("video_challenge_profile_from", this.f65210j).withParam("video_type", 2).withParam("profile_enterprise_type", aweme.getEnterpriseType()).withParam("process_id", this.f65211k);
            if (cVar != null) {
                str2 = cVar.f65167b;
            }
            withParam.withParam(str2, this.f65208d).open(10086);
            C30179b.m70792a(aweme);
        }
    }
}
