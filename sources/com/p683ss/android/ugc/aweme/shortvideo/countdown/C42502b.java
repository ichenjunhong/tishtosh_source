package com.p683ss.android.ugc.aweme.shortvideo.countdown;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.als.C2759d;
import com.bytedance.als.C2762f;
import com.bytedance.als.C2764h;
import com.bytedance.als.C2765i;
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
import com.bytedance.p780m.C12356a;
import com.bytedance.p780m.C12361b;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.group.C12896b;
import com.bytedance.scene.ktx.C12932b;
import com.bytedance.scene.navigation.C12942d;
import com.bytedance.scene.p837a.C12828a;
import com.bytedance.scene.p837a.C12837c;
import com.bytedance.scene.p837a.p838a.C12830b;
import com.bytedance.scene.p840b.C12861f.C12863a;
import com.p683ss.android.ugc.aweme.scene.C18998a;
import com.p683ss.android.ugc.aweme.shortvideo.C42562ct;
import com.p683ss.android.ugc.aweme.shortvideo.C43225dr;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2177b.C42443a;
import com.p683ss.android.ugc.aweme.shortvideo.p2203g.C43859a;
import com.p683ss.android.ugc.aweme.tools.C47336q;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.recorder.p2469f.C49676a;
import com.p683ss.android.ugc.gamora.recorder.p2469f.C49677b;
import com.p683ss.android.ugc.gamora.recorder.p2478l.C49860a;
import p064c.p065a.p069b.C1690c;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.b */
public final class C42502b extends C2764h<C42501a> implements C12356a, C42501a, C49548a {

    /* renamed from: a */
    public final C43859a f107485a = ((C43859a) mo23370j().mo23373a(C43859a.class, (String) null));

    /* renamed from: b */
    public final C49860a f107486b = ((C49860a) mo23370j().mo23373a(C49860a.class, (String) null));

    /* renamed from: c */
    final C2765i<Integer> f107487c = new C2765i<>();

    /* renamed from: d */
    public int f107488d;

    /* renamed from: e */
    public C12924i f107489e;

    /* renamed from: f */
    public final C49676a f107490f = new C42505b(this);

    /* renamed from: g */
    public final C12896b f107491g;

    /* renamed from: h */
    private final C2762f<Integer> f107492h = this.f107487c;

    /* renamed from: i */
    private final C12361b f107493i;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.b$a */
    public static final class C42503a extends C12830b {

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.b$a$a */
        static final class C42504a implements AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C12828a f107494a;

            C42504a(C12828a aVar) {
                this.f107494a = aVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C12828a aVar = this.f107494a;
                if (aVar == null) {
                    C52711k.m112234a();
                }
                View view = aVar.f33605b;
                C52711k.m112236a((Object) view, "fromInfo!!.mSceneView");
                C52711k.m112236a((Object) valueAnimator, "animation");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    view.setTranslationY(((Float) animatedValue).floatValue());
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Float");
            }
        }

        /* renamed from: b */
        public final Animator mo24301b(C12828a aVar, C12828a aVar2) {
            if (aVar == null) {
                return new AnimatorSet();
            }
            View view = aVar.f33605b;
            C52711k.m112236a((Object) view, "fromInfo!!.mSceneView");
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, (float) view.getMeasuredHeight()});
            ofFloat.addUpdateListener(new C42504a(aVar));
            C52711k.m112236a((Object) ofFloat, "valueAnimator");
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.setDuration(250);
            return ofFloat;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.b$b */
    public static final class C42505b implements C49676a {

        /* renamed from: a */
        final /* synthetic */ C42502b f107495a;

        /* renamed from: a */
        public final void mo86710a() {
            this.f107495a.mo86707a(false);
        }

        /* renamed from: d */
        private final ShortVideoContextViewModel m93366d() {
            C0209x a = C0214z.m440a(C12932b.m25979b(this.f107495a.f107491g)).mo359a(ShortVideoContextViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java)");
            return (ShortVideoContextViewModel) a;
        }

        /* renamed from: b */
        public final void mo86714b() {
            if (this.f107495a.f107491g.f33840g_ != null) {
                this.f107495a.f107486b.mo97696d(false);
                m93366d().mo86386a(true);
            }
        }

        /* renamed from: c */
        public final void mo86715c() {
            if (this.f107495a.f107491g.f33840g_ != null) {
                m93366d().mo86386a(false);
                Object a = this.f107495a.f107491g.mo24460E().mo24560a("owner");
                if (a == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a(a, "parentScene.scope.getSer…ootScene.OWNER_CONTEXT)!!");
                C43225dr drVar = (C43225dr) a;
                if (drVar != null) {
                    ((C42562ct) drVar).mo86791d().mo86534a(new C47336q(4));
                    C12924i iVar = this.f107495a.f107489e;
                    if (iVar != null) {
                        C12942d dVar = this.f107495a.f107491g.f33837e;
                        if (dVar != null) {
                            dVar.mo24529c(iVar);
                        } else {
                            return;
                        }
                    }
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.PlanC");
            }
        }

        C42505b(C42502b bVar) {
            this.f107495a = bVar;
        }

        /* renamed from: a */
        public final void mo86711a(int i) {
            C42502b bVar = this.f107495a;
            bVar.f107488d = i;
            bVar.f107487c.mo7350a(Integer.valueOf(i));
        }

        /* renamed from: a */
        public final void mo86712a(long j) {
            if (this.f107495a.f107491g.f33840g_ != null) {
                this.f107495a.f107485a.mo89395a(this.f107495a.f107488d);
                m93366d().mo86386a(false);
                m93366d().mo86384a(j);
            }
        }

        /* renamed from: a */
        public final void mo86713a(boolean z) {
            int i;
            C43225dr drVar = (C43225dr) this.f107495a.f107491g.mo24460E().mo24560a("owner");
            if (drVar != null) {
                C52711k.m112236a((Object) drVar, "parentScene.scope.getSer…                ?: return");
                if (drVar != null) {
                    C42443a d = ((C42562ct) drVar).mo86791d();
                    if (z) {
                        i = 0;
                    } else {
                        i = 4;
                    }
                    d.mo86534a(new C47336q(i));
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.PlanC");
            }
        }
    }

    /* renamed from: b */
    public final C2762f<Integer> mo86708b() {
        return this.f107492h;
    }

    /* renamed from: j */
    public final C12361b mo23370j() {
        return this.f107493i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2759d mo7353a() {
        return this;
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
    public final void mo86707a(boolean z) {
        C12942d dVar = this.f107491g.f33837e;
        if (dVar != null) {
            C52711k.m112236a((Object) dVar, "parentScene.navigationScene ?: return");
            if (!z || C18998a.m46172a(dVar, C49677b.class)) {
                if (C18998a.m46172a(dVar, C49677b.class)) {
                    dVar.mo24531d();
                }
                return;
            }
            this.f107489e = new C49677b(this.f107490f);
            C12924i iVar = this.f107489e;
            if (iVar == null) {
                C52711k.m112234a();
            }
            dVar.mo24522a(iVar, new C12863a().mo24324a(true).mo24323a((C12837c) new C42503a()).mo24325a());
        }
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C49549a.m106924a(this, vm1, bVar);
    }

    public C42502b(C12896b bVar, C12361b bVar2) {
        C52711k.m112240b(bVar, "parentScene");
        C52711k.m112240b(bVar2, "diContainer");
        this.f107491g = bVar;
        this.f107493i = bVar2;
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
