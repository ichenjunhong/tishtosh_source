package com.airbnb.lottie.p104a.p105a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.C2340c;
import com.airbnb.lottie.C2455g;
import com.airbnb.lottie.C2474j;
import com.airbnb.lottie.p104a.p106b.C2320a;
import com.airbnb.lottie.p104a.p106b.C2320a.C2321a;
import com.airbnb.lottie.p104a.p106b.C2336p;
import com.airbnb.lottie.p108c.C2398e;
import com.airbnb.lottie.p108c.p109a.C2343b;
import com.airbnb.lottie.p108c.p109a.C2345d;
import com.airbnb.lottie.p108c.p110b.C2379q.C2380a;
import com.airbnb.lottie.p108c.p111c.C2382a;
import com.airbnb.lottie.p114f.C2453e;
import com.airbnb.lottie.p114f.C2454f;
import com.airbnb.lottie.p115g.C2470c;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.a */
public abstract class C2298a implements C2303d, C2309j, C2321a {

    /* renamed from: a */
    final Paint f7128a = new Paint(1);

    /* renamed from: b */
    private final PathMeasure f7129b = new PathMeasure();

    /* renamed from: c */
    private final Path f7130c = new Path();

    /* renamed from: d */
    private final Path f7131d = new Path();

    /* renamed from: e */
    private final RectF f7132e = new RectF();

    /* renamed from: f */
    private final C2455g f7133f;

    /* renamed from: g */
    private final C2382a f7134g;

    /* renamed from: h */
    private final List<C2300a> f7135h = new ArrayList();

    /* renamed from: i */
    private final float[] f7136i;

    /* renamed from: j */
    private final C2320a<?, Float> f7137j;

    /* renamed from: k */
    private final C2320a<?, Integer> f7138k;

    /* renamed from: l */
    private final List<C2320a<?, Float>> f7139l;

    /* renamed from: m */
    private final C2320a<?, Float> f7140m;

    /* renamed from: n */
    private C2320a<ColorFilter, ColorFilter> f7141n;

    /* renamed from: com.airbnb.lottie.a.a.a$a */
    static final class C2300a {

        /* renamed from: a */
        public final List<C2312l> f7142a;

        /* renamed from: b */
        public final C2319r f7143b;

        private C2300a(C2319r rVar) {
            this.f7142a = new ArrayList();
            this.f7143b = rVar;
        }
    }

    /* renamed from: a */
    public final void mo6707a() {
        this.f7133f.invalidateSelf();
    }

    /* renamed from: a */
    public <T> void mo6711a(T t, C2470c<T> cVar) {
        if (t == C2474j.f7639d) {
            this.f7138k.mo6723a(cVar);
        } else if (t == C2474j.f7646k) {
            this.f7137j.mo6723a(cVar);
        } else {
            if (t == C2474j.f7659x) {
                if (cVar == null) {
                    this.f7141n = null;
                    return;
                }
                this.f7141n = new C2336p(cVar);
                this.f7141n.mo6722a((C2321a) this);
                this.f7134g.mo6752a(this.f7141n);
            }
        }
    }

