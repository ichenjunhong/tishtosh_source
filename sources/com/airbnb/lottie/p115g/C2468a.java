package com.airbnb.lottie.p115g;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.C2408e;

/* renamed from: com.airbnb.lottie.g.a */
public class C2468a<T> {

    /* renamed from: a */
    private final C2408e f7608a;

    /* renamed from: b */
    public final T f7609b;

    /* renamed from: c */
    public final T f7610c;

    /* renamed from: d */
    public final Interpolator f7611d;

    /* renamed from: e */
    public final float f7612e;

    /* renamed from: f */
    public Float f7613f;

    /* renamed from: g */
    public PointF f7614g;

    /* renamed from: h */
    public PointF f7615h;

    /* renamed from: i */
    private float f7616i = Float.MIN_VALUE;

    /* renamed from: j */
    private float f7617j = Float.MIN_VALUE;

    /* renamed from: c */
    public final boolean mo6862c() {
        if (this.f7611d == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final float mo6859a() {
        if (this.f7608a == null) {
            return 0.0f;
        }
        if (this.f7616i == Float.MIN_VALUE) {
            this.f7616i = (this.f7612e - this.f7608a.f7523i) / this.f7608a.mo6781b();
        }
        return this.f7616i;
    }

    /* renamed from: b */
    public final float mo6861b() {
        if (this.f7608a == null) {
            return 1.0f;
        }
        if (this.f7617j == Float.MIN_VALUE) {
            if (this.f7613f == null) {
                this.f7617j = 1.0f;
            } else {
                this.f7617j = mo6859a() + ((this.f7613f.floatValue() - this.f7612e) / this.f7608a.mo6781b());
            }
        }
        return this.f7617j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Keyframe{startValue=");
        sb.append(this.f7609b);
        sb.append(", endValue=");
        sb.append(this.f7610c);
        sb.append(", startFrame=");
        sb.append(this.f7612e);
        sb.append(", endFrame=");
        sb.append(this.f7613f);
        sb.append(", interpolator=");
        sb.append(this.f7611d);
        sb.append('}');
        return sb.toString();
    }

    public C2468a(T t) {
        this.f7609b = t;
        this.f7610c = t;
        this.f7612e = Float.MIN_VALUE;
        this.f7613f = Float.valueOf(Float.MAX_VALUE);
    }

    /* renamed from: a */
    public final boolean mo6860a(float f) {
        if (f < mo6859a() || f >= mo6861b()) {
            return false;
        }
        return true;
    }

    public C2468a(C2408e eVar, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.f7608a = eVar;
        this.f7609b = t;
        this.f7610c = t2;
        this.f7611d = interpolator;
        this.f7612e = f;
        this.f7613f = f2;
    }
}
