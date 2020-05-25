package com.google.p1057b.p1059b;

import com.google.p1057b.p1058a.C17421k;
import java.util.AbstractMap.SimpleImmutableEntry;

/* renamed from: com.google.b.b.n */
public final class C17523n<K, V> extends SimpleImmutableEntry<K, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final C17516l f49163a;

    public final C17516l getCause() {
        return this.f49163a;
    }

    public final boolean wasEvicted() {
        return this.f49163a.mo33935a();
    }

    public static <K, V> C17523n<K, V> create(K k, V v, C17516l lVar) {
        return new C17523n<>(k, v, lVar);
    }

    private C17523n(K k, V v, C17516l lVar) {
        super(k, v);
        this.f49163a = (C17516l) C17421k.m42653a(lVar);
    }
}
