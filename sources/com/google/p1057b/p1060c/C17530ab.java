package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17417i;
import com.google.p1057b.p1058a.C17421k;
import com.google.p1057b.p1060c.C17725z.C17727b;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.b.c.ab */
public abstract class C17530ab<E> extends C17725z<E> implements List<E>, RandomAccess {

    /* renamed from: a */
    private static final C17667bu<Object> f49180a = new C17532b(C17640bd.f49322a, 0);

    /* renamed from: com.google.b.c.ab$a */
    public static final class C17531a<E> extends C17726a<E> {
        public C17531a() {
            this(4);
        }

        /* renamed from: a */
        public final C17530ab<E> mo33969a() {
            this.f49462c = true;
            return C17530ab.m43055b(this.f49460a, this.f49461b);
        }

        C17531a(int i) {
            super(i);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C17727b mo33971a(Iterable iterable) {
            super.mo33971a(iterable);
            return this;
        }

        /* renamed from: b */
        public final C17531a<E> mo33972a(Iterator<? extends E> it) {
            super.mo33972a(it);
            return this;
        }

        /* renamed from: c */
        public final C17531a<E> mo33975b(E e) {
            super.mo33975b(e);
            return this;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C17727b mo33973a(Object[] objArr) {
            super.mo33973a((E[]) objArr);
            return this;
        }
    }

    /* renamed from: com.google.b.c.ab$b */
    static class C17532b<E> extends C17528a<E> {

        /* renamed from: a */
        private final C17530ab<E> f49181a;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final E mo33942a(int i) {
            return this.f49181a.get(i);
        }

        C17532b(C17530ab<E> abVar, int i) {
            super(abVar.size(), i);
            this.f49181a = abVar;
        }
    }

    /* renamed from: com.google.b.c.ab$c */
    static class C17533c<E> extends C17530ab<E> {

        /* renamed from: a */
        private final transient C17530ab<E> f49182a;

        public final C17530ab<E> reverse() {
            return this.f49182a;
        }

        public final /* bridge */ /* synthetic */ Iterator iterator() {
            return C17530ab.super.iterator();
        }

        public final /* bridge */ /* synthetic */ ListIterator listIterator() {
            return C17530ab.super.listIterator();
        }

        public final int size() {
            return this.f49182a.size();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo33977a() {
            return this.f49182a.mo33977a();
        }

        C17533c(C17530ab<E> abVar) {
            this.f49182a = abVar;
        }

        /* renamed from: a */
        private int m43079a(int i) {
            return (size() - 1) - i;
        }

        /* renamed from: b */
        private int m43080b(int i) {
            return size() - i;
        }

        public final boolean contains(Object obj) {
            return this.f49182a.contains(obj);
        }

        public final int indexOf(Object obj) {
            int lastIndexOf = this.f49182a.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return m43079a(lastIndexOf);
            }
            return -1;
        }

        public final int lastIndexOf(Object obj) {
            int indexOf = this.f49182a.indexOf(obj);
            if (indexOf >= 0) {
                return m43079a(indexOf);
            }
            return -1;
        }

        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return C17530ab.super.listIterator(i);
        }

        public final E get(int i) {
            C17421k.m42652a(i, size());
            return this.f49182a.get(m43079a(i));
        }

        public final C17530ab<E> subList(int i, int i2) {
            C17421k.m42658a(i, i2, size());
            return this.f49182a.subList(m43080b(i2), m43080b(i)).reverse();
        }
    }

    /* renamed from: com.google.b.c.ab$d */
    static class C17534d implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final Object[] f49183a;

        /* access modifiers changed from: 0000 */
        public final Object readResolve() {
            return C17530ab.copyOf((E[]) this.f49183a);
        }

        C17534d(Object[] objArr) {
            this.f49183a = objArr;
        }
    }

    /* renamed from: com.google.b.c.ab$e */
    class C17535e extends C17530ab<E> {

        /* renamed from: a */
        final transient int f49184a;

        /* renamed from: b */
        final transient int f49185b;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo33977a() {
            return true;
        }

        public final int size() {
            return this.f49185b;
        }

        public final /* bridge */ /* synthetic */ Iterator iterator() {
            return C17530ab.super.iterator();
        }

        public final /* bridge */ /* synthetic */ ListIterator listIterator() {
            return C17530ab.super.listIterator();
        }

        public final E get(int i) {
            C17421k.m42652a(i, this.f49185b);
            return C17530ab.this.get(i + this.f49184a);
        }

        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return C17530ab.super.listIterator(i);
        }

        public final C17530ab<E> subList(int i, int i2) {
            C17421k.m42658a(i, i2, this.f49185b);
            return C17530ab.this.subList(i + this.f49184a, i2 + this.f49184a);
        }

