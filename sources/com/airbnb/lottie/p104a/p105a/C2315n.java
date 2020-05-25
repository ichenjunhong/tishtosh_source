package com.airbnb.lottie.p104a.p105a;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.C2455g;
import com.airbnb.lottie.p104a.p106b.C2320a;
import com.airbnb.lottie.p104a.p106b.C2320a.C2321a;
import com.airbnb.lottie.p108c.C2398e;
import com.airbnb.lottie.p108c.p110b.C2369j;
import com.airbnb.lottie.p108c.p110b.C2379q.C2380a;
import com.airbnb.lottie.p108c.p111c.C2382a;
import com.airbnb.lottie.p114f.C2453e;
import com.airbnb.lottie.p114f.C2454f;
import com.airbnb.lottie.p115g.C2470c;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.n */
public final class C2315n implements C2309j, C2312l, C2321a {

    /* renamed from: a */
    private final Path f7216a = new Path();

    /* renamed from: b */
    private final RectF f7217b = new RectF();

    /* renamed from: c */
    private final String f7218c;

    /* renamed from: d */
    private final C2455g f7219d;

    /* renamed from: e */
    private final C2320a<?, PointF> f7220e;

    /* renamed from: f */
    private final C2320a<?, PointF> f7221f;

    /* renamed from: g */
    private final C2320a<?, Float> f7222g;

    /* renamed from: h */
    private C2319r f7223h;

    /* renamed from: i */
    private boolean f7224i;

    /* renamed from: a */
    public final <T> void mo6711a(T t, C2470c<T> cVar) {
    }

    /* renamed from: b */
    public final String mo6713b() {
        return this.f7218c;
    }

    /* renamed from: a */
    public final void mo6707a() {
        this.f7224i = false;
        this.f7219d.invalidateSelf();
    }

    /* renamed from: e */
    public final Path mo6716e() {
        float f;
        if (this.f7224i) {
            return this.f7216a;
        }
        this.f7216a.reset();
        PointF pointF = (PointF) this.f7221f.mo6726d();
        float f2 = pointF.x / 2.0f;
        float f3 = pointF.y / 2.0f;
        if (this.f7222g == null) {
            f = 0.0f;
        } else {
            f = ((Float) this.f7222g.mo6726d()).floatValue();
        }
        float min = Math.min(f2, f3);
        if (f > min) {
            f = min;
        }
        PointF pointF2 = (PointF) this.f7220e.mo6726d();
        this.f7216a.moveTo(pointF2.x + f2, (pointF2.y - f3) + f);
        this.f7216a.lineTo(pointF2.x + f2, (pointF2.y + f3) - f);
        if (f > 0.0f) {
            float f4 = f * 2.0f;
            this.f7217b.set((pointF2.x + f2) - f4, (pointF2.y + f3) - f4, pointF2.x + f2, pointF2.y + f3);
            this.f7216a.arcTo(this.f7217b, 0.0f, 90.0f, false);
        }
        this.f7216a.lineTo((pointF2.x - f2) + f, pointF2.y + f3);
        if (f > 0.0f) {
            float f5 = f * 2.0f;
            this.f7217b.set(pointF2.x - f2, (pointF2.y + f3) - f5, (pointF2.x - f2) + f5, pointF2.y + f3);
            this.f7216a.arcTo(this.f7217b, 90.0f, 90.0f, false);
        }
        this.f7216a.lineTo(pointF2.x - f2, (pointF2.y - f3) + f);
        if (f > 0.0f) {
            float f6 = f * 2.0f;
            this.f7217b.set(pointF2.x - f2, pointF2.y - f3, (pointF2.x - f2) + f6, (pointF2.y - f3) + f6);
            this.f7216a.arcTo(this.f7217b, 180.0f, 90.0f, false);
        }
        this.f7216a.lineTo((pointF2.x + f2) - f, pointF2.y - f3);
        if (f > 0.0f) {
            float f7 = f * 2.0f;
            this.f7217b.set((pointF2.x + f2) - f7, pointF2.y - f3, pointF2.x + f2, (pointF2.y - f3) + f7);
            this.f7216a.arcTo(this.f7217b, 270.0f, 90.0f, false);
        }
        this.f7216a.close();
        C2454f.m7179a(this.f7216a, this.f7223h);
        this.f7224i = true;
        return this.f7216a;
    }

    /* renamed from: a */
    public final void mo6712a(List<C2301b> list, List<C2301b> list2) {
        for (int i = 0; i < list.size(); i++) {
            C2301b bVar = (C2301b) list.get(i);
            if (bVar instanceof C2319r) {
                C2319r rVar = (C2319r) bVar;
                if (rVar.f7244a == C2380a.Simultaneously) {
                    this.f7223h = rVar;
                    this.f7223h.mo6718a(this);
                }
            }
        }
    }

    public C2315n(C2455g gVar, C2382a aVar, C2369j jVar) {
        this.f7218c = jVar.f7372a;
        this.f7219d = gVar;
        this.f7220e = jVar.f7373b.mo6735a();
        this.f7221f = jVar.f7374c.mo6735a();
        this.f7222g = jVar.f7375d.mo6735a();
        aVar.mo6752a(this.f7220e);
        aVar.mo6752a(this.f7221f);
        aVar.mo6752a(this.f7222g);
        this.f7220e.mo6722a((C2321a) this);
        this.f7221f.mo6722a((C2321a) this);
        this.f7222g.mo6722a((C2321a) this);
    }

    /* renamed from: a */
    public final void mo6710a(C2398e eVar, int i, List<C2398e> list, C2398e eVar2) {
        C2453e.m7174a(eVar, i, list, eVar2, this);
    }
}
