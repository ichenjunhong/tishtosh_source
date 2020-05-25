package com.p683ss.android.ugc.aweme.common.widget.scrollablelayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.p030v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import android.widget.Scroller;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout */
public class ScrollableLayout extends LinearLayout {

    /* renamed from: A */
    protected boolean f71178A;

    /* renamed from: B */
    protected int f71179B;

    /* renamed from: C */
    protected int f71180C;

    /* renamed from: D */
    protected int f71181D;

    /* renamed from: E */
    protected int f71182E;

    /* renamed from: F */
    protected boolean f71183F;

    /* renamed from: G */
    protected int f71184G;

    /* renamed from: H */
    protected boolean f71185H;

    /* renamed from: I */
    protected C26988b f71186I;

    /* renamed from: J */
    protected C26990b f71187J;

    /* renamed from: K */
    protected boolean f71188K;

    /* renamed from: L */
    int f71189L;

    /* renamed from: a */
    protected Context f71190a;

    /* renamed from: b */
    protected Scroller f71191b;

    /* renamed from: c */
    protected float f71192c;

    /* renamed from: d */
    protected float f71193d;

    /* renamed from: e */
    protected float f71194e;

    /* renamed from: f */
    protected float f71195f;

    /* renamed from: g */
    protected VelocityTracker f71196g;

    /* renamed from: h */
    protected int f71197h;

    /* renamed from: i */
    protected int f71198i;

    /* renamed from: j */
    protected int f71199j;

    /* renamed from: k */
    protected boolean f71200k;

    /* renamed from: l */
    protected float f71201l;

    /* renamed from: m */
    protected float f71202m;

    /* renamed from: n */
    protected float f71203n;

    /* renamed from: o */
    protected float f71204o;

    /* renamed from: p */
    protected float f71205p;

    /* renamed from: q */
    protected float f71206q;

    /* renamed from: r */
    protected View f71207r;

    /* renamed from: s */
    protected ViewPager f71208s;

    /* renamed from: t */
    protected C26987a f71209t;

    /* renamed from: u */
    protected int f71210u;

    /* renamed from: v */
    protected int f71211v;

    /* renamed from: w */
    protected int f71212w;

    /* renamed from: x */
    protected boolean f71213x;

    /* renamed from: y */
    protected boolean f71214y;

    /* renamed from: z */
    protected int f71215z;

    /* renamed from: com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout$a */
    public enum C26987a {
        UP,
        DOWN
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout$b */
    public interface C26988b {
        /* renamed from: a */
        void mo50607a(float f, float f2);

        boolean ap_();

        /* renamed from: b */
        void mo50613b(int i, int i2);
    }

    public int getCurScrollY() {
        return this.f71182E;
    }

    public C26990b getHelper() {
        return this.f71187J;
    }

    public int getMaxY() {
        return this.f71180C;
    }

    public int getMinY() {
        return this.f71179B;
    }

    public int getTabsMarginTop() {
        return this.f71181D;
    }

    /* renamed from: a */
    public final void mo55117a() {
        if (this.f71182E != 0) {
            scrollTo(0, 0);
        }
    }

    /* renamed from: b */
    public final boolean mo55118b() {
        if (this.f71182E >= this.f71180C) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        if (this.f71207r != null && !this.f71207r.isClickable()) {
            this.f71207r.setClickable(true);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null && (childAt instanceof ViewPager)) {
                this.f71208s = (ViewPager) childAt;
            }
        }
        super.onFinishInflate();
    }

    public void computeScroll() {
        if (this.f71191b.computeScrollOffset()) {
            int currY = this.f71191b.getCurrY();
            int i = 0;
            if (this.f71209t != C26987a.UP) {
                if (this.f71187J.mo55139b()) {
                    scrollTo(0, getScrollY() + (currY - this.f71215z));
                    if (this.f71182E <= this.f71179B) {
                        this.f71191b.forceFinished(true);
                        return;
                    }
                }
                invalidate();
            } else if (mo55118b()) {
                int finalY = this.f71191b.getFinalY() - currY;
                int duration = this.f71191b.getDuration() - this.f71191b.timePassed();
                C26990b bVar = this.f71187J;
                if (this.f71191b != null) {
                    if (this.f71212w >= 14) {
                        i = (int) this.f71191b.getCurrVelocity();
                    } else {
                        i = finalY / duration;
                    }
                }
                bVar.mo55138a(i, finalY, duration);
                this.f71191b.forceFinished(true);
                return;
            } else {
                scrollTo(0, currY);
            }
            this.f71215z = currY;
        }
    }

    public void setMinY(int i) {
        this.f71179B = i;
    }

    public void setOnScrollListener(C26988b bVar) {
        this.f71186I = bVar;
    }

    public void setScrollMinY(int i) {
        this.f71184G = i;
    }

    public void setTabsMarginTop(int i) {
        this.f71181D = i;
    }

    public ScrollableLayout(Context context) {
        this(context, null);
    }

    public void setCanScrollUp(boolean z) {
        if (this.f71185H != z) {
            this.f71185H = z;
            if (this.f71185H) {
                this.f71180C = this.f71210u - this.f71181D;
                return;
            }
            if (this.f71182E != 0) {
                scrollTo(0, 0);
            }
            this.f71180C = 0;
        }
    }

