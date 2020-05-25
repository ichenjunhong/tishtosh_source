package com.airbnb.lottie.p104a.p105a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C2455g;
import com.airbnb.lottie.C2474j;
import com.airbnb.lottie.p104a.p106b.C2320a;
import com.airbnb.lottie.p104a.p106b.C2320a.C2321a;
import com.airbnb.lottie.p104a.p106b.C2335o;
import com.airbnb.lottie.p108c.C2398e;
import com.airbnb.lottie.p108c.p110b.C2370k;
import com.airbnb.lottie.p108c.p111c.C2382a;
import com.airbnb.lottie.p114f.C2453e;
import com.airbnb.lottie.p115g.C2470c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.airbnb.lottie.a.a.o */
public final class C2316o implements C2303d, C2308i, C2309j, C2312l, C2321a {

    /* renamed from: a */
    private final Matrix f7225a = new Matrix();

    /* renamed from: b */
    private final Path f7226b = new Path();

    /* renamed from: c */
    private final C2455g f7227c;

    /* renamed from: d */
    private final C2382a f7228d;

    /* renamed from: e */
    private final String f7229e;

    /* renamed from: f */
    private final C2320a<Float, Float> f7230f;

    /* renamed from: g */
    private final C2320a<Float, Float> f7231g;

    /* renamed from: h */
    private final C2335o f7232h;

    /* renamed from: i */
    private C2302c f7233i;

    /* renamed from: b */
    public final String mo6713b() {
        return this.f7229e;
    }

    /* renamed from: a */
    public final void mo6707a() {
        this.f7227c.invalidateSelf();
    }

    /* renamed from: e */
    public final Path mo6716e() {
        Path e = this.f7233i.mo6716e();
        this.f7226b.reset();
        float floatValue = ((Float) this.f7230f.mo6726d()).floatValue();
        float floatValue2 = ((Float) this.f7231g.mo6726d()).floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.f7225a.set(this.f7232h.mo6728a(((float) i) + floatValue2));
            this.f7226b.addPath(e, this.f7225a);
        }
        return this.f7226b;
    }

    /* renamed from: a */
    public final void mo6717a(ListIterator<C2301b> listIterator) {
        if (this.f7233i == null) {
            while (listIterator.hasPrevious()) {
                if (listIterator.previous() == this) {
                    break;
                }
            }
            ArrayList arrayList = new ArrayList();
            while (listIterator.hasPrevious()) {
                arrayList.add(listIterator.previous());
                listIterator.remove();
            }
            Collections.reverse(arrayList);
            C2302c cVar = new C2302c(this.f7227c, this.f7228d, "Repeater", arrayList, null);
            this.f7233i = cVar;
        }
    }

    /* renamed from: a */
    public final void mo6709a(RectF rectF, Matrix matrix) {
        this.f7233i.mo6709a(rectF, matrix);
    }

    /* renamed from: a */
    public final <T> void mo6711a(T t, C2470c<T> cVar) {
        if (!this.f7232h.mo6731a(t, cVar)) {
            if (t == C2474j.f7648m) {
                this.f7230f.mo6723a(cVar);
                return;
            }
            if (t == C2474j.f7649n) {
                this.f7231g.mo6723a(cVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo6712a(List<C2301b> list, List<C2301b> list2) {
        this.f7233i.mo6712a(list, list2);
    }

    public C2316o(C2455g gVar, C2382a aVar, C2370k kVar) {
        this.f7227c = gVar;
        this.f7228d = aVar;
        this.f7229e = kVar.f7376a;
        this.f7230f = kVar.f7377b.mo6735a();
        aVar.mo6752a(this.f7230f);
        this.f7230f.mo6722a((C2321a) this);
        this.f7231g = kVar.f7378c.mo6735a();
        aVar.mo6752a(this.f7231g);
        this.f7231g.mo6722a((C2321a) this);
        this.f7232h = kVar.f7379d.mo6739a();
        this.f7232h.mo6730a(aVar);
        this.f7232h.mo6729a((C2321a) this);
    }

    /* renamed from: a */
    public final void mo6708a(Canvas canvas, Matrix matrix, int i) {
        float floatValue = ((Float) this.f7230f.mo6726d()).floatValue();
        float floatValue2 = ((Float) this.f7231g.mo6726d()).floatValue();
        float floatValue3 = ((Float) this.f7232h.f7276f.mo6726d()).floatValue() / 100.0f;
        float floatValue4 = ((Float) this.f7232h.f7277g.mo6726d()).floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.f7225a.set(matrix);
            float f = (float) i2;
            this.f7225a.preConcat(this.f7232h.mo6728a(f + floatValue2));
            this.f7233i.mo6708a(canvas, this.f7225a, (int) (((float) i) * C2453e.m7169a(floatValue3, floatValue4, f / floatValue)));
        }
    }

    /* renamed from: a */
    public final void mo6710a(C2398e eVar, int i, List<C2398e> list, C2398e eVar2) {
        C2453e.m7174a(eVar, i, list, eVar2, this);
    }
}
