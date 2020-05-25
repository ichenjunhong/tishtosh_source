package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17410f;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.google.b.c.bb */
public abstract class C17638bb<T> implements Comparator<T> {
    protected C17638bb() {
    }

    /* renamed from: b */
    public static <C extends Comparable> C17638bb<C> m43359b() {
        return C17631ay.f49302a;
    }

    public abstract int compare(T t, T t2);

    /* renamed from: a */
    public <S extends T> C17638bb<S> mo34218a() {
        return new C17653bj(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final <T2 extends T> C17638bb<Entry<T2, ?>> mo34235c() {
        return mo34232a(C17598as.m43281a());
    }

    /* renamed from: b */
    public final <E extends T> C17530ab<E> mo34234b(Iterable<E> iterable) {
        return C17530ab.sortedCopyOf(this, iterable);
    }

    /* renamed from: a */
    public static <T> C17638bb<T> m43358a(Comparator<T> comparator) {
        if (comparator instanceof C17638bb) {
            return (C17638bb) comparator;
        }
        return new C17714p(comparator);
    }

    /* renamed from: a */
    public final <F> C17638bb<F> mo34232a(C17410f<F, ? extends T> fVar) {
        return new C17697j(fVar, this);
    }

    /* renamed from: a */
    public final <E extends T> List<E> mo34233a(Iterable<E> iterable) {
        Object[] a = C17583ao.m43260a(iterable);
        Arrays.sort(a, this);
        return C17593ar.m43275a((Iterable<? extends E>) Arrays.asList(a));
    }
}
