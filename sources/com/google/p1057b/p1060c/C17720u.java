package com.google.p1057b.p1060c;

import java.util.List;

/* renamed from: com.google.b.c.u */
public abstract class C17720u<K, V> extends C17721v<K, V> implements C17592aq<K, V> {
    protected C17720u() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C17592aq<K, V> delegate();

    public List<V> get(K k) {
        return delegate().get(k);
    }

    public List<V> removeAll(Object obj) {
        return delegate().removeAll(obj);
    }
}
