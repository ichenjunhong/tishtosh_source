package p2628d.p2649l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.p2642a.C52695a;

/* renamed from: d.l.f */
public final class C52783f<T> implements C52785g<T> {

    /* renamed from: a */
    public final C52670a<T> f131021a;

    /* renamed from: b */
    public final C52671b<T, T> f131022b;

    /* renamed from: d.l.f$a */
    public static final class C52784a implements C52695a, Iterator<T> {

        /* renamed from: a */
        public T f131023a;

        /* renamed from: b */
        public int f131024b = -2;

        /* renamed from: c */
        final /* synthetic */ C52783f f131025c;

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            if (this.f131024b < 0) {
                m112332a();
            }
            if (this.f131024b == 1) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private final void m112332a() {
            T t;
            int i;
            if (this.f131024b == -2) {
                t = this.f131025c.f131021a.invoke();
            } else {
                C52671b<T, T> bVar = this.f131025c.f131022b;
                T t2 = this.f131023a;
                if (t2 == null) {
                    C52711k.m112234a();
                }
                t = bVar.invoke(t2);
            }
            this.f131023a = t;
            if (this.f131023a == null) {
                i = 0;
            } else {
                i = 1;
            }
            this.f131024b = i;
        }

        public final T next() {
            if (this.f131024b < 0) {
                m112332a();
            }
            if (this.f131024b != 0) {
                T t = this.f131023a;
                if (t != null) {
                    this.f131024b = -1;
                    return t;
                }
                throw new C52857u("null cannot be cast to non-null type T");
            }
            throw new NoSuchElementException();
        }

        C52784a(C52783f fVar) {
            this.f131025c = fVar;
        }
    }

    /* renamed from: a */
    public final Iterator<T> mo110157a() {
        return new C52784a<>(this);
    }

    public C52783f(C52670a<? extends T> aVar, C52671b<? super T, ? extends T> bVar) {
        C52711k.m112240b(aVar, "getInitialValue");
        C52711k.m112240b(bVar, "getNextValue");
        this.f131021a = aVar;
        this.f131022b = bVar;
    }
}
