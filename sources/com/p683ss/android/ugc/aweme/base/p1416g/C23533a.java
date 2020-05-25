package com.p683ss.android.ugc.aweme.base.p1416g;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;

/* renamed from: com.ss.android.ugc.aweme.base.g.a */
public class C23533a extends Drawable {

    /* renamed from: h */
    private static final String f62643h = "a";

    /* renamed from: l */
    private static boolean f62644l;

    /* renamed from: a */
    public Paint f62645a = new Paint(1);

    /* renamed from: b */
    public int f62646b = C23728o.m58241a(1.5d);

    /* renamed from: c */
    public float[] f62647c = new float[60];

    /* renamed from: d */
    public int[] f62648d = {-65536, -16711936, -16776961, -16777216, -65536};

    /* renamed from: e */
    public boolean f62649e;

    /* renamed from: f */
    public boolean f62650f;

    /* renamed from: g */
    public boolean f62651g;

    /* renamed from: i */
    private float f62652i;

    /* renamed from: j */
    private float f62653j;

    /* renamed from: k */
    private Float f62654k;

    /* renamed from: d */
    private static double m57708d(double d) {
        return d * d * d * d * d * d;
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: a */
    public void mo48691a() {
        Rect bounds = getBounds();
        if (bounds.width() > 0) {
            this.f62645a.setShader(new SweepGradient((float) bounds.centerX(), (float) bounds.centerY(), this.f62648d, null));
        }
    }

    public C23533a() {
        this.f62645a.setStyle(Style.STROKE);
        this.f62645a.setStrokeWidth((float) this.f62646b);
        this.f62645a.setStrokeCap(Cap.ROUND);
    }

    /* renamed from: c */
    private static double m57707c(double d) {
        return (double) ((float) m57708d(d));
    }

    public void setAlpha(int i) {
        this.f62645a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f62645a.setColorFilter(colorFilter);
    }

    /* renamed from: b */
    private static double m57706b(double d) {
        return (double) ((float) m57708d(1.0d - d));
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        mo48691a();
        double width = (double) getBounds().width();
        Double.isNaN(width);
        this.f62652i = (float) ((width * 3.141592653589793d) / 30.0d);
    }

    /* renamed from: a */
    private static double m57705a(double d) {
        StringBuilder sb = new StringBuilder("getAdjustedDegreeFactor() called, with progress = [");
        sb.append(d);
        sb.append("]");
        double floor = Math.floor(d);
        double d2 = d - floor;
        StringBuilder sb2 = new StringBuilder("getAdjustedDegreeFactor() called, with base = [");
        sb2.append(floor);
        sb2.append("]");
        StringBuilder sb3 = new StringBuilder("getAdjustedDegreeFactor() called, with periodicValue = [");
        sb3.append(d2);
        sb3.append("]");
        if (d2 < 0.125d) {
            return m57706b(d2 / 0.125d);
        }
        if (d2 < 0.375d) {
            return ProfileUiInitOptimizeEnterThreshold.DEFAULT;
        }
        if (d2 < 0.5d) {
            return m57707c(((d2 - 0.125d) - 0.25d) / 0.125d);
        }
        return 1.0d;
    }

    public void draw(Canvas canvas) {
        DashPathEffect dashPathEffect;
        float f;
        boolean z;
        Canvas canvas2 = canvas;
        if (!this.f62650f) {
            canvas.save();
            Paint paint = this.f62645a;
            double d = 0.5d;
            if (this.f62649e) {
                int i = 0;
                while (i < 30) {
                    if (i == 29) {
                        z = true;
                    } else {
                        z = false;
                    }
                    f62644l = z;
                    float[] fArr = this.f62647c;
                    int i2 = i * 2;
                    double d2 = (double) this.f62652i;
                    double d3 = (double) this.f62653j;
                    double d4 = (double) i;
                    Double.isNaN(d4);
                    double d5 = ((d4 * 1.0d) / 29.0d) * d;
                    Double.isNaN(d3);
                    double d6 = d3 - d5;
                    new StringBuilder("getAdjustedDegreeFactor(degree) = ").append(m57705a(d6));
                    Double.isNaN(d2);
                    fArr[i2] = (float) (((d2 - ProfileUiInitOptimizeEnterThreshold.DEFAULT) * m57705a(d6)) + ProfileUiInitOptimizeEnterThreshold.DEFAULT);
                    new StringBuilder("lengthValue = ").append(this.f62647c[i2]);
                    this.f62647c[i2 + 1] = this.f62652i - this.f62647c[i2];
                    i++;
                    d = 0.5d;
                }
                dashPathEffect = new DashPathEffect(this.f62647c, 0.0f);
            } else {
                dashPathEffect = null;
            }
            paint.setPathEffect(dashPathEffect);
            int centerX = getBounds().centerX();
            int centerY = getBounds().centerY();
            if (this.f62649e) {
                double d7 = (double) this.f62653j;
                Double.isNaN(d7);
                f = (float) (d7 * 0.5d * 360.0d);
            } else {
                f = 0.0f;
            }
            float f2 = (float) centerX;
            float f3 = (float) centerY;
            canvas2.rotate(f, f2, f3);
            canvas2.drawCircle(f2, f3, (float) ((getBounds().width() / 2) - this.f62646b), this.f62645a);
            if (this.f62649e && !this.f62651g) {
                float f4 = this.f62653j;
                this.f62653j += 0.008f;
                if (this.f62654k != null && f4 <= this.f62654k.floatValue() && this.f62653j >= this.f62654k.floatValue()) {
                    this.f62649e = false;
                    this.f62654k = null;
                    this.f62653j = 0.0f;
                    this.f62651g = false;
                }
                invalidateSelf();
            }
            canvas.restore();
        }
    }
}
