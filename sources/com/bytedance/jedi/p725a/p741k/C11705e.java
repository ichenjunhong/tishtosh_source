package com.bytedance.jedi.p725a.p741k;

import com.bytedance.jedi.p725a.p728c.C11574e;
import com.bytedance.jedi.p725a.p728c.C11575f;
import com.bytedance.jedi.p725a.p739i.C11682a;
import com.bytedance.jedi.p725a.p739i.C11682a.C11683a;
import com.bytedance.jedi.p725a.p739i.C11682a.C11689c;
import com.bytedance.jedi.p725a.p739i.C11682a.C11692d;
import com.bytedance.jedi.p725a.p742l.C11729a;
import com.bytedance.jedi.p725a.p742l.C11730b;
import com.bytedance.jedi.p725a.p742l.C11732d;
import com.bytedance.jedi.p725a.p742l.C11733e.C11734a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import p064c.p065a.C1673aa;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p071d.C1715j;
import p064c.p065a.p092j.C2159a;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52568f;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52701b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;

/* renamed from: com.bytedance.jedi.a.k.e */
public final class C11705e<K, V, K1, V1> {

    /* renamed from: d */
    public static final C11711b f31153d = new C11711b(null);

    /* renamed from: a */
    public final C11574e<K, V> f31154a;

    /* renamed from: b */
    public final C11574e<K1, V1> f31155b;

    /* renamed from: c */
    public final C11682a<K, V, K1, V1> f31156c;

    /* renamed from: com.bytedance.jedi.a.k.e$a */
    static final class C11706a<V, K1, V1> implements C1673aa<V, C52847n<? extends K1, ? extends V1>> {

        /* renamed from: a */
        public final C11574e<K1, V1> f31157a;

        /* renamed from: b */
        public final C11682a<?, V, K1, V1> f31158b;

        /* renamed from: com.bytedance.jedi.a.k.e$a$a */
        static final class C11707a<T, R> implements C1711f<T, Iterable<? extends U>> {

            /* renamed from: a */
            final /* synthetic */ C11706a f31159a;

            C11707a(C11706a aVar) {
                this.f31159a = aVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                return (List) ((C11683a) this.f31159a.f31158b).f31135b.invoke(obj);
            }
        }

        /* renamed from: com.bytedance.jedi.a.k.e$a$b */
        static final class C11708b<T, R> implements C1711f<T, C2206z<? extends R>> {

            /* renamed from: a */
            final /* synthetic */ C11706a f31160a;

            C11708b(C11706a aVar) {
                this.f31160a = aVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                C52847n nVar = (C52847n) obj;
                C52711k.m112240b(nVar, "<name for destructuring parameter 0>");
                final Object component1 = nVar.component1();
                final Object component2 = nVar.component2();
                return this.f31160a.f31157a.mo22299a(component1).mo6541d((C1711f<? super T, ? extends R>) new C1711f<T, R>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C11708b f31161a;

                    {
                        this.f31161a = r1;
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        C11575f fVar = (C11575f) obj;
                        C52711k.m112240b(fVar, "cur");
                        Object a = fVar.mo22313a();
                        Object invoke = ((C11683a) this.f31161a.f31160a.f31158b).f31136c.invoke(component2, a);
                        if (!(!C52711k.m112239a(invoke, a))) {
                            invoke = null;
                        }
                        return C52856t.m112465a(component1, invoke);
                    }
                }).mo6522a((C1715j<? super T>) C117102.f31164a);
            }
        }

        /* renamed from: a */
        public final C2206z<C52847n<K1, V1>> mo6134a(C2201v<V> vVar) {
            C52711k.m112240b(vVar, "upstream");
            if (this.f31158b instanceof C11683a) {
                C2201v a = vVar.mo6531b((C1711f<? super T, ? extends Iterable<? extends U>>) new C11707a<Object,Object>(this)).mo6520a((C1711f<? super T, ? extends C2206z<? extends R>>) new C11708b<Object,Object>(this));
                C52711k.m112236a((Object) a, "upstream.flatMapIterable…                        }");
                return a;
            }
            throw new RuntimeException();
        }

