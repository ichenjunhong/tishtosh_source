package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.p030v4.content.C0726c;
import android.support.p030v4.graphics.drawable.C0809a;
import android.support.p030v4.p038f.C0793j;
import android.support.p030v4.p038f.C0795l.C0796a;
import android.support.p030v4.p038f.C0795l.C0798c;
import android.support.p030v4.view.AbsSavedState;
import android.support.p030v4.view.C1018ac;
import android.support.p030v4.view.C1039e;
import android.support.p030v4.view.C1049n;
import android.support.p030v4.view.C1050o;
import android.support.p030v4.view.C1051p;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.widget.C1108h;
import android.support.p030v4.widget.C1123s;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.ss.android.ugc.trill.R;
import com.taobao.android.dexposed.ClassUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements C1049n {

    /* renamed from: a */
    static final String f1667a;

    /* renamed from: b */
    static final Class<?>[] f1668b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    static final ThreadLocal<Map<String, Constructor<Behavior>>> f1669c = new ThreadLocal<>();

    /* renamed from: d */
    static final Comparator<View> f1670d;

    /* renamed from: h */
    private static final C0796a<Rect> f1671h = new C0798c(12);

    /* renamed from: e */
    C1018ac f1672e;

    /* renamed from: f */
    boolean f1673f;

    /* renamed from: g */
    OnHierarchyChangeListener f1674g;

    /* renamed from: i */
    private final List<View> f1675i;

    /* renamed from: j */
    private final C1108h<View> f1676j;

    /* renamed from: k */
    private final List<View> f1677k;

    /* renamed from: l */
    private final List<View> f1678l;

    /* renamed from: m */
    private final int[] f1679m;

    /* renamed from: n */
    private boolean f1680n;

    /* renamed from: o */
    private boolean f1681o;

    /* renamed from: p */
    private int[] f1682p;

    /* renamed from: q */
    private View f1683q;

    /* renamed from: r */
    private View f1684r;

    /* renamed from: s */
    private C0506e f1685s;

    /* renamed from: t */
    private boolean f1686t;

    /* renamed from: u */
    private Drawable f1687u;

    /* renamed from: v */
    private C1051p f1688v;

    /* renamed from: w */
    private final C1050o f1689w;

    public static abstract class Behavior<V extends View> {
        public Behavior() {
        }

        /* renamed from: a */
        public void mo1164a(C0505d dVar) {
        }

        /* renamed from: a */
        public void mo1206a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* renamed from: a */
        public void mo932a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        /* renamed from: a */
        public void mo1372a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        /* renamed from: a */
        public boolean mo934a(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1213a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1373a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1226a(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1171a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1157a(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1298a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        /* renamed from: a */
        public boolean mo935a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        /* renamed from: b */
        public boolean mo1255b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: b */
        public boolean mo1159b(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: c */
        public void mo1374c(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: a */
        public boolean mo967a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return mo935a(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        /* renamed from: b */
        public Parcelable mo1215b(CoordinatorLayout coordinatorLayout, V v) {
            return BaseSavedState.EMPTY_STATE;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: a */
        public void mo1207a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                mo1374c(coordinatorLayout, v, view);
            }
        }

        /* renamed from: a */
        public void mo1209a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                mo1372a(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        /* renamed from: a */
        public void mo1208a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                mo932a(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: a */
        SparseArray<Parcelable> f1691a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f1691a = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f1691a.append(iArr[i], readParcelableArray[i]);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            int i2;
            super.writeToParcel(parcel, i);
            if (this.f1691a != null) {
                i2 = this.f1691a.size();
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
            int[] iArr = new int[i2];
            Parcelable[] parcelableArr = new Parcelable[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = this.f1691a.keyAt(i3);
                parcelableArr[i3] = (Parcelable) this.f1691a.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$a */
    public interface C0502a {
        Behavior getBehavior();
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: android.support.design.widget.CoordinatorLayout$b */
    public @interface C0503b {
        /* renamed from: a */
        Class<? extends Behavior> mo1378a();
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$c */
    class C0504c implements OnHierarchyChangeListener {
        C0504c() {
        }

        public final void onChildViewAdded(View view, View view2) {
            if (CoordinatorLayout.this.f1674g != null) {
                CoordinatorLayout.this.f1674g.onChildViewAdded(view, view2);
            }
        }

        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.mo1323a(2);
            if (CoordinatorLayout.this.f1674g != null) {
                CoordinatorLayout.this.f1674g.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$d */
    public static class C0505d extends MarginLayoutParams {

        /* renamed from: a */
        public Behavior f1693a;

        /* renamed from: b */
        boolean f1694b;

        /* renamed from: c */
        public int f1695c;

        /* renamed from: d */
        public int f1696d;

        /* renamed from: e */
        public int f1697e = -1;

        /* renamed from: f */
        public int f1698f = -1;

        /* renamed from: g */
        public int f1699g;

        /* renamed from: h */
        public int f1700h;

        /* renamed from: i */
        int f1701i;

        /* renamed from: j */
        int f1702j;

        /* renamed from: k */
        View f1703k;

        /* renamed from: l */
        View f1704l;

        /* renamed from: m */
        boolean f1705m;

        /* renamed from: n */
        public boolean f1706n;

        /* renamed from: o */
        public final Rect f1707o = new Rect();

        /* renamed from: p */
        Object f1708p;

        /* renamed from: q */
        private boolean f1709q;

        /* renamed from: r */
        private boolean f1710r;

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo1385b() {
            this.f1705m = false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo1387c() {
            this.f1706n = false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo1384a() {
            if (this.f1703k != null || this.f1698f == -1) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo1381a(int i) {
            mo1382a(i, false);
        }

        public C0505d(C0505d dVar) {
            super(dVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo1386b(int i) {
            switch (i) {
                case 0:
                    return this.f1709q;
                case 1:
                    return this.f1710r;
                default:
                    return false;
            }
        }

        public C0505d(LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public final void mo1383a(Behavior behavior) {
            if (this.f1693a != behavior) {
                this.f1693a = behavior;
                this.f1708p = null;
                this.f1694b = true;
                if (behavior != null) {
                    behavior.mo1164a(this);
                }
            }
        }

        public C0505d(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0505d(int i, int i2) {
            super(-2, -2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo1382a(int i, boolean z) {
            switch (i) {
                case 0:
                    this.f1709q = z;
                    return;
                case 1:
                    this.f1710r = z;
                    break;
            }
        }

        C0505d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842931, R.attr.qa, R.attr.qb, R.attr.qc, R.attr.rm, R.attr.rw, R.attr.rx});
            this.f1695c = obtainStyledAttributes.getInteger(0, 0);
            this.f1698f = obtainStyledAttributes.getResourceId(1, -1);
            this.f1696d = obtainStyledAttributes.getInteger(2, 0);
            this.f1697e = obtainStyledAttributes.getInteger(6, -1);
            this.f1699g = obtainStyledAttributes.getInt(5, 0);
            this.f1700h = obtainStyledAttributes.getInt(4, 0);
            this.f1694b = obtainStyledAttributes.hasValue(3);
            if (this.f1694b) {
                this.f1693a = CoordinatorLayout.m1260a(context, attributeSet, obtainStyledAttributes.getString(3));
            }
            obtainStyledAttributes.recycle();
            if (this.f1693a != null) {
                this.f1693a.mo1164a(this);
            }
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$e */
    class C0506e implements OnPreDrawListener {
        public final boolean onPreDraw() {
            CoordinatorLayout.this.mo1323a(0);
            return true;
        }

        C0506e() {
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$f */
    static class C0507f implements Comparator<View> {
        C0507f() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            View view = (View) obj2;
            float z = C1056u.m3080z((View) obj);
            float z2 = C1056u.m3080z(view);
            if (z > z2) {
                return -1;
            }
            if (z < z2) {
                return 1;
            }
            return 0;
        }
    }

    /* renamed from: c */
    private static int m1273c(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: d */
    private static int m1276d(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    public final C1018ac getLastWindowInsets() {
        return this.f1672e;
    }

    public Drawable getStatusBarBackground() {
        return this.f1687u;
    }

    /* renamed from: a */
    private void m1268a(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Behavior behavior = ((C0505d) childAt.getLayoutParams()).f1693a;
            if (behavior != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    behavior.mo1255b(this, childAt, obtain);
                } else {
                    behavior.mo1171a(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0505d) getChildAt(i2).getLayoutParams()).mo1385b();
        }
        this.f1683q = null;
        this.f1680n = false;
    }

    /* renamed from: a */
    private boolean m1269a(MotionEvent motionEvent, int i) {
        boolean z;
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f1677k;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        int i2 = childCount - 1;
        while (i2 >= 0) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
            i2--;
        }
        if (f1670d != null) {
            Collections.sort(list, f1670d);
        }
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) list.get(i3);
            C0505d dVar = (C0505d) view.getLayoutParams();
            Behavior behavior = dVar.f1693a;
            if ((z2 || z3) && actionMasked != 0) {
                if (behavior != null) {
                    if (motionEvent3 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    switch (i) {
                        case 0:
                            behavior.mo1255b(this, view, motionEvent3);
                            break;
                        case 1:
                            behavior.mo1171a(this, view, motionEvent3);
                            break;
                    }
                }
            } else {
                if (!z2 && behavior != null) {
                    switch (i) {
                        case 0:
                            z2 = behavior.mo1255b(this, view, motionEvent2);
                            break;
                        case 1:
                            z2 = behavior.mo1171a(this, view, motionEvent2);
                            break;
                    }
                    if (z2) {
                        this.f1683q = view;
                    }
                }
                if (dVar.f1693a == null) {
                    dVar.f1705m = false;
                }
                boolean z4 = dVar.f1705m;
                boolean z5 = true;
                if (dVar.f1705m) {
                    z = true;
                } else {
                    boolean z6 = dVar.f1705m;
                    if (dVar.f1693a != null) {
                        Behavior behavior2 = dVar.f1693a;
                    }
                    z = z6 | false;
                    dVar.f1705m = z;
                }
                if (!z || z4) {
                    z5 = false;
                }
                if (!z || z5) {
                    z3 = z5;
                } else {
                    list.clear();
                    return z2;
                }
            }
        }
        list.clear();
        return z2;
    }

    /* renamed from: a */
    public final void mo1325a(View view, int i) {
        C0505d dVar = (C0505d) view.getLayoutParams();
        if (dVar.mo1384a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (dVar.f1703k != null) {
            m1266a(view, dVar.f1703k, i);
        } else if (dVar.f1697e >= 0) {
            m1272b(view, dVar.f1697e, i);
        } else {
            m1275c(view, i);
        }
    }

    /* renamed from: a */
    private void m1267a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m1265a(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0255  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1323a(int r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            int r9 = android.support.p030v4.view.C1056u.m3055f(r25)
            java.util.List<android.view.View> r2 = r0.f1675i
            int r10 = r2.size()
            android.graphics.Rect r11 = mo54229a()
            android.graphics.Rect r12 = mo54229a()
            android.graphics.Rect r13 = mo54229a()
            r15 = 0
        L_0x001b:
            if (r15 >= r10) goto L_0x02c8
            java.util.List<android.view.View> r2 = r0.f1675i
            java.lang.Object r2 = r2.get(r15)
            r8 = r2
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r2 = r8.getLayoutParams()
            r7 = r2
            android.support.design.widget.CoordinatorLayout$d r7 = (android.support.design.widget.CoordinatorLayout.C0505d) r7
            if (r1 != 0) goto L_0x003f
            int r2 = r8.getVisibility()
            r3 = 8
            if (r2 == r3) goto L_0x0038
            goto L_0x003f
        L_0x0038:
            r4 = r10
            r5 = r13
            r18 = r15
            r2 = 0
            goto L_0x02c2
        L_0x003f:
            r6 = 0
        L_0x0040:
            if (r6 >= r15) goto L_0x00f4
            java.util.List<android.view.View> r2 = r0.f1675i
            java.lang.Object r2 = r2.get(r6)
            android.view.View r2 = (android.view.View) r2
            android.view.View r3 = r7.f1704l
            if (r3 != r2) goto L_0x00dc
            android.view.ViewGroup$LayoutParams r2 = r8.getLayoutParams()
            r4 = r2
            android.support.design.widget.CoordinatorLayout$d r4 = (android.support.design.widget.CoordinatorLayout.C0505d) r4
            android.view.View r2 = r4.f1703k
            if (r2 == 0) goto L_0x00dc
            android.graphics.Rect r3 = mo54229a()
            android.graphics.Rect r2 = mo54229a()
            android.graphics.Rect r14 = mo54229a()
            android.view.View r5 = r4.f1703k
            r0.m1265a(r5, r3)
            r5 = 0
            r0.m1267a(r8, r5, r2)
            int r5 = r8.getMeasuredWidth()
            r17 = r10
            int r10 = r8.getMeasuredHeight()
            r18 = r15
            r15 = r2
            r2 = r8
            r19 = r3
            r3 = r9
            r20 = r4
            r4 = r19
            r21 = r5
            r22 = r13
            r13 = 1
            r5 = r14
            r16 = r6
            r6 = r20
            r23 = r7
            r7 = r21
            r13 = r8
            r8 = r10
            m1264a(r2, r3, r4, r5, r6, r7, r8)
            int r2 = r14.left
            int r3 = r15.left
            if (r2 != r3) goto L_0x00aa
            int r2 = r14.top
            int r3 = r15.top
            if (r2 == r3) goto L_0x00a3
            goto L_0x00aa
        L_0x00a3:
            r2 = r20
            r3 = r21
            r24 = 0
            goto L_0x00b0
        L_0x00aa:
            r2 = r20
            r3 = r21
            r24 = 1
        L_0x00b0:
            r0.m1262a(r2, r14, r3, r10)
            int r3 = r14.left
            int r4 = r15.left
            int r3 = r3 - r4
            int r4 = r14.top
            int r5 = r15.top
            int r4 = r4 - r5
            if (r3 == 0) goto L_0x00c2
            android.support.p030v4.view.C1056u.m3060h(r13, r3)
        L_0x00c2:
            if (r4 == 0) goto L_0x00c7
            android.support.p030v4.view.C1056u.m3058g(r13, r4)
        L_0x00c7:
            if (r24 == 0) goto L_0x00d2
            android.support.design.widget.CoordinatorLayout$Behavior r3 = r2.f1693a
            if (r3 == 0) goto L_0x00d2
            android.view.View r2 = r2.f1703k
            r3.mo1159b(r0, r13, r2)
        L_0x00d2:
            m1261a(r19)
            m1261a(r15)
            m1261a(r14)
            goto L_0x00e7
        L_0x00dc:
            r16 = r6
            r23 = r7
            r17 = r10
            r22 = r13
            r18 = r15
            r13 = r8
        L_0x00e7:
            int r6 = r16 + 1
            r8 = r13
            r10 = r17
            r15 = r18
            r13 = r22
            r7 = r23
            goto L_0x0040
        L_0x00f4:
            r23 = r7
            r17 = r10
            r22 = r13
            r18 = r15
            r2 = 1
            r13 = r8
            r0.m1267a(r13, r2, r12)
            r2 = r23
            int r3 = r2.f1699g
            r4 = 5
            r5 = 3
            r6 = 80
            r7 = 48
            if (r3 == 0) goto L_0x015b
            boolean r3 = r12.isEmpty()
            if (r3 != 0) goto L_0x015b
            int r3 = r2.f1699g
            int r3 = android.support.p030v4.view.C1039e.m2968a(r3, r9)
            r8 = r3 & 112(0x70, float:1.57E-43)
            if (r8 == r7) goto L_0x0130
            if (r8 == r6) goto L_0x0120
            goto L_0x013a
        L_0x0120:
            int r8 = r11.bottom
            int r10 = r25.getHeight()
            int r14 = r12.top
            int r10 = r10 - r14
            int r8 = java.lang.Math.max(r8, r10)
            r11.bottom = r8
            goto L_0x013a
        L_0x0130:
            int r8 = r11.top
            int r10 = r12.bottom
            int r8 = java.lang.Math.max(r8, r10)
            r11.top = r8
        L_0x013a:
            r3 = r3 & 7
            if (r3 == r5) goto L_0x0151
            if (r3 == r4) goto L_0x0141
            goto L_0x015b
        L_0x0141:
            int r3 = r11.right
            int r8 = r25.getWidth()
            int r10 = r12.left
            int r8 = r8 - r10
            int r3 = java.lang.Math.max(r3, r8)
            r11.right = r3
            goto L_0x015b
        L_0x0151:
            int r3 = r11.left
            int r8 = r12.right
            int r3 = java.lang.Math.max(r3, r8)
            r11.left = r3
        L_0x015b:
            int r2 = r2.f1700h
            if (r2 == 0) goto L_0x025f
            int r2 = r13.getVisibility()
            if (r2 != 0) goto L_0x025f
            boolean r2 = android.support.p030v4.view.C1056u.m3079y(r13)
            if (r2 == 0) goto L_0x025f
            int r2 = r13.getWidth()
            if (r2 <= 0) goto L_0x025f
            int r2 = r13.getHeight()
            if (r2 > 0) goto L_0x0179
            goto L_0x025f
        L_0x0179:
            android.view.ViewGroup$LayoutParams r2 = r13.getLayoutParams()
            android.support.design.widget.CoordinatorLayout$d r2 = (android.support.design.widget.CoordinatorLayout.C0505d) r2
            android.support.design.widget.CoordinatorLayout$Behavior r3 = r2.f1693a
            android.graphics.Rect r8 = mo54229a()
            android.graphics.Rect r10 = mo54229a()
            int r14 = r13.getLeft()
            int r15 = r13.getTop()
            int r4 = r13.getRight()
            int r5 = r13.getBottom()
            r10.set(r14, r15, r4, r5)
            if (r3 == 0) goto L_0x01cf
            boolean r3 = r3.mo1373a(r0, r13, r8)
            if (r3 == 0) goto L_0x01cf
            boolean r3 = r10.contains(r8)
            if (r3 == 0) goto L_0x01ab
            goto L_0x01d2
        L_0x01ab:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Rect should be within the child's bounds. Rect:"
            r2.<init>(r3)
            java.lang.String r3 = r8.toShortString()
            r2.append(r3)
            java.lang.String r3 = " | Bounds:"
            r2.append(r3)
            java.lang.String r3 = r10.toShortString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01cf:
            r8.set(r10)
        L_0x01d2:
            m1261a(r10)
            boolean r3 = r8.isEmpty()
            if (r3 != 0) goto L_0x025a
            int r3 = r2.f1700h
            int r3 = android.support.p030v4.view.C1039e.m2968a(r3, r9)
            r4 = r3 & 48
            if (r4 != r7) goto L_0x01f9
            int r4 = r8.top
            int r5 = r2.topMargin
            int r4 = r4 - r5
            int r5 = r2.f1702j
            int r4 = r4 - r5
            int r5 = r11.top
            if (r4 >= r5) goto L_0x01f9
            int r5 = r11.top
            int r5 = r5 - r4
            m1279e(r13, r5)
            r5 = 1
            goto L_0x01fa
        L_0x01f9:
            r5 = 0
        L_0x01fa:
            r4 = r3 & 80
            if (r4 != r6) goto L_0x0216
            int r4 = r25.getHeight()
            int r6 = r8.bottom
            int r4 = r4 - r6
            int r6 = r2.bottomMargin
            int r4 = r4 - r6
            int r6 = r2.f1702j
            int r4 = r4 + r6
            int r6 = r11.bottom
            if (r4 >= r6) goto L_0x0216
            int r5 = r11.bottom
            int r4 = r4 - r5
            m1279e(r13, r4)
            r5 = 1
        L_0x0216:
            if (r5 != 0) goto L_0x021c
            r4 = 0
            m1279e(r13, r4)
        L_0x021c:
            r4 = r3 & 3
            r5 = 3
            if (r4 != r5) goto L_0x0235
            int r4 = r8.left
            int r5 = r2.leftMargin
            int r4 = r4 - r5
            int r5 = r2.f1701i
            int r4 = r4 - r5
            int r5 = r11.left
            if (r4 >= r5) goto L_0x0235
            int r5 = r11.left
            int r5 = r5 - r4
            m1278d(r13, r5)
            r5 = 1
            goto L_0x0236
        L_0x0235:
            r5 = 0
        L_0x0236:
            r3 = r3 & 5
            r4 = 5
            if (r3 != r4) goto L_0x0253
            int r3 = r25.getWidth()
            int r4 = r8.right
            int r3 = r3 - r4
            int r4 = r2.rightMargin
            int r3 = r3 - r4
            int r2 = r2.f1701i
            int r3 = r3 + r2
            int r2 = r11.right
            if (r3 >= r2) goto L_0x0253
            int r2 = r11.right
            int r3 = r3 - r2
            m1278d(r13, r3)
            r5 = 1
        L_0x0253:
            if (r5 != 0) goto L_0x025a
            r2 = 0
            m1278d(r13, r2)
            goto L_0x025b
        L_0x025a:
            r2 = 0
        L_0x025b:
            m1261a(r8)
            goto L_0x0260
        L_0x025f:
            r2 = 0
        L_0x0260:
            r3 = 2
            if (r1 == r3) goto L_0x0285
            android.view.ViewGroup$LayoutParams r4 = r13.getLayoutParams()
            android.support.design.widget.CoordinatorLayout$d r4 = (android.support.design.widget.CoordinatorLayout.C0505d) r4
            android.graphics.Rect r4 = r4.f1707o
            r5 = r22
            r5.set(r4)
            boolean r4 = r5.equals(r12)
            if (r4 != 0) goto L_0x0282
            android.view.ViewGroup$LayoutParams r4 = r13.getLayoutParams()
            android.support.design.widget.CoordinatorLayout$d r4 = (android.support.design.widget.CoordinatorLayout.C0505d) r4
            android.graphics.Rect r4 = r4.f1707o
            r4.set(r12)
            goto L_0x0287
        L_0x0282:
            r4 = r17
            goto L_0x02c2
        L_0x0285:
            r5 = r22
        L_0x0287:
            int r15 = r18 + 1
            r4 = r17
        L_0x028b:
            if (r15 >= r4) goto L_0x02c2
            java.util.List<android.view.View> r6 = r0.f1675i
            java.lang.Object r6 = r6.get(r15)
            android.view.View r6 = (android.view.View) r6
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            android.support.design.widget.CoordinatorLayout$d r7 = (android.support.design.widget.CoordinatorLayout.C0505d) r7
            android.support.design.widget.CoordinatorLayout$Behavior r8 = r7.f1693a
            if (r8 == 0) goto L_0x02be
            boolean r10 = r8.mo1157a(r0, r6, r13)
            if (r10 == 0) goto L_0x02be
            if (r1 != 0) goto L_0x02af
            boolean r10 = r7.f1706n
            if (r10 == 0) goto L_0x02af
            r7.mo1387c()
            goto L_0x02be
        L_0x02af:
            if (r1 == r3) goto L_0x02b7
            boolean r6 = r8.mo1159b(r0, r6, r13)
        L_0x02b5:
            r8 = 1
            goto L_0x02b9
        L_0x02b7:
            r6 = 1
            goto L_0x02b5
        L_0x02b9:
            if (r1 != r8) goto L_0x02bf
            r7.f1706n = r6
            goto L_0x02bf
        L_0x02be:
            r8 = 1
        L_0x02bf:
            int r15 = r15 + 1
            goto L_0x028b
        L_0x02c2:
            int r15 = r18 + 1
            r10 = r4
            r13 = r5
            goto L_0x001b
        L_0x02c8:
            r5 = r13
            m1261a(r11)
            m1261a(r12)
            m1261a(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.mo1323a(int):void");
    }

    /* renamed from: a */
    public final void mo1324a(View view) {
        List b = this.f1676j.mo3555b(view);
        if (b != null && !b.isEmpty()) {
            for (int i = 0; i < b.size(); i++) {
                View view2 = (View) b.get(i);
                Behavior behavior = ((C0505d) view2.getLayoutParams()).f1693a;
                if (behavior != null) {
                    behavior.mo1159b(this, view2, view);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo1329a(View view, int i, int i2) {
        Rect a = mo54229a();
        m1265a(view, a);
        try {
            return a.contains(i, i2);
        } finally {
            m1261a(a);
        }
    }

    /* renamed from: a */
    public final boolean mo1330a(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0505d dVar = (C0505d) childAt.getLayoutParams();
                Behavior behavior = dVar.f1693a;
                if (behavior != null) {
                    boolean a = behavior.mo967a(this, childAt, view, view2, i, i2);
                    boolean z2 = z | a;
                    dVar.mo1382a(i3, a);
                    z = z2;
                } else {
                    dVar.mo1382a(i3, false);
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public final void mo1327a(View view, int i, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0505d dVar = (C0505d) childAt.getLayoutParams();
                if (dVar.mo1386b(i5)) {
                    Behavior behavior = dVar.f1693a;
                    if (behavior != null) {
                        behavior.mo1208a(this, childAt, view, i, i2, i3, i4, i5);
                        z = true;
                    }
                }
            } else {
                int i7 = i5;
            }
        }
        if (z) {
            mo1323a(1);
        }
    }

    /* renamed from: a */
    public final void mo1328a(View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        int i5;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0505d dVar = (C0505d) childAt.getLayoutParams();
                if (dVar.mo1386b(i3)) {
                    Behavior behavior = dVar.f1693a;
                    if (behavior != null) {
                        int[] iArr2 = this.f1679m;
                        this.f1679m[1] = 0;
                        iArr2[0] = 0;
                        behavior.mo1209a(this, childAt, view, i, i2, this.f1679m, i3);
                        if (i > 0) {
                            i4 = Math.max(i6, this.f1679m[0]);
                        } else {
                            i4 = Math.min(i6, this.f1679m[0]);
                        }
                        if (i2 > 0) {
                            i5 = Math.max(i7, this.f1679m[1]);
                        } else {
                            i5 = Math.min(i7, this.f1679m[1]);
                        }
                        i6 = i4;
                        i7 = i5;
                        z = true;
                    }
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
        if (z) {
            mo1323a(1);
        }
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return new C0505d(-2, -2);
    }

    public int getNestedScrollAxes() {
        return this.f1689w.f3334a;
    }

    /* renamed from: a */
    private static Rect mo54229a() {
        Rect rect = (Rect) f1671h.acquire();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    /* access modifiers changed from: 0000 */
    public final List<View> getDependencySortedChildren() {
        mo54589b();
        return Collections.unmodifiableList(this.f1675i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1687u;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* renamed from: c */
    private void m1274c() {
        if (VERSION.SDK_INT >= 21) {
            if (C1056u.m3073s(this)) {
                if (this.f1688v == null) {
                    this.f1688v = new C1051p() {
                        /* renamed from: a */
                        public final C1018ac mo1130a(View view, C1018ac acVar) {
                            boolean z;
                            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
                            if (!C0793j.m2264a(coordinatorLayout.f1672e, acVar)) {
                                coordinatorLayout.f1672e = acVar;
                                boolean z2 = true;
                                if (acVar == null || acVar.mo3186b() <= 0) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                coordinatorLayout.f1673f = z;
                                if (coordinatorLayout.f1673f || coordinatorLayout.getBackground() != null) {
                                    z2 = false;
                                }
                                coordinatorLayout.setWillNotDraw(z2);
                                if (!acVar.mo3189e()) {
                                    int childCount = coordinatorLayout.getChildCount();
                                    for (int i = 0; i < childCount; i++) {
                                        View childAt = coordinatorLayout.getChildAt(i);
                                        if (C1056u.m3073s(childAt) && ((C0505d) childAt.getLayoutParams()).f1693a != null && acVar.mo3189e()) {
                                            break;
                                        }
                                    }
                                }
                                coordinatorLayout.requestLayout();
                            }
                            return acVar;
                        }
                    };
                }
                C1056u.m3032a((View) this, this.f1688v);
                setSystemUiVisibility(1280);
                return;
            }
            C1056u.m3032a((View) this, (C1051p) null);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1268a(false);
        if (this.f1686t) {
            if (this.f1685s == null) {
                this.f1685s = new C0506e();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1685s);
        }
        if (this.f1672e == null && C1056u.m3073s(this)) {
            C1056u.m3072r(this);
        }
        this.f1681o = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1268a(false);
        if (this.f1686t && this.f1685s != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1685s);
        }
        if (this.f1684r != null) {
            onStopNestedScroll(this.f1684r);
        }
        this.f1681o = false;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = ((C0505d) childAt.getLayoutParams()).f1693a;
            if (!(id == -1 || behavior == null)) {
                Parcelable b = behavior.mo1215b(this, childAt);
                if (b != null) {
                    sparseArray.append(id, b);
                }
            }
        }
        savedState.f1691a = sparseArray;
        return savedState;
    }

    static {
        String str;
        Package packageR = CoordinatorLayout.class.getPackage();
        if (packageR != null) {
            str = packageR.getName();
        } else {
            str = null;
        }
        f1667a = str;
        if (VERSION.SDK_INT >= 21) {
            f1670d = new C0507f();
        } else {
            f1670d = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007a, code lost:
        if (r5 != false) goto L_0x00d9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x016a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x011f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void mo54589b() {
        /*
            r11 = this;
            java.util.List<android.view.View> r0 = r11.f1675i
            r0.clear()
            android.support.v4.widget.h<android.view.View> r0 = r11.f1676j
            android.support.v4.f.n<T, java.util.ArrayList<T>> r1 = r0.f3538b
            int r1 = r1.size()
            r2 = 0
            r3 = 0
        L_0x000f:
            if (r3 >= r1) goto L_0x0026
            android.support.v4.f.n<T, java.util.ArrayList<T>> r4 = r0.f3538b
            java.lang.Object r4 = r4.mo2577c(r3)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 == 0) goto L_0x0023
            r4.clear()
            android.support.v4.f.l$a<java.util.ArrayList<T>> r5 = r0.f3537a
            r5.release(r4)
        L_0x0023:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x0026:
            android.support.v4.f.n<T, java.util.ArrayList<T>> r0 = r0.f3538b
            r0.clear()
            int r0 = r11.getChildCount()
            r1 = 0
        L_0x0030:
            if (r1 >= r0) goto L_0x0198
            android.view.View r3 = r11.getChildAt(r1)
            android.support.design.widget.CoordinatorLayout$d r4 = m1277d(r3)
            int r5 = r4.f1698f
            r6 = -1
            r7 = 0
            r8 = 1
            if (r5 != r6) goto L_0x0047
            r4.f1704l = r7
            r4.f1703k = r7
            goto L_0x00db
        L_0x0047:
            android.view.View r5 = r4.f1703k
            if (r5 == 0) goto L_0x007c
            android.view.View r5 = r4.f1703k
            int r5 = r5.getId()
            int r6 = r4.f1698f
            if (r5 == r6) goto L_0x0057
        L_0x0055:
            r5 = 0
            goto L_0x007a
        L_0x0057:
            android.view.View r5 = r4.f1703k
            android.view.View r6 = r4.f1703k
            android.view.ViewParent r6 = r6.getParent()
        L_0x005f:
            if (r6 == r11) goto L_0x0077
            if (r6 == 0) goto L_0x0072
            if (r6 != r3) goto L_0x0066
            goto L_0x0072
        L_0x0066:
            boolean r9 = r6 instanceof android.view.View
            if (r9 == 0) goto L_0x006d
            r5 = r6
            android.view.View r5 = (android.view.View) r5
        L_0x006d:
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x005f
        L_0x0072:
            r4.f1704l = r7
            r4.f1703k = r7
            goto L_0x0055
        L_0x0077:
            r4.f1704l = r5
            r5 = 1
        L_0x007a:
            if (r5 != 0) goto L_0x00d9
        L_0x007c:
            int r5 = r4.f1698f
            android.view.View r5 = r11.findViewById(r5)
            r4.f1703k = r5
            android.view.View r5 = r4.f1703k
            if (r5 == 0) goto L_0x00cf
            android.view.View r5 = r4.f1703k
            if (r5 != r11) goto L_0x009f
            boolean r5 = r11.isInEditMode()
            if (r5 == 0) goto L_0x0097
            r4.f1704l = r7
            r4.f1703k = r7
            goto L_0x00d9
        L_0x0097:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "View can not be anchored to the the parent CoordinatorLayout"
            r0.<init>(r1)
            throw r0
        L_0x009f:
            android.view.View r5 = r4.f1703k
            android.view.View r6 = r4.f1703k
            android.view.ViewParent r6 = r6.getParent()
        L_0x00a7:
            if (r6 == r11) goto L_0x00cc
            if (r6 == 0) goto L_0x00cc
            if (r6 != r3) goto L_0x00c0
            boolean r5 = r11.isInEditMode()
            if (r5 == 0) goto L_0x00b8
            r4.f1704l = r7
            r4.f1703k = r7
            goto L_0x00d9
        L_0x00b8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Anchor must not be a descendant of the anchored view"
            r0.<init>(r1)
            throw r0
        L_0x00c0:
            boolean r9 = r6 instanceof android.view.View
            if (r9 == 0) goto L_0x00c7
            r5 = r6
            android.view.View r5 = (android.view.View) r5
        L_0x00c7:
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x00a7
        L_0x00cc:
            r4.f1704l = r5
            goto L_0x00d9
        L_0x00cf:
            boolean r5 = r11.isInEditMode()
            if (r5 == 0) goto L_0x0172
            r4.f1704l = r7
            r4.f1703k = r7
        L_0x00d9:
            android.view.View r5 = r4.f1703k
        L_0x00db:
            android.support.v4.widget.h<android.view.View> r5 = r11.f1676j
            r5.mo3554a(r3)
            r5 = 0
        L_0x00e1:
            if (r5 >= r0) goto L_0x016e
            if (r5 == r1) goto L_0x016a
            android.view.View r6 = r11.getChildAt(r5)
            android.view.View r7 = r4.f1704l
            if (r6 == r7) goto L_0x011c
            int r7 = android.support.p030v4.view.C1056u.m3055f(r11)
            android.view.ViewGroup$LayoutParams r9 = r6.getLayoutParams()
            android.support.design.widget.CoordinatorLayout$d r9 = (android.support.design.widget.CoordinatorLayout.C0505d) r9
            int r9 = r9.f1699g
            int r9 = android.support.p030v4.view.C1039e.m2968a(r9, r7)
            if (r9 == 0) goto L_0x010a
            int r10 = r4.f1700h
            int r7 = android.support.p030v4.view.C1039e.m2968a(r10, r7)
            r7 = r7 & r9
            if (r7 != r9) goto L_0x010a
            r7 = 1
            goto L_0x010b
        L_0x010a:
            r7 = 0
        L_0x010b:
            if (r7 != 0) goto L_0x011c
            android.support.design.widget.CoordinatorLayout$Behavior r7 = r4.f1693a
            if (r7 == 0) goto L_0x011a
            android.support.design.widget.CoordinatorLayout$Behavior r7 = r4.f1693a
            boolean r7 = r7.mo1157a(r11, r3, r6)
            if (r7 == 0) goto L_0x011a
            goto L_0x011c
        L_0x011a:
            r7 = 0
            goto L_0x011d
        L_0x011c:
            r7 = 1
        L_0x011d:
            if (r7 == 0) goto L_0x016a
            android.support.v4.widget.h<android.view.View> r7 = r11.f1676j
            android.support.v4.f.n<T, java.util.ArrayList<T>> r7 = r7.f3538b
            boolean r7 = r7.containsKey(r6)
            if (r7 != 0) goto L_0x012e
            android.support.v4.widget.h<android.view.View> r7 = r11.f1676j
            r7.mo3554a(r6)
        L_0x012e:
            android.support.v4.widget.h<android.view.View> r7 = r11.f1676j
            android.support.v4.f.n<T, java.util.ArrayList<T>> r9 = r7.f3538b
            boolean r9 = r9.containsKey(r6)
            if (r9 == 0) goto L_0x0162
            android.support.v4.f.n<T, java.util.ArrayList<T>> r9 = r7.f3538b
            boolean r9 = r9.containsKey(r3)
            if (r9 == 0) goto L_0x0162
            android.support.v4.f.n<T, java.util.ArrayList<T>> r9 = r7.f3538b
            java.lang.Object r9 = r9.get(r6)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 != 0) goto L_0x015e
            android.support.v4.f.l$a<java.util.ArrayList<T>> r9 = r7.f3537a
            java.lang.Object r9 = r9.acquire()
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 != 0) goto L_0x0159
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x0159:
            android.support.v4.f.n<T, java.util.ArrayList<T>> r7 = r7.f3538b
            r7.put(r6, r9)
        L_0x015e:
            r9.add(r3)
            goto L_0x016a
        L_0x0162:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "All nodes must be present in the graph before being added as an edge"
            r0.<init>(r1)
            throw r0
        L_0x016a:
            int r5 = r5 + 1
            goto L_0x00e1
        L_0x016e:
            int r1 = r1 + 1
            goto L_0x0030
        L_0x0172:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not find CoordinatorLayout descendant view with id "
            r1.<init>(r2)
            android.content.res.Resources r2 = r11.getResources()
            int r4 = r4.f1698f
            java.lang.String r2 = r2.getResourceName(r4)
            r1.append(r2)
            java.lang.String r2 = " to anchor view "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0198:
            java.util.List<android.view.View> r0 = r11.f1675i
            android.support.v4.widget.h<android.view.View> r1 = r11.f1676j
            java.util.ArrayList r1 = r1.mo3553a()
            r0.addAll(r1)
            java.util.List<android.view.View> r0 = r11.f1675i
            java.util.Collections.reverse(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.mo54589b():void");
    }

    public void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1674g = onHierarchyChangeListener;
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public void onStopNestedScroll(View view) {
        mo1332b(view, 0);
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m1274c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        if (!(layoutParams instanceof C0505d) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0505d(getContext(), attributeSet);
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C0726c.m2091a(getContext(), i);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f1687u) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static void m1261a(Rect rect) {
        rect.setEmpty();
        f1671h.release(rect);
    }

    /* renamed from: b */
    private int m1270b(int i) {
        if (this.f1682p != null && i >= 0 && i < this.f1682p.length) {
            return this.f1682p[i];
        }
        return 0;
    }

    /* renamed from: c */
    public final List<View> mo1334c(View view) {
        List b = this.f1676j.mo3555b(view);
        this.f1678l.clear();
        if (b != null) {
            this.f1678l.addAll(b);
        }
        return this.f1678l;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        if (layoutParams instanceof C0505d) {
            return new C0505d((C0505d) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new C0505d((MarginLayoutParams) layoutParams);
        }
        return new C0505d(layoutParams);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m1268a(true);
        }
        boolean a = m1269a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m1268a(true);
        }
        return a;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f1680n) {
            m1268a(false);
            this.f1680n = true;
        }
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f1687u != null && this.f1687u.isVisible() != z) {
            this.f1687u.setVisible(z, false);
        }
    }

    /* renamed from: b */
    public final List<View> mo1331b(View view) {
        List c = this.f1676j.mo3556c(view);
        this.f1678l.clear();
        if (c != null) {
            this.f1678l.addAll(c);
        }
        return this.f1678l;
    }

    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.f1673f && this.f1687u != null) {
            if (this.f1672e != null) {
                i = this.f1672e.mo3186b();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.f1687u.setBounds(0, 0, getWidth(), i);
                this.f1687u.draw(canvas);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3119e);
        SparseArray<Parcelable> sparseArray = savedState.f1691a;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = m1277d(childAt).f1693a;
            if (!(id == -1 || behavior == null)) {
                Parcelable parcelable2 = (Parcelable) sparseArray.get(id);
                if (parcelable2 != null) {
                    behavior.mo1206a(this, childAt, parcelable2);
                }
            }
        }
    }

    /* renamed from: d */
    private static C0505d m1277d(View view) {
        C0505d dVar = (C0505d) view.getLayoutParams();
        if (!dVar.f1694b) {
            if (view instanceof C0502a) {
                dVar.mo1383a(((C0502a) view).getBehavior());
                dVar.f1694b = true;
            } else {
                C0503b bVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    bVar = (C0503b) cls.getAnnotation(C0503b.class);
                    if (bVar != null) {
                        break;
                    }
                }
                if (bVar != null) {
                    try {
                        dVar.mo1383a((Behavior) bVar.mo1378a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception unused) {
                    }
                }
                dVar.f1694b = true;
            }
        }
        return dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f1683q
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0017
            boolean r3 = r0.m1269a(r1, r4)
            if (r3 == 0) goto L_0x0015
            goto L_0x0018
        L_0x0015:
            r6 = 0
            goto L_0x002a
        L_0x0017:
            r3 = 0
        L_0x0018:
            android.view.View r6 = r0.f1683q
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.support.design.widget.CoordinatorLayout$d r6 = (android.support.design.widget.CoordinatorLayout.C0505d) r6
            android.support.design.widget.CoordinatorLayout$Behavior r6 = r6.f1693a
            if (r6 == 0) goto L_0x0015
            android.view.View r7 = r0.f1683q
            boolean r6 = r6.mo1171a(r0, r7, r1)
        L_0x002a:
            android.view.View r7 = r0.f1683q
            r8 = 0
            if (r7 != 0) goto L_0x0035
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x0048
        L_0x0035:
            if (r3 == 0) goto L_0x0048
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x0048:
            if (r8 == 0) goto L_0x004d
            r8.recycle()
        L_0x004d:
            if (r2 == r4) goto L_0x0052
            r1 = 3
            if (r2 != r1) goto L_0x0055
        L_0x0052:
            r0.m1268a(r5)
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z;
        if (this.f1687u != drawable) {
            Drawable drawable2 = null;
            if (this.f1687u != null) {
                this.f1687u.setCallback(null);
            }
            if (drawable != null) {
                drawable2 = drawable.mutate();
            }
            this.f1687u = drawable2;
            if (this.f1687u != null) {
                if (this.f1687u.isStateful()) {
                    this.f1687u.setState(getDrawableState());
                }
                C0809a.m2333b(this.f1687u, C1056u.m3055f(this));
                Drawable drawable3 = this.f1687u;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable3.setVisible(z, false);
                this.f1687u.setCallback(this);
            }
            C1056u.m3052d(this);
        }
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ih);
    }

    /* renamed from: d */
    private static void m1278d(View view, int i) {
        C0505d dVar = (C0505d) view.getLayoutParams();
        if (dVar.f1701i != i) {
            C1056u.m3060h(view, i - dVar.f1701i);
            dVar.f1701i = i;
        }
    }

    /* renamed from: e */
    private static void m1279e(View view, int i) {
        C0505d dVar = (C0505d) view.getLayoutParams();
        if (dVar.f1702j != i) {
            C1056u.m3058g(view, i - dVar.f1702j);
            dVar.f1702j = i;
        }
    }

    /* renamed from: c */
    private void m1275c(View view, int i) {
        C0505d dVar = (C0505d) view.getLayoutParams();
        Rect a = mo54229a();
        a.set(getPaddingLeft() + dVar.leftMargin, getPaddingTop() + dVar.topMargin, (getWidth() - getPaddingRight()) - dVar.rightMargin, (getHeight() - getPaddingBottom()) - dVar.bottomMargin);
        if (this.f1672e != null && C1056u.m3073s(this) && !C1056u.m3073s(view)) {
            a.left += this.f1672e.mo3184a();
            a.top += this.f1672e.mo3186b();
            a.right -= this.f1672e.mo3187c();
            a.bottom -= this.f1672e.mo3188d();
        }
        Rect a2 = mo54229a();
        C1039e.m2969a(m1273c(dVar.f1695c), view.getMeasuredWidth(), view.getMeasuredHeight(), a, a2, i);
        view.layout(a2.left, a2.top, a2.right, a2.bottom);
        m1261a(a);
        m1261a(a2);
    }

    /* renamed from: b */
    public final void mo1332b(View view, int i) {
        this.f1689w.mo3235a(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0505d dVar = (C0505d) childAt.getLayoutParams();
            if (dVar.mo1386b(i)) {
                Behavior behavior = dVar.f1693a;
                if (behavior != null) {
                    behavior.mo1207a(this, childAt, view, i);
                }
                dVar.mo1381a(i);
                dVar.mo1387c();
            }
        }
        this.f1684r = null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0178, code lost:
        if (r0.mo1213a(r30, r20, r8, r21, r23, 0) == false) goto L_0x0187;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x017b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.mo54589b()
            int r0 = r30.getChildCount()
            r8 = 0
            r1 = 0
        L_0x000b:
            r2 = 1
            if (r1 >= r0) goto L_0x003a
            android.view.View r3 = r7.getChildAt(r1)
            android.support.v4.widget.h<android.view.View> r4 = r7.f1676j
            android.support.v4.f.n<T, java.util.ArrayList<T>> r5 = r4.f3538b
            int r5 = r5.size()
            r6 = 0
        L_0x001b:
            if (r6 >= r5) goto L_0x0032
            android.support.v4.f.n<T, java.util.ArrayList<T>> r9 = r4.f3538b
            java.lang.Object r9 = r9.mo2577c(r6)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L_0x002f
            boolean r9 = r9.contains(r3)
            if (r9 == 0) goto L_0x002f
            r3 = 1
            goto L_0x0033
        L_0x002f:
            int r6 = r6 + 1
            goto L_0x001b
        L_0x0032:
            r3 = 0
        L_0x0033:
            if (r3 == 0) goto L_0x0037
            r0 = 1
            goto L_0x003b
        L_0x0037:
            int r1 = r1 + 1
            goto L_0x000b
        L_0x003a:
            r0 = 0
        L_0x003b:
            boolean r1 = r7.f1686t
            if (r0 == r1) goto L_0x006f
            if (r0 == 0) goto L_0x005c
            boolean r0 = r7.f1681o
            if (r0 == 0) goto L_0x0059
            android.support.design.widget.CoordinatorLayout$e r0 = r7.f1685s
            if (r0 != 0) goto L_0x0050
            android.support.design.widget.CoordinatorLayout$e r0 = new android.support.design.widget.CoordinatorLayout$e
            r0.<init>()
            r7.f1685s = r0
        L_0x0050:
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            android.support.design.widget.CoordinatorLayout$e r1 = r7.f1685s
            r0.addOnPreDrawListener(r1)
        L_0x0059:
            r7.f1686t = r2
            goto L_0x006f
        L_0x005c:
            boolean r0 = r7.f1681o
            if (r0 == 0) goto L_0x006d
            android.support.design.widget.CoordinatorLayout$e r0 = r7.f1685s
            if (r0 == 0) goto L_0x006d
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            android.support.design.widget.CoordinatorLayout$e r1 = r7.f1685s
            r0.removeOnPreDrawListener(r1)
        L_0x006d:
            r7.f1686t = r8
        L_0x006f:
            int r9 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r10 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r11 = android.support.p030v4.view.C1056u.m3055f(r30)
            if (r11 != r2) goto L_0x0087
            r12 = 1
            goto L_0x0088
        L_0x0087:
            r12 = 0
        L_0x0088:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r9 + r10
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            android.support.v4.view.ac r3 = r7.f1672e
            if (r3 == 0) goto L_0x00b1
            boolean r3 = android.support.p030v4.view.C1056u.m3073s(r30)
            if (r3 == 0) goto L_0x00b1
            r19 = 1
            goto L_0x00b3
        L_0x00b1:
            r19 = 0
        L_0x00b3:
            java.util.List<android.view.View> r2 = r7.f1675i
            int r6 = r2.size()
            r4 = r0
            r2 = r1
            r3 = 0
            r5 = 0
        L_0x00bd:
            if (r5 >= r6) goto L_0x01d6
            java.util.List<android.view.View> r0 = r7.f1675i
            java.lang.Object r0 = r0.get(r5)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 == r1) goto L_0x01c7
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            android.support.design.widget.CoordinatorLayout$d r1 = (android.support.design.widget.CoordinatorLayout.C0505d) r1
            int r0 = r1.f1697e
            if (r0 < 0) goto L_0x011c
            if (r13 == 0) goto L_0x011c
            int r0 = r1.f1697e
            int r0 = r7.m1270b(r0)
            int r8 = r1.f1695c
            int r8 = m1276d(r8)
            int r8 = android.support.p030v4.view.C1039e.m2968a(r8, r11)
            r8 = r8 & 7
            r22 = r2
            r2 = 3
            if (r8 != r2) goto L_0x00f7
            if (r12 == 0) goto L_0x00fc
        L_0x00f7:
            r2 = 5
            if (r8 != r2) goto L_0x0108
            if (r12 == 0) goto L_0x0108
        L_0x00fc:
            int r2 = r14 - r10
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r21 = r2
            r8 = 0
            goto L_0x0120
        L_0x0108:
            if (r8 != r2) goto L_0x010c
            if (r12 == 0) goto L_0x0111
        L_0x010c:
            r2 = 3
            if (r8 != r2) goto L_0x011a
            if (r12 == 0) goto L_0x011a
        L_0x0111:
            int r0 = r0 - r9
            r8 = 0
            int r0 = java.lang.Math.max(r8, r0)
            r21 = r0
            goto L_0x0120
        L_0x011a:
            r8 = 0
            goto L_0x011e
        L_0x011c:
            r22 = r2
        L_0x011e:
            r21 = 0
        L_0x0120:
            if (r19 == 0) goto L_0x0152
            boolean r0 = android.support.p030v4.view.C1056u.m3073s(r20)
            if (r0 != 0) goto L_0x0152
            android.support.v4.view.ac r0 = r7.f1672e
            int r0 = r0.mo3184a()
            android.support.v4.view.ac r2 = r7.f1672e
            int r2 = r2.mo3187c()
            int r0 = r0 + r2
            android.support.v4.view.ac r2 = r7.f1672e
            int r2 = r2.mo3186b()
            android.support.v4.view.ac r8 = r7.f1672e
            int r8 = r8.mo3188d()
            int r2 = r2 + r8
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r8 = r0
            r23 = r2
            goto L_0x0156
        L_0x0152:
            r8 = r31
            r23 = r32
        L_0x0156:
            android.support.design.widget.CoordinatorLayout$Behavior r0 = r1.f1693a
            if (r0 == 0) goto L_0x017b
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r27 = r3
            r3 = r8
            r28 = r4
            r4 = r21
            r22 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.mo1213a(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0194
            goto L_0x0187
        L_0x017b:
            r26 = r1
            r27 = r3
            r28 = r4
            r29 = r6
            r25 = r22
            r22 = r5
        L_0x0187:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r8
            r3 = r21
            r4 = r23
            r0.mo1326a(r1, r2, r3, r4, r5)
        L_0x0194:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            r2 = r28
            int r0 = java.lang.Math.max(r2, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r25
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r8 = r27
            int r2 = android.view.View.combineMeasuredStates(r8, r2)
            r4 = r0
            r3 = r2
            goto L_0x01ce
        L_0x01c7:
            r1 = r2
            r8 = r3
            r2 = r4
            r22 = r5
            r29 = r6
        L_0x01ce:
            r2 = r1
            int r5 = r22 + 1
            r6 = r29
            r8 = 0
            goto L_0x00bd
        L_0x01d6:
            r1 = r2
            r8 = r3
            r2 = r4
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r8
            r3 = r31
            int r0 = android.view.View.resolveSizeAndState(r2, r3, r0)
            int r2 = r8 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    /* renamed from: a */
    private void m1265a(View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        Matrix matrix = (Matrix) C1123s.f3585a.get();
        if (matrix == null) {
            matrix = new Matrix();
            C1123s.f3585a.set(matrix);
        } else {
            matrix.reset();
        }
        C1123s.m3312a(this, view, matrix);
        RectF rectF = (RectF) C1123s.f3586b.get();
        if (rectF == null) {
            rectF = new RectF();
            C1123s.f3586b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        view.getLayoutParams();
        return super.drawChild(canvas, view, j);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo1333b(view, view2, i, 0);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1330a(view, view2, i, 0);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior behavior = ((C0505d) view.getLayoutParams()).f1693a;
        if (behavior == null || !behavior.mo1226a(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0505d dVar = (C0505d) childAt.getLayoutParams();
                if (dVar.mo1386b(0)) {
                    Behavior behavior = dVar.f1693a;
                    if (behavior != null) {
                        z |= behavior.mo1298a(this, childAt, view, f, f2);
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    private void m1272b(View view, int i, int i2) {
        C0505d dVar = (C0505d) view.getLayoutParams();
        int a = C1039e.m2968a(m1276d(dVar.f1695c), i2);
        int i3 = a & 7;
        int i4 = a & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int b = m1270b(i) - measuredWidth;
        if (i3 == 1) {
            b += measuredWidth / 2;
        } else if (i3 == 5) {
            b += measuredWidth;
        }
        int i5 = 0;
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + dVar.leftMargin, Math.min(b, ((width - getPaddingRight()) - measuredWidth) - dVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + dVar.topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - dVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArray;
        super(context, attributeSet, i);
        this.f1675i = new ArrayList();
        this.f1676j = new C1108h<>();
        this.f1677k = new ArrayList();
        this.f1678l = new ArrayList();
        this.f1679m = new int[2];
        this.f1689w = new C1050o(this);
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.q0, R.attr.a3i}, 0, R.style.s6);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.q0, R.attr.a3i}, i, 0);
        }
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f1682p = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f1682p.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f1682p;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
            }
        }
        this.f1687u = typedArray.getDrawable(1);
        typedArray.recycle();
        m1274c();
        super.setOnHierarchyChangeListener(new C0504c());
    }

    /* renamed from: a */
    static Behavior m1260a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(ClassUtils.PACKAGE_SEPARATOR)) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            str = sb.toString();
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f1667a)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f1667a);
            sb2.append('.');
            sb2.append(str);
            str = sb2.toString();
        }
        try {
            Map map = (Map) f1669c.get();
            if (map == null) {
                map = new HashMap();
                f1669c.set(map);
            }
            Constructor constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = context.getClassLoader().loadClass(str).getConstructor(f1668b);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (Behavior) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder("Could not inflate Behavior subclass ");
            sb3.append(str);
            throw new RuntimeException(sb3.toString(), e);
        }
    }

    /* renamed from: a */
    private void m1266a(View view, View view2, int i) {
        Rect a = mo54229a();
        Rect a2 = mo54229a();
        try {
            m1265a(view2, a);
            m1263a(view, i, a, a2);
            view.layout(a2.left, a2.top, a2.right, a2.bottom);
        } finally {
            m1261a(a);
            m1261a(a2);
        }
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1328a(view, i, i2, iArr, 0);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                childAt.getLayoutParams();
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m1263a(View view, int i, Rect rect, Rect rect2) {
        C0505d dVar = (C0505d) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m1264a(view, i, rect, rect2, dVar, measuredWidth, measuredHeight);
        m1262a(dVar, rect2, measuredWidth, measuredHeight);
    }

    /* renamed from: a */
    private void m1262a(C0505d dVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + dVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - dVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + dVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - dVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: b */
    public final void mo1333b(View view, View view2, int i, int i2) {
        this.f1689w.mo3237a(view, view2, i, i2);
        this.f1684r = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).getLayoutParams();
        }
    }

    /* renamed from: a */
    public final void mo1326a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo1327a(view, i, i2, i3, i4, 0);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int f = C1056u.m3055f(this);
        int size = this.f1675i.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.f1675i.get(i5);
            if (view.getVisibility() != 8) {
                Behavior behavior = ((C0505d) view.getLayoutParams()).f1693a;
                if (behavior == null || !behavior.mo934a(this, view, f)) {
                    mo1325a(view, f);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m1264a(View view, int i, Rect rect, Rect rect2, C0505d dVar, int i2, int i3) {
        int i4;
        int i5;
        int i6 = dVar.f1695c;
        if (i6 == 0) {
            i6 = 17;
        }
        int a = C1039e.m2968a(i6, i);
        int a2 = C1039e.m2968a(m1273c(dVar.f1696d), i);
        int i7 = a & 7;
        int i8 = a & 112;
        int i9 = a2 & 7;
        int i10 = a2 & 112;
        if (i9 == 1) {
            i4 = rect.left + (rect.width() / 2);
        } else if (i9 != 5) {
            i4 = rect.left;
        } else {
            i4 = rect.right;
        }
        if (i10 == 16) {
            i5 = rect.top + (rect.height() / 2);
        } else if (i10 != 80) {
            i5 = rect.top;
        } else {
            i5 = rect.bottom;
        }
        if (i7 == 1) {
            i4 -= i2 / 2;
        } else if (i7 != 5) {
            i4 -= i2;
        }
        if (i8 == 16) {
            i5 -= i3 / 2;
        } else if (i8 != 80) {
            i5 -= i3;
        }
        rect2.set(i4, i5, i2 + i4, i3 + i5);
    }
}
