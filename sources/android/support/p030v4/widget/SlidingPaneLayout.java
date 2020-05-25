package android.support.p030v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.p030v4.content.C0726c;
import android.support.p030v4.view.AbsSavedState;
import android.support.p030v4.view.C1056u;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: android.support.v4.widget.SlidingPaneLayout */
public final class SlidingPaneLayout extends ViewGroup {

    /* renamed from: a */
    public boolean f3412a;

    /* renamed from: b */
    View f3413b;

    /* renamed from: c */
    float f3414c;

    /* renamed from: d */
    int f3415d;

    /* renamed from: e */
    boolean f3416e;

    /* renamed from: f */
    final C1119r f3417f;

    /* renamed from: g */
    boolean f3418g;

    /* renamed from: h */
    final ArrayList<C1080a> f3419h;

    /* renamed from: i */
    private int f3420i;

    /* renamed from: j */
    private int f3421j;

    /* renamed from: k */
    private Drawable f3422k;

    /* renamed from: l */
    private Drawable f3423l;

    /* renamed from: m */
    private final int f3424m;

    /* renamed from: n */
    private float f3425n;

    /* renamed from: o */
    private int f3426o;

    /* renamed from: p */
    private float f3427p;

    /* renamed from: q */
    private float f3428q;

    /* renamed from: r */
    private C1081b f3429r;

    /* renamed from: s */
    private boolean f3430s;

    /* renamed from: t */
    private final Rect f3431t;

    /* renamed from: u */
    private Method f3432u;

    /* renamed from: v */
    private Field f3433v;

    /* renamed from: w */
    private boolean f3434w;

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$LayoutParams */
    public static class LayoutParams extends MarginLayoutParams {

        /* renamed from: e */
        private static final int[] f3435e = {16843137};

        /* renamed from: a */
        public float f3436a;

        /* renamed from: b */
        boolean f3437b;

        /* renamed from: c */
        boolean f3438c;

