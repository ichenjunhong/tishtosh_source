package com.p683ss.android.ugc.aweme.discover;

import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.sticker.prop.p2315b.C46363b;

/* renamed from: com.ss.android.ugc.aweme.discover.a */
public final class C27711a implements C27938d {
    /* renamed from: b */
    public final C26875a<Aweme, ?> mo56136b() {
        return new C46363b<>();
    }

    /* renamed from: a */
    public final boolean mo56135a() {
        return I18nBridgeService.getBridgeService_Monster().havePGCShow();
    }
}
