package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.jz */
final class C16817jz implements Iterator<String> {

    /* renamed from: a */
    private Iterator<String> f47224a = this.f47225b.f47220a.iterator();

    /* renamed from: b */
    private final /* synthetic */ C16815jx f47225b;

    C16817jz(C16815jx jxVar) {
        this.f47225b = jxVar;
    }

    public final boolean hasNext() {
        return this.f47224a.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f47224a.next();
    }
}
