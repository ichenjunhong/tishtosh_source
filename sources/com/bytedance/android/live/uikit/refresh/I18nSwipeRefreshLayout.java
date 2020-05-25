package com.bytedance.android.live.uikit.refresh;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.p030v4.view.C1044i;
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

public class I18nSwipeRefreshLayout extends ViewGroup {

    /* renamed from: m */
    private static final String f11612m = "I18nSwipeRefreshLayout";

    /* renamed from: y */
    private static final int[] f11613y = {16842766};

    /* renamed from: A */
    private Animation f11614A;

    /* renamed from: B */
    private Animation f11615B;

    /* renamed from: C */
    private Animation f11616C;

    /* renamed from: D */
    private Animation f11617D;

    /* renamed from: E */
    private Animation f11618E;

    /* renamed from: F */
    private int f11619F;

    /* renamed from: G */
    private int f11620G;

    /* renamed from: H */
    private AnimationListener f11621H;

    /* renamed from: I */
    private final Animation f11622I;

    /* renamed from: J */
    private final Animation f11623J;

    /* renamed from: a */
    public C4254b f11624a;

    /* renamed from: b */
    public boolean f11625b;

    /* renamed from: c */
    public int f11626c;

    /* renamed from: d */
    public boolean f11627d;

    /* renamed from: e */
    public C4255a f11628e;

    /* renamed from: f */
    protected int f11629f;

    /* renamed from: g */
    public float f11630g;

    /* renamed from: h */
    protected int f11631h;

    /* renamed from: i */
    public C4257b f11632i;

    /* renamed from: j */
    public float f11633j;

    /* renamed from: k */
    public boolean f11634k;

    /* renamed from: l */
    public boolean f11635l;

    /* renamed from: n */
    private View f11636n;

    /* renamed from: o */
    private C4253a f11637o;

    /* renamed from: p */
    private int f11638p;

    /* renamed from: q */
    private float f11639q;

    /* renamed from: r */
    private int f11640r;

    /* renamed from: s */
    private boolean f11641s;

    /* renamed from: t */
    private float f11642t;

    /* renamed from: u */
    private boolean f11643u;

    /* renamed from: v */
    private int f11644v;

    /* renamed from: w */
    private boolean f11645w;

    /* renamed from: x */
    private final DecelerateInterpolator f11646x;

    /* renamed from: z */
    private int f11647z;

    /* renamed from: com.bytedance.android.live.uikit.refresh.I18nSwipeRefreshLayout$a */
    public interface C4253a {
        /* renamed from: a */
        void mo9895a();

        /* renamed from: b */
        void mo9896b();
    }

    /* renamed from: com.bytedance.android.live.uikit.refresh.I18nSwipeRefreshLayout$b */
    public interface C4254b {
        /* renamed from: a */
        void mo9897a();
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
    }

