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
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.ies.uikit.base.C11079a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26423bh;
import com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.C26988b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout */
public class DampScrollableLayout extends LinearLayout {

    /* renamed from: a */
    public static final String f71134a = "DampScrollableLayout";

    /* renamed from: A */
    protected int f71135A;

    /* renamed from: B */
    protected boolean f71136B;

    /* renamed from: C */
    protected int f71137C;

    /* renamed from: D */
    protected int f71138D;

    /* renamed from: E */
    protected int f71139E;

    /* renamed from: F */
    protected int f71140F;

    /* renamed from: G */
    protected int f71141G;

    /* renamed from: H */
    protected boolean f71142H;

    /* renamed from: I */
    protected int f71143I;

    /* renamed from: J */
    public C26423bh f71144J;

    /* renamed from: K */
    protected boolean f71145K;

    /* renamed from: L */
    protected C26988b f71146L;

    /* renamed from: M */
    protected C26990b f71147M;

    /* renamed from: N */
    protected boolean f71148N;

    /* renamed from: O */
    private boolean f71149O;

    /* renamed from: P */
    private List<C26988b> f71150P;

    /* renamed from: b */
    protected Context f71151b;

    /* renamed from: c */
    protected Scroller f71152c;

    /* renamed from: d */
    protected float f71153d;

    /* renamed from: e */
    protected float f71154e;

    /* renamed from: f */
    protected float f71155f;

    /* renamed from: g */
    protected float f71156g;

    /* renamed from: h */
    protected VelocityTracker f71157h;

    /* renamed from: i */
    protected int f71158i;

    /* renamed from: j */
    protected int f71159j;

    /* renamed from: k */
    protected int f71160k;

    /* renamed from: l */
    protected boolean f71161l;

    /* renamed from: m */
    protected float f71162m;

    /* renamed from: n */
    protected float f71163n;

    /* renamed from: o */
    protected float f71164o;

    /* renamed from: p */
    protected float f71165p;

    /* renamed from: q */
    protected float f71166q;

    /* renamed from: r */
    protected float f71167r;

    /* renamed from: s */
    protected View f71168s;

    /* renamed from: t */
    protected ViewPager f71169t;

    /* renamed from: u */
    protected C26986a f71170u;

    /* renamed from: v */
    protected int f71171v;

    /* renamed from: w */
    protected int f71172w;

    /* renamed from: x */
    protected int f71173x;

    /* renamed from: y */
    protected boolean f71174y;

    /* renamed from: z */
    protected boolean f71175z;

    /* renamed from: com.ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout$a */
    public enum C26986a {
        UP,
        DOWN
    }

    /* renamed from: b */
    private static int m65153b(int i, int i2) {
        return i - i2;
    }

    public int getCurScrollY() {
        return this.f71141G;
    }

    public C26990b getHelper() {
        return this.f71147M;
    }

    public int getMaxY() {
        return this.f71138D;
    }

    public int getMinY() {
        return this.f71137C;
    }

    public int getTabsMarginTop() {
        return this.f71140F;
    }

    /* renamed from: c */
    private void m65154c() {
        this.f71152c.forceFinished(true);
    }

