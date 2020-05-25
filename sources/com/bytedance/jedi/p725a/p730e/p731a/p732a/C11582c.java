package com.bytedance.jedi.p725a.p730e.p731a.p732a;

import com.bytedance.jedi.p725a.p726a.C11531a;
import com.bytedance.jedi.p725a.p734g.p736b.C11609a;
import com.bytedance.jedi.p725a.p734g.p736b.C11610b;
import java.util.List;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.a.e.a.a.c */
public class C11582c<K, V> extends C11531a<K, V> {

    /* renamed from: c */
    private final C11580a<K, V> f30962c;

    /* renamed from: d */
    public final List<C52847n<K, V>> mo22285d() {
        return this.f30962c.mo22317a();
    }

    /* renamed from: e */
    public final void mo22286e() {
        this.f30962c.f30960a.mo22330a();
    }

    /* renamed from: b */
    public final V mo22282b(K k) {
        return this.f30962c.mo22316a(k);
    }

    public C11582c(long j) {
        C11609a aVar;
        if (j > 0) {
            aVar = C11610b.m23744a().mo22334a(j).mo22337d();
        } else {
            aVar = C11610b.m23744a().mo22337d();
        }
        C52711k.m112236a((Object) aVar, "if (maxSize > 0) CacheBu…lder.newBuilder().build()");
        this.f30962c = new C11580a<>(aVar);
    }

    /* renamed from: b */
    public final void mo22283b(K k, V v) {
        C11580a<K, V> aVar = this.f30962c;
        if (v != null) {
            aVar.f30960a.mo22331a(k, v);
        } else {
            aVar.f30960a.mo22333b(k);
        }
    }

    public /* synthetic */ C11582c(long j, int i, C52707g gVar) {
        this(-1);
    }
}
