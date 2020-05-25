package com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.drawable.Drawable;
import com.bytedance.ies.dmt.p664ui.common.C10674a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.n */
public final class C46763n extends C10674a {

    /* renamed from: b */
    public final float f118107b;

    public C46763n(Drawable drawable, float f) {
        C52711k.m112240b(drawable, "drawable");
        super(drawable, (Integer) null);
        this.f118107b = f;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        C52711k.m112240b(paint, "paint");
        return (int) (((float) super.getSize(paint, charSequence, i, i2, fontMetricsInt)) + this.f118107b);
    }
}
