package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.HorizontalScrollView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23696j;
import com.p683ss.android.ugc.aweme.base.utils.C23716e;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30457j;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30458k;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30459l;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout */
public class SlideSwitchLayout extends HorizontalScrollView {

    /* renamed from: d */
    public static final int f80483d = C23724k.m58226c(C11010c.m22280a());

    /* renamed from: f */
    public static final int f80484f = ((int) C9432q.m18687b(C11010c.m22280a(), 8.0f));

    /* renamed from: q */
    private static final int f80485q = ViewConfiguration.getMaximumFlingVelocity();

    /* renamed from: x */
    private static final int f80486x = ((int) C9432q.m18687b(C11010c.m22280a(), 500.0f));

    /* renamed from: A */
    private Runnable f80487A;

    /* renamed from: B */
    private C23696j f80488B;

    /* renamed from: C */
    private C30459l f80489C;

    /* renamed from: D */
    private C30458k f80490D;

    /* renamed from: a */
    public int f80491a;

    /* renamed from: b */
    boolean f80492b;

    /* renamed from: c */
    public List<C30729a> f80493c;

    /* renamed from: e */
    public boolean f80494e;

    /* renamed from: g */
    public long f80495g;

    /* renamed from: h */
    public boolean f80496h;

    /* renamed from: i */
    public int f80497i;

    /* renamed from: j */
    public int f80498j;

    /* renamed from: k */
    boolean f80499k;

    /* renamed from: l */
    public C30457j f80500l;

    /* renamed from: m */
    private boolean f80501m;

    /* renamed from: n */
    private int f80502n;

    /* renamed from: o */
    private int f80503o;

    /* renamed from: p */
    private VelocityTracker f80504p;

    /* renamed from: r */
    private int f80505r;

    /* renamed from: s */
    private int f80506s;

    /* renamed from: t */
    private int f80507t;

    /* renamed from: u */
    private boolean f80508u;

    /* renamed from: v */
    private boolean f80509v;

    /* renamed from: w */
    private boolean f80510w;

    /* renamed from: y */
    private boolean f80511y;

    /* renamed from: z */
    private boolean f80512z;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout$a */
    public static class C30729a {

        /* renamed from: a */
        public int f80518a;

        /* renamed from: b */
        public String f80519b;

        /* renamed from: c */
        public boolean f80520c = true;

