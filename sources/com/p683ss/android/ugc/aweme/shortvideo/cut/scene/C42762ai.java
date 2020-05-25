package com.p683ss.android.ugc.aweme.shortvideo.cut.scene;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.os.Handler;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
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
import com.p683ss.android.ugc.aweme.adaptation.C22452a;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43036f;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.viewmodel.C43168a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.C43518e;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2458b.C48925b;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p069b.C1690c;
import p2628d.C52847n;
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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ai */
public final class C42762ai extends C48925b implements C49548a {

    /* renamed from: w */
    public static final C42763a f108145w = new C42763a(null);

    /* renamed from: i */
    public C42874bo f108146i;

    /* renamed from: j */
    public VECutVideoPresenter f108147j;

    /* renamed from: k */
    public SurfaceView f108148k;

    /* renamed from: l */
    public ImageView f108149l;

    /* renamed from: m */
    public FrameLayout f108150m;

    /* renamed from: n */
    public FrameLayout f108151n;

    /* renamed from: o */
    public VEVideoCutterViewModel f108152o;

    /* renamed from: p */
    public CutMultiVideoViewModel f108153p;

    /* renamed from: q */
    public VideoEditViewModel f108154q;

    /* renamed from: r */
    public float f108155r;

    /* renamed from: s */
    public float f108156s;

    /* renamed from: t */
    public int f108157t;

    /* renamed from: u */
    public final Handler f108158u = new Handler();

    /* renamed from: v */
    public final C42775l f108159v = new C42775l(this);

    /* renamed from: x */
    private CutVideoViewModel f108160x;

    /* renamed from: y */
    private CutVideoPreviewViewModel f108161y;

    /* renamed from: z */
    private CutVideoMultiBottomViewModel f108162z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ai$a */
    public static final class C42763a {
        private C42763a() {
        }

        public /* synthetic */ C42763a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ai$b */
    static final class C42764b<T> implements C0199s<C43168a> {

        /* renamed from: a */
        final /* synthetic */ C42762ai f108163a;

