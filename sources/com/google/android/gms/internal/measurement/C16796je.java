package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.je */
class C16796je<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    public boolean f47188a;

    /* renamed from: b */
    private final int f47189b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<C16803jl> f47190c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Map<K, V> f47191d;

    /* renamed from: e */
    private volatile C16805jn f47192e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Map<K, V> f47193f;

    /* renamed from: g */
    private volatile C16799jh f47194g;

    /* renamed from: a */
    static <FieldDescriptorType extends C16728gw<FieldDescriptorType>> C16796je<FieldDescriptorType, Object> m40586a(int i) {
        return new C16797jf(i);
    }

    private C16796je(int i) {
        this.f47189b = i;
        this.f47190c = Collections.emptyList();
        this.f47191d = Collections.emptyMap();
        this.f47193f = Collections.emptyMap();
    }

    /* renamed from: a */
    public void mo32314a() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f47188a) {
            if (this.f47191d.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f47191d);
            }
            this.f47191d = map;
            if (this.f47193f.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f47193f);
            }
            this.f47193f = map2;
            this.f47188a = true;
        }
    }

    /* renamed from: b */
    public final int mo32315b() {
        return this.f47190c.size();
    }

    /* renamed from: b */
    public final Entry<K, V> mo32316b(int i) {
        return (Entry) this.f47190c.get(i);
    }

    /* renamed from: c */
    public final Iterable<Entry<K, V>> mo32317c() {
        if (this.f47191d.isEmpty()) {
            return C16800ji.m40602a();
        }
        return this.f47191d.entrySet();
    }

    public int size() {
        return this.f47190c.size() + this.f47191d.size();
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m40585a((K) comparable) >= 0 || this.f47191d.containsKey(comparable);
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m40585a((K) comparable);
        if (a >= 0) {
            return ((C16803jl) this.f47190c.get(a)).getValue();
        }
        return this.f47191d.get(comparable);
    }

    /* renamed from: a */
    public final V put(K k, V v) {
        m40591e();
        int a = m40585a(k);
        if (a >= 0) {
            return ((C16803jl) this.f47190c.get(a)).setValue(v);
        }
        m40591e();
        if (this.f47190c.isEmpty() && !(this.f47190c instanceof ArrayList)) {
            this.f47190c = new ArrayList(this.f47189b);
        }
        int i = -(a + 1);
        if (i >= this.f47189b) {
            return m40592f().put(k, v);
        }
        if (this.f47190c.size() == this.f47189b) {
            C16803jl jlVar = (C16803jl) this.f47190c.remove(this.f47189b - 1);
            m40592f().put((Comparable) jlVar.getKey(), jlVar.getValue());
        }
        this.f47190c.add(i, new C16803jl(this, k, v));
        return null;
    }

    public void clear() {
        m40591e();
        if (!this.f47190c.isEmpty()) {
            this.f47190c.clear();
        }
        if (!this.f47191d.isEmpty()) {
            this.f47191d.clear();
        }
    }

    public V remove(Object obj) {
        m40591e();
        Comparable comparable = (Comparable) obj;
        int a = m40585a((K) comparable);
        if (a >= 0) {
            return mo32318c(a);
        }
        if (this.f47191d.isEmpty()) {
            return null;
        }
        return this.f47191d.remove(comparable);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final V mo32318c(int i) {
        m40591e();
        V value = ((C16803jl) this.f47190c.remove(i)).getValue();
        if (!this.f47191d.isEmpty()) {
            Iterator it = m40592f().entrySet().iterator();
            this.f47190c.add(new C16803jl(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* renamed from: a */
    private final int m40585a(K k) {
        int size = this.f47190c.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) ((C16803jl) this.f47190c.get(size)).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) ((C16803jl) this.f47190c.get(i2)).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    public Set<Entry<K, V>> entrySet() {
        if (this.f47192e == null) {
            this.f47192e = new C16805jn(this, null);
        }
        return this.f47192e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final Set<Entry<K, V>> mo32321d() {
        if (this.f47194g == null) {
            this.f47194g = new C16799jh(this, null);
        }
        return this.f47194g;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m40591e() {
        if (this.f47188a) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: f */
    private final SortedMap<K, V> m40592f() {
        m40591e();
        if (this.f47191d.isEmpty() && !(this.f47191d instanceof TreeMap)) {
            this.f47191d = new TreeMap();
            this.f47193f = ((TreeMap) this.f47191d).descendingMap();
        }
        return (SortedMap) this.f47191d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16796je)) {
            return super.equals(obj);
        }
        C16796je jeVar = (C16796je) obj;
        int size = size();
        if (size != jeVar.size()) {
            return false;
        }
        int b = mo32315b();
        if (b != jeVar.mo32315b()) {
            return entrySet().equals(jeVar.entrySet());
        }
        for (int i = 0; i < b; i++) {
            if (!mo32316b(i).equals(jeVar.mo32316b(i))) {
                return false;
            }
        }
        if (b != size) {
            return this.f47191d.equals(jeVar.f47191d);
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < mo32315b(); i2++) {
            i += ((C16803jl) this.f47190c.get(i2)).hashCode();
        }
        return this.f47191d.size() > 0 ? i + this.f47191d.hashCode() : i;
    }

    /* synthetic */ C16796je(int i, C16797jf jfVar) {
        this(i);
    }
}
