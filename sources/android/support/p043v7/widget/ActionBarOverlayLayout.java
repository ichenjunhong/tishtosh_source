package android.support.p043v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p030v4.view.C1048m;
import android.support.p030v4.view.C1050o;
import android.support.p030v4.view.C1056u;
import android.support.p043v7.view.menu.C1262o.C1263a;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.Window.Callback;
import android.widget.OverScroller;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v7.widget.ActionBarOverlayLayout */
public class ActionBarOverlayLayout extends ViewGroup implements C1048m, C1504u {

    /* renamed from: g */
    static final int[] f4346g = {R.attr.d, 16842841};

    /* renamed from: A */
    private final Runnable f4347A;

    /* renamed from: B */
    private final C1050o f4348B;

    /* renamed from: a */
    ActionBarContainer f4349a;

    /* renamed from: b */
    public boolean f4350b;

    /* renamed from: c */
    public boolean f4351c;

    /* renamed from: d */
    boolean f4352d;

    /* renamed from: e */
    ViewPropertyAnimator f4353e;

    /* renamed from: f */
    final AnimatorListenerAdapter f4354f;

    /* renamed from: h */
    private int f4355h;

    /* renamed from: i */
    private int f4356i;

    /* renamed from: j */
    private ContentFrameLayout f4357j;

    /* renamed from: k */
    private C1505v f4358k;

    /* renamed from: l */
    private Drawable f4359l;

    /* renamed from: m */
    private boolean f4360m;

    /* renamed from: n */
    private boolean f4361n;

    /* renamed from: o */
    private int f4362o;

    /* renamed from: p */
    private int f4363p;

    /* renamed from: q */
    private final Rect f4364q;

    /* renamed from: r */
    private final Rect f4365r;

    /* renamed from: s */
    private final Rect f4366s;

    /* renamed from: t */
    private final Rect f4367t;

    /* renamed from: u */
    private final Rect f4368u;

    /* renamed from: v */
    private final Rect f4369v;

    /* renamed from: w */
    private final Rect f4370w;

    /* renamed from: x */
    private C1278a f4371x;

    /* renamed from: y */
    private OverScroller f4372y;

    /* renamed from: z */
    private final Runnable f4373z;

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$LayoutParams */
    public static class LayoutParams extends MarginLayoutParams {
        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(-1, -1);
        }
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$a */
    public interface C1278a {
        /* renamed from: b */
        void mo3790b(int i);

        /* renamed from: g */
        void mo3791g(boolean z);

        /* renamed from: h */
        void mo3792h();

        /* renamed from: i */
        void mo3794i();

        /* renamed from: j */
        void mo3795j();
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    public int getNestedScrollAxes() {
        return this.f4348B.f3334a;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo4371a();
    }

    /* renamed from: b */
    public final boolean mo4374b() {
        m3988i();
        return this.f4358k.mo5684f();
    }

    /* renamed from: c */
    public final boolean mo4375c() {
        m3988i();
        return this.f4358k.mo5685g();
    }

    /* renamed from: d */
    public final boolean mo4377d() {
        m3988i();
        return this.f4358k.mo5686h();
    }

    /* renamed from: e */
    public final boolean mo4379e() {
        m3988i();
        return this.f4358k.mo5687i();
    }

    /* renamed from: f */
    public final boolean mo4380f() {
        m3988i();
        return this.f4358k.mo5688j();
    }

    /* renamed from: g */
    public final void mo4382g() {
        m3988i();
        this.f4358k.mo5689k();
    }

    public int getActionBarHideOffset() {
        if (this.f4349a != null) {
            return -((int) this.f4349a.getTranslationY());
        }
        return 0;
    }

    public CharSequence getTitle() {
        m3988i();
        return this.f4358k.mo5682e();
    }

