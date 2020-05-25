package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17421k;
import java.util.Iterator;

/* renamed from: com.google.b.c.bq */
abstract class C17663bq<F, T> implements Iterator<T> {

    /* renamed from: b */
    final Iterator<? extends F> f49359b;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract T mo34141a(F f);

    public final boolean hasNext() {
        return this.f49359b.hasNext();
    }

    public final void remove() {
        this.f49359b.remove();
    }

    public final T next() {
        return mo34141a(this.f49359b.next());
    }

    C17663bq(Iterator<? extends F> it) {
        this.f49359b = (Iterator) C17421k.m42653a(it);
    }
}
