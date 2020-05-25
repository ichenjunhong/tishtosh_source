package com.p683ss.android.ugc.gamora.recorder.p2480n;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.als.C2763g;
import com.bytedance.als.C2767k;
import com.bytedance.common.utility.C9432q;
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
import com.p683ss.android.ugc.aweme.record.DMTBgAnimRadioGroup;
import com.p683ss.android.ugc.aweme.record.DMTBgAnimRadioGroup.C41150b;
import com.p683ss.android.ugc.aweme.shortvideo.C43225dr;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordNewActivity;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.tools.C47339t;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
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
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.recorder.n.b */
public final class C49907b extends C12924i implements C49548a {

    /* renamed from: i */
    public static final C49908a f125062i = new C49908a(null);

    /* renamed from: j */
    private C43225dr f125063j;

    /* renamed from: k */
    private DMTBgAnimRadioGroup f125064k;

    /* renamed from: l */
    private final C2763g<Boolean> f125065l;

    /* renamed from: com.ss.android.ugc.gamora.recorder.n.b$a */
    public static final class C49908a {
        private C49908a() {
        }

        public /* synthetic */ C49908a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.n.b$b */
    public static final class C49909b implements C41150b {

        /* renamed from: a */
        final /* synthetic */ C49907b f125066a;

        /* renamed from: b */
        final /* synthetic */ C45004a f125067b;

        /* renamed from: a */
        public final void mo83691a(int i) {
            C47339t tVar;
            C45004a aVar = this.f125067b;
            switch (i) {
                case 0:
                    tVar = C47339t.EPIC;
                    break;
                case 1:
                    tVar = C47339t.SLOW;
                    break;
                case 2:
                    tVar = C47339t.NORMAL;
                    break;
                case 3:
                    tVar = C47339t.FAST;
                    break;
                case 4:
                    tVar = C47339t.LAPSE;
                    break;
                default:
                    tVar = C47339t.NORMAL;
                    break;
            }
            aVar.mo91332a(tVar);
        }

        C49909b(C49907b bVar, C45004a aVar) {
            this.f125066a = bVar;
            this.f125067b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.n.b$c */
    static final class C49910c<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49907b f125068a;

        C49910c(C49907b bVar) {
            this.f125068a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Context t;
            float f;
            Boolean bool = (Boolean) obj;
            View view = this.f125068a.f33834b;
            C52711k.m112236a((Object) view, "view");
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                C52711k.m112236a((Object) bool, "it");
                if (bool.booleanValue()) {
                    t = this.f125068a.mo24474t();
                    f = 183.0f;
                } else {
                    t = this.f125068a.mo24474t();
                    f = 150.0f;
                }
                marginLayoutParams.bottomMargin = (int) C9432q.m18687b(t, f);
                View view2 = this.f125068a.f33834b;
                C52711k.m112236a((Object) view2, "view");
                view2.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
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

    public C49907b(C2763g<Boolean> gVar) {
        C52711k.m112240b(gVar, "relayoutEvent");
        this.f125065l = gVar;
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        int i;
        super.mo24448e(bundle);
        Object a = mo24460E().mo24560a("owner");
        if (a == null) {
            C52711k.m112234a();
        }
        this.f125063j = (C43225dr) a;
        View view = this.f33834b;
        if (view != null) {
            this.f125064k = (DMTBgAnimRadioGroup) view;
            DMTBgAnimRadioGroup dMTBgAnimRadioGroup = this.f125064k;
            if (dMTBgAnimRadioGroup == null) {
                C52711k.m112237a("speedRadioGroup");
            }
            String a2 = mo24461a((int) R.string.fas);
            C52711k.m112236a((Object) a2, "getString(R.string.very_slow_mt)");
            dMTBgAnimRadioGroup.mo83678a(a2);
            String a3 = mo24461a((int) R.string.dkm);
            C52711k.m112236a((Object) a3, "getString(R.string.slow_mt)");
            dMTBgAnimRadioGroup.mo83678a(a3);
            String a4 = mo24461a((int) R.string.dq0);
            C52711k.m112236a((Object) a4, "getString(R.string.standard_mt)");
            dMTBgAnimRadioGroup.mo83678a(a4);
            String a5 = mo24461a((int) R.string.b10);
            C52711k.m112236a((Object) a5, "getString(R.string.fast_mt)");
            dMTBgAnimRadioGroup.mo83678a(a5);
            String a6 = mo24461a((int) R.string.faq);
            C52711k.m112236a((Object) a6, "getString(R.string.very_fast_mt)");
            dMTBgAnimRadioGroup.mo83678a(a6);
            Activity activity = this.f33840g_;
            if (activity != null) {
                C45004a aVar = ((VideoRecordNewActivity) activity).f113766E;
                C52711k.m112236a((Object) aVar, "(activity as VideoRecordNewActivity).cameraApi");
                switch (C49911c.f125069a[aVar.mo91313S().ordinal()]) {
                    case 1:
                        i = 0;
                        break;
                    case 2:
                        i = 1;
                        break;
                    case 3:
                        i = 2;
                        break;
                    case 4:
                        i = 3;
                        break;
                    case 5:
                        i = 4;
                        break;
                    default:
                        i = -1;
                        break;
                }
                if (i != -1) {
                    DMTBgAnimRadioGroup dMTBgAnimRadioGroup2 = this.f125064k;
                    if (dMTBgAnimRadioGroup2 == null) {
                        C52711k.m112237a("speedRadioGroup");
                    }
                    dMTBgAnimRadioGroup2.setCurrentItem(i);
                } else {
                    DMTBgAnimRadioGroup dMTBgAnimRadioGroup3 = this.f125064k;
                    if (dMTBgAnimRadioGroup3 == null) {
                        C52711k.m112237a("speedRadioGroup");
                    }
                    dMTBgAnimRadioGroup3.setCurrentItem(2);
                }
                DMTBgAnimRadioGroup dMTBgAnimRadioGroup4 = this.f125064k;
                if (dMTBgAnimRadioGroup4 == null) {
                    C52711k.m112237a("speedRadioGroup");
                }
                dMTBgAnimRadioGroup4.setOnItemChangeListener(new C49909b(this, aVar));
                this.f125065l.mo7352a(this, new C49910c(this));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.record.DMTBgAnimRadioGroup");
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
        View inflate = layoutInflater.inflate(R.layout.au2, viewGroup, false);
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
