package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17421k;
import com.google.p1057b.p1060c.C17624aw.C17625a;
import com.google.p1057b.p1060c.C17725z.C17727b;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.google.b.c.ai */
public abstract class C17564ai<E> extends C17569aj<E> implements C17624aw<E> {

    /* renamed from: a */
    private transient C17530ab<E> f49234a;

    /* renamed from: b */
    private transient C17570ak<C17625a<E>> f49235b;

    /* renamed from: com.google.b.c.ai$a */
    public static class C17566a<E> extends C17727b<E> {

        /* renamed from: a */
        C17636ba<E> f49240a;

        /* renamed from: b */
        boolean f49241b;

        /* renamed from: c */
        boolean f49242c;

        public C17566a() {
            this(4);
        }

        /* renamed from: a */
        public final C17564ai<E> mo34092a() {
            if (this.f49240a.f49313c == 0) {
                return C17564ai.m43158of();
            }
            if (this.f49242c) {
                this.f49240a = new C17636ba<>(this.f49240a);
                this.f49242c = false;
            }
            this.f49241b = true;
            return new C17646bf(this.f49240a);
        }

        /* renamed from: b */
        public final C17566a<E> mo33972a(Iterator<? extends E> it) {
            super.mo33972a(it);
            return this;
        }

        /* renamed from: a */
        public final C17566a<E> mo33975b(E e) {
            return mo34091a(e, 1);
        }

        /* renamed from: b */
        public final C17566a<E> mo33973a(E... eArr) {
            super.mo33973a(eArr);
            return this;
        }

        C17566a(int i) {
            this.f49240a = new C17636ba<>(i);
        }

        /* renamed from: b */
        public final C17566a<E> mo33971a(Iterable<? extends E> iterable) {
            C17636ba<E> baVar;
            if (iterable instanceof C17624aw) {
                C17624aw a = C17626ax.m43324a(iterable);
                if (a instanceof C17646bf) {
                    baVar = ((C17646bf) a).f49340b;
                } else if (a instanceof C17687e) {
                    baVar = ((C17687e) a).f49395a;
                } else {
                    baVar = null;
                }
                if (baVar != null) {
                    this.f49240a.mo34231e(Math.max(this.f49240a.f49313c, baVar.f49313c));
                    for (int a2 = baVar.mo34223a(); a2 >= 0; a2 = baVar.mo34224a(a2)) {
                        mo34091a(baVar.mo34228b(a2), baVar.mo34229c(a2));
                    }
                } else {
                    this.f49240a.mo34231e(Math.max(this.f49240a.f49313c, a.entrySet().size()));
                    for (C17625a aVar : a.entrySet()) {
                        mo34091a(aVar.mo34201a(), aVar.mo34202b());
                    }
                }
            } else {
                super.mo33971a(iterable);
            }
            return this;
        }

        /* renamed from: a */
        public final C17566a<E> mo34091a(E e, int i) {
            if (i == 0) {
                return this;
            }
            if (this.f49241b) {
                this.f49240a = new C17636ba<>(this.f49240a);
                this.f49242c = false;
            }
            this.f49241b = false;
            C17421k.m42653a(e);
            this.f49240a.mo34226a(e, i + this.f49240a.mo34227b((Object) e));
            return this;
        }
    }

    /* renamed from: com.google.b.c.ai$b */
    final class C17567b extends C17572b<C17625a<E>> {
        private static final long serialVersionUID = 0;

        public final int hashCode() {
            return C17564ai.this.hashCode();
        }

