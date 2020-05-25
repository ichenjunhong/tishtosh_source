package com.p683ss.android.ugc.aweme.music.p1974b;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.b.e */
public final class C37333e {

    /* renamed from: a */
    private final CopyOnWriteArrayList<C37326b> f95269a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public final void mo76635a() {
        Iterator it = this.f95269a.iterator();
        while (it.hasNext()) {
            ((C37326b) it.next()).mo76634a();
        }
        this.f95269a.clear();
    }

    /* renamed from: a */
    public final void mo76636a(C37326b bVar) {
        C52711k.m112240b(bVar, "task");
        this.f95269a.add(bVar);
    }
}