    /* renamed from: h */
    public final void mo4388h() {
        m3988i();
        this.f4358k.mo5690l();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo4371a() {
        removeCallbacks(this.f4373z);
        removeCallbacks(this.f4347A);
        if (this.f4353e != null) {
            this.f4353e.cancel();
        }
    }

    /* renamed from: i */
    private void m3988i() {
        if (this.f4357j == null) {
            this.f4357j = (ContentFrameLayout) findViewById(R.id.a5);
            this.f4349a = (ActionBarContainer) findViewById(R.id.a6);
            this.f4358k = m3985a(findViewById(R.id.a4));
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f4361n = z;
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m3986a(getContext());
        C1056u.m3072r(this);
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f4356i = i;
        if (this.f4371x != null) {
            this.f4371x.mo3790b(i);
        }
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f4351c) {
            this.f4351c = z;
            if (!z) {
                mo4371a();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        m3988i();
        this.f4358k.mo5668a(i);
    }

    public void setLogo(int i) {
        m3988i();
        this.f4358k.mo5677b(i);
    }

    public void setWindowCallback(Callback callback) {
        m3988i();
        this.f4358k.mo5673a(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        m3988i();
        this.f4358k.mo5674a(charSequence);
    }

    public void setActionBarHideOffset(int i) {
        mo4371a();
        this.f4349a.setTranslationY((float) (-Math.max(0, Math.min(i, this.f4349a.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C1278a aVar) {
        this.f4371x = aVar;
        if (getWindowToken() != null) {
            this.f4371x.mo3790b(this.f4356i);
            if (this.f4363p != 0) {
                onWindowSystemUiVisibilityChanged(this.f4363p);
                C1056u.m3072r(this);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        m3988i();
        this.f4358k.mo5669a(drawable);
    }

    public void setOverlayMode(boolean z) {
        boolean z2;
        this.f4350b = z;
        if (!z || getContext().getApplicationInfo().targetSdkVersion >= 19) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f4360m = z2;
    }

    /* renamed from: a */
    private static C1505v m3985a(View view) {
        if (view instanceof C1505v) {
            return (C1505v) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
        sb.append(view.getClass().getSimpleName());
        throw new IllegalStateException(sb.toString());
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f4359l != null && !this.f4360m) {
            if (this.f4349a.getVisibility() == 0) {
                i = (int) (((float) this.f4349a.getBottom()) + this.f4349a.getTranslationY() + 0.5f);
            } else {
                i = 0;
            }
            this.f4359l.setBounds(0, i, getWidth(), this.f4359l.getIntrinsicHeight() + i);
            this.f4359l.draw(canvas);
        }
    }

    public void onStopNestedScroll(View view) {
        if (this.f4351c && !this.f4352d) {
            if (this.f4362o <= this.f4349a.getHeight()) {
                mo4371a();
                postDelayed(this.f4373z, 600);
                return;
            }
            mo4371a();
            postDelayed(this.f4347A, 600);
        }
    }

    /* renamed from: a */
    private void m3986a(Context context) {
        boolean z;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f4346g);
        boolean z2 = false;
        this.f4355h = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f4359l = obtainStyledAttributes.getDrawable(1);
        if (this.f4359l == null) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.f4360m = z2;
        this.f4372y = new OverScroller(context);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        m3988i();
        C1056u.m3071q(this);
        boolean a = m3987a(this.f4349a, rect, true, true, false, true);
        this.f4367t.set(rect);
        C1467bj.m5137a(this, this.f4367t, this.f4364q);
        if (!this.f4368u.equals(this.f4367t)) {
            this.f4368u.set(this.f4367t);
            a = true;
        }
        if (!this.f4365r.equals(this.f4364q)) {
            this.f4365r.set(this.f4364q);
            a = true;
        }
        if (a) {
            requestLayout();
        }
        return true;
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        if (VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        m3988i();
        int i2 = this.f4363p ^ i;
        this.f4363p = i;
        boolean z2 = false;
        if ((i & 4) == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0) {
            z2 = true;
        }
        if (this.f4371x != null) {
            this.f4371x.mo3791g(!z2);
            if (z || !z2) {
                this.f4371x.mo3792h();
            } else {
                this.f4371x.mo3794i();
            }
        }
        if ((i2 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0 && this.f4371x != null) {
            C1056u.m3072r(this);
        }
    }

    /* renamed from: a */
    public final void mo4372a(int i) {
        m3988i();
        if (!(i == 2 || i == 5 || i != 109)) {
            setOverlayMode(true);
        }
    }

    /* renamed from: a */
    public final void mo4373a(Menu menu, C1263a aVar) {
        m3988i();
        this.f4358k.mo5672a(menu, aVar);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4364q = new Rect();
        this.f4365r = new Rect();
        this.f4366s = new Rect();
        this.f4367t = new Rect();
        this.f4368u = new Rect();
        this.f4369v = new Rect();
        this.f4370w = new Rect();
        this.f4354f = new AnimatorListenerAdapter() {
            public final void onAnimationCancel(Animator animator) {
                ActionBarOverlayLayout.this.f4353e = null;
                ActionBarOverlayLayout.this.f4352d = false;
            }

            public final void onAnimationEnd(Animator animator) {
                ActionBarOverlayLayout.this.f4353e = null;
                ActionBarOverlayLayout.this.f4352d = false;
            }
        };
        this.f4373z = new Runnable() {
            public final void run() {
                ActionBarOverlayLayout.this.mo4371a();
                ActionBarOverlayLayout.this.f4353e = ActionBarOverlayLayout.this.f4349a.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f4354f);
            }
        };
        this.f4347A = new Runnable() {
            public final void run() {
                ActionBarOverlayLayout.this.mo4371a();
                ActionBarOverlayLayout.this.f4353e = ActionBarOverlayLayout.this.f4349a.animate().translationY((float) (-ActionBarOverlayLayout.this.f4349a.getHeight())).setListener(ActionBarOverlayLayout.this.f4354f);
            }
        };
        m3986a(context);
        this.f4348B = new C1050o(this);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        m3988i();
        measureChildWithMargins(this.f4349a, i, 0, i2, 0);
        LayoutParams layoutParams = (LayoutParams) this.f4349a.getLayoutParams();
        int max = Math.max(0, this.f4349a.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
        int max2 = Math.max(0, this.f4349a.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f4349a.getMeasuredState());
        if ((C1056u.m3071q(this) & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i3 = this.f4355h;
            if (this.f4361n && this.f4349a.getTabContainer() != null) {
                i3 += this.f4355h;
            }
        } else {
            i3 = this.f4349a.getVisibility() != 8 ? this.f4349a.getMeasuredHeight() : 0;
        }
        this.f4366s.set(this.f4364q);
        this.f4369v.set(this.f4367t);
        if (this.f4350b || z) {
            this.f4369v.top += i3;
            this.f4369v.bottom += 0;
        } else {
            this.f4366s.top += i3;
            this.f4366s.bottom += 0;
        }
        m3987a(this.f4357j, this.f4366s, true, true, true, true);
        if (!this.f4370w.equals(this.f4369v)) {
            this.f4370w.set(this.f4369v);
            this.f4357j.mo4649a(this.f4369v);
        }
        measureChildWithMargins(this.f4357j, i, 0, i2, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.f4357j.getLayoutParams();
        int max3 = Math.max(max, this.f4357j.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
        int max4 = Math.max(max2, this.f4357j.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f4357j.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f4348B.mo3236a(view, view2, i);
        this.f4362o = getActionBarHideOffset();
        mo4371a();
        if (this.f4371x != null) {
            this.f4371x.mo3795j();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f4349a.getVisibility() != 0) {
            return false;
        }
        return this.f4351c;
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        boolean z2 = false;
        if (!this.f4351c || !z) {
            return false;
        }
        this.f4372y.fling(0, 0, 0, (int) f2, 0, 0, DynamicTabYellowPointVersion.DEFAULT, Integer.MAX_VALUE);
        if (this.f4372y.getFinalY() > this.f4349a.getHeight()) {
            z2 = true;
        }
        if (z2) {
            mo4371a();
            this.f4347A.run();
        } else {
            mo4371a();
            this.f4373z.run();
        }
        this.f4352d = true;
        return true;
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.f4362o += i2;
        setActionBarHideOffset(this.f4362o);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int i6 = layoutParams.leftMargin + paddingLeft;
                int i7 = layoutParams.topMargin + paddingTop;
                childAt.layout(i6, i7, childAt.getMeasuredWidth() + i6, childAt.getMeasuredHeight() + i7);
            }
        }
    }

    /* renamed from: a */
    private static boolean m3987a(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.leftMargin != rect.left) {
            layoutParams.leftMargin = rect.left;
            z5 = true;
        } else {
            z5 = false;
        }
        if (layoutParams.topMargin != rect.top) {
            layoutParams.topMargin = rect.top;
            z5 = true;
        }
        if (layoutParams.rightMargin != rect.right) {
            layoutParams.rightMargin = rect.right;
            z5 = true;
        }
        if (!z3 || layoutParams.bottomMargin == rect.bottom) {
            return z5;
        }
        layoutParams.bottomMargin = rect.bottom;
        return true;
    }
}
