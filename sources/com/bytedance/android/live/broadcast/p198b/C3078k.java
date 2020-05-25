package com.bytedance.android.live.broadcast.p198b;

import com.bytedance.android.live.network.response.C4176c;
import com.bytedance.common.utility.C9414h;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.b.k */
final /* synthetic */ class C3078k implements C1710e {

    /* renamed from: a */
    private final C3076j f9015a;

    C3078k(C3076j jVar) {
        this.f9015a = jVar;
    }

    public final void accept(Object obj) {
        C3076j jVar = this.f9015a;
        C4176c cVar = (C4176c) obj;
        if (cVar != null && !C9414h.m18630a(cVar.f11365b)) {
            jVar.f9012f = cVar.f11365b;
            if (jVar.isAdded()) {
                jVar.mo8361a();
            }
        }
    }
}
