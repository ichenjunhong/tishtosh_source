package com.p683ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
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
import com.bytedance.scene.C12924i;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.filter.C31405ah;
import com.p683ss.android.ugc.aweme.filter.C31406ai;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.C31460h;
import com.p683ss.android.ugc.aweme.filter.C31475n;
import com.p683ss.android.ugc.aweme.filter.C31475n.C31476a;
import com.p683ss.android.ugc.aweme.filter.p1743b.C31427a;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31487c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.gesture.C43866a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordGestureLayout;
import com.p683ss.android.ugc.aweme.tools.C46811b;
import com.p683ss.android.ugc.gamora.editor.C49523u.C49526a;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.VEVideoPublishEditViewModel;
import p064c.p065a.p069b.C1690c;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52855s;
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

/* renamed from: com.ss.android.ugc.gamora.editor.w */
public final class C49528w extends C12924i implements C49548a {

    /* renamed from: i */
    static final /* synthetic */ C52767h[] f124270i = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49528w.class), "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49528w.class), "filterIntensityStore", "getFilterIntensityStore()Lcom/ss/android/ugc/aweme/filter/FilterIntensityStore;"))};

    /* renamed from: p */
    public static final C49529a f124271p = new C49529a(null);

    /* renamed from: j */
    public VideoRecordGestureLayout f124272j;

    /* renamed from: k */
    public C49523u f124273k;

    /* renamed from: l */
    public EditFilterViewModel f124274l;

    /* renamed from: m */
    public VEVideoPublishEditViewModel f124275m;

    /* renamed from: n */
    public EditViewModel f124276n;

    /* renamed from: o */
    public C49527v f124277o;

    /* renamed from: q */
    private EditGestureViewModel f124278q;

    /* renamed from: r */
    private EditFilterIndicatorViewModel f124279r;

    /* renamed from: s */
    private final C52668f f124280s = C52732g.m112285a(new C49539h(this));

    /* renamed from: t */
    private final C52668f f124281t = C52732g.m112285a(C49530b.f124283a);

    /* renamed from: u */
    private final C49526a f124282u = new C49531c(this);

    /* renamed from: com.ss.android.ugc.gamora.editor.w$a */
    public static final class C49529a {
        private C49529a() {
        }

        public /* synthetic */ C49529a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.w$b */
    static final class C49530b extends C52712l implements C52670a<C31475n> {

        /* renamed from: a */
        public static final C49530b f124283a = new C49530b();

        C49530b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            String str = VEVideoPublishEditActivity.f109536b;
            C52711k.m112236a((Object) str, "VEVideoPublishEditActivi…ILTER_INTENSITY_STORE_TAG");
            return C31476a.m73313a(str);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.w$c */
    public static final class C49531c implements C49526a {

        /* renamed from: a */
        final /* synthetic */ C49528w f124284a;

        /* renamed from: com.ss.android.ugc.gamora.editor.w$c$a */
        public static final class C49532a implements C31406ai {

            /* renamed from: a */
            final /* synthetic */ C20347c f124285a;

            C49532a(C20347c cVar) {
                this.f124285a = cVar;
            }

            /* renamed from: a */
            public final float mo49450a(String str) {
                C52711k.m112240b(str, "filterPath");
                return this.f124285a.mo43025b(str);
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.w$c$b */
        public static final class C49533b implements C31406ai {

            /* renamed from: a */
            final /* synthetic */ C20347c f124286a;

            C49533b(C20347c cVar) {
                this.f124286a = cVar;
            }

            /* renamed from: a */
            public final float mo49450a(String str) {
                C52711k.m112240b(str, "filterPath");
                return this.f124286a.mo43025b(str);
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.w$c$c */
        public static final class C49534c implements C31406ai {

            /* renamed from: a */
            final /* synthetic */ C20347c f124287a;

            C49534c(C20347c cVar) {
                this.f124287a = cVar;
            }

            /* renamed from: a */
            public final float mo49450a(String str) {
                C52711k.m112240b(str, "filterPath");
                return this.f124287a.mo43025b(str);
            }
        }

        C49531c(C49528w wVar) {
            this.f124284a = wVar;
        }

        /* renamed from: a */
        public final void mo97453a(C31459g gVar) {
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f124284a.f124275m;
            if (vEVideoPublishEditViewModel == null) {
                C52711k.m112237a("publishEditViewModel");
            }
            vEVideoPublishEditViewModel.mo110456a(gVar, false);
            EditFilterViewModel editFilterViewModel = this.f124284a.f124274l;
            if (editFilterViewModel == null) {
                C52711k.m112237a("editFilterViewModel");
            }
            editFilterViewModel.mo96827e().setValue(gVar);
            if (gVar != null) {
                this.f124284a.mo97462F().mSelectedId = C31487c.m73323a(C39629l.m88232a().mo58584o().mo64334d().mo64415e(), gVar);
                this.f124284a.mo97462F().mCurFilterLabels = gVar.f82326c;
                this.f124284a.mo97462F().mCurFilterIds = String.valueOf(gVar.f82324a);
                C20347c cVar = (C20347c) C49528w.m106870c(this.f124284a).mo97038h().getValue();
                if (cVar != null) {
                    this.f124284a.mo97462F().mSelectedFilterIntensity = C31460h.m73279a(gVar, (C31405ah) this.f124284a.mo97463G(), (C31406ai) new C49532a(cVar));
                }
                VideoPublishEditModel F = this.f124284a.mo97462F();
                String str = gVar.f82326c;
                int i = gVar.f82324a;
                C52711k.m112240b(F, "model");
                C26890h.m65011a("select_filter", C23089d.m56640a().mo47829a("creation_id", F.creationId).mo47829a("shoot_way", F.mShootWay).mo47826a("draft_id", F.draftId).mo47829a("enter_method", "slide").mo47829a("enter_from", "video_edit_page").mo47829a("filter_name", str).mo47826a("filter_id", i).f61491a);
                C39630m.m88234a().mo58608f().mo74151a(this.f124284a.mo97462F().getAvetParameter().getContentType(), "mid_page", gVar.f82326c);
            }
        }

        /* renamed from: a */
        public final void mo97454a(C31459g gVar, C31459g gVar2, float f) {
            if (gVar != null && gVar2 != null) {
                C20347c cVar = (C20347c) C49528w.m106870c(this.f124284a).mo97038h().getValue();
                if (cVar != null) {
                    if (C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableFilterIntensityJust)) {
                        cVar.mo43004a(gVar.f82332i, gVar2.f82332i, f, C31460h.m73279a(gVar, (C31405ah) this.f124284a.mo97463G(), (C31406ai) new C49533b(cVar)), C31460h.m73279a(gVar2, (C31405ah) this.f124284a.mo97463G(), (C31406ai) new C49534c(cVar)));
                    } else {
                        cVar.mo43003a(gVar.f82332i, gVar2.f82332i, f);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.w$d */
    static final class C49535d extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49528w f124288a;

        C49535d(C49528w wVar) {
            this.f124288a = wVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            C49528w.m106868a(this.f124288a).f124256e = booleanValue;
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.w$e */
    static final class C49536e<T> implements C0199s<C31459g> {

        /* renamed from: a */
        final /* synthetic */ C49528w f124289a;

        C49536e(C49528w wVar) {
            this.f124289a = wVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C49528w.m106868a(this.f124289a).mo97448a(false, (C31459g) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.w$f */
    static final class C49537f extends C52712l implements C52682m<C49548a, C52847n<? extends Float, ? extends Long>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49528w f124290a;

        C49537f(C49528w wVar) {
            this.f124290a = wVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52847n nVar = (C52847n) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(nVar, "it");
            C49142as.m106091a(C49528w.m106869b(this.f124290a), ((Number) nVar.getFirst()).floatValue(), ((Number) nVar.getSecond()).longValue());
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.w$g */
    static final class C49538g extends C52712l implements C52682m<C49548a, C52855s<? extends Float, ? extends Float, ? extends Float>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49528w f124291a;

        C49538g(C49528w wVar) {
            this.f124291a = wVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52855s sVar = (C52855s) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(sVar, "it");
            C49142as.m106090a(C49528w.m106869b(this.f124291a), ((Number) sVar.getFirst()).floatValue(), ((Number) sVar.getSecond()).floatValue(), ((Number) sVar.getThird()).floatValue());
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.w$h */
    static final class C49539h extends C52712l implements C52670a<VideoPublishEditModel> {

        /* renamed from: a */
        final /* synthetic */ C49528w f124292a;

        C49539h(C49528w wVar) {
            this.f124292a = wVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C49528w.m106870c(this.f124292a).mo97035e();
        }
    }

    /* renamed from: F */
    public final VideoPublishEditModel mo97462F() {
        return (VideoPublishEditModel) this.f124280s.getValue();
    }

    /* renamed from: G */
    public final C31475n mo97463G() {
        return (C31475n) this.f124281t.getValue();
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
    public static final /* synthetic */ C49523u m106868a(C49528w wVar) {
        C49523u uVar = wVar.f124273k;
        if (uVar == null) {
            C52711k.m112237a("editGestureHelper");
        }
        return uVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ VideoRecordGestureLayout m106869b(C49528w wVar) {
        VideoRecordGestureLayout videoRecordGestureLayout = wVar.f124272j;
        if (videoRecordGestureLayout == null) {
            C52711k.m112237a("editGestureLayout");
        }
        return videoRecordGestureLayout;
    }

    /* renamed from: c */
    public static final /* synthetic */ EditViewModel m106870c(C49528w wVar) {
        EditViewModel editViewModel = wVar.f124276n;
        if (editViewModel == null) {
            C52711k.m112237a("editViewModel");
        }
        return editViewModel;
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        C31459g gVar;
        int i;
        super.mo24448e(bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            C0209x a = C0214z.m440a((FragmentActivity) activity).mo359a(VEVideoPublishEditViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…ditViewModel::class.java]");
            this.f124275m = (VEVideoPublishEditViewModel) a;
            Activity activity2 = this.f33840g_;
            if (activity2 != null) {
                JediViewModel a2 = C48927d.m105736a((FragmentActivity) activity2).mo96760a(EditFilterIndicatorViewModel.class);
                C52711k.m112236a((Object) a2, "JediViewModelProviders.o…torViewModel::class.java]");
                this.f124279r = (EditFilterIndicatorViewModel) a2;
                Activity activity3 = this.f33840g_;
                if (activity3 != null) {
                    JediViewModel a3 = C48927d.m105736a((FragmentActivity) activity3).mo96760a(EditGestureViewModel.class);
                    C52711k.m112236a((Object) a3, "JediViewModelProviders.o…ureViewModel::class.java)");
                    this.f124278q = (EditGestureViewModel) a3;
                    Activity activity4 = this.f33840g_;
                    if (activity4 != null) {
                        JediViewModel a4 = C48927d.m105736a((FragmentActivity) activity4).mo96760a(EditFilterViewModel.class);
                        C52711k.m112236a((Object) a4, "JediViewModelProviders.o…terViewModel::class.java)");
                        this.f124274l = (EditFilterViewModel) a4;
                        Activity activity5 = this.f33840g_;
                        if (activity5 != null) {
                            JediViewModel a5 = C48927d.m105736a((FragmentActivity) activity5).mo96760a(EditViewModel.class);
                            C52711k.m112236a((Object) a5, "JediViewModelProviders.o…ditViewModel::class.java)");
                            this.f124276n = (EditViewModel) a5;
                            C0184k kVar = this;
                            VideoRecordGestureLayout videoRecordGestureLayout = this.f124272j;
                            if (videoRecordGestureLayout == null) {
                                C52711k.m112237a("editGestureLayout");
                            }
                            EditFilterIndicatorViewModel editFilterIndicatorViewModel = this.f124279r;
                            if (editFilterIndicatorViewModel == null) {
                                C52711k.m112237a("filterIndicatorViewModel");
                            }
                            VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f124275m;
                            if (vEVideoPublishEditViewModel == null) {
                                C52711k.m112237a("publishEditViewModel");
                            }
                            LiveData i2 = vEVideoPublishEditViewModel.mo110464i();
                            C52711k.m112236a((Object) i2, "publishEditViewModel.selectedFilter");
                            C31427a aVar = (C31427a) i2.getValue();
                            if (aVar != null) {
                                gVar = aVar.f82286b;
                            } else {
                                gVar = null;
                            }
                            C31459g gVar2 = gVar;
                            EditGestureViewModel editGestureViewModel = this.f124278q;
                            if (editGestureViewModel == null) {
                                C52711k.m112237a("gestureViewModel");
                            }
                            C49523u uVar = new C49523u(kVar, videoRecordGestureLayout, editFilterIndicatorViewModel, gVar2, editGestureViewModel);
                            this.f124273k = uVar;
                            C49523u uVar2 = this.f124273k;
                            if (uVar2 == null) {
                                C52711k.m112237a("editGestureHelper");
                            }
                            uVar2.f124253b = this.f124282u;
                            C49523u uVar3 = this.f124273k;
                            if (uVar3 == null) {
                                C52711k.m112237a("editGestureHelper");
                            }
                            C49527v vVar = this.f124277o;
                            if (vVar == null) {
                                C52711k.m112237a("editGestureListenerManager");
                            }
                            uVar3.mo97447a((C43866a) vVar);
                            VideoRecordGestureLayout videoRecordGestureLayout2 = this.f124272j;
                            if (videoRecordGestureLayout2 == null) {
                                C52711k.m112237a("editGestureLayout");
                            }
                            LayoutParams layoutParams = videoRecordGestureLayout2.getLayoutParams();
                            int b = C43303dy.m94971b(this.f33840g_);
                            if (C46811b.m101654a(this.f33840g_)) {
                                i = 0;
                            } else {
                                i = (int) C9432q.m18687b((Context) this.f33840g_, 50.0f);
                            }
                            int i3 = b + i;
                            int e = C43303dy.m94974e(this.f33840g_) + ((int) C9432q.m18687b((Context) this.f33840g_, 50.0f));
                            if (layoutParams == null) {
                                layoutParams = new LayoutParams(i3, e);
                            } else {
                                layoutParams.width = i3;
                                layoutParams.height = e;
                            }
                            videoRecordGestureLayout2.setLayoutParams(layoutParams);
                            videoRecordGestureLayout2.setSloppyExtra(C23728o.m58241a(150.0d));
                            EditGestureViewModel editGestureViewModel2 = this.f124278q;
                            if (editGestureViewModel2 == null) {
                                C52711k.m112237a("gestureViewModel");
                            }
                            mo49443b(editGestureViewModel2, C49540x.f124293a, new C11934u(), new C49535d(this));
                            EditGestureViewModel editGestureViewModel3 = this.f124278q;
                            if (editGestureViewModel3 == null) {
                                C52711k.m112237a("gestureViewModel");
                            }
                            editGestureViewModel3.mo96839e().observe(kVar, new C49536e(this));
                            EditGestureViewModel editGestureViewModel4 = this.f124278q;
                            if (editGestureViewModel4 == null) {
                                C52711k.m112237a("gestureViewModel");
                            }
                            mo49444c(editGestureViewModel4, C49541y.f124294a, new C11934u(), new C49537f(this));
                            EditGestureViewModel editGestureViewModel5 = this.f124278q;
                            if (editGestureViewModel5 == null) {
                                C52711k.m112237a("gestureViewModel");
                            }
                            mo49444c(editGestureViewModel5, C49542z.f124295a, new C11934u(), new C49538g(this));
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
        View inflate = layoutInflater.inflate(R.layout.ae3, viewGroup, false);
        if (inflate != null) {
            this.f124272j = (VideoRecordGestureLayout) inflate;
            VideoRecordGestureLayout videoRecordGestureLayout = this.f124272j;
            if (videoRecordGestureLayout == null) {
                C52711k.m112237a("editGestureLayout");
            }
            return videoRecordGestureLayout;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordGestureLayout");
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
