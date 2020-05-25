package com.bytedance.jedi.p725a.p743m;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.a.m.m */
public final class C11777m<K, V> extends WeakReference<V> {

    /* renamed from: a */
    public final K f31274a;

    public C11777m(K k, V v, ReferenceQueue<V> referenceQueue) {
        C52711k.m112240b(referenceQueue, "q");
        super(v, referenceQueue);
        this.f31274a = k;
    }
}
