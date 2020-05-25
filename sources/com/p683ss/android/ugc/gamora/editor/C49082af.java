package com.p683ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
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
import com.bytedance.jedi.arch.internal.C11896i;
import com.p683ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43501am;
import com.p683ss.android.ugc.aweme.shortvideo.lyric.C43954a;
import com.p683ss.android.ugc.aweme.shortvideo.lyric.C43976f;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import dmt.p2652av.video.C53029x;
import dmt.p2652av.video.VEPreviewMusicParams;
import dmt.p2652av.video.VEVideoPublishEditViewModel;
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

/* renamed from: com.ss.android.ugc.gamora.editor.af */
public final class C49082af extends C43976f implements C49548a {

    /* renamed from: H */
    public static final C49083a f123341H = new C49083a(null);

    /* renamed from: A */
    public EditInfoStickerViewModel f123342A;

    /* renamed from: B */
    public EditLyricStickerViewModel f123343B;

    /* renamed from: C */
    public C43501am f123344C;

    /* renamed from: D */
    public VEPreviewMusicParams f123345D;

    /* renamed from: E */
    public int f123346E;

    /* renamed from: F */
    public int f123347F;

    /* renamed from: G */
    public int f123348G;

    /* renamed from: z */
    public VEVideoPublishEditViewModel f123349z;

    /* renamed from: com.ss.android.ugc.gamora.editor.af$a */
    public static final class C49083a {
        private C49083a() {
        }

        public /* synthetic */ C49083a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.af$b */
    static final class C49084b<T> implements C0199s<VEPreviewMusicParams> {

        /* renamed from: a */
        final /* synthetic */ C49082af f123350a;

