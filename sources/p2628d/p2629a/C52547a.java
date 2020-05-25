package p2628d.p2629a;

import java.util.Collection;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52706f;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.p2642a.C52695a;

/* renamed from: d.a.a */
public abstract class C52547a<E> implements C52695a, Collection<E> {

    /* renamed from: d.a.a$a */
    static final class C52548a extends C52712l implements C52671b<E, CharSequence> {

        /* renamed from: a */
        final /* synthetic */ C52547a f130864a;

        C52548a(C52547a aVar) {
            this.f130864a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            if (obj == this.f130864a) {
                return "(this Collection)";
            }
            return String.valueOf(obj);
        }
    }

    protected C52547a() {
    }

    /* renamed from: a */
    public abstract int mo110100a();

    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return mo110100a();
    }

    public Object[] toArray() {
        return C52706f.m112226a(this);
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return C52575l.m112120a(this, ", ", "[", "]", 0, null, new C52548a(this), 24, null);
    }

    public <T> T[] toArray(T[] tArr) {
        C52711k.m112240b(tArr, "array");
        T[] a = C52706f.m112227a(this, tArr);
        if (a != null) {
            return a;
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public boolean contains(Object obj) {
        if (!isEmpty()) {
            for (Object a : this) {
                if (C52711k.m112239a(a, obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C52711k.m112240b(collection, "elements");
        Iterable<Object> iterable = collection;
        if (!((Collection) iterable).isEmpty()) {
            for (Object contains : iterable) {
                if (!contains(contains)) {
                    return false;
                }
            }
        }
        return true;
    }
}
