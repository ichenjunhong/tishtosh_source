package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p030v4.view.C1048m;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.view.C1061w;
import android.support.p043v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnTouchModeChangeListener;
import android.widget.AbsListView;
import android.widget.OverScroller;
import com.bytedance.android.livesdk.p279af.C4577ap;
import com.ss.android.ugc.trill.R;

public final class TTLiveResolverDrawerLayout extends ViewGroup implements C1048m {

    /* renamed from: A */
    private final OnTouchModeChangeListener f23202A;

    /* renamed from: a */
    public boolean f23203a;

    /* renamed from: b */
    private int f23204b;

    /* renamed from: c */
    private int f23205c;

    /* renamed from: d */
    private int f23206d;

    /* renamed from: e */
    private float f23207e;

    /* renamed from: f */
    private int f23208f;

    /* renamed from: g */
    private int f23209g;

    /* renamed from: h */
    private int f23210h;

    /* renamed from: i */
    private int f23211i;

    /* renamed from: j */
    private int f23212j;

    /* renamed from: k */
    private boolean f23213k;

    /* renamed from: l */
    private boolean f23214l;

    /* renamed from: m */
    private boolean f23215m;

    /* renamed from: n */
    private boolean f23216n;

    /* renamed from: o */
    private final int f23217o;

    /* renamed from: p */
    private final float f23218p;

    /* renamed from: q */
    private final OverScroller f23219q;

    /* renamed from: r */
    private VelocityTracker f23220r;

    /* renamed from: s */
    private Drawable f23221s;

    /* renamed from: t */
    private C8484a f23222t;

    /* renamed from: u */
    private C8485b f23223u;

    /* renamed from: v */
    private float f23224v;

    /* renamed from: w */
    private float f23225w;

    /* renamed from: x */
    private float f23226x;

    /* renamed from: y */
    private int f23227y;

    /* renamed from: z */
    private final Rect f23228z;

    /* renamed from: com.bytedance.android.livesdk.widget.TTLiveResolverDrawerLayout$1 */
    class C84821 implements OnTouchModeChangeListener {

        /* renamed from: a */
        final /* synthetic */ TTLiveResolverDrawerLayout f23229a;

        public final void onTouchModeChanged(boolean z) {
            if (!z && this.f23229a.hasFocus() && this.f23229a.mo14868a(this.f23229a.getFocusedChild())) {
                this.f23229a.mo14867a(0, 0.0f);
            }
        }
    }

    public static class LayoutParams extends MarginLayoutParams {

        /* renamed from: a */
        public boolean f23230a;

        /* renamed from: b */
        public boolean f23231b;

        /* renamed from: c */
        public boolean f23232c;

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f23230a = layoutParams.f23230a;
            this.f23231b = layoutParams.f23231b;
            this.f23232c = layoutParams.f23232c;
        }

