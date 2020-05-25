package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b */
public final class C44190b implements C44201f {
    /* renamed from: a */
    public final Matrix mo90102a(RectF rectF, Rect rect) {
        C52711k.m112240b(rectF, "previewBaseRect");
        C52711k.m112240b(rect, "fromRect");
        Matrix matrix = new Matrix();
        float min = 1.0f / Math.min(rectF.width() / ((float) rect.width()), rectF.height() / ((float) rect.height()));
        matrix.setScale(min, min, rectF.centerX(), rectF.centerY());
        matrix.postTranslate(((float) rect.centerX()) - rectF.centerX(), ((float) rect.centerY()) - rectF.centerY());
        return matrix;
    }
}
