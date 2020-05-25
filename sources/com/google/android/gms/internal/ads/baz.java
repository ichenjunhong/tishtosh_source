package com.google.android.gms.internal.ads;

import java.util.Iterator;

final class baz implements Iterator<String> {

    /* renamed from: a */
    private Iterator<String> f41741a = this.f41742b.f41737a.iterator();

    /* renamed from: b */
    private final /* synthetic */ bax f41742b;

    baz(bax bax) {
        this.f41742b = bax;
    }

    public final boolean hasNext() {
        return this.f41741a.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f41741a.next();
    }
}
