package android.support.p030v4.p038f;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: android.support.v4.f.i */
abstract class C0787i<K, V> {

    /* renamed from: b */
    C0789b f2696b;

    /* renamed from: c */
    C0790c f2697c;

    /* renamed from: d */
    C0792e f2698d;

    /* renamed from: android.support.v4.f.i$a */
    final class C0788a<T> implements Iterator<T> {

        /* renamed from: a */
        final int f2699a;

        /* renamed from: b */
        int f2700b;

        /* renamed from: c */
        int f2701c;

        /* renamed from: d */
        boolean f2702d;

        public final boolean hasNext() {
            if (this.f2701c < this.f2700b) {
                return true;
            }
            return false;
        }

        public final T next() {
            if (hasNext()) {
                T a = C0787i.this.mo2456a(this.f2701c, this.f2699a);
                this.f2701c++;
                this.f2702d = true;
                return a;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            if (this.f2702d) {
                this.f2701c--;
                this.f2700b--;
                this.f2702d = false;
                C0787i.this.mo2458a(this.f2701c);
                return;
            }
            throw new IllegalStateException();
        }

        C0788a(int i) {
            this.f2699a = i;
            this.f2700b = C0787i.this.mo2454a();
        }
    }

    /* renamed from: android.support.v4.f.i$b */
    final class C0789b implements Set<Entry<K, V>> {
        public final void clear() {
            C0787i.this.mo2462c();
        }

        public final Iterator<Entry<K, V>> iterator() {
            return new C0791d();
        }

        public final int size() {
            return C0787i.this.mo2454a();
        }

        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public final boolean isEmpty() {
            if (C0787i.this.mo2454a() == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            for (int a = C0787i.this.mo2454a() - 1; a >= 0; a--) {
                Object a2 = C0787i.this.mo2456a(a, 0);
                Object a3 = C0787i.this.mo2456a(a, 1);
                if (a2 == null) {
                    i = 0;
                } else {
                    i = a2.hashCode();
                }
                if (a3 == null) {
                    i2 = 0;
                } else {
                    i2 = a3.hashCode();
                }
                i3 += i ^ i2;
            }
            return i3;
        }

        C0789b() {
        }

        public final /* synthetic */ boolean add(Object obj) {
            Entry entry = (Entry) obj;
            throw new UnsupportedOperationException();
        }

        public final boolean equals(Object obj) {
            return C0787i.m2250a((Set<T>) this, obj);
        }

        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }

        public final boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean addAll(Collection<? extends Entry<K, V>> collection) {
            int a = C0787i.this.mo2454a();
            for (Entry entry : collection) {
                C0787i.this.mo2459a(entry.getKey(), entry.getValue());
            }
            if (a != C0787i.this.mo2454a()) {
                return true;
            }
            return false;
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            int a = C0787i.this.mo2455a(entry.getKey());
            if (a < 0) {
                return false;
            }
            return C0782d.m2221a(C0787i.this.mo2456a(a, 1), entry.getValue());
        }
    }

    /* renamed from: android.support.v4.f.i$c */
    final class C0790c implements Set<K> {
        public final void clear() {
            C0787i.this.mo2462c();
        }

        public final int size() {
            return C0787i.this.mo2454a();
        }

        public final Object[] toArray() {
            return C0787i.this.mo2511b(0);
        }

        public final boolean isEmpty() {
            if (C0787i.this.mo2454a() == 0) {
                return true;
            }
            return false;
        }

        public final Iterator<K> iterator() {
            return new C0788a(0);
        }

        public final int hashCode() {
            int i;
            int i2 = 0;
            for (int a = C0787i.this.mo2454a() - 1; a >= 0; a--) {
                Object a2 = C0787i.this.mo2456a(a, 0);
                if (a2 == null) {
                    i = 0;
                } else {
                    i = a2.hashCode();
                }
                i2 += i;
            }
            return i2;
        }

        C0790c() {
        }

        public final boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public final boolean equals(Object obj) {
            return C0787i.m2250a((Set<T>) this, obj);
        }

        public final boolean contains(Object obj) {
            if (C0787i.this.mo2455a(obj) >= 0) {
                return true;
            }
            return false;
        }

        public final boolean retainAll(Collection<?> collection) {
            return C0787i.m2249a(C0787i.this.mo2461b(), collection);
        }

        public final <T> T[] toArray(T[] tArr) {
            return C0787i.this.mo2510a(tArr, 0);
        }

