package com.p683ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
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
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39588bb;
import com.p683ss.android.ugc.aweme.port.p2082in.C39588bb.C39589a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p2196a.C43547a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.C43598a;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.data.PoiStruct;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C46722b;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C46723c;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.p683ss.android.vesdk.VESize;
import p064c.p065a.p069b.C1690c;
import p2628d.C52668f;
import p2628d.C52732g;
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
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2648k.C52771j;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.gamora.editor.aq */
public final class C49131aq extends C12924i implements C49548a {

    /* renamed from: i */
    static final /* synthetic */ C52767h[] f123443i = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49131aq.class), "stickerController", "getStickerController()Lcom/ss/android/ugc/aweme/shortvideo/edit/infosticker/interact/poi/PoiStickerController;"))};

    /* renamed from: p */
    public static final C49132a f123444p = new C49132a(null);

    /* renamed from: j */
    public C49527v f123445j;

    /* renamed from: k */
    public EditViewModel f123446k;

    /* renamed from: l */
    public EditInfoStickerViewModel f123447l;

    /* renamed from: m */
    public EditTextStickerViewModel f123448m;

    /* renamed from: n */
    public EditStickerPanelViewModel f123449n;

    /* renamed from: o */
    public EditVoteStickerViewModel f123450o;

    /* renamed from: q */
    private EditPoiStickerViewModel f123451q;

    /* renamed from: r */
    private EditPreviewViewModel f123452r;

    /* renamed from: s */
    private final C52668f f123453s = C52732g.m112285a(C49140h.f123462a);

    /* renamed from: com.ss.android.ugc.gamora.editor.aq$a */
    public static final class C49132a {
        private C49132a() {
        }

        public /* synthetic */ C49132a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aq$b */
    public static final class C49133b implements C39589a {

        /* renamed from: a */
        final /* synthetic */ C49131aq f123454a;

        /* renamed from: b */
        final /* synthetic */ Effect f123455b;

        /* renamed from: a */
        public final void mo80673a() {
            this.f123454a.mo97147L();
        }

        /* renamed from: b */
        public final void mo80675b() {
            this.f123454a.mo97148M();
        }

        C49133b(C49131aq aqVar, Effect effect) {
            this.f123454a = aqVar;
            this.f123455b = effect;
        }

        /* renamed from: a */
        public final void mo80674a(PoiStruct poiStruct, String str) {
            C52711k.m112240b(str, "searchRegionType");
            C49131aq.m106048d(this.f123454a).mo96953a(false);
            String str2 = "NULL";
            if (poiStruct == null) {
                C52711k.m112234a();
            }
            if (C52830p.m112406a(str2, poiStruct.getPoiId(), true)) {
                poiStruct = null;
            }
            this.f123454a.mo97141F().mo88744a((C20347c) C49131aq.m106047c(this.f123454a).mo97038h().getValue());
            this.f123454a.mo97141F().mo88817a(poiStruct);
            this.f123454a.mo97141F().mo88726a(this.f123455b.getUnzipPath());
            this.f123454a.mo97141F().f110332a = this.f123455b.getEffectId();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aq$c */
    public static final class C49134c implements C43547a {

        /* renamed from: a */
        final /* synthetic */ C49131aq f123456a;

        /* renamed from: com.ss.android.ugc.gamora.editor.aq$c$a */
        public static final class C49135a implements C39589a {

            /* renamed from: a */
            final /* synthetic */ C49134c f123457a;

            /* renamed from: a */
            public final void mo80673a() {
                this.f123457a.f123456a.mo97147L();
            }

            /* renamed from: b */
            public final void mo80675b() {
                this.f123457a.f123456a.mo97148M();
            }

            C49135a(C49134c cVar) {
                this.f123457a = cVar;
            }

            /* renamed from: a */
            public final void mo80674a(PoiStruct poiStruct, String str) {
                C52711k.m112240b(str, "searchRegionType");
                C49131aq.m106048d(this.f123457a.f123456a).mo96953a(false);
                String str2 = "NULL";
                if (poiStruct == null) {
                    C52711k.m112234a();
                }
                if (C52830p.m112406a(str2, poiStruct.getPoiId(), true)) {
                    poiStruct = null;
                }
                this.f123457a.f123456a.mo97141F().mo88744a((C20347c) C49131aq.m106047c(this.f123457a.f123456a).mo97038h().getValue());
                this.f123457a.f123456a.mo97141F().mo88817a(poiStruct);
            }
        }

        /* renamed from: a */
        public final void mo88686a(View view) {
            C52711k.m112240b(view, "view");
        }

        /* renamed from: a */
        public final void mo88685a() {
            C39588bb s = C39630m.m88234a().mo58621s();
            C39589a aVar = new C49135a(this);
            Activity activity = this.f123456a.f33840g_;
            if (activity != null) {
                s.mo74230a(aVar, (FragmentActivity) activity, false);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }

        /* renamed from: b */
        public final void mo88688b() {
            if (this.f123456a.mo97141F().mo88730c()) {
                C49131aq.m106047c(this.f123456a).mo97037g().mo73977a(this.f123456a.mo97141F().f110332a);
            }
        }

        C49134c(C49131aq aqVar) {
            this.f123456a = aqVar;
        }

        /* renamed from: a */
        public final void mo88687a(boolean z) {
            C49131aq.m106045a(this.f123456a).mo96855e();
            C49131aq.m106046b(this.f123456a).mo96977e();
            if (z) {
                C49131aq.m106047c(this.f123456a).mo97033a(true, true, true);
            } else {
                C49131aq.m106047c(this.f123456a).mo97033a(false, true, false);
            }
        }

        /* renamed from: b */
        public final void mo88689b(boolean z) {
            if (z) {
                C49131aq.m106045a(this.f123456a).mo96855e();
                EditVoteStickerViewModel editVoteStickerViewModel = this.f123456a.f123450o;
                if (editVoteStickerViewModel == null) {
                    C52711k.m112237a("editVoteStickerViewModel");
                }
                editVoteStickerViewModel.mo97078e();
                C49131aq.m106046b(this.f123456a).mo96977e();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aq$d */
    static final class C49136d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C49131aq f123458a;

        C49136d(C49131aq aqVar) {
            this.f123458a = aqVar;
        }

        public final void run() {
            C49527v vVar = this.f123458a.f123445j;
            if (vVar == null) {
                C52711k.m112237a("gestureListenerManager");
            }
            vVar.mo97460f(this.f123458a.mo97141F().f110239p);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aq$e */
    static final class C49137e extends C52712l implements C52682m<C49548a, C52860x, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49131aq f123459a;

        C49137e(C49131aq aqVar) {
            this.f123459a = aqVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52860x xVar = (C52860x) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(xVar, "it");
            this.f123459a.mo97141F().mo88755m();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aq$f */
    static final class C49138f<T> implements C0199s<Float> {

        /* renamed from: a */
        final /* synthetic */ C49131aq f123460a;

        C49138f(C49131aq aqVar) {
            this.f123460a = aqVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Float f = (Float) obj;
            if (f != null) {
                C43598a F = this.f123460a.mo97141F();
                C52711k.m112236a((Object) f, "it");
                F.mo88742a(f.floatValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aq$g */
    static final class C49139g<T> implements C0199s<C20347c> {

        /* renamed from: a */
        final /* synthetic */ C49131aq f123461a;

        C49139g(C49131aq aqVar) {
            this.f123461a = aqVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C20347c cVar = (C20347c) obj;
            if (cVar != null) {
                this.f123461a.mo97141F().mo88744a(cVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aq$h */
    static final class C49140h extends C52712l implements C52670a<C43598a> {

        /* renamed from: a */
        public static final C49140h f123462a = new C49140h();

        C49140h() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C43598a();
        }
    }

    /* renamed from: F */
    public final C43598a mo97141F() {
        return (C43598a) this.f123453s.getValue();
    }

    /* renamed from: a */
    public final void mo97149a(Effect effect) {
        C52711k.m112240b(effect, "effect");
        C39588bb s = C39630m.m88234a().mo58621s();
        C39589a bVar = new C49133b(this, effect);
        Activity activity = this.f33840g_;
        if (activity != null) {
            s.mo74230a(bVar, (FragmentActivity) activity, false);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final void mo97151a(String str) {
        C52711k.m112240b(str, "stickerPath");
        mo97141F().mo88726a(str);
    }

    /* renamed from: a */
    public final void mo97150a(VESize vESize) {
        C52711k.m112240b(vESize, "size");
        mo97141F().f110238o = vESize;
    }

    /* renamed from: H */
    public final void mo97143H() {
        mo97141F().mo88732e();
    }

    /* renamed from: J */
    public final void mo97145J() {
        mo97141F().mo88755m();
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

    /* renamed from: G */
    public final boolean mo97142G() {
        return mo97141F().mo88748a();
    }

    /* renamed from: K */
    public final boolean mo97146K() {
        return mo97141F().mo88730c();
    }

    /* renamed from: I */
    public final InteractStickerStruct mo97144I() {
        C43598a F = mo97141F();
        EditViewModel editViewModel = this.f123446k;
        if (editViewModel == null) {
            C52711k.m112237a("editViewModel");
        }
        return F.mo88816a(editViewModel.mo97035e());
    }

    /* renamed from: L */
    public final void mo97147L() {
        EditPreviewViewModel editPreviewViewModel = this.f123452r;
        if (editPreviewViewModel == null) {
            C52711k.m112237a("editPreviewViewModel");
        }
        editPreviewViewModel.mo96923a(true);
        EditViewModel editViewModel = this.f123446k;
        if (editViewModel == null) {
            C52711k.m112237a("editViewModel");
        }
        C20347c cVar = (C20347c) editViewModel.mo97038h().getValue();
        if (cVar != null) {
            cVar.mo43087s();
        }
    }

    /* renamed from: M */
    public final void mo97148M() {
        EditPreviewViewModel editPreviewViewModel = this.f123452r;
        if (editPreviewViewModel == null) {
            C52711k.m112237a("editPreviewViewModel");
        }
        editPreviewViewModel.mo96923a(false);
        EditViewModel editViewModel = this.f123446k;
        if (editViewModel == null) {
            C52711k.m112237a("editViewModel");
        }
        C20347c cVar = (C20347c) editViewModel.mo97038h().getValue();
        if (cVar != null) {
            cVar.mo43085r();
        }
    }

    /* renamed from: a */
    public final void mo97152a(boolean z) {
        mo97141F().f110228e = z;
    }

    /* renamed from: a */
    public static final /* synthetic */ EditInfoStickerViewModel m106045a(C49131aq aqVar) {
        EditInfoStickerViewModel editInfoStickerViewModel = aqVar.f123447l;
        if (editInfoStickerViewModel == null) {
            C52711k.m112237a("editInfoStickerViewModel");
        }
        return editInfoStickerViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ EditTextStickerViewModel m106046b(C49131aq aqVar) {
        EditTextStickerViewModel editTextStickerViewModel = aqVar.f123448m;
        if (editTextStickerViewModel == null) {
            C52711k.m112237a("editTextStickerViewModel");
        }
        return editTextStickerViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ EditViewModel m106047c(C49131aq aqVar) {
        EditViewModel editViewModel = aqVar.f123446k;
        if (editViewModel == null) {
            C52711k.m112237a("editViewModel");
        }
        return editViewModel;
    }

    /* renamed from: d */
    public static final /* synthetic */ EditStickerPanelViewModel m106048d(C49131aq aqVar) {
        EditStickerPanelViewModel editStickerPanelViewModel = aqVar.f123449n;
        if (editStickerPanelViewModel == null) {
            C52711k.m112237a("editStickerPanelViewModel");
        }
        return editStickerPanelViewModel;
    }

    /* renamed from: b */
    public final void mo97153b(String str) {
        C52711k.m112240b(str, "stickerId");
        mo97141F().f110332a = str;
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            JediViewModel a = C48927d.m105736a((FragmentActivity) activity).mo96760a(EditPoiStickerViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…kerViewModel::class.java]");
            this.f123451q = (EditPoiStickerViewModel) a;
            Activity activity2 = this.f33840g_;
            if (activity2 != null) {
                JediViewModel a2 = C48927d.m105736a((FragmentActivity) activity2).mo96760a(EditInfoStickerViewModel.class);
                C52711k.m112236a((Object) a2, "JediViewModelProviders.o…kerViewModel::class.java]");
                this.f123447l = (EditInfoStickerViewModel) a2;
                Activity activity3 = this.f33840g_;
                if (activity3 != null) {
                    JediViewModel a3 = C48927d.m105736a((FragmentActivity) activity3).mo96760a(EditTextStickerViewModel.class);
                    C52711k.m112236a((Object) a3, "JediViewModelProviders.o…kerViewModel::class.java]");
                    this.f123448m = (EditTextStickerViewModel) a3;
                    Activity activity4 = this.f33840g_;
                    if (activity4 != null) {
                        JediViewModel a4 = C48927d.m105736a((FragmentActivity) activity4).mo96760a(EditStickerPanelViewModel.class);
                        C52711k.m112236a((Object) a4, "JediViewModelProviders.o…nelViewModel::class.java]");
                        this.f123449n = (EditStickerPanelViewModel) a4;
                        Activity activity5 = this.f33840g_;
                        if (activity5 != null) {
                            JediViewModel a5 = C48927d.m105736a((FragmentActivity) activity5).mo96760a(EditVoteStickerViewModel.class);
                            C52711k.m112236a((Object) a5, "JediViewModelProviders.o…kerViewModel::class.java]");
                            this.f123450o = (EditVoteStickerViewModel) a5;
                            Activity activity6 = this.f33840g_;
                            if (activity6 != null) {
                                JediViewModel a6 = C48927d.m105736a((FragmentActivity) activity6).mo96760a(EditPreviewViewModel.class);
                                C52711k.m112236a((Object) a6, "JediViewModelProviders.o…iewViewModel::class.java]");
                                this.f123452r = (EditPreviewViewModel) a6;
                                EditPoiStickerViewModel editPoiStickerViewModel = this.f123451q;
                                if (editPoiStickerViewModel == null) {
                                    C52711k.m112237a("editPoiStickerViewModel");
                                }
                                mo49444c(editPoiStickerViewModel, C49141ar.f123463a, new C11934u(), new C49137e(this));
                                EditPoiStickerViewModel editPoiStickerViewModel2 = this.f123451q;
                                if (editPoiStickerViewModel2 == null) {
                                    C52711k.m112237a("editPoiStickerViewModel");
                                }
                                C0184k kVar = this;
                                editPoiStickerViewModel2.mo96911f().observe(kVar, new C49138f(this));
                                EditViewModel editViewModel = this.f123446k;
                                if (editViewModel == null) {
                                    C52711k.m112237a("editViewModel");
                                }
                                editViewModel.mo97038h().observe(kVar, new C49139g(this));
                                mo97141F().f110236m = new C49134c(this);
                                mo97141F().f110245v = new C49136d(this);
                                return;
                            }
                            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                        }
                        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                    }
                    throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
                throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
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
        FrameLayout frameLayout = (FrameLayout) viewGroup;
        Activity activity = this.f33840g_;
        if (activity != null) {
            JediViewModel a = C48927d.m105736a((FragmentActivity) activity).mo96760a(EditViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java]");
            this.f123446k = (EditViewModel) a;
            mo97141F().f110240q = false;
            C43598a F = mo97141F();
            EditViewModel editViewModel = this.f123446k;
            if (editViewModel == null) {
                C52711k.m112237a("editViewModel");
            }
            F.mo88743a(editViewModel.mo97035e().getLiveWaterMarkRect(this.f33840g_, null));
            EditViewModel editViewModel2 = this.f123446k;
            if (editViewModel2 == null) {
                C52711k.m112237a("editViewModel");
            }
            C20347c cVar = (C20347c) editViewModel2.mo97038h().getValue();
            if (cVar != null) {
                mo97141F().f110238o = cVar.mo43037b();
                mo97141F().mo88723a((Context) this.f33840g_, (C46723c) null, frameLayout);
                C49527v vVar = this.f123445j;
                if (vVar == null) {
                    C52711k.m112237a("gestureListenerManager");
                }
                vVar.mo97457c((C46722b) mo97141F().f110239p);
            }
            return new View(frameLayout.getContext());
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
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
