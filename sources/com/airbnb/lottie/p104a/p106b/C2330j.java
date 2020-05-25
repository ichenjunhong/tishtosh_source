package com.airbnb.lottie.p104a.p106b;

import android.graphics.PointF;
import com.airbnb.lottie.p115g.C2468a;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.j */
public final class C2330j extends C2326f<PointF> {

    /* renamed from: e */
    private final PointF f7265e = new PointF();

    public C2330j(List<C2468a<PointF>> list) {
        super(list);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo6719a(C2468a aVar, float f) {
        if (aVar.f7609b == null || aVar.f7610c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) aVar.f7609b;
        PointF pointF2 = (PointF) aVar.f7610c;
        if (this.f7253d != null) {
            return (PointF) this.f7253d.mo6865a(aVar.f7612e, aVar.f7613f.floatValue(), pointF, pointF2, f, mo6724b(), this.f7252c);
        }
        this.f7265e.set(pointF.x + ((pointF2.x - pointF.x) * f), pointF.y + (f * (pointF2.y - pointF.y)));
        return this.f7265e;
    }
}
