package org.msgpack.p2697c.p2698a;

import java.io.Serializable;
import java.util.Map.Entry;

/* renamed from: org.msgpack.c.a.b */
public final class C53800b<K, V> implements Serializable, Entry<K, V> {
    private static final long serialVersionUID = -4564047655287765373L;

    /* renamed from: a */
    private final K f133411a;

    /* renamed from: b */
    private final V f133412b;

    public final K getKey() {
        return this.f133411a;
    }

    public final V getValue() {
        return this.f133412b;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (this.f133411a == null) {
            i = 0;
        } else {
            i = this.f133411a.hashCode();
        }
        if (this.f133412b != null) {
            i2 = this.f133412b.hashCode();
        }
        return i ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f133411a);
        sb.append("=");
        sb.append(this.f133412b);
        return sb.toString();
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    public C53800b(Entry<? extends K, ? extends V> entry) {
        this.f133411a = entry.getKey();
        this.f133412b = entry.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        if (this.f133411a != null ? this.f133411a.equals(entry.getKey()) : entry.getKey() == null) {
            if (this.f133412b != null ? !this.f133412b.equals(entry.getValue()) : entry.getValue() != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C53800b(K k, V v) {
        this.f133411a = k;
        this.f133412b = v;
    }
}
