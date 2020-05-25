package com.google.android.gms.internal.ads;

import java.util.ListIterator;

final class bay implements ListIterator<String> {

    /* renamed from: a */
    private ListIterator<String> f41738a = this.f41740c.f41737a.listIterator(this.f41739b);

    /* renamed from: b */
    private final /* synthetic */ int f41739b;

    /* renamed from: c */
    private final /* synthetic */ bax f41740c;

    bay(bax bax, int i) {
        this.f41740c = bax;
        this.f41739b = i;
    }

    public final boolean hasNext() {
        return this.f41738a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f41738a.hasPrevious();
    }

    public final int nextIndex() {
        return this.f41738a.nextIndex();
    }

    public final int previousIndex() {
        return this.f41738a.previousIndex();
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
        return (String) this.f41738a.previous();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f41738a.next();
    }
}