        C17535e(int i, int i2) {
            this.f49184a = i;
            this.f49185b = i2;
        }
    }

    C17530ab() {
    }

    /* renamed from: of */
    public static <E> C17530ab<E> m43056of() {
        return C17640bd.f49322a;
    }

    public final C17530ab<E> asList() {
        return this;
    }

    /* renamed from: of */
    public static <E> C17530ab<E> m43065of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
        return m43054b(e, e2, e3, e4, e5, e6, e7, e8, e9);
    }

    /* renamed from: of */
    public static <E> C17530ab<E> m43066of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
        return m43054b(e, e2, e3, e4, e5, e6, e7, e8, e9, e10);
    }

    /* renamed from: of */
    public static <E> C17530ab<E> m43067of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11) {
        return m43054b(e, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11);
    }

    @SafeVarargs
    /* renamed from: of */
    public static <E> C17530ab<E> m43068of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12, E... eArr) {
        E[] eArr2 = eArr;
        C17421k.m42660a(eArr2.length <= 2147483635, (Object) "the total number of elements must fit in an int");
        Object[] objArr = new Object[(eArr2.length + 12)];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        objArr[6] = e7;
        objArr[7] = e8;
        objArr[8] = e9;
        objArr[9] = e10;
        objArr[10] = e11;
        objArr[11] = e12;
        System.arraycopy(eArr2, 0, objArr, 12, eArr2.length);
        return m43054b(objArr);
    }

    public static <E> C17531a<E> builder() {
        return new C17531a<>();
    }

    public C17666bt<E> iterator() {
        return listIterator();
    }

    public C17667bu<E> listIterator() {
        return listIterator(0);
    }

    public C17530ab<E> reverse() {
        if (size() <= 1) {
            return this;
        }
        return new C17533c(this);
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new C17534d(toArray());
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < size(); i2++) {
            i = (((i * 31) + get(i2).hashCode()) ^ -1) ^ -1;
        }
        return i;
    }

    /* renamed from: a */
    static <E> C17530ab<E> m43053a(Object[] objArr) {
        return m43055b(objArr, objArr.length);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    private static <E> C17530ab<E> m43054b(Object... objArr) {
        return m43053a(C17632az.m43332a(objArr));
    }

    public static <E> C17531a<E> builderWithExpectedSize(int i) {
        C17698k.m43477a(i, "expectedSize");
        return new C17531a<>(i);
    }

    /* renamed from: of */
    public static <E> C17530ab<E> m43057of(E e) {
        return m43054b(e);
    }

    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    public static <E> C17530ab<E> copyOf(Iterable<? extends E> iterable) {
        C17421k.m42653a(iterable);
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    public static <E extends Comparable<? super E>> C17530ab<E> sortedCopyOf(Iterable<? extends E> iterable) {
        Comparable[] comparableArr = (Comparable[]) C17583ao.m43262b(iterable).toArray(new Comparable[0]);
        C17632az.m43332a((Object[]) comparableArr);
        Arrays.sort(comparableArr);
        return m43053a(comparableArr);
    }

    public C17667bu<E> listIterator(int i) {
        C17421k.m42666b(i, size());
        if (isEmpty()) {
            return f49180a;
        }
        return new C17532b(this, i);
    }

    public static <E> C17530ab<E> copyOf(Collection<? extends E> collection) {
        if (!(collection instanceof C17725z)) {
            return m43054b(collection.toArray());
        }
        C17530ab<E> asList = ((C17725z) collection).asList();
        if (asList.mo33977a()) {
            asList = m43053a(asList.toArray());
        }
        return asList;
    }

    public int indexOf(Object obj) {
        if (obj != null) {
            int size = size();
            int i = 0;
            if (obj == null) {
                while (i < size) {
                    if (get(i) == null) {
                        return i;
                    }
                    i++;
                }
            } else {
                while (i < size) {
                    if (obj.equals(get(i))) {
                        return i;
                    }
                    i++;
                }
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (obj != null) {
            if (obj == null) {
                for (int size = size() - 1; size >= 0; size--) {
                    if (get(size) == null) {
                        return size;
                    }
                }
            } else {
                for (int size2 = size() - 1; size2 >= 0; size2--) {
                    if (obj.equals(get(size2))) {
                        return size2;
                    }
                }
            }
        }
        return -1;
    }

    public static <E> C17530ab<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return m43056of();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return m43057of(next);
        }
        return new C17531a().mo33975b(next).mo33972a(it).mo33969a();
    }

    public boolean equals(Object obj) {
        if (obj == C17421k.m42653a(this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        if (C17417i.m42646a(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!C17417i.m42646a(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static <E> C17530ab<E> copyOf(E[] eArr) {
        if (eArr.length == 0) {
            return m43056of();
        }
        return m43054b((Object[]) eArr.clone());
    }

    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    static <E> C17530ab<E> m43055b(Object[] objArr, int i) {
        if (i == 0) {
            return m43056of();
        }
        return new C17640bd(objArr, i);
    }

    /* renamed from: of */
    public static <E> C17530ab<E> m43058of(E e, E e2) {
        return m43054b(e, e2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo33952a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public C17530ab<E> subList(int i, int i2) {
        C17421k.m42658a(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return m43056of();
        }
        return new C17535e(i, i3);
    }

    public static <E> C17530ab<E> sortedCopyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        C17421k.m42653a(comparator);
        Object[] a = C17583ao.m43260a(iterable);
        C17632az.m43332a(a);
        Arrays.sort(a, comparator);
        return m43053a(a);
    }

    /* renamed from: of */
    public static <E> C17530ab<E> m43059of(E e, E e2, E e3) {
        return m43054b(e, e2, e3);
    }

    /* renamed from: of */
    public static <E> C17530ab<E> m43060of(E e, E e2, E e3, E e4) {
        return m43054b(e, e2, e3, e4);
    }

    /* renamed from: of */
    public static <E> C17530ab<E> m43061of(E e, E e2, E e3, E e4, E e5) {
        return m43054b(e, e2, e3, e4, e5);
    }

    /* renamed from: of */
    public static <E> C17530ab<E> m43062of(E e, E e2, E e3, E e4, E e5, E e6) {
        return m43054b(e, e2, e3, e4, e5, e6);
    }

    /* renamed from: of */
    public static <E> C17530ab<E> m43063of(E e, E e2, E e3, E e4, E e5, E e6, E e7) {
        return m43054b(e, e2, e3, e4, e5, e6, e7);
    }

    /* renamed from: of */
    public static <E> C17530ab<E> m43064of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
        return m43054b(e, e2, e3, e4, e5, e6, e7, e8);
    }
}
