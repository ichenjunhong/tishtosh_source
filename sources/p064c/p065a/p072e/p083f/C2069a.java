package p064c.p065a.p072e.p083f;

import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.p072e.p075c.C1754h;

/* renamed from: c.a.e.f.a */
public final class C2069a<T> implements C1754h<T> {

    /* renamed from: a */
    private final AtomicReference<C2070a<T>> f6725a = new AtomicReference<>();

    /* renamed from: b */
    private final AtomicReference<C2070a<T>> f6726b = new AtomicReference<>();

    /* renamed from: c.a.e.f.a$a */
    static final class C2070a<E> extends AtomicReference<C2070a<E>> {
        private static final long serialVersionUID = 2404266111789071508L;

        /* renamed from: a */
        private E f6727a;

        C2070a() {
        }

        /* renamed from: c */
        private E m6342c() {
            return this.f6727a;
        }

        /* renamed from: b */
        public final C2070a<E> mo6366b() {
            return (C2070a) get();
        }

        /* renamed from: a */
        public final E mo6365a() {
            E c = m6342c();
            m6341a(null);
            return c;
        }

        /* renamed from: a */
        private void m6341a(E e) {
            this.f6727a = e;
        }

        C2070a(E e) {
            m6341a(e);
        }
    }

    /* renamed from: a */
    private C2070a<T> m6338a() {
        return (C2070a) this.f6725a.get();
    }

    public final void clear() {
        while (poll() != null) {
            if (isEmpty()) {
                return;
            }
        }
    }

    public C2069a() {
        C2070a aVar = new C2070a();
        m6340b(aVar);
        m6339a(aVar);
    }

    public final boolean isEmpty() {
        if (((C2070a) this.f6726b.get()) == m6338a()) {
            return true;
        }
        return false;
    }

    public final T poll() {
        C2070a b;
        C2070a aVar = (C2070a) this.f6726b.get();
        C2070a b2 = aVar.mo6366b();
        if (b2 != null) {
            T a = b2.mo6365a();
            m6340b(b2);
            return a;
        } else if (aVar == m6338a()) {
            return null;
        } else {
            do {
                b = aVar.mo6366b();
            } while (b == null);
            T a2 = b.mo6365a();
            m6340b(b);
            return a2;
        }
    }

    /* renamed from: b */
    private void m6340b(C2070a<T> aVar) {
        this.f6726b.lazySet(aVar);
    }

    /* renamed from: a */
    private C2070a<T> m6339a(C2070a<T> aVar) {
        return (C2070a) this.f6725a.getAndSet(aVar);
    }

    public final boolean offer(T t) {
        if (t != null) {
            C2070a aVar = new C2070a(t);
            m6339a(aVar).lazySet(aVar);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }
}
