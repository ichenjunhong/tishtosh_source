package p2628d.p2629a;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p2628d.C52847n;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2649l.C52785g;

/* renamed from: d.a.ae */
public class C52553ae extends C52552ad {
    /* renamed from: a */
    public static final <K, V> void m112054a(Map<? super K, ? super V> map, C52847n<? extends K, ? extends V>[] nVarArr) {
        C52711k.m112240b(map, "$this$putAll");
        C52711k.m112240b(nVarArr, "pairs");
        for (C52847n<? extends K, ? extends V> nVar : nVarArr) {
            map.put(nVar.component1(), nVar.component2());
        }
    }

    /* renamed from: a */
    public static final <K, V> void m112053a(Map<? super K, ? super V> map, Iterable<? extends C52847n<? extends K, ? extends V>> iterable) {
        C52711k.m112240b(map, "$this$putAll");
        C52711k.m112240b(iterable, "pairs");
        for (C52847n nVar : iterable) {
            map.put(nVar.component1(), nVar.component2());
        }
    }

    /* renamed from: a */
    public static final <K, V> void m112052a(Map<? super K, ? super V> map, C52785g<? extends C52847n<? extends K, ? extends V>> gVar) {
        C52711k.m112240b(map, "$this$putAll");
        C52711k.m112240b(gVar, "pairs");
        Iterator a = gVar.mo110157a();
        while (a.hasNext()) {
            C52847n nVar = (C52847n) a.next();
            map.put(nVar.component1(), nVar.component2());
        }
    }

    /* renamed from: a */
    public static final <K, V> Map<K, V> m112045a() {
        C52591y yVar = C52591y.f130883a;
        if (yVar != null) {
            return yVar;
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
    }

    /* renamed from: c */
    public static final <K, V> Map<K, V> m112058c(Map<? extends K, ? extends V> map) {
        C52711k.m112240b(map, "$this$toMutableMap");
        return new LinkedHashMap<>(map);
    }

    /* renamed from: a */
    public static final int m112044a(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return i + (i / 3);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public static final <K, V> Map<K, V> m112056b(C52847n<? extends K, ? extends V>... nVarArr) {
        C52711k.m112240b(nVarArr, "pairs");
        Map<K, V> linkedHashMap = new LinkedHashMap<>(C52550ab.m112044a(nVarArr.length));
        C52550ab.m112054a(linkedHashMap, nVarArr);
        return linkedHashMap;
    }

    /* renamed from: c */
    public static final <K, V> HashMap<K, V> m112057c(C52847n<? extends K, ? extends V>... nVarArr) {
        C52711k.m112240b(nVarArr, "pairs");
        HashMap<K, V> hashMap = new HashMap<>(C52550ab.m112044a(nVarArr.length));
        C52550ab.m112054a((Map<? super K, ? super V>) hashMap, nVarArr);
        return hashMap;
    }

    /* renamed from: d */
    public static final <K, V> Map<K, V> m112059d(Map<K, ? extends V> map) {
        C52711k.m112240b(map, "$this$optimizeReadOnlyMap");
        switch (map.size()) {
            case 0:
                return C52550ab.m112045a();
            case 1:
                return C52550ab.m112043a(map);
            default:
                return map;
        }
    }

    /* renamed from: a */
    public static final <K, V> Map<K, V> m112046a(C52785g<? extends C52847n<? extends K, ? extends V>> gVar) {
        C52711k.m112240b(gVar, "$this$toMap");
        return C52550ab.m112059d(C52550ab.m112047a(gVar, (M) new LinkedHashMap()));
    }

    /* renamed from: b */
    public static final <K, V> Map<K, V> m112055b(Map<? extends K, ? extends V> map) {
        C52711k.m112240b(map, "$this$toMap");
        switch (map.size()) {
            case 0:
                return C52550ab.m112045a();
            case 1:
                return C52550ab.m112043a(map);
            default:
                return C52550ab.m112058c(map);
        }
    }

    /* renamed from: a */
    public static final <K, V> Map<K, V> m112048a(Iterable<? extends C52847n<? extends K, ? extends V>> iterable) {
        C52711k.m112240b(iterable, "$this$toMap");
        Collection collection = (Collection) iterable;
        switch (collection.size()) {
            case 0:
                return C52550ab.m112045a();
            case 1:
                return C52550ab.m112042a((C52847n) ((List) iterable).get(0));
            default:
                return C52550ab.m112049a(iterable, (M) new LinkedHashMap(C52550ab.m112044a(collection.size())));
        }
    }

    /* renamed from: a */
    public static final <K, V> Map<K, V> m112050a(C52847n<? extends K, ? extends V>... nVarArr) {
        C52711k.m112240b(nVarArr, "pairs");
        if (nVarArr.length > 0) {
            return C52550ab.m112051a(nVarArr, (M) new LinkedHashMap(C52550ab.m112044a(nVarArr.length)));
        }
        return C52550ab.m112045a();
    }

    /* renamed from: a */
    public static final <K, V, M extends Map<? super K, ? super V>> M m112047a(C52785g<? extends C52847n<? extends K, ? extends V>> gVar, M m) {
        C52711k.m112240b(gVar, "$this$toMap");
        C52711k.m112240b(m, "destination");
        C52550ab.m112052a((Map<? super K, ? super V>) m, gVar);
        return m;
    }

    /* renamed from: a */
    public static final <K, V, M extends Map<? super K, ? super V>> M m112049a(Iterable<? extends C52847n<? extends K, ? extends V>> iterable, M m) {
        C52711k.m112240b(iterable, "$this$toMap");
        C52711k.m112240b(m, "destination");
        C52550ab.m112053a((Map<? super K, ? super V>) m, iterable);
        return m;
    }

    /* renamed from: a */
    public static final <K, V, M extends Map<? super K, ? super V>> M m112051a(C52847n<? extends K, ? extends V>[] nVarArr, M m) {
        C52711k.m112240b(nVarArr, "$this$toMap");
        C52711k.m112240b(m, "destination");
        C52550ab.m112054a((Map<? super K, ? super V>) m, nVarArr);
        return m;
    }
}
