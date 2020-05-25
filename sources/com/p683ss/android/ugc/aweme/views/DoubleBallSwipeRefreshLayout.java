package com.p683ss.android.ugc.aweme.views;

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
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.Scroller;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.ies.dmt.p664ui.widget.DoubleColorBallAnimationView;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.C23600b;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.C23606d;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout.C23596b;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout.C23597c;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;

/* renamed from: com.ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout */
public class DoubleBallSwipeRefreshLayout extends ViewGroup implements C1045j, C1048m, C23600b {

    /* renamed from: H */
    private static final int[] f121039H = {16842766};

    /* renamed from: p */
    private static final String f121040p = "DoubleBallSwipeRefreshLayout";

    /* renamed from: A */
    private int f121041A;

    /* renamed from: B */
    private float f121042B;

    /* renamed from: C */
    private float f121043C;

    /* renamed from: D */
    private boolean f121044D;

    /* renamed from: E */
    private int f121045E;

    /* renamed from: F */
    private boolean f121046F;

    /* renamed from: G */
    private final DecelerateInterpolator f121047G;

    /* renamed from: I */
    private Animation f121048I;

    /* renamed from: J */
    private Animation f121049J;

    /* renamed from: K */
    private Animation f121050K;

    /* renamed from: L */
    private Animation f121051L;

    /* renamed from: M */
    private int f121052M;

    /* renamed from: N */
    private int f121053N;

    /* renamed from: O */
    private int f121054O;

    /* renamed from: P */
    private C48152a f121055P;

    /* renamed from: Q */
    private C23597c f121056Q;

    /* renamed from: R */
    private AnimationListener f121057R;

    /* renamed from: S */
    private final Animation f121058S;

    /* renamed from: T */
    private final Animation f121059T;

    /* renamed from: a */
    C23596b f121060a;

    /* renamed from: b */
    boolean f121061b;

    /* renamed from: c */
    public float f121062c;

    /* renamed from: d */
    int f121063d;

    /* renamed from: e */
    boolean f121064e;

    /* renamed from: f */
    DoubleColorBallAnimationView f121065f;

    /* renamed from: g */
    protected int f121066g;

    /* renamed from: h */
    float f121067h;

    /* renamed from: i */
    protected int f121068i;

    /* renamed from: j */
    int f121069j;

    /* renamed from: k */
    C48202m f121070k;

    /* renamed from: l */
    Animation f121071l;

    /* renamed from: m */
    boolean f121072m;

    /* renamed from: n */
    boolean f121073n;

    /* renamed from: o */
    C23606d f121074o;

    /* renamed from: q */
    private View f121075q;

    /* renamed from: r */
    private int f121076r;

    /* renamed from: s */
    private boolean f121077s;

    /* renamed from: t */
    private Scroller f121078t;

    /* renamed from: u */
    private float f121079u;

    /* renamed from: v */
    private final C1050o f121080v;

    /* renamed from: w */
    private final C1047l f121081w;

    /* renamed from: x */
    private final int[] f121082x;

    /* renamed from: y */
    private final int[] f121083y;

    /* renamed from: z */
    private boolean f121084z;

    /* renamed from: com.ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout$a */
    public interface C48152a {
        /* renamed from: a */
        boolean mo95534a(DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout, View view);
    }

    /* renamed from: a */
    public final boolean mo48780a() {
        return this.f121061b;
    }

    public int getProgressCircleDiameter() {
        return this.f121052M;
    }

    public int getProgressViewEndOffset() {
        return this.f121069j;
    }

    public int getProgressViewStartOffset() {
        return this.f121068i;
    }

    public void setColorScheme(int... iArr) {
    }

    public int getNestedScrollAxes() {
        return this.f121080v.f3334a;
    }

    public boolean hasNestedScrollingParent() {
        return this.f121081w.mo3222a();
    }

    public boolean isNestedScrollingEnabled() {
        return this.f121081w.f3329a;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo95493b();
    }

    public void stopNestedScroll() {
        this.f121081w.mo3231b();
    }

