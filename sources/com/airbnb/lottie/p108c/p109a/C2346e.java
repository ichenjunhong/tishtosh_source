package com.airbnb.lottie.p108c.p109a;

import android.graphics.PointF;
import com.airbnb.lottie.p104a.p106b.C2320a;
import com.airbnb.lottie.p104a.p106b.C2329i;
import com.airbnb.lottie.p104a.p106b.C2330j;
import com.airbnb.lottie.p115g.C2468a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.c.a.e */
public final class C2346e implements C2354m<PointF, PointF> {

    /* renamed from: a */
    private final List<C2468a<PointF>> f7300a;

    public C2346e() {
        this.f7300a = Collections.singletonList(new C2468a(new PointF(0.0f, 0.0f)));
    }

    /* renamed from: a */
    public final C2320a<PointF, PointF> mo6735a() {
        if (((C2468a) this.f7300a.get(0)).mo6862c()) {
            return new C2330j(this.f7300a);
        }
        return new C2329i(this.f7300a);
    }

    public C2346e(List<C2468a<PointF>> list) {
        this.f7300a = list;
    }
}
