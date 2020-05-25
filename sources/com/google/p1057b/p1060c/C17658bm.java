package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17421k;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.b.c.bm */
public final class C17658bm {

    /* renamed from: com.google.b.c.bm$a */
    static abstract class C17659a<E> extends AbstractSet<E> {
        C17659a() {
        }

        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) C17421k.m42653a(collection));
        }

        public boolean removeAll(Collection<?> collection) {
            C17421k.m42653a(collection);
            if (collection instanceof C17624aw) {
                collection = ((C17624aw) collection).elementSet();
            }
            if (!(collection instanceof Set) || collection.size() <= size()) {
                return C17658bm.m43408a((Set<?>) this, collection.iterator());
            }
            Iterator it = iterator();
            C17421k.m42653a(collection);
            boolean z = false;
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
    }

    /* renamed from: a */
    public static <E> HashSet<E> m43406a() {
        return new HashSet<>();
    }

    /* renamed from: b */
    public static <E> Set<E> m43409b() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    /* renamed from: a */
    static int m43405a(Set<?> set) {
        int i;
        int i2 = 0;
        for (Object next : set) {
            if (next != null) {
                i = next.hashCode();
            } else {
                i = 0;
            }
            i2 = ((i2 + i) ^ -1) ^ -1;
        }
        return i2;
    }

    /* renamed from: a */
    static boolean m43407a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() != set2.size() || !set.containsAll(set2)) {
                return false;
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: a */
    static boolean m43408a(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
