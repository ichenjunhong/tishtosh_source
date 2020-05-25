package com.p683ss.android.ugc.aweme.longvideonew;

import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior.C0497a;
import android.support.design.widget.CoordinatorLayout;
import android.support.p030v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.p879t.p882c.C13248c;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.base.activity.C23422a;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.utils.C23718g;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.commercialize.egg.C25751b;
import com.p683ss.android.ugc.aweme.commercialize.egg.C25788h;
import com.p683ss.android.ugc.aweme.commercialize.egg.C25823j;
import com.p683ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1556a.C25746b;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1560e.C25778d;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1561f.C25780a;
import com.p683ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout;
import com.p683ss.android.ugc.aweme.crossplatform.p1612a.C27095b;
import com.p683ss.android.ugc.aweme.feed.C30303h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30447d;
import com.p683ss.android.ugc.aweme.longvideo.p1933a.C36349a;
import com.p683ss.android.ugc.aweme.longvideo.view.CustomBottomSheetBehavior;
import com.p683ss.android.ugc.aweme.longvideo.view.CustomBottomSheetBehavior.C36388a;
import com.p683ss.android.ugc.aweme.longvideo.view.DoubleClickDiggFrameLayout;
import com.p683ss.android.ugc.aweme.longvideo.view.DoubleClickDiggFrameLayout.C36389a;
import com.p683ss.android.ugc.aweme.longvideonew.C36404d.C36405a;
import com.p683ss.android.ugc.aweme.longvideonew.feature.C36424a;
import com.p683ss.android.ugc.aweme.longvideonew.feature.C36426b.C36427a;
import com.p683ss.android.ugc.aweme.longvideonew.feature.C36428c;
import com.p683ss.android.ugc.aweme.longvideonew.feature.C36429d;
import com.p683ss.android.ugc.aweme.longvideonew.feature.NoOperateModeController;
import com.p683ss.android.ugc.aweme.longvideonew.feature.NoOperateModeController.C36416a;
import com.p683ss.android.ugc.aweme.longvideonew.feature.Rotate;
import com.p683ss.android.ugc.aweme.longvideonew.feature.Rotate.C36418a;
import com.p683ss.android.ugc.aweme.longvideonew.widget.VideoPlayerWidget;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.share.ShareDependService;
import com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.longvideonew.f */
public final class C36407f extends C23526a implements C0199s<C23274a>, OnClickListener, C23422a, C30313ae<C30332aw>, C30447d, C36416a {

    /* renamed from: z */
    public static final C36408a f93227z = new C36408a(null);

    /* renamed from: A */
    private boolean f93228A;

    /* renamed from: B */
    private String f93229B = "noBusinessType";

    /* renamed from: C */
    private int f93230C;

    /* renamed from: D */
    private String f93231D = "";

    /* renamed from: E */
    private C30303h f93232E;

    /* renamed from: F */
    private FrameLayout f93233F;

    /* renamed from: G */
    private FrameLayout f93234G;

    /* renamed from: H */
    private ViewStub f93235H;

    /* renamed from: I */
    private C36428c f93236I;

    /* renamed from: J */
    private HashMap f93237J;

    /* renamed from: a */
    public Aweme f93238a;

    /* renamed from: b */
    public boolean f93239b;

    /* renamed from: c */
    public DataCenter f93240c;

    /* renamed from: d */
    public Rotate f93241d;

    /* renamed from: e */
    public Video f93242e;

    /* renamed from: j */
    public String f93243j = "";

    /* renamed from: k */
    public C36424a f93244k;

    /* renamed from: l */
    public NoOperateModeController f93245l;

    /* renamed from: m */
    public FrameLayout f93246m;

    /* renamed from: n */
    public DoubleClickDiggFrameLayout f93247n;

    /* renamed from: o */
    public FrameLayout f93248o;

    /* renamed from: p */
    public FrameLayout f93249p;

    /* renamed from: q */
    public CommerceLikeLayout f93250q;

    /* renamed from: r */
    public CommerceEggLayout f93251r;

    /* renamed from: s */
    public View f93252s;

    /* renamed from: t */
    public ImageView f93253t;

    /* renamed from: u */
    public RelativeLayout f93254u;

    /* renamed from: v */
    public VideoPlayerWidget f93255v;

    /* renamed from: w */
    public C25780a f93256w;

    /* renamed from: x */
    public C25751b f93257x;

    /* renamed from: y */
    public C25746b f93258y;

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.f$a */
    public static final class C36408a {
        private C36408a() {
        }

        public /* synthetic */ C36408a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.f$b */
    static final class C36409b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C36407f f93259a;

        C36409b(C36407f fVar) {
            this.f93259a = fVar;
        }

