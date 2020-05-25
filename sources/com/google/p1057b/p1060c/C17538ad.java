package com.google.p1057b.p1060c;

import com.google.p1057b.p1060c.C17725z.C17727b;
import com.p683ss.android.ugc.aweme.settings2.ShowStorageDotSizeSettings;
import java.io.Serializable;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: com.google.b.c.ad */
public abstract class C17538ad<K, V> implements Serializable, Map<K, V> {

    /* renamed from: a */
    static final Entry<?, ?>[] f49188a = new Entry[0];

    /* renamed from: b */
    private transient C17570ak<Entry<K, V>> f49189b;

    /* renamed from: c */
    private transient C17570ak<K> f49190c;

    /* renamed from: d */
    private transient C17725z<V> f49191d;

    /* renamed from: e */
    private transient C17575al<K, V> f49192e;

    /* renamed from: com.google.b.c.ad$a */
    public static class C17540a<K, V> {

        /* renamed from: a */
        Comparator<? super V> f49195a;

        /* renamed from: b */
        Object[] f49196b;

        /* renamed from: c */
        int f49197c;

        /* renamed from: d */
        boolean f49198d;

        public C17540a() {
            this(4);
        }

        /* renamed from: b */
        private void m43110b() {
            if (this.f49195a != null) {
                if (this.f49198d) {
                    this.f49196b = Arrays.copyOf(this.f49196b, this.f49197c * 2);
                }
                Entry[] entryArr = new Entry[this.f49197c];
                for (int i = 0; i < this.f49197c; i++) {
                    int i2 = i * 2;
                    entryArr[i] = new SimpleImmutableEntry(this.f49196b[i2], this.f49196b[i2 + 1]);
                }
                Arrays.sort(entryArr, 0, this.f49197c, C17638bb.m43358a(this.f49195a).mo34232a(C17598as.m43285b()));
                for (int i3 = 0; i3 < this.f49197c; i3++) {
                    int i4 = i3 * 2;
                    this.f49196b[i4] = entryArr[i3].getKey();
                    this.f49196b[i4 + 1] = entryArr[i3].getValue();
                }
            }
        }

        /* renamed from: a */
        public final C17538ad<K, V> mo34020a() {
            m43110b();
            this.f49198d = true;
            return C17641be.m43368a(this.f49197c, this.f49196b);
        }

        C17540a(int i) {
            this.f49196b = new Object[(i * 2)];
        }

        /* renamed from: a */
        private C17540a<K, V> m43108a(Entry<? extends K, ? extends V> entry) {
            return mo34019a(entry.getKey(), entry.getValue());
        }

        /* renamed from: a */
        private void m43109a(int i) {
            int i2 = i * 2;
            if (i2 > this.f49196b.length) {
                this.f49196b = Arrays.copyOf(this.f49196b, C17727b.m43545a(this.f49196b.length, i2));
                this.f49198d = false;
            }
        }

        /* renamed from: a */
        public final C17540a<K, V> mo34018a(Iterable<? extends Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                m43109a(this.f49197c + ((Collection) iterable).size());
            }
            for (Entry a : iterable) {
                m43108a(a);
            }
            return this;
        }

