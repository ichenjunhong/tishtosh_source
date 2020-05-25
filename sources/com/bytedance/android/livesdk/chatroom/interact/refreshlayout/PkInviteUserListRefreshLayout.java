package com.bytedance.android.livesdk.chatroom.interact.refreshlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.p030v4.view.C1044i;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.widget.SwipeRefreshLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;

public class PkInviteUserListRefreshLayout extends ViewGroup {

    /* renamed from: q */
    private static final String f14861q = SwipeRefreshLayout.class.getSimpleName();

    /* renamed from: x */
    private static final int[] f14862x = {16842766};

    /* renamed from: A */
    private final Animation f14863A;

    /* renamed from: B */
    private final Runnable f14864B;

    /* renamed from: C */
    private final Runnable f14865C;

    /* renamed from: a */
    public View f14866a;

    /* renamed from: b */
    public int f14867b;

    /* renamed from: c */
    public C5679b f14868c;

    /* renamed from: d */
    public int f14869d;

    /* renamed from: e */
    public boolean f14870e;

    /* renamed from: f */
    int f14871f;

    /* renamed from: g */
    public int f14872g;

    /* renamed from: h */
    public boolean f14873h;

    /* renamed from: i */
    final DecelerateInterpolator f14874i;

    /* renamed from: j */
    public int f14875j;

    /* renamed from: k */
    public C5680c f14876k;

    /* renamed from: l */
    public boolean f14877l;

    /* renamed from: m */
    final Animation f14878m;

    /* renamed from: n */
    public final AnimationListener f14879n;

    /* renamed from: o */
    public final AnimationListener f14880o;

    /* renamed from: p */
    public final Runnable f14881p;

    /* renamed from: r */
    private int f14882r;

    /* renamed from: s */
    private float f14883s;

    /* renamed from: t */
    private float f14884t;

    /* renamed from: u */
    private float f14885u;

    /* renamed from: v */
    private boolean f14886v;

    /* renamed from: w */
    private int f14887w;

    /* renamed from: y */
    private View f14888y;

    /* renamed from: z */
    private boolean f14889z;

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.refreshlayout.PkInviteUserListRefreshLayout$a */
    class C5678a implements AnimationListener {
        public void onAnimationEnd(Animation animation) {
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }

        private C5678a() {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.refreshlayout.PkInviteUserListRefreshLayout$b */
    public interface C5679b {
        /* renamed from: a */
        void mo11263a();

        /* renamed from: b */
        void mo11264b();

        /* renamed from: c */
        void mo11265c();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.refreshlayout.PkInviteUserListRefreshLayout$c */
    enum C5680c {
        NORMAL,
        LOOSEN,
        REFRESHING
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
    }

    /* renamed from: c */
    private void m12606c() {
        removeCallbacks(this.f14865C);
        postDelayed(this.f14865C, 300);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f14865C);
        removeCallbacks(this.f14881p);
        removeCallbacks(this.f14864B);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f14881p);
        removeCallbacks(this.f14865C);
        removeCallbacks(this.f14864B);
    }

    /* renamed from: b */
    private boolean m12605b() {
        if (VERSION.SDK_INT >= 14) {
            return C1056u.m3039a(this.f14866a, -1);
        }
        if (this.f14866a instanceof AbsListView) {
            AbsListView absListView = (AbsListView) this.f14866a;
            if (absListView.getChildCount() <= 0 || (absListView.getFirstVisiblePosition() <= 0 && absListView.getChildAt(0).getTop() >= absListView.getPaddingTop())) {
                return false;
            }
            return true;
        } else if (this.f14866a.getScrollY() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private void m12602a() {
        if (this.f14866a == null) {
            if (getChildCount() <= 2 || isInEditMode()) {
                this.f14866a = getChildAt(1);
                this.f14866a.setOnTouchListener(new OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return PkInviteUserListRefreshLayout.this.f14877l;
                    }
                });
                this.f14867b = this.f14866a.getTop() + getPaddingTop();
            } else {
                throw new IllegalStateException("SwipeRefreshLayout can only host two children");
            }
        }
        if (this.f14883s == -1.0f && getParent() != null && ((View) getParent()).getHeight() > 0) {
            this.f14883s = (float) ((int) Math.min(((float) ((View) getParent()).getHeight()) * 0.6f, getResources().getDisplayMetrics().density * 120.0f));
        }
    }

    public void setOnRefreshListener(C5679b bVar) {
        this.f14868c = bVar;
    }

    public void setmIsDisable(boolean z) {
        this.f14889z = z;
    }

    public PkInviteUserListRefreshLayout(Context context) {
        this(context, null);
    }

    public void setRefreshing(boolean z) {
        if (this.f14870e != z) {
            m12602a();
            this.f14870e = z;
        }
    }

    /* renamed from: a */
    private void m12603a(int i) {
        int top = this.f14866a.getTop();
        float f = (float) i;
        if (f > this.f14883s) {
            i = ((int) this.f14883s) + (((int) (f - this.f14883s)) / 2);
        } else if (i < 0) {
            i = 0;
        }
        setTargetOffsetTopAndBottom(i - top);
    }

