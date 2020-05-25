package com.p683ss.android.ugc.gamora.recorder.p2469f;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.net.Uri;
import android.os.Bundle;
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
import com.bytedance.scene.group.C12896b;
import com.bytedance.scene.ktx.C12932b;
import com.p683ss.android.ugc.aweme.common.p1595g.C26888e;
import com.p683ss.android.ugc.aweme.port.internal.C39666o;
import com.p683ss.android.ugc.aweme.shortvideo.C43203d;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.countdown.C42506c;
import com.p683ss.android.ugc.aweme.shortvideo.countdown.C42508d;
import com.p683ss.android.ugc.aweme.shortvideo.countdown.C42509e;
import com.p683ss.android.ugc.aweme.shortvideo.countdown.C42509e.C42511a;
import com.p683ss.android.ugc.aweme.shortvideo.countdown.C42512f;
import com.p683ss.android.ugc.aweme.shortvideo.countdown.C42512f.C42514b;
import com.p683ss.android.ugc.aweme.shortvideo.countdown.C42536j;
import com.p683ss.android.ugc.aweme.shortvideo.countdown.C42536j.C42537a;
import com.p683ss.android.ugc.aweme.shortvideo.countdown.C42538k;
import com.p683ss.android.ugc.aweme.shortvideo.countdown.C42539l;
import com.p683ss.android.ugc.aweme.shortvideo.countdown.CountdownState;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43191e;
import com.p683ss.android.ugc.aweme.shortvideo.widget.VolumeTapsView;
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
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.recorder.f.b */
public final class C49677b extends C12896b implements C49548a {

    /* renamed from: k */
    public C42509e f124600k;

    /* renamed from: l */
    public C42536j f124601l;

    /* renamed from: m */
    public int f124602m;

    /* renamed from: n */
    public long f124603n = 15000;

    /* renamed from: o */
    public int f124604o;

    /* renamed from: p */
    public final C49676a f124605p;

    /* renamed from: q */
    private C42506c f124606q;

    /* renamed from: r */
    private final C42514b f124607r = new C49678a(this);

    /* renamed from: s */
    private final C42538k f124608s = new C49681d(this);

    /* renamed from: com.ss.android.ugc.gamora.recorder.f.b$a */
    public static final class C49678a implements C42514b {

        /* renamed from: a */
        final /* synthetic */ C49677b f124609a;

        C49678a(C49677b bVar) {
            this.f124609a = bVar;
        }

