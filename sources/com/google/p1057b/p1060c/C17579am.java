package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17421k;
import com.google.p1057b.p1060c.C17570ak.C17571a;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* renamed from: com.google.b.c.am */
public abstract class C17579am<E> extends C17582an<E> implements C17661bo<E>, NavigableSet<E> {

    /* renamed from: a */
    transient C17579am<E> f49255a;
    public final transient Comparator<? super E> comparator;

    /* renamed from: com.google.b.c.am$a */
    public static final class C17580a<E> extends C17571a<E> {

        /* renamed from: e */
        private final Comparator<? super E> f49256e;

        /* renamed from: b */
        public final C17579am<E> mo34100a() {
            C17579am<E> a = C17579am.m43221a(this.f49256e, this.f49461b, this.f49460a);
            this.f49461b = a.size();
            this.f49462c = true;
            return a;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public C17580a<E> mo34101b(Iterable<? extends E> iterable) {
            super.mo33971a(iterable);
            return this;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public C17580a<E> mo34104c(E e) {
            super.mo33975b(e);
            return this;
        }

        public C17580a(Comparator<? super E> comparator) {
            this.f49256e = (Comparator) C17421k.m42653a(comparator);
        }

        /* renamed from: c */
        public final C17580a<E> mo34102b(Iterator<? extends E> it) {
            super.mo33972a(it);
            return this;
        }

        /* renamed from: c */
        public final C17580a<E> mo34103b(E... eArr) {
            super.mo33973a(eArr);
            return this;
        }
    }

    /* renamed from: com.google.b.c.am$b */
    static class C17581b<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final Comparator<? super E> f49257a;

        /* renamed from: b */
        final Object[] f49258b;

        /* access modifiers changed from: 0000 */
        public final Object readResolve() {
            return new C17580a(this.f49257a).mo34103b((E[]) this.f49258b).mo34100a();
        }

        public C17581b(Comparator<? super E> comparator, Object[] objArr) {
            this.f49257a = comparator;
            this.f49258b = objArr;
        }
    }

