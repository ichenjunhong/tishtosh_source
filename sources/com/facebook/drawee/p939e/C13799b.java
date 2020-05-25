package com.facebook.drawee.p939e;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.common.p920d.C13689i;

/* renamed from: com.facebook.drawee.e.b */
public final class C13799b extends C13804g implements Runnable {

    /* renamed from: a */
    public boolean f35963a;

    /* renamed from: b */
    float f35964b;

    /* renamed from: c */
    private int f35965c;

    /* renamed from: d */
    private boolean f35966d;

    public final void run() {
        this.f35966d = false;
        this.f35964b += (float) ((int) ((20.0f / ((float) this.f35965c)) * 360.0f));
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right - bounds.left;
        int i2 = bounds.bottom - bounds.top;
        float f = this.f35964b;
        if (!this.f35963a) {
            f = 360.0f - this.f35964b;
        }
        canvas.rotate(f, (float) (bounds.left + (i / 2)), (float) (bounds.top + (i2 / 2)));
        super.draw(canvas);
        canvas.restoreToCount(save);
        if (!this.f35966d) {
            this.f35966d = true;
            scheduleSelf(this, SystemClock.uptimeMillis() + 20);
        }
    }

    public C13799b(Drawable drawable, int i) {
        this(drawable, i, true);
    }

    private C13799b(Drawable drawable, int i, boolean z) {
        super((Drawable) C13689i.m27652a(drawable));
        this.f35964b = 0.0f;
        this.f35966d = false;
        this.f35965c = i;
        this.f35963a = true;
    }
}