        C42764b(C42762ai aiVar) {
            this.f108163a = aiVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num;
            C43168a aVar = (C43168a) obj;
            if (aVar != null) {
                num = Integer.valueOf(aVar.f109120c);
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 1) {
                if (this.f108163a.mo87228F().mo86820c()) {
                    C42762ai.m93810a(this.f108163a).setVisibility(8);
                    this.f108163a.f108158u.post(this.f108163a.f108159v);
                }
            } else if (num != null && num.intValue() == 2) {
                if (aVar.f109121d) {
                    C42762ai.m93810a(this.f108163a).setVisibility(0);
                }
                this.f108163a.f108158u.removeCallbacks(this.f108163a.f108159v);
            } else if (num != null && num.intValue() == 3) {
                this.f108163a.f108158u.removeCallbacks(this.f108163a.f108159v);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ai$c */
    static final class C42765c<T> implements C0199s<C52847n<? extends Boolean, ? extends Float>> {

        /* renamed from: a */
        final /* synthetic */ C42762ai f108164a;

        C42765c(C42762ai aiVar) {
            this.f108164a = aiVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            float f;
            C52847n nVar = (C52847n) obj;
            if (nVar != null) {
                float dimension = this.f108164a.mo24478w().getDimension(R.dimen.l2) - this.f108164a.mo24478w().getDimension(R.dimen.mi);
                LayoutParams layoutParams = C42762ai.m93811b(this.f108164a).getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    if (((Boolean) nVar.getFirst()).booleanValue()) {
                        layoutParams2.bottomMargin = this.f108164a.f108157t + ((int) (dimension - ((Number) nVar.getSecond()).floatValue()));
                        C42762ai.m93811b(this.f108164a).setLayoutParams(layoutParams2);
                        f = this.f108164a.f108156s - ((float) ((int) (dimension - ((Number) nVar.getSecond()).floatValue())));
                    } else {
                        layoutParams2.bottomMargin = this.f108164a.f108157t - ((int) ((Number) nVar.getSecond()).floatValue());
                        C42762ai.m93811b(this.f108164a).setLayoutParams(layoutParams2);
                        f = ((Number) nVar.getSecond()).floatValue() + this.f108164a.f108156s;
                    }
                    C42874bo boVar = this.f108164a.f108146i;
                    if (boVar != null) {
                        boVar.mo87259a(this.f108164a.f108155r, this.f108164a.f108156s, f, ((Boolean) nVar.getFirst()).booleanValue());
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ai$d */
    static final class C42766d extends C52712l implements C52682m<C49548a, Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42762ai f108165a;

        C42766d(C42762ai aiVar) {
            this.f108165a = aiVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            int intValue = ((Number) obj2).intValue();
            C52711k.m112240b(aVar, "$receiver");
            LayoutParams layoutParams = C42762ai.m93811b(this.f108165a).getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.bottomMargin += intValue;
                C42762ai.m93811b(this.f108165a).setLayoutParams(layoutParams2);
                LayoutParams layoutParams3 = C42762ai.m93812c(this.f108165a).getLayoutParams();
                if (layoutParams3 != null) {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                    layoutParams4.bottomMargin += intValue;
                    C42762ai.m93812c(this.f108165a).setLayoutParams(layoutParams4);
                    return C52860x.f131107a;
                }
                throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ai$e */
    static final class C42767e extends C52712l implements C52682m<C49548a, C52860x, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42762ai f108166a;

        C42767e(C42762ai aiVar) {
            this.f108166a = aiVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52860x xVar = (C52860x) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(xVar, "it");
            C42762ai.m93811b(this.f108166a).post(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C42767e f108167a;

                {
                    this.f108167a = r1;
                }

                public final void run() {
                    float width = (float) C42762ai.m93812c(this.f108167a.f108166a).getWidth();
                    float height = (float) C42762ai.m93812c(this.f108167a.f108166a).getHeight();
                    float height2 = (float) C42762ai.m93811b(this.f108167a.f108166a).getHeight();
                    C42874bo boVar = this.f108167a.f108166a.f108146i;
                    if (boVar != null) {
                        boVar.mo87259a(width, height, height2, false);
                    }
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ai$f */
    static final class C42769f extends C52712l implements C52682m<C49548a, C52860x, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42762ai f108168a;

        C42769f(C42762ai aiVar) {
            this.f108168a = aiVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52860x xVar = (C52860x) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(xVar, "it");
            this.f108168a.f108158u.removeCallbacks(this.f108168a.f108159v);
            this.f108168a.f108158u.post(this.f108168a.f108159v);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ai$g */
    static final class C42770g extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42762ai f108169a;

        C42770g(C42762ai aiVar) {
            this.f108169a = aiVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            this.f108169a.mo87229G().setEnabled(booleanValue);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ai$h */
    static final class C42771h extends C52712l implements C52682m<C49548a, C52847n<? extends Integer, ? extends Integer>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42762ai f108170a;

        C42771h(C42762ai aiVar) {
            this.f108170a = aiVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52847n nVar = (C52847n) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(nVar, "it");
            C22452a.m55494a(this.f108170a.mo87229G(), ((Number) nVar.getFirst()).intValue(), ((Number) nVar.getSecond()).intValue());
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ai$i */
    static final class C42772i<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C42762ai f108171a;

        C42772i(C42762ai aiVar) {
            this.f108171a = aiVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            if (((Boolean) obj) != null) {
                this.f108171a.f108155r = (float) C42762ai.m93811b(this.f108171a).getWidth();
                this.f108171a.f108156s = (float) C42762ai.m93811b(this.f108171a).getHeight();
                LayoutParams layoutParams = C42762ai.m93811b(this.f108171a).getLayoutParams();
                if (layoutParams != null) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    this.f108171a.f108157t = marginLayoutParams.bottomMargin;
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ai$j */
    static final class C42773j<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C42762ai f108172a;

        C42773j(C42762ai aiVar) {
            this.f108172a = aiVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            float f;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                C42762ai aiVar = this.f108172a;
                C52711k.m112236a((Object) bool, "it");
                boolean booleanValue = bool.booleanValue();
                FrameLayout frameLayout = aiVar.f108151n;
                if (frameLayout == null) {
                    C52711k.m112237a("videoControlLayout");
                }
                LayoutParams layoutParams = frameLayout.getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    FrameLayout frameLayout2 = aiVar.f108150m;
                    if (frameLayout2 == null) {
                        C52711k.m112237a("videoLayout");
                    }
                    LayoutParams layoutParams3 = frameLayout2.getLayoutParams();
                    if (layoutParams3 != null) {
                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                        float dimension = aiVar.mo24478w().getDimension(R.dimen.l2) - aiVar.mo24478w().getDimension(R.dimen.mi);
                        if (!booleanValue) {
                            float f2 = aiVar.f108156s;
                            if (!C43036f.m94313g()) {
                                layoutParams4.bottomMargin = layoutParams2.bottomMargin;
                                FrameLayout frameLayout3 = aiVar.f108150m;
                                if (frameLayout3 == null) {
                                    C52711k.m112237a("videoLayout");
                                }
                                frameLayout3.setLayoutParams(layoutParams4);
                                f = f2;
                            } else {
                                f = aiVar.f108156s + dimension;
                            }
                        } else if (C43036f.m94313g()) {
                            f = aiVar.f108156s - dimension;
                        } else {
                            float f3 = aiVar.f108156s;
                            layoutParams4.bottomMargin = layoutParams2.bottomMargin;
                            FrameLayout frameLayout4 = aiVar.f108150m;
                            if (frameLayout4 == null) {
                                C52711k.m112237a("videoLayout");
                            }
                            frameLayout4.setLayoutParams(layoutParams4);
                            f = f3;
                        }
                        C42874bo boVar = aiVar.f108146i;
                        if (boVar != null) {
                            boVar.mo87259a(aiVar.f108155r, aiVar.f108156s, f, booleanValue);
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ai$k */
    static final class C42774k implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42762ai f108173a;

        C42774k(C42762ai aiVar) {
            this.f108173a = aiVar;
        }

        public final void onClick(View view) {
            C43168a aVar;
            ClickInstrumentation.onClick(view);
            VEVideoCutterViewModel vEVideoCutterViewModel = this.f108173a.f108152o;
            if (vEVideoCutterViewModel == null) {
                C52711k.m112237a("veVideoCutterViewModel");
            }
            if (this.f108173a.mo87228F().mo86820c()) {
                aVar = new C43168a(2, false, 2, null);
            } else {
                aVar = new C43168a(1, false, 2, null);
            }
            vEVideoCutterViewModel.mo87731a(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ai$l */
    public static final class C42775l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42762ai f108174a;

        public final void run() {
            long b = this.f108174a.mo87228F().mo86819b();
            if (b > 0) {
                CutMultiVideoViewModel cutMultiVideoViewModel = this.f108174a.f108153p;
                if (cutMultiVideoViewModel == null) {
                    C52711k.m112237a("cutMultiVideoViewModel");
                }
                cutMultiVideoViewModel.mo86798a(b, C42762ai.m93813d(this.f108174a).mo87633k(), C42762ai.m93813d(this.f108174a).mo87635m());
            }
            this.f108174a.f108158u.postDelayed(this, 30);
        }

        C42775l(C42762ai aiVar) {
            this.f108174a = aiVar;
        }
    }

    /* renamed from: a */
    public final void mo24463a(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.mo24463a(view, bundle);
        View j_ = mo24467j_(R.id.dov);
        C52711k.m112236a((Object) j_, "requireViewById(R.id.videoSurface)");
        this.f108148k = (SurfaceView) j_;
        View j_2 = mo24467j_(R.id.axn);
        C52711k.m112236a((Object) j_2, "requireViewById(R.id.ivPlay)");
        this.f108149l = (ImageView) j_2;
        View j_3 = mo24467j_(R.id.dpf);
        C52711k.m112236a((Object) j_3, "requireViewById(R.id.video_layout)");
        this.f108150m = (FrameLayout) j_3;
        View j_4 = mo24467j_(R.id.dp0);
        C52711k.m112236a((Object) j_4, "requireViewById(R.id.video_control_layout)");
        this.f108151n = (FrameLayout) j_4;
        Activity activity = this.f33840g_;
        if (activity != null) {
            JediViewModel a = C48927d.m105736a((FragmentActivity) activity).mo96760a(CutVideoViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…deoViewModel::class.java]");
            this.f108160x = (CutVideoViewModel) a;
            CutVideoViewModel cutVideoViewModel = this.f108160x;
            if (cutVideoViewModel == null) {
                C52711k.m112237a("cutVideoViewModel");
            }
            if (cutVideoViewModel.mo87178g()) {
                LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    Activity v = mo24477v();
                    C52711k.m112236a((Object) v, "requireActivity()");
                    marginLayoutParams.topMargin = (int) C43518e.m95450a(v, 56.0f);
                    CutVideoViewModel cutVideoViewModel2 = this.f108160x;
                    if (cutVideoViewModel2 == null) {
                        C52711k.m112237a("cutVideoViewModel");
                    }
                    if (!cutVideoViewModel2.mo87182k()) {
                        marginLayoutParams.topMargin += C43303dy.m94972c(this.f33840g_);
                        Activity v2 = mo24477v();
                        C52711k.m112236a((Object) v2, "requireActivity()");
                        marginLayoutParams.bottomMargin = (int) C43518e.m95450a(v2, 270.0f);
                    } else if (C43036f.m94313g()) {
                        marginLayoutParams.bottomMargin = mo24478w().getDimensionPixelSize(R.dimen.mi);
                    } else {
                        marginLayoutParams.bottomMargin = mo24478w().getDimensionPixelSize(R.dimen.l2);
                    }
                    view.setLayoutParams(marginLayoutParams);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
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

    /* renamed from: F */
    public final VECutVideoPresenter mo87228F() {
        VECutVideoPresenter vECutVideoPresenter = this.f108147j;
        if (vECutVideoPresenter == null) {
            C52711k.m112237a("presenter");
        }
        return vECutVideoPresenter;
    }

    /* renamed from: G */
    public final SurfaceView mo87229G() {
        SurfaceView surfaceView = this.f108148k;
        if (surfaceView == null) {
            C52711k.m112237a("videoSurface");
        }
        return surfaceView;
    }

    /* renamed from: H */
    public final int mo87230H() {
        SurfaceView surfaceView = this.f108148k;
        if (surfaceView == null) {
            C52711k.m112237a("videoSurface");
        }
        return surfaceView.getMeasuredWidth();
    }

    /* renamed from: I */
    public final int mo87231I() {
        SurfaceView surfaceView = this.f108148k;
        if (surfaceView == null) {
            C52711k.m112237a("videoSurface");
        }
        return surfaceView.getMeasuredHeight();
    }

    /* renamed from: p */
    public final void mo24469p() {
        super.mo24469p();
        this.f108158u.removeCallbacks(this.f108159v);
    }

    /* renamed from: J */
    public final int mo87232J() {
        FrameLayout frameLayout = this.f108150m;
        if (frameLayout == null) {
            C52711k.m112237a("videoLayout");
        }
        LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            return ((MarginLayoutParams) layoutParams).bottomMargin;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: a */
    public final void mo87233a(VECutVideoPresenter vECutVideoPresenter) {
        C52711k.m112240b(vECutVideoPresenter, "<set-?>");
        this.f108147j = vECutVideoPresenter;
    }

    /* renamed from: a */
    public static final /* synthetic */ ImageView m93810a(C42762ai aiVar) {
        ImageView imageView = aiVar.f108149l;
        if (imageView == null) {
            C52711k.m112237a("ivPlay");
        }
        return imageView;
    }

    /* renamed from: b */
    public static final /* synthetic */ FrameLayout m93811b(C42762ai aiVar) {
        FrameLayout frameLayout = aiVar.f108151n;
        if (frameLayout == null) {
            C52711k.m112237a("videoControlLayout");
        }
        return frameLayout;
    }

    /* renamed from: c */
    public static final /* synthetic */ FrameLayout m93812c(C42762ai aiVar) {
        FrameLayout frameLayout = aiVar.f108150m;
        if (frameLayout == null) {
            C52711k.m112237a("videoLayout");
        }
        return frameLayout;
    }

    /* renamed from: d */
    public static final /* synthetic */ VideoEditViewModel m93813d(C42762ai aiVar) {
        VideoEditViewModel videoEditViewModel = aiVar.f108154q;
        if (videoEditViewModel == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            C0209x a = C0214z.m440a((FragmentActivity) activity).mo359a(CutMultiVideoViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…deoViewModel::class.java]");
            this.f108153p = (CutMultiVideoViewModel) a;
            Activity activity2 = this.f33840g_;
            if (activity2 != null) {
                C0209x a2 = C0214z.m440a((FragmentActivity) activity2).mo359a(VideoEditViewModel.class);
                C52711k.m112236a((Object) a2, "ViewModelProviders.of(ac…ditViewModel::class.java]");
                this.f108154q = (VideoEditViewModel) a2;
                Activity activity3 = this.f33840g_;
                if (activity3 != null) {
                    C0209x a3 = C0214z.m440a((FragmentActivity) activity3).mo359a(VEVideoCutterViewModel.class);
                    C52711k.m112236a((Object) a3, "ViewModelProviders.of(ac…terViewModel::class.java]");
                    this.f108152o = (VEVideoCutterViewModel) a3;
                    Activity activity4 = this.f33840g_;
                    if (activity4 != null) {
                        JediViewModel a4 = C48927d.m105736a((FragmentActivity) activity4).mo96760a(CutVideoPreviewViewModel.class);
                        C52711k.m112236a((Object) a4, "JediViewModelProviders.o…iewViewModel::class.java)");
                        this.f108161y = (CutVideoPreviewViewModel) a4;
                        Activity activity5 = this.f33840g_;
                        if (activity5 != null) {
                            JediViewModel a5 = C48927d.m105736a((FragmentActivity) activity5).mo96760a(CutVideoMultiBottomViewModel.class);
                            C52711k.m112236a((Object) a5, "JediViewModelProviders.o…tomViewModel::class.java)");
                            this.f108162z = (CutVideoMultiBottomViewModel) a5;
                            VEVideoCutterViewModel vEVideoCutterViewModel = this.f108152o;
                            if (vEVideoCutterViewModel == null) {
                                C52711k.m112237a("veVideoCutterViewModel");
                            }
                            C0184k kVar = this;
                            vEVideoCutterViewModel.mo87730a().observe(kVar, new C42764b(this));
                            CutVideoPreviewViewModel cutVideoPreviewViewModel = this.f108161y;
                            if (cutVideoPreviewViewModel == null) {
                                C52711k.m112237a("previewViewModel");
                            }
                            mo49444c(cutVideoPreviewViewModel, C42778al.f108177a, new C11934u(), new C42769f(this));
                            CutVideoPreviewViewModel cutVideoPreviewViewModel2 = this.f108161y;
                            if (cutVideoPreviewViewModel2 == null) {
                                C52711k.m112237a("previewViewModel");
                            }
                            mo49443b(cutVideoPreviewViewModel2, C42779am.f108178a, new C11934u(), new C42770g(this));
                            CutVideoPreviewViewModel cutVideoPreviewViewModel3 = this.f108161y;
                            if (cutVideoPreviewViewModel3 == null) {
                                C52711k.m112237a("previewViewModel");
                            }
                            mo49444c(cutVideoPreviewViewModel3, C42780an.f108179a, new C11934u(), new C42771h(this));
                            CutVideoPreviewViewModel cutVideoPreviewViewModel4 = this.f108161y;
                            if (cutVideoPreviewViewModel4 == null) {
                                C52711k.m112237a("previewViewModel");
                            }
                            cutVideoPreviewViewModel4.mo87115f().observe(kVar, new C42772i(this));
                            CutVideoPreviewViewModel cutVideoPreviewViewModel5 = this.f108161y;
                            if (cutVideoPreviewViewModel5 == null) {
                                C52711k.m112237a("previewViewModel");
                            }
                            cutVideoPreviewViewModel5.mo87116g().observe(kVar, new C42773j(this));
                            CutVideoMultiBottomViewModel cutVideoMultiBottomViewModel = this.f108162z;
                            if (cutVideoMultiBottomViewModel == null) {
                                C52711k.m112237a("multiBottomViewModel");
                            }
                            cutVideoMultiBottomViewModel.mo87081e().observe(kVar, new C42765c(this));
                            CutVideoPreviewViewModel cutVideoPreviewViewModel6 = this.f108161y;
                            if (cutVideoPreviewViewModel6 == null) {
                                C52711k.m112237a("previewViewModel");
                            }
                            mo49444c(cutVideoPreviewViewModel6, C42776aj.f108175a, new C11934u(), new C42766d(this));
                            CutVideoPreviewViewModel cutVideoPreviewViewModel7 = this.f108161y;
                            if (cutVideoPreviewViewModel7 == null) {
                                C52711k.m112237a("previewViewModel");
                            }
                            mo49444c(cutVideoPreviewViewModel7, C42777ak.f108176a, new C11934u(), new C42767e(this));
                            CutVideoViewModel cutVideoViewModel = this.f108160x;
                            if (cutVideoViewModel == null) {
                                C52711k.m112237a("cutVideoViewModel");
                            }
                            if (!cutVideoViewModel.mo87178g()) {
                                VideoEditViewModel videoEditViewModel = this.f108154q;
                                if (videoEditViewModel == null) {
                                    C52711k.m112237a("videoEditViewModel");
                                }
                                if (videoEditViewModel.mo87637o()) {
                                    VideoEditViewModel videoEditViewModel2 = this.f108154q;
                                    if (videoEditViewModel2 == null) {
                                        C52711k.m112237a("videoEditViewModel");
                                    }
                                    VideoSegment videoSegment = (VideoSegment) videoEditViewModel2.mo87634l().get(0);
                                    int min = Math.min(videoSegment.f107908g, videoSegment.f107909h);
                                    int max = Math.max(videoSegment.f107908g, videoSegment.f107909h);
                                    SurfaceView surfaceView = this.f108148k;
                                    if (surfaceView == null) {
                                        C52711k.m112237a("videoSurface");
                                    }
                                    C22452a.m55494a(surfaceView, min, max);
                                }
                            } else {
                                CutVideoViewModel cutVideoViewModel2 = this.f108160x;
                                if (cutVideoViewModel2 == null) {
                                    C52711k.m112237a("cutVideoViewModel");
                                }
                                if (cutVideoViewModel2.mo87182k()) {
                                    FrameLayout frameLayout = this.f108151n;
                                    if (frameLayout == null) {
                                        C52711k.m112237a("videoControlLayout");
                                    }
                                    LayoutParams layoutParams = frameLayout.getLayoutParams();
                                    if (layoutParams != null) {
                                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                                        layoutParams2.topMargin += C43303dy.m94972c(this.f33840g_);
                                        FrameLayout frameLayout2 = this.f108151n;
                                        if (frameLayout2 == null) {
                                            C52711k.m112237a("videoControlLayout");
                                        }
                                        frameLayout2.setLayoutParams(layoutParams2);
                                        FrameLayout frameLayout3 = this.f108150m;
                                        if (frameLayout3 == null) {
                                            C52711k.m112237a("videoLayout");
                                        }
                                        LayoutParams layoutParams3 = frameLayout3.getLayoutParams();
                                        if (layoutParams3 != null) {
                                            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                                            layoutParams4.topMargin += C43303dy.m94972c(this.f33840g_);
                                            FrameLayout frameLayout4 = this.f108150m;
                                            if (frameLayout4 == null) {
                                                C52711k.m112237a("videoLayout");
                                            }
                                            frameLayout4.setLayoutParams(layoutParams4);
                                        } else {
                                            throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                        }
                                    } else {
                                        throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                    }
                                }
                            }
                            SurfaceView surfaceView2 = this.f108148k;
                            if (surfaceView2 == null) {
                                C52711k.m112237a("videoSurface");
                            }
                            surfaceView2.setOnClickListener(new C42774k(this));
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
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.bqy, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…review, container, false)");
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
