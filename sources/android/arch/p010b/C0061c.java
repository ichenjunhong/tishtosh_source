package android.arch.p010b;

import android.arch.p010b.C0082h.C0085a;
import android.arch.p010b.C0082h.C0087c;
import android.arch.p010b.C0082h.C0088d;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: android.arch.b.c */
final class C0061c<K, V> extends C0082h<V> implements C0093a {

    /* renamed from: a */
    public final C0060b<K, V> f143a;

    /* renamed from: b */
    public C0081a<V> f144b = new C0081a<V>() {
        /* renamed from: a */
        public final void mo102a(int i, C0080g<V> gVar) {
            boolean z;
            boolean z2;
            if (gVar.mo120a()) {
                C0061c.this.mo133g();
            } else if (!C0061c.this.mo132f()) {
                List<T> list = gVar.f194b;
                boolean z3 = false;
                if (i == 0) {
                    C0092j jVar = C0061c.this.f204g;
                    int i2 = gVar.f195c;
                    int i3 = gVar.f196d;
                    int i4 = gVar.f197e;
                    C0061c cVar = C0061c.this;
                    jVar.mo148a(i2, list, i3, i4);
                    cVar.mo98b(jVar.size());
                    if (C0061c.this.f205h == -1) {
                        C0061c.this.f205h = gVar.f195c + gVar.f197e + (list.size() / 2);
                    }
                } else if (i == 1) {
                    C0092j jVar2 = C0061c.this.f204g;
                    C0061c cVar2 = C0061c.this;
                    int size = list.size();
                    if (size != 0) {
                        if (jVar2.f241g > 0 && (((List) jVar2.f237c.get(jVar2.f237c.size() - 1)).size() != jVar2.f241g || size > jVar2.f241g)) {
                            jVar2.f241g = -1;
                        }
                        jVar2.f237c.add(list);
                        jVar2.f240f += size;
                        int min = Math.min(jVar2.f238d, size);
                        int i5 = size - min;
                        if (min != 0) {
                            jVar2.f238d -= min;
                        }
                        jVar2.f243i += size;
                        cVar2.mo99b((jVar2.f236b + jVar2.f240f) - size, min, i5);
                    }
                } else if (i == 2) {
                    C0092j jVar3 = C0061c.this.f204g;
                    C0061c cVar3 = C0061c.this;
                    int size2 = list.size();
                    if (size2 != 0) {
                        if (jVar3.f241g > 0 && size2 != jVar3.f241g) {
                            if (jVar3.f237c.size() != 1 || size2 <= jVar3.f241g) {
                                jVar3.f241g = -1;
                            } else {
                                jVar3.f241g = size2;
                            }
                        }
                        jVar3.f237c.add(0, list);
                        jVar3.f240f += size2;
                        int min2 = Math.min(jVar3.f236b, size2);
                        int i6 = size2 - min2;
                        if (min2 != 0) {
                            jVar3.f236b -= min2;
                        }
                        jVar3.f239e -= i6;
                        jVar3.f242h += size2;
                        cVar3.mo94a(jVar3.f236b, min2, i6);
                    }
                } else {
                    StringBuilder sb = new StringBuilder("unexpected resultType ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
                }
                if (C0061c.this.f202e != null) {
                    if (C0061c.this.f204g.size() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z && i == 2 && gVar.f194b.size() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z && i == 1 && gVar.f194b.size() == 0) {
                        z3 = true;
                    }
                    C0061c.this.mo126a(z, z2, z3);
                }
            }
        }
    };

    /* renamed from: n */
    private boolean f145n = false;

    /* renamed from: o */
    private boolean f146o = false;

    /* renamed from: p */
    private int f147p = 0;

    /* renamed from: q */
    private int f148q = 0;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo96a() {
        return true;
    }

    /* renamed from: b */
    public final C0065d<?, V> mo97b() {
        return this.f143a;
    }

    /* renamed from: c */
    public final Object mo100c() {
        return this.f143a.mo87a(this.f205h, this.f206i);
    }

    /* renamed from: h */
    private void m101h() {
        if (!this.f145n) {
            this.f145n = true;
            final int i = this.f204g.f236b + this.f204g.f239e;
            final Object d = this.f204g.mo154d();
            this.f201d.execute(new Runnable() {
                public final void run() {
                    if (!C0061c.this.mo132f()) {
                        if (C0061c.this.f143a.mo108c()) {
                            C0061c.this.mo133g();
                        } else {
                            C0061c.this.f143a.mo91b(i, d, C0061c.this.f203f.f224a, C0061c.this.f200c, C0061c.this.f144b);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: i */
    private void m102i() {
        if (!this.f146o) {
            this.f146o = true;
            final int i = ((this.f204g.f236b + this.f204g.f240f) - 1) + this.f204g.f239e;
            final Object e = this.f204g.mo155e();
            this.f201d.execute(new Runnable() {
                public final void run() {
                    if (!C0061c.this.mo132f()) {
                        if (C0061c.this.f143a.mo108c()) {
                            C0061c.this.mo133g();
                        } else {
                            C0061c.this.f143a.mo88a(i, e, C0061c.this.f203f.f224a, C0061c.this.f200c, C0061c.this.f144b);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo98b(int i) {
        mo127b(0, i);
    }

    /* renamed from: c */
    public final void mo101c(int i) {
        throw new IllegalStateException("Tiled callback on ContiguousPagedList");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo92a(int i) {
        int i2 = this.f203f.f225b - (i - this.f204g.f236b);
        int i3 = (i + this.f203f.f225b) - (this.f204g.f236b + this.f204g.f240f);
        this.f147p = Math.max(i2, this.f147p);
        if (this.f147p > 0) {
            m101h();
        }
        this.f148q = Math.max(i3, this.f148q);
        if (this.f148q > 0) {
            m102i();
        }
    }

    /* renamed from: a */
    public final void mo93a(int i, int i2) {
        throw new IllegalStateException("Tiled callback on ContiguousPagedList");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo95a(C0082h<V> hVar, C0087c cVar) {
        C0092j<T> jVar = hVar.f204g;
        int i = this.f204g.f243i - jVar.f243i;
        int i2 = this.f204g.f242h - jVar.f242h;
        int i3 = jVar.f238d;
        int i4 = jVar.f236b;
        if (jVar.isEmpty() || i < 0 || i2 < 0 || this.f204g.f238d != Math.max(i3 - i, 0) || this.f204g.f236b != Math.max(i4 - i2, 0) || this.f204g.f240f != jVar.f240f + i + i2) {
            throw new IllegalArgumentException("Invalid snapshot provided - doesn't appear to be a snapshot of this PagedList");
        }
        if (i != 0) {
            int min = Math.min(i3, i);
            int i5 = i - min;
            int i6 = jVar.f236b + jVar.f240f;
            if (min != 0) {
                cVar.mo84b(i6, min);
            }
            if (i5 != 0) {
                cVar.mo83a(i6 + min, i5);
            }
        }
        if (i2 != 0) {
            int min2 = Math.min(i4, i2);
            int i7 = i2 - min2;
            if (min2 != 0) {
                cVar.mo84b(i4, min2);
            }
            if (i7 != 0) {
                cVar.mo83a(0, i7);
            }
        }
    }

    /* renamed from: b */
    public final void mo99b(int i, int i2, int i3) {
        this.f148q = (this.f148q - i2) - i3;
        this.f146o = false;
        if (this.f148q > 0) {
            m102i();
        }
        mo128c(i, i2);
        mo127b(i + i2, i3);
    }

    /* renamed from: a */
    public final void mo94a(int i, int i2, int i3) {
        this.f147p = (this.f147p - i2) - i3;
        this.f145n = false;
        if (this.f147p > 0) {
            m101h();
        }
        mo128c(i, i2);
        mo127b(0, i3);
        this.f209l += i3;
        this.f210m += i3;
    }

    C0061c(C0060b<K, V> bVar, Executor executor, Executor executor2, C0085a<V> aVar, C0088d dVar, K k, int i) {
        super(new C0092j(), executor, executor2, aVar, dVar);
        this.f143a = bVar;
        this.f205h = i;
        if (this.f143a.mo108c()) {
            mo133g();
            return;
        }
        this.f143a.mo89a(k, this.f203f.f227d, this.f203f.f224a, this.f203f.f226c, this.f200c, this.f144b);
    }
}
