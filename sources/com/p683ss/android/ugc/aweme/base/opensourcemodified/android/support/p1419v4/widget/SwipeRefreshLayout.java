package com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.p030v4.content.C0726c;
import android.support.p030v4.view.C1044i;
import android.support.p030v4.view.C1045j;
import android.support.p030v4.view.C1047l;
import android.support.p030v4.view.C1048m;
import android.support.p030v4.view.C1050o;
import android.support.p030v4.view.C1056u;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;

/* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout */
public class SwipeRefreshLayout extends ViewGroup implements C1045j, C1048m, C23600b {

    /* renamed from: G */
    private static final int[] f62742G = {16842766};

    /* renamed from: n */
    private static final String f62743n = "SwipeRefreshLayout";

    /* renamed from: o */
    private static final String f62744o = "SwipeRefreshLayout";

    /* renamed from: A */
    private float f62745A;

    /* renamed from: B */
    private float f62746B;

    /* renamed from: C */
    private boolean f62747C;

    /* renamed from: D */
    private int f62748D;

    /* renamed from: E */
    private boolean f62749E;

    /* renamed from: F */
    private final DecelerateInterpolator f62750F;

    /* renamed from: H */
    private int f62751H;

    /* renamed from: I */
    private Animation f62752I;

    /* renamed from: J */
    private Animation f62753J;

    /* renamed from: K */
    private Animation f62754K;

    /* renamed from: L */
    private Animation f62755L;

    /* renamed from: M */
    private Animation f62756M;

    /* renamed from: N */
    private int f62757N;

    /* renamed from: O */
    private C23595a f62758O;

    /* renamed from: P */
    private AnimationListener f62759P;

    /* renamed from: Q */
    private final Animation f62760Q;

    /* renamed from: R */
    private final Animation f62761R;

    /* renamed from: a */
    C23596b f62762a;

    /* renamed from: b */
    boolean f62763b;

    /* renamed from: c */
    int f62764c;

    /* renamed from: d */
    boolean f62765d;

    /* renamed from: e */
    C23598a f62766e;

    /* renamed from: f */
    protected int f62767f;

    /* renamed from: g */
    float f62768g;

    /* renamed from: h */
    protected int f62769h;

    /* renamed from: i */
    int f62770i;

    /* renamed from: j */
    C23601c f62771j;

    /* renamed from: k */
    boolean f62772k;

    /* renamed from: l */
    boolean f62773l;

    /* renamed from: m */
    C23606d f62774m;

    /* renamed from: p */
    private View f62775p;

    /* renamed from: q */
    private int f62776q;

    /* renamed from: r */
    private float f62777r;

    /* renamed from: s */
    private boolean f62778s;

    /* renamed from: t */
    private float f62779t;

    /* renamed from: u */
    private final C1050o f62780u;

    /* renamed from: v */
    private final C1047l f62781v;

    /* renamed from: w */
    private final int[] f62782w;

    /* renamed from: x */
    private final int[] f62783x;

    /* renamed from: y */
    private boolean f62784y;

    /* renamed from: z */
    private int f62785z;

    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout$a */
    public interface C23595a {
        /* renamed from: a */
        boolean mo48826a(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout$b */
    public interface C23596b {
        /* renamed from: a */
        void mo47048a();
    }

    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout$c */
    public interface C23597c {
    }

    /* renamed from: a */
    public final boolean mo48780a() {
        return this.f62763b;
    }

    public int getProgressCircleDiameter() {
        return this.f62757N;
    }

    public int getProgressViewEndOffset() {
        return this.f62770i;
    }

    public int getProgressViewStartOffset() {
        return this.f62769h;
    }

    public void setOnSwipeChangeListener(C23597c cVar) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo48778a(AnimationListener animationListener) {
        this.f62753J = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
            }
        };
        this.f62753J.setDuration(150);
        this.f62766e.mo48827a(animationListener);
        this.f62766e.clearAnimation();
        this.f62766e.startAnimation(this.f62753J);
    }

    public int getNestedScrollAxes() {
        return this.f62780u.f3334a;
    }

    public boolean hasNestedScrollingParent() {
        return this.f62781v.mo3222a();
    }

    public boolean isNestedScrollingEnabled() {
        return this.f62781v.f3329a;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo48781b();
    }

    public void stopNestedScroll() {
        this.f62781v.mo3231b();
    }

