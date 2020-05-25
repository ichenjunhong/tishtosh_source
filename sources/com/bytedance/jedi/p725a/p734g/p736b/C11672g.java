package com.bytedance.jedi.p725a.p734g.p736b;

import com.bytedance.jedi.p725a.p734g.p735a.C11605c;
import java.util.AbstractMap.SimpleImmutableEntry;

/* renamed from: com.bytedance.jedi.a.g.b.g */
public final class C11672g<K, V> extends SimpleImmutableEntry<K, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final C11665e f31132a;

    public final C11665e getCause() {
        return this.f31132a;
    }

    public final boolean wasEvicted() {
        return this.f31132a.mo22465a();
    }

    public static <K, V> C11672g<K, V> create(K k, V v, C11665e eVar) {
        return new C11672g<>(k, v, eVar);
    }

    private C11672g(K k, V v, C11665e eVar) {
        super(k, v);
        this.f31132a = (C11665e) C11605c.m23732a(eVar);
    }
}
