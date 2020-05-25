package com.airbnb.lottie.p104a.p105a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.C2455g;
import com.airbnb.lottie.C2474j;
import com.airbnb.lottie.p104a.p106b.C2320a;
import com.airbnb.lottie.p104a.p106b.C2320a.C2321a;
import com.airbnb.lottie.p104a.p106b.C2336p;
import com.airbnb.lottie.p108c.p110b.C2375p;
import com.airbnb.lottie.p108c.p111c.C2382a;
import com.airbnb.lottie.p115g.C2470c;

/* renamed from: com.airbnb.lottie.a.a.q */
public final class C2318q extends C2298a {

    /* renamed from: b */
    private final C2382a f7240b;

    /* renamed from: c */
    private final String f7241c;

    /* renamed from: d */
    private final C2320a<Integer, Integer> f7242d;

    /* renamed from: e */
    private C2320a<ColorFilter, ColorFilter> f7243e;

    /* renamed from: b */
    public final String mo6713b() {
        return this.f7241c;
    }

    /* renamed from: a */
    public final <T> void mo6711a(T t, C2470c<T> cVar) {
        super.mo6711a(t, cVar);
        if (t == C2474j.f7637b) {
            this.f7242d.mo6723a(cVar);
            return;
        }
        if (t == C2474j.f7659x) {
            if (cVar == null) {
                this.f7243e = null;
                return;
            }
            this.f7243e = new C2336p(cVar);
            this.f7243e.mo6722a((C2321a) this);
            this.f7240b.mo6752a(this.f7242d);
        }
    }

    public C2318q(C2455g gVar, C2382a aVar, C2375p pVar) {
        super(gVar, aVar, pVar.f7399g.toPaintCap(), pVar.f7400h.toPaintJoin(), pVar.f7401i, pVar.f7397e, pVar.f7398f, pVar.f7395c, pVar.f7394b);
        this.f7240b = aVar;
        this.f7241c = pVar.f7393a;
        this.f7242d = pVar.f7396d.mo6735a();
        this.f7242d.mo6722a((C2321a) this);
        aVar.mo6752a(this.f7242d);
    }

    /* renamed from: a */
    public final void mo6708a(Canvas canvas, Matrix matrix, int i) {
        this.f7128a.setColor(((Integer) this.f7242d.mo6726d()).intValue());
        if (this.f7243e != null) {
            this.f7128a.setColorFilter((ColorFilter) this.f7243e.mo6726d());
        }
        super.mo6708a(canvas, matrix, i);
    }
}