        public final boolean containsAll(Collection<?> collection) {
            Map b = C0787i.this.mo2461b();
            for (Object containsKey : collection) {
                if (!b.containsKey(containsKey)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean remove(Object obj) {
            int a = C0787i.this.mo2455a(obj);
            if (a < 0) {
                return false;
            }
            C0787i.this.mo2458a(a);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            Map b = C0787i.this.mo2461b();
            int size = b.size();
            for (Object remove : collection) {
                b.remove(remove);
            }
            if (size != b.size()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: android.support.v4.f.i$d */
    final class C0791d implements Iterator<Entry<K, V>>, Entry<K, V> {

        /* renamed from: a */
        int f2706a;

        /* renamed from: b */
        int f2707b = -1;

        /* renamed from: c */
        boolean f2708c;

        public final boolean hasNext() {
            if (this.f2707b < this.f2706a) {
                return true;
            }
            return false;
        }

        public final K getKey() {
            if (this.f2708c) {
                return C0787i.this.mo2456a(this.f2707b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final V getValue() {
            if (this.f2708c) {
                return C0787i.this.mo2456a(this.f2707b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final /* synthetic */ Object next() {
            if (hasNext()) {
                this.f2707b++;
                this.f2708c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append("=");
            sb.append(getValue());
            return sb.toString();
        }

        public final int hashCode() {
            int i;
            if (this.f2708c) {
                int i2 = 0;
                Object a = C0787i.this.mo2456a(this.f2707b, 0);
                Object a2 = C0787i.this.mo2456a(this.f2707b, 1);
                if (a == null) {
                    i = 0;
                } else {
                    i = a.hashCode();
                }
                if (a2 != null) {
                    i2 = a2.hashCode();
                }
                return i ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final void remove() {
            if (this.f2708c) {
                C0787i.this.mo2458a(this.f2707b);
                this.f2707b--;
                this.f2706a--;
                this.f2708c = false;
                return;
            }
            throw new IllegalStateException();
        }

        C0791d() {
            this.f2706a = C0787i.this.mo2454a() - 1;
        }

        public final V setValue(V v) {
            if (this.f2708c) {
                return C0787i.this.mo2457a(this.f2707b, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final boolean equals(Object obj) {
            if (!this.f2708c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Entry)) {
                return false;
            } else {
                Entry entry = (Entry) obj;
                if (!C0782d.m2221a(entry.getKey(), C0787i.this.mo2456a(this.f2707b, 0)) || !C0782d.m2221a(entry.getValue(), C0787i.this.mo2456a(this.f2707b, 1))) {
                    return false;
                }
                return true;
            }
        }
    }

    /* renamed from: android.support.v4.f.i$e */
    final class C0792e implements Collection<V> {
        public final void clear() {
            C0787i.this.mo2462c();
        }

        public final int size() {
            return C0787i.this.mo2454a();
        }

        public final Object[] toArray() {
            return C0787i.this.mo2511b(1);
        }

        public final boolean isEmpty() {
            if (C0787i.this.mo2454a() == 0) {
                return true;
            }
            return false;
        }

        public final Iterator<V> iterator() {
            return new C0788a(1);
        }

        C0792e() {
        }

        public final boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public final boolean contains(Object obj) {
            if (C0787i.this.mo2460b(obj) >= 0) {
                return true;
            }
            return false;
        }

        public final <T> T[] toArray(T[] tArr) {
            return C0787i.this.mo2510a(tArr, 1);
        }

        public final boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean remove(Object obj) {
            int b = C0787i.this.mo2460b(obj);
            if (b < 0) {
                return false;
            }
            C0787i.this.mo2458a(b);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            int a = C0787i.this.mo2454a();
            int i = 0;
            boolean z = false;
            while (i < a) {
                if (collection.contains(C0787i.this.mo2456a(i, 1))) {
                    C0787i.this.mo2458a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public final boolean retainAll(Collection<?> collection) {
            int a = C0787i.this.mo2454a();
            int i = 0;
            boolean z = false;
            while (i < a) {
                if (!collection.contains(C0787i.this.mo2456a(i, 1))) {
                    C0787i.this.mo2458a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }
    }

    C0787i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo2454a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo2455a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo2456a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract V mo2457a(int i, V v);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo2458a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo2459a(K k, V v);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo2460b(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Map<K, V> mo2461b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo2462c();

    /* renamed from: d */
    public final Set<K> mo2512d() {
        if (this.f2697c == null) {
            this.f2697c = new C0790c<>();
        }
        return this.f2697c;
    }

    /* renamed from: b */
    public final Object[] mo2511b(int i) {
        int a = mo2454a();
        Object[] objArr = new Object[a];
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = mo2456a(i2, i);
        }
        return objArr;
    }

    /* renamed from: a */
    public static <T> boolean m2250a(Set<T> set, Object obj) {
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
        } catch (NullPointerException unused) {
            return false;
        } catch (ClassCastException unused2) {
            return false;
        }
    }

    /* renamed from: a */
    public static <K, V> boolean m2249a(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final <T> T[] mo2510a(T[] tArr, int i) {
        int a = mo2454a();
        if (tArr.length < a) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), a);
        }
        for (int i2 = 0; i2 < a; i2++) {
            tArr[i2] = mo2456a(i2, i);
        }
        if (tArr.length > a) {
            tArr[a] = null;
        }
        return tArr;
    }
}
