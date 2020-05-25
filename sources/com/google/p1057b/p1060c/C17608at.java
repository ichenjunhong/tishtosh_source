package com.google.p1057b.p1060c;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.b.c.at */
public interface C17608at<K, V> {
    Map<K, Collection<V>> asMap();

    void clear();

    boolean containsEntry(Object obj, Object obj2);

    boolean containsKey(Object obj);

    Collection<Entry<K, V>> entries();

    boolean equals(Object obj);

    Collection<V> get(K k);

    int hashCode();

    boolean isEmpty();

    Set<K> keySet();

    boolean put(K k, V v);

    boolean putAll(K k, Iterable<? extends V> iterable);

    boolean remove(Object obj, Object obj2);

    Collection<V> removeAll(Object obj);

    int size();
}