        public C11706a(C11574e<K1, V1> eVar, C11682a<?, V, K1, V1> aVar) {
            C52711k.m112240b(eVar, "to");
            C52711k.m112240b(aVar, "mergeStrategy");
            this.f31157a = eVar;
            this.f31158b = aVar;
        }
    }

    /* renamed from: com.bytedance.jedi.a.k.e$b */
    public static final class C11711b {
        private C11711b() {
        }

        public /* synthetic */ C11711b(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final <T> boolean mo22485a(T t, T t2) {
            Object obj;
            Object obj2;
            Object obj3;
            if (t != t2) {
                Boolean bool = null;
                if (C52568f.m112082c(new Object[]{t, t2}).size() == 2) {
                    obj = Boolean.valueOf(t instanceof C11702b);
                } else {
                    obj = null;
                }
                if (!C52711k.m112239a(obj, (Object) Boolean.valueOf(true))) {
                    if (C52568f.m112082c(new Object[]{t, t2}).size() == 2) {
                        obj2 = Boolean.valueOf(t instanceof List);
                    } else {
                        obj2 = null;
                    }
                    if (!C52711k.m112239a(obj2, (Object) Boolean.valueOf(true))) {
                        if (C52568f.m112082c(new Object[]{t, t2}).size() == 2) {
                            obj3 = Boolean.valueOf(t instanceof Object[]);
                        } else {
                            obj3 = null;
                        }
                        if (!C52711k.m112239a(obj3, (Object) Boolean.valueOf(true))) {
                            if (C52568f.m112082c(new Object[]{t, t2}).size() == 2) {
                                bool = Boolean.valueOf(t instanceof Map);
                            }
                            if (!C52711k.m112239a((Object) bool, (Object) Boolean.valueOf(true))) {
                                return C52711k.m112239a((Object) t2, (Object) t);
                            }
                            if (t != null) {
                                Map map = (Map) t;
                                if (t2 != null) {
                                    Map map2 = (Map) t2;
                                    if (map.size() != map2.size()) {
                                        return false;
                                    }
                                    Iterable entrySet = map.entrySet();
                                    if (!(entrySet instanceof Collection) || !((Collection) entrySet).isEmpty()) {
                                        Iterator it = entrySet.iterator();
                                        if (it.hasNext()) {
                                            Entry entry = (Entry) it.next();
                                            Object key = entry.getKey();
                                            Object value = entry.getValue();
                                            if (map2 == null) {
                                                throw new C52857u("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
                                            } else if (!map2.containsKey(key)) {
                                                return false;
                                            } else {
                                                if (!C11705e.f31153d.mo22485a(value, map2.get(key))) {
                                                    return false;
                                                }
                                                return true;
                                            }
                                        }
                                    }
                                    return true;
                                }
                                throw new C52857u("null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                            }
                            throw new C52857u("null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                        } else if (t != null) {
                            Object[] objArr = (Object[]) t;
                            if (t2 != null) {
                                Object[] objArr2 = (Object[]) t2;
                                if (objArr.length != objArr2.length) {
                                    return false;
                                }
                                Iterator a = C52701b.m112223a(objArr);
                                Iterator a2 = C52701b.m112223a(objArr2);
                                while (a.hasNext() && a2.hasNext()) {
                                    if (!C11705e.f31153d.mo22485a(a.next(), a2.next())) {
                                        return false;
                                    }
                                }
                                return true;
                            }
                            throw new C52857u("null cannot be cast to non-null type kotlin.Array<*>");
                        } else {
                            throw new C52857u("null cannot be cast to non-null type kotlin.Array<*>");
                        }
                    } else if (t != null) {
                        List list = (List) t;
                        if (t2 != null) {
                            List list2 = (List) t2;
                            if (list.size() != list2.size()) {
                                return false;
                            }
                            ListIterator listIterator = list.listIterator();
                            ListIterator listIterator2 = list2.listIterator();
                            while (listIterator.hasNext() && listIterator2.hasNext()) {
                                if (!C11705e.f31153d.mo22485a(listIterator.next(), listIterator2.next())) {
                                    return false;
                                }
                            }
                            return true;
                        }
                        throw new C52857u("null cannot be cast to non-null type kotlin.collections.List<*>");
                    } else {
                        throw new C52857u("null cannot be cast to non-null type kotlin.collections.List<*>");
                    }
                } else if (t != null) {
                    C11702b bVar = (C11702b) t;
                    if (t2 == null) {
                        C52711k.m112234a();
                    }
                    return bVar.mo22484a(t2);
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.bytedance.jedi.model.sync.ISyncComparable<T>");
                }
            } else if ((t instanceof Collection) || (t instanceof Map) || (t instanceof Object[])) {
                return false;
            } else {
                return true;
            }
        }
    }

    /* renamed from: com.bytedance.jedi.a.k.e$c */
    static final class C11712c<K, V, K1, V1> implements C1673aa<C52847n<? extends K, ? extends V>, C52847n<? extends K1, ? extends V1>> {

        /* renamed from: a */
        public final C11574e<K1, V1> f31165a;

        /* renamed from: b */
        public final C11682a<K, V, K1, V1> f31166b;

        /* renamed from: com.bytedance.jedi.a.k.e$c$a */
        static final class C11713a<T, R> implements C1711f<T, C2206z<? extends R>> {

            /* renamed from: a */
            final /* synthetic */ C11712c f31167a;

            C11713a(C11712c cVar) {
                this.f31167a = cVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                C52847n nVar = (C52847n) obj;
                C52711k.m112240b(nVar, "<name for destructuring parameter 0>");
                final Object component1 = nVar.component1();
                final Object component2 = nVar.component2();
                C11682a<K, V, K1, V1> aVar = this.f31167a.f31166b;
                if (aVar instanceof C11689c) {
                    return C2201v.m6614b(((C11689c) this.f31167a.f31166b).f31141b.invoke(component1, component2)).mo6520a((C1711f<? super T, ? extends C2206z<? extends R>>) new C1711f<T, C2206z<? extends R>>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C11713a f31168a;

                        {
                            this.f31168a = r1;
                        }

                        public final /* synthetic */ Object apply(final Object obj) {
                            return this.f31168a.f31167a.f31165a.mo22299a(obj).mo6541d((C1711f<? super T, ? extends R>) new C1711f<T, R>() {
                                public final /* synthetic */ Object apply(Object obj) {
                                    C11575f fVar = (C11575f) obj;
                                    C52711k.m112240b(fVar, "it");
                                    return C52856t.m112465a(obj, fVar.mo22313a());
                                }
                            });
                        }
                    }).mo6541d((C1711f<? super T, ? extends R>) new C1711f<T, R>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C11713a f31170a;

                        {
                            this.f31170a = r1;
                        }

                        public final /* synthetic */ Object apply(Object obj) {
                            C52847n nVar = (C52847n) obj;
                            C52711k.m112240b(nVar, "<name for destructuring parameter 0>");
                            Object component1 = nVar.component1();
                            Object component2 = nVar.component2();
                            Object invoke = ((C11689c) this.f31170a.f31167a.f31166b).f31142c.invoke(component1, component2, component2);
                            if (C11705e.f31153d.mo22485a(invoke, component2)) {
                                invoke = null;
                            }
                            return C52856t.m112465a(component1, invoke);
                        }
                    });
                }
                if (aVar instanceof C11692d) {
                    return C2159a.m6512a(this.f31167a.f31165a.mo22298a()).mo6522a((C1715j<? super T>) new C1715j<C52847n<? extends K1, ? extends V1>>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C11713a f31173a;

                        {
                            this.f31173a = r1;
                        }

                        /* renamed from: a */
                        public final /* synthetic */ boolean mo6207a(Object obj) {
                            Boolean bool;
                            C52847n nVar = (C52847n) obj;
                            C52711k.m112240b(nVar, "<name for destructuring parameter 0>");
                            Object component2 = nVar.component2();
                            if (C52568f.m112082c(new Object[]{component2, component2}).size() == 2) {
                                C52682m<? super V, ? super V1, Boolean> mVar = ((C11692d) this.f31173a.f31167a.f31166b).f31145b;
                                Object obj2 = component2;
                                if (obj2 == null) {
                                    C52711k.m112234a();
                                }
                                if (component2 == null) {
                                    C52711k.m112234a();
                                }
                                bool = Boolean.valueOf(((Boolean) mVar.invoke(obj2, component2)).booleanValue());
                            } else {
                                bool = null;
                            }
                            if (bool != null) {
                                return bool.booleanValue();
                            }
                            return false;
                        }
                    }).mo6541d((C1711f<? super T, ? extends R>) new C1711f<T, R>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C11713a f31175a;

                        {
                            this.f31175a = r1;
                        }

                        public final /* synthetic */ Object apply(Object obj) {
                            C52847n nVar = (C52847n) obj;
                            C52711k.m112240b(nVar, "<name for destructuring parameter 0>");
                            Object component1 = nVar.component1();
                            Object component2 = nVar.component2();
                            C52682m<? super V, ? super V1, ? extends V1> mVar = ((C11692d) this.f31175a.f31167a.f31166b).f31146c;
                            Object obj2 = component2;
                            if (obj2 == null) {
                                C52711k.m112234a();
                            }
                            if (component2 == null) {
                                C52711k.m112234a();
                            }
                            Object invoke = mVar.invoke(obj2, component2);
                            if (C11705e.f31153d.mo22485a(invoke, component2)) {
                                invoke = null;
                            }
                            return C52856t.m112465a(component1, invoke);
                        }
                    });
                }
                throw new RuntimeException();
            }
        }

        /* renamed from: com.bytedance.jedi.a.k.e$c$b */
        static final class C11719b<T> implements C1715j<C52847n<? extends K1, ? extends V1>> {

            /* renamed from: a */
            public static final C11719b f31177a = new C11719b();

            C11719b() {
            }

            /* renamed from: a */
            public final /* synthetic */ boolean mo6207a(Object obj) {
                C52847n nVar = (C52847n) obj;
                C52711k.m112240b(nVar, "it");
                if (nVar.getSecond() != null) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: a */
        public final C2206z<C52847n<K1, V1>> mo6134a(C2201v<C52847n<K, V>> vVar) {
            C52711k.m112240b(vVar, "upstream");
            C2201v a = vVar.mo6520a((C1711f<? super T, ? extends C2206z<? extends R>>) new C11713a<Object,Object>(this)).mo6522a((C1715j<? super T>) C11719b.f31177a);
            C52711k.m112236a((Object) a, "upstream.flatMap { (newK…ter { it.second != null }");
            return a;
        }

        public C11712c(C11574e<K1, V1> eVar, C11682a<K, V, K1, V1> aVar) {
            C52711k.m112240b(eVar, "to");
            C52711k.m112240b(aVar, "mergeStrategy");
            this.f31165a = eVar;
            this.f31166b = aVar;
        }
    }

    /* renamed from: com.bytedance.jedi.a.k.e$d */
    public static final class C11720d<T> implements C1715j<C11730b<C52847n<? extends K, ? extends V>>> {

        /* renamed from: a */
        final /* synthetic */ C11705e f31178a;

        public C11720d(C11705e eVar) {
            this.f31178a = eVar;
        }

        /* renamed from: a */
        public final /* synthetic */ boolean mo6207a(Object obj) {
            C11730b bVar = (C11730b) obj;
            C52711k.m112240b(bVar, "traceable");
            C11729a c = this.f31178a.f31155b.mo22311c();
            boolean z = false;
            if (c != null) {
                if (bVar.mo22488a(c)) {
                    return false;
                }
                z = true;
            }
            return z;
        }
    }

    /* renamed from: com.bytedance.jedi.a.k.e$e */
    public static final class C11721e<T, R> implements C1711f<T, C2206z<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ C11705e f31179a;

        public C11721e(C11705e eVar) {
            this.f31179a = eVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            C2201v vVar;
            final C11730b bVar = (C11730b) obj;
            C52711k.m112240b(bVar, "traceable");
            if (this.f31179a.f31156c instanceof C11683a) {
                vVar = C2201v.m6614b(bVar.mo22487a()).mo6522a((C1715j<? super T>) C117221.f31180a).mo6541d((C1711f<? super T, ? extends R>) C117232.f31181a).mo6513a((C1673aa<? super T, ? extends R>) new C11706a<Object,Object>(this.f31179a.f31155b, this.f31179a.f31156c));
            } else {
                vVar = C2201v.m6614b(bVar.mo22487a()).mo6513a((C1673aa<? super T, ? extends R>) new C11712c<Object,Object>(this.f31179a.f31155b, this.f31179a.f31156c));
            }
            return vVar.mo6541d((C1711f<? super T, ? extends R>) new C1711f<T, R>() {
                public final /* synthetic */ Object apply(Object obj) {
                    C52847n nVar = (C52847n) obj;
                    C52711k.m112240b(nVar, "it");
                    C11730b bVar = bVar;
                    C52711k.m112236a((Object) bVar, "traceable");
                    return C11734a.m24062a(nVar, bVar);
                }
            }).mo6535c((C1710e<? super Throwable>) C117254.f31183a).mo6532b((C2206z<? extends T>) C2201v.m6610b()).mo6523a((C2206z<? extends T>) C2201v.m6610b());
        }
    }

    /* renamed from: com.bytedance.jedi.a.k.e$f */
    public static final class C11726f<T> implements C1710e<C11730b<C52847n<? extends K1, ? extends V1>>> {

        /* renamed from: a */
        final /* synthetic */ C11705e f31184a;

        public C11726f(C11705e eVar) {
            this.f31184a = eVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C11730b bVar = (C11730b) obj;
            C11574e<K1, V1> eVar = this.f31184a.f31155b;
            if (!(eVar instanceof C11732d)) {
                eVar = null;
            }
            C11732d dVar = (C11732d) eVar;
            if (dVar != null) {
                C52711k.m112236a((Object) bVar, "it");
                dVar.mo22304b(bVar);
            }
        }
    }

    /* renamed from: com.bytedance.jedi.a.k.e$g */
    public static final /* synthetic */ class C11727g extends C52710j implements C52671b<Throwable, C52860x> {
        public static final C11727g INSTANCE = new C11727g();

        C11727g() {
            super(1);
        }

        public final String getName() {
            return "printStackTrace";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(Throwable.class);
        }

        public final String getSignature() {
            return "printStackTrace()V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((Throwable) obj, "p1");
            return C52860x.f131107a;
        }
    }

    public C11705e(C11574e<K, V> eVar, C11574e<K1, V1> eVar2, C11682a<K, V, K1, V1> aVar) {
        C52711k.m112240b(eVar, "from");
        C52711k.m112240b(eVar2, "to");
        C52711k.m112240b(aVar, "strategy");
        this.f31154a = eVar;
        this.f31155b = eVar2;
        this.f31156c = aVar;
    }
}
