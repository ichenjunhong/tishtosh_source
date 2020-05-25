package android.arch.p010b;

import android.arch.p010b.C0082h.C0085a;
import android.arch.p010b.C0082h.C0087c;
import android.arch.p010b.C0082h.C0088d;
import java.util.concurrent.Executor;

/* renamed from: android.arch.b.n */
final class C0106n<T> extends C0082h<T> implements C0093a {

    /* renamed from: a */
    public final C0097l<T> f267a;

    /* renamed from: b */
    public C0081a<T> f268b = new C0081a<T>() {
        /* renamed from: a */
        public final void mo102a(int i, C0080g<T> gVar) {
            boolean z;
            boolean z2;
            if (gVar.mo120a()) {
                C0106n.this.mo133g();
            } else if (!C0106n.this.mo132f()) {
                if (i == 0 || i == 3) {
                    if (C0106n.this.f204g.mo146a() == 0) {
                        C0106n.this.f204g.mo149a(gVar.f195c, gVar.f194b, gVar.f196d, gVar.f197e, C0106n.this.f203f.f224a, C0106n.this);
                    } else {
                        C0106n.this.f204g.mo150a(gVar.f197e, gVar.f194b, C0106n.this);
                    }
                    if (C0106n.this.f202e != null) {
                        boolean z3 = false;
                        if (C0106n.this.f204g.size() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z && gVar.f195c == 0 && gVar.f197e == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        int size = C0106n.this.size();
                        if (!z && ((i == 0 && gVar.f196d == 0) || (i == 3 && gVar.f197e + C0106n.this.f203f.f224a >= size))) {
                            z3 = true;
                        }
                        C0106n.this.mo126a(z, z2, z3);
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder("unexpected resultType");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    };

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo96a() {
        return false;
    }

    /* renamed from: b */
    public final C0065d<?, T> mo97b() {
        return this.f267a;
    }

    /* renamed from: c */
    public final Object mo100c() {
        return Integer.valueOf(this.f205h);
    }

    /* renamed from: b */
    public final void mo98b(int i) {
        mo127b(0, i);
    }

    /* renamed from: c */
    public final void mo101c(final int i) {
        this.f201d.execute(new Runnable() {
            public final void run() {
                if (!C0106n.this.mo132f()) {
                    int i = C0106n.this.f203f.f224a;
                    if (C0106n.this.f267a.mo108c()) {
                        C0106n.this.mo133g();
                        return;
                    }
                    int i2 = i * i;
                    C0106n.this.f267a.mo168a(3, i2, Math.min(i, C0106n.this.f204g.size() - i2), C0106n.this.f200c, C0106n.this.f268b);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo92a(int i) {
        C0092j jVar = this.f204g;
        int i2 = this.f203f.f225b;
        int i3 = this.f203f.f224a;
        if (i3 != jVar.f241g) {
            if (i3 < jVar.f241g) {
                throw new IllegalArgumentException("Page size cannot be reduced");
            } else if (jVar.f237c.size() == 1 && jVar.f238d == 0) {
                jVar.f241g = i3;
            } else {
                throw new IllegalArgumentException("Page size can change only if last page is only one present");
            }
        }
        int size = ((jVar.size() + jVar.f241g) - 1) / jVar.f241g;
        int max = Math.max((i - i2) / jVar.f241g, 0);
        int min = Math.min((i + i2) / jVar.f241g, size - 1);
        jVar.mo147a(max, min);
        int i4 = jVar.f236b / jVar.f241g;
        while (max <= min) {
            int i5 = max - i4;
            if (jVar.f237c.get(i5) == null) {
                jVar.f237c.set(i5, C0092j.f235a);
                mo101c(max);
            }
            max++;
        }
    }

    /* renamed from: a */
    public final void mo93a(int i, int i2) {
        mo128c(i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo95a(C0082h<T> hVar, C0087c cVar) {
        C0092j<T> jVar = hVar.f204g;
        if (jVar.isEmpty() || this.f204g.size() != jVar.size()) {
            throw new IllegalArgumentException("Invalid snapshot provided - doesn't appear to be a snapshot of this PagedList");
        }
        int i = this.f203f.f224a;
        int i2 = this.f204g.f236b / i;
        int a = this.f204g.mo146a();
        int i3 = 0;
        while (i3 < a) {
            int i4 = i3 + i2;
            int i5 = 0;
            while (i5 < this.f204g.mo146a()) {
                int i6 = i4 + i5;
                if (!this.f204g.mo152b(i, i6) || jVar.mo152b(i, i6)) {
                    break;
                }
                i5++;
            }
            if (i5 > 0) {
                cVar.mo84b(i4 * i, i * i5);
                i3 += i5 - 1;
            }
            i3++;
        }
    }

    /* renamed from: a */
    public final void mo94a(int i, int i2, int i3) {
        throw new IllegalStateException("Contiguous callback on TiledPagedList");
    }

    /* renamed from: b */
    public final void mo99b(int i, int i2, int i3) {
        throw new IllegalStateException("Contiguous callback on TiledPagedList");
    }

    C0106n(C0097l<T> lVar, Executor executor, Executor executor2, C0085a<T> aVar, C0088d dVar, int i) {
        super(new C0092j(), executor, executor2, aVar, dVar);
        this.f267a = lVar;
        int i2 = this.f203f.f224a;
        this.f205h = i;
        if (this.f267a.mo108c()) {
            mo133g();
            return;
        }
        int max = Math.max(Math.round((float) (this.f203f.f227d / i2)), 2) * i2;
        this.f267a.mo169a(true, Math.max(0, Math.round((float) ((i - (max / 2)) / i2)) * i2), max, i2, this.f200c, this.f268b);
    }
}
