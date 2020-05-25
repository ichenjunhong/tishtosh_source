package com.bytedance.android.livesdk.i18n;

import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.i18n.f */
final /* synthetic */ class C7694f implements C1710e {

    /* renamed from: a */
    private final C7679c f21187a;

    C7694f(C7679c cVar) {
        this.f21187a = cVar;
    }

    public final void accept(Object obj) {
        C7679c cVar = this.f21187a;
        Throwable th = (Throwable) obj;
        cVar.f21161e = false;
        if (cVar.f21160d != null) {
            cVar.f21160d.mo14039a(cVar.f21159a, new Exception(th));
        }
    }
}
