package com.p683ss.android.ugc.aweme.shortvideo.cut.scene;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0726c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
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
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45412b;
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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bh */
public final class C42858bh extends C48925b implements C49548a {

    /* renamed from: l */
    public static final C42859a f108337l = new C42859a(null);

    /* renamed from: i */
    public ImageView f108338i;

    /* renamed from: j */
    public TextView f108339j;

    /* renamed from: k */
    public CutVideoViewModel f108340k;

    /* renamed from: m */
    private CutVideoTitleBarViewModel f108341m;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bh$a */
    public static final class C42859a {
        private C42859a() {
        }

        public /* synthetic */ C42859a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bh$b */
    static final class C42860b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42858bh f108342a;

        C42860b(C42858bh bhVar) {
            this.f108342a = bhVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C42858bh.m94049c(this.f108342a).mo87176e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bh$c */
    static final class C42861c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42858bh f108343a;

        C42861c(C42858bh bhVar) {
            this.f108343a = bhVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C45412b.m98979a().start("av_video_edit", "click onNext btn");
            C42858bh.m94049c(this.f108343a).mo22530c(C42728a.f108053a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bh$d */
    static final class C42862d extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42858bh f108344a;

        C42862d(C42858bh bhVar) {
            this.f108344a = bhVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            final boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            float f = 1.0f;
            float f2 = 0.0f;
            if (booleanValue) {
                f = 0.0f;
                f2 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f108344a.f33834b, "alpha", new float[]{f, f2});
            C52711k.m112236a((Object) ofFloat, "objectAnimator");
            ofFloat.setDuration(200);
            ofFloat.addListener(new AnimatorListenerAdapter(this) {

                /* renamed from: a */
                final /* synthetic */ C42862d f108345a;

                public final void onAnimationEnd(Animator animator) {
                    C52711k.m112240b(animator, "animation");
                    super.onAnimationEnd(animator);
                    if (booleanValue) {
                        View view = this.f108345a.f108344a.f33834b;
                        if (view != null) {
                            view.setVisibility(0);
                        }
                        return;
                    }
                    View view2 = this.f108345a.f108344a.f33834b;
                    if (view2 != null) {
                        view2.setVisibility(4);
                    }
                }

                {
                    this.f108345a = r1;
                }
            });
            ofFloat.start();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bh$e */
    static final class C42864e extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42858bh f108347a;

        C42864e(C42858bh bhVar) {
            this.f108347a = bhVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i;
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            ImageView a = C42858bh.m94047a(this.f108347a);
            if (booleanValue) {
                i = 0;
            } else {
                i = 4;
            }
            a.setVisibility(i);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bh$f */
    static final class C42865f extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42858bh f108348a;

        C42865f(C42858bh bhVar) {
            this.f108348a = bhVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i;
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            TextView b = C42858bh.m94048b(this.f108348a);
            if (booleanValue) {
                i = 0;
            } else {
                i = 4;
            }
            b.setVisibility(i);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bh$g */
    static final class C42866g extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42858bh f108349a;

        C42866g(C42858bh bhVar) {
            this.f108349a = bhVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            C42858bh.m94047a(this.f108349a).setEnabled(booleanValue);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bh$h */
    static final class C42867h extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42858bh f108350a;

        C42867h(C42858bh bhVar) {
            this.f108350a = bhVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            C42858bh.m94048b(this.f108350a).setEnabled(booleanValue);
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final void mo24463a(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.mo24463a(view, bundle);
        View j_ = mo24467j_(R.id.axj);
        C52711k.m112236a((Object) j_, "requireViewById(R.id.ivBack)");
        this.f108338i = (ImageView) j_;
        View j_2 = mo24467j_(R.id.d6b);
        C52711k.m112236a((Object) j_2, "requireViewById(R.id.tvNext)");
        this.f108339j = (TextView) j_2;
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
    public static final /* synthetic */ ImageView m94047a(C42858bh bhVar) {
        ImageView imageView = bhVar.f108338i;
        if (imageView == null) {
            C52711k.m112237a("ivBack");
        }
        return imageView;
    }

    /* renamed from: b */
    public static final /* synthetic */ TextView m94048b(C42858bh bhVar) {
        TextView textView = bhVar.f108339j;
        if (textView == null) {
            C52711k.m112237a("tvNext");
        }
        return textView;
    }

    /* renamed from: c */
    public static final /* synthetic */ CutVideoViewModel m94049c(C42858bh bhVar) {
        CutVideoViewModel cutVideoViewModel = bhVar.f108340k;
        if (cutVideoViewModel == null) {
            C52711k.m112237a("cutVideoViewModel");
        }
        return cutVideoViewModel;
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            JediViewModel a = C48927d.m105736a((FragmentActivity) activity).mo96760a(CutVideoViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…deoViewModel::class.java)");
            this.f108340k = (CutVideoViewModel) a;
            Activity activity2 = this.f33840g_;
            if (activity2 != null) {
                JediViewModel a2 = C48927d.m105736a((FragmentActivity) activity2).mo96760a(CutVideoTitleBarViewModel.class);
                C52711k.m112236a((Object) a2, "JediViewModelProviders.o…BarViewModel::class.java)");
                this.f108341m = (CutVideoTitleBarViewModel) a2;
                CutVideoViewModel cutVideoViewModel = this.f108340k;
                if (cutVideoViewModel == null) {
                    C52711k.m112237a("cutVideoViewModel");
                }
                if (cutVideoViewModel.mo87177f().f108060c) {
                    Activity activity3 = this.f33840g_;
                    if (activity3 == null) {
                        C52711k.m112234a();
                    }
                    int c = C0726c.m2098c(activity3, R.color.a7x);
                    TextView textView = this.f108339j;
                    if (textView == null) {
                        C52711k.m112237a("tvNext");
                    }
                    textView.setBackgroundResource(R.drawable.rb);
                    TextView textView2 = this.f108339j;
                    if (textView2 == null) {
                        C52711k.m112237a("tvNext");
                    }
                    textView2.setTextColor(c);
                }
                CutVideoViewModel cutVideoViewModel2 = this.f108340k;
                if (cutVideoViewModel2 == null) {
                    C52711k.m112237a("cutVideoViewModel");
                }
                if (!cutVideoViewModel2.mo87178g()) {
                    View view = this.f33834b;
                    C52711k.m112236a((Object) view, "view");
                    LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                        layoutParams2.topMargin = ((int) C9432q.m18687b((Context) this.f33840g_, 25.0f)) + C43303dy.m94972c(this.f33840g_);
                        View view2 = this.f33834b;
                        C52711k.m112236a((Object) view2, "view");
                        view2.setLayoutParams(layoutParams2);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    }
                } else {
                    View view3 = this.f33834b;
                    C52711k.m112236a((Object) view3, "layoutTop");
                    if (view3.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                        LayoutParams layoutParams3 = view3.getLayoutParams();
                        if (layoutParams3 != null) {
                            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                            layoutParams4.topMargin = C43303dy.m94972c(this.f33840g_);
                            view3.setLayoutParams(layoutParams4);
                        } else {
                            throw new C52857u("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        }
                    } else if (view3.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                        LayoutParams layoutParams5 = view3.getLayoutParams();
                        if (layoutParams5 != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
                            layoutParams6.topMargin = C43303dy.m94972c(this.f33840g_);
                            view3.setLayoutParams(layoutParams6);
                        } else {
                            throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        }
                    }
                }
                CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.f108341m;
                if (cutVideoTitleBarViewModel == null) {
                    C52711k.m112237a("titleBarViewModel");
                }
                mo49443b(cutVideoTitleBarViewModel, C42868bi.f108351a, new C11934u(), new C42864e(this));
                CutVideoTitleBarViewModel cutVideoTitleBarViewModel2 = this.f108341m;
                if (cutVideoTitleBarViewModel2 == null) {
                    C52711k.m112237a("titleBarViewModel");
                }
                mo49443b(cutVideoTitleBarViewModel2, C42869bj.f108352a, new C11934u(), new C42865f(this));
                CutVideoTitleBarViewModel cutVideoTitleBarViewModel3 = this.f108341m;
                if (cutVideoTitleBarViewModel3 == null) {
                    C52711k.m112237a("titleBarViewModel");
                }
                mo49443b(cutVideoTitleBarViewModel3, C42870bk.f108353a, new C11934u(), new C42866g(this));
                CutVideoTitleBarViewModel cutVideoTitleBarViewModel4 = this.f108341m;
                if (cutVideoTitleBarViewModel4 == null) {
                    C52711k.m112237a("titleBarViewModel");
                }
                mo49443b(cutVideoTitleBarViewModel4, C42871bl.f108354a, new C11934u(), new C42867h(this));
                CutVideoTitleBarViewModel cutVideoTitleBarViewModel5 = this.f108341m;
                if (cutVideoTitleBarViewModel5 == null) {
                    C52711k.m112237a("titleBarViewModel");
                }
                mo49444c(cutVideoTitleBarViewModel5, C42872bm.f108355a, new C11934u(), new C42862d(this));
                ImageView imageView = this.f108338i;
                if (imageView == null) {
                    C52711k.m112237a("ivBack");
                }
                imageView.setOnClickListener(new C42860b(this));
                TextView textView3 = this.f108339j;
                if (textView3 == null) {
                    C52711k.m112237a("tvNext");
                }
                textView3.setOnClickListener(new C42861c(this));
                return;
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
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.br5, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…tlebar, container, false)");
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
