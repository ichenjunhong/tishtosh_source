package com.bytedance.jedi.p725a.p727b;

import com.bytedance.jedi.p725a.p728c.C11574e;
import com.bytedance.jedi.p725a.p728c.C11575f;
import com.bytedance.jedi.p725a.p733f.C11585a;
import com.bytedance.jedi.p725a.p733f.C11587b;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p071d.C1715j;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.bytedance.jedi.a.b.a */
public final class C11554a<K, V, REQ, RESP, K1, V1> {

    /* renamed from: d */
    public static final C11555a f30936d = new C11555a(null);

    /* renamed from: a */
    public C11587b<K, V, REQ, RESP> f30937a;

    /* renamed from: b */
    public C11574e<K1, V1> f30938b;

    /* renamed from: c */
    public C11556b<K, RESP, K1, V1> f30939c;

    /* renamed from: com.bytedance.jedi.a.b.a$a */
    public static final class C11555a {
        private C11555a() {
        }

        public /* synthetic */ C11555a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.jedi.a.b.a$b */
    public static final class C11556b<K, V, K1, V1> {

        /* renamed from: a */
        public C52671b<? super K, ? extends K1> f30940a = C11557a.f30942a;

        /* renamed from: b */
        public C52671b<? super V1, ? extends V> f30941b = C11558b.f30943a;

        /* renamed from: com.bytedance.jedi.a.b.a$b$a */
        static final class C11557a extends C52712l implements C52671b<K, K1> {

            /* renamed from: a */
            public static final C11557a f30942a = new C11557a();

            C11557a() {
                super(1);
            }

            /* JADX WARNING: type inference failed for: r1v0, types: [K1, K] */
            /* JADX WARNING: Incorrect type for immutable var: ssa=K, code=null, for r1v0, types: [K1, K] */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final K1 invoke(K r1) {
                /*
                    r0 = this;
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.p725a.p727b.C11554a.C11556b.C11557a.invoke(java.lang.Object):java.lang.Object");
            }
        }

        /* renamed from: com.bytedance.jedi.a.b.a$b$b */
        static final class C11558b extends C52712l implements C52671b<V1, V> {

            /* renamed from: a */
            public static final C11558b f30943a = new C11558b();

            C11558b() {
                super(1);
            }

            /* JADX WARNING: type inference failed for: r1v0, types: [V, V1] */
            /* JADX WARNING: Incorrect type for immutable var: ssa=V1, code=null, for r1v0, types: [V, V1] */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final V invoke(V1 r1) {
                /*
                    r0 = this;
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.p725a.p727b.C11554a.C11556b.C11558b.invoke(java.lang.Object):java.lang.Object");
            }
        }
    }

    /* renamed from: com.bytedance.jedi.a.b.a$c */
    public static final class C11559c extends C11585a<K, V, REQ, RESP> {

        /* renamed from: a */
        final /* synthetic */ C11554a f30944a;

        /* renamed from: b */
        final /* synthetic */ C52682m f30945b;

        /* renamed from: com.bytedance.jedi.a.b.a$c$a */
        static final class C11560a<T> implements C1715j<C11575f<? extends V1>> {

            /* renamed from: a */
            public static final C11560a f30946a = new C11560a();

            C11560a() {
            }

            /* renamed from: a */
            public final /* synthetic */ boolean mo6207a(Object obj) {
                C11575f fVar = (C11575f) obj;
                C52711k.m112240b(fVar, "it");
                if (fVar.mo22313a() != null) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: com.bytedance.jedi.a.b.a$c$b */
        static final class C11561b<T, R> implements C1711f<T, R> {

            /* renamed from: a */
            final /* synthetic */ C11559c f30947a;

            C11561b(C11559c cVar) {
                this.f30947a = cVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                C11575f fVar = (C11575f) obj;
                C52711k.m112240b(fVar, "it");
                C52671b<? super V1, ? extends V> bVar = this.f30947a.f30944a.f30939c.f30941b;
                Object a = fVar.mo22313a();
                if (a == null) {
                    C52711k.m112234a();
                }
                return bVar.invoke(a);
            }
        }

        /* renamed from: b */
        public final K mo22310b(REQ req) {
            return this.f30944a.f30937a.mo22310b(req);
        }

        /* renamed from: a */
        public final C2201v<RESP> mo22308a(REQ req) {
            C52682m mVar = this.f30945b;
            C2201v c = this.f30944a.f30937a.mo22318c(req);
            C2201v d = this.f30944a.f30938b.mo22299a(this.f30944a.f30939c.f30940a.invoke(this.f30944a.f30937a.mo22310b(req))).mo6522a((C1715j<? super T>) C11560a.f30946a).mo6541d((C1711f<? super T, ? extends R>) new C11561b<Object,Object>(this));
            C52711k.m112236a((Object) d, "_cache.request(_mapper._…map.invoke(it.some()!!) }");
            return (C2201v) mVar.invoke(c, d);
        }

        C11559c(C11554a aVar, C52682m mVar) {
            this.f30944a = aVar;
            this.f30945b = mVar;
        }

        /* renamed from: a */
        public final V mo22309a(REQ req, RESP resp) {
            return this.f30944a.f30937a.mo22309a(req, resp);
        }
    }

    /* renamed from: a */
    public final C11587b<K, V, REQ, RESP> mo22307a(C52682m<? super C2201v<RESP>, ? super C2201v<RESP>, ? extends C2201v<RESP>> mVar) {
        C52711k.m112240b(mVar, "strategy");
        return new C11559c<>(this, mVar);
    }

    private C11554a(C11587b<K, V, REQ, RESP> bVar, C11574e<K1, V1> eVar, C11556b<K, RESP, K1, V1> bVar2) {
        this.f30937a = bVar;
        this.f30938b = eVar;
        this.f30939c = bVar2;
    }

    public /* synthetic */ C11554a(C11587b bVar, C11574e eVar, C11556b bVar2, C52707g gVar) {
        this(bVar, eVar, bVar2);
    }
}