    /* renamed from: c */
    private static boolean m104361c() {
        if (VERSION.SDK_INT < 11) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m104362d() {
        this.f121049J = m104350a(this.f121070k.getAlpha(), 76);
    }

    /* renamed from: e */
    private void m104363e() {
        this.f121050K = m104350a(this.f121070k.getAlpha(), (int) NormalGiftView.ALPHA_255);
    }

    /* renamed from: f */
    private void m104364f() {
        if (this.f121075q == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f121065f)) {
                    this.f121075q = childAt;
                    return;
                }
            }
        }
    }

    public void computeScroll() {
        if (this.f121078t.computeScrollOffset()) {
            scrollTo(this.f121078t.getCurrX(), this.f121078t.getCurrY());
            invalidate();
        }
    }

    /* renamed from: g */
    private boolean m104365g() {
        if (this.f121055P != null) {
            return this.f121055P.mo95534a(this, this.f121075q);
        }
        if (VERSION.SDK_INT >= 14) {
            return C1056u.m3039a(this.f121075q, -1);
        }
        if (this.f121075q instanceof AbsListView) {
            AbsListView absListView = (AbsListView) this.f121075q;
            if (absListView.getChildCount() <= 0 || (absListView.getFirstVisiblePosition() <= 0 && absListView.getChildAt(0).getTop() >= absListView.getPaddingTop())) {
                return false;
            }
            return true;
        } else if (C1056u.m3039a(this.f121075q, -1) || this.f121075q.getScrollY() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo95493b() {
        this.f121074o.mo48872a();
        this.f121070k.stop();
        setColorViewAlpha(NormalGiftView.ALPHA_255);
        if (this.f121064e) {
            setAnimationProgress(0.0f);
        } else {
            m104353a(this.f121068i - this.f121063d, true);
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f121062c = (float) i;
    }

    public void setDoNotCatchException(boolean z) {
        this.f121077s = z;
    }

    public void setOnChildScrollUpCallback(C48152a aVar) {
        this.f121055P = aVar;
    }

    public void setOnRefreshListener(C23596b bVar) {
        this.f121060a = bVar;
    }

    public void setOnSwipeChangeListener(C23597c cVar) {
        this.f121056Q = cVar;
    }

    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public DoubleBallSwipeRefreshLayout(Context context) {
        this(context, null);
    }

    private void setColorViewAlpha(int i) {
        this.f121070k.setAlpha(i);
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f121081w.mo3221a(z);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f121070k.mo95638b(i);
    }

    public boolean startNestedScroll(int i) {
        return this.f121081w.mo3232b(i);
    }

    /* access modifiers changed from: 0000 */
    public void setAnimationProgress(float f) {
        if (m104361c()) {
            setColorViewAlpha((int) (f * 255.0f));
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            mo95493b();
        }
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C0726c.m2098c(getContext(), i));
    }

    public void onStopNestedScroll(View view) {
        this.f121080v.mo3234a(view);
        this.f121084z = false;
        if (this.f121079u > 0.0f) {
            m104357b(this.f121079u);
            this.f121079u = 0.0f;
        }
        stopNestedScroll();
    }

    public void setColorSchemeColors(int... iArr) {
        m104364f();
        C48202m mVar = this.f121070k;
        mVar.f121276b.mo95661a(iArr);
        mVar.f121276b.mo95659a(0);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C0726c.m2098c(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    /* renamed from: a */
    private void m104354a(MotionEvent motionEvent) {
        int i;
        int b = C1044i.m2983b(motionEvent);
        if (motionEvent.getPointerId(b) == this.f121045E) {
            if (b == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f121045E = motionEvent.getPointerId(i);
        }
    }

    /* renamed from: c */
    private void m104359c(float f) {
        if (f - this.f121043C > ((float) this.f121076r) && !this.f121044D) {
            this.f121042B = this.f121043C + ((float) this.f121076r);
            this.f121044D = true;
            this.f121070k.setAlpha(76);
        }
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f121052M = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f121052M = (int) (displayMetrics.density * 40.0f);
            }
            this.f121070k.mo95634a(i);
        }
    }

    /* renamed from: b */
    private void m104357b(float f) {
        if (f > this.f121062c) {
            m104355a(true, true);
            return;
        }
        this.f121061b = false;
        this.f121070k.mo95632a(0.0f, 0.0f);
        C481475 r0 = null;
        if (!this.f121064e) {
            r0 = new AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    if (!DoubleBallSwipeRefreshLayout.this.f121064e) {
                        DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = DoubleBallSwipeRefreshLayout.this;
                        doubleBallSwipeRefreshLayout.f121071l = new Animation() {
                            public final void applyTransformation(float f, Transformation transformation) {
                                DoubleBallSwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
                            }
                        };
                        doubleBallSwipeRefreshLayout.f121071l.setDuration(150);
                    }
                }
            };
        }
        m104358b(this.f121063d, this.f121074o.mo48871a((AnimationListener) r0));
        this.f121070k.mo95635a(false);
        if (this.f121056Q == null) {
            this.f121078t.startScroll(0, getScrollY(), 0, -getScrollY(), Math.abs(getScrollY() * 2));
            invalidate();
            this.f121065f.mo19245b();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m104364f();
        int a = C1044i.m2981a(motionEvent);
        if (this.f121046F && a == 0) {
            this.f121046F = false;
        }
        if (!isEnabled() || this.f121046F || m104365g() || this.f121061b || this.f121084z) {
            return false;
        }
        if (a != 6) {
            switch (a) {
                case 0:
                    this.f121045E = motionEvent.getPointerId(0);
                    this.f121044D = false;
                    int findPointerIndex = motionEvent.findPointerIndex(this.f121045E);
                    if (findPointerIndex >= 0) {
                        this.f121043C = motionEvent.getY(findPointerIndex);
                        break;
                    } else {
                        return false;
                    }
                case 1:
                case 3:
                    this.f121044D = false;
                    this.f121045E = -1;
                    break;
                case 2:
                    if (this.f121045E != -1) {
                        int findPointerIndex2 = motionEvent.findPointerIndex(this.f121045E);
                        if (findPointerIndex2 >= 0) {
                            m104359c(motionEvent.getY(findPointerIndex2));
                            break;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
            }
        } else {
            m104354a(motionEvent);
        }
        return this.f121044D;
    }

    public void setRefreshing(boolean z) {
        int i;
        if (!z || this.f121061b == z) {
            m104355a(z, false);
            return;
        }
        this.f121061b = z;
        if (!this.f121073n) {
            i = this.f121069j + this.f121068i;
        } else {
            i = this.f121069j;
        }
        m104353a(i - this.f121063d, true);
        this.f121072m = false;
        if (this.f121056Q == null) {
            AnimationListener animationListener = this.f121057R;
            if (VERSION.SDK_INT >= 11) {
                this.f121070k.setAlpha(NormalGiftView.ALPHA_255);
            }
            this.f121048I = new Animation() {
                public final void applyTransformation(float f, Transformation transformation) {
                    DoubleBallSwipeRefreshLayout.this.scrollTo(0, (int) (DoubleBallSwipeRefreshLayout.this.f121062c * f));
                }
            };
            this.f121048I.setDuration((long) this.f121041A);
            if (animationListener != null) {
                animationListener.onAnimationEnd(this.f121048I);
            }
            this.f121065f.mo19244a();
            this.f121078t.startScroll(0, getScrollY(), 0, (int) (-this.f121062c));
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int a = C1044i.m2981a(motionEvent);
        if (this.f121046F && a == 0) {
            this.f121046F = false;
        }
        if (!isEnabled() || this.f121046F || m104365g() || this.f121061b || this.f121084z) {
            return false;
        }
        switch (a) {
            case 0:
                this.f121045E = motionEvent.getPointerId(0);
                this.f121044D = false;
                break;
            case 1:
            case 3:
                int findPointerIndex = motionEvent.findPointerIndex(this.f121045E);
                if (findPointerIndex < 0) {
                    return false;
                }
                if (this.f121044D) {
                    float y = (motionEvent.getY(findPointerIndex) - this.f121042B) * 0.5f;
                    this.f121044D = false;
                    m104357b(y);
                }
                this.f121045E = -1;
                return false;
            case 2:
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f121045E);
                if (findPointerIndex2 < 0) {
                    return false;
                }
                float y2 = motionEvent.getY(findPointerIndex2);
                m104359c(y2);
                if (this.f121044D) {
                    float f = (y2 - this.f121042B) * 0.5f;
                    if (f > 0.0f) {
                        m104351a(f);
                        break;
                    } else {
                        m104351a(0.0f);
                        return false;
                    }
                }
                break;
            case 5:
                int b = C1044i.m2983b(motionEvent);
                if (b >= 0) {
                    this.f121045E = motionEvent.getPointerId(b);
                    break;
                } else {
                    return false;
                }
            case 6:
                m104354a(motionEvent);
                break;
        }
        return true;
    }

    /* renamed from: a */
    private void m104351a(float f) {
        int i;
        this.f121070k.mo95635a(true);
        float f2 = f / this.f121062c;
        float min = Math.min(1.0f, Math.abs(f2));
        double d = (double) min;
        Double.isNaN(d);
        float max = (Math.max((float) (d - 0.4d), 0.0f) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f121062c;
        if (this.f121073n) {
            i = this.f121069j - this.f121068i;
        } else {
            i = this.f121069j;
        }
        float f3 = (float) i;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f3 * 2.0f) / f3) / 4.0f);
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        float f4 = ((float) (max2 - pow)) * 2.0f;
        int i2 = this.f121068i + ((int) ((f3 * min) + (f3 * f4 * 2.0f)));
        if (this.f121064e) {
            setAnimationProgress(Math.min(1.0f, f / this.f121062c));
        }
        if (f < this.f121062c) {
            if (this.f121070k.getAlpha() > 76 && !m104356a(this.f121049J)) {
                m104362d();
            }
        } else if (this.f121070k.getAlpha() < 255 && !m104356a(this.f121050K)) {
            m104363e();
        }
        if (this.f121056Q == null) {
            float atan = (float) Math.atan((double) f2);
            scrollTo(0, (int) ((-this.f121062c) * atan));
            this.f121065f.setProgress(Math.max(0.0f, Math.min(1.0f, atan - 0.5f)));
        } else {
            Math.min(f, this.f121062c);
            Math.min(f2, 1.0f);
        }
        this.f121070k.mo95632a(0.0f, Math.min(0.8f, max * 0.8f));
        this.f121070k.mo95631a(Math.min(1.0f, max));
        this.f121070k.mo95636b((((max * 0.4f) - 16.0f) + (f4 * 2.0f)) * 0.5f);
        m104353a(i2 - this.f121063d, true);
        this.f121074o.mo48873a(min);
    }

    /* renamed from: a */
    private static boolean m104356a(Animation animation) {
        if (animation == null || !animation.hasStarted() || animation.hasEnded()) {
            return false;
        }
        return true;
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f121081w.mo3223a(f, f2);
    }

    /* renamed from: a */
    private void m104353a(int i, boolean z) {
        if (VERSION.SDK_INT < 11) {
            invalidate();
        }
    }

    /* renamed from: a */
    private Animation m104350a(final int i, final int i2) {
        if (this.f121064e && m104361c()) {
            return null;
        }
        C481464 r0 = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                DoubleBallSwipeRefreshLayout.this.f121070k.setAlpha((int) (((float) i) + (((float) (i2 - i)) * f)));
            }
        };
        r0.setDuration(300);
        return r0;
    }

    /* renamed from: b */
    private void m104358b(int i, AnimationListener animationListener) {
        this.f121074o.mo48877b(i, animationListener);
        if (this.f121064e) {
            m104360c(i, animationListener);
            return;
        }
        this.f121066g = i;
        this.f121059T.reset();
        this.f121059T.setDuration(200);
        this.f121059T.setInterpolator(this.f121047G);
        if (animationListener != null) {
            animationListener.onAnimationEnd(this.f121058S);
        }
    }

    /* renamed from: a */
    private void m104352a(int i, AnimationListener animationListener) {
        this.f121074o.mo48874a(i, animationListener);
        this.f121066g = i;
        this.f121058S.reset();
        this.f121058S.setDuration(200);
        this.f121058S.setInterpolator(this.f121047G);
        if (this.f121056Q == null) {
            this.f121065f.setCycleBias(1);
            this.f121065f.mo19244a();
            this.f121078t.startScroll(0, getScrollY(), 0, (-getScrollY()) - this.f121053N, Math.abs(((-getScrollY()) - this.f121053N) * 2));
            invalidate();
        }
        if (animationListener != null) {
            animationListener.onAnimationEnd(this.f121058S);
        }
    }

    /* renamed from: c */
    private void m104360c(int i, AnimationListener animationListener) {
        this.f121066g = i;
        if (m104361c()) {
            this.f121067h = (float) this.f121070k.getAlpha();
        }
        this.f121051L = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                DoubleBallSwipeRefreshLayout.this.setAnimationProgress(DoubleBallSwipeRefreshLayout.this.f121067h + ((-DoubleBallSwipeRefreshLayout.this.f121067h) * f));
            }
        };
        this.f121051L.setDuration(150);
        if (animationListener != null) {
            animationListener.onAnimationEnd(this.f121051L);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f121075q == null) {
            m104364f();
        }
        if (this.f121075q != null) {
            try {
                this.f121075q.measure(MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            } catch (IllegalStateException e) {
                C32458a.m75143a((Exception) e);
                C9220a.m18312a((Throwable) e, f121040p);
                if (this.f121077s) {
                    throw e;
                }
            }
            this.f121065f.measure(MeasureSpec.makeMeasureSpec(this.f121054O, 1073741824), MeasureSpec.makeMeasureSpec(this.f121054O, 1073741824));
        }
    }

    public DoubleBallSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f121062c = -1.0f;
        this.f121082x = new int[2];
        this.f121083y = new int[2];
        this.f121045E = -1;
        this.f121057R = new AnimationListener() {
            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                if (DoubleBallSwipeRefreshLayout.this.f121061b) {
                    DoubleBallSwipeRefreshLayout.this.f121074o.mo48876b();
                    DoubleBallSwipeRefreshLayout.this.f121070k.setAlpha(NormalGiftView.ALPHA_255);
                    DoubleBallSwipeRefreshLayout.this.f121070k.start();
                    if (DoubleBallSwipeRefreshLayout.this.f121072m && DoubleBallSwipeRefreshLayout.this.f121060a != null) {
                        DoubleBallSwipeRefreshLayout.this.f121060a.mo47048a();
                    }
                } else {
                    DoubleBallSwipeRefreshLayout.this.mo95493b();
                }
            }
        };
        this.f121058S = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                if (!DoubleBallSwipeRefreshLayout.this.f121073n) {
                    Math.abs(DoubleBallSwipeRefreshLayout.this.f121068i);
                }
                DoubleBallSwipeRefreshLayout.this.f121070k.mo95631a(1.0f - f);
            }
        };
        this.f121059T = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
            }
        };
        this.f121074o = new C23606d() {
        };
        this.f121076r = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f121078t = new Scroller(context, new AccelerateDecelerateInterpolator());
        this.f121041A = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f121047G = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f121052M = (int) (displayMetrics.density * 40.0f);
        this.f121053N = (int) (displayMetrics.density * 56.0f);
        this.f121054O = (int) (displayMetrics.density * 32.0f);
        this.f121070k = new C48202m(getContext(), this);
        this.f121070k.mo95638b(-328966);
        C1056u.m3038a((ViewGroup) this, true);
        this.f121069j = (int) (displayMetrics.density * 56.0f);
        this.f121062c = (float) this.f121069j;
        this.f121080v = new C1050o(this);
        this.f121081w = new C1047l(this);
        setNestedScrollingEnabled(true);
        int i = -this.f121052M;
        this.f121063d = i;
        this.f121068i = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f121039H);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        this.f121065f = new DoubleColorBallAnimationView(getContext());
        addView(this.f121065f);
    }

    /* renamed from: a */
    private void m104355a(boolean z, boolean z2) {
        if (this.f121061b != z) {
            this.f121072m = z2;
            m104364f();
            this.f121061b = z;
            if (this.f121061b) {
                m104352a(this.f121063d, this.f121057R);
            } else if (this.f121056Q == null) {
                this.f121078t.forceFinished(true);
                this.f121078t.startScroll(0, getScrollY(), 0, -getScrollY(), Math.abs(getScrollY() * 2));
                invalidate();
                this.f121065f.mo19245b();
            }
        }
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f121081w.mo3224a(f, f2, z);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f121080v.mo3236a(view, view2, i);
        startNestedScroll(i & 2);
        this.f121079u = 0.0f;
        this.f121084z = true;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if (!isEnabled() || this.f121046F || this.f121061b || (i & 2) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo48779a(boolean z, int i, int i2) {
        this.f121064e = z;
        this.f121068i = i;
        this.f121069j = i2;
        this.f121073n = true;
        mo95493b();
        this.f121061b = false;
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f121081w.mo3229a(i, i2, iArr, iArr2);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0 && this.f121079u > 0.0f) {
            float f = (float) i2;
            if (f > this.f121079u) {
                iArr[1] = i2 - ((int) this.f121079u);
                this.f121079u = 0.0f;
            } else {
                this.f121079u -= f;
                iArr[1] = i2;
            }
            m104351a(this.f121079u);
        }
        int[] iArr2 = this.f121082x;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f121081w.mo3227a(i, i2, i3, i4, iArr);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f121083y);
        int i5 = i4 + this.f121083y[1];
        if (i5 < 0 && !m104365g()) {
            this.f121079u += (float) Math.abs(i5);
            m104351a(this.f121079u);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f121075q == null) {
                m104364f();
            }
            if (this.f121075q != null) {
                View view = this.f121075q;
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                try {
                    view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                } catch (Exception e) {
                    C32458a.m75143a(e);
                    C9220a.m18312a((Throwable) e, f121040p);
                    if (this.f121077s) {
                        throw e;
                    }
                }
                int measuredWidth2 = this.f121065f.getMeasuredWidth();
                int i5 = (measuredWidth - measuredWidth2) / 2;
                this.f121065f.layout(i5, -((this.f121053N + this.f121065f.getMeasuredHeight()) / 2), measuredWidth2 + i5, 0);
            }
        }
    }
}
