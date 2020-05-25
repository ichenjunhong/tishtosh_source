package com.facebook.drawee.p939e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.drawee.e.h */
public final class C13805h extends C13804g {

    /* renamed from: a */
    public Matrix f35981a;

    /* renamed from: b */
    private Matrix f35982b;

    /* renamed from: c */
    private int f35983c;

    /* renamed from: d */
    private int f35984d;

    /* renamed from: a */
    private void m27997a() {
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f35983c = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f35984d = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f35982b = null;
            return;
        }
        current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        this.f35982b = this.f35981a;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m27997a();
    }

    public final Drawable setCurrent(Drawable drawable) {
        Drawable current = super.setCurrent(drawable);
        m27997a();
        return current;
    }

    public final void getTransform(Matrix matrix) {
        super.getTransform(matrix);
        if (this.f35982b != null) {
            matrix.preConcat(this.f35982b);
        }
    }

    public final void draw(Canvas canvas) {
        if (!(this.f35983c == getCurrent().getIntrinsicWidth() && this.f35984d == getCurrent().getIntrinsicHeight())) {
            m27997a();
        }
        if (this.f35982b != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.f35982b);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }
}