    public void setMaxScrollHeight(int i) {
        this.f71180C = Math.min(i, this.f71210u - this.f71181D);
        this.f71180C = Math.max(this.f71180C, 0);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C26987a aVar;
        MotionEvent motionEvent2 = motionEvent;
        try {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int abs = (int) Math.abs(x - this.f71192c);
            int abs2 = (int) Math.abs(y - this.f71193d);
            boolean z = false;
            switch (motionEvent.getAction()) {
                case 0:
                    this.f71178A = false;
                    this.f71200k = false;
                    this.f71201l = motionEvent.getRawX();
                    this.f71202m = motionEvent.getRawY();
                    this.f71213x = true;
                    this.f71214y = true;
                    this.f71192c = x;
                    this.f71193d = y;
                    this.f71194e = x;
                    this.f71195f = y;
                    this.f71211v = getScrollY();
                    if (((int) y) + getScrollY() <= this.f71210u) {
                        z = true;
                    }
                    this.f71183F = z;
                    if (this.f71196g == null) {
                        this.f71196g = VelocityTracker.obtain();
                    } else {
                        this.f71196g.clear();
                    }
                    this.f71196g.addMovement(motionEvent2);
                    this.f71191b.forceFinished(true);
                    break;
                case 1:
                    if (this.f71186I != null) {
                        this.f71186I.ap_();
                    }
                    if (this.f71214y && abs2 > abs && abs2 > this.f71197h) {
                        this.f71196g.computeCurrentVelocity(1000, (float) this.f71199j);
                        float f = -this.f71196g.getYVelocity();
                        if (Math.abs(f) > ((float) this.f71198i)) {
                            if (f > 0.0f) {
                                aVar = C26987a.UP;
                            } else {
                                aVar = C26987a.DOWN;
                            }
                            this.f71209t = aVar;
                            if (this.f71209t != C26987a.UP || !mo55118b()) {
                                this.f71191b.fling(0, getScrollY(), 0, (int) f, 0, 0, -2147483647, Integer.MAX_VALUE);
                                this.f71191b.computeScrollOffset();
                                this.f71215z = getScrollY();
                                invalidate();
                            }
                        }
                        if (this.f71183F || !mo55118b()) {
                            int action = motionEvent.getAction();
                            motionEvent2.setAction(3);
                            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                            motionEvent2.setAction(action);
                            return dispatchTouchEvent;
                        }
                    }
                case 2:
                    if (!this.f71178A) {
                        if (this.f71196g == null) {
                            this.f71196g = VelocityTracker.obtain();
                        }
                        this.f71196g.addMovement(motionEvent2);
                        float f2 = this.f71195f - y;
                        if (this.f71186I != null) {
                            this.f71186I.mo50607a(this.f71194e - x, f2);
                        }
                        if (this.f71213x) {
                            if (abs > this.f71197h && abs > abs2) {
                                this.f71213x = false;
                                this.f71214y = false;
                            } else if (abs2 > this.f71197h && abs2 > abs) {
                                this.f71213x = false;
                                this.f71214y = true;
                            }
                        }
                        if (this.f71214y && abs2 > this.f71197h && abs2 > abs && (!mo55118b() || this.f71187J.mo55139b())) {
                            if (this.f71208s != null) {
                                this.f71208s.requestDisallowInterceptTouchEvent(true);
                            }
                            scrollBy(0, (int) (f2 + 0.5f));
                        }
                        this.f71194e = x;
                        this.f71195f = y;
                        this.f71203n = motionEvent.getRawX();
                        this.f71204o = motionEvent.getRawY();
                        this.f71205p = (float) ((int) (this.f71203n - this.f71201l));
                        this.f71206q = (float) ((int) (this.f71204o - this.f71202m));
                        if (Math.abs(this.f71206q) > ((float) this.f71184G) && Math.abs(this.f71206q) * 0.1f > Math.abs(this.f71205p)) {
                            this.f71200k = false;
                            break;
                        } else {
                            this.f71200k = true;
                            break;
                        }
                    }
                    break;
                case 3:
                    if (this.f71186I != null) {
                        this.f71186I.ap_();
                    }
                    if (this.f71214y && this.f71183F && (abs > this.f71197h || abs2 > this.f71197h)) {
                        int action2 = motionEvent.getAction();
                        motionEvent2.setAction(3);
                        boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
                        motionEvent2.setAction(action2);
                        return dispatchTouchEvent2;
                    }
            }
            super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
        }
        return true;
    }

    public ScrollableLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void scrollBy(int i, int i2) {
        int scrollY = getScrollY();
        if (scrollY + i2 < this.f71189L) {
            i2 /= 3;
        }
        int i3 = i2 + scrollY;
        if (i3 >= this.f71180C) {
            i3 = this.f71180C;
        } else if (i3 <= this.f71179B) {
            i3 = this.f71179B;
        }
        super.scrollBy(i, i3 - scrollY);
    }

    public void scrollTo(int i, int i2) {
        if (i2 >= this.f71180C) {
            i2 = this.f71180C;
        } else if (i2 <= this.f71179B) {
            i2 = this.f71179B;
        }
        this.f71182E = i2;
        if (this.f71186I != null) {
            this.f71186I.mo50613b(i2, this.f71180C);
        }
        super.scrollTo(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.f71207r = getChildAt(0);
        if (this.f71207r != null) {
            measureChildWithMargins(this.f71207r, i, 0, 0, 0);
            this.f71210u = this.f71207r.getMeasuredHeight();
        }
        super.onMeasure(i, MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i2) + (this.f71210u - this.f71181D), 1073741824));
        if (!this.f71188K) {
            this.f71180C = this.f71210u - this.f71181D;
            this.f71188K = true;
        }
        if (!this.f71185H) {
            this.f71180C = 0;
        }
    }

    public ScrollableLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f71184G = 10;
        this.f71185H = true;
        this.f71190a = context;
        this.f71187J = new C26990b();
        this.f71191b = new Scroller(context);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f71197h = viewConfiguration.getScaledTouchSlop();
        this.f71198i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f71199j = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f71212w = VERSION.SDK_INT;
        setOrientation(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a5d});
        this.f71181D = (int) obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
    }
}
