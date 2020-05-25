package android.arch.p010b;

import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: android.arch.b.h */
public abstract class C0082h<T> extends AbstractList<T> {

    /* renamed from: a */
    private final AtomicBoolean f198a = new AtomicBoolean(false);

    /* renamed from: b */
    private final ArrayList<WeakReference<C0087c>> f199b = new ArrayList<>();

    /* renamed from: c */
    final Executor f200c;

    /* renamed from: d */
    final Executor f201d;

    /* renamed from: e */
    final C0085a<T> f202e;

    /* renamed from: f */
    public final C0088d f203f;

    /* renamed from: g */
    final C0092j<T> f204g;

    /* renamed from: h */
    int f205h;

    /* renamed from: i */
    T f206i;

    /* renamed from: j */
    public boolean f207j;

    /* renamed from: k */
    public boolean f208k;

    /* renamed from: l */
    int f209l = Integer.MAX_VALUE;

    /* renamed from: m */
    int f210m = DynamicTabYellowPointVersion.DEFAULT;

    /* renamed from: android.arch.b.h$a */
    public static abstract class C0085a<T> {
        /* renamed from: a */
        public void mo138a() {
        }

        /* renamed from: a */
        public void mo139a(T t) {
        }
    }

    /* renamed from: android.arch.b.h$b */
    public static final class C0086b<Key, Value> {

        /* renamed from: a */
        final C0065d<Key, Value> f218a;

        /* renamed from: b */
        final C0088d f219b;

        /* renamed from: c */
        Executor f220c;

        /* renamed from: d */
        Executor f221d;

        /* renamed from: e */
        C0085a f222e;

        /* renamed from: f */
        Key f223f;

        public C0086b(C0065d<Key, Value> dVar, C0088d dVar2) {
            if (dVar == null) {
                throw new IllegalArgumentException("DataSource may not be null");
            } else if (dVar2 != null) {
                this.f218a = dVar;
                this.f219b = dVar2;
            } else {
                throw new IllegalArgumentException("Config may not be null");
            }
        }
    }

    /* renamed from: android.arch.b.h$c */
    public static abstract class C0087c {
        /* renamed from: a */
        public abstract void mo83a(int i, int i2);

        /* renamed from: b */
        public abstract void mo84b(int i, int i2);
    }

    /* renamed from: android.arch.b.h$d */
    public static class C0088d {

        /* renamed from: a */
        public final int f224a;

        /* renamed from: b */
        public final int f225b;

        /* renamed from: c */
        public final boolean f226c;

        /* renamed from: d */
        public final int f227d;

        /* renamed from: android.arch.b.h$d$a */
        public static final class C0089a {

            /* renamed from: a */
            public int f228a = -1;

            /* renamed from: b */
            private int f229b = -1;

            /* renamed from: c */
            private int f230c = -1;

            /* renamed from: d */
            private boolean f231d = true;

            /* renamed from: a */
            public final C0088d mo142a() {
                if (this.f229b > 0) {
                    if (this.f230c < 0) {
                        this.f230c = this.f229b;
                    }
                    if (this.f228a < 0) {
                        this.f228a = this.f229b * 3;
                    }
                    if (this.f231d || this.f230c != 0) {
                        C0088d dVar = new C0088d(this.f229b, this.f230c, this.f231d, this.f228a);
                        return dVar;
                    }
                    throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in the PagedList, so either placeholders must be enabled, or prefetch distance must be > 0.");
                }
                throw new IllegalArgumentException("Page size must be a positive number");
            }

            /* renamed from: a */
            public final C0089a mo140a(int i) {
                this.f229b = i;
                return this;
            }

            /* renamed from: b */
            public final C0089a mo143b(int i) {
                this.f230c = i;
                return this;
            }

            /* renamed from: a */
            public final C0089a mo141a(boolean z) {
                this.f231d = false;
                return this;
            }
        }

