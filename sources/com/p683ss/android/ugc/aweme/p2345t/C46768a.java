package com.p683ss.android.ugc.aweme.p2345t;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.t.a */
public final class C46768a {

    /* renamed from: a */
    public static final C46768a f118123a = new C46768a();

    private C46768a() {
    }

    /* renamed from: a */
    public static final void m101572a(HashMap<String, Integer> hashMap, Set<String> set, Set<String> set2) {
        C52711k.m112240b(hashMap, "map");
        C52711k.m112240b(set, "shownSet");
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C52711k.m112236a(next, "it.next()");
            Entry entry = (Entry) next;
            if (set.contains(entry.getKey()) || (set2 != null && set2.contains(entry.getKey()))) {
                it.remove();
            }
        }
    }
}
