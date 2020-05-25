package com.bytedance.common.utility.p522b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: com.bytedance.common.utility.b.e */
public final class C9379e<E> implements Iterable<E> {

    /* renamed from: a */
    public final WeakHashMap<E, Object> f25609a = new WeakHashMap<>();

    /* renamed from: b */
    private final Object f25610b = new Object();

    /* renamed from: a */
    public final void mo17004a() {
        this.f25609a.clear();
    }

    /* renamed from: b */
    public final boolean mo17007b() {
        return this.f25609a.isEmpty();
    }

    /* renamed from: c */
    public final int mo17008c() {
        return this.f25609a.size();
    }

    public final Iterator<E> iterator() {
        ArrayList arrayList = new ArrayList(this.f25609a.size());
        for (Object next : this.f25609a.keySet()) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList.iterator();
    }

    /* renamed from: a */
    public final void mo17005a(E e) {
        if (e == null) {
            this.f25609a.size();
        } else {
            this.f25609a.put(e, this.f25610b);
        }
    }

    /* renamed from: b */
    public final void mo17006b(E e) {
        if (e == null) {
            this.f25609a.size();
        } else {
            this.f25609a.remove(e);
        }
    }
}
