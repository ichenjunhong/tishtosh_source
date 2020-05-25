package com.bytedance.android.livesdk.chatroom.widget;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.ag */
final /* synthetic */ class C6649ag implements OnClickListener {

    /* renamed from: a */
    private final LiveRoomUserInfoWidget f18155a;

    C6649ag(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f18155a = liveRoomUserInfoWidget;
    }

    public final void onClick(View view) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = this.f18155a;
        liveRoomUserInfoWidget.f18096t = true;
        liveRoomUserInfoWidget.mo12737a();
    }
}
