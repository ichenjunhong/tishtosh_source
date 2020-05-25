package com.p683ss.android.ugc.aweme.p1807im.sdk.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.support.p030v4.p038f.C0795l.C0798c;
import android.support.p030v4.view.C1045j;
import android.support.p030v4.view.C1048m;
import android.support.p030v4.view.C1053r;
import android.support.p043v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.utils.C47924gn;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52714n;
import p2628d.p2639f.p2641b.C52715o;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2644h.C52737a;
import p2628d.p2644h.C52738b;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.ShareNestedLayout */
public final class ShareNestedLayout extends LinearLayout implements C1048m {

    /* renamed from: H */
    private static final C0798c<Rect> f90860H = new C0798c<>(12);

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f90861a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ShareNestedLayout.class), "mViewConfiguration", "getMViewConfiguration()Landroid/view/ViewConfiguration;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ShareNestedLayout.class), "mTouchSlop", "getMTouchSlop()I")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ShareNestedLayout.class), "mMinimumVelocity", "getMMinimumVelocity()F")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ShareNestedLayout.class), "mMaximumVelocity", "getMMaximumVelocity()F")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ShareNestedLayout.class), "mVelocityTracker", "getMVelocityTracker()Landroid/view/VelocityTracker;")), C52728w.m112247a((C52714n) new C52715o(C52728w.m112245a(ShareNestedLayout.class), "mTouchScrollingChild", "getMTouchScrollingChild()Z")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ShareNestedLayout.class), "mPlaceholder", "getMPlaceholder()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ShareNestedLayout.class), "mContent", "getMContent()Landroid/widget/LinearLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ShareNestedLayout.class), "mScrollingChild", "getMScrollingChild()Landroid/support/v7/widget/RecyclerView;"))};

    /* renamed from: h */
    public static final C35368b f90862h = new C35368b(null);

    /* renamed from: A */
    private final C52668f f90863A;

    /* renamed from: B */
    private boolean f90864B;

    /* renamed from: C */
    private boolean f90865C;

    /* renamed from: D */
    private final C52668f f90866D;

    /* renamed from: E */
    private C52671b<? super Boolean, C52860x> f90867E;

    /* renamed from: F */
    private final C35376i f90868F;

    /* renamed from: G */
    private final C35370d f90869G;

    /* renamed from: b */
    public float f90870b;

    /* renamed from: c */
    public boolean f90871c;

    /* renamed from: d */
    public boolean f90872d;

    /* renamed from: e */
    public boolean f90873e;

    /* renamed from: f */
    public boolean f90874f;

    /* renamed from: g */
    public C52671b<? super Boolean, C52860x> f90875g;

    /* renamed from: i */
    private final C52668f f90876i;

    /* renamed from: j */
    private final C52668f f90877j;

    /* renamed from: k */
    private final C52668f f90878k;

    /* renamed from: l */
    private final C52668f f90879l;

    /* renamed from: m */
    private final C52668f f90880m;

    /* renamed from: n */
    private boolean f90881n;

    /* renamed from: o */
    private float f90882o;

    /* renamed from: p */
    private float f90883p;

    /* renamed from: q */
    private float f90884q;

    /* renamed from: r */
    private float f90885r;

    /* renamed from: s */
    private float f90886s;

    /* renamed from: t */
    private float f90887t;

    /* renamed from: u */
    private float f90888u;

    /* renamed from: v */
    private boolean f90889v;

    /* renamed from: w */
    private ObjectAnimator f90890w;

    /* renamed from: x */
    private boolean f90891x;

    /* renamed from: y */
    private final C52738b f90892y;

    /* renamed from: z */
    private final C52668f f90893z;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.ShareNestedLayout$a */
    public static final class C35367a extends C52737a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Object f90895a;

        /* renamed from: b */
        final /* synthetic */ ShareNestedLayout f90896b;

        public C35367a(Object obj, Object obj2, ShareNestedLayout shareNestedLayout) {
            this.f90895a = obj;
            this.f90896b = shareNestedLayout;
            super(obj2);
        }

        /* renamed from: a */
        public final void mo52013a(C52767h<?> hVar, Boolean bool, Boolean bool2) {
            boolean z;
            C52711k.m112240b(hVar, "property");
            if (bool2.booleanValue() ^ bool.booleanValue()) {
                ShareNestedLayout shareNestedLayout = this.f90896b;
                if (this.f90896b.getMScrollingChild().computeVerticalScrollExtent() >= this.f90896b.getMScrollingChild().computeVerticalScrollRange()) {
                    z = true;
                } else {
                    z = false;
                }
                shareNestedLayout.f90871c = z;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.ShareNestedLayout$b */
    public static final class C35368b {
        private C35368b() {
        }

        public /* synthetic */ C35368b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.ShareNestedLayout$c */
    static final class C35369c extends C52712l implements C52670a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ ShareNestedLayout f90897a;

        C35369c(ShareNestedLayout shareNestedLayout) {
            this.f90897a = shareNestedLayout;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (LinearLayout) this.f90897a.findViewById(R.id.e3n);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.ShareNestedLayout$d */
    public static final class C35370d implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ ShareNestedLayout f90898a;

        public final void onAnimationRepeat(Animator animator) {
        }

        C35370d(ShareNestedLayout shareNestedLayout) {
            this.f90898a = shareNestedLayout;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f90898a.f90872d = false;
            this.f90898a.mo73617d();
            this.f90898a.setMIsFocus(false);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f90898a.f90872d = false;
            this.f90898a.setVisibility(8);
            this.f90898a.mo73617d();
            this.f90898a.setMIsFocus(false);
        }

        public final void onAnimationStart(Animator animator) {
            if (this.f90898a.f90873e || (!this.f90898a.f90872d && this.f90898a.getTranslationY() <= this.f90898a.f90870b)) {
                C52671b<? super Boolean, C52860x> bVar = this.f90898a.f90875g;
                if (bVar != null) {
                    bVar.invoke(Boolean.valueOf(false));
                }
            }
            this.f90898a.f90872d = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.ShareNestedLayout$e */
    static final class C35371e extends C52712l implements C52670a<Float> {

        /* renamed from: a */
        final /* synthetic */ ShareNestedLayout f90899a;

        C35371e(ShareNestedLayout shareNestedLayout) {
            this.f90899a = shareNestedLayout;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ViewConfiguration mViewConfiguration = this.f90899a.getMViewConfiguration();
            C52711k.m112236a((Object) mViewConfiguration, "mViewConfiguration");
            return Float.valueOf((float) mViewConfiguration.getScaledMaximumFlingVelocity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.ShareNestedLayout$f */
    static final class C35372f extends C52712l implements C52670a<Float> {

        /* renamed from: a */
        final /* synthetic */ ShareNestedLayout f90900a;

        C35372f(ShareNestedLayout shareNestedLayout) {
            this.f90900a = shareNestedLayout;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ViewConfiguration mViewConfiguration = this.f90900a.getMViewConfiguration();
            C52711k.m112236a((Object) mViewConfiguration, "mViewConfiguration");
            return Float.valueOf((float) mViewConfiguration.getScaledMinimumFlingVelocity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.ShareNestedLayout$g */
    static final class C35373g extends C52712l implements C52670a<View> {

        /* renamed from: a */
        final /* synthetic */ ShareNestedLayout f90901a;

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.ShareNestedLayout$g$a */
        static final class C35374a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C35373g f90902a;

            C35374a(C35373g gVar) {
                this.f90902a = gVar;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f90902a.f90901a.mo73615b();
            }
        }

        C35373g(ShareNestedLayout shareNestedLayout) {
            this.f90901a = shareNestedLayout;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View findViewById = this.f90901a.findViewById(R.id.eow);
            findViewById.setOnClickListener(new C35374a(this));
            return findViewById;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.ShareNestedLayout$h */
    static final class C35375h extends C52712l implements C52670a<RecyclerView> {

        /* renamed from: a */
        final /* synthetic */ ShareNestedLayout f90903a;

        C35375h(ShareNestedLayout shareNestedLayout) {
            this.f90903a = shareNestedLayout;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (RecyclerView) this.f90903a.findViewById(R.id.bl1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.ShareNestedLayout$i */
    public static final class C35376i implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ ShareNestedLayout f90904a;

        public final void onAnimationRepeat(Animator animator) {
        }

        C35376i(ShareNestedLayout shareNestedLayout) {
            this.f90904a = shareNestedLayout;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f90904a.f90873e = false;
            this.f90904a.mo73617d();
            this.f90904a.setMIsFocus(true);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f90904a.f90873e = false;
            this.f90904a.mo73617d();
            this.f90904a.setMIsFocus(true);
        }

        public final void onAnimationStart(Animator animator) {
            if (!this.f90904a.mo73614a()) {
                C52671b<? super Boolean, C52860x> bVar = this.f90904a.f90875g;
                if (bVar != null) {
                    bVar.invoke(Boolean.valueOf(true));
                }
            }
            this.f90904a.setVisibility(0);
            this.f90904a.f90873e = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.ShareNestedLayout$j */
    static final class C35377j extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        final /* synthetic */ ShareNestedLayout f90905a;

        C35377j(ShareNestedLayout shareNestedLayout) {
            this.f90905a = shareNestedLayout;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ViewConfiguration mViewConfiguration = this.f90905a.getMViewConfiguration();
            C52711k.m112236a((Object) mViewConfiguration, "mViewConfiguration");
            return Integer.valueOf(mViewConfiguration.getScaledTouchSlop());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.ShareNestedLayout$k */
    static final class C35378k extends C52712l implements C52670a<VelocityTracker> {

        /* renamed from: a */
        public static final C35378k f90906a = new C35378k();

        C35378k() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return VelocityTracker.obtain();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.ShareNestedLayout$l */
    static final class C35379l extends C52712l implements C52670a<ViewConfiguration> {

        /* renamed from: a */
        final /* synthetic */ Context f90907a;

        C35379l(Context context) {
            this.f90907a = context;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ViewConfiguration.get(this.f90907a);
        }
    }

    public ShareNestedLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public ShareNestedLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final LinearLayout getMContent() {
        return (LinearLayout) this.f90863A.getValue();
    }

    private final float getMMaximumVelocity() {
        return ((Number) this.f90879l.getValue()).floatValue();
    }

    private final float getMMinimumVelocity() {
        return ((Number) this.f90878k.getValue()).floatValue();
    }

    private final View getMPlaceholder() {
        return (View) this.f90893z.getValue();
    }

    private final boolean getMTouchScrollingChild() {
        return ((Boolean) this.f90892y.mo110333a(this, f90861a[5])).booleanValue();
    }

    private final int getMTouchSlop() {
        return ((Number) this.f90877j.getValue()).intValue();
    }

    private final VelocityTracker getMVelocityTracker() {
        return (VelocityTracker) this.f90880m.getValue();
    }

    private final void setMTouchScrollingChild(boolean z) {
        this.f90892y.mo110334a(this, f90861a[5], Boolean.valueOf(z));
    }

    public final boolean getMCanDragUp() {
        return this.f90891x;
    }

    public final RecyclerView getMScrollingChild() {
        return (RecyclerView) this.f90866D.getValue();
    }

    public final ViewConfiguration getMViewConfiguration() {
        return (ViewConfiguration) this.f90876i.getValue();
    }

    public final int getNestedScrollAxes() {
        return 0;
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        C52711k.m112240b(view, "target");
        return false;
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        C52711k.m112240b(view, "target");
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        C52711k.m112240b(view, "child");
        C52711k.m112240b(view2, "target");
    }

    /* renamed from: b */
    public final void mo73615b() {
        mo73613a(false, true);
    }

    private final boolean getMAnimating() {
        if (this.f90872d || this.f90873e) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo73617d() {
        this.f90889v = false;
        setMTouchScrollingChild(false);
        this.f90865C = false;
        this.f90887t = 0.0f;
    }

    /* renamed from: a */
    public final boolean mo73614a() {
        if (this.f90873e || (!this.f90872d && getTranslationY() < this.f90870b)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo73616c() {
        LinearLayout mContent = getMContent();
        if (mContent != null) {
            LayoutParams layoutParams = mContent.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = (int) (this.f90870b + this.f90888u);
            }
        }
        requestLayout();
        this.f90891x = false;
    }

    public final void setCanDragUp(boolean z) {
        this.f90891x = z;
    }

    public final void setMCanDragUp(boolean z) {
        this.f90891x = z;
    }

    public final void setPreScrollChangeListener(C52671b<? super Boolean, C52860x> bVar) {
        this.f90867E = bVar;
    }

    public final void setTranslationY(float f) {
        super.setTranslationY(f);
    }

    public final void setVisibleChangedListener(C52671b<? super Boolean, C52860x> bVar) {
        this.f90875g = bVar;
    }

    public final void onStopNestedScroll(View view) {
        boolean z;
        C52711k.m112240b(view, "child");
        if (getTranslationY() * 2.0f < this.f90870b) {
            z = true;
        } else {
            z = false;
        }
        mo73613a(z, false);
    }

    public final void setMIsFocus(boolean z) {
        if (this.f90874f ^ z) {
            setFocusable(z);
            setFocusableInTouchMode(z);
            if (z) {
                requestFocus();
            } else {
                clearFocus();
            }
            this.f90874f = z;
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C52711k.m112240b(motionEvent, "ev");
        if (motionEvent.getActionMasked() == 0) {
            this.f90881n = getMAnimating();
        }
        if (this.f90881n && !getMAnimating() && motionEvent.getActionMasked() == 2) {
            motionEvent.setAction(0);
            this.f90881n = false;
        }
        if (getVisibility() == 8) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C52711k.m112240b(motionEvent, "event");
        if (motionEvent.getActionMasked() == 0) {
            mo73617d();
            this.f90882o = motionEvent.getX();
            this.f90884q = this.f90882o;
            this.f90883p = motionEvent.getY();
            this.f90885r = this.f90883p;
            this.f90886s = motionEvent.getRawY();
            getMVelocityTracker().clear();
            getMVelocityTracker().addMovement(motionEvent);
            View mPlaceholder = getMPlaceholder();
            C52711k.m112236a((Object) mPlaceholder, "mPlaceholder");
            this.f90865C = m80009a(mPlaceholder, motionEvent);
            RecyclerView mScrollingChild = getMScrollingChild();
            C52711k.m112236a((Object) mScrollingChild, "mScrollingChild");
            setMTouchScrollingChild(m80009a((View) mScrollingChild, motionEvent));
        }
        if (getMAnimating()) {
            return true;
        }
        if (getVisibility() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 3) {
            mo73617d();
        }
        if (motionEvent.getActionMasked() == 1) {
            mo73617d();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 2) {
                if (this.f90865C) {
                    return false;
                }
                float y = this.f90885r - motionEvent.getY();
                if (!getMTouchScrollingChild() && (this.f90889v || Math.abs(y) > ((float) getMTouchSlop()))) {
                    this.f90889v = true;
                    return true;
                }
            }
        } else if (this.f90865C) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        C52711k.m112240b(motionEvent, "event");
        if (getMAnimating()) {
            return true;
        }
        switch (motionEvent.getActionMasked()) {
            case 1:
                VelocityTracker mVelocityTracker = getMVelocityTracker();
                mVelocityTracker.computeCurrentVelocity(1000, getMMaximumVelocity());
                boolean z2 = false;
                if (Math.abs(mVelocityTracker.getYVelocity()) > getMMinimumVelocity() && !getMAnimating()) {
                    if (this.f90887t < 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    mo73613a(z, false);
                    z2 = true;
                }
                if (!z2) {
                    onStopNestedScroll(this);
                }
                mo73617d();
                break;
            case 2:
                if (!getMTouchScrollingChild()) {
                    getMVelocityTracker().addMovement(motionEvent);
                    float x = this.f90882o - motionEvent.getX();
                    float y = this.f90883p - motionEvent.getY();
                    if (this.f90889v || Math.abs(y) > ((float) getMTouchSlop())) {
                        this.f90889v = true;
                        RecyclerView mScrollingChild = getMScrollingChild();
                        C52711k.m112236a((Object) mScrollingChild, "mScrollingChild");
                        onNestedPreScroll(mScrollingChild, (int) x, (int) y, new int[]{0, 0});
                        C52671b<? super Boolean, C52860x> bVar = this.f90867E;
                        if (bVar != null) {
                            bVar.invoke(Boolean.valueOf(true));
                        }
                    }
                    this.f90887t = motionEvent.getRawY() - this.f90886s;
                    this.f90886s = motionEvent.getRawY();
                    break;
                }
                break;
            case 3:
                onStopNestedScroll(this);
                mo73617d();
                break;
        }
        return true;
    }

    /* renamed from: a */
    private final boolean m80009a(View view, MotionEvent motionEvent) {
        if (view.getVisibility() != 0) {
            return false;
        }
        Rect rect = (Rect) f90860H.acquire();
        if (rect == null) {
            rect = new Rect();
        }
        C47924gn.m103692a((ViewGroup) this, view, rect);
        try {
            boolean contains = rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
            return contains;
        } finally {
            rect.setEmpty();
            f90860H.release(rect);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View mPlaceholder = getMPlaceholder();
        C52711k.m112236a((Object) mPlaceholder, "mPlaceholder");
        this.f90888u = (float) mPlaceholder.getMeasuredHeight();
        float measuredHeight = (float) getMeasuredHeight();
        View mPlaceholder2 = getMPlaceholder();
        C52711k.m112236a((Object) mPlaceholder2, "mPlaceholder");
        this.f90870b = measuredHeight - ((float) mPlaceholder2.getMeasuredHeight());
    }

    /* renamed from: a */
    public final void mo73613a(boolean z, boolean z2) {
        float f;
        AnimatorListener animatorListener;
        if (!getMAnimating()) {
            float f2 = 0.0f;
            if (z) {
                f = 0.0f;
            } else {
                f = this.f90870b;
            }
            if (getTranslationY() == f) {
                if (!z || getVisibility() != 0) {
                    int i = 8;
                    if (z || getVisibility() != 8) {
                        if (z) {
                            i = 0;
                        }
                        setVisibility(i);
                        mo73617d();
                        if (z2) {
                            if (z) {
                                if (this.f90870b <= 0.0f) {
                                    f2 = C9432q.m18687b(getContext(), 500.0f);
                                } else {
                                    f2 = this.f90870b;
                                }
                            }
                            setTranslationY(f2);
                        }
                    }
                }
                return;
            }
            ObjectAnimator objectAnimator = this.f90890w;
            if (objectAnimator != null && objectAnimator.isRunning()) {
                ObjectAnimator objectAnimator2 = this.f90890w;
                if (objectAnimator2 != null) {
                    objectAnimator2.cancel();
                }
            }
            this.f90890w = ObjectAnimator.ofFloat(this, View.TRANSLATION_Y, new float[]{getTranslationY(), f});
            ObjectAnimator objectAnimator3 = this.f90890w;
            if (objectAnimator3 == null) {
                C52711k.m112234a();
            }
            objectAnimator3.setDuration(150);
            ObjectAnimator objectAnimator4 = this.f90890w;
            if (objectAnimator4 == null) {
                C52711k.m112234a();
            }
            objectAnimator4.setInterpolator(new AccelerateDecelerateInterpolator());
            ObjectAnimator objectAnimator5 = this.f90890w;
            if (objectAnimator5 == null) {
                C52711k.m112234a();
            }
            if (z) {
                animatorListener = this.f90868F;
            } else {
                animatorListener = this.f90869G;
            }
            objectAnimator5.addListener(animatorListener);
            ObjectAnimator objectAnimator6 = this.f90890w;
            if (objectAnimator6 == null) {
                C52711k.m112234a();
            }
            objectAnimator6.start();
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        C52711k.m112240b(view, "child");
        C52711k.m112240b(view2, "target");
        if (!(view2 instanceof C1045j) || (i & 2) == 0) {
            return false;
        }
        return true;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        int i;
        boolean z;
        C52711k.m112240b(view, "target");
        if (view instanceof C1053r) {
            i = ((C1053r) view).computeVerticalScrollOffset();
        } else {
            i = 0;
        }
        if (i != 0) {
            return false;
        }
        if (f2 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        mo73613a(z, false);
        return true;
    }

    public ShareNestedLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f90876i = C52732g.m112285a(new C35379l(context));
        this.f90877j = C52732g.m112285a(new C35377j(this));
        this.f90878k = C52732g.m112285a(new C35372f(this));
        this.f90879l = C52732g.m112285a(new C35371e(this));
        this.f90880m = C52732g.m112285a(C35378k.f90906a);
        this.f90891x = true;
        Boolean valueOf = Boolean.valueOf(false);
        this.f90892y = new C35367a(valueOf, valueOf, this);
        this.f90893z = C52732g.m112285a(new C35373g(this));
        this.f90863A = C52732g.m112285a(new C35369c(this));
        this.f90866D = C52732g.m112285a(new C35375h(this));
        this.f90868F = new C35376i(this);
        this.f90869G = new C35370d(this);
        setMIsFocus(true);
        setOnKeyListener(new OnKeyListener(this) {

            /* renamed from: a */
            final /* synthetic */ ShareNestedLayout f90894a;

            {
                this.f90894a = r1;
            }

            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (!this.f90894a.mo73614a() || i != 4) {
                    return false;
                }
                C52711k.m112236a((Object) keyEvent, "event");
                if (keyEvent.getAction() == 1) {
                    this.f90894a.mo73615b();
                }
                return true;
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNestedPreScroll(android.view.View r4, int r5, int r6, int[] r7) {
        /*
            r3 = this;
            java.lang.String r5 = "target"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r5)
            java.lang.String r5 = "consumed"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r5)
            float r5 = r3.getTranslationY()
            r0 = 1
            r1 = 0
            int r2 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x0037
            float r4 = (float) r6
            float r4 = r5 - r4
            int r5 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x001c
            r4 = 0
        L_0x001c:
            float r5 = r3.f90870b
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0024
            float r4 = r3.f90870b
        L_0x0024:
            r3.setTranslationY(r4)
            boolean r4 = r3.getMTouchScrollingChild()
            if (r4 == 0) goto L_0x00d4
            boolean r4 = r3.f90871c
            if (r4 != 0) goto L_0x00d4
            r4 = r7[r0]
            int r4 = r4 + r6
            r7[r0] = r4
            return
        L_0x0037:
            int r2 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r2 != 0) goto L_0x0075
            boolean r7 = r4 instanceof android.support.p030v4.view.C1053r
            if (r7 == 0) goto L_0x0046
            android.support.v4.view.r r4 = (android.support.p030v4.view.C1053r) r4
            int r4 = r4.computeVerticalScrollOffset()
            goto L_0x0047
        L_0x0046:
            r4 = 0
        L_0x0047:
            if (r6 >= 0) goto L_0x005f
            if (r4 == 0) goto L_0x0051
            boolean r7 = r3.getMTouchScrollingChild()
            if (r7 != 0) goto L_0x005f
        L_0x0051:
            float r4 = (float) r6
            float r5 = r5 - r4
            float r4 = r3.f90870b
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x005b
            float r5 = r3.f90870b
        L_0x005b:
            r3.setTranslationY(r5)
            return
        L_0x005f:
            if (r6 <= 0) goto L_0x0074
            if (r4 == 0) goto L_0x0069
            boolean r4 = r3.getMTouchScrollingChild()
            if (r4 != 0) goto L_0x0074
        L_0x0069:
            boolean r4 = r3.f90891x
            if (r4 == 0) goto L_0x0074
            r4 = 1008981770(0x3c23d70a, float:0.01)
            float r5 = r5 - r4
            r3.setTranslationY(r5)
        L_0x0074:
            return
        L_0x0075:
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x00d4
            boolean r4 = r3.getMTouchScrollingChild()
            if (r4 == 0) goto L_0x0089
            boolean r4 = r3.f90871c
            if (r4 != 0) goto L_0x0089
            r4 = r7[r0]
            int r4 = r4 - r6
            r7[r0] = r4
            return
        L_0x0089:
            boolean r4 = r3.getMTouchScrollingChild()
            if (r4 != 0) goto L_0x00d4
            android.widget.LinearLayout r4 = r3.getMContent()
            if (r4 == 0) goto L_0x00a2
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            if (r4 == 0) goto L_0x00a2
            int r4 = r4.height
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x00a3
        L_0x00a2:
            r4 = 0
        L_0x00a3:
            if (r4 != 0) goto L_0x00a8
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00a8:
            int r4 = r4.intValue()
            float r5 = r3.f90870b
            float r7 = r3.f90888u
            float r5 = r5 + r7
            int r5 = (int) r5
            if (r4 >= r5) goto L_0x00cb
            android.widget.LinearLayout r4 = r3.getMContent()
            if (r4 == 0) goto L_0x00c7
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            if (r4 == 0) goto L_0x00c7
            float r5 = r3.f90870b
            float r6 = (float) r6
            float r5 = r5 + r6
            int r5 = (int) r5
            r4.height = r5
        L_0x00c7:
            r3.requestLayout()
            return
        L_0x00cb:
            boolean r4 = r3.f90864B
            if (r4 != 0) goto L_0x00d4
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79521i()
            r3.f90864B = r0
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ShareNestedLayout.onNestedPreScroll(android.view.View, int, int, int[]):void");
    }

    public /* synthetic */ ShareNestedLayout(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
