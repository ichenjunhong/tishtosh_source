package android.support.p043v7.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v7.widget.aq */
final class C1432aq extends Drawable {

    /* renamed from: a */
    static C1433a f5140a;

    /* renamed from: g */
    private static final double f5141g = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b */
    public float f5142b;

    /* renamed from: c */
    public float f5143c;

    /* renamed from: d */
    public float f5144d;

    /* renamed from: e */
    public ColorStateList f5145e;

    /* renamed from: f */
    boolean f5146f = true;

    /* renamed from: h */
    private final int f5147h;

    /* renamed from: i */
    private Paint f5148i;

    /* renamed from: j */
    private Paint f5149j;

    /* renamed from: k */
    private Paint f5150k;

    /* renamed from: l */
    private final RectF f5151l;

    /* renamed from: m */
    private Path f5152m;

    /* renamed from: n */
    private float f5153n;

    /* renamed from: o */
    private final int f5154o;

    /* renamed from: p */
    private final int f5155p;

    /* renamed from: q */
    private boolean f5156q = true;

    /* renamed from: r */
    private boolean f5157r;

    /* renamed from: android.support.v7.widget.aq$a */
    interface C1433a {
        /* renamed from: a */
        void mo5603a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isStateful() {
        if ((this.f5145e == null || !this.f5145e.isStateful()) && !super.isStateful()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final float mo5589a() {
        return (Math.max(this.f5143c, this.f5142b + ((float) this.f5147h) + (this.f5143c / 2.0f)) * 2.0f) + ((this.f5143c + ((float) this.f5147h)) * 2.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final float mo5594b() {
        return (Math.max(this.f5143c, this.f5142b + ((float) this.f5147h) + ((this.f5143c * 1.5f) / 2.0f)) * 2.0f) + (((this.f5143c * 1.5f) + ((float) this.f5147h)) * 2.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5592a(Rect rect) {
        getPadding(rect);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5593a(boolean z) {
        this.f5156q = z;
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f5146f = true;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f5148i.setColorFilter(colorFilter);
    }

    /* renamed from: a */
    private static int m4967a(float f) {
        int i = (int) (f + 0.5f);
        if (i % 2 == 1) {
            return i - 1;
        }
        return i;
    }

    public final void setAlpha(int i) {
        this.f5148i.setAlpha(i);
        this.f5149j.setAlpha(i);
        this.f5150k.setAlpha(i);
    }

    public final boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) m4966a(this.f5143c, this.f5142b, this.f5156q));
        int ceil2 = (int) Math.ceil((double) m4968b(this.f5143c, this.f5142b, this.f5156q));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        int colorForState = this.f5145e.getColorForState(iArr, this.f5145e.getDefaultColor());
        if (this.f5148i.getColor() == colorForState) {
            return false;
        }
        this.f5148i.setColor(colorForState);
        this.f5146f = true;
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5591a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f5145e = colorStateList;
        this.f5148i.setColor(this.f5145e.getColorForState(getState(), this.f5145e.getDefaultColor()));
    }

    public final void draw(Canvas canvas) {
        boolean z;
        boolean z2;
        int i;
        Canvas canvas2 = canvas;
        if (this.f5146f) {
            Rect bounds = getBounds();
            float f = this.f5143c * 1.5f;
            this.f5151l.set(((float) bounds.left) + this.f5143c, ((float) bounds.top) + f, ((float) bounds.right) - this.f5143c, ((float) bounds.bottom) - f);
            RectF rectF = new RectF(-this.f5142b, -this.f5142b, this.f5142b, this.f5142b);
            RectF rectF2 = new RectF(rectF);
            rectF2.inset(-this.f5153n, -this.f5153n);
            if (this.f5152m == null) {
                this.f5152m = new Path();
            } else {
                this.f5152m.reset();
            }
            this.f5152m.setFillType(FillType.EVEN_ODD);
            this.f5152m.moveTo(-this.f5142b, 0.0f);
            this.f5152m.rLineTo(-this.f5153n, 0.0f);
            this.f5152m.arcTo(rectF2, 180.0f, 90.0f, false);
            this.f5152m.arcTo(rectF, 270.0f, -90.0f, false);
            this.f5152m.close();
            float f2 = this.f5142b / (this.f5142b + this.f5153n);
            Paint paint = this.f5149j;
            RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, this.f5142b + this.f5153n, new int[]{this.f5154o, this.f5154o, this.f5155p}, new float[]{0.0f, f2, 1.0f}, TileMode.CLAMP);
            paint.setShader(radialGradient);
            Paint paint2 = this.f5150k;
            LinearGradient linearGradient = new LinearGradient(0.0f, (-this.f5142b) + this.f5153n, 0.0f, (-this.f5142b) - this.f5153n, new int[]{this.f5154o, this.f5154o, this.f5155p}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP);
            paint2.setShader(linearGradient);
            this.f5150k.setAntiAlias(false);
            this.f5146f = false;
        }
        canvas2.translate(0.0f, this.f5144d / 2.0f);
        float f3 = (-this.f5142b) - this.f5153n;
        float f4 = this.f5142b + ((float) this.f5147h) + (this.f5144d / 2.0f);
        float f5 = f4 * 2.0f;
        if (this.f5151l.width() - f5 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (this.f5151l.height() - f5 > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        int save = canvas.save();
        canvas2.translate(this.f5151l.left + f4, this.f5151l.top + f4);
        canvas2.drawPath(this.f5152m, this.f5149j);
        if (z) {
            i = save;
            canvas.drawRect(0.0f, f3, this.f5151l.width() - f5, -this.f5142b, this.f5150k);
        } else {
            i = save;
        }
        canvas2.restoreToCount(i);
        int save2 = canvas.save();
        canvas2.translate(this.f5151l.right - f4, this.f5151l.bottom - f4);
        canvas2.rotate(180.0f);
        canvas2.drawPath(this.f5152m, this.f5149j);
        if (z) {
            canvas.drawRect(0.0f, f3, this.f5151l.width() - f5, (-this.f5142b) + this.f5153n, this.f5150k);
        }
        canvas2.restoreToCount(save2);
        int save3 = canvas.save();
        canvas2.translate(this.f5151l.left + f4, this.f5151l.bottom - f4);
        canvas2.rotate(270.0f);
        canvas2.drawPath(this.f5152m, this.f5149j);
        if (z2) {
            canvas.drawRect(0.0f, f3, this.f5151l.height() - f5, -this.f5142b, this.f5150k);
        }
        canvas2.restoreToCount(save3);
        int save4 = canvas.save();
        canvas2.translate(this.f5151l.right - f4, this.f5151l.top + f4);
        canvas2.rotate(90.0f);
        canvas2.drawPath(this.f5152m, this.f5149j);
        if (z2) {
            canvas.drawRect(0.0f, f3, this.f5151l.height() - f5, -this.f5142b, this.f5150k);
        }
        canvas2.restoreToCount(save4);
        canvas2.translate(0.0f, (-this.f5144d) / 2.0f);
        f5140a.mo5603a(canvas2, this.f5151l, this.f5142b, this.f5148i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5590a(float f, float f2) {
        if (f < 0.0f) {
            StringBuilder sb = new StringBuilder("Invalid shadow size ");
            sb.append(f);
            sb.append(". Must be >= 0");
            throw new IllegalArgumentException(sb.toString());
        } else if (f2 >= 0.0f) {
            float a = (float) m4967a(f);
            float a2 = (float) m4967a(f2);
            if (a > a2) {
                if (!this.f5157r) {
                    this.f5157r = true;
                }
                a = a2;
            }
            if (this.f5144d != a || this.f5143c != a2) {
                this.f5144d = a;
                this.f5143c = a2;
                this.f5153n = (float) ((int) ((a * 1.5f) + ((float) this.f5147h) + 0.5f));
                this.f5146f = true;
                invalidateSelf();
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Invalid max shadow size ");
            sb2.append(f2);
            sb2.append(". Must be >= 0");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: a */
    static float m4966a(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        double d = (double) (f * 1.5f);
        double d2 = 1.0d - f5141g;
        double d3 = (double) f2;
        Double.isNaN(d3);
        double d4 = d2 * d3;
        Double.isNaN(d);
        return (float) (d + d4);
    }

    /* renamed from: b */
    static float m4968b(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        double d = (double) f;
        double d2 = 1.0d - f5141g;
        double d3 = (double) f2;
        Double.isNaN(d3);
        double d4 = d2 * d3;
        Double.isNaN(d);
        return (float) (d + d4);
    }

    C1432aq(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.f5154o = resources.getColor(R.color.en);
        this.f5155p = resources.getColor(R.color.em);
        this.f5147h = resources.getDimensionPixelSize(R.dimen.ct);
        this.f5148i = new Paint(5);
        mo5591a(colorStateList);
        this.f5149j = new Paint(5);
        this.f5149j.setStyle(Style.FILL);
        this.f5142b = (float) ((int) (f + 0.5f));
        this.f5151l = new RectF();
        this.f5150k = new Paint(this.f5149j);
        this.f5150k.setAntiAlias(false);
        mo5590a(f2, f3);
    }
}
