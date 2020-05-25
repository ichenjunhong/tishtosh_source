package com.bytedance.android.livesdk.widget.roundcorner;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build.VERSION;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.widget.roundcorner.c */
public final class C8563c {

    /* renamed from: a */
    int f23485a;

    /* renamed from: b */
    int f23486b;

    /* renamed from: c */
    int f23487c;

    /* renamed from: d */
    int f23488d;

    /* renamed from: e */
    final RectF f23489e = new RectF();

    /* renamed from: f */
    final float[] f23490f = new float[8];

    /* renamed from: g */
    final Path f23491g = new Path();

    /* renamed from: h */
    final Paint f23492h = new Paint(1);

    /* renamed from: i */
    final PorterDuffXfermode f23493i = new PorterDuffXfermode(Mode.SRC_IN);

    /* renamed from: j */
    final C8561a f23494j;

    public C8563c(C8561a aVar) {
        C52711k.m112240b(aVar, "view");
        this.f23494j = aVar;
    }

    /* renamed from: a */
    static int m16904a(Canvas canvas, RectF rectF, Paint paint) {
        if (VERSION.SDK_INT >= 21) {
            return canvas.saveLayer(rectF, paint);
        }
        return canvas.saveLayer(rectF, paint, 31);
    }
}
