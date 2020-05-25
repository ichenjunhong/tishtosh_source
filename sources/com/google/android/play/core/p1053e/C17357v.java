package com.google.android.play.core.p1053e;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.play.core.e.v */
public final class C17357v {

    /* renamed from: a */
    final Map<String, Map<String, String>> f48871a = new HashMap();

    /* renamed from: a */
    public final C17355t mo33651a() {
        HashMap hashMap = new HashMap();
        for (Entry entry : this.f48871a.entrySet()) {
            hashMap.put((String) entry.getKey(), Collections.unmodifiableMap(new HashMap((Map) entry.getValue())));
        }
        return new C17355t(Collections.unmodifiableMap(hashMap), 0);
    }
}
