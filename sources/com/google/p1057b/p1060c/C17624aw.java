package com.google.p1057b.p1060c;

import java.util.Collection;
import java.util.Set;

/* renamed from: com.google.b.c.aw */
public interface C17624aw<E> extends Collection<E> {

    /* renamed from: com.google.b.c.aw$a */
    public interface C17625a<E> {
        /* renamed from: a */
        E mo34201a();

        /* renamed from: b */
        int mo34202b();
    }

    /* renamed from: a */
    int mo34074a(Object obj);

    int add(E e, int i);

    boolean contains(Object obj);

    boolean containsAll(Collection<?> collection);

    Set<E> elementSet();

    Set<C17625a<E>> entrySet();

    int remove(Object obj, int i);

    int setCount(E e, int i);

    boolean setCount(E e, int i, int i2);

    int size();
}
