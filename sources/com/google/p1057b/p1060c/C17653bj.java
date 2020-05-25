package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17421k;
import java.io.Serializable;

/* renamed from: com.google.b.c.bj */
final class C17653bj<T> extends C17638bb<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final C17638bb<? super T> f49355a;

    /* renamed from: a */
    public final <S extends T> C17638bb<S> mo34218a() {
        return this.f49355a;
    }

    public final int hashCode() {
        return -this.f49355a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f49355a);
        sb.append(".reverse()");
        return sb.toString();
    }

    C17653bj(C17638bb<? super T> bbVar) {
        this.f49355a = (C17638bb) C17421k.m42653a(bbVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17653bj)) {
            return false;
        }
        return this.f49355a.equals(((C17653bj) obj).f49355a);
    }

    public final int compare(T t, T t2) {
        return this.f49355a.compare(t2, t);
    }
}
