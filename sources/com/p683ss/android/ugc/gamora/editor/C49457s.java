package com.p683ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.arch.lifecycle.LiveData;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
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
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.C23441t;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.filter.C31405ah;
import com.p683ss.android.ugc.aweme.filter.C31406ai;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.C31460h;
import com.p683ss.android.ugc.aweme.filter.p1743b.C31427a;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31487c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43478i;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43655l.C43656a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43655l.C43657b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.utils.C47951r;
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

/* renamed from: com.ss.android.ugc.gamora.editor.s */
public final class C49457s extends C12924i implements C49548a {

    /* renamed from: n */
    public static final C49458a f124098n = new C49458a(null);

    /* renamed from: i */
    public EditViewModel f124099i;

    /* renamed from: j */
    public VEVideoPublishEditViewModel f124100j;

    /* renamed from: k */
    public EditGestureViewModel f124101k;

    /* renamed from: l */
    public VideoPublishEditModel f124102l;

    /* renamed from: m */
    public C43478i f124103m;

    /* renamed from: o */
    private EditFilterViewModel f124104o;

    /* renamed from: com.ss.android.ugc.gamora.editor.s$a */
    public static final class C49458a {
        private C49458a() {
        }

        public /* synthetic */ C49458a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.s$b */
    public static final class C49459b implements C43657b {

        /* renamed from: a */
        final /* synthetic */ C49457s f124105a;

        /* renamed from: b */
        final /* synthetic */ boolean f124106b;

        /* renamed from: c */
        final /* synthetic */ C31405ah f124107c;

        /* renamed from: d */
        final /* synthetic */ C31406ai f124108d;

        /* renamed from: a */
        public final void mo89003a() {
            Object obj;
            EditViewModel editViewModel = this.f124105a.f124099i;
            if (editViewModel == null) {
                C52711k.m112237a("editViewModel");
            }
            editViewModel.mo97033a(true, false, true);
            if (this.f124106b) {
                LiveData i = C49457s.m106699a(this.f124105a).mo110464i();
                C52711k.m112236a((Object) i, "publishEditViewModel.selectedFilter");
                C31427a aVar = (C31427a) i.getValue();
                if (aVar != null) {
                    C23089d a = C23089d.m56640a().mo47829a("enter_from", "video_edit_page").mo47829a("creation_id", C49457s.m106700b(this.f124105a).creationId).mo47829a("shoot_way", C49457s.m106700b(this.f124105a).mShootWay).mo47826a("draft_id", C49457s.m106700b(this.f124105a).draftId);
                    String str = "filter_id";
                    C31459g gVar = aVar.f82286b;
                    String str2 = null;
                    if (gVar != null) {
                        obj = Integer.valueOf(gVar.f82324a);
                    } else {
                        obj = null;
                    }
                    C23089d a2 = a.mo47828a(str, obj);
                    String str3 = "filter_name";
                    C31459g gVar2 = aVar.f82286b;
                    if (gVar2 != null) {
                        str2 = gVar2.f82325b;
                    }
                    C26890h.m65011a("adjust_filter_complete", a2.mo47829a(str3, str2).mo47828a("value", (Object) Float.valueOf(C49457s.m106700b(this.f124105a).mSelectedFilterIntensity)).f61491a);
                }
            }
        }

        /* renamed from: a */
        public final void mo89004a(C31459g gVar) {
            C52711k.m112240b(gVar, "filter");
            C47951r.m103761a(this.f124105a.f33840g_, String.valueOf(gVar.f82324a), 3);
            EditGestureViewModel editGestureViewModel = this.f124105a.f124101k;
            if (editGestureViewModel == null) {
                C52711k.m112237a("gestureViewModel");
            }
            editGestureViewModel.mo96839e().setValue(gVar);
            C49457s.m106699a(this.f124105a).mo110456a(gVar, false);
            C49457s.m106700b(this.f124105a).mSelectedId = C31487c.m73323a(C39629l.m88232a().mo58584o().mo64334d().mo64415e(), gVar);
            C49457s.m106700b(this.f124105a).mCurFilterLabels = gVar.f82326c;
            C49457s.m106700b(this.f124105a).mCurFilterIds = String.valueOf(gVar.f82324a);
            if (this.f124106b) {
                C49457s.m106700b(this.f124105a).mSelectedFilterIntensity = C31460h.m73279a(gVar, this.f124107c, this.f124108d);
            }
            C39630m.m88234a().mo58608f().mo74151a(C49457s.m106700b(this.f124105a).getAvetParameter().getContentType(), "mid_page", gVar.f82326c);
        }

