package p2628d.p2629a;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.p2642a.C52695a;

/* renamed from: d.a.d */
public abstract class C52562d<E> extends C52547a<E> implements C52695a, List<E> {

    /* renamed from: a */
    public static final C52563a f130869a = new C52563a(null);

    /* renamed from: d.a.d$a */
    public static final class C52563a {
        private C52563a() {
        }

        public /* synthetic */ C52563a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d.a.d$b */
    class C52564b implements C52695a, Iterator<E> {

        /* renamed from: a */
        public int f130870a;

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasNext() {
            if (this.f130870a < C52562d.this.size()) {
                return true;
            }
            return false;
        }

        public E next() {
            if (hasNext()) {
                C52562d dVar = C52562d.this;
                int i = this.f130870a;
                this.f130870a = i + 1;
                return dVar.get(i);
            }
            throw new NoSuchElementException();
        }

        public C52564b() {
        }
    }

    /* renamed from: d.a.d$c */
    class C52565c extends C52564b implements C52695a, ListIterator<E> {
        public final void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final int nextIndex() {
            return this.f130870a;
        }

        public final void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasPrevious() {
            if (this.f130870a > 0) {
                return true;
            }
            return false;
        }

        public final int previousIndex() {
            return this.f130870a - 1;
        }

        public final E previous() {
            if (hasPrevious()) {
                C52562d dVar = C52562d.this;
                this.f130870a--;
                return dVar.get(this.f130870a);
            }
            throw new NoSuchElementException();
        }

        public C52565c(int i) {
            super();
            int size = C52562d.this.size();
            if (i < 0 || i > size) {
                StringBuilder sb = new StringBuilder("index: ");
                sb.append(i);
                sb.append(", size: ");
                sb.append(size);
                throw new IndexOutOfBoundsException(sb.toString());
            }
            this.f130870a = i;
        }
    }

    /* renamed from: d.a.d$d */
    static final class C52566d<E> extends C52562d<E> implements RandomAccess {

        /* renamed from: b */
        private int f130873b;

        /* renamed from: c */
        private final C52562d<E> f130874c;

        /* renamed from: d */
        private final int f130875d;

        /* renamed from: a */
        public final int mo110100a() {
            return this.f130873b;
        }

        public final E get(int i) {
            int i2 = this.f130873b;
            if (i >= 0 && i < i2) {
                return this.f130874c.get(this.f130875d + i);
            }
            StringBuilder sb = new StringBuilder("index: ");
            sb.append(i);
            sb.append(", size: ");
            sb.append(i2);
            throw new IndexOutOfBoundsException(sb.toString());
        }

        public C52566d(C52562d<? extends E> dVar, int i, int i2) {
            C52711k.m112240b(dVar, "list");
            this.f130874c = dVar;
            this.f130875d = i;
            int i3 = this.f130875d;
            int size = this.f130874c.size();
            if (i3 < 0 || i2 > size) {
                StringBuilder sb = new StringBuilder("fromIndex: ");
                sb.append(i3);
                sb.append(", toIndex: ");
                sb.append(i2);
                sb.append(", size: ");
                sb.append(size);
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (i3 <= i2) {
                this.f130873b = i2 - this.f130875d;
            } else {
                StringBuilder sb2 = new StringBuilder("fromIndex: ");
                sb2.append(i3);
                sb2.append(" > toIndex: ");
                sb2.append(i2);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
    }

    protected C52562d() {
    }

    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract E get(int i);

    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Iterator<E> iterator() {
        return new C52564b<>();
    }

    public ListIterator<E> listIterator() {
        return new C52565c<>(0);
    }

    public int hashCode() {
        int i;
        Collection collection = this;
        C52711k.m112240b(collection, "c");
        int i2 = 1;
        for (Object next : collection) {
            int i3 = i2 * 31;
            if (next != null) {
                i = next.hashCode();
            } else {
                i = 0;
            }
            i2 = i3 + i;
        }
        return i2;
    }

    public ListIterator<E> listIterator(int i) {
        return new C52565c<>(i);
    }

    public int indexOf(Object obj) {
        int i = 0;
        for (Object a : this) {
            if (C52711k.m112239a(a, obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C52711k.m112239a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection<Object> collection = this;
        Collection collection2 = (Collection) obj;
        C52711k.m112240b(collection, "c");
        C52711k.m112240b(collection2, "other");
        if (collection.size() != collection2.size()) {
            return false;
        }
        Iterator it = collection2.iterator();
        for (Object a : collection) {
            if (!C52711k.m112239a(a, it.next())) {
                return false;
            }
        }
        return true;
    }

    public List<E> subList(int i, int i2) {
        return new C52566d<>(this, i, i2);
    }
}
