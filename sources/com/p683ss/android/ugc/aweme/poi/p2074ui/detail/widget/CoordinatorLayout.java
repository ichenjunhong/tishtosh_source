package com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region.Op;
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
import android.support.p030v4.p033b.C0703a;
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
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.ugc.aweme.utils.C47924gn;
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

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout */
public class CoordinatorLayout extends ViewGroup implements C1049n {

    /* renamed from: a */
    static final String f100643a;

    /* renamed from: b */
    static final Class<?>[] f100644b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    static final ThreadLocal<Map<String, Constructor<Behavior>>> f100645c = new ThreadLocal<>();

    /* renamed from: d */
    static final Comparator<View> f100646d;

    /* renamed from: h */
    private static final C0796a<Rect> f100647h = new C0798c(12);

    /* renamed from: e */
    C1018ac f100648e;

    /* renamed from: f */
    boolean f100649f;

    /* renamed from: g */
    OnHierarchyChangeListener f100650g;

    /* renamed from: i */
    private final List<View> f100651i;

    /* renamed from: j */
    private final C39371b<View> f100652j;

    /* renamed from: k */
    private final List<View> f100653k;

    /* renamed from: l */
    private final List<View> f100654l;

    /* renamed from: m */
    private final int[] f100655m;

    /* renamed from: n */
    private Paint f100656n;

    /* renamed from: o */
    private boolean f100657o;

    /* renamed from: p */
    private boolean f100658p;

    /* renamed from: q */
    private int[] f100659q;

    /* renamed from: r */
    private View f100660r;

    /* renamed from: s */
    private View f100661s;

    /* renamed from: t */
    private C39368e f100662t;

    /* renamed from: u */
    private boolean f100663u;

    /* renamed from: v */
    private Drawable f100664v;

    /* renamed from: w */
    private C1051p f100665w;

