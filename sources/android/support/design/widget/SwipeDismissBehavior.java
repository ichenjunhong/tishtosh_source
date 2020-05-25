package android.support.design.widget;

import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.widget.C1119r;
import android.support.p030v4.widget.C1119r.C1122a;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public class SwipeDismissBehavior<V extends View> extends Behavior<V> {

    /* renamed from: a */
    private boolean f1763a;

    /* renamed from: b */
    C1119r f1764b;

    /* renamed from: c */
    public C0516a f1765c;

    /* renamed from: d */
    public int f1766d = 2;

    /* renamed from: e */
    float f1767e = 0.5f;

    /* renamed from: f */
    float f1768f;

    /* renamed from: g */
    float f1769g = 0.5f;

    /* renamed from: h */
    private float f1770h;

    /* renamed from: i */
    private boolean f1771i;

    /* renamed from: j */
    private final C1122a f1772j = new C1122a() {

        /* renamed from: b */
        private int f1774b;

        /* renamed from: c */
        private int f1775c = -1;

        /* renamed from: b */
        public final int mo1490b(View view) {
            return view.getWidth();
        }

        /* renamed from: a */
        public final void mo1307a(int i) {
            if (SwipeDismissBehavior.this.f1765c != null) {
                SwipeDismissBehavior.this.f1765c.mo1249a(i);
            }
        }

        /* renamed from: a */
        public final boolean mo1310a(View view, int i) {
            if (this.f1775c != -1 || !SwipeDismissBehavior.this.mo1254a(view)) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public final void mo1491b(View view, int i) {
            this.f1775c = i;
            this.f1774b = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        /* renamed from: a */
        public final int mo1306a(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: b */
        public final int mo1311b(View view, int i, int i2) {
            boolean z;
            int i3;
            int i4;
            if (C1056u.m3055f(view) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (SwipeDismissBehavior.this.f1766d == 0) {
                if (z) {
                    i3 = this.f1774b - view.getWidth();
                    i4 = this.f1774b;
                } else {
                    i3 = this.f1774b;
                    i4 = view.getWidth() + this.f1774b;
                }
            } else if (SwipeDismissBehavior.this.f1766d != 1) {
                i3 = this.f1774b - view.getWidth();
                i4 = view.getWidth() + this.f1774b;
            } else if (z) {
                i3 = this.f1774b;
                i4 = view.getWidth() + this.f1774b;
            } else {
                i3 = this.f1774b - view.getWidth();
                i4 = this.f1774b;
            }
            return Math.min(Math.max(i3, i), i4);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
            if (java.lang.Math.abs(r8) >= java.lang.Math.round(((float) r7.getWidth()) * r6.f1773a.f1767e)) goto L_0x005f;
         */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0075  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0085  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0090 A[ADDED_TO_REGION] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo1308a(android.view.View r7, float r8, float r9) {
            /*
                r6 = this;
                r9 = -1
                r6.f1775c = r9
                int r9 = r7.getWidth()
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x0043
                int r3 = android.support.p030v4.view.C1056u.m3055f(r7)
                if (r3 != r2) goto L_0x0016
                r3 = 1
                goto L_0x0017
            L_0x0016:
                r3 = 0
            L_0x0017:
                android.support.design.widget.SwipeDismissBehavior r4 = android.support.design.widget.SwipeDismissBehavior.this
                int r4 = r4.f1766d
                r5 = 2
                if (r4 != r5) goto L_0x001f
                goto L_0x005f
            L_0x001f:
                android.support.design.widget.SwipeDismissBehavior r4 = android.support.design.widget.SwipeDismissBehavior.this
                int r4 = r4.f1766d
                if (r4 != 0) goto L_0x0031
                if (r3 == 0) goto L_0x002c
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 >= 0) goto L_0x0061
                goto L_0x005f
            L_0x002c:
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 <= 0) goto L_0x0061
                goto L_0x005f
            L_0x0031:
                android.support.design.widget.SwipeDismissBehavior r4 = android.support.design.widget.SwipeDismissBehavior.this
                int r4 = r4.f1766d
                if (r4 != r2) goto L_0x0061
                if (r3 == 0) goto L_0x003e
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 <= 0) goto L_0x0061
                goto L_0x005f
            L_0x003e:
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 >= 0) goto L_0x0061
                goto L_0x005f
            L_0x0043:
                int r8 = r7.getLeft()
                int r0 = r6.f1774b
                int r8 = r8 - r0
                int r0 = r7.getWidth()
                float r0 = (float) r0
                android.support.design.widget.SwipeDismissBehavior r3 = android.support.design.widget.SwipeDismissBehavior.this
                float r3 = r3.f1767e
                float r0 = r0 * r3
                int r0 = java.lang.Math.round(r0)
                int r8 = java.lang.Math.abs(r8)
                if (r8 < r0) goto L_0x0061
            L_0x005f:
                r8 = 1
                goto L_0x0062
            L_0x0061:
                r8 = 0
            L_0x0062:
                if (r8 == 0) goto L_0x0075
                int r8 = r7.getLeft()
                int r0 = r6.f1774b
                if (r8 >= r0) goto L_0x0070
                int r8 = r6.f1774b
                int r8 = r8 - r9
                goto L_0x0073
            L_0x0070:
                int r8 = r6.f1774b
                int r8 = r8 + r9
            L_0x0073:
                r1 = 1
                goto L_0x0077
            L_0x0075:
                int r8 = r6.f1774b
            L_0x0077:
                android.support.design.widget.SwipeDismissBehavior r9 = android.support.design.widget.SwipeDismissBehavior.this
                android.support.v4.widget.r r9 = r9.f1764b
                int r0 = r7.getTop()
                boolean r8 = r9.mo3573a(r8, r0)
                if (r8 == 0) goto L_0x0090
                android.support.design.widget.SwipeDismissBehavior$b r8 = new android.support.design.widget.SwipeDismissBehavior$b
                android.support.design.widget.SwipeDismissBehavior r9 = android.support.design.widget.SwipeDismissBehavior.this
                r8.<init>(r7, r1)
                android.support.p030v4.view.C1056u.m3034a(r7, r8)
                return
            L_0x0090:
                if (r1 == 0) goto L_0x009f
                android.support.design.widget.SwipeDismissBehavior r8 = android.support.design.widget.SwipeDismissBehavior.this
                android.support.design.widget.SwipeDismissBehavior$a r8 = r8.f1765c
                if (r8 == 0) goto L_0x009f
                android.support.design.widget.SwipeDismissBehavior r8 = android.support.design.widget.SwipeDismissBehavior.this
                android.support.design.widget.SwipeDismissBehavior$a r8 = r8.f1765c
                r8.mo1250a(r7)
            L_0x009f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.SwipeDismissBehavior.C05151.mo1308a(android.view.View, float, float):void");
        }

        /* renamed from: a */
        public final void mo1309a(View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.f1774b) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f1768f);
            float width2 = ((float) this.f1774b) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f1769g);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m1381a(0.0f, 1.0f - ((f - width) / (width2 - width)), 1.0f));
            }
        }
    };

    /* renamed from: android.support.design.widget.SwipeDismissBehavior$a */
    public interface C0516a {
        /* renamed from: a */
        void mo1249a(int i);

        /* renamed from: a */
        void mo1250a(View view);
    }

    /* renamed from: android.support.design.widget.SwipeDismissBehavior$b */
    class C0517b implements Runnable {

        /* renamed from: b */
        private final View f1777b;

        /* renamed from: c */
        private final boolean f1778c;

        public final void run() {
            if (SwipeDismissBehavior.this.f1764b == null || !SwipeDismissBehavior.this.f1764b.mo3576a(true)) {
                if (this.f1778c && SwipeDismissBehavior.this.f1765c != null) {
                    SwipeDismissBehavior.this.f1765c.mo1250a(this.f1777b);
                }
                return;
            }
            C1056u.m3034a(this.f1777b, (Runnable) this);
        }

        C0517b(View view, boolean z) {
            this.f1777b = view;
            this.f1778c = z;
        }
    }

    /* renamed from: a */
    public boolean mo1254a(View view) {
        return true;
    }

    /* renamed from: a */
    static float m1381a(float f, float f2, float f3) {
        return Math.min(Math.max(0.0f, f2), 1.0f);
    }

    /* renamed from: a */
    public final boolean mo1171a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f1764b == null) {
            return false;
        }
        this.f1764b.mo3580b(motionEvent);
        return true;
    }

    /* renamed from: b */
    public boolean mo1255b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C1119r rVar;
        boolean z = this.f1763a;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 3) {
            switch (actionMasked) {
                case 0:
                    this.f1763a = coordinatorLayout.mo1329a((View) v, (int) motionEvent.getX(), (int) motionEvent.getY());
                    z = this.f1763a;
                    break;
                case 1:
                    break;
            }
        }
        this.f1763a = false;
        if (!z) {
            return false;
        }
        if (this.f1764b == null) {
            if (this.f1771i) {
                rVar = C1119r.m3271a((ViewGroup) coordinatorLayout, this.f1770h, this.f1772j);
            } else {
                rVar = C1119r.m3272a((ViewGroup) coordinatorLayout, this.f1772j);
            }
            this.f1764b = rVar;
        }
        return this.f1764b.mo3574a(motionEvent);
    }
}