        /* renamed from: a */
        public final void mo86738a(int i) {
            this.f124609a.f124605p.mo86711a(i);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.f.b$b */
    public static final class C49679b implements C42537a {

        /* renamed from: a */
        final /* synthetic */ C49677b f124610a;

        /* renamed from: a */
        public final void mo86751a() {
            this.f124610a.f124605p.mo86714b();
        }

        /* renamed from: c */
        public final void mo86753c() {
            this.f124610a.f124605p.mo86715c();
        }

        /* renamed from: b */
        public final void mo86752b() {
            this.f124610a.f124605p.mo86710a();
            this.f124610a.f124605p.mo86711a(this.f124610a.f124604o);
            this.f124610a.f124605p.mo86712a((long) this.f124610a.f124602m);
        }

        C49679b(C49677b bVar) {
            this.f124610a = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.f.b$c */
    public static final class C49680c implements C42539l {

        /* renamed from: a */
        final /* synthetic */ C49677b f124611a;

        /* renamed from: a */
        public final void mo86757a() {
            this.f124611a.f124605p.mo86710a();
            mo86758a(false);
        }

        C49680c(C49677b bVar) {
            this.f124611a = bVar;
        }

        /* renamed from: a */
        public final void mo86758a(boolean z) {
            if (this.f124611a.f33840g_ != null) {
                C42536j jVar = this.f124611a.f124601l;
                if (jVar != null && !jVar.mo86722b()) {
                    this.f124611a.f124605p.mo86713a(false);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.f.b$d */
    public static final class C49681d implements C42538k {

        /* renamed from: a */
        final /* synthetic */ C49677b f124612a;

        /* renamed from: com.ss.android.ugc.gamora.recorder.f.b$d$a */
        static final class C49682a implements C42511a {

            /* renamed from: a */
            final /* synthetic */ C49681d f124613a;

            C49682a(C49681d dVar) {
                this.f124613a = dVar;
            }

            /* renamed from: a */
            public final void mo86732a(int i) {
                C42512f fVar = (C42512f) this.f124613a.f124612a.mo24388a("count_down");
                if (fVar != null) {
                    VolumeTapsView volumeTapsView = fVar.f107523i;
                    if (volumeTapsView == null) {
                        C52711k.m112237a("volumeTapsView");
                    }
                    volumeTapsView.setProgress(i);
                }
            }
        }

        /* renamed from: a */
        public final void mo86754a() {
            C42509e eVar = this.f124612a.f124600k;
            if (eVar != null) {
                eVar.mo86730c();
            }
        }

        C49681d(C49677b bVar) {
            this.f124612a = bVar;
        }

        /* renamed from: a */
        public final void mo86755a(int i, int i2) {
            this.f124612a.f124604o = i2;
            this.f124612a.f124602m = (int) Math.min(this.f124612a.f124603n, (long) i);
            C42536j jVar = this.f124612a.f124601l;
            if (jVar != null) {
                jVar.mo86721a(i2);
            }
        }

        /* renamed from: a */
        public final void mo86756a(String str, int i, int i2) {
            if (str != null && this.f124612a.f33840g_ != null) {
                C42509e eVar = this.f124612a.f124600k;
                if (eVar != null) {
                    eVar.mo86730c();
                }
                this.f124612a.f124600k = new C42509e(this.f124612a.mo24477v(), Uri.parse(str));
                C42509e eVar2 = this.f124612a.f124600k;
                if (eVar2 != null) {
                    eVar2.f107513c = new C49682a(this);
                }
                C42509e eVar3 = this.f124612a.f124600k;
                if (eVar3 != null) {
                    eVar3.mo86728a(i, i2);
                }
            }
        }
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

    /* renamed from: z */
    public final void mo24481z() {
        super.mo24481z();
        C42509e eVar = this.f124600k;
        if (eVar != null) {
            eVar.mo86729b();
        }
    }

    /* renamed from: A */
    public final void mo24457A() {
        super.mo24457A();
        C42509e eVar = this.f124600k;
        if (eVar != null) {
            eVar.mo86727a();
        }
        C42536j jVar = this.f124601l;
        if (jVar != null) {
            jVar.mo86720a();
        }
        C42506c cVar = this.f124606q;
        if (cVar != null) {
            cVar.mo86718b();
        }
    }

    public C49677b(C49676a aVar) {
        C52711k.m112240b(aVar, "listener");
        this.f124605p = aVar;
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        C49679b bVar = new C49679b(this);
        Activity v = mo24477v();
        C52711k.m112236a((Object) v, "requireActivity()");
        this.f124606q = new C42506c(v);
        View view = this.f33834b;
        if (view != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            C42537a aVar = bVar;
            C42506c cVar = this.f124606q;
            if (cVar == null) {
                C52711k.m112234a();
            }
            this.f124601l = new C42508d(frameLayout, aVar, cVar);
            C0209x a = C0214z.m440a(C12932b.m25979b(this)).mo359a(ShortVideoContextViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(re…extViewModel::class.java)");
            ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f107134a;
            C52711k.m112236a((Object) shortVideoContext, "shortVideoContext");
            this.f124603n = shortVideoContext.mo86377r();
            ((C39666o) C26888e.m65000a(mo24477v(), C39666o.class)).mo48452a(false);
            C43203d a2 = C43191e.m94742a(shortVideoContext.f107070aV);
            C49680c cVar2 = new C49680c(this);
            CountdownState countdownState = new CountdownState(shortVideoContext.f107112e, shortVideoContext.f107111d, shortVideoContext.mo86372m(), shortVideoContext.mo86373n(), (long) shortVideoContext.f107114g, shortVideoContext.mo86377r(), a2);
            C42512f fVar = new C42512f(countdownState);
            fVar.f107524j = this.f124608s;
            fVar.f107525k = cVar2;
            fVar.f107539y = this.f124607r;
            C12896b bVar2 = this;
            String str = "count_down";
            C52711k.m112240b(bVar2, "root");
            C52711k.m112240b(str, "tag");
            bVar2.mo24389a((int) R.id.c_g, (C12924i) fVar, str);
            this.f124605p.mo86713a(true);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout");
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

    /* renamed from: b */
    public final ViewGroup mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.atu, viewGroup, false);
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
