package com.p683ss.android.ugc.gamora.recorder.sticker.sticker_panel.p2486a;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.os.Bundle;
import android.support.p030v4.p038f.C0794k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11788aa;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.C11872h;
import com.bytedance.jedi.arch.C11872h.C11873a;
import com.bytedance.jedi.arch.C11910j;
import com.bytedance.jedi.arch.C11931r;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.C11934u;
import com.bytedance.jedi.arch.C11937x;
import com.bytedance.jedi.arch.C11938y;
import com.bytedance.jedi.arch.C11939z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p780m.C12361b;
import com.bytedance.scene.C12924i;
import com.p683ss.android.ugc.aweme.sticker.p2275a.C45814b;
import com.p683ss.android.ugc.aweme.sticker.p2283g.C45889c;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46054d;
import com.p683ss.android.ugc.aweme.sticker.panel.C46254o;
import com.p683ss.android.ugc.aweme.sticker.panel.C46255p;
import com.p683ss.android.ugc.aweme.sticker.panel.C46256q;
import com.p683ss.android.ugc.aweme.sticker.panel.C46256q.C46257a;
import com.p683ss.android.ugc.aweme.sticker.panel.guide.IStickerGuidePresenter;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.aweme.sticker.tabguide.IStickerTabGuidePresenter;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.text.C46541n.C46543b;
import com.p683ss.android.ugc.aweme.utils.C47675ap;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.p2485a.C49976b;
import com.p683ss.android.ugc.gamora.recorder.sticker.sticker_panel.C50068b;
import com.p683ss.android.ugc.gamora.recorder.sticker.sticker_panel.C50070d;
import com.p683ss.android.ugc.tools.view.p2508a.C50206a;
import com.p683ss.android.ugc.tools.view.p2508a.C50207b;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p069b.C1690c;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.sticker_panel.a.a */
public final class C50058a extends C12924i implements C11872h, C50068b {

