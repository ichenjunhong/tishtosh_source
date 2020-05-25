package com.bytedance.android.livesdk.chatroom.widget;

import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.ae */
final /* synthetic */ class C6647ae implements Runnable {

    /* renamed from: a */
    private final LiveRoomUserInfoWidget f18153a;

    C6647ae(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f18153a = liveRoomUserInfoWidget;
    }

    public final void run() {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = this.f18153a;
        if (liveRoomUserInfoWidget.isViewValid()) {
            liveRoomUserInfoWidget.mo12740a(C3922z.m9903a((int) R.string.egm));
            C4525b.f12369al.mo10346a(Boolean.valueOf(true));
        }
    }
}
