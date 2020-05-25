package android.support.p030v4.view.p042b;

import android.view.animation.Interpolator;

/* renamed from: android.support.v4.view.b.d */
abstract class C1025d implements Interpolator {

    /* renamed from: a */
    private final float[] f3278a;

    /* renamed from: b */
    private final float f3279b = (1.0f / ((float) (this.f3278a.length - 1)));

    protected C1025d(float[] fArr) {
        this.f3278a = fArr;
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int min = Math.min((int) (((float) (this.f3278a.length - 1)) * f), this.f3278a.length - 2);
        return this.f3278a[min] + (((f - (((float) min) * this.f3279b)) / this.f3279b) * (this.f3278a[min + 1] - this.f3278a[min]));
    }
}
