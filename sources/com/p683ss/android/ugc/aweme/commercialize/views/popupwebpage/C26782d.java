package com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage;

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

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.d */
public final class C26782d {

    /* renamed from: s */
    private static float f70559s = 1.0f;

    /* renamed from: x */
    private static final Interpolator f70560x = new Interpolator() {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: a */
    public int f70561a;

    /* renamed from: b */
    public int f70562b;

    /* renamed from: c */
    public int f70563c = -1;

    /* renamed from: d */
    public float[] f70564d;

    /* renamed from: e */
    public float[] f70565e;

    /* renamed from: f */
    public float[] f70566f;

    /* renamed from: g */
    public float[] f70567g;

    /* renamed from: h */
    public int[] f70568h;

    /* renamed from: i */
    public VelocityTracker f70569i;

    /* renamed from: j */
    public float f70570j;

    /* renamed from: k */
    public int f70571k;

    /* renamed from: l */
    public int f70572l;

    /* renamed from: m */
    public OverScroller f70573m;

    /* renamed from: n */
    public final C26785a f70574n;

    /* renamed from: o */
    public View f70575o;

    /* renamed from: p */
    public boolean f70576p;

    /* renamed from: q */
    public final ViewGroup f70577q;

    /* renamed from: r */
    public final Runnable f70578r = new Runnable() {
        public final void run() {
            C26782d.this.mo54686b(0);
        }
    };

    /* renamed from: t */
    private int[] f70579t;

    /* renamed from: u */
    private int[] f70580u;

    /* renamed from: v */
    private int f70581v;

    /* renamed from: w */
    private float f70582w;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.d$a */
    public static abstract class C26785a {
        /* renamed from: b */
        public static int m64748b(int i) {
            return i;
        }

        /* renamed from: a */
        public int mo54345a(View view) {
            return 0;
        }

        /* renamed from: a */
        public int mo54346a(View view, int i, int i2) {
            return 0;
        }

        /* renamed from: a */
        public void mo54347a(int i) {
        }

        /* renamed from: a */
        public void mo54348a(View view, float f, float f2) {
        }

        /* renamed from: a */
        public void mo54349a(View view, int i, int i2, int i3, int i4) {
        }

        /* renamed from: a */
        public abstract boolean mo54350a(View view, int i);

        /* renamed from: b */
        public int mo54351b(View view) {
            return 0;
        }

        /* renamed from: b */
        public int mo54352b(View view, int i, int i2) {
            return 0;
        }
    }

    /* renamed from: a */
    public final void mo54679a(View view, int i) {
        if (view.getParent() == this.f70577q) {
            this.f70575o = view;
            this.f70563c = i;
            mo54686b(1);
            return;
        }
        StringBuilder sb = new StringBuilder("captureChildView: parameter must be a descendant of the AdPopUpWebViewDragHelper's tracked parent view (");
        sb.append(this.f70577q);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final boolean mo54682a(View view, int i, int i2) {
        this.f70575o = view;
        this.f70563c = -1;
        boolean a = mo54680a(i, i2, 0, 0);
        if (!a && this.f70561a == 0 && this.f70575o != null) {
            this.f70575o = null;
        }
        return a;
    }

    /* renamed from: a */
    public final boolean mo54683a(View view, int i, int i2, boolean z) {
        f70559s = z ? 0.8f : 1.0f;
        return mo54682a(view, i, i2);
    }

    /* renamed from: a */
    public boolean mo54680a(int i, int i2, int i3, int i4) {
        int left = this.f70575o.getLeft();
        int top = this.f70575o.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0 && !C26779b.m64713a()) {
            this.f70573m.abortAnimation();
            mo54686b(0);
            return false;
        }
        this.f70573m.startScroll(left, top, i5, i6, m64724a(this.f70575o, i5, i6, i3, i4));
        mo54686b(2);
        return true;
    }

    /* renamed from: a */
    public void mo54677a(int i) {
        if (this.f70564d != null && m64730e(i)) {
            this.f70564d[i] = 0.0f;
            this.f70565e[i] = 0.0f;
            this.f70566f[i] = 0.0f;
            this.f70567g[i] = 0.0f;
            this.f70568h[i] = 0;
            this.f70579t[i] = 0;
            this.f70580u[i] = 0;
            this.f70581v = ((1 << i) ^ -1) & this.f70581v;
        }
    }

    /* renamed from: a */
    public void mo54676a(float f, float f2, int i) {
        m64729d(i);
        float[] fArr = this.f70564d;
        this.f70566f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f70565e;
        this.f70567g[i] = f2;
        fArr2[i] = f2;
        this.f70568h[i] = m64726b((int) f, (int) f2);
        this.f70581v |= 1 << i;
    }

    /* renamed from: a */
    public void mo54678a(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (mo54689c(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f70566f[pointerId] = x;
                this.f70567g[pointerId] = y;
            }
        }
    }

    /* renamed from: a */
    public boolean mo54681a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f70574n.mo54351b(view) > 0;
        boolean z2 = this.f70574n.mo54345a(view) > 0;
        return (!z || !z2) ? z ? Math.abs(f) > ((float) this.f70562b) : z2 && Math.abs(f2) > ((float) this.f70562b) : (f * f) + (f2 * f2) > ((float) (this.f70562b * this.f70562b));
    }

