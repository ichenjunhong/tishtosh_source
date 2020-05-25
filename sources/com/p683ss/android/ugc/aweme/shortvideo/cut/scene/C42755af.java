package com.p683ss.android.ugc.aweme.shortvideo.cut.scene;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
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
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43015c;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43047h;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2183c.C43018b;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointModeChangeView;
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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.af */
public final class C42755af extends C48925b implements C49548a {

    /* renamed from: m */
    public static final C42756a f108135m = new C42756a(null);

    /* renamed from: i */
    public C42820ax f108136i;

    /* renamed from: j */
    public C43018b f108137j;

    /* renamed from: k */
    public StickPointModeChangeView f108138k;

    /* renamed from: l */
    public CutVideoMultiModeViewModel f108139l;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.af$a */
    public static final class C42756a {
        private C42756a() {
        }

        public /* synthetic */ C42756a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.af$b */
    public static final class C42757b implements C43018b {

        /* renamed from: a */
        final /* synthetic */ C42755af f108140a;

        C42757b(C42755af afVar) {
            this.f108140a = afVar;
        }

        /* renamed from: a */
        public final void mo87220a(int i) {
            String str;
            if (C42755af.m93789a(this.f108140a).f108020d != i) {
                C42755af.m93789a(this.f108140a).f108020d = i;
                if (C42755af.m93789a(this.f108140a).f108020d == 1) {
                    CutVideoMultiModeViewModel a = C42755af.m93789a(this.f108140a);
                    Activity activity = this.f108140a.f33840g_;
                    if (activity != null) {
                        a.mo87094b((FragmentActivity) activity, false);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                    }
                } else {
                    CutVideoMultiModeViewModel a2 = C42755af.m93789a(this.f108140a);
                    Activity activity2 = this.f108140a.f33840g_;
                    if (activity2 != null) {
                        a2.mo87092a((FragmentActivity) activity2, false);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                    }
                }
                C43018b bVar = this.f108140a.f108137j;
                if (bVar != null) {
                    bVar.mo87220a(i);
                }
                C43047h hVar = C43047h.f108667g;
                boolean e = C42755af.m93789a(this.f108140a).mo87096e();
                String str2 = "change_sync_mode";
                C23089d a3 = C43047h.m94328a();
                String str3 = "to_status";
                if (e) {
                    str = "sync_on";
                } else {
                    str = "sync_off";
                }
                C26890h.m65011a(str2, a3.mo47829a(str3, str).f61491a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.af$c */
    static final class C42758c extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42755af f108141a;

        C42758c(C42755af afVar) {
            this.f108141a = afVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            if (booleanValue) {
                C43015c.m94256a(this.f108141a.mo87227F());
            } else {
                this.f108141a.mo87227F().setVisibility(0);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.af$d */
    static final class C42759d extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42755af f108142a;

        C42759d(C42755af afVar) {
            this.f108142a = afVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            if (booleanValue) {
                C43015c.m94257a(this.f108142a.mo87227F(), true);
            } else {
                this.f108142a.mo87227F().setVisibility(8);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final void mo24463a(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.mo24463a(view, bundle);
        View j_ = mo24467j_(R.id.bmt);
        C52711k.m112236a((Object) j_, "requireViewById(R.id.mode_view)");
        this.f108138k = (StickPointModeChangeView) j_;
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

    /* renamed from: F */
    public final StickPointModeChangeView mo87227F() {
        StickPointModeChangeView stickPointModeChangeView = this.f108138k;
        if (stickPointModeChangeView == null) {
            C52711k.m112237a("modelChangeView");
        }
        return stickPointModeChangeView;
    }

    /* renamed from: a */
    public static final /* synthetic */ CutVideoMultiModeViewModel m93789a(C42755af afVar) {
        CutVideoMultiModeViewModel cutVideoMultiModeViewModel = afVar.f108139l;
        if (cutVideoMultiModeViewModel == null) {
            C52711k.m112237a("multiModelViewModel");
        }
        return cutVideoMultiModeViewModel;
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            JediViewModel a = C48927d.m105736a((FragmentActivity) activity).mo96760a(CutVideoMultiModeViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…odeViewModel::class.java)");
            this.f108139l = (CutVideoMultiModeViewModel) a;
            StickPointModeChangeView stickPointModeChangeView = this.f108138k;
            if (stickPointModeChangeView == null) {
                C52711k.m112237a("modelChangeView");
            }
            stickPointModeChangeView.setStickPointModeChangeListener(new C42757b(this));
            CutVideoMultiModeViewModel cutVideoMultiModeViewModel = this.f108139l;
            if (cutVideoMultiModeViewModel == null) {
                C52711k.m112237a("multiModelViewModel");
            }
            mo49444c(cutVideoMultiModeViewModel, C42760ag.f108143a, new C11934u(), new C42758c(this));
            CutVideoMultiModeViewModel cutVideoMultiModeViewModel2 = this.f108139l;
            if (cutVideoMultiModeViewModel2 == null) {
                C52711k.m112237a("multiModelViewModel");
            }
            mo49444c(cutVideoMultiModeViewModel2, C42761ah.f108144a, new C11934u(), new C42759d(this));
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
        View inflate = layoutInflater.inflate(R.layout.bqx, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…i_mode, container, false)");
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
