package com.p683ss.android.ugc.gamora.recorder.p2478l;

import android.arch.lifecycle.C0184k;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.bytedance.als.C2759d;
import com.bytedance.als.C2763g;
import com.bytedance.als.C2764h;
import com.bytedance.als.C2766j;
import com.bytedance.als.C2767k;
import com.bytedance.common.utility.C9432q;
import com.bytedance.p780m.C12356a;
import com.bytedance.p780m.C12361b;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.group.C12896b;
import com.p683ss.android.ugc.aweme.shortvideo.C43307ea;
import com.p683ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2203g.C43859a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.TimeSpeedModelExtension;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.shortvideo.widget.RecordLayout;
import com.p683ss.android.ugc.aweme.shortvideo.widget.RecordLayout.C45582a;
import com.p683ss.android.ugc.aweme.tools.C47324o;
import com.p683ss.android.ugc.aweme.tools.C47337r;
import com.p683ss.android.ugc.gamora.recorder.p2474h.C49822a;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52847n;
import p2628d.C52855s;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.gamora.recorder.l.b */
public final class C49862b extends C2764h<C49860a> implements C12356a, C49860a {

    /* renamed from: b */
    static final /* synthetic */ C52767h[] f124949b = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49862b.class), "shortVideoContextViewModel", "getShortVideoContextViewModel()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContextViewModel;"))};

    /* renamed from: c */
    public final C49860a f124950c = this;

    /* renamed from: d */
    final C2766j<Long> f124951d = new C2766j<>(Long.valueOf(0));

    /* renamed from: e */
    final C2766j<Boolean> f124952e = new C2766j<>(Boolean.valueOf(true));

    /* renamed from: f */
    final C2766j<C52847n<List<TimeSpeedModelExtension>, Long>> f124953f;

    /* renamed from: g */
    final C2766j<C52855s<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> f124954g;

    /* renamed from: h */
    final C2766j<C52847n<List<TimeSpeedModelExtension>, Long>> f124955h;

    /* renamed from: i */
    final C2766j<C52855s<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> f124956i;

    /* renamed from: j */
    public ShortVideoContext f124957j;

    /* renamed from: k */
    final C52668f f124958k;

    /* renamed from: l */
    public final C49869c f124959l;

    /* renamed from: m */
    public final C12896b f124960m;

    /* renamed from: n */
    private final C2766j<Boolean> f124961n = new C2766j<>(Boolean.valueOf(true));

    /* renamed from: o */
    private final C2766j<Boolean> f124962o = new C2766j<>(Boolean.valueOf(true));

    /* renamed from: p */
    private final C2766j<Integer> f124963p;

    /* renamed from: q */
    private final C2766j<RetakeVideoContext> f124964q;

    /* renamed from: r */
    private final C43859a f124965r;

    /* renamed from: s */
    private final C49822a f124966s;

    /* renamed from: t */
    private final C45004a f124967t;

    /* renamed from: u */
    private final C12361b f124968u;

    /* renamed from: v */
    private final int f124969v;

    /* renamed from: com.ss.android.ugc.gamora.recorder.l.b$a */
    public static final class C49863a extends C52712l implements C52670a<ShortVideoContextViewModel> {

        /* renamed from: a */
        final /* synthetic */ C12356a f124970a;

        public C49863a(C12356a aVar) {
            this.f124970a = aVar;
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
                com.bytedance.m.a r0 = r2.f124970a
                com.bytedance.m.b r0 = r0.mo23370j()
                java.lang.Class<android.support.v4.app.FragmentActivity> r1 = android.support.p030v4.app.FragmentActivity.class
                java.lang.Object r0 = r0.mo23372a(r1)
                android.support.v4.app.FragmentActivity r0 = (android.support.p030v4.app.FragmentActivity) r0
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m440a(r0)
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel> r1 = com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.class
                android.arch.lifecycle.x r0 = r0.mo359a(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.p2478l.C49862b.C49863a.invoke():android.arch.lifecycle.x");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.l.b$b */
    static final class C49864b<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49862b f124971a;

        C49864b(C49862b bVar) {
            this.f124971a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C49862b bVar = this.f124971a;
            C52711k.m112236a((Object) bool, "it");
            bVar.f124952e.mo7345a(Boolean.valueOf(bool.booleanValue()));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.l.b$c */
    static final class C49865c<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49862b f124972a;

        C49865c(C49862b bVar) {
            this.f124972a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C52711k.m112236a((Object) bool, "it");
            if (bool.booleanValue()) {
                if (!this.f124972a.f124960m.mo24413e(this.f124972a.f124959l)) {
                    this.f124972a.f124960m.mo24409d((C12924i) this.f124972a.f124959l);
                }
            } else if (this.f124972a.f124960m.mo24413e(this.f124972a.f124959l)) {
                this.f124972a.f124960m.mo24404c((C12924i) this.f124972a.f124959l);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.l.b$d */
    static final class C49866d<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49862b f124973a;

        C49866d(C49862b bVar) {
            this.f124973a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C52711k.m112236a((Object) bool, "show");
            if (!bool.booleanValue()) {
                this.f124973a.mo97698e(8);
                this.f124973a.mo97695d(8);
            } else if (this.f124973a.f124957j.mo86372m() > 0) {
                this.f124973a.mo97698e(0);
                this.f124973a.mo97695d(0);
            } else {
                this.f124973a.mo97698e(8);
                this.f124973a.mo97695d(8);
            }
            if ((this.f124973a.f124957j.mo86365f() || this.f124973a.f124957j.mo86366g()) && !bool.booleanValue()) {
                this.f124973a.mo97698e(4);
                this.f124973a.mo97695d(4);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.l.b$e */
    static final class C49867e<T> implements C2767k<C47337r> {

        /* renamed from: a */
        final /* synthetic */ C49862b f124974a;

        C49867e(C49862b bVar) {
            this.f124974a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            long j;
            boolean z;
            C47337r rVar = (C47337r) obj;
            C49862b bVar = this.f124974a;
            C52711k.m112236a((Object) rVar, "ev");
            if (rVar.f119495d != null) {
                if (bVar.f124957j.f107122o) {
                    C52855s sVar = new C52855s(rVar.f119493b, Long.valueOf(rVar.f119494c), rVar.f119495d);
                    C52711k.m112240b(sVar, "value");
                    bVar.f124956i.mo7345a(sVar);
                } else {
                    C52855s sVar2 = new C52855s(rVar.f119493b, Long.valueOf(rVar.f119494c), rVar.f119495d);
                    C52711k.m112240b(sVar2, "value");
                    bVar.f124954g.mo7345a(sVar2);
                }
            } else if (bVar.f124957j.f107122o) {
                C52847n nVar = new C52847n(rVar.f119493b, Long.valueOf(rVar.f119494c));
                C52711k.m112240b(nVar, "value");
                bVar.f124955h.mo7345a(nVar);
            } else {
                C52847n nVar2 = new C52847n(rVar.f119493b, Long.valueOf(rVar.f119494c));
                C52711k.m112240b(nVar2, "value");
                bVar.f124953f.mo7345a(nVar2);
            }
            long j2 = rVar.f119494c;
            C49862b bVar2 = this.f124974a;
            if (bVar2.f124957j.mo86362d()) {
                j = 3000;
            } else if (bVar2.f124957j.mo86366g()) {
                j = bVar2.f124957j.f107110c;
            } else if (bVar2.f124957j.f107122o) {
                j = bVar2.f124957j.f107123p;
            } else {
                j = C43307ea.m94995a();
            }
            if (j2 >= j) {
                z = true;
            } else {
                z = false;
            }
            this.f124974a.f124959l.mo97701a(z);
            int i = 4;
            if (!rVar.f119493b.isEmpty() || rVar.f119494c != 0) {
                C49862b bVar3 = this.f124974a;
                if (z) {
                    i = 0;
                }
                bVar3.mo97695d(i);
                if (((ShortVideoContextViewModel) this.f124974a.f124958k.getValue()).mo86391c()) {
                    this.f124974a.mo97698e(0);
                    this.f124974a.mo97695d(0);
                }
                return;
            }
            this.f124974a.mo97698e(4);
            this.f124974a.mo97695d(4);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.l.b$f */
    static final class C49868f<T> implements C2767k<C47324o> {

        /* renamed from: a */
        final /* synthetic */ C49862b f124975a;

        C49868f(C49862b bVar) {
            this.f124975a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C47324o oVar = (C47324o) obj;
            this.f124975a.f124951d.mo7345a(Long.valueOf(oVar.f119462a));
        }
    }

    /* renamed from: j */
    public final C12361b mo23370j() {
        return this.f124968u;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2759d mo7353a() {
        return this.f124950c;
    }

    /* renamed from: c */
    public final int mo97691c() {
        RecordLayout recordLayout = this.f124959l.f124990k;
        if (recordLayout == null) {
            C52711k.m112237a("recordLayout");
        }
        return recordLayout.getCurrentScaleMode();
    }

    /* renamed from: d */
    public final void mo97694d() {
        RecordLayout recordLayout = this.f124959l.f124990k;
        if (recordLayout == null) {
            C52711k.m112237a("recordLayout");
        }
        recordLayout.mo91901b();
    }

    /* renamed from: f */
    public final void mo97699f() {
        RecordLayout recordLayout = this.f124959l.f124990k;
        if (recordLayout == null) {
            C52711k.m112237a("recordLayout");
        }
        recordLayout.mo91898a();
    }

    /* renamed from: e */
    public final void mo97697e() {
        C49869c cVar = this.f124959l;
        if (cVar.f124996q != null) {
            FrameLayout frameLayout = cVar.f124996q;
            if (frameLayout == null) {
                C52711k.m112237a("colorSchemeLayout");
            }
            frameLayout.post(new C49892w(cVar));
        }
    }

    public final void bO_() {
        super.bO_();
        this.f124960m.mo24389a(this.f124969v, (C12924i) this.f124959l, "RecordControlProgressScene");
        C0184k kVar = this;
        this.f124961n.mo7352a(kVar, new C49864b(this));
        this.f124962o.mo7352a(kVar, new C49865c(this));
        C43859a aVar = this.f124965r;
        if (aVar != null) {
            C2763g c = aVar.mo89399c();
            if (c != null) {
                c.mo7352a(kVar, new C49866d(this));
            }
        }
        this.f124967t.mo91295A().mo7349a(kVar, new C49867e(this));
        this.f124967t.mo91344ad().mo7349a(kVar, new C49868f(this));
    }

    /* renamed from: d */
    public final void mo97695d(int i) {
        this.f124959l.mo97702d(i);
    }

    /* renamed from: a */
    public final void mo97684a(int i) {
        this.f124963p.mo7345a(Integer.valueOf(i));
    }

    /* renamed from: b */
    public final void mo97689b(int i) {
        RecordLayout recordLayout = this.f124959l.f124990k;
        if (recordLayout == null) {
            C52711k.m112237a("recordLayout");
        }
        recordLayout.setCurrentScaleMode(0);
    }

    /* renamed from: e */
    public final void mo97698e(int i) {
        View view = this.f124959l.f124991l;
        if (view == null) {
            C52711k.m112237a("deleteLast");
        }
        view.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo97687a(RetakeVideoContext retakeVideoContext) {
        C52711k.m112240b(retakeVideoContext, "value");
        this.f124964q.mo7345a(retakeVideoContext);
    }

    /* renamed from: b */
    public final void mo97690b(boolean z) {
        RecordLayout recordLayout = this.f124959l.f124990k;
        if (recordLayout == null) {
            C52711k.m112237a("recordLayout");
        }
        recordLayout.f115211A = true;
    }

    /* renamed from: c */
    public final void mo97692c(int i) {
        RecordLayout recordLayout = this.f124959l.f124990k;
        if (recordLayout == null) {
            C52711k.m112237a("recordLayout");
        }
        recordLayout.mo91899a(1);
    }

    /* renamed from: d */
    public final void mo97696d(boolean z) {
        this.f124962o.mo7345a(Boolean.valueOf(z));
    }

    /* renamed from: c */
    public final void mo97693c(boolean z) {
        this.f124961n.mo7345a(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final void mo97686a(Animation animation) {
        C52711k.m112240b(animation, "value");
        C49869c cVar = this.f124959l;
        C52711k.m112240b(animation, "animation");
        RecordLayout recordLayout = cVar.f124990k;
        if (recordLayout == null) {
            C52711k.m112237a("recordLayout");
        }
        C9432q.m18686a((View) recordLayout);
        RecordLayout recordLayout2 = cVar.f124990k;
        if (recordLayout2 == null) {
            C52711k.m112237a("recordLayout");
        }
        recordLayout2.startAnimation(animation);
    }

    /* renamed from: a */
    public final void mo97688a(boolean z) {
        RecordLayout recordLayout = this.f124959l.f124990k;
        if (recordLayout == null) {
            C52711k.m112237a("recordLayout");
        }
        recordLayout.setEnabled(z);
    }

    /* renamed from: a */
    public final void mo97685a(int i, boolean z) {
        C49869c cVar = this.f124959l;
        RecordLayout recordLayout = cVar.f124990k;
        if (recordLayout == null) {
            C52711k.m112237a("recordLayout");
        }
        recordLayout.mo91900a(i, z);
        if (cVar.f124999t == C45582a.PLAN_B && i == 1 && cVar.f124998s) {
            cVar.f124998s = false;
            cVar.mo97700F();
        }
    }

    public C49862b(C12361b bVar, C12896b bVar2, int i) {
        C2763g gVar;
        C2763g gVar2;
        C2763g gVar3;
        C12361b bVar3 = bVar;
        C12896b bVar4 = bVar2;
        C52711k.m112240b(bVar3, "diContainer");
        C52711k.m112240b(bVar4, "parentScene");
        this.f124968u = bVar3;
        this.f124960m = bVar4;
        this.f124969v = i;
        C2763g gVar4 = null;
        this.f124953f = new C2766j<>(null);
        this.f124954g = new C2766j<>(null);
        this.f124963p = new C2766j<>(Integer.valueOf(-1));
        this.f124964q = new C2766j<>(null);
        this.f124955h = new C2766j<>(null);
        this.f124956i = new C2766j<>(null);
        this.f124965r = (C43859a) mo23370j().mo23375b(C43859a.class, (String) null);
        this.f124966s = (C49822a) mo23370j().mo23375b(C49822a.class, (String) null);
        this.f124967t = (C45004a) mo23370j().mo23373a(C45004a.class, (String) null);
        this.f124957j = (ShortVideoContext) mo23370j().mo23373a(ShortVideoContext.class, (String) null);
        this.f124958k = C52732g.m112286a(C52757k.NONE, new C49863a(this));
        C45004a aVar = this.f124967t;
        ShortVideoContext shortVideoContext = this.f124957j;
        C2763g gVar5 = this.f124951d;
        C2763g gVar6 = this.f124953f;
        C2763g gVar7 = this.f124954g;
        C2763g gVar8 = this.f124963p;
        C2763g gVar9 = this.f124964q;
        C2763g gVar10 = this.f124955h;
        C2763g gVar11 = this.f124956i;
        C2763g gVar12 = this.f124952e;
        C43859a aVar2 = this.f124965r;
        if (aVar2 != null) {
            gVar = aVar2.mo89403e();
        } else {
            gVar = null;
        }
        C43859a aVar3 = this.f124965r;
        if (aVar3 != null) {
            gVar2 = aVar3.mo89401d();
        } else {
            gVar2 = null;
        }
        C49822a aVar4 = this.f124966s;
        if (aVar4 != null) {
            gVar3 = aVar4.mo97669c();
        } else {
            gVar3 = null;
        }
        C49822a aVar5 = this.f124966s;
        if (aVar5 != null) {
            gVar4 = aVar5.mo97670d();
        }
        C49869c cVar = new C49869c(aVar, shortVideoContext, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, gVar12, gVar, gVar2, gVar3, gVar4);
        this.f124959l = cVar;
    }
}
