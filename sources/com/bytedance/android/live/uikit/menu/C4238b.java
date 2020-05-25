package com.bytedance.android.live.uikit.menu;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.uikit.menu.SlidingMenu.C4229a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.uikit.menu.b */
public final class C4238b extends ViewGroup {

    /* renamed from: a */
    int f11580a;

    /* renamed from: b */
    View f11581b;

    /* renamed from: c */
    View f11582c;

    /* renamed from: d */
    int f11583d;

    /* renamed from: e */
    int f11584e;

    /* renamed from: f */
    boolean f11585f;

    /* renamed from: g */
    final Paint f11586g;

    /* renamed from: h */
    float f11587h;

    /* renamed from: i */
    Drawable f11588i;

    /* renamed from: j */
    Drawable f11589j;

    /* renamed from: k */
    int f11590k;

    /* renamed from: l */
    float f11591l;

    /* renamed from: m */
    boolean f11592m;

    /* renamed from: n */
    Bitmap f11593n;

    /* renamed from: o */
    View f11594o;

    /* renamed from: p */
    private C4235a f11595p;

    /* renamed from: q */
    private int f11596q;

    /* renamed from: r */
    private int f11597r;

    /* renamed from: s */
    private C4229a f11598s;

    /* renamed from: t */
    private boolean f11599t;

    public final View getContent() {
        return this.f11581b;
    }

    public final int getMode() {
        return this.f11584e;
    }

    public final float getScrollScale() {
        return this.f11587h;
    }

    public final View getSecondaryContent() {
        return this.f11582c;
    }

    public final int getBehindWidth() {
        return this.f11581b.getWidth();
    }

    public final int getSecondaryBehindWidth() {
        return this.f11582c.getWidth();
    }

    /* access modifiers changed from: 0000 */
    public int getSelectorTop() {
        return this.f11594o.getTop() + ((this.f11594o.getHeight() - this.f11593n.getHeight()) / 2);
    }

    public final void setCanvasTransformer(C4229a aVar) {
        this.f11598s = aVar;
    }

    public final void setChildrenEnabled(boolean z) {
        this.f11599t = z;
    }

    public final void setCustomViewAbove(C4235a aVar) {
        this.f11595p = aVar;
    }

    public final void setFadeEnabled(boolean z) {
        this.f11585f = z;
    }

    public final void setScrollScale(float f) {
        this.f11587h = f;
    }

    public final void setSelectorEnabled(boolean z) {
        this.f11592m = z;
    }

    public final void setTouchMode(int i) {
        this.f11580a = i;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f11599t) {
            return true;
        }
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f11599t) {
            return true;
        }
        return false;
    }

    public final void setSecondaryShadowDrawable(Drawable drawable) {
        this.f11589j = drawable;
        invalidate();
    }

    public final void setSecondaryWidthOffset(int i) {
        this.f11597r = i;
        requestLayout();
    }

    public final void setSelectorBitmap(Bitmap bitmap) {
        this.f11593n = bitmap;
        refreshDrawableState();
    }

    public final void setShadowDrawable(Drawable drawable) {
        this.f11588i = drawable;
        invalidate();
    }

    public final void setShadowWidth(int i) {
        this.f11590k = i;
        invalidate();
    }

    public final void setWidthOffset(int i) {
        this.f11596q = i;
        requestLayout();
    }

    /* renamed from: a */
    public final int mo9808a(int i) {
        if (i > 1) {
            i = 2;
        } else if (i <= 0) {
            i = 0;
        }
        if (this.f11584e == 0 && i > 1) {
            return 0;
        }
        if (this.f11584e != 1 || i > 0) {
            return i;
        }
        return 2;
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        if (this.f11598s != null) {
            canvas.save();
            this.f11595p.getPercentOpen();
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    public final void setContent(View view) {
        if (this.f11581b != null) {
            removeView(this.f11581b);
        }
        this.f11581b = view;
        addView(this.f11581b);
    }

    public final void setFadeDegree(float f) {
        if (f > 1.0f || f < 0.0f) {
            throw new IllegalStateException("The BehindFadeDegree must be between 0.0f and 1.0f");
        }
        this.f11591l = f;
    }

    public final void setMode(int i) {
        if (i == 0 || i == 1) {
            if (this.f11581b != null) {
                this.f11581b.setVisibility(0);
            }
            if (this.f11582c != null) {
                this.f11582c.setVisibility(4);
            }
        }
        this.f11584e = i;
    }

    public final void setSecondaryContent(View view) {
        if (this.f11582c != null) {
            removeView(this.f11582c);
        }
        this.f11582c = view;
        addView(this.f11582c);
    }

    public final void setSelectedView(View view) {
        if (this.f11594o != null) {
            this.f11594o.setTag(R.id.ckw, null);
            this.f11594o = null;
        }
        if (view != null && view.getParent() != null) {
            this.f11594o = view;
            this.f11594o.setTag(R.id.ckw, "CustomViewBehindSelectedView");
            invalidate();
        }
    }

    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        if (this.f11598s != null) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int defaultSize = getDefaultSize(0, i);
        int defaultSize2 = getDefaultSize(0, i2);
        setMeasuredDimension(defaultSize, defaultSize2);
        int childMeasureSpec = getChildMeasureSpec(i, 0, defaultSize - this.f11596q);
        int childMeasureSpec2 = getChildMeasureSpec(i2, 0, defaultSize2);
        this.f11581b.measure(childMeasureSpec, childMeasureSpec2);
        if (this.f11582c != null) {
            this.f11582c.measure(getChildMeasureSpec(i, 0, defaultSize - this.f11597r), childMeasureSpec2);
        }
    }

    /* renamed from: a */
    public final int mo9809a(View view, int i) {
        if (this.f11584e == 0) {
            if (i == 0) {
                return view.getLeft() - getBehindWidth();
            }
            if (i == 2) {
                return view.getLeft();
            }
        } else if (this.f11584e == 1) {
            if (i == 0) {
                return view.getLeft();
            }
            if (i == 2) {
                return view.getLeft() + getSecondaryBehindWidth();
            }
        } else if (this.f11584e == 2) {
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
    public final boolean mo9810a(View view, int i, float f) {
        if (this.f11584e == 0 || (this.f11584e == 2 && i == 0)) {
            if (f >= ((float) view.getLeft())) {
                return true;
            }
            return false;
        } else if ((this.f11584e == 1 || (this.f11584e == 2 && i == 2)) && f <= ((float) view.getRight())) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        this.f11581b.layout(0, 0, i5 - this.f11596q, i6);
        if (this.f11582c != null) {
            this.f11582c.layout(0, 0, i5 - this.f11597r, i6);
        }
    }
}
