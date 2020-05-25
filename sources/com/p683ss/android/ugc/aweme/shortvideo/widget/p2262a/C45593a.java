package com.p683ss.android.ugc.aweme.shortvideo.widget.p2262a;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.a.a */
public final class C45593a implements Interpolator {

    /* renamed from: a */
    protected PointF f115327a;

    /* renamed from: b */
    protected PointF f115328b;

    /* renamed from: c */
    protected PointF f115329c;

    /* renamed from: d */
    protected PointF f115330d;

    /* renamed from: e */
    protected PointF f115331e;

    /* renamed from: b */
    private static float m99319b(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: a */
    private float m99317a(float f) {
        return m99318a(f, this.f115327a.x, this.f115328b.x);
    }

    public final float getInterpolation(float f) {
        float f2;
        float f3 = 1.0f;
        if (f <= 0.0f) {
            f3 = 0.0f;
        } else if (f < 1.0f) {
            int i = 0;
            float f4 = f;
            int i2 = 0;
            float f5 = 0.0f;
            float f6 = 1.0f;
            float f7 = 0.0f;
            while (true) {
                if (i2 >= 8) {
                    break;
                }
                f7 = m99317a(f4);
                double a = (double) ((m99317a(f4 + 1.0E-6f) - f7) / 1.0E-6f);
                float f8 = f7 - f;
                if (Math.abs(f8) >= 1.0E-6f) {
                    if (Math.abs(a) < 9.999999974752427E-7d) {
                        break;
                    }
                    if (f7 < f) {
                        f5 = f4;
                    } else {
                        f6 = f4;
                    }
                    double d = (double) f4;
                    double d2 = (double) f8;
                    Double.isNaN(d2);
                    Double.isNaN(a);
                    double d3 = d2 / a;
                    Double.isNaN(d);
                    f4 = (float) (d - d3);
                    i2++;
                } else {
                    break;
                }
            }
            while (Math.abs(f7 - f) > 1.0E-6f && i < 8) {
                if (f7 < f) {
                    f2 = (f4 + f6) / 2.0f;
                    f5 = f4;
                } else {
                    f2 = (f4 + f5) / 2.0f;
                    f6 = f4;
                }
                f4 = f2;
                f7 = m99317a(f4);
                i++;
            }
            f3 = f4;
        }
        return m99318a(f3, this.f115327a.y, this.f115328b.y);
    }

    public C45593a(PointF pointF, PointF pointF2) throws IllegalArgumentException {
        this.f115329c = new PointF();
        this.f115330d = new PointF();
        this.f115331e = new PointF();
        if (pointF.x < 0.0f || pointF.x > 1.0f) {
            throw new IllegalArgumentException("startX value must be in the range [0, 1]");
        } else if (pointF2.x < 0.0f || pointF2.x > 1.0f) {
            throw new IllegalArgumentException("endX value must be in the range [0, 1]");
        } else {
            this.f115327a = pointF;
            this.f115328b = pointF2;
        }
    }

    /* renamed from: a */
    private float m99318a(float f, float f2, float f3) {
        if (f == 0.0f || f == 1.0f) {
            return f;
        }
        float b = m99319b(0.0f, f2, f);
        float b2 = m99319b(f2, f3, f);
        return m99319b(m99319b(b, b2, f), m99319b(b2, m99319b(f3, 1.0f, f), f), f);
    }

    public C45593a(float f, float f2, float f3, float f4) {
        this(new PointF(0.15f, 0.12f), new PointF(1.0f, 0.0f));
    }
}
