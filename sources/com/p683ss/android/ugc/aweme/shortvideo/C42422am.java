package com.p683ss.android.ugc.aweme.shortvideo;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.am */
public final class C42422am implements Interpolator {

    /* renamed from: a */
    protected PointF f107310a;

    /* renamed from: b */
    protected PointF f107311b;

    /* renamed from: c */
    protected PointF f107312c;

    /* renamed from: d */
    protected PointF f107313d;

    /* renamed from: e */
    protected PointF f107314e;

    public final float getInterpolation(float f) {
        float f2 = f;
        for (int i = 1; i < 14; i++) {
            this.f107314e.x = this.f107310a.x * 3.0f;
            this.f107313d.x = ((this.f107311b.x - this.f107310a.x) * 3.0f) - this.f107314e.x;
            this.f107312c.x = (1.0f - this.f107314e.x) - this.f107313d.x;
            float f3 = ((this.f107314e.x + ((this.f107313d.x + (this.f107312c.x * f2)) * f2)) * f2) - f;
            if (((double) Math.abs(f3)) < 0.001d) {
                break;
            }
            f2 -= f3 / (this.f107314e.x + (((this.f107313d.x * 2.0f) + ((this.f107312c.x * 3.0f) * f2)) * f2));
        }
        this.f107314e.y = this.f107310a.y * 3.0f;
        this.f107313d.y = ((this.f107311b.y - this.f107310a.y) * 3.0f) - this.f107314e.y;
        this.f107312c.y = (1.0f - this.f107314e.y) - this.f107313d.y;
        return f2 * (this.f107314e.y + ((this.f107313d.y + (this.f107312c.y * f2)) * f2));
    }

    private C42422am(PointF pointF, PointF pointF2) throws IllegalArgumentException {
        this.f107312c = new PointF();
        this.f107313d = new PointF();
        this.f107314e = new PointF();
        if (pointF.x < 0.0f || pointF.x > 1.0f) {
            throw new IllegalArgumentException("startX value must be in the range [0, 1]");
        } else if (pointF2.x < 0.0f || pointF2.x > 1.0f) {
            throw new IllegalArgumentException("endX value must be in the range [0, 1]");
        } else {
            this.f107310a = pointF;
            this.f107311b = pointF2;
        }
    }

    public C42422am(float f, float f2, float f3, float f4) {
        this(new PointF(f, f2), new PointF(f3, 1.0f));
    }
}
