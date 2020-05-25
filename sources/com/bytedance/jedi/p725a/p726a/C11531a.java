package com.bytedance.jedi.p725a.p726a;

import com.bytedance.jedi.p725a.p726a.C11536c.C11537a.C11538a;
import com.bytedance.jedi.p725a.p728c.C11571b;
import com.bytedance.jedi.p725a.p728c.C11573d;
import com.bytedance.jedi.p725a.p728c.C11574e;
import com.bytedance.jedi.p725a.p728c.C11575f;
import com.bytedance.jedi.p725a.p728c.C11577g;
import com.bytedance.jedi.p725a.p742l.C11730b;
import com.bytedance.jedi.p725a.p742l.C11731c;
import com.bytedance.jedi.p725a.p742l.C11733e;
import com.bytedance.jedi.p725a.p742l.C11733e.C11734a;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import p064c.p065a.C2201v;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.bytedance.jedi.a.a.a */
public abstract class C11531a<K, V> implements C11536c<K, V> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f30910a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C11531a.class), "dataSource", "getDataSource$model_release()Lcom/bytedance/jedi/model/datasource/IDataSource;"))};

    /* renamed from: c */
    private final C52668f f30911c = C52732g.m112285a(new C11532a(this));

    /* renamed from: com.bytedance.jedi.a.a.a$a */
    static final class C11532a extends C52712l implements C52670a<C11574e<K, V>> {

        /* renamed from: a */
        final /* synthetic */ C11531a f30912a;

        C11532a(C11531a aVar) {
            this.f30912a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C11531a aVar = this.f30912a;
            C52711k.m112240b(aVar, "$this$createDataSource");
            C11574e aVar2 = new C11538a(aVar);
            C11573d.m23678a(aVar, aVar2);
            return aVar2;
        }
    }

    /* renamed from: a */
    public final C11574e<K, V> mo22279a() {
        return (C11574e) this.f30911c.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract V mo22282b(K k);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo22283b(K k, V v);

    /* renamed from: c */
    public final void mo22284c() {
        mo22286e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract List<C52847n<K, V>> mo22285d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo22286e();

    /* renamed from: b */
    public final C2201v<List<C52847n<K, V>>> mo22281b() {
        C2201v<List<C52847n<K, V>>> b = C2201v.m6614b(mo22285d());
        C52711k.m112236a((Object) b, "Observable.just(getAllActual())");
        return b;
    }

    /* renamed from: a */
    public final C2201v<C11575f<V>> mo22278a(K k) {
        C2201v<C11575f<V>> b = C2201v.m6614b(C11577g.m23686a(mo22282b(k)));
        C52711k.m112236a((Object) b, "Observable.just(getActual(k).optional())");
        return b;
    }

    /* renamed from: a */
    public final void mo22280a(K k, V v) {
        C11730b bVar;
        C11531a aVar = this;
        aVar.mo22283b(k, v);
        C11536c cVar = aVar;
        C52711k.m112240b(cVar, "$this$fire");
        C11574e a = C11571b.m23673a(cVar);
        if (!(a instanceof C11731c)) {
            a = null;
        }
        C11731c cVar2 = (C11731c) a;
        if (cVar2 != null) {
            if (C11553h.f30935a.get(cVar) != null) {
                Object obj = C11553h.f30935a.get(cVar);
                if (obj == null) {
                    C52711k.m112234a();
                }
                if (((Map) obj).get(k) != null) {
                    Object obj2 = C11553h.f30935a.get(cVar);
                    if (obj2 == null) {
                        C52711k.m112234a();
                    }
                    Object obj3 = ((Map) obj2).get(k);
                    if (obj3 != null) {
                        bVar = (C11730b) obj3;
                        cVar2.mo22302a(bVar);
                    }
                    throw new C52857u("null cannot be cast to non-null type com.bytedance.jedi.model.traceable.ITraceable<kotlin.Pair<K, V?>>");
                }
            }
            bVar = C11734a.m24062a(C52856t.m112465a(k, v), new C11733e(C52856t.m112465a(k, v), new LinkedHashSet(), null));
            cVar2.mo22302a(bVar);
        }
    }
}
