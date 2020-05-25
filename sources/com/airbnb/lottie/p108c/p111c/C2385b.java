package com.airbnb.lottie.p108c.p111c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.support.p030v4.p038f.C0785g;
import com.airbnb.lottie.C2340c;
import com.airbnb.lottie.C2408e;
import com.airbnb.lottie.C2455g;
import com.airbnb.lottie.C2474j;
import com.airbnb.lottie.p104a.p106b.C2320a;
import com.airbnb.lottie.p104a.p106b.C2320a.C2321a;
import com.airbnb.lottie.p104a.p106b.C2336p;
import com.airbnb.lottie.p108c.C2398e;
import com.airbnb.lottie.p108c.p109a.C2343b;
import com.airbnb.lottie.p115g.C2470c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.c.c.b */
public final class C2385b extends C2382a {

    /* renamed from: g */
    private C2320a<Float, Float> f7442g;

    /* renamed from: h */
    private final List<C2382a> f7443h = new ArrayList();

    /* renamed from: i */
    private final RectF f7444i = new RectF();

    /* renamed from: j */
    private final RectF f7445j = new RectF();

    /* renamed from: a */
    public final void mo6751a(float f) {
        super.mo6751a(f);
        if (this.f7442g != null) {
            f = ((float) ((long) (((Float) this.f7442g.mo6726d()).floatValue() * 1000.0f))) / this.f7417b.f7570a.mo6777a();
        }
        if (this.f7418c.f7463m != 0.0f) {
            f /= this.f7418c.f7463m;
        }
        C2388d dVar = this.f7418c;
        float b = f - (dVar.f7464n / dVar.f7452b.mo6781b());
        for (int size = this.f7443h.size() - 1; size >= 0; size--) {
            ((C2382a) this.f7443h.get(size)).mo6751a(b);
        }
    }

    /* renamed from: a */
    public final <T> void mo6711a(T t, C2470c<T> cVar) {
        super.mo6711a(t, cVar);
        if (t == C2474j.f7658w) {
            if (cVar == null) {
                this.f7442g = null;
            } else {
                this.f7442g = new C2336p(cVar);
                mo6752a(this.f7442g);
            }
        }
    }

    /* renamed from: a */
    public final void mo6709a(RectF rectF, Matrix matrix) {
        super.mo6709a(rectF, matrix);
        this.f7444i.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f7443h.size() - 1; size >= 0; size--) {
            ((C2382a) this.f7443h.get(size)).mo6709a(this.f7444i, this.f7416a);
            if (rectF.isEmpty()) {
                rectF.set(this.f7444i);
            } else {
                rectF.set(Math.min(rectF.left, this.f7444i.left), Math.min(rectF.top, this.f7444i.top), Math.max(rectF.right, this.f7444i.right), Math.max(rectF.bottom, this.f7444i.bottom));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo6754b(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        C2340c.m6969b("CompositionLayer#draw");
        canvas.save();
        this.f7445j.set(0.0f, 0.0f, (float) this.f7418c.f7465o, (float) this.f7418c.f7466p);
        matrix.mapRect(this.f7445j);
        for (int size = this.f7443h.size() - 1; size >= 0; size--) {
            if (!this.f7445j.isEmpty()) {
                z = canvas.clipRect(this.f7445j);
            } else {
                z = true;
            }
            if (z) {
                ((C2382a) this.f7443h.get(size)).mo6708a(canvas, matrix, i);
            }
        }
        canvas.restore();
        C2340c.m6970c("CompositionLayer#draw");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo6755b(C2398e eVar, int i, List<C2398e> list, C2398e eVar2) {
        for (int i2 = 0; i2 < this.f7443h.size(); i2++) {
            ((C2382a) this.f7443h.get(i2)).mo6710a(eVar, i, list, eVar2);
        }
    }

    public C2385b(C2455g gVar, C2388d dVar, List<C2388d> list, C2408e eVar) {
        C2382a aVar;
        super(gVar, dVar);
        C2343b bVar = dVar.f7469s;
        if (bVar != null) {
            this.f7442g = bVar.mo6735a();
            mo6752a(this.f7442g);
            this.f7442g.mo6722a((C2321a) this);
        } else {
            this.f7442g = null;
        }
        C0785g gVar2 = new C0785g(eVar.f7521g.size());
        int size = list.size() - 1;
        C2382a aVar2 = null;
        while (true) {
            if (size >= 0) {
                C2388d dVar2 = (C2388d) list.get(size);
                switch (dVar2.f7455e) {
                    case Shape:
                        aVar = new C2392f(gVar, dVar2);
                        break;
                    case PreComp:
                        aVar = new C2385b(gVar, dVar2, (List) eVar.f7516b.get(dVar2.f7457g), eVar);
                        break;
                    case Solid:
                        aVar = new C2393g(gVar, dVar2);
                        break;
                    case Image:
                        aVar = new C2387c(gVar, dVar2);
                        break;
                    case Null:
                        aVar = new C2391e(gVar, dVar2);
                        break;
                    case Text:
                        aVar = new C2394h(gVar, dVar2);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("Unknown layer type ");
                        sb.append(dVar2.f7455e);
                        C2340c.m6968a(sb.toString());
                        aVar = null;
                        break;
                }
                if (aVar != null) {
                    gVar2.mo2493b(aVar.f7418c.f7454d, aVar);
                    if (aVar2 == null) {
                        this.f7443h.add(0, aVar);
                        switch (dVar2.f7471u) {
                            case Add:
                            case Invert:
                                aVar2 = aVar;
                                break;
                        }
                    } else {
                        aVar2.f7419d = aVar;
                        aVar2 = null;
                    }
                }
                size--;
            } else {
                for (int i = 0; i < gVar2.mo2490b(); i++) {
                    C2382a aVar3 = (C2382a) gVar2.mo2487a(gVar2.mo2491b(i));
                    if (aVar3 != null) {
                        C2382a aVar4 = (C2382a) gVar2.mo2487a(aVar3.f7418c.f7456f);
                        if (aVar4 != null) {
                            aVar3.f7420e = aVar4;
                        }
                    }
                }
                return;
            }
        }
    }
}
