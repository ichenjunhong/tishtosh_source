package p2628d.p2649l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.p2642a.C52695a;

/* renamed from: d.l.e */
public final class C52781e<T, R, E> implements C52785g<E> {

    /* renamed from: a */
    public final C52785g<T> f131015a;

    /* renamed from: b */
    public final C52671b<T, R> f131016b;

    /* renamed from: c */
    public final C52671b<R, Iterator<E>> f131017c;

    /* renamed from: d.l.e$a */
    public static final class C52782a implements C52695a, Iterator<E> {

        /* renamed from: a */
        public final Iterator<T> f131018a;

        /* renamed from: b */
        public Iterator<? extends E> f131019b;

        /* renamed from: c */
        final /* synthetic */ C52781e f131020c;

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            return m112330a();
        }

        public final E next() {
            if (m112330a()) {
                Iterator<? extends E> it = this.f131019b;
                if (it == null) {
                    C52711k.m112234a();
                }
                return it.next();
            }
            throw new NoSuchElementException();
        }

        /* renamed from: a */
        private final boolean m112330a() {
            Iterator<? extends E> it = this.f131019b;
            if (it != null && !it.hasNext()) {
                this.f131019b = null;
            }
            while (this.f131019b == null) {
                if (!this.f131018a.hasNext()) {
                    return false;
                }
                Iterator<? extends E> it2 = (Iterator) this.f131020c.f131017c.invoke(this.f131020c.f131016b.invoke(this.f131018a.next()));
                if (it2.hasNext()) {
                    this.f131019b = it2;
                    return true;
                }
            }
            return true;
        }

        C52782a(C52781e eVar) {
            this.f131020c = eVar;
            this.f131018a = eVar.f131015a.mo110157a();
        }
    }

    /* renamed from: a */
    public final Iterator<E> mo110157a() {
        return new C52782a<>(this);
    }

    public C52781e(C52785g<? extends T> gVar, C52671b<? super T, ? extends R> bVar, C52671b<? super R, ? extends Iterator<? extends E>> bVar2) {
        C52711k.m112240b(gVar, "sequence");
        C52711k.m112240b(bVar, "transformer");
        C52711k.m112240b(bVar2, "iterator");
        this.f131015a = gVar;
        this.f131016b = bVar;
        this.f131017c = bVar2;
    }
}
