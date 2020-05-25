package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17417i;
import java.util.Map.Entry;

/* renamed from: com.google.b.c.f */
abstract class C17688f<K, V> implements Entry<K, V> {
    C17688f() {
    }

    public abstract K getKey();

    public abstract V getValue();

    public int hashCode() {
        int i;
        Object key = getKey();
        Object value = getValue();
        int i2 = 0;
        if (key == null) {
            i = 0;
        } else {
            i = key.hashCode();
        }
        if (value != null) {
            i2 = value.hashCode();
        }
        return i ^ i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append("=");
        sb.append(getValue());
        return sb.toString();
    }

    public V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        if (!C17417i.m42646a(getKey(), entry.getKey()) || !C17417i.m42646a(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }
}
