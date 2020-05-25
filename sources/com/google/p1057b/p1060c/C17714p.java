package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17421k;
import java.io.Serializable;
import java.util.Comparator;

/* renamed from: com.google.b.c.p */
final class C17714p<T> extends C17638bb<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final Comparator<T> f49454a;

    public final int hashCode() {
        return this.f49454a.hashCode();
    }

    public final String toString() {
        return this.f49454a.toString();
    }

    C17714p(Comparator<T> comparator) {
        this.f49454a = (Comparator) C17421k.m42653a(comparator);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17714p)) {
            return false;
        }
        return this.f49454a.equals(((C17714p) obj).f49454a);
    }

    public final int compare(T t, T t2) {
        return this.f49454a.compare(t, t2);
    }
}
