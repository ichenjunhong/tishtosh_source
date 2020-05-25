package com.p683ss.android.ugc.aweme.utils;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.utils.cz */
public final class C47794cz {
    /* renamed from: a */
    private static <K, V> Map<K, V> m103424a() {
        return new HashMap();
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m103425a(K k, V v) {
        Map<K, V> a = m103424a();
        a.put(k, v);
        return a;
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m103426a(K k, V v, K k2, V v2) {
        Map<K, V> a = m103424a();
        a.put(k, v);
        a.put(k2, v2);
        return a;
    }
}
