package com.bytedance.android.livesdk.p407r;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import com.bytedance.android.livesdk.p279af.C4573al;

/* renamed from: com.bytedance.android.livesdk.r.a */
public final class C8122a {

    /* renamed from: a */
    private static Paint f22178a;

    static {
        Paint paint = new Paint();
        f22178a = paint;
        paint.setColor(-1);
        f22178a.setStyle(Style.FILL_AND_STROKE);
    }

    /* renamed from: a */
    public static void m16194a(Context context, int i, Bitmap bitmap, String str) {
        if (bitmap != null && str != null) {
            f22178a.setColor(i);
            Typeface a = C4573al.m10974a(context);
            if (a != null) {
                f22178a.setTypeface(a);
            }
            float width = (float) bitmap.getWidth();
            float height = (float) bitmap.getHeight();
            f22178a.setTextSize(0.55f * height);
            float measureText = f22178a.measureText(str);
            Canvas canvas = new Canvas(bitmap);
            FontMetrics fontMetrics = f22178a.getFontMetrics();
            canvas.drawText(str, height + (((width - height) - measureText) / 2.0f), ((height - (fontMetrics.bottom - fontMetrics.top)) / 2.0f) + Math.abs(fontMetrics.top), f22178a);
        }
    }
}
