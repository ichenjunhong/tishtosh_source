package com.p683ss.android.ugc.aweme.shortvideo.cut.scene;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
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
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.C43120d;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoeditv2.C43155d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2192d.C43457b;
import com.p683ss.android.ugc.aweme.utils.C47660aa;
import com.p683ss.android.ugc.gamora.editor.C49444m;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2458b.C48924a;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ar */
public final class C42798ar extends C48924a implements C49548a {

    /* renamed from: o */
    static final /* synthetic */ C52767h[] f108220o = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C42798ar.class), "bottomBarScene", "getBottomBarScene()Lcom/ss/android/ugc/aweme/shortvideo/cut/scene/CutVideoBottomBarScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C42798ar.class), "videoEditScene", "getVideoEditScene()Lcom/ss/android/ugc/aweme/shortvideo/cut/scene/CutVideoEditScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C42798ar.class), "cornerScene", "getCornerScene()Lcom/ss/android/ugc/gamora/editor/EditCornerScene;"))};

    /* renamed from: s */
    public static final C42799a f108221s = new C42799a(null);

    /* renamed from: p */
    public VECutVideoPresenter f108222p;

    /* renamed from: q */
    public C42873bn f108223q;

    /* renamed from: r */
    public CutMultiVideoViewModel f108224r;

    /* renamed from: t */
    private VideoEditViewModel f108225t;

    /* renamed from: u */
    private CutVideoPreviewViewModel f108226u;

    /* renamed from: v */
    private CutVideoViewModel f108227v;

    /* renamed from: w */
    private final C52668f f108228w = C52732g.m112285a(new C42800b(this));

    /* renamed from: x */
    private final C52668f f108229x = C52732g.m112285a(new C42808i(this));

    /* renamed from: y */
    private final C52668f f108230y = C52732g.m112285a(new C42801c(this));

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ar$a */
    public static final class C42799a {
        private C42799a() {
        }

        public /* synthetic */ C42799a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ar$b */
    static final class C42800b extends C52712l implements C52670a<C42880d> {

        /* renamed from: a */
        final /* synthetic */ C42798ar f108231a;

        C42800b(C42798ar arVar) {
            this.f108231a = arVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C42880d dVar = new C42880d();
            dVar.mo87334a(this.f108231a.mo87252J());
            C42873bn bnVar = this.f108231a.f108223q;
            if (bnVar == null) {
                C52711k.m112237a("previewEditCallback");
            }
            dVar.mo87335a(bnVar);
            this.f108231a.mo24389a((int) R.id.evz, (C12924i) dVar, "CutVideoBottomBarScene");
            return dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ar$c */
    static final class C42801c extends C52712l implements C52670a<C49444m> {

        /* renamed from: a */
        final /* synthetic */ C42798ar f108232a;

        C42801c(C42798ar arVar) {
            this.f108232a = arVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C49444m mVar = new C49444m();
            this.f108232a.mo24389a((int) R.id.evz, (C12924i) mVar, "EditCornerScene");
            return mVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ar$d */
    static final class C42802d<T> implements C2205y<MediaModel> {

        /* renamed from: a */
        final /* synthetic */ C42798ar f108233a;

        /* renamed from: b */
        final /* synthetic */ String f108234b;

        C42802d(C42798ar arVar, String str) {
            this.f108233a = arVar;
            this.f108234b = str;
        }

        public final void subscribe(C2204x<MediaModel> xVar) {
            C52711k.m112240b(xVar, "emitter");
            String str = this.f108234b;
            CutMultiVideoViewModel cutMultiVideoViewModel = this.f108233a.f108224r;
            if (cutMultiVideoViewModel == null) {
                C52711k.m112237a("cutMultiVideoViewModel");
            }
            MediaModel a = C43155d.m94694a(str, cutMultiVideoViewModel);
            if (a != null) {
                xVar.mo6282a(a);
            }
            xVar.mo6273a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ar$e */
    static final class C42803e<T> implements C1710e<MediaModel> {

        /* renamed from: a */
        final /* synthetic */ C42798ar f108235a;

        C42803e(C42798ar arVar) {
            this.f108235a = arVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            MediaModel mediaModel = (MediaModel) obj;
            C52711k.m112236a((Object) mediaModel, "it");
            if (mediaModel.f95386e > 60000 && C47660aa.m103162a(false)) {
                this.f108235a.mo87254L().mo87345G().post(new Runnable(this) {

                    /* renamed from: a */
                    final /* synthetic */ C42803e f108236a;

                    {
                        this.f108236a = r1;
                    }

                    public final void run() {
                        Activity v = this.f108236a.f108235a.mo24477v();
                        C52711k.m112236a((Object) v, "requireActivity()");
                        View startSlide = this.f108236a.f108235a.mo87254L().mo87345G().getStartSlide();
                        C52711k.m112236a((Object) startSlide, "videoEditScene.videoEditView.startSlide");
                        C47660aa.m103161a(v, startSlide, false);
                    }
                });
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ar$f */
    static final class C42805f<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C42805f f108237a = new C42805f();

        C42805f() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ar$g */
    static final class C42806g implements C1706a {

        /* renamed from: a */
        public static final C42806g f108238a = new C42806g();

        C42806g() {
        }

        /* renamed from: a */
        public final void mo6199a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ar$h */
    static final class C42807h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42798ar f108239a;

        C42807h(C42798ar arVar) {
            this.f108239a = arVar;
        }

        public final void run() {
            Activity v = this.f108239a.mo24477v();
            C52711k.m112236a((Object) v, "requireActivity()");
            View startSlide = this.f108239a.mo87254L().mo87345G().getStartSlide();
            C52711k.m112236a((Object) startSlide, "videoEditScene.videoEditView.startSlide");
            C47660aa.m103161a(v, startSlide, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ar$i */
    static final class C42808i extends C52712l implements C52670a<C42907m> {

        /* renamed from: a */
        final /* synthetic */ C42798ar f108240a;

        C42808i(C42798ar arVar) {
            this.f108240a = arVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C42907m mVar = new C42907m(false, true, 1, null);
            mVar.mo87347a(this.f108240a.mo87252J());
            this.f108240a.mo24389a((int) R.id.evz, (C12924i) mVar, "CutVideoEditScene");
            return mVar;
        }
    }

    /* renamed from: K */
    public final C42880d mo87253K() {
        return (C42880d) this.f108228w.getValue();
    }

    /* renamed from: L */
    public final C42907m mo87254L() {
        return (C42907m) this.f108229x.getValue();
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

    /* renamed from: J */
    public final VECutVideoPresenter mo87252J() {
        VECutVideoPresenter vECutVideoPresenter = this.f108222p;
        if (vECutVideoPresenter == null) {
            C52711k.m112237a("presenter");
        }
        return vECutVideoPresenter;
    }

    /* renamed from: M */
    public final C43120d mo87255M() {
        return mo87254L().mo87345G();
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        boolean z;
        super.mo24448e(bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            JediViewModel a = C48927d.m105736a((FragmentActivity) activity).mo96760a(CutVideoViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…deoViewModel::class.java]");
            this.f108227v = (CutVideoViewModel) a;
            Activity activity2 = this.f33840g_;
            if (activity2 != null) {
                C0209x a2 = C0214z.m440a((FragmentActivity) activity2).mo359a(VideoEditViewModel.class);
                C52711k.m112236a((Object) a2, "ViewModelProviders.of(ac…ditViewModel::class.java)");
                this.f108225t = (VideoEditViewModel) a2;
                Activity activity3 = this.f33840g_;
                if (activity3 != null) {
                    JediViewModel a3 = C48927d.m105736a((FragmentActivity) activity3).mo96760a(CutVideoPreviewViewModel.class);
                    C52711k.m112236a((Object) a3, "JediViewModelProviders.o…iewViewModel::class.java)");
                    this.f108226u = (CutVideoPreviewViewModel) a3;
                    Activity activity4 = this.f33840g_;
                    if (activity4 != null) {
                        C0209x a4 = C0214z.m440a((FragmentActivity) activity4).mo359a(CutMultiVideoViewModel.class);
                        C52711k.m112236a((Object) a4, "ViewModelProviders.of(ac…deoViewModel::class.java]");
                        this.f108224r = (CutMultiVideoViewModel) a4;
                        View view = mo87253K().f33834b;
                        C52711k.m112236a((Object) view, "bottomBarScene.view");
                        LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams != null) {
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                            layoutParams2.gravity = 80;
                            View view2 = mo87253K().f33834b;
                            C52711k.m112236a((Object) view2, "bottomBarScene.view");
                            view2.setLayoutParams(layoutParams2);
                            View view3 = mo87254L().f33834b;
                            C52711k.m112236a((Object) view3, "videoEditScene.view");
                            LayoutParams layoutParams3 = view3.getLayoutParams();
                            if (layoutParams3 != null) {
                                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                                layoutParams4.gravity = 80;
                                View view4 = mo87254L().f33834b;
                                C52711k.m112236a((Object) view4, "videoEditScene.view");
                                view4.setLayoutParams(layoutParams4);
                                if (C43457b.m95263a()) {
                                    CutVideoViewModel cutVideoViewModel = this.f108227v;
                                    if (cutVideoViewModel == null) {
                                        C52711k.m112237a("cutVideoViewModel");
                                    }
                                    String str = cutVideoViewModel.mo87177f().f108059b;
                                    if (str != null) {
                                        if (str.length() > 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (z) {
                                            C2201v.m6601a((C2205y<T>) new C42802d<T>(this, str)).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6506a((C1710e<? super T>) new C42803e<Object>(this), (C1710e<? super Throwable>) C42805f.f108237a, (C1706a) C42806g.f108238a);
                                            return;
                                        }
                                    }
                                    CutVideoViewModel cutVideoViewModel2 = this.f108227v;
                                    if (cutVideoViewModel2 == null) {
                                        C52711k.m112237a("cutVideoViewModel");
                                    }
                                    Iterable<MediaModel> iterable = cutVideoViewModel2.mo87177f().f108058a;
                                    Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                                    for (MediaModel mediaModel : iterable) {
                                        arrayList.add(Long.valueOf(mediaModel.f95386e));
                                    }
                                    if (C52575l.m112150m((List) arrayList) > 60000 && C47660aa.m103162a(false)) {
                                        mo87254L().mo87345G().post(new C42807h(this));
                                    }
                                }
                                return;
                            }
                            throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        }
                        throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
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
    public final void mo24463a(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.mo24463a(view, bundle);
        mo24409d((C12924i) mo87253K());
        mo24409d((C12924i) mo87254L());
        mo24409d((C12924i) (C49444m) this.f108230y.getValue());
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
        View inflate = layoutInflater.inflate(R.layout.br1, viewGroup, false);
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
