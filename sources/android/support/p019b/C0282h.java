package android.support.p019b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: android.support.b.h */
final class C0282h<T> extends Property<T, Float> {

    /* renamed from: a */
    private final Property<T, PointF> f687a;

    /* renamed from: b */
    private final PathMeasure f688b;

    /* renamed from: c */
    private final float f689c;

    /* renamed from: d */
    private final float[] f690d = new float[2];

    /* renamed from: e */
    private final PointF f691e = new PointF();

    /* renamed from: f */
    private float f692f;

    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf(this.f692f);
    }

    C0282h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f687a = property;
        this.f688b = new PathMeasure(path, false);
        this.f689c = this.f688b.getLength();
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        Float f = (Float) obj2;
        this.f692f = f.floatValue();
        this.f688b.getPosTan(this.f689c * f.floatValue(), this.f690d, null);
        this.f691e.x = this.f690d[0];
        this.f691e.y = this.f690d[1];
        this.f687a.set(obj, this.f691e);
    }
}
