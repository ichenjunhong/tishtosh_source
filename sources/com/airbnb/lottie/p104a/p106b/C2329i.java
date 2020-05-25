package com.airbnb.lottie.p104a.p106b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.p115g.C2468a;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.i */
public final class C2329i extends C2326f<PointF> {

    /* renamed from: e */
    private final PointF f7261e = new PointF();

    /* renamed from: f */
    private final float[] f7262f = new float[2];

    /* renamed from: g */
    private C2328h f7263g;

    /* renamed from: h */
    private PathMeasure f7264h;

    public C2329i(List<? extends C2468a<PointF>> list) {
        super(list);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo6719a(C2468a aVar, float f) {
        C2328h hVar = (C2328h) aVar;
        Path path = hVar.f7260a;
        if (path == null) {
            return (PointF) aVar.f7609b;
        }
        if (this.f7253d != null) {
            return (PointF) this.f7253d.mo6865a(hVar.f7612e, hVar.f7613f.floatValue(), hVar.f7609b, hVar.f7610c, mo6724b(), f, this.f7252c);
        }
        if (this.f7263g != hVar) {
            this.f7264h = new PathMeasure(path, false);
            this.f7263g = hVar;
        }
        this.f7264h.getPosTan(f * this.f7264h.getLength(), this.f7262f, null);
        this.f7261e.set(this.f7262f[0], this.f7262f[1]);
        return this.f7261e;
    }
}