        public final void run() {
            FrameLayout frameLayout = this.f93259a.f93249p;
            if (frameLayout != null) {
                frameLayout.setAlpha(1.0f);
            }
            FrameLayout frameLayout2 = this.f93259a.f93249p;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.f$c */
    static final class C36410c implements Runnable {

        /* renamed from: a */
        public static final C36410c f93260a = new C36410c();

        C36410c() {
        }

        public final void run() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.f$d */
    public static final class C36411d extends C0497a {

        /* renamed from: a */
        final /* synthetic */ C36407f f93261a;

        /* renamed from: b */
        final /* synthetic */ CustomBottomSheetBehavior f93262b;

        C36411d(C36407f fVar, CustomBottomSheetBehavior customBottomSheetBehavior) {
            this.f93261a = fVar;
            this.f93262b = customBottomSheetBehavior;
        }

        /* renamed from: a */
        public final void mo1316a(View view, int i) {
            C52711k.m112240b(view, "bottomSheet");
            if (i == 1) {
                Rotate rotate = this.f93261a.f93241d;
                if (rotate != null && rotate.f93282e) {
                    this.f93262b.mo1301b(4);
                }
            } else if (i == 5) {
                FragmentActivity activity = this.f93261a.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        }

        /* renamed from: a */
        public final void mo1315a(View view, float f) {
            C52711k.m112240b(view, "bottomSheet");
            if (Float.isNaN(f)) {
                View view2 = this.f93261a.f93252s;
                if (view2 != null) {
                    view2.setAlpha(1.0f);
                }
                RelativeLayout relativeLayout = this.f93261a.f93254u;
                if (relativeLayout != null) {
                    relativeLayout.setAlpha(1.0f);
                }
                return;
            }
            float abs = Math.abs(f);
            if (abs > 0.0f && abs < 0.15f) {
                float f2 = abs / 0.15f;
                RelativeLayout relativeLayout2 = this.f93261a.f93254u;
                if (relativeLayout2 != null) {
                    relativeLayout2.setAlpha(1.0f - f2);
                }
            }
            if (abs > 0.15f) {
                float f3 = (abs - 0.15f) / 0.85f;
                View view3 = this.f93261a.f93252s;
                if (view3 != null) {
                    view3.setAlpha(1.0f - f3);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.f$e */
    public static final class C36412e implements C36388a {

        /* renamed from: a */
        final /* synthetic */ C36407f f93263a;

        C36412e(C36407f fVar) {
            this.f93263a = fVar;
        }

        /* renamed from: a */
        public final void mo75246a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            C52711k.m112240b(coordinatorLayout, "parent");
            C52711k.m112240b(view, "child");
            C52711k.m112240b(motionEvent, "event");
            DoubleClickDiggFrameLayout doubleClickDiggFrameLayout = this.f93263a.f93247n;
            if (doubleClickDiggFrameLayout != null) {
                doubleClickDiggFrameLayout.mo75310a(motionEvent);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.f$f */
    public static final class C36413f implements C36418a {

        /* renamed from: a */
        final /* synthetic */ C36407f f93264a;

        /* renamed from: b */
        final /* synthetic */ C36429d f93265b;

        /* renamed from: a */
        public final void mo75351a(boolean z) {
            this.f93264a.f93239b = z;
            ImageView imageView = this.f93264a.f93253t;
            if (imageView != null) {
                imageView.setSelected(this.f93264a.f93239b);
            }
            DataCenter dataCenter = this.f93264a.f93240c;
            if (dataCenter != null) {
                dataCenter.mo48228a("action_is_landscape_mode", (Object) Boolean.valueOf(this.f93264a.f93239b));
            }
            C36424a aVar = this.f93264a.f93244k;
            if (aVar != null) {
                aVar.mo75370a(this.f93264a.f93239b);
            }
            C36427a.m82195a((Activity) this.f93264a.getActivity(), (View) this.f93264a.f93248o, (View) this.f93264a.f93246m, this.f93264a.f93242e, this.f93265b, this.f93264a.f93239b);
            C36407f.m82163g();
        }

        C36413f(C36407f fVar, C36429d dVar) {
            this.f93264a = fVar;
            this.f93265b = dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.f$g */
    public static final class C36414g implements C36402b {

        /* renamed from: a */
        final /* synthetic */ C36407f f93266a;

        /* renamed from: a */
        public final long mo75343a() {
            VideoPlayerWidget videoPlayerWidget = this.f93266a.f93255v;
            if (videoPlayerWidget != null) {
                return videoPlayerWidget.mo75387d();
            }
            return 0;
        }

        C36414g(C36407f fVar) {
            this.f93266a = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.f$h */
    public static final class C36415h implements C36389a {

        /* renamed from: a */
        final /* synthetic */ C36407f f93267a;

        /* renamed from: b */
        public final void mo75253b() {
            NoOperateModeController noOperateModeController = this.f93267a.f93245l;
            if (noOperateModeController == null || !noOperateModeController.f93270c) {
                NoOperateModeController noOperateModeController2 = this.f93267a.f93245l;
                if (noOperateModeController2 != null) {
                    noOperateModeController2.mo75352a(0);
                    return;
                }
                return;
            }
            C36407f.m82163g();
        }

        /* renamed from: a */
        public final void mo75252a() {
            String str;
            DataCenter dataCenter = this.f93267a.f93240c;
            if (dataCenter != null) {
                dataCenter.mo48228a("action_container_on_double_click_digg", (Object) "onDoubleClickDigg");
            }
            if (this.f93267a.f93238a != null) {
                if (C25823j.f68267a) {
                    C25780a aVar = this.f93267a.f93256w;
                    if (aVar != null) {
                        C25778d dVar = new C25778d("like", null, null, null, 14, null);
                        aVar.mo52993a(dVar);
                    }
                } else if (C25788h.m62410a()) {
                    CommerceEggLayout commerceEggLayout = this.f93267a.f93251r;
                    if (commerceEggLayout != null) {
                        commerceEggLayout.mo52925a(this.f93267a.f93257x, this.f93267a.f93258y, 1, true);
                    }
                } else {
                    CommerceLikeLayout commerceLikeLayout = this.f93267a.f93250q;
                    if (commerceLikeLayout != null) {
                        String str2 = this.f93267a.f93243j;
                        Aweme aweme = this.f93267a.f93238a;
                        if (aweme != null) {
                            str = aweme.getAid();
                        } else {
                            str = null;
                        }
                        commerceLikeLayout.mo54399a(str2, str);
                    }
                }
            }
        }

        C36415h(C36407f fVar) {
            this.f93267a = fVar;
        }
    }

    /* renamed from: g */
    public static void m82163g() {
        C47718bf.m103288a(new C36349a());
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f93237J != null) {
            this.f93237J.clear();
        }
    }

    /* renamed from: h */
    private final int m82164h() {
        Resources resources = getResources();
        C52711k.m112236a((Object) resources, "resources");
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    /* renamed from: i */
    private final C36429d m82165i() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            WindowManager windowManager = activity.getWindowManager();
            if (windowManager != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                if (defaultDisplay != null) {
                    defaultDisplay.getMetrics(displayMetrics);
                }
            }
        }
        return C36427a.m82194a(displayMetrics.widthPixels, C23724k.m58229e(getActivity()));
    }

    public final void onDestroy() {
        super.onDestroy();
        C30303h hVar = this.f93232E;
        if (hVar != null) {
            hVar.mo60468b();
        }
        if (C25823j.f68267a) {
            C25780a aVar = this.f93256w;
            if (aVar != null) {
                aVar.mo52992a();
            }
        } else if (C25788h.m62410a()) {
            CommerceEggLayout commerceEggLayout = this.f93251r;
            if (commerceEggLayout != null) {
                commerceEggLayout.mo52923a();
            }
            this.f93257x = null;
            this.f93258y = null;
        }
    }

    /* renamed from: a */
    public final void mo75345a() {
        boolean z;
        C36407f fVar;
        if (this.f93239b) {
            Rotate rotate = this.f93241d;
            if (rotate != null) {
                rotate.mo75360b();
            }
        } else {
            if (C13248c.m26638a(this.f93231D) || this.f93255v == null || this.f93238a == null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                fVar = this;
            } else {
                fVar = null;
            }
            C36407f fVar2 = fVar;
            if (fVar2 != null) {
                String str = fVar2.f93231D;
                VideoPlayerWidget videoPlayerWidget = fVar2.f93255v;
                if (videoPlayerWidget == null) {
                    C52711k.m112234a();
                }
                long d = videoPlayerWidget.mo75387d();
                Aweme aweme = fVar2.f93238a;
                if (aweme == null) {
                    C52711k.m112234a();
                }
                String aid = aweme.getAid();
                C52711k.m112236a((Object) aid, "mAweme!!.aid");
                C27095b bVar = new C27095b(str, 2, d, aid);
                C47718bf.m103288a(bVar);
            }
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: f */
    public final void mo75347f() {
        ImageView imageView = this.f93253t;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        FrameLayout frameLayout = this.f93234G;
        if (frameLayout != null) {
            ViewPropertyAnimator animate = frameLayout.animate();
            if (animate != null) {
                ViewPropertyAnimator alpha = animate.alpha(1.0f);
                if (alpha != null) {
                    ViewPropertyAnimator duration = alpha.setDuration(200);
                    if (duration != null) {
                        duration.start();
                    }
                }
            }
        }
        if (!this.f93239b) {
            if (C36405a.m82161a()) {
                FrameLayout frameLayout2 = this.f93249p;
                if (frameLayout2 != null) {
                    ViewPropertyAnimator animate2 = frameLayout2.animate();
                    if (animate2 != null) {
                        ViewPropertyAnimator alpha2 = animate2.alpha(1.0f);
                        if (alpha2 != null) {
                            ViewPropertyAnimator duration2 = alpha2.setDuration(200);
                            if (duration2 != null) {
                                duration2.start();
                            }
                        }
                    }
                }
                return;
            }
            FrameLayout frameLayout3 = this.f93249p;
            if (frameLayout3 != null) {
                frameLayout3.setVisibility(0);
            }
            FrameLayout frameLayout4 = this.f93249p;
            if (frameLayout4 != null) {
                frameLayout4.setAlpha(0.0f);
            }
            FrameLayout frameLayout5 = this.f93249p;
            if (frameLayout5 != null) {
                ViewPropertyAnimator animate3 = frameLayout5.animate();
                if (animate3 != null) {
                    ViewPropertyAnimator alpha3 = animate3.alpha(1.0f);
                    if (alpha3 != null) {
                        ViewPropertyAnimator duration3 = alpha3.setDuration(200);
                        if (duration3 != null) {
                            ViewPropertyAnimator withEndAction = duration3.withEndAction(C36410c.f93260a);
                            if (withEndAction != null) {
                                withEndAction.start();
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo75346e() {
        if (!this.f93239b) {
            ImageView imageView = this.f93253t;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        }
        if (this.f93239b) {
            ImageView imageView2 = this.f93253t;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            FrameLayout frameLayout = this.f93234G;
            if (frameLayout != null) {
                ViewPropertyAnimator animate = frameLayout.animate();
                if (animate != null) {
                    ViewPropertyAnimator alpha = animate.alpha(0.0f);
                    if (alpha != null) {
                        ViewPropertyAnimator duration = alpha.setDuration(200);
                        if (duration != null) {
                            duration.start();
                        }
                    }
                }
            }
        } else {
            FrameLayout frameLayout2 = this.f93234G;
            if (frameLayout2 != null) {
                ViewPropertyAnimator animate2 = frameLayout2.animate();
                if (animate2 != null) {
                    ViewPropertyAnimator alpha2 = animate2.alpha(0.34f);
                    if (alpha2 != null) {
                        ViewPropertyAnimator duration2 = alpha2.setDuration(200);
                        if (duration2 != null) {
                            duration2.start();
                        }
                    }
                }
            }
        }
        if (C36405a.m82161a()) {
            FrameLayout frameLayout3 = this.f93249p;
            if (frameLayout3 != null) {
                ViewPropertyAnimator animate3 = frameLayout3.animate();
                if (animate3 != null) {
                    ViewPropertyAnimator alpha3 = animate3.alpha(0.34f);
                    if (alpha3 != null) {
                        ViewPropertyAnimator duration3 = alpha3.setDuration(200);
                        if (duration3 != null) {
                            duration3.start();
                        }
                    }
                }
            }
            return;
        }
        FrameLayout frameLayout4 = this.f93249p;
        if (frameLayout4 != null) {
            ViewPropertyAnimator animate4 = frameLayout4.animate();
            if (animate4 != null) {
                ViewPropertyAnimator alpha4 = animate4.alpha(0.0f);
                if (alpha4 != null) {
                    ViewPropertyAnimator duration4 = alpha4.setDuration(200);
                    if (duration4 != null) {
                        ViewPropertyAnimator withEndAction = duration4.withEndAction(new C36409b(this));
                        if (withEndAction != null) {
                            withEndAction.start();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public final String mo60874g(boolean z) {
        return this.f93243j;
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.az9) {
            mo75345a();
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        Rotate rotate = this.f93241d;
        if (rotate != null) {
            if (configuration != null && configuration.orientation == 1) {
                rotate.f93282e = false;
                rotate.mo75359a(false);
            } else if (configuration != null && configuration.orientation == 2) {
                rotate.f93282e = true;
                rotate.mo75359a(true);
            }
        }
        super.onConfigurationChanged(configuration);
    }

    public final /* synthetic */ void onChanged(Object obj) {
        String str;
        C23274a aVar = (C23274a) obj;
        if (aVar != null) {
            str = aVar.f62242a;
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -2091198651) {
                if (hashCode != 356960147) {
                    if (hashCode == 441659136 && str.equals("resize_video_and_cover")) {
                        this.f93236I = (C36428c) aVar.mo48246a();
                        C36427a.m82195a((Activity) getActivity(), (View) this.f93248o, (View) this.f93246m, this.f93242e, m82165i(), this.f93239b);
                    }
                } else if (str.equals("action_video_on_play_completed") && !this.f93239b) {
                    ImageView imageView = this.f93253t;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    mo75347f();
                    NoOperateModeController noOperateModeController = this.f93245l;
                    if (noOperateModeController != null) {
                        noOperateModeController.f93270c = false;
                    }
                }
            } else if (str.equals("action_switch_mode")) {
                Rotate rotate = this.f93241d;
                if (rotate != null) {
                    rotate.mo75360b();
                }
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo60714a(Object obj) {
        Integer num;
        User user;
        C30332aw awVar = (C30332aw) obj;
        String str = null;
        if (awVar != null) {
            num = Integer.valueOf(awVar.f79228a);
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 1) {
            C23718g b = C23718g.m58207b();
            C52711k.m112236a((Object) b, "NetworkStateManager.getInstance()");
            if (!b.mo49153d()) {
                C10691a.m21542b((Context) getActivity(), (int) R.string.cg1).mo19066a();
                return;
            }
            Object obj2 = awVar.f79229b;
            if (obj2 != null) {
                Aweme aweme = (Aweme) obj2;
                if (aweme != null) {
                    user = aweme.getAuthor();
                } else {
                    user = null;
                }
                if (user != null) {
                    ShareDependService a = C41922a.m91868a();
                    C30303h hVar = this.f93232E;
                    if (hVar != null) {
                        str = hVar.mo60476k();
                    }
                    if (str == null) {
                        str = "";
                    }
                    FragmentActivity requireActivity = requireActivity();
                    C52711k.m112236a((Object) requireActivity, "requireActivity()");
                    a.showReportDialog(aweme, str, requireActivity, "");
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
            }
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        switch (i) {
            case 24:
                DataCenter dataCenter = this.f93240c;
                if (dataCenter != null) {
                    dataCenter.mo48228a("action_keycode_volume_up", (Object) Integer.valueOf(i));
                }
                return true;
            case 25:
                DataCenter dataCenter2 = this.f93240c;
                if (dataCenter2 != null) {
                    dataCenter2.mo48228a("action_keycode_volume_down", (Object) Integer.valueOf(i));
                }
                return true;
            default:
                return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        if (r12 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        if (r12 == null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r12 == null) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
            r11 = this;
            java.lang.String r0 = "view"
            p2628d.p2639f.p2641b.C52711k.m112240b(r12, r0)
            super.onViewCreated(r12, r13)
            android.os.Bundle r12 = r11.getArguments()
            if (r12 == 0) goto L_0x0018
            java.lang.String r13 = "extra_event_type"
            java.lang.String r0 = ""
            java.lang.String r12 = r12.getString(r13, r0)
            if (r12 != 0) goto L_0x001a
        L_0x0018:
            java.lang.String r12 = ""
        L_0x001a:
            r11.f93243j = r12
            android.os.Bundle r12 = r11.getArguments()
            r13 = 0
            if (r12 == 0) goto L_0x002a
            java.lang.String r0 = "extra_page_type"
            int r12 = r12.getInt(r0, r13)
            goto L_0x002b
        L_0x002a:
            r12 = 0
        L_0x002b:
            r11.f93230C = r12
            android.os.Bundle r12 = r11.getArguments()
            if (r12 == 0) goto L_0x003d
            java.lang.String r0 = "extra_business_type"
            java.lang.String r1 = ""
            java.lang.String r12 = r12.getString(r0, r1)
            if (r12 != 0) goto L_0x003f
        L_0x003d:
            java.lang.String r12 = ""
        L_0x003f:
            r11.f93229B = r12
            android.os.Bundle r12 = r11.getArguments()
            if (r12 == 0) goto L_0x0051
            java.lang.String r0 = "extra_react_session_id"
            java.lang.String r1 = ""
            java.lang.String r12 = r12.getString(r0, r1)
            if (r12 != 0) goto L_0x0053
        L_0x0051:
            java.lang.String r12 = ""
        L_0x0053:
            r11.f93231D = r12
            android.os.Bundle r12 = r11.getArguments()
            if (r12 == 0) goto L_0x0062
            java.lang.String r0 = "extra_hide_interact_area"
            boolean r12 = r12.getBoolean(r0, r13)
            goto L_0x0063
        L_0x0062:
            r12 = 0
        L_0x0063:
            r11.f93228A = r12
            r12 = 0
            r11.f93242e = r12
            java.lang.String r0 = "long_video_player_activity"
            java.lang.String r1 = r11.f93229B
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007c
            com.ss.android.ugc.aweme.longvideonew.i r0 = com.p683ss.android.ugc.aweme.longvideonew.C36433i.f93328b
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r11.f93238a
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.mo75372a(r1)
            r11.f93242e = r0
        L_0x007c:
            com.ss.android.ugc.aweme.feed.model.Video r0 = r11.f93242e
            if (r0 != 0) goto L_0x008a
            com.ss.android.ugc.aweme.longvideonew.i r0 = com.p683ss.android.ugc.aweme.longvideonew.C36433i.f93327a
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r11.f93238a
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.mo75372a(r1)
            r11.f93242e = r0
        L_0x008a:
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.egg.C25823j.f68267a
            r1 = 1
            if (r0 == 0) goto L_0x00ff
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.f93238a
            if (r0 == 0) goto L_0x0125
            com.ss.android.ugc.aweme.feed.model.ItemLikeEggData r0 = r0.getCommerceAdLikeDigg()
            if (r0 == 0) goto L_0x0125
            android.view.ViewStub r2 = r11.f93235H
            if (r2 == 0) goto L_0x0125
            com.ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService r3 = com.p683ss.android.ugc.aweme.commercialize.egg.impl.service.CommerceEggServiceImpl.createICommerceEggServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService r3 = (com.p683ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService) r3
            if (r3 == 0) goto L_0x00aa
            com.ss.android.ugc.aweme.commercialize.egg.f.a r2 = r3.getCommerceEggView(r2)
            goto L_0x00ab
        L_0x00aa:
            r2 = r12
        L_0x00ab:
            r11.f93256w = r2
            com.ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService r2 = com.p683ss.android.ugc.aweme.commercialize.egg.impl.service.CommerceEggServiceImpl.createICommerceEggServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService r2 = (com.p683ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService) r2
            com.ss.android.ugc.aweme.commercialize.egg.e.a$a r3 = new com.ss.android.ugc.aweme.commercialize.egg.e.a$a
            r3.<init>()
            java.lang.String r4 = "it"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r4)
            com.ss.android.ugc.aweme.commercialize.egg.e.a$a r0 = r3.mo52975a(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r11.f93238a
            if (r3 == 0) goto L_0x00ca
            java.lang.String r3 = r3.getAid()
            goto L_0x00cb
        L_0x00ca:
            r3 = r12
        L_0x00cb:
            com.ss.android.ugc.aweme.commercialize.egg.e.a$a r0 = r0.mo52976a(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r11.f93238a
            if (r3 == 0) goto L_0x00de
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.getAuthor()
            if (r3 == 0) goto L_0x00de
            java.lang.String r3 = r3.getUid()
            goto L_0x00df
        L_0x00de:
            r3 = r12
        L_0x00df:
            com.ss.android.ugc.aweme.commercialize.egg.e.a$a r0 = r0.mo52978b(r3)
            java.lang.String r3 = r11.f93243j
            com.ss.android.ugc.aweme.commercialize.egg.e.a$a r0 = r0.mo52979c(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r11.f93238a
            if (r3 == 0) goto L_0x00f2
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r3.getAwemeRawAd()
            goto L_0x00f3
        L_0x00f2:
            r3 = r12
        L_0x00f3:
            com.ss.android.ugc.aweme.commercialize.egg.e.a$a r0 = r0.mo52974a(r3)
            com.ss.android.ugc.aweme.commercialize.egg.e.a r0 = r0.mo52977a()
            r2.addCommerceEggData(r0)
            goto L_0x0125
        L_0x00ff:
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.egg.C25788h.m62410a()
            if (r0 == 0) goto L_0x011c
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.f93238a
            com.ss.android.ugc.aweme.commercialize.egg.b r0 = com.p683ss.android.ugc.aweme.commercialize.egg.C25770d.m62387a(r0, r1)
            r11.f93257x = r0
            com.ss.android.ugc.aweme.commercialize.egg.b r0 = r11.f93257x
            if (r0 == 0) goto L_0x0125
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.f93238a
            java.lang.String r2 = r11.f93243j
            com.ss.android.ugc.aweme.commercialize.egg.a.b r0 = com.p683ss.android.ugc.aweme.commercialize.egg.C25770d.m62386a(r0, r2)
            r11.f93258y = r0
            goto L_0x0125
        L_0x011c:
            com.ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout r0 = r11.f93250q
            if (r0 == 0) goto L_0x0125
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r11.f93238a
            r0.setCommerceDigg(r2)
        L_0x0125:
            com.ss.android.ugc.aweme.feed.h r0 = new com.ss.android.ugc.aweme.feed.h
            java.lang.String r2 = r11.f93243j
            int r3 = r11.f93230C
            r4 = r11
            com.ss.android.ugc.aweme.feed.h.ae r4 = (com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae) r4
            r5 = r11
            com.ss.android.ugc.aweme.feed.k.d r5 = (com.p683ss.android.ugc.aweme.feed.p1728k.C30447d) r5
            r0.<init>(r2, r3, r4, r5)
            r11.f93232E = r0
            com.ss.android.ugc.aweme.feed.h r0 = r11.f93232E
            if (r0 == 0) goto L_0x0146
            android.support.v4.app.FragmentActivity r2 = r11.getActivity()
            android.app.Activity r2 = (android.app.Activity) r2
            r3 = r11
            android.support.v4.app.Fragment r3 = (android.support.p030v4.app.Fragment) r3
            r0.mo52903a(r2, r3)
        L_0x0146:
            com.ss.android.ugc.aweme.feed.h r0 = r11.f93232E
            if (r0 == 0) goto L_0x014d
            r0.mo60465a()
        L_0x014d:
            r0 = r11
            android.support.v4.app.Fragment r0 = (android.support.p030v4.app.Fragment) r0
            r2 = r11
            android.arch.lifecycle.ab r2 = (android.arch.lifecycle.C0160ab) r2
            android.arch.lifecycle.y r2 = com.p683ss.android.ugc.aweme.arch.widgets.base.C23278c.m57254a(r0, r2)
            r3 = r11
            android.arch.lifecycle.k r3 = (android.arch.lifecycle.C0184k) r3
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r2 = com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter.m57235a(r2, r3)
            r11.f93240c = r2
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r2 = r11.f93240c
            if (r2 == 0) goto L_0x016c
            java.lang.String r3 = "action_switch_mode"
            r4 = r11
            android.arch.lifecycle.s r4 = (android.arch.lifecycle.C0199s) r4
            r2.mo48226a(r3, r4)
        L_0x016c:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r2 = r11.f93240c
            if (r2 == 0) goto L_0x0178
            java.lang.String r3 = "action_video_on_play_completed"
            r4 = r11
            android.arch.lifecycle.s r4 = (android.arch.lifecycle.C0199s) r4
            r2.mo48226a(r3, r4)
        L_0x0178:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r2 = r11.f93240c
            if (r2 == 0) goto L_0x0184
            java.lang.String r3 = "resize_video_and_cover"
            r4 = r11
            android.arch.lifecycle.s r4 = (android.arch.lifecycle.C0199s) r4
            r2.mo48226a(r3, r4)
        L_0x0184:
            android.widget.FrameLayout r2 = r11.f93233F
            android.view.View r2 = (android.view.View) r2
            com.ss.android.ugc.aweme.arch.widgets.base.d r0 = com.p683ss.android.ugc.aweme.arch.widgets.base.C23279d.m57256a(r0, r2)
            java.lang.String r2 = "widgetManager"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r2 = r11.f93240c
            r0.mo48252a(r2)
            com.ss.android.ugc.aweme.longvideonew.widget.VideoPlayerWidget r2 = new com.ss.android.ugc.aweme.longvideonew.widget.VideoPlayerWidget
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r11.f93238a
            java.lang.String r5 = r11.f93243j
            int r6 = r11.f93230C
            java.lang.String r7 = r11.f93229B
            com.ss.android.ugc.aweme.feed.h r8 = r11.f93232E
            android.os.Bundle r3 = r11.getArguments()
            if (r3 != 0) goto L_0x01ab
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x01ab:
            java.lang.String r9 = "extra_initial_time"
            int r9 = r3.getInt(r9, r13)
            java.lang.String r10 = r11.f93231D
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r11.f93255v = r2
            r2 = 2132024514(0x7f141cc2, float:1.9687506E38)
            com.ss.android.ugc.aweme.longvideonew.widget.VideoPlayerWidget r3 = r11.f93255v
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r3 = (com.p683ss.android.ugc.aweme.arch.widgets.base.Widget) r3
            r0.mo48255b(r2, r3)
            r2 = 2132021446(0x7f1410c6, float:1.9681284E38)
            com.ss.android.ugc.aweme.longvideonew.widget.VideoOperationWidget r10 = new com.ss.android.ugc.aweme.longvideonew.widget.VideoOperationWidget
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r11.f93238a
            java.lang.String r5 = r11.f93243j
            int r6 = r11.f93230C
            java.lang.String r7 = r11.f93229B
            com.ss.android.ugc.aweme.longvideonew.f$g r3 = new com.ss.android.ugc.aweme.longvideonew.f$g
            r3.<init>(r11)
            r8 = r3
            com.ss.android.ugc.aweme.longvideonew.b r8 = (com.p683ss.android.ugc.aweme.longvideonew.C36402b) r8
            com.ss.android.ugc.aweme.feed.h r9 = r11.f93232E
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r10 = (com.p683ss.android.ugc.aweme.arch.widgets.base.Widget) r10
            r0.mo48255b(r2, r10)
            r2 = 2132021621(0x7f141175, float:1.9681639E38)
            com.ss.android.ugc.aweme.longvideonew.widget.VideoSeekContainerWidget r3 = new com.ss.android.ugc.aweme.longvideonew.widget.VideoSeekContainerWidget
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r11.f93238a
            java.lang.String r5 = r11.f93243j
            int r6 = r11.f93230C
            java.lang.String r7 = r11.f93229B
            r3.<init>(r4, r5, r6, r7)
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r3 = (com.p683ss.android.ugc.aweme.arch.widgets.base.Widget) r3
            r0.mo48255b(r2, r3)
            r2 = 2132019262(0x7f14083e, float:1.9676854E38)
            com.ss.android.ugc.aweme.longvideonew.widget.VideoFunctionalLayerWidget r3 = new com.ss.android.ugc.aweme.longvideonew.widget.VideoFunctionalLayerWidget
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r11.f93238a
            java.lang.String r5 = r11.f93243j
            int r6 = r11.f93230C
            java.lang.String r7 = r11.f93229B
            r3.<init>(r4, r5, r6, r7)
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r3 = (com.p683ss.android.ugc.aweme.arch.widgets.base.Widget) r3
            r0.mo48255b(r2, r3)
            com.ss.android.ugc.aweme.longvideo.view.DoubleClickDiggFrameLayout r0 = r11.f93247n
            if (r0 == 0) goto L_0x021b
            com.ss.android.ugc.aweme.longvideonew.f$h r2 = new com.ss.android.ugc.aweme.longvideonew.f$h
            r2.<init>(r11)
            com.ss.android.ugc.aweme.longvideo.view.DoubleClickDiggFrameLayout$a r2 = (com.p683ss.android.ugc.aweme.longvideo.view.DoubleClickDiggFrameLayout.C36389a) r2
            r0.setOnDiggListener(r2)
        L_0x021b:
            android.support.v4.app.FragmentActivity r0 = r11.getActivity()
            android.content.Context r0 = (android.content.Context) r0
            boolean r0 = com.p683ss.android.ugc.aweme.longvideonew.C36430g.m82197a(r0)
            if (r0 != 0) goto L_0x0233
            android.support.v4.app.FragmentActivity r0 = r11.getActivity()
            android.content.Context r0 = (android.content.Context) r0
            r2 = 2132546922(0x7f1c156a, float:2.0747076E38)
            com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r0, r2)
        L_0x0233:
            java.lang.String r0 = "long_video_player_activity"
            java.lang.String r2 = r11.f93229B
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x030c
            com.ss.android.ugc.aweme.longvideonew.feature.d r0 = r11.m82165i()
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r2 = r11.f93240c
            if (r2 == 0) goto L_0x0250
            java.lang.String r3 = "action_is_landscape_mode"
            boolean r4 = r11.f93239b
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2.mo48228a(r3, r4)
        L_0x0250:
            android.support.v4.app.FragmentActivity r2 = r11.getActivity()
            android.app.Activity r2 = (android.app.Activity) r2
            android.widget.FrameLayout r3 = r11.f93248o
            android.view.View r3 = (android.view.View) r3
            android.widget.FrameLayout r4 = r11.f93246m
            android.view.View r4 = (android.view.View) r4
            com.ss.android.ugc.aweme.feed.model.Video r5 = r11.f93242e
            boolean r7 = r11.f93239b
            r6 = r0
            com.p683ss.android.ugc.aweme.longvideonew.feature.C36426b.C36427a.m82195a(r2, r3, r4, r5, r6, r7)
            com.ss.android.ugc.aweme.longvideonew.feature.Rotate r2 = new com.ss.android.ugc.aweme.longvideonew.feature.Rotate
            android.support.v4.app.FragmentActivity r3 = r11.getActivity()
            if (r3 == 0) goto L_0x0304
            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r3 = (com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity) r3
            com.ss.android.ugc.aweme.feed.model.Video r4 = r11.f93242e
            r2.<init>(r3, r4)
            r11.f93241d = r2
            com.ss.android.ugc.aweme.longvideonew.feature.Rotate r2 = r11.f93241d
            if (r2 == 0) goto L_0x028c
            com.ss.android.ugc.aweme.longvideonew.f$f r3 = new com.ss.android.ugc.aweme.longvideonew.f$f
            r3.<init>(r11, r0)
            com.ss.android.ugc.aweme.longvideonew.feature.Rotate$a r3 = (com.p683ss.android.ugc.aweme.longvideonew.feature.Rotate.C36418a) r3
            java.lang.String r0 = "observer"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
            java.util.ArrayList<com.ss.android.ugc.aweme.longvideonew.feature.Rotate$a> r0 = r2.f93279b
            r0.add(r3)
        L_0x028c:
            com.ss.android.ugc.aweme.longvideo.view.CustomBottomSheetBehavior r0 = new com.ss.android.ugc.aweme.longvideo.view.CustomBottomSheetBehavior
            r0.<init>()
            com.ss.android.ugc.aweme.longvideonew.f$d r2 = new com.ss.android.ugc.aweme.longvideonew.f$d
            r2.<init>(r11, r0)
            android.support.design.widget.BottomSheetBehavior$a r2 = (android.support.design.widget.BottomSheetBehavior.C0497a) r2
            r0.f1646q = r2
            r0.f1638i = r1
            android.support.v4.app.FragmentActivity r2 = r11.getActivity()
            android.content.Context r2 = (android.content.Context) r2
            boolean r2 = com.p683ss.android.ugc.aweme.app.p1372c.C23059a.m56592a(r2)
            if (r2 != 0) goto L_0x02c6
            android.support.v4.app.FragmentActivity r2 = r11.getActivity()
            android.content.Context r2 = (android.content.Context) r2
            int r2 = com.p683ss.android.ugc.aweme.base.utils.C23724k.m58221a(r2)
            int r3 = r11.m82164h()
            int r2 = r2 + r3
            android.support.v4.app.FragmentActivity r3 = r11.getActivity()
            android.content.Context r3 = (android.content.Context) r3
            int r3 = com.p683ss.android.ugc.aweme.adaptation.C22453b.m55512d(r3)
            int r2 = r2 + r3
            r0.mo1296a(r2)
            goto L_0x02d8
        L_0x02c6:
            android.support.v4.app.FragmentActivity r2 = r11.getActivity()
            android.content.Context r2 = (android.content.Context) r2
            int r2 = com.p683ss.android.ugc.aweme.base.utils.C23724k.m58221a(r2)
            int r3 = r11.m82164h()
            int r2 = r2 + r3
            r0.mo1296a(r2)
        L_0x02d8:
            r0.f1639j = r1
            r1 = 3
            r0.mo1301b(r1)
            com.ss.android.ugc.aweme.longvideonew.f$e r1 = new com.ss.android.ugc.aweme.longvideonew.f$e
            r1.<init>(r11)
            com.ss.android.ugc.aweme.longvideo.view.CustomBottomSheetBehavior$a r1 = (com.p683ss.android.ugc.aweme.longvideo.view.CustomBottomSheetBehavior.C36388a) r1
            r0.mo75309a(r1)
            com.ss.android.ugc.aweme.longvideo.view.DoubleClickDiggFrameLayout r1 = r11.f93247n
            if (r1 == 0) goto L_0x02f0
            android.view.ViewGroup$LayoutParams r12 = r1.getLayoutParams()
        L_0x02f0:
            if (r12 == 0) goto L_0x02fc
            android.support.design.widget.CoordinatorLayout$d r12 = (android.support.design.widget.CoordinatorLayout.C0505d) r12
            if (r12 == 0) goto L_0x030c
            android.support.design.widget.CoordinatorLayout$Behavior r0 = (android.support.design.widget.CoordinatorLayout.Behavior) r0
            r12.mo1383a(r0)
            goto L_0x030c
        L_0x02fc:
            d.u r12 = new d.u
            java.lang.String r13 = "null cannot be cast to non-null type android.support.design.widget.CoordinatorLayout.LayoutParams"
            r12.<init>(r13)
            throw r12
        L_0x0304:
            d.u r12 = new d.u
            java.lang.String r13 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.activity.AmeSSActivity"
            r12.<init>(r13)
            throw r12
        L_0x030c:
            boolean r12 = r11.f93228A
            if (r12 == 0) goto L_0x032e
            android.widget.FrameLayout r12 = r11.f93249p
            if (r12 == 0) goto L_0x0319
            int r12 = r12.getChildCount()
            goto L_0x031a
        L_0x0319:
            r12 = 0
        L_0x031a:
            if (r13 >= r12) goto L_0x032e
            android.widget.FrameLayout r0 = r11.f93249p
            if (r0 == 0) goto L_0x032b
            android.view.View r0 = r0.getChildAt(r13)
            if (r0 == 0) goto L_0x032b
            r1 = 8
            r0.setVisibility(r1)
        L_0x032b:
            int r13 = r13 + 1
            goto L_0x031a
        L_0x032e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.longvideonew.C36407f.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        DoubleClickDiggFrameLayout doubleClickDiggFrameLayout;
        RelativeLayout relativeLayout;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        CommerceLikeLayout commerceLikeLayout;
        CommerceEggLayout commerceEggLayout;
        ViewStub viewStub;
        ImageView imageView;
        C52711k.m112240b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.o8, viewGroup, false);
        if (inflate != null) {
            this.f93233F = (FrameLayout) inflate;
            FrameLayout frameLayout4 = this.f93233F;
            FrameLayout frameLayout5 = null;
            if (frameLayout4 != null) {
                view = frameLayout4.findViewById(R.id.k3);
            } else {
                view = null;
            }
            this.f93252s = view;
            FrameLayout frameLayout6 = this.f93233F;
            if (frameLayout6 != null) {
                doubleClickDiggFrameLayout = (DoubleClickDiggFrameLayout) frameLayout6.findViewById(R.id.dpt);
            } else {
                doubleClickDiggFrameLayout = null;
            }
            this.f93247n = doubleClickDiggFrameLayout;
            FrameLayout frameLayout7 = this.f93233F;
            if (frameLayout7 != null) {
                relativeLayout = (RelativeLayout) frameLayout7.findViewById(R.id.d1z);
            } else {
                relativeLayout = null;
            }
            this.f93254u = relativeLayout;
            FrameLayout frameLayout8 = this.f93233F;
            if (frameLayout8 != null) {
                frameLayout = (FrameLayout) frameLayout8.findViewById(R.id.ak8);
            } else {
                frameLayout = null;
            }
            this.f93246m = frameLayout;
            FrameLayout frameLayout9 = this.f93233F;
            if (frameLayout9 != null) {
                frameLayout2 = (FrameLayout) frameLayout9.findViewById(R.id.bv1);
            } else {
                frameLayout2 = null;
            }
            this.f93249p = frameLayout2;
            FrameLayout frameLayout10 = this.f93233F;
            if (frameLayout10 != null) {
                frameLayout3 = (FrameLayout) frameLayout10.findViewById(R.id.dpv);
            } else {
                frameLayout3 = null;
            }
            this.f93248o = frameLayout3;
            FrameLayout frameLayout11 = this.f93233F;
            if (frameLayout11 != null) {
                commerceLikeLayout = (CommerceLikeLayout) frameLayout11.findViewById(R.id.y1);
            } else {
                commerceLikeLayout = null;
            }
            this.f93250q = commerceLikeLayout;
            FrameLayout frameLayout12 = this.f93233F;
            if (frameLayout12 != null) {
                commerceEggLayout = (CommerceEggLayout) frameLayout12.findViewById(R.id.e3c);
            } else {
                commerceEggLayout = null;
            }
            this.f93251r = commerceEggLayout;
            FrameLayout frameLayout13 = this.f93233F;
            if (frameLayout13 != null) {
                viewStub = (ViewStub) frameLayout13.findViewById(R.id.e38);
            } else {
                viewStub = null;
            }
            this.f93235H = viewStub;
            FrameLayout frameLayout14 = this.f93233F;
            if (frameLayout14 != null) {
                imageView = (ImageView) frameLayout14.findViewById(R.id.az9);
            } else {
                imageView = null;
            }
            this.f93253t = imageView;
            ImageView imageView2 = this.f93253t;
            if (imageView2 != null) {
                imageView2.setOnClickListener(this);
            }
            ImageView imageView3 = this.f93253t;
            if (imageView3 != null) {
                imageView3.setSelected(false);
            }
            FrameLayout frameLayout15 = this.f93233F;
            if (frameLayout15 != null) {
                frameLayout5 = (FrameLayout) frameLayout15.findViewById(R.id.bye);
            }
            this.f93234G = frameLayout5;
            this.f93244k = new C36424a(getActivity(), this.f93233F, this.f93234G);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                this.f93245l = new NoOperateModeController((AmeSSActivity) activity);
                NoOperateModeController noOperateModeController = this.f93245l;
                if (noOperateModeController != null) {
                    C36416a aVar = this;
                    C52711k.m112240b(aVar, "noOperationCallback");
                    noOperateModeController.f93269b = aVar;
                }
                return this.f93233F;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.activity.AmeSSActivity");
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout");
    }
}
