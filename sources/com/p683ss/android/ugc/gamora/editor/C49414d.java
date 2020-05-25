package com.p683ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView.ScaleType;
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
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.C43135a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2190b.C43440a.C43441a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2190b.C43442b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2190b.C43443c;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.ss.android.ugc.trill.R;
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

/* renamed from: com.ss.android.ugc.gamora.editor.d */
public final class C49414d extends C12924i implements C49548a {

    /* renamed from: n */
    public static final C49415a f124016n = new C49415a(null);

    /* renamed from: i */
    C43135a f124017i;

    /* renamed from: j */
    public EditToolbarViewModel f124018j;

    /* renamed from: k */
    FrameLayout f124019k;

    /* renamed from: l */
    public C43443c f124020l;

    /* renamed from: m */
    C0198r<Boolean> f124021m;

    /* renamed from: o */
    private EditAutoEnhanceViewModel f124022o;

    /* renamed from: p */
    private EditViewModel f124023p;

    /* renamed from: q */
    private VideoPublishEditModel f124024q;

    /* renamed from: r */
    private VEVideoPublishEditViewModel f124025r;

    /* renamed from: com.ss.android.ugc.gamora.editor.d$a */
    public static final class C49415a {
        private C49415a() {
        }

        public /* synthetic */ C49415a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.d$b */
    static final class C49416b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C43135a f124026a;

        /* renamed from: b */
        final /* synthetic */ C49414d f124027b;

        C49416b(C43135a aVar, C49414d dVar) {
            this.f124026a = aVar;
            this.f124027b = dVar;
        }

