package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.iy */
final class C16789iy<E> extends C16687fo<E> {

    /* renamed from: a */
    static final C16789iy<Object> f47174a;

    /* renamed from: b */
    private final List<E> f47175b;

    C16789iy() {
        this(new ArrayList(10));
    }

    private C16789iy(List<E> list) {
        this.f47175b = list;
    }

    public final void add(int i, E e) {
        mo31999c();
        this.f47175b.add(i, e);
        this.modCount++;
    }

    public final E get(int i) {
        return this.f47175b.get(i);
    }

    public final E remove(int i) {
        mo31999c();
        E remove = this.f47175b.remove(i);
        this.modCount++;
        return remove;
    }

    public final E set(int i, E e) {
        mo31999c();
        E e2 = this.f47175b.set(i, e);
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f47175b.size();
    }

    /* renamed from: a */
    public final /* synthetic */ C16747hj mo32008a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f47175b);
            return new C16789iy(arrayList);
        }
        throw new IllegalArgumentException();
    }

    static {
        C16789iy<Object> iyVar = new C16789iy<>();
        f47174a = iyVar;
        iyVar.mo31998b();
    }
}
