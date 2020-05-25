package com.facebook.drawee.p939e;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import com.facebook.imagepipeline.p976p.C14237b;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.drawee.e.k */
public final class C13808k extends C13813n {

    /* renamed from: A */
    private WeakReference<Bitmap> f35990A;

    /* renamed from: a */
    public final Paint f35991a = new Paint();

    /* renamed from: y */
    private final Paint f35992y = new Paint(1);

    /* renamed from: z */
    private final Bitmap f35993z;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo25850a() {
        if (!super.mo25850a() || this.f35993z == null) {
            return false;
        }
        return true;
    }

    public final int getIntrinsicHeight() {
        if (this.f35993z != null) {
            return this.f35993z.getHeight();
        }
        return super.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        if (this.f35993z != null) {
            return this.f35993z.getWidth();
        }
        return super.getIntrinsicWidth();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f35991a.setColorFilter(colorFilter);
    }

    public final void setAlpha(int i) {
        super.setAlpha(i);
        if (i != this.f35991a.getAlpha()) {
            this.f35991a.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        if (C14237b.m29187b()) {
            C14237b.m29186a("RoundedBitmapDrawable#draw");
        }
        if (!mo25850a()) {
            super.draw(canvas);
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
            return;
        }
        mo25863b();
        mo25864c();
        if (this.f35990A == null || this.f35990A.get() != this.f35993z) {
            this.f35990A = new WeakReference<>(this.f35993z);
            this.f35991a.setFilterBitmap(true);
            Paint paint = this.f35991a;
            Bitmap bitmap = this.f35993z;
            TileMode tileMode = TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            this.f36034g = true;
        }
        if (this.f36034g) {
            this.f35991a.getShader().setLocalMatrix(this.f36051x);
            this.f36034g = false;
        }
        int save = canvas.save();
        canvas.concat(this.f36048u);
        canvas.drawPath(this.f36033f, this.f35991a);
        if (this.f36032e > 0.0f) {
            this.f35992y.setStrokeWidth(this.f36032e);
            this.f35992y.setColor(C13802e.m27984a(this.f36035h, this.f35991a.getAlpha()));
            canvas.drawPath(this.f36036i, this.f35992y);
        }
        canvas.restoreToCount(save);
        if (C14237b.m29187b()) {
            C14237b.m29185a();
        }
    }

    public C13808k(Resources resources, Bitmap bitmap, Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        this.f35993z = bitmap;
        if (VERSION.SDK_INT >= 24 && (this.f36029b instanceof BitmapDrawable) && this.f35993z != null && this.f35993z.getDensity() == DisplayMetrics.DENSITY_DEVICE_STABLE) {
            ((BitmapDrawable) this.f36029b).setTargetDensity(DisplayMetrics.DENSITY_DEVICE_STABLE);
        }
        if (paint != null) {
            this.f35991a.set(paint);
        }
        this.f35991a.setFlags(1);
        this.f35992y.setStyle(Style.STROKE);
    }
}
