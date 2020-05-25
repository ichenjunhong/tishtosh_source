package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.bc */
public final class C30788bc extends ImageSpan {
    public C30788bc(Context context, int i) {
        C52711k.m112240b(context, "context");
        super(context, R.drawable.csf);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C52711k.m112240b(canvas, "canvas");
        C52711k.m112240b(charSequence, "text");
        C52711k.m112240b(paint, "paint");
        Drawable drawable = getDrawable();
        canvas.save();
        FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i6 = (((fontMetricsInt.descent + i4) + i4) + fontMetricsInt.ascent) / 2;
        C52711k.m112236a((Object) drawable, "d");
        canvas.translate(f, (float) (i6 - (drawable.getBounds().bottom / 2)));
        drawable.draw(canvas);
        canvas.restore();
    }
}
