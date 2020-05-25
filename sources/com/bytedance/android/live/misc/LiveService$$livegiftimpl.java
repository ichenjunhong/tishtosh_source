package com.bytedance.android.live.misc;

import com.bytedance.android.live.gift.GiftService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdkapi.depend.live.C8648g;

public class LiveService$$livegiftimpl {
    public static void registerService() {
        C4116c.m10251a(IGiftService.class, new GiftService());
        C4116c.m10251a(C8648g.class, new GiftService());
    }
}
