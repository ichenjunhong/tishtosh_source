package com.p683ss.android.ugc.gamora.jedi;

import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.jedi.b */
public class C49555b<T> {

    /* renamed from: a */
    public boolean f124308a;

    /* renamed from: b */
    public final T f124309b;

    public C49555b(T t) {
        this.f124309b = t;
    }

    /* renamed from: a */
    public final void mo97467a(C52671b<? super T, C52860x> bVar) {
        C52711k.m112240b(bVar, "block");
        if (!this.f124308a) {
            this.f124308a = true;
            bVar.invoke(this.f124309b);
        }
    }
}