    /* renamed from: a */
    public final void mo6712a(List<C2301b> list, List<C2301b> list2) {
        C2319r rVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            C2301b bVar = (C2301b) list.get(size);
            if (bVar instanceof C2319r) {
                C2319r rVar2 = (C2319r) bVar;
                if (rVar2.f7244a == C2380a.Individually) {
                    rVar = rVar2;
                }
            }
        }
        if (rVar != null) {
            rVar.mo6718a(this);
        }
        C2300a aVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            C2301b bVar2 = (C2301b) list2.get(size2);
            if (bVar2 instanceof C2319r) {
                C2319r rVar3 = (C2319r) bVar2;
                if (rVar3.f7244a == C2380a.Individually) {
                    if (aVar != null) {
                        this.f7135h.add(aVar);
                    }
                    aVar = new C2300a(rVar3);
                    rVar3.mo6718a(this);
                }
            }
            if (bVar2 instanceof C2312l) {
                if (aVar == null) {
                    aVar = new C2300a(rVar);
                }
                aVar.f7142a.add((C2312l) bVar2);
            }
        }
        if (aVar != null) {
            this.f7135h.add(aVar);
        }
    }

    /* renamed from: a */
    public final void mo6709a(RectF rectF, Matrix matrix) {
        C2340c.m6969b("StrokeContent#getBounds");
        this.f7130c.reset();
        for (int i = 0; i < this.f7135h.size(); i++) {
            C2300a aVar = (C2300a) this.f7135h.get(i);
            for (int i2 = 0; i2 < aVar.f7142a.size(); i2++) {
                this.f7130c.addPath(((C2312l) aVar.f7142a.get(i2)).mo6716e(), matrix);
            }
        }
        this.f7130c.computeBounds(this.f7132e, false);
        float floatValue = ((Float) this.f7137j.mo6726d()).floatValue() / 2.0f;
        this.f7132e.set(this.f7132e.left - floatValue, this.f7132e.top - floatValue, this.f7132e.right + floatValue, this.f7132e.bottom + floatValue);
        rectF.set(this.f7132e);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C2340c.m6970c("StrokeContent#getBounds");
    }

    /* renamed from: a */
    private void m6845a(Canvas canvas, C2300a aVar, Matrix matrix) {
        float f;
        float f2;
        C2340c.m6969b("StrokeContent#applyTrimPath");
        if (aVar.f7143b == null) {
            C2340c.m6970c("StrokeContent#applyTrimPath");
            return;
        }
        this.f7130c.reset();
        for (int size = aVar.f7142a.size() - 1; size >= 0; size--) {
            this.f7130c.addPath(((C2312l) aVar.f7142a.get(size)).mo6716e(), matrix);
        }
        this.f7129b.setPath(this.f7130c, false);
        float length = this.f7129b.getLength();
        while (this.f7129b.nextContour()) {
            length += this.f7129b.getLength();
        }
        float floatValue = (((Float) aVar.f7143b.f7247d.mo6726d()).floatValue() * length) / 360.0f;
        float floatValue2 = ((((Float) aVar.f7143b.f7245b.mo6726d()).floatValue() * length) / 100.0f) + floatValue;
        float floatValue3 = ((((Float) aVar.f7143b.f7246c.mo6726d()).floatValue() * length) / 100.0f) + floatValue;
        float f3 = 0.0f;
        for (int size2 = aVar.f7142a.size() - 1; size2 >= 0; size2--) {
            this.f7131d.set(((C2312l) aVar.f7142a.get(size2)).mo6716e());
            this.f7131d.transform(matrix);
            this.f7129b.setPath(this.f7131d, false);
            float length2 = this.f7129b.getLength();
            float f4 = 1.0f;
            if (floatValue3 > length) {
                float f5 = floatValue3 - length;
                if (f5 < f3 + length2 && f3 < f5) {
                    if (floatValue2 > length) {
                        f = (floatValue2 - length) / length2;
                    } else {
                        f = 0.0f;
                    }
                    f4 = Math.min(f5 / length2, 1.0f);
                    C2454f.m7178a(this.f7131d, f, f4, 0.0f);
                    canvas.drawPath(this.f7131d, this.f7128a);
                    f3 += length2;
                }
            }
            float f6 = f3 + length2;
            if (f6 >= floatValue2 && f3 <= floatValue3) {
                if (f6 > floatValue3 || floatValue2 >= f3) {
                    if (floatValue2 < f3) {
                        f2 = 0.0f;
                    } else {
                        f2 = (floatValue2 - f3) / length2;
                    }
                    if (floatValue3 <= f6) {
                        f4 = (floatValue3 - f3) / length2;
                    }
                    C2454f.m7178a(this.f7131d, f, f4, 0.0f);
                    canvas.drawPath(this.f7131d, this.f7128a);
                } else {
                    canvas.drawPath(this.f7131d, this.f7128a);
                }
            }
            f3 += length2;
        }
        C2340c.m6970c("StrokeContent#applyTrimPath");
    }

    /* renamed from: a */
    public void mo6708a(Canvas canvas, Matrix matrix, int i) {
        C2340c.m6969b("StrokeContent#draw");
        this.f7128a.setAlpha(C2453e.m7171a((int) ((((((float) i) / 255.0f) * ((float) ((Integer) this.f7138k.mo6726d()).intValue())) / 100.0f) * 255.0f), 0, (int) NormalGiftView.ALPHA_255));
        this.f7128a.setStrokeWidth(((Float) this.f7137j.mo6726d()).floatValue() * C2454f.m7177a(matrix));
        float f = 0.0f;
        if (this.f7128a.getStrokeWidth() <= 0.0f) {
            C2340c.m6970c("StrokeContent#draw");
            return;
        }
        C2340c.m6969b("StrokeContent#applyDashPattern");
        if (this.f7139l.isEmpty()) {
            C2340c.m6970c("StrokeContent#applyDashPattern");
        } else {
            float a = C2454f.m7177a(matrix);
            for (int i2 = 0; i2 < this.f7139l.size(); i2++) {
                this.f7136i[i2] = ((Float) ((C2320a) this.f7139l.get(i2)).mo6726d()).floatValue();
                if (i2 % 2 == 0) {
                    if (this.f7136i[i2] < 1.0f) {
                        this.f7136i[i2] = 1.0f;
                    }
                } else if (this.f7136i[i2] < 0.1f) {
                    this.f7136i[i2] = 0.1f;
                }
                float[] fArr = this.f7136i;
                fArr[i2] = fArr[i2] * a;
            }
            if (this.f7140m != null) {
                f = ((Float) this.f7140m.mo6726d()).floatValue();
            }
            this.f7128a.setPathEffect(new DashPathEffect(this.f7136i, f));
            C2340c.m6970c("StrokeContent#applyDashPattern");
        }
        if (this.f7141n != null) {
            this.f7128a.setColorFilter((ColorFilter) this.f7141n.mo6726d());
        }
        for (int i3 = 0; i3 < this.f7135h.size(); i3++) {
            C2300a aVar = (C2300a) this.f7135h.get(i3);
            if (aVar.f7143b != null) {
                m6845a(canvas, aVar, matrix);
            } else {
                C2340c.m6969b("StrokeContent#buildPath");
                this.f7130c.reset();
                for (int size = aVar.f7142a.size() - 1; size >= 0; size--) {
                    this.f7130c.addPath(((C2312l) aVar.f7142a.get(size)).mo6716e(), matrix);
                }
                C2340c.m6970c("StrokeContent#buildPath");
                C2340c.m6969b("StrokeContent#drawPath");
                canvas.drawPath(this.f7130c, this.f7128a);
                C2340c.m6970c("StrokeContent#drawPath");
            }
        }
        C2340c.m6970c("StrokeContent#draw");
    }

    /* renamed from: a */
    public final void mo6710a(C2398e eVar, int i, List<C2398e> list, C2398e eVar2) {
        C2453e.m7174a(eVar, i, list, eVar2, this);
    }

    C2298a(C2455g gVar, C2382a aVar, Cap cap, Join join, float f, C2345d dVar, C2343b bVar, List<C2343b> list, C2343b bVar2) {
        this.f7133f = gVar;
        this.f7134g = aVar;
        this.f7128a.setStyle(Style.STROKE);
        this.f7128a.setStrokeCap(cap);
        this.f7128a.setStrokeJoin(join);
        this.f7128a.setStrokeMiter(f);
        this.f7138k = dVar.mo6735a();
        this.f7137j = bVar.mo6735a();
        if (bVar2 == null) {
            this.f7140m = null;
        } else {
            this.f7140m = bVar2.mo6735a();
        }
        this.f7139l = new ArrayList(list.size());
        this.f7136i = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f7139l.add(((C2343b) list.get(i)).mo6735a());
        }
        aVar.mo6752a(this.f7138k);
        aVar.mo6752a(this.f7137j);
        for (int i2 = 0; i2 < this.f7139l.size(); i2++) {
            aVar.mo6752a((C2320a) this.f7139l.get(i2));
        }
        if (this.f7140m != null) {
            aVar.mo6752a(this.f7140m);
        }
        this.f7138k.mo6722a((C2321a) this);
        this.f7137j.mo6722a((C2321a) this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((C2320a) this.f7139l.get(i3)).mo6722a((C2321a) this);
        }
        if (this.f7140m != null) {
            this.f7140m.mo6722a((C2321a) this);
        }
    }
}
