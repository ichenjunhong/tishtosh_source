package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.p683ss.android.ttve.utils.C20141b;
import com.p683ss.android.ugc.aweme.feed.C30578o;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.UgBubble;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.UgProfileTabGuide;
import com.p683ss.android.ugc.aweme.money.growth.C37164d.C37165a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.bj */
public final class C30800bj extends PopupWindow {

    /* renamed from: i */
    public static boolean f80684i = false;

    /* renamed from: j */
    public static String f80685j = "";

    /* renamed from: k */
    public static int f80686k = 5000;

    /* renamed from: l */
    public static final long f80687l = 300;

    /* renamed from: m */
    public static final C30801a f80688m = new C30801a(null);

    /* renamed from: a */
    public final View f80689a;

    /* renamed from: b */
    public final String f80690b;

    /* renamed from: c */
    public final Runnable f80691c = new C30803c(this);

    /* renamed from: d */
    public int f80692d;

    /* renamed from: e */
    public final FrameLayout f80693e;

    /* renamed from: f */
    public final int f80694f = ((int) C20141b.m49696a(this.f80696h, -8.0f));

    /* renamed from: g */
    public int f80695g;

    /* renamed from: h */
    public final Context f80696h;

    /* renamed from: n */
    private int f80697n;

    /* renamed from: o */
    private final DmtTextView f80698o;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.bj$a */
    public static final class C30801a {
        private C30801a() {
        }

        /* renamed from: b */
        public static String m72197b() {
            return C30800bj.f80685j;
        }

        /* renamed from: a */
        public static boolean m72196a() {
            return C30800bj.f80684i;
        }

        /* renamed from: a */
        public static void m72195a(boolean z) {
            C30800bj.f80684i = z;
        }

        public /* synthetic */ C30801a(C52707g gVar) {
            this();
        }

        /* renamed from: b */
        private static boolean m72198b(UgAwemeActivitySetting ugAwemeActivitySetting) {
            try {
                Boolean isNewUser = ugAwemeActivitySetting.getIsNewUser();
                if (isNewUser == null) {
                    C52711k.m112234a();
                }
                if (isNewUser.booleanValue()) {
                    return true;
                }
            } catch (C10174a unused) {
            }
            return false;
        }

        /* renamed from: c */
        private final boolean m72199c(UgAwemeActivitySetting ugAwemeActivitySetting) {
            try {
                UgProfileTabGuide profileTabGuide = ugAwemeActivitySetting.getProfileTabGuide();
                C52711k.m112236a((Object) profileTabGuide, "profileTabGuide");
                UgBubble bubble = profileTabGuide.getBubble();
                C52711k.m112236a((Object) bubble, "profileTabGuide.bubble");
                C30800bj.f80685j = bubble.getText();
                UgBubble bubble2 = profileTabGuide.getBubble();
                C52711k.m112236a((Object) bubble2, "profileTabGuide.bubble");
                C30800bj.f80686k = bubble2.getSeconds().intValue() * 1000;
                if (!TextUtils.isEmpty(m72197b())) {
                    return true;
                }
                return false;
            } catch (C10174a unused) {
                return false;
            }
        }

