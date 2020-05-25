package com.bytedance.jedi.p725a.p730e.p731a.p732a;

import com.bytedance.jedi.p725a.p734g.p736b.C11609a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentMap;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.a.e.a.a.a */
public final class C11580a<K, V> {

    /* renamed from: a */
    final C11609a<K, V> f30960a;

    /* renamed from: a */
    public final List<C52847n<K, V>> mo22317a() {
        List<C52847n<K, V>> arrayList = new ArrayList<>();
        ConcurrentMap b = this.f30960a.mo22332b();
        C52711k.m112236a((Object) b, "mRealCache.asMap()");
        for (Entry entry : b.entrySet()) {
            arrayList.add(C52856t.m112465a(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final V mo22316a(K k) {
        return this.f30960a.mo22329a(k);
    }

    public C11580a(C11609a<K, V> aVar) {
        C52711k.m112240b(aVar, "mRealCache");
        this.f30960a = aVar;
    }
}
