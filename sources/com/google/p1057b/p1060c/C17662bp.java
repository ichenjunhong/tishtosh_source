package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17421k;
import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: com.google.b.c.bp */
final class C17662bp {
    /* renamed from: a */
    public static <E> Comparator<? super E> m43414a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        if (comparator == null) {
            return C17638bb.m43359b();
        }
        return comparator;
    }

    /* renamed from: a */
    public static boolean m43415a(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        C17421k.m42653a(comparator);
        C17421k.m42653a(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = m43414a((SortedSet) iterable);
        } else if (!(iterable instanceof C17661bo)) {
            return false;
        } else {
            comparator2 = ((C17661bo) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
