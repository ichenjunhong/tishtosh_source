package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17421k;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.b.c.g */
abstract class C17689g<K, V> implements C17608at<K, V> {

    /* renamed from: a */
    private transient Collection<Entry<K, V>> f49396a;

    /* renamed from: b */
    private transient Set<K> f49397b;

    /* renamed from: c */
    private transient C17624aw<K> f49398c;

    /* renamed from: d */
    private transient Collection<V> f49399d;

    /* renamed from: e */
    private transient Map<K, Collection<V>> f49400e;

    /* renamed from: com.google.b.c.g$a */
    class C17690a extends C17620b<K, V> {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C17608at<K, V> mo34191a() {
            return C17689g.this;
        }

        public Iterator<Entry<K, V>> iterator() {
            return C17689g.this.mo34056i();
        }

        C17690a() {
        }
    }

    /* renamed from: com.google.b.c.g$b */
    class C17691b extends C17690a implements Set<Entry<K, V>> {
        public final int hashCode() {
            return C17658bm.m43405a(this);
        }

        C17691b() {
            super();
        }

        public final boolean equals(Object obj) {
            return C17658bm.m43407a((Set<?>) this, obj);
        }
    }

    /* renamed from: com.google.b.c.g$c */
    class C17692c extends AbstractCollection<V> {
        public final void clear() {
            C17689g.this.clear();
        }

        public final Iterator<V> iterator() {
            return C17689g.this.mo34052f();
        }

        public final int size() {
            return C17689g.this.size();
        }

        C17692c() {
        }

        public final boolean contains(Object obj) {
            return C17689g.this.containsValue(obj);
        }
    }

    C17689g() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public abstract Set<K> mo34048d();

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public abstract Collection<V> mo34049e();

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public abstract C17624aw<K> mo34053g();

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public abstract Collection<Entry<K, V>> mo34054h();

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public abstract Iterator<Entry<K, V>> mo34056i();

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public abstract Map<K, Collection<V>> mo34058j();

    public Map<K, Collection<V>> asMap() {
        Map<K, Collection<V>> map = this.f49400e;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> j = mo34058j();
        this.f49400e = j;
        return j;
    }

    public Collection<Entry<K, V>> entries() {
        Collection<Entry<K, V>> collection = this.f49396a;
        if (collection != null) {
            return collection;
        }
        Collection<Entry<K, V>> h = mo34054h();
        this.f49396a = h;
        return h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public Iterator<V> mo34052f() {
        return C17598as.m43286b(entries().iterator());
    }

    public int hashCode() {
        return asMap().hashCode();
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public Set<K> keySet() {
        Set<K> set = this.f49397b;
        if (set != null) {
            return set;
        }
        Set<K> d = mo34048d();
        this.f49397b = d;
        return d;
    }

    public C17624aw<K> keys() {
        C17624aw<K> awVar = this.f49398c;
        if (awVar != null) {
            return awVar;
        }
        C17624aw<K> g = mo34053g();
        this.f49398c = g;
        return g;
    }

    public String toString() {
        return asMap().toString();
    }

    public Collection<V> values() {
        Collection<V> collection = this.f49399d;
        if (collection != null) {
            return collection;
        }
        Collection<V> e = mo34049e();
        this.f49399d = e;
        return e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17608at)) {
            return false;
        }
        return asMap().equals(((C17608at) obj).asMap());
    }

    public boolean containsValue(Object obj) {
        for (Collection contains : asMap().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean putAll(C17608at<? extends K, ? extends V> atVar) {
        boolean z = false;
        for (Entry entry : atVar.entries()) {
            z |= put(entry.getKey(), entry.getValue());
        }
        return z;
    }

    public boolean put(K k, V v) {
        return get(k).add(v);
    }

    public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        C17421k.m42653a(iterable);
        Collection<V> removeAll = removeAll(k);
        putAll(k, iterable);
        return removeAll;
    }

    public boolean containsEntry(Object obj, Object obj2) {
        Collection collection = (Collection) asMap().get(obj);
        if (collection == null || !collection.contains(obj2)) {
            return false;
        }
        return true;
    }

    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) asMap().get(obj);
        if (collection == null || !collection.remove(obj2)) {
            return false;
        }
        return true;
    }

    public boolean putAll(K k, Iterable<? extends V> iterable) {
        C17421k.m42653a(iterable);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty() || !get(k).addAll(collection)) {
                return false;
            }
            return true;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext() || !C17586ap.m43268a(get(k), it)) {
            return false;
        }
        return true;
    }
}
