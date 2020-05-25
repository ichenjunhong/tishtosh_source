package com.bytedance.android.monitor.webview.p464a;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.monitor.webview.a.a */
public final class C8890a<K, V> extends ConcurrentHashMap<K, V> {
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return super.containsKey(obj);
    }

    public final V get(Object obj) {
        if (obj == null) {
            return null;
        }
        return super.get(obj);
    }

    public final V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        return super.remove(obj);
    }

    public final V put(K k, V v) {
        if (k == null || v == null) {
            return null;
        }
        return super.put(k, v);
    }
}
