package com.p683ss.android.ugc.aweme.comment.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.support.p030v4.p038f.C0795l.C0798c;
import android.support.p030v4.view.C1045j;
import android.support.p030v4.view.C1048m;
import android.support.p030v4.view.C1053r;
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
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.adaptation.C22453b;
import com.p683ss.android.ugc.aweme.app.p1372c.C23059a;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.experiment.ShrinkVideoWhenCommentShowExperiment;
import com.p683ss.android.ugc.aweme.feed.C29984ac;
import com.p683ss.android.ugc.aweme.utils.C47924gn;
import com.p683ss.android.ugc.aweme.views.FpsRecyclerView;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
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

/* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout */
public final class CommentNestedLayout extends LinearLayout implements C1048m {

    /* renamed from: L */
    private static final C0798c<Rect> f67196L = new C0798c<>(12);

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f67197a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentNestedLayout.class), "mViewConfiguration", "getMViewConfiguration()Landroid/view/ViewConfiguration;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentNestedLayout.class), "mTouchSlop", "getMTouchSlop()I")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentNestedLayout.class), "mMinimumVelocity", "getMMinimumVelocity()F")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentNestedLayout.class), "mMaximumVelocity", "getMMaximumVelocity()F")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentNestedLayout.class), "mVelocityTracker", "getMVelocityTracker()Landroid/view/VelocityTracker;")), C52728w.m112247a((C52714n) new C52715o(C52728w.m112245a(CommentNestedLayout.class), "mTouchScrollingChild", "getMTouchScrollingChild()Z")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentNestedLayout.class), "mPlaceholder", "getMPlaceholder()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentNestedLayout.class), "mCommentBgContainer", "getMCommentBgContainer()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentNestedLayout.class), "mCommentContainer", "getMCommentContainer()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentNestedLayout.class), "mCommentListContainer", "getMCommentListContainer()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentNestedLayout.class), "mScrollingChild", "getMScrollingChild()Lcom/ss/android/ugc/aweme/views/FpsRecyclerView;"))};

    /* renamed from: i */
    public static final C25410b f67198i = new C25410b(null);

    /* renamed from: A */
    private final C52668f f67199A;

    /* renamed from: B */
    private final C52668f f67200B;

    /* renamed from: C */
    private final C52668f f67201C;

    /* renamed from: D */
    private boolean f67202D;

    /* renamed from: E */
    private final C52668f f67203E;

    /* renamed from: F */
    private C52671b<? super Boolean, C52860x> f67204F;

    /* renamed from: G */
    private final C25420k f67205G;

    /* renamed from: H */
    private final C25414f f67206H;

    /* renamed from: I */
    private final boolean f67207I;

    /* renamed from: J */
    private int f67208J;

    /* renamed from: K */
    private int f67209K;

    /* renamed from: b */
    public float f67210b;

    /* renamed from: c */
    public C29984ac f67211c;

    /* renamed from: d */
    public boolean f67212d;

    /* renamed from: e */
    public boolean f67213e;

    /* renamed from: f */
    public boolean f67214f;

    /* renamed from: g */
    public boolean f67215g;

    /* renamed from: h */
    public C52671b<? super Boolean, C52860x> f67216h;

    /* renamed from: j */
    private final C52668f f67217j;

    /* renamed from: k */
    private final C52668f f67218k;

    /* renamed from: l */
    private final C52668f f67219l;

    /* renamed from: m */
    private final C52668f f67220m;

    /* renamed from: n */
    private final C52668f f67221n;

    /* renamed from: o */
    private boolean f67222o;

    /* renamed from: p */
    private float f67223p;

    /* renamed from: q */
    private float f67224q;

    /* renamed from: r */
    private float f67225r;

    /* renamed from: s */
    private float f67226s;

    /* renamed from: t */
    private float f67227t;

    /* renamed from: u */
    private float f67228u;

    /* renamed from: v */
    private boolean f67229v;

    /* renamed from: w */
    private ObjectAnimator f67230w;

    /* renamed from: x */
    private boolean f67231x;

    /* renamed from: y */
    private final C52738b f67232y;

    /* renamed from: z */
    private final C52668f f67233z;

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$a */
    public static final class C25409a extends C52737a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Object f67235a;

        /* renamed from: b */
        final /* synthetic */ CommentNestedLayout f67236b;

        public C25409a(Object obj, Object obj2, CommentNestedLayout commentNestedLayout) {
            this.f67235a = obj;
            this.f67236b = commentNestedLayout;
            super(obj2);
        }

        /* renamed from: a */
        public final void mo52013a(C52767h<?> hVar, Boolean bool, Boolean bool2) {
            boolean z;
            C52711k.m112240b(hVar, "property");
            if (bool2.booleanValue() ^ bool.booleanValue()) {
                CommentNestedLayout commentNestedLayout = this.f67236b;
                if (this.f67236b.getMScrollingChild().computeVerticalScrollExtent() >= this.f67236b.getMScrollingChild().computeVerticalScrollRange()) {
                    z = true;
                } else {
                    z = false;
                }
                commentNestedLayout.f67212d = z;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$b */
    public static final class C25410b {
        private C25410b() {
        }

        public /* synthetic */ C25410b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$c */
    static final class C25411c extends C52712l implements C52670a<View> {

        /* renamed from: a */
        final /* synthetic */ CommentNestedLayout f67237a;

        C25411c(CommentNestedLayout commentNestedLayout) {
            this.f67237a = commentNestedLayout;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.f67237a.findViewById(R.id.ags);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$d */
    static final class C25412d extends C52712l implements C52670a<View> {

        /* renamed from: a */
        final /* synthetic */ CommentNestedLayout f67238a;

        C25412d(CommentNestedLayout commentNestedLayout) {
            this.f67238a = commentNestedLayout;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.f67238a.findViewById(R.id.e93);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$e */
    static final class C25413e extends C52712l implements C52670a<View> {

        /* renamed from: a */
        final /* synthetic */ CommentNestedLayout f67239a;

        C25413e(CommentNestedLayout commentNestedLayout) {
            this.f67239a = commentNestedLayout;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.f67239a.findViewById(R.id.ekg);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$f */
    public static final class C25414f implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ CommentNestedLayout f67240a;

        public final void onAnimationRepeat(Animator animator) {
        }

        C25414f(CommentNestedLayout commentNestedLayout) {
            this.f67240a = commentNestedLayout;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f67240a.f67213e = false;
            this.f67240a.mo51991d();
            this.f67240a.setMIsFocus(false);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f67240a.f67213e = false;
            this.f67240a.setVisibility(8);
            this.f67240a.mo51991d();
            this.f67240a.setMIsFocus(false);
        }

        public final void onAnimationStart(Animator animator) {
            if (this.f67240a.f67214f || (!this.f67240a.f67213e && this.f67240a.getTranslationY() <= this.f67240a.f67210b)) {
                C52671b<? super Boolean, C52860x> bVar = this.f67240a.f67216h;
                if (bVar != null) {
                    bVar.invoke(Boolean.valueOf(false));
                }
            }
            this.f67240a.f67213e = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$g */
    static final class C25415g extends C52712l implements C52670a<Float> {

        /* renamed from: a */
        final /* synthetic */ CommentNestedLayout f67241a;

        C25415g(CommentNestedLayout commentNestedLayout) {
            this.f67241a = commentNestedLayout;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ViewConfiguration mViewConfiguration = this.f67241a.getMViewConfiguration();
            C52711k.m112236a((Object) mViewConfiguration, "mViewConfiguration");
            return Float.valueOf((float) mViewConfiguration.getScaledMaximumFlingVelocity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$h */
    static final class C25416h extends C52712l implements C52670a<Float> {

        /* renamed from: a */
        final /* synthetic */ CommentNestedLayout f67242a;

        C25416h(CommentNestedLayout commentNestedLayout) {
            this.f67242a = commentNestedLayout;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ViewConfiguration mViewConfiguration = this.f67242a.getMViewConfiguration();
            C52711k.m112236a((Object) mViewConfiguration, "mViewConfiguration");
            return Float.valueOf((float) mViewConfiguration.getScaledMinimumFlingVelocity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$i */
    static final class C25417i extends C52712l implements C52670a<View> {

        /* renamed from: a */
        final /* synthetic */ CommentNestedLayout f67243a;

        /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$i$a */
        static final class C25418a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C25417i f67244a;

            C25418a(C25417i iVar) {
                this.f67244a = iVar;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f67244a.f67243a.mo51990c();
            }
        }

        C25417i(CommentNestedLayout commentNestedLayout) {
            this.f67243a = commentNestedLayout;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View findViewById = this.f67243a.findViewById(R.id.xe);
            findViewById.setOnClickListener(new C25418a(this));
            return findViewById;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$j */
    static final class C25419j extends C52712l implements C52670a<FpsRecyclerView> {

        /* renamed from: a */
        final /* synthetic */ CommentNestedLayout f67245a;

        C25419j(CommentNestedLayout commentNestedLayout) {
            this.f67245a = commentNestedLayout;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (FpsRecyclerView) this.f67245a.findViewById(R.id.ca3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$k */
    public static final class C25420k implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ CommentNestedLayout f67246a;

        public final void onAnimationRepeat(Animator animator) {
        }

        C25420k(CommentNestedLayout commentNestedLayout) {
            this.f67246a = commentNestedLayout;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f67246a.f67214f = false;
            this.f67246a.mo51991d();
            this.f67246a.setMIsFocus(true);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f67246a.f67214f = false;
            this.f67246a.mo51991d();
            this.f67246a.setMIsFocus(true);
        }

        public final void onAnimationStart(Animator animator) {
            if (!this.f67246a.mo51988a()) {
                C52671b<? super Boolean, C52860x> bVar = this.f67246a.f67216h;
                if (bVar != null) {
                    bVar.invoke(Boolean.valueOf(true));
                }
            }
            this.f67246a.setVisibility(0);
            this.f67246a.f67214f = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$l */
    static final class C25421l extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        final /* synthetic */ CommentNestedLayout f67247a;

        C25421l(CommentNestedLayout commentNestedLayout) {
            this.f67247a = commentNestedLayout;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ViewConfiguration mViewConfiguration = this.f67247a.getMViewConfiguration();
            C52711k.m112236a((Object) mViewConfiguration, "mViewConfiguration");
            return Integer.valueOf(mViewConfiguration.getScaledTouchSlop());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$m */
    static final class C25422m extends C52712l implements C52670a<VelocityTracker> {

        /* renamed from: a */
        public static final C25422m f67248a = new C25422m();

        C25422m() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return VelocityTracker.obtain();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$n */
    static final class C25423n extends C52712l implements C52670a<ViewConfiguration> {

        /* renamed from: a */
        final /* synthetic */ Context f67249a;

        C25423n(Context context) {
            this.f67249a = context;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ViewConfiguration.get(this.f67249a);
        }
    }

    public CommentNestedLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public CommentNestedLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final View getMCommentBgContainer() {
        return (View) this.f67199A.getValue();
    }

    private final View getMCommentContainer() {
        return (View) this.f67200B.getValue();
    }

    private final View getMCommentListContainer() {
        return (View) this.f67201C.getValue();
    }

    private final float getMMaximumVelocity() {
        return ((Number) this.f67220m.getValue()).floatValue();
    }

    private final float getMMinimumVelocity() {
        return ((Number) this.f67219l.getValue()).floatValue();
    }

    private final View getMPlaceholder() {
        return (View) this.f67233z.getValue();
    }

    private final boolean getMTouchScrollingChild() {
        return ((Boolean) this.f67232y.mo110333a(this, f67197a[5])).booleanValue();
    }

    private final int getMTouchSlop() {
        return ((Number) this.f67218k.getValue()).intValue();
    }

    private final VelocityTracker getMVelocityTracker() {
        return (VelocityTracker) this.f67221n.getValue();
    }

    private final void setMTouchScrollingChild(boolean z) {
        this.f67232y.mo110334a(this, f67197a[5], Boolean.valueOf(z));
    }

    public final boolean getBackFromVideo() {
        return this.f67231x;
    }

    public final boolean getHaveBangs() {
        return this.f67207I;
    }

    public final int getHeightOffset() {
        return this.f67209K;
    }

    public final C29984ac getMOnShowHeightChangeListener() {
        return this.f67211c;
    }

    public final FpsRecyclerView getMScrollingChild() {
        return (FpsRecyclerView) this.f67203E.getValue();
    }

    public final ViewConfiguration getMViewConfiguration() {
        return (ViewConfiguration) this.f67217j.getValue();
    }

    public final int getNestedScrollAxes() {
        return 0;
    }

    public final int getNotchHeight() {
        return this.f67208J;
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
    public final void mo51989b() {
        m61822a(true, true);
    }

    private final boolean getMAnimating() {
        if (this.f67213e || this.f67214f) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo51990c() {
        if (!this.f67231x) {
            m61822a(false, true);
        } else {
            this.f67231x = false;
        }
    }

    /* renamed from: d */
    public final void mo51991d() {
        this.f67229v = false;
        setMTouchScrollingChild(false);
        this.f67202D = false;
        this.f67228u = 0.0f;
    }

    /* renamed from: a */
    public final boolean mo51988a() {
        if (this.f67214f || (!this.f67213e && getTranslationY() < this.f67210b)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (C10181b.m20511a().mo18172a(ShrinkVideoWhenCommentShowExperiment.class, true, "enable_comment_video_shrink", 31744, false)) {
            View mCommentBgContainer = getMCommentBgContainer();
            C52711k.m112236a((Object) mCommentBgContainer, "mCommentBgContainer");
            LayoutParams layoutParams = mCommentBgContainer.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -1;
                View mCommentListContainer = getMCommentListContainer();
                C52711k.m112236a((Object) mCommentListContainer, "mCommentListContainer");
                LayoutParams layoutParams2 = mCommentListContainer.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = -1;
                    View mPlaceholder = getMPlaceholder();
                    C52711k.m112236a((Object) mPlaceholder, "mPlaceholder");
                    LayoutParams layoutParams3 = mPlaceholder.getLayoutParams();
                    if (layoutParams3 != null) {
                        ((LinearLayout.LayoutParams) layoutParams3).weight = 0.0f;
                        View mCommentContainer = getMCommentContainer();
                        C52711k.m112236a((Object) mCommentContainer, "mCommentContainer");
                        LayoutParams layoutParams4 = mCommentContainer.getLayoutParams();
                        if (layoutParams4 != null) {
                            ((LinearLayout.LayoutParams) layoutParams4).height = 0;
                            View mCommentContainer2 = getMCommentContainer();
                            C52711k.m112236a((Object) mCommentContainer2, "mCommentContainer");
                            LayoutParams layoutParams5 = mCommentContainer2.getLayoutParams();
                            if (layoutParams5 != null) {
                                ((LinearLayout.LayoutParams) layoutParams5).weight = 1.0f;
                                if (this.f67207I) {
                                    View mPlaceholder2 = getMPlaceholder();
                                    C52711k.m112236a((Object) mPlaceholder2, "mPlaceholder");
                                    mPlaceholder2.getLayoutParams().height = (int) (((float) this.f67208J) + (((float) C9432q.m18670a(C11010c.m22280a())) / 1.7777778f));
                                } else {
                                    float b = ((float) C9432q.m18688b(C11010c.m22280a())) - C9432q.m18687b(C11010c.m22280a(), 52.0f);
                                    View mPlaceholder3 = getMPlaceholder();
                                    C52711k.m112236a((Object) mPlaceholder3, "mPlaceholder");
                                    mPlaceholder3.getLayoutParams().height = ((int) (b / 4.0f)) + C22453b.m55511d();
                                }
                                View mPlaceholder4 = getMPlaceholder();
                                C52711k.m112236a((Object) mPlaceholder4, "mPlaceholder");
                                LayoutParams layoutParams6 = mPlaceholder4.getLayoutParams();
                                layoutParams6.height -= this.f67209K;
                                return;
                            }
                            throw new C52857u("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        }
                        throw new C52857u("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    }
                    throw new C52857u("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
                throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    public final void setBackFromVideo(boolean z) {
        this.f67231x = z;
    }

    public final void setHeightOffset(int i) {
        this.f67209K = i;
    }

    public final void setMOnShowHeightChangeListener(C29984ac acVar) {
        this.f67211c = acVar;
    }

    public final void setNotchHeight(int i) {
        this.f67208J = i;
    }

    public final void setPreScrollChangeListener(C52671b<? super Boolean, C52860x> bVar) {
        this.f67204F = bVar;
    }

    public final void setVisibleChangedListener(C52671b<? super Boolean, C52860x> bVar) {
        this.f67216h = bVar;
    }

    public final void onStopNestedScroll(View view) {
        boolean z;
        C52711k.m112240b(view, "child");
        if (getTranslationY() * 2.0f < this.f67210b) {
            z = true;
        } else {
            z = false;
        }
        m61822a(z, false);
    }

    public final void setMIsFocus(boolean z) {
        if (this.f67215g ^ z) {
            setFocusable(z);
            setFocusableInTouchMode(z);
            if (z) {
                requestFocus();
            } else {
                clearFocus();
            }
            this.f67215g = z;
        }
    }

    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        C29984ac acVar = this.f67211c;
        if (acVar != null) {
            acVar.mo60169a(this.f67210b - f, this.f67210b);
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C52711k.m112240b(motionEvent, "ev");
        if (motionEvent.getActionMasked() == 0) {
            this.f67222o = getMAnimating();
        }
        if (this.f67222o && !getMAnimating() && motionEvent.getActionMasked() == 2) {
            motionEvent.setAction(0);
            this.f67222o = false;
        }
        if (getVisibility() == 8) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public final void mo51987a(boolean z) {
        if (z && mo51988a()) {
            C52671b<? super Boolean, C52860x> bVar = this.f67216h;
            if (bVar != null) {
                bVar.invoke(Boolean.valueOf(false));
            }
        }
        ObjectAnimator objectAnimator = this.f67230w;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            ObjectAnimator objectAnimator2 = this.f67230w;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
        }
        setVisibility(8);
        if (this.f67210b > 0.0f) {
            setTranslationY(this.f67210b);
        }
        mo51991d();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C52711k.m112240b(motionEvent, "event");
        if (motionEvent.getActionMasked() == 0) {
            mo51991d();
            this.f67223p = motionEvent.getX();
            this.f67225r = this.f67223p;
            this.f67224q = motionEvent.getY();
            this.f67226s = this.f67224q;
            this.f67227t = motionEvent.getRawY();
            getMVelocityTracker().clear();
            getMVelocityTracker().addMovement(motionEvent);
            View mPlaceholder = getMPlaceholder();
            C52711k.m112236a((Object) mPlaceholder, "mPlaceholder");
            this.f67202D = m61823a(mPlaceholder, motionEvent);
            FpsRecyclerView mScrollingChild = getMScrollingChild();
            C52711k.m112236a((Object) mScrollingChild, "mScrollingChild");
            setMTouchScrollingChild(m61823a((View) mScrollingChild, motionEvent));
        }
        if (getMAnimating()) {
            return true;
        }
        if (getVisibility() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 3) {
            mo51991d();
        }
        if (motionEvent.getActionMasked() == 1) {
            mo51991d();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 2) {
                if (this.f67202D) {
                    return false;
                }
                float y = this.f67226s - motionEvent.getY();
                if (!getMTouchScrollingChild() && (this.f67229v || Math.abs(y) > ((float) getMTouchSlop()))) {
                    this.f67229v = true;
                    return true;
                }
            }
        } else if (this.f67202D) {
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
                    if (this.f67228u < 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    m61822a(z, false);
                    z2 = true;
                }
                if (!z2) {
                    onStopNestedScroll(this);
                }
                mo51991d();
                break;
            case 2:
                if (!getMTouchScrollingChild()) {
                    getMVelocityTracker().addMovement(motionEvent);
                    float x = this.f67223p - motionEvent.getX();
                    float y = this.f67224q - motionEvent.getY();
                    if (this.f67229v || Math.abs(y) > ((float) getMTouchSlop())) {
                        this.f67229v = true;
                        FpsRecyclerView mScrollingChild = getMScrollingChild();
                        C52711k.m112236a((Object) mScrollingChild, "mScrollingChild");
                        onNestedPreScroll(mScrollingChild, (int) x, (int) y, new int[]{0, 0});
                        C52671b<? super Boolean, C52860x> bVar = this.f67204F;
                        if (bVar != null) {
                            bVar.invoke(Boolean.valueOf(true));
                        }
                    }
                    this.f67228u = motionEvent.getRawY() - this.f67227t;
                    this.f67227t = motionEvent.getRawY();
                    break;
                }
                break;
            case 3:
                onStopNestedScroll(this);
                mo51991d();
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
        this.f67210b = measuredHeight - ((float) mPlaceholder.getMeasuredHeight());
    }

    /* renamed from: a */
    private final boolean m61823a(View view, MotionEvent motionEvent) {
        if (view.getVisibility() != 0) {
            return false;
        }
        Rect rect = (Rect) f67196L.acquire();
        if (rect == null) {
            rect = new Rect();
        }
        C47924gn.m103692a((ViewGroup) this, view, rect);
        try {
            boolean contains = rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
            return contains;
        } finally {
            rect.setEmpty();
            f67196L.release(rect);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m61822a(boolean z, boolean z2) {
        float f;
        long j;
        AnimatorListener animatorListener;
        if (!getMAnimating()) {
            float f2 = 0.0f;
            if (z) {
                f = 0.0f;
            } else {
                f = this.f67210b;
            }
            if (getTranslationY() == f) {
                if (!z || getVisibility() != 0) {
                    int i = 8;
                    if (z || getVisibility() != 8) {
                        if (z) {
                            i = 0;
                        }
                        setVisibility(i);
                        mo51991d();
                        if (z2) {
                            if (z) {
                                if (this.f67210b <= 0.0f) {
                                    f2 = (float) C23728o.m58241a(500.0d);
                                } else {
                                    f2 = this.f67210b;
                                }
                            }
                            setTranslationY(f2);
                        }
                    }
                }
                return;
            }
            if (C10181b.m20511a().mo18172a(ShrinkVideoWhenCommentShowExperiment.class, true, "enable_comment_video_shrink", 31744, false)) {
                j = 300;
            } else {
                j = 150;
            }
            ObjectAnimator objectAnimator = this.f67230w;
            if (objectAnimator != null && objectAnimator.isRunning()) {
                ObjectAnimator objectAnimator2 = this.f67230w;
                if (objectAnimator2 != null) {
                    objectAnimator2.cancel();
                }
            }
            this.f67230w = ObjectAnimator.ofFloat(this, View.TRANSLATION_Y, new float[]{getTranslationY(), f});
            ObjectAnimator objectAnimator3 = this.f67230w;
            if (objectAnimator3 == null) {
                C52711k.m112234a();
            }
            objectAnimator3.setDuration(j);
            ObjectAnimator objectAnimator4 = this.f67230w;
            if (objectAnimator4 == null) {
                C52711k.m112234a();
            }
            objectAnimator4.setInterpolator(new AccelerateDecelerateInterpolator());
            ObjectAnimator objectAnimator5 = this.f67230w;
            if (objectAnimator5 == null) {
                C52711k.m112234a();
            }
            if (z) {
                animatorListener = this.f67205G;
            } else {
                animatorListener = this.f67206H;
            }
            objectAnimator5.addListener(animatorListener);
            ObjectAnimator objectAnimator6 = this.f67230w;
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
        m61822a(z, false);
        return true;
    }

    public CommentNestedLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f67217j = C52732g.m112285a(new C25423n(context));
        this.f67218k = C52732g.m112285a(new C25421l(this));
        this.f67219l = C52732g.m112285a(new C25416h(this));
        this.f67220m = C52732g.m112285a(new C25415g(this));
        this.f67221n = C52732g.m112285a(C25422m.f67248a);
        boolean z = false;
        Boolean valueOf = Boolean.valueOf(false);
        this.f67232y = new C25409a(valueOf, valueOf, this);
        this.f67233z = C52732g.m112285a(new C25417i(this));
        this.f67199A = C52732g.m112285a(new C25411c(this));
        this.f67200B = C52732g.m112285a(new C25412d(this));
        this.f67201C = C52732g.m112285a(new C25413e(this));
        this.f67203E = C52732g.m112285a(new C25419j(this));
        this.f67205G = new C25420k(this);
        this.f67206H = new C25414f(this);
        setMIsFocus(true);
        setOnKeyListener(new OnKeyListener(this) {

            /* renamed from: a */
            final /* synthetic */ CommentNestedLayout f67234a;

            {
                this.f67234a = r1;
            }

            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (!this.f67234a.mo51988a() || i != 4) {
                    return false;
                }
                C52711k.m112236a((Object) keyEvent, "event");
                if (keyEvent.getAction() == 1) {
                    this.f67234a.mo51990c();
                }
                return true;
            }
        });
        if (C23059a.m56592a(getContext()) && C22453b.m55511d() == 0) {
            z = true;
        }
        this.f67207I = z;
        this.f67208J = C22453b.m55512d(context);
        this.f67209K = C23728o.m58241a(8.0d);
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
            if (f > this.f67210b) {
                f = this.f67210b;
            }
            setTranslationY(f);
            if (getMTouchScrollingChild() && !this.f67212d) {
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
                if (f2 > this.f67210b) {
                    f2 = this.f67210b;
                }
                setTranslationY(f2);
            }
        }
    }

    public /* synthetic */ CommentNestedLayout(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
