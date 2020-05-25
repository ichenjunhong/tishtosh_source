package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class bdd<E> extends AbstractList<E> {

    /* renamed from: c */
    private static final bdf f41919c = bdf.m35439a(bdd.class);

    /* renamed from: a */
    List<E> f41920a;

    /* renamed from: b */
    Iterator<E> f41921b;

    public bdd(List<E> list, Iterator<E> it) {
        this.f41920a = list;
        this.f41921b = it;
    }

    public E get(int i) {
        if (this.f41920a.size() > i) {
            return this.f41920a.get(i);
        }
        if (this.f41921b.hasNext()) {
            this.f41920a.add(this.f41921b.next());
            return get(i);
        }
        throw new NoSuchElementException();
    }

    public Iterator<E> iterator() {
        return new bde(this);
    }

    public int size() {
        f41919c.mo30051a("potentially expensive size() call");
        f41919c.mo30051a("blowup running");
        while (this.f41921b.hasNext()) {
            this.f41920a.add(this.f41921b.next());
        }
        return this.f41920a.size();
    }
}
