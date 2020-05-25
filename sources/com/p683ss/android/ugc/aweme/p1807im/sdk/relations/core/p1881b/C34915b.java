package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b.b */
public final class C34915b {
    /* renamed from: a */
    public static final <R> List<R> m79023a(LinkedHashMap<C34922e<R>, List<R>> linkedHashMap) {
        C52711k.m112240b(linkedHashMap, "$this$toResultList");
        List<R> arrayList = new ArrayList<>();
        Collection<List> values = linkedHashMap.values();
        C52711k.m112236a((Object) values, "values");
        for (List list : values) {
            C52711k.m112236a((Object) list, "list");
            arrayList.addAll(list);
        }
        return arrayList;
    }
}
