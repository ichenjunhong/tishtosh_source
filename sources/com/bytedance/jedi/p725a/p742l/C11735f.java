package com.bytedance.jedi.p725a.p742l;

import com.p902d.p903a.C13452b;
import com.p902d.p903a.C13454c;
import com.p902d.p903a.C13455d;
import java.lang.ref.WeakReference;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1710e;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.bytedance.jedi.a.l.f */
public final class C11735f<K, V> implements C11731c<C52847n<? extends K, ? extends V>> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f31189a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C11735f.class), "subject", "getSubject()Lcom/jakewharton/rxrelay2/Relay;"))};

    /* renamed from: b */
    public final WeakReference<C11729a<C52847n<K, V>>> f31190b;

    /* renamed from: c */
    private final C52668f f31191c = C52732g.m112285a(C11737b.f31193a);

    /* renamed from: com.bytedance.jedi.a.l.f$a */
    static final class C11736a<T> implements C1710e<C11730b<C52847n<? extends K, ? extends V>>> {

        /* renamed from: a */
        final /* synthetic */ C11735f f31192a;

        C11736a(C11735f fVar) {
            this.f31192a = fVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C11730b bVar = (C11730b) obj;
            Object obj2 = this.f31192a.f31190b.get();
            if (obj2 == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a(obj2, "tracePoint.get()!!");
            bVar.mo22490b((C11729a) obj2);
        }
    }

    /* renamed from: com.bytedance.jedi.a.l.f$b */
    static final class C11737b extends C52712l implements C52670a<C13454c<C11730b<C52847n<? extends K, ? extends V>>>> {

        /* renamed from: a */
        public static final C11737b f31193a = new C11737b();

        C11737b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C13455d(new C13452b());
        }
    }

    /* renamed from: a */
    private final C13454c<C11730b<C52847n<K, V>>> m24063a() {
        return (C13454c) this.f31191c.getValue();
    }

    /* renamed from: b */
    public final C2201v<C11730b<C52847n<K, V>>> mo22303b() {
        C2201v<C11730b<C52847n<K, V>>> d = m24063a().mo6540d((C1710e<? super T>) new C11736a<Object>(this));
        C52711k.m112236a((Object) d, "subject.doOnNext {\n     …ePoint.get()!!)\n        }");
        return d;
    }

    public C11735f(C11729a<C52847n<K, V>> aVar) {
        C52711k.m112240b(aVar, "point");
        this.f31190b = new WeakReference<>(aVar);
    }

    /* renamed from: a */
    public final void mo22302a(C11730b<C52847n<K, V>> bVar) {
        C52711k.m112240b(bVar, "traceable");
        m24063a().accept(bVar);
    }
}
