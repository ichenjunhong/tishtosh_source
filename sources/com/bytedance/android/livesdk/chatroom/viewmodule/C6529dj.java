package com.bytedance.android.livesdk.chatroom.viewmodule;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.dj */
final /* synthetic */ class C6529dj implements Runnable {

    /* renamed from: a */
    private final C63131 f17852a;

    C6529dj(C63131 r1) {
        this.f17852a = r1;
    }

    public final void run() {
        C63131 r0 = this.f17852a;
        if (LiveRoomNotifyWidget.this.isViewValid()) {
            LiveRoomNotifyWidget.this.f17273g.start();
        }
    }
}
