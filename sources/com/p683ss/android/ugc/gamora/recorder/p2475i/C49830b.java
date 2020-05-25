package com.p683ss.android.ugc.gamora.recorder.p2475i;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.als.C2759d;
import com.bytedance.als.C2764h;
import com.bytedance.als.C2765i;
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
import com.bytedance.p780m.C12361b;
import com.bytedance.scene.group.C12896b;
import com.p683ss.android.ugc.aweme.greenscreen.GreenScreenImage;
import com.p683ss.android.ugc.aweme.greenscreen.GreenScreenViewModel;
import com.p683ss.android.ugc.aweme.greenscreen.GreenScreenViewModel.C32862c;
import com.p683ss.android.ugc.aweme.greenscreen.GreenScreenViewModel.C32866g;
import com.p683ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p683ss.android.ugc.aweme.sticker.p2280d.C45861d;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46297f;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.p2322a.C46440b;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.p683ss.android.ugc.gamora.recorder.p2480n.C49912d;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n;
import p064c.p065a.p069b.C1690c;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.recorder.i.b */
public final class C49830b extends C2764h<C49829a> implements C49548a, C49829a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f124883a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49830b.class), "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49830b.class), "effectHandler", "getEffectHandler()Lcom/ss/android/ugc/aweme/sticker/types/ar/greenscreen/IGreenScreenEffectHandler;"))};

    /* renamed from: b */
    public String f124884b;

    /* renamed from: c */
    public GreenScreenViewModel f124885c;

    /* renamed from: d */
    ShortVideoContextViewModel f124886d;

    /* renamed from: e */
    public SafeHandler f124887e;

    /* renamed from: f */
    public final C12896b f124888f;

    /* renamed from: g */
    public final C12361b f124889g;

    /* renamed from: h */
    private final FragmentActivity f124890h = ((FragmentActivity) this.f124889g.mo23373a(FragmentActivity.class, (String) null));

    /* renamed from: i */
    private boolean f124891i;

    /* renamed from: j */
    private final C2765i<Boolean> f124892j = new C2765i<>();

    /* renamed from: k */
    private final C52668f f124893k = C52732g.m112285a(new C49838g(this));

    /* renamed from: l */
    private final C52668f f124894l = C52732g.m112285a(new C49831a(this));

    /* renamed from: com.ss.android.ugc.gamora.recorder.i.b$a */
    static final class C49831a extends C52712l implements C52670a<C46440b> {

        /* renamed from: a */
        final /* synthetic */ C49830b f124895a;

        C49831a(C49830b bVar) {
            this.f124895a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.f124895a.mo97676k().mo97796A();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.i.b$b */
    static final class C49832b extends C52712l implements C52682m<C49548a, Effect, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49830b f124896a;

        C49832b(C49830b bVar) {
            this.f124896a = bVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Effect effect = (Effect) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C45861d.m99707a((C46297f) this.f124896a.mo97676k(), effect);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.i.b$c */
    static final class C49833c extends C52712l implements C52682m<C49548a, C52847n<? extends String, ? extends String>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49830b f124897a;

        C49833c(C49830b bVar) {
            this.f124897a = bVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            final C52847n nVar = (C52847n) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(nVar, "it");
            SafeHandler safeHandler = this.f124897a.f124887e;
            if (safeHandler == null) {
                C52711k.m112237a("safeHandler");
            }
            safeHandler.post(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C49833c f124898a;

                {
                    this.f124898a = r1;
                }

                public final void run() {
                    GreenScreenImage greenScreenImage;
                    this.f124898a.f124897a.mo97677l().mo93176b((String) nVar.getFirst());
                    this.f124898a.f124897a.f124884b = (String) nVar.getFirst();
                    boolean isEmpty = TextUtils.isEmpty((CharSequence) nVar.getFirst());
                    String str = (String) nVar.getSecond();
                    ShortVideoContextViewModel shortVideoContextViewModel = this.f124898a.f124897a.f124886d;
                    if (shortVideoContextViewModel == null) {
                        C52711k.m112237a("shortVideoContextViewModel");
                    }
                    if (shortVideoContextViewModel != null) {
                        ShortVideoContext shortVideoContext = shortVideoContextViewModel.f107134a;
                        if (isEmpty) {
                            greenScreenImage = new GreenScreenImage("", null, null, "empty", 6, null);
                        } else if (TextUtils.isEmpty(str)) {
                            greenScreenImage = new GreenScreenImage("", null, null, "original", 6, null);
                        } else {
                            greenScreenImage = new GreenScreenImage(str, null, null, "library", 6, null);
                        }
                        shortVideoContext.f107108bg = greenScreenImage;
                    }
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.i.b$d */
    static final class C49835d<T> implements C2767k<Integer> {

        /* renamed from: a */
        final /* synthetic */ C49830b f124900a;

        C49835d(C49830b bVar) {
            this.f124900a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null && num.intValue() == 0) {
                C49830b.m107480a(this.f124900a).mo22530c(new C32866g(false));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.i.b$e */
    static final class C49836e extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49830b f124901a;

        C49836e(C49830b bVar) {
            this.f124901a = bVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            if (booleanValue) {
                ((C49912d) this.f124901a.f124889g.mo23372a(C49912d.class)).mo97721a(false);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.i.b$f */
    static final class C49837f<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49830b f124902a;

        C49837f(C49830b bVar) {
            this.f124902a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            GreenScreenViewModel a = C49830b.m107480a(this.f124902a);
            C52711k.m112236a((Object) bool, "it");
            a.mo22530c(new C32862c(bool.booleanValue()));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.i.b$g */
    static final class C49838g extends C52712l implements C52670a<C50048n> {

        /* renamed from: a */
        final /* synthetic */ C49830b f124903a;

        C49838g(C49830b bVar) {
            this.f124903a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (C50048n) this.f124903a.f124889g.mo23372a(C50048n.class);
        }
    }

    /* renamed from: g */
    public final void mo97674g() {
        this.f124891i = true;
    }

    /* renamed from: k */
    public final C50048n mo97676k() {
        return (C50048n) this.f124893k.getValue();
    }

    /* renamed from: l */
    public final C46440b mo97677l() {
        return (C46440b) this.f124894l.getValue();
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

    /* renamed from: j */
    public final void mo97675j() {
        this.f124891i = false;
        mo97677l().mo93175b();
    }

    public final void bM_() {
        super.bM_();
        if (this.f124891i) {
            mo97677l().mo93174a(this.f124884b);
        }
    }

    public final void bO_() {
        super.bO_();
        C12896b bVar = this.f124888f;
        Activity activity = bVar.f33840g_;
        if (activity != null) {
            JediViewModel a = C48927d.m105736a((FragmentActivity) activity).mo96760a(GreenScreenViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…eenViewModel::class.java]");
            this.f124885c = (GreenScreenViewModel) a;
            Activity activity2 = bVar.f33840g_;
            if (activity2 != null) {
                C0209x a2 = C0214z.m440a((FragmentActivity) activity2).mo359a(ShortVideoContextViewModel.class);
                C52711k.m112236a((Object) a2, "ViewModelProviders.of(ac…extViewModel::class.java]");
                this.f124886d = (ShortVideoContextViewModel) a2;
                Object a3 = bVar.mo24460E().mo24560a("safe_handler");
                if (a3 == null) {
                    C52711k.m112234a();
                }
                this.f124887e = (SafeHandler) a3;
                GreenScreenViewModel greenScreenViewModel = this.f124885c;
                if (greenScreenViewModel == null) {
                    C52711k.m112237a("greenScreenViewModel");
                }
                mo49444c(greenScreenViewModel, C49839c.f124904a, new C11934u(), new C49832b(this));
                GreenScreenViewModel greenScreenViewModel2 = this.f124885c;
                if (greenScreenViewModel2 == null) {
                    C52711k.m112237a("greenScreenViewModel");
                }
                mo49444c(greenScreenViewModel2, C49840d.f124905a, new C11934u(), new C49833c(this));
                C0184k kVar = bVar;
                ((C49912d) this.f124889g.mo23372a(C49912d.class)).mo97722k().mo7349a(kVar, new C49835d(this));
                GreenScreenViewModel greenScreenViewModel3 = this.f124885c;
                if (greenScreenViewModel3 == null) {
                    C52711k.m112237a("greenScreenViewModel");
                }
                mo49445d(greenScreenViewModel3, C49841e.f124906a, new C11934u(), new C49836e(this));
                this.f124892j.mo7349a(kVar, new C49837f(this));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public static final /* synthetic */ GreenScreenViewModel m107480a(C49830b bVar) {
        GreenScreenViewModel greenScreenViewModel = bVar.f124885c;
        if (greenScreenViewModel == null) {
            C52711k.m112237a("greenScreenViewModel");
        }
        return greenScreenViewModel;
    }

    /* renamed from: a */
    public final void mo97673a(boolean z) {
        this.f124892j.mo7350a(Boolean.valueOf(z));
    }

    public C49830b(C12896b bVar, C12361b bVar2) {
        C52711k.m112240b(bVar, "parentScene");
        C52711k.m112240b(bVar2, "diContainer");
        this.f124888f = bVar;
        this.f124889g = bVar2;
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
