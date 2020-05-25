package p2674it.sephiroth.android.library.imagezoom.p2676a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: it.sephiroth.android.library.imagezoom.a.a */
public final class C53187a extends Drawable {

    /* renamed from: a */
    public Bitmap f131761a;

    /* renamed from: b */
    public Paint f131762b;

    /* renamed from: c */
    protected int f131763c;

    /* renamed from: d */
    protected int f131764d;

    public final int getIntrinsicHeight() {
        return this.f131764d;
    }

    public final int getIntrinsicWidth() {
        return this.f131763c;
    }

    public final int getMinimumHeight() {
        return this.f131764d;
    }

    public final int getMinimumWidth() {
        return this.f131763c;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.f131762b.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f131762b.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        if (this.f131761a != null && !this.f131761a.isRecycled()) {
            canvas.drawBitmap(this.f131761a, 0.0f, 0.0f, this.f131762b);
        }
    }

    public C53187a(Bitmap bitmap) {
        this.f131761a = bitmap;
        if (this.f131761a != null) {
            this.f131763c = this.f131761a.getWidth();
            this.f131764d = this.f131761a.getHeight();
        } else {
            this.f131763c = 0;
            this.f131764d = 0;
        }
        this.f131762b = new Paint();
        this.f131762b.setDither(true);
        this.f131762b.setFilterBitmap(true);
    }
}
