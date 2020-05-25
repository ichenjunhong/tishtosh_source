package com.bytedance.ies.uikit.imageview.imagezoom.p701b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: com.bytedance.ies.uikit.imageview.imagezoom.b.a */
public final class C11116a extends Drawable {

    /* renamed from: a */
    protected Bitmap f29956a;

    /* renamed from: b */
    protected Paint f29957b = new Paint();

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return this.f29956a.getHeight();
    }

    public final int getIntrinsicWidth() {
        return this.f29956a.getWidth();
    }

    public final int getMinimumHeight() {
        return this.f29956a.getHeight();
    }

    public final int getMinimumWidth() {
        return this.f29956a.getWidth();
    }

    public final void setAlpha(int i) {
        this.f29957b.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29957b.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        canvas.drawBitmap(this.f29956a, 0.0f, 0.0f, this.f29957b);
    }

    public C11116a(Bitmap bitmap) {
        this.f29956a = bitmap;
        this.f29957b.setDither(true);
        this.f29957b.setFilterBitmap(true);
    }
}
