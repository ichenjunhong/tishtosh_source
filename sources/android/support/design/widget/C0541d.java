package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.support.p030v4.graphics.C0803a;

/* renamed from: android.support.design.widget.d */
public final class C0541d extends Drawable {

    /* renamed from: a */
    final Paint f1885a;

    /* renamed from: b */
    final Rect f1886b;

    /* renamed from: c */
    final RectF f1887c;

    /* renamed from: d */
    final C0542a f1888d;

    /* renamed from: e */
    float f1889e;

    /* renamed from: f */
    ColorStateList f1890f;

    /* renamed from: g */
    int f1891g;

    /* renamed from: h */
    boolean f1892h;

    /* renamed from: i */
    float f1893i;

    /* renamed from: j */
    private int f1894j;

    /* renamed from: k */
    private int f1895k;

    /* renamed from: l */
    private int f1896l;

    /* renamed from: m */
    private int f1897m;

    /* renamed from: android.support.design.widget.d$a */
    class C0542a extends ConstantState {

        /* renamed from: a */
        final /* synthetic */ C0541d f1898a;

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            return this.f1898a;
        }
    }

    public final ConstantState getConstantState() {
        return this.f1888d;
    }

    public final int getOpacity() {
        if (this.f1889e > 0.0f) {
            return -3;
        }
        return -2;
    }

    public final boolean isStateful() {
        if ((this.f1890f == null || !this.f1890f.isStateful()) && !super.isStateful()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        this.f1892h = true;
    }

    public final boolean getPadding(Rect rect) {
        int round = Math.round(this.f1889e);
        rect.set(round, round, round, round);
        return true;
    }

    public final void setAlpha(int i) {
        this.f1885a.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f1885a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        if (this.f1890f != null) {
            int colorForState = this.f1890f.getColorForState(iArr, this.f1891g);
            if (colorForState != this.f1891g) {
                this.f1892h = true;
                this.f1891g = colorForState;
            }
        }
        if (this.f1892h) {
            invalidateSelf();
        }
        return this.f1892h;
    }

    public final void draw(Canvas canvas) {
        if (this.f1892h) {
            Paint paint = this.f1885a;
            Rect rect = this.f1886b;
            copyBounds(rect);
            float height = this.f1889e / ((float) rect.height());
            LinearGradient linearGradient = new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{C0803a.m2295a(this.f1894j, this.f1891g), C0803a.m2295a(this.f1895k, this.f1891g), C0803a.m2295a(C0803a.m2298b(this.f1895k, 0), this.f1891g), C0803a.m2295a(C0803a.m2298b(this.f1897m, 0), this.f1891g), C0803a.m2295a(this.f1897m, this.f1891g), C0803a.m2295a(this.f1896l, this.f1891g)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, TileMode.CLAMP);
            paint.setShader(linearGradient);
            this.f1892h = false;
        }
        float strokeWidth = this.f1885a.getStrokeWidth() / 2.0f;
        RectF rectF = this.f1887c;
        copyBounds(this.f1886b);
        rectF.set(this.f1886b);
        rectF.left += strokeWidth;
        rectF.top += strokeWidth;
        rectF.right -= strokeWidth;
        rectF.bottom -= strokeWidth;
        canvas.save();
        canvas.rotate(this.f1893i, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, this.f1885a);
        canvas.restore();
    }
}
