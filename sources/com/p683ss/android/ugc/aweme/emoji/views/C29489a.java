package com.p683ss.android.ugc.aweme.emoji.views;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* renamed from: com.ss.android.ugc.aweme.emoji.views.a */
public class C29489a extends ImageSpan {

    /* renamed from: a */
    public int f77231a;

    /* renamed from: b */
    private Integer f77232b;

    /* renamed from: c */
    private CharSequence f77233c;

    /* renamed from: d */
    private boolean f77234d;

    /* renamed from: a */
    public final CharSequence mo59592a() {
        if (this.f77233c != null) {
            return this.f77233c;
        }
        return "";
    }

    public C29489a(Drawable drawable, Integer num, CharSequence charSequence) {
        super(drawable);
        this.f77232b = num;
        this.f77233c = charSequence;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        if (this.f77232b != null && this.f77232b.intValue() != i2 - i && this.f77234d) {
            return 0;
        }
        Rect bounds = getDrawable().getBounds();
        if (fontMetricsInt != null) {
            FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i3 = fontMetricsInt2.bottom - fontMetricsInt2.top;
            int i4 = (bounds.bottom - bounds.top) / 2;
            int i5 = i3 / 4;
            int i6 = i4 - i5;
            int i7 = -(i4 + i5);
            fontMetricsInt.ascent = i7;
            fontMetricsInt.top = i7;
            fontMetricsInt.bottom = i6;
            fontMetricsInt.descent = i6;
        }
        return bounds.right;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.f77232b == null || this.f77232b.intValue() == i2 - i || !this.f77234d) {
            Drawable drawable = getDrawable();
            FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            int i6 = ((((fontMetricsInt.descent + i4) + i4) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2);
            canvas.save();
            canvas.translate(f + ((float) this.f77231a), (float) i6);
            drawable.draw(canvas);
            canvas.restore();
            if (!(this.f77232b == null || this.f77232b.intValue() == i2 - i)) {
                this.f77234d = true;
            }
            return;
        }
        this.f77234d = false;
    }
}
