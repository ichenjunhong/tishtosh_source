package android.support.design.widget;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.support.p043v7.p046b.p047a.C1193c;

/* renamed from: android.support.design.widget.m */
public final class C0561m extends C1193c {

    /* renamed from: a */
    static final double f2028a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b */
    final Paint f2029b;

    /* renamed from: c */
    final Paint f2030c;

    /* renamed from: d */
    final RectF f2031d;

    /* renamed from: e */
    public float f2032e;

    /* renamed from: f */
    Path f2033f;

    /* renamed from: g */
    float f2034g;

    /* renamed from: h */
    public float f2035h;

    /* renamed from: i */
    float f2036i;

    /* renamed from: j */
    public float f2037j;

    /* renamed from: k */
    float f2038k;

    /* renamed from: m */
    private boolean f2039m;

    /* renamed from: n */
    private final int f2040n;

    /* renamed from: o */
    private final int f2041o;

    /* renamed from: p */
    private final int f2042p;

    /* renamed from: q */
    private boolean f2043q;

    /* renamed from: r */
    private boolean f2044r;

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        this.f2039m = true;
    }

    /* renamed from: a */
    public final void mo1749a(float f) {
        mo1750a(f, this.f2035h);
    }

    /* renamed from: b */
    private static int m1547b(float f) {
        int round = Math.round(f);
        if (round % 2 == 1) {
            return round - 1;
        }
        return round;
    }

    public final void setAlpha(int i) {
        super.setAlpha(i);
        this.f2029b.setAlpha(i);
        this.f2030c.setAlpha(i);
    }

    public final boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) m1545a(this.f2035h, this.f2032e, this.f2043q));
        int ceil2 = (int) Math.ceil((double) m1546b(this.f2035h, this.f2032e, this.f2043q));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public final void draw(Canvas canvas) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        Canvas canvas2 = canvas;
        if (this.f2039m) {
            Rect bounds = getBounds();
            float f = this.f2035h * 1.5f;
            this.f2031d.set(((float) bounds.left) + this.f2035h, ((float) bounds.top) + f, ((float) bounds.right) - this.f2035h, ((float) bounds.bottom) - f);
            this.f3949l.setBounds((int) this.f2031d.left, (int) this.f2031d.top, (int) this.f2031d.right, (int) this.f2031d.bottom);
            RectF rectF = new RectF(-this.f2032e, -this.f2032e, this.f2032e, this.f2032e);
            RectF rectF2 = new RectF(rectF);
            rectF2.inset(-this.f2036i, -this.f2036i);
            if (this.f2033f == null) {
                this.f2033f = new Path();
            } else {
                this.f2033f.reset();
            }
            this.f2033f.setFillType(FillType.EVEN_ODD);
            this.f2033f.moveTo(-this.f2032e, 0.0f);
            this.f2033f.rLineTo(-this.f2036i, 0.0f);
            this.f2033f.arcTo(rectF2, 180.0f, 90.0f, false);
            this.f2033f.arcTo(rectF, 270.0f, -90.0f, false);
            this.f2033f.close();
            float f2 = -rectF2.top;
            if (f2 > 0.0f) {
                float f3 = this.f2032e / f2;
                float f4 = ((1.0f - f3) / 2.0f) + f3;
                Paint paint = this.f2029b;
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, f2, new int[]{0, this.f2040n, this.f2041o, this.f2042p}, new float[]{0.0f, f3, f4, 1.0f}, TileMode.CLAMP);
                paint.setShader(radialGradient);
            }
            Paint paint2 = this.f2030c;
            float f5 = rectF.top;
            z = true;
            LinearGradient linearGradient = new LinearGradient(0.0f, f5, 0.0f, rectF2.top, new int[]{this.f2040n, this.f2041o, this.f2042p}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP);
            paint2.setShader(linearGradient);
            this.f2030c.setAntiAlias(false);
            this.f2039m = false;
        } else {
            z = true;
        }
        int save = canvas.save();
        canvas2.rotate(this.f2038k, this.f2031d.centerX(), this.f2031d.centerY());
        float f6 = (-this.f2032e) - this.f2036i;
        float f7 = this.f2032e;
        float f8 = f7 * 2.0f;
        if (this.f2031d.width() - f8 > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f2031d.height() - f8 <= 0.0f) {
            z = false;
        }
        float f9 = f7 / ((this.f2037j - (this.f2037j * 0.5f)) + f7);
        float f10 = f7 / ((this.f2037j - (this.f2037j * 0.25f)) + f7);
        float f11 = f7 / ((this.f2037j - (this.f2037j * 1.0f)) + f7);
        int save2 = canvas.save();
        canvas2.translate(this.f2031d.left + f7, this.f2031d.top + f7);
        canvas2.scale(f9, f10);
        canvas2.drawPath(this.f2033f, this.f2029b);
        if (z2) {
            canvas2.scale(1.0f / f9, 1.0f);
            i = save;
            i2 = save2;
            canvas.drawRect(0.0f, f6, this.f2031d.width() - f8, -this.f2032e, this.f2030c);
        } else {
            i = save;
            i2 = save2;
        }
        canvas2.restoreToCount(i2);
        int save3 = canvas.save();
        canvas2.translate(this.f2031d.right - f7, this.f2031d.bottom - f7);
        canvas2.scale(f9, f11);
        canvas2.rotate(180.0f);
        canvas2.drawPath(this.f2033f, this.f2029b);
        if (z2) {
            canvas2.scale(1.0f / f9, 1.0f);
            canvas.drawRect(0.0f, f6, this.f2031d.width() - f8, (-this.f2032e) + this.f2036i, this.f2030c);
        }
        canvas2.restoreToCount(save3);
        int save4 = canvas.save();
        canvas2.translate(this.f2031d.left + f7, this.f2031d.bottom - f7);
        canvas2.scale(f9, f11);
        canvas2.rotate(270.0f);
        canvas2.drawPath(this.f2033f, this.f2029b);
        if (z) {
            canvas2.scale(1.0f / f11, 1.0f);
            canvas.drawRect(0.0f, f6, this.f2031d.height() - f8, -this.f2032e, this.f2030c);
        }
        canvas2.restoreToCount(save4);
        int save5 = canvas.save();
        canvas2.translate(this.f2031d.right - f7, this.f2031d.top + f7);
        canvas2.scale(f9, f10);
        canvas2.rotate(90.0f);
        canvas2.drawPath(this.f2033f, this.f2029b);
        if (z) {
            canvas2.scale(1.0f / f10, 1.0f);
            canvas.drawRect(0.0f, f6, this.f2031d.height() - f8, -this.f2032e, this.f2030c);
        }
        canvas2.restoreToCount(save5);
        canvas2.restoreToCount(i);
        super.draw(canvas);
    }

    /* renamed from: a */
    public final void mo1750a(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float b = (float) m1547b(f);
        float b2 = (float) m1547b(f2);
        if (b > b2) {
            if (!this.f2044r) {
                this.f2044r = true;
            }
            b = b2;
        }
        if (this.f2037j != b || this.f2035h != b2) {
            this.f2037j = b;
            this.f2035h = b2;
            this.f2036i = (float) Math.round(b * 1.5f);
            this.f2034g = b2;
            this.f2039m = true;
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public static float m1545a(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        double d = (double) (f * 1.5f);
        double d2 = 1.0d - f2028a;
        double d3 = (double) f2;
        Double.isNaN(d3);
        double d4 = d2 * d3;
        Double.isNaN(d);
        return (float) (d + d4);
    }

    /* renamed from: b */
    public static float m1546b(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        double d = (double) f;
        double d2 = 1.0d - f2028a;
        double d3 = (double) f2;
        Double.isNaN(d3);
        double d4 = d2 * d3;
        Double.isNaN(d);
        return (float) (d + d4);
    }
}