        /* renamed from: a */
        public final C17540a<K, V> mo34019a(K k, V v) {
            m43109a(this.f49197c + 1);
            C17698k.m43478a((Object) k, (Object) v);
            this.f49196b[this.f49197c * 2] = k;
            this.f49196b[(this.f49197c * 2) + 1] = v;
            this.f49197c++;
            return this;
        }
    }

    /* renamed from: com.google.b.c.ad$b */
    static abstract class C17541b<K, V> extends C17538ad<K, V> {

        /* renamed from: com.google.b.c.ad$b$a */
        class C17542a extends C17547ae<K, V> {
            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final C17538ad<K, V> mo34022b() {
                return C17541b.this;
            }

            public final C17666bt<Entry<K, V>> iterator() {
                return C17541b.this.mo34021f();
            }

            C17542a() {
            }
        }

        C17541b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public abstract C17666bt<Entry<K, V>> mo34021f();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C17570ak<Entry<K, V>> mo33994a() {
            return new C17542a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C17570ak<K> mo33996b() {
            return new C17549af(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final C17725z<V> mo33997c() {
            return new C17551ag(this);
        }

        public /* bridge */ /* synthetic */ Set entrySet() {
            return C17538ad.super.entrySet();
        }

        public /* bridge */ /* synthetic */ Set keySet() {
            return C17538ad.super.keySet();
        }

        public /* bridge */ /* synthetic */ Collection values() {
            return C17538ad.super.values();
        }
    }

    /* renamed from: com.google.b.c.ad$c */
    final class C17543c extends C17541b<K, C17570ak<V>> {
        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C17570ak<K> mo33996b() {
            return C17538ad.this.keySet();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final boolean mo34001d() {
            return C17538ad.this.mo34001d();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public final boolean mo34002e() {
            return C17538ad.this.mo34002e();
        }

        public final int hashCode() {
            return C17538ad.this.hashCode();
        }

        public final int size() {
            return C17538ad.this.size();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public final C17666bt<Entry<K, C17570ak<V>>> mo34021f() {
            final C17666bt it = C17538ad.this.entrySet().iterator();
            return new C17666bt<Entry<K, C17570ak<V>>>() {
                public final boolean hasNext() {
                    return it.hasNext();
                }

                public final /* synthetic */ Object next() {
                    final Entry entry = (Entry) it.next();
                    return new C17688f<K, C17570ak<V>>() {
                        public final K getKey() {
                            return entry.getKey();
                        }

                        public final /* synthetic */ Object getValue() {
                            return C17570ak.m43181of(entry.getValue());
                        }
                    };
                }
            };
        }

        private C17543c() {
        }

        public final boolean containsKey(Object obj) {
            return C17538ad.this.containsKey(obj);
        }

        public final /* synthetic */ Object get(Object obj) {
            Object obj2 = C17538ad.this.get(obj);
            if (obj2 == null) {
                return null;
            }
            return C17570ak.m43181of(obj2);
        }
    }

    /* renamed from: com.google.b.c.ad$d */
    static class C17546d implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Object[] f49205a;

        /* renamed from: b */
        private final Object[] f49206b;

        /* access modifiers changed from: 0000 */
        public final Object readResolve() {
            C17540a aVar = new C17540a(this.f49205a.length);
            for (int i = 0; i < this.f49205a.length; i++) {
                aVar.mo34019a(this.f49205a[i], this.f49206b[i]);
            }
            return aVar.mo34020a();
        }

        C17546d(C17538ad<?, ?> adVar) {
            this.f49205a = new Object[adVar.size()];
            this.f49206b = new Object[adVar.size()];
            C17666bt it = adVar.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                this.f49205a[i] = entry.getKey();
                this.f49206b[i] = entry.getValue();
                i++;
            }
        }
    }

    C17538ad() {
    }

    /* renamed from: of */
    public static <K, V> C17538ad<K, V> m43097of() {
        return C17641be.f49325b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract C17570ak<Entry<K, V>> mo33994a();

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract C17570ak<K> mo33996b();

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract C17725z<V> mo33997c();

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public abstract boolean mo34001d();

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo34002e() {
        return false;
    }

    public abstract V get(Object obj);

    public static <K, V> C17540a<K, V> builder() {
        return new C17540a<>();
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new C17546d(this);
    }

    public C17570ak<Entry<K, V>> entrySet() {
        C17570ak<Entry<K, V>> akVar = this.f49189b;
        if (akVar != null) {
            return akVar;
        }
        C17570ak<Entry<K, V>> a = mo33994a();
        this.f49189b = a;
        return a;
    }

    public int hashCode() {
        return C17658bm.m43405a(entrySet());
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public C17570ak<K> keySet() {
        C17570ak<K> akVar = this.f49190c;
        if (akVar != null) {
            return akVar;
        }
        C17570ak<K> b = mo33996b();
        this.f49190c = b;
        return b;
    }

    public C17725z<V> values() {
        C17725z<V> zVar = this.f49191d;
        if (zVar != null) {
            return zVar;
        }
        C17725z<V> c = mo33997c();
        this.f49191d = c;
        return c;
    }

    public C17575al<K, V> asMultimap() {
        if (isEmpty()) {
            return C17575al.m43206of();
        }
        C17575al<K, V> alVar = this.f49192e;
        if (alVar != null) {
            return alVar;
        }
        C17575al<K, V> alVar2 = new C17575al<>(new C17543c(), size(), null);
        this.f49192e = alVar2;
        return alVar2;
    }

    public String toString() {
        int size = size();
        C17698k.m43477a(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, ShowStorageDotSizeSettings.DEFAULT));
        sb.append('{');
        boolean z = true;
        for (Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
        }
        sb.append('}');
        return sb.toString();
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> C17540a<K, V> builderWithExpectedSize(int i) {
        C17698k.m43477a(i, "expectedSize");
        return new C17540a<>(i);
    }

    public boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public static <K, V> C17538ad<K, V> copyOf(Iterable<? extends Entry<? extends K, ? extends V>> iterable) {
        int i;
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        } else {
            i = 4;
        }
        C17540a aVar = new C17540a(i);
        aVar.mo34018a(iterable);
        return aVar.mo34020a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    public static <K, V> C17538ad<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if ((map instanceof C17538ad) && !(map instanceof SortedMap)) {
            C17538ad<K, V> adVar = (C17538ad) map;
            if (!adVar.mo34001d()) {
                return adVar;
            }
        }
        return copyOf((Iterable<? extends Entry<? extends K, ? extends V>>) map.entrySet());
    }

    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        if (v2 != null) {
            return v2;
        }
        return v;
    }

    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: of */
    public static <K, V> C17538ad<K, V> m43098of(K k, V v) {
        C17698k.m43478a((Object) k, (Object) v);
        return C17641be.m43368a(1, new Object[]{k, v});
    }

    /* renamed from: of */
    public static <K, V> C17538ad<K, V> m43099of(K k, V v, K k2, V v2) {
        C17698k.m43478a((Object) k, (Object) v);
        C17698k.m43478a((Object) k2, (Object) v2);
        return C17641be.m43368a(2, new Object[]{k, v, k2, v2});
    }

    /* renamed from: of */
    public static <K, V> C17538ad<K, V> m43100of(K k, V v, K k2, V v2, K k3, V v3) {
        C17698k.m43478a((Object) k, (Object) v);
        C17698k.m43478a((Object) k2, (Object) v2);
        C17698k.m43478a((Object) k3, (Object) v3);
        return C17641be.m43368a(3, new Object[]{k, v, k2, v2, k3, v3});
    }

    /* renamed from: of */
    public static <K, V> C17538ad<K, V> m43101of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        C17698k.m43478a((Object) k, (Object) v);
        C17698k.m43478a((Object) k2, (Object) v2);
        C17698k.m43478a((Object) k3, (Object) v3);
        C17698k.m43478a((Object) k4, (Object) v4);
        return C17641be.m43368a(4, new Object[]{k, v, k2, v2, k3, v3, k4, v4});
    }

    /* renamed from: of */
    public static <K, V> C17538ad<K, V> m43102of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        C17698k.m43478a((Object) k, (Object) v);
        C17698k.m43478a((Object) k2, (Object) v2);
        C17698k.m43478a((Object) k3, (Object) v3);
        C17698k.m43478a((Object) k4, (Object) v4);
        C17698k.m43478a((Object) k5, (Object) v5);
        return C17641be.m43368a(5, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5});
    }
}
