package com.airbnb.lottie.p104a.p105a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C2455g;
import com.airbnb.lottie.p104a.p106b.C2320a.C2321a;
import com.airbnb.lottie.p104a.p106b.C2335o;
import com.airbnb.lottie.p108c.C2398e;
import com.airbnb.lottie.p108c.C2399f;
import com.airbnb.lottie.p108c.p109a.C2353l;
import com.airbnb.lottie.p108c.p110b.C2358b;
import com.airbnb.lottie.p108c.p110b.C2373n;
import com.airbnb.lottie.p108c.p111c.C2382a;
import com.airbnb.lottie.p115g.C2470c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.c */
public final class C2302c implements C2303d, C2312l, C2321a, C2399f {

    /* renamed from: a */
    private final Matrix f7144a;

    /* renamed from: b */
    private final Path f7145b;

    /* renamed from: c */
    private final RectF f7146c;

    /* renamed from: d */
    private final String f7147d;

    /* renamed from: e */
    private final List<C2301b> f7148e;

    /* renamed from: f */
    private final C2455g f7149f;

    /* renamed from: g */
    private List<C2312l> f7150g;

    /* renamed from: h */
    private C2335o f7151h;

    /* renamed from: b */
    public final String mo6713b() {
        return this.f7147d;
    }

    /* renamed from: a */
    public final void mo6707a() {
        this.f7149f.invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final Matrix mo6715d() {
        if (this.f7151h != null) {
            return this.f7151h.mo6727a();
        }
        this.f7144a.reset();
        return this.f7144a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final List<C2312l> mo6714c() {
        if (this.f7150g == null) {
            this.f7150g = new ArrayList();
            for (int i = 0; i < this.f7148e.size(); i++) {
                C2301b bVar = (C2301b) this.f7148e.get(i);
                if (bVar instanceof C2312l) {
                    this.f7150g.add((C2312l) bVar);
                }
            }
        }
        return this.f7150g;
    }

    /* renamed from: e */
    public final Path mo6716e() {
        this.f7144a.reset();
        if (this.f7151h != null) {
            this.f7144a.set(this.f7151h.mo6727a());
        }
        this.f7145b.reset();
        for (int size = this.f7148e.size() - 1; size >= 0; size--) {
            C2301b bVar = (C2301b) this.f7148e.get(size);
            if (bVar instanceof C2312l) {
                this.f7145b.addPath(((C2312l) bVar).mo6716e(), this.f7144a);
            }
        }
        return this.f7145b;
    }

    /* renamed from: a */
    private static C2353l m6854a(List<C2358b> list) {
        for (int i = 0; i < list.size(); i++) {
            C2358b bVar = (C2358b) list.get(i);
            if (bVar instanceof C2353l) {
                return (C2353l) bVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final <T> void mo6711a(T t, C2470c<T> cVar) {
        if (this.f7151h != null) {
            this.f7151h.mo6731a(t, cVar);
        }
    }

    /* renamed from: a */
    public final void mo6709a(RectF rectF, Matrix matrix) {
        this.f7144a.set(matrix);
        if (this.f7151h != null) {
            this.f7144a.preConcat(this.f7151h.mo6727a());
        }
        this.f7146c.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f7148e.size() - 1; size >= 0; size--) {
            C2301b bVar = (C2301b) this.f7148e.get(size);
            if (bVar instanceof C2303d) {
                ((C2303d) bVar).mo6709a(this.f7146c, this.f7144a);
                if (rectF.isEmpty()) {
                    rectF.set(this.f7146c);
                } else {
                    rectF.set(Math.min(rectF.left, this.f7146c.left), Math.min(rectF.top, this.f7146c.top), Math.max(rectF.right, this.f7146c.right), Math.max(rectF.bottom, this.f7146c.bottom));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo6712a(List<C2301b> list, List<C2301b> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f7148e.size());
        arrayList.addAll(list);
        for (int size = this.f7148e.size() - 1; size >= 0; size--) {
            C2301b bVar = (C2301b) this.f7148e.get(size);
            bVar.mo6712a(arrayList, this.f7148e.subList(0, size));
            arrayList.add(bVar);
        }
    }

    public C2302c(C2455g gVar, C2382a aVar, C2373n nVar) {
        this(gVar, aVar, nVar.f7388a, m6855a(gVar, aVar, nVar.f7389b), m6854a(nVar.f7389b));
    }

    /* renamed from: a */
    private static List<C2301b> m6855a(C2455g gVar, C2382a aVar, List<C2358b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            C2301b a = ((C2358b) list.get(i)).mo6738a(gVar, aVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo6708a(Canvas canvas, Matrix matrix, int i) {
        this.f7144a.set(matrix);
        if (this.f7151h != null) {
            this.f7144a.preConcat(this.f7151h.mo6727a());
            i = (int) ((((((float) ((Integer) this.f7151h.f7275e.mo6726d()).intValue()) / 100.0f) * ((float) i)) / 255.0f) * 255.0f);
        }
        for (int size = this.f7148e.size() - 1; size >= 0; size--) {
            Object obj = this.f7148e.get(size);
            if (obj instanceof C2303d) {
                ((C2303d) obj).mo6708a(canvas, this.f7144a, i);
            }
        }
    }

    /* renamed from: a */
    public final void mo6710a(C2398e eVar, int i, List<C2398e> list, C2398e eVar2) {
        if (eVar.mo6761a(mo6713b(), i)) {
            if (!"__container".equals(mo6713b())) {
                eVar2 = eVar2.mo6760a(mo6713b());
                if (eVar.mo6763c(mo6713b(), i)) {
                    list.add(eVar2.mo6759a((C2399f) this));
                }
            }
            if (eVar.mo6764d(mo6713b(), i)) {
                int b = i + eVar.mo6762b(mo6713b(), i);
                for (int i2 = 0; i2 < this.f7148e.size(); i2++) {
                    C2301b bVar = (C2301b) this.f7148e.get(i2);
                    if (bVar instanceof C2399f) {
                        ((C2399f) bVar).mo6710a(eVar, b, list, eVar2);
                    }
                }
            }
        }
    }

    C2302c(C2455g gVar, C2382a aVar, String str, List<C2301b> list, C2353l lVar) {
        this.f7144a = new Matrix();
        this.f7145b = new Path();
        this.f7146c = new RectF();
        this.f7147d = str;
        this.f7149f = gVar;
        this.f7148e = list;
        if (lVar != null) {
            this.f7151h = lVar.mo6739a();
            this.f7151h.mo6730a(aVar);
            this.f7151h.mo6729a((C2321a) this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            C2301b bVar = (C2301b) list.get(size);
            if (bVar instanceof C2308i) {
                arrayList.add((C2308i) bVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((C2308i) arrayList.get(size2)).mo6717a(list.listIterator(list.size()));
        }
    }
}
