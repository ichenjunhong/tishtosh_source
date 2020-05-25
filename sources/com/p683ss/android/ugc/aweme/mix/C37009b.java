package com.p683ss.android.ugc.aweme.mix;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.mix.b */
public final class C37009b extends ImageSpan {
    public C37009b(Context context, int i) {
        super(context, R.drawable.dli);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawable = getDrawable();
        FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i6 = ((((fontMetricsInt.descent + i4) + i4) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2);
        canvas.save();
        canvas.translate(f, (float) i6);
        drawable.draw(canvas);
        canvas.restore();
    }
}
