package com.airbnb.lottie.p104a.p106b;

import com.airbnb.lottie.p114f.C2453e;
import com.airbnb.lottie.p115g.C2468a;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.c */
public final class C2323c extends C2326f<Float> {
    public C2323c(List<C2468a<Float>> list) {
        super(list);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo6719a(C2468a aVar, float f) {
        if (aVar.f7609b == null || aVar.f7610c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        } else if (this.f7253d == null) {
            return Float.valueOf(C2453e.m7169a(((Float) aVar.f7609b).floatValue(), ((Float) aVar.f7610c).floatValue(), f));
        } else {
            return (Float) this.f7253d.mo6865a(aVar.f7612e, aVar.f7613f.floatValue(), aVar.f7609b, aVar.f7610c, f, mo6724b(), this.f7252c);
        }
    }
}
