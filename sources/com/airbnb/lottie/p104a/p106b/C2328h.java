package com.airbnb.lottie.p104a.p106b;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C2408e;
import com.airbnb.lottie.p115g.C2468a;

/* renamed from: com.airbnb.lottie.a.b.h */
public final class C2328h extends C2468a<PointF> {

    /* renamed from: a */
    public Path f7260a;

    public C2328h(C2408e eVar, C2468a<PointF> aVar) {
        boolean z;
        super(eVar, aVar.f7609b, aVar.f7610c, aVar.f7611d, aVar.f7612e, aVar.f7613f);
        if (this.f7610c == null || this.f7609b == null || !((PointF) this.f7609b).equals(((PointF) this.f7610c).x, ((PointF) this.f7610c).y)) {
            z = false;
        } else {
            z = true;
        }
        if (this.f7610c != null && !z) {
            PointF pointF = (PointF) this.f7609b;
            PointF pointF2 = (PointF) this.f7610c;
            PointF pointF3 = aVar.f7614g;
            PointF pointF4 = aVar.f7615h;
            Path path = new Path();
            path.moveTo(pointF.x, pointF.y);
            if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
                path.lineTo(pointF2.x, pointF2.y);
            } else {
                Path path2 = path;
                path2.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
            }
            this.f7260a = path;
        }
    }
}
