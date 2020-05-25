package com.p683ss.android.ugc.aweme.effect;

import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.effect.bj */
final /* synthetic */ class C29150bj implements Runnable {

    /* renamed from: a */
    private final C291006 f76398a;

    /* renamed from: b */
    private final EffectChannelResponse f76399b;

    C29150bj(C291006 r1, EffectChannelResponse effectChannelResponse) {
        this.f76398a = r1;
        this.f76399b = effectChannelResponse;
    }

    public final void run() {
        C291006 r0 = this.f76398a;
        EffectChannelResponse effectChannelResponse = this.f76399b;
        if (C29094ad.this.f76267C.f76523a != null && (C29094ad.this.f76267C.f76523a instanceof C29227x)) {
            List c = ((C29227x) C29094ad.this.f76267C.f76523a).mo59057c();
            C29094ad.this.f76302i.mo58913a(c, C29094ad.this.f76314u.mo58931c());
            if (C29207l.m68793b(((EffectCategoryResponse) effectChannelResponse.getCategoryResponseList().get(0)).getKey())) {
                C29094ad.this.mo58949a(c, true);
            }
        }
    }
}
