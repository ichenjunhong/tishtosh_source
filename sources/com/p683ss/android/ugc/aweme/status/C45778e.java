package com.p683ss.android.ugc.aweme.status;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.airbnb.lottie.C2408e;
import com.airbnb.lottie.C2442f;
import com.airbnb.lottie.C2473i;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
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
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p069b.C1690c;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.status.e */
public final class C45778e extends C12924i implements OnClickListener, C49548a {

    /* renamed from: m */
    public static final C45779a f115688m = new C45779a(null);

    /* renamed from: i */
    public View f115689i;

    /* renamed from: j */
    public LottieAnimationView f115690j;

    /* renamed from: k */
    public boolean f115691k;

    /* renamed from: l */
    public FragmentActivity f115692l;

    /* renamed from: n */
    private final RecordStatusViewModel f115693n;

    /* renamed from: o */
    private final ShortVideoContext f115694o;

    /* renamed from: com.ss.android.ugc.aweme.status.e$a */
    public static final class C45779a {
        private C45779a() {
        }

        public /* synthetic */ C45779a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.e$b */
    static final class C45780b<T> implements C2473i<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C45778e f115695a;

        C45780b(C45778e eVar) {
            this.f115695a = eVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo6703a(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.e$c */
    static final class C45781c<T> implements C2473i<C2408e> {

        /* renamed from: a */
        final /* synthetic */ C45778e f115696a;

        C45781c(C45778e eVar) {
            this.f115696a = eVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo6703a(Object obj) {
            C2408e eVar = (C2408e) obj;
            C45778e.m99560a(this.f115696a).setVisibility(0);
            C45778e.m99561b(this.f115696a).setComposition(eVar);
            C45778e.m99561b(this.f115696a).mo6654b();
            this.f115696a.f115691k = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.e$d */
    static final class C45782d<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C45778e f115697a;

        C45782d(C45778e eVar) {
            this.f115697a = eVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (this.f115697a.f115691k) {
                if (bool == null || !bool.booleanValue()) {
                    C45778e.m99560a(this.f115697a).setVisibility(0);
                } else {
                    C45778e.m99560a(this.f115697a).setVisibility(8);
                }
            }
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
    public static final /* synthetic */ View m99560a(C45778e eVar) {
        View view = eVar.f115689i;
        if (view == null) {
            C52711k.m112237a("rootView");
        }
        return view;
    }

    /* renamed from: b */
    public static final /* synthetic */ LottieAnimationView m99561b(C45778e eVar) {
        LottieAnimationView lottieAnimationView = eVar.f115690j;
        if (lottieAnimationView == null) {
            C52711k.m112237a("lottieview");
        }
        return lottieAnimationView;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f115693n.mo92170o().setValue("shoot_icon");
        this.f115693n.mo92166k().setValue(Boolean.valueOf(true));
    }

    public C45778e(FragmentActivity fragmentActivity) {
        C52711k.m112240b(fragmentActivity, "fragmentActivity");
        this.f115692l = fragmentActivity;
        C0209x a = C0214z.m440a(this.f115692l).mo359a(RecordStatusViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(fr…tusViewModel::class.java)");
        this.f115693n = (RecordStatusViewModel) a;
        C0209x a2 = C0214z.m440a(this.f115692l).mo359a(ShortVideoContextViewModel.class);
        C52711k.m112236a((Object) a2, "ViewModelProviders.of(fr…extViewModel::class.java)");
        this.f115694o = ((ShortVideoContextViewModel) a2).f107134a;
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C49549a.m106924a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106919a(this, jediViewModel, uVar, mVar);
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.bk7, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…status, container, false)");
        this.f115689i = inflate;
        View view = this.f115689i;
        if (view == null) {
            C52711k.m112237a("rootView");
        }
        view.setOnClickListener(this);
        View view2 = this.f115689i;
        if (view2 == null) {
            C52711k.m112237a("rootView");
        }
        View findViewById = view2.findViewById(R.id.erj);
        C52711k.m112236a((Object) findViewById, "rootView.findViewById(R.id.record_pendant)");
        this.f115690j = (LottieAnimationView) findViewById;
        String e = C39618d.f101151O.mo83121e(C40796a.StatusLottieUrl);
        if (TextUtils.isEmpty(e) || this.f115694o.mo86365f() || this.f115694o.mo86366g() || this.f115694o.f107057aI) {
            View view3 = this.f115689i;
            if (view3 == null) {
                C52711k.m112237a("rootView");
            }
            view3.setVisibility(8);
            this.f115691k = false;
        } else if (!C45783f.m99580a(this.f115692l)) {
            View view4 = this.f115689i;
            if (view4 == null) {
                C52711k.m112237a("rootView");
            }
            view4.setVisibility(8);
            this.f115691k = false;
        } else {
            C2442f.m7134a((Context) this.f115692l, e).mo6874c(new C45780b(this)).mo6869a((C2473i<T>) new C45781c<T>(this));
        }
        this.f115693n.mo92167l().observe(this.f115692l, new C45782d(this));
        View view5 = this.f115689i;
        if (view5 == null) {
            C52711k.m112237a("rootView");
        }
        return view5;
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
