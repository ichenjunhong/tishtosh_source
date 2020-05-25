package com.p683ss.android.ugc.aweme.challenge.p1500ui.header;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.AlignedTextView */
public final class AlignedTextView extends DmtTextView {
    public AlignedTextView(Context context) {
        C52711k.m112240b(context, "context");
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        float f;
        C52711k.m112240b(canvas, "canvas");
        String obj = getText().toString();
        Paint paint = new Paint();
        paint.setTextSize(getTextSize());
        paint.setColor(getCurrentTextColor());
        paint.setAntiAlias(true);
        int height = (int) ((((float) (getHeight() / 2)) - ((paint.descent() + paint.ascent()) / 2.0f)) + 4.0f);
        float measuredWidth = (float) getMeasuredWidth();
        float measureText = paint.measureText(obj);
        if (TextUtils.isEmpty(getText()) || getText().length() <= 1) {
            f = 0.0f;
        } else {
            f = ((measuredWidth - measureText) / ((float) (obj.length() - 1))) / paint.getTextSize();
        }
        if (VERSION.SDK_INT >= 21) {
            canvas.translate(((-f) * getTextSize()) / 2.0f, 0.0f);
            paint.setLetterSpacing(f);
            canvas.drawText(obj, 0.0f, (float) height, paint);
            return;
        }
        m60165a(canvas, obj, 0.0f, (float) height, paint, f);
    }

    public AlignedTextView(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attrs");
        super(context, attributeSet);
    }

    public AlignedTextView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attrs");
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    private final int m60165a(Canvas canvas, String str, float f, float f2, Paint paint, float f3) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (canvas != null) {
                String valueOf = String.valueOf(str.charAt(i));
                canvas.drawText(valueOf, 0.0f, f2, paint);
                canvas.translate(paint.measureText(valueOf), 0.0f);
                canvas.translate(getTextSize() * f3, 0.0f);
            }
        }
        return 0;
    }
}
