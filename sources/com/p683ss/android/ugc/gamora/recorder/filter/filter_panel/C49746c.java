package com.p683ss.android.ugc.gamora.recorder.filter.filter_panel;

import android.app.Activity;
import android.support.p043v7.app.AppCompatActivity;
import com.bytedance.als.ApiCenter;
import com.bytedance.p780m.C12356a;
import com.bytedance.p780m.C12361b;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.group.C12896b;
import com.bytedance.ui_component.C13362b;
import com.p683ss.android.ugc.aweme.filter.C31406ai;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.C31460h;
import com.p683ss.android.ugc.aweme.filter.C31475n;
import com.p683ss.android.ugc.aweme.filter.C31475n.C31476a;
import com.p683ss.android.ugc.aweme.filter.view.internal.C31631c;
import com.p683ss.android.ugc.aweme.filter.view.internal.C31660h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.p2241t.C44885g;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.gamora.recorder.filter.p2470a.C49683a;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.c */
public final class C49746c extends C13362b<FilterPanelViewModel> implements C12356a {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f124741d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49746c.class), "context", "getContext()Landroid/app/Activity;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49746c.class), "filterApiComponent", "getFilterApiComponent()Lcom/ss/android/ugc/gamora/recorder/filter/filter_core/FilterApiComponent;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49746c.class), "mVideoRecorder", "getMVideoRecorder()Lcom/ss/android/ugc/aweme/shortvideo/recorder/VideoRecorder;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49746c.class), "mFilterIntensityStore", "getMFilterIntensityStore()Lcom/ss/android/ugc/aweme/filter/FilterIntensityStore;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49746c.class), "filterScene", "getFilterScene()Lcom/ss/android/ugc/gamora/recorder/filter/filter_panel/RecordFilterPanelScene;"))};

    /* renamed from: e */
    public final C52668f f124742e = C52732g.m112286a(C52757k.NONE, new C49747a(this, null));

    /* renamed from: f */
    final C52668f f124743f = C52732g.m112285a(new C49753g(this));

    /* renamed from: g */
    final C52668f f124744g = C52732g.m112285a(C49752f.f124760a);

    /* renamed from: h */
    public final C31631c f124745h = new C49748b(new C49750d(this), this);

    /* renamed from: i */
    private boolean f124746i = true;

    /* renamed from: j */
    private final C52668f f124747j = C52732g.m112285a(new C49749c(this));

    /* renamed from: k */
    private final C52668f f124748k = C52732g.m112285a(new C49751e(this));

    /* renamed from: l */
    private final C52670a<FilterPanelViewModel> f124749l = new C49754h(this);

    /* renamed from: m */
    private final C12896b f124750m;

    /* renamed from: n */
    private final C12361b f124751n;

    /* renamed from: o */
    private final int f124752o = R.id.c_q;

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.c$a */
    public static final class C49747a extends C52712l implements C52670a<Activity> {

        /* renamed from: a */
        final /* synthetic */ C12356a f124753a;

        /* renamed from: b */
        final /* synthetic */ String f124754b;

        public C49747a(C12356a aVar, String str) {
            this.f124753a = aVar;
            this.f124754b = str;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, android.app.Activity] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v2, types: [java.lang.Object, android.app.Activity]
          assigns: [java.lang.Object]
          uses: [android.app.Activity]
          mth insns count: 6
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
        public final android.app.Activity invoke() {
            /*
                r3 = this;
                com.bytedance.m.a r0 = r3.f124753a
                com.bytedance.m.b r0 = r0.mo23370j()
                java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
                java.lang.String r2 = r3.f124754b
                java.lang.Object r0 = r0.mo23373a(r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.filter.filter_panel.C49746c.C49747a.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.c$b */
    public static final class C49748b implements C31631c {

        /* renamed from: a */
        final /* synthetic */ C49750d f124755a;

        /* renamed from: b */
        final /* synthetic */ C49746c f124756b;

        /* renamed from: b */
        public final int mo64538b(C31459g gVar) {
            C52711k.m112240b(gVar, "filterBean");
            return C31460h.m73280a(gVar, gVar.f82334k, (C31406ai) this.f124755a);
        }

        /* renamed from: c */
        public final float mo64539c(C31459g gVar) {
            C52711k.m112240b(gVar, "filterBean");
            return C31460h.m73283b(gVar, this.f124755a);
        }

        /* renamed from: a */
        public final int mo64537a(C31459g gVar) {
            C52711k.m112240b(gVar, "filterBean");
            return ((C31475n) this.f124756b.f124744g.getValue()).mo64304a(gVar, (C31406ai) this.f124755a);
        }

        C49748b(C49750d dVar, C49746c cVar) {
            this.f124755a = dVar;
            this.f124756b = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.c$c */
    static final class C49749c extends C52712l implements C52670a<C49683a> {

        /* renamed from: a */
        final /* synthetic */ C49746c f124757a;

        C49749c(C49746c cVar) {
            this.f124757a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (C49683a) this.f124757a.mo23370j().mo23373a(C49683a.class, (String) null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.c$d */
    public static final class C49750d implements C31406ai {

        /* renamed from: a */
        final /* synthetic */ C49746c f124758a;

        C49750d(C49746c cVar) {
            this.f124758a = cVar;
        }

        /* renamed from: a */
        public final float mo49450a(String str) {
            C52711k.m112240b(str, "filterPath");
            return ((C44885g) this.f124758a.f124743f.getValue()).mo91030b(str);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.c$e */
    static final class C49751e extends C52712l implements C52670a<C49757f> {

        /* renamed from: a */
        final /* synthetic */ C49746c f124759a;

        C49751e(C49746c cVar) {
            this.f124759a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C49757f(this.f124759a.f124745h);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.c$f */
    static final class C49752f extends C52712l implements C52670a<C31475n> {

        /* renamed from: a */
        public static final C49752f f124760a = new C49752f();

        C49752f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C31476a.m73313a("VideoRecordNewActivity");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.c$g */
    static final class C49753g extends C52712l implements C52670a<C44885g> {

        /* renamed from: a */
        final /* synthetic */ C49746c f124761a;

        C49753g(C49746c cVar) {
            this.f124761a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((C45004a) this.f124761a.mo23370j().mo23373a(C45004a.class, (String) null)).mo91305K();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.c$h */
    static final class C49754h extends C52712l implements C52670a<FilterPanelViewModel> {

        /* renamed from: a */
        final /* synthetic */ C49746c f124762a;

        C49754h(C49746c cVar) {
            this.f124762a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C49746c cVar = this.f124762a;
            C52711k.m112240b(cVar, "$this$createViewModel");
            return new FilterPanelViewModel((ApiCenter) cVar.mo23370j().mo23373a(ApiCenter.class, (String) null), (Activity) cVar.f124742e.getValue(), C39629l.m88232a().mo58584o().mo64334d(), true);
        }
    }

    /* renamed from: q */
    private final C49757f m107363q() {
        return (C49757f) this.f124748k.getValue();
    }

    /* renamed from: j */
    public final C12361b mo23370j() {
        return this.f124751n;
    }

    /* renamed from: k */
    public final C12896b mo24974k() {
        return this.f124750m;
    }

    /* renamed from: m */
    public final C52670a<FilterPanelViewModel> mo24976m() {
        return this.f124749l;
    }

    public final void bO_() {
        super.bO_();
        mo24974k().mo24389a(this.f124752o, (C12924i) m107363q(), "RecordFilterPanelScene");
    }

    /* renamed from: p */
    public final void mo24979p() {
        C49757f q = m107363q();
        if (q.f124770m) {
            C31660h hVar = q.f124769l;
            if (hVar == null) {
                C52711k.m112237a("combiner");
            }
            hVar.mo64572c();
        }
    }

    /* renamed from: o */
    public final void mo24978o() {
        C49757f q = m107363q();
        q.mo97639a((C52671b<? super AppCompatActivity, C52860x>) new C49780t<Object,C52860x>(q));
        if (!this.f124746i) {
            ((C49683a) this.f124747j.getValue()).mo97575h();
            this.f124746i = true;
        }
    }

    public C49746c(C12896b bVar, C12361b bVar2, int i) {
        C52711k.m112240b(bVar, "parentScene");
        C52711k.m112240b(bVar2, "diContainer");
        this.f124750m = bVar;
        this.f124751n = bVar2;
    }
}
