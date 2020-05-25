package com.p683ss.android.ugc.aweme.commercialize.loft.p1575b;

import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.loft.b.g */
public class C26014g<T, A> {

    /* renamed from: a */
    private C52671b<? super A, ? extends T> f68684a;

    /* renamed from: b */
    private volatile T f68685b;

    public C26014g(C52671b<? super A, ? extends T> bVar) {
        C52711k.m112240b(bVar, "creator");
        this.f68684a = bVar;
    }

    /* renamed from: a */
    public final T mo53461a(A a) {
        T t;
        T t2 = this.f68685b;
        if (t2 != null) {
            return t2;
        }
        synchronized (this) {
            t = this.f68685b;
            if (t == null) {
                C52671b<? super A, ? extends T> bVar = this.f68684a;
                if (bVar == null) {
                    C52711k.m112234a();
                }
                t = bVar.invoke(a);
                this.f68685b = t;
                this.f68684a = null;
            }
        }
        return t;
    }
}
