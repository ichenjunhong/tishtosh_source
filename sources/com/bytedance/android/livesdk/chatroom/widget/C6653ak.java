package com.bytedance.android.livesdk.chatroom.widget;

import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.chatroom.p306bl.C5006c;
import com.bytedance.android.livesdk.message.model.C7866cg;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.ak */
final /* synthetic */ class C6653ak implements C1710e {

    /* renamed from: a */
    private final LiveRoomUserInfoWidget f18159a;

    C6653ak(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f18159a = liveRoomUserInfoWidget;
    }

    public final void accept(Object obj) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = this.f18159a;
        Long l = (Long) obj;
        C7866cg a = C5006c.m11495a(liveRoomUserInfoWidget.f18080d.getId(), null, "", 5, C3922z.m9903a((int) R.string.egl), "#FF8533", "9", "");
        a.f21778l = R.drawable.bvf;
        IMessageManager iMessageManager = (IMessageManager) liveRoomUserInfoWidget.dataCenter.get("data_message_manager");
        if (iMessageManager != null) {
            iMessageManager.insertMessage(a, true);
        }
        C4525b.f12368ak.mo10346a(Boolean.valueOf(true));
    }
}
