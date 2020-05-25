package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17410f;
import com.google.p1057b.p1058a.C17421k;
import com.google.p1057b.p1063f.C17743a;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.b.c.ar */
public final class C17593ar {

    /* renamed from: com.google.b.c.ar$a */
    static class C17594a<F, T> extends AbstractList<T> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final List<F> f49273a;

        /* renamed from: b */
        final C17410f<? super F, ? extends T> f49274b;

        public final void clear() {
            this.f49273a.clear();
        }

        public final boolean isEmpty() {
            return this.f49273a.isEmpty();
        }

        public final Iterator<T> iterator() {
            return listIterator();
        }

        public final int size() {
            return this.f49273a.size();
        }

        public final T get(int i) {
            return this.f49274b.mo33734a(this.f49273a.get(i));
        }

        public final ListIterator<T> listIterator(int i) {
            return new C17664br<F, T>(this.f49273a.listIterator(i)) {
                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final T mo34141a(F f) {
                    return C17594a.this.f49274b.mo33734a(f);
                }
            };
        }

        public final T remove(int i) {
            return this.f49274b.mo33734a(this.f49273a.remove(i));
        }

        C17594a(List<F> list, C17410f<? super F, ? extends T> fVar) {
            this.f49273a = (List) C17421k.m42653a(list);
            this.f49274b = (C17410f) C17421k.m42653a(fVar);
        }
    }

    /* renamed from: com.google.b.c.ar$b */
    static class C17596b<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final List<F> f49276a;

        /* renamed from: b */
        final C17410f<? super F, ? extends T> f49277b;

        public final void clear() {
            this.f49276a.clear();
        }

        public final int size() {
            return this.f49276a.size();
        }

        public final ListIterator<T> listIterator(int i) {
            return new C17664br<F, T>(this.f49276a.listIterator(i)) {
                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final T mo34141a(F f) {
                    return C17596b.this.f49277b.mo33734a(f);
                }
            };
        }

        C17596b(List<F> list, C17410f<? super F, ? extends T> fVar) {
            this.f49276a = (List) C17421k.m42653a(list);
            this.f49277b = (C17410f) C17421k.m42653a(fVar);
        }
    }

    /* renamed from: a */
    private static <E> ArrayList<E> m43274a() {
        return new ArrayList<>();
    }

    /* renamed from: a */
    public static <E> ArrayList<E> m43276a(Iterator<? extends E> it) {
        ArrayList<E> a = m43274a();
        C17586ap.m43268a((Collection<T>) a, it);
        return a;
    }

    /* renamed from: a */
    public static <E> ArrayList<E> m43275a(Iterable<? extends E> iterable) {
        C17421k.m42653a(iterable);
        if (iterable instanceof Collection) {
            return new ArrayList<>((Collection) iterable);
        }
        return m43276a(iterable.iterator());
    }

    @SafeVarargs
    /* renamed from: a */
    public static <E> ArrayList<E> m43277a(E... eArr) {
        C17421k.m42653a(eArr);
        int length = eArr.length;
        C17698k.m43477a(length, "arraySize");
        ArrayList<E> arrayList = new ArrayList<>(C17743a.m43560a(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    /* renamed from: a */
    public static <F, T> List<T> m43278a(List<F> list, C17410f<? super F, ? extends T> fVar) {
        if (list instanceof RandomAccess) {
            return new C17594a(list, fVar);
        }
        return new C17596b(list, fVar);
    }
}
