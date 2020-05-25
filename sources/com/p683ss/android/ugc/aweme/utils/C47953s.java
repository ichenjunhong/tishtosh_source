package com.p683ss.android.ugc.aweme.utils;

import android.animation.TypeEvaluator;
import android.graphics.PointF;

/* renamed from: com.ss.android.ugc.aweme.utils.s */
public final class C47953s implements TypeEvaluator<PointF> {

    /* renamed from: a */
    PointF f120555a = new PointF();

    /* renamed from: b */
    private float f120556b;

    /* renamed from: c */
    private float f120557c;

    /* renamed from: d */
    private float f120558d;

    /* renamed from: e */
    private float f120559e;

    /* renamed from: f */
    private float f120560f;

    /* renamed from: g */
    private float f120561g;

    public C47953s(PointF pointF, PointF pointF2) {
        float f = pointF.x * 3.0f;
        float f2 = pointF2.x * 3.0f;
        this.f120556b = f - f2;
        this.f120557c = f2 - (f * 2.0f);
        this.f120558d = f;
        float f3 = pointF.y * 3.0f;
        float f4 = pointF2.y * 3.0f;
        this.f120559e = f3 - f4;
        this.f120560f = f4 - (2.0f * f3);
        this.f120561g = f3;
    }

    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        PointF pointF = (PointF) obj;
        PointF pointF2 = (PointF) obj2;
        float f2 = pointF.x * 3.0f;
        float f3 = pointF.y * 3.0f;
        this.f120555a.x = (((((((((pointF2.x - pointF.x) + this.f120556b) * f) + f2) + this.f120557c) * f) - f2) + this.f120558d) * f) + pointF.x;
        this.f120555a.y = (f * ((((((((pointF2.y - pointF.y) + this.f120559e) * f) + f3) + this.f120560f) * f) - f3) + this.f120561g)) + pointF.y;
        return this.f120555a;
    }
}
