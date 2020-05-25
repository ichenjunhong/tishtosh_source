package com.airbnb.lottie.p104a.p106b;

import com.airbnb.lottie.p108c.p110b.C2359c;
import com.airbnb.lottie.p114f.C2450b;
import com.airbnb.lottie.p114f.C2453e;
import com.airbnb.lottie.p115g.C2468a;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.d */
public final class C2324d extends C2326f<C2359c> {

    /* renamed from: e */
    private final C2359c f7256e;

    public C2324d(List<C2468a<C2359c>> list) {
        super(list);
        int i = 0;
        C2359c cVar = (C2359c) ((C2468a) list.get(0)).f7609b;
        if (cVar != null) {
            i = cVar.mo6741a();
        }
        this.f7256e = new C2359c(new float[i], new int[i]);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo6719a(C2468a aVar, float f) {
        C2359c cVar = this.f7256e;
        C2359c cVar2 = (C2359c) aVar.f7609b;
        C2359c cVar3 = (C2359c) aVar.f7610c;
        if (cVar2.f7331b.length == cVar3.f7331b.length) {
            for (int i = 0; i < cVar2.f7331b.length; i++) {
                cVar.f7330a[i] = C2453e.m7169a(cVar2.f7330a[i], cVar3.f7330a[i], f);
                cVar.f7331b[i] = C2450b.m7150a(f, cVar2.f7331b[i], cVar3.f7331b[i]);
            }
            return this.f7256e;
        }
        StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
        sb.append(cVar2.f7331b.length);
        sb.append(" vs ");
        sb.append(cVar3.f7331b.length);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }
}
