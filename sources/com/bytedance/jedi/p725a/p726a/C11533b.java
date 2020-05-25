package com.bytedance.jedi.p725a.p726a;

import com.bytedance.jedi.p725a.p726a.C11544e.C11545a.C11546a;
import com.bytedance.jedi.p725a.p728c.C11571b;
import com.bytedance.jedi.p725a.p728c.C11573d;
import com.bytedance.jedi.p725a.p728c.C11574e;
import com.bytedance.jedi.p725a.p728c.C11575f;
import com.bytedance.jedi.p725a.p728c.C11577g;
import com.bytedance.jedi.p725a.p742l.C11730b;
import com.bytedance.jedi.p725a.p742l.C11731c;
import com.bytedance.jedi.p725a.p742l.C11733e;
import com.bytedance.jedi.p725a.p742l.C11733e.C11734a;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import p064c.p065a.C2201v;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2630b.C52594a;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.bytedance.jedi.a.a.b */
public abstract class C11533b<K, V> implements C11544e<K, V> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f30913a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C11533b.class), "dataSource", "getDataSource$model_release()Lcom/bytedance/jedi/model/datasource/IDataSource;"))};

    /* renamed from: c */
    private final C52668f f30914c = C52732g.m112285a(new C11535b(this));

    /* renamed from: com.bytedance.jedi.a.a.b$a */
    public static final class C11534a<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ C52671b f30915a;

        public C11534a(C52671b bVar) {
            this.f30915a = bVar;
        }

        public final int compare(T t, T t2) {
            return C52594a.m112153a((Comparable) this.f30915a.invoke(t), (Comparable) this.f30915a.invoke(t2));
        }
    }

    /* renamed from: com.bytedance.jedi.a.a.b$b */
    static final class C11535b extends C52712l implements C52670a<C11574e<K, List<? extends V>>> {

        /* renamed from: a */
        final /* synthetic */ C11533b f30916a;

        C11535b(C11533b bVar) {
            this.f30916a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C11533b bVar = this.f30916a;
            C52711k.m112240b(bVar, "$this$createDataSource");
            C11574e aVar = new C11546a(bVar);
            C11573d.m23678a(bVar, aVar);
            return aVar;
        }
    }

    /* renamed from: a */
    public final C11574e<K, List<V>> mo22288a() {
        return (C11574e) this.f30914c.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract List<V> mo22291b(K k);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo22292b(K k, List<? extends V> list);

    /* renamed from: c */
    public final void mo22293c() {
        mo22295e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract List<C52847n<K, List<V>>> mo22294d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo22295e();

    /* renamed from: f */
    public C52671b<V, Comparable<?>> mo22296f() {
        return null;
    }

    /* renamed from: b */
    public final C2201v<List<C52847n<K, List<V>>>> mo22290b() {
        C2201v<List<C52847n<K, List<V>>>> b = C2201v.m6614b(mo22294d());
        C52711k.m112236a((Object) b, "Observable.just(getAllActual())");
        return b;
    }

    /* renamed from: a */
    public final C2201v<C11575f<List<V>>> mo22287a(K k) {
        C2201v<C11575f<List<V>>> b = C2201v.m6614b(C11577g.m23686a(mo22291b(k)));
        C52711k.m112236a((Object) b, "Observable.just(getActual(k).optional())");
        return b;
    }

    /* renamed from: a */
    public final void mo22289a(K k, List<? extends V> list) {
        C11730b bVar;
        List<? extends V> list2;
        C11533b bVar2 = this;
        C52671b f = bVar2.mo22296f();
        if (f != null) {
            if (list != null) {
                list2 = C52575l.m112122a((Iterable) list, (Comparator) new C11534a(f));
            } else {
                list2 = null;
            }
            if (list2 != null) {
                list = list2;
            }
        }
        bVar2.mo22292b(k, list);
        C11544e eVar = bVar2;
        C52711k.m112240b(eVar, "$this$fire");
        C11574e a = C11571b.m23674a(eVar);
        if (!(a instanceof C11731c)) {
            a = null;
        }
        C11731c cVar = (C11731c) a;
        if (cVar != null) {
            if (C11553h.f30935a.get(eVar) != null) {
                Object obj = C11553h.f30935a.get(eVar);
                if (obj == null) {
                    C52711k.m112234a();
                }
                if (((Map) obj).get(k) != null) {
                    Object obj2 = C11553h.f30935a.get(eVar);
                    if (obj2 == null) {
                        C52711k.m112234a();
                    }
                    Object obj3 = ((Map) obj2).get(k);
                    if (obj3 != null) {
                        bVar = ((C11730b) obj3).mo22486a(C52856t.m112465a(k, list));
                        cVar.mo22302a(bVar);
                    }
                    throw new C52857u("null cannot be cast to non-null type com.bytedance.jedi.model.traceable.ITraceable<kotlin.Pair<K, kotlin.collections.List<V>?>>");
                }
            }
            bVar = C11734a.m24062a(C52856t.m112465a(k, list), new C11733e(C52856t.m112465a(k, list), new LinkedHashSet(), null));
            cVar.mo22302a(bVar);
        }
    }
}
