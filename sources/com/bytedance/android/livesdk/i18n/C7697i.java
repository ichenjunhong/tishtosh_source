package com.bytedance.android.livesdk.i18n;

import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.i18n.i */
final /* synthetic */ class C7697i implements C1710e {

    /* renamed from: a */
    private final C7679c f21192a;

    C7697i(C7679c cVar) {
        this.f21192a = cVar;
    }

    public final void accept(Object obj) {
        C7679c cVar = this.f21192a;
        Throwable th = (Throwable) obj;
        cVar.f21162f = false;
        if (cVar.f21160d != null) {
            new Exception(th);
        }
        cVar.mo14040a();
    }
}
