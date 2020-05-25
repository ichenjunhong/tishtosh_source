package com.p683ss.android.ugc.aweme.longvideo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.design.widget.BottomSheetBehavior.C0497a;
import android.support.design.widget.CoordinatorLayout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.ugc.aweme.app.p1372c.C23059a;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.base.activity.C23422a;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimatedImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.AudioControlView;
import com.p683ss.android.ugc.aweme.base.utils.C23718g;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.comment.p1521f.C25164b.C25165a;
import com.p683ss.android.ugc.aweme.commercialize.egg.C25751b;
import com.p683ss.android.ugc.aweme.commercialize.egg.C25788h;
import com.p683ss.android.ugc.aweme.commercialize.egg.C25823j;
import com.p683ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1556a.C25746b;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1560e.C25778d;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1561f.C25780a;
import com.p683ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout;
import com.p683ss.android.ugc.aweme.feed.C30303h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30447d;
import com.p683ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.p683ss.android.ugc.aweme.longvideo.LongVideoPlayView.C36345b;
import com.p683ss.android.ugc.aweme.longvideo.feature.LongVideoPlayMob;
import com.p683ss.android.ugc.aweme.longvideo.feature.NoOperateModeController;
import com.p683ss.android.ugc.aweme.longvideo.feature.NoOperateModeController.C36370a;
import com.p683ss.android.ugc.aweme.longvideo.feature.Rotate;
import com.p683ss.android.ugc.aweme.longvideo.feature.Rotate.C36372a;
import com.p683ss.android.ugc.aweme.longvideo.p1933a.C36349a;
import com.p683ss.android.ugc.aweme.longvideo.p1934b.C36357c.C36358a;
import com.p683ss.android.ugc.aweme.longvideo.p1934b.C36359d;
import com.p683ss.android.ugc.aweme.longvideo.view.CustomBottomSheetBehavior;
import com.p683ss.android.ugc.aweme.longvideo.view.CustomBottomSheetBehavior.C36388a;
import com.p683ss.android.ugc.aweme.longvideo.view.DoubleClickDiggFrameLayout;
import com.p683ss.android.ugc.aweme.longvideo.view.DoubleClickDiggFrameLayout.C36389a;
import com.p683ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView;
import com.p683ss.android.ugc.aweme.longvideo.view.VideoPlaySeekBar;
import com.p683ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23238h;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.share.ShareDependService;
import com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p683ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity */
public final class LongVideoPlayActivity extends AmeSSActivity implements OnClickListener, C30313ae<C30332aw>, C30447d, C36370a {

    /* renamed from: Q */
    public static final C36333a f92980Q = new C36333a(null);

    /* renamed from: A */
    public LinearLayout f92981A;

    /* renamed from: B */
    public LineProgressBar f92982B;

    /* renamed from: C */
    public AudioControlView f92983C;

    /* renamed from: D */
    public boolean f92984D;

    /* renamed from: E */
    public Rotate f92985E;

    /* renamed from: F */
    public DiggView f92986F;

    /* renamed from: G */
    public String f92987G = "";

    /* renamed from: H */
    public int f92988H;

    /* renamed from: I */
    public LongVideoPlayMob f92989I;

    /* renamed from: J */
    public LongVideoMobViewModel f92990J;

    /* renamed from: K */
    public C36385k f92991K;

    /* renamed from: L */
    public NoOperateModeController f92992L;

    /* renamed from: M */
    public C25751b f92993M;

    /* renamed from: N */
    public C25746b f92994N;

    /* renamed from: O */
    public C25780a f92995O;

    /* renamed from: P */
    public C36359d f92996P = new C36359d(0, 0);

    /* renamed from: R */
    private final ArrayList<C23422a> f92997R = new ArrayList<>();

    /* renamed from: a */
    public View f92998a;

    /* renamed from: b */
    public ImageView f92999b;

    /* renamed from: c */
    public ImageView f93000c;

    /* renamed from: d */
    public Aweme f93001d;

    /* renamed from: e */
    public C30303h f93002e;

    /* renamed from: f */
    public CustomBottomSheetBehavior<View> f93003f;

    /* renamed from: g */
    public VideoViewComponent f93004g;

    /* renamed from: h */
    public View f93005h;

    /* renamed from: i */
    public CommerceLikeLayout f93006i;

    /* renamed from: j */
    public CommerceEggLayout f93007j;

    /* renamed from: k */
    public VideoPlaySeekBar f93008k;

    /* renamed from: l */
    public LongVideoPlayView f93009l;

    /* renamed from: m */
    public C36383j f93010m;

    /* renamed from: n */
    public LongVideoDiggAnimationView f93011n;

    /* renamed from: o */
    public ImageView f93012o;

    /* renamed from: p */
    public ImageView f93013p;

    /* renamed from: q */
    public ImageView f93014q;

    /* renamed from: r */
    public ImageView f93015r;

    /* renamed from: s */
    public DoubleClickDiggFrameLayout f93016s;

    /* renamed from: t */
    public AnimatedImageView f93017t;

    /* renamed from: u */
    public FrameLayout f93018u;

    /* renamed from: v */
    public View f93019v;

    /* renamed from: w */
    public RelativeLayout f93020w;

    /* renamed from: x */
    public FrameLayout f93021x;

    /* renamed from: y */
    public C36381i f93022y;

    /* renamed from: z */
    public LinearLayout f93023z;

    /* renamed from: com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity$a */
    public static final class C36333a {
        private C36333a() {
        }

        public /* synthetic */ C36333a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity$b */
    static final class C36334b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LongVideoPlayActivity f93024a;

        C36334b(LongVideoPlayActivity longVideoPlayActivity) {
            this.f93024a = longVideoPlayActivity;
        }

