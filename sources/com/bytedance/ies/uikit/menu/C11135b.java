package com.bytedance.ies.uikit.menu;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.uikit.menu.SlidingMenu.C11126a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.uikit.menu.b */
public final class C11135b extends ViewGroup {

    /* renamed from: a */
    int f30006a;

    /* renamed from: b */
    View f30007b;

    /* renamed from: c */
    View f30008c;

    /* renamed from: d */
    int f30009d;

    /* renamed from: e */
    int f30010e;

    /* renamed from: f */
    boolean f30011f;

    /* renamed from: g */
    final Paint f30012g;

    /* renamed from: h */
    float f30013h;

    /* renamed from: i */
    Drawable f30014i;

    /* renamed from: j */
    Drawable f30015j;

    /* renamed from: k */
    int f30016k;

    /* renamed from: l */
    float f30017l;

    /* renamed from: m */
    boolean f30018m;

    /* renamed from: n */
    Bitmap f30019n;

    /* renamed from: o */
    View f30020o;

    /* renamed from: p */
    private C11132a f30021p;

    /* renamed from: q */
    private int f30022q;

    /* renamed from: r */
    private int f30023r;

    /* renamed from: s */
    private C11126a f30024s;

    /* renamed from: t */
    private boolean f30025t;

    public final View getContent() {
        return this.f30007b;
    }

    public final int getMode() {
        return this.f30010e;
    }

    public final float getScrollScale() {
        return this.f30013h;
    }

    public final View getSecondaryContent() {
        return this.f30008c;
    }

    public final int getBehindWidth() {
        return this.f30007b.getWidth();
    }

    public final int getSecondaryBehindWidth() {
        return this.f30008c.getWidth();
    }

    /* access modifiers changed from: 0000 */
    public int getSelectorTop() {
        return this.f30020o.getTop() + ((this.f30020o.getHeight() - this.f30019n.getHeight()) / 2);
    }

    public final void setCanvasTransformer(C11126a aVar) {
        this.f30024s = aVar;
    }

    public final void setChildrenEnabled(boolean z) {
        this.f30025t = z;
    }

    public final void setCustomViewAbove(C11132a aVar) {
        this.f30021p = aVar;
    }

    public final void setFadeEnabled(boolean z) {
        this.f30011f = z;
    }

    public final void setScrollScale(float f) {
        this.f30013h = f;
    }

    public final void setSelectorEnabled(boolean z) {
        this.f30018m = z;
    }

    public final void setTouchMode(int i) {
        this.f30006a = i;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f30025t) {
            return true;
        }
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f30025t) {
            return true;
        }
        return false;
    }

    public final void setSecondaryShadowDrawable(Drawable drawable) {
        this.f30015j = drawable;
        invalidate();
    }

    public final void setSecondaryWidthOffset(int i) {
        this.f30023r = i;
        requestLayout();
    }

    public final void setSelectorBitmap(Bitmap bitmap) {
        this.f30019n = bitmap;
        refreshDrawableState();
    }

    public final void setShadowDrawable(Drawable drawable) {
        this.f30014i = drawable;
        invalidate();
    }

    public final void setShadowWidth(int i) {
        this.f30016k = i;
        invalidate();
    }

    public final void setWidthOffset(int i) {
        this.f30022q = i;
        requestLayout();
    }

    /* renamed from: a */
    public final int mo20318a(int i) {
        if (i > 1) {
            i = 2;
        } else if (i <= 0) {
            i = 0;
        }
        if (this.f30010e == 0 && i > 1) {
            return 0;
        }
        if (this.f30010e != 1 || i > 0) {
            return i;
        }
        return 2;
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        if (this.f30024s != null) {
            canvas.save();
            this.f30021p.getPercentOpen();
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    public final void setContent(View view) {
        if (this.f30007b != null) {
            removeView(this.f30007b);
        }
        this.f30007b = view;
        addView(this.f30007b);
    }

    public final void setFadeDegree(float f) {
        if (f > 1.0f || f < 0.0f) {
            throw new IllegalStateException("The BehindFadeDegree must be between 0.0f and 1.0f");
        }
        this.f30017l = f;
    }

    public final void setMode(int i) {
        if (i == 0 || i == 1) {
            if (this.f30007b != null) {
                this.f30007b.setVisibility(0);
            }
            if (this.f30008c != null) {
                this.f30008c.setVisibility(4);
            }
        }
        this.f30010e = i;
    }

    public final void setSecondaryContent(View view) {
        if (this.f30008c != null) {
            removeView(this.f30008c);
        }
        this.f30008c = view;
        addView(this.f30008c);
    }

    public final void setSelectedView(View view) {
        if (this.f30020o != null) {
            this.f30020o.setTag(R.id.ckw, null);
            this.f30020o = null;
        }
        if (view != null && view.getParent() != null) {
            this.f30020o = view;
            this.f30020o.setTag(R.id.ckw, "CustomViewBehindSelectedView");
            invalidate();
        }
    }

    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        if (this.f30024s != null) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int defaultSize = getDefaultSize(0, i);
        int defaultSize2 = getDefaultSize(0, i2);
        setMeasuredDimension(defaultSize, defaultSize2);
        int childMeasureSpec = getChildMeasureSpec(i, 0, defaultSize - this.f30022q);
        int childMeasureSpec2 = getChildMeasureSpec(i2, 0, defaultSize2);
        this.f30007b.measure(childMeasureSpec, childMeasureSpec2);
        if (this.f30008c != null) {
            this.f30008c.measure(getChildMeasureSpec(i, 0, defaultSize - this.f30023r), childMeasureSpec2);
        }
    }

    /* renamed from: a */
    public final int mo20319a(View view, int i) {
        if (this.f30010e == 0) {
            if (i == 0) {
                return view.getLeft() - getBehindWidth();
            }
            if (i == 2) {
                return view.getLeft();
            }
        } else if (this.f30010e == 1) {
            if (i == 0) {
                return view.getLeft();
            }
            if (i == 2) {
                return view.getLeft() + getSecondaryBehindWidth();
            }
        } else if (this.f30010e == 2) {
            if (i == 0) {
                return view.getLeft() - getBehindWidth();
            }
            if (i == 2) {
                return view.getLeft() + getSecondaryBehindWidth();
            }
        }
        return view.getLeft();
    }

    /* renamed from: a */
    public final boolean mo20320a(View view, int i, float f) {
        if (this.f30010e == 0 || (this.f30010e == 2 && i == 0)) {
            if (f >= ((float) view.getLeft())) {
                return true;
            }
            return false;
        } else if ((this.f30010e == 1 || (this.f30010e == 2 && i == 2)) && f <= ((float) view.getRight())) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        this.f30007b.layout(0, 0, i5 - this.f30022q, i6);
        if (this.f30008c != null) {
            this.f30008c.layout(0, 0, i5 - this.f30023r, i6);
        }
    }
}
