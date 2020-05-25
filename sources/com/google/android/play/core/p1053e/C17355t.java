package com.google.android.play.core.p1053e;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.android.play.core.e.t */
public final class C17355t {

    /* renamed from: a */
    private final Map<String, Map<String, String>> f48868a;

    private C17355t(Map<String, Map<String, String>> map) {
        this.f48868a = map;
    }

    /* synthetic */ C17355t(Map map, byte b) {
        this(map);
    }

    /* renamed from: a */
    public final Map<String, Set<String>> mo33650a(Collection<String> collection) {
        Set set;
        HashMap hashMap = new HashMap();
        for (String str : this.f48868a.keySet()) {
            if (!this.f48868a.containsKey(str)) {
                set = Collections.emptySet();
            } else {
                HashSet hashSet = new HashSet();
                for (Entry entry : ((Map) this.f48868a.get(str)).entrySet()) {
                    if (collection.contains(entry.getKey())) {
                        hashSet.add((String) entry.getValue());
                    }
                }
                set = Collections.unmodifiableSet(hashSet);
            }
            hashMap.put(str, set);
        }
        return hashMap;
    }
}
