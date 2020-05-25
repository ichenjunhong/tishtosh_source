package com.p683ss.android.ugc.gamora.recorder.p2473g;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AlphaAnimation;
import com.bytedance.als.C2763g;
import com.bytedance.als.C2766j;
import com.bytedance.als.C2767k;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
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
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.views.AutoRTLImageView;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p069b.C1690c;
import p2628d.C52847n;
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
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.recorder.g.e */
public final class C49816e extends C12924i implements C49548a {

    /* renamed from: m */
    public static final C49817a f124855m = new C49817a(null);

    /* renamed from: i */
    public AutoRTLImageView f124856i;

    /* renamed from: j */
    public final C52670a<C52860x> f124857j;

    /* renamed from: k */
    public final C2766j<Drawable> f124858k;

    /* renamed from: l */
    public final C2766j<C52847n<Float, Float>> f124859l;

    /* renamed from: n */
    private final C2763g<Boolean> f124860n;

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.e$a */
    public static final class C49817a {
        private C49817a() {
        }

        public /* synthetic */ C49817a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.e$b */
    static final class C49818b<T> implements C2767k<Drawable> {

        /* renamed from: a */
        final /* synthetic */ C49816e f124861a;

        C49818b(C49816e eVar) {
            this.f124861a = eVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Drawable drawable = (Drawable) obj;
            if (drawable != null) {
                C49816e.m107439a(this.f124861a).setImageDrawable(drawable);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.e$c */
    static final class C49819c<T> implements C2767k<C52847n<? extends Float, ? extends Float>> {

        /* renamed from: a */
        final /* synthetic */ C49816e f124862a;

        C49819c(C49816e eVar) {
            this.f124862a = eVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C52847n nVar = (C52847n) obj;
            if (nVar != null) {
                C9432q.m18686a((View) C49816e.m107439a(this.f124862a));
                AlphaAnimation alphaAnimation = new AlphaAnimation(((Number) nVar.getFirst()).floatValue(), ((Number) nVar.getSecond()).floatValue());
                alphaAnimation.setDuration(150);
                C49816e.m107439a(this.f124862a).startAnimation(alphaAnimation);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.e$d */
    static final class C49820d<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49816e f124863a;

        C49820d(C49816e eVar) {
            this.f124863a = eVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            LayoutParams layoutParams = C49816e.m107439a(this.f124863a).getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                Activity activity = this.f124863a.f33840g_;
                if (activity == null) {
                    C52711k.m112234a();
                }
                marginLayoutParams.topMargin = C43303dy.m94972c(activity) + this.f124863a.mo24478w().getDimensionPixelSize(R.dimen.lz);
                C49816e.m107439a(this.f124863a).setLayoutParams(marginLayoutParams);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g.e$e */
    static final class C49821e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49816e f124864a;

        C49821e(C49816e eVar) {
            this.f124864a = eVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f124864a.f124857j.invoke();
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
    public static final /* synthetic */ AutoRTLImageView m107439a(C49816e eVar) {
        AutoRTLImageView autoRTLImageView = eVar.f124856i;
        if (autoRTLImageView == null) {
            C52711k.m112237a("closeRecordView");
        }
        return autoRTLImageView;
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        View j_ = mo24467j_(R.id.ary);
        C52711k.m112236a((Object) j_, "requireViewById(R.id.img_close_record)");
        this.f124856i = (AutoRTLImageView) j_;
        C0184k kVar = this;
        this.f124858k.mo7352a(kVar, new C49818b(this));
        this.f124859l.mo7352a(kVar, new C49819c(this));
        this.f124860n.mo7352a(kVar, new C49820d(this));
        AutoRTLImageView autoRTLImageView = this.f124856i;
        if (autoRTLImageView == null) {
            C52711k.m112237a("closeRecordView");
        }
        autoRTLImageView.setOnClickListener(new C49821e(this));
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
        View inflate = layoutInflater.inflate(R.layout.aef, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…d_exit, container, false)");
        return inflate;
    }

    /* renamed from: a */
    public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106919a(this, jediViewModel, uVar, mVar);
    }

    public C49816e(C52670a<C52860x> aVar, C2766j<Drawable> jVar, C2766j<C52847n<Float, Float>> jVar2, C2763g<Boolean> gVar) {
        C52711k.m112240b(aVar, "exitRecord");
        C52711k.m112240b(jVar, "exitDrawable");
        C52711k.m112240b(jVar2, "closeAlphaAnim");
        C52711k.m112240b(gVar, "enableTopMarginEvent");
        this.f124857j = aVar;
        this.f124858k = jVar;
        this.f124859l = jVar2;
        this.f124860n = gVar;
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
