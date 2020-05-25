package com.p683ss.android.ugc.aweme.commercialize.views;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.commercialize.utils.ViewWrapper;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer */
public final class AdHalfWebPageContainer extends FrameLayout {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f69930a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AdHalfWebPageContainer.class), "decorView", "getDecorView()Landroid/view/View;"))};

    /* renamed from: f */
    public static final C26556a f69931f = new C26556a(null);

    /* renamed from: i */
    private static final String f69932i = AdHalfWebPageContainer.class.getSimpleName();

    /* renamed from: b */
    public boolean f69933b;

    /* renamed from: c */
    public boolean f69934c;

    /* renamed from: d */
    public boolean f69935d;

    /* renamed from: e */
    public boolean f69936e;

    /* renamed from: g */
    private boolean f69937g;

    /* renamed from: h */
    private final C52668f f69938h;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$a */
    public static final class C26556a {
        private C26556a() {
        }

        public /* synthetic */ C26556a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$b */
    static final class C26557b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f69939a;

        C26557b(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f69939a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f69939a.f69933b = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$c */
    static final class C26558c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f69940a;

        /* renamed from: b */
        final /* synthetic */ Runnable f69941b;

        C26558c(AdHalfWebPageContainer adHalfWebPageContainer, Runnable runnable) {
            this.f69940a = adHalfWebPageContainer;
            this.f69941b = runnable;
        }

        public final void run() {
            this.f69940a.f69933b = false;
            Runnable runnable = this.f69941b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$d */
    static final class C26559d extends C52712l implements C52670a<View> {

        /* renamed from: a */
        final /* synthetic */ Context f69942a;

        C26559d(Context context) {
            this.f69942a = context;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Context context = this.f69942a;
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity != null) {
                Window window = activity.getWindow();
                if (window != null) {
                    return window.getDecorView();
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$e */
    static final class C26560e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f69943a;

        C26560e(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f69943a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f69943a.f69933b = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$f */
    static final class C26561f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f69944a;

        C26561f(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f69944a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f69944a.f69933b = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$g */
    public static final class C26562g implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f69945a;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        C26562g(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f69945a = adHalfWebPageContainer;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f69945a.f69933b = false;
        }

        public final void onAnimationStart(Animator animator) {
            this.f69945a.f69933b = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$h */
    static final class C26563h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f69946a;

        C26563h(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f69946a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f69946a.f69933b = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$i */
    static final class C26564i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f69947a;

        C26564i(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f69947a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f69947a.f69933b = false;
            this.f69947a.mo54265f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$j */
    static final class C26565j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f69948a;

        C26565j(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f69948a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f69948a.f69933b = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$k */
    static final class C26566k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f69949a;

        C26566k(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f69949a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f69949a.f69933b = false;
            this.f69949a.mo54265f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$l */
    public static final class C26567l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f69950a;

        public C26567l(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f69950a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f69950a.f69933b = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$m */
    public static final class C26568m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f69951a;

        public C26568m(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f69951a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f69951a.f69933b = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$n */
    public static final class C26569n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f69952a;

        public C26569n(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f69952a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f69952a.f69933b = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$o */
    public static final class C26570o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f69953a;

        public C26570o(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f69953a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f69953a.f69933b = false;
        }
    }

    public AdHalfWebPageContainer(Context context) {
        this(context, null, 0, 6, null);
    }

    public AdHalfWebPageContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final View getDecorView() {
        return (View) this.f69938h.getValue();
    }

    /* renamed from: a */
    public final boolean mo54260a() {
        return C23729p.m58267b((View) this);
    }

    /* renamed from: e */
    public final void mo54264e() {
        setTranslationX(getToTransX());
        setTranslationY(0.0f);
    }

    /* renamed from: f */
    public final void mo54265f() {
        setAlpha(0.0f);
        setVisibility(8);
        mo54264e();
    }

    /* renamed from: g */
    public final void mo54266g() {
        setAlpha(1.0f);
        mo54262c();
    }

    public final boolean getCanCollapse() {
        if (!this.f69935d || this.f69936e) {
            return false;
        }
        return true;
    }

    public final boolean getCanExpand() {
        if (!this.f69935d || this.f69936e) {
            return true;
        }
        return false;
    }

    private final int getScreenHeight() {
        View decorView = getDecorView();
        if (decorView != null) {
            return decorView.getHeight();
        }
        return C23724k.m58221a(getContext());
    }

    private final int getScreenWidth() {
        View decorView = getDecorView();
        if (decorView != null) {
            return decorView.getWidth();
        }
        return C23724k.m58224b(getContext());
    }

    /* renamed from: b */
    public final boolean mo54261b() {
        if (getVisibility() == 0 && getAlpha() == 1.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo54262c() {
        if (this.f69937g && VERSION.SDK_INT >= 21) {
            setZ(0.0f);
        }
        setVisibility(0);
    }

    /* renamed from: d */
    public final void mo54263d() {
        if (!this.f69937g || VERSION.SDK_INT < 21) {
            setVisibility(4);
            return;
        }
        setZ(-1.0f);
        setVisibility(0);
    }

    /* renamed from: h */
    public final void mo54270h() {
        setTranslationX((((float) (getScreenWidth() - getWidth())) / 2.0f) - ((float) getLeft()));
    }

    public final float getToTransX() {
        int i;
        if (C47918gj.m103682a(getContext())) {
            int width = getWidth();
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                i = width + ((MarginLayoutParams) layoutParams).rightMargin;
            } else {
                throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        } else {
            int width2 = getWidth();
            LayoutParams layoutParams2 = getLayoutParams();
            if (layoutParams2 != null) {
                i = -(width2 + ((MarginLayoutParams) layoutParams2).leftMargin);
            } else {
                throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        return (float) i;
    }

    public final void setCollapsed(boolean z) {
        this.f69936e = z;
    }

    public final void setExpanded(boolean z) {
        this.f69935d = z;
    }

    public final void setUseZOrder(boolean z) {
        this.f69937g = z;
    }

    public final void setInCleanMode(boolean z) {
        int i;
        this.f69934c = z;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        setVisibility(i);
    }

    /* renamed from: a */
    public final void mo54259a(boolean z) {
        if (z) {
            animate().alpha(0.0f).withStartAction(new C26563h(this)).setDuration(280).withEndAction(new C26564i(this)).start();
        } else {
            animate().alpha(0.0f).translationX(getToTransX()).withStartAction(new C26565j(this)).setDuration(200).withEndAction(new C26566k(this)).start();
        }
    }

    /* renamed from: a */
    public final void mo54256a(int i, int i2) {
        m64306b(i, i2, 0);
    }

    /* renamed from: a */
    public final void mo54258a(long j, Runnable runnable) {
        this.f69936e = true;
        animate().translationY((float) (getScreenHeight() - getTop())).withStartAction(new C26557b(this)).withEndAction(new C26558c(this, runnable)).setDuration(400).start();
    }

    public AdHalfWebPageContainer(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        setAlpha(0.0f);
        this.f69938h = C52732g.m112285a(new C26559d(context));
    }

    /* renamed from: a */
    public final void mo54257a(int i, int i2, long j) {
        this.f69935d = true;
        this.f69936e = false;
        m64306b(i, i2, 100);
        float screenWidth = (((((float) (getScreenWidth() - i)) / 2.0f) - ((float) getLeft())) + ((float) i)) - ((float) getWidth());
        animate().translationX(screenWidth).translationY((((((float) (getScreenHeight() - i2)) / 2.0f) - ((float) getTop())) + ((float) i2)) - ((float) getHeight())).withStartAction(new C26560e(this)).withEndAction(new C26561f(this)).setDuration(100).start();
    }

    /* renamed from: b */
    private void m64306b(int i, int i2, long j) {
        ViewWrapper viewWrapper = new ViewWrapper(this);
        if (j == 0) {
            if (i > 0 && viewWrapper.getWidth() != i) {
                viewWrapper.setWidth(i);
            }
            if (i2 > 0 && viewWrapper.getHeight() != i2) {
                viewWrapper.setHeight(i2);
            }
        } else if (j > 0) {
            List arrayList = new ArrayList();
            if (i > 0 && viewWrapper.getWidth() != i) {
                ObjectAnimator ofInt = ObjectAnimator.ofInt(viewWrapper, "width", new int[]{viewWrapper.getWidth(), i});
                C52711k.m112236a((Object) ofInt, "ObjectAnimator.ofInt(vw, \"width\", vw.width, width)");
                arrayList.add(ofInt);
            }
            if (i2 > 0 && viewWrapper.getHeight() != i2) {
                ObjectAnimator ofInt2 = ObjectAnimator.ofInt(viewWrapper, "height", new int[]{viewWrapper.getHeight(), i2});
                C52711k.m112236a((Object) ofInt2, "ObjectAnimator.ofInt(vw,…ight\", vw.height, height)");
                arrayList.add(ofInt2);
            }
            if (!arrayList.isEmpty()) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(j);
                animatorSet.addListener(new C26562g(this));
                animatorSet.start();
            }
        }
    }

    public /* synthetic */ AdHalfWebPageContainer(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
