package com.p683ss.android.ugc.aweme.utils.p2389c;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.c.d */
public final class C47754d<T> {

    /* renamed from: a */
    private final Set<T> f120273a = new LinkedHashSet();

    /* renamed from: a */
    public final synchronized Set<T> mo95026a() {
        return new LinkedHashSet<>(this.f120273a);
    }

    /* renamed from: a */
    public final synchronized void mo95027a(Collection<? extends T> collection) {
        C52711k.m112240b(collection, "collection");
        this.f120273a.addAll(collection);
    }

    /* renamed from: b */
    public final synchronized void mo95028b(Collection<? extends T> collection) {
        C52711k.m112240b(collection, "collection");
        this.f120273a.clear();
        this.f120273a.addAll(collection);
    }
}
