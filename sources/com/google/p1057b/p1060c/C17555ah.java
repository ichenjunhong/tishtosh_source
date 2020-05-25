package com.google.p1057b.p1060c;

import com.google.p1057b.p1060c.C17624aw.C17625a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.b.c.ah */
public abstract class C17555ah<K, V> extends C17689g<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    final transient C17538ad<K, ? extends C17725z<V>> f49216b;

    /* renamed from: c */
    final transient int f49217c;

    /* renamed from: com.google.b.c.ah$a */
    public static class C17558a<K, V> {

        /* renamed from: a */
        Map<K, Collection<V>> f49225a = new C17702m();

        /* renamed from: b */
        Comparator<? super K> f49226b;

        /* renamed from: c */
        Comparator<? super V> f49227c;

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public Collection<V> mo34072c() {
            return new ArrayList();
        }

        /* renamed from: b */
        public C17555ah<K, V> mo33993b() {
            Collection entrySet = this.f49225a.entrySet();
            if (this.f49226b != null) {
                entrySet = C17638bb.m43358a(this.f49226b).mo34235c().mo34234b(entrySet);
            }
            return C17536ac.m43083a(entrySet, this.f49227c);
        }

        /* renamed from: a */
        public C17558a<K, V> mo33990a(Entry<? extends K, ? extends V> entry) {
            return mo33992b(entry.getKey(), entry.getValue());
        }

        /* renamed from: b */
        public C17558a<K, V> mo33991b(Iterable<? extends Entry<? extends K, ? extends V>> iterable) {
            for (Entry a : iterable) {
                mo33990a(a);
            }
            return this;
        }

        /* renamed from: b */
        public C17558a<K, V> mo33992b(K k, V v) {
            C17698k.m43478a((Object) k, (Object) v);
            Collection collection = (Collection) this.f49225a.get(k);
            if (collection == null) {
                Map<K, Collection<V>> map = this.f49225a;
                Collection c = mo34072c();
                map.put(k, c);
                collection = c;
            }
            collection.add(v);
            return this;
        }
    }

    /* renamed from: com.google.b.c.ah$b */
    static class C17559b<K, V> extends C17725z<Entry<K, V>> {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final C17555ah<K, V> f49228a;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo33977a() {
            return this.f49228a.mo34040a();
        }

        public final C17666bt<Entry<K, V>> iterator() {
            return this.f49228a.mo34056i();
        }

        public final int size() {
            return this.f49228a.size();
        }

        C17559b(C17555ah<K, V> ahVar) {
            this.f49228a = ahVar;
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return this.f49228a.containsEntry(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: com.google.b.c.ah$c */
    static class C17560c {

        /* renamed from: a */
        static final C17656a<C17555ah> f49229a = C17654bk.m43401a(C17555ah.class, "map");

        /* renamed from: b */
        static final C17656a<C17555ah> f49230b = C17654bk.m43401a(C17555ah.class, "size");
    }

    /* renamed from: com.google.b.c.ah$d */
    class C17561d extends C17564ai<K> {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo33977a() {
            return true;
        }

        public final C17570ak<K> elementSet() {
            return C17555ah.this.keySet();
        }

        public final int size() {
            return C17555ah.this.size();
        }

        /* access modifiers changed from: 0000 */
        public final Object writeReplace() {
            return new C17562e(C17555ah.this);
        }

        C17561d() {
        }

        public final boolean contains(Object obj) {
            return C17555ah.this.containsKey(obj);
        }

        /* renamed from: a */
        public final int mo34074a(Object obj) {
            Collection collection = (Collection) C17555ah.this.f49216b.get(obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C17625a<K> mo34075a(int i) {
            Entry entry = (Entry) C17555ah.this.f49216b.entrySet().asList().get(i);
            return new C17630d(entry.getKey(), ((Collection) entry.getValue()).size());
        }
    }

    /* renamed from: com.google.b.c.ah$e */
    static final class C17562e implements Serializable {

        /* renamed from: a */
        final C17555ah<?, ?> f49232a;

        /* access modifiers changed from: 0000 */
        public final Object readResolve() {
            return this.f49232a.keys();
        }

        C17562e(C17555ah<?, ?> ahVar) {
            this.f49232a = ahVar;
        }
    }

    /* renamed from: com.google.b.c.ah$f */
    static final class C17563f<K, V> extends C17725z<V> {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final transient C17555ah<K, V> f49233a;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo33977a() {
            return true;
        }

        public final C17666bt<V> iterator() {
            return this.f49233a.mo34052f();
        }

        public final int size() {
            return this.f49233a.size();
        }

        C17563f(C17555ah<K, V> ahVar) {
            this.f49233a = ahVar;
        }

        public final boolean contains(Object obj) {
            return this.f49233a.containsValue(obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo33952a(Object[] objArr, int i) {
            C17666bt it = this.f49233a.f49216b.values().iterator();
            while (it.hasNext()) {
                i = ((C17725z) it.next()).mo33952a(objArr, i);
            }
            return i;
        }
    }

    public C17538ad<K, Collection<V>> asMap() {
        return this.f49216b;
    }

    public abstract C17725z<V> get(K k);

    public abstract C17555ah<V, K> inverse();

    public int size() {
        return this.f49217c;
    }

    public static <K, V> C17558a<K, V> builder() {
        return new C17558a<>();
    }

    /* renamed from: of */
    public static <K, V> C17555ah<K, V> m43130of() {
        return C17536ac.m43084of();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo34040a() {
        return this.f49216b.mo34001d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C17666bt<Entry<K, V>> mo34056i() {
        return new C17666bt<Entry<K, V>>() {

            /* renamed from: a */
            final Iterator<? extends Entry<K, ? extends C17725z<V>>> f49218a = C17555ah.this.f49216b.entrySet().iterator();

            /* renamed from: b */
            K f49219b = null;

            /* renamed from: c */
            Iterator<V> f49220c = C17586ap.m43263a();

            public final boolean hasNext() {
                if (this.f49220c.hasNext() || this.f49218a.hasNext()) {
                    return true;
                }
                return false;
            }

            public final /* synthetic */ Object next() {
                if (!this.f49220c.hasNext()) {
                    Entry entry = (Entry) this.f49218a.next();
                    this.f49219b = entry.getKey();
                    this.f49220c = ((C17725z) entry.getValue()).iterator();
                }
                return C17598as.m43284a(this.f49219b, this.f49220c.next());
            }
        };
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final C17666bt<V> mo34052f() {
        return new C17666bt<V>() {

            /* renamed from: a */
            Iterator<? extends C17725z<V>> f49222a = C17555ah.this.f49216b.values().iterator();

            /* renamed from: b */
            Iterator<V> f49223b = C17586ap.m43263a();

            public final boolean hasNext() {
                if (this.f49223b.hasNext() || this.f49222a.hasNext()) {
                    return true;
                }
                return false;
            }

            public final V next() {
                if (!this.f49223b.hasNext()) {
                    this.f49223b = ((C17725z) this.f49222a.next()).iterator();
                }
                return this.f49223b.next();
            }
        };
    }

    public void clear() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final Set<K> mo34048d() {
        throw new AssertionError("unreachable");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ Collection mo34049e() {
        return new C17563f(this);
    }

    public C17725z<Entry<K, V>> entries() {
        return (C17725z) super.entries();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ C17624aw mo34053g() {
        return new C17561d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ Collection mo34054h() {
        return new C17559b(this);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final Map<K, Collection<V>> mo34058j() {
        throw new AssertionError("should never be called");
    }

    public C17570ak<K> keySet() {
        return this.f49216b.keySet();
    }

    public C17564ai<K> keys() {
        return (C17564ai) super.keys();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public C17725z<V> values() {
        return (C17725z) super.values();
    }

    public static <K, V> C17555ah<K, V> copyOf(Iterable<? extends Entry<? extends K, ? extends V>> iterable) {
        return C17536ac.copyOf(iterable);
    }

    public boolean containsKey(Object obj) {
        return this.f49216b.containsKey(obj);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public boolean putAll(C17608at<? extends K, ? extends V> atVar) {
        throw new UnsupportedOperationException();
    }

    public C17725z<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean containsValue(Object obj) {
        if (obj == null || !super.containsValue(obj)) {
            return false;
        }
        return true;
    }

    public static <K, V> C17555ah<K, V> copyOf(C17608at<? extends K, ? extends V> atVar) {
        if (atVar instanceof C17555ah) {
            C17555ah<K, V> ahVar = (C17555ah) atVar;
            if (!ahVar.mo34040a()) {
                return ahVar;
            }
        }
        return C17536ac.copyOf(atVar);
    }

    C17555ah(C17538ad<K, ? extends C17725z<V>> adVar, int i) {
        this.f49216b = adVar;
        this.f49217c = i;
    }

    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    public boolean put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public C17725z<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: of */
    public static <K, V> C17555ah<K, V> m43131of(K k, V v) {
        return C17536ac.m43085of(k, v);
    }

    public boolean putAll(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: of */
    public static <K, V> C17555ah<K, V> m43132of(K k, V v, K k2, V v2) {
        return C17536ac.m43086of(k, v, k2, v2);
    }

    /* renamed from: of */
    public static <K, V> C17555ah<K, V> m43133of(K k, V v, K k2, V v2, K k3, V v3) {
        return C17536ac.m43087of(k, v, k2, v2, k3, v3);
    }

    /* renamed from: of */
    public static <K, V> C17555ah<K, V> m43134of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        return C17536ac.m43088of(k, v, k2, v2, k3, v3, k4, v4);
    }

    /* renamed from: of */
    public static <K, V> C17555ah<K, V> m43135of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return C17536ac.m43089of(k, v, k2, v2, k3, v3, k4, v4, k5, v5);
    }
}