    /* renamed from: b */
    public boolean mo55099b() {
        if (this.f71141G >= this.f71138D) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo55098a() {
        if (this.f71141G != 0) {
            scrollTo(0, 0);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        if (this.f71168s != null && !this.f71168s.isClickable()) {
            this.f71168s.setClickable(true);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null && (childAt instanceof ViewPager)) {
                this.f71169t = (ViewPager) childAt;
            }
        }
        super.onFinishInflate();
    }

    public void computeScroll() {
        if (this.f71152c.computeScrollOffset()) {
            int currY = this.f71152c.getCurrY();
            if (this.f71170u == C26986a.UP) {
                if (mo55099b()) {
                    int finalY = this.f71152c.getFinalY() - currY;
                    int b = m65153b(this.f71152c.getDuration(), this.f71152c.timePassed());
                    this.f71147M.mo55138a(m65152a(finalY, b), finalY, b);
                    m65154c();
                    return;
                }
                scrollTo(0, currY);
            } else if (this.f71147M.mo55139b()) {
                scrollTo(0, getScrollY() + (currY - this.f71135A));
                if ((Math.abs(m65152a(this.f71152c.getFinalY() - currY, m65153b(this.f71152c.getDuration(), this.f71152c.timePassed()))) <= 0 || Math.abs(Math.max(this.f71152c.getFinalY(), this.f71137C) - this.f71141G) < 5) && this.f71141G < this.f71139E) {
                    this.f71152c.abortAnimation();
                    this.f71152c.startScroll(0, this.f71141G, 0, -this.f71141G, Math.abs(this.f71141G) * 2);
                    this.f71170u = C26986a.UP;
                    return;
                } else if (this.f71141G <= this.f71137C) {
                    m65154c();
                    return;
                }
            }
            invalidate();
            this.f71135A = currY;
        }
    }

    public void setMinY(int i) {
        this.f71137C = i;
    }

    public void setOnScrollListener(C26988b bVar) {
        this.f71146L = bVar;
    }

    public void setScrollMinY(int i) {
        this.f71143I = i;
    }

    public DampScrollableLayout(Context context) {
        this(context, null);
    }

    public void setTabsMarginTop(int i) {
        this.f71140F = i;
        this.f71149O = true;
    }

    public void setMaxScrollHeight(int i) {
        this.f71138D = Math.min(i, this.f71171v - this.f71140F);
        this.f71138D = Math.max(this.f71138D, 0);
    }

    public void setCanScrollUp(boolean z) {
        if (z) {
            this.f71138D = this.f71171v - this.f71140F;
        }
        if (this.f71149O || this.f71145K != z) {
            this.f71145K = z;
            if (!this.f71145K) {
                if (this.f71141G != 0) {
                    scrollTo(0, 0);
                }
                this.f71138D = 0;
            }
            this.f71149O = false;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C26986a aVar;
        boolean z;
        MotionEvent motionEvent2 = motionEvent;
        if (this.f71144J != null && this.f71144J.mo54134a(motionEvent2)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        try {
            if (motionEvent.getActionIndex() != 0) {
                return true;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int abs = (int) Math.abs(x - this.f71153d);
            int abs2 = (int) Math.abs(y - this.f71154e);
            boolean z2 = false;
            switch (motionEvent.getAction() & NormalGiftView.ALPHA_255) {
                case 0:
                case 5:
                    this.f71136B = false;
                    this.f71161l = false;
                    this.f71162m = motionEvent.getRawX();
                    this.f71163n = motionEvent.getRawY();
                    this.f71174y = true;
                    this.f71175z = true;
                    this.f71153d = x;
                    this.f71154e = y;
                    this.f71155f = x;
                    this.f71156g = y;
                    this.f71172w = getScrollY();
                    if (((int) y) + getScrollY() <= this.f71171v) {
                        z2 = true;
                    }
                    this.f71142H = z2;
                    if (this.f71157h == null) {
                        this.f71157h = VelocityTracker.obtain();
                    } else {
                        this.f71157h.clear();
                    }
                    this.f71157h.addMovement(motionEvent2);
                    m65154c();
                    break;
                case 1:
                case 3:
                case 6:
                    if (this.f71146L != null) {
                        this.f71146L.ap_();
                    }
                    for (C26988b ap_ : this.f71150P) {
                        ap_.ap_();
                    }
                    if (this.f71175z && ((abs2 > abs || this.f71141G < 0) && abs2 > this.f71158i)) {
                        if (getScrollY() < 0) {
                            this.f71170u = C26986a.UP;
                            this.f71152c.startScroll(0, getScrollY(), 0, -getScrollY(), -getScrollY());
                            this.f71152c.computeScrollOffset();
                            this.f71135A = getScrollY();
                            invalidate();
                        } else {
                            this.f71157h.computeCurrentVelocity(1000, (float) this.f71160k);
                            float f = -this.f71157h.getYVelocity();
                            if (Math.abs(f) > ((float) this.f71159j)) {
                                if (f > 0.0f) {
                                    aVar = C26986a.UP;
                                } else {
                                    aVar = C26986a.DOWN;
                                }
                                this.f71170u = aVar;
                                if (this.f71170u == C26986a.UP && mo55099b()) {
                                    z2 = true;
                                }
                                if (!z2) {
                                    this.f71152c.fling(0, getScrollY(), 0, (int) f, 0, 0, -2147483647, Integer.MAX_VALUE);
                                    this.f71135A = getScrollY();
                                    invalidate();
                                }
                            }
                        }
                        if (this.f71142H || !mo55099b()) {
                            int action = motionEvent.getAction();
                            motionEvent2.setAction(3);
                            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                            motionEvent2.setAction(action);
                            return dispatchTouchEvent;
                        }
                    }
                case 2:
                    if (!this.f71136B) {
                        if (this.f71157h == null) {
                            this.f71157h = VelocityTracker.obtain();
                        }
                        this.f71157h.addMovement(motionEvent2);
                        float f2 = this.f71156g - y;
                        if (this.f71146L != null) {
                            this.f71146L.mo50607a(this.f71155f - x, f2);
                        }
                        for (C26988b a : this.f71150P) {
                            a.mo50607a(this.f71155f - x, f2);
                        }
                        if (this.f71174y) {
                            if (abs > this.f71158i && abs > abs2) {
                                this.f71174y = false;
                                this.f71175z = false;
                            } else if (abs2 > this.f71158i && abs2 > abs) {
                                this.f71174y = false;
                                this.f71175z = true;
                            }
                        }
                        StringBuilder sb = new StringBuilder("shift: ");
                        if (abs2 > this.f71158i) {
                            z = true;
                        } else {
                            z = false;
                        }
                        sb.append(z);
                        new StringBuilder("stick: ").append(!mo55099b());
                        if (this.f71175z && abs2 > this.f71158i && abs2 > abs && (!mo55099b() || this.f71147M.mo55139b())) {
                            if (this.f71169t != null) {
                                this.f71169t.requestDisallowInterceptTouchEvent(true);
                            }
                            double d = (double) f2;
                            Double.isNaN(d);
                            scrollBy(0, (int) (d + 0.5d));
                        }
                        this.f71155f = x;
                        this.f71156g = y;
                        this.f71164o = motionEvent.getRawX();
                        this.f71165p = motionEvent.getRawY();
                        this.f71166q = (float) ((int) (this.f71164o - this.f71162m));
                        this.f71167r = (float) ((int) (this.f71165p - this.f71163n));
                        if (Math.abs(this.f71167r) > ((float) this.f71143I)) {
                            double abs3 = (double) Math.abs(this.f71167r);
                            Double.isNaN(abs3);
                            if (abs3 * 0.1d > ((double) Math.abs(this.f71166q))) {
                                this.f71161l = false;
                                break;
                            }
                        }
                        this.f71161l = true;
                        break;
                    }
                    break;
            }
            super.dispatchTouchEvent(motionEvent);
            return true;
        } catch (IllegalArgumentException unused) {
        }
    }

    public DampScrollableLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private int m65152a(int i, int i2) {
        if (this.f71152c == null || i2 == 0) {
            return 0;
        }
        return i / i2;
    }

    public void scrollBy(int i, int i2) {
        int scrollY = getScrollY();
        if (i2 < 0) {
            int i3 = scrollY + i2;
            if (i3 < this.f71139E) {
                i2 = (int) (((float) i2) * 1.2f * (1.0f - ((1.0f / ((float) this.f71137C)) * ((float) i3))));
            }
        }
        int i4 = i2 + scrollY;
        if (i4 >= this.f71138D) {
            i4 = this.f71138D;
        } else if (i4 <= this.f71137C) {
            i4 = this.f71137C;
        }
        super.scrollBy(i, i4 - scrollY);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.f71168s = getChildAt(0);
        if (this.f71168s != null) {
            measureChildWithMargins(this.f71168s, i, 0, 0, 0);
            this.f71171v = this.f71168s.getMeasuredHeight();
        }
        super.onMeasure(i, MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i2) + (this.f71171v - this.f71140F), 1073741824));
        if (!this.f71148N) {
            this.f71138D = this.f71171v - this.f71140F;
            this.f71148N = true;
        }
        if (!this.f71145K) {
            this.f71138D = 0;
        }
    }

    public void scrollTo(int i, int i2) {
        if (i2 >= this.f71138D) {
            i2 = this.f71138D;
        } else if (i2 <= this.f71137C) {
            i2 = this.f71137C;
        }
        this.f71141G = i2;
        if (this.f71146L != null && (!(this.f71146L instanceof C11079a) || ((C11079a) this.f71146L).isViewValid())) {
            this.f71146L.mo50613b(i2, this.f71138D);
        }
        for (C26988b b : this.f71150P) {
            b.mo50613b(i2, this.f71138D);
        }
        super.scrollTo(i, i2);
    }

    public DampScrollableLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f71143I = 10;
        this.f71145K = true;
        this.f71150P = new ArrayList();
        this.f71148N = false;
        this.f71151b = context;
        this.f71147M = new C26990b();
        this.f71152c = new Scroller(context);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f71158i = viewConfiguration.getScaledTouchSlop();
        this.f71159j = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f71160k = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f71173x = VERSION.SDK_INT;
        setOrientation(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a5d});
        this.f71140F = (int) obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
    }
}
