package com.bytedance.ies.dmt.p664ui.sliding;

import android.app.Activity;
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
import android.support.p030v4.view.C1002a;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.view.p041a.C1008c;
import android.support.p030v4.widget.C1119r;
import android.support.p030v4.widget.C1119r.C1122a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: com.bytedance.ies.dmt.ui.sliding.DmtSlidingPaneLayout */
public class DmtSlidingPaneLayout extends ViewGroup {

    /* renamed from: x */
    private static int f28510x = 1920;

    /* renamed from: a */
    int f28511a = -858993460;

    /* renamed from: b */
    public boolean f28512b;

    /* renamed from: c */
    View f28513c;

    /* renamed from: d */
    float f28514d;

    /* renamed from: e */
    int f28515e;

    /* renamed from: f */
    boolean f28516f;

    /* renamed from: g */
    int f28517g;

    /* renamed from: h */
    public C10712d f28518h;

    /* renamed from: i */
    final C1119r f28519i;

    /* renamed from: j */
    boolean f28520j;

    /* renamed from: k */
    final ArrayList<C10710b> f28521k = new ArrayList<>();

    /* renamed from: l */
    private int f28522l;

    /* renamed from: m */
    private Drawable f28523m;

    /* renamed from: n */
    private Drawable f28524n;

    /* renamed from: o */
    private final int f28525o;

    /* renamed from: p */
    private float f28526p;

    /* renamed from: q */
    private float f28527q;

    /* renamed from: r */
    private float f28528r;

    /* renamed from: s */
    private boolean f28529s = true;

    /* renamed from: t */
    private final Rect f28530t = new Rect();

    /* renamed from: u */
    private Method f28531u;

    /* renamed from: v */
    private Field f28532v;

    /* renamed from: w */
    private boolean f28533w;

    /* renamed from: com.bytedance.ies.dmt.ui.sliding.DmtSlidingPaneLayout$LayoutParams */
    public static class LayoutParams extends MarginLayoutParams {

        /* renamed from: e */
        private static final int[] f28534e = {16843137};

        /* renamed from: a */
        public float f28535a;

        /* renamed from: b */
        boolean f28536b;

        /* renamed from: c */
        boolean f28537c;

