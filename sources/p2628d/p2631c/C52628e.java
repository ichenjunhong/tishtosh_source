package p2628d.p2631c;

import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: d.c.e */
public interface C52628e {

    /* renamed from: d.c.e$a */
    public static final class C52629a {

        /* renamed from: d.c.e$a$a */
        static final class C52630a extends C52712l implements C52682m<C52628e, C52631b, C52628e> {

            /* renamed from: a */
            public static final C52630a f130921a = new C52630a();

            C52630a() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                C52628e eVar;
                C52628e eVar2 = (C52628e) obj;
                C52631b bVar = (C52631b) obj2;
                C52711k.m112240b(eVar2, "acc");
                C52711k.m112240b(bVar, "element");
                C52628e minusKey = eVar2.minusKey(bVar.getKey());
                if (minusKey == C52634f.INSTANCE) {
                    eVar = bVar;
                } else {
                    C52626d dVar = (C52626d) minusKey.get(C52626d.f130919a);
                    if (dVar == null) {
                        eVar = new C52608b(minusKey, bVar);
                    } else {
                        C52628e minusKey2 = minusKey.minusKey(C52626d.f130919a);
                        if (minusKey2 == C52634f.INSTANCE) {
                            eVar = new C52608b(bVar, dVar);
                        } else {
                            eVar = new C52608b(new C52608b(minusKey2, bVar), dVar);
                        }
                    }
                }
                return eVar;
            }
        }

        /* renamed from: a */
        public static C52628e m112175a(C52628e eVar, C52628e eVar2) {
            C52711k.m112240b(eVar2, "context");
            if (eVar2 == C52634f.INSTANCE) {
                return eVar;
            }
            return (C52628e) eVar2.fold(eVar, C52630a.f130921a);
        }
    }

    /* renamed from: d.c.e$b */
    public interface C52631b extends C52628e {

        /* renamed from: d.c.e$b$a */
        public static final class C52632a {
            /* renamed from: a */
            public static C52628e m112177a(C52631b bVar, C52628e eVar) {
                C52711k.m112240b(eVar, "context");
                return C52629a.m112175a(bVar, eVar);
            }

            /* renamed from: a */
            public static <E extends C52631b> E m112176a(C52631b bVar, C52633c<E> cVar) {
                C52711k.m112240b(cVar, "key");
                if (!C52711k.m112239a((Object) bVar.getKey(), (Object) cVar)) {
                    return null;
                }
                if (bVar != null) {
                    return bVar;
                }
                throw new C52857u("null cannot be cast to non-null type E");
            }

            /* renamed from: b */
            public static C52628e m112179b(C52631b bVar, C52633c<?> cVar) {
                C52711k.m112240b(cVar, "key");
                if (C52711k.m112239a((Object) bVar.getKey(), (Object) cVar)) {
                    return C52634f.INSTANCE;
                }
                return bVar;
            }

            /* renamed from: a */
            public static <R> R m112178a(C52631b bVar, R r, C52682m<? super R, ? super C52631b, ? extends R> mVar) {
                C52711k.m112240b(mVar, "operation");
                return mVar.invoke(r, bVar);
            }
        }

        <E extends C52631b> E get(C52633c<E> cVar);

        C52633c<?> getKey();
    }

    /* renamed from: d.c.e$c */
    public interface C52633c<E extends C52631b> {
    }

    <R> R fold(R r, C52682m<? super R, ? super C52631b, ? extends R> mVar);

    <E extends C52631b> E get(C52633c<E> cVar);

    C52628e minusKey(C52633c<?> cVar);

    C52628e plus(C52628e eVar);
}
