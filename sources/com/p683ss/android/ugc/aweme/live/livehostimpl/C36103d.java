package com.p683ss.android.ugc.aweme.live.livehostimpl;

import com.bef.effectsdk.C2592c;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback;
import p001a.C0027j;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.d */
final /* synthetic */ class C36103d implements IAVEffectReadyCallback {

    /* renamed from: a */
    private final C0027j f92488a;

    C36103d(C0027j jVar) {
        this.f92488a = jVar;
    }

    public final void finish(Object obj) {
        C0027j jVar = this.f92488a;
        C2592c cVar = (C2592c) obj;
        if (cVar != null) {
            jVar.mo44a(cVar);
        } else {
            jVar.mo46b((Exception) new RuntimeException("Decompress failed"));
        }
    }
}
