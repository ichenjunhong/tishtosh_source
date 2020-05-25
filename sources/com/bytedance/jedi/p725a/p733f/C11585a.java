package com.bytedance.jedi.p725a.p733f;

import com.bytedance.jedi.p725a.p728c.C11573d;
import com.bytedance.jedi.p725a.p728c.C11574e;
import com.bytedance.jedi.p725a.p733f.C11587b.C11588a.C11589a;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1710e;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.bytedance.jedi.a.f.a */
public abstract class C11585a<K, V, REQ, RESP> implements C11587b<K, V, REQ, RESP> {

    /* renamed from: c */
    static final /* synthetic */ C52767h[] f30966c = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C11585a.class), "dataSource", "getDataSource$model_release()Lcom/bytedance/jedi/model/datasource/IDataSource;"))};

    /* renamed from: d */
    public final C52668f f30967d = C52732g.m112285a(new C11586a(this));

    /* renamed from: com.bytedance.jedi.a.f.a$a */
    static final class C11586a extends C52712l implements C52670a<C11574e<K, V>> {

        /* renamed from: a */
        final /* synthetic */ C11585a f30968a;

        C11586a(C11585a aVar) {
            this.f30968a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C11585a aVar = this.f30968a;
            C52711k.m112240b(aVar, "$this$createDataSource");
            C11574e aVar2 = new C11589a(aVar);
            C11573d.m23678a(aVar, aVar2);
            return aVar2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C2201v<RESP> mo22308a(REQ req);

    /* renamed from: c */
    public final C2201v<RESP> mo22318c(REQ req) {
        C2201v a = mo22308a(req);
        C52711k.m112240b(this, "$this$fire");
        C52711k.m112240b(a, "observable");
        C2201v<RESP> d = a.mo6540d((C1710e<? super T>) new C11596a<Object>(this, req));
        C52711k.m112236a((Object) d, "observable.doOnNext {\n  …q) to v))\n        }\n    }");
        return d;
    }
}