        /* renamed from: d */
        Paint f3439d;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3435e);
            this.f3436a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$SavedState */
    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, null);
            }
        };

        /* renamed from: a */
        boolean f3440a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            boolean z;
            super(parcel, null);
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f3440a = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3440a ? 1 : 0);
        }
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$a */
    class C1080a implements Runnable {

        /* renamed from: a */
        final View f3441a;

        public final void run() {
            if (this.f3441a.getParent() == SlidingPaneLayout.this) {
                this.f3441a.setLayerType(0, null);
                SlidingPaneLayout.this.mo3395a(this.f3441a);
            }
            SlidingPaneLayout.this.f3419h.remove(this);
        }

        C1080a(View view) {
            this.f3441a = view;
        }
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$b */
    public interface C1081b {
    }

    public final int getCoveredFadeColor() {
        return this.f3421j;
    }

    public final int getParallaxDistance() {
        return this.f3426o;
    }

    public final int getSliderFadeColor() {
        return this.f3420i;
    }

    /* access modifiers changed from: protected */
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3430s = true;
    }

    /* renamed from: b */
    private boolean m3176b() {
        if (C1056u.m3055f(this) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m3172a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    public final void computeScroll() {
        if (this.f3417f.mo3576a(true)) {
            if (!this.f3412a) {
                this.f3417f.mo3578b();
                return;
            }
            C1056u.m3052d(this);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3430s = true;
        int size = this.f3419h.size();
        for (int i = 0; i < size; i++) {
            ((C1080a) this.f3419h.get(i)).run();
        }
        this.f3419h.clear();
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (!this.f3412a) {
            z = this.f3418g;
        } else if (!this.f3412a || this.f3414c == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        savedState.f3440a = z;
        return savedState;
    }

    public final void setCoveredFadeColor(int i) {
        this.f3421j = i;
    }

    public final void setPanelSlideListener(C1081b bVar) {
        this.f3429r = bVar;
    }

    public final void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public final void setShadowDrawableLeft(Drawable drawable) {
        this.f3422k = drawable;
    }

    public final void setShadowDrawableRight(Drawable drawable) {
        this.f3423l = drawable;
    }

    public final void setSliderFadeColor(int i) {
        this.f3420i = i;
    }

    public final void setParallaxDistance(int i) {
        this.f3426o = i;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public final android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public final void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public final void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(C0726c.m2091a(getContext(), i));
    }

    public final void setShadowResourceRight(int i) {
        setShadowDrawableRight(C0726c.m2091a(getContext(), i));
    }

    /* renamed from: b */
    private boolean m3177b(View view) {
        if (view == null) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!this.f3412a || !layoutParams.f3438c || this.f3414c <= 0.0f) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3119e);
        if (savedState.f3440a) {
            View view = this.f3413b;
            if (this.f3430s || m3174a(1.0f, 0)) {
                this.f3418g = true;
            }
        } else {
            m3175a(this.f3413b, 0);
        }
        this.f3418g = savedState.f3440a;
    }

    public final void draw(Canvas canvas) {
        Drawable drawable;
        View view;
        int i;
        int i2;
        super.draw(canvas);
        if (m3176b()) {
            drawable = this.f3423l;
        } else {
            drawable = this.f3422k;
        }
        if (getChildCount() > 1) {
            view = getChildAt(1);
        } else {
            view = null;
        }
        if (view != null && drawable != null) {
            int top = view.getTop();
            int bottom = view.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (m3176b()) {
                i2 = view.getRight();
                i = intrinsicWidth + i2;
            } else {
                int left = view.getLeft();
                int i3 = left - intrinsicWidth;
                i = left;
                i2 = i3;
            }
            drawable.setBounds(i2, top, i, bottom);
            drawable.draw(canvas);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f3412a) {
            return super.onTouchEvent(motionEvent);
        }
        this.f3417f.mo3580b(motionEvent);
        switch (motionEvent.getActionMasked()) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f3427p = x;
                this.f3428q = y;
                break;
            case 1:
                if (m3177b(this.f3413b)) {
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    float f = x2 - this.f3427p;
                    float f2 = y2 - this.f3428q;
                    int i = this.f3417f.f3563b;
                    if ((f * f) + (f2 * f2) < ((float) (i * i)) && C1119r.m3282b(this.f3413b, (int) x2, (int) y2)) {
                        m3175a(this.f3413b, 0);
                        break;
                    }
                }
                break;
        }
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f3412a && actionMasked == 0 && getChildCount() > 1) {
            View childAt = getChildAt(1);
            if (childAt != null) {
                this.f3418g = !C1119r.m3282b(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
            }
        }
        if (!this.f3412a || (this.f3416e && actionMasked != 0)) {
            this.f3417f.mo3570a();
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 3 || actionMasked == 1) {
            this.f3417f.mo3570a();
            return false;
        } else {
            if (actionMasked == 0) {
                this.f3416e = false;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f3427p = x;
                this.f3428q = y;
                if (C1119r.m3282b(this.f3413b, (int) x, (int) y) && m3177b(this.f3413b)) {
                    z = true;
                    if (!this.f3417f.mo3574a(motionEvent) || z) {
                        return true;
                    }
                    return false;
                }
            } else if (actionMasked == 2) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float abs = Math.abs(x2 - this.f3427p);
                float abs2 = Math.abs(y2 - this.f3428q);
                if (abs > ((float) this.f3417f.f3563b) && abs2 > abs) {
                    this.f3417f.mo3570a();
                    this.f3416e = true;
                    return false;
                }
            }
            z = false;
            if (!this.f3417f.mo3574a(motionEvent)) {
            }
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo3395a(View view) {
        if (VERSION.SDK_INT >= 17) {
            C1056u.m3027a(view, ((LayoutParams) view.getLayoutParams()).f3439d);
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            if (!this.f3434w) {
                try {
                    this.f3432u = View.class.getDeclaredMethod("getDisplayList", null);
                } catch (NoSuchMethodException unused) {
                }
                try {
                    this.f3433v = View.class.getDeclaredField("mRecreateDisplayList");
                    this.f3433v.setAccessible(true);
                } catch (NoSuchFieldException unused2) {
                }
                this.f3434w = true;
            }
            if (this.f3432u == null || this.f3433v == null) {
                view.invalidate();
                return;
            } else {
                try {
                    this.f3433v.setBoolean(view, true);
                    this.f3432u.invoke(view, null);
                } catch (Exception unused3) {
                }
            }
        }
        C1056u.m3024a(this, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public final void requestChildFocus(View view, View view2) {
        boolean z;
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f3412a) {
            if (view == this.f3413b) {
                z = true;
            } else {
                z = false;
            }
            this.f3418g = z;
        }
    }

    /* renamed from: a */
    private boolean m3175a(View view, int i) {
        if (!this.f3430s && !m3174a(0.0f, 0)) {
            return false;
        }
        this.f3418g = false;
        return true;
    }

    /* renamed from: a */
    private boolean m3174a(float f, int i) {
        int i2;
        if (!this.f3412a) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) this.f3413b.getLayoutParams();
        if (m3176b()) {
            i2 = (int) (((float) getWidth()) - ((((float) (getPaddingRight() + layoutParams.rightMargin)) + (f * ((float) this.f3415d))) + ((float) this.f3413b.getWidth())));
        } else {
            i2 = (int) (((float) (getPaddingLeft() + layoutParams.leftMargin)) + (f * ((float) this.f3415d)));
        }
        if (!this.f3417f.mo3575a(this.f3413b, i2, this.f3413b.getTop())) {
            return false;
        }
        m3172a();
        C1056u.m3052d(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r21, int r22) {
        /*
            r20 = this;
            r0 = r20
            int r1 = android.view.View.MeasureSpec.getMode(r21)
            int r2 = android.view.View.MeasureSpec.getSize(r21)
            int r3 = android.view.View.MeasureSpec.getMode(r22)
            int r4 = android.view.View.MeasureSpec.getSize(r22)
            r5 = 300(0x12c, float:4.2E-43)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 1073741824(0x40000000, float:2.0)
            if (r1 == r7) goto L_0x002f
            boolean r8 = r20.isInEditMode()
            if (r8 == 0) goto L_0x0027
            if (r1 == r6) goto L_0x0046
            if (r1 != 0) goto L_0x0046
            r2 = 300(0x12c, float:4.2E-43)
            goto L_0x0046
        L_0x0027:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Width must have an exact value or MATCH_PARENT"
            r1.<init>(r2)
            throw r1
        L_0x002f:
            if (r3 != 0) goto L_0x0046
            boolean r1 = r20.isInEditMode()
            if (r1 == 0) goto L_0x003e
            if (r3 != 0) goto L_0x0046
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 300(0x12c, float:4.2E-43)
            goto L_0x0046
        L_0x003e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Height must not be UNSPECIFIED"
            r1.<init>(r2)
            throw r1
        L_0x0046:
            r1 = 0
            if (r3 == r6) goto L_0x005a
            if (r3 == r7) goto L_0x004e
            r4 = 0
            r5 = 0
            goto L_0x0066
        L_0x004e:
            int r5 = r20.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r20.getPaddingBottom()
            int r4 = r4 - r5
            r5 = r4
            goto L_0x0066
        L_0x005a:
            int r5 = r20.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r20.getPaddingBottom()
            int r4 = r4 - r5
            r5 = r4
            r4 = 0
        L_0x0066:
            int r8 = r20.getPaddingLeft()
            int r8 = r2 - r8
            int r9 = r20.getPaddingRight()
            int r8 = r8 - r9
            int r9 = r20.getChildCount()
            r10 = 0
            r0.f3413b = r10
            r13 = r4
            r14 = r8
            r4 = 0
            r11 = 0
            r12 = 0
        L_0x007d:
            r15 = 8
            r16 = 1
            if (r4 >= r9) goto L_0x0120
            android.view.View r6 = r0.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r18 = r6.getLayoutParams()
            r7 = r18
            android.support.v4.widget.SlidingPaneLayout$LayoutParams r7 = (android.support.p030v4.widget.SlidingPaneLayout.LayoutParams) r7
            int r10 = r6.getVisibility()
            if (r10 != r15) goto L_0x0099
            r7.f3438c = r1
            goto L_0x0117
        L_0x0099:
            float r10 = r7.f3436a
            r15 = 0
            int r10 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r10 <= 0) goto L_0x00a7
            float r10 = r7.f3436a
            float r12 = r12 + r10
            int r10 = r7.width
            if (r10 == 0) goto L_0x0117
        L_0x00a7:
            int r10 = r7.leftMargin
            int r15 = r7.rightMargin
            int r10 = r10 + r15
            int r15 = r7.width
            r1 = -2
            if (r15 != r1) goto L_0x00bc
            int r1 = r8 - r10
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r10)
            r10 = 1073741824(0x40000000, float:2.0)
            goto L_0x00d2
        L_0x00bc:
            int r1 = r7.width
            r15 = -1
            if (r1 != r15) goto L_0x00ca
            int r1 = r8 - r10
            r10 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r10)
            goto L_0x00d2
        L_0x00ca:
            r10 = 1073741824(0x40000000, float:2.0)
            int r1 = r7.width
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r10)
        L_0x00d2:
            int r15 = r7.height
            r10 = -2
            if (r15 != r10) goto L_0x00de
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r10)
            goto L_0x00f2
        L_0x00de:
            int r10 = r7.height
            r15 = -1
            if (r10 != r15) goto L_0x00ea
            r10 = 1073741824(0x40000000, float:2.0)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r10)
            goto L_0x00f2
        L_0x00ea:
            r10 = 1073741824(0x40000000, float:2.0)
            int r15 = r7.height
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
        L_0x00f2:
            r6.measure(r1, r15)
            int r1 = r6.getMeasuredWidth()
            int r10 = r6.getMeasuredHeight()
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r15) goto L_0x0107
            if (r10 <= r13) goto L_0x0107
            int r13 = java.lang.Math.min(r10, r5)
        L_0x0107:
            int r14 = r14 - r1
            if (r14 >= 0) goto L_0x010c
            r1 = 1
            goto L_0x010d
        L_0x010c:
            r1 = 0
        L_0x010d:
            r7.f3437b = r1
            r1 = r1 | r11
            boolean r7 = r7.f3437b
            if (r7 == 0) goto L_0x0116
            r0.f3413b = r6
        L_0x0116:
            r11 = r1
        L_0x0117:
            int r4 = r4 + 1
            r1 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 1073741824(0x40000000, float:2.0)
            goto L_0x007d
        L_0x0120:
            if (r11 != 0) goto L_0x0127
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x021e
        L_0x0127:
            int r1 = r0.f3424m
            int r1 = r8 - r1
            r3 = 0
        L_0x012c:
            if (r3 >= r9) goto L_0x021e
            android.view.View r4 = r0.getChildAt(r3)
            int r6 = r4.getVisibility()
            if (r6 == r15) goto L_0x0211
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            android.support.v4.widget.SlidingPaneLayout$LayoutParams r6 = (android.support.p030v4.widget.SlidingPaneLayout.LayoutParams) r6
            int r7 = r4.getVisibility()
            if (r7 == r15) goto L_0x0211
            int r7 = r6.width
            if (r7 != 0) goto L_0x0151
            float r7 = r6.f3436a
            r10 = 0
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x0151
            r7 = 1
            goto L_0x0152
        L_0x0151:
            r7 = 0
        L_0x0152:
            if (r7 == 0) goto L_0x0156
            r10 = 0
            goto L_0x015a
        L_0x0156:
            int r10 = r4.getMeasuredWidth()
        L_0x015a:
            if (r11 == 0) goto L_0x01a5
            android.view.View r15 = r0.f3413b
            if (r4 == r15) goto L_0x01a5
            int r15 = r6.width
            if (r15 >= 0) goto L_0x0211
            if (r10 > r1) goto L_0x016d
            float r10 = r6.f3436a
            r15 = 0
            int r10 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r10 <= 0) goto L_0x0211
        L_0x016d:
            if (r7 == 0) goto L_0x0192
            int r7 = r6.height
            r10 = -2
            if (r7 != r10) goto L_0x017d
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r7)
            r7 = 1073741824(0x40000000, float:2.0)
            goto L_0x019c
        L_0x017d:
            int r7 = r6.height
            r10 = -1
            if (r7 != r10) goto L_0x0189
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r7)
            goto L_0x019c
        L_0x0189:
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = r6.height
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            goto L_0x019c
        L_0x0192:
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = r4.getMeasuredHeight()
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
        L_0x019c:
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r7)
            r4.measure(r10, r6)
            goto L_0x0211
        L_0x01a5:
            float r7 = r6.f3436a
            r15 = 0
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 <= 0) goto L_0x0211
            int r7 = r6.width
            if (r7 != 0) goto L_0x01d5
            int r7 = r6.height
            r15 = -2
            if (r7 != r15) goto L_0x01c0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            int r17 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r7)
            r15 = r17
            r7 = 1073741824(0x40000000, float:2.0)
            goto L_0x01e1
        L_0x01c0:
            int r7 = r6.height
            r15 = -1
            if (r7 != r15) goto L_0x01cc
            r7 = 1073741824(0x40000000, float:2.0)
            int r17 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r7)
            goto L_0x01df
        L_0x01cc:
            r7 = 1073741824(0x40000000, float:2.0)
            int r15 = r6.height
            int r17 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r7)
            goto L_0x01df
        L_0x01d5:
            r7 = 1073741824(0x40000000, float:2.0)
            int r15 = r4.getMeasuredHeight()
            int r17 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r7)
        L_0x01df:
            r15 = r17
        L_0x01e1:
            if (r11 == 0) goto L_0x01f8
            int r7 = r6.leftMargin
            int r6 = r6.rightMargin
            int r7 = r7 + r6
            int r6 = r8 - r7
            r19 = r1
            r7 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            if (r10 == r6) goto L_0x0213
            r4.measure(r1, r15)
            goto L_0x0213
        L_0x01f8:
            r19 = r1
            r1 = 0
            int r7 = java.lang.Math.max(r1, r14)
            float r6 = r6.f3436a
            float r7 = (float) r7
            float r6 = r6 * r7
            float r6 = r6 / r12
            int r6 = (int) r6
            int r10 = r10 + r6
            r6 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r6)
            r4.measure(r7, r15)
            goto L_0x0216
        L_0x0211:
            r19 = r1
        L_0x0213:
            r1 = 0
            r6 = 1073741824(0x40000000, float:2.0)
        L_0x0216:
            int r3 = r3 + 1
            r1 = r19
            r15 = 8
            goto L_0x012c
        L_0x021e:
            int r1 = r20.getPaddingTop()
            int r13 = r13 + r1
            int r1 = r20.getPaddingBottom()
            int r13 = r13 + r1
            r0.setMeasuredDimension(r2, r13)
            r0.f3412a = r11
            android.support.v4.widget.r r1 = r0.f3417f
            int r1 = r1.f3562a
            if (r1 == 0) goto L_0x023a
            if (r11 != 0) goto L_0x023a
            android.support.v4.widget.r r1 = r0.f3417f
            r1.mo3578b()
        L_0x023a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.widget.SlidingPaneLayout.onMeasure(int, int):void");
    }

    /* renamed from: a */
    private void m3173a(View view, float f, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f <= 0.0f || i == 0) {
            if (view.getLayerType() != 0) {
                if (layoutParams.f3439d != null) {
                    layoutParams.f3439d.setColorFilter(null);
                }
                C1080a aVar = new C1080a(view);
                this.f3419h.add(aVar);
                C1056u.m3034a((View) this, (Runnable) aVar);
            }
            return;
        }
        int i2 = (((int) (((float) ((-16777216 & i) >>> 24)) * f)) << 24) | (i & 16777215);
        if (layoutParams.f3439d == null) {
            layoutParams.f3439d = new Paint();
        }
        layoutParams.f3439d.setColorFilter(new PorterDuffColorFilter(i2, Mode.SRC_OVER));
        if (view.getLayerType() != 2) {
            view.setLayerType(2, layoutParams.f3439d);
        }
        mo3395a(view);
    }

    /* access modifiers changed from: protected */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (this.f3412a && !layoutParams.f3437b && this.f3413b != null) {
            canvas.getClipBounds(this.f3431t);
            if (m3176b()) {
                this.f3431t.left = Math.max(this.f3431t.left, this.f3413b.getRight());
            } else {
                this.f3431t.right = Math.min(this.f3431t.right, this.f3413b.getLeft());
            }
            canvas.clipRect(this.f3431t);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f3430s = true;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01ba, code lost:
        if (r7.getOpacity() == -1) goto L_0x01a6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0105  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        /*
            r21 = this;
            r0 = r21
            boolean r1 = r21.m3176b()
            r2 = 1
            if (r1 == 0) goto L_0x000f
            android.support.v4.widget.r r3 = r0.f3417f
            r4 = 2
            r3.f3571j = r4
            goto L_0x0013
        L_0x000f:
            android.support.v4.widget.r r3 = r0.f3417f
            r3.f3571j = r2
        L_0x0013:
            int r3 = r25 - r23
            if (r1 == 0) goto L_0x001c
            int r4 = r21.getPaddingRight()
            goto L_0x0020
        L_0x001c:
            int r4 = r21.getPaddingLeft()
        L_0x0020:
            if (r1 == 0) goto L_0x0027
            int r5 = r21.getPaddingLeft()
            goto L_0x002b
        L_0x0027:
            int r5 = r21.getPaddingRight()
        L_0x002b:
            int r6 = r21.getPaddingTop()
            int r7 = r21.getChildCount()
            boolean r8 = r0.f3430s
            if (r8 == 0) goto L_0x0045
            boolean r8 = r0.f3412a
            if (r8 == 0) goto L_0x0042
            boolean r8 = r0.f3418g
            if (r8 == 0) goto L_0x0042
            r8 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0043
        L_0x0042:
            r8 = 0
        L_0x0043:
            r0.f3414c = r8
        L_0x0045:
            r11 = r4
            r12 = r11
            r4 = 0
        L_0x0048:
            r13 = 8
            if (r4 >= r7) goto L_0x00d4
            android.view.View r14 = r0.getChildAt(r4)
            int r15 = r14.getVisibility()
            if (r15 == r13) goto L_0x00cf
            android.view.ViewGroup$LayoutParams r13 = r14.getLayoutParams()
            android.support.v4.widget.SlidingPaneLayout$LayoutParams r13 = (android.support.p030v4.widget.SlidingPaneLayout.LayoutParams) r13
            int r15 = r14.getMeasuredWidth()
            boolean r2 = r13.f3437b
            if (r2 == 0) goto L_0x009e
            int r2 = r13.leftMargin
            int r8 = r13.rightMargin
            int r2 = r2 + r8
            int r8 = r3 - r5
            int r9 = r0.f3424m
            int r9 = r8 - r9
            int r9 = java.lang.Math.min(r11, r9)
            int r9 = r9 - r12
            int r9 = r9 - r2
            r0.f3415d = r9
            if (r1 == 0) goto L_0x007c
            int r2 = r13.rightMargin
            goto L_0x007e
        L_0x007c:
            int r2 = r13.leftMargin
        L_0x007e:
            int r17 = r12 + r2
            int r17 = r17 + r9
            int r18 = r15 / 2
            int r10 = r17 + r18
            if (r10 <= r8) goto L_0x008a
            r8 = 1
            goto L_0x008b
        L_0x008a:
            r8 = 0
        L_0x008b:
            r13.f3438c = r8
            float r8 = (float) r9
            float r9 = r0.f3414c
            float r8 = r8 * r9
            int r8 = (int) r8
            int r2 = r2 + r8
            int r2 = r2 + r12
            float r8 = (float) r8
            int r9 = r0.f3415d
            float r9 = (float) r9
            float r8 = r8 / r9
            r0.f3414c = r8
            r8 = 0
            goto L_0x00b5
        L_0x009e:
            boolean r2 = r0.f3412a
            if (r2 == 0) goto L_0x00b3
            int r2 = r0.f3426o
            if (r2 == 0) goto L_0x00b3
            float r2 = r0.f3414c
            r8 = 1065353216(0x3f800000, float:1.0)
            float r10 = r8 - r2
            int r2 = r0.f3426o
            float r2 = (float) r2
            float r10 = r10 * r2
            int r8 = (int) r10
            goto L_0x00b4
        L_0x00b3:
            r8 = 0
        L_0x00b4:
            r2 = r11
        L_0x00b5:
            if (r1 == 0) goto L_0x00bd
            int r9 = r3 - r2
            int r9 = r9 + r8
            int r8 = r9 - r15
            goto L_0x00c1
        L_0x00bd:
            int r8 = r2 - r8
            int r9 = r8 + r15
        L_0x00c1:
            int r10 = r14.getMeasuredHeight()
            int r10 = r10 + r6
            r14.layout(r8, r6, r9, r10)
            int r8 = r14.getWidth()
            int r11 = r11 + r8
            r12 = r2
        L_0x00cf:
            int r4 = r4 + 1
            r2 = 1
            goto L_0x0048
        L_0x00d4:
            boolean r1 = r0.f3430s
            if (r1 == 0) goto L_0x0237
            boolean r1 = r0.f3412a
            if (r1 == 0) goto L_0x015b
            int r1 = r0.f3426o
            if (r1 == 0) goto L_0x0145
            float r1 = r0.f3414c
            boolean r2 = r21.m3176b()
            android.view.View r3 = r0.f3413b
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.support.v4.widget.SlidingPaneLayout$LayoutParams r3 = (android.support.p030v4.widget.SlidingPaneLayout.LayoutParams) r3
            boolean r4 = r3.f3438c
            if (r4 == 0) goto L_0x00fd
            if (r2 == 0) goto L_0x00f7
            int r3 = r3.rightMargin
            goto L_0x00f9
        L_0x00f7:
            int r3 = r3.leftMargin
        L_0x00f9:
            if (r3 > 0) goto L_0x00fd
            r3 = 1
            goto L_0x00fe
        L_0x00fd:
            r3 = 0
        L_0x00fe:
            int r4 = r21.getChildCount()
            r5 = 0
        L_0x0103:
            if (r5 >= r4) goto L_0x0145
            android.view.View r6 = r0.getChildAt(r5)
            android.view.View r7 = r0.f3413b
            if (r6 == r7) goto L_0x0140
            float r7 = r0.f3425n
            r8 = 1065353216(0x3f800000, float:1.0)
            float r10 = r8 - r7
            int r7 = r0.f3426o
            float r7 = (float) r7
            float r10 = r10 * r7
            int r7 = (int) r10
            r0.f3425n = r1
            float r10 = r8 - r1
            int r8 = r0.f3426o
            float r8 = (float) r8
            float r10 = r10 * r8
            int r8 = (int) r10
            int r7 = r7 - r8
            if (r2 == 0) goto L_0x0127
            int r7 = -r7
        L_0x0127:
            r6.offsetLeftAndRight(r7)
            if (r3 == 0) goto L_0x0140
            if (r2 == 0) goto L_0x0134
            float r7 = r0.f3425n
            r8 = 1065353216(0x3f800000, float:1.0)
            float r7 = r7 - r8
            goto L_0x013a
        L_0x0134:
            r8 = 1065353216(0x3f800000, float:1.0)
            float r7 = r0.f3425n
            float r7 = r8 - r7
        L_0x013a:
            int r9 = r0.f3421j
            r0.m3173a(r6, r7, r9)
            goto L_0x0142
        L_0x0140:
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x0142:
            int r5 = r5 + 1
            goto L_0x0103
        L_0x0145:
            android.view.View r1 = r0.f3413b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v4.widget.SlidingPaneLayout$LayoutParams r1 = (android.support.p030v4.widget.SlidingPaneLayout.LayoutParams) r1
            boolean r1 = r1.f3438c
            if (r1 == 0) goto L_0x016b
            android.view.View r1 = r0.f3413b
            float r2 = r0.f3414c
            int r3 = r0.f3420i
            r0.m3173a(r1, r2, r3)
            goto L_0x016b
        L_0x015b:
            r1 = 0
        L_0x015c:
            if (r1 >= r7) goto L_0x016b
            android.view.View r2 = r0.getChildAt(r1)
            int r3 = r0.f3420i
            r4 = 0
            r0.m3173a(r2, r4, r3)
            int r1 = r1 + 1
            goto L_0x015c
        L_0x016b:
            android.view.View r1 = r0.f3413b
            boolean r2 = r21.m3176b()
            if (r2 == 0) goto L_0x017d
            int r3 = r21.getWidth()
            int r4 = r21.getPaddingRight()
            int r3 = r3 - r4
            goto L_0x0181
        L_0x017d:
            int r3 = r21.getPaddingLeft()
        L_0x0181:
            if (r2 == 0) goto L_0x0188
            int r4 = r21.getPaddingLeft()
            goto L_0x0191
        L_0x0188:
            int r4 = r21.getWidth()
            int r5 = r21.getPaddingRight()
            int r4 = r4 - r5
        L_0x0191:
            int r5 = r21.getPaddingTop()
            int r6 = r21.getHeight()
            int r7 = r21.getPaddingBottom()
            int r6 = r6 - r7
            if (r1 == 0) goto L_0x01d2
            boolean r7 = r1.isOpaque()
            if (r7 == 0) goto L_0x01a9
        L_0x01a6:
            r16 = 1
            goto L_0x01bf
        L_0x01a9:
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 18
            if (r7 >= r8) goto L_0x01bd
            android.graphics.drawable.Drawable r7 = r1.getBackground()
            if (r7 == 0) goto L_0x01bd
            int r7 = r7.getOpacity()
            r8 = -1
            if (r7 != r8) goto L_0x01bd
            goto L_0x01a6
        L_0x01bd:
            r16 = 0
        L_0x01bf:
            if (r16 == 0) goto L_0x01d2
            int r8 = r1.getLeft()
            int r7 = r1.getRight()
            int r9 = r1.getTop()
            int r10 = r1.getBottom()
            goto L_0x01d6
        L_0x01d2:
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x01d6:
            int r11 = r21.getChildCount()
            r12 = 0
        L_0x01db:
            if (r12 >= r11) goto L_0x0237
            android.view.View r14 = r0.getChildAt(r12)
            if (r14 == r1) goto L_0x0237
            int r15 = r14.getVisibility()
            if (r15 == r13) goto L_0x022a
            if (r2 == 0) goto L_0x01ed
            r15 = r4
            goto L_0x01ee
        L_0x01ed:
            r15 = r3
        L_0x01ee:
            int r13 = r14.getLeft()
            int r13 = java.lang.Math.max(r15, r13)
            int r15 = r14.getTop()
            int r15 = java.lang.Math.max(r5, r15)
            if (r2 == 0) goto L_0x0206
            r19 = r1
            r20 = r2
            r1 = r3
            goto L_0x020b
        L_0x0206:
            r19 = r1
            r20 = r2
            r1 = r4
        L_0x020b:
            int r2 = r14.getRight()
            int r1 = java.lang.Math.min(r1, r2)
            int r2 = r14.getBottom()
            int r2 = java.lang.Math.min(r6, r2)
            if (r13 < r8) goto L_0x0225
            if (r15 < r9) goto L_0x0225
            if (r1 > r7) goto L_0x0225
            if (r2 > r10) goto L_0x0225
            r1 = 4
            goto L_0x0226
        L_0x0225:
            r1 = 0
        L_0x0226:
            r14.setVisibility(r1)
            goto L_0x022e
        L_0x022a:
            r19 = r1
            r20 = r2
        L_0x022e:
            int r12 = r12 + 1
            r1 = r19
            r2 = r20
            r13 = 8
            goto L_0x01db
        L_0x0237:
            r1 = 0
            r0.f3430s = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.widget.SlidingPaneLayout.onLayout(boolean, int, int, int, int):void");
    }
}
