package com.airbnb.lottie.p108c.p110b;

import android.graphics.PointF;
import com.airbnb.lottie.p108c.C2341a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.c.b.l */
public final class C2371l {

    /* renamed from: a */
    public final List<C2341a> f7380a = new ArrayList();

    /* renamed from: b */
    public PointF f7381b;

    /* renamed from: c */
    public boolean f7382c;

    public C2371l() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeData{numCurves=");
        sb.append(this.f7380a.size());
        sb.append("closed=");
        sb.append(this.f7382c);
        sb.append('}');
        return sb.toString();
    }

    public C2371l(PointF pointF, boolean z, List<C2341a> list) {
        this.f7381b = pointF;
        this.f7382c = z;
        this.f7380a.addAll(list);
    }
}
