package com.google.firebase.components;

import com.google.firebase.p1073b.C17860a;

/* renamed from: com.google.firebase.components.q */
final class C17881q<T> implements C17860a<T> {

    /* renamed from: a */
    private static final Object f49677a = new Object();

    /* renamed from: b */
    private volatile Object f49678b = f49677a;

    /* renamed from: c */
    private volatile C17860a<T> f49679c;

    /* renamed from: a */
    public final T mo34690a() {
        T t = this.f49678b;
        if (t == f49677a) {
            synchronized (this) {
                t = this.f49678b;
                if (t == f49677a) {
                    t = this.f49679c.mo34690a();
                    this.f49678b = t;
                    this.f49679c = null;
                }
            }
        }
        return t;
    }

    C17881q(C17867c<T> cVar, C17866b bVar) {
        this.f49679c = new C17882r(cVar, bVar);
    }
}
