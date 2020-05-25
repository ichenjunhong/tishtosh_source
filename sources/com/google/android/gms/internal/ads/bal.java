package com.google.android.gms.internal.ads;

import java.util.Map.Entry;

final class bal implements Comparable<bal>, Entry<K, V> {

    /* renamed from: a */
    private final K f41717a;

    /* renamed from: b */
    private V f41718b;

    /* renamed from: c */
    private final /* synthetic */ bae f41719c;

    bal(bae bae, Entry<K, V> entry) {
        this(bae, (Comparable) entry.getKey(), entry.getValue());
    }

    bal(bae bae, K k, V v) {
        this.f41719c = bae;
        this.f41717a = k;
        this.f41718b = v;
    }

    public final V getValue() {
        return this.f41718b;
    }

    public final V setValue(V v) {
        this.f41719c.m35070e();
        V v2 = this.f41718b;
        this.f41718b = v;
        return v2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        return m35082a(this.f41717a, entry.getKey()) && m35082a(this.f41718b, entry.getValue());
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = this.f41717a == null ? 0 : this.f41717a.hashCode();
        if (this.f41718b != null) {
            i = this.f41718b.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f41717a);
        String valueOf2 = String.valueOf(this.f41718b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    /* renamed from: a */
    private static boolean m35082a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final /* synthetic */ Object getKey() {
        return this.f41717a;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((bal) obj).getKey());
    }
}
