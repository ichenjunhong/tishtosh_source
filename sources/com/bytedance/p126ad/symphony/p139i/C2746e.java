package com.bytedance.p126ad.symphony.p139i;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ad.symphony.i.e */
public final class C2746e<K, V> extends ConcurrentHashMap<K, V> {
    public C2746e() {
    }

    public C2746e(int i) {
        super(i);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        try {
            super.putAll(map);
        } catch (Exception unused) {
        }
    }

    public C2746e(Map<? extends K, ? extends V> map) {
        super(map);
    }

    public C2746e(int i, float f) {
        super(i, f);
    }

    public final V put(K k, V v) {
        if (k == null || v == null) {
            return null;
        }
        return super.put(k, v);
    }

    public C2746e(int i, float f, int i2) {
        super(i, f, i2);
    }
}
