package com.bytedance.android.livesdk.gift.assets;

import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.assets.e */
final /* synthetic */ class C7208e implements C1710e {

    /* renamed from: a */
    private final C7203c f19588a;

    C7208e(C7203c cVar) {
        this.f19588a = cVar;
    }

    public final void accept(Object obj) {
        C7203c cVar = this.f19588a;
        Throwable th = (Throwable) obj;
        C7203c.class.getSimpleName();
        th.getMessage();
        if (cVar.f19575d != null && !cVar.f19575d.isDisposed()) {
            cVar.f19575d.dispose();
            cVar.f19575d = null;
        }
    }
}
