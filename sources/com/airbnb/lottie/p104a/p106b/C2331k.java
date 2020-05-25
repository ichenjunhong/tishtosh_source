package com.airbnb.lottie.p104a.p106b;

import com.airbnb.lottie.p114f.C2453e;
import com.airbnb.lottie.p115g.C2468a;
import com.airbnb.lottie.p115g.C2471d;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.k */
public final class C2331k extends C2326f<C2471d> {
    public C2331k(List<C2468a<C2471d>> list) {
        super(list);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo6719a(C2468a aVar, float f) {
        if (aVar.f7609b == null || aVar.f7610c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C2471d dVar = (C2471d) aVar.f7609b;
        C2471d dVar2 = (C2471d) aVar.f7610c;
        if (this.f7253d == null) {
            return new C2471d(C2453e.m7169a(dVar.f7628a, dVar2.f7628a, f), C2453e.m7169a(dVar.f7629b, dVar2.f7629b, f));
        }
        return (C2471d) this.f7253d.mo6865a(aVar.f7612e, aVar.f7613f.floatValue(), dVar, dVar2, f, mo6724b(), this.f7252c);
    }
}
