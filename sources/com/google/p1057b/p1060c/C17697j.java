package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17410f;
import com.google.p1057b.p1058a.C17417i;
import com.google.p1057b.p1058a.C17421k;
import java.io.Serializable;

/* renamed from: com.google.b.c.j */
final class C17697j<F, T> extends C17638bb<F> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final C17410f<F, ? extends T> f49409a;

    /* renamed from: b */
    final C17638bb<T> f49410b;

    public final int hashCode() {
        return C17417i.m42645a(this.f49409a, this.f49410b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f49410b);
        sb.append(".onResultOf(");
        sb.append(this.f49409a);
        sb.append(")");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17697j)) {
            return false;
        }
        C17697j jVar = (C17697j) obj;
        if (!this.f49409a.equals(jVar.f49409a) || !this.f49410b.equals(jVar.f49410b)) {
            return false;
        }
        return true;
    }

    C17697j(C17410f<F, ? extends T> fVar, C17638bb<T> bbVar) {
        this.f49409a = (C17410f) C17421k.m42653a(fVar);
        this.f49410b = (C17638bb) C17421k.m42653a(bbVar);
    }

    public final int compare(F f, F f2) {
        return this.f49410b.compare(this.f49409a.mo33734a(f), this.f49409a.mo33734a(f2));
    }
}
