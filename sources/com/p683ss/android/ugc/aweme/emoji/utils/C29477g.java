package com.p683ss.android.ugc.aweme.emoji.utils;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.g */
public final class C29477g<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: a */
    private final int f77211a;

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

    public C29477g(int i) {
        this.f77211a = i;
    }

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Entry<K, V> entry) {
        if (size() > this.f77211a) {
            return true;
        }
        return false;
    }
}
