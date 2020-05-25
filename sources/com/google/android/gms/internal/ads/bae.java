package com.google.android.gms.internal.ads;

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

class bae<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    public boolean f41704a;

    /* renamed from: b */
    private final int f41705b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<bal> f41706c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Map<K, V> f41707d;

    /* renamed from: e */
    private volatile bao f41708e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Map<K, V> f41709f;

    /* renamed from: g */
    private volatile bah f41710g;

    /* renamed from: a */
    static <FieldDescriptorType extends axs<FieldDescriptorType>> bae<FieldDescriptorType, Object> m35065a(int i) {
        return new baf(i);
    }

    private bae(int i) {
        this.f41705b = i;
        this.f41706c = Collections.emptyList();
        this.f41707d = Collections.emptyMap();
        this.f41709f = Collections.emptyMap();
    }

    /* renamed from: a */
    public void mo29913a() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f41704a) {
            if (this.f41707d.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f41707d);
            }
            this.f41707d = map;
            if (this.f41709f.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f41709f);
            }
            this.f41709f = map2;
            this.f41704a = true;
        }
    }

    /* renamed from: b */
    public final int mo29914b() {
        return this.f41706c.size();
    }

    /* renamed from: b */
    public final Entry<K, V> mo29915b(int i) {
        return (Entry) this.f41706c.get(i);
    }

    /* renamed from: c */
    public final Iterable<Entry<K, V>> mo29916c() {
        if (this.f41707d.isEmpty()) {
            return bai.m35081a();
        }
        return this.f41707d.entrySet();
    }

    public int size() {
        return this.f41706c.size() + this.f41707d.size();
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m35064a((K) comparable) >= 0 || this.f41707d.containsKey(comparable);
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m35064a((K) comparable);
        if (a >= 0) {
            return ((bal) this.f41706c.get(a)).getValue();
        }
        return this.f41707d.get(comparable);
    }

    /* renamed from: a */
    public final V put(K k, V v) {
        m35070e();
        int a = m35064a(k);
        if (a >= 0) {
            return ((bal) this.f41706c.get(a)).setValue(v);
        }
        m35070e();
        if (this.f41706c.isEmpty() && !(this.f41706c instanceof ArrayList)) {
            this.f41706c = new ArrayList(this.f41705b);
        }
        int i = -(a + 1);
        if (i >= this.f41705b) {
            return m35071f().put(k, v);
        }
        if (this.f41706c.size() == this.f41705b) {
            bal bal = (bal) this.f41706c.remove(this.f41705b - 1);
            m35071f().put((Comparable) bal.getKey(), bal.getValue());
        }
        this.f41706c.add(i, new bal(this, k, v));
        return null;
    }

    public void clear() {
        m35070e();
        if (!this.f41706c.isEmpty()) {
            this.f41706c.clear();
        }
        if (!this.f41707d.isEmpty()) {
            this.f41707d.clear();
        }
    }

    public V remove(Object obj) {
        m35070e();
        Comparable comparable = (Comparable) obj;
        int a = m35064a((K) comparable);
        if (a >= 0) {
            return mo29917c(a);
        }
        if (this.f41707d.isEmpty()) {
            return null;
        }
        return this.f41707d.remove(comparable);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final V mo29917c(int i) {
        m35070e();
        V value = ((bal) this.f41706c.remove(i)).getValue();
        if (!this.f41707d.isEmpty()) {
            Iterator it = m35071f().entrySet().iterator();
            this.f41706c.add(new bal(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* renamed from: a */
    private final int m35064a(K k) {
        int size = this.f41706c.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) ((bal) this.f41706c.get(size)).getKey());
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
            int compareTo2 = k.compareTo((Comparable) ((bal) this.f41706c.get(i2)).getKey());
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
        if (this.f41708e == null) {
            this.f41708e = new bao(this, null);
        }
        return this.f41708e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final Set<Entry<K, V>> mo29920d() {
        if (this.f41710g == null) {
            this.f41710g = new bah(this, null);
        }
        return this.f41710g;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m35070e() {
        if (this.f41704a) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: f */
    private final SortedMap<K, V> m35071f() {
        m35070e();
        if (this.f41707d.isEmpty() && !(this.f41707d instanceof TreeMap)) {
            this.f41707d = new TreeMap();
            this.f41709f = ((TreeMap) this.f41707d).descendingMap();
        }
        return (SortedMap) this.f41707d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bae)) {
            return super.equals(obj);
        }
        bae bae = (bae) obj;
        int size = size();
        if (size != bae.size()) {
            return false;
        }
        int b = mo29914b();
        if (b != bae.mo29914b()) {
            return entrySet().equals(bae.entrySet());
        }
        for (int i = 0; i < b; i++) {
            if (!mo29915b(i).equals(bae.mo29915b(i))) {
                return false;
            }
        }
        if (b != size) {
            return this.f41707d.equals(bae.f41707d);
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < mo29914b(); i2++) {
            i += ((bal) this.f41706c.get(i2)).hashCode();
        }
        return this.f41707d.size() > 0 ? i + this.f41707d.hashCode() : i;
    }

    /* synthetic */ bae(int i, baf baf) {
        this(i);
    }
}