        public LayoutParams(int i, int i2) {
            super(-1, -2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a7s, R.attr.a7t, R.attr.a7u});
            this.f23230a = obtainStyledAttributes.getBoolean(0, false);
            this.f23231b = obtainStyledAttributes.getBoolean(2, false);
            this.f23232c = obtainStyledAttributes.getBoolean(1, false);
            obtainStyledAttributes.recycle();
        }
    }

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };

        /* renamed from: a */
        boolean f23233a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            boolean z;
            super(parcel);
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f23233a = z;
        }

        /* synthetic */ SavedState(Parcel parcel, C84821 r2) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f23233a ? 1 : 0);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.TTLiveResolverDrawerLayout$a */
    public interface C8484a {
    }

    /* renamed from: com.bytedance.android.livesdk.widget.TTLiveResolverDrawerLayout$b */
    class C8485b implements Runnable {
        public final void run() {
            TTLiveResolverDrawerLayout.this.mo14866a();
        }

        private C8485b() {
        }

        /* synthetic */ C8485b(TTLiveResolverDrawerLayout tTLiveResolverDrawerLayout, C84821 r2) {
            this();
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14867a(int i, float f) {
        int i2;
        m16741e();
        int i3 = (int) this.f23207e;
        int i4 = i - i3;
        int height = getHeight();
        int i5 = height / 2;
        float f2 = (float) height;
        float f3 = (float) i5;
        float a = f3 + (m16729a(Math.min(1.0f, (((float) Math.abs(i4)) * 1.0f) / f2)) * f3);
        float abs = Math.abs(f);
        if (abs > 0.0f) {
            i2 = Math.round(Math.abs(a / abs) * 1000.0f) * 4;
        } else {
            i2 = (int) (((((float) Math.abs(i4)) / f2) + 1.0f) * 100.0f);
        }
        this.f23219q.startScroll(0, i3, 0, i4, Math.min(i2, 300));
        C1056u.m3052d(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo14868a(View view) {
        if (view == null) {
            return false;
        }
        this.f23228z.set(0, 0, view.getWidth(), view.getHeight());
        offsetDescendantRectToMyCoords(view, this.f23228z);
        if (view.getParent() != this) {
            ViewParent parent = view.getParent();
            while (parent != this) {
                view = (View) parent;
                parent = view.getParent();
            }
        }
        int height = getHeight() - getPaddingBottom();
        int childCount = getChildCount();
        for (int indexOfChild = indexOfChild(view) + 1; indexOfChild < childCount; indexOfChild++) {
            View childAt = getChildAt(indexOfChild);
            if (childAt.getVisibility() != 8) {
                height = Math.min(height, childAt.getTop());
            }
        }
        if (this.f23228z.bottom > height) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    /* renamed from: b */
    private boolean m16738b() {
        if (this.f23213k || C1061w.m3091a(this) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m16739c() {
        if (this.f23220r == null) {
            this.f23220r = VelocityTracker.obtain();
        }
    }

    /* renamed from: e */
    private void m16741e() {
        this.f23219q.abortAnimation();
        this.f23223u = null;
        this.f23216n = false;
    }

    private int getMaxCollapsedHeight() {
        int i;
        if (this.f23203a) {
            i = this.f23206d;
        } else {
            i = this.f23205c;
        }
        return i + this.f23210h;
    }

    public final int getNestedScrollAxes() {
        if (!C4577ap.m10992a()) {
            return this.f23212j;
        }
        return super.getNestedScrollAxes();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnTouchModeChangeListener(this.f23202A);
    }

    /* renamed from: d */
    private void m16740d() {
        this.f23227y = -1;
        this.f23213k = false;
        this.f23214l = false;
        this.f23226x = 0.0f;
        this.f23225w = 0.0f;
        this.f23224v = 0.0f;
        if (this.f23220r != null) {
            this.f23220r.clear();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f23202A);
        m16741e();
        if (this.f23220r != null) {
            this.f23220r.recycle();
            this.f23220r = null;
        }
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f23208f <= 0 || this.f23207e != 0.0f) {
            z = false;
        } else {
            z = true;
        }
        savedState.f23233a = z;
        return savedState;
    }

    public final void computeScroll() {
        boolean z;
        super.computeScroll();
        if (this.f23219q.computeScrollOffset()) {
            z = !this.f23219q.isFinished();
            m16730a((int) (((float) this.f23219q.getCurrY()) - this.f23207e));
            if (z) {
                C1056u.m3052d(this);
            }
        } else {
            z = !this.f23219q.isFinished();
        }
        if (!z && this.f23216n && this.f23222t != null) {
            this.f23223u = new C8485b(this, null);
            post(this.f23223u);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14866a() {
        if (this.f23223u != null) {
            removeCallbacks(this.f23223u);
            this.f23223u = null;
        }
    }

    public final void setOnDismissedListener(C8484a aVar) {
        this.f23222t = aVar;
    }

    public final void setSmallCollapsed(boolean z) {
        this.f23203a = z;
        requestLayout();
    }

    /* renamed from: a */
    private void m16734a(boolean z) {
        if (this.f23221s != null) {
            setWillNotDraw(!z);
        }
    }

    public final android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public final void onDrawForeground(Canvas canvas) {
        if (this.f23221s != null) {
            this.f23221s.draw(canvas);
        }
        super.onDrawForeground(canvas);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f23215m = savedState.f23233a;
    }

    /* renamed from: a */
    private static float m16729a(float f) {
        double d = (double) (f - 0.5f);
        Double.isNaN(d);
        return (float) Math.sin((double) ((float) (d * 0.4712389167638204d)));
    }

    /* access modifiers changed from: protected */
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public final void setCollapsed(boolean z) {
        int i;
        if (!C1056u.m3079y(this)) {
            this.f23215m = z;
            return;
        }
        if (z) {
            i = this.f23208f;
        } else {
            i = 0;
        }
        mo14867a(i, 0.0f);
    }

    /* renamed from: b */
    private static int m16737b(View view) {
        int measuredHeight = view.getMeasuredHeight();
        if (view instanceof AbsListView) {
            AbsListView absListView = (AbsListView) view;
            int paddingBottom = absListView.getPaddingBottom();
            int childCount = absListView.getChildCount();
            int i = 0;
            for (int i2 = 0; i2 < childCount; i2++) {
                int bottom = absListView.getChildAt(i2).getBottom() + paddingBottom;
                if (bottom > i) {
                    i = bottom;
                }
            }
            if (i < measuredHeight) {
                measuredHeight = i;
            }
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return layoutParams.topMargin + measuredHeight + layoutParams.bottomMargin;
    }

    public final void onStopNestedScroll(View view) {
        if (C4577ap.m10992a()) {
            super.onStopNestedScroll(view);
        }
        int i = 0;
        this.f23212j = 0;
        if (this.f23219q.isFinished()) {
            if (this.f23207e >= ((float) (this.f23208f / 2))) {
                i = this.f23208f;
            }
            mo14867a(i, 0.0f);
        }
    }

    public final void setCollapsibleHeightReserved(int i) {
        int i2 = this.f23210h;
        this.f23210h = i;
        int i3 = this.f23210h - i2;
        if (i3 != 0 && this.f23213k) {
            this.f23226x -= (float) i3;
        }
        int i4 = this.f23208f;
        this.f23208f = Math.max(this.f23208f, getMaxCollapsedHeight());
        if (!m16735a(i4, !m16738b())) {
            invalidate();
        }
    }

    /* renamed from: a */
    private float m16730a(int i) {
        boolean z;
        float max = Math.max(0.0f, Math.min(this.f23207e + ((float) i), (float) (this.f23208f + this.f23209g)));
        if (max == this.f23207e) {
            return 0.0f;
        }
        int i2 = (int) (max - this.f23207e);
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!((LayoutParams) childAt.getLayoutParams()).f23231b) {
                childAt.offsetTopAndBottom(i2);
            }
        }
        if (this.f23207e != 0.0f) {
            z = true;
        } else {
            z = false;
        }
        this.f23207e = max;
        this.f23211i += i2;
        if (max != 0.0f) {
            z2 = true;
        }
        if (z != z2) {
            m16734a(z2);
        }
        C1056u.m3052d(this);
        return (float) i2;
    }

    /* renamed from: a */
    private void m16733a(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f23227y) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f23224v = motionEvent.getX(i);
            float y = motionEvent.getY(i);
            this.f23226x = y;
            this.f23225w = y;
            this.f23227y = motionEvent.getPointerId(i);
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        m16739c();
        if (actionMasked == 0) {
            this.f23220r.clear();
        }
        this.f23220r.addMovement(motionEvent);
        if (actionMasked != 6) {
            switch (actionMasked) {
                case 0:
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    this.f23224v = x;
                    this.f23226x = y;
                    this.f23225w = y;
                    View a = m16731a(x, y);
                    while (true) {
                        if (a != null) {
                            x -= a.getX();
                            y -= a.getY();
                            if (a instanceof AbsListView) {
                                a = m16732a((ViewGroup) a, x, y);
                            } else if (a instanceof ViewGroup) {
                                a = m16732a((ViewGroup) a, x, y);
                            } else {
                                a = null;
                            }
                        }
                    }
                    if (a == null || !mo14868a(a)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z || this.f23208f <= 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    this.f23214l = z2;
                    this.f23212j = 0;
                    break;
                case 1:
                case 3:
                    m16740d();
                    break;
                case 2:
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    float f = y2 - this.f23225w;
                    if (Math.abs(f) > ((float) this.f23217o) && m16731a(x2, y2) != null && (C1061w.m3091a(this) & 2) == 0) {
                        this.f23227y = motionEvent.getPointerId(0);
                        this.f23213k = true;
                        this.f23226x = Math.max(this.f23226x - ((float) this.f23217o), Math.min(this.f23226x + f, this.f23226x + ((float) this.f23217o)));
                        break;
                    }
            }
        } else {
            m16733a(motionEvent);
        }
        if (this.f23213k) {
            m16741e();
        }
        if (this.f23213k || this.f23214l) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9, types: [int] */
    /* JADX WARNING: type inference failed for: r3v10, types: [int] */
    /* JADX WARNING: type inference failed for: r0v61 */
    /* JADX WARNING: type inference failed for: r0v62 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], ?[boolean, int, float, short, byte, char], int]
      uses: [boolean, int]
      mth insns count: 179
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            r6.m16739c()
            android.view.VelocityTracker r1 = r6.f23220r
            r1.addMovement(r7)
            r1 = 0
            r2 = 1
            r3 = 0
            switch(r0) {
                case 0: goto L_0x0162;
                case 1: goto L_0x00b6;
                case 2: goto L_0x004c;
                case 3: goto L_0x0033;
                case 4: goto L_0x0012;
                case 5: goto L_0x0019;
                case 6: goto L_0x0014;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x019b
        L_0x0014:
            r6.m16733a(r7)
            goto L_0x019b
        L_0x0019:
            int r0 = r7.getActionIndex()
            int r1 = r7.getPointerId(r0)
            r6.f23227y = r1
            float r1 = r7.getX(r0)
            r6.f23224v = r1
            float r7 = r7.getY(r0)
            r6.f23226x = r7
            r6.f23225w = r7
            goto L_0x019b
        L_0x0033:
            boolean r7 = r6.f23213k
            if (r7 == 0) goto L_0x0048
            float r7 = r6.f23207e
            int r0 = r6.f23208f
            int r0 = r0 / 2
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            int r3 = r6.f23208f
        L_0x0045:
            r6.mo14867a(r3, r1)
        L_0x0048:
            r6.m16740d()
            return r2
        L_0x004c:
            int r0 = r6.f23227y
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x0069
            int r0 = r7.getPointerId(r3)
            r6.f23227y = r0
            float r0 = r7.getX()
            r6.f23224v = r0
            float r0 = r7.getY()
            r6.f23226x = r0
            r6.f23225w = r0
            r0 = 0
        L_0x0069:
            float r1 = r7.getX(r0)
            float r7 = r7.getY(r0)
            boolean r0 = r6.f23213k
            if (r0 != 0) goto L_0x00a6
            float r0 = r6.f23225w
            float r0 = r7 - r0
            float r4 = java.lang.Math.abs(r0)
            int r5 = r6.f23217o
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00a6
            android.view.View r1 = r6.m16731a(r1, r7)
            if (r1 == 0) goto L_0x00a6
            r6.f23213k = r2
            float r1 = r6.f23226x
            int r3 = r6.f23217o
            float r3 = (float) r3
            float r1 = r1 - r3
            float r3 = r6.f23226x
            float r3 = r3 + r0
            float r0 = r6.f23226x
            int r4 = r6.f23217o
            float r4 = (float) r4
            float r0 = r0 + r4
            float r0 = java.lang.Math.min(r3, r0)
            float r0 = java.lang.Math.max(r1, r0)
            r6.f23226x = r0
            r3 = 1
        L_0x00a6:
            boolean r0 = r6.f23213k
            if (r0 == 0) goto L_0x00b2
            float r0 = r6.f23226x
            float r0 = r7 - r0
            int r0 = (int) r0
            r6.m16730a(r0)
        L_0x00b2:
            r6.f23226x = r7
            goto L_0x019b
        L_0x00b6:
            boolean r0 = r6.f23213k
            r6.f23213k = r3
            if (r0 != 0) goto L_0x00df
            float r0 = r6.f23224v
            float r4 = r6.f23225w
            android.view.View r0 = r6.m16731a(r0, r4)
            if (r0 != 0) goto L_0x00df
            float r0 = r7.getX()
            float r4 = r7.getY()
            android.view.View r0 = r6.m16731a(r0, r4)
            if (r0 != 0) goto L_0x00df
            com.bytedance.android.livesdk.widget.TTLiveResolverDrawerLayout$a r0 = r6.f23222t
            if (r0 == 0) goto L_0x00df
            r6.mo14866a()
            r6.m16740d()
            return r2
        L_0x00df:
            boolean r0 = r6.f23214l
            if (r0 == 0) goto L_0x010b
            float r0 = r7.getX()
            float r4 = r6.f23224v
            float r0 = r0 - r4
            float r0 = java.lang.Math.abs(r0)
            int r4 = r6.f23217o
            float r4 = (float) r4
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x010b
            float r7 = r7.getY()
            float r0 = r6.f23225w
            float r7 = r7 - r0
            float r7 = java.lang.Math.abs(r7)
            int r0 = r6.f23217o
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x010b
            r6.mo14867a(r3, r1)
            return r2
        L_0x010b:
            android.view.VelocityTracker r7 = r6.f23220r
            r0 = 1000(0x3e8, float:1.401E-42)
            r7.computeCurrentVelocity(r0)
            android.view.VelocityTracker r7 = r6.f23220r
            int r0 = r6.f23227y
            float r7 = r7.getYVelocity(r0)
            float r0 = java.lang.Math.abs(r7)
            float r4 = r6.f23218p
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x014c
            com.bytedance.android.livesdk.widget.TTLiveResolverDrawerLayout$a r0 = r6.f23222t
            if (r0 == 0) goto L_0x0140
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0140
            float r0 = r6.f23207e
            int r4 = r6.f23208f
            float r4 = (float) r4
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0140
            int r0 = r6.f23208f
            int r1 = r6.f23209g
            int r0 = r0 + r1
            r6.mo14867a(r0, r7)
            r6.f23216n = r2
            goto L_0x015e
        L_0x0140:
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0146
            r0 = 0
            goto L_0x0148
        L_0x0146:
            int r0 = r6.f23208f
        L_0x0148:
            r6.mo14867a(r0, r7)
            goto L_0x015e
        L_0x014c:
            float r7 = r6.f23207e
            int r0 = r6.f23208f
            int r0 = r0 / 2
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x0159
            r7 = 0
            goto L_0x015b
        L_0x0159:
            int r7 = r6.f23208f
        L_0x015b:
            r6.mo14867a(r7, r1)
        L_0x015e:
            r6.m16740d()
            goto L_0x019b
        L_0x0162:
            float r0 = r7.getX()
            float r1 = r7.getY()
            r6.f23224v = r0
            r6.f23226x = r1
            r6.f23225w = r1
            int r7 = r7.getPointerId(r3)
            r6.f23227y = r7
            float r7 = r6.f23224v
            float r0 = r6.f23225w
            android.view.View r7 = r6.m16731a(r7, r0)
            if (r7 == 0) goto L_0x0182
            r7 = 1
            goto L_0x0183
        L_0x0182:
            r7 = 0
        L_0x0183:
            com.bytedance.android.livesdk.widget.TTLiveResolverDrawerLayout$a r0 = r6.f23222t
            if (r0 != 0) goto L_0x018e
            int r0 = r6.f23208f
            if (r0 <= 0) goto L_0x018c
            goto L_0x018e
        L_0x018c:
            r0 = 0
            goto L_0x018f
        L_0x018e:
            r0 = 1
        L_0x018f:
            if (r7 == 0) goto L_0x0194
            if (r0 == 0) goto L_0x0194
            goto L_0x0195
        L_0x0194:
            r2 = 0
        L_0x0195:
            r6.f23213k = r2
            r6.m16741e()
            r3 = r0
        L_0x019b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.TTLiveResolverDrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    private View m16731a(float f, float f2) {
        return m16732a((ViewGroup) this, f, f2);
    }

    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && mo14868a(view2)) {
            mo14867a(0, 0.0f);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (this.f23204b >= 0) {
            i3 = Math.min(size, this.f23204b);
        } else {
            i3 = size;
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(size2, 1073741824);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childCount = getChildCount();
        int i5 = paddingTop;
        int i6 = 0;
        while (true) {
            i4 = 8;
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            if (((LayoutParams) childAt.getLayoutParams()).f23230a && childAt.getVisibility() != 8) {
                measureChildWithMargins(childAt, makeMeasureSpec, paddingLeft, makeMeasureSpec2, i5);
                i5 += m16737b(childAt);
            }
            i6++;
        }
        int i7 = i5;
        int i8 = 0;
        while (i8 < childCount) {
            View childAt2 = getChildAt(i8);
            if (!((LayoutParams) childAt2.getLayoutParams()).f23230a && childAt2.getVisibility() != i4) {
                measureChildWithMargins(childAt2, makeMeasureSpec, paddingLeft, makeMeasureSpec2, i7);
                i7 += m16737b(childAt2);
            }
            i8++;
            i4 = 8;
        }
        int i9 = this.f23208f;
        this.f23208f = Math.max(0, (i7 - i5) - getMaxCollapsedHeight());
        this.f23209g = i7 - this.f23208f;
        m16735a(i9, !m16738b());
        this.f23211i = Math.max(0, size2 - i7) + ((int) this.f23207e);
        setMeasuredDimension(size, size2);
    }

    /* renamed from: a */
    private boolean m16735a(int i, boolean z) {
        boolean z2;
        boolean z3 = false;
        if (i == this.f23208f) {
            return false;
        }
        float f = 0.0f;
        if (C1056u.m3079y(this)) {
            if (this.f23207e != 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z || i >= this.f23208f || this.f23207e != ((float) i)) {
                this.f23207e = Math.min(this.f23207e, (float) this.f23208f);
            } else {
                this.f23207e = (float) this.f23208f;
            }
            if (this.f23207e != 0.0f) {
                z3 = true;
            }
            if (z2 != z3) {
                m16734a(z3);
            }
        } else {
            if (!this.f23215m) {
                f = (float) this.f23208f;
            }
            this.f23207e = f;
        }
        return true;
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        if (C4577ap.m10992a()) {
            super.onNestedScrollAccepted(view, view2, i);
        }
        this.f23212j = i;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (f2 <= this.f23218p || this.f23207e == 0.0f) {
            return false;
        }
        mo14867a(0, f2);
        return true;
    }

    /* renamed from: a */
    private static View m16732a(ViewGroup viewGroup, float f, float f2) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (m16736a(childAt, f, f2)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m16736a(View view, float f, float f2) {
        float x = view.getX();
        float y = view.getY();
        float width = ((float) view.getWidth()) + x;
        float height = ((float) view.getHeight()) + y;
        if (f < x || f2 < y || f >= width || f2 >= height) {
            return false;
        }
        return true;
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            iArr[1] = (int) (-m16730a(-i2));
        }
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int i;
        if ((view instanceof RecyclerView) && z && f2 != 0.0f) {
            if (f2 < 0.0f) {
                i = -1;
            } else {
                i = 1;
            }
            z = C1056u.m3039a(view, i);
        }
        int i2 = 0;
        if (z || Math.abs(f2) <= this.f23218p) {
            return false;
        }
        if (this.f23222t == null || f2 >= 0.0f || this.f23207e <= ((float) this.f23208f)) {
            if (f2 <= 0.0f) {
                i2 = this.f23208f;
            }
            mo14867a(i2, f2);
        } else {
            mo14867a(this.f23208f + this.f23209g, f2);
            this.f23216n = true;
        }
        return true;
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        if (i4 < 0) {
            m16730a(-i4);
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int i5 = this.f23211i;
        int paddingLeft = getPaddingLeft();
        int paddingRight = width - getPaddingRight();
        int childCount = getChildCount();
        boolean z2 = false;
        int i6 = i5;
        View view = null;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.f23232c) {
                view = childAt;
            }
            if (childAt.getVisibility() != 8) {
                int i8 = i6 + layoutParams.topMargin;
                if (layoutParams.f23231b) {
                    i8 = (int) (((float) i8) - this.f23207e);
                }
                int measuredHeight = childAt.getMeasuredHeight() + i8;
                int measuredWidth = childAt.getMeasuredWidth();
                int i9 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft;
                childAt.layout(i9, i8, measuredWidth + i9, measuredHeight);
                i6 = measuredHeight + layoutParams.bottomMargin;
            }
        }
        if (this.f23221s != null) {
            if (view != null) {
                int left = view.getLeft();
                int right = view.getRight();
                int top = view.getTop();
                this.f23221s.setBounds(left, top - this.f23221s.getIntrinsicHeight(), right, top);
                if (this.f23207e > 0.0f) {
                    z2 = true;
                }
                setWillNotDraw(true ^ z2);
                return;
            }
            this.f23221s = null;
            setWillNotDraw(true);
        }
    }
}
