package com.google.p1057b.p1058a;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.b.a.n */
final class C17428n<T> extends C17418j<T> {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final T f48963a;

    public final T get() {
        return this.f48963a;
    }

    public final boolean isPresent() {
        return true;
    }

    public final T orNull() {
        return this.f48963a;
    }

    public final Set<T> asSet() {
        return Collections.singleton(this.f48963a);
    }

    public final int hashCode() {
        return this.f48963a.hashCode() + 1502476572;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Optional.of(");
        sb.append(this.f48963a);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: or */
    public final C17418j<T> mo33720or(C17418j<? extends T> jVar) {
        C17421k.m42653a(jVar);
        return this;
    }

    C17428n(T t) {
        this.f48963a = t;
    }

    /* renamed from: or */
    public final T mo33721or(C17432q<? extends T> qVar) {
        C17421k.m42653a(qVar);
        return this.f48963a;
    }

    /* renamed from: or */
    public final T mo33722or(T t) {
        C17421k.m42654a(t, (Object) "use Optional.orNull() instead of Optional.or(null)");
        return this.f48963a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17428n)) {
            return false;
        }
        return this.f48963a.equals(((C17428n) obj).f48963a);
    }

    public final <V> C17418j<V> transform(C17410f<? super T, V> fVar) {
        return new C17428n(C17421k.m42654a(fVar.mo33734a(this.f48963a), (Object) "the Function passed to Optional.transform() must not return null."));
    }
}
