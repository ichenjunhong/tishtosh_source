package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17410f;
import com.google.p1057b.p1058a.C17421k;
import com.google.p1057b.p1058a.C17422l;
import com.google.p1057b.p1058a.C17423m.C17425a;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.b.c.l */
public final class C17699l {

    /* renamed from: com.google.b.c.l$a */
    static class C17700a<E> extends AbstractCollection<E> {

        /* renamed from: a */
        final Collection<E> f49411a;

        /* renamed from: b */
        final C17422l<? super E> f49412b;

        public final Iterator<E> iterator() {
            return C17586ap.m43264a(this.f49411a.iterator(), this.f49412b);
        }

        public final Object[] toArray() {
            return C17593ar.m43276a(iterator()).toArray();
        }

        public final int size() {
            int i = 0;
            for (E apply : this.f49411a) {
                if (this.f49412b.apply(apply)) {
                    i++;
                }
            }
            return i;
        }

        public final void clear() {
            Collection<E> collection = this.f49411a;
            C17422l<? super E> lVar = this.f49412b;
            if (!(collection instanceof RandomAccess) || !(collection instanceof List)) {
                Iterator it = collection.iterator();
                C17421k.m42653a(lVar);
                while (it.hasNext()) {
                    if (lVar.apply(it.next())) {
                        it.remove();
                    }
                }
                return;
            }
            C17583ao.m43259a((List) collection, (C17422l) C17421k.m42653a(lVar));
        }

        public final boolean isEmpty() {
            boolean z;
            Collection<E> collection = this.f49411a;
            C17422l<? super E> lVar = this.f49412b;
            Iterator it = collection.iterator();
            C17421k.m42654a(lVar, (Object) "predicate");
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (lVar.apply(it.next())) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
            return false;
        }

        public final boolean add(E e) {
            C17421k.m42659a(this.f49412b.apply(e));
            return this.f49411a.add(e);
        }

        public final boolean addAll(Collection<? extends E> collection) {
            for (Object apply : collection) {
                C17421k.m42659a(this.f49412b.apply(apply));
            }
            return this.f49411a.addAll(collection);
        }

        public final boolean contains(Object obj) {
            if (C17699l.m43483a(this.f49411a, obj)) {
                return this.f49412b.apply(obj);
            }
            return false;
        }

        public final boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean remove(Object obj) {
            if (!contains(obj) || !this.f49411a.remove(obj)) {
                return false;
            }
            return true;
        }

        public final <T> T[] toArray(T[] tArr) {
            return C17593ar.m43276a(iterator()).toArray(tArr);
        }

        public final boolean removeAll(Collection<?> collection) {
            Iterator it = this.f49411a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (this.f49412b.apply(next) && collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        public final boolean retainAll(Collection<?> collection) {
            Iterator it = this.f49411a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (this.f49412b.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        C17700a(Collection<E> collection, C17422l<? super E> lVar) {
            this.f49411a = collection;
            this.f49412b = lVar;
        }
    }

    /* renamed from: com.google.b.c.l$b */
    static class C17701b<F, T> extends AbstractCollection<T> {

        /* renamed from: a */
        final Collection<F> f49413a;

        /* renamed from: b */
        final C17410f<? super F, ? extends T> f49414b;

        public final void clear() {
            this.f49413a.clear();
        }

        public final boolean isEmpty() {
            return this.f49413a.isEmpty();
        }

        public final int size() {
            return this.f49413a.size();
        }

        public final Iterator<T> iterator() {
            return C17586ap.m43267a(this.f49413a.iterator(), this.f49414b);
        }

        C17701b(Collection<F> collection, C17410f<? super F, ? extends T> fVar) {
            this.f49413a = (Collection) C17421k.m42653a(collection);
            this.f49414b = (C17410f) C17421k.m42653a(fVar);
        }
    }

    /* renamed from: a */
    public static <F, T> Collection<T> m43481a(Collection<F> collection, C17410f<? super F, T> fVar) {
        return new C17701b(collection, fVar);
    }

    /* renamed from: a */
    static boolean m43483a(Collection<?> collection, Object obj) {
        C17421k.m42653a(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static <E> Collection<E> m43482a(Collection<E> collection, C17422l<? super E> lVar) {
        if (!(collection instanceof C17700a)) {
            return new C17700a((Collection) C17421k.m42653a(collection), (C17422l) C17421k.m42653a(lVar));
        }
        C17700a aVar = (C17700a) collection;
        return new C17700a(aVar.f49411a, new C17425a(Arrays.asList(new C17422l[]{(C17422l) C17421k.m42653a(aVar.f49412b), (C17422l) C17421k.m42653a(lVar)})));
    }
}