    /* renamed from: c */
    private static boolean m57825c() {
        if (VERSION.SDK_INT < 11) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m57826d() {
        this.f62754K = m57816a(this.f62771j.getAlpha(), 76);
    }

    /* renamed from: e */
    private void m57828e() {
        this.f62755L = m57816a(this.f62771j.getAlpha(), (int) NormalGiftView.ALPHA_255);
    }

    /* renamed from: f */
    private void m57829f() {
        if (this.f62775p == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f62766e)) {
                    this.f62775p = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    private boolean m57830g() {
        if (this.f62758O != null) {
            return this.f62758O.mo48826a(this, this.f62775p);
        }
        if (VERSION.SDK_INT >= 14) {
            return C1056u.m3039a(this.f62775p, -1);
        }
        if (this.f62775p instanceof AbsListView) {
            AbsListView absListView = (AbsListView) this.f62775p;
            if (absListView.getChildCount() <= 0 || (absListView.getFirstVisiblePosition() <= 0 && absListView.getChildAt(0).getTop() >= absListView.getPaddingTop())) {
                return false;
            }
            return true;
        } else if (C1056u.m3039a(this.f62775p, -1) || this.f62775p.getScrollY() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo48781b() {
        this.f62774m.mo48872a();
        this.f62766e.clearAnimation();
        this.f62771j.stop();
        this.f62766e.setVisibility(8);
        setColorViewAlpha(NormalGiftView.ALPHA_255);
        if (this.f62765d) {
            setAnimationProgress(0.0f);
        } else {
            mo48777a(this.f62769h - this.f62764c, true);
        }
        this.f62764c = this.f62766e.getTop();
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f62777r = (float) i;
    }

    public void setDoNotCatchException(boolean z) {
        this.f62778s = z;
    }

    public void setOnChildScrollUpCallback(C23595a aVar) {
        this.f62758O = aVar;
    }

    public void setOnRefreshListener(C23596b bVar) {
        this.f62762a = bVar;
    }

    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f62781v.mo3221a(z);
    }

    public boolean startNestedScroll(int i) {
        return this.f62781v.mo3232b(i);
    }

    private void setColorViewAlpha(int i) {
        this.f62766e.getBackground().setAlpha(i);
        this.f62771j.setAlpha(i);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            mo48781b();
        }
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f62766e.setBackgroundColor(i);
        this.f62771j.mo48842b(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C0726c.m2098c(getContext(), i));
    }

    /* renamed from: a */
    private void m57818a(MotionEvent motionEvent) {
        int i;
        int b = C1044i.m2983b(motionEvent);
        if (motionEvent.getPointerId(b) == this.f62748D) {
            if (b == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f62748D = motionEvent.getPointerId(i);
        }
    }

    public void onStopNestedScroll(View view) {
        this.f62780u.mo3234a(view);
        this.f62784y = false;
        if (this.f62779t > 0.0f) {
            m57823c(this.f62779t);
            this.f62779t = 0.0f;
        }
        stopNestedScroll();
    }

    /* access modifiers changed from: 0000 */
    public void setAnimationProgress(float f) {
        if (m57825c()) {
            setColorViewAlpha((int) (f * 255.0f));
            return;
        }
        C1056u.m3023a((View) this.f62766e, f);
        C1056u.m3042b((View) this.f62766e, f);
    }

    public void setColorSchemeColors(int... iArr) {
        m57829f();
        C23601c cVar = this.f62771j;
        cVar.f62807b.mo48865a(iArr);
        cVar.f62807b.mo48863a(0);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C0726c.m2098c(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    /* renamed from: c */
    private void m57823c(float f) {
        if (f > this.f62777r) {
            m57819a(true, true);
            return;
        }
        this.f62763b = false;
        this.f62771j.mo48836a(0.0f, 0.0f);
        C235905 r0 = null;
        if (!this.f62765d) {
            r0 = new AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    if (!SwipeRefreshLayout.this.f62765d) {
                        SwipeRefreshLayout.this.mo48778a((AnimationListener) null);
                    }
                }
            };
        }
        m57822b(this.f62764c, this.f62774m.mo48871a((AnimationListener) r0));
        this.f62771j.mo48839a(false);
    }

    /* renamed from: d */
    private void m57827d(float f) {
        if (f - this.f62746B > ((float) this.f62776q) && !this.f62747C) {
            this.f62745A = this.f62746B + ((float) this.f62776q);
            this.f62747C = true;
            this.f62771j.setAlpha(76);
        }
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f62757N = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f62757N = (int) (displayMetrics.density * 40.0f);
            }
            this.f62766e.setImageDrawable(null);
            this.f62771j.mo48838a(i);
            this.f62766e.setImageDrawable(this.f62771j);
        }
    }

    public void setRefreshing(boolean z) {
        int i;
        if (!z || this.f62763b == z) {
            m57819a(z, false);
            return;
        }
        this.f62763b = z;
        if (!this.f62773l) {
            i = this.f62770i + this.f62769h;
        } else {
            i = this.f62770i;
        }
        mo48777a(i - this.f62764c, true);
        this.f62772k = false;
        AnimationListener animationListener = this.f62759P;
        this.f62766e.setVisibility(0);
        if (VERSION.SDK_INT >= 11) {
            this.f62771j.setAlpha(NormalGiftView.ALPHA_255);
        }
        this.f62752I = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(f);
            }
        };
        this.f62752I.setDuration((long) this.f62785z);
        if (animationListener != null) {
            this.f62766e.mo48827a(animationListener);
        }
        this.f62766e.clearAnimation();
        this.f62766e.startAnimation(this.f62752I);
    }

    /* renamed from: b */
    private void m57821b(float f) {
        int i;
        this.f62771j.mo48839a(true);
        float min = Math.min(1.0f, Math.abs(f / this.f62777r));
        double d = (double) min;
        Double.isNaN(d);
        float max = (Math.max((float) (d - 0.4d), 0.0f) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f62777r;
        if (this.f62773l) {
            i = this.f62770i - this.f62769h;
        } else {
            i = this.f62770i;
        }
        float f2 = (float) i;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f);
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        float f3 = ((float) (max2 - pow)) * 2.0f;
        int i2 = this.f62769h + ((int) ((f2 * min) + (f2 * f3 * 2.0f)));
        if (this.f62766e.getVisibility() != 0) {
            this.f62766e.setVisibility(0);
        }
        if (!this.f62765d) {
            C1056u.m3023a((View) this.f62766e, 1.0f);
            C1056u.m3042b((View) this.f62766e, 1.0f);
        }
        if (this.f62765d) {
            setAnimationProgress(Math.min(1.0f, f / this.f62777r));
        }
        if (f < this.f62777r) {
            if (this.f62771j.getAlpha() > 76 && !m57820a(this.f62754K)) {
                m57826d();
            }
        } else if (this.f62771j.getAlpha() < 255 && !m57820a(this.f62755L)) {
            m57828e();
        }
        this.f62771j.mo48836a(0.0f, Math.min(0.8f, max * 0.8f));
        this.f62771j.mo48835a(Math.min(1.0f, max));
        this.f62771j.mo48840b((((max * 0.4f) - 16.0f) + (f3 * 2.0f)) * 0.5f);
        mo48777a(i2 - this.f62764c, true);
        this.f62774m.mo48873a(min);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m57829f();
        int a = C1044i.m2981a(motionEvent);
        if (this.f62749E && a == 0) {
            this.f62749E = false;
        }
        if (!isEnabled() || this.f62749E || m57830g() || this.f62763b || this.f62784y) {
            return false;
        }
        if (a != 6) {
            switch (a) {
                case 0:
                    mo48777a(this.f62769h - this.f62766e.getTop(), true);
                    this.f62748D = motionEvent.getPointerId(0);
                    this.f62747C = false;
                    int findPointerIndex = motionEvent.findPointerIndex(this.f62748D);
                    if (findPointerIndex >= 0) {
                        this.f62746B = motionEvent.getY(findPointerIndex);
                        break;
                    } else {
                        return false;
                    }
                case 1:
                case 3:
                    this.f62747C = false;
                    this.f62748D = -1;
                    break;
                case 2:
                    if (this.f62748D != -1) {
                        int findPointerIndex2 = motionEvent.findPointerIndex(this.f62748D);
                        if (findPointerIndex2 >= 0) {
                            m57827d(motionEvent.getY(findPointerIndex2));
                            break;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
            }
        } else {
            m57818a(motionEvent);
        }
        return this.f62747C;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int a = C1044i.m2981a(motionEvent);
        if (this.f62749E && a == 0) {
            this.f62749E = false;
        }
        if (!isEnabled() || this.f62749E || m57830g() || this.f62763b || this.f62784y) {
            return false;
        }
        switch (a) {
            case 0:
                this.f62748D = motionEvent.getPointerId(0);
                this.f62747C = false;
                break;
            case 1:
            case 3:
                int findPointerIndex = motionEvent.findPointerIndex(this.f62748D);
                if (findPointerIndex < 0) {
                    return false;
                }
                if (this.f62747C) {
                    float y = (motionEvent.getY(findPointerIndex) - this.f62745A) * 0.5f;
                    this.f62747C = false;
                    m57823c(y);
                }
                this.f62748D = -1;
                return false;
            case 2:
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f62748D);
                if (findPointerIndex2 < 0) {
                    return false;
                }
                float y2 = motionEvent.getY(findPointerIndex2);
                m57827d(y2);
                if (this.f62747C) {
                    float f = (y2 - this.f62745A) * 0.5f;
                    if (f > 0.0f) {
                        m57821b(f);
                        break;
                    } else {
                        m57821b(0.0f);
                        return false;
                    }
                }
                break;
            case 5:
                int b = C1044i.m2983b(motionEvent);
                if (b >= 0) {
                    this.f62748D = motionEvent.getPointerId(b);
                    break;
                } else {
                    return false;
                }
            case 6:
                m57818a(motionEvent);
                break;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m57820a(Animation animation) {
        if (animation == null || !animation.hasStarted() || animation.hasEnded()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo48776a(float f) {
        mo48777a((this.f62767f + ((int) (((float) (this.f62769h - this.f62767f)) * f))) - this.f62766e.getTop(), false);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f62781v.mo3223a(f, f2);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f62751H < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return this.f62751H;
        }
        if (i2 >= this.f62751H) {
            return i2 + 1;
        }
        return i2;
    }

    /* renamed from: a */
    private Animation m57816a(final int i, final int i2) {
        if (this.f62765d && m57825c()) {
            return null;
        }
        C235894 r0 = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.f62771j.setAlpha((int) (((float) i) + (((float) (i2 - i)) * f)));
            }
        };
        r0.setDuration(300);
        this.f62766e.mo48827a(null);
        this.f62766e.clearAnimation();
        this.f62766e.startAnimation(r0);
        return r0;
    }

    /* renamed from: b */
    private void m57822b(int i, AnimationListener animationListener) {
        this.f62774m.mo48877b(i, animationListener);
        if (this.f62765d) {
            m57824c(i, animationListener);
            return;
        }
        this.f62767f = i;
        this.f62761R.reset();
        this.f62761R.setDuration(200);
        this.f62761R.setInterpolator(this.f62750F);
        if (animationListener != null) {
            this.f62766e.mo48827a(animationListener);
        }
        this.f62766e.clearAnimation();
        this.f62766e.startAnimation(this.f62761R);
    }

    /* renamed from: a */
    private void m57817a(int i, AnimationListener animationListener) {
        this.f62774m.mo48874a(i, animationListener);
        this.f62767f = i;
        this.f62760Q.reset();
        this.f62760Q.setDuration(200);
        this.f62760Q.setInterpolator(this.f62750F);
        if (animationListener != null) {
            this.f62766e.mo48827a(animationListener);
        }
        this.f62766e.clearAnimation();
        this.f62766e.startAnimation(this.f62760Q);
    }

    /* renamed from: c */
    private void m57824c(int i, AnimationListener animationListener) {
        this.f62767f = i;
        if (m57825c()) {
            this.f62768g = (float) this.f62771j.getAlpha();
        } else {
            this.f62768g = C1056u.m3068n(this.f62766e);
        }
        this.f62756M = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(SwipeRefreshLayout.this.f62768g + ((-SwipeRefreshLayout.this.f62768g) * f));
                SwipeRefreshLayout.this.mo48776a(f);
            }
        };
        this.f62756M.setDuration(150);
        if (animationListener != null) {
            this.f62766e.mo48827a(animationListener);
        }
        this.f62766e.clearAnimation();
        this.f62766e.startAnimation(this.f62756M);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f62775p == null) {
            m57829f();
        }
        if (this.f62775p != null) {
            try {
                this.f62775p.measure(MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            } catch (IllegalStateException e) {
                C32458a.m75143a((Exception) e);
                C9220a.m18312a((Throwable) e, f62743n);
                if (this.f62778s) {
                    throw e;
                }
            }
            this.f62766e.measure(MeasureSpec.makeMeasureSpec(this.f62757N, 1073741824), MeasureSpec.makeMeasureSpec(this.f62757N, 1073741824));
            this.f62751H = -1;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) == this.f62766e) {
                    this.f62751H = i3;
                    return;
                }
            }
        }
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f62777r = -1.0f;
        this.f62782w = new int[2];
        this.f62783x = new int[2];
        this.f62748D = -1;
        this.f62751H = -1;
        this.f62759P = new AnimationListener() {
            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                if (SwipeRefreshLayout.this.f62763b) {
                    SwipeRefreshLayout.this.f62774m.mo48876b();
                    SwipeRefreshLayout.this.f62771j.setAlpha(NormalGiftView.ALPHA_255);
                    SwipeRefreshLayout.this.f62771j.start();
                    if (SwipeRefreshLayout.this.f62772k && SwipeRefreshLayout.this.f62762a != null) {
                        SwipeRefreshLayout.this.f62762a.mo47048a();
                    }
                    SwipeRefreshLayout.this.f62764c = SwipeRefreshLayout.this.f62766e.getTop();
                    return;
                }
                SwipeRefreshLayout.this.mo48781b();
            }
        };
        this.f62760Q = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                int i;
                if (!SwipeRefreshLayout.this.f62773l) {
                    i = SwipeRefreshLayout.this.f62770i - Math.abs(SwipeRefreshLayout.this.f62769h);
                } else {
                    i = SwipeRefreshLayout.this.f62770i;
                }
                SwipeRefreshLayout.this.mo48777a((SwipeRefreshLayout.this.f62767f + ((int) (((float) (i - SwipeRefreshLayout.this.f62767f)) * f))) - SwipeRefreshLayout.this.f62766e.getTop(), false);
                SwipeRefreshLayout.this.f62771j.mo48835a(1.0f - f);
            }
        };
        this.f62761R = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.mo48776a(f);
            }
        };
        this.f62774m = new C23606d() {
        };
        this.f62776q = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f62785z = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f62750F = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f62757N = (int) (displayMetrics.density * 40.0f);
        this.f62766e = new C23598a(getContext(), -328966);
        this.f62771j = new C23601c(getContext(), this);
        this.f62771j.mo48842b(-328966);
        this.f62766e.setImageDrawable(this.f62771j);
        this.f62766e.setVisibility(8);
        addView(this.f62766e);
        C1056u.m3038a((ViewGroup) this, true);
        this.f62770i = (int) (displayMetrics.density * 64.0f);
        this.f62777r = (float) this.f62770i;
        this.f62780u = new C1050o(this);
        this.f62781v = new C1047l(this);
        setNestedScrollingEnabled(true);
        int i = -this.f62757N;
        this.f62764c = i;
        this.f62769h = i;
        mo48776a(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f62742G);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m57819a(boolean z, boolean z2) {
        if (this.f62763b != z) {
            this.f62772k = z2;
            m57829f();
            this.f62763b = z;
            if (this.f62763b) {
                m57817a(this.f62764c, this.f62759P);
                return;
            }
            mo48778a(this.f62759P);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo48777a(int i, boolean z) {
        this.f62766e.bringToFront();
        C1056u.m3058g(this.f62766e, i);
        this.f62764c = this.f62766e.getTop();
        if (z && VERSION.SDK_INT < 11) {
            invalidate();
        }
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f62781v.mo3224a(f, f2, z);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    /* renamed from: a */
    public final void mo48779a(boolean z, int i, int i2) {
        this.f62765d = z;
        this.f62769h = i;
        this.f62770i = i2;
        this.f62773l = true;
        mo48781b();
        this.f62763b = false;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f62780u.mo3236a(view, view2, i);
        startNestedScroll(i & 2);
        this.f62779t = 0.0f;
        this.f62784y = true;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if (!isEnabled() || this.f62749E || this.f62763b || (i & 2) == 0) {
            return false;
        }
        return true;
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f62781v.mo3229a(i, i2, iArr, iArr2);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0 && this.f62779t > 0.0f) {
            float f = (float) i2;
            if (f > this.f62779t) {
                iArr[1] = i2 - ((int) this.f62779t);
                this.f62779t = 0.0f;
            } else {
                this.f62779t -= f;
                iArr[1] = i2;
            }
            m57821b(this.f62779t);
        }
        if (this.f62773l && i2 > 0 && this.f62779t == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f62766e.setVisibility(8);
        }
        int[] iArr2 = this.f62782w;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f62781v.mo3227a(i, i2, i3, i4, iArr);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f62783x);
        int i5 = i4 + this.f62783x[1];
        if (i5 < 0 && !m57830g()) {
            this.f62779t += (float) Math.abs(i5);
            m57821b(this.f62779t);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f62775p == null) {
                m57829f();
            }
            if (this.f62775p != null) {
                View view = this.f62775p;
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                try {
                    view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                } catch (Exception e) {
                    C32458a.m75143a(e);
                    C9220a.m18312a((Throwable) e, f62743n);
                    if (this.f62778s) {
                        throw e;
                    }
                }
                int measuredWidth2 = this.f62766e.getMeasuredWidth();
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                this.f62766e.layout(i5 - i6, this.f62764c, i5 + i6, this.f62764c + this.f62766e.getMeasuredHeight());
            }
        }
    }
}
