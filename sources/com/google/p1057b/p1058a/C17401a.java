package com.google.p1057b.p1058a;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.b.a.a */
final class C17401a<T> extends C17418j<T> {

    /* renamed from: a */
    static final C17401a<Object> f48937a = new C17401a<>();
    private static final long serialVersionUID = 0;

    private C17401a() {
    }

    private Object readResolve() {
        return f48937a;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final boolean isPresent() {
        return false;
    }

    public final T orNull() {
        return null;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    public final Set<T> asSet() {
        return Collections.emptySet();
    }

    public final T get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    /* renamed from: or */
    public final C17418j<T> mo33720or(C17418j<? extends T> jVar) {
        return (C17418j) C17421k.m42653a(jVar);
    }

    public final <V> C17418j<V> transform(C17410f<? super T, V> fVar) {
        C17421k.m42653a(fVar);
        return C17418j.absent();
    }

    /* renamed from: or */
    public final T mo33721or(C17432q<? extends T> qVar) {
        return C17421k.m42654a(qVar.get(), (Object) "use Optional.orNull() instead of a Supplier that returns null");
    }

    /* renamed from: or */
    public final T mo33722or(T t) {
        return C17421k.m42654a(t, (Object) "use Optional.orNull() instead of Optional.or(null)");
    }
}
