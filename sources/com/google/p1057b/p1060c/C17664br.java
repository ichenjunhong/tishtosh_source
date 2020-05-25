package com.google.p1057b.p1060c;

import java.util.ListIterator;

/* renamed from: com.google.b.c.br */
abstract class C17664br<F, T> extends C17663bq<F, T> implements ListIterator<T> {
    /* renamed from: a */
    private ListIterator<? extends F> m43417a() {
        return (ListIterator) this.f49359b;
    }

    public final boolean hasPrevious() {
        return m43417a().hasPrevious();
    }

    public final int nextIndex() {
        return m43417a().nextIndex();
    }

    public final T previous() {
        return mo34141a(m43417a().previous());
    }

    public final int previousIndex() {
        return m43417a().previousIndex();
    }

    C17664br(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    public void add(T t) {
        throw new UnsupportedOperationException();
    }

    public void set(T t) {
        throw new UnsupportedOperationException();
    }
}
