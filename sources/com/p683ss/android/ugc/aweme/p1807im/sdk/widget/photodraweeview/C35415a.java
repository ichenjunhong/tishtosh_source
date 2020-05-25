package com.p683ss.android.ugc.aweme.p1807im.sdk.widget.photodraweeview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.support.p030v4.view.C1034d;
import android.support.p030v4.widget.C1114n;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.view.DraweeView;
import com.p683ss.android.p1147d.p1148a.C18928a;
import com.p683ss.android.p1147d.p1148a.C18929b;
import com.p683ss.android.p1147d.p1148a.C18930c;
import com.p683ss.android.p1147d.p1148a.C18931d;
import com.p683ss.android.p1147d.p1148a.C18932e;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.photodraweeview.a */
public final class C35415a implements OnTouchListener, C18930c {

    /* renamed from: a */
    public final Interpolator f91056a = new AccelerateDecelerateInterpolator();

    /* renamed from: b */
    float f91057b = 1.0f;

    /* renamed from: c */
    float f91058c = 1.75f;

    /* renamed from: d */
    float f91059d = 3.0f;

    /* renamed from: e */
    public long f91060e = 200;

    /* renamed from: f */
    C1034d f91061f;

    /* renamed from: g */
    boolean f91062g = true;

    /* renamed from: h */
    public final Matrix f91063h = new Matrix();

    /* renamed from: i */
    int f91064i = -1;

    /* renamed from: j */
    int f91065j = -1;

    /* renamed from: k */
    C18928a f91066k;

    /* renamed from: l */
    C18931d f91067l;

    /* renamed from: m */
    public OnLongClickListener f91068m;

    /* renamed from: n */
    C18929b f91069n;

    /* renamed from: o */
    private final float[] f91070o = new float[9];

    /* renamed from: p */
    private final RectF f91071p = new RectF();

    /* renamed from: q */
    private C18932e f91072q;

    /* renamed from: r */
    private boolean f91073r = false;

    /* renamed from: s */
    private int f91074s = 2;

    /* renamed from: t */
    private C35418b f91075t;

    /* renamed from: u */
    private WeakReference<DraweeView<C13833a>> f91076u;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.photodraweeview.a$a */
    class C35417a implements Runnable {

        /* renamed from: b */
        private final float f91079b;

        /* renamed from: c */
        private final float f91080c;

        /* renamed from: d */
        private final long f91081d = System.currentTimeMillis();

        /* renamed from: e */
        private final float f91082e;

        /* renamed from: f */
        private final float f91083f;

