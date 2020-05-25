package com.airbnb.lottie.p104a.p106b;

import android.graphics.PointF;
import com.airbnb.lottie.p104a.p106b.C2320a.C2321a;
import com.airbnb.lottie.p115g.C2468a;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.a.b.m */
public final class C2333m extends C2320a<PointF, PointF> {

    /* renamed from: e */
    private final PointF f7268e = new PointF();

    /* renamed from: f */
    private final C2320a<Float, Float> f7269f;

    /* renamed from: g */
    private final C2320a<Float, Float> f7270g;

    /* renamed from: d */
    public final /* synthetic */ Object mo6726d() {
        return mo6719a(null, 0.0f);
    }

    /* renamed from: a */
    public final void mo6721a(float f) {
        this.f7269f.mo6721a(f);
        this.f7270g.mo6721a(f);
        this.f7268e.set(((Float) this.f7269f.mo6726d()).floatValue(), ((Float) this.f7270g.mo6726d()).floatValue());
        for (int i = 0; i < this.f7250a.size(); i++) {
            ((C2321a) this.f7250a.get(i)).mo6707a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public PointF mo6719a(C2468a<PointF> aVar, float f) {
        return this.f7268e;
    }

    public C2333m(C2320a<Float, Float> aVar, C2320a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.f7269f = aVar;
        this.f7270g = aVar2;
        mo6721a(this.f7252c);
    }
}
