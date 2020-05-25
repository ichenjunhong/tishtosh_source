package com.p683ss.android.ugc.aweme.shortvideo.edit.p2191c;

import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.c.a */
public final class C43454a {
    /* renamed from: a */
    public static void m95251a(RectF rectF, float f) {
        float width = rectF.width();
        float height = rectF.height();
        float f2 = ((f * width) - width) / 2.0f;
        float f3 = ((f * height) - height) / 2.0f;
        rectF.left -= f2;
        rectF.top -= f3;
        rectF.right += f2;
        rectF.bottom += f3;
    }

    /* renamed from: b */
    public static boolean m95253b(RectF rectF, float f, float f2, float f3) {
        if (Math.abs(f3) <= 0.0f) {
            return rectF.contains(f, f2);
        }
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        double d = (double) (-f3);
        float sin = (float) Math.sin(Math.toRadians(d));
        float cos = (float) Math.cos(Math.toRadians(d));
        float f4 = f - centerX;
        float f5 = f2 - centerY;
        return rectF.contains((centerX + (f4 * cos)) - (f5 * sin), centerY + (f5 * cos) + (f4 * sin));
    }

    /* renamed from: a */
    public static PointF m95250a(PointF pointF, float f, float f2, float f3) {
        if (Math.abs(f3) <= 0.0f) {
            return pointF;
        }
        double d = (double) (pointF.x - f);
        double d2 = (double) f3;
        double cos = Math.cos(d2);
        Double.isNaN(d);
        double d3 = d * cos;
        double d4 = (double) (pointF.y - f2);
        double sin = Math.sin(d2);
        Double.isNaN(d4);
        double d5 = d3 - (d4 * sin);
        double d6 = (double) f;
        Double.isNaN(d6);
        double d7 = d5 + d6;
        double d8 = (double) (pointF.x - f);
        double sin2 = Math.sin(d2);
        Double.isNaN(d8);
        double d9 = d8 * sin2;
        double d10 = (double) (pointF.y - f2);
        double cos2 = Math.cos(d2);
        Double.isNaN(d10);
        double d11 = d9 + (d10 * cos2);
        double d12 = (double) f2;
        Double.isNaN(d12);
        double d13 = d11 + d12;
        float f4 = (float) d7;
        float f5 = (float) d13;
        pointF.set(f4, f5);
        return new PointF(f4, f5);
    }

    /* renamed from: a */
    public static void m95252a(RectF rectF, float f, float f2, float f3) {
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        double d = (double) f3;
        float sin = (float) Math.sin(Math.toRadians(d));
        float cos = (float) Math.cos(Math.toRadians(d));
        float f4 = centerX - f;
        float f5 = centerY - f2;
        rectF.offset(((f + (f4 * cos)) - (f5 * sin)) - centerX, ((f2 + (f5 * cos)) + (f4 * sin)) - centerY);
    }
}
