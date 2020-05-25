package com.google.android.gms.common.util;

import android.support.p030v4.p038f.C0777a;
import android.support.p030v4.p038f.C0779b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.common.util.f */
public final class C15515f {
    /* renamed from: a */
    public static <T> List<T> m32274a(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList(tArr));
    }

    /* renamed from: a */
    public static <T> Set<T> m32276a(int i, boolean z) {
        if (i <= 256) {
            return new C0779b(i);
        }
        return new HashSet(i, 1.0f);
    }

    /* renamed from: b */
    public static <K, V> Map<K, V> m32277b(int i, boolean z) {
        if (i <= 256) {
            return new C0777a(i);
        }
        return new HashMap(i, 1.0f);
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m32275a(K k, V v, K k2, V v2, K k3, V v3) {
        Map b = m32277b(3, false);
        b.put(k, v);
        b.put(k2, v2);
        b.put(k3, v3);
        return Collections.unmodifiableMap(b);
    }
}
