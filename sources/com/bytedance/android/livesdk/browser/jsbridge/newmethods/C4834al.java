package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.al */
final /* synthetic */ class C4834al implements C1710e {

    /* renamed from: a */
    private final C4833ak f13049a;

    C4834al(C4833ak akVar) {
        this.f13049a = akVar;
    }

    public final void accept(Object obj) {
        C4833ak akVar = this.f13049a;
        Long l = (Long) obj;
        if (akVar.f13047a != null) {
            akVar.f13047a.dismiss();
        }
    }
}
