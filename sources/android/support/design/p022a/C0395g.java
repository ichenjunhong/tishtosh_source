package android.support.design.p022a;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: android.support.design.a.g */
public final class C0395g implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f1277a = new float[9];

    /* renamed from: b */
    private final float[] f1278b = new float[9];

    /* renamed from: c */
    private final Matrix f1279c = new Matrix();

    public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        Matrix matrix = (Matrix) obj2;
        ((Matrix) obj).getValues(this.f1277a);
        matrix.getValues(this.f1278b);
        for (int i = 0; i < 9; i++) {
            this.f1278b[i] = this.f1277a[i] + ((this.f1278b[i] - this.f1277a[i]) * f);
        }
        this.f1279c.setValues(this.f1278b);
        return this.f1279c;
    }
}
