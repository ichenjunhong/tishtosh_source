package com.p683ss.android.ugc.aweme.p1807im.sdk.share.model;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.model.a */
public final class C35128a<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: a */
    private final int f90341a;

    public final Set<Entry<K, V>> entrySet() {
        return getEntries();
    }

    public final Set getEntries() {
        return super.entrySet();
    }

    public final Set getKeys() {
        return super.keySet();
    }

    public final int getSize() {
        return super.size();
    }

    public final Collection getValues() {
        return super.values();
    }

    public final Set<K> keySet() {
        return getKeys();
    }

    public final int size() {
        return getSize();
    }

    public final Collection<V> values() {
        return getValues();
    }

    public C35128a(int i) {
        this.f90341a = i;
    }

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Entry<K, V> entry) {
        if (size() > this.f90341a) {
            return true;
        }
        return false;
    }
}
