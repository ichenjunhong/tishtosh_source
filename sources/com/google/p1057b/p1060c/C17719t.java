package com.google.p1057b.p1060c;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.b.c.t */
public abstract class C17719t<E> extends C17722w implements Collection<E> {
    protected C17719t() {
    }

    /* access modifiers changed from: protected */
    public abstract Collection<E> delegate();

    public void clear() {
        delegate().clear();
    }

    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Iterator<E> iterator() {
        return delegate().iterator();
    }

    public int size() {
        return delegate().size();
    }

    public Object[] toArray() {
        return delegate().toArray();
    }

    public boolean add(E e) {
        return delegate().add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        return delegate().addAll(collection);
    }

    public boolean contains(Object obj) {
        return delegate().contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return delegate().containsAll(collection);
    }

    public boolean remove(Object obj) {
        return delegate().remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        return delegate().removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return delegate().retainAll(collection);
    }

    public <T> T[] toArray(T[] tArr) {
        return delegate().toArray(tArr);
    }
}
