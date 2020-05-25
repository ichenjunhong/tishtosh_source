package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

final class bde implements Iterator<E> {

    /* renamed from: a */
    private int f41922a;

    /* renamed from: b */
    private final /* synthetic */ bdd f41923b;

    bde(bdd bdd) {
        this.f41923b = bdd;
    }

    public final boolean hasNext() {
        return this.f41922a < this.f41923b.f41920a.size() || this.f41923b.f41921b.hasNext();
    }

    public final E next() {
        while (this.f41922a >= this.f41923b.f41920a.size()) {
            this.f41923b.f41920a.add(this.f41923b.f41921b.next());
        }
        List<E> list = this.f41923b.f41920a;
        int i = this.f41922a;
        this.f41922a = i + 1;
        return list.get(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
