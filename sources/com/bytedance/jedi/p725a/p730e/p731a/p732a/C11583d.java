package com.bytedance.jedi.p725a.p730e.p731a.p732a;

import com.bytedance.jedi.p725a.p726a.C11533b;
import com.bytedance.jedi.p725a.p734g.p736b.C11609a;
import com.bytedance.jedi.p725a.p734g.p736b.C11610b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentMap;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.a.e.a.a.d */
public class C11583d<K, V> extends C11533b<K, V> {

    /* renamed from: c */
    private C52671b<? super V, ? extends Comparable<?>> f30963c;

    /* renamed from: d */
    private final C11581b<K, V> f30964d;

    /* renamed from: e */
    public final void mo22295e() {
        this.f30964d.f30961a.mo22330a();
    }

    /* renamed from: f */
    public final C52671b<V, Comparable<?>> mo22296f() {
        C52671b<? super V, ? extends Comparable<?>> bVar = this.f30963c;
        if (bVar == null) {
            return super.mo22296f();
        }
        return bVar;
    }

    /* renamed from: d */
    public final List<C52847n<K, List<V>>> mo22294d() {
        C11581b<K, V> bVar = this.f30964d;
        List<C52847n<K, List<V>>> arrayList = new ArrayList<>();
        ConcurrentMap b = bVar.f30961a.mo22332b();
        C52711k.m112236a((Object) b, "mRealCache.asMap()");
        for (Entry entry : b.entrySet()) {
            arrayList.add(C52856t.m112465a(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final List<V> mo22291b(K k) {
        return (List) this.f30964d.f30961a.mo22329a(k);
    }

    private C11583d(long j) {
        C11609a aVar;
        if (j > 0) {
            aVar = C11610b.m23744a().mo22334a(j).mo22337d();
        } else {
            aVar = C11610b.m23744a().mo22337d();
        }
        C52711k.m112236a((Object) aVar, "if (maxSize > 0) CacheBu…lder.newBuilder().build()");
        this.f30964d = new C11581b<>(aVar);
    }

    /* renamed from: b */
    public final void mo22292b(K k, List<? extends V> list) {
        C11581b<K, V> bVar = this.f30964d;
        if (list != null) {
            bVar.f30961a.mo22331a(k, list);
        } else {
            bVar.f30961a.mo22333b(k);
        }
    }

    public /* synthetic */ C11583d(long j, int i, C52707g gVar) {
        this(-1);
    }
}
