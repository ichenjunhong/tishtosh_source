package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

class bao extends AbstractSet<Entry<K, V>> {

    /* renamed from: a */
    private final /* synthetic */ bae f41729a;

    private bao(bae bae) {
        this.f41729a = bae;
    }

    public Iterator<Entry<K, V>> iterator() {
        return new bam(this.f41729a, null);
    }

    public int size() {
        return this.f41729a.size();
    }

    public boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.f41729a.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public boolean remove(Object obj) {
        Entry entry = (Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f41729a.remove(entry.getKey());
        return true;
    }

    public void clear() {
        this.f41729a.clear();
    }

    public /* synthetic */ boolean add(Object obj) {
        Entry entry = (Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f41729a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    /* synthetic */ bao(bae bae, baf baf) {
        this(bae);
    }
}