        private C0088d(int i, int i2, boolean z, int i3) {
            this.f224a = i;
            this.f225b = i2;
            this.f226c = z;
            this.f227d = i3;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo92a(int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo95a(C0082h<T> hVar, C0087c cVar);

    /* renamed from: a */
    public abstract boolean mo96a();

    /* renamed from: b */
    public abstract C0065d<?, T> mo97b();

    /* renamed from: c */
    public abstract Object mo100c();

    /* renamed from: h */
    private int m140h() {
        return this.f204g.f239e;
    }

    /* renamed from: d */
    public boolean mo130d() {
        return mo132f();
    }

    /* renamed from: f */
    public boolean mo132f() {
        return this.f198a.get();
    }

    /* renamed from: g */
    public final void mo133g() {
        this.f198a.set(true);
    }

    public int size() {
        return this.f204g.size();
    }

    /* renamed from: e */
    public final List<T> mo131e() {
        if (mo130d()) {
            return this;
        }
        return new C0105m(this);
    }

    public T get(int i) {
        T t = this.f204g.get(i);
        if (t != null) {
            this.f206i = t;
        }
        return t;
    }

    /* renamed from: d */
    public final void mo129d(int i) {
        this.f205h = m140h() + i;
        mo92a(i);
        this.f209l = Math.min(this.f209l, i);
        this.f210m = Math.max(this.f210m, i);
        mo124a(true);
    }

    /* renamed from: a */
    public final void mo122a(C0087c cVar) {
        for (int size = this.f199b.size() - 1; size >= 0; size--) {
            C0087c cVar2 = (C0087c) ((WeakReference) this.f199b.get(size)).get();
            if (cVar2 == null || cVar2 == cVar) {
                this.f199b.remove(size);
            }
        }
    }

    /* renamed from: a */
    public final void mo124a(boolean z) {
        final boolean z2;
        final boolean z3 = true;
        if (!this.f207j || this.f209l > this.f203f.f225b) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!this.f208k || this.f210m < (size() - 1) - this.f203f.f225b) {
            z3 = false;
        }
        if (z2 || z3) {
            if (z2) {
                this.f207j = false;
            }
            if (z3) {
                this.f208k = false;
            }
            if (z) {
                this.f200c.execute(new Runnable() {
                    public final void run() {
                        C0082h.this.mo125a(z2, z3);
                    }
                });
            } else {
                mo125a(z2, z3);
            }
        }
    }

    /* renamed from: a */
    public final void mo125a(boolean z, boolean z2) {
        if (z) {
            this.f204g.mo154d();
        }
        if (z2) {
            this.f202e.mo139a(this.f204g.mo155e());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo127b(int i, int i2) {
        if (i2 != 0) {
            for (int size = this.f199b.size() - 1; size >= 0; size--) {
                C0087c cVar = (C0087c) ((WeakReference) this.f199b.get(size)).get();
                if (cVar != null) {
                    cVar.mo83a(i, i2);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo128c(int i, int i2) {
        if (i2 != 0) {
            for (int size = this.f199b.size() - 1; size >= 0; size--) {
                C0087c cVar = (C0087c) ((WeakReference) this.f199b.get(size)).get();
                if (cVar != null) {
                    cVar.mo84b(i, i2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo123a(List<T> list, C0087c cVar) {
        if (!(list == null || list == this)) {
            if (!list.isEmpty()) {
                mo95a((C0082h) list, cVar);
            } else if (!this.f204g.isEmpty()) {
                cVar.mo83a(0, this.f204g.size());
            }
        }
        for (int size = this.f199b.size() - 1; size >= 0; size--) {
            if (((C0087c) ((WeakReference) this.f199b.get(size)).get()) == null) {
                this.f199b.remove(size);
            }
        }
        this.f199b.add(new WeakReference(cVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo126a(final boolean z, final boolean z2, final boolean z3) {
        if (this.f202e != null) {
            if (this.f209l == Integer.MAX_VALUE) {
                this.f209l = this.f204g.size();
            }
            if (this.f210m == Integer.MIN_VALUE) {
                this.f210m = 0;
            }
            if (z || z2 || z3) {
                this.f200c.execute(new Runnable() {
                    public final void run() {
                        if (z) {
                            C0082h.this.f202e.mo138a();
                        }
                        if (z2) {
                            C0082h.this.f207j = true;
                        }
                        if (z3) {
                            C0082h.this.f208k = true;
                        }
                        C0082h.this.mo124a(false);
                    }
                });
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't defer BoundaryCallback, no instance");
    }

    C0082h(C0092j<T> jVar, Executor executor, Executor executor2, C0085a<T> aVar, C0088d dVar) {
        this.f204g = jVar;
        this.f200c = executor;
        this.f201d = executor2;
        this.f202e = aVar;
        this.f203f = dVar;
    }
}
