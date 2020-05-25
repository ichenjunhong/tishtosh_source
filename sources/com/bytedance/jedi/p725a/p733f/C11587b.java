package com.bytedance.jedi.p725a.p733f;

import com.bytedance.jedi.p725a.p728c.C11566a;
import com.bytedance.jedi.p725a.p728c.C11574e;
import com.bytedance.jedi.p725a.p728c.C11575f;
import com.bytedance.jedi.p725a.p728c.C11577g;
import com.bytedance.jedi.p725a.p742l.C11729a;
import com.bytedance.jedi.p725a.p742l.C11730b;
import com.bytedance.jedi.p725a.p742l.C11731c;
import com.bytedance.jedi.p725a.p742l.C11735f;
import java.util.Arrays;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p071d.C1715j;
import p064c.p065a.p092j.C2159a;
import p2628d.C52847n;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.a.f.b */
public interface C11587b<K, V, REQ, RESP> extends C11729a<C52847n<? extends K, ? extends V>> {

    /* renamed from: e */
    public static final C11588a f30969e = C11588a.f30970a;

    /* renamed from: com.bytedance.jedi.a.f.b$a */
    public static final class C11588a {

        /* renamed from: a */
        static final /* synthetic */ C11588a f30970a = new C11588a();

        /* renamed from: com.bytedance.jedi.a.f.b$a$a */
        public static final class C11589a<K, V, REQ, RESP> extends C11566a<K, V> implements C11731c<C52847n<? extends K, ? extends V>> {

            /* renamed from: a */
            private final /* synthetic */ C11735f f30971a;

            /* renamed from: com.bytedance.jedi.a.f.b$a$a$a */
            static final class C11590a<T> implements C1715j<C52847n<? extends K, ? extends V>> {

                /* renamed from: a */
                final /* synthetic */ Object f30972a;

                C11590a(Object obj) {
                    this.f30972a = obj;
                }

                /* renamed from: a */
                public final /* synthetic */ boolean mo6207a(Object obj) {
                    C52847n nVar = (C52847n) obj;
                    C52711k.m112240b(nVar, "it");
                    return C52711k.m112239a(this.f30972a, nVar.getFirst());
                }
            }

            /* renamed from: com.bytedance.jedi.a.f.b$a$a$b */
            static final class C11591b<T, R> implements C1711f<T, R> {

                /* renamed from: a */
                public static final C11591b f30973a = new C11591b();

                C11591b() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    C52847n nVar = (C52847n) obj;
                    C52711k.m112240b(nVar, "it");
                    return C11577g.m23686a(nVar.getSecond());
                }
            }

            /* renamed from: com.bytedance.jedi.a.f.b$a$a$c */
            static final class C11592c<T> implements C1715j<C11730b<C52847n<? extends K, ? extends V>>> {

                /* renamed from: a */
                final /* synthetic */ C11574e[] f30974a;

                C11592c(C11574e[] eVarArr) {
                    this.f30974a = eVarArr;
                }

                /* renamed from: a */
                public final /* synthetic */ boolean mo6207a(Object obj) {
                    boolean z;
                    boolean z2;
                    C11730b bVar = (C11730b) obj;
                    C52711k.m112240b(bVar, "traceable");
                    C11574e[] eVarArr = this.f30974a;
                    int length = eVarArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            z = false;
                            break;
                        }
                        C11729a c = eVarArr[i].mo22311c();
                        if (c != null) {
                            z2 = bVar.mo22488a(c);
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                    if (!z) {
                        return true;
                    }
                    return false;
                }
            }

            /* renamed from: com.bytedance.jedi.a.f.b$a$a$d */
            static final class C11593d<T, R> implements C1711f<T, R> {

                /* renamed from: a */
                public static final C11593d f30975a = new C11593d();

                C11593d() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    C11730b bVar = (C11730b) obj;
                    C52711k.m112240b(bVar, "it");
                    return (C52847n) bVar.mo22487a();
                }
            }

            /* renamed from: com.bytedance.jedi.a.f.b$a$a$e */
            static final class C11594e<T, R> implements C1711f<T, R> {