        /* renamed from: a */
        public final void mo89005a(C31459g gVar, int i) {
            C31405ah ahVar = this.f124107c;
            if (gVar == null) {
                C52711k.m112234a();
            }
            ahVar.mo64305a(gVar, i);
            C49457s.m106700b(this.f124105a).mSelectedFilterIntensity = C31460h.m73278a(gVar, i, this.f124108d);
            C49457s.m106699a(this.f124105a).mo110456a(gVar, false);
        }

        C49459b(C49457s sVar, boolean z, C31405ah ahVar, C31406ai aiVar) {
            this.f124105a = sVar;
            this.f124106b = z;
            this.f124107c = ahVar;
            this.f124108d = aiVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.s$c */
    public static final class C49460c implements C43656a {

        /* renamed from: a */
        final /* synthetic */ C31405ah f124109a;

        /* renamed from: b */
        final /* synthetic */ C31406ai f124110b;

        /* renamed from: a */
        public final int mo89000a(C31459g gVar) {
            C52711k.m112240b(gVar, "filterBean");
            return this.f124109a.mo64304a(gVar, this.f124110b);
        }

        /* renamed from: b */
        public final int mo89001b(C31459g gVar) {
            C52711k.m112240b(gVar, "filterBean");
            return C31460h.m73280a(gVar, gVar.f82334k, this.f124110b);
        }

        /* renamed from: c */
        public final float mo89002c(C31459g gVar) {
            C52711k.m112240b(gVar, "filterBean");
            return C31460h.m73283b(gVar, this.f124110b);
        }

        C49460c(C31405ah ahVar, C31406ai aiVar) {
            this.f124109a = ahVar;
            this.f124110b = aiVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.s$d */
    static final class C49461d extends C52712l implements C52682m<C49548a, C52860x, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49457s f124111a;

        C49461d(C49457s sVar) {
            this.f124111a = sVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52860x xVar = (C52860x) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(xVar, "it");
            C49457s.m106701c(this.f124111a).mo88435b();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.s$e */
    static final class C49462e<T> implements C0199s<C31459g> {

        /* renamed from: a */
        final /* synthetic */ C49457s f124112a;

        C49462e(C49457s sVar) {
            this.f124112a = sVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C31459g gVar = (C31459g) obj;
            if (gVar != null) {
                C49457s.m106701c(this.f124112a).mo88433a(gVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.s$f */
    static final class C49463f<T> implements C0199s<Object> {

        /* renamed from: a */
        final /* synthetic */ C49457s f124113a;

        C49463f(C49457s sVar) {
            this.f124113a = sVar;
        }

        public final void onChanged(Object obj) {
            C49457s.m106701c(this.f124113a).mo88432a();
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
    public static final /* synthetic */ VEVideoPublishEditViewModel m106699a(C49457s sVar) {
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = sVar.f124100j;
        if (vEVideoPublishEditViewModel == null) {
            C52711k.m112237a("publishEditViewModel");
        }
        return vEVideoPublishEditViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ VideoPublishEditModel m106700b(C49457s sVar) {
        VideoPublishEditModel videoPublishEditModel = sVar.f124102l;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("model");
        }
        return videoPublishEditModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ C43478i m106701c(C49457s sVar) {
        C43478i iVar = sVar.f124103m;
        if (iVar == null) {
            C52711k.m112237a("filterModule");
        }
        return iVar;
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        C31459g gVar;
        super.mo24448e(bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            JediViewModel a = C48927d.m105736a(fragmentActivity).mo96760a(EditViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java)");
            this.f124099i = (EditViewModel) a;
            C0209x a2 = C0214z.m440a(fragmentActivity).mo359a(VEVideoPublishEditViewModel.class);
            C52711k.m112236a((Object) a2, "ViewModelProviders.of(fr…ditViewModel::class.java)");
            this.f124100j = (VEVideoPublishEditViewModel) a2;
            JediViewModel a3 = C48927d.m105736a(fragmentActivity).mo96760a(EditGestureViewModel.class);
            C52711k.m112236a((Object) a3, "JediViewModelProviders.o…ureViewModel::class.java)");
            this.f124101k = (EditGestureViewModel) a3;
            JediViewModel a4 = C48927d.m105736a(fragmentActivity).mo96760a(EditFilterViewModel.class);
            C52711k.m112236a((Object) a4, "JediViewModelProviders.o…terViewModel::class.java)");
            this.f124104o = (EditFilterViewModel) a4;
            EditViewModel editViewModel = this.f124099i;
            if (editViewModel == null) {
                C52711k.m112237a("editViewModel");
            }
            this.f124102l = editViewModel.mo97035e();
            Activity activity2 = this.f33840g_;
            if (activity2 != null) {
                AppCompatActivity appCompatActivity = (AppCompatActivity) activity2;
                Activity activity3 = this.f33840g_;
                C49460c cVar = null;
                if (!(activity3 instanceof C23441t)) {
                    activity3 = null;
                }
                C23441t tVar = (C23441t) activity3;
                View view = this.f33834b;
                if (view != null) {
                    FrameLayout frameLayout = (FrameLayout) view;
                    VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f124100j;
                    if (vEVideoPublishEditViewModel == null) {
                        C52711k.m112237a("publishEditViewModel");
                    }
                    LiveData i = vEVideoPublishEditViewModel.mo110464i();
                    C52711k.m112236a((Object) i, "publishEditViewModel.selectedFilter");
                    C31427a aVar = (C31427a) i.getValue();
                    if (aVar != null) {
                        gVar = aVar.f82286b;
                    } else {
                        gVar = null;
                    }
                    VideoPublishEditModel videoPublishEditModel = this.f124102l;
                    if (videoPublishEditModel == null) {
                        C52711k.m112237a("model");
                    }
                    C43478i iVar = new C43478i(appCompatActivity, tVar, frameLayout, gVar, videoPublishEditModel);
                    this.f124103m = iVar;
                    EditViewModel editViewModel2 = this.f124099i;
                    if (editViewModel2 == null) {
                        C52711k.m112237a("editViewModel");
                    }
                    Object value = editViewModel2.mo97028J().getValue();
                    if (value == null) {
                        C52711k.m112234a();
                    }
                    C52711k.m112236a(value, "editViewModel.filterIntensityStore.value!!");
                    C31405ah ahVar = (C31405ah) value;
                    EditViewModel editViewModel3 = this.f124099i;
                    if (editViewModel3 == null) {
                        C52711k.m112237a("editViewModel");
                    }
                    Object value2 = editViewModel3.mo97027I().getValue();
                    if (value2 == null) {
                        C52711k.m112234a();
                    }
                    C52711k.m112236a(value2, "editViewModel.filterInte…ltIntensityGetter.value!!");
                    C31406ai aiVar = (C31406ai) value2;
                    boolean a5 = C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableFilterIntensityJust);
                    C43478i iVar2 = this.f124103m;
                    if (iVar2 == null) {
                        C52711k.m112237a("filterModule");
                    }
                    iVar2.mo88434a((C43657b) new C49459b(this, a5, ahVar, aiVar));
                    C43478i iVar3 = this.f124103m;
                    if (iVar3 == null) {
                        C52711k.m112237a("filterModule");
                    }
                    if (a5) {
                        cVar = new C49460c(ahVar, aiVar);
                    }
                    iVar3.f109899j = cVar;
                    EditFilterViewModel editFilterViewModel = this.f124104o;
                    if (editFilterViewModel == null) {
                        C52711k.m112237a("filterViewModel");
                    }
                    mo49444c(editFilterViewModel, C49522t.f124251a, new C11934u(), new C49461d(this));
                    EditFilterViewModel editFilterViewModel2 = this.f124104o;
                    if (editFilterViewModel2 == null) {
                        C52711k.m112237a("filterViewModel");
                    }
                    C0184k kVar = this;
                    editFilterViewModel2.mo96827e().observe(kVar, new C49462e(this));
                    EditFilterViewModel editFilterViewModel3 = this.f124104o;
                    if (editFilterViewModel3 == null) {
                        C52711k.m112237a("filterViewModel");
                    }
                    editFilterViewModel3.mo96828f().observe(kVar, new C49463f(this));
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout");
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
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
        View inflate = layoutInflater.inflate(R.layout.ae1, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…filter, container, false)");
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
