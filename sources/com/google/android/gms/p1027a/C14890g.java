package com.google.android.gms.p1027a;

import java.util.Iterator;

/* renamed from: com.google.android.gms.a.g */
final class C14890g implements C14887e<T> {

    /* renamed from: a */
    private final /* synthetic */ C14880a f38419a;

    C14890g(C14880a aVar) {
        this.f38419a = aVar;
    }

    /* renamed from: a */
    public final void mo27252a(T t) {
        this.f38419a.f38412a = t;
        Iterator it = this.f38419a.f38414c.iterator();
        while (it.hasNext()) {
            ((C14881a) it.next()).mo27243a(this.f38419a.f38412a);
        }
        this.f38419a.f38414c.clear();
        this.f38419a.f38413b = null;
    }
}
