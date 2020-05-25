package com.p683ss.android.ugc.gamora.recorder.p2468e;

import android.arch.lifecycle.C0184k;
import com.bytedance.als.C2759d;
import com.bytedance.als.C2762f;
import com.bytedance.als.C2764h;
import com.bytedance.als.C2765i;
import com.bytedance.als.C2766j;
import com.bytedance.als.C2767k;
import com.bytedance.p780m.C12356a;
import com.bytedance.p780m.C12361b;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.group.C12896b;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2203g.C43859a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.tools.C47337r;
import com.p683ss.android.ugc.gamora.p2457a.C48923a;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.gamora.recorder.e.b */
public final class C49660b extends C2764h<C49659a> implements C12356a, C49659a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f124552a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49660b.class), "shortVideoContextViewModel", "getShortVideoContextViewModel()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContextViewModel;"))};

    /* renamed from: b */
    public final ShortVideoContext f124553b = ((ShortVideoContext) mo23370j().mo23373a(ShortVideoContext.class, (String) null));

    /* renamed from: c */
    final C52668f f124554c = C52732g.m112286a(C52757k.NONE, new C49661a(this));

    /* renamed from: d */
    public final C49659a f124555d = this;

    /* renamed from: e */
    public final C12896b f124556e;

    /* renamed from: f */
    public final C48923a f124557f;

    /* renamed from: g */
    private final C43859a f124558g = ((C43859a) mo23370j().mo23373a(C43859a.class, (String) null));

    /* renamed from: h */
    private final C45004a f124559h = ((C45004a) mo23370j().mo23373a(C45004a.class, (String) null));

    /* renamed from: i */
    private final C2766j<Integer> f124560i = new C2766j<>(Integer.valueOf(8));

    /* renamed from: j */
    private final C2765i<C52860x> f124561j = new C2765i<>();

    /* renamed from: k */
    private final C2765i<C52860x> f124562k = new C2765i<>();

    /* renamed from: l */
    private final C2766j<Integer> f124563l = new C2766j<>(Integer.valueOf(8));

    /* renamed from: m */
    private final C2765i<C52860x> f124564m = new C2765i<>();

    /* renamed from: n */
    private final C49664c f124565n;

    /* renamed from: o */
    private final C12361b f124566o;

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.b$a */
    public static final class C49661a extends C52712l implements C52670a<ShortVideoContextViewModel> {

        /* renamed from: a */
        final /* synthetic */ C12356a f124567a;

        public C49661a(C12356a aVar) {
            this.f124567a = aVar;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v5, types: [com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel, android.arch.lifecycle.x] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v5, types: [com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel, android.arch.lifecycle.x]
          assigns: [android.arch.lifecycle.x]
          uses: [com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel]
          mth insns count: 9
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
        public final com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel invoke() {
            /*
                r2 = this;
                com.bytedance.m.a r0 = r2.f124567a
                com.bytedance.m.b r0 = r0.mo23370j()
                java.lang.Class<android.support.v4.app.FragmentActivity> r1 = android.support.p030v4.app.FragmentActivity.class
                java.lang.Object r0 = r0.mo23372a(r1)
                android.support.v4.app.FragmentActivity r0 = (android.support.p030v4.app.FragmentActivity) r0
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m440a(r0)
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel> r1 = com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.class
                android.arch.lifecycle.x r0 = r0.mo359a(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.p2468e.C49660b.C49661a.invoke():android.arch.lifecycle.x");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.b$b */
    static final class C49662b<T> implements C2767k<C47337r> {

        /* renamed from: a */
        final /* synthetic */ C49660b f124568a;

        C49662b(C49660b bVar) {
            this.f124568a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C47337r rVar = (C47337r) obj;
            if (!rVar.f119493b.isEmpty() || rVar.f119494c != 0) {
                this.f124568a.mo97559b(4);
            } else if (!this.f124568a.f124553b.f107122o && rVar.f119496e && !this.f124568a.f124553b.mo86365f() && !this.f124568a.f124553b.mo86366g() && !this.f124568a.f124553b.mo86362d() && !this.f124568a.f124553b.mo86369j() && ((ShortVideoContextViewModel) this.f124568a.f124554c.getValue()).mo86391c()) {
                this.f124568a.mo97559b(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.b$c */
    static final class C49663c<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49660b f124569a;

        C49663c(C49660b bVar) {
            this.f124569a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            C52711k.m112236a((Object) bool, "show");
            int i2 = 0;
            if (!bool.booleanValue() || this.f124569a.f124557f.mo96752c().mo86372m() > 0) {
                this.f124569a.mo97559b(8);
            } else {
                C49660b bVar = this.f124569a;
                if (this.f124569a.f124557f.mo96752c().f107122o || this.f124569a.f124557f.mo96752c().mo86362d()) {
                    i = 8;
                } else {
                    i = 0;
                }
                bVar.mo97559b(i);
            }
            C49660b bVar2 = this.f124569a;
            if (!bool.booleanValue() || this.f124569a.f124557f.mo96752c().mo86369j()) {
                i2 = 4;
            }
            bVar2.mo97557a(i2);
            if (this.f124569a.f124557f.mo96752c().mo86365f() || this.f124569a.f124557f.mo96752c().mo86366g() || this.f124569a.f124557f.mo96752c().mo86369j()) {
                this.f124569a.mo97559b(8);
            }
        }
    }

    /* renamed from: j */
    public final C12361b mo23370j() {
        return this.f124566o;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2759d mo7353a() {
        return this.f124555d;
    }

    /* renamed from: c */
    public final C2762f<C52860x> mo97560c() {
        return this.f124565n.f124575l;
    }

    /* renamed from: d */
    public final void mo97561d() {
        this.f124561j.mo7350a(C52860x.f131107a);
    }

    /* renamed from: e */
    public final void mo97562e() {
        this.f124562k.mo7350a(C52860x.f131107a);
    }

    public final void bO_() {
        super.bO_();
        this.f124556e.mo24389a((int) R.id.c_q, (C12924i) this.f124565n, "RecordDockBarScene");
        C0184k kVar = this;
        this.f124559h.mo91295A().mo7349a(kVar, new C49662b(this));
        this.f124558g.mo89399c().mo7352a(kVar, new C49663c(this));
    }

    /* renamed from: a */
    public final void mo97557a(int i) {
        this.f124560i.mo7345a(Integer.valueOf(i));
    }

    /* renamed from: b */
    public final void mo97559b(int i) {
        this.f124563l.mo7345a(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo97558a(boolean z) {
        this.f124564m.mo7350a(C52860x.f131107a);
    }

    public C49660b(C12896b bVar, C48923a aVar, C12361b bVar2) {
        C52711k.m112240b(bVar, "parentScene");
        C52711k.m112240b(aVar, "recordEnv");
        C52711k.m112240b(bVar2, "diContainer");
        this.f124556e = bVar;
        this.f124557f = aVar;
        this.f124566o = bVar2;
        C49664c cVar = new C49664c(this.f124560i, this.f124561j, this.f124562k, this.f124563l, this.f124564m, this.f124558g.mo89401d());
        this.f124565n = cVar;
    }
}
