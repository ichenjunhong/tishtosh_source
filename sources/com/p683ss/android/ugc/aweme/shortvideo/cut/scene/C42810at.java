package com.p683ss.android.ugc.aweme.shortvideo.cut.scene;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
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
import com.p683ss.android.ugc.aweme.record.DMTBgAnimRadioGroup;
import com.p683ss.android.ugc.aweme.record.DMTBgAnimRadioGroup.C41150b;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42652k;
import com.p683ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.C43518e;
import com.p683ss.android.ugc.aweme.tools.C47339t;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2458b.C48925b;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.at */
public final class C42810at extends C48925b implements C49548a {

    /* renamed from: n */
    public static final C42811a f108241n = new C42811a(null);

    /* renamed from: i */
    public C42873bn f108242i;

    /* renamed from: j */
    public DMTBgAnimRadioGroup f108243j;

    /* renamed from: k */
    public boolean f108244k = true;

    /* renamed from: l */
    public CutMultiVideoViewModel f108245l;

    /* renamed from: m */
    CutVideoViewModel f108246m;

    /* renamed from: o */
    private CutVideoSpeedViewModel f108247o;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.at$a */
    public static final class C42811a {
        private C42811a() {
        }

        public /* synthetic */ C42811a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.at$b */
    static final class C42812b extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42810at f108248a;

