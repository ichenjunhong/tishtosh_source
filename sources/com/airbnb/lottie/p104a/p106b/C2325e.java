package com.airbnb.lottie.p104a.p106b;

import com.airbnb.lottie.p115g.C2468a;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.e */
public final class C2325e extends C2326f<Integer> {
    public C2325e(List<C2468a<Integer>> list) {
        super(list);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo6719a(C2468a aVar, float f) {
        if (aVar.f7609b == null || aVar.f7610c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        } else if (this.f7253d != null) {
            return (Integer) this.f7253d.mo6865a(aVar.f7612e, aVar.f7613f.floatValue(), aVar.f7609b, aVar.f7610c, f, mo6724b(), this.f7252c);
        } else {
            int intValue = ((Integer) aVar.f7609b).intValue();
            return Integer.valueOf((int) (((float) intValue) + (f * ((float) (((Integer) aVar.f7610c).intValue() - intValue)))));
        }
    }
}
