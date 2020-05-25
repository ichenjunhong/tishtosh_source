package com.bytedance.android.livesdk.chatroom.widget;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.ab */
final /* synthetic */ class C6644ab implements Runnable {

    /* renamed from: a */
    private final LiveRoomUserInfoWidget f18150a;

    C6644ab(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f18150a = liveRoomUserInfoWidget;
    }

    public final void run() {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = this.f18150a;
        if (liveRoomUserInfoWidget.f18088l != null && !liveRoomUserInfoWidget.f18088l.isFinishing() && liveRoomUserInfoWidget.f18095s.mo14577e() && liveRoomUserInfoWidget.isViewValid()) {
            liveRoomUserInfoWidget.f18095s.dismiss();
        }
    }
}
