package com.p683ss.android.ugc.gamora.recorder.p2476j;

import android.arch.lifecycle.C0184k;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.bytedance.als.C2763g;
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
import com.p683ss.android.ugc.aweme.adaptation.C22452a;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
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

/* renamed from: com.ss.android.ugc.gamora.recorder.j.c */
public final class C49845c extends C12924i implements C49548a {

    /* renamed from: k */
    public static final C49846a f124915k = new C49846a(null);

    /* renamed from: i */
    public RelativeLayout f124916i;

    /* renamed from: j */
    public RelativeLayout f124917j;

    /* renamed from: l */
    private final C2763g<Boolean> f124918l;

    /* renamed from: m */
    private final C2763g<Boolean> f124919m;

    /* renamed from: n */
    private final C2763g<Boolean> f124920n;

    /* renamed from: com.ss.android.ugc.gamora.recorder.j.c$a */
    public static final class C49846a {
        private C49846a() {
        }

        public /* synthetic */ C49846a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.j.c$b */
    static final class C49847b<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49845c f124921a;

        C49847b(C49845c cVar) {
            this.f124921a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            LayoutParams layoutParams = C49845c.m107522a(this.f124921a).getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                C52711k.m112236a((Object) bool, "it");
                if (bool.booleanValue()) {
                    i = C43303dy.m94972c(this.f124921a.mo24477v());
                } else {
                    i = 0;
                }
                layoutParams2.topMargin = i;
                C49845c.m107522a(this.f124921a).setLayoutParams(layoutParams2);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.j.c$c */
    static final class C49848c<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49845c f124922a;

        C49848c(C49845c cVar) {
            this.f124922a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            LayoutParams layoutParams = C49845c.m107523b(this.f124922a).getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                C52711k.m112236a((Object) bool, "it");
                if (bool.booleanValue()) {
                    i = C22452a.m55497c();
                } else {
                    i = 0;
                }
                layoutParams2.bottomMargin = i;
                C49845c.m107523b(this.f124922a).setLayoutParams(layoutParams2);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.j.c$d */
    static final class C49849d<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49845c f124923a;

        C49849d(C49845c cVar) {
            this.f124923a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            RelativeLayout a = C49845c.m107522a(this.f124923a);
            C52711k.m112236a((Object) bool, "it");
            int i2 = 4;
            if (bool.booleanValue()) {
                i = 0;
            } else {
                i = 4;
            }
            a.setVisibility(i);
            RelativeLayout b = C49845c.m107523b(this.f124923a);
            if (bool.booleanValue()) {
                i2 = 0;
            }
            b.setVisibility(i2);
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

    /* renamed from: a */
    public static final /* synthetic */ RelativeLayout m107522a(C49845c cVar) {
        RelativeLayout relativeLayout = cVar.f124917j;
        if (relativeLayout == null) {
            C52711k.m112237a("cornersTop");
        }
        return relativeLayout;
    }

    /* renamed from: b */
    public static final /* synthetic */ RelativeLayout m107523b(C49845c cVar) {
        RelativeLayout relativeLayout = cVar.f124916i;
        if (relativeLayout == null) {
            C52711k.m112237a("cornersBottom");
        }
        return relativeLayout;
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        View j_ = mo24467j_(R.id.a0w);
        C52711k.m112236a((Object) j_, "requireViewById(R.id.corners_top)");
        this.f124917j = (RelativeLayout) j_;
        View j_2 = mo24467j_(R.id.a0v);
        C52711k.m112236a((Object) j_2, "requireViewById(R.id.corners_bottom)");
        this.f124916i = (RelativeLayout) j_2;
        RelativeLayout relativeLayout = this.f124917j;
        if (relativeLayout == null) {
            C52711k.m112237a("cornersTop");
        }
        relativeLayout.setVisibility(0);
        RelativeLayout relativeLayout2 = this.f124916i;
        if (relativeLayout2 == null) {
            C52711k.m112237a("cornersBottom");
        }
        relativeLayout2.setVisibility(0);
        C0184k kVar = this;
        this.f124919m.mo7352a(kVar, new C49847b(this));
        this.f124920n.mo7352a(kVar, new C49848c(this));
        this.f124918l.mo7352a(kVar, new C49849d(this));
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C49549a.m106924a(this, vm1, bVar);
    }

    public C49845c(C2763g<Boolean> gVar, C2763g<Boolean> gVar2, C2763g<Boolean> gVar3) {
        C52711k.m112240b(gVar, "showCorner");
        C52711k.m112240b(gVar2, "enableTopMarginEvent");
        C52711k.m112240b(gVar3, "relayoutEvent");
        this.f124918l = gVar;
        this.f124919m = gVar2;
        this.f124920n = gVar3;
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.atx, viewGroup, false);
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
