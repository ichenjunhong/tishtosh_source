package android.support.p043v7.widget;

import android.os.SystemClock;
import android.support.p043v7.view.menu.C1268s;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* renamed from: android.support.v7.widget.ac */
public abstract class C1407ac implements OnAttachStateChangeListener, OnTouchListener {

    /* renamed from: a */
    private final float f5069a;

    /* renamed from: b */
    private final int f5070b;

    /* renamed from: c */
    final View f5071c;

    /* renamed from: d */
    private final int f5072d;

    /* renamed from: e */
    private Runnable f5073e;

    /* renamed from: f */
    private Runnable f5074f;

    /* renamed from: g */
    private boolean f5075g;

    /* renamed from: h */
    private int f5076h;

    /* renamed from: i */
    private final int[] f5077i = new int[2];

    /* renamed from: android.support.v7.widget.ac$a */
    class C1408a implements Runnable {
        public final void run() {
            ViewParent parent = C1407ac.this.f5071c.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        C1408a() {
        }
    }

    /* renamed from: android.support.v7.widget.ac$b */
    class C1409b implements Runnable {
        public final void run() {
            C1407ac.this.mo5475d();
        }

        C1409b() {
        }
    }

    /* renamed from: a */
    public abstract C1268s mo4009a();

    public void onViewAttachedToWindow(View view) {
    }

