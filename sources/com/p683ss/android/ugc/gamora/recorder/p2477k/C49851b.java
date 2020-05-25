package com.p683ss.android.ugc.gamora.recorder.p2477k;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import com.bytedance.als.C2759d;
import com.bytedance.als.C2762f;
import com.bytedance.als.C2764h;
import com.bytedance.als.C2765i;
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
import com.bytedance.scene.ktx.C12932b;
import com.bytedance.scene.navigation.C12942d;
import com.p683ss.android.ugc.aweme.scene.C18998a;
import com.p683ss.android.ugc.aweme.shortvideo.C42562ct;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2177b.C42443a;
import com.p683ss.android.ugc.aweme.shortvideo.p2187e.C43306a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordNewActivity;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.tools.C47324o;
import com.p683ss.android.ugc.aweme.tools.C47336q;
import com.p683ss.android.ugc.aweme.tools.C47337r;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import p064c.p065a.p069b.C1690c;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
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

/* renamed from: com.ss.android.ugc.gamora.recorder.k.b */
public final class C49851b extends C2764h<C49850a> implements C12356a, C49548a, C49850a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f124924a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49851b.class), "cameraApiComponent", "getCameraApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/component/CameraApiComponent;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49851b.class), "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;"))};

    /* renamed from: b */
    public final C49851b f124925b = this;

    /* renamed from: c */
    public final C2765i<Boolean> f124926c = new C2765i<>();

    /* renamed from: d */
    final C52668f f124927d = C52732g.m112286a(C52757k.NONE, new C49853b(this, null));

    /* renamed from: e */
    public final C12896b f124928e;

    /* renamed from: f */
    private final C52668f f124929f = C52732g.m112286a(C52757k.NONE, new C49852a(this, null));

    /* renamed from: g */
    private final C12361b f124930g;

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.b$a */
    public static final class C49852a extends C52712l implements C52670a<C45004a> {

        /* renamed from: a */
        final /* synthetic */ C12356a f124931a;

        /* renamed from: b */
        final /* synthetic */ String f124932b;

        public C49852a(C12356a aVar, String str) {
            this.f124931a = aVar;
            this.f124932b = str;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.shortvideo.ui.b.a, java.lang.Object] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v2, types: [com.ss.android.ugc.aweme.shortvideo.ui.b.a, java.lang.Object]
          assigns: [java.lang.Object]
          uses: [com.ss.android.ugc.aweme.shortvideo.ui.b.a]
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
        public final com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a invoke() {
            /*
                r3 = this;
                com.bytedance.m.a r0 = r3.f124931a
                com.bytedance.m.b r0 = r0.mo23370j()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ui.b.a> r1 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a.class
                java.lang.String r2 = r3.f124932b
                java.lang.Object r0 = r0.mo23373a(r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.p2477k.C49851b.C49852a.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.b$b */
    public static final class C49853b extends C52712l implements C52670a<ShortVideoContext> {

        /* renamed from: a */
        final /* synthetic */ C12356a f124933a;

        /* renamed from: b */
        final /* synthetic */ String f124934b;

        public C49853b(C12356a aVar, String str) {
            this.f124933a = aVar;
            this.f124934b = str;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, java.lang.Object] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v2, types: [com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, java.lang.Object]
          assigns: [java.lang.Object]
          uses: [com.ss.android.ugc.aweme.shortvideo.ShortVideoContext]
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
        public final com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext invoke() {
            /*
                r3 = this;
                com.bytedance.m.a r0 = r3.f124933a
                com.bytedance.m.b r0 = r0.mo23370j()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContext> r1 = com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext.class
                java.lang.String r2 = r3.f124934b
                java.lang.Object r0 = r0.mo23373a(r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.p2477k.C49851b.C49853b.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.b$c */
    static final class C49854c<T> implements C2767k<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49851b f124935a;

        C49854c(C49851b bVar) {
            this.f124935a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C52860x xVar = (C52860x) obj;
            this.f124935a.mo97681b(false);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.b$d */
    static final class C49855d<T> implements C2767k<C47337r> {

        /* renamed from: a */
        final /* synthetic */ C49851b f124936a;

        C49855d(C49851b bVar) {
            this.f124936a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            C47337r rVar = (C47337r) obj;
            C52711k.m112236a((Object) rVar, "ev");
            if (rVar.f119494c != 0 || !rVar.f119493b.isEmpty() || ((ShortVideoContext) this.f124936a.f124927d.getValue()).f107122o) {
                z = false;
            } else {
                z = true;
            }
            this.f124936a.mo97680a(z);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.b$e */
    static final class C49856e extends C52712l implements C52671b<Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49851b f124937a;

        C49856e(C49851b bVar) {
            this.f124937a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            C49851b bVar = this.f124937a;
            bVar.mo97681b(false);
            C0209x a = C0214z.m440a(C12932b.m25979b(bVar.f124928e)).mo359a(ShortVideoContextViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(pa…extViewModel::class.java]");
            ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f107134a;
            Activity activity = bVar.f124928e.f33840g_;
            if (activity != null) {
                C42562ct ctVar = ((VideoRecordNewActivity) activity).f113794t;
                bVar.mo97683k().mo91307M().mo43630a(shortVideoContext.f107112e, (long) intValue, shortVideoContext.mo86372m());
                if (intValue != shortVideoContext.f107113f) {
                    bVar.mo97683k().mo91356b(shortVideoContext.f107089ao, true);
                }
                shortVideoContext.f107113f = intValue;
                C43306a.m94986a(shortVideoContext.f107112e, C43214dh.m94817a().mo50201b(), intValue);
                if (ctVar != null) {
                    bVar.mo97683k().mo91330a(new C47324o(shortVideoContext.f107110c));
                    ctVar.mo86791d().mo86534a(new C47336q(4));
                }
                return C52860x.f131107a;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.b$f */
    static final class C49857f extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49851b f124938a;

        C49857f(C49851b bVar) {
            this.f124938a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Activity activity = this.f124938a.f124928e.f33840g_;
            if (activity != null) {
                C42562ct ctVar = ((VideoRecordNewActivity) activity).f113794t;
                if (ctVar != null) {
                    C42443a d = ctVar.mo86791d();
                    if (d != null) {
                        d.mo86534a(new C47336q(4));
                    }
                }
                return C52860x.f131107a;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
        }
    }

    /* renamed from: j */
    public final C12361b mo23370j() {
        return this.f124930g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final C45004a mo97683k() {
        return (C45004a) this.f124929f.getValue();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2759d mo7353a() {
        return this.f124925b;
    }

    /* renamed from: c */
    public final C11910j mo22553c() {
        return C49549a.m106927b(this);
    }

    /* renamed from: d */
    public final C11931r<C11866f> mo22554d() {
        return C49549a.m106934d(this);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C2762f mo97682e() {
        return this.f124926c;
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

    /* renamed from: l */
    private boolean m107544l() {
        C12942d dVar = this.f124928e.f33837e;
        if (dVar == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) dVar, "parentScene.navigationScene!!");
        return C18998a.m46172a(dVar, C49858c.class);
    }

    public final void bO_() {
        super.bO_();
        mo97683k().mo91367n().mo7349a(C12932b.m25979b(this.f124928e), new C49854c(this));
        mo97683k().mo91295A().mo7349a(this, new C49855d(this));
    }

    /* renamed from: b */
    public final void mo97681b(boolean z) {
        if (this.f124928e.f33837e != null) {
            C12942d x = this.f124928e.mo24479x();
            C52711k.m112236a((Object) x, "parentScene.requireNavigationScene()");
            if (!z || C18998a.m46172a(x, C49858c.class)) {
                if (m107544l()) {
                    x.mo24531d();
                }
                return;
            }
            x.mo24527b((C12924i) new C49858c(new C49856e(this)));
            C18998a.m46170a(x, C49858c.class, new C49857f(this));
        }
    }

    /* renamed from: a */
    public final void mo97680a(boolean z) {
        this.f124926c.mo7350a(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C49549a.m106924a(this, vm1, bVar);
    }

    public C49851b(C12896b bVar, C12361b bVar2) {
        C52711k.m112240b(bVar, "parentScene");
        C52711k.m112240b(bVar2, "diContainer");
        this.f124928e = bVar;
        this.f124930g = bVar2;
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
