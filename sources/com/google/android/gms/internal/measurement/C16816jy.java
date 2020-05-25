package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.measurement.jy */
final class C16816jy implements ListIterator<String> {

    /* renamed from: a */
    private ListIterator<String> f47221a = this.f47223c.f47220a.listIterator(this.f47222b);

    /* renamed from: b */
    private final /* synthetic */ int f47222b;

    /* renamed from: c */
    private final /* synthetic */ C16815jx f47223c;

    C16816jy(C16815jx jxVar, int i) {
        this.f47223c = jxVar;
        this.f47222b = i;
    }

    public final boolean hasNext() {
        return this.f47221a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f47221a.hasPrevious();
    }

    public final int nextIndex() {
        return this.f47221a.nextIndex();
    }

    public final int previousIndex() {
        return this.f47221a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object previous() {
        return (String) this.f47221a.previous();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f47221a.next();
    }
}
