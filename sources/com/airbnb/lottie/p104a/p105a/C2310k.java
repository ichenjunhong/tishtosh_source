package com.airbnb.lottie.p104a.p105a;

import android.graphics.Path;
import android.graphics.Path.Op;
import android.os.Build.VERSION;
import com.airbnb.lottie.p108c.p110b.C2365h;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.airbnb.lottie.a.a.k */
public final class C2310k implements C2308i, C2312l {

    /* renamed from: a */
    private final Path f7195a = new Path();

    /* renamed from: b */
    private final Path f7196b = new Path();

    /* renamed from: c */
    private final Path f7197c = new Path();

    /* renamed from: d */
    private final String f7198d;

    /* renamed from: e */
    private final List<C2312l> f7199e = new ArrayList();

    /* renamed from: f */
    private final C2365h f7200f;

    /* renamed from: b */
    public final String mo6713b() {
        return this.f7198d;
    }

    /* renamed from: e */
    public final Path mo6716e() {
        this.f7197c.reset();
        switch (this.f7200f.f7359b) {
            case Merge:
                for (int i = 0; i < this.f7199e.size(); i++) {
                    this.f7197c.addPath(((C2312l) this.f7199e.get(i)).mo6716e());
                }
                break;
            case Add:
                m6893a(Op.UNION);
                break;
            case Subtract:
                m6893a(Op.REVERSE_DIFFERENCE);
                break;
            case Intersect:
                m6893a(Op.INTERSECT);
                break;
            case ExcludeIntersections:
                m6893a(Op.XOR);
                break;
        }
        return this.f7197c;
    }

    public C2310k(C2365h hVar) {
        if (VERSION.SDK_INT >= 19) {
            this.f7198d = hVar.f7358a;
            this.f7200f = hVar;
            return;
        }
        throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
    }

    /* renamed from: a */
    public final void mo6717a(ListIterator<C2301b> listIterator) {
        while (listIterator.hasPrevious()) {
            if (listIterator.previous() == this) {
                break;
            }
        }
        while (listIterator.hasPrevious()) {
            C2301b bVar = (C2301b) listIterator.previous();
            if (bVar instanceof C2312l) {
                this.f7199e.add((C2312l) bVar);
                listIterator.remove();
            }
        }
    }

    /* renamed from: a */
    private void m6893a(Op op) {
        this.f7196b.reset();
        this.f7195a.reset();
        for (int size = this.f7199e.size() - 1; size > 0; size--) {
            C2312l lVar = (C2312l) this.f7199e.get(size);
            if (lVar instanceof C2302c) {
                C2302c cVar = (C2302c) lVar;
                List c = cVar.mo6714c();
                for (int size2 = c.size() - 1; size2 >= 0; size2--) {
                    Path e = ((C2312l) c.get(size2)).mo6716e();
                    e.transform(cVar.mo6715d());
                    this.f7196b.addPath(e);
                }
            } else {
                this.f7196b.addPath(lVar.mo6716e());
            }
        }
        C2312l lVar2 = (C2312l) this.f7199e.get(0);
        if (lVar2 instanceof C2302c) {
            C2302c cVar2 = (C2302c) lVar2;
            List c2 = cVar2.mo6714c();
            for (int i = 0; i < c2.size(); i++) {
                Path e2 = ((C2312l) c2.get(i)).mo6716e();
                e2.transform(cVar2.mo6715d());
                this.f7195a.addPath(e2);
            }
        } else {
            this.f7195a.set(lVar2.mo6716e());
        }
        this.f7197c.op(this.f7195a, this.f7196b, op);
    }

    /* renamed from: a */
    public final void mo6712a(List<C2301b> list, List<C2301b> list2) {
        for (int i = 0; i < this.f7199e.size(); i++) {
            ((C2312l) this.f7199e.get(i)).mo6712a(list, list2);
        }
    }
}
