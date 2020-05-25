package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p2215b;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.a */
public final class C44191a implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f111955a = new float[9];

    /* renamed from: b */
    private final float[] f111956b = new float[9];

    /* renamed from: c */
    private final Matrix f111957c = new Matrix();

    public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        Matrix matrix = (Matrix) obj;
        Matrix matrix2 = (Matrix) obj2;
        C52711k.m112240b(matrix, "startValue");
        C52711k.m112240b(matrix2, "endValue");
        matrix.getValues(this.f111955a);
        matrix2.getValues(this.f111956b);
        for (int i = 0; i <= 8; i++) {
            this.f111956b[i] = this.f111955a[i] + ((this.f111956b[i] - this.f111955a[i]) * f);
        }
        this.f111957c.setValues(this.f111956b);
        return this.f111957c;
    }
}
