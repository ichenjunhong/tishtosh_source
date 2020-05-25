package com.facebook.drawee.p939e;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

/* renamed from: com.facebook.drawee.e.g */
public class C13804g extends Drawable implements Callback, C13800c, C13829r, C13830s {
    private static final Matrix sTempTransform = new Matrix();
    private Drawable mCurrentDelegate;
    private final C13801d mDrawableProperties = new C13801d();
    protected C13830s mTransformCallback;

    public Drawable getCurrent() {
        return this.mCurrentDelegate;
    }

    public Drawable getDrawable() {
        return getCurrent();
    }

    public ConstantState getConstantState() {
        if (this.mCurrentDelegate == null) {
            return super.getConstantState();
        }
        return this.mCurrentDelegate.getConstantState();
    }

    public int getIntrinsicHeight() {
        if (this.mCurrentDelegate == null) {
            return super.getIntrinsicHeight();
        }
        return this.mCurrentDelegate.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        if (this.mCurrentDelegate == null) {
            return super.getIntrinsicWidth();
        }
        return this.mCurrentDelegate.getIntrinsicWidth();
    }

    public int getOpacity() {
        if (this.mCurrentDelegate == null) {
            return 0;
        }
        return this.mCurrentDelegate.getOpacity();
    }

    public boolean isStateful() {
        if (this.mCurrentDelegate == null) {
            return false;
        }
        return this.mCurrentDelegate.isStateful();
    }

    public Drawable mutate() {
        if (this.mCurrentDelegate != null) {
            this.mCurrentDelegate.mutate();
        }
        return this;
    }

    public void getTransform(Matrix matrix) {
        getParentTransform(matrix);
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void setTransformCallback(C13830s sVar) {
        this.mTransformCallback = sVar;
    }

    public Drawable setCurrent(Drawable drawable) {
        Drawable currentWithoutInvalidate = setCurrentWithoutInvalidate(drawable);
        invalidateSelf();
        return currentWithoutInvalidate;
    }

    public Drawable setDrawable(Drawable drawable) {
        return setCurrent(drawable);
    }

    public void draw(Canvas canvas) {
        if (this.mCurrentDelegate != null) {
            this.mCurrentDelegate.draw(canvas);
        }
    }

    public boolean getPadding(Rect rect) {
        if (this.mCurrentDelegate == null) {
            return super.getPadding(rect);
        }
        return this.mCurrentDelegate.getPadding(rect);
    }

    /* access modifiers changed from: protected */
    public void getParentTransform(Matrix matrix) {
        if (this.mTransformCallback != null) {
            this.mTransformCallback.getTransform(matrix);
        } else {
            matrix.reset();
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.mCurrentDelegate != null) {
            this.mCurrentDelegate.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        if (this.mCurrentDelegate == null) {
            return super.onLevelChange(i);
        }
        return this.mCurrentDelegate.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        if (this.mCurrentDelegate == null) {
            return super.onStateChange(iArr);
        }
        return this.mCurrentDelegate.setState(iArr);
    }

    public void setAlpha(int i) {
        this.mDrawableProperties.f35967a = i;
        if (this.mCurrentDelegate != null) {
            this.mCurrentDelegate.setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.mDrawableProperties.mo25807a(colorFilter);
        if (this.mCurrentDelegate != null) {
            this.mCurrentDelegate.setColorFilter(colorFilter);
        }
    }

    public void setDither(boolean z) {
        this.mDrawableProperties.mo25809a(z);
        if (this.mCurrentDelegate != null) {
            this.mCurrentDelegate.setDither(z);
        }
    }

    public void setFilterBitmap(boolean z) {
        this.mDrawableProperties.mo25810b(z);
        if (this.mCurrentDelegate != null) {
            this.mCurrentDelegate.setFilterBitmap(z);
        }
    }

    public C13804g(Drawable drawable) {
        this.mCurrentDelegate = drawable;
        C13802e.m27985a(this.mCurrentDelegate, this, this);
    }

    public void getRootBounds(RectF rectF) {
        if (this.mTransformCallback != null) {
            this.mTransformCallback.getRootBounds(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    public void getTransformedBounds(RectF rectF) {
        getParentTransform(sTempTransform);
        rectF.set(getBounds());
        sTempTransform.mapRect(rectF);
    }

    /* access modifiers changed from: protected */
    public Drawable setCurrentWithoutInvalidate(Drawable drawable) {
        Drawable drawable2 = this.mCurrentDelegate;
        C13802e.m27985a(drawable2, null, null);
        C13802e.m27985a(drawable, null, null);
        C13802e.m27987a(drawable, this.mDrawableProperties);
        C13802e.m27986a(drawable, (Drawable) this);
        C13802e.m27985a(drawable, this, this);
        this.mCurrentDelegate = drawable;
        return drawable2;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public void setHotspot(float f, float f2) {
        if (this.mCurrentDelegate != null) {
            this.mCurrentDelegate.setHotspot(f, f2);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.mCurrentDelegate == null) {
            return visible;
        }
        return this.mCurrentDelegate.setVisible(z, z2);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }
}