        public final void run() {
            this.f124026a.setVisibility(8);
            EditToolbarViewModel editToolbarViewModel = this.f124027b.f124018j;
            if (editToolbarViewModel == null) {
                C52711k.m112237a("toolbarViewModel");
            }
            editToolbarViewModel.mo97012b(9, true);
            C49414d.m106574a(this.f124027b).mo88376a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.d$c */
    static final class C49417c extends C52712l implements C52682m<C49548a, C52860x, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49414d f124028a;

        C49417c(C49414d dVar) {
            this.f124028a = dVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52860x xVar = (C52860x) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(xVar, "it");
            C49414d dVar = this.f124028a;
            if (dVar.f124017i == null) {
                dVar.f124017i = new C43135a(dVar.f33840g_);
                C43135a aVar = dVar.f124017i;
                if (aVar != null) {
                    aVar.setScaleType(ScaleType.FIT_XY);
                }
                C43135a aVar2 = dVar.f124017i;
                if (aVar2 != null) {
                    aVar2.setImageResource(R.drawable.cv);
                }
                LayoutParams layoutParams = new LayoutParams(-1, -2);
                layoutParams.setMargins(0, -1200, 0, 0);
                C43135a aVar3 = dVar.f124017i;
                if (aVar3 != null) {
                    aVar3.setLayoutParams(layoutParams);
                }
                FrameLayout frameLayout = dVar.f124019k;
                if (frameLayout == null) {
                    C52711k.m112237a("parentLayout");
                }
                frameLayout.addView(dVar.f124017i);
            }
            C43135a aVar4 = dVar.f124017i;
            if (aVar4 != null) {
                aVar4.animate().translationYBy(3000.0f).setDuration(1500).withEndAction(new C49416b(aVar4, dVar)).start();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.d$d */
    static final class C49418d extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49414d f124029a;

        C49418d(C49414d dVar) {
            this.f124029a = dVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            C49414d.m106574a(this.f124029a).mo88376a(booleanValue);
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

    /* renamed from: a */
    public static final /* synthetic */ C43443c m106574a(C49414d dVar) {
        C43443c cVar = dVar.f124020l;
        if (cVar == null) {
            C52711k.m112237a("mAutoEnhanceController");
        }
        return cVar;
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        boolean z;
        super.mo24448e(bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            JediViewModel a = C48927d.m105736a((FragmentActivity) activity).mo96760a(EditViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java)");
            this.f124023p = (EditViewModel) a;
            EditViewModel editViewModel = this.f124023p;
            if (editViewModel == null) {
                C52711k.m112237a("editViewModel");
            }
            this.f124024q = editViewModel.mo97035e();
            Activity activity2 = this.f33840g_;
            if (activity2 != null) {
                JediViewModel a2 = C48927d.m105736a((FragmentActivity) activity2).mo96760a(EditAutoEnhanceViewModel.class);
                C52711k.m112236a((Object) a2, "JediViewModelProviders.o…nceViewModel::class.java)");
                this.f124022o = (EditAutoEnhanceViewModel) a2;
                Activity activity3 = this.f33840g_;
                if (activity3 != null) {
                    JediViewModel a3 = C48927d.m105736a((FragmentActivity) activity3).mo96760a(EditToolbarViewModel.class);
                    C52711k.m112236a((Object) a3, "JediViewModelProviders.o…barViewModel::class.java)");
                    this.f124018j = (EditToolbarViewModel) a3;
                    Activity activity4 = this.f33840g_;
                    if (activity4 != null) {
                        C0209x a4 = C0214z.m440a((FragmentActivity) activity4).mo359a(VEVideoPublishEditViewModel.class);
                        C52711k.m112236a((Object) a4, "ViewModelProviders.of(ac…ditViewModel::class.java)");
                        this.f124025r = (VEVideoPublishEditViewModel) a4;
                        VideoPublishEditModel videoPublishEditModel = this.f124024q;
                        if (videoPublishEditModel == null) {
                            C52711k.m112237a("mModel");
                        }
                        if (videoPublishEditModel.autoEnhanceType != 0 || !C43441a.m95214a()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (C39629l.m88232a().mo58583n().mo83104b(C40790a.LightEnhanceBlackList) == 1) {
                            VideoPublishEditModel videoPublishEditModel2 = this.f124024q;
                            if (videoPublishEditModel2 == null) {
                                C52711k.m112237a("mModel");
                            }
                            videoPublishEditModel2.autoEnhanceType = 2;
                        }
                        C12924i iVar = this;
                        VideoPublishEditModel videoPublishEditModel3 = this.f124024q;
                        if (videoPublishEditModel3 == null) {
                            C52711k.m112237a("mModel");
                        }
                        this.f124020l = new C43443c(iVar, videoPublishEditModel3, z);
                        C43443c cVar = this.f124020l;
                        if (cVar == null) {
                            C52711k.m112237a("mAutoEnhanceController");
                        }
                        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f124025r;
                        if (vEVideoPublishEditViewModel == null) {
                            C52711k.m112237a("publishEditViewModel");
                        }
                        C0198r<C43442b> t = vEVideoPublishEditViewModel.mo110475t();
                        C52711k.m112236a((Object) t, "publishEditViewModel.autoEnhanceControlLiveData");
                        C52711k.m112240b(t, "autoEnhanceData");
                        cVar.f109833a = t;
                        if (!cVar.f109836d) {
                            C0198r<C43442b> rVar = cVar.f109833a;
                            if (rVar != null) {
                                C43442b bVar = new C43442b(cVar.f109835c.autoEnhanceOn, cVar.f109835c.autoEnhanceType, false, 4, null);
                                rVar.postValue(bVar);
                            }
                        }
                        C43443c cVar2 = this.f124020l;
                        if (cVar2 == null) {
                            C52711k.m112237a("mAutoEnhanceController");
                        }
                        C0198r<Boolean> rVar2 = this.f124021m;
                        if (rVar2 == null) {
                            C52711k.m112237a("lightDetectionDone");
                        }
                        cVar2.mo88375a(rVar2);
                        EditAutoEnhanceViewModel editAutoEnhanceViewModel = this.f124022o;
                        if (editAutoEnhanceViewModel == null) {
                            C52711k.m112237a("autoEnhanceViewModel");
                        }
                        mo49444c(editAutoEnhanceViewModel, C49419e.f124030a, new C11934u(), new C49417c(this));
                        EditAutoEnhanceViewModel editAutoEnhanceViewModel2 = this.f124022o;
                        if (editAutoEnhanceViewModel2 == null) {
                            C52711k.m112237a("autoEnhanceViewModel");
                        }
                        mo49443b(editAutoEnhanceViewModel2, C49420f.f124031a, new C11934u(), new C49418d(this));
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
        View inflate = layoutInflater.inflate(R.layout.ady, viewGroup, false);
        if (inflate != null) {
            this.f124019k = (FrameLayout) inflate;
            FrameLayout frameLayout = this.f124019k;
            if (frameLayout == null) {
                C52711k.m112237a("parentLayout");
            }
            return frameLayout;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout");
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
