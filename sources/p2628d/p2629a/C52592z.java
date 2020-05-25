package p2628d.p2629a;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p2628d.p2639f.p2641b.C52706f;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.p2642a.C52695a;

/* renamed from: d.a.z */
public final class C52592z implements C52695a, Serializable, Set {
    public static final C52592z INSTANCE = new C52592z();
    private static final long serialVersionUID = 3406603774387020532L;

    private C52592z() {
    }

    private final Object readResolve() {
        return INSTANCE;
    }

    public final /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean add(Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Void voidR) {
        C52711k.m112240b(voidR, "element");
        return false;
    }

    public final int getSize() {
        return 0;
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object[] toArray() {
        return C52706f.m112226a(this);
    }

    public final <T> T[] toArray(T[] tArr) {
        return C52706f.m112227a(this, tArr);
    }

    public final String toString() {
        return "[]";
    }

    public final Iterator iterator() {
        return C52589w.f130882a;
    }

    public final int size() {
        return getSize();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return contains((Void) obj);
    }

    public final boolean containsAll(Collection collection) {
        C52711k.m112240b(collection, "elements");
        return collection.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Set) || !((Set) obj).isEmpty()) {
            return false;
        }
        return true;
    }
}
