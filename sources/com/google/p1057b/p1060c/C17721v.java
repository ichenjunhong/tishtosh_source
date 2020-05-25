package com.google.p1057b.p1060c;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.b.c.v */
public abstract class C17721v<K, V> extends C17722w implements C17608at<K, V> {
    protected C17721v() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C17608at<K, V> delegate();

    public void clear() {
        delegate().clear();
    }

    public Map<K, Collection<V>> asMap() {
        return delegate().asMap();
    }

    public Collection<Entry<K, V>> entries() {
        return delegate().entries();
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Set<K> keySet() {
        return delegate().keySet();
    }

    public int size() {
        return delegate().size();
    }

    public boolean containsKey(Object obj) {
        return delegate().containsKey(obj);
    }

    public Collection<V> get(K k) {
        return delegate().get(k);
    }

    public Collection<V> removeAll(Object obj) {
        return delegate().removeAll(obj);
    }

    public boolean equals(Object obj) {
        if (obj == this || delegate().equals(obj)) {
            return true;
        }
        return false;
    }

    public boolean containsEntry(Object obj, Object obj2) {
        return delegate().containsEntry(obj, obj2);
    }

    public boolean put(K k, V v) {
        return delegate().put(k, v);
    }

    public boolean putAll(K k, Iterable<? extends V> iterable) {
        return delegate().putAll(k, iterable);
    }

    public boolean remove(Object obj, Object obj2) {
        return delegate().remove(obj, obj2);
    }
}