    /* renamed from: x */
    private final C1050o f100666x;

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$Behavior */
    public static abstract class Behavior<V extends View> {
        public Behavior() {
        }

        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public int getScrimColor(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        public float getScrimOpacity(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public C1018ac onApplyWindowInsets(CoordinatorLayout coordinatorLayout, V v, C1018ac acVar) {
            return acVar;
        }

        public void onAttachedToLayoutParams(C39367d dVar) {
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean onNestedFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public void toggleAppBarLayout(CoordinatorLayout coordinatorLayout, V v, int i) {
        }

        public static Object getTag(View view) {
            return ((C39367d) view.getLayoutParams()).f100685p;
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
            return BaseSavedState.EMPTY_STATE;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }

        public static void setTag(View view, Object obj) {
            ((C39367d) view.getLayoutParams()).f100685p = obj;
        }

        public boolean blocksInteractionBelow(CoordinatorLayout coordinatorLayout, V v) {
            if (getScrimOpacity(coordinatorLayout, v) > 0.0f) {
                return true;
            }
            return false;
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                onStopNestedScroll(coordinatorLayout, v, view);
            }
        }

        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                onNestedScrollAccepted(coordinatorLayout, v, view, view2, i);
            }
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return onStartNestedScroll(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                onNestedPreScroll(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$SavedState */
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
        SparseArray<Parcelable> f100668a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f100668a = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f100668a.append(iArr[i], readParcelableArray[i]);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            int i2;
            super.writeToParcel(parcel, i);
            if (this.f100668a != null) {
                i2 = this.f100668a.size();
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
            int[] iArr = new int[i2];
            Parcelable[] parcelableArr = new Parcelable[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = this.f100668a.keyAt(i3);
                parcelableArr[i3] = (Parcelable) this.f100668a.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$a */
    public interface C39364a {
        /* renamed from: a */
        Behavior mo80314a();
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$b */
    public @interface C39365b {
        /* renamed from: a */
        Class<? extends Behavior> mo80315a();
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$c */
    class C39366c implements OnHierarchyChangeListener {
        C39366c() {
        }

        public final void onChildViewAdded(View view, View view2) {
            if (CoordinatorLayout.this.f100650g != null) {
                CoordinatorLayout.this.f100650g.onChildViewAdded(view, view2);
            }
        }

        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.mo80259a(2);
            if (CoordinatorLayout.this.f100650g != null) {
                CoordinatorLayout.this.f100650g.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$d */
    public static class C39367d extends MarginLayoutParams {

        /* renamed from: a */
        public Behavior f100670a;

        /* renamed from: b */
        boolean f100671b;

        /* renamed from: c */
        public int f100672c;

        /* renamed from: d */
        public int f100673d;

        /* renamed from: e */
        public int f100674e = -1;

        /* renamed from: f */
        public int f100675f = -1;

        /* renamed from: g */
        public int f100676g;

        /* renamed from: h */
        public int f100677h;

        /* renamed from: i */
        int f100678i;

        /* renamed from: j */
        int f100679j;

        /* renamed from: k */
        View f100680k;

        /* renamed from: l */
        View f100681l;

        /* renamed from: m */
        boolean f100682m;

        /* renamed from: n */
        public boolean f100683n;

        /* renamed from: o */
        public final Rect f100684o = new Rect();

        /* renamed from: p */
        Object f100685p;

        /* renamed from: q */
        private boolean f100686q;

        /* renamed from: r */
        private boolean f100687r;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo80318a() {
            this.f100682m = false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo80322b() {
            this.f100683n = false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo80319a(int i) {
            mo80320a(i, false);
        }

        public C39367d(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C39367d(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: a */
        public final void mo80321a(Behavior behavior) {
            if (this.f100670a != behavior) {
                if (this.f100670a != null) {
                    this.f100670a.onDetachedFromLayoutParams();
                }
                this.f100670a = behavior;
                this.f100685p = null;
                this.f100671b = true;
                if (behavior != null) {
                    behavior.onAttachedToLayoutParams(this);
                }
            }
        }

        public C39367d(C39367d dVar) {
            super(dVar);
        }

        public C39367d(int i, int i2) {
            super(-2, -2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo80320a(int i, boolean z) {
            switch (i) {
                case 0:
                    this.f100686q = z;
                    return;
                case 1:
                    this.f100687r = z;
                    break;
            }
        }

        C39367d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842931, R.attr.qa, R.attr.qb, R.attr.qc, R.attr.rm, R.attr.rw, R.attr.rx});
            this.f100672c = obtainStyledAttributes.getInteger(0, 0);
            this.f100675f = obtainStyledAttributes.getResourceId(1, -1);
            this.f100673d = obtainStyledAttributes.getInteger(2, 0);
            this.f100674e = obtainStyledAttributes.getInteger(6, -1);
            this.f100676g = obtainStyledAttributes.getInt(5, 0);
            this.f100677h = obtainStyledAttributes.getInt(4, 0);
            this.f100671b = obtainStyledAttributes.hasValue(3);
            if (this.f100671b) {
                this.f100670a = CoordinatorLayout.m87498a(context, attributeSet, obtainStyledAttributes.getString(3));
            }
            obtainStyledAttributes.recycle();
            if (this.f100670a != null) {
                this.f100670a.onAttachedToLayoutParams(this);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$e */
    class C39368e implements OnPreDrawListener {
        public final boolean onPreDraw() {
            CoordinatorLayout.this.mo80259a(0);
            return true;
        }

        C39368e() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$f */
    static class C39369f implements Comparator<View> {
        C39369f() {
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
    private static int m87508c(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: d */
    private static int m87511d(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: e */
    private static int m87515e(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    public final C1018ac getLastWindowInsets() {
        return this.f100648e;
    }

    public Drawable getStatusBarBackground() {
        return this.f100664v;
    }

    /* renamed from: a */
    public final void mo80261a(View view, int i) {
        C39367d dVar = (C39367d) view.getLayoutParams();
        int i2 = 0;
        if (!(dVar.f100680k == null && dVar.f100675f != -1)) {
            if (dVar.f100680k != null) {
                View view2 = dVar.f100680k;
                view.getLayoutParams();
                Rect b = m87507b();
                Rect b2 = m87507b();
                try {
                    m87501a(view2, b);
                    C39367d dVar2 = (C39367d) view.getLayoutParams();
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    m87500a(view, i, b, b2, dVar2, measuredWidth, measuredHeight);
                    m87503a(dVar2, b2, measuredWidth, measuredHeight);
                    view.layout(b2.left, b2.top, b2.right, b2.bottom);
                } finally {
                    m87499a(b);
                    m87499a(b2);
                }
            } else if (dVar.f100674e >= 0) {
                int i3 = dVar.f100674e;
                C39367d dVar3 = (C39367d) view.getLayoutParams();
                int a = C1039e.m2968a(m87511d(dVar3.f100672c), i);
                int i4 = a & 7;
                int i5 = a & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i == 1) {
                    i3 = width - i3;
                }
                int b3 = m87506b(i3) - measuredWidth2;
                if (i4 == 1) {
                    b3 += measuredWidth2 / 2;
                } else if (i4 == 5) {
                    b3 += measuredWidth2;
                }
                if (i5 == 16) {
                    i2 = 0 + (measuredHeight2 / 2);
                } else if (i5 == 80) {
                    i2 = measuredHeight2 + 0;
                }
                int max = Math.max(getPaddingLeft() + dVar3.leftMargin, Math.min(b3, ((width - getPaddingRight()) - measuredWidth2) - dVar3.rightMargin));
                int max2 = Math.max(getPaddingTop() + dVar3.topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - dVar3.bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            } else {
                C39367d dVar4 = (C39367d) view.getLayoutParams();
                Rect b4 = m87507b();
                b4.set(getPaddingLeft() + dVar4.leftMargin, getPaddingTop() + dVar4.topMargin, (getWidth() - getPaddingRight()) - dVar4.rightMargin, (getHeight() - getPaddingBottom()) - dVar4.bottomMargin);
                if (this.f100648e != null && C1056u.m3073s(this) && !C1056u.m3073s(view)) {
                    b4.left += this.f100648e.mo3184a();
                    b4.top += this.f100648e.mo3186b();
                    b4.right -= this.f100648e.mo3187c();
                    b4.bottom -= this.f100648e.mo3188d();
                }
                Rect b5 = m87507b();
                C1039e.m2969a(m87508c(dVar4.f100672c), view.getMeasuredWidth(), view.getMeasuredHeight(), b4, b5, i);
                view.layout(b5.left, b5.top, b5.right, b5.bottom);
                m87499a(b4);
                m87499a(b5);
            }
            return;
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0255  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80259a(int r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            int r9 = android.support.p030v4.view.C1056u.m3055f(r25)
            java.util.List<android.view.View> r2 = r0.f100651i
            int r10 = r2.size()
            android.graphics.Rect r11 = m87507b()
            android.graphics.Rect r12 = m87507b()
            android.graphics.Rect r13 = m87507b()
            r15 = 0
        L_0x001b:
            if (r15 >= r10) goto L_0x02cb
            java.util.List<android.view.View> r2 = r0.f100651i
            java.lang.Object r2 = r2.get(r15)
            r8 = r2
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r2 = r8.getLayoutParams()
            r7 = r2
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$d r7 = (com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget.CoordinatorLayout.C39367d) r7
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
            goto L_0x02c5
        L_0x003f:
            r6 = 0
        L_0x0040:
            if (r6 >= r15) goto L_0x00f4
            java.util.List<android.view.View> r2 = r0.f100651i
            java.lang.Object r2 = r2.get(r6)
            android.view.View r2 = (android.view.View) r2
            android.view.View r3 = r7.f100681l
            if (r3 != r2) goto L_0x00dc
            android.view.ViewGroup$LayoutParams r2 = r8.getLayoutParams()
            r4 = r2
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$d r4 = (com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget.CoordinatorLayout.C39367d) r4
            android.view.View r2 = r4.f100680k
            if (r2 == 0) goto L_0x00dc
            android.graphics.Rect r3 = m87507b()
            android.graphics.Rect r2 = m87507b()
            android.graphics.Rect r14 = m87507b()
            android.view.View r5 = r4.f100680k
            r0.m87501a(r5, r3)
            r5 = 0
            r0.m87502a(r8, r5, r2)
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
            m87500a(r2, r3, r4, r5, r6, r7, r8)
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
            r0.m87503a(r2, r14, r3, r10)
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
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$Behavior r3 = r2.f100670a
            if (r3 == 0) goto L_0x00d2
            android.view.View r2 = r2.f100680k
            r3.onDependentViewChanged(r0, r13, r2)
        L_0x00d2:
            m87499a(r19)
            m87499a(r15)
            m87499a(r14)
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
            r0.m87502a(r13, r2, r12)
            r2 = r23
            int r3 = r2.f100676g
            r4 = 5
            r5 = 3
            r6 = 80
            r7 = 48
            if (r3 == 0) goto L_0x015b
            boolean r3 = r12.isEmpty()
            if (r3 != 0) goto L_0x015b
            int r3 = r2.f100676g
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
            int r2 = r2.f100677h
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
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$d r2 = (com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget.CoordinatorLayout.C39367d) r2
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$Behavior r3 = r2.f100670a
            android.graphics.Rect r8 = m87507b()
            android.graphics.Rect r10 = m87507b()
            int r14 = r13.getLeft()
            int r15 = r13.getTop()
            int r4 = r13.getRight()
            int r5 = r13.getBottom()
            r10.set(r14, r15, r4, r5)
            if (r3 == 0) goto L_0x01cf
            boolean r3 = r3.getInsetDodgeRect(r0, r13, r8)
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
            m87499a(r10)
            boolean r3 = r8.isEmpty()
            if (r3 != 0) goto L_0x025a
            int r3 = r2.f100677h
            int r3 = android.support.p030v4.view.C1039e.m2968a(r3, r9)
            r4 = r3 & 48
            if (r4 != r7) goto L_0x01f9
            int r4 = r8.top
            int r5 = r2.topMargin
            int r4 = r4 - r5
            int r5 = r2.f100679j
            int r4 = r4 - r5
            int r5 = r11.top
            if (r4 >= r5) goto L_0x01f9
            int r5 = r11.top
            int r5 = r5 - r4
            m87514d(r13, r5)
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
            int r6 = r2.f100679j
            int r4 = r4 + r6
            int r6 = r11.bottom
            if (r4 >= r6) goto L_0x0216
            int r5 = r11.bottom
            int r4 = r4 - r5
            m87514d(r13, r4)
            r5 = 1
        L_0x0216:
            if (r5 != 0) goto L_0x021c
            r4 = 0
            m87514d(r13, r4)
        L_0x021c:
            r4 = r3 & 3
            r5 = 3
            if (r4 != r5) goto L_0x0235
            int r4 = r8.left
            int r5 = r2.leftMargin
            int r4 = r4 - r5
            int r5 = r2.f100678i
            int r4 = r4 - r5
            int r5 = r11.left
            if (r4 >= r5) goto L_0x0235
            int r5 = r11.left
            int r5 = r5 - r4
            m87510c(r13, r5)
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
            int r2 = r2.f100678i
            int r3 = r3 + r2
            int r2 = r11.right
            if (r3 >= r2) goto L_0x0253
            int r2 = r11.right
            int r3 = r3 - r2
            m87510c(r13, r3)
            r5 = 1
        L_0x0253:
            if (r5 != 0) goto L_0x025a
            r2 = 0
            m87510c(r13, r2)
            goto L_0x025b
        L_0x025a:
            r2 = 0
        L_0x025b:
            m87499a(r8)
            goto L_0x0260
        L_0x025f:
            r2 = 0
        L_0x0260:
            r3 = 2
            if (r1 == r3) goto L_0x0285
            android.view.ViewGroup$LayoutParams r4 = r13.getLayoutParams()
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$d r4 = (com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget.CoordinatorLayout.C39367d) r4
            android.graphics.Rect r4 = r4.f100684o
            r5 = r22
            r5.set(r4)
            boolean r4 = r5.equals(r12)
            if (r4 != 0) goto L_0x0282
            android.view.ViewGroup$LayoutParams r4 = r13.getLayoutParams()
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$d r4 = (com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget.CoordinatorLayout.C39367d) r4
            android.graphics.Rect r4 = r4.f100684o
            r4.set(r12)
            goto L_0x0287
        L_0x0282:
            r4 = r17
            goto L_0x02c5
        L_0x0285:
            r5 = r22
        L_0x0287:
            int r15 = r18 + 1
            r4 = r17
        L_0x028b:
            if (r15 >= r4) goto L_0x02c5
            java.util.List<android.view.View> r6 = r0.f100651i
            java.lang.Object r6 = r6.get(r15)
            android.view.View r6 = (android.view.View) r6
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$d r7 = (com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget.CoordinatorLayout.C39367d) r7
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$Behavior r8 = r7.f100670a
            if (r8 == 0) goto L_0x02c1
            boolean r10 = r8.layoutDependsOn(r0, r6, r13)
            if (r10 == 0) goto L_0x02c1
            if (r1 != 0) goto L_0x02af
            boolean r10 = r7.f100683n
            if (r10 == 0) goto L_0x02af
            r7.mo80322b()
            goto L_0x02c1
        L_0x02af:
            if (r1 == r3) goto L_0x02b7
            boolean r6 = r8.onDependentViewChanged(r0, r6, r13)
        L_0x02b5:
            r8 = 1
            goto L_0x02bc
        L_0x02b7:
            r8.onDependentViewRemoved(r0, r6, r13)
            r6 = 1
            goto L_0x02b5
        L_0x02bc:
            if (r1 != r8) goto L_0x02c2
            r7.f100683n = r6
            goto L_0x02c2
        L_0x02c1:
            r8 = 1
        L_0x02c2:
            int r15 = r15 + 1
            goto L_0x028b
        L_0x02c5:
            int r15 = r18 + 1
            r10 = r4
            r13 = r5
            goto L_0x001b
        L_0x02cb:
            r5 = r13
            m87499a(r11)
            m87499a(r12)
            m87499a(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget.CoordinatorLayout.mo80259a(int):void");
    }

    /* renamed from: a */
    public final void mo80260a(View view) {
        List b = this.f100652j.mo80337b(view);
        if (b != null && !b.isEmpty()) {
            for (int i = 0; i < b.size(); i++) {
                View view2 = (View) b.get(i);
                Behavior behavior = ((C39367d) view2.getLayoutParams()).f100670a;
                if (behavior != null) {
                    behavior.onDependentViewChanged(this, view2, view);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo80263a(View view, int i, int i2) {
        Rect b = m87507b();
        m87501a(view, b);
        try {
            return b.contains(i, i2);
        } finally {
            m87499a(b);
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
                C39367d dVar = (C39367d) childAt.getLayoutParams();
                Behavior behavior = dVar.f100670a;
                if (behavior != null) {
                    boolean onStartNestedScroll = behavior.onStartNestedScroll(this, childAt, view, view2, i, i2);
                    boolean z2 = z | onStartNestedScroll;
                    dVar.mo80320a(i3, onStartNestedScroll);
                    StringBuilder sb = new StringBuilder("CoordinatorLayout---onStartNestedScroll...");
                    sb.append(onStartNestedScroll);
                    sb.append("/");
                    sb.append(i);
                    z = z2;
                } else {
                    int i5 = i;
                    dVar.mo80320a(i3, false);
                }
            } else {
                int i6 = i;
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
                Behavior behavior = ((C39367d) childAt.getLayoutParams()).f100670a;
                if (behavior != null) {
                    behavior.onNestedScroll(this, childAt, view, i, i2, i3, i4, i5);
                    z = true;
                }
            }
        }
        if (z) {
            mo80259a(1);
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
                Behavior behavior = ((C39367d) childAt.getLayoutParams()).f100670a;
                if (behavior != null) {
                    int[] iArr2 = this.f100655m;
                    this.f100655m[1] = 0;
                    iArr2[0] = 0;
                    behavior.onNestedPreScroll(this, childAt, view, i, i2, this.f100655m, i3);
                    if (i > 0) {
                        i4 = Math.max(i6, this.f100655m[0]);
                    } else {
                        i4 = Math.min(i6, this.f100655m[0]);
                    }
                    if (i2 > 0) {
                        i5 = Math.max(i7, this.f100655m[1]);
                    } else {
                        i5 = Math.min(i7, this.f100655m[1]);
                    }
                    i6 = i4;
                    i7 = i5;
                    z = true;
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
        if (z) {
            mo80259a(1);
        }
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return new C39367d(-2, -2);
    }

    public int getNestedScrollAxes() {
        return this.f100666x.f3334a;
    }

    /* renamed from: b */
    private static Rect m87507b() {
        Rect rect = (Rect) f100647h.acquire();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    /* access modifiers changed from: 0000 */
    public final List<View> getDependencySortedChildren() {
        m87509c();
        return Collections.unmodifiableList(this.f100651i);
    }

    /* renamed from: a */
    public final void mo80258a() {
        mo1332b(this.f100661s, 1);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((C39367d) getChildAt(i).getLayoutParams()).mo80320a(1, true);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f100664v;
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

    /* renamed from: d */
    private void m87513d() {
        if (VERSION.SDK_INT >= 21) {
            if (C1056u.m3073s(this)) {
                if (this.f100665w == null) {
                    this.f100665w = new C1051p() {
                        /* renamed from: a */
                        public final C1018ac mo1130a(View view, C1018ac acVar) {
                            boolean z;
                            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
                            if (!C0793j.m2264a(coordinatorLayout.f100648e, acVar)) {
                                coordinatorLayout.f100648e = acVar;
                                boolean z2 = true;
                                if (acVar == null || acVar.mo3186b() <= 0) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                coordinatorLayout.f100649f = z;
                                if (coordinatorLayout.f100649f || coordinatorLayout.getBackground() != null) {
                                    z2 = false;
                                }
                                coordinatorLayout.setWillNotDraw(z2);
                                if (!acVar.mo3189e()) {
                                    int childCount = coordinatorLayout.getChildCount();
                                    for (int i = 0; i < childCount; i++) {
                                        View childAt = coordinatorLayout.getChildAt(i);
                                        if (C1056u.m3073s(childAt)) {
                                            Behavior behavior = ((C39367d) childAt.getLayoutParams()).f100670a;
                                            if (behavior != null) {
                                                acVar = behavior.onApplyWindowInsets(coordinatorLayout, childAt, acVar);
                                                if (acVar.mo3189e()) {
                                                    break;
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                coordinatorLayout.requestLayout();
                            }
                            return acVar;
                        }
                    };
                }
                C1056u.m3032a((View) this, this.f100665w);
                setSystemUiVisibility(1280);
                return;
            }
            C1056u.m3032a((View) this, (C1051p) null);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m87504a(false);
        if (this.f100663u) {
            if (this.f100662t == null) {
                this.f100662t = new C39368e();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f100662t);
        }
        if (this.f100648e == null && C1056u.m3073s(this)) {
            C1056u.m3072r(this);
        }
        this.f100658p = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m87504a(false);
        if (this.f100663u && this.f100662t != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f100662t);
        }
        if (this.f100661s != null) {
            onStopNestedScroll(this.f100661s);
        }
        this.f100658p = false;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = ((C39367d) childAt.getLayoutParams()).f100670a;
            if (!(id == -1 || behavior == null)) {
                Parcelable onSaveInstanceState = behavior.onSaveInstanceState(this, childAt);
                if (onSaveInstanceState != null) {
                    sparseArray.append(id, onSaveInstanceState);
                }
            }
        }
        savedState.f100668a = sparseArray;
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
        f100643a = str;
        if (VERSION.SDK_INT >= 21) {
            f100646d = new C39369f();
        } else {
            f100646d = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007a, code lost:
        if (r5 != false) goto L_0x00d9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x016a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x011f  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m87509c() {
        /*
            r11 = this;
            java.util.List<android.view.View> r0 = r11.f100651i
            r0.clear()
            com.ss.android.ugc.aweme.poi.ui.detail.widget.b<android.view.View> r0 = r11.f100652j
            android.support.v4.f.n<T, java.util.ArrayList<T>> r1 = r0.f100715b
            int r1 = r1.size()
            r2 = 0
            r3 = 0
        L_0x000f:
            if (r3 >= r1) goto L_0x0026
            android.support.v4.f.n<T, java.util.ArrayList<T>> r4 = r0.f100715b
            java.lang.Object r4 = r4.mo2577c(r3)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 == 0) goto L_0x0023
            r4.clear()
            android.support.v4.f.l$a<java.util.ArrayList<T>> r5 = r0.f100714a
            r5.release(r4)
        L_0x0023:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x0026:
            android.support.v4.f.n<T, java.util.ArrayList<T>> r0 = r0.f100715b
            r0.clear()
            int r0 = r11.getChildCount()
            r1 = 0
        L_0x0030:
            if (r1 >= r0) goto L_0x0198
            android.view.View r3 = r11.getChildAt(r1)
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$d r4 = m87512d(r3)
            int r5 = r4.f100675f
            r6 = -1
            r7 = 0
            r8 = 1
            if (r5 != r6) goto L_0x0047
            r4.f100681l = r7
            r4.f100680k = r7
            goto L_0x00db
        L_0x0047:
            android.view.View r5 = r4.f100680k
            if (r5 == 0) goto L_0x007c
            android.view.View r5 = r4.f100680k
            int r5 = r5.getId()
            int r6 = r4.f100675f
            if (r5 == r6) goto L_0x0057
        L_0x0055:
            r5 = 0
            goto L_0x007a
        L_0x0057:
            android.view.View r5 = r4.f100680k
            android.view.View r6 = r4.f100680k
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
            r4.f100681l = r7
            r4.f100680k = r7
            goto L_0x0055
        L_0x0077:
            r4.f100681l = r5
            r5 = 1
        L_0x007a:
            if (r5 != 0) goto L_0x00d9
        L_0x007c:
            int r5 = r4.f100675f
            android.view.View r5 = r11.findViewById(r5)
            r4.f100680k = r5
            android.view.View r5 = r4.f100680k
            if (r5 == 0) goto L_0x00cf
            android.view.View r5 = r4.f100680k
            if (r5 != r11) goto L_0x009f
            boolean r5 = r11.isInEditMode()
            if (r5 == 0) goto L_0x0097
            r4.f100681l = r7
            r4.f100680k = r7
            goto L_0x00d9
        L_0x0097:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "View can not be anchored to the the parent CoordinatorLayout"
            r0.<init>(r1)
            throw r0
        L_0x009f:
            android.view.View r5 = r4.f100680k
            android.view.View r6 = r4.f100680k
            android.view.ViewParent r6 = r6.getParent()
        L_0x00a7:
            if (r6 == r11) goto L_0x00cc
            if (r6 == 0) goto L_0x00cc
            if (r6 != r3) goto L_0x00c0
            boolean r5 = r11.isInEditMode()
            if (r5 == 0) goto L_0x00b8
            r4.f100681l = r7
            r4.f100680k = r7
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
            r4.f100681l = r5
            goto L_0x00d9
        L_0x00cf:
            boolean r5 = r11.isInEditMode()
            if (r5 == 0) goto L_0x0172
            r4.f100681l = r7
            r4.f100680k = r7
        L_0x00d9:
            android.view.View r5 = r4.f100680k
        L_0x00db:
            com.ss.android.ugc.aweme.poi.ui.detail.widget.b<android.view.View> r5 = r11.f100652j
            r5.mo80336a(r3)
            r5 = 0
        L_0x00e1:
            if (r5 >= r0) goto L_0x016e
            if (r5 == r1) goto L_0x016a
            android.view.View r6 = r11.getChildAt(r5)
            android.view.View r7 = r4.f100681l
            if (r6 == r7) goto L_0x011c
            int r7 = android.support.p030v4.view.C1056u.m3055f(r11)
            android.view.ViewGroup$LayoutParams r9 = r6.getLayoutParams()
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$d r9 = (com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget.CoordinatorLayout.C39367d) r9
            int r9 = r9.f100676g
            int r9 = android.support.p030v4.view.C1039e.m2968a(r9, r7)
            if (r9 == 0) goto L_0x010a
            int r10 = r4.f100677h
            int r7 = android.support.p030v4.view.C1039e.m2968a(r10, r7)
            r7 = r7 & r9
            if (r7 != r9) goto L_0x010a
            r7 = 1
            goto L_0x010b
        L_0x010a:
            r7 = 0
        L_0x010b:
            if (r7 != 0) goto L_0x011c
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$Behavior r7 = r4.f100670a
            if (r7 == 0) goto L_0x011a
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$Behavior r7 = r4.f100670a
            boolean r7 = r7.layoutDependsOn(r11, r3, r6)
            if (r7 == 0) goto L_0x011a
            goto L_0x011c
        L_0x011a:
            r7 = 0
            goto L_0x011d
        L_0x011c:
            r7 = 1
        L_0x011d:
            if (r7 == 0) goto L_0x016a
            com.ss.android.ugc.aweme.poi.ui.detail.widget.b<android.view.View> r7 = r11.f100652j
            android.support.v4.f.n<T, java.util.ArrayList<T>> r7 = r7.f100715b
            boolean r7 = r7.containsKey(r6)
            if (r7 != 0) goto L_0x012e
            com.ss.android.ugc.aweme.poi.ui.detail.widget.b<android.view.View> r7 = r11.f100652j
            r7.mo80336a(r6)
        L_0x012e:
            com.ss.android.ugc.aweme.poi.ui.detail.widget.b<android.view.View> r7 = r11.f100652j
            android.support.v4.f.n<T, java.util.ArrayList<T>> r9 = r7.f100715b
            boolean r9 = r9.containsKey(r6)
            if (r9 == 0) goto L_0x0162
            android.support.v4.f.n<T, java.util.ArrayList<T>> r9 = r7.f100715b
            boolean r9 = r9.containsKey(r3)
            if (r9 == 0) goto L_0x0162
            android.support.v4.f.n<T, java.util.ArrayList<T>> r9 = r7.f100715b
            java.lang.Object r9 = r9.get(r6)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 != 0) goto L_0x015e
            android.support.v4.f.l$a<java.util.ArrayList<T>> r9 = r7.f100714a
            java.lang.Object r9 = r9.acquire()
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 != 0) goto L_0x0159
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x0159:
            android.support.v4.f.n<T, java.util.ArrayList<T>> r7 = r7.f100715b
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
            int r4 = r4.f100675f
            java.lang.String r2 = r2.getResourceName(r4)
            r1.append(r2)
            java.lang.String r2 = " to anchor view "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0198:
            java.util.List<android.view.View> r0 = r11.f100651i
            com.ss.android.ugc.aweme.poi.ui.detail.widget.b<android.view.View> r1 = r11.f100652j
            java.util.ArrayList r1 = r1.mo80335a()
            r0.addAll(r1)
            java.util.List<android.view.View> r0 = r11.f100651i
            java.util.Collections.reverse(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget.CoordinatorLayout.m87509c():void");
    }

    public void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f100650g = onHierarchyChangeListener;
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public void onStopNestedScroll(View view) {
        mo1332b(view, 0);
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m87513d();
    }

    /* renamed from: a */
    private static void m87499a(Rect rect) {
        rect.setEmpty();
        f100647h.release(rect);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        if (!(layoutParams instanceof C39367d) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C39367d(getContext(), attributeSet);
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
        if (super.verifyDrawable(drawable) || drawable == this.f100664v) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private int m87506b(int i) {
        if (this.f100659q != null && i >= 0 && i < this.f100659q.length) {
            return this.f100659q[i];
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        if (layoutParams instanceof C39367d) {
            return new C39367d((C39367d) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new C39367d((MarginLayoutParams) layoutParams);
        }
        return new C39367d(layoutParams);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m87504a(true);
        }
        boolean a = m87505a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m87504a(true);
        }
        return a;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f100657o) {
            m87504a(false);
            this.f100657o = true;
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
        if (this.f100664v != null && this.f100664v.isVisible() != z) {
            this.f100664v.setVisible(z, false);
        }
    }

    /* renamed from: b */
    public final List<View> mo80264b(View view) {
        List c = this.f100652j.mo80338c(view);
        this.f100654l.clear();
        if (c != null) {
            this.f100654l.addAll(c);
        }
        return this.f100654l;
    }

    /* renamed from: c */
    public final List<View> mo80265c(View view) {
        List b = this.f100652j.mo80337b(view);
        this.f100654l.clear();
        if (b != null) {
            this.f100654l.addAll(b);
        }
        return this.f100654l;
    }

    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.f100649f && this.f100664v != null) {
            if (this.f100648e != null) {
                i = this.f100648e.mo3186b();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.f100664v.setBounds(0, 0, getWidth(), i);
                this.f100664v.draw(canvas);
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
        SparseArray<Parcelable> sparseArray = savedState.f100668a;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = m87512d(childAt).f100670a;
            if (!(id == -1 || behavior == null)) {
                Parcelable parcelable2 = (Parcelable) sparseArray.get(id);
                if (parcelable2 != null) {
                    behavior.onRestoreInstanceState(this, childAt, parcelable2);
                }
            }
        }
    }

    /* renamed from: d */
    private static C39367d m87512d(View view) {
        C39367d dVar = (C39367d) view.getLayoutParams();
        if (!dVar.f100671b) {
            if (view instanceof C39364a) {
                dVar.mo80321a(((C39364a) view).mo80314a());
                dVar.f100671b = true;
            } else {
                C39365b bVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    bVar = (C39365b) cls.getAnnotation(C39365b.class);
                    if (bVar != null) {
                        break;
                    }
                }
                if (bVar != null) {
                    try {
                        dVar.mo80321a((Behavior) bVar.mo80315a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception unused) {
                    }
                }
                dVar.f100671b = true;
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
            android.view.View r3 = r0.f100660r
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0017
            boolean r3 = r0.m87505a(r1, r4)
            if (r3 == 0) goto L_0x0015
            goto L_0x0018
        L_0x0015:
            r6 = 0
            goto L_0x002a
        L_0x0017:
            r3 = 0
        L_0x0018:
            android.view.View r6 = r0.f100660r
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$d r6 = (com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget.CoordinatorLayout.C39367d) r6
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$Behavior r6 = r6.f100670a
            if (r6 == 0) goto L_0x0015
            android.view.View r7 = r0.f100660r
            boolean r6 = r6.onTouchEvent(r0, r7, r1)
        L_0x002a:
            android.view.View r7 = r0.f100660r
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
            r0.m87504a(r5)
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z;
        if (this.f100664v != drawable) {
            Drawable drawable2 = null;
            if (this.f100664v != null) {
                this.f100664v.setCallback(null);
            }
            if (drawable != null) {
                drawable2 = drawable.mutate();
            }
            this.f100664v = drawable2;
            if (this.f100664v != null) {
                if (this.f100664v.isStateful()) {
                    this.f100664v.setState(getDrawableState());
                }
                C0809a.m2333b(this.f100664v, C1056u.m3055f(this));
                Drawable drawable3 = this.f100664v;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable3.setVisible(z, false);
                this.f100664v.setCallback(this);
            }
            C1056u.m3052d(this);
        }
    }

    /* renamed from: a */
    private void m87504a(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Behavior behavior = ((C39367d) childAt.getLayoutParams()).f100670a;
            if (behavior != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    behavior.onInterceptTouchEvent(this, childAt, obtain);
                } else {
                    behavior.onTouchEvent(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C39367d) getChildAt(i2).getLayoutParams()).mo80318a();
        }
        this.f100660r = null;
        this.f100657o = false;
    }

    /* renamed from: a */
    private void m87501a(View view, Rect rect) {
        C47924gn.m103692a((ViewGroup) this, view, rect);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ih);
    }

    /* renamed from: c */
    private static void m87510c(View view, int i) {
        C39367d dVar = (C39367d) view.getLayoutParams();
        if (dVar.f100678i != i) {
            C1056u.m3060h(view, i - dVar.f100678i);
            dVar.f100678i = i;
        }
    }

    /* renamed from: d */
    private static void m87514d(View view, int i) {
        C39367d dVar = (C39367d) view.getLayoutParams();
        if (dVar.f100679j != i) {
            C1056u.m3058g(view, i - dVar.f100679j);
            dVar.f100679j = i;
        }
    }

    /* renamed from: b */
    public final void mo1332b(View view, int i) {
        this.f100666x.mo3235a(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C39367d dVar = (C39367d) childAt.getLayoutParams();
            Behavior behavior = dVar.f100670a;
            if (behavior != null) {
                behavior.onStopNestedScroll(this, childAt, view, i);
            }
            dVar.mo80319a(i);
            dVar.mo80322b();
        }
        this.f100661s = null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0178, code lost:
        if (r0.onMeasureChild(r30, r20, r8, r21, r23, 0) == false) goto L_0x0187;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x017b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.m87509c()
            int r0 = r30.getChildCount()
            r8 = 0
            r1 = 0
        L_0x000b:
            r2 = 1
            if (r1 >= r0) goto L_0x003a
            android.view.View r3 = r7.getChildAt(r1)
            com.ss.android.ugc.aweme.poi.ui.detail.widget.b<android.view.View> r4 = r7.f100652j
            android.support.v4.f.n<T, java.util.ArrayList<T>> r5 = r4.f100715b
            int r5 = r5.size()
            r6 = 0
        L_0x001b:
            if (r6 >= r5) goto L_0x0032
            android.support.v4.f.n<T, java.util.ArrayList<T>> r9 = r4.f100715b
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
            boolean r1 = r7.f100663u
            if (r0 == r1) goto L_0x006f
            if (r0 == 0) goto L_0x005c
            boolean r0 = r7.f100658p
            if (r0 == 0) goto L_0x0059
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$e r0 = r7.f100662t
            if (r0 != 0) goto L_0x0050
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$e r0 = new com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$e
            r0.<init>()
            r7.f100662t = r0
        L_0x0050:
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$e r1 = r7.f100662t
            r0.addOnPreDrawListener(r1)
        L_0x0059:
            r7.f100663u = r2
            goto L_0x006f
        L_0x005c:
            boolean r0 = r7.f100658p
            if (r0 == 0) goto L_0x006d
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$e r0 = r7.f100662t
            if (r0 == 0) goto L_0x006d
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$e r1 = r7.f100662t
            r0.removeOnPreDrawListener(r1)
        L_0x006d:
            r7.f100663u = r8
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
            android.support.v4.view.ac r3 = r7.f100648e
            if (r3 == 0) goto L_0x00b1
            boolean r3 = android.support.p030v4.view.C1056u.m3073s(r30)
            if (r3 == 0) goto L_0x00b1
            r19 = 1
            goto L_0x00b3
        L_0x00b1:
            r19 = 0
        L_0x00b3:
            java.util.List<android.view.View> r2 = r7.f100651i
            int r6 = r2.size()
            r4 = r0
            r2 = r1
            r3 = 0
            r5 = 0
        L_0x00bd:
            if (r5 >= r6) goto L_0x01d6
            java.util.List<android.view.View> r0 = r7.f100651i
            java.lang.Object r0 = r0.get(r5)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 == r1) goto L_0x01c7
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$d r1 = (com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget.CoordinatorLayout.C39367d) r1
            int r0 = r1.f100674e
            if (r0 < 0) goto L_0x011c
            if (r13 == 0) goto L_0x011c
            int r0 = r1.f100674e
            int r0 = r7.m87506b(r0)
            int r8 = r1.f100672c
            int r8 = m87511d(r8)
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
            android.support.v4.view.ac r0 = r7.f100648e
            int r0 = r0.mo3184a()
            android.support.v4.view.ac r2 = r7.f100648e
            int r2 = r2.mo3187c()
            int r0 = r0 + r2
            android.support.v4.view.ac r2 = r7.f100648e
            int r2 = r2.mo3186b()
            android.support.v4.view.ac r8 = r7.f100648e
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
            com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout$Behavior r0 = r1.f100670a
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
            boolean r0 = r0.onMeasureChild(r1, r2, r3, r4, r5, r6)
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
            r0.mo80262a(r1, r2, r3, r4, r5)
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    /* renamed from: a */
    private boolean m87505a(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        int i2;
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f100653k;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            if (isChildrenDrawingOrderEnabled) {
                i2 = getChildDrawingOrder(childCount, i3);
            } else {
                i2 = i3;
            }
            list.add(getChildAt(i2));
        }
        if (f100646d != null) {
            Collections.sort(list, f100646d);
        }
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z3 = false;
        boolean z4 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) list.get(i4);
            C39367d dVar = (C39367d) view.getLayoutParams();
            Behavior behavior = dVar.f100670a;
            if ((z3 || z4) && actionMasked != 0) {
                if (behavior != null) {
                    if (motionEvent3 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    switch (i) {
                        case 0:
                            behavior.onInterceptTouchEvent(this, view, motionEvent3);
                            break;
                        case 1:
                            behavior.onTouchEvent(this, view, motionEvent3);
                            break;
                    }
                }
            } else {
                if (!z3 && behavior != null) {
                    switch (i) {
                        case 0:
                            z3 = behavior.onInterceptTouchEvent(this, view, motionEvent2);
                            break;
                        case 1:
                            z3 = behavior.onTouchEvent(this, view, motionEvent2);
                            break;
                    }
                    if (z3) {
                        this.f100660r = view;
                    }
                }
                if (dVar.f100670a == null) {
                    dVar.f100682m = false;
                }
                boolean z5 = dVar.f100682m;
                boolean z6 = true;
                if (dVar.f100682m) {
                    z = true;
                } else {
                    boolean z7 = dVar.f100682m;
                    if (dVar.f100670a != null) {
                        z2 = dVar.f100670a.blocksInteractionBelow(this, view);
                    } else {
                        z2 = false;
                    }
                    z = z2 | z7;
                    dVar.f100682m = z;
                }
                if (!z || z5) {
                    z6 = false;
                }
                if (!z || z6) {
                    z4 = z6;
                } else {
                    list.clear();
                    return z3;
                }
            }
        }
        list.clear();
        return z3;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo1333b(view, view2, i, 0);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1330a(view, view2, i, 0);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior behavior = ((C39367d) view.getLayoutParams()).f100670a;
        if (behavior == null || !behavior.onRequestChildRectangleOnScreen(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    /* renamed from: a */
    private void m87502a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m87501a(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                Behavior behavior = ((C39367d) childAt.getLayoutParams()).f100670a;
                if (behavior != null) {
                    z |= behavior.onNestedPreFling(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArray;
        super(context, attributeSet, i);
        this.f100651i = new ArrayList();
        this.f100652j = new C39371b<>();
        this.f100653k = new ArrayList();
        this.f100654l = new ArrayList();
        this.f100655m = new int[2];
        this.f100666x = new C1050o(this);
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.q0, R.attr.a3i}, 0, R.style.s6);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.q0, R.attr.a3i}, i, 0);
        }
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f100659q = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f100659q.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f100659q;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
            }
        }
        this.f100664v = typedArray.getDrawable(1);
        typedArray.recycle();
        m87513d();
        super.setOnHierarchyChangeListener(new C39366c());
    }

    /* renamed from: a */
    static Behavior m87498a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(ClassUtils.PACKAGE_SEPARATOR)) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            str = sb.toString();
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f100643a)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f100643a);
            sb2.append('.');
            sb2.append(str);
            str = sb2.toString();
        }
        try {
            Map map = (Map) f100645c.get();
            if (map == null) {
                map = new HashMap();
                f100645c.set(map);
            }
            Constructor constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = context.getClassLoader().loadClass(str).getConstructor(f100644b);
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

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        C39367d dVar = (C39367d) view.getLayoutParams();
        if (dVar.f100670a != null) {
            float scrimOpacity = dVar.f100670a.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.f100656n == null) {
                    this.f100656n = new Paint();
                }
                this.f100656n.setColor(dVar.f100670a.getScrimColor(this, view));
                this.f100656n.setAlpha(C0703a.m2034a(Math.round(scrimOpacity * 255.0f), 0, NormalGiftView.ALPHA_255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f100656n);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1328a(view, i, i2, iArr, 0);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                Behavior behavior = ((C39367d) childAt.getLayoutParams()).f100670a;
                if (behavior != null) {
                    z2 |= behavior.onNestedFling(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            mo80259a(1);
        }
        return z2;
    }

    /* renamed from: b */
    public final void mo1333b(View view, View view2, int i, int i2) {
        this.f100666x.mo3237a(view, view2, i, i2);
        this.f100661s = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            Behavior behavior = ((C39367d) childAt.getLayoutParams()).f100670a;
            if (behavior != null) {
                behavior.onNestedScrollAccepted(this, childAt, view, view2, i, i2);
            }
        }
    }

    /* renamed from: a */
    private void m87503a(C39367d dVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + dVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - dVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + dVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - dVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: a */
    public final void mo80262a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo1327a(view, i, i2, i3, i4, 0);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int f = C1056u.m3055f(this);
        int size = this.f100651i.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.f100651i.get(i5);
            if (view.getVisibility() != 8) {
                Behavior behavior = ((C39367d) view.getLayoutParams()).f100670a;
                if (behavior == null || !behavior.onLayoutChild(this, view, f)) {
                    mo80261a(view, f);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m87500a(View view, int i, Rect rect, Rect rect2, C39367d dVar, int i2, int i3) {
        int i4;
        int i5;
        int a = C1039e.m2968a(m87515e(dVar.f100672c), i);
        int a2 = C1039e.m2968a(m87508c(dVar.f100673d), i);
        int i6 = a & 7;
        int i7 = a & 112;
        int i8 = a2 & 7;
        int i9 = a2 & 112;
        if (i8 == 1) {
            i4 = rect.left + (rect.width() / 2);
        } else if (i8 != 5) {
            i4 = rect.left;
        } else {
            i4 = rect.right;
        }
        if (i9 == 16) {
            i5 = rect.top + (rect.height() / 2);
        } else if (i9 != 80) {
            i5 = rect.top;
        } else {
            i5 = rect.bottom;
        }
        if (i6 == 1) {
            i4 -= i2 / 2;
        } else if (i6 != 5) {
            i4 -= i2;
        }
        if (i7 == 16) {
            i5 -= i3 / 2;
        } else if (i7 != 80) {
            i5 -= i3;
        }
        rect2.set(i4, i5, i2 + i4, i3 + i5);
    }
}