        /* renamed from: d */
        Paint f28538d;

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
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f28534e);
            this.f28535a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.sliding.DmtSlidingPaneLayout$SavedState */
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
        boolean f28539a;

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
            this.f28539a = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f28539a ? 1 : 0);
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.sliding.DmtSlidingPaneLayout$a */
    class C10709a extends C1002a {

        /* renamed from: d */
        private final Rect f28541d = new Rect();

        /* renamed from: a */
        private boolean m21596a(View view) {
            return DmtSlidingPaneLayout.this.mo19089c(view);
        }

        C10709a() {
        }

        /* renamed from: a */
        public final void mo1322a(View view, AccessibilityEvent accessibilityEvent) {
            super.mo1322a(view, accessibilityEvent);
            accessibilityEvent.setClassName(DmtSlidingPaneLayout.class.getName());
        }

        /* renamed from: a */
        public final void mo1119a(View view, C1008c cVar) {
            int i;
            C1008c a = C1008c.m2885a(cVar);
            super.mo1119a(view, a);
            Rect rect = this.f28541d;
            a.mo3131a(rect);
            cVar.mo3137b(rect);
            a.mo3142c(rect);
            cVar.mo3147d(rect);
            cVar.mo3149d(a.mo3150d());
            cVar.mo3133a(a.mo3163j());
            cVar.mo3139b(a.mo3165k());
            cVar.mo3148d(a.mo3167l());
            cVar.mo3161i(a.mo3162i());
            cVar.mo3156g(a.mo3157g());
            cVar.mo3140b(a.mo3141b());
            cVar.mo3145c(a.mo3146c());
            cVar.mo3151e(a.mo3152e());
            cVar.mo3154f(a.mo3155f());
            cVar.mo3158h(a.mo3159h());
            cVar.mo3130a(a.mo3129a());
            if (VERSION.SDK_INT >= 16) {
                i = a.f3230a.getMovementGranularities();
            } else {
                i = 0;
            }
            if (VERSION.SDK_INT >= 16) {
                cVar.f3230a.setMovementGranularities(i);
            }
            a.mo3168m();
            cVar.mo3139b((CharSequence) DmtSlidingPaneLayout.class.getName());
            cVar.mo3132a(view);
            ViewParent g = C1056u.m3057g(view);
            if (g instanceof View) {
                cVar.mo3143c((View) g);
            }
            int childCount = DmtSlidingPaneLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = DmtSlidingPaneLayout.this.getChildAt(i2);
                if (!m21596a(childAt) && childAt.getVisibility() == 0) {
                    C1056u.m3043b(childAt, 1);
                    cVar.mo3138b(childAt);
                }
            }
        }

        /* renamed from: a */
        public final boolean mo3115a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!m21596a(view)) {
                return super.mo3115a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.sliding.DmtSlidingPaneLayout$b */
    class C10710b implements Runnable {

        /* renamed from: a */
        final View f28542a;

        public final void run() {
            if (this.f28542a.getParent() == DmtSlidingPaneLayout.this) {
                this.f28542a.setLayerType(0, null);
                DmtSlidingPaneLayout.this.mo19087b(this.f28542a);
            }
            DmtSlidingPaneLayout.this.f28521k.remove(this);
        }

        C10710b(View view) {
            this.f28542a = view;
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.sliding.DmtSlidingPaneLayout$c */
    class C10711c extends C1122a {
        C10711c() {
        }

        /* renamed from: b */
        public final int mo1490b(View view) {
            return DmtSlidingPaneLayout.this.f28515e;
        }

        /* renamed from: a */
        public final void mo1307a(int i) {
            if (DmtSlidingPaneLayout.this.f28519i.f3562a == 0) {
                if (DmtSlidingPaneLayout.this.f28514d == 0.0f) {
                    DmtSlidingPaneLayout.this.mo19084a(DmtSlidingPaneLayout.this.f28513c);
                    DmtSlidingPaneLayout dmtSlidingPaneLayout = DmtSlidingPaneLayout.this;
                    View view = DmtSlidingPaneLayout.this.f28513c;
                    if (!(dmtSlidingPaneLayout.f28518h == null || view == null)) {
                        dmtSlidingPaneLayout.f28518h.mo19126b(view);
                    }
                    dmtSlidingPaneLayout.sendAccessibilityEvent(32);
                    DmtSlidingPaneLayout.this.f28520j = false;
                    return;
                }
                DmtSlidingPaneLayout dmtSlidingPaneLayout2 = DmtSlidingPaneLayout.this;
                View view2 = DmtSlidingPaneLayout.this.f28513c;
                if (!(dmtSlidingPaneLayout2.f28518h == null || view2 == null)) {
                    dmtSlidingPaneLayout2.f28518h.mo19124a(view2);
                }
                dmtSlidingPaneLayout2.sendAccessibilityEvent(32);
                DmtSlidingPaneLayout.this.f28520j = true;
            }
        }

        /* renamed from: b */
        public final void mo3340b(int i, int i2) {
            DmtSlidingPaneLayout.this.f28519i.mo3571a(DmtSlidingPaneLayout.this.f28513c, i2);
        }

        /* renamed from: a */
        public final boolean mo1310a(View view, int i) {
            if (DmtSlidingPaneLayout.this.f28516f) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).f28536b;
        }

        /* renamed from: b */
        public final void mo1491b(View view, int i) {
            DmtSlidingPaneLayout.this.mo19088c();
            DmtSlidingPaneLayout.this.f28518h.mo19127c(view);
        }

        /* renamed from: a */
        public final int mo1306a(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: b */
        public final int mo1311b(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) DmtSlidingPaneLayout.this.f28513c.getLayoutParams();
            if (DmtSlidingPaneLayout.this.mo19095e()) {
                int width = DmtSlidingPaneLayout.this.getWidth() - ((DmtSlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin) + DmtSlidingPaneLayout.this.f28513c.getWidth());
                return Math.max(Math.min(i, width), width - DmtSlidingPaneLayout.this.f28515e);
            }
            int paddingLeft = DmtSlidingPaneLayout.this.getPaddingLeft() + layoutParams.leftMargin;
            return Math.min(Math.max(i, paddingLeft), DmtSlidingPaneLayout.this.f28515e + paddingLeft);
        }

        /* renamed from: a */
        public final void mo1308a(View view, float f, float f2) {
            int i;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (DmtSlidingPaneLayout.this.mo19095e()) {
                int paddingRight = DmtSlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin;
                if (f < 0.0f || (f == 0.0f && DmtSlidingPaneLayout.this.f28514d > 0.5f)) {
                    paddingRight += DmtSlidingPaneLayout.this.f28515e;
                }
                i = (DmtSlidingPaneLayout.this.getWidth() - paddingRight) - DmtSlidingPaneLayout.this.f28513c.getWidth();
            } else {
                i = layoutParams.leftMargin + DmtSlidingPaneLayout.this.getPaddingLeft();
                if (f > 0.0f || (f == 0.0f && DmtSlidingPaneLayout.this.f28514d > 0.5f)) {
                    i += DmtSlidingPaneLayout.this.f28515e;
                }
            }
            DmtSlidingPaneLayout.this.f28519i.mo3573a(i, view.getTop());
            DmtSlidingPaneLayout.this.invalidate();
        }

        /* renamed from: a */
        public final void mo1309a(View view, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            DmtSlidingPaneLayout dmtSlidingPaneLayout = DmtSlidingPaneLayout.this;
            if (dmtSlidingPaneLayout.f28513c == null) {
                dmtSlidingPaneLayout.f28514d = 0.0f;
            } else {
                boolean e = dmtSlidingPaneLayout.mo19095e();
                LayoutParams layoutParams = (LayoutParams) dmtSlidingPaneLayout.f28513c.getLayoutParams();
                int width = dmtSlidingPaneLayout.f28513c.getWidth();
                if (e) {
                    i = (dmtSlidingPaneLayout.getWidth() - i) - width;
                }
                if (e) {
                    i5 = dmtSlidingPaneLayout.getPaddingRight();
                } else {
                    i5 = dmtSlidingPaneLayout.getPaddingLeft();
                }
                if (e) {
                    i6 = layoutParams.rightMargin;
                } else {
                    i6 = layoutParams.leftMargin;
                }
                dmtSlidingPaneLayout.f28514d = ((float) (i - (i5 + i6))) / ((float) dmtSlidingPaneLayout.f28515e);
                if (dmtSlidingPaneLayout.f28517g != 0) {
                    dmtSlidingPaneLayout.mo19083a(dmtSlidingPaneLayout.f28514d);
                }
                if (layoutParams.f28537c) {
                    dmtSlidingPaneLayout.mo19085a(dmtSlidingPaneLayout.f28513c, dmtSlidingPaneLayout.f28514d, dmtSlidingPaneLayout.f28511a);
                }
                View view2 = dmtSlidingPaneLayout.f28513c;
                if (!(dmtSlidingPaneLayout.f28518h == null || view2 == null)) {
                    dmtSlidingPaneLayout.f28518h.mo19125a(view2, dmtSlidingPaneLayout.f28514d);
                }
            }
            DmtSlidingPaneLayout.this.invalidate();
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.sliding.DmtSlidingPaneLayout$d */
    public interface C10712d {
        /* renamed from: a */
        void mo19124a(View view);

        /* renamed from: a */
        void mo19125a(View view, float f);

        /* renamed from: b */
        void mo19126b(View view);

        /* renamed from: c */
        void mo19127c(View view);
    }

    public int getCoveredFadeColor() {
        return this.f28522l;
    }

    public int getParallaxDistance() {
        return this.f28517g;
    }

    public int getSliderFadeColor() {
        return this.f28511a;
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28529s = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final boolean mo19095e() {
        if (C1056u.m3055f(this) == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo19088c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    public void computeScroll() {
        if (this.f28519i.mo3576a(true)) {
            if (!this.f28512b) {
                this.f28519i.mo3578b();
                return;
            }
            C1056u.m3052d(this);
        }
    }

    /* renamed from: d */
    public final boolean mo19092d() {
        if (!this.f28512b || this.f28514d == 1.0f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f28512b) {
            z = mo19092d();
        } else {
            z = this.f28520j;
        }
        savedState.f28539a = z;
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28529s = true;
        int size = this.f28521k.size();
        for (int i = 0; i < size; i++) {
            ((C10710b) this.f28521k.get(i)).run();
        }
        this.f28521k.clear();
    }

    public static void setHeight(int i) {
        f28510x = i;
    }

    public void setCoveredFadeColor(int i) {
        this.f28522l = i;
    }

    public void setPanelSlideListener(C10712d dVar) {
        this.f28518h = dVar;
    }

    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f28523m = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f28524n = drawable;
    }

    public void setSliderFadeColor(int i) {
        this.f28511a = i;
    }

    public void setParallaxDistance(int i) {
        this.f28517g = i;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(C0726c.m2091a(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(C0726c.m2091a(getContext(), i));
    }

    /* renamed from: a */
    public static int m21584a(Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.height();
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo19089c(View view) {
        if (view == null) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!this.f28512b || !layoutParams.f28537c || this.f28514d <= 0.0f) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3119e);
        if (savedState.f28539a) {
            View view = this.f28513c;
            if (this.f28529s || m21585a(1.0f, 0)) {
                this.f28520j = true;
            }
        } else {
            m21586a(this.f28513c, 0);
        }
        this.f28520j = savedState.f28539a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo19087b(View view) {
        if (VERSION.SDK_INT >= 17) {
            C1056u.m3027a(view, ((LayoutParams) view.getLayoutParams()).f28538d);
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            if (!this.f28533w) {
                try {
                    this.f28531u = View.class.getDeclaredMethod("getDisplayList", null);
                } catch (NoSuchMethodException unused) {
                }
                try {
                    this.f28532v = View.class.getDeclaredField("mRecreateDisplayList");
                    this.f28532v.setAccessible(true);
                } catch (NoSuchFieldException unused2) {
                }
                this.f28533w = true;
            }
            if (this.f28531u == null || this.f28532v == null) {
                view.invalidate();
                return;
            } else {
                try {
                    this.f28532v.setBoolean(view, true);
                    this.f28531u.invoke(view, null);
                } catch (Exception unused3) {
                }
            }
        }
        C1056u.m3024a(this, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        View view;
        int i;
        int i2;
        super.draw(canvas);
        if (mo19095e()) {
            drawable = this.f28524n;
        } else {
            drawable = this.f28523m;
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
            if (mo19095e()) {
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

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f28512b) {
            return super.onTouchEvent(motionEvent);
        }
        this.f28519i.mo3580b(motionEvent);
        switch (motionEvent.getActionMasked()) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f28527q = x;
                this.f28528r = y;
                break;
            case 1:
                if (mo19089c(this.f28513c)) {
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    float f = x2 - this.f28527q;
                    float f2 = y2 - this.f28528r;
                    int i = this.f28519i.f3563b;
                    if ((f * f) + (f2 * f2) < ((float) (i * i)) && C1119r.m3282b(this.f28513c, (int) x2, (int) y2)) {
                        m21586a(this.f28513c, 0);
                        break;
                    }
                }
                break;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19083a(float r10) {
        /*
            r9 = this;
            boolean r0 = r9.mo19095e()
            android.view.View r1 = r9.f28513c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            com.bytedance.ies.dmt.ui.sliding.DmtSlidingPaneLayout$LayoutParams r1 = (com.bytedance.ies.dmt.p664ui.sliding.DmtSlidingPaneLayout.LayoutParams) r1
            boolean r2 = r1.f28537c
            r3 = 0
            if (r2 == 0) goto L_0x001c
            if (r0 == 0) goto L_0x0016
            int r1 = r1.rightMargin
            goto L_0x0018
        L_0x0016:
            int r1 = r1.leftMargin
        L_0x0018:
            if (r1 > 0) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            int r2 = r9.getChildCount()
        L_0x0021:
            if (r3 >= r2) goto L_0x005c
            android.view.View r4 = r9.getChildAt(r3)
            android.view.View r5 = r9.f28513c
            if (r4 == r5) goto L_0x0059
            float r5 = r9.f28526p
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6 - r5
            int r7 = r9.f28517g
            float r7 = (float) r7
            float r5 = r5 * r7
            int r5 = (int) r5
            r9.f28526p = r10
            float r7 = r6 - r10
            int r8 = r9.f28517g
            float r8 = (float) r8
            float r7 = r7 * r8
            int r7 = (int) r7
            int r5 = r5 - r7
            if (r0 == 0) goto L_0x0045
            int r5 = -r5
        L_0x0045:
            r4.offsetLeftAndRight(r5)
            if (r1 == 0) goto L_0x0059
            if (r0 == 0) goto L_0x0050
            float r5 = r9.f28526p
            float r5 = r5 - r6
            goto L_0x0054
        L_0x0050:
            float r5 = r9.f28526p
            float r5 = r6 - r5
        L_0x0054:
            int r6 = r9.f28522l
            r9.mo19085a(r4, r5, r6)
        L_0x0059:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.p664ui.sliding.DmtSlidingPaneLayout.mo19083a(float):void");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f28512b && actionMasked == 0 && getChildCount() > 1) {
            View childAt = getChildAt(1);
            if (childAt != null) {
                this.f28520j = !C1119r.m3282b(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
            }
        }
        if (!this.f28512b || (this.f28516f && actionMasked != 0)) {
            this.f28519i.mo3570a();
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 3 || actionMasked == 1) {
            this.f28519i.mo3570a();
            return false;
        } else {
            if (actionMasked == 0) {
                this.f28516f = false;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f28527q = x;
                this.f28528r = y;
                if (C1119r.m3282b(this.f28513c, (int) x, (int) y) && mo19089c(this.f28513c)) {
                    z = true;
                    if (!this.f28519i.mo3574a(motionEvent) || z) {
                        return true;
                    }
                    return false;
                }
            } else if (actionMasked == 2) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float abs = Math.abs(x2 - this.f28527q);
                float abs2 = Math.abs(y2 - this.f28528r);
                if (abs > ((float) this.f28519i.f3563b) && abs2 > abs) {
                    this.f28519i.mo3570a();
                    this.f28516f = true;
                    return false;
                }
            }
            z = false;
            if (!this.f28519i.mo3574a(motionEvent)) {
            }
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (r7.getOpacity() == -1) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0070  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19084a(android.view.View r18) {
        /*
            r17 = this;
            r0 = r18
            boolean r1 = r17.mo19095e()
            if (r1 == 0) goto L_0x0012
            int r2 = r17.getWidth()
            int r3 = r17.getPaddingRight()
            int r2 = r2 - r3
            goto L_0x0016
        L_0x0012:
            int r2 = r17.getPaddingLeft()
        L_0x0016:
            if (r1 == 0) goto L_0x001d
            int r3 = r17.getPaddingLeft()
            goto L_0x0026
        L_0x001d:
            int r3 = r17.getWidth()
            int r4 = r17.getPaddingRight()
            int r3 = r3 - r4
        L_0x0026:
            int r4 = r17.getPaddingTop()
            int r5 = r17.getHeight()
            int r6 = r17.getPaddingBottom()
            int r5 = r5 - r6
            if (r0 == 0) goto L_0x0065
            boolean r7 = r18.isOpaque()
            r8 = 1
            if (r7 == 0) goto L_0x003d
            goto L_0x0052
        L_0x003d:
            int r7 = android.os.Build.VERSION.SDK_INT
            r9 = 18
            if (r7 >= r9) goto L_0x0051
            android.graphics.drawable.Drawable r7 = r18.getBackground()
            if (r7 == 0) goto L_0x0051
            int r7 = r7.getOpacity()
            r9 = -1
            if (r7 != r9) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r8 = 0
        L_0x0052:
            if (r8 == 0) goto L_0x0065
            int r7 = r18.getLeft()
            int r8 = r18.getRight()
            int r9 = r18.getTop()
            int r10 = r18.getBottom()
            goto L_0x0069
        L_0x0065:
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x0069:
            int r11 = r17.getChildCount()
            r12 = 0
        L_0x006e:
            if (r12 >= r11) goto L_0x00c6
            r13 = r17
            android.view.View r14 = r13.getChildAt(r12)
            if (r14 == r0) goto L_0x00c8
            int r15 = r14.getVisibility()
            r6 = 8
            if (r15 == r6) goto L_0x00bd
            if (r1 == 0) goto L_0x0084
            r6 = r3
            goto L_0x0085
        L_0x0084:
            r6 = r2
        L_0x0085:
            int r15 = r14.getLeft()
            int r6 = java.lang.Math.max(r6, r15)
            int r15 = r14.getTop()
            int r15 = java.lang.Math.max(r4, r15)
            if (r1 == 0) goto L_0x009b
            r16 = r1
            r0 = r2
            goto L_0x009e
        L_0x009b:
            r16 = r1
            r0 = r3
        L_0x009e:
            int r1 = r14.getRight()
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r14.getBottom()
            int r1 = java.lang.Math.min(r5, r1)
            if (r6 < r7) goto L_0x00b8
            if (r15 < r9) goto L_0x00b8
            if (r0 > r8) goto L_0x00b8
            if (r1 > r10) goto L_0x00b8
            r6 = 4
            goto L_0x00b9
        L_0x00b8:
            r6 = 0
        L_0x00b9:
            r14.setVisibility(r6)
            goto L_0x00bf
        L_0x00bd:
            r16 = r1
        L_0x00bf:
            int r12 = r12 + 1
            r1 = r16
            r0 = r18
            goto L_0x006e
        L_0x00c6:
            r13 = r17
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.p664ui.sliding.DmtSlidingPaneLayout.mo19084a(android.view.View):void");
    }

    public void requestChildFocus(View view, View view2) {
        boolean z;
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f28512b) {
            if (view == this.f28513c) {
                z = true;
            } else {
                z = false;
            }
            this.f28520j = z;
        }
    }

    /* renamed from: a */
    private boolean m21586a(View view, int i) {
        if (!this.f28529s && !m21585a(0.0f, 0)) {
            return false;
        }
        this.f28520j = false;
        return true;
    }

    /* renamed from: a */
    private boolean m21585a(float f, int i) {
        int i2;
        if (!this.f28512b) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) this.f28513c.getLayoutParams();
        if (mo19095e()) {
            i2 = (int) (((float) getWidth()) - ((((float) (getPaddingRight() + layoutParams.rightMargin)) + (f * ((float) this.f28515e))) + ((float) this.f28513c.getWidth())));
        } else {
            i2 = (int) (((float) (getPaddingLeft() + layoutParams.leftMargin)) + (f * ((float) this.f28515e)));
        }
        if (!this.f28519i.mo3575a(this.f28513c, i2, this.f28513c.getTop())) {
            return false;
        }
        mo19088c();
        C1056u.m3052d(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        r1 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0233  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r21, int r22) {
        /*
            r20 = this;
            r0 = r20
            android.content.Context r1 = r20.getContext()
        L_0x0006:
            r2 = 0
            if (r1 == 0) goto L_0x001b
            boolean r3 = r1 instanceof android.app.Activity
            if (r3 == 0) goto L_0x0010
            android.app.Activity r1 = (android.app.Activity) r1
            goto L_0x001c
        L_0x0010:
            boolean r3 = r1 instanceof android.content.ContextWrapper
            if (r3 == 0) goto L_0x001b
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L_0x0006
        L_0x001b:
            r1 = r2
        L_0x001c:
            int r3 = m21584a(r1)
            if (r3 != 0) goto L_0x0025
            int r3 = f28510x
            goto L_0x0029
        L_0x0025:
            int r3 = m21584a(r1)
        L_0x0029:
            int r4 = android.view.View.MeasureSpec.getMode(r21)
            int r5 = android.view.View.MeasureSpec.getSize(r21)
            int r6 = android.view.View.MeasureSpec.getMode(r22)
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r7 = "status_bar_height"
            java.lang.String r8 = "dimen"
            java.lang.String r9 = "android"
            int r7 = r1.getIdentifier(r7, r8, r9)
            r8 = 0
            if (r7 <= 0) goto L_0x004b
            int r1 = r1.getDimensionPixelSize(r7)
            goto L_0x004c
        L_0x004b:
            r1 = 0
        L_0x004c:
            int r3 = r3 + r1
            r1 = 300(0x12c, float:4.2E-43)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 1073741824(0x40000000, float:2.0)
            if (r4 == r9) goto L_0x006a
            boolean r10 = r20.isInEditMode()
            if (r10 == 0) goto L_0x0062
            if (r4 == r7) goto L_0x0081
            if (r4 != 0) goto L_0x0081
            r5 = 300(0x12c, float:4.2E-43)
            goto L_0x0081
        L_0x0062:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Width must have an exact value or MATCH_PARENT"
            r1.<init>(r2)
            throw r1
        L_0x006a:
            if (r6 != 0) goto L_0x0081
            boolean r4 = r20.isInEditMode()
            if (r4 == 0) goto L_0x0079
            if (r6 != 0) goto L_0x0081
            r3 = 300(0x12c, float:4.2E-43)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0081
        L_0x0079:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Height must not be UNSPECIFIED"
            r1.<init>(r2)
            throw r1
        L_0x0081:
            if (r6 == r7) goto L_0x0095
            if (r6 == r9) goto L_0x0088
            r1 = 0
            r3 = 0
            goto L_0x00a2
        L_0x0088:
            int r1 = r20.getPaddingTop()
            int r3 = r3 - r1
            int r1 = r20.getPaddingBottom()
            int r1 = r3 - r1
            r3 = r1
            goto L_0x00a2
        L_0x0095:
            int r1 = r20.getPaddingTop()
            int r3 = r3 - r1
            int r1 = r20.getPaddingBottom()
            int r1 = r3 - r1
            r3 = r1
            r1 = 0
        L_0x00a2:
            int r4 = r20.getPaddingLeft()
            int r4 = r5 - r4
            int r10 = r20.getPaddingRight()
            int r4 = r4 - r10
            int r10 = r20.getChildCount()
            r0.f28513c = r2
            r13 = r1
            r14 = r4
            r1 = 0
            r11 = 0
            r12 = 0
        L_0x00b8:
            r15 = 8
            r16 = 1
            if (r1 >= r10) goto L_0x015b
            android.view.View r7 = r0.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r18 = r7.getLayoutParams()
            r9 = r18
            com.bytedance.ies.dmt.ui.sliding.DmtSlidingPaneLayout$LayoutParams r9 = (com.bytedance.ies.dmt.p664ui.sliding.DmtSlidingPaneLayout.LayoutParams) r9
            int r2 = r7.getVisibility()
            if (r2 != r15) goto L_0x00d4
            r9.f28537c = r8
            goto L_0x0152
        L_0x00d4:
            float r2 = r9.f28535a
            r15 = 0
            int r2 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r2 <= 0) goto L_0x00e2
            float r2 = r9.f28535a
            float r12 = r12 + r2
            int r2 = r9.width
            if (r2 == 0) goto L_0x0152
        L_0x00e2:
            int r2 = r9.leftMargin
            int r15 = r9.rightMargin
            int r2 = r2 + r15
            int r15 = r9.width
            r8 = -2
            if (r15 != r8) goto L_0x00f7
            int r2 = r4 - r2
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r8)
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x010d
        L_0x00f7:
            int r8 = r9.width
            r15 = -1
            if (r8 != r15) goto L_0x0105
            int r2 = r4 - r2
            r8 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r8)
            goto L_0x010d
        L_0x0105:
            r8 = 1073741824(0x40000000, float:2.0)
            int r2 = r9.width
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r8)
        L_0x010d:
            int r15 = r9.height
            r8 = -2
            if (r15 != r8) goto L_0x0119
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r8)
            goto L_0x012d
        L_0x0119:
            int r8 = r9.height
            r15 = -1
            if (r8 != r15) goto L_0x0125
            r8 = 1073741824(0x40000000, float:2.0)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r8)
            goto L_0x012d
        L_0x0125:
            r8 = 1073741824(0x40000000, float:2.0)
            int r15 = r9.height
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r8)
        L_0x012d:
            r7.measure(r2, r15)
            int r2 = r7.getMeasuredWidth()
            int r8 = r7.getMeasuredHeight()
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 != r15) goto L_0x0142
            if (r8 <= r13) goto L_0x0142
            int r13 = java.lang.Math.min(r8, r3)
        L_0x0142:
            int r14 = r14 - r2
            if (r14 >= 0) goto L_0x0147
            r2 = 1
            goto L_0x0148
        L_0x0147:
            r2 = 0
        L_0x0148:
            r9.f28536b = r2
            r2 = r2 | r11
            boolean r8 = r9.f28536b
            if (r8 == 0) goto L_0x0151
            r0.f28513c = r7
        L_0x0151:
            r11 = r2
        L_0x0152:
            int r1 = r1 + 1
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 0
            r9 = 1073741824(0x40000000, float:2.0)
            goto L_0x00b8
        L_0x015b:
            if (r11 != 0) goto L_0x0162
            r1 = 0
            int r2 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x0259
        L_0x0162:
            int r1 = r0.f28525o
            int r1 = r4 - r1
            r2 = 0
        L_0x0167:
            if (r2 >= r10) goto L_0x0259
            android.view.View r6 = r0.getChildAt(r2)
            int r7 = r6.getVisibility()
            if (r7 == r15) goto L_0x024c
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            com.bytedance.ies.dmt.ui.sliding.DmtSlidingPaneLayout$LayoutParams r7 = (com.bytedance.ies.dmt.p664ui.sliding.DmtSlidingPaneLayout.LayoutParams) r7
            int r8 = r6.getVisibility()
            if (r8 == r15) goto L_0x024c
            int r8 = r7.width
            if (r8 != 0) goto L_0x018c
            float r8 = r7.f28535a
            r9 = 0
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x018c
            r8 = 1
            goto L_0x018d
        L_0x018c:
            r8 = 0
        L_0x018d:
            if (r8 == 0) goto L_0x0191
            r9 = 0
            goto L_0x0195
        L_0x0191:
            int r9 = r6.getMeasuredWidth()
        L_0x0195:
            if (r11 == 0) goto L_0x01e0
            android.view.View r15 = r0.f28513c
            if (r6 == r15) goto L_0x01e0
            int r15 = r7.width
            if (r15 >= 0) goto L_0x024c
            if (r9 > r1) goto L_0x01a8
            float r9 = r7.f28535a
            r15 = 0
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 <= 0) goto L_0x024c
        L_0x01a8:
            if (r8 == 0) goto L_0x01cd
            int r8 = r7.height
            r9 = -2
            if (r8 != r9) goto L_0x01b8
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r8)
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x01d7
        L_0x01b8:
            int r8 = r7.height
            r9 = -1
            if (r8 != r9) goto L_0x01c4
            r8 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r8)
            goto L_0x01d7
        L_0x01c4:
            r8 = 1073741824(0x40000000, float:2.0)
            int r7 = r7.height
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
            goto L_0x01d7
        L_0x01cd:
            r8 = 1073741824(0x40000000, float:2.0)
            int r7 = r6.getMeasuredHeight()
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
        L_0x01d7:
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            r6.measure(r9, r7)
            goto L_0x024c
        L_0x01e0:
            float r8 = r7.f28535a
            r15 = 0
            int r8 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r8 <= 0) goto L_0x024c
            int r8 = r7.width
            if (r8 != 0) goto L_0x0210
            int r8 = r7.height
            r15 = -2
            if (r8 != r15) goto L_0x01fb
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            int r17 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r8)
            r15 = r17
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x021c
        L_0x01fb:
            int r8 = r7.height
            r15 = -1
            if (r8 != r15) goto L_0x0207
            r8 = 1073741824(0x40000000, float:2.0)
            int r17 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r8)
            goto L_0x021a
        L_0x0207:
            r8 = 1073741824(0x40000000, float:2.0)
            int r15 = r7.height
            int r17 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r8)
            goto L_0x021a
        L_0x0210:
            r8 = 1073741824(0x40000000, float:2.0)
            int r15 = r6.getMeasuredHeight()
            int r17 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r8)
        L_0x021a:
            r15 = r17
        L_0x021c:
            if (r11 == 0) goto L_0x0233
            int r8 = r7.leftMargin
            int r7 = r7.rightMargin
            int r8 = r8 + r7
            int r7 = r4 - r8
            r19 = r1
            r8 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
            if (r9 == r7) goto L_0x024e
            r6.measure(r1, r15)
            goto L_0x024e
        L_0x0233:
            r19 = r1
            r1 = 0
            int r8 = java.lang.Math.max(r1, r14)
            float r7 = r7.f28535a
            float r8 = (float) r8
            float r7 = r7 * r8
            float r7 = r7 / r12
            int r7 = (int) r7
            int r9 = r9 + r7
            r7 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r7)
            r6.measure(r8, r15)
            goto L_0x0251
        L_0x024c:
            r19 = r1
        L_0x024e:
            r1 = 0
            r7 = 1073741824(0x40000000, float:2.0)
        L_0x0251:
            int r2 = r2 + 1
            r1 = r19
            r15 = 8
            goto L_0x0167
        L_0x0259:
            int r1 = r20.getPaddingTop()
            int r13 = r13 + r1
            int r1 = r20.getPaddingBottom()
            int r13 = r13 + r1
            r0.setMeasuredDimension(r5, r13)
            r0.f28512b = r11
            android.support.v4.widget.r r1 = r0.f28519i
            int r1 = r1.f3562a
            if (r1 == 0) goto L_0x0275
            if (r11 != 0) goto L_0x0275
            android.support.v4.widget.r r1 = r0.f28519i
            r1.mo3578b()
        L_0x0275:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.p664ui.sliding.DmtSlidingPaneLayout.onMeasure(int, int):void");
    }

    public DmtSlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float f = context.getResources().getDisplayMetrics().density;
        this.f28525o = 0;
        setWillNotDraw(false);
        C1056u.m3031a((View) this, (C1002a) new C10709a());
        C1056u.m3043b((View) this, 1);
        this.f28519i = C1119r.m3271a((ViewGroup) this, 0.5f, (C1122a) new C10711c());
        this.f28519i.f3569h = f * 400.0f;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (this.f28512b && !layoutParams.f28536b && this.f28513c != null) {
            canvas.getClipBounds(this.f28530t);
            if (mo19095e()) {
                this.f28530t.left = Math.max(this.f28530t.left, this.f28513c.getRight());
            } else {
                this.f28530t.right = Math.min(this.f28530t.right, this.f28513c.getLeft());
            }
            canvas.clipRect(this.f28530t);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo19085a(View view, float f, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f <= 0.0f || i == 0) {
            if (view.getLayerType() != 0) {
                if (layoutParams.f28538d != null) {
                    layoutParams.f28538d.setColorFilter(null);
                }
                C10710b bVar = new C10710b(view);
                this.f28521k.add(bVar);
                C1056u.m3034a((View) this, (Runnable) bVar);
            }
            return;
        }
        int i2 = (((int) (((float) ((-16777216 & i) >>> 24)) * f)) << 24) | (i & 16777215);
        if (layoutParams.f28538d == null) {
            layoutParams.f28538d = new Paint();
        }
        layoutParams.f28538d.setColorFilter(new PorterDuffColorFilter(i2, Mode.SRC_OVER));
        if (view.getLayerType() != 2) {
            view.setLayerType(2, layoutParams.f28538d);
        }
        mo19087b(view);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f28529s = true;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z2;
        float f;
        boolean e = mo19095e();
        if (e) {
            this.f28519i.f3571j = 2;
        } else {
            this.f28519i.f3571j = 1;
        }
        int i13 = i3 - i;
        if (e) {
            i5 = getPaddingRight();
        } else {
            i5 = getPaddingLeft();
        }
        if (e) {
            i6 = getPaddingLeft();
        } else {
            i6 = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f28529s) {
            if (!this.f28512b || !this.f28520j) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            this.f28514d = f;
        }
        int i14 = i5;
        int i15 = i14;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f28536b) {
                    int i17 = i13 - i6;
                    int min = (Math.min(i14, i17 - this.f28525o) - i15) - (layoutParams.leftMargin + layoutParams.rightMargin);
                    this.f28515e = min;
                    if (e) {
                        i12 = layoutParams.rightMargin;
                    } else {
                        i12 = layoutParams.leftMargin;
                    }
                    if (i15 + i12 + min + (measuredWidth / 2) > i17) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    layoutParams.f28537c = z2;
                    int i18 = (int) (((float) min) * this.f28514d);
                    i8 = i12 + i18 + i15;
                    this.f28514d = ((float) i18) / ((float) this.f28515e);
                    i7 = 0;
                } else {
                    if (!this.f28512b || this.f28517g == 0) {
                        i11 = 0;
                    } else {
                        i11 = (int) ((1.0f - this.f28514d) * ((float) this.f28517g));
                    }
                    i7 = i11;
                    i8 = i14;
                }
                if (e) {
                    i9 = (i13 - i8) + i7;
                    i10 = i9 - measuredWidth;
                } else {
                    i10 = i8 - i7;
                    i9 = i10 + measuredWidth;
                }
                childAt.layout(i10, paddingTop, i9, childAt.getMeasuredHeight() + paddingTop);
                i14 += childAt.getWidth();
                i15 = i8;
            }
        }
        if (this.f28529s) {
            if (this.f28512b) {
                if (this.f28517g != 0) {
                    mo19083a(this.f28514d);
                }
                if (((LayoutParams) this.f28513c.getLayoutParams()).f28537c) {
                    mo19085a(this.f28513c, this.f28514d, this.f28511a);
                }
            } else {
                for (int i19 = 0; i19 < childCount; i19++) {
                    mo19085a(getChildAt(i19), 0.0f, this.f28511a);
                }
            }
            mo19084a(this.f28513c);
        }
        this.f28529s = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo19086a(View view, boolean z, int i, int i2, int i3) {
        int i4;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight()) {
                    int i6 = i3 + scrollY;
                    if (i6 >= childAt.getTop() && i6 < childAt.getBottom()) {
                        if (mo19086a(childAt, true, i, i5 - childAt.getLeft(), i6 - childAt.getTop())) {
                            return true;
                        }
                    }
                }
            }
        }
        if (z) {
            if (mo19095e()) {
                i4 = i;
            } else {
                i4 = -i;
            }
            if (view.canScrollHorizontally(i4)) {
                return true;
            }
        }
        return false;
    }
}
