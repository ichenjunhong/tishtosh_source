package p2628d.p2649l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.p2642a.C52695a;

/* renamed from: d.l.d */
public final class C52779d<T> implements C52785g<T> {

    /* renamed from: a */
    public final C52785g<T> f131008a;

    /* renamed from: b */
    public final boolean f131009b;

    /* renamed from: c */
    public final C52671b<T, Boolean> f131010c;

    /* renamed from: d.l.d$a */
    public static final class C52780a implements C52695a, Iterator<T> {

        /* renamed from: a */
        public final Iterator<T> f131011a;

        /* renamed from: b */
        public int f131012b = -1;

        /* renamed from: c */
        public T f131013c;

        /* renamed from: d */
        final /* synthetic */ C52779d f131014d;

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            if (this.f131012b == -1) {
                m112328a();
            }
            if (this.f131012b == 1) {
                return true;
            }
            return false;
        }

        public final T next() {
            if (this.f131012b == -1) {
                m112328a();
            }
            if (this.f131012b != 0) {
                T t = this.f131013c;
                this.f131013c = null;
                this.f131012b = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: a */
        private final void m112328a() {
            while (this.f131011a.hasNext()) {
                T next = this.f131011a.next();
                if (((Boolean) this.f131014d.f131010c.invoke(next)).booleanValue() == this.f131014d.f131009b) {
                    this.f131013c = next;
                    this.f131012b = 1;
                    return;
                }
            }
            this.f131012b = 0;
        }

        C52780a(C52779d dVar) {
            this.f131014d = dVar;
            this.f131011a = dVar.f131008a.mo110157a();
        }
    }

    /* renamed from: a */
    public final Iterator<T> mo110157a() {
        return new C52780a<>(this);
    }

    public C52779d(C52785g<? extends T> gVar, boolean z, C52671b<? super T, Boolean> bVar) {
        C52711k.m112240b(gVar, "sequence");
        C52711k.m112240b(bVar, "predicate");
        this.f131008a = gVar;
        this.f131009b = z;
        this.f131010c = bVar;
    }
}
