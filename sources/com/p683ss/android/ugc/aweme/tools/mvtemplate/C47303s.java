package com.p683ss.android.ugc.aweme.tools.mvtemplate;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.ViewStubCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.als.ApiCenter.C2755a;
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
import com.bytedance.scene.C12924i;
import com.bytedance.scene.ktx.C12932b;
import com.p683ss.android.ugc.aweme.p1387as.C23286a;
import com.p683ss.android.ugc.aweme.shortvideo.C43225dr;
import com.p683ss.android.ugc.aweme.shortvideo.p2203g.C43859a;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.p2369c.C47251c;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49604i;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p069b.C1690c;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52767h;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.s */
public final class C47303s extends C49604i implements C49548a {

    /* renamed from: i */
    static final /* synthetic */ C52767h[] f119400i = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C47303s.class), "mvViewModel", "getMvViewModel()Lcom/ss/android/ugc/aweme/tools/mvtemplate/RecordMVViewModel;"))};

    /* renamed from: k */
    public static final C47306b f119401k = new C47306b(null);

    /* renamed from: j */
    public C23286a f119402j;

    /* renamed from: l */
    private final C52668f f119403l;

    /* renamed from: m */
    private C43225dr f119404m;

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.s$a */
    public static final class C47304a extends C52712l implements C52670a<RecordMVViewModel> {

        /* renamed from: a */
        final /* synthetic */ C12924i f119405a;

        /* renamed from: b */
        final /* synthetic */ C52760c f119406b;

        /* renamed from: c */
        final /* synthetic */ C52760c f119407c;

        public C47304a(C12924i iVar, C52760c cVar, C52760c cVar2) {
            this.f119405a = iVar;
            this.f119406b = cVar;
            this.f119407c = cVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v6, types: [com.ss.android.ugc.aweme.tools.mvtemplate.RecordMVViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v6, types: [com.ss.android.ugc.aweme.tools.mvtemplate.RecordMVViewModel, com.bytedance.jedi.arch.JediViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.ss.android.ugc.aweme.tools.mvtemplate.RecordMVViewModel]
          mth insns count: 20
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
        public final com.p683ss.android.ugc.aweme.tools.mvtemplate.RecordMVViewModel invoke() {
            /*
                r3 = this;
                com.bytedance.scene.i r0 = r3.f119405a
                android.app.Activity r0 = r0.mo24477v()
                if (r0 == 0) goto L_0x0031
                android.support.v4.app.FragmentActivity r0 = (android.support.p030v4.app.FragmentActivity) r0
                com.ss.android.ugc.aweme.tools.mvtemplate.s$a$1 r1 = new com.ss.android.ugc.aweme.tools.mvtemplate.s$a$1
                r1.<init>()
                android.arch.lifecycle.y$b r1 = (android.arch.lifecycle.C0210y.C0212b) r1
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m441a(r0, r1)
                d.k.c r1 = r3.f119407c
                java.lang.Class r1 = p2628d.p2639f.C52669a.m112219a(r1)
                java.lang.String r1 = r1.getName()
                java.lang.String r2 = "viewModelClass.java.name"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                d.k.c r2 = r3.f119406b
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                return r0
            L_0x0031:
                d.u r0 = new d.u
                java.lang.String r1 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.tools.mvtemplate.C47303s.C47304a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.s$b */
    public static final class C47306b {
        private C47306b() {
        }

        public /* synthetic */ C47306b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.s$c */
    static final class C47307c<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C47303s f119408a;

        C47307c(C47303s sVar) {
            this.f119408a = sVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C23286a aVar = this.f119408a.f119402j;
            if (aVar == null) {
                C52711k.m112237a("mvTemplateModule");
            }
            C52711k.m112236a((Object) bool, "it");
            aVar.mo48260a(bool.booleanValue());
        }
    }

    /* renamed from: F */
    public final String mo49446F() {
        return "RecordMVScene";
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

    /* renamed from: A */
    public final void mo24457A() {
        super.mo24457A();
        C23286a aVar = this.f119402j;
        if (aVar == null) {
            C52711k.m112237a("mvTemplateModule");
        }
        aVar.mo48261b();
    }

    /* renamed from: B */
    public final void mo24458B() {
        super.mo24458B();
        C23286a aVar = this.f119402j;
        if (aVar == null) {
            C52711k.m112237a("mvTemplateModule");
        }
        aVar.mo48262c();
    }

    /* renamed from: H */
    public final void mo49448H() {
        C23286a aVar = this.f119402j;
        if (aVar == null) {
            C52711k.m112237a("mvTemplateModule");
        }
        aVar.dismiss();
    }

    /* renamed from: p */
    public final void mo24469p() {
        super.mo24469p();
        C23286a aVar = this.f119402j;
        if (aVar == null) {
            C52711k.m112237a("mvTemplateModule");
        }
        aVar.mo48263d();
    }

    /* renamed from: z */
    public final void mo24481z() {
        super.mo24481z();
        C23286a aVar = this.f119402j;
        if (aVar == null) {
            C52711k.m112237a("mvTemplateModule");
        }
        aVar.mo48259a();
    }

    public C47303s() {
        C52760c a = C52728w.m112245a(RecordMVViewModel.class);
        this.f119403l = C52732g.m112285a(new C47304a(this, a, a));
    }

    /* renamed from: G */
    public final void mo49447G() {
        C23286a aVar = this.f119402j;
        if (aVar == null) {
            C52711k.m112237a("mvTemplateModule");
        }
        aVar.mo48265e();
        C47251c.m102581a((Context) mo24477v());
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        Object a = mo24460E().mo24560a("owner");
        if (a == null) {
            C52711k.m112234a();
        }
        this.f119404m = (C43225dr) a;
        C12924i iVar = this;
        RecordMVViewModel recordMVViewModel = (RecordMVViewModel) this.f119403l.getValue();
        C52711k.m112240b(iVar, "scene");
        C52711k.m112240b(recordMVViewModel, "mvViewModel");
        Activity v = iVar.mo24477v();
        if (v != null) {
            C47233b bVar = new C47233b((FragmentActivity) v, (ViewStubCompat) iVar.mo24464b((int) R.id.bp8));
            bVar.mo94509a(recordMVViewModel.f119250d);
            bVar.mo94506a(recordMVViewModel.mo94494e());
            this.f119402j = bVar;
            FragmentActivity a2 = C12932b.m25976a(this);
            if (a2 == null) {
                C52711k.m112234a();
            }
            ((C43859a) C2755a.m7851a(a2).mo7339a(C43859a.class)).mo89401d().mo7352a(this, new C47307c(this));
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C49549a.m106924a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.au0, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…_scene, container, false)");
        return inflate;
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
