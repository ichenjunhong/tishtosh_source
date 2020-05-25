package com.bytedance.android.live.core.paging.p238c;

import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.core.paging.c.d */
final /* synthetic */ class C3954d implements C1710e {

    /* renamed from: a */
    private final C3953c f11015a;

    C3954d(C3953c cVar) {
        this.f11015a = cVar;
    }

    public final void accept(Object obj) {
        C3953c cVar = this.f11015a;
        if (cVar.f11011k != null) {
            cVar.f11011k.run();
            cVar.f11011k = null;
        }
    }
}
