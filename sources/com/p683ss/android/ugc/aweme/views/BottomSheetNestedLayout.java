package com.p683ss.android.ugc.aweme.views;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
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
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
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

/* renamed from: com.ss.android.ugc.aweme.views.BottomSheetNestedLayout */
public final class BottomSheetNestedLayout extends LinearLayout implements C1048m {

    /* renamed from: E */
    private static final C0798c<Rect> f120977E = new C0798c<>(12);

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f120978a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(BottomSheetNestedLayout.class), "mViewConfiguration", "getMViewConfiguration()Landroid/view/ViewConfiguration;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(BottomSheetNestedLayout.class), "mTouchSlop", "getMTouchSlop()I")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(BottomSheetNestedLayout.class), "mMinimumVelocity", "getMMinimumVelocity()F")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(BottomSheetNestedLayout.class), "mMaximumVelocity", "getMMaximumVelocity()F")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(BottomSheetNestedLayout.class), "mVelocityTracker", "getMVelocityTracker()Landroid/view/VelocityTracker;")), C52728w.m112247a((C52714n) new C52715o(C52728w.m112245a(BottomSheetNestedLayout.class), "mTouchScrollingChild", "getMTouchScrollingChild()Z")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(BottomSheetNestedLayout.class), "mPlaceholder", "getMPlaceholder()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(BottomSheetNestedLayout.class), "mScrollingChild", "getMScrollingChild()Landroid/support/v7/widget/RecyclerView;"))};

    /* renamed from: j */
    public static final C48130b f120979j = new C48130b(null);

    /* renamed from: A */
    private final C52668f f120980A;

    /* renamed from: B */
    private final C48138i f120981B;

    /* renamed from: C */
    private final C48132d f120982C;

    /* renamed from: D */
    private C52671b<? super Float, C52860x> f120983D;

    /* renamed from: b */
    public float f120984b;

    /* renamed from: c */
    public boolean f120985c;

    /* renamed from: d */
    public boolean f120986d;

    /* renamed from: e */
    public boolean f120987e;

    /* renamed from: f */
    public boolean f120988f;

    /* renamed from: g */
    public C52671b<? super Boolean, C52860x> f120989g;

    /* renamed from: h */
    public C52671b<? super Boolean, C52860x> f120990h;

    /* renamed from: i */
    public C52671b<? super String, C52860x> f120991i;

    /* renamed from: k */
    private final C52668f f120992k;

    /* renamed from: l */
    private final C52668f f120993l;

    /* renamed from: m */
    private final C52668f f120994m;

    /* renamed from: n */
    private final C52668f f120995n;

    /* renamed from: o */
    private final C52668f f120996o;

    /* renamed from: p */
    private boolean f120997p;

    /* renamed from: q */
    private float f120998q;

    /* renamed from: r */
    private float f120999r;

    /* renamed from: s */
    private float f121000s;

    /* renamed from: t */
    private float f121001t;

    /* renamed from: u */
    private float f121002u;

    /* renamed from: v */
    private float f121003v;

    /* renamed from: w */
    private boolean f121004w;

    /* renamed from: x */
    private final C52738b f121005x;

    /* renamed from: y */
    private final C52668f f121006y;

    /* renamed from: z */
    private boolean f121007z;

    /* renamed from: com.ss.android.ugc.aweme.views.BottomSheetNestedLayout$a */
    public static final class C48129a extends C52737a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Object f121009a;

        /* renamed from: b */
        final /* synthetic */ BottomSheetNestedLayout f121010b;

        public C48129a(Object obj, Object obj2, BottomSheetNestedLayout bottomSheetNestedLayout) {
            this.f121009a = obj;
            this.f121010b = bottomSheetNestedLayout;
            super(obj2);
        }

        /* renamed from: a */
        public final void mo52013a(C52767h<?> hVar, Boolean bool, Boolean bool2) {
            boolean z;
            C52711k.m112240b(hVar, "property");
            if (bool2.booleanValue() ^ bool.booleanValue()) {
                BottomSheetNestedLayout bottomSheetNestedLayout = this.f121010b;
                if (this.f121010b.getMScrollingChild().computeVerticalScrollExtent() >= this.f121010b.getMScrollingChild().computeVerticalScrollRange()) {
                    z = true;
                } else {
                    z = false;
                }
                bottomSheetNestedLayout.f120985c = z;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.BottomSheetNestedLayout$b */
    public static final class C48130b {
        private C48130b() {
        }

        public /* synthetic */ C48130b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.BottomSheetNestedLayout$c */
    static final class C48131c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ BottomSheetNestedLayout f121011a;

        C48131c(BottomSheetNestedLayout bottomSheetNestedLayout) {
            this.f121011a = bottomSheetNestedLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C52671b translationYUpdateListener = this.f121011a.getTranslationYUpdateListener();
            if (translationYUpdateListener != null) {
                translationYUpdateListener.invoke(Float.valueOf(this.f121011a.getTranslationY()));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.BottomSheetNestedLayout$d */
    public static final class C48132d implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ BottomSheetNestedLayout f121012a;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        C48132d(BottomSheetNestedLayout bottomSheetNestedLayout) {
            this.f121012a = bottomSheetNestedLayout;
        }

        public final void onAnimationEnd(Animator animator) {
            C52671b<? super Boolean, C52860x> bVar = this.f121012a.f120990h;
            if (bVar != null) {
                bVar.invoke(Boolean.valueOf(false));
            }
            this.f121012a.f120986d = false;
            this.f121012a.setVisibility(8);
            this.f121012a.setMIsFocus(false);
            this.f121012a.mo95463c();
        }

        public final void onAnimationStart(Animator animator) {
            if (this.f121012a.f120987e || (!this.f121012a.f120986d && this.f121012a.getTranslationY() <= this.f121012a.f120984b)) {
                C52671b<? super Boolean, C52860x> bVar = this.f121012a.f120989g;
                if (bVar != null) {
                    bVar.invoke(Boolean.valueOf(false));
                }
            }
            this.f121012a.f120986d = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.BottomSheetNestedLayout$e */
    static final class C48133e extends C52712l implements C52670a<Float> {

        /* renamed from: a */
        final /* synthetic */ BottomSheetNestedLayout f121013a;

        C48133e(BottomSheetNestedLayout bottomSheetNestedLayout) {
            this.f121013a = bottomSheetNestedLayout;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ViewConfiguration mViewConfiguration = this.f121013a.getMViewConfiguration();
            C52711k.m112236a((Object) mViewConfiguration, "mViewConfiguration");
            return Float.valueOf((float) mViewConfiguration.getScaledMaximumFlingVelocity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.BottomSheetNestedLayout$f */
    static final class C48134f extends C52712l implements C52670a<Float> {

        /* renamed from: a */
        final /* synthetic */ BottomSheetNestedLayout f121014a;

        C48134f(BottomSheetNestedLayout bottomSheetNestedLayout) {
            this.f121014a = bottomSheetNestedLayout;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ViewConfiguration mViewConfiguration = this.f121014a.getMViewConfiguration();
            C52711k.m112236a((Object) mViewConfiguration, "mViewConfiguration");
            return Float.valueOf((float) mViewConfiguration.getScaledMinimumFlingVelocity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.BottomSheetNestedLayout$g */
    static final class C48135g extends C52712l implements C52670a<View> {

        /* renamed from: a */
        final /* synthetic */ BottomSheetNestedLayout f121015a;

        /* renamed from: com.ss.android.ugc.aweme.views.BottomSheetNestedLayout$g$a */
        static final class C48136a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C48135g f121016a;

            C48136a(C48135g gVar) {
                this.f121016a = gVar;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C52671b<? super String, C52860x> bVar = this.f121016a.f121015a.f120991i;
                if (bVar != null) {
                    bVar.invoke("click_fade");
                }
                this.f121016a.f121015a.mo95462b();
            }
        }

        C48135g(BottomSheetNestedLayout bottomSheetNestedLayout) {
            this.f121015a = bottomSheetNestedLayout;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View findViewById = this.f121015a.findViewById(R.id.f7c);
            findViewById.setOnClickListener(new C48136a(this));
            return findViewById;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.BottomSheetNestedLayout$h */
    static final class C48137h extends C52712l implements C52670a<RecyclerView> {

        /* renamed from: a */
        final /* synthetic */ BottomSheetNestedLayout f121017a;

        C48137h(BottomSheetNestedLayout bottomSheetNestedLayout) {
            this.f121017a = bottomSheetNestedLayout;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (RecyclerView) this.f121017a.findViewById(R.id.ca3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.BottomSheetNestedLayout$i */
    public static final class C48138i implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ BottomSheetNestedLayout f121018a;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        C48138i(BottomSheetNestedLayout bottomSheetNestedLayout) {
            this.f121018a = bottomSheetNestedLayout;
        }

        public final void onAnimationEnd(Animator animator) {
            C52671b<? super Boolean, C52860x> bVar = this.f121018a.f120990h;
            if (bVar != null) {
                bVar.invoke(Boolean.valueOf(true));
            }
            this.f121018a.f120987e = false;
            this.f121018a.setMIsFocus(true);
            this.f121018a.mo95463c();
        }

        public final void onAnimationStart(Animator animator) {
            if (!this.f121018a.mo95461a()) {
                C52671b<? super Boolean, C52860x> bVar = this.f121018a.f120989g;
                if (bVar != null) {
                    bVar.invoke(Boolean.valueOf(true));
                }
            }
            this.f121018a.setVisibility(0);
            this.f121018a.f120987e = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.BottomSheetNestedLayout$j */
    static final class C48139j extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        final /* synthetic */ BottomSheetNestedLayout f121019a;

        C48139j(BottomSheetNestedLayout bottomSheetNestedLayout) {
            this.f121019a = bottomSheetNestedLayout;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ViewConfiguration mViewConfiguration = this.f121019a.getMViewConfiguration();
            C52711k.m112236a((Object) mViewConfiguration, "mViewConfiguration");
            return Integer.valueOf(mViewConfiguration.getScaledTouchSlop());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.BottomSheetNestedLayout$k */
    static final class C48140k extends C52712l implements C52670a<VelocityTracker> {

        /* renamed from: a */
        public static final C48140k f121020a = new C48140k();

        C48140k() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return VelocityTracker.obtain();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.BottomSheetNestedLayout$l */
    static final class C48141l extends C52712l implements C52670a<ViewConfiguration> {

        /* renamed from: a */
        final /* synthetic */ Context f121021a;

        C48141l(Context context) {
            this.f121021a = context;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ViewConfiguration.get(this.f121021a);
        }
    }

    public BottomSheetNestedLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public BottomSheetNestedLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final float getMMaximumVelocity() {
        return ((Number) this.f120995n.getValue()).floatValue();
    }

    private final float getMMinimumVelocity() {
        return ((Number) this.f120994m.getValue()).floatValue();
    }

    private final View getMPlaceholder() {
        return (View) this.f121006y.getValue();
    }

    private final boolean getMTouchScrollingChild() {
        return ((Boolean) this.f121005x.mo110333a(this, f120978a[5])).booleanValue();
    }

    private final int getMTouchSlop() {
        return ((Number) this.f120993l.getValue()).intValue();
    }

    private final VelocityTracker getMVelocityTracker() {
        return (VelocityTracker) this.f120996o.getValue();
    }

    private final void setMTouchScrollingChild(boolean z) {
        this.f121005x.mo110334a(this, f120978a[5], Boolean.valueOf(z));
    }

    public final RecyclerView getMScrollingChild() {
        return (RecyclerView) this.f120980A.getValue();
    }

    public final ViewConfiguration getMViewConfiguration() {
        return (ViewConfiguration) this.f120992k.getValue();
    }

    public final int getNestedScrollAxes() {
        return 0;
    }

    public final C52671b<Float, C52860x> getTranslationYUpdateListener() {
        return this.f120983D;
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
    public final void mo95462b() {
        m104341a(false, true);
    }

    private final boolean getMAnimating() {
        if (this.f120986d || this.f120987e) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo95463c() {
        this.f121004w = false;
        setMTouchScrollingChild(false);
        this.f121007z = false;
        this.f121003v = 0.0f;
    }

    /* renamed from: a */
    public final boolean mo95461a() {
        if (this.f120987e || (!this.f120986d && getTranslationY() < this.f120984b)) {
            return true;
        }
        return false;
    }

    public final void setOnCloseMetherListener(C52671b<? super String, C52860x> bVar) {
        this.f120991i = bVar;
    }

    public final void setShowStateChangedListener(C52671b<? super Boolean, C52860x> bVar) {
        this.f120990h = bVar;
    }

    public final void setTranslationYUpdateListener(C52671b<? super Float, C52860x> bVar) {
        this.f120983D = bVar;
    }

    public final void setVisibleChangedListener(C52671b<? super Boolean, C52860x> bVar) {
        this.f120989g = bVar;
    }

    public final void setMIsFocus(boolean z) {
        if (this.f120988f ^ z) {
            setFocusable(z);
            setFocusableInTouchMode(z);
            if (z) {
                requestFocus();
            } else {
                clearFocus();
            }
            this.f120988f = z;
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C52711k.m112240b(motionEvent, "ev");
        if (motionEvent.getActionMasked() == 0) {
            this.f120997p = getMAnimating();
        }
        if (this.f120997p && !getMAnimating() && motionEvent.getActionMasked() == 2) {
            motionEvent.setAction(0);
            this.f120997p = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void onStopNestedScroll(View view) {
        boolean z;
        C52711k.m112240b(view, "child");
        if (getTranslationY() * 2.0f >= this.f120984b) {
            C52671b<? super String, C52860x> bVar = this.f120991i;
            if (bVar != null) {
                bVar.invoke("slide_down");
            }
        }
        if (getTranslationY() * 2.0f < this.f120984b) {
            z = true;
        } else {
            z = false;
        }
        m104341a(z, false);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C52711k.m112240b(motionEvent, "event");
        if (motionEvent.getActionMasked() == 0) {
            mo95463c();
            this.f120998q = motionEvent.getX();
            this.f121000s = this.f120998q;
            this.f120999r = motionEvent.getY();
            this.f121001t = this.f120999r;
            this.f121002u = motionEvent.getRawY();
            getMVelocityTracker().clear();
            getMVelocityTracker().addMovement(motionEvent);
            View mPlaceholder = getMPlaceholder();
            C52711k.m112236a((Object) mPlaceholder, "mPlaceholder");
            this.f121007z = m104342a(mPlaceholder, motionEvent);
            RecyclerView mScrollingChild = getMScrollingChild();
            C52711k.m112236a((Object) mScrollingChild, "mScrollingChild");
            setMTouchScrollingChild(m104342a((View) mScrollingChild, motionEvent));
        }
        if (getMAnimating()) {
            return true;
        }
        if (getVisibility() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 3) {
            mo95463c();
        }
        if (motionEvent.getActionMasked() == 1) {
            mo95463c();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 2) {
                if (this.f121007z) {
                    return false;
                }
                float y = this.f121001t - motionEvent.getY();
                if (!getMTouchScrollingChild() && (this.f121004w || Math.abs(y) > ((float) getMTouchSlop()))) {
                    this.f121004w = true;
                    return true;
                }
            }
        } else if (this.f121007z) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        C52711k.m112240b(motionEvent, "event");
        switch (motionEvent.getActionMasked()) {
            case 1:
                VelocityTracker mVelocityTracker = getMVelocityTracker();
                mVelocityTracker.computeCurrentVelocity(1000, getMMaximumVelocity());
                boolean z2 = false;
                if (Math.abs(mVelocityTracker.getYVelocity()) > getMMinimumVelocity() && !getMAnimating()) {
                    if (this.f121003v < 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C52671b<? super String, C52860x> bVar = this.f120991i;
                    if (bVar != null) {
                        bVar.invoke("slide_down");
                    }
                    m104341a(z, false);
                    z2 = true;
                }
                if (!z2) {
                    onStopNestedScroll(this);
                }
                mo95463c();
                break;
            case 2:
                if (!getMTouchScrollingChild()) {
                    getMVelocityTracker().addMovement(motionEvent);
                    float x = this.f120998q - motionEvent.getX();
                    float y = this.f120999r - motionEvent.getY();
                    if (this.f121004w || Math.abs(y) > ((float) getMTouchSlop())) {
                        this.f121004w = true;
                        RecyclerView mScrollingChild = getMScrollingChild();
                        C52711k.m112236a((Object) mScrollingChild, "mScrollingChild");
                        onNestedPreScroll(mScrollingChild, (int) x, (int) y, new int[]{0, 0});
                    }
                    this.f121003v = motionEvent.getRawY() - this.f121002u;
                    this.f121002u = motionEvent.getRawY();
                    break;
                }
                break;
            case 3:
                onStopNestedScroll(this);
                mo95463c();
                break;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float measuredHeight = (float) getMeasuredHeight();
        View mPlaceholder = getMPlaceholder();
        C52711k.m112236a((Object) mPlaceholder, "mPlaceholder");
        this.f120984b = measuredHeight - ((float) mPlaceholder.getMeasuredHeight());
    }

    /* renamed from: a */
    private final boolean m104342a(View view, MotionEvent motionEvent) {
        if (view.getVisibility() != 0) {
            return false;
        }
        Rect rect = (Rect) f120977E.acquire();
        if (rect == null) {
            rect = new Rect();
        }
        C47924gn.m103692a((ViewGroup) this, view, rect);
        try {
            boolean contains = rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
            return contains;
        } finally {
            rect.setEmpty();
            f120977E.release(rect);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m104341a(boolean z, boolean z2) {
        float f;
        AnimatorListener animatorListener;
        if (!getMAnimating()) {
            float f2 = 0.0f;
            if (z) {
                f = 0.0f;
            } else {
                f = this.f120984b;
            }
            if (getTranslationY() == f) {
                if (!z || getVisibility() != 0) {
                    int i = 8;
                    if (z || getVisibility() != 8) {
                        if (z) {
                            i = 0;
                        }
                        setVisibility(i);
                        mo95463c();
                        if (z2) {
                            if (z) {
                                if (this.f120984b <= 0.0f) {
                                    f2 = C9432q.m18687b(C11010c.m22280a(), 500.0f);
                                } else {
                                    f2 = this.f120984b;
                                }
                            }
                            setTranslationY(f2);
                        }
                    }
                }
                return;
            }
            ViewPropertyAnimator updateListener = animate().translationY(f).setDuration(150).setInterpolator(new AccelerateDecelerateInterpolator()).setUpdateListener(new C48131c(this));
            if (z) {
                animatorListener = this.f120981B;
            } else {
                animatorListener = this.f120982C;
            }
            updateListener.setListener(animatorListener).start();
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
        if (f2 <= 0.0f) {
            C52671b<? super String, C52860x> bVar = this.f120991i;
            if (bVar != null) {
                bVar.invoke("slide_down");
            }
        }
        if (f2 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        m104341a(z, false);
        return true;
    }

    public BottomSheetNestedLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f120992k = C52732g.m112285a(new C48141l(context));
        this.f120993l = C52732g.m112285a(new C48139j(this));
        this.f120994m = C52732g.m112285a(new C48134f(this));
        this.f120995n = C52732g.m112285a(new C48133e(this));
        this.f120996o = C52732g.m112285a(C48140k.f121020a);
        Boolean valueOf = Boolean.valueOf(false);
        this.f121005x = new C48129a(valueOf, valueOf, this);
        this.f121006y = C52732g.m112285a(new C48135g(this));
        this.f120980A = C52732g.m112285a(new C48137h(this));
        this.f120981B = new C48138i(this);
        this.f120982C = new C48132d(this);
        setMIsFocus(true);
        setOnKeyListener(new OnKeyListener(this) {

            /* renamed from: a */
            final /* synthetic */ BottomSheetNestedLayout f121008a;

            {
                this.f121008a = r1;
            }

            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (!this.f121008a.mo95461a() || i != 4) {
                    return false;
                }
                C52671b<? super String, C52860x> bVar = this.f121008a.f120991i;
                if (bVar != null) {
                    bVar.invoke("press_back");
                }
                C52711k.m112236a((Object) keyEvent, "event");
                if (keyEvent.getAction() == 1) {
                    this.f121008a.mo95462b();
                }
                return true;
            }
        });
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        int i3;
        C52711k.m112240b(view, "target");
        C52711k.m112240b(iArr, "consumed");
        float translationY = getTranslationY();
        if (translationY > 0.0f) {
            float f = translationY - ((float) i2);
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > this.f120984b) {
                f = this.f120984b;
            }
            setTranslationY(f);
            C52671b<? super Float, C52860x> bVar = this.f120983D;
            if (bVar != null) {
                bVar.invoke(Float.valueOf(getTranslationY()));
            }
            if (getMTouchScrollingChild() && !this.f120985c) {
                iArr[1] = iArr[1] + i2;
            }
        } else if (translationY == 0.0f) {
            if (view instanceof C1053r) {
                i3 = ((C1053r) view).computeVerticalScrollOffset();
            } else {
                i3 = 0;
            }
            if (i2 < 0 && (i3 == 0 || !getMTouchScrollingChild())) {
                float f2 = translationY - ((float) i2);
                if (f2 > this.f120984b) {
                    f2 = this.f120984b;
                }
                setTranslationY(f2);
            }
        }
    }

    public /* synthetic */ BottomSheetNestedLayout(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