        C49084b(C49082af afVar) {
            this.f123350a = afVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            VEPreviewMusicParams vEPreviewMusicParams = (VEPreviewMusicParams) obj;
            if (vEPreviewMusicParams == null) {
                return;
            }
            if (vEPreviewMusicParams.f131134a == null) {
                this.f123350a.mo97108J().mo96880g();
                return;
            }
            this.f123350a.f123345D = vEPreviewMusicParams;
            this.f123350a.f123346E = 0;
            this.f123350a.f123347F = vEPreviewMusicParams.f131135b + ((int) (vEPreviewMusicParams.f131140g * 1000.0f));
            this.f123350a.f123348G = this.f123350a.f123347F + vEPreviewMusicParams.f131137d;
            this.f123350a.mo97110L();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.af$c */
    static final class C49085c<T> implements C0199s<C53029x> {

        /* renamed from: a */
        final /* synthetic */ C49082af f123351a;

        C49085c(C49082af afVar) {
            this.f123351a = afVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            C53029x xVar = (C53029x) obj;
            if (xVar != null) {
                C49082af afVar = this.f123351a;
                int i2 = xVar.f131505a;
                VEPreviewMusicParams vEPreviewMusicParams = this.f123351a.f123345D;
                int i3 = 0;
                if (vEPreviewMusicParams != null) {
                    i = (int) (vEPreviewMusicParams.f131140g * 1000.0f);
                } else {
                    i = 0;
                }
                afVar.f123347F = i2 + i;
                C49082af afVar2 = this.f123351a;
                int i4 = this.f123351a.f123347F;
                VEPreviewMusicParams vEPreviewMusicParams2 = this.f123351a.f123345D;
                if (vEPreviewMusicParams2 != null) {
                    i3 = vEPreviewMusicParams2.f131137d;
                }
                afVar2.f123348G = i4 + i3;
                this.f123351a.mo97110L();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.af$d */
    static final class C49086d extends C52712l implements C52682m<C11866f, C49555b<? extends StickerItemModel>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49082af f123352a;

        /* renamed from: com.ss.android.ugc.gamora.editor.af$d$a */
        static final class C49087a extends C52712l implements C52671b<StickerItemModel, C52860x> {

            /* renamed from: a */
            final /* synthetic */ C49086d f123353a;

            C49087a(C49086d dVar) {
                this.f123353a = dVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                StickerItemModel stickerItemModel = (StickerItemModel) obj;
                C52711k.m112240b(stickerItemModel, "it");
                if (stickerItemModel.isLyric()) {
                    C0198r r = this.f123353a.f123352a.mo97107I().mo110473r();
                    C52711k.m112236a((Object) r, "publishEditViewModel.inTimeEditView");
                    if (!C52711k.m112239a((Object) (Boolean) r.getValue(), (Object) Boolean.valueOf(true))) {
                        C0198r s = this.f123353a.f123352a.mo97107I().mo110474s();
                        C52711k.m112236a((Object) s, "publishEditViewModel.inPinEditView");
                        if (!C52711k.m112239a((Object) (Boolean) s.getValue(), (Object) Boolean.valueOf(true))) {
                            this.f123353a.f123352a.mo89534F();
                        }
                    }
                }
                return C52860x.f131107a;
            }
        }

        C49086d(C49082af afVar) {
            this.f123352a = afVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49555b bVar = (C49555b) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            if (bVar != null) {
                bVar.mo97467a(new C49087a(this));
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.af$e */
    static final class C49088e extends C52712l implements C52682m<C11866f, C43501am, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49082af f123354a;

        C49088e(C49082af afVar) {
            this.f123354a = afVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C43501am amVar = (C43501am) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            if (amVar != null) {
                StickerItemModel stickerItemModel = amVar.f110003d;
                C52711k.m112236a((Object) stickerItemModel, "it.stickerItem");
                if (stickerItemModel.isLyric()) {
                    this.f123354a.f123344C = amVar;
                    StickerItemModel stickerItemModel2 = amVar.f110003d;
                    this.f123354a.mo89541a(stickerItemModel2.stickerId);
                    this.f123354a.mo89540a(null, null);
                    C0198r u = this.f123354a.mo97107I().mo110476u();
                    C52711k.m112236a((Object) u, "publishEditViewModel.lyricAudioTimeLiveData");
                    C43954a aVar = new C43954a(this.f123354a.mo97109K(), stickerItemModel2.mLyricInPoint, stickerItemModel2.mLyricStartTime, stickerItemModel2.mLyricOutPoint, C39629l.m88232a().mo58583n().mo83103a(C40790a.RearMusicAutoLoop));
                    u.setValue(aVar);
                    this.f123354a.mo97108J().mo96881h();
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.af$f */
    static final class C49089f extends C52712l implements C52682m<C11866f, Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49082af f123355a;

        C49089f(C49082af afVar) {
            this.f123355a = afVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Integer num = (Integer) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            if (num != null) {
                num.intValue();
                this.f123355a.mo89542d(num.intValue());
            }
            return C52860x.f131107a;
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

    /* renamed from: I */
    public final VEVideoPublishEditViewModel mo97107I() {
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f123349z;
        if (vEVideoPublishEditViewModel == null) {
            C52711k.m112237a("publishEditViewModel");
        }
        return vEVideoPublishEditViewModel;
    }

    /* renamed from: J */
    public final EditLyricStickerViewModel mo97108J() {
        EditLyricStickerViewModel editLyricStickerViewModel = this.f123343B;
        if (editLyricStickerViewModel == null) {
            C52711k.m112237a("lyricStickerEditViewMode");
        }
        return editLyricStickerViewModel;
    }

    /* renamed from: K */
    public final int mo97109K() {
        if (this.f123344C == null) {
            return -1;
        }
        C43501am amVar = this.f123344C;
        if (amVar == null) {
            C52711k.m112234a();
        }
        StickerItemModel stickerItemModel = amVar.f110003d;
        if (stickerItemModel == null) {
            C52711k.m112234a();
        }
        return stickerItemModel.f91605id;
    }

    /* renamed from: L */
    public final void mo97110L() {
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f123349z;
        if (vEVideoPublishEditViewModel == null) {
            C52711k.m112237a("publishEditViewModel");
        }
        C0198r u = vEVideoPublishEditViewModel.mo110476u();
        C52711k.m112236a((Object) u, "publishEditViewModel.lyricAudioTimeLiveData");
        C43954a aVar = new C43954a(mo97109K(), this.f123346E, this.f123347F, this.f123348G, C39629l.m88232a().mo58583n().mo83103a(C40790a.RearMusicAutoLoop));
        u.setValue(aVar);
        EditLyricStickerViewModel editLyricStickerViewModel = this.f123343B;
        if (editLyricStickerViewModel == null) {
            C52711k.m112237a("lyricStickerEditViewMode");
        }
        editLyricStickerViewModel.mo96881h();
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            C0209x a = C0214z.m440a((FragmentActivity) activity).mo359a(VEVideoPublishEditViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…ditViewModel::class.java)");
            this.f123349z = (VEVideoPublishEditViewModel) a;
            Activity activity2 = this.f33840g_;
            if (activity2 != null) {
                JediViewModel a2 = C48927d.m105736a((FragmentActivity) activity2).mo96760a(EditInfoStickerViewModel.class);
                C52711k.m112236a((Object) a2, "JediViewModelProviders.o…kerViewModel::class.java)");
                this.f123342A = (EditInfoStickerViewModel) a2;
                Activity activity3 = this.f33840g_;
                if (activity3 != null) {
                    JediViewModel a3 = C48927d.m105736a((FragmentActivity) activity3).mo96760a(EditLyricStickerViewModel.class);
                    C52711k.m112236a((Object) a3, "JediViewModelProviders.o…kerViewModel::class.java)");
                    this.f123343B = (EditLyricStickerViewModel) a3;
                    VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f123349z;
                    if (vEVideoPublishEditViewModel == null) {
                        C52711k.m112237a("publishEditViewModel");
                    }
                    C0184k kVar = this;
                    vEVideoPublishEditViewModel.mo110460e().observe(kVar, new C49084b(this));
                    VEVideoPublishEditViewModel vEVideoPublishEditViewModel2 = this.f123349z;
                    if (vEVideoPublishEditViewModel2 == null) {
                        C52711k.m112237a("publishEditViewModel");
                    }
                    vEVideoPublishEditViewModel2.mo110469n().observe(kVar, new C49085c(this));
                    EditInfoStickerViewModel editInfoStickerViewModel = this.f123342A;
                    if (editInfoStickerViewModel == null) {
                        C52711k.m112237a("infoStickerEditViewModel");
                    }
                    mo22547a(editInfoStickerViewModel, C49090ag.f123356a, C11896i.m24255a(), new C49086d(this));
                    EditLyricStickerViewModel editLyricStickerViewModel = this.f123343B;
                    if (editLyricStickerViewModel == null) {
                        C52711k.m112237a("lyricStickerEditViewMode");
                    }
                    mo22547a(editLyricStickerViewModel, C49091ah.f123357a, C11896i.m24255a(), new C49088e(this));
                    EditLyricStickerViewModel editLyricStickerViewModel2 = this.f123343B;
                    if (editLyricStickerViewModel2 == null) {
                        C52711k.m112237a("lyricStickerEditViewMode");
                    }
                    mo22547a(editLyricStickerViewModel2, C49092ai.f123358a, C11896i.m24255a(), new C49089f(this));
                    return;
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