        public final void run() {
            DraweeView b = C35415a.this.mo73718b();
            if (b != null) {
                float interpolation = C35415a.this.f91056a.getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.f91081d)) * 1.0f) / ((float) C35415a.this.f91060e)));
                C35415a.this.mo38792a((this.f91082e + ((this.f91083f - this.f91082e) * interpolation)) / C35415a.this.mo73722f(), this.f91079b, this.f91080c);
                if (interpolation < 1.0f) {
                    C35415a.m80058a((View) b, (Runnable) this);
                }
            }
        }

        public C35417a(float f, float f2, float f3, float f4) {
            this.f91079b = f3;
            this.f91080c = f4;
            this.f91082e = f;
            this.f91083f = f2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.photodraweeview.a$b */
    class C35418b implements Runnable {

        /* renamed from: a */
        final C1114n f91084a;

        /* renamed from: b */
        int f91085b;

        /* renamed from: c */
        int f91086c;

        /* renamed from: a */
        public final void mo73731a() {
            this.f91084a.mo3563a();
        }

        public final void run() {
            if (!this.f91084a.f3550a.isFinished()) {
                DraweeView b = C35415a.this.mo73718b();
                if (b != null && this.f91084a.f3550a.computeScrollOffset()) {
                    int currX = this.f91084a.f3550a.getCurrX();
                    int currY = this.f91084a.f3550a.getCurrY();
                    C35415a.this.f91063h.postTranslate((float) (this.f91085b - currX), (float) (this.f91086c - currY));
                    b.invalidate();
                    this.f91085b = currX;
                    this.f91086c = currY;
                    C35415a.m80058a((View) b, (Runnable) this);
                }
            }
        }

        public C35418b(Context context) {
            this.f91084a = new C1114n(context, null);
        }
    }

    /* renamed from: c */
    public final float mo73719c() {
        return this.f91057b;
    }

    /* renamed from: d */
    public final float mo73720d() {
        return this.f91058c;
    }

    /* renamed from: e */
    public final float mo73721e() {
        return this.f91059d;
    }

    /* renamed from: g */
    public final C18928a mo73723g() {
        return this.f91066k;
    }

    /* renamed from: h */
    public final C18931d mo73724h() {
        return this.f91067l;
    }

    /* renamed from: b */
    public final DraweeView<C13833a> mo73718b() {
        return (DraweeView) this.f91076u.get();
    }

    /* renamed from: i */
    public final RectF mo73725i() {
        mo73726j();
        return mo73716a(this.f91063h);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo73727k() {
        if (this.f91075t != null) {
            this.f91075t.mo73731a();
            this.f91075t = null;
        }
    }

    /* renamed from: l */
    private int m80060l() {
        DraweeView b = mo73718b();
        if (b != null) {
            return (b.getWidth() - b.getPaddingLeft()) - b.getPaddingRight();
        }
        return 0;
    }

    /* renamed from: m */
    private int m80061m() {
        DraweeView b = mo73718b();
        if (b != null) {
            return (b.getHeight() - b.getPaddingTop()) - b.getPaddingBottom();
        }
        return 0;
    }

    /* renamed from: n */
    private void m80062n() {
        DraweeView b = mo73718b();
        if (b != null && mo73726j()) {
            b.invalidate();
        }
    }

    /* renamed from: f */
    public final float mo73722f() {
        return (float) Math.sqrt((double) (((float) Math.pow((double) m80057a(this.f91063h, 0), 2.0d)) + ((float) Math.pow((double) m80057a(this.f91063h, 3), 2.0d))));
    }

    /* renamed from: a */
    public final void mo38790a() {
        DraweeView b = mo73718b();
        if (b != null && mo73722f() < this.f91057b) {
            RectF i = mo73725i();
            if (i != null) {
                C35417a aVar = new C35417a(mo73722f(), this.f91057b, i.centerX(), i.centerY());
                b.post(aVar);
            }
        }
    }

    /* renamed from: j */
    public final boolean mo73726j() {
        float f;
        RectF a = mo73716a(this.f91063h);
        if (a == null) {
            return false;
        }
        float height = a.height();
        float width = a.width();
        float m = (float) m80061m();
        float f2 = 0.0f;
        if (height <= m) {
            f = ((m - height) / 2.0f) - a.top;
        } else if (a.top > 0.0f) {
            f = -a.top;
        } else if (a.bottom < m) {
            f = m - a.bottom;
        } else {
            f = 0.0f;
        }
        float l = (float) m80060l();
        if (width <= l) {
            f2 = ((l - width) / 2.0f) - a.left;
            this.f91074s = 2;
        } else if (a.left > 0.0f) {
            f2 = -a.left;
            this.f91074s = 0;
        } else if (a.right < l) {
            f2 = l - a.right;
            this.f91074s = 1;
        } else {
            this.f91074s = -1;
        }
        this.f91063h.postTranslate(f2, f);
        return true;
    }

    /* renamed from: a */
    public final RectF mo73716a(Matrix matrix) {
        DraweeView b = mo73718b();
        if (b == null || (this.f91065j == -1 && this.f91064i == -1)) {
            return null;
        }
        this.f91071p.set(0.0f, 0.0f, (float) this.f91065j, (float) this.f91064i);
        ((C13833a) b.getHierarchy()).mo25894a(this.f91071p);
        matrix.mapRect(this.f91071p);
        return this.f91071p;
    }

    public C35415a(DraweeView<C13833a> draweeView) {
        this.f91076u = new WeakReference<>(draweeView);
        ((C13833a) draweeView.getHierarchy()).mo25898a(C13818b.f36063c);
        draweeView.setOnTouchListener(this);
        this.f91072q = new C18932e(draweeView.getContext(), this);
        this.f91061f = new C1034d(draweeView.getContext(), new SimpleOnGestureListener() {
            public final void onLongPress(MotionEvent motionEvent) {
                super.onLongPress(motionEvent);
                if (C35415a.this.f91068m != null) {
                    C35415a.this.f91068m.onLongClick(C35415a.this.mo73718b());
                }
            }
        });
        this.f91061f.mo3211a((OnDoubleTapListener) new C35419b(this));
    }

    /* renamed from: a */
    private float m80057a(Matrix matrix, int i) {
        matrix.getValues(this.f91070o);
        return this.f91070o[i];
    }

    /* renamed from: a */
    public static void m80058a(View view, Runnable runnable) {
        if (VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, 16);
        }
    }

    /* renamed from: a */
    public final void mo38791a(float f, float f2) {
        DraweeView b = mo73718b();
        if (b != null && !this.f91072q.mo38795a()) {
            this.f91063h.postTranslate(f, f2);
            m80062n();
            ViewParent parent = b.getParent();
            if (parent != null) {
                if (!this.f91062g || this.f91072q.mo38795a() || this.f91073r) {
                    parent.requestDisallowInterceptTouchEvent(true);
                } else if (this.f91074s == 2 || ((this.f91074s == 0 && f >= 1.0f) || (this.f91074s == 1 && f <= -1.0f))) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r14, android.view.MotionEvent r15) {
        /*
            r13 = this;
            int r0 = android.support.p030v4.view.C1044i.m2981a(r15)
            r1 = 3
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x001a
            switch(r0) {
                case 0: goto L_0x000d;
                case 1: goto L_0x001a;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0023
        L_0x000d:
            android.view.ViewParent r14 = r14.getParent()
            if (r14 == 0) goto L_0x0016
            r14.requestDisallowInterceptTouchEvent(r2)
        L_0x0016:
            r13.mo73727k()
            goto L_0x0023
        L_0x001a:
            android.view.ViewParent r14 = r14.getParent()
            if (r14 == 0) goto L_0x0023
            r14.requestDisallowInterceptTouchEvent(r3)
        L_0x0023:
            com.ss.android.d.a.e r14 = r13.f91072q
            boolean r14 = r14.mo38795a()
            com.ss.android.d.a.e r0 = r13.f91072q
            boolean r0 = r0.f52157f
            com.ss.android.d.a.e r4 = r13.f91072q
            android.view.ScaleGestureDetector r5 = r4.f52154c
            r5.onTouchEvent(r15)
            int r5 = android.support.p030v4.view.C1044i.m2981a(r15)
            r6 = -1
            if (r5 == r1) goto L_0x006d
            r1 = 6
            if (r5 == r1) goto L_0x0049
            switch(r5) {
                case 0: goto L_0x0042;
                case 1: goto L_0x006d;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x006f
        L_0x0042:
            int r1 = r15.getPointerId(r3)
            r4.f52160i = r1
            goto L_0x006f
        L_0x0049:
            int r1 = android.support.p030v4.view.C1044i.m2983b(r15)
            int r7 = android.support.p030v4.view.C1044i.m2984b(r15, r1)
            int r8 = r4.f52160i
            if (r7 != r8) goto L_0x006f
            if (r1 != 0) goto L_0x0059
            r1 = 1
            goto L_0x005a
        L_0x0059:
            r1 = 0
        L_0x005a:
            int r7 = android.support.p030v4.view.C1044i.m2984b(r15, r1)
            r4.f52160i = r7
            float r7 = android.support.p030v4.view.C1044i.m2985c(r15, r1)
            r4.f52158g = r7
            float r1 = android.support.p030v4.view.C1044i.m2986d(r15, r1)
            r4.f52159h = r1
            goto L_0x006f
        L_0x006d:
            r4.f52160i = r6
        L_0x006f:
            int r1 = r4.f52160i
            if (r1 == r6) goto L_0x0076
            int r1 = r4.f52160i
            goto L_0x0077
        L_0x0076:
            r1 = 0
        L_0x0077:
            int r1 = android.support.p030v4.view.C1044i.m2982a(r15, r1)
            r4.f52161j = r1
            r1 = 0
            switch(r5) {
                case 0: goto L_0x0126;
                case 1: goto L_0x00d1;
                case 2: goto L_0x0090;
                case 3: goto L_0x0083;
                default: goto L_0x0081;
            }
        L_0x0081:
            goto L_0x0143
        L_0x0083:
            android.view.VelocityTracker r5 = r4.f52156e
            if (r5 == 0) goto L_0x0143
            android.view.VelocityTracker r5 = r4.f52156e
            r5.recycle()
            r4.f52156e = r1
            goto L_0x0143
        L_0x0090:
            float r1 = r4.mo38794a(r15)
            float r5 = r4.mo38796b(r15)
            float r6 = r4.f52158g
            float r6 = r1 - r6
            float r7 = r4.f52159h
            float r7 = r5 - r7
            boolean r8 = r4.f52157f
            if (r8 != 0) goto L_0x00ba
            float r8 = r6 * r6
            float r9 = r7 * r7
            float r8 = r8 + r9
            double r8 = (double) r8
            double r8 = java.lang.Math.sqrt(r8)
            float r10 = r4.f52152a
            double r10 = (double) r10
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x00b7
            r8 = 1
            goto L_0x00b8
        L_0x00b7:
            r8 = 0
        L_0x00b8:
            r4.f52157f = r8
        L_0x00ba:
            boolean r8 = r4.f52157f
            if (r8 == 0) goto L_0x0143
            com.ss.android.d.a.c r8 = r4.f52155d
            r8.mo38791a(r6, r7)
            r4.f52158g = r1
            r4.f52159h = r5
            android.view.VelocityTracker r1 = r4.f52156e
            if (r1 == 0) goto L_0x0143
            android.view.VelocityTracker r1 = r4.f52156e
            r1.addMovement(r15)
            goto L_0x0143
        L_0x00d1:
            boolean r5 = r4.f52157f
            if (r5 == 0) goto L_0x011a
            android.view.VelocityTracker r5 = r4.f52156e
            if (r5 == 0) goto L_0x011a
            float r5 = r4.mo38794a(r15)
            r4.f52158g = r5
            float r5 = r4.mo38796b(r15)
            r4.f52159h = r5
            android.view.VelocityTracker r5 = r4.f52156e
            r5.addMovement(r15)
            android.view.VelocityTracker r5 = r4.f52156e
            r6 = 1000(0x3e8, float:1.401E-42)
            r5.computeCurrentVelocity(r6)
            android.view.VelocityTracker r5 = r4.f52156e
            float r5 = r5.getXVelocity()
            android.view.VelocityTracker r6 = r4.f52156e
            float r6 = r6.getYVelocity()
            float r7 = java.lang.Math.abs(r5)
            float r8 = java.lang.Math.abs(r6)
            float r7 = java.lang.Math.max(r7, r8)
            float r8 = r4.f52153b
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 < 0) goto L_0x011a
            com.ss.android.d.a.c r7 = r4.f52155d
            float r8 = r4.f52158g
            float r9 = r4.f52159h
            float r5 = -r5
            float r6 = -r6
            r7.mo38793a(r8, r9, r5, r6)
        L_0x011a:
            android.view.VelocityTracker r5 = r4.f52156e
            if (r5 == 0) goto L_0x0143
            android.view.VelocityTracker r5 = r4.f52156e
            r5.recycle()
            r4.f52156e = r1
            goto L_0x0143
        L_0x0126:
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r4.f52156e = r1
            android.view.VelocityTracker r1 = r4.f52156e
            if (r1 == 0) goto L_0x0135
            android.view.VelocityTracker r1 = r4.f52156e
            r1.addMovement(r15)
        L_0x0135:
            float r1 = r4.mo38794a(r15)
            r4.f52158g = r1
            float r1 = r4.mo38796b(r15)
            r4.f52159h = r1
            r4.f52157f = r3
        L_0x0143:
            if (r14 != 0) goto L_0x014f
            com.ss.android.d.a.e r14 = r13.f91072q
            boolean r14 = r14.mo38795a()
            if (r14 != 0) goto L_0x014f
            r14 = 1
            goto L_0x0150
        L_0x014f:
            r14 = 0
        L_0x0150:
            if (r0 != 0) goto L_0x015a
            com.ss.android.d.a.e r0 = r13.f91072q
            boolean r0 = r0.f52157f
            if (r0 != 0) goto L_0x015a
            r0 = 1
            goto L_0x015b
        L_0x015a:
            r0 = 0
        L_0x015b:
            if (r14 == 0) goto L_0x0160
            if (r0 == 0) goto L_0x0160
            r3 = 1
        L_0x0160:
            r13.f91073r = r3
            android.support.v4.view.d r14 = r13.f91061f
            r14.mo3213a(r15)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.widget.photodraweeview.C35415a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    static void m80059b(float f, float f2, float f3) {
        if (f >= f2) {
            throw new IllegalArgumentException("MinZoom has to be less than MidZoom");
        } else if (f2 >= f3) {
            throw new IllegalArgumentException("MidZoom has to be less than MaxZoom");
        }
    }

    /* renamed from: a */
    public final void mo38792a(float f, float f2, float f3) {
        if (mo73722f() < this.f91059d || f < 1.0f) {
            this.f91063h.postScale(f, f, f2, f3);
            m80062n();
        }
    }

    /* renamed from: a */
    public final void mo38793a(float f, float f2, float f3, float f4) {
        int i;
        int i2;
        int i3;
        int i4;
        DraweeView b = mo73718b();
        if (b != null) {
            this.f91075t = new C35418b(b.getContext());
            C35418b bVar = this.f91075t;
            int l = m80060l();
            int m = m80061m();
            int i5 = (int) f3;
            int i6 = (int) f4;
            RectF i7 = C35415a.this.mo73725i();
            if (i7 != null) {
                int round = Math.round(-i7.left);
                float f5 = (float) l;
                if (f5 < i7.width()) {
                    i = Math.round(i7.width() - f5);
                    i2 = 0;
                } else {
                    i2 = round;
                    i = i2;
                }
                int round2 = Math.round(-i7.top);
                float f6 = (float) m;
                if (f6 < i7.height()) {
                    i3 = Math.round(i7.height() - f6);
                    i4 = 0;
                } else {
                    i4 = round2;
                    i3 = i4;
                }
                bVar.f91085b = round;
                bVar.f91086c = round2;
                if (!(round == i && round2 == i3)) {
                    bVar.f91084a.f3550a.fling(round, round2, i5, i6, i2, i, i4, i3, 0, 0);
                }
            }
            b.post(this.f91075t);
        }
    }

    /* renamed from: a */
    public final void mo73717a(float f, float f2, float f3, boolean z) {
        DraweeView b = mo73718b();
        if (b != null && f >= this.f91057b && f <= this.f91059d) {
            if (z) {
                C35417a aVar = new C35417a(mo73722f(), f, f2, f3);
                b.post(aVar);
                return;
            }
            this.f91063h.setScale(f, f, f2, f3);
            m80062n();
        }
    }
}
