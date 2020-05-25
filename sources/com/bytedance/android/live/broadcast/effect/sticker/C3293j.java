package com.bytedance.android.live.broadcast.effect.sticker;

import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.gift.effect.p359b.C7329b;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.C7512k;
import com.bytedance.android.livesdk.message.model.C7810ao;
import com.bytedance.common.utility.C9431p;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.j */
final /* synthetic */ class C3293j implements C2205y {

    /* renamed from: a */
    private final C7810ao f9488a;

    C3293j(C7810ao aoVar) {
        this.f9488a = aoVar;
    }

    public final void subscribe(C2204x xVar) {
        C7810ao aoVar = this.f9488a;
        C7329b bVar = null;
        if (!(aoVar == null || aoVar.getMessageId() == 0 || aoVar.f21492a == null)) {
            C7505d findGiftById = ((IGiftService) C4116c.m10249a(IGiftService.class)).findGiftById(aoVar.f21494c);
            if (findGiftById != null) {
                String assetsPath = ((IGiftService) C4116c.m10249a(IGiftService.class)).getAssetsPath("effects", findGiftById.f20558s);
                if (!C9431p.m18664a(assetsPath)) {
                    C7329b bVar2 = new C7329b();
                    if (findGiftById.f20549j <= 0) {
                        findGiftById.f20549j = 3000;
                    }
                    C7329b d = bVar2.mo13591d((long) findGiftById.f20549j).mo13592d(true);
                    d.f19972q = (C7512k) C2942b.m8369a().mo34884a(findGiftById.f20561v, C7512k.class);
                    bVar = (C7329b) d.mo13578a(aoVar.getMessageId()).mo13589c(findGiftById.f20543d).mo13585b(findGiftById.f20558s).mo13577a(findGiftById.f20545f).mo13582a(assetsPath).mo13583a(aoVar.f21504m).mo13580a(aoVar.f21493b).mo13586b(aoVar.f21492a).mo13587b(findGiftById.f20542c);
                }
            }
        }
        xVar.mo6282a(bVar);
        xVar.mo6273a();
    }
}
