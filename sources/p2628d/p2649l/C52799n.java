package p2628d.p2649l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.p2642a.C52695a;

/* renamed from: d.l.n */
public final class C52799n<T> implements C52777b<T>, C52785g<T> {

    /* renamed from: a */
    public final C52785g<T> f131034a;

    /* renamed from: b */
    public final int f131035b;

    /* renamed from: d.l.n$a */
    public static final class C52800a implements C52695a, Iterator<T> {

        /* renamed from: a */
        public int f131036a;

        /* renamed from: b */
        public final Iterator<T> f131037b;

        /* renamed from: c */
        final /* synthetic */ C52799n f131038c;

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            if (this.f131036a <= 0 || !this.f131037b.hasNext()) {
                return false;
            }
            return true;
        }

        public final T next() {
            if (this.f131036a != 0) {
                this.f131036a--;
                return this.f131037b.next();
            }
            throw new NoSuchElementException();
        }

        C52800a(C52799n nVar) {
            this.f131038c = nVar;
            this.f131036a = nVar.f131035b;
            this.f131037b = nVar.f131034a.mo110157a();
        }
    }

    /* renamed from: a */
    public final Iterator<T> mo110157a() {
        return new C52800a<>(this);
    }

    /* renamed from: a */
    public final C52785g<T> mo110350a(int i) {
        if (i >= this.f131035b) {
            return this;
        }
        return new C52799n<>(this.f131034a, i);
    }

    public C52799n(C52785g<? extends T> gVar, int i) {
        boolean z;
        C52711k.m112240b(gVar, "sequence");
        this.f131034a = gVar;
        this.f131035b = i;
        if (this.f131035b >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            StringBuilder sb = new StringBuilder("count must be non-negative, but was ");
            sb.append(this.f131035b);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
    }
}
