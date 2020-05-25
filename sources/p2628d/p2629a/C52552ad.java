package p2628d.p2629a;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: d.a.ad */
public class C52552ad extends C52551ac {
    /* renamed from: a */
    public static final <K, V> Map<K, V> m112042a(C52847n<? extends K, ? extends V> nVar) {
        C52711k.m112240b(nVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(nVar.getFirst(), nVar.getSecond());
        C52711k.m112236a((Object) singletonMap, "java.util.Collections.si…(pair.first, pair.second)");
        return singletonMap;
    }

    /* renamed from: a */
    public static final <K, V> Map<K, V> m112043a(Map<? extends K, ? extends V> map) {
        C52711k.m112240b(map, "$this$toSingletonMap");
        Entry entry = (Entry) map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        C52711k.m112236a((Object) singletonMap, "java.util.Collections.singletonMap(key, value)");
        C52711k.m112236a((Object) singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
