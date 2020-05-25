package com.google.p1057b.p1060c;

import java.io.Serializable;

/* renamed from: com.google.b.c.aa */
final class C17529aa<K, V> extends C17688f<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final K f49178a;

    /* renamed from: b */
    final V f49179b;

    public final K getKey() {
        return this.f49178a;
    }

    public final V getValue() {
        return this.f49179b;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    C17529aa(K k, V v) {
        this.f49178a = k;
        this.f49179b = v;
    }
}