    /* renamed from: e */
    private void m4853e() {
        if (this.f5074f != null) {
            this.f5071c.removeCallbacks(this.f5074f);
        }
        if (this.f5073e != null) {
            this.f5071c.removeCallbacks(this.f5073e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo4010b() {
        C1268s a = mo4009a();
        if (a != null && !a.mo4077e()) {
            a.mo4075d();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo4427c() {
        C1268s a = mo4009a();
        if (a != null && a.mo4077e()) {
            a.dismiss();
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo5475d() {
        m4853e();
        View view = this.f5071c;
        if (view.isEnabled() && !view.isLongClickable() && mo4010b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f5075g = true;
        }
    }

    public void onViewDetachedFromWindow(View view) {
        this.f5075g = false;
        this.f5076h = -1;
        if (this.f5073e != null) {
            this.f5071c.removeCallbacks(this.f5073e);
        }
    }

    public C1407ac(View view) {
        this.f5071c = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f5069a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f5070b = ViewConfiguration.getTapTimeout();
        this.f5072d = (this.f5070b + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            boolean r11 = r10.f5075g
            r0 = 1
            r1 = 0
            if (r11 == 0) goto L_0x0071
            android.view.View r2 = r10.f5071c
            android.support.v7.view.menu.s r3 = r10.mo4009a()
            if (r3 == 0) goto L_0x0061
            boolean r4 = r3.mo4077e()
            if (r4 != 0) goto L_0x0015
            goto L_0x0061
        L_0x0015:
            android.widget.ListView r3 = r3.mo4078f()
            android.support.v7.widget.z r3 = (android.support.p043v7.widget.C1519z) r3
            if (r3 == 0) goto L_0x0061
            boolean r4 = r3.isShown()
            if (r4 != 0) goto L_0x0024
            goto L_0x0061
        L_0x0024:
            android.view.MotionEvent r4 = android.view.MotionEvent.obtainNoHistory(r12)
            int[] r5 = r10.f5077i
            r2.getLocationOnScreen(r5)
            r2 = r5[r1]
            float r2 = (float) r2
            r5 = r5[r0]
            float r5 = (float) r5
            r4.offsetLocation(r2, r5)
            int[] r2 = r10.f5077i
            r3.getLocationOnScreen(r2)
            r5 = r2[r1]
            int r5 = -r5
            float r5 = (float) r5
            r2 = r2[r0]
            int r2 = -r2
            float r2 = (float) r2
            r4.offsetLocation(r5, r2)
            int r2 = r10.f5076h
            boolean r2 = r3.mo5503a(r4, r2)
            r4.recycle()
            int r12 = r12.getActionMasked()
            if (r12 == r0) goto L_0x005a
            r3 = 3
            if (r12 == r3) goto L_0x005a
            r12 = 1
            goto L_0x005b
        L_0x005a:
            r12 = 0
        L_0x005b:
            if (r2 == 0) goto L_0x0061
            if (r12 == 0) goto L_0x0061
            r12 = 1
            goto L_0x0062
        L_0x0061:
            r12 = 0
        L_0x0062:
            if (r12 != 0) goto L_0x006e
            boolean r12 = r10.mo4427c()
            if (r12 != 0) goto L_0x006b
            goto L_0x006e
        L_0x006b:
            r12 = 0
            goto L_0x011f
        L_0x006e:
            r12 = 1
            goto L_0x011f
        L_0x0071:
            android.view.View r2 = r10.f5071c
            boolean r3 = r2.isEnabled()
            if (r3 == 0) goto L_0x00fc
            int r3 = r12.getActionMasked()
            switch(r3) {
                case 0: goto L_0x00d0;
                case 1: goto L_0x00cc;
                case 2: goto L_0x0082;
                case 3: goto L_0x00cc;
                default: goto L_0x0080;
            }
        L_0x0080:
            goto L_0x00fc
        L_0x0082:
            int r3 = r10.f5076h
            int r3 = r12.findPointerIndex(r3)
            if (r3 < 0) goto L_0x00fc
            float r4 = r12.getX(r3)
            float r12 = r12.getY(r3)
            float r3 = r10.f5069a
            float r5 = -r3
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 < 0) goto L_0x00bd
            int r5 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x00bd
            int r5 = r2.getRight()
            int r6 = r2.getLeft()
            int r5 = r5 - r6
            float r5 = (float) r5
            float r5 = r5 + r3
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00bd
            int r4 = r2.getBottom()
            int r5 = r2.getTop()
            int r4 = r4 - r5
            float r4 = (float) r4
            float r4 = r4 + r3
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 >= 0) goto L_0x00bd
            r12 = 1
            goto L_0x00be
        L_0x00bd:
            r12 = 0
        L_0x00be:
            if (r12 != 0) goto L_0x00fc
            r10.m4853e()
            android.view.ViewParent r12 = r2.getParent()
            r12.requestDisallowInterceptTouchEvent(r0)
            r12 = 1
            goto L_0x00fd
        L_0x00cc:
            r10.m4853e()
            goto L_0x00fc
        L_0x00d0:
            int r12 = r12.getPointerId(r1)
            r10.f5076h = r12
            java.lang.Runnable r12 = r10.f5073e
            if (r12 != 0) goto L_0x00e1
            android.support.v7.widget.ac$a r12 = new android.support.v7.widget.ac$a
            r12.<init>()
            r10.f5073e = r12
        L_0x00e1:
            java.lang.Runnable r12 = r10.f5073e
            int r3 = r10.f5070b
            long r3 = (long) r3
            r2.postDelayed(r12, r3)
            java.lang.Runnable r12 = r10.f5074f
            if (r12 != 0) goto L_0x00f4
            android.support.v7.widget.ac$b r12 = new android.support.v7.widget.ac$b
            r12.<init>()
            r10.f5074f = r12
        L_0x00f4:
            java.lang.Runnable r12 = r10.f5074f
            int r3 = r10.f5072d
            long r3 = (long) r3
            r2.postDelayed(r12, r3)
        L_0x00fc:
            r12 = 0
        L_0x00fd:
            if (r12 == 0) goto L_0x0107
            boolean r12 = r10.mo4010b()
            if (r12 == 0) goto L_0x0107
            r12 = 1
            goto L_0x0108
        L_0x0107:
            r12 = 0
        L_0x0108:
            if (r12 == 0) goto L_0x011f
            long r4 = android.os.SystemClock.uptimeMillis()
            r6 = 3
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r4
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r2, r4, r6, r7, r8, r9)
            android.view.View r3 = r10.f5071c
            r3.onTouchEvent(r2)
            r2.recycle()
        L_0x011f:
            r10.f5075g = r12
            if (r12 != 0) goto L_0x0127
            if (r11 == 0) goto L_0x0126
            goto L_0x0127
        L_0x0126:
            return r1
        L_0x0127:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.C1407ac.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
