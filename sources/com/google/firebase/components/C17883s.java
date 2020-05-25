package com.google.firebase.components;

import com.C2240a;
import com.google.firebase.p1072a.C17847c;
import com.google.firebase.p1073b.C17860a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.s */
final class C17883s extends C17873i {

    /* renamed from: a */
    private final Set<Class<?>> f49682a;

    /* renamed from: b */
    private final Set<Class<?>> f49683b;

    /* renamed from: c */
    private final Set<Class<?>> f49684c;

    /* renamed from: d */
    private final C17866b f49685d;

    /* renamed from: com.google.firebase.components.s$a */
    static class C17884a implements C17847c {

        /* renamed from: a */
        private final Set<Class<?>> f49686a;

        /* renamed from: b */
        private final C17847c f49687b;

        public C17884a(Set<Class<?>> set, C17847c cVar) {
            this.f49686a = set;
            this.f49687b = cVar;
        }
    }

    /* renamed from: a */
    public final <T> T mo34699a(Class<T> cls) {
        if (this.f49682a.contains(cls)) {
            T a = this.f49685d.mo34699a(cls);
            if (!cls.equals(C17847c.class)) {
                return a;
            }
            return new C17884a(this.f49684c, (C17847c) a);
        }
        throw new IllegalArgumentException(C2240a.m6772a("Requesting %s is not allowed.", new Object[]{cls}));
    }

    /* renamed from: b */
    public final <T> C17860a<T> mo34700b(Class<T> cls) {
        if (this.f49683b.contains(cls)) {
            return this.f49685d.mo34700b(cls);
        }
        throw new IllegalArgumentException(C2240a.m6772a("Requesting Provider<%s> is not allowed.", new Object[]{cls}));
    }

    C17883s(C17863a<?> aVar, C17866b bVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C17869e eVar : aVar.f49650b) {
            if (eVar.mo34701a()) {
                hashSet.add(eVar.f49661a);
            } else {
                hashSet2.add(eVar.f49661a);
            }
        }
        if (!aVar.f49652d.isEmpty()) {
            hashSet.add(C17847c.class);
        }
        this.f49682a = Collections.unmodifiableSet(hashSet);
        this.f49683b = Collections.unmodifiableSet(hashSet2);
        this.f49684c = aVar.f49652d;
        this.f49685d = bVar;
    }
}
