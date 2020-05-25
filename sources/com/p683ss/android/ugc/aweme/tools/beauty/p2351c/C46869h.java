package com.p683ss.android.ugc.aweme.tools.beauty.p2351c;

import java.util.ArrayList;
import java.util.Collection;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.c.h */
public final class C46869h<T> extends ArrayList<T> {
    public final int getSize() {
        return super.size();
    }

    public final int size() {
        return getSize();
    }

    public final boolean add(T t) {
        remove(t);
        return super.add(t);
    }

    public final T remove(int i) {
        return removeAt(i);
    }

    public final Object removeAt(int i) {
        return super.remove(i);
    }

    public final boolean addAll(Collection<? extends T> collection) {
        C52711k.m112240b(collection, "elements");
        removeAll(collection);
        return super.addAll(collection);
    }
}
