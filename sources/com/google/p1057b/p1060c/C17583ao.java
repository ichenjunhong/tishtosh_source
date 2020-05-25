package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17418j;
import com.google.p1057b.p1058a.C17421k;
import com.google.p1057b.p1058a.C17422l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.b.c.ao */
public final class C17583ao {
    /* renamed from: b */
    static <E> Collection<E> m43262b(Iterable<E> iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return C17593ar.m43276a(iterable.iterator());
    }

    /* renamed from: a */
    static Object[] m43260a(Iterable<?> iterable) {
        return m43262b(iterable).toArray();
    }

    /* renamed from: a */
    public static <T> Iterable<T> m43256a(final Iterable<T> iterable, final C17422l<? super T> lVar) {
        C17421k.m42653a(iterable);
        C17421k.m42653a(lVar);
        return new C17717s<T>() {
            public final Iterator<T> iterator() {
                return C17586ap.m43264a(iterable.iterator(), lVar);
            }
        };
    }

    /* renamed from: a */
    public static <T> T m43257a(Iterable<? extends T> iterable, T t) {
        return C17586ap.m43266a(iterable.iterator(), null);
    }

    /* renamed from: b */
    public static <T> C17418j<T> m43261b(Iterable<T> iterable, C17422l<? super T> lVar) {
        Iterator it = iterable.iterator();
        C17421k.m42653a(it);
        C17421k.m42653a(lVar);
        while (it.hasNext()) {
            Object next = it.next();
            if (lVar.apply(next)) {
                return C17418j.m42647of(next);
            }
        }
        return C17418j.absent();
    }

    /* renamed from: a */
    static <T> boolean m43259a(List<T> list, C17422l<? super T> lVar) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!lVar.apply(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (UnsupportedOperationException unused) {
                        m43258a(list, lVar, i2, i);
                        return true;
                    } catch (IllegalArgumentException unused2) {
                        m43258a(list, lVar, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        if (i != i2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static <T> void m43258a(List<T> list, C17422l<? super T> lVar, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (lVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }
}