    /* renamed from: a */
    public final void mo9865a(AnimationListener animationListener) {
        this.f11615B = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                I18nSwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
            }
        };
        this.f11615B.setDuration(150);
        this.f11628e.mo9898a(animationListener);
        this.f11628e.clearAnimation();
        this.f11628e.startAnimation(this.f11615B);
    }

    /* renamed from: a */
    public final void mo9864a(int i, boolean z) {
        this.f11628e.bringToFront();
        this.f11628e.offsetTopAndBottom(i);
        this.f11626c = this.f11628e.getTop();
        if (z && VERSION.SDK_INT < 11) {
            invalidate();
        }
    }

    /* renamed from: b */
    private void m10508b() {
        if (this.f11636n == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f11628e)) {
                    this.f11636n = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    private boolean m10509c() {
        if (VERSION.SDK_INT >= 14) {
            return C1056u.m3039a(this.f11636n, -1);
        }
        if (this.f11636n instanceof AbsListView) {
            AbsListView absListView = (AbsListView) this.f11636n;
            if (absListView.getChildCount() <= 0 || (absListView.getFirstVisiblePosition() <= 0 && absListView.getChildAt(0).getTop() >= absListView.getPaddingTop())) {
                return false;
            }
            return true;
        } else if (this.f11636n.getScrollY() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m10506a() {
        if (VERSION.SDK_INT < 11) {
            return true;
        }
        return false;
    }

    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f11639q = (float) i;
    }

    public void setOnRefreshListener(C4254b bVar) {
        this.f11624a = bVar;
    }

    public void setStartEndRefreshListener(C4253a aVar) {
        this.f11637o = aVar;
    }

    public I18nSwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public void setColorSchemeColors(int... iArr) {
        m10508b();
        C4257b bVar = this.f11632i;
        bVar.f11669c.mo9930a(iArr);
        bVar.f11669c.f11695j = 0;
    }

    public void setColorViewAlpha(int i) {
        this.f11628e.getBackground().setAlpha(i);
        this.f11632i.setAlpha(i);
    }

    /* renamed from: a */
    private void m10504a(MotionEvent motionEvent) {
        int i;
        int b = C1044i.m2983b(motionEvent);
        if (C1044i.m2984b(motionEvent, b) == this.f11644v) {
            if (b == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f11644v = C1044i.m2984b(motionEvent, i);
        }
    }

    public void setAnimationProgress(float f) {
        if (m10506a()) {
            setColorViewAlpha((int) (f * 255.0f));
            return;
        }
        C1056u.m3023a((View) this.f11628e, f);
        C1056u.m3042b((View) this.f11628e, f);
    }

    public void setColorSchemeResources(int... iArr) {
        Resources resources = getResources();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = resources.getColor(iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setProgressBackgroundColor(int i) {
        this.f11628e.setBackgroundColor(i);
        this.f11632i.mo9908b(getResources().getColor(i));
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                int i2 = (int) (displayMetrics.density * 56.0f);
                this.f11619F = i2;
                this.f11620G = i2;
            } else {
                int i3 = (int) (displayMetrics.density * 40.0f);
                this.f11619F = i3;
                this.f11620G = i3;
            }
            this.f11628e.setImageDrawable(null);
            this.f11632i.mo9906a(i);
            this.f11628e.setImageDrawable(this.f11632i);
        }
    }

    public void setRefreshing(boolean z) {
        int i;
        if (!z || this.f11625b == z) {
            m10505a(z, false);
            return;
        }
        this.f11625b = z;
        if (!this.f11635l) {
            i = (int) (this.f11633j + ((float) this.f11631h));
        } else {
            i = (int) this.f11633j;
        }
        mo9864a(i - this.f11626c, true);
        this.f11634k = false;
        AnimationListener animationListener = this.f11621H;
        this.f11628e.setVisibility(0);
        if (VERSION.SDK_INT >= 11) {
            this.f11632i.setAlpha(NormalGiftView.ALPHA_255);
        }
        this.f11614A = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                I18nSwipeRefreshLayout.this.setAnimationProgress(f);
            }
        };
        this.f11614A.setDuration((long) this.f11640r);
        if (animationListener != null) {
            this.f11628e.mo9898a(animationListener);
        }
        this.f11628e.clearAnimation();
        this.f11628e.startAnimation(this.f11614A);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m10508b();
        int a = C1044i.m2981a(motionEvent);
        if (this.f11645w && a == 0) {
            this.f11645w = false;
        }
        if (!isEnabled() || this.f11645w || m10509c() || this.f11625b) {
            return false;
        }
        if (a != 6) {
            switch (a) {
                case 0:
                    mo9864a(this.f11631h - this.f11628e.getTop(), true);
                    this.f11644v = C1044i.m2984b(motionEvent, 0);
                    this.f11643u = false;
                    float a2 = m10501a(motionEvent, this.f11644v);
                    if (a2 != -1.0f) {
                        this.f11642t = a2;
                        break;
                    } else {
                        return false;
                    }
                case 1:
                case 3:
                    this.f11643u = false;
                    if (this.f11637o != null) {
                        this.f11637o.mo9896b();
                    }
                    this.f11644v = -1;
                    break;
                case 2:
                    break;
            }
            if (this.f11644v == -1) {
                return false;
            }
            float a3 = m10501a(motionEvent, this.f11644v);
            if (a3 == -1.0f) {
                return false;
            }
            if (a3 - this.f11642t > ((float) this.f11638p) && !this.f11643u) {
                this.f11643u = true;
                if (this.f11637o != null) {
                    this.f11637o.mo9895a();
                }
                this.f11632i.setAlpha(76);
            }
        } else {
            m10504a(motionEvent);
        }
        return this.f11643u;
    }

    /* renamed from: a */
    private static boolean m10507a(Animation animation) {
        if (animation == null || !animation.hasStarted() || animation.hasEnded()) {
            return false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        int a = C1044i.m2981a(motionEvent);
        if (this.f11645w && a == 0) {
            this.f11645w = false;
        }
        if (!isEnabled() || this.f11645w || m10509c()) {
            return false;
        }
        switch (a) {
            case 0:
                this.f11644v = C1044i.m2984b(motionEvent, 0);
                this.f11643u = false;
                break;
            case 1:
            case 3:
                if (this.f11644v == -1) {
                    return false;
                }
                try {
                    float d = (C1044i.m2986d(motionEvent, C1044i.m2982a(motionEvent, this.f11644v)) - this.f11642t) * 0.5f;
                    this.f11643u = false;
                    if (d > this.f11639q) {
                        m10505a(true, true);
                    } else {
                        this.f11625b = false;
                        this.f11632i.mo9905a(0.0f, 0.0f);
                        C42495 r15 = null;
                        if (!this.f11627d) {
                            r15 = new AnimationListener() {
                                public final void onAnimationRepeat(Animation animation) {
                                }

                                public final void onAnimationStart(Animation animation) {
                                }

                                public final void onAnimationEnd(Animation animation) {
                                    if (!I18nSwipeRefreshLayout.this.f11627d) {
                                        I18nSwipeRefreshLayout.this.mo9865a((AnimationListener) null);
                                    }
                                }
                            };
                        }
                        int i = this.f11626c;
                        if (this.f11627d) {
                            this.f11629f = i;
                            if (m10506a()) {
                                this.f11630g = (float) this.f11632i.getAlpha();
                            } else {
                                this.f11630g = C1056u.m3068n(this.f11628e);
                            }
                            this.f11618E = new Animation() {
                                public final void applyTransformation(float f, Transformation transformation) {
                                    I18nSwipeRefreshLayout.this.setAnimationProgress(I18nSwipeRefreshLayout.this.f11630g + ((-I18nSwipeRefreshLayout.this.f11630g) * f));
                                    I18nSwipeRefreshLayout.this.mo9863a(f);
                                }
                            };
                            this.f11618E.setDuration(150);
                            if (r15 != null) {
                                this.f11628e.mo9898a(r15);
                            }
                            this.f11628e.clearAnimation();
                            this.f11628e.startAnimation(this.f11618E);
                        } else {
                            this.f11629f = i;
                            this.f11623J.reset();
                            this.f11623J.setDuration(200);
                            this.f11623J.setInterpolator(this.f11646x);
                            if (r15 != null) {
                                this.f11628e.mo9898a(r15);
                            }
                            this.f11628e.clearAnimation();
                            this.f11628e.startAnimation(this.f11623J);
                        }
                        this.f11632i.mo9907a(false);
                        if (this.f11637o != null) {
                            this.f11637o.mo9896b();
                        }
                    }
                    this.f11644v = -1;
                    return false;
                } catch (Exception unused) {
                    return true;
                }
            case 2:
                int a2 = C1044i.m2982a(motionEvent, this.f11644v);
                if (a2 < 0) {
                    return false;
                }
                try {
                    float d2 = (C1044i.m2986d(motionEvent, a2) - this.f11642t) * 0.5f;
                    if (this.f11643u) {
                        this.f11632i.mo9907a(true);
                        float f2 = d2 / this.f11639q;
                        if (f2 >= 0.0f) {
                            float min = Math.min(1.0f, Math.abs(f2));
                            double d3 = (double) min;
                            Double.isNaN(d3);
                            float max = (Math.max((float) (d3 - 0.4d), 0.0f) * 5.0f) / 3.0f;
                            float abs = Math.abs(d2) - this.f11639q;
                            if (this.f11635l) {
                                f = this.f11633j - ((float) this.f11631h);
                            } else {
                                f = this.f11633j;
                            }
                            double max2 = (double) (Math.max(0.0f, Math.min(abs, f * 2.0f) / f) / 4.0f);
                            double pow = Math.pow(max2, 2.0d);
                            Double.isNaN(max2);
                            float f3 = ((float) (max2 - pow)) * 2.0f;
                            int i2 = this.f11631h + ((int) ((f * min) + (f * f3 * 2.0f)));
                            if (this.f11628e.getVisibility() != 0) {
                                this.f11628e.setVisibility(0);
                            }
                            if (!this.f11627d) {
                                C1056u.m3023a((View) this.f11628e, 1.0f);
                                C1056u.m3042b((View) this.f11628e, 1.0f);
                            }
                            if (d2 < this.f11639q) {
                                if (this.f11627d) {
                                    setAnimationProgress(d2 / this.f11639q);
                                }
                                if (this.f11632i.getAlpha() > 76 && !m10507a(this.f11616C)) {
                                    this.f11616C = m10502a(this.f11632i.getAlpha(), 76);
                                }
                                this.f11632i.mo9905a(0.0f, Math.min(0.8f, max * 0.8f));
                                C4257b bVar = this.f11632i;
                                float min2 = Math.min(1.0f, max);
                                C4262b bVar2 = bVar.f11669c;
                                if (min2 != bVar2.f11701p) {
                                    bVar2.f11701p = min2;
                                    bVar2.mo9933c();
                                }
                            } else if (this.f11632i.getAlpha() < 255 && !m10507a(this.f11617D)) {
                                this.f11617D = m10502a(this.f11632i.getAlpha(), (int) NormalGiftView.ALPHA_255);
                            }
                            this.f11632i.f11669c.mo9934c((((max * 0.4f) - 16.0f) + (f3 * 2.0f)) * 0.5f);
                            mo9864a(i2 - this.f11626c, true);
                            break;
                        } else {
                            return false;
                        }
                    }
                } catch (Exception unused2) {
                    return true;
                }
                break;
            case 5:
                this.f11644v = C1044i.m2984b(motionEvent, C1044i.m2983b(motionEvent));
                break;
            case 6:
                m10504a(motionEvent);
                break;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo9863a(float f) {
        mo9864a((this.f11629f + ((int) (((float) (this.f11631h - this.f11629f)) * f))) - this.f11628e.getTop(), false);
    }

    /* renamed from: a */
    private static float m10501a(MotionEvent motionEvent, int i) {
        int a = C1044i.m2982a(motionEvent, i);
        if (a < 0) {
            return -1.0f;
        }
        return C1044i.m2986d(motionEvent, a);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f11647z < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return this.f11647z;
        }
        if (i2 >= this.f11647z) {
            return i2 + 1;
        }
        return i2;
    }

    /* renamed from: a */
    private Animation m10502a(final int i, final int i2) {
        if (this.f11627d && m10506a()) {
            return null;
        }
        C42484 r0 = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                I18nSwipeRefreshLayout.this.f11632i.setAlpha((int) (((float) i) + (((float) (i2 - i)) * f)));
            }
        };
        r0.setDuration(300);
        this.f11628e.mo9898a(null);
        this.f11628e.clearAnimation();
        this.f11628e.startAnimation(r0);
        return r0;
    }

    /* renamed from: a */
    private void m10503a(int i, AnimationListener animationListener) {
        this.f11629f = i;
        this.f11622I.reset();
        this.f11622I.setDuration(200);
        this.f11622I.setInterpolator(this.f11646x);
        if (animationListener != null) {
            this.f11628e.mo9898a(animationListener);
        }
        this.f11628e.clearAnimation();
        this.f11628e.startAnimation(this.f11622I);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f11636n == null) {
            m10508b();
        }
        if (this.f11636n != null) {
            this.f11636n.measure(MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f11628e.measure(MeasureSpec.makeMeasureSpec(this.f11619F, 1073741824), MeasureSpec.makeMeasureSpec(this.f11620G, 1073741824));
            if (!this.f11635l && !this.f11641s) {
                this.f11641s = true;
                int i3 = -this.f11628e.getMeasuredHeight();
                this.f11631h = i3;
                this.f11626c = i3;
            }
            this.f11647z = -1;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                if (getChildAt(i4) == this.f11628e) {
                    this.f11647z = i4;
                    return;
                }
            }
        }
    }

    public I18nSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11639q = -1.0f;
        this.f11644v = -1;
        this.f11647z = -1;
        this.f11621H = new AnimationListener() {
            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                if (I18nSwipeRefreshLayout.this.f11625b) {
                    I18nSwipeRefreshLayout.this.f11632i.setAlpha(NormalGiftView.ALPHA_255);
                    I18nSwipeRefreshLayout.this.f11632i.start();
                    if (I18nSwipeRefreshLayout.this.f11634k && I18nSwipeRefreshLayout.this.f11624a != null) {
                        I18nSwipeRefreshLayout.this.f11624a.mo9897a();
                    }
                } else {
                    I18nSwipeRefreshLayout.this.f11632i.stop();
                    I18nSwipeRefreshLayout.this.f11628e.setVisibility(8);
                    I18nSwipeRefreshLayout.this.setColorViewAlpha(NormalGiftView.ALPHA_255);
                    if (I18nSwipeRefreshLayout.this.f11627d) {
                        I18nSwipeRefreshLayout.this.setAnimationProgress(0.0f);
                    } else {
                        I18nSwipeRefreshLayout.this.mo9864a(I18nSwipeRefreshLayout.this.f11631h - I18nSwipeRefreshLayout.this.f11626c, true);
                    }
                }
                I18nSwipeRefreshLayout.this.f11626c = I18nSwipeRefreshLayout.this.f11628e.getTop();
            }
        };
        this.f11622I = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                int i;
                if (!I18nSwipeRefreshLayout.this.f11635l) {
                    i = (int) (I18nSwipeRefreshLayout.this.f11633j - ((float) Math.abs(I18nSwipeRefreshLayout.this.f11631h)));
                } else {
                    i = (int) I18nSwipeRefreshLayout.this.f11633j;
                }
                I18nSwipeRefreshLayout.this.mo9864a((I18nSwipeRefreshLayout.this.f11629f + ((int) (((float) (i - I18nSwipeRefreshLayout.this.f11629f)) * f))) - I18nSwipeRefreshLayout.this.f11628e.getTop(), false);
            }
        };
        this.f11623J = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                I18nSwipeRefreshLayout.this.mo9863a(f);
            }
        };
        this.f11638p = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f11640r = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f11646x = new DecelerateInterpolator(2.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f11613y);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f11619F = (int) (displayMetrics.density * 40.0f);
        this.f11620G = (int) (displayMetrics.density * 40.0f);
        this.f11628e = new C4255a(getContext(), -328966, 20.0f);
        this.f11632i = new C4257b(getContext(), this);
        this.f11632i.mo9908b(-328966);
        this.f11628e.setImageDrawable(this.f11632i);
        this.f11628e.setVisibility(8);
        addView(this.f11628e);
        C1056u.m3038a((ViewGroup) this, true);
        this.f11633j = displayMetrics.density * 64.0f;
        this.f11639q = this.f11633j;
    }

    /* renamed from: a */
    private void m10505a(boolean z, boolean z2) {
        if (this.f11625b != z) {
            this.f11634k = z2;
            m10508b();
            this.f11625b = z;
            if (this.f11625b) {
                m10503a(this.f11626c, this.f11621H);
                return;
            }
            mo9865a(this.f11621H);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f11636n == null) {
                m10508b();
            }
            if (this.f11636n != null) {
                View view = this.f11636n;
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.f11628e.getMeasuredWidth();
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                this.f11628e.layout(i5 - i6, this.f11626c, i5 + i6, this.f11626c + this.f11628e.getMeasuredHeight());
            }
        }
    }
}
