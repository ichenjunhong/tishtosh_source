package com.bytedance.android.livesdk.chatroom.widget;

import com.bytedance.android.live.broadcast.api.model.C3056b;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.s */
final /* synthetic */ class C6693s implements C1710e {

    /* renamed from: a */
    private final LiveRoomUserInfoWidget f18264a;

    C6693s(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f18264a = liveRoomUserInfoWidget;
    }

    public final void accept(Object obj) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = this.f18264a;
        C3056b bVar = (C3056b) obj;
        if (liveRoomUserInfoWidget.f18089m != null) {
            if (bVar.f8933a) {
                liveRoomUserInfoWidget.f18089m.setVisibility(0);
                C8049c.m15979a().mo14203a("no_beauty_icon_show", Room.class);
                return;
            }
            liveRoomUserInfoWidget.f18089m.setVisibility(8);
        }
    }
}