                /* renamed from: a */
                final /* synthetic */ C11587b f30976a;

                /* renamed from: b */
                final /* synthetic */ C11589a f30977b;

                /* renamed from: c */
                final /* synthetic */ Object f30978c;

                C11594e(C11587b bVar, C11589a aVar, Object obj) {
                    this.f30976a = bVar;
                    this.f30977b = aVar;
                    this.f30978c = obj;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    return C11577g.m23686a(this.f30976a.mo22309a(this.f30978c, obj));
                }
            }

            /* renamed from: a */
            public final void mo22302a(C11730b<C52847n<K, V>> bVar) {
                C52711k.m112240b(bVar, "traceable");
                this.f30971a.mo22302a(bVar);
            }

            /* renamed from: b */
            public final C2201v<C11730b<C52847n<K, V>>> mo22303b() {
                return this.f30971a.mo22303b();
            }

            /* renamed from: a */
            public final C2201v<List<C52847n<K, V>>> mo22298a() {
                C2201v<List<C52847n<K, V>>> b = C2201v.m6610b();
                C52711k.m112236a((Object) b, "Observable.empty()");
                return b;
            }

            public C11589a(C11587b<K, V, REQ, RESP> bVar) {
                C52711k.m112240b(bVar, "inheritance");
                C11729a aVar = bVar;
                super(aVar);
                this.f30971a = new C11735f(aVar);
            }

            /* renamed from: a */
            public final C2201v<C11575f<V>> mo22299a(K k) {
                K k2;
                if (!(k instanceof Object)) {
                    k2 = null;
                } else {
                    k2 = k;
                }
                if (k2 != null) {
                    C11729a c = mo22311c();
                    if (c != null) {
                        C11587b bVar = (C11587b) c;
                        C2201v<C11575f<V>> d = bVar.mo22318c(k).mo6541d((C1711f<? super T, ? extends R>) new C11594e<Object,Object>(bVar, this, k));
                        if (d != null) {
                            return d;
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.bytedance.jedi.model.fetcher.IFetcher<K, V, REQ, RESP>");
                    }
                }
                C2201v<C11575f<V>> b = C2201v.m6610b();
                C52711k.m112236a((Object) b, "Observable.empty()");
                return b;
            }

            /* renamed from: a */
            public final C2201v<C11575f<V>> mo22300a(K k, C11574e<?, ?>... eVarArr) {
                C52711k.m112240b(eVarArr, "exclude");
                C2201v g = mo22301a(false, (C11574e<?, ?>[]) (C11574e[]) Arrays.copyOf(eVarArr, eVarArr.length)).mo6548g();
                C52711k.m112236a((Object) g, "observeAll(false, *exclude).share()");
                C2201v<C11575f<V>> d = C2159a.m6512a(g).mo6522a((C1715j<? super T>) new C11590a<Object>(k)).mo6541d((C1711f<? super T, ? extends R>) C11591b.f30973a);
                C52711k.m112236a((Object) d, "observeAll(false, *exclu… { it.second.optional() }");
                return d;
            }

            /* renamed from: a */
            public final C2201v<List<C52847n<K, V>>> mo22301a(boolean z, C11574e<?, ?>... eVarArr) {
                C52711k.m112240b(eVarArr, "exclude");
                C2201v d = mo22303b().mo6522a((C1715j<? super T>) new C11592c<Object>(eVarArr)).mo6541d((C1711f<? super T, ? extends R>) C11593d.f30975a);
                C52711k.m112236a((Object) d, "observeTraceable()\n     …    .map { it.payload() }");
                C2201v<List<C52847n<K, V>>> a = m23670a(d, z).mo6514a(C1667a.m5940a());
                C52711k.m112236a((Object) a, "observeTraceable()\n     …dSchedulers.mainThread())");
                return a;
            }
        }

        private C11588a() {
        }
    }

    /* renamed from: a */
    V mo22309a(REQ req, RESP resp);

    /* renamed from: b */
    K mo22310b(REQ req);

    /* renamed from: c */
    C2201v<RESP> mo22318c(REQ req);
}
