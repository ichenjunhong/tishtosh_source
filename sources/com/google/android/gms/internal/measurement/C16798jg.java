package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.jg */
final class C16798jg implements Iterator<Entry<K, V>> {

    /* renamed from: a */
    private int f47195a;

    /* renamed from: b */
    private Iterator<Entry<K, V>> f47196b;

    /* renamed from: c */
    private final /* synthetic */ C16796je f47197c;

    private C16798jg(C16796je jeVar) {
        this.f47197c = jeVar;
        this.f47195a = this.f47197c.f47190c.size();
    }

    public final boolean hasNext() {
        return (this.f47195a > 0 && this.f47195a <= this.f47197c.f47190c.size()) || m40601a().hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    private final Iterator<Entry<K, V>> m40601a() {
        if (this.f47196b == null) {
            this.f47196b = this.f47197c.f47193f.entrySet().iterator();
        }
        return this.f47196b;
    }

    public final /* synthetic */ Object next() {
        if (m40601a().hasNext()) {
            return (Entry) m40601a().next();
        }
        List b = this.f47197c.f47190c;
        int i = this.f47195a - 1;
        this.f47195a = i;
        return (Entry) b.get(i);
    }

    /* synthetic */ C16798jg(C16796je jeVar, C16797jf jfVar) {
        this(jeVar);
    }
}
