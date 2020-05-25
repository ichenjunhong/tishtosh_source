package com.p683ss.android.ugc.aweme.tools.mvtemplate;

import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2245c.C45098a;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48702g;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.f */
final /* synthetic */ class C47266f implements C45098a {

    /* renamed from: a */
    private final C47233b f119348a;

    C47266f(C47233b bVar) {
        this.f119348a = bVar;
    }

    /* renamed from: a */
    public final void mo91293a() {
        C47233b bVar = this.f119348a;
        bVar.f119279b.mo59143b("mv", false, (C48702g) new C48702g() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo8638a(Object obj) {
                EffectChannelResponse effectChannelResponse = (EffectChannelResponse) obj;
                C47233b.m102516a(true, 0, (Exception) null);
            }

            /* renamed from: a */
            public final void mo8637a(C48649d dVar) {
                if (dVar == null) {
                    C47233b.m102516a(false, 1, (Exception) null);
                } else {
                    C47233b.m102516a(false, dVar.f122279a, dVar.f122281c);
                }
            }
        });
    }
}
