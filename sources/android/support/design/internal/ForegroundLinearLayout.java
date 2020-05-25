package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p043v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.Gravity;
import com.ss.android.ugc.trill.R;

public class ForegroundLinearLayout extends LinearLayoutCompat {

    /* renamed from: a */
    protected boolean f1476a;

    /* renamed from: b */
    boolean f1477b;

    /* renamed from: c */
    private Drawable f1478c;

    /* renamed from: d */
    private final Rect f1479d;

    /* renamed from: e */
    private final Rect f1480e;

    /* renamed from: h */
    private int f1481h;

    public Drawable getForeground() {
        return this.f1478c;
    }

    public int getForegroundGravity() {
        return this.f1481h;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f1478c != null) {
            this.f1478c.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f1478c != null && this.f1478c.isStateful()) {
            this.f1478c.setState(getDrawableState());
        }
    }

    public ForegroundLinearLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f1478c) {
            return true;
        }
        return false;
    }

    public void setForegroundGravity(int i) {
        if (this.f1481h != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f1481h = i;
            if (this.f1481h == 119 && this.f1478c != null) {
                this.f1478c.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1478c != null) {
            Drawable drawable = this.f1478c;
            if (this.f1477b) {
                this.f1477b = false;
                Rect rect = this.f1479d;
                Rect rect2 = this.f1480e;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f1476a) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f1481h, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public void setForeground(Drawable drawable) {
        if (this.f1478c != drawable) {
            if (this.f1478c != null) {
                this.f1478c.setCallback(null);
                unscheduleDrawable(this.f1478c);
            }
            this.f1478c = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f1481h == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        if (this.f1478c != null) {
            this.f1478c.setHotspot(f, f2);
        }
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1479d = new Rect();
        this.f1480e = new Rect();
        this.f1481h = 119;
        this.f1476a = true;
        this.f1477b = false;
        TypedArray a = C0456f.m1107a(context, attributeSet, new int[]{16843017, 16843264, R.attr.mg}, i, 0, new int[0]);
        this.f1481h = a.getInt(1, this.f1481h);
        Drawable drawable = a.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f1476a = a.getBoolean(2, true);
        a.recycle();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f1477b = true;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f1477b = z | this.f1477b;
    }
}
