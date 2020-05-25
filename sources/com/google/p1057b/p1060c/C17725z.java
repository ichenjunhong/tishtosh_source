package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17421k;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.b.c.z */
public abstract class C17725z<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a */
    private static final Object[] f49459a = new Object[0];

    /* renamed from: com.google.b.c.z$a */
    static abstract class C17726a<E> extends C17727b<E> {

        /* renamed from: a */
        Object[] f49460a;

        /* renamed from: b */
        int f49461b = 0;

        /* renamed from: c */
        boolean f49462c;

        C17726a(int i) {
            C17698k.m43477a(i, "initialCapacity");
            this.f49460a = new Object[i];
        }

        /* renamed from: a */
        public C17726a<E> mo33975b(E e) {
            C17421k.m42653a(e);
            m43540a(this.f49461b + 1);
            Object[] objArr = this.f49460a;
            int i = this.f49461b;
            this.f49461b = i + 1;
            objArr[i] = e;
            return this;
        }

        /* renamed from: a */
        private void m43540a(int i) {
            if (this.f49460a.length < i) {
                this.f49460a = Arrays.copyOf(this.f49460a, m43545a(this.f49460a.length, i));
                this.f49462c = false;
                return;
            }
            if (this.f49462c) {
                this.f49460a = (Object[]) this.f49460a.clone();
                this.f49462c = false;
            }
        }

        /* renamed from: a */
        public C17727b<E> mo33971a(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                m43540a(this.f49461b + collection.size());
                if (collection instanceof C17725z) {
                    this.f49461b = ((C17725z) collection).mo33952a(this.f49460a, this.f49461b);
                    return this;
                }
            }
            super.mo33971a(iterable);
            return this;
        }

        /* renamed from: a */
        public C17727b<E> mo33973a(E... eArr) {
            C17632az.m43332a(eArr);
            m43540a(this.f49461b + eArr.length);
            System.arraycopy(eArr, 0, this.f49460a, this.f49461b, eArr.length);
            this.f49461b += eArr.length;
            return this;
        }
    }

    /* renamed from: com.google.b.c.z$b */
    public static abstract class C17727b<E> {
        C17727b() {
        }

        /* renamed from: b */
        public abstract C17727b<E> mo33975b(E e);

        /* renamed from: a */
        public C17727b<E> mo33972a(Iterator<? extends E> it) {
            while (it.hasNext()) {
                mo33975b(it.next());
            }
            return this;
        }

        /* renamed from: a */
        public C17727b<E> mo33971a(Iterable<? extends E> iterable) {
            for (Object b : iterable) {
                mo33975b(b);
            }
            return this;
        }

        /* renamed from: a */
        public C17727b<E> mo33973a(E... eArr) {
            for (E b : eArr) {
                mo33975b(b);
            }
            return this;
        }

        /* renamed from: a */
        static int m43545a(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    C17725z() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo33977a();

    public abstract boolean contains(Object obj);

    public abstract C17666bt<E> iterator();

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        int size = size();
        if (size == 0) {
            return f49459a;
        }
        Object[] objArr = new Object[size];
        mo33952a(objArr, 0);
        return objArr;
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new C17534d(toArray());
    }

    public C17530ab<E> asList() {
        if (isEmpty()) {
            return C17530ab.m43056of();
        }
        return C17530ab.m43053a(toArray());
    }

    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final <T> T[] toArray(T[] tArr) {
        C17421k.m42653a(tArr);
        int size = size();
        if (tArr.length < size) {
            tArr = C17632az.m43333a(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo33952a(tArr, 0);
        return tArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo33952a(Object[] objArr, int i) {
        C17666bt it = iterator();
        while (it.hasNext()) {
            int i2 = i + 1;
            objArr[i] = it.next();
            i = i2;
        }
        return i;
    }
}
