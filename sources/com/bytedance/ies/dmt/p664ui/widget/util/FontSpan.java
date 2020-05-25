package com.bytedance.ies.dmt.p664ui.widget.util;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

/* renamed from: com.bytedance.ies.dmt.ui.widget.util.FontSpan */
public class FontSpan extends TypefaceSpan {

    /* renamed from: a */
    private final Typeface f28885a;

    public void updateDrawState(TextPaint textPaint) {
        m21783a(textPaint, this.f28885a);
    }

    public void updateMeasureState(TextPaint textPaint) {
        m21783a(textPaint, this.f28885a);
    }

    /* renamed from: a */
    private void m21782a(Paint paint) {
        int i;
        String family = getFamily();
        Typeface typeface = paint.getTypeface();
        if (typeface == null) {
            i = 0;
        } else {
            i = typeface.getStyle();
        }
        Typeface create = Typeface.create(family, i);
        int style = i & (create.getStyle() ^ -1);
        if ((style & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((style & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(create);
    }

    /* renamed from: a */
    private void m21783a(Paint paint, Typeface typeface) {
        int i;
        if (typeface == null) {
            m21782a(paint);
            return;
        }
        Typeface typeface2 = paint.getTypeface();
        if (typeface2 == null) {
            i = 0;
        } else {
            i = typeface2.getStyle();
        }
        int style = i & (typeface.getStyle() ^ -1);
        if ((style & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if (C10751d.f28903b.equals(getFamily())) {
            paint.setFakeBoldText(true);
        }
        if ((style & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(typeface);
    }
}
