package com.bytedance.android.livesdk.chatroom.viewmodule;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.dl */
final /* synthetic */ class C6531dl implements Runnable {

    /* renamed from: a */
    private final C63141 f17855a;

    C6531dl(C63141 r1) {
        this.f17855a = r1;
    }

    public final void run() {
        C63141 r0 = this.f17855a;
        if (LiveRoomNotifyWidget.this.isViewValid()) {
            LiveRoomNotifyWidget.this.f17273g.start();
        }
    }
}
