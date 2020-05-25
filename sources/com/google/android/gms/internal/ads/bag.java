package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class bag implements Iterator<Entry<K, V>> {

    /* renamed from: a */
    private int f41711a;

    /* renamed from: b */
    private Iterator<Entry<K, V>> f41712b;

    /* renamed from: c */
    private final /* synthetic */ bae f41713c;

    private bag(bae bae) {
        this.f41713c = bae;
        this.f41711a = this.f41713c.f41706c.size();
    }

    public final boolean hasNext() {
        return (this.f41711a > 0 && this.f41711a <= this.f41713c.f41706c.size()) || m35080a().hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    private final Iterator<Entry<K, V>> m35080a() {
        if (this.f41712b == null) {
            this.f41712b = this.f41713c.f41709f.entrySet().iterator();
        }
        return this.f41712b;
    }

    public final /* synthetic */ Object next() {
        if (m35080a().hasNext()) {
            return (Entry) m35080a().next();
        }
        List b = this.f41713c.f41706c;
        int i = this.f41711a - 1;
        this.f41711a = i;
        return (Entry) b.get(i);
    }

    /* synthetic */ bag(bae bae, baf baf) {
        this(bae);
    }
}
