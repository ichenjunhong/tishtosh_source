package com.google.android.gms.tagmanager;

import java.util.List;

/* renamed from: com.google.android.gms.tagmanager.h */
final class C17212h implements C17213i {

    /* renamed from: a */
    private final /* synthetic */ C17203c f48665a;

    C17212h(C17203c cVar) {
        this.f48665a = cVar;
    }

    /* renamed from: a */
    public final void mo33470a(List<C17204a> list) {
        for (C17204a aVar : list) {
            this.f48665a.mo33462b(C17203c.m42149a(aVar.f48642a, aVar.f48643b));
        }
        this.f48665a.f48636b.countDown();
    }
}
