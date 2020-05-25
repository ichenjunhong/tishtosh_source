package com.p683ss.android.ugc.aweme.mix;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;

/* renamed from: com.ss.android.ugc.aweme.mix.ab */
public final class C37008ab extends ReplacementSpan {

    /* renamed from: a */
    private float f94524a;

    /* renamed from: b */
    private Integer f94525b;

    /* renamed from: c */
    private int f94526c;

    /* renamed from: a */
    private TextPaint m83236a(Paint paint) {
        TextPaint textPaint = new TextPaint(paint);
        textPaint.setTextSize(this.f94524a);
        if (this.f94525b != null) {
            textPaint.setColor(this.f94525b.intValue());
        }
        return textPaint;
    }

    public C37008ab(float f, int i) {
        this.f94524a = f;
        this.f94525b = Integer.valueOf(i);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        return (int) m83236a(paint).measureText(charSequence.subSequence(i, i2).toString());
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        CharSequence subSequence = charSequence.subSequence(i, i2);
        TextPaint a = m83236a(paint);
        FontMetricsInt fontMetricsInt = a.getFontMetricsInt();
        FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        canvas.drawText(subSequence.toString(), f, (((float) i4) - ((((float) (((fontMetricsInt.descent + i4) + i4) + fontMetricsInt.ascent)) / 2.0f) - (((float) (((fontMetricsInt2.top + i4) + i4) + fontMetricsInt2.bottom)) / 2.0f))) - ((float) this.f94526c), a);
    }
}