        /* renamed from: a */
        public final boolean mo63515a(UgAwemeActivitySetting ugAwemeActivitySetting) {
            boolean z;
            if (ugAwemeActivitySetting == null || C37165a.m83405b().f94855c.f94847b || !m72199c(ugAwemeActivitySetting)) {
                return false;
            }
            try {
                if (!ugAwemeActivitySetting.getOverallSwitch().booleanValue()) {
                    return false;
                }
                if (m72198b(ugAwemeActivitySetting)) {
                    C30801a aVar = this;
                    if (m72196a()) {
                        m72195a(false);
                        z = true;
                    } else {
                        z = false;
                    }
                    Boolean a = C30578o.m71565a();
                    C52711k.m112236a((Object) a, "Feed0VVManagerUtils.isFirstInstallAndFirstLaunch()");
                    if (!a.booleanValue() || z) {
                        return true;
                    }
                    return false;
                }
                return true;
            } catch (C10174a unused) {
                return false;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.bj$b */
    public static final class C30802b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C30800bj f80699a;

        C30802b(C30800bj bjVar) {
            this.f80699a = bjVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f80699a.mo63513a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.bj$c */
    static final class C30803c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C30800bj f80700a;

        C30803c(C30800bj bjVar) {
            this.f80700a = bjVar;
        }

        public final void run() {
            this.f80700a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.bj$d */
    public static final class C30804d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C30800bj f80701a;

        public C30804d(C30800bj bjVar) {
            this.f80701a = bjVar;
        }

        public final void run() {
            C30800bj bjVar = this.f80701a;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(bjVar.f80693e, "scaleX", new float[]{0.0f, 1.0f}), ObjectAnimator.ofFloat(bjVar.f80693e, "scaleY", new float[]{0.0f, 1.0f}), ObjectAnimator.ofFloat(bjVar.f80693e, "alpha", new float[]{0.0f, 1.0f})});
            animatorSet.setDuration(C30800bj.f80687l);
            animatorSet.start();
        }
    }

    /* renamed from: a */
    public final void mo63513a() {
        if (this.f80696h != null && (this.f80696h instanceof Activity) && !((Activity) this.f80696h).isFinishing()) {
            super.dismiss();
        }
    }

    public final void dismiss() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f80693e, "scaleX", new float[]{1.0f, 0.0f}), ObjectAnimator.ofFloat(this.f80693e, "scaleY", new float[]{1.0f, 0.0f}), ObjectAnimator.ofFloat(this.f80693e, "alpha", new float[]{1.0f, 0.0f})});
        animatorSet.setDuration(f80687l);
        Animator animator = animatorSet;
        animator.addListener(new C30802b(this));
        animator.start();
    }

    public C30800bj(Context context, View view, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(view, "anchorView");
        C52711k.m112240b(str, "text");
        super(context);
        this.f80696h = context;
        this.f80689a = view;
        this.f80690b = str;
        View inflate = LayoutInflater.from(this.f80696h).inflate(R.layout.b4l, null);
        View findViewById = inflate.findViewById(R.id.d8j);
        C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.tv_content)");
        this.f80698o = (DmtTextView) findViewById;
        this.f80698o.setFontType(C10751d.f28908g);
        this.f80698o.setText(str);
        View findViewById2 = inflate.findViewById(R.id.ahd);
        C52711k.m112236a((Object) findViewById2, "view.findViewById(R.id.fl_root_container)");
        this.f80693e = (FrameLayout) findViewById2;
        setContentView(inflate);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(0));
        inflate.measure(0, 0);
        C52711k.m112236a((Object) inflate, "view");
        this.f80692d = inflate.getMeasuredHeight();
        this.f80697n = inflate.getMeasuredWidth();
        Context context2 = this.f80696h;
        float a = C20141b.m49696a(context2, 10.0f);
        View contentView = getContentView();
        C52711k.m112236a((Object) contentView, "contentView");
        int measuredWidth = contentView.getMeasuredWidth();
        View contentView2 = getContentView();
        C52711k.m112236a((Object) contentView2, "contentView");
        int measuredHeight = contentView2.getMeasuredHeight();
        ImageView imageView = (ImageView) getContentView().findViewById(R.id.aya);
        ImageView imageView2 = (ImageView) getContentView().findViewById(R.id.ayb);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int a2 = C20141b.m49697a(context2);
        int width = iArr[0] + (view.getWidth() / 2);
        this.f80695g = 0;
        int i = measuredWidth / 2;
        float f = (float) width;
        if (((float) i) + a > f) {
            this.f80695g = (int) (a - ((float) iArr[0]));
            C52711k.m112236a((Object) imageView, "left");
            imageView.getLayoutParams().width = (int) (f - a);
            C52711k.m112236a((Object) imageView2, "right");
            imageView2.getLayoutParams().width = measuredWidth - imageView.getLayoutParams().width;
        } else {
            float f2 = ((float) a2) - a;
            if (((float) (width + i)) > f2) {
                this.f80695g = (int) (f2 - ((float) (iArr[0] + measuredWidth)));
                C52711k.m112236a((Object) imageView2, "right");
                imageView2.getLayoutParams().width = (int) (f2 - f);
                C52711k.m112236a((Object) imageView, "left");
                imageView.getLayoutParams().width = measuredWidth - imageView2.getLayoutParams().width;
            } else {
                this.f80695g = (view.getWidth() - measuredWidth) / 2;
                C52711k.m112236a((Object) imageView, "left");
                imageView.getLayoutParams().width = i;
                C52711k.m112236a((Object) imageView2, "right");
                imageView2.getLayoutParams().width = i;
            }
        }
        imageView.getLayoutParams().height = measuredHeight;
        imageView2.getLayoutParams().height = measuredHeight;
        getContentView().measure(0, 0);
        View contentView3 = getContentView();
        C52711k.m112236a((Object) contentView3, "contentView");
        this.f80692d = contentView3.getMeasuredHeight();
        View contentView4 = getContentView();
        C52711k.m112236a((Object) contentView4, "contentView");
        this.f80697n = contentView4.getMeasuredWidth();
        this.f80693e.setPivotX((float) imageView.getMeasuredWidth());
        this.f80693e.setPivotY((float) measuredHeight);
    }
}
