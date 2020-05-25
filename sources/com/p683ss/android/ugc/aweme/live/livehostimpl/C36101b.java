package com.p683ss.android.ugc.aweme.live.livehostimpl;

import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback;
import p001a.C0027j;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.b */
final /* synthetic */ class C36101b implements IAVEffectReadyCallback {

    /* renamed from: a */
    private final C0027j f92486a;

    C36101b(C0027j jVar) {
        this.f92486a = jVar;
    }

    public final void finish(Object obj) {
        C0027j jVar = this.f92486a;
        C29252f fVar = (C29252f) obj;
        if (fVar != null) {
            jVar.mo44a(fVar.mo59148e());
        } else {
            jVar.mo46b((Exception) new RuntimeException("Decompress failed"));
        }
    }
}
