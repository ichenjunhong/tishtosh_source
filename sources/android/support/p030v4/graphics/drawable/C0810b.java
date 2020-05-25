package android.support.p030v4.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v4.graphics.drawable.b */
public abstract class C0810b extends Drawable {

    /* renamed from: a */
    public final Bitmap f2751a;

    /* renamed from: b */
    public int f2752b = 119;

    /* renamed from: c */
    public final Paint f2753c = new Paint(3);

    /* renamed from: d */
    public float f2754d;

    /* renamed from: e */
    final Rect f2755e = new Rect();

    /* renamed from: f */
    public boolean f2756f;

    /* renamed from: g */
    private int f2757g = 160;

    /* renamed from: h */
    private final BitmapShader f2758h;

    /* renamed from: i */
    private final Matrix f2759i = new Matrix();

    /* renamed from: j */
    private final RectF f2760j = new RectF();

    /* renamed from: k */
    private boolean f2761k = true;

    /* renamed from: l */
    private int f2762l;

    /* renamed from: m */
    private int f2763m;

    /* renamed from: b */
    private static boolean m2339b(float f) {
        return f > 0.05f;
    }

    public int getIntrinsicHeight() {
        return this.f2763m;
    }

    public int getIntrinsicWidth() {
        return this.f2762l;
    }

    public int getAlpha() {
        return this.f2753c.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.f2753c.getColorFilter();
    }

    public int getOpacity() {
        if (this.f2752b != 119 || this.f2756f) {
            return -3;
        }
        Bitmap bitmap = this.f2751a;
        if (bitmap == null || bitmap.hasAlpha() || this.f2753c.getAlpha() < 255 || m2339b(this.f2754d)) {
            return -3;
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2608a() {
        if (this.f2761k) {
            if (this.f2756f) {
                int min = Math.min(this.f2762l, this.f2763m);
                mo2610a(this.f2752b, min, min, getBounds(), this.f2755e);
                int min2 = Math.min(this.f2755e.width(), this.f2755e.height());
                this.f2755e.inset(Math.max(0, (this.f2755e.width() - min2) / 2), Math.max(0, (this.f2755e.height() - min2) / 2));
                this.f2754d = ((float) min2) * 0.5f;
            } else {
                mo2610a(this.f2752b, this.f2762l, this.f2763m, getBounds(), this.f2755e);
            }
            this.f2760j.set(this.f2755e);
            if (this.f2758h != null) {
                this.f2759i.setTranslate(this.f2760j.left, this.f2760j.top);
                this.f2759i.preScale(this.f2760j.width() / ((float) this.f2751a.getWidth()), this.f2760j.height() / ((float) this.f2751a.getHeight()));
                this.f2758h.setLocalMatrix(this.f2759i);
                this.f2753c.setShader(this.f2758h);
            }
            this.f2761k = false;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2753c.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDither(boolean z) {
        this.f2753c.setDither(z);
        invalidateSelf();
    }

    public void setFilterBitmap(boolean z) {
        this.f2753c.setFilterBitmap(z);
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f2756f) {
            this.f2754d = (float) (Math.min(this.f2763m, this.f2762l) / 2);
        }
        this.f2761k = true;
    }

    public void setAlpha(int i) {
        if (i != this.f2753c.getAlpha()) {
            this.f2753c.setAlpha(i);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public final void mo2609a(float f) {
        if (this.f2754d != f) {
            this.f2756f = false;
            if (m2339b(f)) {
                this.f2753c.setShader(this.f2758h);
            } else {
                this.f2753c.setShader(null);
            }
            this.f2754d = f;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f2751a;
        if (bitmap != null) {
            mo2608a();
            if (this.f2753c.getShader() == null) {
                canvas.drawBitmap(bitmap, null, this.f2755e, this.f2753c);
            } else {
                canvas.drawRoundRect(this.f2760j, this.f2754d, this.f2754d, this.f2753c);
            }
        }
    }

    C0810b(Resources resources, Bitmap bitmap) {
        if (resources != null) {
            this.f2757g = resources.getDisplayMetrics().densityDpi;
        }
        this.f2751a = bitmap;
        if (this.f2751a != null) {
            this.f2762l = this.f2751a.getScaledWidth(this.f2757g);
            this.f2763m = this.f2751a.getScaledHeight(this.f2757g);
            Bitmap bitmap2 = this.f2751a;
            TileMode tileMode = TileMode.CLAMP;
            this.f2758h = new BitmapShader(bitmap2, tileMode, tileMode);
            return;
        }
        this.f2763m = -1;
        this.f2762l = -1;
        this.f2758h = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2610a(int i, int i2, int i3, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }
}
