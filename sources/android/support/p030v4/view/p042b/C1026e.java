package android.support.p030v4.view.p042b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* renamed from: android.support.v4.view.b.e */
final class C1026e implements Interpolator {

    /* renamed from: a */
    private final float[] f3280a;

    /* renamed from: b */
    private final float[] f3281b;

    private C1026e(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = ((int) (length / 0.002f)) + 1;
        this.f3280a = new float[i];
        this.f3281b = new float[i];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < i; i2++) {
            pathMeasure.getPosTan((((float) i2) * length) / ((float) (i - 1)), fArr, null);
            this.f3280a[i2] = fArr[0];
            this.f3281b[i2] = fArr[1];
        }
    }

    public final float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f3280a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f3280a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float f2 = this.f3280a[length] - this.f3280a[i];
        if (f2 == 0.0f) {
            return this.f3281b[i];
        }
        float f3 = (f - this.f3280a[i]) / f2;
        float f4 = this.f3281b[i];
        return f4 + (f3 * (this.f3281b[length] - f4));
    }

    C1026e(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        this(path);
    }
}
