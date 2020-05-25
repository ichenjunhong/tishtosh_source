package com.bytedance.common.utility.p522b;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.common.utility.b.d */
public final class C9378d<E> extends AbstractSet<E> {

    /* renamed from: a */
    private final Map<E, Boolean> f25607a;

    /* renamed from: b */
    private transient Set<E> f25608b;

    public final void clear() {
        this.f25607a.clear();
    }

    public final int hashCode() {
        return this.f25608b.hashCode();
    }

    public final boolean isEmpty() {
        return this.f25607a.isEmpty();
    }

    public final Iterator<E> iterator() {
        return this.f25608b.iterator();
    }

    public final int size() {
        return this.f25607a.size();
    }

    public final Object[] toArray() {
        return this.f25608b.toArray();
    }

    public final String toString() {
        return this.f25608b.toString();
    }

    public final boolean contains(Object obj) {
        return this.f25608b.contains(obj);
    }

    public final boolean containsAll(Collection<?> collection) {
        return this.f25608b.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        return this.f25608b.equals(obj);
    }

    public final boolean retainAll(Collection<?> collection) {
        return this.f25608b.retainAll(collection);
    }

    public C9378d(Map<E, Boolean> map) {
        this.f25607a = map;
        this.f25608b = map.keySet();
    }

    public final boolean add(E e) {
        if (this.f25607a.put(e, Boolean.TRUE) == null) {
            return true;
        }
        return false;
    }

    public final boolean remove(Object obj) {
        if (this.f25607a.remove(obj) != null) {
            return true;
        }
        return false;
    }

    public final <T> T[] toArray(T[] tArr) {
        return this.f25608b.toArray(tArr);
    }
}
