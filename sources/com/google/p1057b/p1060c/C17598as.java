package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17410f;
import com.google.p1057b.p1058a.C17417i;
import com.google.p1057b.p1058a.C17421k;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.b.c.as */
public final class C17598as {

    /* renamed from: com.google.b.c.as$a */
    enum C17601a implements C17410f<Entry<?, ?>, Object> {
        KEY {
            /* renamed from: a */
            public final /* synthetic */ Object mo33734a(Object obj) {
                return ((Entry) obj).getKey();
            }
        },
        VALUE {
            /* renamed from: a */
            public final /* synthetic */ Object mo33734a(Object obj) {
                return ((Entry) obj).getValue();
            }
        }
    }

    /* renamed from: com.google.b.c.as$b */
    static abstract class C17604b<K, V> extends C17659a<Entry<K, V>> {
        C17604b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract Map<K, V> mo34157a();

        public void clear() {
            mo34157a().clear();
        }

        public boolean isEmpty() {
            return mo34157a().isEmpty();
        }

        public int size() {
            return mo34157a().size();
        }

        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            return mo34157a().keySet().remove(((Entry) obj).getKey());
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) C17421k.m42653a(collection));
            } catch (UnsupportedOperationException unused) {
                return C17658bm.m43408a((Set<?>) this, collection.iterator());
            }
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            Object a = C17598as.m43282a(mo34157a(), key);
            if (!C17417i.m42646a(a, entry.getValue()) || (a == null && !mo34157a().containsKey(key))) {
                return false;
            }
            return true;
        }

        public boolean retainAll(Collection<?> collection) {
            int i;
            try {
                return super.retainAll((Collection) C17421k.m42653a(collection));
            } catch (UnsupportedOperationException unused) {
                int size = collection.size();
                if (size < 3) {
                    C17698k.m43477a(size, "expectedSize");
                    i = size + 1;
                } else if (size < 1073741824) {
                    i = (int) ((((float) size) / 0.75f) + 1.0f);
                } else {
                    i = Integer.MAX_VALUE;
                }
                HashSet hashSet = new HashSet(i);
                for (Object next : collection) {
                    if (contains(next)) {
                        hashSet.add(((Entry) next).getKey());
                    }
                }
                return mo34157a().keySet().retainAll(hashSet);
            }
        }
    }

    /* renamed from: com.google.b.c.as$c */
    static class C17605c<K, V> extends C17659a<K> {

        /* renamed from: d */
        final Map<K, V> f49282d;

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final Map<K, V> mo34165b() {
            return this.f49282d;
        }

        public void clear() {
            mo34165b().clear();
        }

        public boolean isEmpty() {
            return mo34165b().isEmpty();
        }

        public int size() {
            return mo34165b().size();
        }

        public Iterator<K> iterator() {
            return C17598as.m43283a(mo34165b().entrySet().iterator());
        }

        C17605c(Map<K, V> map) {
            this.f49282d = (Map) C17421k.m42653a(map);
        }

        public boolean contains(Object obj) {
            return mo34165b().containsKey(obj);
        }

        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            mo34165b().remove(obj);
            return true;
        }
    }

    /* renamed from: com.google.b.c.as$d */
    static class C17606d<K, V> extends AbstractCollection<V> {

        /* renamed from: a */
        public final Map<K, V> f49283a;

        public final void clear() {
            this.f49283a.clear();
        }

        public final boolean isEmpty() {
            return this.f49283a.isEmpty();
        }

        public final int size() {
            return this.f49283a.size();
        }

        public final Iterator<V> iterator() {
            return C17598as.m43286b(this.f49283a.entrySet().iterator());
        }

        public final boolean contains(Object obj) {
            return this.f49283a.containsValue(obj);
        }

        C17606d(Map<K, V> map) {
            this.f49283a = (Map) C17421k.m42653a(map);
        }

        public final boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Entry entry : this.f49283a.entrySet()) {
                    if (C17417i.m42646a(obj, entry.getValue())) {
                        this.f49283a.remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        public final boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) C17421k.m42653a(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet a = C17658bm.m43406a();
                for (Entry entry : this.f49283a.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        a.add(entry.getKey());
                    }
                }
                return this.f49283a.keySet().removeAll(a);
            }
        }

        public final boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) C17421k.m42653a(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet a = C17658bm.m43406a();
                for (Entry entry : this.f49283a.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        a.add(entry.getKey());
                    }
                }
                return this.f49283a.keySet().retainAll(a);
            }
        }
    }

    /* renamed from: com.google.b.c.as$e */
    static abstract class C17607e<K, V> extends AbstractMap<K, V> {

        /* renamed from: a */
        private transient Set<Entry<K, V>> f49284a;

        /* renamed from: b */
        private transient Set<K> f49285b;

        /* renamed from: c */
        private transient Collection<V> f49286c;

        C17607e() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract Set<Entry<K, V>> mo34180a();

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public Set<K> mo34181e() {
            return new C17605c(this);
        }

        public Set<Entry<K, V>> entrySet() {
            Set<Entry<K, V>> set = this.f49284a;
            if (set != null) {
                return set;
            }
            Set<Entry<K, V>> a = mo34180a();
            this.f49284a = a;
            return a;
        }

        public Set<K> keySet() {
            Set<K> set = this.f49285b;
            if (set != null) {
                return set;
            }
            Set<K> e = mo34181e();
            this.f49285b = e;
            return e;
        }

        public Collection<V> values() {
            Collection<V> collection = this.f49286c;
            if (collection != null) {
                return collection;
            }
            C17606d dVar = new C17606d(this);
            this.f49286c = dVar;
            return dVar;
        }
    }

    /* renamed from: a */
    static <K> C17410f<Entry<K, ?>, K> m43281a() {
        return C17601a.KEY;
    }

    /* renamed from: b */
    static <V> C17410f<Entry<?, V>, V> m43285b() {
        return C17601a.VALUE;
    }

    /* renamed from: c */
    public static <K, V> HashMap<K, V> m43289c() {
        return new HashMap<>();
    }

    /* renamed from: a */
    static <K, V> Iterator<K> m43283a(Iterator<Entry<K, V>> it) {
        return new C17663bq<Entry<K, V>, K>(it) {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ Object mo34141a(Object obj) {
                return ((Entry) obj).getKey();
            }
        };
    }

    /* renamed from: b */
    static <K, V> Iterator<V> m43286b(Iterator<Entry<K, V>> it) {
        return new C17663bq<Entry<K, V>, V>(it) {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ Object mo34141a(Object obj) {
                return ((Entry) obj).getValue();
            }
        };
    }

    /* renamed from: a */
    static <V> V m43282a(Map<?, V> map, Object obj) {
        C17421k.m42653a(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: b */
    static boolean m43287b(Map<?, ?> map, Object obj) {
        C17421k.m42653a(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: c */
    static <V> V m43288c(Map<?, V> map, Object obj) {
        C17421k.m42653a(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static <K, V> Entry<K, V> m43284a(K k, V v) {
        return new C17529aa(k, v);
    }
}
