package com.bytedance.android.livesdk.chatroom.widget;

import com.bytedance.android.live.base.model.user.C3009i;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.w */
final /* synthetic */ class C6697w implements C1710e {

    /* renamed from: a */
    private final LiveRoomUserInfoWidget f18268a;

    C6697w(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f18268a = liveRoomUserInfoWidget;
    }

    public final void accept(Object obj) {
        this.f18268a.dataCenter.lambda$put$1$DataCenter("data_anchor_ticket_count", Long.valueOf(((C3009i) obj).getFanTicketCount()));
    }
}
