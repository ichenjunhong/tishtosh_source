package com.bytedance.jedi.p725a.p727b;

import com.bytedance.jedi.p725a.p726a.C11536c;
import com.bytedance.jedi.p725a.p727b.C11554a.C11556b;
import com.bytedance.jedi.p725a.p728c.C11571b;
import com.bytedance.jedi.p725a.p728c.C11574e;
import com.bytedance.jedi.p725a.p733f.C11587b;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.bytedance.jedi.a.b.b */
public final class C11562b {

    /* renamed from: com.bytedance.jedi.a.b.b$a */
    static final class C11563a extends C52712l implements C52671b<C11556b<K, RESP, K1, V1>, C52860x> {

        /* renamed from: a */
        public static final C11563a f30948a = new C11563a();

        C11563a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11556b) obj, "$receiver");
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public static final <K, V, REQ, RESP, K1, V1> C11554a<K, V, REQ, RESP, K1, V1> m23668a(C11587b<K, V, REQ, RESP> bVar, C11536c<K1, V1> cVar, C52671b<? super C11556b<K, RESP, K1, V1>, C52860x> bVar2) {
        C52711k.m112240b(bVar, "$this$withCache");
        C52711k.m112240b(cVar, "cache");
        C52711k.m112240b(bVar2, "block");
        C11574e a = C11571b.m23673a(cVar);
        C52711k.m112240b(bVar, "fetcher");
        C52711k.m112240b(a, "cache");
        C52711k.m112240b(bVar2, "block");
        C11556b bVar3 = new C11556b();
        bVar2.invoke(bVar3);
        return new C11554a<>(bVar, a, bVar3, null);
    }
}
