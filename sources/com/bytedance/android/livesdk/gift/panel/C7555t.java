package com.bytedance.android.livesdk.gift.panel;

import com.bytedance.android.livesdk.gift.C7647s;
import com.bytedance.android.livesdk.gift.panel.C7547n.C7549a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.panel.t */
final /* synthetic */ class C7555t implements C1710e {

    /* renamed from: a */
    private final C7547n f20727a;

    C7555t(C7547n nVar) {
        this.f20727a = nVar;
    }

    public final void accept(Object obj) {
        C7547n nVar = this.f20727a;
        Throwable th = (Throwable) obj;
        nVar.f20707b = false;
        if (th instanceof Exception) {
            ((C7549a) nVar.mo8518c()).mo13933b((Exception) th);
            C7647s.m15649a(998, nVar.f20706a.getId(), th);
        }
    }
}
