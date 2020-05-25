package com.bytedance.android.livesdk.chatroom.p325ui;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.p245d.C4116c;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import p064c.p065a.p071d.C1711f;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.as */
final /* synthetic */ class C5944as implements C1711f {

    /* renamed from: a */
    static final C1711f f15657a = new C5944as();

    private C5944as() {
    }

    public final Object apply(Object obj) {
        return ((IBroadcastService) C4116c.m10249a(IBroadcastService.class)).convertStickerBean((Effect) obj);
    }
}