    public void setTargetOffsetTopAndBottom(int i) {
        this.f14866a.offsetTopAndBottom(i);
        this.f14888y.offsetTopAndBottom(i);
        this.f14872g = this.f14866a.getTop();
        invalidate();
    }

    /* renamed from: a */
    private void m12604a(MotionEvent motionEvent) {
        int i;
        int b = C1044i.m2983b(motionEvent);
        if (C1044i.m2984b(motionEvent, b) == this.f14887w) {
            if (b == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f14885u = C1044i.m2986d(motionEvent, i);
            this.f14887w = C1044i.m2984b(motionEvent, i);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f14889z) {
            return false;
        }
        m12602a();
        int a = C1044i.m2981a(motionEvent);
        if (this.f14873h && a == 0) {
            this.f14873h = false;
        }
        if (!isEnabled() || this.f14873h || m12605b()) {
            return false;
        }
        if (a != 6) {
            switch (a) {
                case 0:
                    float y = motionEvent.getY();
                    this.f14884t = y;
                    this.f14885u = y;
                    this.f14887w = C1044i.m2984b(motionEvent, 0);
                    this.f14886v = false;
                    break;
                case 1:
                case 3:
                    this.f14886v = false;
                    this.f14887w = -1;
                    break;
                case 2:
                    if (this.f14887w != -1) {
                        int a2 = C1044i.m2982a(motionEvent, this.f14887w);
                        if (a2 >= 0) {
                            float d = C1044i.m2986d(motionEvent, a2);
                            if (d - this.f14884t > ((float) this.f14882r)) {
                                this.f14885u = d;
                                this.f14886v = true;
                                break;
                            }
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                    break;
            }
        } else {
            m12604a(motionEvent);
        }
        return this.f14886v;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f14889z) {
            return true;
        }
        int a = C1044i.m2981a(motionEvent);
        if (this.f14873h && a == 0) {
            this.f14873h = false;
        }
        if (!isEnabled() || this.f14873h || m12605b()) {
            return false;
        }
        switch (a) {
            case 0:
                float y = motionEvent.getY();
                this.f14884t = y;
                this.f14885u = y;
                this.f14887w = C1044i.m2984b(motionEvent, 0);
                this.f14886v = false;
                break;
            case 1:
                if (this.f14876k == C5680c.LOOSEN) {
                    removeCallbacks(this.f14865C);
                    this.f14864B.run();
                    setRefreshing(true);
                    this.f14877l = true;
                    if (this.f14868c != null) {
                        this.f14868c.mo11264b();
                    }
                } else {
                    m12606c();
                }
                this.f14886v = false;
                this.f14887w = -1;
                return false;
            case 2:
                int a2 = C1044i.m2982a(motionEvent, this.f14887w);
                if (a2 >= 0) {
                    float d = C1044i.m2986d(motionEvent, a2);
                    float f = d - this.f14884t;
                    if (!this.f14886v && f > ((float) this.f14882r)) {
                        this.f14886v = true;
                    }
                    if (this.f14886v) {
                        if (this.f14868c != null) {
                            this.f14868c.mo11263a();
                        }
                        if (f > this.f14883s) {
                            if (this.f14876k == C5680c.NORMAL) {
                                this.f14876k = C5680c.LOOSEN;
                            }
                            m12603a((int) f);
                        } else {
                            if (this.f14876k == C5680c.LOOSEN) {
                                this.f14876k = C5680c.NORMAL;
                            }
                            m12603a((int) f);
                            if (this.f14885u > d && this.f14866a.getTop() == getPaddingTop()) {
                                removeCallbacks(this.f14865C);
                            }
                        }
                        this.f14885u = d;
                        break;
                    }
                } else {
                    return false;
                }
                break;
            case 3:
                m12606c();
                this.f14886v = false;
                this.f14887w = -1;
                return false;
            case 5:
                int b = C1044i.m2983b(motionEvent);
                this.f14885u = C1044i.m2986d(motionEvent, b);
                this.f14887w = C1044i.m2984b(motionEvent, b);
                break;
            case 6:
                m12604a(motionEvent);
                break;
        }
        return true;
    }

    public PkInviteUserListRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14883s = -1.0f;
        this.f14887w = -1;
        this.f14876k = C5680c.NORMAL;
        this.f14863A = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                int i;
                if (PkInviteUserListRefreshLayout.this.f14869d != PkInviteUserListRefreshLayout.this.f14867b) {
                    i = ((int) (((float) (PkInviteUserListRefreshLayout.this.f14867b - PkInviteUserListRefreshLayout.this.f14869d)) * f)) + PkInviteUserListRefreshLayout.this.f14869d;
                } else {
                    i = 0;
                }
                int top = i - PkInviteUserListRefreshLayout.this.f14866a.getTop();
                int top2 = PkInviteUserListRefreshLayout.this.f14866a.getTop();
                if (top + top2 < 0) {
                    top = 0 - top2;
                }
                PkInviteUserListRefreshLayout.this.setTargetOffsetTopAndBottom(top);
            }
        };
        this.f14878m = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                int i;
                if (PkInviteUserListRefreshLayout.this.f14869d != PkInviteUserListRefreshLayout.this.f14875j) {
                    i = ((int) (((float) (PkInviteUserListRefreshLayout.this.f14875j - PkInviteUserListRefreshLayout.this.f14869d)) * f)) + PkInviteUserListRefreshLayout.this.f14869d;
                } else {
                    i = 0;
                }
                int top = i - PkInviteUserListRefreshLayout.this.f14866a.getTop();
                int top2 = PkInviteUserListRefreshLayout.this.f14866a.getTop();
                if (top + top2 < 0) {
                    top = 0 - top2;
                }
                PkInviteUserListRefreshLayout.this.setTargetOffsetTopAndBottom(top);
            }
        };
        this.f14879n = new C5678a() {
            public final void onAnimationEnd(Animation animation) {
                PkInviteUserListRefreshLayout.this.f14872g = 0;
                PkInviteUserListRefreshLayout.this.f14876k = C5680c.NORMAL;
                PkInviteUserListRefreshLayout.this.f14877l = false;
                PkInviteUserListRefreshLayout.this.f14868c.mo11265c();
            }
        };
        this.f14880o = new C5678a() {
            public final void onAnimationEnd(Animation animation) {
                PkInviteUserListRefreshLayout.this.f14872g = PkInviteUserListRefreshLayout.this.f14875j;
                PkInviteUserListRefreshLayout.this.f14876k = C5680c.REFRESHING;
            }
        };
        this.f14881p = new Runnable() {
            public final void run() {
                PkInviteUserListRefreshLayout.this.f14873h = true;
                PkInviteUserListRefreshLayout.this.mo11552a(PkInviteUserListRefreshLayout.this.f14872g + PkInviteUserListRefreshLayout.this.getPaddingTop(), PkInviteUserListRefreshLayout.this.f14879n);
            }
        };
        this.f14864B = new Runnable() {
            public final void run() {
                PkInviteUserListRefreshLayout.this.f14873h = true;
                PkInviteUserListRefreshLayout pkInviteUserListRefreshLayout = PkInviteUserListRefreshLayout.this;
                int paddingTop = PkInviteUserListRefreshLayout.this.f14872g + PkInviteUserListRefreshLayout.this.getPaddingTop();
                AnimationListener animationListener = PkInviteUserListRefreshLayout.this.f14880o;
                pkInviteUserListRefreshLayout.f14869d = paddingTop;
                pkInviteUserListRefreshLayout.f14878m.reset();
                pkInviteUserListRefreshLayout.f14878m.setDuration((long) pkInviteUserListRefreshLayout.f14871f);
                pkInviteUserListRefreshLayout.f14878m.setAnimationListener(animationListener);
                pkInviteUserListRefreshLayout.f14878m.setInterpolator(pkInviteUserListRefreshLayout.f14874i);
                pkInviteUserListRefreshLayout.f14866a.startAnimation(pkInviteUserListRefreshLayout.f14878m);
            }
        };
        this.f14865C = new Runnable() {
            public final void run() {
                PkInviteUserListRefreshLayout.this.f14873h = true;
                PkInviteUserListRefreshLayout.this.mo11552a(PkInviteUserListRefreshLayout.this.f14872g + PkInviteUserListRefreshLayout.this.getPaddingTop(), PkInviteUserListRefreshLayout.this.f14879n);
            }
        };
        this.f14882r = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f14871f = getResources().getInteger(17694721);
        this.f14874i = new DecelerateInterpolator(2.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f14862x);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getChildCount() <= 1) {
            throw new IllegalStateException("SwipeRefreshLayout must have the headerview and contentview");
        } else if (getChildCount() <= 2 || isInEditMode()) {
            if (this.f14888y == null) {
                this.f14888y = getChildAt(0);
                measureChild(this.f14888y, i, i2);
                this.f14875j = this.f14888y.getMeasuredHeight();
                this.f14883s = (float) this.f14875j;
            }
            getChildAt(1).measure(MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        } else {
            throw new IllegalStateException("SwipeRefreshLayout can only host two children");
        }
    }

    /* renamed from: a */
    public final void mo11552a(int i, AnimationListener animationListener) {
        this.f14869d = i;
        this.f14863A.reset();
        this.f14863A.setDuration((long) this.f14871f);
        this.f14863A.setAnimationListener(animationListener);
        this.f14863A.setInterpolator(this.f14874i);
        this.f14866a.startAnimation(this.f14863A);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0 && getChildCount() != 1) {
            View childAt = getChildAt(1);
            int paddingLeft = getPaddingLeft();
            int paddingTop = this.f14872g + getPaddingTop();
            int paddingLeft2 = ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft;
            childAt.layout(paddingLeft, paddingTop, paddingLeft2, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
            this.f14888y.layout(paddingLeft, paddingTop - this.f14875j, paddingLeft2, paddingTop);
        }
    }
}