        /* access modifiers changed from: 0000 */
        public final Object writeReplace() {
            return new C17568c(C17564ai.this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo33977a() {
            return C17564ai.this.mo33977a();
        }

        public final int size() {
            return C17564ai.this.elementSet().size();
        }

        private C17567b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo34031a(int i) {
            return C17564ai.this.mo34075a(i);
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof C17625a)) {
                return false;
            }
            C17625a aVar = (C17625a) obj;
            if (aVar.mo34202b() > 0 && C17564ai.this.mo34074a(aVar.mo34201a()) == aVar.mo34202b()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.b.c.ai$c */
    static class C17568c<E> implements Serializable {

        /* renamed from: a */
        final C17564ai<E> f49244a;

        /* access modifiers changed from: 0000 */
        public final Object readResolve() {
            return this.f49244a.entrySet();
        }

        C17568c(C17564ai<E> aiVar) {
            this.f49244a = aiVar;
        }
    }

    C17564ai() {
    }

    /* renamed from: of */
    public static <E> C17564ai<E> m43158of() {
        return C17646bf.f49339a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract C17625a<E> mo34075a(int i);

    public abstract C17570ak<E> elementSet();

    /* access modifiers changed from: 0000 */
    public abstract Object writeReplace();

    public static <E> C17566a<E> builder() {
        return new C17566a<>();
    }

    public C17530ab<E> asList() {
        C17530ab<E> abVar = this.f49234a;
        if (abVar != null) {
            return abVar;
        }
        C17530ab<E> asList = super.asList();
        this.f49234a = asList;
        return asList;
    }

    public int hashCode() {
        return C17658bm.m43405a(entrySet());
    }

    public C17666bt<E> iterator() {
        final C17666bt it = entrySet().iterator();
        return new C17666bt<E>() {

            /* renamed from: a */
            int f49236a;

            /* renamed from: b */
            E f49237b;

            public final boolean hasNext() {
                if (this.f49236a > 0 || it.hasNext()) {
                    return true;
                }
                return false;
            }

            public final E next() {
                if (this.f49236a <= 0) {
                    C17625a aVar = (C17625a) it.next();
                    this.f49237b = aVar.mo34201a();
                    this.f49236a = aVar.mo34202b();
                }
                this.f49236a--;
                return this.f49237b;
            }
        };
    }

    public String toString() {
        return entrySet().toString();
    }

    public C17570ak<C17625a<E>> entrySet() {
        C17570ak<C17625a<E>> akVar = this.f49235b;
        if (akVar == null) {
            if (isEmpty()) {
                akVar = C17570ak.m43180of();
            } else {
                akVar = new C17567b<>();
            }
            this.f49235b = akVar;
        }
        return akVar;
    }

    public static <E> C17564ai<E> copyOf(E[] eArr) {
        return m43157a(eArr);
    }

    public boolean equals(Object obj) {
        return C17626ax.m43325a(this, obj);
    }

    /* renamed from: a */
    private static <E> C17564ai<E> m43157a(E... eArr) {
        return new C17566a().mo33973a(eArr).mo34092a();
    }

    public static <E> C17564ai<E> copyOf(Iterator<? extends E> it) {
        return new C17566a().mo33972a(it).mo34092a();
    }

    /* renamed from: of */
    public static <E> C17564ai<E> m43159of(E e) {
        return m43157a((E[]) new Object[]{e});
    }

    public boolean contains(Object obj) {
        if (mo34074a(obj) > 0) {
            return true;
        }
        return false;
    }

    public static <E> C17564ai<E> copyOf(Iterable<? extends E> iterable) {
        int i;
        if (iterable instanceof C17564ai) {
            C17564ai<E> aiVar = (C17564ai) iterable;
            if (!aiVar.mo33977a()) {
                return aiVar;
            }
        }
        if (iterable instanceof C17624aw) {
            i = ((C17624aw) iterable).elementSet().size();
        } else {
            i = 11;
        }
        C17566a aVar = new C17566a(i);
        aVar.mo33971a(iterable);
        return aVar.mo34092a();
    }

    public final int add(E e, int i) {
        throw new UnsupportedOperationException();
    }

    public final int remove(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public final int setCount(E e, int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: of */
    public static <E> C17564ai<E> m43160of(E e, E e2) {
        return m43157a((E[]) new Object[]{e, e2});
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo33952a(Object[] objArr, int i) {
        C17666bt it = entrySet().iterator();
        while (it.hasNext()) {
            C17625a aVar = (C17625a) it.next();
            Arrays.fill(objArr, i, aVar.mo34202b() + i, aVar.mo34201a());
            i += aVar.mo34202b();
        }
        return i;
    }

    public final boolean setCount(E e, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: of */
    public static <E> C17564ai<E> m43161of(E e, E e2, E e3) {
        return m43157a((E[]) new Object[]{e, e2, e3});
    }

    /* renamed from: of */
    public static <E> C17564ai<E> m43162of(E e, E e2, E e3, E e4) {
        return m43157a((E[]) new Object[]{e, e2, e3, e4});
    }

    /* renamed from: of */
    public static <E> C17564ai<E> m43163of(E e, E e2, E e3, E e4, E e5) {
        return m43157a((E[]) new Object[]{e, e2, e3, e4, e5});
    }

    /* renamed from: of */
    public static <E> C17564ai<E> m43164of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        return new C17566a().mo33975b(e).mo33975b(e2).mo33975b(e3).mo33975b(e4).mo33975b(e5).mo33975b(e6).mo33973a(eArr).mo34092a();
    }
}
