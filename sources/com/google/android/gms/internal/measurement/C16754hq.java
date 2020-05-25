package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.hq */
final class C16754hq<K> implements Iterator<Entry<K, Object>> {

    /* renamed from: a */
    private Iterator<Entry<K, Object>> f47118a;

    public C16754hq(Iterator<Entry<K, Object>> it) {
        this.f47118a = it;
    }

    public final boolean hasNext() {
        return this.f47118a.hasNext();
    }

    public final void remove() {
        this.f47118a.remove();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.f47118a.next();
        return entry.getValue() instanceof C16751hn ? new C16753hp(entry) : entry;
    }
}
