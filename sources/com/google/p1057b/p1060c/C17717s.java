package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17418j;
import com.google.p1057b.p1058a.C17421k;
import com.google.p1057b.p1058a.C17422l;
import java.util.Iterator;

/* renamed from: com.google.b.c.s */
public abstract class C17717s<E> implements Iterable<E> {

    /* renamed from: a */
    private final C17418j<Iterable<E>> f49457a;

    protected C17717s() {
        this.f49457a = C17418j.absent();
    }

    /* renamed from: b */
    private Iterable<E> m43529b() {
        return (Iterable) this.f49457a.mo33722or(this);
    }

    /* renamed from: a */
    public final C17570ak<E> mo34477a() {
        return C17570ak.copyOf(m43529b());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        for (Object append : m43529b()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(append);
        }
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: a */
    public static <E> C17717s<E> m43528a(final Iterable<E> iterable) {
        if (iterable instanceof C17717s) {
            return (C17717s) iterable;
        }
        return new C17717s<E>(iterable) {
            public final Iterator<E> iterator() {
                return iterable.iterator();
            }
        };
    }

    C17717s(Iterable<E> iterable) {
        C17421k.m42653a(iterable);
        if (this == iterable) {
            iterable = null;
        }
        this.f49457a = C17418j.fromNullable(iterable);
    }

    /* renamed from: a */
    public final C17717s<E> mo34478a(C17422l<? super E> lVar) {
        return m43528a(C17583ao.m43256a(m43529b(), lVar));
    }
}
