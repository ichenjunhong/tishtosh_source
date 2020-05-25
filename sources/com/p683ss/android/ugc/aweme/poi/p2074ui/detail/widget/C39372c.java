package com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget;

import android.support.p030v4.p033b.C0703a;
import android.support.p030v4.view.C1056u;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.c */
abstract class C39372c<V extends View> extends C39376f<V> {

    /* renamed from: a */
    private boolean f100718a;

    /* renamed from: b */
    private int f100719b = -1;

    /* renamed from: c */
    Runnable f100720c;

    /* renamed from: d */
    OverScroller f100721d;

    /* renamed from: e */
    private int f100722e;

    /* renamed from: f */
    private int f100723f = -1;

    /* renamed from: g */
    private VelocityTracker f100724g;

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.c$a */
    class C39373a implements Runnable {

        /* renamed from: b */
        private final CoordinatorLayout f100726b;

        /* renamed from: c */
        private final V f100727c;

        public final void run() {
            if (!(this.f100727c == null || C39372c.this.f100721d == null)) {
                if (C39372c.this.f100721d.computeScrollOffset()) {
                    C39372c.this.mo80339a(this.f100726b, this.f100727c, C39372c.this.f100721d.getCurrY(), 1, true);
                    C1056u.m3034a((View) this.f100727c, (Runnable) this);
                    return;
                }
                C39372c.this.mo80222a(this.f100726b, this.f100727c);
            }
        }

        C39373a(CoordinatorLayout coordinatorLayout, V v) {
            this.f100726b = coordinatorLayout;
            this.f100727c = v;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo80222a(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo80223a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo80224a(V v, float f) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo80226b() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo80228c(V v) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo80227c() {
        return getTopAndBottomOffset();
    }

    C39372c() {
    }

    /* renamed from: d */
    private void m87543d() {
        if (this.f100724g == null) {
            this.f100724g = VelocityTracker.obtain();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo80220a(V v) {
        return v.getHeight();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo80225b(V v) {
        return -v.getHeight();
    }

    /* renamed from: a */
    private boolean m87542a(CoordinatorLayout coordinatorLayout) {
        boolean a = mo80223a();
        if (a) {
            mo80226b();
            coordinatorLayout.mo80258a();
        }
        return a;
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f100723f < 0) {
            this.f100723f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getAction() == 2 && this.f100718a) {
            return true;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f100718a = false;
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (mo80228c(v) && coordinatorLayout.mo80263a((View) v, x, y)) {
                    this.f100722e = y;
                    this.f100719b = motionEvent.getPointerId(0);
                    m87543d();
                    break;
                }
            case 1:
            case 3:
                this.f100718a = false;
                this.f100719b = -1;
                if (this.f100724g != null) {
                    this.f100724g.recycle();
                    this.f100724g = null;
                    break;
                }
                break;
            case 2:
                int i = this.f100719b;
                if (i != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex != -1) {
                        int y2 = (int) motionEvent.getY(findPointerIndex);
                        if (Math.abs(y2 - this.f100722e) > this.f100723f && !m87542a(coordinatorLayout)) {
                            this.f100718a = true;
                            this.f100722e = y2;
                            break;
                        }
                    }
                }
                break;
        }
        if (this.f100724g != null) {
            this.f100724g.addMovement(motionEvent);
        }
        return this.f100718a;
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
        V v2 = v;
        MotionEvent motionEvent2 = motionEvent;
        if (this.f100723f < 0) {
            this.f100723f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                int y = (int) motionEvent.getY();
                if (coordinatorLayout2.mo80263a((View) v2, (int) motionEvent.getX(), y) && mo80228c(v2)) {
                    this.f100722e = y;
                    this.f100719b = motionEvent2.getPointerId(0);
                    m87543d();
                    break;
                } else {
                    return false;
                }
            case 1:
                if (this.f100724g != null && !mo80223a()) {
                    this.f100724g.addMovement(motionEvent2);
                    this.f100724g.computeCurrentVelocity(1000);
                    float yVelocity = this.f100724g.getYVelocity(this.f100719b);
                    int i = -mo80220a(v2);
                    if (this.f100720c != null) {
                        v2.removeCallbacks(this.f100720c);
                        this.f100720c = null;
                    }
                    if (!mo80224a(v2, yVelocity)) {
                        if (this.f100721d == null) {
                            this.f100721d = new OverScroller(v.getContext());
                        }
                        this.f100721d.fling(0, getTopAndBottomOffset(), 0, Math.round(yVelocity), 0, 0, i, 0);
                        if (!this.f100721d.computeScrollOffset()) {
                            mo80222a(coordinatorLayout, v);
                            break;
                        } else {
                            this.f100720c = new C39373a(coordinatorLayout2, v2);
                            C1056u.m3034a((View) v2, this.f100720c);
                            break;
                        }
                    }
                }
                break;
            case 2:
                int findPointerIndex = motionEvent2.findPointerIndex(this.f100719b);
                if (findPointerIndex != -1) {
                    int y2 = (int) motionEvent2.getY(findPointerIndex);
                    int i2 = this.f100722e - y2;
                    if (!this.f100718a && Math.abs(i2) > this.f100723f) {
                        if (!m87542a(coordinatorLayout)) {
                            this.f100718a = true;
                        }
                        i2 = i2 > 0 ? i2 - this.f100723f : i2 + this.f100723f;
                    }
                    if (this.f100718a) {
                        this.f100722e = y2;
                        mo80340b(coordinatorLayout, v, i2, mo80225b(v2), 0, 0, true);
                        break;
                    }
                } else {
                    return false;
                }
                break;
            case 3:
                break;
        }
        this.f100718a = false;
        this.f100719b = -1;
        if (this.f100724g != null) {
            this.f100724g.recycle();
            this.f100724g = null;
        }
        if (this.f100724g != null) {
            this.f100724g.addMovement(motionEvent2);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo80339a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, boolean z) {
        return mo80221a(coordinatorLayout, v, i, DynamicTabYellowPointVersion.DEFAULT, Integer.MAX_VALUE, i2, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo80221a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4, boolean z) {
        int topAndBottomOffset = getTopAndBottomOffset();
        if (i2 != 0 && topAndBottomOffset >= i2 && topAndBottomOffset <= i3) {
            int a = C0703a.m2034a(i, i2, i3);
            if (topAndBottomOffset != a) {
                setTopAndBottomOffset(a);
                return topAndBottomOffset - a;
            }
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo80340b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4, boolean z) {
        return mo80221a(coordinatorLayout, v, mo80227c() - i, i2, i3, i4, z);
    }
}
