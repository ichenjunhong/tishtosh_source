package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout;

import android.animation.TypeEvaluator;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.c */
public final class C44198c implements TypeEvaluator<float[]> {

    /* renamed from: a */
    private final float[] f111966a;

    public C44198c(float[] fArr) {
        C52711k.m112240b(fArr, "mArray");
        this.f111966a = fArr;
    }

    public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        float[] fArr = (float[]) obj;
        float[] fArr2 = (float[]) obj2;
        C52711k.m112240b(fArr, "startValue");
        C52711k.m112240b(fArr2, "endValue");
        float[] fArr3 = this.f111966a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        int length = fArr3.length;
        for (int i = 0; i < length; i++) {
            float f2 = fArr[i];
            fArr3[i] = f2 + ((fArr2[i] - f2) * f);
        }
        return fArr3;
    }
}