        public final int hashCode() {
            return this.f80519b.hashCode();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C30729a)) {
                return false;
            }
            return this.f80519b.equals(((C30729a) obj).f80519b);
        }

        public C30729a(String str, int i) {
            this.f80519b = str;
            this.f80518a = i;
        }
    }

    public void fling(int i) {
    }

    public int getCurrentItem() {
        return this.f80498j;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f80504p = VelocityTracker.obtain();
    }

    public String getCurrentItemName() {
        if (this.f80493c.isEmpty()) {
            return "";
        }
        return ((C30729a) this.f80493c.get(this.f80498j)).f80519b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo63372a() {
        m72045c(this.f80498j);
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
    }

    public void setCanScroll(boolean z) {
        this.f80494e = z;
    }

    public void setOnFeedScrollListener(C30458k kVar) {
        this.f80490D = kVar;
    }

    public void setOnFlingEndListener(C23696j jVar) {
        this.f80488B = jVar;
    }

    public void setOnFlingToIndexListener(C30459l lVar) {
        this.f80489C = lVar;
    }

    public void setOnPageChangeListener(C30457j jVar) {
        this.f80500l = jVar;
    }

    public void setOverScrollLeftAction(Runnable runnable) {
        this.f80487A = runnable;
    }

    public void setScrowToChildWhenRequestChildFocus(boolean z) {
        this.f80501m = z;
    }

    public SlideSwitchLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public static int m72037a(int i) {
        return i * f80483d;
    }

    /* renamed from: c */
    private void m72045c(int i) {
        setScrollX(m72037a(i));
    }

    private void setCurrentItem(int i) {
        m72038a(i, "FROM_SLIDE");
    }

    /* renamed from: b */
    private boolean m72044b(MotionEvent motionEvent) {
        if (!m72047d(motionEvent) || !m72046c(motionEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private boolean m72046c(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        if (this.f80501m) {
            return super.computeScrollDeltaToGetChildRectOnScreen(rect);
        }
        return 0;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            mo63372a();
        }
    }

    public void setCurrentItem(String str) {
        m72040a(str, true, "FROM_SLIDE");
    }

    /* renamed from: a */
    private boolean m72041a(MotionEvent motionEvent) {
        this.f80505r = motionEvent.getPointerId(0);
        this.f80502n = (int) motionEvent.getX();
        this.f80503o = getScrollX();
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: b */
    private boolean m72043b(int i) {
        if (this.f80493c.isEmpty() || i >= this.f80493c.size()) {
            return false;
        }
        return ((C30729a) this.f80493c.get(i)).f80520c;
    }

    public void setCanScrollToProfile(boolean z) {
        C30729a aVar;
        String str = "page_profile";
        int i = 0;
        while (true) {
            if (i >= this.f80493c.size()) {
                aVar = null;
                break;
            }
            aVar = (C30729a) this.f80493c.get(i);
            if (TextUtils.equals(aVar.f80519b, str)) {
                break;
            }
            i++;
        }
        if (aVar != null) {
            aVar.f80520c = z;
        }
    }

    /* renamed from: d */
    private boolean m72047d(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        boolean z3;
        boolean z4;
        int findPointerIndex = motionEvent.findPointerIndex(this.f80505r);
        boolean z5 = false;
        if (findPointerIndex == -1) {
            return false;
        }
        int x = (int) motionEvent.getX(findPointerIndex);
        if (Math.abs(x - this.f80502n) <= f80483d) {
            z = true;
        } else {
            z = false;
        }
        if (x - this.f80502n > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            int i3 = this.f80503o - (x - this.f80502n);
            if (this.f80498j <= 0) {
                i = this.f80498j;
            } else {
                i = this.f80498j - 1;
            }
            if (this.f80498j >= this.f80491a) {
                i2 = this.f80491a;
            } else {
                i2 = this.f80498j + 1;
            }
            if (i3 < 0 || !m72043b(i)) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i3 <= this.f80491a * f80483d && m72043b(i2)) {
                z5 = true;
            }
            if (z2) {
                z4 = z3;
            } else {
                z4 = z5;
            }
            if (!z3 && !this.f80512z && this.f80487A != null) {
                this.f80512z = true;
                this.f80487A.run();
            }
        }
        return z;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f80494e) {
            return false;
        }
        if (this.f80496h) {
            return true;
        }
        if (this.f80495g != 0 && System.currentTimeMillis() - this.f80495g < 150) {
            return this.f80499k;
        }
        if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
            return false;
        }
        this.f80499k = false;
        switch (motionEvent.getAction()) {
            case 0:
                this.f80506s = (int) motionEvent.getX();
                this.f80507t = (int) motionEvent.getY();
                m72041a(motionEvent);
                this.f80510w = true;
                break;
            case 1:
                this.f80499k = false;
                break;
            case 2:
                float abs = Math.abs(((float) this.f80506s) - motionEvent.getX());
                float abs2 = Math.abs(((float) this.f80507t) - motionEvent.getY());
                if ((abs > ((float) f80484f) || abs2 > ((float) f80484f)) && this.f80510w) {
                    if (abs - abs2 >= 0.0f) {
                        this.f80499k = true;
                    } else {
                        this.f80499k = false;
                    }
                    this.f80510w = false;
                    break;
                }
            default:
                this.f80499k = true;
                break;
        }
        return this.f80499k;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        if (!this.f80494e) {
            return false;
        }
        int action = motionEvent.getAction();
        if (this.f80504p == null) {
            this.f80504p = VelocityTracker.obtain();
        }
        this.f80504p.addMovement(motionEvent);
        switch (action) {
            case 0:
                return m72041a(motionEvent);
            case 1:
            case 3:
                int x = (int) motionEvent.getX();
                VelocityTracker velocityTracker = this.f80504p;
                int i2 = 1;
                if (x <= this.f80506s) {
                    z = true;
                } else {
                    z = false;
                }
                velocityTracker.computeCurrentVelocity(1000, (float) f80485q);
                float xVelocity = velocityTracker.getXVelocity(this.f80505r);
                int scrollX = getScrollX() % f80483d;
                if (scrollX != 0) {
                    int scrollX2 = getScrollX() / f80483d;
                    if (Math.abs(xVelocity) < ((float) f80486x)) {
                        if (scrollX <= f80483d / 2) {
                            i2 = 0;
                        }
                        i = scrollX2 + i2;
                    } else {
                        if (xVelocity >= 0.0f) {
                            i2 = 0;
                        }
                        i = scrollX2 + i2;
                    }
                    m72038a(C23716e.m58205a(i, 0, this.f80491a), "FROM_SLIDE");
                    if (this.f80504p != null) {
                        this.f80504p.clear();
                        this.f80504p.recycle();
                        this.f80504p = null;
                    }
                } else if (this.f80488B != null && z) {
                    this.f80488B.mo49121a();
                }
                this.f80511y = false;
                boolean b = m72044b(motionEvent);
                this.f80512z = false;
                return b;
            case 2:
                if (this.f80490D != null) {
                    getScrollX();
                }
                return m72044b(motionEvent);
            default:
                return false;
        }
    }

    public void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
    }

    public SlideSwitchLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m72038a(int i, String str) {
        m72039a(i, true, str);
    }

    public void scrollBy(int i, int i2) {
        if ((-i) != f80483d) {
            super.scrollBy(i, i2);
        }
    }

    /* renamed from: b */
    private void m72042b(final int i, final String str) {
        post(new Runnable() {
            public final void run() {
                SlideSwitchLayout.this.smoothScrollTo(SlideSwitchLayout.m72037a(i), 0);
                SlideSwitchLayout.this.f80495g = System.currentTimeMillis();
                SlideSwitchLayout.this.f80497i = SlideSwitchLayout.this.f80498j;
                SlideSwitchLayout.this.f80498j = i;
            }
        });
        this.f80496h = true;
        postDelayed(new Runnable() {
            public final void run() {
                SlideSwitchLayout.this.f80496h = false;
            }
        }, 150);
    }

    public void requestChildFocus(View view, View view2) {
        if (!(view2 == null || view2.getTag() == null)) {
            Object tag = view2.getTag();
            if ((tag instanceof String) && TextUtils.equals((String) tag, "relation_search_tag")) {
                super.requestChildFocus(view, view2);
                return;
            }
        }
        if (!TextUtils.equals(getCurrentItemName(), "page_feed")) {
            super.requestChildFocus(view, view2);
        }
    }

    /* renamed from: a */
    public final void mo63373a(String str, boolean z) {
        m72040a(str, false, "FROM_SLIDE");
    }

    public SlideSwitchLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f80501m = true;
        this.f80493c = new ArrayList(5);
        this.f80494e = false;
        this.f80508u = true;
        this.f80509v = true;
        this.f80510w = false;
        this.f80496h = false;
        this.f80497i = 0;
        this.f80498j = 0;
        this.f80511y = false;
        this.f80499k = false;
        getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
            public final boolean onPreDraw() {
                SlideSwitchLayout.this.getViewTreeObserver().removeOnPreDrawListener(this);
                SlideSwitchLayout slideSwitchLayout = SlideSwitchLayout.this;
                if (!slideSwitchLayout.f80492b) {
                    slideSwitchLayout.f80492b = true;
                    slideSwitchLayout.mo63372a();
                }
                return false;
            }
        });
    }

    /* renamed from: a */
    private void m72039a(int i, boolean z, String str) {
        if (z) {
            if (!(i == this.f80498j && getScrollX() == m72037a(i))) {
                m72042b(i, str);
            }
        } else if (i != this.f80498j) {
            this.f80497i = this.f80498j;
            this.f80498j = i;
            if (this.f80492b) {
                m72045c(this.f80498j);
            }
        }
    }

    /* renamed from: a */
    private void m72040a(String str, boolean z, String str2) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f80493c.size()) {
                break;
            } else if (TextUtils.equals(str, ((C30729a) this.f80493c.get(i2)).f80519b)) {
                i = i2;
                break;
            } else {
                i2++;
            }
        }
        m72039a(i, z, str2);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }
}
