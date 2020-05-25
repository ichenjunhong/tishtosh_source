package p2628d.p2649l;

import java.util.Iterator;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.p2642a.C52695a;

/* renamed from: d.l.o */
public final class C52801o<T, R> implements C52785g<R> {

    /* renamed from: a */
    public final C52785g<T> f131039a;

    /* renamed from: b */
    public final C52671b<T, R> f131040b;

    /* renamed from: d.l.o$a */
    public static final class C52802a implements C52695a, Iterator<R> {

        /* renamed from: a */
        public final Iterator<T> f131041a;

        /* renamed from: b */
        final /* synthetic */ C52801o f131042b;

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            return this.f131041a.hasNext();
        }

        public final R next() {
            return this.f131042b.f131040b.invoke(this.f131041a.next());
        }

        C52802a(C52801o oVar) {
            this.f131042b = oVar;
            this.f131041a = oVar.f131039a.mo110157a();
        }
    }

    /* renamed from: a */
    public final Iterator<R> mo110157a() {
        return new C52802a<>(this);
    }

    public C52801o(C52785g<? extends T> gVar, C52671b<? super T, ? extends R> bVar) {
        C52711k.m112240b(gVar, "sequence");
        C52711k.m112240b(bVar, "transformer");
        this.f131039a = gVar;
        this.f131040b = bVar;
    }
}
