package com.p683ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.p683ss.android.ugc.aweme.base.activity.C23441t;
import com.p683ss.android.ugc.aweme.infoSticker.C35584av;
import com.p683ss.android.ugc.aweme.infoSticker.C35606f.C35607a;
import com.p683ss.android.ugc.aweme.infoSticker.C35635v;
import com.p683ss.android.ugc.aweme.infoSticker.InfoStickerViewModel;
import com.p683ss.android.ugc.aweme.p2345t.C46779h;
import com.p683ss.android.ugc.aweme.utils.C47675ap;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.p683ss.android.ugc.tools.view.p2508a.C50207b;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p069b.C1690c;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.editor.bf */
public final class C49252bf extends C12924i implements C49548a {

    /* renamed from: k */
    public static final C49253a f123710k = new C49253a(null);

    /* renamed from: i */
    public C35635v f123711i;

    /* renamed from: j */
    C35607a f123712j;

    /* renamed from: l */
    private EditStickerPanelViewModel f123713l;

    /* renamed from: m */
    private EditViewModel f123714m;

    /* renamed from: com.ss.android.ugc.gamora.editor.bf$a */
    public static final class C49253a {
        private C49253a() {
        }

        public /* synthetic */ C49253a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bf$b */
    static final class C49254b extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49252bf f123715a;

        C49254b(C49252bf bfVar) {
            this.f123715a = bfVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            if (booleanValue) {
                C49252bf.m106281a(this.f123715a).mo74043a();
            } else {
                C49252bf.m106281a(this.f123715a).mo74046b();
            }
            return C52860x.f131107a;
        }
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
        C35635v vVar = this.f123711i;
        if (vVar == null) {
            C52711k.m112237a("stickerModule");
        }
        vVar.mo74047c();
    }

    /* renamed from: a */
    public static final /* synthetic */ C35635v m106281a(C49252bf bfVar) {
        C35635v vVar = bfVar.f123711i;
        if (vVar == null) {
            C52711k.m112237a("stickerModule");
        }
        return vVar;
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            JediViewModel a = C48927d.m105736a(fragmentActivity).mo96760a(EditViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java)");
            this.f123714m = (EditViewModel) a;
            JediViewModel a2 = C48927d.m105736a(fragmentActivity).mo96760a(EditStickerPanelViewModel.class);
            C52711k.m112236a((Object) a2, "JediViewModelProviders.o…nelViewModel::class.java)");
            this.f123713l = (EditStickerPanelViewModel) a2;
            Activity activity2 = this.f33840g_;
            C50207b bVar = null;
            if (!(activity2 instanceof C23441t)) {
                activity2 = null;
            }
            C23441t tVar = (C23441t) activity2;
            if (tVar != null) {
                bVar = C47675ap.m103188a(tVar);
            }
            C35584av a3 = C46779h.m101583a();
            View view = this.f33834b;
            if (view != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                EditViewModel editViewModel = this.f123714m;
                if (editViewModel == null) {
                    C52711k.m112237a("mEditViewModel");
                }
                C35635v vVar = new C35635v(fragmentActivity, bVar, a3, frameLayout, editViewModel.mo97035e());
                vVar.mo74044a(this.f123712j);
                this.f123711i = vVar;
                InfoStickerViewModel a4 = C35635v.m80462a(fragmentActivity);
                C52711k.m112236a((Object) a4, "obtainViewModel(fragmentActivity)");
                EditViewModel editViewModel2 = this.f123714m;
                if (editViewModel2 == null) {
                    C52711k.m112237a("mEditViewModel");
                }
                a4.f91355c = editViewModel2.mo97035e();
                EditStickerPanelViewModel editStickerPanelViewModel = this.f123713l;
                if (editStickerPanelViewModel == null) {
                    C52711k.m112237a("mEditStickerPanelViewModel");
                }
                mo49444c(editStickerPanelViewModel, C49255bg.f123716a, new C11934u(), new C49254b(this));
                C35635v.m80462a(fragmentActivity).mo73932a("infostickerv2");
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout");
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
        View inflate = layoutInflater.inflate(R.layout.ae4, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…_panel, container, false)");
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
