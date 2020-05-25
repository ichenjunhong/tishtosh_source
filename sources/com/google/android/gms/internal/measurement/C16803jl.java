package com.google.android.gms.internal.measurement;

import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.jl */
final class C16803jl implements Comparable<C16803jl>, Entry<K, V> {

    /* renamed from: a */
    private final K f47201a;

    /* renamed from: b */
    private V f47202b;

    /* renamed from: c */
    private final /* synthetic */ C16796je f47203c;

    C16803jl(C16796je jeVar, Entry<K, V> entry) {
        this(jeVar, (Comparable) entry.getKey(), entry.getValue());
    }

    C16803jl(C16796je jeVar, K k, V v) {
        this.f47203c = jeVar;
        this.f47201a = k;
        this.f47202b = v;
    }

    public final V getValue() {
        return this.f47202b;
    }

    public final V setValue(V v) {
        this.f47203c.m40591e();
        V v2 = this.f47202b;
        this.f47202b = v;
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
        return m40603a(this.f47201a, entry.getKey()) && m40603a(this.f47202b, entry.getValue());
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = this.f47201a == null ? 0 : this.f47201a.hashCode();
        if (this.f47202b != null) {
            i = this.f47202b.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f47201a);
        String valueOf2 = String.valueOf(this.f47202b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    /* renamed from: a */
    private static boolean m40603a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final /* synthetic */ Object getKey() {
        return this.f47201a;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((C16803jl) obj).getKey());
    }
}
