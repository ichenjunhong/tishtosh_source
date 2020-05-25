package com.airbnb.lottie.p104a.p106b;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C2340c;
import com.airbnb.lottie.p108c.C2341a;
import com.airbnb.lottie.p108c.p110b.C2371l;
import com.airbnb.lottie.p114f.C2453e;
import com.airbnb.lottie.p115g.C2468a;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.l */
public final class C2332l extends C2320a<C2371l, Path> {

    /* renamed from: e */
    private final C2371l f7266e = new C2371l();

    /* renamed from: f */
    private final Path f7267f = new Path();

    public C2332l(List<C2468a<C2371l>> list) {
        super(list);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo6719a(C2468a aVar, float f) {
        boolean z;
        C2371l lVar = (C2371l) aVar.f7609b;
        C2371l lVar2 = (C2371l) aVar.f7610c;
        C2371l lVar3 = this.f7266e;
        if (lVar3.f7381b == null) {
            lVar3.f7381b = new PointF();
        }
        if (lVar.f7382c || lVar2.f7382c) {
            z = true;
        } else {
            z = false;
        }
        lVar3.f7382c = z;
        if (lVar.f7380a.size() != lVar2.f7380a.size()) {
            StringBuilder sb = new StringBuilder("Curves must have the same number of control points. Shape 1: ");
            sb.append(lVar.f7380a.size());
            sb.append("\tShape 2: ");
            sb.append(lVar2.f7380a.size());
            C2340c.m6968a(sb.toString());
        }
        if (lVar3.f7380a.isEmpty()) {
            int min = Math.min(lVar.f7380a.size(), lVar2.f7380a.size());
            for (int i = 0; i < min; i++) {
                lVar3.f7380a.add(new C2341a());
            }
        }
        PointF pointF = lVar.f7381b;
        PointF pointF2 = lVar2.f7381b;
        float a = C2453e.m7169a(pointF.x, pointF2.x, f);
        float a2 = C2453e.m7169a(pointF.y, pointF2.y, f);
        if (lVar3.f7381b == null) {
            lVar3.f7381b = new PointF();
        }
        lVar3.f7381b.set(a, a2);
        for (int size = lVar3.f7380a.size() - 1; size >= 0; size--) {
            C2341a aVar2 = (C2341a) lVar.f7380a.get(size);
            C2341a aVar3 = (C2341a) lVar2.f7380a.get(size);
            PointF pointF3 = aVar2.f7297a;
            PointF pointF4 = aVar2.f7298b;
            PointF pointF5 = aVar2.f7299c;
            PointF pointF6 = aVar3.f7297a;
            PointF pointF7 = aVar3.f7298b;
            PointF pointF8 = aVar3.f7299c;
            C2341a aVar4 = (C2341a) lVar3.f7380a.get(size);
            aVar4.f7297a.set(C2453e.m7169a(pointF3.x, pointF6.x, f), C2453e.m7169a(pointF3.y, pointF6.y, f));
            C2341a aVar5 = (C2341a) lVar3.f7380a.get(size);
            aVar5.f7298b.set(C2453e.m7169a(pointF4.x, pointF7.x, f), C2453e.m7169a(pointF4.y, pointF7.y, f));
            C2341a aVar6 = (C2341a) lVar3.f7380a.get(size);
            aVar6.f7299c.set(C2453e.m7169a(pointF5.x, pointF8.x, f), C2453e.m7169a(pointF5.y, pointF8.y, f));
        }
        C2453e.m7173a(this.f7266e, this.f7267f);
        return this.f7267f;
    }
}
