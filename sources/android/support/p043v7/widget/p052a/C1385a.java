package android.support.p043v7.widget.p052a;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.p030v4.view.C1034d;
import android.support.p030v4.view.C1056u;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1325d;
import android.support.p043v7.widget.RecyclerView.C1327f;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1337j;
import android.support.p043v7.widget.RecyclerView.C1339l;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.a.a */
public final class C1385a extends C1331h implements C1337j {

    /* renamed from: A */
    private List<Integer> f4973A;

    /* renamed from: B */
    private C1325d f4974B = null;

    /* renamed from: C */
    private C1394b f4975C;

    /* renamed from: D */
    private final C1339l f4976D = new C1339l() {
        /* renamed from: a */
        public final void mo5079a(boolean z) {
            if (z) {
                C1385a.this.mo5442a((C1352v) null, 0);
            }
        }

        /* renamed from: a */
        public final boolean mo5080a(RecyclerView recyclerView, MotionEvent motionEvent) {
            C1385a.this.f4994r.mo3213a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            C1395c cVar = null;
            if (actionMasked == 0) {
                C1385a.this.f4985i = motionEvent.getPointerId(0);
                C1385a.this.f4979c = motionEvent.getX();
                C1385a.this.f4980d = motionEvent.getY();
                C1385a aVar = C1385a.this;
                if (aVar.f4991o != null) {
                    aVar.f4991o.recycle();
                }
                aVar.f4991o = VelocityTracker.obtain();
                if (C1385a.this.f4978b == null) {
                    C1385a aVar2 = C1385a.this;
                    if (!aVar2.f4988l.isEmpty()) {
                        View a = aVar2.mo5439a(motionEvent);
                        int size = aVar2.f4988l.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            C1395c cVar2 = (C1395c) aVar2.f4988l.get(size);
                            if (cVar2.f5021h.itemView == a) {
                                cVar = cVar2;
                                break;
                            }
                            size--;
                        }
                    }
                    if (cVar != null) {
                        C1385a.this.f4979c -= cVar.f5026m;
                        C1385a.this.f4980d -= cVar.f5027n;
                        C1385a.this.mo5443a(cVar.f5021h, true);
                        if (C1385a.this.f4977a.remove(cVar.f5021h.itemView)) {
                            C1385a.this.f4986j.mo5457c(C1385a.this.f4989m, cVar.f5021h);
                        }
                        C1385a.this.mo5442a(cVar.f5021h, cVar.f5022i);
                        C1385a.this.mo5445a(motionEvent, C1385a.this.f4987k, 0);
                    }
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                C1385a.this.f4985i = -1;
                C1385a.this.mo5442a((C1352v) null, 0);
            } else if (C1385a.this.f4985i != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(C1385a.this.f4985i);
                if (findPointerIndex >= 0) {
                    C1385a.this.mo5440a(actionMasked, motionEvent, findPointerIndex);
                }
            }
            if (C1385a.this.f4991o != null) {
                C1385a.this.f4991o.addMovement(motionEvent);
            }
            if (C1385a.this.f4978b != null) {
                return true;
            }
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
            r5.f5004a.mo5442a((android.support.p043v7.widget.RecyclerView.C1352v) null, 0);
            r5.f5004a.f4985i = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0080, code lost:
            return;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo5081b(android.support.p043v7.widget.RecyclerView r6, android.view.MotionEvent r7) {
            /*
                r5 = this;
                android.support.v7.widget.a.a r6 = android.support.p043v7.widget.p052a.C1385a.this
                android.support.v4.view.d r6 = r6.f4994r
                r6.mo3213a(r7)
                android.support.v7.widget.a.a r6 = android.support.p043v7.widget.p052a.C1385a.this
                android.view.VelocityTracker r6 = r6.f4991o
                if (r6 == 0) goto L_0x0014
                android.support.v7.widget.a.a r6 = android.support.p043v7.widget.p052a.C1385a.this
                android.view.VelocityTracker r6 = r6.f4991o
                r6.addMovement(r7)
            L_0x0014:
                android.support.v7.widget.a.a r6 = android.support.p043v7.widget.p052a.C1385a.this
                int r6 = r6.f4985i
                r0 = -1
                if (r6 != r0) goto L_0x001c
                return
            L_0x001c:
                int r6 = r7.getActionMasked()
                android.support.v7.widget.a.a r1 = android.support.p043v7.widget.p052a.C1385a.this
                int r1 = r1.f4985i
                int r1 = r7.findPointerIndex(r1)
                if (r1 < 0) goto L_0x002f
                android.support.v7.widget.a.a r2 = android.support.p043v7.widget.p052a.C1385a.this
                r2.mo5440a(r6, r7, r1)
            L_0x002f:
                android.support.v7.widget.a.a r2 = android.support.p043v7.widget.p052a.C1385a.this
                android.support.v7.widget.RecyclerView$v r2 = r2.f4978b
                if (r2 != 0) goto L_0x0036
                return
            L_0x0036:
                r3 = 6
                r4 = 0
                if (r6 == r3) goto L_0x0081
                switch(r6) {
                    case 1: goto L_0x0076;
                    case 2: goto L_0x004c;
                    case 3: goto L_0x003e;
                    default: goto L_0x003d;
                }
            L_0x003d:
                goto L_0x00a3
            L_0x003e:
                android.support.v7.widget.a.a r6 = android.support.p043v7.widget.p052a.C1385a.this
                android.view.VelocityTracker r6 = r6.f4991o
                if (r6 == 0) goto L_0x0076
                android.support.v7.widget.a.a r6 = android.support.p043v7.widget.p052a.C1385a.this
                android.view.VelocityTracker r6 = r6.f4991o
                r6.clear()
                goto L_0x0076
            L_0x004c:
                if (r1 < 0) goto L_0x00a3
                android.support.v7.widget.a.a r6 = android.support.p043v7.widget.p052a.C1385a.this
                android.support.v7.widget.a.a r0 = android.support.p043v7.widget.p052a.C1385a.this
                int r0 = r0.f4987k
                r6.mo5445a(r7, r0, r1)
                android.support.v7.widget.a.a r6 = android.support.p043v7.widget.p052a.C1385a.this
                r6.mo5441a(r2)
                android.support.v7.widget.a.a r6 = android.support.p043v7.widget.p052a.C1385a.this
                android.support.v7.widget.RecyclerView r6 = r6.f4989m
                android.support.v7.widget.a.a r7 = android.support.p043v7.widget.p052a.C1385a.this
                java.lang.Runnable r7 = r7.f4990n
                r6.removeCallbacks(r7)
                android.support.v7.widget.a.a r6 = android.support.p043v7.widget.p052a.C1385a.this
                java.lang.Runnable r6 = r6.f4990n
                r6.run()
                android.support.v7.widget.a.a r6 = android.support.p043v7.widget.p052a.C1385a.this
                android.support.v7.widget.RecyclerView r6 = r6.f4989m
                r6.invalidate()
                return
            L_0x0076:
                android.support.v7.widget.a.a r6 = android.support.p043v7.widget.p052a.C1385a.this
                r7 = 0
                r6.mo5442a(r7, r4)
                android.support.v7.widget.a.a r6 = android.support.p043v7.widget.p052a.C1385a.this
                r6.f4985i = r0
                return
            L_0x0081:
                int r6 = r7.getActionIndex()
                int r0 = r7.getPointerId(r6)
                android.support.v7.widget.a.a r1 = android.support.p043v7.widget.p052a.C1385a.this
                int r1 = r1.f4985i
                if (r0 != r1) goto L_0x00a3
                if (r6 != 0) goto L_0x0092
                r4 = 1
            L_0x0092:
                android.support.v7.widget.a.a r0 = android.support.p043v7.widget.p052a.C1385a.this
                int r1 = r7.getPointerId(r4)
                r0.f4985i = r1
                android.support.v7.widget.a.a r0 = android.support.p043v7.widget.p052a.C1385a.this
                android.support.v7.widget.a.a r1 = android.support.p043v7.widget.p052a.C1385a.this
                int r1 = r1.f4987k
                r0.mo5445a(r7, r1, r6)
            L_0x00a3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.p052a.C1385a.C13872.mo5081b(android.support.v7.widget.RecyclerView, android.view.MotionEvent):void");
        }
    };

    /* renamed from: a */
    final List<View> f4977a = new ArrayList();

    /* renamed from: b */
    C1352v f4978b = null;

    /* renamed from: c */
    float f4979c;

    /* renamed from: d */
    float f4980d;

    /* renamed from: e */
    float f4981e;

    /* renamed from: f */
    float f4982f;

    /* renamed from: g */
    float f4983g;

    /* renamed from: h */
    float f4984h;

    /* renamed from: i */
    int f4985i = -1;

    /* renamed from: j */
    C1391a f4986j;

    /* renamed from: k */
    int f4987k;

    /* renamed from: l */
    List<C1395c> f4988l = new ArrayList();

    /* renamed from: m */
    RecyclerView f4989m;

    /* renamed from: n */
    final Runnable f4990n = new Runnable() {
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cc, code lost:
            if (r2 > 0) goto L_0x00d0;
         */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00d2  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00ec  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0108  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0113  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0120  */
        /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r17 = this;
                r0 = r17
                android.support.v7.widget.a.a r1 = android.support.p043v7.widget.p052a.C1385a.this
                android.support.v7.widget.RecyclerView$v r1 = r1.f4978b
                if (r1 == 0) goto L_0x0141
                android.support.v7.widget.a.a r1 = android.support.p043v7.widget.p052a.C1385a.this
                android.support.v7.widget.RecyclerView$v r2 = r1.f4978b
                r3 = 0
                r4 = -9223372036854775808
                if (r2 == 0) goto L_0x011c
                long r6 = java.lang.System.currentTimeMillis()
                long r8 = r1.f4996t
                int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r2 != 0) goto L_0x001e
                r8 = 0
                goto L_0x0022
            L_0x001e:
                long r8 = r1.f4996t
                long r8 = r6 - r8
            L_0x0022:
                android.support.v7.widget.RecyclerView r2 = r1.f4989m
                android.support.v7.widget.RecyclerView$i r2 = r2.getLayoutManager()
                android.graphics.Rect r10 = r1.f4995s
                if (r10 != 0) goto L_0x0033
                android.graphics.Rect r10 = new android.graphics.Rect
                r10.<init>()
                r1.f4995s = r10
            L_0x0033:
                android.support.v7.widget.RecyclerView$v r10 = r1.f4978b
                android.view.View r10 = r10.itemView
                android.graphics.Rect r11 = r1.f4995s
                r2.mo5039b(r10, r11)
                boolean r10 = r2.mo4742e()
                r11 = 0
                if (r10 == 0) goto L_0x0086
                float r10 = r1.f4983g
                float r12 = r1.f4981e
                float r10 = r10 + r12
                int r10 = (int) r10
                android.graphics.Rect r12 = r1.f4995s
                int r12 = r12.left
                int r12 = r10 - r12
                android.support.v7.widget.RecyclerView r13 = r1.f4989m
                int r13 = r13.getPaddingLeft()
                int r12 = r12 - r13
                float r13 = r1.f4981e
                int r13 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r13 >= 0) goto L_0x0060
                if (r12 >= 0) goto L_0x0060
                r13 = r12
                goto L_0x0087
            L_0x0060:
                float r12 = r1.f4981e
                int r12 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
                if (r12 <= 0) goto L_0x0086
                android.support.v7.widget.RecyclerView$v r12 = r1.f4978b
                android.view.View r12 = r12.itemView
                int r12 = r12.getWidth()
                int r10 = r10 + r12
                android.graphics.Rect r12 = r1.f4995s
                int r12 = r12.right
                int r10 = r10 + r12
                android.support.v7.widget.RecyclerView r12 = r1.f4989m
                int r12 = r12.getWidth()
                android.support.v7.widget.RecyclerView r13 = r1.f4989m
                int r13 = r13.getPaddingRight()
                int r12 = r12 - r13
                int r10 = r10 - r12
                if (r10 <= 0) goto L_0x0086
                r13 = r10
                goto L_0x0087
            L_0x0086:
                r13 = 0
            L_0x0087:
                boolean r2 = r2.mo4745f()
                if (r2 == 0) goto L_0x00cf
                float r2 = r1.f4984h
                float r10 = r1.f4982f
                float r2 = r2 + r10
                int r2 = (int) r2
                android.graphics.Rect r10 = r1.f4995s
                int r10 = r10.top
                int r10 = r2 - r10
                android.support.v7.widget.RecyclerView r12 = r1.f4989m
                int r12 = r12.getPaddingTop()
                int r10 = r10 - r12
                float r12 = r1.f4982f
                int r12 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
                if (r12 >= 0) goto L_0x00aa
                if (r10 >= 0) goto L_0x00aa
                r2 = r10
                goto L_0x00d0
            L_0x00aa:
                float r10 = r1.f4982f
                int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
                if (r10 <= 0) goto L_0x00cf
                android.support.v7.widget.RecyclerView$v r10 = r1.f4978b
                android.view.View r10 = r10.itemView
                int r10 = r10.getHeight()
                int r2 = r2 + r10
                android.graphics.Rect r10 = r1.f4995s
                int r10 = r10.bottom
                int r2 = r2 + r10
                android.support.v7.widget.RecyclerView r10 = r1.f4989m
                int r10 = r10.getHeight()
                android.support.v7.widget.RecyclerView r11 = r1.f4989m
                int r11 = r11.getPaddingBottom()
                int r10 = r10 - r11
                int r2 = r2 - r10
                if (r2 <= 0) goto L_0x00cf
                goto L_0x00d0
            L_0x00cf:
                r2 = 0
            L_0x00d0:
                if (r13 == 0) goto L_0x00e9
                android.support.v7.widget.a.a$a r10 = r1.f4986j
                android.support.v7.widget.RecyclerView r11 = r1.f4989m
                android.support.v7.widget.RecyclerView$v r12 = r1.f4978b
                android.view.View r12 = r12.itemView
                int r12 = r12.getWidth()
                android.support.v7.widget.RecyclerView r14 = r1.f4989m
                int r14 = r14.getWidth()
                r15 = r8
                int r13 = r10.mo5450a(r11, r12, r13, r14, r15)
            L_0x00e9:
                r15 = r13
                if (r2 == 0) goto L_0x0108
                android.support.v7.widget.a.a$a r10 = r1.f4986j
                android.support.v7.widget.RecyclerView r11 = r1.f4989m
                android.support.v7.widget.RecyclerView$v r12 = r1.f4978b
                android.view.View r12 = r12.itemView
                int r12 = r12.getHeight()
                android.support.v7.widget.RecyclerView r13 = r1.f4989m
                int r14 = r13.getHeight()
                r13 = r2
                r2 = r15
                r15 = r8
                int r8 = r10.mo5450a(r11, r12, r13, r14, r15)
                r13 = r2
                r2 = r8
                goto L_0x0109
            L_0x0108:
                r13 = r15
            L_0x0109:
                if (r13 != 0) goto L_0x010d
                if (r2 == 0) goto L_0x011c
            L_0x010d:
                long r8 = r1.f4996t
                int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r3 != 0) goto L_0x0115
                r1.f4996t = r6
            L_0x0115:
                android.support.v7.widget.RecyclerView r1 = r1.f4989m
                r1.scrollBy(r13, r2)
                r3 = 1
                goto L_0x011e
            L_0x011c:
                r1.f4996t = r4
            L_0x011e:
                if (r3 == 0) goto L_0x0141
                android.support.v7.widget.a.a r1 = android.support.p043v7.widget.p052a.C1385a.this
                android.support.v7.widget.RecyclerView$v r1 = r1.f4978b
                if (r1 == 0) goto L_0x012f
                android.support.v7.widget.a.a r1 = android.support.p043v7.widget.p052a.C1385a.this
                android.support.v7.widget.a.a r2 = android.support.p043v7.widget.p052a.C1385a.this
                android.support.v7.widget.RecyclerView$v r2 = r2.f4978b
                r1.mo5441a(r2)
            L_0x012f:
                android.support.v7.widget.a.a r1 = android.support.p043v7.widget.p052a.C1385a.this
                android.support.v7.widget.RecyclerView r1 = r1.f4989m
                android.support.v7.widget.a.a r2 = android.support.p043v7.widget.p052a.C1385a.this
                java.lang.Runnable r2 = r2.f4990n
                r1.removeCallbacks(r2)
                android.support.v7.widget.a.a r1 = android.support.p043v7.widget.p052a.C1385a.this
                android.support.v7.widget.RecyclerView r1 = r1.f4989m
                android.support.p030v4.view.C1056u.m3034a(r1, r0)
            L_0x0141:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.p052a.C1385a.C13861.run():void");
        }
    };

    /* renamed from: o */
    VelocityTracker f4991o;

    /* renamed from: p */
    View f4992p = null;

    /* renamed from: q */
    int f4993q = -1;

    /* renamed from: r */
    C1034d f4994r;

    /* renamed from: s */
    Rect f4995s;

    /* renamed from: t */
    long f4996t;

    /* renamed from: u */
    private final float[] f4997u = new float[2];

    /* renamed from: v */
    private float f4998v;

    /* renamed from: w */
    private float f4999w;

    /* renamed from: x */
    private int f5000x = 0;

    /* renamed from: y */
    private int f5001y;

    /* renamed from: z */
    private List<C1352v> f5002z;

    /* renamed from: android.support.v7.widget.a.a$a */
    public static abstract class C1391a {

        /* renamed from: a */
        private static final Interpolator f5012a = new Interpolator() {
            public final float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        };

        /* renamed from: b */
        private static final Interpolator f5013b = new Interpolator() {
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        };

        /* renamed from: c */
        private int f5014c = -1;

        /* renamed from: a */
        public static float m4817a(float f) {
            return f;
        }

        /* renamed from: a */
        public static int m4818a(int i, int i2) {
            int i3 = i & 789516;
            if (i3 == 0) {
                return i;
            }
            int i4 = i & (i3 ^ -1);
            if (i2 == 0) {
                return i4 | (i3 << 2);
            }
            int i5 = i3 << 1;
            return i4 | (-789517 & i5) | ((i5 & 789516) << 2);
        }

        /* renamed from: b */
        public static float m4822b(float f) {
            return f;
        }

        /* renamed from: c */
        public static int m4824c(int i, int i2) {
            int i3 = i & 3158064;
            if (i3 == 0) {
                return i;
            }
            int i4 = i & (i3 ^ -1);
            if (i2 == 0) {
                return i4 | (i3 >> 2);
            }
            int i5 = i3 >> 1;
            return i4 | (-3158065 & i5) | ((i5 & 3158064) >> 2);
        }

        /* renamed from: d */
        private static int m4825d(int i, int i2) {
            return i2 << (i * 8);
        }

        /* renamed from: a */
        public abstract int mo5451a(RecyclerView recyclerView, C1352v vVar);

        /* renamed from: a */
        public abstract void mo5453a(C1352v vVar, int i);

        /* renamed from: a */
        public abstract boolean mo5454a(RecyclerView recyclerView, C1352v vVar, C1352v vVar2);

        /* renamed from: b */
        public void mo5456b(C1352v vVar, int i) {
        }

        /* renamed from: a */
        private int m4819a(RecyclerView recyclerView) {
            if (this.f5014c == -1) {
                this.f5014c = recyclerView.getResources().getDimensionPixelSize(R.dimen.iz);
            }
            return this.f5014c;
        }

        /* renamed from: c */
        public void mo5457c(RecyclerView recyclerView, C1352v vVar) {
            C1399c.f5032a.mo5468a(vVar.itemView);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final int mo5455b(RecyclerView recyclerView, C1352v vVar) {
            return m4824c(mo5451a(recyclerView, vVar), C1056u.m3055f(recyclerView));
        }

        /* renamed from: b */
        public static int m4823b(int i, int i2) {
            return m4825d(2, 15) | m4825d(1, 0) | m4825d(0, 15);
        }

        /* renamed from: a */
        public static long m4820a(RecyclerView recyclerView, int i, float f, float f2) {
            C1327f itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                if (i == 8) {
                    return 200;
                }
                return 250;
            } else if (i == 8) {
                return itemAnimator.f4730k;
            } else {
                return itemAnimator.f4729j;
            }
        }

        /* renamed from: a */
        public static C1352v m4821a(C1352v vVar, List<C1352v> list, int i, int i2) {
            int width = vVar.itemView.getWidth() + i;
            int height = vVar.itemView.getHeight() + i2;
            int left = i - vVar.itemView.getLeft();
            int top = i2 - vVar.itemView.getTop();
            int size = list.size();
            C1352v vVar2 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                C1352v vVar3 = (C1352v) list.get(i4);
                if (left > 0) {
                    int right = vVar3.itemView.getRight() - width;
                    if (right < 0 && vVar3.itemView.getRight() > vVar.itemView.getRight()) {
                        int abs = Math.abs(right);
                        if (abs > i3) {
                            vVar2 = vVar3;
                            i3 = abs;
                        }
                    }
                }
                if (left < 0) {
                    int left2 = vVar3.itemView.getLeft() - i;
                    if (left2 > 0 && vVar3.itemView.getLeft() < vVar.itemView.getLeft()) {
                        int abs2 = Math.abs(left2);
                        if (abs2 > i3) {
                            vVar2 = vVar3;
                            i3 = abs2;
                        }
                    }
                }
                if (top < 0) {
                    int top2 = vVar3.itemView.getTop() - i2;
                    if (top2 > 0 && vVar3.itemView.getTop() < vVar.itemView.getTop()) {
                        int abs3 = Math.abs(top2);
                        if (abs3 > i3) {
                            vVar2 = vVar3;
                            i3 = abs3;
                        }
                    }
                }
                if (top > 0) {
                    int bottom = vVar3.itemView.getBottom() - height;
                    if (bottom < 0 && vVar3.itemView.getBottom() > vVar.itemView.getBottom()) {
                        int abs4 = Math.abs(bottom);
                        if (abs4 > i3) {
                            vVar2 = vVar3;
                            i3 = abs4;
                        }
                    }
                }
            }
            return vVar2;
        }

        /* renamed from: a */
        public final int mo5450a(RecyclerView recyclerView, int i, int i2, int i3, long j) {
            int signum = (int) Math.signum((float) i2);
            float f = 1.0f;
            int a = (int) (((float) (signum * m4819a(recyclerView))) * f5013b.getInterpolation(Math.min(1.0f, (((float) Math.abs(i2)) * 1.0f) / ((float) i))));
            if (j <= 2000) {
                f = ((float) j) / 2000.0f;
            }
            int interpolation = (int) (((float) a) * f5012a.getInterpolation(f));
            if (interpolation != 0) {
                return interpolation;
            }
            if (i2 > 0) {
                return 1;
            }
            return -1;
        }

        /* renamed from: a */
        public void mo5452a(Canvas canvas, RecyclerView recyclerView, C1352v vVar, float f, float f2, int i, boolean z) {
            C1399c.f5032a.mo5467a(canvas, recyclerView, vVar.itemView, f, f2, i, z);
        }
    }

    /* renamed from: android.support.v7.widget.a.a$b */
    class C1394b extends SimpleOnGestureListener {

        /* renamed from: a */
        boolean f5015a = true;

        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        C1394b() {
        }

        public final void onLongPress(MotionEvent motionEvent) {
            boolean z;
            if (this.f5015a) {
                View a = C1385a.this.mo5439a(motionEvent);
                if (a != null) {
                    C1352v b = C1385a.this.f4989m.mo4812b(a);
                    if (b != null) {
                        if ((C1385a.this.f4986j.mo5455b(C1385a.this.f4989m, b) & 16711680) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z && motionEvent.getPointerId(0) == C1385a.this.f4985i) {
                            int findPointerIndex = motionEvent.findPointerIndex(C1385a.this.f4985i);
                            float x = motionEvent.getX(findPointerIndex);
                            float y = motionEvent.getY(findPointerIndex);
                            C1385a.this.f4979c = x;
                            C1385a.this.f4980d = y;
                            C1385a aVar = C1385a.this;
                            C1385a.this.f4982f = 0.0f;
                            aVar.f4981e = 0.0f;
                            C1385a.this.mo5442a(b, 2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v7.widget.a.a$c */
    static class C1395c implements AnimatorListener {

        /* renamed from: d */
        final float f5017d;

        /* renamed from: e */
        final float f5018e;

        /* renamed from: f */
        final float f5019f;

        /* renamed from: g */
        final float f5020g;

        /* renamed from: h */
        final C1352v f5021h;

        /* renamed from: i */
        final int f5022i;

        /* renamed from: j */
        final ValueAnimator f5023j = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});

        /* renamed from: k */
        final int f5024k;

        /* renamed from: l */
        boolean f5025l;

        /* renamed from: m */
        float f5026m;

        /* renamed from: n */
        float f5027n;

        /* renamed from: o */
        boolean f5028o;

        /* renamed from: p */
        boolean f5029p;

        /* renamed from: q */
        public float f5030q;

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        /* renamed from: a */
        public final void mo5462a() {
            this.f5023j.cancel();
        }

        public void onAnimationCancel(Animator animator) {
            this.f5030q = 1.0f;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f5029p) {
                this.f5021h.setIsRecyclable(true);
            }
            this.f5029p = true;
        }

        C1395c(C1352v vVar, int i, int i2, float f, float f2, float f3, float f4) {
            this.f5022i = i2;
            this.f5024k = i;
            this.f5021h = vVar;
            this.f5017d = f;
            this.f5018e = f2;
            this.f5019f = f3;
            this.f5020g = f4;
            this.f5023j.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C1395c.this.f5030q = valueAnimator.getAnimatedFraction();
                }
            });
            this.f5023j.setTarget(vVar.itemView);
            this.f5023j.addListener(this);
            this.f5030q = 0.0f;
        }
    }

    /* renamed from: android.support.v7.widget.a.a$d */
    public interface C1397d {
        /* renamed from: a */
        void mo4727a(View view, View view2, int i, int i2);
    }

    /* renamed from: a */
    public final void mo5076a(View view) {
    }

    /* renamed from: a */
    public final void mo5444a(RecyclerView recyclerView) {
        if (this.f4989m != recyclerView) {
            if (this.f4989m != null) {
                this.f4989m.mo4815b((C1331h) this);
                this.f4989m.mo4817b(this.f4976D);
                this.f4989m.mo4816b((C1337j) this);
                int size = this.f4988l.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.f4986j.mo5457c(this.f4989m, ((C1395c) this.f4988l.get(0)).f5021h);
                }
                this.f4988l.clear();
                this.f4992p = null;
                this.f4993q = -1;
                m4798a();
                if (this.f4975C != null) {
                    this.f4975C.f5015a = false;
                    this.f4975C = null;
                }
                if (this.f4994r != null) {
                    this.f4994r = null;
                }
            }
            this.f4989m = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.f4998v = resources.getDimension(R.dimen.j1);
                this.f4999w = resources.getDimension(R.dimen.j0);
                this.f5001y = ViewConfiguration.get(this.f4989m.getContext()).getScaledTouchSlop();
                this.f4989m.mo4798a((C1331h) this);
                this.f4989m.mo4800a(this.f4976D);
                this.f4989m.mo4799a((C1337j) this);
                this.f4975C = new C1394b();
                this.f4994r = new C1034d(this.f4989m.getContext(), this.f4975C);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5445a(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        this.f4981e = x - this.f4979c;
        this.f4982f = y - this.f4980d;
        if ((i & 4) == 0) {
            this.f4981e = Math.max(0.0f, this.f4981e);
        }
        if ((i & 8) == 0) {
            this.f4981e = Math.min(0.0f, this.f4981e);
        }
        if ((i & 1) == 0) {
            this.f4982f = Math.max(0.0f, this.f4982f);
        }
        if ((i & 2) == 0) {
            this.f4982f = Math.min(0.0f, this.f4982f);
        }
    }

    /* renamed from: a */
    private void m4798a() {
        if (this.f4991o != null) {
            this.f4991o.recycle();
            this.f4991o = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo5446c(View view) {
        if (view == this.f4992p) {
            this.f4992p = null;
            if (this.f4974B != null) {
                this.f4989m.setChildDrawingOrderCallback(null);
            }
        }
    }

    public C1385a(C1391a aVar) {
        this.f4986j = aVar;
    }

    /* renamed from: b */
    public final void mo5077b(View view) {
        mo5446c(view);
        C1352v b = this.f4989m.mo4812b(view);
        if (b != null) {
            if (this.f4978b == null || b != this.f4978b) {
                mo5443a(b, false);
                if (this.f4977a.remove(b.itemView)) {
                    this.f4986j.mo5457c(this.f4989m, b);
                }
                return;
            }
            mo5442a((C1352v) null, 0);
        }
    }

    /* renamed from: a */
    private void m4799a(float[] fArr) {
        if ((this.f4987k & 12) != 0) {
            fArr[0] = (this.f4983g + this.f4981e) - ((float) this.f4978b.itemView.getLeft());
        } else {
            fArr[0] = this.f4978b.itemView.getTranslationX();
        }
        if ((this.f4987k & 3) != 0) {
            fArr[1] = (this.f4984h + this.f4982f) - ((float) this.f4978b.itemView.getTop());
        } else {
            fArr[1] = this.f4978b.itemView.getTranslationY();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final View mo5439a(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (this.f4978b != null) {
            View view = this.f4978b.itemView;
            if (m4800a(view, x, y, this.f4983g + this.f4981e, this.f4984h + this.f4982f)) {
                return view;
            }
        }
        for (int size = this.f4988l.size() - 1; size >= 0; size--) {
            C1395c cVar = (C1395c) this.f4988l.get(size);
            View view2 = cVar.f5021h.itemView;
            if (m4800a(view2, x, y, cVar.f5026m, cVar.f5027n)) {
                return view2;
            }
        }
        return this.f4989m.mo4793a(x, y);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5441a(C1352v vVar) {
        int i;
        int i2;
        C1352v vVar2 = vVar;
        if (!this.f4989m.isLayoutRequested() && this.f5000x == 2) {
            int i3 = (int) (this.f4983g + this.f4981e);
            int i4 = (int) (this.f4984h + this.f4982f);
            if (((float) Math.abs(i4 - vVar2.itemView.getTop())) >= ((float) vVar2.itemView.getHeight()) * 0.5f || ((float) Math.abs(i3 - vVar2.itemView.getLeft())) >= ((float) vVar2.itemView.getWidth()) * 0.5f) {
                if (this.f5002z == null) {
                    this.f5002z = new ArrayList();
                    this.f4973A = new ArrayList();
                } else {
                    this.f5002z.clear();
                    this.f4973A.clear();
                }
                int round = Math.round(this.f4983g + this.f4981e) - 0;
                int round2 = Math.round(this.f4984h + this.f4982f) - 0;
                int width = vVar2.itemView.getWidth() + round + 0;
                int height = vVar2.itemView.getHeight() + round2 + 0;
                int i5 = (round + width) / 2;
                int i6 = (round2 + height) / 2;
                C1332i layoutManager = this.f4989m.getLayoutManager();
                int s = layoutManager.mo5062s();
                int i7 = 0;
                while (i7 < s) {
                    View g = layoutManager.mo5050g(i7);
                    if (g == vVar2.itemView || g.getBottom() < round2 || g.getTop() > height || g.getRight() < round || g.getLeft() > width) {
                        i2 = round;
                        i = round2;
                    } else {
                        C1352v b = this.f4989m.mo4812b(g);
                        int abs = Math.abs(i5 - ((g.getLeft() + g.getRight()) / 2));
                        int abs2 = Math.abs(i6 - ((g.getTop() + g.getBottom()) / 2));
                        int i8 = (abs * abs) + (abs2 * abs2);
                        int size = this.f5002z.size();
                        i2 = round;
                        i = round2;
                        int i9 = 0;
                        int i10 = 0;
                        while (i9 < size) {
                            int i11 = size;
                            if (i8 <= ((Integer) this.f4973A.get(i9)).intValue()) {
                                break;
                            }
                            i10++;
                            i9++;
                            size = i11;
                        }
                        this.f5002z.add(i10, b);
                        this.f4973A.add(i10, Integer.valueOf(i8));
                    }
                    i7++;
                    round = i2;
                    round2 = i;
                }
                List<C1352v> list = this.f5002z;
                if (list.size() != 0) {
                    C1352v a = C1391a.m4821a(vVar2, list, i3, i4);
                    if (a == null) {
                        this.f5002z.clear();
                        this.f4973A.clear();
                        return;
                    }
                    int adapterPosition = a.getAdapterPosition();
                    vVar.getAdapterPosition();
                    if (this.f4986j.mo5454a(this.f4989m, vVar2, a)) {
                        RecyclerView recyclerView = this.f4989m;
                        C1332i layoutManager2 = recyclerView.getLayoutManager();
                        if (layoutManager2 instanceof C1397d) {
                            ((C1397d) layoutManager2).mo4727a(vVar2.itemView, a.itemView, i3, i4);
                            return;
                        }
                        if (layoutManager2.mo4742e()) {
                            if (layoutManager2.mo5049g(a.itemView) <= recyclerView.getPaddingLeft()) {
                                recyclerView.mo4814b(adapterPosition);
                            }
                            if (layoutManager2.mo5053i(a.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                                recyclerView.mo4814b(adapterPosition);
                            }
                        }
                        if (layoutManager2.mo4745f()) {
                            if (layoutManager2.mo5051h(a.itemView) <= recyclerView.getPaddingTop()) {
                                recyclerView.mo4814b(adapterPosition);
                            }
                            if (layoutManager2.mo5055j(a.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                                recyclerView.mo4814b(adapterPosition);
                            }
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5443a(C1352v vVar, boolean z) {
        for (int size = this.f4988l.size() - 1; size >= 0; size--) {
            C1395c cVar = (C1395c) this.f4988l.get(size);
            if (cVar.f5021h == vVar) {
                cVar.f5028o |= z;
                if (!cVar.f5029p) {
                    cVar.mo5462a();
                }
                this.f4988l.remove(size);
                return;
            }
        }
    }

    /* renamed from: b */
    private int m4801b(C1352v vVar, int i) {
        int i2;
        if ((i & 12) != 0) {
            int i3 = 4;
            if (this.f4981e > 0.0f) {
                i2 = 8;
            } else {
                i2 = 4;
            }
            if (this.f4991o != null && this.f4985i >= 0) {
                this.f4991o.computeCurrentVelocity(1000, C1391a.m4822b(this.f4999w));
                float xVelocity = this.f4991o.getXVelocity(this.f4985i);
                float yVelocity = this.f4991o.getYVelocity(this.f4985i);
                if (xVelocity > 0.0f) {
                    i3 = 8;
                }
                float abs = Math.abs(xVelocity);
                if ((i3 & i) != 0 && i2 == i3 && abs >= C1391a.m4817a(this.f4998v) && abs > Math.abs(yVelocity)) {
                    return i3;
                }
            }
            float width = ((float) this.f4989m.getWidth()) * 0.5f;
            if ((i & i2) != 0 && Math.abs(this.f4981e) > width) {
                return i2;
            }
        }
        return 0;
    }

    /* renamed from: c */
    private int m4802c(C1352v vVar, int i) {
        int i2;
        if ((i & 3) != 0) {
            int i3 = 1;
            if (this.f4982f > 0.0f) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            if (this.f4991o != null && this.f4985i >= 0) {
                this.f4991o.computeCurrentVelocity(1000, C1391a.m4822b(this.f4999w));
                float xVelocity = this.f4991o.getXVelocity(this.f4985i);
                float yVelocity = this.f4991o.getYVelocity(this.f4985i);
                if (yVelocity > 0.0f) {
                    i3 = 2;
                }
                float abs = Math.abs(yVelocity);
                if ((i3 & i) != 0 && i3 == i2 && abs >= C1391a.m4817a(this.f4998v) && abs > Math.abs(xVelocity)) {
                    return i3;
                }
            }
            float height = ((float) this.f4989m.getHeight()) * 0.5f;
            if ((i & i2) != 0 && Math.abs(this.f4982f) > height) {
                return i2;
            }
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a7, code lost:
        if (r0 > 0) goto L_0x00a1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5442a(android.support.p043v7.widget.RecyclerView.C1352v r24, int r25) {
        /*
            r23 = this;
            r11 = r23
            r12 = r24
            r13 = r25
            android.support.v7.widget.RecyclerView$v r0 = r11.f4978b
            if (r12 != r0) goto L_0x000f
            int r0 = r11.f5000x
            if (r13 != r0) goto L_0x000f
            return
        L_0x000f:
            r0 = -9223372036854775808
            r11.f4996t = r0
            int r4 = r11.f5000x
            r14 = 1
            r11.mo5443a(r12, r14)
            r11.f5000x = r13
            r15 = 2
            if (r13 != r15) goto L_0x0045
            if (r12 == 0) goto L_0x003d
            android.view.View r0 = r12.itemView
            r11.f4992p = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 >= r1) goto L_0x0045
            android.support.v7.widget.RecyclerView$d r0 = r11.f4974B
            if (r0 != 0) goto L_0x0035
            android.support.v7.widget.a.a$5 r0 = new android.support.v7.widget.a.a$5
            r0.<init>()
            r11.f4974B = r0
        L_0x0035:
            android.support.v7.widget.RecyclerView r0 = r11.f4989m
            android.support.v7.widget.RecyclerView$d r1 = r11.f4974B
            r0.setChildDrawingOrderCallback(r1)
            goto L_0x0045
        L_0x003d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Must pass a ViewHolder when dragging"
            r0.<init>(r1)
            throw r0
        L_0x0045:
            int r0 = r13 * 8
            r10 = 8
            int r0 = r0 + r10
            int r0 = r14 << r0
            int r16 = r0 + -1
            android.support.v7.widget.RecyclerView$v r0 = r11.f4978b
            r9 = 0
            if (r0 == 0) goto L_0x0172
            android.support.v7.widget.RecyclerView$v r8 = r11.f4978b
            android.view.View r0 = r8.itemView
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x015d
            if (r4 == r15) goto L_0x00c8
            int r0 = r11.f5000x
            if (r0 == r15) goto L_0x00c8
            android.support.v7.widget.a.a$a r0 = r11.f4986j
            android.support.v7.widget.RecyclerView r1 = r11.f4989m
            int r0 = r0.mo5451a(r1, r8)
            android.support.v7.widget.RecyclerView r1 = r11.f4989m
            int r1 = android.support.p030v4.view.C1056u.m3055f(r1)
            int r1 = android.support.p043v7.widget.p052a.C1385a.C1391a.m4824c(r0, r1)
            r2 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r2
            int r1 = r1 >> r10
            if (r1 == 0) goto L_0x00c8
            r0 = r0 & r2
            int r0 = r0 >> r10
            float r2 = r11.f4981e
            float r2 = java.lang.Math.abs(r2)
            float r3 = r11.f4982f
            float r3 = java.lang.Math.abs(r3)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x00aa
            int r2 = r11.m4801b(r8, r1)
            if (r2 <= 0) goto L_0x00a3
            r0 = r0 & r2
            if (r0 != 0) goto L_0x00b0
            android.support.v7.widget.RecyclerView r0 = r11.f4989m
            int r0 = android.support.p030v4.view.C1056u.m3055f(r0)
            int r0 = android.support.p043v7.widget.p052a.C1385a.C1391a.m4818a(r2, r0)
        L_0x00a1:
            r7 = r0
            goto L_0x00c9
        L_0x00a3:
            int r0 = r11.m4802c(r8, r1)
            if (r0 <= 0) goto L_0x00c8
            goto L_0x00a1
        L_0x00aa:
            int r2 = r11.m4802c(r8, r1)
            if (r2 <= 0) goto L_0x00b2
        L_0x00b0:
            r7 = r2
            goto L_0x00c9
        L_0x00b2:
            int r1 = r11.m4801b(r8, r1)
            if (r1 <= 0) goto L_0x00c8
            r0 = r0 & r1
            if (r0 != 0) goto L_0x00c6
            android.support.v7.widget.RecyclerView r0 = r11.f4989m
            int r0 = android.support.p030v4.view.C1056u.m3055f(r0)
            int r0 = android.support.p043v7.widget.p052a.C1385a.C1391a.m4818a(r1, r0)
            goto L_0x00a1
        L_0x00c6:
            r7 = r1
            goto L_0x00c9
        L_0x00c8:
            r7 = 0
        L_0x00c9:
            r23.m4798a()
            r0 = 4
            r1 = 0
            if (r7 == r0) goto L_0x00f4
            if (r7 == r10) goto L_0x00f4
            r2 = 16
            if (r7 == r2) goto L_0x00f4
            r2 = 32
            if (r7 == r2) goto L_0x00f4
            switch(r7) {
                case 1: goto L_0x00e2;
                case 2: goto L_0x00e2;
                default: goto L_0x00dd;
            }
        L_0x00dd:
            r17 = 0
        L_0x00df:
            r18 = 0
            goto L_0x0107
        L_0x00e2:
            float r2 = r11.f4982f
            float r2 = java.lang.Math.signum(r2)
            android.support.v7.widget.RecyclerView r3 = r11.f4989m
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r2 = r2 * r3
            r17 = r2
            goto L_0x00df
        L_0x00f4:
            float r2 = r11.f4981e
            float r2 = java.lang.Math.signum(r2)
            android.support.v7.widget.RecyclerView r3 = r11.f4989m
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r2 = r2 * r3
            r18 = r2
            r17 = 0
        L_0x0107:
            if (r4 != r15) goto L_0x010c
            r6 = 8
            goto L_0x0111
        L_0x010c:
            if (r7 <= 0) goto L_0x0110
            r6 = 2
            goto L_0x0111
        L_0x0110:
            r6 = 4
        L_0x0111:
            float[] r0 = r11.f4997u
            r11.m4799a(r0)
            float[] r0 = r11.f4997u
            r19 = r0[r9]
            float[] r0 = r11.f4997u
            r20 = r0[r14]
            android.support.v7.widget.a.a$3 r5 = new android.support.v7.widget.a.a$3
            r0 = r5
            r1 = r23
            r2 = r8
            r3 = r6
            r14 = r5
            r5 = r19
            r15 = r6
            r6 = r20
            r21 = r7
            r7 = r18
            r22 = r8
            r8 = r17
            r13 = 0
            r9 = r21
            r21 = 8
            r10 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            android.support.v7.widget.RecyclerView r0 = r11.f4989m
            float r1 = r18 - r19
            float r2 = r17 - r20
            long r0 = android.support.p043v7.widget.p052a.C1385a.C1391a.m4820a(r0, r15, r1, r2)
            android.animation.ValueAnimator r2 = r14.f5023j
            r2.setDuration(r0)
            java.util.List<android.support.v7.widget.a.a$c> r0 = r11.f4988l
            r0.add(r14)
            android.support.v7.widget.RecyclerView$v r0 = r14.f5021h
            r0.setIsRecyclable(r13)
            android.animation.ValueAnimator r0 = r14.f5023j
            r0.start()
            r9 = 1
            goto L_0x016e
        L_0x015d:
            r0 = r8
            r13 = 0
            r21 = 8
            android.view.View r1 = r0.itemView
            r11.mo5446c(r1)
            android.support.v7.widget.a.a$a r1 = r11.f4986j
            android.support.v7.widget.RecyclerView r2 = r11.f4989m
            r1.mo5457c(r2, r0)
            r9 = 0
        L_0x016e:
            r0 = 0
            r11.f4978b = r0
            goto L_0x0176
        L_0x0172:
            r13 = 0
            r21 = 8
            r9 = 0
        L_0x0176:
            if (r12 == 0) goto L_0x01a9
            android.support.v7.widget.a.a$a r0 = r11.f4986j
            android.support.v7.widget.RecyclerView r1 = r11.f4989m
            int r0 = r0.mo5455b(r1, r12)
            r0 = r0 & r16
            int r1 = r11.f5000x
            int r1 = r1 * 8
            int r0 = r0 >> r1
            r11.f4987k = r0
            android.view.View r0 = r12.itemView
            int r0 = r0.getLeft()
            float r0 = (float) r0
            r11.f4983g = r0
            android.view.View r0 = r12.itemView
            int r0 = r0.getTop()
            float r0 = (float) r0
            r11.f4984h = r0
            r11.f4978b = r12
            r0 = r25
            r1 = 2
            if (r0 != r1) goto L_0x01a9
            android.support.v7.widget.RecyclerView$v r0 = r11.f4978b
            android.view.View r0 = r0.itemView
            r0.performHapticFeedback(r13)
        L_0x01a9:
            android.support.v7.widget.RecyclerView r0 = r11.f4989m
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x01b9
            android.support.v7.widget.RecyclerView$v r1 = r11.f4978b
            if (r1 == 0) goto L_0x01b6
            r13 = 1
        L_0x01b6:
            r0.requestDisallowInterceptTouchEvent(r13)
        L_0x01b9:
            if (r9 != 0) goto L_0x01c4
            android.support.v7.widget.RecyclerView r0 = r11.f4989m
            android.support.v7.widget.RecyclerView$i r0 = r0.getLayoutManager()
            r0.mo5017E()
        L_0x01c4:
            android.support.v7.widget.a.a$a r0 = r11.f4986j
            android.support.v7.widget.RecyclerView$v r1 = r11.f4978b
            int r2 = r11.f5000x
            r0.mo5456b(r1, r2)
            android.support.v7.widget.RecyclerView r0 = r11.f4989m
            r0.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.p052a.C1385a.mo5442a(android.support.v7.widget.RecyclerView$v, int):void");
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1349s sVar) {
        boolean z = false;
        if (this.f4978b != null) {
            m4799a(this.f4997u);
            float f = this.f4997u[0];
            float f2 = this.f4997u[1];
        }
        C1391a aVar = this.f4986j;
        C1352v vVar = this.f4978b;
        List<C1395c> list = this.f4988l;
        int i = this.f5000x;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            list.get(i2);
            canvas.restoreToCount(canvas.save());
        }
        if (vVar != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i3 = size - 1; i3 >= 0; i3--) {
            C1395c cVar = (C1395c) list.get(i3);
            if (cVar.f5029p && !cVar.f5025l) {
                list.remove(i3);
            } else if (!cVar.f5029p) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, C1349s sVar) {
        float f;
        float f2;
        Canvas canvas2 = canvas;
        this.f4993q = -1;
        if (this.f4978b != null) {
            m4799a(this.f4997u);
            f2 = this.f4997u[0];
            f = this.f4997u[1];
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        C1391a aVar = this.f4986j;
        C1352v vVar = this.f4978b;
        List<C1395c> list = this.f4988l;
        int i = this.f5000x;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            C1395c cVar = (C1395c) list.get(i2);
            if (cVar.f5017d == cVar.f5019f) {
                cVar.f5026m = cVar.f5021h.itemView.getTranslationX();
            } else {
                cVar.f5026m = cVar.f5017d + (cVar.f5030q * (cVar.f5019f - cVar.f5017d));
            }
            if (cVar.f5018e == cVar.f5020g) {
                cVar.f5027n = cVar.f5021h.itemView.getTranslationY();
            } else {
                cVar.f5027n = cVar.f5018e + (cVar.f5030q * (cVar.f5020g - cVar.f5018e));
            }
            int save = canvas.save();
            C1352v vVar2 = cVar.f5021h;
            float f3 = cVar.f5026m;
            float f4 = cVar.f5027n;
            int i3 = save;
            float f5 = f4;
            int i4 = i2;
            int i5 = cVar.f5022i;
            int i6 = size;
            aVar.mo5452a(canvas, recyclerView, vVar2, f3, f5, i5, false);
            canvas2.restoreToCount(i3);
            i2 = i4 + 1;
            size = i6;
        }
        if (vVar != null) {
            int save2 = canvas.save();
            aVar.mo5452a(canvas, recyclerView, vVar, f2, f, i, true);
            canvas2.restoreToCount(save2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5440a(int i, MotionEvent motionEvent, int i2) {
        if (this.f4978b == null && i == 2 && this.f5000x != 2 && this.f4989m.getScrollState() != 1) {
            C1332i layoutManager = this.f4989m.getLayoutManager();
            C1352v vVar = null;
            if (this.f4985i != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f4985i);
                float x = motionEvent.getX(findPointerIndex) - this.f4979c;
                float y = motionEvent.getY(findPointerIndex) - this.f4980d;
                float abs = Math.abs(x);
                float abs2 = Math.abs(y);
                if ((abs >= ((float) this.f5001y) || abs2 >= ((float) this.f5001y)) && ((abs <= abs2 || !layoutManager.mo4742e()) && (abs2 <= abs || !layoutManager.mo4745f()))) {
                    View a = mo5439a(motionEvent);
                    if (a != null) {
                        vVar = this.f4989m.mo4812b(a);
                    }
                }
            }
            if (vVar != null) {
                int b = (this.f4986j.mo5455b(this.f4989m, vVar) & 65280) >> 8;
                if (b != 0) {
                    float x2 = motionEvent.getX(i2);
                    float f = x2 - this.f4979c;
                    float y2 = motionEvent.getY(i2) - this.f4980d;
                    float abs3 = Math.abs(f);
                    float abs4 = Math.abs(y2);
                    if (abs3 >= ((float) this.f5001y) || abs4 >= ((float) this.f5001y)) {
                        if (abs3 > abs4) {
                            if (f < 0.0f && (b & 4) == 0) {
                                return;
                            }
                            if (f > 0.0f && (b & 8) == 0) {
                                return;
                            }
                        } else if (y2 < 0.0f && (b & 1) == 0) {
                            return;
                        } else {
                            if (y2 > 0.0f && (b & 2) == 0) {
                                return;
                            }
                        }
                        this.f4982f = 0.0f;
                        this.f4981e = 0.0f;
                        this.f4985i = motionEvent.getPointerId(0);
                        mo5442a(vVar, 1);
                    }
                }
            }
        }
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        rect.setEmpty();
    }

    /* renamed from: a */
    private static boolean m4800a(View view, float f, float f2, float f3, float f4) {
        if (f < f3 || f > f3 + ((float) view.getWidth()) || f2 < f4 || f2 > f4 + ((float) view.getHeight())) {
            return false;
        }
        return true;
    }
}