        C42812b(C42810at atVar) {
            this.f108248a = atVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            this.f108248a.f108244k = booleanValue;
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.at$c */
    static final class C42813c extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42810at f108249a;

        C42813c(C42810at atVar) {
            this.f108249a = atVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i;
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            if (booleanValue) {
                C42810at atVar = this.f108249a;
                DMTBgAnimRadioGroup dMTBgAnimRadioGroup = atVar.f108243j;
                if (dMTBgAnimRadioGroup == null) {
                    C52711k.m112237a("speedView");
                }
                LayoutParams layoutParams = dMTBgAnimRadioGroup.getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    CutVideoViewModel cutVideoViewModel = atVar.f108246m;
                    if (cutVideoViewModel == null) {
                        C52711k.m112237a("cutVideoViewModel");
                    }
                    if (cutVideoViewModel.mo87178g()) {
                        C42873bn bnVar = atVar.f108242i;
                        if (bnVar == null) {
                            C52711k.m112237a("previewEditCallback");
                        }
                        int Q = bnVar.mo87244Q();
                        Activity v = atVar.mo24477v();
                        C52711k.m112236a((Object) v, "requireActivity()");
                        layoutParams2.bottomMargin = ((Q - ((int) C43518e.m95450a(v, 32.0f))) / 2) + atVar.mo24478w().getDimensionPixelSize(R.dimen.l2);
                    } else {
                        Activity v2 = atVar.mo24477v();
                        C52711k.m112236a((Object) v2, "requireActivity()");
                        layoutParams2.bottomMargin = (int) C43518e.m95450a(v2, 163.0f);
                        Activity v3 = atVar.mo24477v();
                        C52711k.m112236a((Object) v3, "requireActivity()");
                        layoutParams2.leftMargin = (int) C43518e.m95450a(v3, 32.5f);
                        Activity v4 = atVar.mo24477v();
                        C52711k.m112236a((Object) v4, "requireActivity()");
                        layoutParams2.rightMargin = (int) C43518e.m95450a(v4, 32.5f);
                    }
                    DMTBgAnimRadioGroup dMTBgAnimRadioGroup2 = atVar.f108243j;
                    if (dMTBgAnimRadioGroup2 == null) {
                        C52711k.m112237a("speedView");
                    }
                    dMTBgAnimRadioGroup2.setLayoutParams(layoutParams2);
                    DMTBgAnimRadioGroup a = C42810at.m93909a(this.f108249a);
                    C42873bn bnVar2 = this.f108249a.f108242i;
                    if (bnVar2 == null) {
                        C52711k.m112237a("previewEditCallback");
                    }
                    C47339t a2 = C42652k.m93581a(bnVar2.mo87245R().getCurrentSpeed());
                    C52711k.m112236a((Object) a2, "MVConfig.fromValue(previ…oEditView().currentSpeed)");
                    a.setCurrentItem(C42810at.m93908a(a2));
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
            }
            DMTBgAnimRadioGroup a3 = C42810at.m93909a(this.f108249a);
            if (booleanValue) {
                i = 0;
            } else {
                i = 8;
            }
            a3.setVisibility(i);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.at$d */
    static final class C42814d<T> implements C0199s<Float> {

        /* renamed from: a */
        final /* synthetic */ C42810at f108250a;

        C42814d(C42810at atVar) {
            this.f108250a = atVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Float f = (Float) obj;
            if (f != null) {
                View view = this.f108250a.f33834b;
                C52711k.m112236a((Object) view, "view");
                C52711k.m112236a((Object) f, "it");
                view.setAlpha(f.floatValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.at$e */
    static final class C42815e<T> implements C0199s<C47339t> {

        /* renamed from: a */
        final /* synthetic */ C42810at f108251a;

        C42815e(C42810at atVar) {
            this.f108251a = atVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C47339t tVar = (C47339t) obj;
            if (tVar != null) {
                DMTBgAnimRadioGroup a = C42810at.m93909a(this.f108251a);
                C52711k.m112236a((Object) tVar, "it");
                a.setCurrentItem(C42810at.m93908a(tVar));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.at$f */
    public static final class C42816f implements C41150b {

        /* renamed from: a */
        final /* synthetic */ C42810at f108252a;

        C42816f(C42810at atVar) {
            this.f108252a = atVar;
        }

        /* renamed from: a */
        public final void mo83691a(int i) {
            C47339t tVar;
            if (this.f108252a.f108244k) {
                CutMultiVideoViewModel cutMultiVideoViewModel = this.f108252a.f108245l;
                if (cutMultiVideoViewModel == null) {
                    C52711k.m112237a("cutMultiVideoViewModel");
                }
                switch (i) {
                    case 0:
                        tVar = C47339t.SLOW;
                        break;
                    case 1:
                        tVar = C47339t.NORMAL;
                        break;
                    case 2:
                        tVar = C47339t.FAST;
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("unknown view: ");
                        sb.append(i);
                        throw new IllegalArgumentException(sb.toString());
                }
                cutMultiVideoViewModel.mo86796a(tVar.value());
            }
        }
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
        this.f108243j = (DMTBgAnimRadioGroup) view;
        DMTBgAnimRadioGroup dMTBgAnimRadioGroup = this.f108243j;
        if (dMTBgAnimRadioGroup == null) {
            C52711k.m112237a("speedView");
        }
        String a = mo24461a((int) R.string.dkl);
        C52711k.m112236a((Object) a, "getString(R.string.slow)");
        dMTBgAnimRadioGroup.mo83678a(a);
        String a2 = mo24461a((int) R.string.dpz);
        C52711k.m112236a((Object) a2, "getString(R.string.standard)");
        dMTBgAnimRadioGroup.mo83678a(a2);
        String a3 = mo24461a((int) R.string.b0z);
        C52711k.m112236a((Object) a3, "getString(R.string.fast)");
        dMTBgAnimRadioGroup.mo83678a(a3);
        DMTBgAnimRadioGroup dMTBgAnimRadioGroup2 = this.f108243j;
        if (dMTBgAnimRadioGroup2 == null) {
            C52711k.m112237a("speedView");
        }
        dMTBgAnimRadioGroup2.setCurrentItem(1);
        DMTBgAnimRadioGroup dMTBgAnimRadioGroup3 = this.f108243j;
        if (dMTBgAnimRadioGroup3 == null) {
            C52711k.m112237a("speedView");
        }
        dMTBgAnimRadioGroup3.setOnItemChangeListener(new C42816f(this));
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

    /* renamed from: a */
    public static final /* synthetic */ DMTBgAnimRadioGroup m93909a(C42810at atVar) {
        DMTBgAnimRadioGroup dMTBgAnimRadioGroup = atVar.f108243j;
        if (dMTBgAnimRadioGroup == null) {
            C52711k.m112237a("speedView");
        }
        return dMTBgAnimRadioGroup;
    }

    /* renamed from: a */
    public static int m93908a(C47339t tVar) {
        switch (C42817au.f108253a[tVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            default:
                return -1;
        }
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            C0209x a = C0214z.m440a((FragmentActivity) activity).mo359a(CutMultiVideoViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…deoViewModel::class.java]");
            this.f108245l = (CutMultiVideoViewModel) a;
            Activity activity2 = this.f33840g_;
            if (activity2 != null) {
                JediViewModel a2 = C48927d.m105736a((FragmentActivity) activity2).mo96760a(CutVideoSpeedViewModel.class);
                C52711k.m112236a((Object) a2, "JediViewModelProviders.o…eedViewModel::class.java]");
                this.f108247o = (CutVideoSpeedViewModel) a2;
                Activity activity3 = this.f33840g_;
                if (activity3 != null) {
                    JediViewModel a3 = C48927d.m105736a((FragmentActivity) activity3).mo96760a(CutVideoViewModel.class);
                    C52711k.m112236a((Object) a3, "JediViewModelProviders.o…deoViewModel::class.java)");
                    this.f108246m = (CutVideoViewModel) a3;
                    CutVideoSpeedViewModel cutVideoSpeedViewModel = this.f108247o;
                    if (cutVideoSpeedViewModel == null) {
                        C52711k.m112237a("speedViewModel");
                    }
                    mo49443b(cutVideoSpeedViewModel, C42818av.f108254a, new C11934u(), new C42812b(this));
                    CutVideoSpeedViewModel cutVideoSpeedViewModel2 = this.f108247o;
                    if (cutVideoSpeedViewModel2 == null) {
                        C52711k.m112237a("speedViewModel");
                    }
                    mo49443b(cutVideoSpeedViewModel2, C42819aw.f108255a, new C11934u(), new C42813c(this));
                    CutVideoSpeedViewModel cutVideoSpeedViewModel3 = this.f108247o;
                    if (cutVideoSpeedViewModel3 == null) {
                        C52711k.m112237a("speedViewModel");
                    }
                    C0184k kVar = this;
                    cutVideoSpeedViewModel3.mo87130f().observe(kVar, new C42814d(this));
                    CutVideoSpeedViewModel cutVideoSpeedViewModel4 = this.f108247o;
                    if (cutVideoSpeedViewModel4 == null) {
                        C52711k.m112237a("speedViewModel");
                    }
                    cutVideoSpeedViewModel4.mo87129e().observe(kVar, new C42815e(this));
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.br2, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…_speed, container, false)");
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
