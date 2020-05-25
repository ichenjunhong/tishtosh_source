package p2628d.p2629a;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p2628d.p2639f.p2641b.C52701b;
import p2628d.p2639f.p2641b.C52706f;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.p2642a.C52695a;

/* renamed from: d.a.e */
final class C52567e<T> implements C52695a, Collection<T> {

    /* renamed from: a */
    public final T[] f130876a;

    /* renamed from: b */
    public final boolean f130877b;

    public final boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return this.f130876a.length;
    }

    public final <T> T[] toArray(T[] tArr) {
        return C52706f.m112227a(this, tArr);
    }

    public final Iterator<T> iterator() {
        return C52701b.m112223a(this.f130876a);
    }

    public final boolean isEmpty() {
        if (this.f130876a.length == 0) {
            return true;
        }
        return false;
    }

    public final Object[] toArray() {
        T[] tArr = this.f130876a;
        boolean z = this.f130877b;
        C52711k.m112240b(tArr, "$this$copyToArrayOfAny");
        if (z && C52711k.m112239a((Object) tArr.getClass(), (Object) Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        C52711k.m112236a((Object) copyOf, "java.util.Arrays.copyOf(… Array<Any?>::class.java)");
        return copyOf;
    }

    public final boolean contains(Object obj) {
        return C52568f.m112077a(this.f130876a, obj);
    }

    public final boolean containsAll(Collection<? extends Object> collection) {
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

    public C52567e(T[] tArr, boolean z) {
        C52711k.m112240b(tArr, "values");
        this.f130876a = tArr;
        this.f130877b = z;
    }
}
