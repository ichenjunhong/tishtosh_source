package com.google.android.gms.internal.ads;

import java.util.Map.Entry;

final class ayo<K> implements Entry<K, Object> {

    /* renamed from: a */
    Entry<K, aym> f41638a;

    private ayo(Entry<K, aym> entry) {
        this.f41638a = entry;
    }

    public final K getKey() {
        return this.f41638a.getKey();
    }

    public final Object getValue() {
        if (((aym) this.f41638a.getValue()) == null) {
            return null;
        }
        return aym.m34789a();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof azj) {
            aym aym = (aym) this.f41638a.getValue();
            azj azj = (azj) obj;
            azj azj2 = aym.f41642b;
            aym.f41641a = null;
            aym.f41643c = null;
            aym.f41642b = azj;
            return azj2;
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
