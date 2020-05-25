package com.p683ss.android.ugc.aweme.poi.preview.view.image;

import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.ImageView.ScaleType;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.view.image.a */
public final class C39214a {

    /* renamed from: a */
    RectF f100124a = new RectF();

    /* renamed from: b */
    RectF f100125b = new RectF();

    /* renamed from: c */
    RectF f100126c = new RectF();

    /* renamed from: d */
    RectF f100127d = new RectF();

    /* renamed from: e */
    PointF f100128e = new PointF();

    /* renamed from: f */
    float f100129f;

    /* renamed from: g */
    float f100130g;

    /* renamed from: h */
    ScaleType f100131h;

    public C39214a(RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4, PointF pointF, float f, float f2, ScaleType scaleType) {
        this.f100124a.set(rectF);
        this.f100125b.set(rectF2);
        this.f100126c.set(rectF3);
        this.f100129f = f;
        this.f100131h = scaleType;
        this.f100130g = f2;
        this.f100127d.set(rectF4);
        this.f100128e.set(pointF);
    }
}
