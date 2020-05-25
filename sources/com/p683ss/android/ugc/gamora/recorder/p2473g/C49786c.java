package com.p683ss.android.ugc.gamora.recorder.p2473g;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.als.C2759d;
import com.bytedance.als.C2764h;
import com.bytedance.als.C2766j;
import com.bytedance.als.C2767k;
import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11788aa;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.C11910j;
import com.bytedance.jedi.arch.C11931r;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.C11934u;
import com.bytedance.jedi.arch.C11937x;
import com.bytedance.jedi.arch.C11938y;
import com.bytedance.jedi.arch.C11939z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p780m.C12356a;
import com.bytedance.p780m.C12361b;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.group.C12896b;
import com.bytedance.scene.ktx.C12931a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2203g.C43859a;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p069b.C1690c;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52847n;
import p2628d.C52857u;
import p2628d.C52860x;
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
import p2628d.p2648k.C52767h;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.recorder.g.c */
public final class C49786c extends C2764h<C49784a> implements C12356a, C49548a, C49784a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f124804a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49786c.class), "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49786c.class), "recordExitController", "getRecordExitController()Lcom/ss/android/ugc/gamora/recorder/exit/IRecordExitController;"))};

    /* renamed from: b */
    public final C49784a f124805b = this;

    /* renamed from: c */
    public final C12896b f124806c;

    /* renamed from: d */
    private final C2766j<Drawable> f124807d = new C2766j<>(null);

    /* renamed from: e */
    private final C2766j<C52847n<Float, Float>> f124808e = new C2766j<>(null);

    /* renamed from: f */
    private final C52668f f124809f = C52732g.m112286a(C52757k.NONE, new C49787a(this, null));

    /* renamed from: g */
    private final C52668f f124810g = C52732g.m112285a(C49802p.f124842a);

    /* renamed from: h */
    private final C12361b f124811h;

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.c$a */
    public static final class C49787a extends C52712l implements C52670a<C43859a> {

        /* renamed from: a */
        final /* synthetic */ C12356a f124812a;

        /* renamed from: b */
        final /* synthetic */ String f124813b;

        public C49787a(C12356a aVar, String str) {
            this.f124812a = aVar;
            this.f124813b = str;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.shortvideo.g.a, java.lang.Object] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v2, types: [com.ss.android.ugc.aweme.shortvideo.g.a, java.lang.Object]
          assigns: [java.lang.Object]
          uses: [com.ss.android.ugc.aweme.shortvideo.g.a]
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
        public final com.p683ss.android.ugc.aweme.shortvideo.p2203g.C43859a invoke() {
            /*
                r3 = this;
                com.bytedance.m.a r0 = r3.f124812a
                com.bytedance.m.b r0 = r0.mo23370j()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.g.a> r1 = com.p683ss.android.ugc.aweme.shortvideo.p2203g.C43859a.class
                java.lang.String r2 = r3.f124813b
                java.lang.Object r0 = r0.mo23373a(r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.p2473g.C49786c.C49787a.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.c$b */
    static final class C49788b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49786c f124814a;

        /* renamed from: b */
        final /* synthetic */ Activity f124815b;

        C49788b(C49786c cVar, Activity activity) {
            this.f124814a = cVar;
            this.f124815b = activity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f124814a.mo97653l().mo97641a(this.f124815b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.c$c */
    static final class C49789c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        public static final C49789c f124816a = new C49789c();

        C49789c() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.c$d */
    static final class C49790d extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49786c f124817a;

        /* renamed from: b */
        final /* synthetic */ Activity f124818b;

        C49790d(C49786c cVar, Activity activity) {
            this.f124817a = cVar;
            this.f124818b = activity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C39618d.f101175p.mo80686a();
            this.f124817a.mo97653l().mo97641a(this.f124818b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.c$e */
    static final class C49791e extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49786c f124819a;

        /* renamed from: b */
        final /* synthetic */ ShortVideoContext f124820b;

        /* renamed from: c */
        final /* synthetic */ Activity f124821c;

        C49791e(C49786c cVar, ShortVideoContext shortVideoContext, Activity activity) {
            this.f124819a = cVar;
            this.f124820b = shortVideoContext;
            this.f124821c = activity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C26890h.m65011a("reshoot", C42438az.m93209a().mo86526a("creation_id", this.f124820b.f107131x).mo86526a("shoot_way", this.f124820b.f107132y).mo86523a("draft_id", this.f124820b.f107022A).f107329a);
            this.f124819a.mo97653l().mo97650d(this.f124821c);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.c$f */
    static final class C49792f extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49786c f124822a;

        /* renamed from: b */
        final /* synthetic */ Activity f124823b;

        C49792f(C49786c cVar, Activity activity) {
            this.f124822a = cVar;
            this.f124823b = activity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f124822a.mo97653l().mo97641a(this.f124823b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.c$g */
    static final class C49793g extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49786c f124824a;

        /* renamed from: b */
        final /* synthetic */ Activity f124825b;

        /* renamed from: c */
        final /* synthetic */ ShortVideoContext f124826c;

        C49793g(C49786c cVar, Activity activity, ShortVideoContext shortVideoContext) {
            this.f124824a = cVar;
            this.f124825b = activity;
            this.f124826c = shortVideoContext;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f124824a.mo97653l().mo97648c(this.f124825b);
            ShortVideoContext shortVideoContext = this.f124826c;
            C52711k.m112236a((Object) shortVideoContext, "shortVideoContext");
            if (shortVideoContext.mo86372m() == 0) {
                this.f124824a.mo97653l().mo97641a(this.f124825b);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.c$h */
    static final class C49794h extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        public static final C49794h f124827a = new C49794h();

        C49794h() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.c$i */
    static final class C49795i extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49786c f124828a;

        /* renamed from: b */
        final /* synthetic */ Activity f124829b;

        C49795i(C49786c cVar, Activity activity) {
            this.f124828a = cVar;
            this.f124829b = activity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C39618d.f101175p.mo80686a();
            this.f124828a.mo97653l().mo97646b(this.f124829b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.c$j */
    static final class C49796j extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49786c f124830a;

        /* renamed from: b */
        final /* synthetic */ ShortVideoContext f124831b;

        /* renamed from: c */
        final /* synthetic */ Activity f124832c;

        C49796j(C49786c cVar, ShortVideoContext shortVideoContext, Activity activity) {
            this.f124830a = cVar;
            this.f124831b = shortVideoContext;
            this.f124832c = activity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C26890h.m65011a("reshoot", C42438az.m93209a().mo86526a("creation_id", this.f124831b.f107131x).mo86526a("shoot_way", this.f124831b.f107132y).mo86523a("draft_id", this.f124831b.f107022A).f107329a);
            this.f124830a.mo97653l().mo97641a(this.f124832c);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.c$k */
    static final class C49797k extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        public static final C49797k f124833a = new C49797k();

        C49797k() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.c$l */
    static final class C49798l extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49786c f124834a;

        /* renamed from: b */
        final /* synthetic */ Activity f124835b;

        C49798l(C49786c cVar, Activity activity) {
            this.f124834a = cVar;
            this.f124835b = activity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C39618d.f101175p.mo80686a();
            this.f124834a.mo97653l().mo97646b(this.f124835b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.c$m */
    static final class C49799m extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49786c f124836a;

        /* renamed from: b */
        final /* synthetic */ ShortVideoContext f124837b;

        /* renamed from: c */
        final /* synthetic */ Activity f124838c;

        C49799m(C49786c cVar, ShortVideoContext shortVideoContext, Activity activity) {
            this.f124836a = cVar;
            this.f124837b = shortVideoContext;
            this.f124838c = activity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C26890h.m65011a("reshoot", C42438az.m93209a().mo86526a("creation_id", this.f124837b.f107131x).mo86526a("shoot_way", this.f124837b.f107132y).mo86523a("draft_id", this.f124837b.f107022A).f107329a);
            this.f124836a.mo97653l().mo97650d(this.f124838c);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.c$n */
    static final class C49800n extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C12896b f124839a;

        /* renamed from: b */
        final /* synthetic */ C49786c f124840b;

        C49800n(C12896b bVar, C49786c cVar) {
            this.f124839a = bVar;
            this.f124840b = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C49786c cVar = this.f124840b;
            Activity v = this.f124839a.mo24477v();
            C52711k.m112236a((Object) v, "requireActivity()");
            if (v != null) {
                C0209x a = C0214z.m440a((FragmentActivity) v).mo359a(ShortVideoContextViewModel.class);
                C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java)");
                ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f107134a;
                if (shortVideoContext.f107101b != 1 || shortVideoContext.f107122o) {
                    Context context = v;
                    if (cVar.mo97653l().mo97645a(context)) {
                        cVar.mo97653l().mo97643a(context, new C49792f(cVar, v), new C49793g(cVar, v, shortVideoContext));
                    } else {
                        C52711k.m112236a((Object) shortVideoContext, "shortVideoContext");
                        if (shortVideoContext.mo86372m() == 0) {
                            if (shortVideoContext.mo86362d()) {
                                cVar.mo97653l().mo97647b(context, C49794h.f124827a, new C49795i(cVar, v), new C49796j(cVar, shortVideoContext, v));
                            } else {
                                cVar.mo97653l().mo97641a(v);
                            }
                        } else if (shortVideoContext.mo86362d()) {
                            cVar.mo97653l().mo97649c(context, C49797k.f124833a, new C49798l(cVar, v), new C49799m(cVar, shortVideoContext, v));
                        } else {
                            cVar.mo97653l().mo97644a(context, C49789c.f124816a, new C49790d(cVar, v), new C49791e(cVar, shortVideoContext, v));
                        }
                    }
                } else {
                    cVar.mo97653l().mo97642a(v, new C49788b(cVar, v));
                }
                return C52860x.f131107a;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.c$o */
    static final class C49801o<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49786c f124841a;

        C49801o(C49786c cVar) {
            this.f124841a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (this.f124841a.mo97652k().mo89407h()) {
                this.f124841a.mo97651a(false);
                return;
            }
            C49786c cVar = this.f124841a;
            C52711k.m112236a((Object) bool, "show");
            cVar.mo97651a(bool.booleanValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.c$p */
    static final class C49802p extends C52712l implements C52670a<C49803d> {

        /* renamed from: a */
        public static final C49802p f124842a = new C49802p();

        C49802p() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C49803d();
        }
    }

    /* renamed from: j */
    public final C12361b mo23370j() {
        return this.f124811h;
    }

    /* renamed from: k */
    public final C43859a mo97652k() {
        return (C43859a) this.f124809f.getValue();
    }

    /* renamed from: l */
    public final C49785b mo97653l() {
        return (C49785b) this.f124810g.getValue();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2759d mo7353a() {
        return this.f124805b;
    }

    /* renamed from: c */
    public final C11910j mo22553c() {
        return C49549a.m106927b(this);
    }

    /* renamed from: d */
    public final C11931r<C11866f> mo22554d() {
        return C49549a.m106934d(this);
    }

    /* renamed from: f */
    public final boolean mo22555f() {
        return C49549a.m106935e(this);
    }

    /* renamed from: h */
    public final C0184k mo22626h() {
        return C49549a.m106918a(this);
    }

    /* renamed from: i */
    public final /* synthetic */ C11796d mo22645i() {
        return C49549a.m106930c(this);
    }

    public final void bO_() {
        super.bO_();
        C12896b bVar = this.f124806c;
        bVar.mo24389a((int) R.id.c_q, (C12924i) new C49816e(new C49800n(bVar, this), this.f124807d, this.f124808e, mo97652k().mo89403e()), "RecordExitScene");
        mo97652k().mo89399c().mo7352a(this, new C49801o(this));
    }

    /* renamed from: a */
    public final void mo97640a(C52847n<Float, Float> nVar) {
        this.f124808e.mo7345a(nVar);
    }

    /* renamed from: a */
    public final void mo97651a(boolean z) {
        C12896b bVar = this.f124806c;
        if (z) {
            C12931a.m25973a(bVar, "RecordExitScene");
        } else {
            C12931a.m25974b(bVar, "RecordExitScene");
        }
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C49549a.m106924a(this, vm1, bVar);
    }

    public C49786c(C12896b bVar, C12361b bVar2) {
        C52711k.m112240b(bVar, "parentScene");
        C52711k.m112240b(bVar2, "diContainer");
        this.f124806c = bVar;
        this.f124811h = bVar2;
    }

    /* renamed from: a */
    public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106919a(this, jediViewModel, uVar, mVar);
    }

    /* renamed from: b */
    public final <S extends C11932s, A> void mo49443b(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectNonNullSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106925a(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: c */
    public final <S extends C11932s, A> void mo49444c(JediViewModel<S> jediViewModel, C52771j<S, ? extends C49555b<? extends A>> jVar, C11934u<C11937x<C49555b<A>>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribeEvent");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106928b(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: d */
    public final <S extends C11932s, A> void mo49445d(JediViewModel<S> jediViewModel, C52771j<S, ? extends C49562i<? extends A>> jVar, C11934u<C11937x<C49562i<A>>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribeMultiEvent");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106931c(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A> C1690c mo22547a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C11866f, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106933d(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B> C1690c mo22549a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C11934u<C11938y<A, B>> uVar, C52686q<? super C11866f, ? super A, ? super B, C52860x> qVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(qVar, "subscriber");
        return C49549a.m106921a(this, jediViewModel, jVar, jVar2, uVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, T> C1690c mo22548a(JediViewModel<S> jediViewModel, C52771j<S, ? extends C11787a<? extends T>> jVar, C11934u<C11937x<C11787a<T>>> uVar, C52682m<? super C11866f, ? super Throwable, C52860x> mVar, C52671b<? super C11866f, C52860x> bVar, C52682m<? super C11866f, ? super T, C52860x> mVar2) {
        C52711k.m112240b(jediViewModel, "$this$asyncSubscribe");
        C52711k.m112240b(jVar, "prop");
        C52711k.m112240b(uVar, "config");
        return C49549a.m106920a((C49548a) this, jediViewModel, jVar, uVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C> C1690c mo22550a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C11934u<C11939z<A, B, C>> uVar, C52687r<? super C11866f, ? super A, ? super B, ? super C, C52860x> rVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(rVar, "subscriber");
        return C49549a.m106922a((C49548a) this, jediViewModel, jVar, jVar2, jVar3, uVar, rVar);
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
        return C49549a.m106923a(this, jediViewModel, jVar, jVar2, jVar3, jVar4, uVar, sVar);
    }
}
