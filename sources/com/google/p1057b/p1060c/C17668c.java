package com.google.p1057b.p1060c;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.b.c.c */
abstract class C17668c<K, V> extends C17669d<K, V> implements C17592aq<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract List<V> mo34190b();

    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ Collection mo34272c() {
        return Collections.emptyList();
    }

    protected C17668c(Map<K, Collection<V>> map) {
        super(map);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <E> Collection<E> mo34271a(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    public List<V> get(K k) {
        return (List) super.get(k);
    }

    public List<V> removeAll(Object obj) {
        return (List) super.removeAll(obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Collection<V> mo34270a(K k, Collection<V> collection) {
        return mo34273a(k, (List) collection, null);
    }

    public boolean put(K k, V v) {
        return super.put(k, v);
    }

    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return (List) super.replaceValues(obj, iterable);
    }
}
