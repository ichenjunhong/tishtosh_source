package p064c.p065a.p092j;

import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1711f;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: c.a.j.a */
public final class C2159a {

    /* renamed from: c.a.j.a$a */
    static final class C2160a<T, R> implements C1711f<T, Iterable<? extends U>> {

        /* renamed from: a */
        public static final C2160a f6957a = new C2160a();

        C2160a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Iterable iterable = (Iterable) obj;
            C52711k.m112240b(iterable, "it");
            return iterable;
        }
    }

    /* renamed from: a */
    public static final <T> C2201v<T> m6512a(C2201v<? extends Iterable<? extends T>> vVar) {
        C52711k.m112240b(vVar, "$receiver");
        C2201v<T> b = vVar.mo6531b((C1711f<? super T, ? extends Iterable<? extends U>>) C2160a.f6957a);
        C52711k.m112236a((Object) b, "flatMapIterable { it }");
        return b;
    }
}