    /* renamed from: c */
    private void m64728c() {
        if (this.f70564d != null) {
            Arrays.fill(this.f70564d, 0.0f);
            Arrays.fill(this.f70565e, 0.0f);
            Arrays.fill(this.f70566f, 0.0f);
            Arrays.fill(this.f70567g, 0.0f);
            Arrays.fill(this.f70568h, 0);
            Arrays.fill(this.f70579t, 0);
            Arrays.fill(this.f70580u, 0);
            this.f70581v = 0;
        }
    }

    /* renamed from: b */
    public void mo54684b() {
        this.f70569i.computeCurrentVelocity(1000, this.f70582w);
        mo54675a(m64722a(this.f70569i.getXVelocity(this.f70563c), this.f70570j, this.f70582w), m64722a(this.f70569i.getYVelocity(this.f70563c), this.f70570j, this.f70582w));
    }

    /* renamed from: a */
    public final void mo54674a() {
        this.f70563c = -1;
        m64728c();
        if (this.f70569i != null) {
            this.f70569i.recycle();
            this.f70569i = null;
        }
    }

    /* renamed from: a */
    private static float m64721a(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: e */
    private boolean m64730e(int i) {
        if (((1 << i) & this.f70581v) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo54689c(int i) {
        if (!m64730e(i)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo54686b(int i) {
        this.f70577q.removeCallbacks(this.f70578r);
        if (this.f70561a != i) {
            this.f70561a = i;
            this.f70574n.mo54347a(i);
            if (this.f70561a == 0) {
                this.f70575o = null;
            }
        }
    }

    /* renamed from: d */
    private void m64729d(int i) {
        if (this.f70564d == null || this.f70564d.length <= i) {
            int i2 = i + 1;
            float[] fArr = new float[i2];
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (this.f70564d != null) {
                System.arraycopy(this.f70564d, 0, fArr, 0, this.f70564d.length);
                System.arraycopy(this.f70565e, 0, fArr2, 0, this.f70565e.length);
                System.arraycopy(this.f70566f, 0, fArr3, 0, this.f70566f.length);
                System.arraycopy(this.f70567g, 0, fArr4, 0, this.f70567g.length);
                System.arraycopy(this.f70568h, 0, iArr, 0, this.f70568h.length);
                System.arraycopy(this.f70579t, 0, iArr2, 0, this.f70579t.length);
                System.arraycopy(this.f70580u, 0, iArr3, 0, this.f70580u.length);
            }
            this.f70564d = fArr;
            this.f70565e = fArr2;
            this.f70566f = fArr3;
            this.f70567g = fArr4;
            this.f70568h = iArr;
            this.f70579t = iArr2;
            this.f70580u = iArr3;
        }
    }

    /* renamed from: b */
    private int m64726b(int i, int i2) {
        int i3;
        if (i < this.f70577q.getLeft() + this.f70571k) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i2 < this.f70577q.getTop() + this.f70571k) {
            i3 |= 4;
        }
        if (i > this.f70577q.getRight() - this.f70571k) {
            i3 |= 2;
        }
        if (i2 > this.f70577q.getBottom() - this.f70571k) {
            return i3 | 8;
        }
        return i3;
    }

    /* renamed from: a */
    public final View mo54673a(int i, int i2) {
        for (int childCount = this.f70577q.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f70577q.getChildAt(C26785a.m64748b(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo54688b(View view, int i) {
        if (view == this.f70575o && this.f70563c == i) {
            return true;
        }
        if (view == null || !this.f70574n.mo54350a(view, i)) {
            return false;
        }
        this.f70563c = i;
        mo54679a(view, i);
        return true;
    }

    /* renamed from: a */
    public void mo54675a(float f, float f2) {
        this.f70576p = true;
        this.f70574n.mo54348a(this.f70575o, f, f2);
        this.f70576p = false;
        if (this.f70561a == 1) {
            mo54686b(0);
        }
    }

    /* renamed from: b */
    private static int m64727b(int i, int i2, int i3) {
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
    private static float m64722a(float f, float f2, float f3) {
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

    public C26782d(Context context, ViewGroup viewGroup, C26785a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (aVar != null) {
            this.f70577q = viewGroup;
            this.f70574n = aVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f70571k = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f70562b = viewConfiguration.getScaledTouchSlop();
            this.f70582w = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f70570j = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f70573m = new OverScroller(context, f70560x);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: a */
    private int m64723a(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.f70577q.getWidth();
        float f = (float) (width / 2);
        float a = f + (m64721a(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs = Math.abs(i2);
        if (abs > 0) {
            i4 = Math.round(Math.abs(a / ((float) abs)) * 1000.0f) * 4;
        } else {
            i4 = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    /* renamed from: b */
    public void mo54685b(float f, float f2, int i) {
        boolean a = m64725a(f, f2, i, 1);
        if (m64725a(f2, f, i, 4)) {
            a |= true;
        }
        if (m64725a(f, f2, i, 2)) {
            a |= true;
        }
        if (m64725a(f2, f, i, 8)) {
            a |= true;
        }
        if (a) {
            int[] iArr = this.f70579t;
            iArr[i] = iArr[i] | a;
        }
    }

    /* renamed from: a */
    private boolean m64725a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f70568h[i] & i2) != i2 || (this.f70572l & i2) == 0 || (this.f70580u[i] & i2) == i2 || (this.f70579t[i] & i2) == i2 || ((abs <= ((float) this.f70562b) && abs2 <= ((float) this.f70562b)) || (this.f70579t[i] & i2) != 0 || abs <= ((float) this.f70562b))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo54687b(int i, int i2, int i3, int i4) {
        int left = this.f70575o.getLeft();
        int top = this.f70575o.getTop();
        if (i3 != 0) {
            i = this.f70574n.mo54352b(this.f70575o, i, i3);
            C1056u.m3060h(this.f70575o, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f70574n.mo54346a(this.f70575o, i2, i4);
            C1056u.m3058g(this.f70575o, i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.f70574n.mo54349a(this.f70575o, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: a */
    private int m64724a(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int b = m64727b(i3, (int) this.f70570j, (int) this.f70582w);
        int b2 = m64727b(i4, (int) this.f70570j, (int) this.f70582w);
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
        return (int) (((((float) m64723a(i, b, this.f70574n.mo54351b(view))) * f5) + (((float) m64723a(i2, b2, this.f70574n.mo54345a(view))) * f6)) * f70559s);
    }
}
