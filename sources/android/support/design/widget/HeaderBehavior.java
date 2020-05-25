package android.support.design.widget;

import android.content.Context;
import android.support.p030v4.p033b.C0703a;
import android.support.p030v4.view.C1056u;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;

abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {

    /* renamed from: a */
    private Runnable f1733a;

    /* renamed from: b */
    OverScroller f1734b;

    /* renamed from: c */
    private boolean f1735c;

    /* renamed from: d */
    private int f1736d = -1;

    /* renamed from: e */
    private int f1737e;

    /* renamed from: f */
    private int f1738f = -1;

    /* renamed from: g */
    private VelocityTracker f1739g;

    /* renamed from: android.support.design.widget.HeaderBehavior$a */
    class C0511a implements Runnable {

        /* renamed from: b */
        private final CoordinatorLayout f1741b;

        /* renamed from: c */
        private final V f1742c;

        public final void run() {
            if (!(this.f1742c == null || HeaderBehavior.this.f1734b == null)) {
                if (HeaderBehavior.this.f1734b.computeScrollOffset()) {
                    HeaderBehavior.this.mo1453a_(this.f1741b, this.f1742c, HeaderBehavior.this.f1734b.getCurrY());
                    C1056u.m3034a((View) this.f1742c, (Runnable) this);
                    return;
                }
                HeaderBehavior.this.mo1205a(this.f1741b, this.f1742c);
            }
        }

        C0511a(CoordinatorLayout coordinatorLayout, V v) {
            this.f1741b = coordinatorLayout;
            this.f1742c = v;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1205a(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo1216c(V v) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo1197a() {
        return mo1223b();
    }

    public HeaderBehavior() {
    }

    /* renamed from: c */
    private void m1351c() {
        if (this.f1739g == null) {
            this.f1739g = VelocityTracker.obtain();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo1214b(V v) {
        return -v.getHeight();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo1199a(V v) {
        return v.getHeight();
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a_ */
    public final int mo1453a_(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo1198a(coordinatorLayout, v, i, DynamicTabYellowPointVersion.DEFAULT, Integer.MAX_VALUE);
    }

    /* renamed from: b */
    public final boolean mo1255b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f1738f < 0) {
            this.f1738f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getAction() == 2 && this.f1735c) {
            return true;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f1735c = false;
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (mo1216c(v) && coordinatorLayout.mo1329a((View) v, x, y)) {
                    this.f1737e = y;
                    this.f1736d = motionEvent.getPointerId(0);
                    m1351c();
                    break;
                }
            case 1:
            case 3:
                this.f1735c = false;
                this.f1736d = -1;
                if (this.f1739g != null) {
                    this.f1739g.recycle();
                    this.f1739g = null;
                    break;
                }
                break;
            case 2:
                int i = this.f1736d;
                if (i != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex != -1) {
                        int y2 = (int) motionEvent.getY(findPointerIndex);
                        if (Math.abs(y2 - this.f1737e) > this.f1738f) {
                            this.f1735c = true;
                            this.f1737e = y2;
                            break;
                        }
                    }
                }
                break;
        }
        if (this.f1739g != null) {
            this.f1739g.addMovement(motionEvent);
        }
        return this.f1735c;
    }

    /* renamed from: a */
    public final boolean mo1171a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
        V v2 = v;
        MotionEvent motionEvent2 = motionEvent;
        if (this.f1738f < 0) {
            this.f1738f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                int y = (int) motionEvent.getY();
                if (coordinatorLayout2.mo1329a((View) v2, (int) motionEvent.getX(), y) && mo1216c(v2)) {
                    this.f1737e = y;
                    this.f1736d = motionEvent2.getPointerId(0);
                    m1351c();
                    break;
                } else {
                    return false;
                }
            case 1:
                if (this.f1739g != null) {
                    this.f1739g.addMovement(motionEvent2);
                    this.f1739g.computeCurrentVelocity(1000);
                    float yVelocity = this.f1739g.getYVelocity(this.f1736d);
                    int i = -mo1199a(v2);
                    if (this.f1733a != null) {
                        v2.removeCallbacks(this.f1733a);
                        this.f1733a = null;
                    }
                    if (this.f1734b == null) {
                        this.f1734b = new OverScroller(v.getContext());
                    }
                    this.f1734b.fling(0, mo1223b(), 0, Math.round(yVelocity), 0, 0, i, 0);
                    if (!this.f1734b.computeScrollOffset()) {
                        mo1205a(coordinatorLayout, v);
                        break;
                    } else {
                        this.f1733a = new C0511a(coordinatorLayout2, v2);
                        C1056u.m3034a((View) v2, this.f1733a);
                        break;
                    }
                }
                break;
            case 2:
                int findPointerIndex = motionEvent2.findPointerIndex(this.f1736d);
                if (findPointerIndex != -1) {
                    int y2 = (int) motionEvent2.getY(findPointerIndex);
                    int i2 = this.f1737e - y2;
                    if (!this.f1735c && Math.abs(i2) > this.f1738f) {
                        this.f1735c = true;
                        i2 = i2 > 0 ? i2 - this.f1738f : i2 + this.f1738f;
                    }
                    if (this.f1735c) {
                        this.f1737e = y2;
                        mo1454b(coordinatorLayout, v, i2, mo1214b(v2), 0);
                        break;
                    }
                } else {
                    return false;
                }
                break;
            case 3:
                break;
        }
        this.f1735c = false;
        this.f1736d = -1;
        if (this.f1739g != null) {
            this.f1739g.recycle();
            this.f1739g = null;
        }
        if (this.f1739g != null) {
            this.f1739g.addMovement(motionEvent2);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo1454b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo1198a(coordinatorLayout, v, mo1197a() - i, i2, i3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo1198a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int b = mo1223b();
        if (i2 != 0 && b >= i2 && b <= i3) {
            int a = C0703a.m2034a(i, i2, i3);
            if (b != a) {
                mo1222a(a);
                return b - a;
            }
        }
        return 0;
    }
}
