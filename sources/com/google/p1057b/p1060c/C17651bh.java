package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17421k;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: com.google.b.c.bh */
final class C17651bh<E> extends C17579am<E> {

    /* renamed from: b */
    static final C17651bh<Comparable> f49352b = new C17651bh<>(C17530ab.m43056of(), C17638bb.m43359b());

    /* renamed from: c */
    final transient C17530ab<E> f49353c;

    public final C17530ab<E> asList() {
        return this.f49353c;
    }

    public final C17666bt<E> iterator() {
        return this.f49353c.iterator();
    }

    public final int size() {
        return this.f49353c.size();
    }

    public final C17666bt<E> descendingIterator() {
        return this.f49353c.reverse().iterator();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C17579am<E> mo34115b() {
        Comparator reverseOrder = Collections.reverseOrder(this.comparator);
        if (isEmpty()) {
            return m43222a(reverseOrder);
        }
        return new C17651bh(this.f49353c.reverse(), reverseOrder);
    }

    public final E first() {
        if (!isEmpty()) {
            return this.f49353c.get(0);
        }
        throw new NoSuchElementException();
    }

    public final E last() {
        if (!isEmpty()) {
            return this.f49353c.get(size() - 1);
        }
        throw new NoSuchElementException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo33977a() {
        return this.f49353c.mo33977a();
    }

    public final E ceiling(E e) {
        int d = m43392d(e, true);
        if (d == size()) {
            return null;
        }
        return this.f49353c.get(d);
    }

    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f49353c, obj, this.comparator) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return false;
    }

    public final E floor(E e) {
        int c = m43391c(e, true) - 1;
        if (c == -1) {
            return null;
        }
        return this.f49353c.get(c);
    }

    public final E higher(E e) {
        int d = m43392d(e, false);
        if (d == size()) {
            return null;
        }
        return this.f49353c.get(d);
    }

    public final E lower(E e) {
        int c = m43391c(e, false) - 1;
        if (c == -1) {
            return null;
        }
        return this.f49353c.get(c);
    }

    public final boolean containsAll(Collection<?> collection) {
        if (collection instanceof C17624aw) {
            collection = ((C17624aw) collection).elementSet();
        }
        if (!C17662bp.m43415a(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        C17666bt it = iterator();
        Iterator it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = it.next();
        while (true) {
            try {
                int a = mo34112a(next2, next);
                if (a < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (a == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (a > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!C17662bp.m43415a(this.comparator, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            C17666bt it2 = iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                Object next2 = it.next();
                if (next2 != null) {
                    if (mo34112a(next, next2) != 0) {
                    }
                }
                return false;
            }
            return true;
        } catch (ClassCastException unused) {
            return false;
        } catch (NoSuchElementException unused2) {
            return false;
        }
    }

    C17651bh(C17530ab<E> abVar, Comparator<? super E> comparator) {
        super(comparator);
        this.f49353c = abVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo33952a(Object[] objArr, int i) {
        return this.f49353c.mo33952a(objArr, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C17579am<E> mo34113a(E e, boolean z) {
        return m43390a(0, m43391c(e, z));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C17579am<E> mo34116b(E e, boolean z) {
        return m43390a(m43392d(e, z), size());
    }

    /* renamed from: a */
    private C17651bh<E> m43390a(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i < i2) {
            return new C17651bh<>(this.f49353c.subList(i, i2), this.comparator);
        }
        return m43222a(this.comparator);
    }

    /* renamed from: c */
    private int m43391c(E e, boolean z) {
        int binarySearch = Collections.binarySearch(this.f49353c, C17421k.m42653a(e), comparator());
        if (binarySearch < 0) {
            return binarySearch ^ -1;
        }
        if (z) {
            binarySearch++;
        }
        return binarySearch;
    }

    /* renamed from: d */
    private int m43392d(E e, boolean z) {
        int binarySearch = Collections.binarySearch(this.f49353c, C17421k.m42653a(e), comparator());
        if (binarySearch < 0) {
            return binarySearch ^ -1;
        }
        if (z) {
            return binarySearch;
        }
        return binarySearch + 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C17579am<E> mo34114a(E e, boolean z, E e2, boolean z2) {
        return mo34116b(e, z).mo34113a(e2, z2);
    }
}
