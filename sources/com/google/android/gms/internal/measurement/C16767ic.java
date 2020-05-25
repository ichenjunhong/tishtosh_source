package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.ic */
public final class C16767ic<K, V> {
    /* renamed from: a */
    static <K, V> void m40374a(C16709gj gjVar, C16768id<K, V> idVar, K k, V v) throws IOException {
        C16726gu.m40247a(gjVar, idVar.f47138a, 1, k);
        C16726gu.m40247a(gjVar, idVar.f47140c, 2, v);
    }

    /* renamed from: a */
    static <K, V> int m40373a(C16768id<K, V> idVar, K k, V v) {
        return C16726gu.m40243a(idVar.f47138a, 1, k) + C16726gu.m40243a(idVar.f47140c, 2, v);
    }
}