        public final void run() {
            LinearLayout linearLayout = this.f93024a.f92981A;
            if (linearLayout != null) {
                linearLayout.setAlpha(1.0f);
            }
            LinearLayout linearLayout2 = this.f93024a.f92981A;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity$c */
    static final class C36335c implements Runnable {

        /* renamed from: a */
        public static final C36335c f93025a = new C36335c();

        C36335c() {
        }

        public final void run() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity$d */
    public static final class C36336d extends C0497a {

        /* renamed from: a */
        final /* synthetic */ LongVideoPlayActivity f93026a;

        C36336d(LongVideoPlayActivity longVideoPlayActivity) {
            this.f93026a = longVideoPlayActivity;
        }

        /* renamed from: a */
        public final void mo1316a(View view, int i) {
            C52711k.m112240b(view, "bottomSheet");
            if (i == 1) {
                Rotate rotate = this.f93026a.f92985E;
                if (rotate != null && rotate.f93123e) {
                    CustomBottomSheetBehavior<View> customBottomSheetBehavior = this.f93026a.f93003f;
                    if (customBottomSheetBehavior != null) {
                        customBottomSheetBehavior.mo1301b(4);
                    }
                }
            } else if (i == 5) {
                this.f93026a.finish();
            }
        }

        /* renamed from: a */
        public final void mo1315a(View view, float f) {
            C52711k.m112240b(view, "bottomSheet");
            if (Float.isNaN(f)) {
                this.f93026a.mo75235e().setAlpha(1.0f);
                this.f93026a.mo75236f().setAlpha(1.0f);
                return;
            }
            float abs = Math.abs(f);
            if (abs > 0.0f && abs < 0.15f) {
                this.f93026a.mo75236f().setAlpha(1.0f - (abs / 0.15f));
            }
            if (abs > 0.15f) {
                this.f93026a.mo75235e().setAlpha(1.0f - ((abs - 0.15f) / 0.85f));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity$e */
    public static final class C36337e implements C36388a {

        /* renamed from: a */
        final /* synthetic */ LongVideoPlayActivity f93027a;

        C36337e(LongVideoPlayActivity longVideoPlayActivity) {
            this.f93027a = longVideoPlayActivity;
        }

        /* renamed from: a */
        public final void mo75246a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            C52711k.m112240b(coordinatorLayout, "parent");
            C52711k.m112240b(view, "child");
            C52711k.m112240b(motionEvent, "event");
            DoubleClickDiggFrameLayout doubleClickDiggFrameLayout = this.f93027a.f93016s;
            if (doubleClickDiggFrameLayout == null) {
                C52711k.m112237a("mRootView");
            }
            doubleClickDiggFrameLayout.mo75310a(motionEvent);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity$f */
    static final class C36338f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LongVideoPlayActivity f93028a;

        C36338f(LongVideoPlayActivity longVideoPlayActivity) {
            this.f93028a = longVideoPlayActivity;
        }

        public final void run() {
            this.f93028a.mo75231a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity$g */
    public static final class C36339g implements C36345b {

        /* renamed from: a */
        final /* synthetic */ LongVideoPlayActivity f93029a;

        /* renamed from: a */
        public final View mo75248a() {
            return this.f93029a.mo75229a();
        }

        /* renamed from: b */
        public final void mo75249b() {
            this.f93029a.mo75229a().setSelected(false);
        }

        /* renamed from: c */
        public final void mo75250c() {
            this.f93029a.mo75229a().setSelected(true);
        }

        C36339g(LongVideoPlayActivity longVideoPlayActivity) {
            this.f93029a = longVideoPlayActivity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity$h */
    public static final class C36340h implements C36372a {

        /* renamed from: a */
        final /* synthetic */ LongVideoPlayActivity f93030a;

        C36340h(LongVideoPlayActivity longVideoPlayActivity) {
            this.f93030a = longVideoPlayActivity;
        }

        /* renamed from: a */
        public final void mo75251a(boolean z) {
            LongVideoPlayActivity.m81980g();
            if (z) {
                this.f93030a.f92984D = true;
                C36358a.m82043a((Activity) this.f93030a, this.f93030a.mo75232b(), (View) this.f93030a.mo75234d(), this.f93030a.mo75230a(this.f93030a.f93001d), this.f93030a.f92996P, z);
                ImageView imageView = this.f93030a.f93000c;
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.a0h);
                }
                LinearLayout linearLayout = this.f93030a.f92981A;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                this.f93030a.mo75233c().setImageResource(R.drawable.a9i);
            } else {
                this.f93030a.f92984D = false;
                C36358a.m82043a((Activity) this.f93030a, this.f93030a.mo75232b(), (View) this.f93030a.mo75234d(), this.f93030a.mo75230a(this.f93030a.f93001d), this.f93030a.f92996P, z);
                ImageView imageView2 = this.f93030a.f93000c;
                if (imageView2 != null) {
                    imageView2.setImageResource(R.drawable.tc);
                }
                LinearLayout linearLayout2 = this.f93030a.f92981A;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                }
                this.f93030a.mo75233c().setImageResource(R.drawable.a9e);
            }
            C36381i iVar = this.f93030a.f93022y;
            if (iVar == null) {
                C52711k.m112237a("mLongVideoScreenHelper");
            }
            iVar.mo75303a(this.f93030a.f92984D);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity$i */
    public static final class C36341i implements C36389a {

        /* renamed from: a */
        final /* synthetic */ LongVideoPlayActivity f93031a;

        /* renamed from: b */
        public final void mo75253b() {
            if (LongVideoPlayActivity.m81979a(this.f93031a).f93110c) {
                LongVideoPlayActivity.m81980g();
            } else {
                LongVideoPlayActivity.m81979a(this.f93031a).mo75284a(0);
            }
        }

        /* renamed from: a */
        public final void mo75252a() {
            String str;
            DiggView diggView = this.f93031a.f92986F;
            if (diggView != null) {
                diggView.mo75223a();
            }
            if (this.f93031a.f93001d != null) {
                if (C25823j.f68267a) {
                    C25780a aVar = this.f93031a.f92995O;
                    if (aVar != null) {
                        C25778d dVar = new C25778d("like", null, null, null, 14, null);
                        aVar.mo52993a(dVar);
                    }
                } else if (C25788h.m62410a()) {
                    CommerceEggLayout commerceEggLayout = this.f93031a.f93007j;
                    if (commerceEggLayout == null) {
                        C52711k.m112237a("mCommerceEggLayout");
                    }
                    commerceEggLayout.mo52925a(this.f93031a.f92993M, this.f93031a.f92994N, 1, true);
                } else {
                    CommerceLikeLayout commerceLikeLayout = this.f93031a.f93006i;
                    if (commerceLikeLayout == null) {
                        C52711k.m112237a("mCommerceLikeLayout");
                    }
                    String g = this.f93031a.mo60874g(true);
                    Aweme aweme = this.f93031a.f93001d;
                    if (aweme != null) {
                        str = aweme.getAid();
                    } else {
                        str = null;
                    }
                    commerceLikeLayout.mo54399a(g, str);
                }
            }
        }

        C36341i(LongVideoPlayActivity longVideoPlayActivity) {
            this.f93031a = longVideoPlayActivity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity$j */
    public static final class C36342j extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ LongVideoPlayActivity f93032a;

        /* renamed from: b */
        final /* synthetic */ boolean f93033b;

        public final void onAnimationEnd(Animator animator) {
            C52711k.m112240b(animator, "animation");
            super.onAnimationEnd(animator);
            if (!this.f93033b) {
                this.f93032a.finish();
            }
        }

        C36342j(LongVideoPlayActivity longVideoPlayActivity, boolean z) {
            this.f93032a = longVideoPlayActivity;
            this.f93033b = z;
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: g */
    public static void m81980g() {
        C47718bf.m103288a(new C36349a());
    }

    /* renamed from: b */
    public final View mo75232b() {
        View view = this.f93005h;
        if (view == null) {
            C52711k.m112237a("mVideoView");
        }
        return view;
    }

    /* renamed from: c */
    public final ImageView mo75233c() {
        ImageView imageView = this.f93014q;
        if (imageView == null) {
            C52711k.m112237a("mIvRotate");
        }
        return imageView;
    }

    /* renamed from: d */
    public final FrameLayout mo75234d() {
        FrameLayout frameLayout = this.f93018u;
        if (frameLayout == null) {
            C52711k.m112237a("coverContainer");
        }
        return frameLayout;
    }

    /* renamed from: e */
    public final View mo75235e() {
        View view = this.f93019v;
        if (view == null) {
            C52711k.m112237a("mBgContainer");
        }
        return view;
    }

    /* renamed from: f */
    public final RelativeLayout mo75236f() {
        RelativeLayout relativeLayout = this.f93020w;
        if (relativeLayout == null) {
            C52711k.m112237a("mToolContainer");
        }
        return relativeLayout;
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.am);
    }

    public final int getStatusBarColor() {
        return getResources().getColor(R.color.a8w);
    }

    /* renamed from: j */
    private final int m81981j() {
        Resources resources = getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    /* renamed from: a */
    public final ImageView mo75229a() {
        ImageView imageView = this.f92999b;
        if (imageView == null) {
            C52711k.m112237a("mIvPlay");
        }
        return imageView;
    }

    public final void onBackPressed() {
        if (this.f92984D) {
            Rotate rotate = this.f92985E;
            if (rotate != null) {
                rotate.mo75292b();
            }
        } else {
            mo75231a(false);
        }
    }

    /* renamed from: h */
    public final void mo75237h() {
        if (!this.f92984D) {
            ImageView imageView = this.f93000c;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        }
        LinearLayout linearLayout = this.f92981A;
        if (linearLayout != null) {
            ViewPropertyAnimator animate = linearLayout.animate();
            if (animate != null) {
                ViewPropertyAnimator alpha = animate.alpha(0.0f);
                if (alpha != null) {
                    ViewPropertyAnimator duration = alpha.setDuration(200);
                    if (duration != null) {
                        ViewPropertyAnimator withEndAction = duration.withEndAction(new C36334b(this));
                        if (withEndAction != null) {
                            withEndAction.start();
                        }
                    }
                }
            }
        }
        LinearLayout linearLayout2 = this.f93023z;
        if (linearLayout2 != null) {
            ViewPropertyAnimator animate2 = linearLayout2.animate();
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

    /* renamed from: i */
    public final void mo75238i() {
        ImageView imageView = this.f93000c;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        LinearLayout linearLayout = this.f93023z;
        if (linearLayout != null) {
            ViewPropertyAnimator animate = linearLayout.animate();
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
        if (!this.f92984D) {
            LinearLayout linearLayout2 = this.f92981A;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            LinearLayout linearLayout3 = this.f92981A;
            if (linearLayout3 != null) {
                linearLayout3.setAlpha(0.0f);
            }
            LinearLayout linearLayout4 = this.f92981A;
            if (linearLayout4 != null) {
                ViewPropertyAnimator animate2 = linearLayout4.animate();
                if (animate2 != null) {
                    ViewPropertyAnimator alpha2 = animate2.alpha(1.0f);
                    if (alpha2 != null) {
                        ViewPropertyAnimator duration2 = alpha2.setDuration(200);
                        if (duration2 != null) {
                            ViewPropertyAnimator withEndAction = duration2.withEndAction(C36335c.f93025a);
                            if (withEndAction != null) {
                                withEndAction.start();
                            }
                        }
                    }
                }
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        C30303h hVar = this.f93002e;
        if (hVar != null) {
            hVar.mo60468b();
        }
        this.f92997R.clear();
        if (C25823j.f68267a) {
            C25780a aVar = this.f92995O;
            if (aVar != null) {
                aVar.mo52992a();
            }
        } else if (C25788h.m62410a()) {
            CommerceEggLayout commerceEggLayout = this.f93007j;
            if (commerceEggLayout == null) {
                C52711k.m112237a("mCommerceEggLayout");
            }
            commerceEggLayout.mo52923a();
            this.f92993M = null;
            this.f92994N = null;
        } else {
            CommerceLikeLayout commerceLikeLayout = this.f93006i;
            if (commerceLikeLayout == null) {
                C52711k.m112237a("mCommerceLikeLayout");
            }
            commerceLikeLayout.mo54398a();
        }
    }

    public final void setStatusBarColor() {
        if (C23059a.m56592a(this)) {
            if (VERSION.SDK_INT >= 21) {
                Window window = getWindow();
                C52711k.m112236a((Object) window, "window");
                window.setStatusBarColor(getStatusBarColor());
            } else if (VERSION.SDK_INT >= 19) {
                C11065a.m22392a(this, getStatusBarColor());
            }
            C23729p.m58263b((Activity) this);
        } else if (VERSION.SDK_INT >= 21) {
            getWindow().setFlags(PreloadTask.BYTE_UNIT_NUMBER, PreloadTask.BYTE_UNIT_NUMBER);
        } else {
            Window window2 = getWindow();
            C52711k.m112236a((Object) window2, "window");
            View decorView = window2.getDecorView();
            C52711k.m112236a((Object) decorView, "decorView");
            decorView.setSystemUiVisibility(1284);
        }
    }

    /* renamed from: g */
    public final String mo60874g(boolean z) {
        return this.f92987G;
    }

    public final void setRootView(View view) {
        this.f92998a = view;
    }

    public final void setMBgContainer(View view) {
        C52711k.m112240b(view, "<set-?>");
        this.f93019v = view;
    }

    public final void setMVideoView(View view) {
        C52711k.m112240b(view, "<set-?>");
        this.f93005h = view;
    }

    /* renamed from: a */
    public static final /* synthetic */ NoOperateModeController m81979a(LongVideoPlayActivity longVideoPlayActivity) {
        NoOperateModeController noOperateModeController = longVideoPlayActivity.f92992L;
        if (noOperateModeController == null) {
            C52711k.m112237a("noOperationModeController");
        }
        return noOperateModeController;
    }

    /* renamed from: a */
    public final Video mo75230a(Aweme aweme) {
        C36385k kVar = this.f92991K;
        if (kVar != null) {
            return kVar.mo75308a(aweme);
        }
        return null;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        Rotate rotate = this.f92985E;
        if (rotate != null) {
            if (configuration != null && configuration.orientation == 1) {
                rotate.f93123e = false;
                rotate.mo75291a(false);
            } else if (configuration != null && configuration.orientation == 2) {
                rotate.f93123e = true;
                rotate.mo75291a(true);
            }
        }
        super.onConfigurationChanged(configuration);
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
                C10691a.m21542b((Context) this, (int) R.string.cg1).mo19066a();
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
                    C30303h hVar = this.f93002e;
                    if (hVar != null) {
                        str = hVar.mo60476k();
                    }
                    if (str == null) {
                        str = "";
                    }
                    a.showReportDialog(aweme, str, this, "");
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
            }
        }
    }

    /* renamed from: a */
    public final void mo75231a(boolean z) {
        float f = 0.0f;
        if (z) {
            View view = this.f93019v;
            if (view == null) {
                C52711k.m112237a("mBgContainer");
            }
            view.setAlpha(0.0f);
            FrameLayout frameLayout = this.f93021x;
            if (frameLayout == null) {
                C52711k.m112237a("mRootContainer");
            }
            frameLayout.setAlpha(0.0f);
            RelativeLayout relativeLayout = this.f93020w;
            if (relativeLayout == null) {
                C52711k.m112237a("mToolContainer");
            }
            relativeLayout.setAlpha(0.0f);
        }
        float f2 = 1.0f;
        if (!z) {
            f = 1.0f;
            f2 = 0.0f;
        }
        View view2 = this.f93019v;
        if (view2 == null) {
            C52711k.m112237a("mBgContainer");
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(view2, "alpha", new float[]{f, f2}).setDuration(250);
        FrameLayout frameLayout2 = this.f93021x;
        if (frameLayout2 == null) {
            C52711k.m112237a("mRootContainer");
        }
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(frameLayout2, "alpha", new float[]{f, f2}).setDuration(250);
        RelativeLayout relativeLayout2 = this.f93020w;
        if (relativeLayout2 == null) {
            C52711k.m112237a("mToolContainer");
        }
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(relativeLayout2, "alpha", new float[]{f, f2}).setDuration(250);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(duration).with(duration2).with(duration3);
        animatorSet.start();
        animatorSet.addListener(new C36342j(this, z));
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        m81980g();
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.az9) {
            onBackPressed();
            return;
        }
        if (num != null && num.intValue() == R.id.azd) {
            C30303h hVar = this.f93002e;
            if (hVar != null) {
                hVar.mo51536a(new C25165a(this.f93001d).mo51333a());
            }
        } else if (num != null && num.intValue() == R.id.b48) {
            C30303h hVar2 = this.f93002e;
            if (hVar2 != null) {
                hVar2.mo60707a(this, this.f93001d, null);
            }
            Aweme aweme = this.f93001d;
            if (aweme != null) {
                C23238h h = new C23238h().mo48086d(this.f92987G).mo48088e(this.f92987G).mo47954f(aweme).mo48091h(C23198ae.m56846a(aweme));
                h.f62022a = 1;
                h.mo48076e();
            }
        } else if (num != null && num.intValue() == R.id.b4s) {
            Rotate rotate = this.f92985E;
            if (rotate != null) {
                rotate.mo75292b();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x038f  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0401  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0408  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0411  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x041c  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0430  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0449  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x044e  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0457  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x045c  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x047c  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0485  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0493  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x049c  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x04b0  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x04c0  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x04d6  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x04e8  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0501  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0511  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0524  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x052e  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x053d  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0549  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0555  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0568  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0575  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0596  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x05ab  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x060f  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0628  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x062f  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0367  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x037e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            java.lang.String r0 = "com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity"
            java.lang.String r1 = "onCreate"
            r2 = 1
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r2)
            super.onCreate(r14)
            int r14 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r14 < r0) goto L_0x001c
            android.view.Window r14 = r13.getWindow()
            if (r14 == 0) goto L_0x001c
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r14.setNavigationBarColor(r0)
        L_0x001c:
            android.view.Window r14 = r13.getWindow()
            if (r14 == 0) goto L_0x0027
            r0 = 128(0x80, float:1.794E-43)
            r14.addFlags(r0)
        L_0x0027:
            r14 = 2131034219(0x7f05006b, float:1.767895E38)
            r0 = 0
            r13.superOverridePendingTransition(r14, r0)
            r14 = 2132214463(0x7f1702bf, float:2.0072769E38)
            r13.setContentView(r14)
            android.content.Intent r14 = r13.getIntent()
            java.lang.String r1 = "extra_event_type"
            java.lang.String r14 = r14.getStringExtra(r1)
            if (r14 != 0) goto L_0x0042
            java.lang.String r14 = ""
        L_0x0042:
            r13.f92987G = r14
            android.content.Intent r14 = r13.getIntent()
            java.lang.String r1 = "extra_page_type"
            int r14 = r14.getIntExtra(r1, r0)
            r13.f92988H = r14
            r14 = 2132022405(0x7f141485, float:1.9683229E38)
            android.view.View r1 = r13.findViewById(r14)
            java.lang.String r3 = "findViewById(R.id.root_view)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            com.ss.android.ugc.aweme.longvideo.view.DoubleClickDiggFrameLayout r1 = (com.p683ss.android.ugc.aweme.longvideo.view.DoubleClickDiggFrameLayout) r1
            r13.f93016s = r1
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r1 = new com.ss.android.ugc.playerkit.videoview.VideoViewComponent
            r1.<init>()
            r13.f93004g = r1
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r1 = r13.f93004g
            if (r1 != 0) goto L_0x0070
            java.lang.String r3 = "mVideoViewComponent"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0070:
            com.ss.android.ugc.aweme.longvideo.view.DoubleClickDiggFrameLayout r3 = r13.f93016s
            if (r3 != 0) goto L_0x0079
            java.lang.String r4 = "mRootView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0079:
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r1.mo97916a(r3)
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r1 = r13.f93004g
            if (r1 != 0) goto L_0x0087
            java.lang.String r3 = "mVideoViewComponent"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0087:
            com.ss.android.ugc.playerkit.videoview.i r1 = r1.f125619b
            java.lang.String r3 = "mVideoViewComponent.surfaceHolder"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            android.view.View r1 = r1.mo97949a()
            java.lang.String r3 = "mVideoViewComponent.surfaceHolder.view"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            r13.f93005h = r1
            r1 = 2132018221(0x7f14042d, float:1.9674743E38)
            android.view.View r1 = r13.findViewById(r1)
            java.lang.String r3 = "findViewById(R.id.commerce_like_layout)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            com.ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout r1 = (com.p683ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout) r1
            r13.f93006i = r1
            r1 = 2132018238(0x7f14043e, float:1.9674777E38)
            android.view.View r1 = r13.findViewById(r1)
            java.lang.String r3 = "findViewById(R.id.commmerce_egg_layout)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            com.ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout r1 = (com.p683ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout) r1
            r13.f93007j = r1
            r1 = 2132019975(0x7f140b07, float:1.96783E38)
            android.view.View r1 = r13.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r13.f93000c = r1
            r1 = 2132024520(0x7f141cc8, float:1.9687518E38)
            android.view.View r1 = r13.findViewById(r1)
            java.lang.String r3 = "findViewById(R.id.video_seek_bar)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            com.ss.android.ugc.aweme.longvideo.view.VideoPlaySeekBar r1 = (com.p683ss.android.ugc.aweme.longvideo.view.VideoPlaySeekBar) r1
            r13.f93008k = r1
            r1 = 2132020158(0x7f140bbe, float:1.9678671E38)
            android.view.View r1 = r13.findViewById(r1)
            java.lang.String r3 = "findViewById(R.id.iv_play)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r13.f92999b = r1
            r1 = 2132020177(0x7f140bd1, float:1.967871E38)
            android.view.View r1 = r13.findViewById(r1)
            java.lang.String r3 = "findViewById(R.id.iv_replay)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r13.f93015r = r1
            r1 = 2132020020(0x7f140b34, float:1.9678391E38)
            android.view.View r1 = r13.findViewById(r1)
            java.lang.String r3 = "findViewById(R.id.iv_digg)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView r1 = (com.p683ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView) r1
            r13.f93011n = r1
            r1 = 2132019984(0x7f140b10, float:1.9678318E38)
            android.view.View r1 = r13.findViewById(r1)
            java.lang.String r3 = "findViewById(R.id.iv_comment)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r13.f93012o = r1
            r1 = 2132020208(0x7f140bf0, float:1.9678773E38)
            android.view.View r1 = r13.findViewById(r1)
            java.lang.String r3 = "findViewById(R.id.iv_share)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r13.f93013p = r1
            r1 = 2132020237(0x7f140c0d, float:1.9678831E38)
            android.view.View r1 = r13.findViewById(r1)
            java.lang.String r3 = "findViewById(R.id.iv_switch_mode)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r13.f93014q = r1
            r1 = 2132021445(0x7f1410c5, float:1.9681282E38)
            android.view.View r1 = r13.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r13.f92981A = r1
            r1 = 2132021619(0x7f141173, float:1.9681634E38)
            android.view.View r1 = r13.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r13.f93023z = r1
            r1 = 2132021618(0x7f141172, float:1.9681632E38)
            android.view.View r1 = r13.findViewById(r1)
            com.ss.android.ugc.aweme.feed.widget.LineProgressBar r1 = (com.p683ss.android.ugc.aweme.feed.widget.LineProgressBar) r1
            r13.f92982B = r1
            r1 = 2132017487(0x7f14014f, float:1.9673254E38)
            android.view.View r1 = r13.findViewById(r1)
            com.ss.android.ugc.aweme.base.ui.AudioControlView r1 = (com.p683ss.android.ugc.aweme.base.p1420ui.AudioControlView) r1
            r13.f92983C = r1
            r1 = 2132018379(0x7f1404cb, float:1.9675063E38)
            android.view.View r1 = r13.findViewById(r1)
            java.lang.String r3 = "findViewById(R.id.cover)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r1 = (com.p683ss.android.ugc.aweme.base.p1420ui.AnimatedImageView) r1
            r13.f93017t = r1
            r1 = 2132018380(0x7f1404cc, float:1.9675065E38)
            android.view.View r1 = r13.findViewById(r1)
            java.lang.String r3 = "findViewById(R.id.cover_container)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r13.f93018u = r1
            r1 = 2132017632(0x7f1401e0, float:1.9673548E38)
            android.view.View r1 = r13.findViewById(r1)
            java.lang.String r3 = "findViewById(R.id.bg_container)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            r13.f93019v = r1
            r1 = 2132023448(0x7f141898, float:1.9685344E38)
            android.view.View r1 = r13.findViewById(r1)
            java.lang.String r3 = "findViewById(R.id.tool_container)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r13.f93020w = r1
            r1 = 2132019139(0x7f1407c3, float:1.9676604E38)
            android.view.View r1 = r13.findViewById(r1)
            java.lang.String r3 = "findViewById(R.id.fl_root_container)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r13.f93021x = r1
            com.ss.android.ugc.aweme.longvideo.i r1 = new com.ss.android.ugc.aweme.longvideo.i
            r3 = r13
            android.content.Context r3 = (android.content.Context) r3
            android.widget.FrameLayout r4 = r13.f93021x
            if (r4 != 0) goto L_0x01bc
            java.lang.String r5 = "mRootContainer"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x01bc:
            android.view.View r4 = (android.view.View) r4
            android.widget.LinearLayout r5 = r13.f93023z
            if (r5 == 0) goto L_0x0678
            r1.<init>(r3, r4, r5)
            r13.f93022y = r1
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = com.p683ss.android.ugc.aweme.longvideo.C36367d.m82057a()
            r13.f93001d = r1
            android.view.View r14 = r13.findViewById(r14)
            android.support.design.widget.BottomSheetBehavior r14 = android.support.design.widget.BottomSheetBehavior.m1227a(r14)
            if (r14 == 0) goto L_0x0670
            com.ss.android.ugc.aweme.longvideo.view.CustomBottomSheetBehavior r14 = (com.p683ss.android.ugc.aweme.longvideo.view.CustomBottomSheetBehavior) r14
            r13.f93003f = r14
            com.ss.android.ugc.aweme.longvideo.view.CustomBottomSheetBehavior<android.view.View> r14 = r13.f93003f
            if (r14 == 0) goto L_0x0214
            com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity$d r1 = new com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity$d
            r1.<init>(r13)
            android.support.design.widget.BottomSheetBehavior$a r1 = (android.support.design.widget.BottomSheetBehavior.C0497a) r1
            r14.f1646q = r1
            r14.f1638i = r2
            boolean r1 = com.p683ss.android.ugc.aweme.app.p1372c.C23059a.m56592a(r3)
            if (r1 != 0) goto L_0x0202
            int r1 = com.p683ss.android.ugc.aweme.base.utils.C23724k.m58221a(r3)
            int r4 = r13.m81981j()
            int r1 = r1 + r4
            int r4 = com.p683ss.android.ugc.aweme.adaptation.C22453b.m55512d(r3)
            int r1 = r1 + r4
            r14.mo1296a(r1)
            goto L_0x020e
        L_0x0202:
            int r1 = com.p683ss.android.ugc.aweme.base.utils.C23724k.m58221a(r3)
            int r4 = r13.m81981j()
            int r1 = r1 + r4
            r14.mo1296a(r1)
        L_0x020e:
            r14.f1639j = r2
            r1 = 3
            r14.mo1301b(r1)
        L_0x0214:
            com.ss.android.ugc.aweme.longvideo.view.CustomBottomSheetBehavior<android.view.View> r14 = r13.f93003f
            if (r14 == 0) goto L_0x0222
            com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity$e r1 = new com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity$e
            r1.<init>(r13)
            com.ss.android.ugc.aweme.longvideo.view.CustomBottomSheetBehavior$a r1 = (com.p683ss.android.ugc.aweme.longvideo.view.CustomBottomSheetBehavior.C36388a) r1
            r14.mo75309a(r1)
        L_0x0222:
            android.widget.FrameLayout r14 = r13.f93021x
            if (r14 != 0) goto L_0x022b
            java.lang.String r1 = "mRootContainer"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x022b:
            com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity$f r1 = new com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity$f
            r1.<init>(r13)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r4 = 50
            r14.postDelayed(r1, r4)
            com.ss.android.ugc.aweme.video.w r14 = new com.ss.android.ugc.aweme.video.w
            r14.<init>(r2)
            com.ss.android.ugc.aweme.longvideo.k r1 = com.p683ss.android.ugc.aweme.longvideo.C36385k.f93161b
            r13.f92991K = r1
            boolean r1 = com.p683ss.android.ugc.aweme.longvideo.C36379g.m82106a(r3)
            if (r1 != 0) goto L_0x024c
            r1 = 2132546922(0x7f1c156a, float:2.0747076E38)
            com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r3, r1)
        L_0x024c:
            r1 = r13
            android.support.v4.app.FragmentActivity r1 = (android.support.p030v4.app.FragmentActivity) r1
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r13.f93001d
            java.lang.String r5 = r13.f92987G
            int r6 = r13.f92988H
            java.lang.String r7 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r7)
            java.lang.String r7 = "eventType"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r7)
            android.arch.lifecycle.y r7 = android.arch.lifecycle.C0214z.m440a(r1)
            java.lang.Class<com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel> r8 = com.p683ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel.class
            android.arch.lifecycle.x r7 = r7.mo359a(r8)
            java.lang.String r8 = "ViewModelProviders.of(ac…MobViewModel::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r7 = (com.p683ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel) r7
            r7.f93194b = r4
            com.ss.android.ugc.aweme.longvideo.f r4 = new com.ss.android.ugc.aweme.longvideo.f
            r4.<init>(r5, r6, r2)
            r7.f93193a = r4
            r13.f92990J = r7
            android.util.DisplayMetrics r4 = new android.util.DisplayMetrics
            r4.<init>()
            android.view.WindowManager r5 = r13.getWindowManager()
            java.lang.String r6 = "windowManager"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            android.view.Display r5 = r5.getDefaultDisplay()
            r5.getMetrics(r4)
            int r4 = r4.widthPixels
            int r3 = com.p683ss.android.ugc.aweme.base.utils.C23724k.m58229e(r3)
            if (r4 <= r3) goto L_0x029e
            com.ss.android.ugc.aweme.longvideo.b.d r5 = new com.ss.android.ugc.aweme.longvideo.b.d
            r5.<init>(r3, r4)
            goto L_0x02a3
        L_0x029e:
            com.ss.android.ugc.aweme.longvideo.b.d r5 = new com.ss.android.ugc.aweme.longvideo.b.d
            r5.<init>(r4, r3)
        L_0x02a3:
            r13.f92996P = r5
            r3 = r13
            android.app.Activity r3 = (android.app.Activity) r3
            android.view.View r7 = r13.f93005h
            if (r7 != 0) goto L_0x02b1
            java.lang.String r4 = "mVideoView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x02b1:
            android.widget.FrameLayout r4 = r13.f93018u
            if (r4 != 0) goto L_0x02ba
            java.lang.String r5 = "coverContainer"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x02ba:
            r8 = r4
            android.view.View r8 = (android.view.View) r8
            com.ss.android.ugc.aweme.longvideo.k r4 = r13.f92991K
            r5 = 0
            if (r4 == 0) goto L_0x02ca
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r13.f93001d
            com.ss.android.ugc.aweme.feed.model.Video r4 = r4.mo75308a(r6)
            r9 = r4
            goto L_0x02cb
        L_0x02ca:
            r9 = r5
        L_0x02cb:
            com.ss.android.ugc.aweme.longvideo.b.d r10 = r13.f92996P
            boolean r11 = r13.f92984D
            r6 = r3
            com.p683ss.android.ugc.aweme.longvideo.p1934b.C36357c.C36358a.m82043a(r6, r7, r8, r9, r10, r11)
            com.ss.android.ugc.aweme.longvideo.LongVideoPlayView r4 = new com.ss.android.ugc.aweme.longvideo.LongVideoPlayView
            com.ss.android.ugc.aweme.longvideo.k r8 = r13.f92991K
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r9 = r13.f93004g
            if (r9 != 0) goto L_0x02e0
            java.lang.String r6 = "mVideoViewComponent"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x02e0:
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r10 = r13.f93017t
            if (r10 != 0) goto L_0x02e9
            java.lang.String r6 = "mCover"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x02e9:
            android.widget.ImageView r11 = r13.f93015r
            if (r11 != 0) goto L_0x02f2
            java.lang.String r6 = "mIvReplay"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x02f2:
            r6 = r4
            r7 = r13
            r12 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r13.f93009l = r4
            com.ss.android.ugc.aweme.longvideo.LongVideoPlayView r4 = r13.f93009l
            if (r4 != 0) goto L_0x0303
            java.lang.String r6 = "mLongVideoPlayView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x0303:
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r13.f93001d
            r4.f93040f = r6
            com.ss.android.ugc.aweme.newfollow.util.e r7 = new com.ss.android.ugc.aweme.newfollow.util.e
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r8 = r4.f93047m
            r9 = r4
            com.ss.android.ugc.aweme.player.sdk.a.j r9 = (com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j) r9
            com.ss.android.ugc.aweme.longvideo.k r10 = r4.f93046l
            r7.<init>(r8, r9, r5, r10)
            r4.f93035a = r7
            boolean r7 = com.p683ss.android.ugc.aweme.video.C48121w.m104087I()
            if (r7 != 0) goto L_0x0325
            com.ss.android.ugc.aweme.newfollow.util.e r7 = r4.f93035a
            if (r7 == 0) goto L_0x0325
            com.ss.android.ugc.aweme.video.w r8 = r4.f93050p
            com.ss.android.ugc.aweme.video.h r8 = (com.p683ss.android.ugc.aweme.video.C48021h) r8
            r7.f96594a = r8
        L_0x0325:
            com.ss.android.ugc.aweme.newfollow.util.e r7 = r4.f93035a
            if (r7 == 0) goto L_0x032e
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r4.f93040f
            r7.mo77404a(r8)
        L_0x032e:
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r7 = r4.f93047m
            com.ss.android.ugc.playerkit.videoview.j r8 = r4.f93043i
            r7.mo97918a(r8)
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r7 = r4.f93048n
            if (r7 == 0) goto L_0x034c
            com.ss.android.ugc.aweme.longvideo.k r8 = r4.f93046l
            if (r8 == 0) goto L_0x0348
            com.ss.android.ugc.aweme.feed.model.Video r8 = r8.mo75308a(r6)
            if (r8 == 0) goto L_0x0348
            com.ss.android.ugc.aweme.base.model.UrlModel r8 = r8.getOriginCover()
            goto L_0x0349
        L_0x0348:
            r8 = r5
        L_0x0349:
            r7.mo48930a(r8)
        L_0x034c:
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r7 = r4.f93048n
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r7 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r7
            com.ss.android.ugc.aweme.longvideo.k r4 = r4.f93046l
            if (r4 == 0) goto L_0x035f
            com.ss.android.ugc.aweme.feed.model.Video r4 = r4.mo75308a(r6)
            if (r4 == 0) goto L_0x035f
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r4.getOriginCover()
            goto L_0x0360
        L_0x035f:
            r4 = r5
        L_0x0360:
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r7, r4)
            com.ss.android.ugc.aweme.longvideo.LongVideoPlayView r4 = r13.f93009l
            if (r4 != 0) goto L_0x036c
            java.lang.String r6 = "mLongVideoPlayView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x036c:
            com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity$g r6 = new com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity$g
            r6.<init>(r13)
            com.ss.android.ugc.aweme.longvideo.LongVideoPlayView$b r6 = (com.p683ss.android.ugc.aweme.longvideo.LongVideoPlayView.C36345b) r6
            java.lang.String r7 = "view"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r7)
            r4.f93037c = r6
            com.ss.android.ugc.aweme.longvideo.LongVideoPlayView$b r6 = r4.f93037c
            if (r6 == 0) goto L_0x0389
            android.view.View r6 = r6.mo75248a()
            if (r6 == 0) goto L_0x0389
            android.view.View$OnClickListener r4 = r4.f93044j
            r6.setOnClickListener(r4)
        L_0x0389:
            com.ss.android.ugc.aweme.longvideo.j r4 = new com.ss.android.ugc.aweme.longvideo.j
            com.ss.android.ugc.aweme.longvideo.view.VideoPlaySeekBar r6 = r13.f93008k
            if (r6 != 0) goto L_0x0394
            java.lang.String r7 = "mVideoSeekBar"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x0394:
            com.ss.android.ugc.aweme.longvideo.LongVideoPlayView r7 = r13.f93009l
            if (r7 != 0) goto L_0x039d
            java.lang.String r8 = "mLongVideoPlayView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r8)
        L_0x039d:
            com.ss.android.ugc.aweme.longvideo.a r7 = (com.p683ss.android.ugc.aweme.longvideo.C36348a) r7
            r4.<init>(r6, r7)
            r13.f93010m = r4
            com.ss.android.ugc.aweme.longvideo.j r4 = r13.f93010m
            if (r4 != 0) goto L_0x03ad
            java.lang.String r6 = "mLongVideoSeekView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x03ad:
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r13.f93001d
            com.ss.android.ugc.aweme.feed.model.Video r6 = r13.mo75230a(r6)
            if (r6 == 0) goto L_0x03ba
            int r6 = r6.getDuration()
            goto L_0x03bb
        L_0x03ba:
            r6 = 0
        L_0x03bb:
            com.ss.android.ugc.aweme.longvideo.view.VideoPlaySeekBar r7 = r4.f93157c
            int r6 = com.p683ss.android.ugc.aweme.longvideo.p1934b.C36360e.C36361a.m82046b(r6)
            r7.setTotalTime(r6)
            com.ss.android.ugc.aweme.longvideo.view.VideoPlaySeekBar r6 = r4.f93157c
            r7 = 0
            r6.setProgress(r7)
            com.ss.android.ugc.aweme.longvideo.view.VideoPlaySeekBar r6 = r4.f93157c
            com.ss.android.ugc.aweme.longvideo.j$a r7 = new com.ss.android.ugc.aweme.longvideo.j$a
            r7.<init>(r4)
            android.widget.SeekBar$OnSeekBarChangeListener r7 = (android.widget.SeekBar.OnSeekBarChangeListener) r7
            r6.setOnSeekBarChangeListener(r7)
            com.ss.android.ugc.aweme.longvideo.LongVideoPlayView r4 = r13.f93009l
            if (r4 != 0) goto L_0x03df
            java.lang.String r6 = "mLongVideoPlayView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x03df:
            com.ss.android.ugc.aweme.longvideo.j r6 = r13.f93010m
            if (r6 != 0) goto L_0x03e8
            java.lang.String r7 = "mLongVideoSeekView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x03e8:
            com.ss.android.ugc.aweme.longvideo.b r6 = (com.p683ss.android.ugc.aweme.longvideo.C36350b) r6
            r4.f93038d = r6
            com.ss.android.ugc.aweme.feed.h r4 = new com.ss.android.ugc.aweme.feed.h
            java.lang.String r6 = r13.f92987G
            int r7 = r13.f92988H
            r8 = r13
            com.ss.android.ugc.aweme.feed.h.ae r8 = (com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae) r8
            r9 = r13
            com.ss.android.ugc.aweme.feed.k.d r9 = (com.p683ss.android.ugc.aweme.feed.p1728k.C30447d) r9
            r4.<init>(r6, r7, r8, r9)
            r13.f93002e = r4
            com.ss.android.ugc.aweme.feed.h r4 = r13.f93002e
            if (r4 == 0) goto L_0x0404
            r4.mo52903a(r3, r5)
        L_0x0404:
            com.ss.android.ugc.aweme.feed.h r3 = r13.f93002e
            if (r3 == 0) goto L_0x040b
            r3.mo60465a()
        L_0x040b:
            com.ss.android.ugc.aweme.longvideo.feature.Rotate r3 = new com.ss.android.ugc.aweme.longvideo.feature.Rotate
            com.ss.android.ugc.aweme.longvideo.view.DoubleClickDiggFrameLayout r4 = r13.f93016s
            if (r4 != 0) goto L_0x0416
            java.lang.String r6 = "mRootView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x0416:
            android.view.View r4 = (android.view.View) r4
            android.view.View r6 = r13.f93005h
            if (r6 != 0) goto L_0x0421
            java.lang.String r7 = "mVideoView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x0421:
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r13.f93001d
            com.ss.android.ugc.aweme.feed.model.Video r7 = r13.mo75230a(r7)
            r3.<init>(r1, r4, r6, r7)
            r13.f92985E = r3
            com.ss.android.ugc.aweme.longvideo.feature.Rotate r3 = r13.f92985E
            if (r3 == 0) goto L_0x0441
            com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity$h r4 = new com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity$h
            r4.<init>(r13)
            com.ss.android.ugc.aweme.longvideo.feature.Rotate$a r4 = (com.p683ss.android.ugc.aweme.longvideo.feature.Rotate.C36372a) r4
            java.lang.String r6 = "observer"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r6)
            java.util.ArrayList<com.ss.android.ugc.aweme.longvideo.feature.Rotate$a> r3 = r3.f93120b
            r3.add(r4)
        L_0x0441:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r13.f93001d
            com.ss.android.ugc.aweme.feed.model.Video r3 = r13.mo75230a(r3)
            if (r3 == 0) goto L_0x044e
            int r3 = r3.getWidth()
            goto L_0x044f
        L_0x044e:
            r3 = 0
        L_0x044f:
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r13.f93001d
            com.ss.android.ugc.aweme.feed.model.Video r4 = r13.mo75230a(r4)
            if (r4 == 0) goto L_0x045c
            int r4 = r4.getHeight()
            goto L_0x045d
        L_0x045c:
            r4 = 0
        L_0x045d:
            boolean r3 = com.p683ss.android.ugc.aweme.longvideo.p1934b.C36357c.C36358a.m82045a(r3, r4)
            if (r3 != 0) goto L_0x0471
            android.widget.ImageView r3 = r13.f93014q
            if (r3 != 0) goto L_0x046c
            java.lang.String r4 = "mIvRotate"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x046c:
            r4 = 8
            r3.setVisibility(r4)
        L_0x0471:
            com.ss.android.ugc.aweme.longvideo.feature.LongVideoPlayMob r3 = new com.ss.android.ugc.aweme.longvideo.feature.LongVideoPlayMob
            r3.<init>(r1, r14)
            r13.f92989I = r3
            com.ss.android.ugc.aweme.longvideo.LongVideoPlayView r3 = r13.f93009l
            if (r3 != 0) goto L_0x0481
            java.lang.String r4 = "mLongVideoPlayView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0481:
            com.ss.android.ugc.aweme.longvideo.feature.LongVideoPlayMob r4 = r13.f92989I
            if (r4 != 0) goto L_0x048a
            java.lang.String r6 = "mLongVideoPlayMob"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x048a:
            com.ss.android.ugc.aweme.player.sdk.a.j r4 = (com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j) r4
            r3.mo75257a(r4)
            com.ss.android.ugc.aweme.longvideo.j r3 = r13.f93010m
            if (r3 != 0) goto L_0x0498
            java.lang.String r4 = "mLongVideoSeekView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0498:
            com.ss.android.ugc.aweme.longvideo.feature.LongVideoPlayMob r4 = r13.f92989I
            if (r4 != 0) goto L_0x04a1
            java.lang.String r6 = "mLongVideoPlayMob"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x04a1:
            android.widget.SeekBar$OnSeekBarChangeListener r4 = (android.widget.SeekBar.OnSeekBarChangeListener) r4
            java.lang.String r6 = "seekBarChangeListener"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r6)
            r3.f93155a = r4
            com.ss.android.ugc.aweme.longvideo.DiggView r3 = new com.ss.android.ugc.aweme.longvideo.DiggView
            com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView r4 = r13.f93011n
            if (r4 != 0) goto L_0x04b5
            java.lang.String r6 = "mIvDigg"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x04b5:
            java.lang.String r6 = r13.f92987G
            r3.<init>(r4, r5, r6)
            r13.f92986F = r3
            com.ss.android.ugc.aweme.longvideo.DiggView r3 = r13.f92986F
            if (r3 == 0) goto L_0x04d2
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r13.f93001d
            com.ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout r6 = r13.f93006i
            if (r6 != 0) goto L_0x04cb
            java.lang.String r7 = "mCommerceLikeLayout"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x04cb:
            java.lang.String r7 = r13.mo60874g(r2)
            r3.mo75224a(r1, r4, r6, r7)
        L_0x04d2:
            com.ss.android.ugc.aweme.longvideo.DiggView r3 = r13.f92986F
            if (r3 == 0) goto L_0x04e4
            com.ss.android.ugc.aweme.longvideo.feature.LongVideoPlayMob r4 = r13.f92989I
            if (r4 != 0) goto L_0x04df
            java.lang.String r6 = "mLongVideoPlayMob"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x04df:
            com.ss.android.ugc.aweme.longvideo.DiggView$a r4 = (com.p683ss.android.ugc.aweme.longvideo.DiggView.C36332a) r4
            r3.mo75225a(r4)
        L_0x04e4:
            com.ss.android.ugc.aweme.longvideo.DiggView r3 = r13.f92986F
            if (r3 == 0) goto L_0x04fb
            com.ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout r4 = r13.f93007j
            if (r4 != 0) goto L_0x04f1
            java.lang.String r6 = "mCommerceEggLayout"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x04f1:
            com.ss.android.ugc.aweme.commercialize.egg.b r6 = r13.f92993M
            com.ss.android.ugc.aweme.commercialize.egg.a.b r7 = r13.f92994N
            r3.f92964c = r4
            r3.f92965d = r6
            r3.f92966e = r7
        L_0x04fb:
            com.ss.android.ugc.aweme.longvideo.feature.NoOperateModeController r3 = new com.ss.android.ugc.aweme.longvideo.feature.NoOperateModeController
            com.ss.android.ugc.aweme.longvideo.view.DoubleClickDiggFrameLayout r4 = r13.f93016s
            if (r4 != 0) goto L_0x0506
            java.lang.String r6 = "mRootView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x0506:
            android.view.View r4 = (android.view.View) r4
            r3.<init>(r1, r4)
            r13.f92992L = r3
            com.ss.android.ugc.aweme.longvideo.feature.NoOperateModeController r3 = r13.f92992L
            if (r3 != 0) goto L_0x0516
            java.lang.String r4 = "noOperationModeController"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0516:
            r4 = r13
            com.ss.android.ugc.aweme.longvideo.feature.NoOperateModeController$a r4 = (com.p683ss.android.ugc.aweme.longvideo.feature.NoOperateModeController.C36370a) r4
            java.lang.String r6 = "noOperationCallback"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r6)
            r3.f93109b = r4
            android.widget.ImageView r3 = r13.f93000c
            if (r3 == 0) goto L_0x052a
            r4 = r13
            android.view.View$OnClickListener r4 = (android.view.View.OnClickListener) r4
            r3.setOnClickListener(r4)
        L_0x052a:
            android.widget.ImageView r3 = r13.f93012o
            if (r3 != 0) goto L_0x0533
            java.lang.String r4 = "mCommentView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0533:
            r4 = r13
            android.view.View$OnClickListener r4 = (android.view.View.OnClickListener) r4
            r3.setOnClickListener(r4)
            android.widget.ImageView r3 = r13.f93013p
            if (r3 != 0) goto L_0x0542
            java.lang.String r6 = "mShareView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x0542:
            r3.setOnClickListener(r4)
            android.widget.ImageView r3 = r13.f93014q
            if (r3 != 0) goto L_0x054e
            java.lang.String r6 = "mIvRotate"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x054e:
            r3.setOnClickListener(r4)
            com.ss.android.ugc.aweme.longvideo.view.DoubleClickDiggFrameLayout r3 = r13.f93016s
            if (r3 != 0) goto L_0x055a
            java.lang.String r4 = "mRootView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x055a:
            com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity$i r4 = new com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity$i
            r4.<init>(r13)
            com.ss.android.ugc.aweme.longvideo.view.DoubleClickDiggFrameLayout$a r4 = (com.p683ss.android.ugc.aweme.longvideo.view.DoubleClickDiggFrameLayout.C36389a) r4
            r3.setOnDiggListener(r4)
            com.ss.android.ugc.aweme.longvideo.LongVideoPlayView r3 = r13.f93009l
            if (r3 != 0) goto L_0x056d
            java.lang.String r4 = "mLongVideoPlayView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x056d:
            com.ss.android.ugc.aweme.longvideo.feature.a r4 = new com.ss.android.ugc.aweme.longvideo.feature.a
            com.ss.android.ugc.aweme.feed.h r6 = r13.f93002e
            com.ss.android.ugc.aweme.longvideo.LongVideoPlayView r7 = r13.f93009l
            if (r7 != 0) goto L_0x057a
            java.lang.String r8 = "mLongVideoPlayView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r8)
        L_0x057a:
            com.ss.android.ugc.aweme.longvideo.a r7 = (com.p683ss.android.ugc.aweme.longvideo.C36348a) r7
            r4.<init>(r6, r7, r14)
            com.ss.android.ugc.aweme.longvideo.c r4 = (com.p683ss.android.ugc.aweme.longvideo.C36366c) r4
            java.lang.String r14 = "interceptor"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r14)
            java.util.ArrayList<com.ss.android.ugc.aweme.longvideo.c> r14 = r3.f93039e
            r14.add(r4)
            com.ss.android.ugc.aweme.longvideo.feature.LoadingController r14 = new com.ss.android.ugc.aweme.longvideo.feature.LoadingController
            com.ss.android.ugc.aweme.feed.widget.LineProgressBar r3 = r13.f92982B
            r14.<init>(r1, r3)
            com.ss.android.ugc.aweme.longvideo.LongVideoPlayView r3 = r13.f93009l
            if (r3 != 0) goto L_0x059b
            java.lang.String r4 = "mLongVideoPlayView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x059b:
            com.ss.android.ugc.aweme.player.sdk.a.j r14 = (com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j) r14
            r3.mo75257a(r14)
            com.ss.android.ugc.aweme.longvideo.feature.VolumeController r14 = new com.ss.android.ugc.aweme.longvideo.feature.VolumeController
            com.ss.android.ugc.aweme.base.ui.AudioControlView r3 = r13.f92983C
            r14.<init>(r1, r3)
            boolean r1 = com.p683ss.android.ugc.aweme.commercialize.egg.C25823j.f68267a
            if (r1 == 0) goto L_0x062f
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r13.f93001d
            if (r1 == 0) goto L_0x065c
            com.ss.android.ugc.aweme.feed.model.ItemLikeEggData r1 = r1.getCommerceAdLikeDigg()
            if (r1 == 0) goto L_0x065c
            com.ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService r3 = com.p683ss.android.ugc.aweme.commercialize.egg.impl.service.CommerceEggServiceImpl.createICommerceEggServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService r3 = (com.p683ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService) r3
            if (r3 == 0) goto L_0x05d0
            r4 = 2132018218(0x7f14042a, float:1.9674736E38)
            android.view.View r4 = r13.findViewById(r4)
            java.lang.String r6 = "findViewById(R.id.commerce_egg_layout)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r6)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            com.ss.android.ugc.aweme.commercialize.egg.f.a r3 = r3.getCommerceEggView(r4)
            goto L_0x05d1
        L_0x05d0:
            r3 = r5
        L_0x05d1:
            r13.f92995O = r3
            com.ss.android.ugc.aweme.commercialize.egg.e.a$a r3 = new com.ss.android.ugc.aweme.commercialize.egg.e.a$a
            r3.<init>()
            java.lang.String r4 = "it"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            com.ss.android.ugc.aweme.commercialize.egg.e.a$a r1 = r3.mo52975a(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r13.f93001d
            if (r3 == 0) goto L_0x05ea
            java.lang.String r3 = r3.getAid()
            goto L_0x05eb
        L_0x05ea:
            r3 = r5
        L_0x05eb:
            com.ss.android.ugc.aweme.commercialize.egg.e.a$a r1 = r1.mo52976a(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r13.f93001d
            if (r3 == 0) goto L_0x05fe
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.getAuthor()
            if (r3 == 0) goto L_0x05fe
            java.lang.String r3 = r3.getUid()
            goto L_0x05ff
        L_0x05fe:
            r3 = r5
        L_0x05ff:
            com.ss.android.ugc.aweme.commercialize.egg.e.a$a r1 = r1.mo52978b(r3)
            java.lang.String r2 = r13.mo60874g(r2)
            com.ss.android.ugc.aweme.commercialize.egg.e.a$a r1 = r1.mo52979c(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r13.f93001d
            if (r2 == 0) goto L_0x0613
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r5 = r2.getAwemeRawAd()
        L_0x0613:
            com.ss.android.ugc.aweme.commercialize.egg.e.a$a r1 = r1.mo52974a(r5)
            com.ss.android.ugc.aweme.commercialize.egg.e.a r1 = r1.mo52977a()
            com.ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService r2 = com.p683ss.android.ugc.aweme.commercialize.egg.impl.service.CommerceEggServiceImpl.createICommerceEggServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService r2 = (com.p683ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService) r2
            r2.addCommerceEggData(r1)
            com.ss.android.ugc.aweme.longvideo.DiggView r2 = r13.f92986F
            if (r2 == 0) goto L_0x065c
            com.ss.android.ugc.aweme.commercialize.egg.f.a r3 = r13.f92995O
            r2.f92967f = r3
            r2.f92968g = r1
            goto L_0x065c
        L_0x062f:
            boolean r1 = com.p683ss.android.ugc.aweme.commercialize.egg.C25788h.m62410a()
            if (r1 == 0) goto L_0x064e
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r13.f93001d
            com.ss.android.ugc.aweme.commercialize.egg.b r1 = com.p683ss.android.ugc.aweme.commercialize.egg.C25770d.m62387a(r1, r2)
            r13.f92993M = r1
            com.ss.android.ugc.aweme.commercialize.egg.b r1 = r13.f92993M
            if (r1 == 0) goto L_0x065c
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r13.f93001d
            java.lang.String r2 = r13.mo60874g(r2)
            com.ss.android.ugc.aweme.commercialize.egg.a.b r1 = com.p683ss.android.ugc.aweme.commercialize.egg.C25770d.m62386a(r1, r2)
            r13.f92994N = r1
            goto L_0x065c
        L_0x064e:
            com.ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout r1 = r13.f93006i
            if (r1 != 0) goto L_0x0657
            java.lang.String r2 = "mCommerceLikeLayout"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0657:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r13.f93001d
            r1.setCommerceDigg(r2)
        L_0x065c:
            com.ss.android.ugc.aweme.base.activity.a r14 = (com.p683ss.android.ugc.aweme.base.activity.C23422a) r14
            java.lang.String r1 = "listener"
            p2628d.p2639f.p2641b.C52711k.m112240b(r14, r1)
            java.util.ArrayList<com.ss.android.ugc.aweme.base.activity.a> r1 = r13.f92997R
            r1.add(r14)
            java.lang.String r14 = "com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r14, r1, r0)
            return
        L_0x0670:
            d.u r14 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.longvideo.view.CustomBottomSheetBehavior<android.view.View!>"
            r14.<init>(r0)
            throw r14
        L_0x0678:
            d.u r14 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.LinearLayout"
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.longvideo.LongVideoPlayActivity.onCreate(android.os.Bundle):void");
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!isViewValid()) {
            return false;
        }
        Iterator it = this.f92997R.iterator();
        while (it.hasNext()) {
            if (((C23422a) it.next()).onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }
}
