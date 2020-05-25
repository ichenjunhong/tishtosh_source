package com.airbnb.lottie.p104a.p106b;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.C2474j;
import com.airbnb.lottie.p104a.p106b.C2320a.C2321a;
import com.airbnb.lottie.p108c.p109a.C2353l;
import com.airbnb.lottie.p108c.p111c.C2382a;
import com.airbnb.lottie.p115g.C2470c;
import com.airbnb.lottie.p115g.C2471d;

/* renamed from: com.airbnb.lottie.a.b.o */
public final class C2335o {

    /* renamed from: a */
    public final C2320a<PointF, PointF> f7271a;

    /* renamed from: b */
    public final C2320a<?, PointF> f7272b;

    /* renamed from: c */
    public final C2320a<C2471d, C2471d> f7273c;

    /* renamed from: d */
    public final C2320a<Float, Float> f7274d;

    /* renamed from: e */
    public final C2320a<Integer, Integer> f7275e;

    /* renamed from: f */
    public final C2320a<?, Float> f7276f;

    /* renamed from: g */
    public final C2320a<?, Float> f7277g;

    /* renamed from: h */
    private final Matrix f7278h = new Matrix();

    /* renamed from: a */
    public final Matrix mo6727a() {
        this.f7278h.reset();
        PointF pointF = (PointF) this.f7272b.mo6726d();
        if (!(pointF.x == 0.0f && pointF.y == 0.0f)) {
            this.f7278h.preTranslate(pointF.x, pointF.y);
        }
        float floatValue = ((Float) this.f7274d.mo6726d()).floatValue();
        if (floatValue != 0.0f) {
            this.f7278h.preRotate(floatValue);
        }
        C2471d dVar = (C2471d) this.f7273c.mo6726d();
        if (!(dVar.f7628a == 1.0f && dVar.f7629b == 1.0f)) {
            this.f7278h.preScale(dVar.f7628a, dVar.f7629b);
        }
        PointF pointF2 = (PointF) this.f7271a.mo6726d();
        if (!(pointF2.x == 0.0f && pointF2.y == 0.0f)) {
            this.f7278h.preTranslate(-pointF2.x, -pointF2.y);
        }
        return this.f7278h;
    }

    /* renamed from: a */
    public final void mo6729a(C2321a aVar) {
        this.f7271a.mo6722a(aVar);
        this.f7272b.mo6722a(aVar);
        this.f7273c.mo6722a(aVar);
        this.f7274d.mo6722a(aVar);
        this.f7275e.mo6722a(aVar);
        if (this.f7276f != null) {
            this.f7276f.mo6722a(aVar);
        }
        if (this.f7277g != null) {
            this.f7277g.mo6722a(aVar);
        }
    }

    public C2335o(C2353l lVar) {
        this.f7271a = lVar.f7307a.mo6735a();
        this.f7272b = lVar.f7308b.mo6735a();
        this.f7273c = lVar.f7309c.mo6735a();
        this.f7274d = lVar.f7310d.mo6735a();
        this.f7275e = lVar.f7311e.mo6735a();
        if (lVar.f7312f != null) {
            this.f7276f = lVar.f7312f.mo6735a();
        } else {
            this.f7276f = null;
        }
        if (lVar.f7313g != null) {
            this.f7277g = lVar.f7313g.mo6735a();
        } else {
            this.f7277g = null;
        }
    }

    /* renamed from: a */
    public final Matrix mo6728a(float f) {
        PointF pointF = (PointF) this.f7272b.mo6726d();
        PointF pointF2 = (PointF) this.f7271a.mo6726d();
        C2471d dVar = (C2471d) this.f7273c.mo6726d();
        float floatValue = ((Float) this.f7274d.mo6726d()).floatValue();
        this.f7278h.reset();
        this.f7278h.preTranslate(pointF.x * f, pointF.y * f);
        double d = (double) f;
        this.f7278h.preScale((float) Math.pow((double) dVar.f7628a, d), (float) Math.pow((double) dVar.f7629b, d));
        this.f7278h.preRotate(floatValue * f, pointF2.x, pointF2.y);
        return this.f7278h;
    }

    /* renamed from: a */
    public final void mo6730a(C2382a aVar) {
        aVar.mo6752a(this.f7271a);
        aVar.mo6752a(this.f7272b);
        aVar.mo6752a(this.f7273c);
        aVar.mo6752a(this.f7274d);
        aVar.mo6752a(this.f7275e);
        if (this.f7276f != null) {
            aVar.mo6752a(this.f7276f);
        }
        if (this.f7277g != null) {
            aVar.mo6752a(this.f7277g);
        }
    }

    /* renamed from: a */
    public final <T> boolean mo6731a(T t, C2470c<T> cVar) {
        if (t == C2474j.f7640e) {
            this.f7271a.mo6723a(cVar);
        } else if (t == C2474j.f7641f) {
            this.f7272b.mo6723a(cVar);
        } else if (t == C2474j.f7644i) {
            this.f7273c.mo6723a(cVar);
        } else if (t == C2474j.f7645j) {
            this.f7274d.mo6723a(cVar);
        } else if (t == C2474j.f7638c) {
            this.f7275e.mo6723a(cVar);
        } else if (t == C2474j.f7656u && this.f7276f != null) {
            this.f7276f.mo6723a(cVar);
        } else if (t != C2474j.f7657v || this.f7277g == null) {
            return false;
        } else {
            this.f7277g.mo6723a(cVar);
        }
        return true;
    }
}