    /* renamed from: of */
    public static <E> C17579am<E> m43223of() {
        return C17651bh.f49352b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract C17579am<E> mo34113a(E e, boolean z);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract C17579am<E> mo34114a(E e, boolean z, E e2, boolean z2);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract C17579am<E> mo34115b();

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract C17579am<E> mo34116b(E e, boolean z);

    public Comparator<? super E> comparator() {
        return this.comparator;
    }

    public abstract C17666bt<E> descendingIterator();

    public abstract C17666bt<E> iterator();

    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    public static <E extends Comparable<?>> C17580a<E> naturalOrder() {
        return new C17580a<>(C17638bb.m43359b());
    }

    public static <E extends Comparable<?>> C17580a<E> reverseOrder() {
        return new C17580a<>(Collections.reverseOrder());
    }

    public C17579am<E> descendingSet() {
        C17579am<E> amVar = this.f49255a;
        if (amVar != null) {
            return amVar;
        }
        C17579am<E> b = mo34115b();
        this.f49255a = b;
        b.f49255a = this;
        return b;
    }

    public E first() {
        return iterator().next();
    }

    public E last() {
        return descendingIterator().next();
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new C17581b(this.comparator, toArray());
    }

    C17579am(Comparator<? super E> comparator2) {
        this.comparator = comparator2;
    }

    public static <E> C17580a<E> orderedBy(Comparator<E> comparator2) {
        return new C17580a<>(comparator2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public C17579am<E> headSet(E e) {
        return headSet(e, false);
    }

    public C17579am<E> tailSet(E e) {
        return tailSet(e, true);
    }

    public static <E> C17579am<E> copyOf(Iterable<? extends E> iterable) {
        return copyOf((Comparator<? super E>) C17638bb.m43359b(), iterable);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> C17579am<E> m43224of(E e) {
        return new C17651bh(C17530ab.m43057of(e), C17638bb.m43359b());
    }

    public E ceiling(E e) {
        return C17583ao.m43257a((Iterable<? extends T>) tailSet(e, true), null);
    }

    public E floor(E e) {
        return C17586ap.m43266a((Iterator<? extends T>) headSet(e, true).descendingIterator(), null);
    }

    public E higher(E e) {
        return C17583ao.m43257a((Iterable<? extends T>) tailSet(e, false), null);
    }

    public E lower(E e) {
        return C17586ap.m43266a((Iterator<? extends T>) headSet(e, false).descendingIterator(), null);
    }

    /* renamed from: a */
    static <E> C17651bh<E> m43222a(Comparator<? super E> comparator2) {
        if (C17638bb.m43359b().equals(comparator2)) {
            return C17651bh.f49352b;
        }
        return new C17651bh<>(C17530ab.m43056of(), comparator2);
    }

    public static <E> C17579am<E> copyOf(Collection<? extends E> collection) {
        return copyOf((Comparator<? super E>) C17638bb.m43359b(), collection);
    }

    public static <E> C17579am<E> copyOfSorted(SortedSet<E> sortedSet) {
        Comparator a = C17662bp.m43414a(sortedSet);
        C17530ab copyOf = C17530ab.copyOf((Collection<? extends E>) sortedSet);
        if (copyOf.isEmpty()) {
            return m43222a(a);
        }
        return new C17651bh(copyOf, a);
    }

    public static <E> C17579am<E> copyOf(Iterator<? extends E> it) {
        return copyOf((Comparator<? super E>) C17638bb.m43359b(), it);
    }

    public static <E extends Comparable<? super E>> C17579am<E> copyOf(E[] eArr) {
        return m43221a(C17638bb.m43359b(), eArr.length, (Object[]) eArr.clone());
    }

    public static <E> C17579am<E> copyOf(Comparator<? super E> comparator2, Collection<? extends E> collection) {
        return copyOf(comparator2, (Iterable<? extends E>) collection);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo34112a(Object obj, Object obj2) {
        return this.comparator.compare(obj, obj2);
    }

    public C17579am<E> subSet(E e, E e2) {
        return subSet(e, true, e2, false);
    }

    public C17579am<E> headSet(E e, boolean z) {
        return mo34113a((E) C17421k.m42653a(e), z);
    }

    public C17579am<E> tailSet(E e, boolean z) {
        return mo34116b(C17421k.m42653a(e), z);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> C17579am<E> m43225of(E e, E e2) {
        return m43221a(C17638bb.m43359b(), 2, e, e2);
    }

    public static <E> C17579am<E> copyOf(Comparator<? super E> comparator2, Iterable<? extends E> iterable) {
        C17421k.m42653a(comparator2);
        if (C17662bp.m43415a(comparator2, iterable) && (iterable instanceof C17579am)) {
            C17579am<E> amVar = (C17579am) iterable;
            if (!amVar.mo33977a()) {
                return amVar;
            }
        }
        Object[] a = C17583ao.m43260a(iterable);
        return m43221a(comparator2, a.length, a);
    }

    public static <E> C17579am<E> copyOf(Comparator<? super E> comparator2, Iterator<? extends E> it) {
        return new C17580a(comparator2).mo34102b(it).mo34100a();
    }

    /* renamed from: a */
    static <E> C17579am<E> m43221a(Comparator<? super E> comparator2, int i, E... eArr) {
        if (i == 0) {
            return m43222a(comparator2);
        }
        C17632az.m43334b(eArr, i);
        Arrays.sort(eArr, 0, i, comparator2);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            E e = eArr[i3];
            if (comparator2.compare(e, eArr[i2 - 1]) != 0) {
                int i4 = i2 + 1;
                eArr[i2] = e;
                i2 = i4;
            }
        }
        Arrays.fill(eArr, i2, i, null);
        if (i2 < eArr.length / 2) {
            eArr = Arrays.copyOf(eArr, i2);
        }
        return new C17651bh(C17530ab.m43055b(eArr, i2), comparator2);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> C17579am<E> m43226of(E e, E e2, E e3) {
        return m43221a(C17638bb.m43359b(), 3, e, e2, e3);
    }

    public C17579am<E> subSet(E e, boolean z, E e2, boolean z2) {
        boolean z3;
        C17421k.m42653a(e);
        C17421k.m42653a(e2);
        if (this.comparator.compare(e, e2) <= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C17421k.m42659a(z3);
        return mo34114a(e, z, e2, z2);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> C17579am<E> m43227of(E e, E e2, E e3, E e4) {
        return m43221a(C17638bb.m43359b(), 4, e, e2, e3, e4);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> C17579am<E> m43228of(E e, E e2, E e3, E e4, E e5) {
        return m43221a(C17638bb.m43359b(), 5, e, e2, e3, e4, e5);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> C17579am<E> m43229of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        Comparable[] comparableArr = new Comparable[(eArr.length + 6)];
        comparableArr[0] = e;
        comparableArr[1] = e2;
        comparableArr[2] = e3;
        comparableArr[3] = e4;
        comparableArr[4] = e5;
        comparableArr[5] = e6;
        System.arraycopy(eArr, 0, comparableArr, 6, eArr.length);
        return m43221a(C17638bb.m43359b(), comparableArr.length, comparableArr);
    }
}
