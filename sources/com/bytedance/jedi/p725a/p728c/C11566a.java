package com.bytedance.jedi.p725a.p728c;

import com.bytedance.jedi.p725a.p742l.C11729a;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C1675ac;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p071d.C1715j;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p077e.p081d.C1937ar;
import p064c.p065a.p088f.C2144b;
import p064c.p065a.p090h.C2150a;
import p064c.p065a.p093k.C2168a;
import p064c.p065a.p094l.C2180b;
import p064c.p065a.p094l.C2189f;
import p2628d.C52847n;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.a.c.a */
public abstract class C11566a<K, V> implements C11574e<K, V> {

    /* renamed from: a */
    private final WeakReference<C11729a<C52847n<K, V>>> f30950a;

    /* renamed from: com.bytedance.jedi.a.c.a$a */
    static final class C11567a<T, R> implements C1711f<T, K> {

        /* renamed from: a */
        public static final C11567a f30951a = new C11567a();

        C11567a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            C52847n nVar = (C52847n) obj;
            C52711k.m112240b(nVar, "it");
            return nVar.getFirst();
        }
    }

    /* renamed from: com.bytedance.jedi.a.c.a$b */
    static final class C11568b<T, R> implements C1711f<T, C2206z<? extends R>> {

        /* renamed from: a */
        public static final C11568b f30952a = new C11568b();

        C11568b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            C2144b bVar = (C2144b) obj;
            C52711k.m112240b(bVar, "it");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            C1675ac a = C2168a.m6519a();
            C1745b.m6050a(timeUnit, "unit is null");
            C1745b.m6050a(a, "scheduler is null");
            C1937ar arVar = new C1937ar(bVar, 100, timeUnit, a, false);
            return C2150a.m6486a((C2201v<T>) arVar);
        }
    }

    /* renamed from: com.bytedance.jedi.a.c.a$c */
    static final class C11569c<T> implements C1715j<List<C52847n<? extends K, ? extends V>>> {

        /* renamed from: a */
        public static final C11569c f30953a = new C11569c();

        C11569c() {
        }

        /* renamed from: a */
        public final /* synthetic */ boolean mo6207a(Object obj) {
            List list = (List) obj;
            C52711k.m112240b(list, "it");
            if (list.size() > 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.bytedance.jedi.a.c.a$d */
    static final class C11570d<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        public static final C11570d f30954a = new C11570d();

        C11570d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            C52847n nVar = (C52847n) obj;
            C52711k.m112240b(nVar, "it");
            return C52575l.m112092a(nVar);
        }
    }

    /* renamed from: c */
    public final C11729a<C52847n<K, V>> mo22311c() {
        return (C11729a) this.f30950a.get();
    }

    public C11566a(C11729a<C52847n<K, V>> aVar) {
        C52711k.m112240b(aVar, "point");
        this.f30950a = new WeakReference<>(aVar);
    }

    /* renamed from: a */
    protected static C2201v<List<C52847n<K, V>>> m23670a(C2201v<C52847n<K, V>> vVar, boolean z) {
        C52711k.m112240b(vVar, "$this$batchEmit");
        if (z) {
            C2189f n = C2180b.m6534l().mo6479n();
            vVar.mo6536c((C1711f<? super T, ? extends K>) C11567a.f30951a).mo6520a((C1711f<? super T, ? extends C2206z<? extends R>>) C11568b.f30952a).mo6526b(n);
            C2201v<List<C52847n<K, V>>> a = n.mo6528b(100, TimeUnit.MILLISECONDS).mo6522a((C1715j<? super T>) C11569c.f30953a);
            C52711k.m112236a((Object) a, "PublishSubject.create<Pa…S).filter { it.size > 0 }");
            return a;
        }
        C2201v<List<C52847n<K, V>>> d = vVar.mo6541d((C1711f<? super T, ? extends R>) C11570d.f30954a);
        C52711k.m112236a((Object) d, "map { listOf(it) }");
        return d;
    }
}
