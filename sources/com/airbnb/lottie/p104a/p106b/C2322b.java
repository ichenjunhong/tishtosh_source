package com.airbnb.lottie.p104a.p106b;

import com.airbnb.lottie.p114f.C2450b;
import com.airbnb.lottie.p115g.C2468a;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.b */
public final class C2322b extends C2326f<Integer> {
    public C2322b(List<C2468a<Integer>> list) {
        super(list);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo6719a(C2468a aVar, float f) {
        if (aVar.f7609b == null || aVar.f7610c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = ((Integer) aVar.f7609b).intValue();
        int intValue2 = ((Integer) aVar.f7610c).intValue();
        if (this.f7253d == null) {
            return Integer.valueOf(C2450b.m7150a(f, intValue, intValue2));
        }
        return (Integer) this.f7253d.mo6865a(aVar.f7612e, aVar.f7613f.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f, mo6724b(), this.f7252c);
    }
}
