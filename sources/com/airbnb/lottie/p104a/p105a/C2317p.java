package com.airbnb.lottie.p104a.p105a;

import android.graphics.Path;
import android.graphics.Path.FillType;
import com.airbnb.lottie.C2455g;
import com.airbnb.lottie.p104a.p106b.C2320a;
import com.airbnb.lottie.p104a.p106b.C2320a.C2321a;
import com.airbnb.lottie.p108c.p110b.C2374o;
import com.airbnb.lottie.p108c.p110b.C2379q.C2380a;
import com.airbnb.lottie.p108c.p111c.C2382a;
import com.airbnb.lottie.p114f.C2454f;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.p */
public final class C2317p implements C2312l, C2321a {

    /* renamed from: a */
    private final Path f7234a = new Path();

    /* renamed from: b */
    private final String f7235b;

    /* renamed from: c */
    private final C2455g f7236c;

    /* renamed from: d */
    private final C2320a<?, Path> f7237d;

    /* renamed from: e */
    private boolean f7238e;

    /* renamed from: f */
    private C2319r f7239f;

    /* renamed from: b */
    public final String mo6713b() {
        return this.f7235b;
    }

    /* renamed from: a */
    public final void mo6707a() {
        this.f7238e = false;
        this.f7236c.invalidateSelf();
    }

    /* renamed from: e */
    public final Path mo6716e() {
        if (this.f7238e) {
            return this.f7234a;
        }
        this.f7234a.reset();
        this.f7234a.set((Path) this.f7237d.mo6726d());
        this.f7234a.setFillType(FillType.EVEN_ODD);
        C2454f.m7179a(this.f7234a, this.f7239f);
        this.f7238e = true;
        return this.f7234a;
    }

    /* renamed from: a */
    public final void mo6712a(List<C2301b> list, List<C2301b> list2) {
        for (int i = 0; i < list.size(); i++) {
            C2301b bVar = (C2301b) list.get(i);
            if (bVar instanceof C2319r) {
                C2319r rVar = (C2319r) bVar;
                if (rVar.f7244a == C2380a.Simultaneously) {
                    this.f7239f = rVar;
                    this.f7239f.mo6718a(this);
                }
            }
        }
    }

    public C2317p(C2455g gVar, C2382a aVar, C2374o oVar) {
        this.f7235b = oVar.f7390a;
        this.f7236c = gVar;
        this.f7237d = oVar.f7391b.mo6735a();
        aVar.mo6752a(this.f7237d);
        this.f7237d.mo6722a((C2321a) this);
    }
}
