package com.bytedance.android.livesdk.gift;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdkapi.host.C8794c;

/* renamed from: com.bytedance.android.livesdk.gift.a */
public final class C7191a {
    /* renamed from: a */
    public static String m14934a(long j) {
        C7505d findGiftById = GiftManager.inst().findGiftById(j);
        if (findGiftById == null) {
            return "";
        }
        ImageModel imageModel = findGiftById.f20541b;
        if (imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() <= 0) {
            return "";
        }
        return ((C8794c) C4116c.m10249a(C8794c.class)).mo15495b((String) imageModel.getUrls().get(0));
    }
}
