package com.google.p1057b.p1058a;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.b.a.j */
public abstract class C17418j<T> implements Serializable {
    private static final long serialVersionUID = 0;

    C17418j() {
    }

    public static <T> C17418j<T> absent() {
        return C17401a.f48937a;
    }

    public abstract Set<T> asSet();

    public abstract boolean equals(Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    /* renamed from: or */
    public abstract C17418j<T> mo33720or(C17418j<? extends T> jVar);

    /* renamed from: or */
    public abstract T mo33721or(C17432q<? extends T> qVar);

    /* renamed from: or */
    public abstract T mo33722or(T t);

    public abstract T orNull();

    public abstract String toString();

    public abstract <V> C17418j<V> transform(C17410f<? super T, V> fVar);

    public static <T> C17418j<T> fromNullable(T t) {
        if (t == null) {
            return absent();
        }
        return new C17428n(t);
    }

    /* renamed from: of */
    public static <T> C17418j<T> m42647of(T t) {
        return new C17428n(C17421k.m42653a(t));
    }

    public static <T> Iterable<T> presentInstances(final Iterable<? extends C17418j<? extends T>> iterable) {
        C17421k.m42653a(iterable);
        return new Iterable<T>() {
            public final Iterator<T> iterator() {
                return new C17402b<T>() {

                    /* renamed from: c */
                    private final Iterator<? extends C17418j<? extends T>> f48959c = ((Iterator) C17421k.m42653a(iterable.iterator()));

                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public final T mo33726a() {
                        while (this.f48959c.hasNext()) {
                            C17418j jVar = (C17418j) this.f48959c.next();
                            if (jVar.isPresent()) {
                                return jVar.get();
                            }
                        }
                        this.f48938a = C17404a.DONE;
                        return null;
                    }
                };
            }
        };
    }
}
