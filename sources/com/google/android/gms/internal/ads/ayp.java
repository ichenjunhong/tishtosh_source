package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map.Entry;

final class ayp<K> implements Iterator<Entry<K, Object>> {

    /* renamed from: a */
    private Iterator<Entry<K, Object>> f41639a;

    public ayp(Iterator<Entry<K, Object>> it) {
        this.f41639a = it;
    }

    public final boolean hasNext() {
        return this.f41639a.hasNext();
    }

    public final void remove() {
        this.f41639a.remove();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.f41639a.next();
        return entry.getValue() instanceof aym ? new ayo(entry) : entry;
    }
}
