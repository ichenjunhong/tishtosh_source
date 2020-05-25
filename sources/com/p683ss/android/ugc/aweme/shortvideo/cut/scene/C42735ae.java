package com.p683ss.android.ugc.aweme.shortvideo.cut.scene;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0794k;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.apm.p501q.C9190h;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
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
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42650i;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C43099t;
import com.p683ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43036f;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43047h;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2183c.C43018b;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2183c.C43024h;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointVideoSegView;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.C43120d;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.viewmodel.C43168a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2192d.C43457b;
import com.p683ss.android.ugc.aweme.shortvideo.p2264x.C45623a;
import com.p683ss.android.ugc.aweme.utils.C47660aa;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2458b.C48924a;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.p683ss.android.vesdk.C50720o.C50743d;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p064c.p065a.p069b.C1690c;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ae */
public final class C42735ae extends C48924a implements C49548a {

    /* renamed from: F */
    public static final C42736a f108081F = new C42736a(null);

    /* renamed from: o */
    static final /* synthetic */ C52767h[] f108082o = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C42735ae.class), "multiModeScene", "getMultiModeScene()Lcom/ss/android/ugc/aweme/shortvideo/cut/scene/CutVideoMultiModeScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C42735ae.class), "videoEditScene", "getVideoEditScene()Lcom/ss/android/ugc/aweme/shortvideo/cut/scene/CutVideoEditScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C42735ae.class), "videoListScene", "getVideoListScene()Lcom/ss/android/ugc/aweme/shortvideo/cut/scene/CutVideoListScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C42735ae.class), "stickPointMusicScene", "getStickPointMusicScene()Lcom/ss/android/ugc/aweme/shortvideo/cut/scene/CutVideoStickPointMusicScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C42735ae.class), "bottomBarScene", "getBottomBarScene()Lcom/ss/android/ugc/aweme/shortvideo/cut/scene/CutVideoBottomBarScene;"))};

    /* renamed from: A */
    public View f108083A;

    /* renamed from: B */
    public View f108084B;

    /* renamed from: C */
    public View f108085C;

    /* renamed from: D */
    public boolean f108086D;

    /* renamed from: E */
    public boolean f108087E;

    /* renamed from: G */
    private CutVideoMultiModeViewModel f108088G;

    /* renamed from: H */
    private CutVideoListViewModel f108089H;

    /* renamed from: I */
    private ObjectAnimator f108090I;

    /* renamed from: J */
    private boolean f108091J;

    /* renamed from: K */
    private final C52668f f108092K = C52732g.m112285a(new C42742g(this));

    /* renamed from: L */
    private final C52668f f108093L = C52732g.m112285a(new C42753p(this));

    /* renamed from: M */
    private final C52668f f108094M = C52732g.m112285a(new C42754q(this));

    /* renamed from: N */
    private final C52668f f108095N = C52732g.m112285a(new C42749m(this));

    /* renamed from: O */
    private final C52668f f108096O = C52732g.m112285a(new C42739d(this));

    /* renamed from: p */
    public C42820ax f108097p;

    /* renamed from: q */
    public VECutVideoPresenter f108098q;

    /* renamed from: r */
    public C42873bn f108099r;

    /* renamed from: s */
    public CutVideoViewModel f108100s;

    /* renamed from: t */
    public VideoEditViewModel f108101t;

    /* renamed from: u */
    public VEVideoCutterViewModel f108102u;

    /* renamed from: v */
    public CutVideoPreviewViewModel f108103v;

    /* renamed from: w */
    public CutVideoStickerPointMusicViewModel f108104w;

    /* renamed from: x */
    public CutVideoMultiBottomViewModel f108105x;

    /* renamed from: y */
    public CutVideoEditViewModel f108106y;

    /* renamed from: z */
    public View f108107z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ae$a */
    public static final class C42736a {
        private C42736a() {
        }

        public /* synthetic */ C42736a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ae$b */
    public static final class C42737b implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C42735ae f108108a;

        /* renamed from: b */
        final /* synthetic */ boolean f108109b;

        /* renamed from: c */
        final /* synthetic */ C52671b f108110c;

        public final void onAnimationRepeat(Animator animator) {
            C52711k.m112240b(animator, "animator");
        }

        public final void onAnimationCancel(Animator animator) {
            C52711k.m112240b(animator, "animator");
            onAnimationEnd(animator);
        }

        public final void onAnimationStart(Animator animator) {
            C52711k.m112240b(animator, "animator");
            C42735ae.m93739e(this.f108108a).setVisibility(0);
            C42735ae.m93740f(this.f108108a).setVisibility(0);
            C42735ae.m93741g(this.f108108a).mo87155c(true);
        }

        public final void onAnimationEnd(Animator animator) {
            C52711k.m112240b(animator, "animator");
            if (this.f108109b) {
                C42735ae.m93741g(this.f108108a).mo87155c(false);
            } else {
                C42735ae.m93739e(this.f108108a).setVisibility(8);
                C42735ae.m93740f(this.f108108a).setVisibility(8);
                View view = this.f108108a.f108107z;
                if (view == null) {
                    C52711k.m112237a("layoutBottom");
                }
                view.setTranslationY(0.0f);
            }
            CutVideoPreviewViewModel cutVideoPreviewViewModel = this.f108108a.f108103v;
            if (cutVideoPreviewViewModel == null) {
                C52711k.m112237a("previewViewModel");
            }
            cutVideoPreviewViewModel.mo87116g().setValue(Boolean.valueOf(this.f108109b));
            if (!this.f108109b) {
                C42735ae.m93741g(this.f108108a).mo87154b(true);
                C42820ax axVar = this.f108108a.f108097p;
                if (axVar != null) {
                    axVar.mo87269e();
                }
            }
            C52671b bVar = this.f108110c;
            if (bVar != null) {
                bVar.invoke(Boolean.valueOf(this.f108109b));
            }
        }

        C42737b(C42735ae aeVar, boolean z, C52671b bVar) {
            this.f108108a = aeVar;
            this.f108109b = z;
            this.f108110c = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ae$c */
    static final class C42738c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C42735ae f108111a;

        /* renamed from: b */
        final /* synthetic */ boolean f108112b;

        /* renamed from: c */
        final /* synthetic */ float f108113c;

        C42738c(C42735ae aeVar, boolean z, float f) {
            this.f108111a = aeVar;
            this.f108112b = z;
            this.f108113c = f;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C52711k.m112236a((Object) valueAnimator, "valueAnimator");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                if (this.f108112b) {
                    float f = 1.0f - (floatValue / this.f108113c);
                    C42735ae.m93739e(this.f108111a).setAlpha(f);
                    C42735ae.m93740f(this.f108111a).setAlpha(f);
                } else {
                    float f2 = 1.0f - (floatValue / this.f108113c);
                    C42735ae.m93739e(this.f108111a).setAlpha(f2);
                    C42735ae.m93740f(this.f108111a).setAlpha(f2);
                }
                CutVideoMultiBottomViewModel cutVideoMultiBottomViewModel = this.f108111a.f108105x;
                if (cutVideoMultiBottomViewModel == null) {
                    C52711k.m112237a("multiBottomViewModel");
                }
                cutVideoMultiBottomViewModel.mo87081e().setValue(new C52847n(Boolean.valueOf(this.f108112b), Float.valueOf(floatValue)));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ae$d */
    static final class C42739d extends C52712l implements C52670a<C42880d> {

        /* renamed from: a */
        final /* synthetic */ C42735ae f108114a;

        C42739d(C42735ae aeVar) {
            this.f108114a = aeVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C42880d dVar = new C42880d();
            dVar.mo87334a(this.f108114a.mo87191J());
            dVar.f108361i = this.f108114a.f108097p;
            dVar.mo87335a(this.f108114a.mo87192K());
            this.f108114a.mo24389a((int) R.id.d3s, (C12924i) dVar, "CutVideoBottomBarScene");
            return dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ae$e */
    public static final class C42740e implements C43024h {

        /* renamed from: a */
        final /* synthetic */ C42735ae f108115a;

        /* renamed from: c */
        public final List<VideoSegment> mo87217c() {
            List<VideoSegment> l = C42735ae.m93735a(this.f108115a).mo87634l();
            C52711k.m112236a((Object) l, "videoEditViewModel.originVideoList");
            return l;
        }

        /* renamed from: a */
        public final void mo87213a() {
            C42735ae.m93737c(this.f108115a).mo87731a(new C43168a(1, false, 2, null));
        }

        /* renamed from: b */
        public final void mo87216b() {
            this.f108115a.mo87191J().mo86817a(C42735ae.m93735a(this.f108115a).mo87634l(), false);
        }

        C42740e(C42735ae aeVar) {
            this.f108115a = aeVar;
        }

        /* renamed from: a */
        public final void mo87214a(List<? extends VideoSegment> list) {
            this.f108115a.mo87191J().mo86816a(list, C42735ae.m93735a(this.f108115a).mo87634l().size());
        }

        /* renamed from: a */
        public final void mo87215a(boolean z, boolean z2) {
            VECutVideoPresenter J = this.f108115a.mo87191J();
            J.f107690d = z;
            J.f107700n.f108714c = z;
            C42650i iVar = J.f107695i;
            if (iVar != null) {
                iVar.mo86926d(z);
            }
            J.f107701o.f112173b = z;
            if (z2) {
                this.f108115a.mo87191J().mo86817a(C42735ae.m93735a(this.f108115a).mo87634l(), !z);
            }
            if (z) {
                this.f108115a.mo87195N().f108485Y = false;
                C43099t tVar = this.f108115a.mo87195N().f108489i;
                if (tVar == null) {
                    C52711k.m112234a();
                }
                tVar.f108807b = 0;
                StickPointVideoSegView stickPointVideoSegView = this.f108115a.mo87195N().f108496p;
                if (stickPointVideoSegView == null) {
                    C52711k.m112237a("stickPointVideoTitleView");
                }
                stickPointVideoSegView.setVisibility(0);
                this.f108115a.mo24409d((C12924i) this.f108115a.mo87196O());
                this.f108115a.mo24404c((C12924i) this.f108115a.mo87197P());
                this.f108115a.mo24404c((C12924i) this.f108115a.mo87194M());
                this.f108115a.mo24404c((C12924i) this.f108115a.mo87195N());
                return;
            }
            if (z2) {
                VECutVideoPresenter J2 = this.f108115a.mo87191J();
                C0794k playBoundary = this.f108115a.mo87194M().mo87345G().getPlayBoundary();
                C52711k.m112236a((Object) playBoundary, "videoEditScene.videoEditView.playBoundary");
                J2.mo86813a(playBoundary);
                VEVideoCutterViewModel c = C42735ae.m93737c(this.f108115a);
                F f = this.f108115a.mo87194M().mo87345G().getPlayBoundary().f2711a;
                if (f == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) f, "videoEditScene.videoEditView.playBoundary.first!!");
                c.mo87731a(new C43168a(3, ((Number) f).longValue(), C50743d.EDITOR_SEEK_FLAG_LastSeek));
            } else {
                C42735ae.m93737c(this.f108115a).mo87731a(new C43168a(1, false));
            }
            this.f108115a.mo87195N().f108485Y = C42735ae.m93736b(this.f108115a).mo87179h();
            StickPointVideoSegView stickPointVideoSegView2 = this.f108115a.mo87195N().f108496p;
            if (stickPointVideoSegView2 == null) {
                C52711k.m112237a("stickPointVideoTitleView");
            }
            stickPointVideoSegView2.setVisibility(8);
            this.f108115a.mo24409d((C12924i) this.f108115a.mo87197P());
            this.f108115a.mo24409d((C12924i) this.f108115a.mo87194M());
            this.f108115a.mo24409d((C12924i) this.f108115a.mo87195N());
            this.f108115a.mo24404c((C12924i) this.f108115a.mo87196O());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ae$f */
    public static final class C42741f implements C42809as {

        /* renamed from: a */
        final /* synthetic */ C42735ae f108116a;

        /* renamed from: a */
        public final void mo87218a() {
            C42735ae.m93738d(this.f108116a).mo87040c(false);
            this.f108116a.mo87207b(false);
        }

        /* renamed from: b */
        public final void mo87219b() {
            C42820ax axVar = this.f108116a.f108097p;
            if (axVar == null) {
                C52711k.m112234a();
            }
            if (axVar.mo87270f()) {
                C42735ae.m93738d(this.f108116a).mo87040c(true);
            }
            this.f108116a.mo87207b(true);
        }

        C42741f(C42735ae aeVar) {
            this.f108116a = aeVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ae$g */
    static final class C42742g extends C52712l implements C52670a<C42755af> {

        /* renamed from: a */
        final /* synthetic */ C42735ae f108117a;

        C42742g(C42735ae aeVar) {
            this.f108117a = aeVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C42755af afVar = new C42755af();
            C42820ax axVar = this.f108117a.f108097p;
            if (axVar == null) {
                C52711k.m112234a();
            }
            C52711k.m112240b(axVar, "<set-?>");
            afVar.f108136i = axVar;
            this.f108117a.mo24389a((int) R.id.ele, (C12924i) afVar, "CutVideoMultiModeScene");
            return afVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ae$h */
    public static final class C42743h implements C43018b {

        /* renamed from: a */
        final /* synthetic */ C42735ae f108118a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ae$h$a */
        static final class C42744a extends C52712l implements C52671b<Boolean, C52860x> {

            /* renamed from: a */
            final /* synthetic */ C42743h f108119a;

            C42744a(C42743h hVar) {
                this.f108119a = hVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    this.f108119a.f108118a.mo87198Q();
                }
                return C52860x.f131107a;
            }
        }

        C42743h(C42735ae aeVar) {
            this.f108118a = aeVar;
        }

        /* renamed from: a */
        public final void mo87220a(int i) {
            if (i == 1) {
                if (!this.f108118a.f108086D) {
                    C43047h.f108667g.mo87424a(C42735ae.m93735a(this.f108118a).mo87634l());
                    this.f108118a.f108086D = true;
                }
                this.f108118a.mo87206a(false, null);
                return;
            }
            if (!this.f108118a.f108087E) {
                C43047h.f108667g.mo87427b(C42735ae.m93735a(this.f108118a).mo87634l());
                this.f108118a.f108087E = true;
            }
            this.f108118a.mo87205a((C52671b<? super Boolean, C52860x>) new C42744a<Object,C52860x>(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ae$i */
    public static final class C42745i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42735ae f108120a;

        C42745i(C42735ae aeVar) {
            this.f108120a = aeVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C43047h.f108667g.mo87425a(C42735ae.m93735a(this.f108120a).mo87634l(), "exit_clip_popup_cancel", this.f108120a.mo87201T());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ae$j */
    static final class C42746j implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42735ae f108121a;

        C42746j(C42735ae aeVar) {
            this.f108121a = aeVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f108121a.mo87200S();
            C43047h.f108667g.mo87425a(C42735ae.m93735a(this.f108121a).mo87634l(), "exit_clip_popup_confirm", this.f108121a.mo87201T());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ae$k */
    static final class C42747k implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C42735ae f108122a;

        /* renamed from: b */
        final /* synthetic */ int f108123b;

        /* renamed from: c */
        final /* synthetic */ float f108124c;

        /* renamed from: d */
        final /* synthetic */ LayoutParams f108125d;

        /* renamed from: e */
        final /* synthetic */ boolean f108126e;

        C42747k(C42735ae aeVar, int i, float f, LayoutParams layoutParams, boolean z) {
            this.f108122a = aeVar;
            this.f108123b = i;
            this.f108124c = f;
            this.f108125d = layoutParams;
            this.f108126e = z;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C52711k.m112236a((Object) valueAnimator, "valueAnimator1");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                float f = (floatValue - ((float) this.f108123b)) / (this.f108124c - ((float) this.f108123b));
                this.f108125d.height = (int) floatValue;
                C42735ae.m93742h(this.f108122a).setLayoutParams(this.f108125d);
                if (this.f108126e) {
                    C42735ae.m93740f(this.f108122a).setAlpha(f);
                    C42735ae.m93738d(this.f108122a).mo87037a(f);
                    return;
                }
                float f2 = 1.0f - f;
                C42735ae.m93740f(this.f108122a).setAlpha(f2);
                C42735ae.m93738d(this.f108122a).mo87037a(f2);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ae$l */
    public static final class C42748l extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C42735ae f108127a;

        /* renamed from: b */
        final /* synthetic */ LayoutParams f108128b;

        public final void onAnimationEnd(Animator animator) {
            C52711k.m112240b(animator, "animation");
            super.onAnimationEnd(animator);
            C42735ae.m93740f(this.f108127a).setVisibility(8);
            C42735ae.m93738d(this.f108127a).mo87040c(false);
            this.f108128b.height = -2;
            C42735ae.m93742h(this.f108127a).setLayoutParams(this.f108128b);
        }

        C42748l(C42735ae aeVar, LayoutParams layoutParams) {
            this.f108127a = aeVar;
            this.f108128b = layoutParams;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ae$m */
    static final class C42749m extends C52712l implements C52670a<C42838ba> {

        /* renamed from: a */
        final /* synthetic */ C42735ae f108129a;

        C42749m(C42735ae aeVar) {
            this.f108129a = aeVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C42838ba baVar = new C42838ba();
            C42820ax axVar = this.f108129a.f108097p;
            if (axVar == null) {
                C52711k.m112234a();
            }
            C52711k.m112240b(axVar, "<set-?>");
            baVar.f108304i = axVar;
            this.f108129a.mo24389a((int) R.id.a9i, (C12924i) baVar, "CutVideoStickerPointScene");
            return baVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ae$n */
    static final class C42750n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42735ae f108130a;

        C42750n(C42735ae aeVar) {
            this.f108130a = aeVar;
        }

        public final void run() {
            Activity v = this.f108130a.mo24477v();
            C52711k.m112236a((Object) v, "requireActivity()");
            View startSlide = this.f108130a.mo87194M().mo87345G().getStartSlide();
            C52711k.m112236a((Object) startSlide, "videoEditScene.videoEditView.startSlide");
            C47660aa.m103161a(v, startSlide, true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ae$o */
    public static final class C42751o implements C0199s<CutVideoContext> {

        /* renamed from: a */
        final /* synthetic */ C42735ae f108131a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ae$o$a */
        static final class C42752a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C42751o f108132a;

            C42752a(C42751o oVar) {
                this.f108132a = oVar;
            }

            public final void run() {
                Activity v = this.f108132a.f108131a.mo24477v();
                C52711k.m112236a((Object) v, "requireActivity()");
                View startSlide = this.f108132a.f108131a.mo87194M().mo87345G().getStartSlide();
                C52711k.m112236a((Object) startSlide, "videoEditScene.videoEditView.startSlide");
                C47660aa.m103161a(v, startSlide, true);
            }
        }

        C42751o(C42735ae aeVar) {
            this.f108131a = aeVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r5) {
            /*
                r4 = this;
                com.ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext r5 = (com.p683ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext) r5
                if (r5 == 0) goto L_0x003c
                java.util.List r5 = r5.getVideoSegmentList()
                if (r5 == 0) goto L_0x003c
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 10
                int r1 = p2628d.p2629a.C52575l.m112104a(r5, r1)
                r0.<init>(r1)
                java.util.Collection r0 = (java.util.Collection) r0
                java.util.Iterator r5 = r5.iterator()
            L_0x001d:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L_0x0033
                java.lang.Object r1 = r5.next()
                com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment r1 = (com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment) r1
                long r1 = r1.f107904c
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.add(r1)
                goto L_0x001d
            L_0x0033:
                java.util.List r0 = (java.util.List) r0
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                long r0 = p2628d.p2629a.C52575l.m112150m(r0)
                goto L_0x003e
            L_0x003c:
                r0 = 0
            L_0x003e:
                r2 = 60000(0xea60, double:2.9644E-319)
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 <= 0) goto L_0x0084
                com.ss.android.ugc.aweme.shortvideo.cut.scene.ae r5 = r4.f108131a
                com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel r5 = com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42735ae.m93736b(r5)
                boolean r5 = r5.mo87182k()
                if (r5 == 0) goto L_0x0062
                com.ss.android.ugc.aweme.shortvideo.cut.scene.ae r5 = r4.f108131a
                com.ss.android.ugc.aweme.shortvideo.cut.scene.af r5 = r5.mo87193L()
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointModeChangeView r5 = r5.mo87227F()
                int r5 = r5.getCurrentMode()
                r0 = 2
                if (r5 != r0) goto L_0x0084
            L_0x0062:
                com.ss.android.ugc.aweme.shortvideo.cut.scene.ae r5 = r4.f108131a
                com.ss.android.ugc.aweme.shortvideo.cut.scene.m r5 = r5.mo87194M()
                com.ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractVideoEditView r5 = r5.mo87345G()
                com.ss.android.ugc.aweme.shortvideo.cut.scene.ae$o$a r0 = new com.ss.android.ugc.aweme.shortvideo.cut.scene.ae$o$a
                r0.<init>(r4)
                java.lang.Runnable r0 = (java.lang.Runnable) r0
                r5.post(r0)
                com.ss.android.ugc.aweme.shortvideo.cut.scene.ae r5 = r4.f108131a
                com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r5 = com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42735ae.m93735a(r5)
                android.arch.lifecycle.r<com.ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext> r5 = r5.f108926u
                r0 = r4
                android.arch.lifecycle.s r0 = (android.arch.lifecycle.C0199s) r0
                r5.removeObserver(r0)
            L_0x0084:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42735ae.C42751o.onChanged(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ae$p */
    static final class C42753p extends C52712l implements C52670a<C42907m> {

        /* renamed from: a */
        final /* synthetic */ C42735ae f108133a;

        C42753p(C42735ae aeVar) {
            this.f108133a = aeVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C42907m mVar = new C42907m(false, true, 1, null);
            mVar.mo87347a(this.f108133a.mo87191J());
            mVar.f108415i = this.f108133a.f108097p;
            this.f108133a.mo24389a((int) R.id.d3s, (C12924i) mVar, "CutVideoEditScene");
            return mVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ae$q */
    static final class C42754q extends C52712l implements C52670a<C42937s> {

        /* renamed from: a */
        final /* synthetic */ C42735ae f108134a;

        C42754q(C42735ae aeVar) {
            this.f108134a = aeVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C42937s sVar = new C42937s();
            VECutVideoPresenter J = this.f108134a.mo87191J();
            C52711k.m112240b(J, "<set-?>");
            sVar.f108491k = J;
            C42873bn K = this.f108134a.mo87192K();
            C52711k.m112240b(K, "<set-?>");
            sVar.f108493m = K;
            sVar.f108490j = this.f108134a.f108097p;
            this.f108134a.mo24389a((int) R.id.a9i, (C12924i) sVar, "CutVideoListScene");
            return sVar;
        }
    }

    /* renamed from: L */
    public final C42755af mo87193L() {
        return (C42755af) this.f108092K.getValue();
    }

    /* renamed from: M */
    public final C42907m mo87194M() {
        return (C42907m) this.f108093L.getValue();
    }

    /* renamed from: N */
    public final C42937s mo87195N() {
        return (C42937s) this.f108094M.getValue();
    }

    /* renamed from: O */
    public final C42838ba mo87196O() {
        return (C42838ba) this.f108095N.getValue();
    }

    /* renamed from: P */
    public final C42880d mo87197P() {
        return (C42880d) this.f108096O.getValue();
    }

    /* renamed from: a */
    public final void mo87205a(C52671b<? super Boolean, C52860x> bVar) {
        mo87206a(true, bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo87206a(boolean z, C52671b<? super Boolean, C52860x> bVar) {
        ObjectAnimator objectAnimator = this.f108090I;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            ObjectAnimator objectAnimator2 = this.f108090I;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
        }
        float dimension = mo24478w().getDimension(R.dimen.l2) - mo24478w().getDimension(R.dimen.mi);
        if (z) {
            View view = this.f108107z;
            if (view == null) {
                C52711k.m112237a("layoutBottom");
            }
            this.f108090I = ObjectAnimator.ofFloat(view, "translationY", new float[]{dimension, 0.0f});
        } else {
            View view2 = this.f108107z;
            if (view2 == null) {
                C52711k.m112237a("layoutBottom");
            }
            this.f108090I = ObjectAnimator.ofFloat(view2, "translationY", new float[]{0.0f, dimension});
        }
        ObjectAnimator objectAnimator3 = this.f108090I;
        if (objectAnimator3 != null) {
            objectAnimator3.setDuration(200);
        }
        CutVideoPreviewViewModel cutVideoPreviewViewModel = this.f108103v;
        if (cutVideoPreviewViewModel == null) {
            C52711k.m112237a("previewViewModel");
        }
        cutVideoPreviewViewModel.mo87115f().setValue(Boolean.valueOf(z));
        ObjectAnimator objectAnimator4 = this.f108090I;
        if (objectAnimator4 != null) {
            objectAnimator4.addListener(new C42737b(this, z, bVar));
        }
        ObjectAnimator objectAnimator5 = this.f108090I;
        if (objectAnimator5 != null) {
            objectAnimator5.addUpdateListener(new C42738c(this, z, dimension));
        }
        ObjectAnimator objectAnimator6 = this.f108090I;
        if (objectAnimator6 != null) {
            objectAnimator6.start();
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

    /* renamed from: J */
    public final VECutVideoPresenter mo87191J() {
        VECutVideoPresenter vECutVideoPresenter = this.f108098q;
        if (vECutVideoPresenter == null) {
            C52711k.m112237a("presenter");
        }
        return vECutVideoPresenter;
    }

    /* renamed from: K */
    public final C42873bn mo87192K() {
        C42873bn bnVar = this.f108099r;
        if (bnVar == null) {
            C52711k.m112237a("previewEditCallback");
        }
        return bnVar;
    }

    /* renamed from: S */
    public final void mo87200S() {
        Activity activity = this.f33840g_;
        if (activity != null) {
            activity.finish();
        }
        C42820ax axVar = this.f108097p;
        if (axVar != null) {
            axVar.mo87268d();
        }
    }

    /* renamed from: W */
    public final C43120d mo87204W() {
        return mo87194M().mo87345G();
    }

    /* renamed from: X */
    private final void m93734X() {
        VideoEditViewModel videoEditViewModel = this.f108101t;
        if (videoEditViewModel == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        videoEditViewModel.f108926u.observe(this, new C42751o(this));
    }

    /* renamed from: A */
    public final void mo24457A() {
        super.mo24457A();
        C42820ax axVar = this.f108097p;
        if (axVar != null) {
            if (axVar.f108259c.mo87434b()) {
                axVar.f108276t = true;
            }
            axVar.f108259c.mo87435c();
        }
    }

    /* renamed from: T */
    public final boolean mo87201T() {
        if (this.f108097p == null) {
            return false;
        }
        C42820ax axVar = this.f108097p;
        if (axVar == null) {
            C52711k.m112234a();
        }
        return axVar.mo87270f();
    }

    /* renamed from: V */
    public final C42482c mo87203V() {
        if (!mo87201T()) {
            return null;
        }
        C42820ax axVar = this.f108097p;
        if (axVar != null) {
            return axVar.mo87272h();
        }
        return null;
    }

    /* renamed from: z */
    public final void mo24481z() {
        super.mo24481z();
        C42820ax axVar = this.f108097p;
        if (axVar != null) {
            if (axVar.f108276t && !axVar.f108277u) {
                axVar.f108259c.mo87437d();
            }
            axVar.f108276t = false;
            axVar.f108277u = false;
        }
    }

    /* renamed from: Q */
    public final void mo87198Q() {
        if (C47660aa.m103162a(true) && !this.f108091J) {
            this.f108091J = true;
            if (C43457b.m95263a()) {
                CutVideoViewModel cutVideoViewModel = this.f108100s;
                if (cutVideoViewModel == null) {
                    C52711k.m112237a("cutVideoViewModel");
                }
                Iterable<MediaModel> iterable = cutVideoViewModel.mo87177f().f108058a;
                Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                for (MediaModel mediaModel : iterable) {
                    arrayList.add(Long.valueOf(mediaModel.f95386e));
                }
                if (C52575l.m112150m((List) arrayList) > 60000) {
                    mo87194M().mo87345G().post(new C42750n(this));
                    return;
                }
                m93734X();
            }
        }
    }

    /* renamed from: R */
    public final void mo87199R() {
        C43099t tVar = mo87195N().f108489i;
        if (tVar == null || tVar.mo87493a() != 0) {
            Activity activity = this.f33840g_;
            if (activity != null) {
                new C10643a(activity).mo18899b((int) R.string.d39).mo18900b((int) R.string.c8h, (OnClickListener) new C42745i(this)).mo18886a((int) R.string.b8q, (OnClickListener) new C42746j(this)).mo18897a().mo18882b().show();
                C43047h hVar = C43047h.f108667g;
                VideoEditViewModel videoEditViewModel = this.f108101t;
                if (videoEditViewModel == null) {
                    C52711k.m112237a("videoEditViewModel");
                }
                hVar.mo87425a(videoEditViewModel.mo87634l(), "exit_clip_popup_show", mo87201T());
                return;
            }
            return;
        }
        mo87200S();
    }

    /* renamed from: U */
    public final C45623a mo87202U() {
        if (this.f108097p == null) {
            return null;
        }
        C42820ax axVar = this.f108097p;
        if (axVar == null) {
            C52711k.m112234a();
        }
        if (axVar.f108273q == null) {
            axVar.f108273q = new C45623a();
        }
        C45623a aVar = axVar.f108273q;
        List c = axVar.mo87267c();
        if (aVar != null && !C9190h.m18253a(c)) {
            if (!TextUtils.isEmpty(C43036f.f108636a)) {
                aVar.setAiCutId(C43036f.f108636a);
            }
            if (c == null) {
                C52711k.m112234a();
            }
            aVar.setVideoCount(Integer.valueOf(c.size()));
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            int i = 0;
            for (Object next : c) {
                int i2 = i + 1;
                if (i < 0) {
                    C52575l.m112100b();
                }
                VideoSegment videoSegment = (VideoSegment) next;
                sb.append(videoSegment.f107904c);
                sb3.append(videoSegment.mo86952f());
                sb2.append(videoSegment.mo86953g() - videoSegment.mo86952f());
                if (i < c.size() - 1) {
                    sb.append(",");
                    sb3.append(",");
                    sb2.append(",");
                }
                i = i2;
            }
            aVar.setVideoCutLenListStr(sb.toString());
            aVar.setVideoSrcLenListStr(sb.toString());
            aVar.setVideoCutStartTimeListStr(sb3.toString());
        }
        C43036f.m94304a((String) null);
        return axVar.f108273q;
    }

    /* renamed from: a */
    public static final /* synthetic */ VideoEditViewModel m93735a(C42735ae aeVar) {
        VideoEditViewModel videoEditViewModel = aeVar.f108101t;
        if (videoEditViewModel == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ CutVideoViewModel m93736b(C42735ae aeVar) {
        CutVideoViewModel cutVideoViewModel = aeVar.f108100s;
        if (cutVideoViewModel == null) {
            C52711k.m112237a("cutVideoViewModel");
        }
        return cutVideoViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ VEVideoCutterViewModel m93737c(C42735ae aeVar) {
        VEVideoCutterViewModel vEVideoCutterViewModel = aeVar.f108102u;
        if (vEVideoCutterViewModel == null) {
            C52711k.m112237a("veVideoCutterViewModel");
        }
        return vEVideoCutterViewModel;
    }

    /* renamed from: d */
    public static final /* synthetic */ CutVideoEditViewModel m93738d(C42735ae aeVar) {
        CutVideoEditViewModel cutVideoEditViewModel = aeVar.f108106y;
        if (cutVideoEditViewModel == null) {
            C52711k.m112237a("cutVideoEditViewModel");
        }
        return cutVideoEditViewModel;
    }

    /* renamed from: e */
    public static final /* synthetic */ View m93739e(C42735ae aeVar) {
        View view = aeVar.f108083A;
        if (view == null) {
            C52711k.m112237a("normalModeView");
        }
        return view;
    }

    /* renamed from: f */
    public static final /* synthetic */ View m93740f(C42735ae aeVar) {
        View view = aeVar.f108084B;
        if (view == null) {
            C52711k.m112237a("topVideoEditView");
        }
        return view;
    }

    /* renamed from: g */
    public static final /* synthetic */ CutVideoStickerPointMusicViewModel m93741g(C42735ae aeVar) {
        CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel = aeVar.f108104w;
        if (cutVideoStickerPointMusicViewModel == null) {
            C52711k.m112237a("musicViewModel");
        }
        return cutVideoStickerPointMusicViewModel;
    }

    /* renamed from: h */
    public static final /* synthetic */ View m93742h(C42735ae aeVar) {
        View view = aeVar.f108085C;
        if (view == null) {
            C52711k.m112237a("editPanelView");
        }
        return view;
    }

    /* renamed from: b */
    public final void mo87207b(boolean z) {
        int i;
        float f;
        C42820ax axVar = this.f108097p;
        if (axVar == null) {
            C52711k.m112234a();
        }
        boolean f2 = axVar.mo87270f();
        if (f2) {
            View view = this.f108085C;
            if (view == null) {
                C52711k.m112237a("editPanelView");
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                LayoutParams layoutParams2 = (LayoutParams) layoutParams;
                View view2 = this.f108085C;
                if (view2 == null) {
                    C52711k.m112237a("editPanelView");
                }
                int height = view2.getHeight();
                if (z) {
                    View view3 = this.f108084B;
                    if (view3 == null) {
                        C52711k.m112237a("topVideoEditView");
                    }
                    view3.setAlpha(0.0f);
                    CutVideoEditViewModel cutVideoEditViewModel = this.f108106y;
                    if (cutVideoEditViewModel == null) {
                        C52711k.m112237a("cutVideoEditViewModel");
                    }
                    cutVideoEditViewModel.mo87037a(0.0f);
                    View view4 = this.f108084B;
                    if (view4 == null) {
                        C52711k.m112237a("topVideoEditView");
                    }
                    view4.setVisibility(0);
                    CutVideoEditViewModel cutVideoEditViewModel2 = this.f108106y;
                    if (cutVideoEditViewModel2 == null) {
                        C52711k.m112237a("cutVideoEditViewModel");
                    }
                    cutVideoEditViewModel2.mo87040c(true);
                    f = mo24478w().getDimension(R.dimen.l2);
                } else {
                    f = mo24478w().getDimension(R.dimen.mi);
                }
                float f3 = f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) height, f3});
                C52711k.m112236a((Object) ofFloat, "ValueAnimator.ofFloat(in….toFloat(), targetHeight)");
                ofFloat.setDuration(200);
                C42747k kVar = new C42747k(this, height, f3, layoutParams2, z);
                ofFloat.addUpdateListener(kVar);
                if (!z) {
                    ofFloat.addListener(new C42748l(this, layoutParams2));
                }
                ofFloat.start();
            } else {
                throw new C52857u("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        } else {
            CutVideoEditViewModel cutVideoEditViewModel3 = this.f108106y;
            if (cutVideoEditViewModel3 == null) {
                C52711k.m112237a("cutVideoEditViewModel");
            }
            cutVideoEditViewModel3.mo87040c(false);
            View view5 = this.f108083A;
            if (view5 == null) {
                C52711k.m112237a("normalModeView");
            }
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            view5.setVisibility(i);
        }
        if (f2) {
            if (z) {
                CutVideoListViewModel cutVideoListViewModel = this.f108089H;
                if (cutVideoListViewModel == null) {
                    C52711k.m112237a("videoListViewModel");
                }
                cutVideoListViewModel.mo87068b(true);
                CutVideoListViewModel cutVideoListViewModel2 = this.f108089H;
                if (cutVideoListViewModel2 == null) {
                    C52711k.m112237a("videoListViewModel");
                }
                cutVideoListViewModel2.mo22530c(new C42701j(f2));
                return;
            }
            CutVideoListViewModel cutVideoListViewModel3 = this.f108089H;
            if (cutVideoListViewModel3 == null) {
                C52711k.m112237a("videoListViewModel");
            }
            cutVideoListViewModel3.mo87067a(true);
            CutVideoListViewModel cutVideoListViewModel4 = this.f108089H;
            if (cutVideoListViewModel4 == null) {
                C52711k.m112237a("videoListViewModel");
            }
            cutVideoListViewModel4.mo22530c(new C42695d(f2));
        } else if (z) {
            CutVideoListViewModel cutVideoListViewModel5 = this.f108089H;
            if (cutVideoListViewModel5 == null) {
                C52711k.m112237a("videoListViewModel");
            }
            cutVideoListViewModel5.mo87069c(true);
            CutVideoMultiModeViewModel cutVideoMultiModeViewModel = this.f108088G;
            if (cutVideoMultiModeViewModel == null) {
                C52711k.m112237a("videoMultiModeViewModel");
            }
            cutVideoMultiModeViewModel.mo87095b(true);
        } else {
            CutVideoListViewModel cutVideoListViewModel6 = this.f108089H;
            if (cutVideoListViewModel6 == null) {
                C52711k.m112237a("videoListViewModel");
            }
            cutVideoListViewModel6.mo87069c(false);
            CutVideoMultiModeViewModel cutVideoMultiModeViewModel2 = this.f108088G;
            if (cutVideoMultiModeViewModel2 == null) {
                C52711k.m112237a("videoMultiModeViewModel");
            }
            cutVideoMultiModeViewModel2.mo87093a(true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02ac  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24448e(android.os.Bundle r7) {
        /*
            r6 = this;
            super.mo24448e(r7)
            android.app.Activity r7 = r6.f33840g_
            if (r7 == 0) goto L_0x03be
            android.support.v4.app.FragmentActivity r7 = (android.support.p030v4.app.FragmentActivity) r7
            android.arch.lifecycle.y r7 = android.arch.lifecycle.C0214z.m440a(r7)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel> r0 = com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel.class
            android.arch.lifecycle.x r7 = r7.mo359a(r0)
            java.lang.String r0 = "ViewModelProviders.of(ac…ditViewModel::class.java]"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r0)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r7 = (com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel) r7
            r6.f108101t = r7
            android.app.Activity r7 = r6.f33840g_
            if (r7 == 0) goto L_0x03b6
            android.support.v4.app.FragmentActivity r7 = (android.support.p030v4.app.FragmentActivity) r7
            android.arch.lifecycle.y r7 = android.arch.lifecycle.C0214z.m440a(r7)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel> r0 = com.p683ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel.class
            android.arch.lifecycle.x r7 = r7.mo359a(r0)
            java.lang.String r0 = "ViewModelProviders.of(ac…terViewModel::class.java]"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r0)
            com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel r7 = (com.p683ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel) r7
            r6.f108102u = r7
            android.app.Activity r7 = r6.f33840g_
            if (r7 == 0) goto L_0x03ae
            android.support.v4.app.FragmentActivity r7 = (android.support.p030v4.app.FragmentActivity) r7
            com.ss.android.ugc.gamora.b.c r7 = com.p683ss.android.ugc.gamora.p2458b.C48927d.m105736a(r7)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel> r0 = com.p683ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel.class
            com.bytedance.jedi.arch.JediViewModel r7 = r7.mo96760a(r0)
            java.lang.String r0 = "JediViewModelProviders.o…iewViewModel::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r0)
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel r7 = (com.p683ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel) r7
            r6.f108103v = r7
            android.app.Activity r7 = r6.f33840g_
            if (r7 == 0) goto L_0x03a6
            android.support.v4.app.FragmentActivity r7 = (android.support.p030v4.app.FragmentActivity) r7
            com.ss.android.ugc.gamora.b.c r7 = com.p683ss.android.ugc.gamora.p2458b.C48927d.m105736a(r7)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoStickerPointMusicViewModel> r0 = com.p683ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoStickerPointMusicViewModel.class
            com.bytedance.jedi.arch.JediViewModel r7 = r7.mo96760a(r0)
            java.lang.String r0 = "JediViewModelProviders.o…sicViewModel::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r0)
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoStickerPointMusicViewModel r7 = (com.p683ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoStickerPointMusicViewModel) r7
            r6.f108104w = r7
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel r7 = r6.f108100s
            if (r7 != 0) goto L_0x0070
            java.lang.String r0 = "cutVideoViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0070:
            boolean r7 = r7.mo87182k()
            if (r7 == 0) goto L_0x00ef
            com.ss.android.ugc.aweme.shortvideo.cut.scene.af r7 = r6.mo87193L()
            com.bytedance.scene.i r7 = (com.bytedance.scene.C12924i) r7
            r6.mo24409d(r7)
            com.ss.android.ugc.aweme.shortvideo.cut.scene.af r7 = r6.mo87193L()
            com.ss.android.ugc.aweme.shortvideo.cut.scene.ae$h r0 = new com.ss.android.ugc.aweme.shortvideo.cut.scene.ae$h
            r0.<init>(r6)
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.b r0 = (com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2183c.C43018b) r0
            r7.f108137j = r0
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel r7 = r6.f108100s
            if (r7 != 0) goto L_0x0095
            java.lang.String r7 = "cutVideoViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x0095:
            com.ss.android.ugc.aweme.port.in.u r7 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.ss.android.ugc.aweme.property.h r7 = r7.mo58583n()
            com.ss.android.ugc.aweme.property.h$a r0 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableUploadVideoSlideAutoJust
            com.ss.android.ugc.aweme.property.aa$a r0 = (com.p683ss.android.ugc.aweme.property.C40761aa.C40762a) r0
            boolean r7 = r7.mo83103a(r0)
            if (r7 == 0) goto L_0x00b1
            com.ss.android.ugc.aweme.shortvideo.cut.scene.ba r7 = r6.mo87196O()
            com.bytedance.scene.i r7 = (com.bytedance.scene.C12924i) r7
            r6.mo24409d(r7)
            goto L_0x00dc
        L_0x00b1:
            boolean r7 = com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43036f.m94313g()
            if (r7 == 0) goto L_0x00c1
            com.ss.android.ugc.aweme.shortvideo.cut.scene.ba r7 = r6.mo87196O()
            com.bytedance.scene.i r7 = (com.bytedance.scene.C12924i) r7
            r6.mo24409d(r7)
            goto L_0x00dc
        L_0x00c1:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.d r7 = r6.mo87197P()
            com.bytedance.scene.i r7 = (com.bytedance.scene.C12924i) r7
            r6.mo24409d(r7)
            com.ss.android.ugc.aweme.shortvideo.cut.scene.m r7 = r6.mo87194M()
            com.bytedance.scene.i r7 = (com.bytedance.scene.C12924i) r7
            r6.mo24409d(r7)
            com.ss.android.ugc.aweme.shortvideo.cut.scene.s r7 = r6.mo87195N()
            com.bytedance.scene.i r7 = (com.bytedance.scene.C12924i) r7
            r6.mo24409d(r7)
        L_0x00dc:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.af r7 = r6.mo87193L()
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointModeChangeView r7 = r7.mo87227F()
            int r7 = r7.getCurrentMode()
            r0 = 2
            if (r7 != r0) goto L_0x010d
            r6.mo87198Q()
            goto L_0x010d
        L_0x00ef:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.d r7 = r6.mo87197P()
            com.bytedance.scene.i r7 = (com.bytedance.scene.C12924i) r7
            r6.mo24409d(r7)
            com.ss.android.ugc.aweme.shortvideo.cut.scene.m r7 = r6.mo87194M()
            com.bytedance.scene.i r7 = (com.bytedance.scene.C12924i) r7
            r6.mo24409d(r7)
            com.ss.android.ugc.aweme.shortvideo.cut.scene.s r7 = r6.mo87195N()
            com.bytedance.scene.i r7 = (com.bytedance.scene.C12924i) r7
            r6.mo24409d(r7)
            r6.mo87198Q()
        L_0x010d:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel r7 = r6.f108100s
            if (r7 != 0) goto L_0x0116
            java.lang.String r0 = "cutVideoViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0116:
            boolean r7 = r7.mo87182k()
            r0 = 1
            if (r7 == 0) goto L_0x0391
            r6.f108086D = r0
            r7 = 2132017721(0x7f140239, float:1.9673728E38)
            android.view.View r7 = r6.mo24467j_(r7)
            java.lang.String r1 = "requireViewById(R.id.bottom_menu)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r1)
            r6.f108107z = r7
            r7 = 2132021312(0x7f141040, float:1.9681012E38)
            android.view.View r7 = r6.mo24467j_(r7)
            java.lang.String r1 = "requireViewById(R.id.normal_mode_view)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r1)
            r6.f108083A = r7
            r7 = 2132023519(0x7f1418df, float:1.9685488E38)
            android.view.View r7 = r6.mo24467j_(r7)
            java.lang.String r1 = "requireViewById(R.id.top_videoedit_view)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r1)
            r6.f108084B = r7
            r7 = 2132018739(0x7f140633, float:1.9675793E38)
            android.view.View r7 = r6.mo24467j_(r7)
            java.lang.String r1 = "requireViewById(R.id.edit_panel_view)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r1)
            r6.f108085C = r7
            com.ss.android.ugc.aweme.shortvideo.cut.scene.ax r7 = r6.f108097p
            if (r7 == 0) goto L_0x0238
            android.app.Activity r1 = r6.mo24477v()
            if (r1 == 0) goto L_0x0230
            android.support.v4.app.FragmentActivity r1 = (android.support.p030v4.app.FragmentActivity) r1
            java.lang.String r2 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
            com.ss.android.ugc.gamora.b.c r2 = com.p683ss.android.ugc.gamora.p2458b.C48927d.m105736a(r1)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoStickerPointMusicViewModel> r3 = com.p683ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoStickerPointMusicViewModel.class
            com.bytedance.jedi.arch.JediViewModel r2 = r2.mo96760a(r3)
            java.lang.String r3 = "JediViewModelProviders.o…sicViewModel::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoStickerPointMusicViewModel r2 = (com.p683ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoStickerPointMusicViewModel) r2
            r7.f108274r = r2
            com.ss.android.ugc.gamora.b.c r2 = com.p683ss.android.ugc.gamora.p2458b.C48927d.m105736a(r1)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiModeViewModel> r3 = com.p683ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiModeViewModel.class
            com.bytedance.jedi.arch.JediViewModel r2 = r2.mo96760a(r3)
            java.lang.String r3 = "JediViewModelProviders.o…odeViewModel::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiModeViewModel r2 = (com.p683ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiModeViewModel) r2
            r7.f108275s = r2
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e r2 = r7.f108262f
            r3 = r1
            android.app.Activity r3 = (android.app.Activity) r3
            r2.f108625h = r3
            if (r3 == 0) goto L_0x01f5
            boolean r4 = r3.isFinishing()
            if (r4 != 0) goto L_0x01f5
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.a r4 = new com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.a
            r5 = r3
            android.content.Context r5 = (android.content.Context) r5
            r4.<init>(r5)
            r2.f108624g = r4
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.a r4 = r2.f108624g
            if (r4 != 0) goto L_0x01ae
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x01ae:
            r4.setCancelable(r0)
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.a r4 = r2.f108624g
            if (r4 != 0) goto L_0x01b8
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x01b8:
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2132549498(0x7f1c1f7a, float:2.07523E38)
            java.lang.String r3 = r3.getString(r5)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r4.setMessage(r3)
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.a r3 = r2.f108624g
            if (r3 != 0) goto L_0x01cf
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x01cf:
            r4 = 0
            r3.mo87485a(r4)
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.a r3 = r2.f108624g
            if (r3 != 0) goto L_0x01da
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x01da:
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e$c r4 = new com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e$c
            r4.<init>(r2)
            android.content.DialogInterface$OnDismissListener r4 = (android.content.DialogInterface.OnDismissListener) r4
            r3.setOnDismissListener(r4)
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.a r3 = r2.f108624g
            if (r3 != 0) goto L_0x01eb
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x01eb:
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e$d r4 = new com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e$d
            r4.<init>(r2)
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.a$a r4 = (com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.C43092a.C43093a) r4
            r3.mo87486a(r4)
        L_0x01f5:
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e r2 = r7.f108262f
            com.ss.android.ugc.aweme.shortvideo.cut.scene.ax$b r3 = new com.ss.android.ugc.aweme.shortvideo.cut.scene.ax$b
            r3.<init>(r7, r1)
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e$b r3 = (com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43028e.C43030b) r3
            java.lang.String r1 = "listener"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r1)
            r2.f108623f = r3
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l r1 = r7.f108259c
            com.ss.android.ugc.aweme.shortvideo.cut.scene.ax$c r2 = new com.ss.android.ugc.aweme.shortvideo.cut.scene.ax$c
            r2.<init>(r7)
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l$b r2 = (com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43051l.C43054b) r2
            java.lang.String r3 = "listener"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r3)
            r1.f108676d = r2
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.m r1 = new com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.m
            r1.<init>()
            r7.f108268l = r1
            com.ss.android.ugc.aweme.shortvideo.cut.scene.ax$d r1 = new com.ss.android.ugc.aweme.shortvideo.cut.scene.ax$d
            r1.<init>(r7)
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f r1 = (com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2183c.C43022f) r1
            r7.f108270n = r1
            com.ss.android.ugc.aweme.shortvideo.dh r1 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r1 = r1.mo50201b()
            r7.f108264h = r1
            goto L_0x0238
        L_0x0230:
            d.u r7 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r7.<init>(r0)
            throw r7
        L_0x0238:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.ax r7 = r6.f108097p
            if (r7 == 0) goto L_0x024d
            com.ss.android.ugc.aweme.shortvideo.cut.scene.m r1 = r6.mo87194M()
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractVideoEditView r1 = r1.mo87345G()
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.d r1 = (com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.C43120d) r1
            java.lang.String r2 = "<set-?>"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
            r7.f108271o = r1
        L_0x024d:
            android.app.Activity r7 = r6.f33840g_
            r1 = 0
            if (r7 == 0) goto L_0x025f
            android.content.Intent r7 = r7.getIntent()
            if (r7 == 0) goto L_0x025f
            java.lang.String r2 = "extra_stickpoint_music_list"
            java.io.Serializable r7 = r7.getSerializableExtra(r2)
            goto L_0x0260
        L_0x025f:
            r7 = r1
        L_0x0260:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.ax r2 = r6.f108097p
            if (r2 == 0) goto L_0x0284
            if (r7 != 0) goto L_0x0268
            r7 = r1
            goto L_0x0270
        L_0x0268:
            java.util.List r7 = (java.util.List) r7
            java.util.Collection r7 = (java.util.Collection) r7
            java.util.List r7 = p2628d.p2629a.C52575l.m112139e(r7)
        L_0x0270:
            r2.f108269m = r7
            boolean r3 = com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43036f.m94313g()
            if (r3 == 0) goto L_0x0284
            com.ss.android.ugc.aweme.shortvideo.cut.scene.bq r2 = r2.f108257a
            if (r2 != 0) goto L_0x0281
            java.lang.String r3 = "musicViewController"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0281:
            r2.mo87289a(r7)
        L_0x0284:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.ax r7 = r6.f108097p
            if (r7 == 0) goto L_0x0291
            com.ss.android.ugc.aweme.shortvideo.cut.scene.ae$e r2 = new com.ss.android.ugc.aweme.shortvideo.cut.scene.ae$e
            r2.<init>(r6)
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.h r2 = (com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2183c.C43024h) r2
            r7.f108261e = r2
        L_0x0291:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.bn r7 = r6.f108099r
            if (r7 != 0) goto L_0x029a
            java.lang.String r2 = "previewEditCallback"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x029a:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.ax r2 = r6.f108097p
            if (r2 != 0) goto L_0x02a1
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x02a1:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.bo r2 = (com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42874bo) r2
            r7.mo87247a(r2)
            boolean r7 = com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43036f.m94313g()
            if (r7 == 0) goto L_0x0333
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiModeViewModel r7 = r6.f108088G
            if (r7 != 0) goto L_0x02b5
            java.lang.String r1 = "videoMultiModeViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x02b5:
            android.app.Activity r1 = r6.f33840g_
            if (r1 == 0) goto L_0x032b
            android.support.v4.app.FragmentActivity r1 = (android.support.p030v4.app.FragmentActivity) r1
            r7.mo87094b(r1, r0)
            android.view.View r7 = r6.f108083A
            if (r7 != 0) goto L_0x02c7
            java.lang.String r1 = "normalModeView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x02c7:
            r1 = 8
            r7.setVisibility(r1)
            android.view.View r7 = r6.f108084B
            if (r7 != 0) goto L_0x02d5
            java.lang.String r2 = "topVideoEditView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x02d5:
            r7.setVisibility(r1)
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoStickerPointMusicViewModel r7 = r6.f108104w
            if (r7 != 0) goto L_0x02e1
            java.lang.String r1 = "musicViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x02e1:
            r7.mo87155c(r0)
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoStickerPointMusicViewModel r7 = r6.f108104w
            if (r7 != 0) goto L_0x02ed
            java.lang.String r1 = "musicViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x02ed:
            r7.mo87154b(r0)
            com.ss.android.ugc.aweme.shortvideo.cut.scene.ax r7 = r6.f108097p
            if (r7 == 0) goto L_0x02f7
            r7.mo87269e()
        L_0x02f7:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.af r7 = r6.mo87193L()
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointModeChangeView r7 = r7.mo87227F()
            android.app.Activity r0 = r6.f33840g_
            android.content.Context r0 = (android.content.Context) r0
            int r0 = com.p683ss.android.ugc.aweme.shortvideo.C43303dy.m94971b(r0)
            android.app.Activity r1 = r6.f33840g_
            android.content.Context r1 = (android.content.Context) r1
            int r1 = com.p683ss.android.ugc.aweme.shortvideo.C43303dy.m94967a(r1)
            r7.measure(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel r7 = r6.f108103v
            if (r7 != 0) goto L_0x031b
            java.lang.String r0 = "previewViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x031b:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.af r0 = r6.mo87193L()
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointModeChangeView r0 = r0.mo87227F()
            int r0 = r0.getMeasuredHeight()
            r7.mo87111a(r0)
            goto L_0x037b
        L_0x032b:
            d.u r7 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r7.<init>(r0)
            throw r7
        L_0x0333:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiModeViewModel r7 = r6.f108088G
            if (r7 != 0) goto L_0x033c
            java.lang.String r2 = "videoMultiModeViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x033c:
            android.app.Activity r2 = r6.f33840g_
            if (r2 == 0) goto L_0x0389
            android.support.v4.app.FragmentActivity r2 = (android.support.p030v4.app.FragmentActivity) r2
            r7.mo87092a(r2, r0)
            com.ss.android.ugc.aweme.shortvideo.cut.scene.af r7 = r6.mo87193L()
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointModeChangeView r7 = r7.mo87227F()
            android.app.Activity r0 = r6.f33840g_
            android.content.Context r0 = (android.content.Context) r0
            int r0 = com.p683ss.android.ugc.aweme.shortvideo.C43303dy.m94971b(r0)
            android.app.Activity r2 = r6.f33840g_
            android.content.Context r2 = (android.content.Context) r2
            int r2 = com.p683ss.android.ugc.aweme.shortvideo.C43303dy.m94967a(r2)
            r7.measure(r0, r2)
            com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel r7 = r6.f108103v
            if (r7 != 0) goto L_0x0369
            java.lang.String r0 = "previewViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0369:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.af r0 = r6.mo87193L()
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointModeChangeView r0 = r0.mo87227F()
            int r0 = r0.getMeasuredHeight()
            r7.mo87111a(r0)
            r6.mo87205a(r1)
        L_0x037b:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.s r7 = r6.mo87195N()
            com.ss.android.ugc.aweme.shortvideo.cut.scene.ae$f r0 = new com.ss.android.ugc.aweme.shortvideo.cut.scene.ae$f
            r0.<init>(r6)
            com.ss.android.ugc.aweme.shortvideo.cut.scene.as r0 = (com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42809as) r0
            r7.f108486Z = r0
            return
        L_0x0389:
            d.u r7 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r7.<init>(r0)
            throw r7
        L_0x0391:
            r6.f108087E = r0
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h r7 = com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43047h.f108667g
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r0 = r6.f108101t
            if (r0 != 0) goto L_0x039e
            java.lang.String r1 = "videoEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x039e:
            java.util.List r0 = r0.mo87634l()
            r7.mo87427b(r0)
            return
        L_0x03a6:
            d.u r7 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r7.<init>(r0)
            throw r7
        L_0x03ae:
            d.u r7 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r7.<init>(r0)
            throw r7
        L_0x03b6:
            d.u r7 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r7.<init>(r0)
            throw r7
        L_0x03be:
            d.u r7 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42735ae.mo24448e(android.os.Bundle):void");
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
        CutVideoViewModel cutVideoViewModel = this.f108100s;
        if (cutVideoViewModel == null) {
            C52711k.m112237a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo87182k()) {
            this.f108097p = new C42820ax();
            CutVideoMultiModeViewModel cutVideoMultiModeViewModel = this.f108088G;
            if (cutVideoMultiModeViewModel == null) {
                C52711k.m112237a("videoMultiModeViewModel");
            }
            C42820ax axVar = this.f108097p;
            if (axVar == null) {
                C52711k.m112234a();
            }
            C42874bo boVar = axVar;
            C52711k.m112240b(boVar, "<set-?>");
            cutVideoMultiModeViewModel.f108021e = boVar;
            CutVideoListViewModel cutVideoListViewModel = this.f108089H;
            if (cutVideoListViewModel == null) {
                C52711k.m112237a("videoListViewModel");
            }
            C42820ax axVar2 = this.f108097p;
            if (axVar2 == null) {
                C52711k.m112234a();
            }
            C42874bo boVar2 = axVar2;
            C52711k.m112240b(boVar2, "<set-?>");
            cutVideoListViewModel.f108003g = boVar2;
        }
        CutVideoViewModel cutVideoViewModel2 = this.f108100s;
        if (cutVideoViewModel2 == null) {
            C52711k.m112237a("cutVideoViewModel");
        }
        if (cutVideoViewModel2.mo87182k()) {
            mo24404c((C12924i) mo87193L());
            mo24404c((C12924i) mo87196O());
            mo24404c((C12924i) mo87197P());
            mo24404c((C12924i) mo87194M());
            mo24404c((C12924i) mo87195N());
            return;
        }
        mo24409d((C12924i) mo87197P());
        mo24409d((C12924i) mo87194M());
        mo24409d((C12924i) mo87195N());
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
        Activity activity = this.f33840g_;
        if (activity != null) {
            JediViewModel a = C48927d.m105736a((FragmentActivity) activity).mo96760a(CutVideoViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…deoViewModel::class.java]");
            this.f108100s = (CutVideoViewModel) a;
            Activity activity2 = this.f33840g_;
            if (activity2 != null) {
                JediViewModel a2 = C48927d.m105736a((FragmentActivity) activity2).mo96760a(CutVideoMultiModeViewModel.class);
                C52711k.m112236a((Object) a2, "JediViewModelProviders.o…odeViewModel::class.java)");
                this.f108088G = (CutVideoMultiModeViewModel) a2;
                Activity activity3 = this.f33840g_;
                if (activity3 != null) {
                    JediViewModel a3 = C48927d.m105736a((FragmentActivity) activity3).mo96760a(CutVideoListViewModel.class);
                    C52711k.m112236a((Object) a3, "JediViewModelProviders.o…istViewModel::class.java)");
                    this.f108089H = (CutVideoListViewModel) a3;
                    Activity activity4 = this.f33840g_;
                    if (activity4 != null) {
                        JediViewModel a4 = C48927d.m105736a((FragmentActivity) activity4).mo96760a(CutVideoMultiBottomViewModel.class);
                        C52711k.m112236a((Object) a4, "JediViewModelProviders.o…tomViewModel::class.java)");
                        this.f108105x = (CutVideoMultiBottomViewModel) a4;
                        Activity activity5 = this.f33840g_;
                        if (activity5 != null) {
                            JediViewModel a5 = C48927d.m105736a((FragmentActivity) activity5).mo96760a(CutVideoEditViewModel.class);
                            C52711k.m112236a((Object) a5, "JediViewModelProviders.o…ditViewModel::class.java)");
                            this.f108106y = (CutVideoEditViewModel) a5;
                            CutVideoViewModel cutVideoViewModel = this.f108100s;
                            if (cutVideoViewModel == null) {
                                C52711k.m112237a("cutVideoViewModel");
                            }
                            if (cutVideoViewModel.mo87182k()) {
                                View inflate = layoutInflater.inflate(R.layout.bqw, viewGroup, false);
                                if (inflate != null) {
                                    return (ViewGroup) inflate;
                                }
                                throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
                            }
                            View inflate2 = layoutInflater.inflate(R.layout.bqv, viewGroup, false);
                            if (inflate2 != null) {
                                return (ViewGroup) inflate2;
                            }
                            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
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
