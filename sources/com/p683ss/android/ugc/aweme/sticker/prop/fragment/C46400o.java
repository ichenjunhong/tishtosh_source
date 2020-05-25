package com.p683ss.android.ugc.aweme.sticker.prop.fragment;

import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback;
import p001a.C0011g;
import p001a.C0027j;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.fragment.o */
final /* synthetic */ class C46400o implements IAVEffectReadyCallback {

    /* renamed from: a */
    private final C463721 f117062a;

    /* renamed from: b */
    private final C0027j f117063b;

    /* renamed from: c */
    private final C0011g f117064c;

    C46400o(C463721 r1, C0027j jVar, C0011g gVar) {
        this.f117062a = r1;
        this.f117063b = jVar;
        this.f117064c = gVar;
    }

    public final void finish(Object obj) {
        C463721 r0 = this.f117062a;
        C0027j jVar = this.f117063b;
        C0011g gVar = this.f117064c;
        C29252f fVar = (C29252f) obj;
        StickerPropDetailFragment.this.f117013k = fVar;
        jVar.mo44a(fVar);
        jVar.f77a.mo19a(gVar);
    }
}
