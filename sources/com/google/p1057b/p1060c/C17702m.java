package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17417i;
import com.google.p1057b.p1058a.C17421k;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: com.google.b.c.m */
class C17702m<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: a */
    transient long[] f49415a;

    /* renamed from: b */
    transient Object[] f49416b;

    /* renamed from: c */
    transient Object[] f49417c;

    /* renamed from: d */
    transient float f49418d;

    /* renamed from: e */
    transient int f49419e;

    /* renamed from: f */
    public transient int f49420f;

    /* renamed from: g */
    private transient int[] f49421g;

    /* renamed from: h */
    private transient int f49422h;

    /* renamed from: i */
    private transient Set<K> f49423i;

    /* renamed from: j */
    private transient Set<Entry<K, V>> f49424j;

    /* renamed from: k */
    private transient Collection<V> f49425k;

    /* renamed from: com.google.b.c.m$a */
    class C17706a extends AbstractSet<Entry<K, V>> {
        public final void clear() {
            C17702m.this.clear();
        }

        public final Iterator<Entry<K, V>> iterator() {
            return new C17707b<Entry<K, V>>() {
                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final /* synthetic */ Object mo34444a(int i) {
                    return new C17709d(i);
                }
            };
        }

        public final int size() {
            return C17702m.this.f49420f;
        }

        C17706a() {
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            int a = C17702m.this.mo34425a(entry.getKey());
            if (a == -1 || !C17417i.m42646a(C17702m.this.f49417c[a], entry.getValue())) {
                return false;
            }
            return true;
        }

        public final boolean remove(Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                int a = C17702m.this.mo34425a(entry.getKey());
                if (a != -1 && C17417i.m42646a(C17702m.this.f49417c[a], entry.getValue())) {
                    C17702m.this.mo34430c(a);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.google.b.c.m$b */
    abstract class C17707b<T> implements Iterator<T> {

        /* renamed from: b */
        int f49430b;

        /* renamed from: c */
        int f49431c;

        /* renamed from: d */
        int f49432d;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract T mo34444a(int i);

        public boolean hasNext() {
            if (this.f49431c >= 0) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private void m43504a() {
            if (C17702m.this.f49419e != this.f49430b) {
                throw new ConcurrentModificationException();
            }
        }

        public T next() {
            m43504a();
            if (hasNext()) {
                this.f49432d = this.f49431c;
                T a = mo34444a(this.f49431c);
                this.f49431c = C17702m.this.mo34435e(this.f49431c);
                return a;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            boolean z;
            m43504a();
            if (this.f49432d >= 0) {
                z = true;
            } else {
                z = false;
            }
            C17698k.m43479a(z);
            this.f49430b++;
            C17702m.this.mo34430c(this.f49432d);
            this.f49431c = C17702m.this.mo34424a(this.f49431c, this.f49432d);
            this.f49432d = -1;
        }

        private C17707b() {
            this.f49430b = C17702m.this.f49419e;
            this.f49431c = C17702m.this.mo34423a();
            this.f49432d = -1;
        }
    }

    /* renamed from: com.google.b.c.m$c */
    class C17708c extends AbstractSet<K> {
        public final void clear() {
            C17702m.this.clear();
        }

        public final Iterator<K> iterator() {
            return new C17707b<K>() {
                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final K mo34444a(int i) {
                    return C17702m.this.f49416b[i];
                }
            };
        }

        public final int size() {
            return C17702m.this.f49420f;
        }

        C17708c() {
        }

        public final boolean contains(Object obj) {
            return C17702m.this.containsKey(obj);
        }

        public final boolean remove(Object obj) {
            int a = C17702m.this.mo34425a(obj);
            if (a == -1) {
                return false;
            }
            C17702m.this.mo34430c(a);
            return true;
        }
    }

    /* renamed from: com.google.b.c.m$d */
    final class C17709d extends C17688f<K, V> {

        /* renamed from: b */
        private final K f49436b;

        /* renamed from: c */
        private int f49437c;

        public final K getKey() {
            return this.f49436b;
        }

        public final V getValue() {
            m43506a();
            if (this.f49437c == -1) {
                return null;
            }
            return C17702m.this.f49417c[this.f49437c];
        }

        /* renamed from: a */
        private void m43506a() {
            if (this.f49437c == -1 || this.f49437c >= C17702m.this.size() || !C17417i.m42646a(this.f49436b, C17702m.this.f49416b[this.f49437c])) {
                this.f49437c = C17702m.this.mo34425a((Object) this.f49436b);
            }
        }

        public final V setValue(V v) {
            m43506a();
            if (this.f49437c == -1) {
                C17702m.this.put(this.f49436b, v);
                return null;
            }
            V v2 = C17702m.this.f49417c[this.f49437c];
            C17702m.this.f49417c[this.f49437c] = v;
            return v2;
        }

        C17709d(int i) {
            this.f49436b = C17702m.this.f49416b[i];
            this.f49437c = i;
        }
    }

    /* renamed from: com.google.b.c.m$e */
    class C17710e extends AbstractCollection<V> {
        public final void clear() {
            C17702m.this.clear();
        }

        public final Iterator<V> iterator() {
            return new C17707b<V>() {
                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final V mo34444a(int i) {
                    return C17702m.this.f49417c[i];
                }
            };
        }

        public final int size() {
            return C17702m.this.f49420f;
        }

        C17710e() {
        }
    }

    /* renamed from: a */
    private static int m43484a(long j) {
        return (int) (j >>> 32);
    }

    /* renamed from: a */
    private static long m43485a(long j, int i) {
        return (j & -4294967296L) | (((long) i) & 4294967295L);
    }

    /* renamed from: b */
    private static int m43488b(long j) {
        return (int) j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo34424a(int i, int i2) {
        return i - 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34426a(int i) {
    }

    public int size() {
        return this.f49420f;
    }

    /* renamed from: b */
    private int m43487b() {
        return this.f49421g.length - 1;
    }

    public boolean isEmpty() {
        if (this.f49420f == 0) {
            return true;
        }
        return false;
    }

    C17702m() {
        mo34427a(3, 1.0f);
    }

    public Set<Entry<K, V>> entrySet() {
        if (this.f49424j != null) {
            return this.f49424j;
        }
        C17706a aVar = new C17706a();
        this.f49424j = aVar;
        return aVar;
    }

    public Set<K> keySet() {
        if (this.f49423i != null) {
            return this.f49423i;
        }
        C17708c cVar = new C17708c();
        this.f49423i = cVar;
        return cVar;
    }

    public Collection<V> values() {
        if (this.f49425k != null) {
            return this.f49425k;
        }
        C17710e eVar = new C17710e();
        this.f49425k = eVar;
        return eVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo34423a() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    public void clear() {
        this.f49419e++;
        Arrays.fill(this.f49416b, 0, this.f49420f, null);
        Arrays.fill(this.f49417c, 0, this.f49420f, null);
        Arrays.fill(this.f49421g, -1);
        Arrays.fill(this.f49415a, -1);
        this.f49420f = 0;
    }

    C17702m(int i) {
        this(i, 1.0f);
    }

    /* renamed from: f */
    private static int[] m43489f(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public boolean containsKey(Object obj) {
        if (mo34425a(obj) != -1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo34435e(int i) {
        int i2 = i + 1;
        if (i2 < this.f49420f) {
            return i2;
        }
        return -1;
    }

    public V remove(Object obj) {
        return m43486a(obj, C17724y.m43537a(obj));
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        mo34427a(3, 1.0f);
        int readInt = objectInputStream.readInt();
        while (true) {
            readInt--;
            if (readInt >= 0) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            } else {
                return;
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f49420f);
        for (int i = 0; i < this.f49420f; i++) {
            objectOutputStream.writeObject(this.f49416b[i]);
            objectOutputStream.writeObject(this.f49417c[i]);
        }
    }

    /* renamed from: c */
    public final V mo34430c(int i) {
        return m43486a(this.f49416b[i], m43484a(this.f49415a[i]));
    }

    public boolean containsValue(Object obj) {
        for (int i = 0; i < this.f49420f; i++) {
            if (C17417i.m42646a(obj, this.f49417c[i])) {
                return true;
            }
        }
        return false;
    }

    public V get(Object obj) {
        int a = mo34425a(obj);
        mo34426a(a);
        if (a == -1) {
            return null;
        }
        return this.f49417c[a];
    }

    /* renamed from: a */
    public final int mo34425a(Object obj) {
        int a = C17724y.m43537a(obj);
        int i = this.f49421g[m43487b() & a];
        while (i != -1) {
            long j = this.f49415a[i];
            if (m43484a(j) == a && C17417i.m42646a(obj, this.f49416b[i])) {
                return i;
            }
            i = m43488b(j);
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo34429b(int i) {
        this.f49416b = Arrays.copyOf(this.f49416b, i);
        this.f49417c = Arrays.copyOf(this.f49417c, i);
        long[] jArr = this.f49415a;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1);
        }
        this.f49415a = copyOf;
    }

    /* renamed from: g */
    private void m43490g(int i) {
        if (this.f49421g.length >= 1073741824) {
            this.f49422h = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (((float) i) * this.f49418d)) + 1;
        int[] f = m43489f(i);
        long[] jArr = this.f49415a;
        int length = f.length - 1;
        for (int i3 = 0; i3 < this.f49420f; i3++) {
            int a = m43484a(jArr[i3]);
            int i4 = a & length;
            int i5 = f[i4];
            f[i4] = i3;
            jArr[i3] = (((long) a) << 32) | (4294967295L & ((long) i5));
        }
        this.f49422h = i2;
        this.f49421g = f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo34434d(int i) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.f49416b;
            objArr[i] = objArr[size];
            Object[] objArr2 = this.f49417c;
            objArr2[i] = objArr2[size];
            this.f49416b[size] = null;
            this.f49417c[size] = null;
            long j = this.f49415a[size];
            this.f49415a[i] = j;
            this.f49415a[size] = -1;
            int a = m43484a(j) & m43487b();
            int i2 = this.f49421g[a];
            if (i2 == size) {
                this.f49421g[a] = i;
            } else {
                while (true) {
                    long j2 = this.f49415a[i2];
                    int b = m43488b(j2);
                    if (b == size) {
                        this.f49415a[i2] = m43485a(j2, i);
                        return;
                    }
                    i2 = b;
                }
            }
        } else {
            this.f49416b[i] = null;
            this.f49417c[i] = null;
            this.f49415a[i] = -1;
        }
    }

    C17702m(int i, float f) {
        mo34427a(i, f);
    }

    /* renamed from: a */
    private V m43486a(Object obj, int i) {
        int b = m43487b() & i;
        int i2 = this.f49421g[b];
        if (i2 == -1) {
            return null;
        }
        int i3 = -1;
        while (true) {
            if (m43484a(this.f49415a[i2]) != i || !C17417i.m42646a(obj, this.f49416b[i2])) {
                int b2 = m43488b(this.f49415a[i2]);
                if (b2 == -1) {
                    return null;
                }
                int i4 = b2;
                i3 = i2;
                i2 = i4;
            } else {
                V v = this.f49417c[i2];
                if (i3 == -1) {
                    this.f49421g[b] = m43488b(this.f49415a[i2]);
                } else {
                    long[] jArr = this.f49415a;
                    jArr[i3] = m43485a(jArr[i3], m43488b(this.f49415a[i2]));
                }
                mo34434d(i2);
                this.f49420f--;
                this.f49419e++;
                return v;
            }
        }
    }

    public V put(K k, V v) {
        long[] jArr = this.f49415a;
        Object[] objArr = this.f49416b;
        V[] vArr = this.f49417c;
        int a = C17724y.m43537a((Object) k);
        int b = m43487b() & a;
        int i = this.f49420f;
        int i2 = this.f49421g[b];
        if (i2 == -1) {
            this.f49421g[b] = i;
        } else {
            while (true) {
                long j = jArr[i2];
                if (m43484a(j) != a || !C17417i.m42646a(k, objArr[i2])) {
                    int b2 = m43488b(j);
                    if (b2 == -1) {
                        jArr[i2] = m43485a(j, i);
                        break;
                    }
                    i2 = b2;
                } else {
                    V v2 = vArr[i2];
                    vArr[i2] = v;
                    mo34426a(i2);
                    return v2;
                }
            }
        }
        int i3 = Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            int i4 = i + 1;
            int length = this.f49415a.length;
            if (i4 > length) {
                int max = Math.max(1, length >>> 1) + length;
                if (max >= 0) {
                    i3 = max;
                }
                if (i3 != length) {
                    mo34429b(i3);
                }
            }
            mo34428a(i, k, v, a);
            this.f49420f = i4;
            if (i >= this.f49422h) {
                m43490g(this.f49421g.length * 2);
            }
            this.f49419e++;
            return null;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34427a(int i, float f) {
        boolean z;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C17421k.m42660a(z, (Object) "Initial capacity must be non-negative");
        if (f > 0.0f) {
            z2 = true;
        }
        C17421k.m42660a(z2, (Object) "Illegal load factor");
        int a = C17724y.m43536a(i, (double) f);
        this.f49421g = m43489f(a);
        this.f49418d = f;
        this.f49416b = new Object[i];
        this.f49417c = new Object[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1);
        this.f49415a = jArr;
        this.f49422h = Math.max(1, (int) (((float) a) * f));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34428a(int i, K k, V v, int i2) {
        this.f49415a[i] = (((long) i2) << 32) | 4294967295L;
        this.f49416b[i] = k;
        this.f49417c[i] = v;
    }
}
