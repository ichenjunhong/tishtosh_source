package com.bytedance.android.livesdk.chatroom.widget;

import android.support.p043v7.widget.LinearLayoutManager;
import com.bytedance.android.live.uikit.p257c.C4206c;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.ao */
final /* synthetic */ class C6657ao implements Runnable {

    /* renamed from: a */
    private final LiveRoomWatchUserWidget f18163a;

    /* renamed from: b */
    private final List f18164b;

    C6657ao(LiveRoomWatchUserWidget liveRoomWatchUserWidget, List list) {
        this.f18163a = liveRoomWatchUserWidget;
        this.f18164b = list;
    }

    public final void run() {
        LiveRoomWatchUserWidget liveRoomWatchUserWidget = this.f18163a;
        List list = this.f18164b;
        if (liveRoomWatchUserWidget.isViewValid() && (liveRoomWatchUserWidget.f18107c.getLayoutManager() instanceof LinearLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) liveRoomWatchUserWidget.f18107c.getLayoutManager();
            if (!C4206c.m10426a(liveRoomWatchUserWidget.context) || LiveRoomWatchUserWidget.f18104a * list.size() <= liveRoomWatchUserWidget.f18107c.getWidth()) {
                if (((LinearLayoutManager) liveRoomWatchUserWidget.f18107c.getLayoutManager()).f4556m) {
                    linearLayoutManager.mo4683a(false);
                    liveRoomWatchUserWidget.f18107c.requestLayout();
                }
            } else if (!linearLayoutManager.f4556m) {
                linearLayoutManager.mo4683a(true);
                liveRoomWatchUserWidget.f18107c.requestLayout();
                liveRoomWatchUserWidget.f18107c.mo4814b(0);
            }
        }
    }
}
