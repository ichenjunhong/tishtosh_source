package com.bytedance.jedi.p725a.p740j;

import com.bytedance.jedi.p725a.p726a.C11536c;
import com.bytedance.jedi.p725a.p726a.C11544e;
import com.bytedance.jedi.p725a.p728c.C11571b;
import com.bytedance.jedi.p725a.p728c.C11574e;
import com.bytedance.jedi.p725a.p733f.C11587b;
import com.bytedance.jedi.p725a.p739i.C11682a;
import com.bytedance.jedi.p725a.p739i.C11682a.C11683a;
import com.bytedance.jedi.p725a.p739i.C11682a.C11689c;
import com.bytedance.jedi.p725a.p739i.C11682a.C11692d;
import com.bytedance.jedi.p725a.p741k.C11703c;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.bytedance.jedi.a.j.c */
public abstract class C11699c {

    /* renamed from: com.bytedance.jedi.a.j.c$a */
    public static final class C11700a extends C52712l implements C52671b<C11689c<K, V, K1, V1>, C52860x> {
        public static final C11700a INSTANCE = new C11700a();

        C11700a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11689c) obj, "$receiver");
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public abstract <K, V, K1, V1> C11703c mo22478a(C11574e<K, V> eVar, C11574e<K1, V1> eVar2, C11682a<K, V, K1, V1> aVar);

    /* renamed from: a */
    public final <K, V, K1, V1> C11703c mo22480a(C11536c<K, V> cVar, C11544e<K1, V1> eVar, C52671b<? super C11692d<K, V, K1, List<V1>>, C52860x> bVar) {
        C52711k.m112240b(cVar, "$this$predicatedSyncTo");
        C52711k.m112240b(eVar, "to");
        C52711k.m112240b(bVar, "block");
        C11574e a = C11571b.m23673a(cVar);
        C11574e a2 = C11571b.m23674a(eVar);
        C11692d dVar = new C11692d(null, null, 3, null);
        bVar.invoke(dVar);
        return mo22478a(a, a2, (C11682a<K, V, K1, V1>) dVar);
    }

    /* renamed from: b */
    public final <K, V, K1, V1> C11703c mo22483b(C11587b<K, V, ?, ?> bVar, C11544e<K1, V1> eVar, C52671b<? super C11692d<K, V, K1, List<V1>>, C52860x> bVar2) {
        C52711k.m112240b(bVar, "$this$predicatedSyncTo");
        C52711k.m112240b(eVar, "to");
        C52711k.m112240b(bVar2, "block");
        C11574e a = C11571b.m23675a(bVar);
        C11574e a2 = C11571b.m23674a(eVar);
        C11692d dVar = new C11692d(null, null, 3, null);
        bVar2.invoke(dVar);
        return mo22478a(a, a2, (C11682a<K, V, K1, V1>) dVar);
    }

    /* renamed from: a */
    public final <K, V, K1, V1> C11703c mo22481a(C11544e<K, V> eVar, C11536c<K1, V1> cVar, C52671b<? super C11683a<K, List<V>, K1, V1>, C52860x> bVar) {
        C52711k.m112240b(eVar, "$this$batchSyncTo");
        C52711k.m112240b(cVar, "to");
        C52711k.m112240b(bVar, "block");
        C11574e a = C11571b.m23674a(eVar);
        C11574e a2 = C11571b.m23673a(cVar);
        C11683a aVar = new C11683a(null, null, 3, null);
        bVar.invoke(aVar);
        return mo22478a(a, a2, (C11682a<K, V, K1, V1>) aVar);
    }

    /* renamed from: a */
    public final <K, V, K1, V1> C11703c mo22482a(C11587b<K, V, ?, ?> bVar, C11544e<K1, V1> eVar, C52671b<? super C11689c<K, V, K1, List<V1>>, C52860x> bVar2) {
        C52711k.m112240b(bVar, "$this$keySyncTo");
        C52711k.m112240b(eVar, "to");
        C52711k.m112240b(bVar2, "block");
        C11574e a = C11571b.m23675a(bVar);
        C11574e a2 = C11571b.m23674a(eVar);
        C11689c cVar = new C11689c(null, null, 3, null);
        bVar2.invoke(cVar);
        return mo22478a(a, a2, (C11682a<K, V, K1, V1>) cVar);
    }
}
