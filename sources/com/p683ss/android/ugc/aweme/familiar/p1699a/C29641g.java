package com.p683ss.android.ugc.aweme.familiar.p1699a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.familiar.a.g */
public final class C29641g extends ImageSpan {

    /* renamed from: a */
    private C29637d f77503a;

    public C29641g(Drawable drawable, int i, C29637d dVar) {
        C52711k.m112240b(drawable, "drawable");
        C52711k.m112240b(dVar, "imageDrawListener");
        super(drawable, 1);
        this.f77503a = dVar;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C52711k.m112240b(canvas, "canvas");
        C52711k.m112240b(paint, "paint");
        super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
    }
}
