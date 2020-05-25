package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

final class azy<E> extends awh<E> {

    /* renamed from: a */
    private static final azy<Object> f41693a;

    /* renamed from: b */
    private final List<E> f41694b;

    /* renamed from: d */
    public static <E> azy<E> m34945d() {
        return f41693a;
    }

    azy() {
        this(new ArrayList(10));
    }

    private azy(List<E> list) {
        this.f41694b = list;
    }

    public final void add(int i, E e) {
        mo29594c();
        this.f41694b.add(i, e);
        this.modCount++;
    }

    public final E get(int i) {
        return this.f41694b.get(i);
    }

    public final E remove(int i) {
        mo29594c();
        E remove = this.f41694b.remove(i);
        this.modCount++;
        return remove;
    }

    public final E set(int i, E e) {
        mo29594c();
        E e2 = this.f41694b.set(i, e);
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f41694b.size();
    }

    /* renamed from: a */
    public final /* synthetic */ ayh mo29603a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f41694b);
            return new azy(arrayList);
        }
        throw new IllegalArgumentException();
    }

    static {
        azy<Object> azy = new azy<>();
        f41693a = azy;
        azy.mo29593b();
    }
}
