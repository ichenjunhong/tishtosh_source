package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p2215b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.c */
public final class C44193c<T> extends Property<T, Float> {

    /* renamed from: a */
    private final PathMeasure f111958a;

    /* renamed from: b */
    private final float f111959b;

    /* renamed from: c */
    private final float[] f111960c;

    /* renamed from: d */
    private final PointF f111961d;

    /* renamed from: e */
    private float f111962e;

    /* renamed from: f */
    private final Property<T, PointF> f111963f;

    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf(this.f111962e);
    }

    public C44193c(Property<T, PointF> property, Path path) {
        String str;
        Class cls = Float.TYPE;
        if (property != null) {
            str = property.getName();
        } else {
            str = null;
        }
        super(cls, str);
        this.f111963f = property;
        this.f111960c = new float[2];
        this.f111961d = new PointF();
        this.f111958a = new PathMeasure(path, false);
        this.f111959b = this.f111958a.getLength();
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        float floatValue = ((Number) obj2).floatValue();
        this.f111962e = floatValue;
        this.f111958a.getPosTan(this.f111959b * floatValue, this.f111960c, null);
        this.f111961d.x = this.f111960c[0];
        this.f111961d.y = this.f111960c[1];
        Property<T, PointF> property = this.f111963f;
        if (property != null) {
            property.set(obj, this.f111961d);
        }
    }
}
