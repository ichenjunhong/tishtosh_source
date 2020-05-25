package com.airbnb.lottie.p104a.p105a;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C2455g;
import com.airbnb.lottie.C2474j;
import com.airbnb.lottie.p104a.p106b.C2320a;
import com.airbnb.lottie.p104a.p106b.C2320a.C2321a;
import com.airbnb.lottie.p108c.C2398e;
import com.airbnb.lottie.p108c.p110b.C2357a;
import com.airbnb.lottie.p108c.p110b.C2379q.C2380a;
import com.airbnb.lottie.p108c.p111c.C2382a;
import com.airbnb.lottie.p114f.C2453e;
import com.airbnb.lottie.p114f.C2454f;
import com.airbnb.lottie.p115g.C2470c;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.e */
public final class C2304e implements C2309j, C2312l, C2321a {

    /* renamed from: a */
    private final Path f7152a = new Path();

    /* renamed from: b */
    private final String f7153b;

    /* renamed from: c */
    private final C2455g f7154c;

    /* renamed from: d */
    private final C2320a<?, PointF> f7155d;

    /* renamed from: e */
    private final C2320a<?, PointF> f7156e;

    /* renamed from: f */
    private final C2357a f7157f;

    /* renamed from: g */
    private C2319r f7158g;

    /* renamed from: h */
    private boolean f7159h;

    /* renamed from: b */
    public final String mo6713b() {
        return this.f7153b;
    }

    /* renamed from: a */
    public final void mo6707a() {
        this.f7159h = false;
        this.f7154c.invalidateSelf();
    }

    /* renamed from: e */
    public final Path mo6716e() {
        if (this.f7159h) {
            return this.f7152a;
        }
        this.f7152a.reset();
        PointF pointF = (PointF) this.f7155d.mo6726d();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.f7152a.reset();
        if (this.f7157f.f7329d) {
            float f5 = -f2;
            this.f7152a.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.f7152a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            float f10 = f5;
            this.f7152a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f11 = f3 + 0.0f;
            this.f7152a.cubicTo(f11, f2, f, f9, f, 0.0f);
            this.f7152a.cubicTo(f, f8, f11, f10, 0.0f, f10);
        } else {
            float f12 = -f2;
            this.f7152a.moveTo(0.0f, f12);
            float f13 = f3 + 0.0f;
            float f14 = 0.0f - f4;
            this.f7152a.cubicTo(f13, f12, f, f14, f, 0.0f);
            float f15 = f4 + 0.0f;
            this.f7152a.cubicTo(f, f15, f13, f2, 0.0f, f2);
            float f16 = 0.0f - f3;
            float f17 = -f;
            this.f7152a.cubicTo(f16, f2, f17, f15, f17, 0.0f);
            float f18 = f12;
            this.f7152a.cubicTo(f17, f14, f16, f18, 0.0f, f18);
        }
        PointF pointF2 = (PointF) this.f7156e.mo6726d();
        this.f7152a.offset(pointF2.x, pointF2.y);
        this.f7152a.close();
        C2454f.m7179a(this.f7152a, this.f7158g);
        this.f7159h = true;
        return this.f7152a;
    }

    /* renamed from: a */
    public final <T> void mo6711a(T t, C2470c<T> cVar) {
        if (t == C2474j.f7642g) {
            this.f7155d.mo6723a(cVar);
            return;
        }
        if (t == C2474j.f7643h) {
            this.f7156e.mo6723a(cVar);
        }
    }

    /* renamed from: a */
    public final void mo6712a(List<C2301b> list, List<C2301b> list2) {
        for (int i = 0; i < list.size(); i++) {
            C2301b bVar = (C2301b) list.get(i);
            if (bVar instanceof C2319r) {
                C2319r rVar = (C2319r) bVar;
                if (rVar.f7244a == C2380a.Simultaneously) {
                    this.f7158g = rVar;
                    this.f7158g.mo6718a(this);
                }
            }
        }
    }

    public C2304e(C2455g gVar, C2382a aVar, C2357a aVar2) {
        this.f7153b = aVar2.f7326a;
        this.f7154c = gVar;
        this.f7155d = aVar2.f7328c.mo6735a();
        this.f7156e = aVar2.f7327b.mo6735a();
        this.f7157f = aVar2;
        aVar.mo6752a(this.f7155d);
        aVar.mo6752a(this.f7156e);
        this.f7155d.mo6722a((C2321a) this);
        this.f7156e.mo6722a((C2321a) this);
    }

    /* renamed from: a */
    public final void mo6710a(C2398e eVar, int i, List<C2398e> list, C2398e eVar2) {
        C2453e.m7174a(eVar, i, list, eVar2, this);
    }
}
