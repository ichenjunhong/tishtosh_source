package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.p306bl.C5007d;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.al */
public final /* synthetic */ class C6450al implements Runnable {

    /* renamed from: a */
    private final FollowGuideWidget f17754a;

    public C6450al(FollowGuideWidget followGuideWidget) {
        this.f17754a = followGuideWidget;
    }

    public final void run() {
        FollowGuideWidget followGuideWidget = this.f17754a;
        if (followGuideWidget.f16975b == null || !followGuideWidget.isViewValid()) {
            C5007d.INSTANCE.onMessageFinish();
        } else {
            followGuideWidget.f16975b.dismiss();
        }
    }
}
