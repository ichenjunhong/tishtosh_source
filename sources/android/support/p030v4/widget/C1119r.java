package android.support.p030v4.widget;

import android.content.Context;
import android.support.p030v4.view.C1056u;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* renamed from: android.support.v4.widget.r */
public final class C1119r {

    /* renamed from: v */
    private static final Interpolator f3561v = new Interpolator() {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: a */
    public int f3562a;

    /* renamed from: b */
    public int f3563b;

    /* renamed from: c */
    public int f3564c = -1;

    /* renamed from: d */
    float[] f3565d;

    /* renamed from: e */
    float[] f3566e;

    /* renamed from: f */
    float[] f3567f;

    /* renamed from: g */
    float[] f3568g;

    /* renamed from: h */
    public float f3569h;

    /* renamed from: i */
    public int f3570i;

    /* renamed from: j */
    public int f3571j;

    /* renamed from: k */
    public View f3572k;

    /* renamed from: l */
    private int[] f3573l;

    /* renamed from: m */
    private int[] f3574m;

    /* renamed from: n */
    private int[] f3575n;

    /* renamed from: o */
    private int f3576o;

    /* renamed from: p */
    private VelocityTracker f3577p;

    /* renamed from: q */
    private float f3578q;

    /* renamed from: r */
    private OverScroller f3579r;

    /* renamed from: s */
    private final C1122a f3580s;

    /* renamed from: t */
    private boolean f3581t;

    /* renamed from: u */
    private final ViewGroup f3582u;

    /* renamed from: w */
    private final Runnable f3583w = new Runnable() {
        public final void run() {
            C1119r.this.mo3579b(0);
        }
    };

    /* renamed from: android.support.v4.widget.r$a */
    public static abstract class C1122a {
        /* renamed from: b */
        public static int m3300b(int i) {
            return i;
        }

        /* renamed from: a */
        public int mo1305a(View view) {
            return 0;
        }

        /* renamed from: a */
        public int mo1306a(View view, int i, int i2) {
            return 0;
        }

        /* renamed from: a */
        public void mo1307a(int i) {
        }

        /* renamed from: a */
        public void mo3338a(int i, int i2) {
        }

        /* renamed from: a */
        public void mo1308a(View view, float f, float f2) {
        }

        /* renamed from: a */
        public void mo1309a(View view, int i, int i2, int i3, int i4) {
        }

        /* renamed from: a */
        public abstract boolean mo1310a(View view, int i);

        /* renamed from: b */
        public int mo1490b(View view) {
            return 0;
        }

        /* renamed from: b */
        public int mo1311b(View view, int i, int i2) {
            return 0;
        }

        /* renamed from: b */
        public void mo3340b(int i, int i2) {
        }

        /* renamed from: b */
        public void mo1491b(View view, int i) {
        }
    }

    /* renamed from: a */
    public final void mo3571a(View view, int i) {
        if (view.getParent() == this.f3582u) {
            this.f3572k = view;
            this.f3564c = i;
            this.f3580s.mo1491b(view, i);
            mo3579b(1);
            return;
        }
        StringBuilder sb = new StringBuilder("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        sb.append(this.f3582u);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final void mo3570a() {
        this.f3564c = -1;
        m3283c();
        if (this.f3577p != null) {
            this.f3577p.recycle();
            this.f3577p = null;
        }
    }

    /* renamed from: a */
    public final boolean mo3575a(View view, int i, int i2) {
        this.f3572k = view;
        this.f3564c = -1;
        boolean a = m3276a(i, i2, 0, 0);
        if (!a && this.f3562a == 0 && this.f3572k != null) {
            this.f3572k = null;
        }
        return a;
    }

    /* renamed from: a */
    public final boolean mo3573a(int i, int i2) {
        if (this.f3581t) {
            return m3276a(i, i2, (int) this.f3577p.getXVelocity(this.f3564c), (int) this.f3577p.getYVelocity(this.f3564c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* renamed from: a */
    private boolean m3276a(int i, int i2, int i3, int i4) {
        int left = this.f3572k.getLeft();
        int top = this.f3572k.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f3579r.abortAnimation();
            mo3579b(0);
            return false;
        }
        this.f3579r.startScroll(left, top, i5, i6, m3270a(this.f3572k, i5, i6, i3, i4));
        mo3579b(2);
        return true;
    }

    /* renamed from: a */
    public final boolean mo3576a(boolean z) {
        if (this.f3562a == 2) {
            boolean computeScrollOffset = this.f3579r.computeScrollOffset();
            int currX = this.f3579r.getCurrX();
            int currY = this.f3579r.getCurrY();
            int left = currX - this.f3572k.getLeft();
            int top = currY - this.f3572k.getTop();
            if (left != 0) {
                C1056u.m3060h(this.f3572k, left);
            }
            if (top != 0) {
                C1056u.m3058g(this.f3572k, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f3580s.mo1309a(this.f3572k, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f3579r.getFinalX() && currY == this.f3579r.getFinalY()) {
                this.f3579r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f3582u.post(this.f3583w);
            }
        }
        if (this.f3562a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo3572a(int i) {
        return ((1 << i) & this.f3576o) != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d3, code lost:
        if (r12 != r11) goto L_0x00db;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3574a(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.mo3570a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f3577p
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f3577p = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f3577p
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            switch(r2) {
                case 0: goto L_0x00f5;
                case 1: goto L_0x00f1;
                case 2: goto L_0x0069;
                case 3: goto L_0x00f1;
                case 4: goto L_0x0025;
                case 5: goto L_0x0030;
                case 6: goto L_0x0027;
                default: goto L_0x0025;
            }
        L_0x0025:
            goto L_0x0127
        L_0x0027:
            int r1 = r1.getPointerId(r3)
            r0.m3284c(r1)
            goto L_0x0127
        L_0x0030:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.m3274a(r7, r1, r2)
            int r3 = r0.f3562a
            if (r3 != 0) goto L_0x0056
            int[] r1 = r0.f3573l
            r1 = r1[r2]
            int r3 = r0.f3571j
            r3 = r3 & r1
            if (r3 == 0) goto L_0x0127
            android.support.v4.widget.r$a r3 = r0.f3580s
            int r4 = r0.f3571j
            r1 = r1 & r4
            r3.mo3338a(r1, r2)
            goto L_0x0127
        L_0x0056:
            int r3 = r0.f3562a
            if (r3 != r4) goto L_0x0127
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.mo3577b(r3, r1)
            android.view.View r3 = r0.f3572k
            if (r1 != r3) goto L_0x0127
            r0.m3281b(r1, r2)
            goto L_0x0127
        L_0x0069:
            float[] r2 = r0.f3565d
            if (r2 == 0) goto L_0x0127
            float[] r2 = r0.f3566e
            if (r2 == 0) goto L_0x0127
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x0076:
            if (r3 >= r2) goto L_0x00ed
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.m3288d(r4)
            if (r7 == 0) goto L_0x00ea
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f3565d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f3566e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.mo3577b(r7, r8)
            if (r7 == 0) goto L_0x00a6
            boolean r8 = r0.m3277a(r7, r9, r10)
            if (r8 == 0) goto L_0x00a6
            r8 = 1
            goto L_0x00a7
        L_0x00a6:
            r8 = 0
        L_0x00a7:
            if (r8 == 0) goto L_0x00db
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            android.support.v4.widget.r$a r14 = r0.f3580s
            int r12 = r14.mo1311b(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            android.support.v4.widget.r$a r5 = r0.f3580s
            int r5 = r5.mo1306a(r7, r15, r14)
            android.support.v4.widget.r$a r14 = r0.f3580s
            int r14 = r14.mo1490b(r7)
            android.support.v4.widget.r$a r15 = r0.f3580s
            int r15 = r15.mo1305a(r7)
            if (r14 == 0) goto L_0x00d5
            if (r14 <= 0) goto L_0x00db
            if (r12 != r11) goto L_0x00db
        L_0x00d5:
            if (r15 == 0) goto L_0x00ed
            if (r15 <= 0) goto L_0x00db
            if (r5 == r13) goto L_0x00ed
        L_0x00db:
            r0.m3279b(r9, r10, r4)
            int r5 = r0.f3562a
            if (r5 == r6) goto L_0x00ed
            if (r8 == 0) goto L_0x00ea
            boolean r4 = r0.m3281b(r7, r4)
            if (r4 != 0) goto L_0x00ed
        L_0x00ea:
            int r3 = r3 + 1
            goto L_0x0076
        L_0x00ed:
            r16.m3285c(r17)
            goto L_0x0127
        L_0x00f1:
            r16.mo3570a()
            goto L_0x0127
        L_0x00f5:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.m3274a(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.mo3577b(r2, r3)
            android.view.View r3 = r0.f3572k
            if (r2 != r3) goto L_0x0116
            int r3 = r0.f3562a
            if (r3 != r4) goto L_0x0116
            r0.m3281b(r2, r1)
        L_0x0116:
            int[] r2 = r0.f3573l
            r2 = r2[r1]
            int r3 = r0.f3571j
            r3 = r3 & r2
            if (r3 == 0) goto L_0x0127
            android.support.v4.widget.r$a r3 = r0.f3580s
            int r4 = r0.f3571j
            r2 = r2 & r4
            r3.mo3338a(r2, r1)
        L_0x0127:
            int r1 = r0.f3562a
            if (r1 != r6) goto L_0x012c
            return r6
        L_0x012c:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.widget.C1119r.mo3574a(android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    public final void mo3580b(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo3570a();
        }
        if (this.f3577p == null) {
            this.f3577p = VelocityTracker.obtain();
        }
        this.f3577p.addMovement(motionEvent);
        int i2 = 0;
        switch (actionMasked) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int pointerId = motionEvent.getPointerId(0);
                View b = mo3577b((int) x, (int) y);
                m3274a(x, y, pointerId);
                m3281b(b, pointerId);
                int i3 = this.f3573l[pointerId];
                if ((this.f3571j & i3) != 0) {
                    this.f3580s.mo3338a(i3 & this.f3571j, pointerId);
                    return;
                }
                break;
            case 1:
                if (this.f3562a == 1) {
                    m3287d();
                }
                mo3570a();
                return;
            case 2:
                if (this.f3562a != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i2 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i2);
                        if (m3288d(pointerId2)) {
                            float x2 = motionEvent.getX(i2);
                            float y2 = motionEvent.getY(i2);
                            float f = x2 - this.f3565d[pointerId2];
                            float f2 = y2 - this.f3566e[pointerId2];
                            m3279b(f, f2, pointerId2);
                            if (this.f3562a != 1) {
                                View b2 = mo3577b((int) x2, (int) y2);
                                if (m3277a(b2, f, f2) && m3281b(b2, pointerId2)) {
                                }
                            }
                            m3285c(motionEvent);
                            return;
                        }
                        i2++;
                    }
                    m3285c(motionEvent);
                    return;
                } else if (m3288d(this.f3564c)) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f3564c);
                    float x3 = motionEvent.getX(findPointerIndex);
                    int i4 = (int) (x3 - this.f3567f[this.f3564c]);
                    int y3 = (int) (motionEvent.getY(findPointerIndex) - this.f3568g[this.f3564c]);
                    m3280b(this.f3572k.getLeft() + i4, this.f3572k.getTop() + y3, i4, y3);
                    m3285c(motionEvent);
                    return;
                }
                break;
            case 3:
                if (this.f3562a == 1) {
                    m3273a(0.0f, 0.0f);
                }
                mo3570a();
                break;
            case 5:
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                float x4 = motionEvent.getX(actionIndex);
                float y4 = motionEvent.getY(actionIndex);
                m3274a(x4, y4, pointerId3);
                if (this.f3562a == 0) {
                    m3281b(mo3577b((int) x4, (int) y4), pointerId3);
                    int i5 = this.f3573l[pointerId3];
                    if ((this.f3571j & i5) != 0) {
                        this.f3580s.mo3338a(i5 & this.f3571j, pointerId3);
                    }
                    return;
                } else if (m3286c((int) x4, (int) y4)) {
                    m3281b(this.f3572k, pointerId3);
                    return;
                }
                break;
            case 6:
                int pointerId4 = motionEvent.getPointerId(actionIndex);
                if (this.f3562a == 1 && pointerId4 == this.f3564c) {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 < pointerCount2) {
                            int pointerId5 = motionEvent.getPointerId(i2);
                            if (pointerId5 != this.f3564c) {
                                if (mo3577b((int) motionEvent.getX(i2), (int) motionEvent.getY(i2)) == this.f3572k && m3281b(this.f3572k, pointerId5)) {
                                    i = this.f3564c;
                                }
                            }
                            i2++;
                        } else {
                            i = -1;
                        }
                    }
                    if (i == -1) {
                        m3287d();
                    }
                }
                m3284c(pointerId4);
                return;
        }
    }

    /* renamed from: a */
    private boolean m3275a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f3573l[i] & i2) != i2 || (this.f3571j & i2) == 0 || (this.f3575n[i] & i2) == i2 || (this.f3574m[i] & i2) == i2 || ((abs <= ((float) this.f3563b) && abs2 <= ((float) this.f3563b)) || (this.f3574m[i] & i2) != 0 || abs <= ((float) this.f3563b))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m3277a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f3580s.mo1490b(view) > 0;
        boolean z2 = this.f3580s.mo1305a(view) > 0;
        return (!z || !z2) ? z ? Math.abs(f) > ((float) this.f3563b) : z2 && Math.abs(f2) > ((float) this.f3563b) : (f * f) + (f2 * f2) > ((float) (this.f3563b * this.f3563b));
    }

    /* renamed from: c */
    private void m3283c() {
        if (this.f3565d != null) {
            Arrays.fill(this.f3565d, 0.0f);
            Arrays.fill(this.f3566e, 0.0f);
            Arrays.fill(this.f3567f, 0.0f);
            Arrays.fill(this.f3568g, 0.0f);
            Arrays.fill(this.f3573l, 0);
            Arrays.fill(this.f3574m, 0);
            Arrays.fill(this.f3575n, 0);
            this.f3576o = 0;
        }
    }

    /* renamed from: d */
    private void m3287d() {
        this.f3577p.computeCurrentVelocity(1000, this.f3578q);
        m3273a(m3268a(this.f3577p.getXVelocity(this.f3564c), this.f3569h, this.f3578q), m3268a(this.f3577p.getYVelocity(this.f3564c), this.f3569h, this.f3578q));
    }

    /* renamed from: b */
    public final void mo3578b() {
        mo3570a();
        if (this.f3562a == 2) {
            int currX = this.f3579r.getCurrX();
            int currY = this.f3579r.getCurrY();
            this.f3579r.abortAnimation();
            int currX2 = this.f3579r.getCurrX();
            int currY2 = this.f3579r.getCurrY();
            this.f3580s.mo1309a(this.f3572k, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        mo3579b(0);
    }

    /* renamed from: a */
    private static float m3267a(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: d */
    private boolean m3288d(int i) {
        if (!mo3572a(i)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private void m3284c(int i) {
        if (this.f3565d != null && mo3572a(i)) {
            this.f3565d[i] = 0.0f;
            this.f3566e[i] = 0.0f;
            this.f3567f[i] = 0.0f;
            this.f3568g[i] = 0.0f;
            this.f3573l[i] = 0;
            this.f3574m[i] = 0;
            this.f3575n[i] = 0;
            this.f3576o = ((1 << i) ^ -1) & this.f3576o;
        }
    }

    /* renamed from: c */
    private void m3285c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m3288d(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f3567f[pointerId] = x;
                this.f3568g[pointerId] = y;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo3579b(int i) {
        this.f3582u.removeCallbacks(this.f3583w);
        if (this.f3562a != i) {
            this.f3562a = i;
            this.f3580s.mo1307a(i);
            if (this.f3562a == 0) {
                this.f3572k = null;
            }
        }
    }

    /* renamed from: c */
    private boolean m3286c(int i, int i2) {
        return m3282b(this.f3572k, i, i2);
    }

    /* renamed from: b */
    private boolean m3281b(View view, int i) {
        if (view == this.f3572k && this.f3564c == i) {
            return true;
        }
        if (view == null || !this.f3580s.mo1310a(view, i)) {
            return false;
        }
        this.f3564c = i;
        mo3571a(view, i);
        return true;
    }

    /* renamed from: a */
    public static C1119r m3272a(ViewGroup viewGroup, C1122a aVar) {
        return new C1119r(viewGroup.getContext(), viewGroup, aVar);
    }

    /* renamed from: b */
    public final View mo3577b(int i, int i2) {
        for (int childCount = this.f3582u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f3582u.getChildAt(C1122a.m3300b(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m3273a(float f, float f2) {
        this.f3581t = true;
        this.f3580s.mo1308a(this.f3572k, f, f2);
        this.f3581t = false;
        if (this.f3562a == 1) {
            mo3579b(0);
        }
    }

    /* renamed from: b */
    private static int m3278b(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs <= i3) {
            return i;
        }
        if (i > 0) {
            return i3;
        }
        return -i3;
    }

    /* renamed from: a */
    private static float m3268a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs <= f3) {
            return f;
        }
        if (f > 0.0f) {
            return f3;
        }
        return -f3;
    }

    /* renamed from: a */
    public static C1119r m3271a(ViewGroup viewGroup, float f, C1122a aVar) {
        C1119r a = m3272a(viewGroup, aVar);
        a.f3563b = (int) (((float) a.f3563b) * (1.0f / f));
        return a;
    }

    /* renamed from: b */
    private void m3279b(float f, float f2, int i) {
        boolean a = m3275a(f, f2, i, 1);
        if (m3275a(f2, f, i, 4)) {
            a |= true;
        }
        if (m3275a(f, f2, i, 2)) {
            a |= true;
        }
        if (m3275a(f2, f, i, 8)) {
            a |= true;
        }
        if (a) {
            int[] iArr = this.f3574m;
            iArr[i] = iArr[i] | a;
            this.f3580s.mo3340b(a ? 1 : 0, i);
        }
    }

    private C1119r(Context context, ViewGroup viewGroup, C1122a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (aVar != null) {
            this.f3582u = viewGroup;
            this.f3580s = aVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f3570i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f3563b = viewConfiguration.getScaledTouchSlop();
            this.f3578q = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f3569h = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f3579r = new OverScroller(context, f3561v);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: a */
    private int m3269a(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.f3582u.getWidth();
        float f = (float) (width / 2);
        float a = f + (m3267a(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs = Math.abs(i2);
        if (abs > 0) {
            i4 = Math.round(Math.abs(a / ((float) abs)) * 1000.0f) * 4;
        } else {
            i4 = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    /* renamed from: b */
    public static boolean m3282b(View view, int i, int i2) {
        if (view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m3274a(float f, float f2, int i) {
        int i2 = 0;
        if (this.f3565d == null || this.f3565d.length <= i) {
            int i3 = i + 1;
            float[] fArr = new float[i3];
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (this.f3565d != null) {
                System.arraycopy(this.f3565d, 0, fArr, 0, this.f3565d.length);
                System.arraycopy(this.f3566e, 0, fArr2, 0, this.f3566e.length);
                System.arraycopy(this.f3567f, 0, fArr3, 0, this.f3567f.length);
                System.arraycopy(this.f3568g, 0, fArr4, 0, this.f3568g.length);
                System.arraycopy(this.f3573l, 0, iArr, 0, this.f3573l.length);
                System.arraycopy(this.f3574m, 0, iArr2, 0, this.f3574m.length);
                System.arraycopy(this.f3575n, 0, iArr3, 0, this.f3575n.length);
            }
            this.f3565d = fArr;
            this.f3566e = fArr2;
            this.f3567f = fArr3;
            this.f3568g = fArr4;
            this.f3573l = iArr;
            this.f3574m = iArr2;
            this.f3575n = iArr3;
        }
        float[] fArr5 = this.f3565d;
        this.f3567f[i] = f;
        fArr5[i] = f;
        float[] fArr6 = this.f3566e;
        this.f3568g[i] = f2;
        fArr6[i] = f2;
        int[] iArr4 = this.f3573l;
        int i4 = (int) f;
        int i5 = (int) f2;
        if (i4 < this.f3582u.getLeft() + this.f3570i) {
            i2 = 1;
        }
        if (i5 < this.f3582u.getTop() + this.f3570i) {
            i2 |= 4;
        }
        if (i4 > this.f3582u.getRight() - this.f3570i) {
            i2 |= 2;
        }
        if (i5 > this.f3582u.getBottom() - this.f3570i) {
            i2 |= 8;
        }
        iArr4[i] = i2;
        this.f3576o |= 1 << i;
    }

    /* renamed from: b */
    private void m3280b(int i, int i2, int i3, int i4) {
        int left = this.f3572k.getLeft();
        int top = this.f3572k.getTop();
        if (i3 != 0) {
            i = this.f3580s.mo1311b(this.f3572k, i, i3);
            C1056u.m3060h(this.f3572k, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f3580s.mo1306a(this.f3572k, i2, i4);
            C1056u.m3058g(this.f3572k, i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.f3580s.mo1309a(this.f3572k, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: a */
    private int m3270a(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int b = m3278b(i3, (int) this.f3569h, (int) this.f3578q);
        int b2 = m3278b(i4, (int) this.f3569h, (int) this.f3578q);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(b);
        int abs4 = Math.abs(b2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (b != 0) {
            f = (float) abs3;
            f2 = (float) i5;
        } else {
            f = (float) abs;
            f2 = (float) i6;
        }
        float f5 = f / f2;
        if (b2 != 0) {
            f3 = (float) abs4;
            f4 = (float) i5;
        } else {
            f3 = (float) abs2;
            f4 = (float) i6;
        }
        float f6 = f3 / f4;
        return (int) ((((float) m3269a(i, b, this.f3580s.mo1490b(view))) * f5) + (((float) m3269a(i2, b2, this.f3580s.mo1305a(view))) * f6));
    }
}
