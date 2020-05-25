package com.bytedance.ies.dmt.p664ui.common.views;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.text.style.ReplacementSpan;

/* renamed from: com.bytedance.ies.dmt.ui.common.views.b */
public final class C10690b extends ReplacementSpan {

    /* renamed from: a */
    private String f28475a;

    public C10690b(String str) {
        this.f28475a = str;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText(this.f28475a);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.drawText(this.f28475a, f, (float) (i4 - 10), paint);
    }
}
