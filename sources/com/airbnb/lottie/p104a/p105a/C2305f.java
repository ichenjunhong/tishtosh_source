package com.airbnb.lottie.p104a.p105a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C2340c;
import com.airbnb.lottie.C2455g;
import com.airbnb.lottie.C2474j;
import com.airbnb.lottie.p104a.p106b.C2320a;
import com.airbnb.lottie.p104a.p106b.C2320a.C2321a;
import com.airbnb.lottie.p104a.p106b.C2336p;
import com.airbnb.lottie.p108c.C2398e;
import com.airbnb.lottie.p108c.p110b.C2372m;
import com.airbnb.lottie.p108c.p111c.C2382a;
import com.airbnb.lottie.p114f.C2453e;
import com.airbnb.lottie.p115g.C2470c;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.f */
public final class C2305f implements C2303d, C2309j, C2321a {

    /* renamed from: a */
    private final Path f7160a = new Path();

    /* renamed from: b */
    private final Paint f7161b = new Paint(1);

    /* renamed from: c */
    private final C2382a f7162c;

    /* renamed from: d */
    private final String f7163d;

    /* renamed from: e */
    private final List<C2312l> f7164e = new ArrayList();

    /* renamed from: f */
    private final C2320a<Integer, Integer> f7165f;

    /* renamed from: g */
    private final C2320a<Integer, Integer> f7166g;

    /* renamed from: h */
    private C2320a<ColorFilter, ColorFilter> f7167h;

    /* renamed from: i */
    private final C2455g f7168i;

    /* renamed from: b */
    public final String mo6713b() {
        return this.f7163d;
    }

    /* renamed from: a */
    public final void mo6707a() {
        this.f7168i.invalidateSelf();
    }

    /* renamed from: a */
    public final void mo6712a(List<C2301b> list, List<C2301b> list2) {
        for (int i = 0; i < list2.size(); i++) {
            C2301b bVar = (C2301b) list2.get(i);
            if (bVar instanceof C2312l) {
                this.f7164e.add((C2312l) bVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo6709a(RectF rectF, Matrix matrix) {
        this.f7160a.reset();
        for (int i = 0; i < this.f7164e.size(); i++) {
            this.f7160a.addPath(((C2312l) this.f7164e.get(i)).mo6716e(), matrix);
        }
        this.f7160a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: a */
    public final <T> void mo6711a(T t, C2470c<T> cVar) {
        if (t == C2474j.f7636a) {
            this.f7165f.mo6723a(cVar);
        } else if (t == C2474j.f7639d) {
            this.f7166g.mo6723a(cVar);
        } else {
            if (t == C2474j.f7659x) {
                if (cVar == null) {
                    this.f7167h = null;
                    return;
                }
                this.f7167h = new C2336p(cVar);
                this.f7167h.mo6722a((C2321a) this);
                this.f7162c.mo6752a(this.f7167h);
            }
        }
    }

    public C2305f(C2455g gVar, C2382a aVar, C2372m mVar) {
        this.f7162c = aVar;
        this.f7163d = mVar.f7384b;
        this.f7168i = gVar;
        if (mVar.f7385c == null || mVar.f7386d == null) {
            this.f7165f = null;
            this.f7166g = null;
            return;
        }
        this.f7160a.setFillType(mVar.f7383a);
        this.f7165f = mVar.f7385c.mo6735a();
        this.f7165f.mo6722a((C2321a) this);
        aVar.mo6752a(this.f7165f);
        this.f7166g = mVar.f7386d.mo6735a();
        this.f7166g.mo6722a((C2321a) this);
        aVar.mo6752a(this.f7166g);
    }

    /* renamed from: a */
    public final void mo6708a(Canvas canvas, Matrix matrix, int i) {
        C2340c.m6969b("FillContent#draw");
        this.f7161b.setColor(((Integer) this.f7165f.mo6726d()).intValue());
        this.f7161b.setAlpha(C2453e.m7171a((int) ((((((float) i) / 255.0f) * ((float) ((Integer) this.f7166g.mo6726d()).intValue())) / 100.0f) * 255.0f), 0, (int) NormalGiftView.ALPHA_255));
        if (this.f7167h != null) {
            this.f7161b.setColorFilter((ColorFilter) this.f7167h.mo6726d());
        }
        this.f7160a.reset();
        for (int i2 = 0; i2 < this.f7164e.size(); i2++) {
            this.f7160a.addPath(((C2312l) this.f7164e.get(i2)).mo6716e(), matrix);
        }
        canvas.drawPath(this.f7160a, this.f7161b);
        C2340c.m6970c("FillContent#draw");
    }

    /* renamed from: a */
    public final void mo6710a(C2398e eVar, int i, List<C2398e> list, C2398e eVar2) {
        C2453e.m7174a(eVar, i, list, eVar2, this);
    }
}
