package com.bytedance.jedi.p725a.p742l;

import com.bytedance.jedi.p725a.p726a.C11536c;
import com.bytedance.jedi.p725a.p726a.C11544e;
import com.bytedance.jedi.p725a.p726a.C11552g;
import com.bytedance.jedi.p725a.p726a.C11553h;
import com.bytedance.jedi.p725a.p743m.C11776l;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.a.l.g */
public final class C11738g<K, V> implements C11732d<C52847n<? extends K, ? extends V>> {

    /* renamed from: a */
    private final WeakReference<C11729a<C52847n<K, V>>> f31194a;

    public C11738g(C11729a<C52847n<K, V>> aVar) {
        C52711k.m112240b(aVar, "point");
        this.f31194a = new WeakReference<>(aVar);
    }

    /* renamed from: b */
    public final void mo22304b(C11730b<C52847n<K, V>> bVar) {
        C52711k.m112240b(bVar, "traceable");
        C11729a aVar = (C11729a) this.f31194a.get();
        if (aVar != null) {
            C52711k.m112236a((Object) aVar, "point");
            C11776l.m24114a(bVar, aVar);
            C11552g.f30933a.mo22305a(aVar);
            try {
                Map map = (Map) C11553h.f30935a.get(aVar);
                if (map == null) {
                    map = new LinkedHashMap();
                    C11553h.f30935a.put(aVar, map);
                }
                C11553h.m23662a(map).put(((C52847n) bVar.mo22487a()).getFirst(), bVar);
                if (aVar instanceof C11536c) {
                    ((C11536c) aVar).mo22280a(((C52847n) bVar.mo22487a()).getFirst(), ((C52847n) bVar.mo22487a()).getSecond());
                } else if (aVar instanceof C11544e) {
                    ((C11544e) aVar).mo22289a(((C52847n) bVar.mo22487a()).getFirst(), (List) ((C52847n) bVar.mo22487a()).getSecond());
                } else {
                    throw new IllegalStateException("TraceableObserver should be ICache or IListCache".toString());
                }
                Map map2 = (Map) C11553h.f30935a.get(aVar);
                if (map2 != null) {
                    Map a = C11553h.m23662a(map2);
                    if (a != null) {
                        a.remove(((C52847n) bVar.mo22487a()).getFirst());
                    }
                }
            } finally {
                C11552g.f30933a.mo22306b(aVar);
            }
        }
    }
}
