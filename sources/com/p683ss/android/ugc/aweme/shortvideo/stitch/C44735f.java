package com.p683ss.android.ugc.aweme.shortvideo.stitch;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
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
import com.p683ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42873bn;
import com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42907m;
import com.p683ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.C43120d;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p683ss.android.ugc.gamora.editor.C49444m;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2458b.C48924a;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
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
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.f */
public final class C44735f extends C48924a implements C49548a {

    /* renamed from: o */
    static final /* synthetic */ C52767h[] f113246o = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C44735f.class), "cornerScene", "getCornerScene()Lcom/ss/android/ugc/gamora/editor/EditCornerScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C44735f.class), "bottomBarScene", "getBottomBarScene()Lcom/ss/android/ugc/aweme/shortvideo/stitch/StitchTrimmingBottomBarScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C44735f.class), "videoEditScene", "getVideoEditScene()Lcom/ss/android/ugc/aweme/shortvideo/cut/scene/CutVideoEditScene;"))};

    /* renamed from: p */
    public VECutVideoPresenter f113247p;

    /* renamed from: q */
    public C42873bn f113248q;

    /* renamed from: r */
    private VideoEditViewModel f113249r;

    /* renamed from: s */
    private CutVideoPreviewViewModel f113250s;

    /* renamed from: t */
    private final C52668f f113251t = C52732g.m112285a(new C44737b(this));

    /* renamed from: u */
    private final C52668f f113252u = C52732g.m112285a(new C44736a(this));

    /* renamed from: v */
    private final C52668f f113253v = C52732g.m112285a(new C44738c(this));

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.f$a */
    static final class C44736a extends C52712l implements C52670a<C44731d> {

        /* renamed from: a */
        final /* synthetic */ C44735f f113254a;

        C44736a(C44735f fVar) {
            this.f113254a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C44731d dVar = new C44731d();
            C42873bn bnVar = this.f113254a.f113248q;
            if (bnVar == null) {
                C52711k.m112237a("previewEditCallback");
            }
            C52711k.m112240b(bnVar, "<set-?>");
            dVar.f113241i = bnVar;
            this.f113254a.mo24389a((int) R.id.ey9, (C12924i) dVar, "StitchTrimmingBottomBarScene");
            return dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.f$b */
    static final class C44737b extends C52712l implements C52670a<C49444m> {

        /* renamed from: a */
        final /* synthetic */ C44735f f113255a;

        C44737b(C44735f fVar) {
            this.f113255a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C49444m mVar = new C49444m();
            this.f113255a.mo24389a((int) R.id.ey9, (C12924i) mVar, "EditCornerScene");
            return mVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.f$c */
    static final class C44738c extends C52712l implements C52670a<C42907m> {

        /* renamed from: a */
        final /* synthetic */ C44735f f113256a;

        C44738c(C44735f fVar) {
            this.f113256a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C42907m mVar = new C42907m(false, false);
            VECutVideoPresenter vECutVideoPresenter = this.f113256a.f113247p;
            if (vECutVideoPresenter == null) {
                C52711k.m112237a("presenter");
            }
            mVar.mo87347a(vECutVideoPresenter);
            this.f113256a.mo24389a((int) R.id.ey9, (C12924i) mVar, "CutVideoEditScene");
            return mVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: J */
    public final C44731d mo90834J() {
        return (C44731d) this.f113252u.getValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: K */
    public final C42907m mo90835K() {
        return (C42907m) this.f113253v.getValue();
    }

    /* renamed from: c */
    public final C11910j mo86790c() {
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

    /* renamed from: L */
    public final C43120d mo90836L() {
        return mo90835K().mo87345G();
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            C0209x a = C0214z.m440a((FragmentActivity) activity).mo359a(VideoEditViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…ditViewModel::class.java)");
            this.f113249r = (VideoEditViewModel) a;
            Activity activity2 = this.f33840g_;
            if (activity2 != null) {
                JediViewModel a2 = C48927d.m105736a((FragmentActivity) activity2).mo96760a(CutVideoPreviewViewModel.class);
                C52711k.m112236a((Object) a2, "JediViewModelProviders.o…iewViewModel::class.java)");
                this.f113250s = (CutVideoPreviewViewModel) a2;
                View view = mo90834J().f33834b;
                C52711k.m112236a((Object) view, "bottomBarScene.view");
                LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.gravity = 80;
                    View view2 = mo90834J().f33834b;
                    C52711k.m112236a((Object) view2, "bottomBarScene.view");
                    view2.setLayoutParams(layoutParams2);
                    View view3 = mo90835K().f33834b;
                    C52711k.m112236a((Object) view3, "videoEditScene.view");
                    LayoutParams layoutParams3 = view3.getLayoutParams();
                    if (layoutParams3 != null) {
                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                        layoutParams4.gravity = 80;
                        View view4 = mo90835K().f33834b;
                        C52711k.m112236a((Object) view4, "videoEditScene.view");
                        view4.setLayoutParams(layoutParams4);
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
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
    public final void mo24463a(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.mo24463a(view, bundle);
        mo24409d((C12924i) (C49444m) this.f113251t.getValue());
        mo24409d((C12924i) mo90834J());
        mo24409d((C12924i) mo90835K());
    }

    /* renamed from: a */
    public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106919a(this, jediViewModel, uVar, mVar);
    }

    /* renamed from: b */
    public final ViewGroup mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.brm, viewGroup, false);
        if (inflate != null) {
            return (ViewGroup) inflate;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
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

    /* renamed from: b */
    public final <S extends C11932s, A> void mo49443b(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectNonNullSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106925a(this, jediViewModel, jVar, uVar, mVar);
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