    /* renamed from: i */
    static final /* synthetic */ C52767h[] f125394i = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C50058a.class), "listenableActivityRegistry", "getListenableActivityRegistry()Lcom/ss/android/ugc/tools/view/activity/AVListenableActivityRegistry;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C50058a.class), "stickerView", "getStickerView()Lcom/ss/android/ugc/aweme/sticker/panel/StickerView;"))};

    /* renamed from: m */
    public static final C50059a f125395m = new C50059a(null);

    /* renamed from: j */
    public IStickerGuidePresenter f125396j;

    /* renamed from: k */
    public final C50206a f125397k = new C50061c(this);

    /* renamed from: l */
    public final C12361b f125398l;

    /* renamed from: n */
    private final C52668f f125399n = C52732g.m112285a(new C50060b(this));

    /* renamed from: o */
    private final C52668f f125400o;

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.sticker_panel.a.a$a */
    public static final class C50059a {
        private C50059a() {
        }

        public /* synthetic */ C50059a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.sticker_panel.a.a$b */
    static final class C50060b extends C52712l implements C52670a<C50207b> {

        /* renamed from: a */
        final /* synthetic */ C50058a f125401a;

        C50060b(C50058a aVar) {
            this.f125401a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Activity v = this.f125401a.mo24477v();
            C52711k.m112236a((Object) v, "requireActivity()");
            return C47675ap.m103187a(v);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.sticker_panel.a.a$c */
    static final class C50061c implements C50206a {

        /* renamed from: a */
        final /* synthetic */ C50058a f125402a;

        C50061c(C50058a aVar) {
            this.f125402a = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x001f  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo58985a(int r3, android.view.KeyEvent r4) {
            /*
                r2 = this;
                r4 = 0
                r0 = 4
                if (r3 != r0) goto L_0x0038
                com.ss.android.ugc.gamora.recorder.sticker.sticker_panel.a.a r3 = r2.f125402a
                android.app.Activity r3 = r3.f33840g_
                r0 = 1
                if (r3 == 0) goto L_0x001c
                r1 = 2132020429(0x7f140ccd, float:1.967922E38)
                android.view.View r3 = r3.findViewById(r1)
                if (r3 == 0) goto L_0x001c
                int r3 = r3.getVisibility()
                if (r3 != 0) goto L_0x001c
                r3 = 1
                goto L_0x001d
            L_0x001c:
                r3 = 0
            L_0x001d:
                if (r3 != 0) goto L_0x0038
                com.ss.android.ugc.gamora.recorder.sticker.sticker_panel.a.a r3 = r2.f125402a
                com.ss.android.ugc.aweme.sticker.panel.o r3 = r3.mo97839G()
                boolean r1 = r3.mo92776c()
                if (r1 == 0) goto L_0x0038
                r3.mo92778e()
                com.ss.android.ugc.gamora.recorder.sticker.sticker_panel.a.a r3 = r2.f125402a
                com.ss.android.ugc.aweme.sticker.panel.guide.IStickerGuidePresenter r3 = r3.f125396j
                if (r3 == 0) goto L_0x0037
                r3.hide()
            L_0x0037:
                return r0
            L_0x0038:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.sticker.sticker_panel.p2486a.C50058a.C50061c.mo58985a(int, android.view.KeyEvent):boolean");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.sticker_panel.a.a$d */
    static final class C50062d extends C52712l implements C52670a<ViewGroup> {

        /* renamed from: a */
        final /* synthetic */ C50058a f125403a;

        C50062d(C50058a aVar) {
            this.f125403a = aVar;
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            View view = this.f125403a.f33834b;
            if (!(view instanceof ViewGroup)) {
                view = null;
            }
            return (ViewGroup) view;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.sticker_panel.a.a$e */
    static final class C50063e<T> implements C0199s<Effect> {

        /* renamed from: a */
        final /* synthetic */ C50058a f125404a;

        C50063e(C50058a aVar) {
            this.f125404a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Effect effect = (Effect) obj;
            C46054d dVar = (C46054d) this.f125404a.f125398l.mo23375b(C46054d.class, (String) null);
            if (dVar != null) {
                dVar.mo92601a(effect);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.sticker_panel.a.a$f */
    static final class C50064f extends C52712l implements C52670a<C46254o> {

        /* renamed from: a */
        final /* synthetic */ C50058a f125405a;

        /* renamed from: b */
        final /* synthetic */ C50070d f125406b;

        /* renamed from: c */
        final /* synthetic */ C46354l f125407c;

        /* renamed from: d */
        final /* synthetic */ C46255p f125408d;

        /* renamed from: e */
        final /* synthetic */ C45814b f125409e;

        /* renamed from: f */
        final /* synthetic */ C45889c f125410f;

        /* renamed from: g */
        final /* synthetic */ C52671b f125411g;

        /* renamed from: h */
        final /* synthetic */ C52671b f125412h;

        /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.sticker_panel.a.a$f$a */
        public static final class C50065a implements C46256q {

            /* renamed from: a */
            final /* synthetic */ C50064f f125413a;

            /* renamed from: a */
            public final void mo92779a(View view) {
                C52711k.m112240b(view, "stickerView");
            }

            public final void cl_() {
            }

            C50065a(C50064f fVar) {
                this.f125413a = fVar;
            }

            /* renamed from: a */
            public final void mo92780a(C46257a aVar) {
                C52711k.m112240b(aVar, "state");
                if (aVar == C46257a.BEFORE_ANIMATE) {
                    C50207b F = this.f125413a.f125405a.mo97838F();
                    if (F != null) {
                        F.mo94977a(this.f125413a.f125405a.f125397k);
                    }
                }
            }

            /* renamed from: b */
            public final void mo92781b(C46257a aVar) {
                C52711k.m112240b(aVar, "state");
                if (aVar == C46257a.AFTER_ANIMATE) {
                    C50207b F = this.f125413a.f125405a.mo97838F();
                    if (F != null) {
                        F.mo94978b(this.f125413a.f125405a.f125397k);
                    }
                }
            }
        }

        C50064f(C50058a aVar, C50070d dVar, C46354l lVar, C46255p pVar, C45814b bVar, C45889c cVar, C52671b bVar2, C52671b bVar3) {
            this.f125405a = aVar;
            this.f125406b = dVar;
            this.f125407c = lVar;
            this.f125408d = pVar;
            this.f125409e = bVar;
            this.f125410f = cVar;
            this.f125411g = bVar2;
            this.f125412h = bVar3;
            super(0);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0046, code lost:
            if (r2 == null) goto L_0x0048;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0064, code lost:
            if (r2 == null) goto L_0x0066;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke() {
            /*
                r7 = this;
                com.ss.android.ugc.gamora.recorder.sticker.sticker_panel.d r0 = r7.f125406b
                com.ss.android.ugc.gamora.recorder.sticker.sticker_panel.a.a r1 = r7.f125405a
                r2 = 2132020515(0x7f140d23, float:1.9679395E38)
                android.view.View r1 = r1.mo24467j_(r2)
                java.lang.String r2 = "requireViewById(R.id.layout_sticker_extra)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
                com.ss.android.ugc.aweme.sticker.presenter.l r2 = r7.f125407c
                com.ss.android.ugc.aweme.sticker.panel.p r3 = r7.f125408d
                com.ss.android.ugc.aweme.sticker.a.b r4 = r7.f125409e
                com.ss.android.ugc.aweme.sticker.g.c r5 = r7.f125410f
                com.ss.android.ugc.gamora.recorder.sticker.sticker_panel.a.a r6 = r7.f125405a
                com.bytedance.m.b r6 = r6.f125398l
                com.ss.android.ugc.aweme.sticker.panel.o r0 = r0.mo97847a(r1, r2, r3, r4, r5, r6)
                com.ss.android.ugc.gamora.recorder.sticker.sticker_panel.a.a$f$a r1 = new com.ss.android.ugc.gamora.recorder.sticker.sticker_panel.a.a$f$a
                r1.<init>(r7)
                com.ss.android.ugc.aweme.sticker.panel.q r1 = (com.p683ss.android.ugc.aweme.sticker.panel.C46256q) r1
                r0.mo92773a(r1)
                com.ss.android.ugc.gamora.recorder.sticker.sticker_panel.a.a r1 = r7.f125405a
                r2 = 2132020517(0x7f140d25, float:1.96794E38)
                android.view.View r1 = r1.mo24467j_(r2)
                java.lang.String r2 = "requireViewById<FrameLay…_sticker_extra_container)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
                d.f.a.b r2 = r7.f125411g
                if (r2 == 0) goto L_0x0048
                java.lang.Object r2 = r2.invoke(r1)
                com.ss.android.ugc.aweme.sticker.panel.guide.IStickerGuidePresenter r2 = (com.p683ss.android.ugc.aweme.sticker.panel.guide.IStickerGuidePresenter) r2
                if (r2 != 0) goto L_0x004f
            L_0x0048:
                com.ss.android.ugc.aweme.sticker.panel.guide.DefaultStickerGuidePresenter r2 = new com.ss.android.ugc.aweme.sticker.panel.guide.DefaultStickerGuidePresenter
                r2.<init>(r1)
                com.ss.android.ugc.aweme.sticker.panel.guide.IStickerGuidePresenter r2 = (com.p683ss.android.ugc.aweme.sticker.panel.guide.IStickerGuidePresenter) r2
            L_0x004f:
                com.ss.android.ugc.gamora.recorder.sticker.sticker_panel.a.a r3 = r7.f125405a
                android.arch.lifecycle.k r3 = (android.arch.lifecycle.C0184k) r3
                r2.mo92859a(r3)
                com.ss.android.ugc.gamora.recorder.sticker.sticker_panel.a.a r3 = r7.f125405a
                r3.f125396j = r2
                d.f.a.b r2 = r7.f125412h
                if (r2 == 0) goto L_0x0066
                java.lang.Object r2 = r2.invoke(r1)
                com.ss.android.ugc.aweme.sticker.tabguide.IStickerTabGuidePresenter r2 = (com.p683ss.android.ugc.aweme.sticker.tabguide.IStickerTabGuidePresenter) r2
                if (r2 != 0) goto L_0x0076
            L_0x0066:
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                java.lang.String r2 = "root"
                p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
                com.ss.android.ugc.aweme.sticker.tabguide.DefaultStickerTabGuidePresenter r2 = new com.ss.android.ugc.aweme.sticker.tabguide.DefaultStickerTabGuidePresenter
                r3 = 2
                r4 = 0
                r2.<init>(r1, r4, r3, r4)
                com.ss.android.ugc.aweme.sticker.tabguide.IStickerTabGuidePresenter r2 = (com.p683ss.android.ugc.aweme.sticker.tabguide.IStickerTabGuidePresenter) r2
            L_0x0076:
                r0.mo92774a(r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.sticker.sticker_panel.p2486a.C50058a.C50064f.invoke():java.lang.Object");
        }
    }

    /* renamed from: F */
    public final C50207b mo97838F() {
        return (C50207b) this.f125399n.getValue();
    }

    /* renamed from: G */
    public final C46254o mo97839G() {
        return (C46254o) this.f125400o.getValue();
    }

    /* renamed from: a */
    public final C12924i mo97840a() {
        return this;
    }

    /* renamed from: a */
    public final void mo97842a(C50048n nVar) {
        C52711k.m112240b(nVar, "stickerApi");
        nVar.mo92998a(mo97839G());
        C46543b bVar = (C46543b) this.f125398l.mo23375b(C46543b.class, (String) null);
        if (bVar == null) {
            bVar = new C49976b(this.f125398l);
        }
        View j_ = mo24467j_(R.id.eiq);
        C52711k.m112236a((Object) j_, "requireViewById(R.id.lay…_sticker_extra_container)");
        nVar.mo97808a(bVar, (FrameLayout) j_, new C50062d(this));
        nVar.mo93023h().mo92989g().mo93020f().observe(mo22626h(), new C50063e(this));
    }

    /* renamed from: c */
    public final C11910j mo22553c() {
        return C11873a.m24226a(this);
    }

    public final void cr_() {
        mo97839G().mo92777d();
    }

    public final void cs_() {
        mo97839G().mo92778e();
    }

    /* renamed from: d */
    public final C11931r<C11866f> mo22554d() {
        return C11873a.m24228b(this);
    }

    /* renamed from: f */
    public final boolean mo22555f() {
        return C11873a.m24231e(this);
    }

    /* renamed from: h */
    public final C0184k mo22626h() {
        return C11873a.m24229c(this);
    }

    /* renamed from: i */
    public final /* synthetic */ C11796d mo22645i() {
        return C11873a.m24230d(this);
    }

    public final void ct_() {
        IStickerGuidePresenter iStickerGuidePresenter = this.f125396j;
        if (iStickerGuidePresenter != null) {
            iStickerGuidePresenter.hide();
        }
    }

    /* renamed from: a */
    public final void mo97841a(Effect effect) {
        if (effect != null) {
            IStickerGuidePresenter iStickerGuidePresenter = this.f125396j;
            if (iStickerGuidePresenter != null) {
                iStickerGuidePresenter.mo92860a(effect);
            }
        }
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C11873a.m24227a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.byg, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…_scene, container, false)");
        return inflate;
    }

    /* renamed from: a */
    public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C11873a.m24220a(this, jediViewModel, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A> C1690c mo22547a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C11866f, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C11873a.m24221a(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B> C1690c mo22549a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C11934u<C11938y<A, B>> uVar, C52686q<? super C11866f, ? super A, ? super B, C52860x> qVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(qVar, "subscriber");
        return C11873a.m24223a(this, jediViewModel, jVar, jVar2, uVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, T> C1690c mo22548a(JediViewModel<S> jediViewModel, C52771j<S, ? extends C11787a<? extends T>> jVar, C11934u<C11937x<C11787a<T>>> uVar, C52682m<? super C11866f, ? super Throwable, C52860x> mVar, C52671b<? super C11866f, C52860x> bVar, C52682m<? super C11866f, ? super T, C52860x> mVar2) {
        C52711k.m112240b(jediViewModel, "$this$asyncSubscribe");
        C52711k.m112240b(jVar, "prop");
        C52711k.m112240b(uVar, "config");
        return C11873a.m24222a((C11872h) this, jediViewModel, jVar, uVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C> C1690c mo22550a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C11934u<C11939z<A, B, C>> uVar, C52687r<? super C11866f, ? super A, ? super B, ? super C, C52860x> rVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(rVar, "subscriber");
        return C11873a.m24224a((C11872h) this, jediViewModel, jVar, jVar2, jVar3, uVar, rVar);
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
        return C11873a.m24225a(this, jediViewModel, jVar, jVar2, jVar3, jVar4, uVar, sVar);
    }

    public C50058a(C50070d dVar, C46354l lVar, C46255p pVar, C45814b bVar, C45889c cVar, C12361b bVar2, C52671b<? super FrameLayout, ? extends IStickerGuidePresenter> bVar3, C52671b<? super FrameLayout, ? extends IStickerTabGuidePresenter<C0794k<EffectCategoryModel, Object>>> bVar4) {
        C12361b bVar5 = bVar2;
        C50070d dVar2 = dVar;
        C52711k.m112240b(dVar, "stickerViewFactory");
        C46354l lVar2 = lVar;
        C52711k.m112240b(lVar, "stickerDataManager");
        C46255p pVar2 = pVar;
        C52711k.m112240b(pVar, "stickerViewConfigure");
        C45814b bVar6 = bVar;
        C52711k.m112240b(bVar, "stickerSelectedController");
        C45889c cVar2 = cVar;
        C52711k.m112240b(cVar2, "stickerMobHelper");
        C52711k.m112240b(bVar5, "parentContainer");
        this.f125398l = bVar5;
        C50064f fVar = new C50064f(this, dVar2, lVar2, pVar2, bVar6, cVar2, bVar3, bVar4);
        this.f125400o = C52732g.m112285a(fVar);
    }
}
