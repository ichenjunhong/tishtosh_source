package com.bytedance.android.livesdk.chatroom.widget;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.aa */
final /* synthetic */ class C6643aa implements Runnable {

    /* renamed from: a */
    private final LiveRoomUserInfoWidget f18148a;

    /* renamed from: b */
    private final int f18149b;

    C6643aa(LiveRoomUserInfoWidget liveRoomUserInfoWidget, int i) {
        this.f18148a = liveRoomUserInfoWidget;
        this.f18149b = i;
    }

    public final void run() {
        this.f18148a.mo12742c(this.f18149b);
    }
}
