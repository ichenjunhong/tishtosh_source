package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.design.widget.CoordinatorLayout.C0505d;
import android.support.p030v4.p033b.C0703a;
import android.support.p030v4.view.AbsSavedState;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.widget.C1119r;
import android.support.p030v4.widget.C1119r.C1122a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior<V extends View> extends Behavior<V> {

    /* renamed from: a */
    public boolean f1630a = true;

    /* renamed from: b */
    float f1631b;

    /* renamed from: c */
    public int f1632c;

    /* renamed from: d */
    public boolean f1633d;

    /* renamed from: e */
    public int f1634e;

    /* renamed from: f */
    int f1635f;

    /* renamed from: g */
    int f1636g;

    /* renamed from: h */
    int f1637h;

    /* renamed from: i */
    public boolean f1638i;

    /* renamed from: j */
    public boolean f1639j;

    /* renamed from: k */
    public int f1640k = 4;

    /* renamed from: l */
    C1119r f1641l;

    /* renamed from: m */
    boolean f1642m;

    /* renamed from: n */
    int f1643n;

    /* renamed from: o */
    WeakReference<V> f1644o;

    /* renamed from: p */
    WeakReference<View> f1645p;

    /* renamed from: q */
    public C0497a f1646q;

    /* renamed from: r */
    VelocityTracker f1647r;

    /* renamed from: s */
    int f1648s;

    /* renamed from: t */
    int f1649t;

    /* renamed from: u */
    boolean f1650u;

    /* renamed from: v */
    private int f1651v;

    /* renamed from: w */
    private int f1652w;

    /* renamed from: x */
    private boolean f1653x;

    /* renamed from: y */
    private Map<View, Integer> f1654y;

    /* renamed from: z */
    private final C1122a f1655z = new C1122a() {
        /* renamed from: a */
        public final int mo1305a(View view) {
            if (BottomSheetBehavior.this.f1638i) {
                return BottomSheetBehavior.this.f1643n;
            }
            return BottomSheetBehavior.this.f1637h;
        }

        /* renamed from: a */
        public final void mo1307a(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.mo1302c(1);
            }
        }

        /* renamed from: a */
        public final boolean mo1310a(View view, int i) {
            if (BottomSheetBehavior.this.f1640k == 1 || BottomSheetBehavior.this.f1650u) {
                return false;
            }
            if (BottomSheetBehavior.this.f1640k == 3 && BottomSheetBehavior.this.f1648s == i) {
                View view2 = (View) BottomSheetBehavior.this.f1645p.get();
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            if (BottomSheetBehavior.this.f1644o == null || BottomSheetBehavior.this.f1644o.get() != view) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public final int mo1311b(View view, int i, int i2) {
            return view.getLeft();
        }

        /* renamed from: a */
        public final int mo1306a(View view, int i, int i2) {
            int i3;
            int b = BottomSheetBehavior.this.mo1300b();
            if (BottomSheetBehavior.this.f1638i) {
                i3 = BottomSheetBehavior.this.f1643n;
            } else {
                i3 = BottomSheetBehavior.this.f1637h;
            }
            return C0703a.m2034a(i, b, i3);
        }

        /* JADX WARNING: Removed duplicated region for block: B:41:0x00d8  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00e9  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo1308a(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r0 = 0
                r1 = 0
                r2 = 4
                r3 = 6
                r4 = 3
                int r5 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r5 >= 0) goto L_0x0027
                android.support.design.widget.BottomSheetBehavior r9 = android.support.design.widget.BottomSheetBehavior.this
                boolean r9 = r9.f1630a
                if (r9 == 0) goto L_0x0016
                android.support.design.widget.BottomSheetBehavior r9 = android.support.design.widget.BottomSheetBehavior.this
                int r0 = r9.f1635f
            L_0x0013:
                r2 = 3
                goto L_0x00ca
            L_0x0016:
                int r9 = r8.getTop()
                android.support.design.widget.BottomSheetBehavior r10 = android.support.design.widget.BottomSheetBehavior.this
                int r10 = r10.f1636g
                if (r9 <= r10) goto L_0x0013
                android.support.design.widget.BottomSheetBehavior r9 = android.support.design.widget.BottomSheetBehavior.this
                int r0 = r9.f1636g
            L_0x0024:
                r2 = 6
                goto L_0x00ca
            L_0x0027:
                android.support.design.widget.BottomSheetBehavior r5 = android.support.design.widget.BottomSheetBehavior.this
                boolean r5 = r5.f1638i
                if (r5 == 0) goto L_0x0052
                android.support.design.widget.BottomSheetBehavior r5 = android.support.design.widget.BottomSheetBehavior.this
                boolean r5 = r5.mo1299a(r8, r10)
                if (r5 == 0) goto L_0x0052
                int r5 = r8.getTop()
                android.support.design.widget.BottomSheetBehavior r6 = android.support.design.widget.BottomSheetBehavior.this
                int r6 = r6.f1637h
                if (r5 > r6) goto L_0x004b
                float r5 = java.lang.Math.abs(r9)
                float r6 = java.lang.Math.abs(r10)
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 >= 0) goto L_0x0052
            L_0x004b:
                android.support.design.widget.BottomSheetBehavior r9 = android.support.design.widget.BottomSheetBehavior.this
                int r0 = r9.f1643n
                r2 = 5
                goto L_0x00ca
            L_0x0052:
                int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r1 == 0) goto L_0x0068
                float r9 = java.lang.Math.abs(r9)
                float r10 = java.lang.Math.abs(r10)
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 <= 0) goto L_0x0063
                goto L_0x0068
            L_0x0063:
                android.support.design.widget.BottomSheetBehavior r9 = android.support.design.widget.BottomSheetBehavior.this
                int r0 = r9.f1637h
                goto L_0x00ca
            L_0x0068:
                int r9 = r8.getTop()
                android.support.design.widget.BottomSheetBehavior r10 = android.support.design.widget.BottomSheetBehavior.this
                boolean r10 = r10.f1630a
                if (r10 == 0) goto L_0x0091
                android.support.design.widget.BottomSheetBehavior r10 = android.support.design.widget.BottomSheetBehavior.this
                int r10 = r10.f1635f
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                android.support.design.widget.BottomSheetBehavior r0 = android.support.design.widget.BottomSheetBehavior.this
                int r0 = r0.f1637h
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x008c
                android.support.design.widget.BottomSheetBehavior r9 = android.support.design.widget.BottomSheetBehavior.this
                int r0 = r9.f1635f
                goto L_0x0013
            L_0x008c:
                android.support.design.widget.BottomSheetBehavior r9 = android.support.design.widget.BottomSheetBehavior.this
                int r0 = r9.f1637h
                goto L_0x00ca
            L_0x0091:
                android.support.design.widget.BottomSheetBehavior r10 = android.support.design.widget.BottomSheetBehavior.this
                int r10 = r10.f1636g
                if (r9 >= r10) goto L_0x00ab
                android.support.design.widget.BottomSheetBehavior r10 = android.support.design.widget.BottomSheetBehavior.this
                int r10 = r10.f1637h
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                if (r9 >= r10) goto L_0x00a5
                goto L_0x0013
            L_0x00a5:
                android.support.design.widget.BottomSheetBehavior r9 = android.support.design.widget.BottomSheetBehavior.this
                int r0 = r9.f1636g
                goto L_0x0024
            L_0x00ab:
                android.support.design.widget.BottomSheetBehavior r10 = android.support.design.widget.BottomSheetBehavior.this
                int r10 = r10.f1636g
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                android.support.design.widget.BottomSheetBehavior r0 = android.support.design.widget.BottomSheetBehavior.this
                int r0 = r0.f1637h
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x00c6
                android.support.design.widget.BottomSheetBehavior r9 = android.support.design.widget.BottomSheetBehavior.this
                int r0 = r9.f1636g
                goto L_0x0024
            L_0x00c6:
                android.support.design.widget.BottomSheetBehavior r9 = android.support.design.widget.BottomSheetBehavior.this
                int r0 = r9.f1637h
            L_0x00ca:
                android.support.design.widget.BottomSheetBehavior r9 = android.support.design.widget.BottomSheetBehavior.this
                android.support.v4.widget.r r9 = r9.f1641l
                int r10 = r8.getLeft()
                boolean r9 = r9.mo3573a(r10, r0)
                if (r9 == 0) goto L_0x00e9
                android.support.design.widget.BottomSheetBehavior r9 = android.support.design.widget.BottomSheetBehavior.this
                r10 = 2
                r9.mo1302c(r10)
                android.support.design.widget.BottomSheetBehavior$b r9 = new android.support.design.widget.BottomSheetBehavior$b
                android.support.design.widget.BottomSheetBehavior r10 = android.support.design.widget.BottomSheetBehavior.this
                r9.<init>(r8, r2)
                android.support.p030v4.view.C1056u.m3034a(r8, r9)
                return
            L_0x00e9:
                android.support.design.widget.BottomSheetBehavior r8 = android.support.design.widget.BottomSheetBehavior.this
                r8.mo1302c(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.BottomSheetBehavior.C04952.mo1308a(android.view.View, float, float):void");
        }

        /* renamed from: a */
        public final void mo1309a(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.mo1303d(i2);
        }
    };

    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: a */
        final int f1660a;

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f1660a = i;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1660a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1660a);
        }
    }

    /* renamed from: android.support.design.widget.BottomSheetBehavior$a */
    public static abstract class C0497a {
        /* renamed from: a */
        public abstract void mo1315a(View view, float f);

        /* renamed from: a */
        public abstract void mo1316a(View view, int i);
    }

    /* renamed from: android.support.design.widget.BottomSheetBehavior$b */
    class C0498b implements Runnable {

        /* renamed from: b */
        private final View f1662b;

        /* renamed from: c */
        private final int f1663c;

        public final void run() {
            if (BottomSheetBehavior.this.f1641l == null || !BottomSheetBehavior.this.f1641l.mo3576a(true)) {
                BottomSheetBehavior.this.mo1302c(this.f1663c);
            } else {
                C1056u.m3034a(this.f1662b, (Runnable) this);
            }
        }

        C0498b(View view, int i) {
            this.f1662b = view;
            this.f1663c = i;
        }
    }

    /* renamed from: a */
    public boolean mo1171a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return C0534a.m1449a(this, coordinatorLayout, view, motionEvent);
    }

    /* renamed from: a */
    public final boolean mo934a(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (C1056u.m3073s(coordinatorLayout) && !C1056u.m3073s(v)) {
            v.setFitsSystemWindows(true);
        }
        int top = v.getTop();
        coordinatorLayout.mo1325a((View) v, i);
        this.f1643n = coordinatorLayout.getHeight();
        if (this.f1633d) {
            if (this.f1634e == 0) {
                this.f1634e = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.fz);
            }
            this.f1651v = Math.max(this.f1634e, this.f1643n - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            this.f1651v = this.f1632c;
        }
        this.f1635f = Math.max(0, this.f1643n - v.getHeight());
        this.f1636g = this.f1643n / 2;
        m1230c();
        if (this.f1640k == 3) {
            C1056u.m3058g(v, mo1300b());
        } else if (this.f1640k == 6) {
            C1056u.m3058g(v, this.f1636g);
        } else if (this.f1638i && this.f1640k == 5) {
            C1056u.m3058g(v, this.f1643n);
        } else if (this.f1640k == 4) {
            C1056u.m3058g(v, this.f1637h);
        } else if (this.f1640k == 1 || this.f1640k == 2) {
            C1056u.m3058g(v, top - v.getTop());
        }
        if (this.f1641l == null) {
            this.f1641l = C1119r.m3272a((ViewGroup) coordinatorLayout, this.f1655z);
        }
        this.f1644o = new WeakReference<>(v);
        this.f1645p = new WeakReference<>(m1229b((View) v));
        return true;
    }

    /* renamed from: a */
    public final boolean mo967a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f1652w = 0;
        this.f1653x = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo1298a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return view == this.f1645p.get() && (this.f1640k != 3 || super.mo1298a(coordinatorLayout, v, view, f, f2));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo1299a(View view, float f) {
        if (this.f1639j) {
            return true;
        }
        if (view.getTop() >= this.f1637h && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f1637h)) / ((float) this.f1632c) > 0.5f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1295a() {
        this.f1648s = -1;
        if (this.f1647r != null) {
            this.f1647r.recycle();
            this.f1647r = null;
        }
    }

    /* renamed from: b */
    public final int mo1300b() {
        if (this.f1630a) {
            return this.f1635f;
        }
        return 0;
    }

    public BottomSheetBehavior() {
    }

    /* renamed from: c */
    private void m1230c() {
        if (this.f1630a) {
            this.f1637h = Math.max(this.f1643n - this.f1651v, this.f1635f);
        } else {
            this.f1637h = this.f1643n - this.f1651v;
        }
    }

    /* renamed from: a */
    public static <V extends View> BottomSheetBehavior<V> m1227a(V v) {
        LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof C0505d) {
            Behavior behavior = ((C0505d) layoutParams).f1693a;
            if (behavior instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* renamed from: b */
    private View m1229b(View view) {
        if (C1056u.m3078x(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View b = m1229b(viewGroup.getChildAt(i));
                if (b != null) {
                    return b;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo1302c(int i) {
        if (this.f1640k != i) {
            this.f1640k = i;
            if (i == 6 || i == 3) {
                m1228a(true);
            } else if (i == 5 || i == 4) {
                m1228a(false);
            }
            View view = (View) this.f1644o.get();
            if (!(view == null || this.f1646q == null)) {
                this.f1646q.mo1316a(view, i);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo1303d(int i) {
        View view = (View) this.f1644o.get();
        if (!(view == null || this.f1646q == null)) {
            if (i > this.f1637h) {
                this.f1646q.mo1315a(view, ((float) (this.f1637h - i)) / ((float) (this.f1643n - this.f1637h)));
                return;
            }
            this.f1646q.mo1315a(view, ((float) (this.f1637h - i)) / ((float) (this.f1637h - mo1300b())));
        }
    }

    /* renamed from: a */
    private void m1228a(boolean z) {
        if (this.f1644o != null) {
            ViewParent parent = ((View) this.f1644o.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (VERSION.SDK_INT >= 16 && z) {
                    if (this.f1654y == null) {
                        this.f1654y = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.f1644o.get()) {
                        if (z) {
                            if (VERSION.SDK_INT >= 16) {
                                this.f1654y.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            C1056u.m3043b(childAt, 4);
                        } else if (this.f1654y != null && this.f1654y.containsKey(childAt)) {
                            C1056u.m3043b(childAt, ((Integer) this.f1654y.get(childAt)).intValue());
                        }
                    }
                }
                if (!z) {
                    this.f1654y = null;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo1301b(final int i) {
        if (i != this.f1640k) {
            if (this.f1644o == null) {
                if (i == 4 || i == 3 || i == 6 || (this.f1638i && i == 5)) {
                    this.f1640k = i;
                }
                return;
            }
            final View view = (View) this.f1644o.get();
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent == null || !parent.isLayoutRequested() || !C1056u.m3018B(view)) {
                    mo1297a(view, i);
                } else {
                    view.post(new Runnable() {
                        public final void run() {
                            BottomSheetBehavior.this.mo1297a(view, i);
                        }
                    });
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1296a(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f1633d
            if (r4 != 0) goto L_0x0015
            r3.f1633d = r0
            goto L_0x0024
        L_0x000c:
            boolean r2 = r3.f1633d
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f1632c
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0024
        L_0x0017:
            r3.f1633d = r1
            int r1 = java.lang.Math.max(r1, r4)
            r3.f1632c = r1
            int r1 = r3.f1643n
            int r1 = r1 - r4
            r3.f1637h = r1
        L_0x0024:
            if (r0 == 0) goto L_0x003c
            int r4 = r3.f1640k
            r0 = 4
            if (r4 != r0) goto L_0x003c
            java.lang.ref.WeakReference<V> r4 = r3.f1644o
            if (r4 == 0) goto L_0x003c
            java.lang.ref.WeakReference<V> r4 = r3.f1644o
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x003c
            r4.requestLayout()
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.BottomSheetBehavior.mo1296a(int):void");
    }

    /* renamed from: b */
    public final Parcelable mo1215b(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo1215b(coordinatorLayout, v), this.f1640k);
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.c7, R.attr.c8, R.attr.c_, R.attr.ca});
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || peekValue.data != -1) {
            mo1296a(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            mo1296a(peekValue.data);
        }
        this.f1638i = obtainStyledAttributes.getBoolean(1, false);
        boolean z = obtainStyledAttributes.getBoolean(0, true);
        if (this.f1630a != z) {
            this.f1630a = z;
            if (this.f1644o != null) {
                m1230c();
            }
            if (!this.f1630a || this.f1640k != 6) {
                i = this.f1640k;
            } else {
                i = 3;
            }
            mo1302c(i);
        }
        this.f1639j = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        this.f1631b = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1297a(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.f1637h;
        } else if (i == 6) {
            int i3 = this.f1636g;
            if (!this.f1630a || i3 > this.f1635f) {
                i2 = i3;
            } else {
                i2 = this.f1635f;
                i = 3;
            }
        } else if (i == 3) {
            i2 = mo1300b();
        } else if (!this.f1638i || i != 5) {
            StringBuilder sb = new StringBuilder("Illegal state argument: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else {
            i2 = this.f1643n;
        }
        if (this.f1641l.mo3575a(view, view.getLeft(), i2)) {
            mo1302c(2);
            C1056u.m3034a(view, (Runnable) new C0498b(view, i));
            return;
        }
        mo1302c(i);
    }

    /* renamed from: a */
    public final void mo1206a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo1206a(coordinatorLayout, v, savedState.f3119e);
        if (savedState.f1660a == 1 || savedState.f1660a == 2) {
            this.f1640k = 4;
        } else {
            this.f1640k = savedState.f1660a;
        }
    }

    /* renamed from: b */
    public final boolean mo1255b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        View view;
        boolean z;
        if (!v.isShown()) {
            this.f1642m = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            mo1295a();
        }
        if (this.f1647r == null) {
            this.f1647r = VelocityTracker.obtain();
        }
        this.f1647r.addMovement(motionEvent);
        View view2 = null;
        if (actionMasked != 3) {
            switch (actionMasked) {
                case 0:
                    int x = (int) motionEvent.getX();
                    this.f1649t = (int) motionEvent.getY();
                    if (this.f1645p != null) {
                        view = (View) this.f1645p.get();
                    } else {
                        view = null;
                    }
                    if (view != null && coordinatorLayout.mo1329a(view, x, this.f1649t)) {
                        this.f1648s = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f1650u = true;
                    }
                    if (this.f1648s != -1 || coordinatorLayout.mo1329a((View) v, x, this.f1649t)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    this.f1642m = z;
                    break;
                case 1:
                    break;
            }
        }
        this.f1650u = false;
        this.f1648s = -1;
        if (this.f1642m) {
            this.f1642m = false;
            return false;
        }
        if (!this.f1642m && this.f1641l != null && this.f1641l.mo3574a(motionEvent)) {
            return true;
        }
        if (this.f1645p != null) {
            view2 = (View) this.f1645p.get();
        }
        if (actionMasked != 2 || view2 == null || this.f1642m || this.f1640k == 1 || coordinatorLayout.mo1329a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f1641l == null || Math.abs(((float) this.f1649t) - motionEvent.getY()) <= ((float) this.f1641l.f3563b)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo1207a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int i2;
        int i3;
        int i4 = 3;
        if (v.getTop() == mo1300b()) {
            mo1302c(3);
        } else if (view == this.f1645p.get() && this.f1653x) {
            if (this.f1652w > 0) {
                i2 = mo1300b();
            } else if (!this.f1638i || !mo1299a((View) v, C0534a.m1448a(this))) {
                if (this.f1652w == 0) {
                    int top = v.getTop();
                    if (!this.f1630a) {
                        if (top < this.f1636g) {
                            if (top < Math.abs(top - this.f1637h)) {
                                i2 = 0;
                            } else {
                                i2 = this.f1636g;
                            }
                        } else if (Math.abs(top - this.f1636g) < Math.abs(top - this.f1637h)) {
                            i2 = this.f1636g;
                        } else {
                            i3 = this.f1637h;
                        }
                        i4 = 6;
                    } else if (Math.abs(top - this.f1635f) < Math.abs(top - this.f1637h)) {
                        i2 = this.f1635f;
                    } else {
                        i3 = this.f1637h;
                    }
                } else {
                    i3 = this.f1637h;
                }
                i4 = 4;
            } else {
                i2 = this.f1643n;
                i4 = 5;
            }
            if (this.f1641l.mo3575a((View) v, v.getLeft(), i2)) {
                mo1302c(2);
                C1056u.m3034a((View) v, (Runnable) new C0498b(v, i4));
            } else {
                mo1302c(i4);
            }
            this.f1653x = false;
        }
    }

    /* renamed from: a */
    public final void mo1209a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 != 1 && view == ((View) this.f1645p.get())) {
            int top = v.getTop();
            int i4 = top - i2;
            if (i2 > 0) {
                if (i4 < mo1300b()) {
                    iArr[1] = top - mo1300b();
                    C1056u.m3058g(v, -iArr[1]);
                    mo1302c(3);
                } else {
                    iArr[1] = i2;
                    C1056u.m3058g(v, -i2);
                    mo1302c(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                if (i4 <= this.f1637h || this.f1638i) {
                    iArr[1] = i2;
                    C1056u.m3058g(v, -i2);
                    mo1302c(1);
                } else {
                    iArr[1] = top - this.f1637h;
                    C1056u.m3058g(v, -iArr[1]);
                    mo1302c(4);
                }
            }
            mo1303d(v.getTop());
            this.f1652w = i2;
            this.f1653x = true;
        }
    }
}
