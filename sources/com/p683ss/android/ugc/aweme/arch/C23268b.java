package com.p683ss.android.ugc.aweme.arch;

import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.arch.b */
public final class C23268b<K, V> {

    /* renamed from: a */
    private HashMap<K, V> f62217a = new HashMap<>();

    /* renamed from: a */
    public final <T> T mo48213a(K k) {
        T t = this.f62217a.get(k);
        if (t != null) {
            return t;
        }
        return null;
    }

    /* renamed from: a */
    public final C23268b<K, V> mo48212a(K k, V v) {
        this.f62217a.put(k, v);
        return this;
    }
}
