package com.p683ss.android.ugc.gamora.recorder.p2464a;

import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0178b;
import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.bytedance.scene.navigation.C12942d;
import com.p683ss.android.ugc.aweme.beauty.C23780d;
import com.p683ss.android.ugc.aweme.beauty.C23784g;
import com.p683ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.p683ss.android.ugc.aweme.shortvideo.C42562ct;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p683ss.android.ugc.aweme.tools.C47336q;
import com.p683ss.android.ugc.aweme.tools.beauty.C46872f;
import com.p683ss.android.ugc.aweme.tools.beauty.C46873g;
import com.p683ss.android.ugc.aweme.tools.beauty.p2350b.C46823a;
import com.p683ss.android.ugc.aweme.tools.beauty.p2350b.C46825c;
import com.p683ss.android.ugc.aweme.tools.beauty.service.C46896d;
import com.p683ss.android.ugc.aweme.tools.beauty.service.C46898f;
import com.p683ss.android.ugc.aweme.tools.beauty.service.C46898f.C46899a;
import com.p683ss.android.ugc.aweme.tools.beauty.service.p2352a.C46886c;
import com.p683ss.android.ugc.aweme.tools.beauty.views.C46929b;
import com.p683ss.android.ugc.aweme.tools.beauty.views.C46929b.C46932a;
import com.p683ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl;
import com.p683ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl.C46906a;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2457a.C48923a;
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
import p2628d.p2648k.C52767h;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.recorder.a.c */
public final class C49571c extends C12924i implements C49548a {

    /* renamed from: i */
    static final /* synthetic */ C52767h[] f124347i = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49571c.class), "beautyViewListener", "getBeautyViewListener()Lcom/ss/android/ugc/aweme/tools/beauty/listener/PersistenceBeautyModuleListener;"))};

    /* renamed from: k */
    public static final C49572a f124348k = new C49572a(null);

    /* renamed from: j */
    public final C48923a f124349j;

    /* renamed from: l */
    private final C52668f f124350l = C52732g.m112285a(new C49573b(this));

    /* renamed from: m */
    private C46898f f124351m;

    /* renamed from: n */
    private C46886c f124352n;

    /* renamed from: com.ss.android.ugc.gamora.recorder.a.c$a */
    public static final class C49572a {
        private C49572a() {
        }

        public /* synthetic */ C49572a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.a.c$b */
    static final class C49573b extends C52712l implements C52670a<C46825c> {

        /* renamed from: a */
        final /* synthetic */ C49571c f124353a;

        C49573b(C49571c cVar) {
            this.f124353a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C46825c(new C46823a(this, this.f124353a.f124349j.mo96757h()) {

                /* renamed from: b */
                final /* synthetic */ C49573b f124354b;

                /* renamed from: a */
                public final void mo94065a() {
                    IRecordingOperationPanel a = this.f124354b.f124353a.f124349j.mo96750a();
                    if (a != null) {
                        ((C42562ct) a).mo86791d().mo86534a(new C47336q(0));
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.PlanC");
                }

                /* renamed from: b */
                public final void mo94071b() {
                    C0176h lifecycle = this.f124354b.f124353a.getLifecycle();
                    C52711k.m112236a((Object) lifecycle, "lifecycle");
                    if (lifecycle.mo323a().isAtLeast(C0178b.CREATED)) {
                        C12942d dVar = this.f124354b.f124353a.f33837e;
                        if (dVar == null) {
                            C52711k.m112234a();
                        }
                        dVar.mo24531d();
                    }
                }

                {
                    this.f124354b = r1;
                }
            });
        }
    }

    /* renamed from: F */
    private final C46825c m106950F() {
        return (C46825c) this.f124350l.getValue();
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

    /* renamed from: p */
    public final void mo24469p() {
        super.mo24469p();
        IRecordingOperationPanel a = this.f124349j.mo96750a();
        if (a != null) {
            C42562ct ctVar = (C42562ct) a;
            C0176h lifecycle = ctVar.getLifecycle();
            C52711k.m112236a((Object) lifecycle, "planc.lifecycle");
            if (lifecycle.mo323a().isAtLeast(C0178b.CREATED)) {
                ctVar.mo86791d().mo86534a(new C47336q(4));
            }
            C46898f fVar = this.f124351m;
            if (fVar != null) {
                fVar.mo94172b();
                return;
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.PlanC");
    }

    public C49571c(C48923a aVar) {
        C52711k.m112240b(aVar, "recordEnv");
        this.f124349j = aVar;
        AVETParameter k = this.f124349j.mo96752c().mo86370k();
        C52711k.m112236a((Object) k, "recordEnv.shortVideoContext.avetParameter");
        this.f124352n = new C46886c(k);
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        if (this.f124351m != null) {
            C46898f fVar = this.f124351m;
            if (fVar != null) {
                View view = this.f33834b;
                if (view != null) {
                    fVar.setContainer((ViewGroup) view);
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
                }
            }
        } else if (C23780d.m58365a()) {
            C46872f fVar2 = new C46872f(this.f124349j.mo96757h().mo86562d(), this.f124352n);
            Context b = this.f124349j.mo96751b();
            View view2 = this.f33834b;
            if (view2 != null) {
                ViewGroup viewGroup = (ViewGroup) view2;
                C46899a F = m106950F();
                C52711k.m112240b(b, "context");
                C52711k.m112240b(viewGroup, "container");
                C52711k.m112240b(F, "listener");
                C46906a aVar = new C46906a(b, viewGroup, fVar2.f118408a);
                aVar.f118513a = F;
                aVar.f118514b = fVar2.f118409b;
                ComposerBeautyViewImpl composerBeautyViewImpl = new ComposerBeautyViewImpl(aVar.f118515c, aVar.f118517e, null);
                composerBeautyViewImpl.setContainer(aVar.f118516d);
                composerBeautyViewImpl.setBeautyViewListener(aVar.f118513a);
                composerBeautyViewImpl.setBeautyBuried(aVar.f118514b);
                this.f124351m = composerBeautyViewImpl;
            } else {
                throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
            }
        } else {
            C46896d h = this.f124349j.mo96757h();
            C23784g gVar = new C23784g(h.mo86584i(), h.mo86586l(), h.mo86585k(), h.mo86587m(), h.mo86588n());
            C46873g gVar2 = new C46873g(gVar, this.f124349j.mo96752c().mo86370k());
            Context b2 = this.f124349j.mo96751b();
            View view3 = this.f33834b;
            if (view3 != null) {
                ViewGroup viewGroup2 = (ViewGroup) view3;
                C46899a F2 = m106950F();
                C52711k.m112240b(b2, "context");
                C52711k.m112240b(viewGroup2, "container");
                C52711k.m112240b(F2, "listener");
                C46929b a = new C46932a(b2).mo94227a(F2).mo94225a(gVar2.f118410a).mo94226a(gVar2.f118411b).mo94228a(viewGroup2);
                C52711k.m112236a((Object) a, "ULikeBeautyViewImpl.Buil…       .create(container)");
                this.f124351m = a;
            } else {
                throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
        if (C23780d.m58365a()) {
            C47702b.f120193a.mo94984a("click_beautify_entrance", C46886c.m101811a(this.f124352n.f118445a).f107329a);
        }
        C46898f fVar3 = this.f124351m;
        if (fVar3 != null) {
            fVar3.mo94171a();
        }
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
        View inflate = layoutInflater.inflate(R.layout.atm, viewGroup, false);
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
